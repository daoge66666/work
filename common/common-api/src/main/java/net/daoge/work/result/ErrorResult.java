package net.daoge.work.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

@Data
@Builder
public class ErrorResult{

    @ApiModelProperty("异常状态码")
    private int ret;
    @ApiModelProperty("异常code")
    private String code;
    @ApiModelProperty("异常描述")
    private String message;

    @ApiModelProperty("异常线程详情")
    private transient Throwable throwable;




    @Tolerate
    public ErrorResult() {
    }
}
