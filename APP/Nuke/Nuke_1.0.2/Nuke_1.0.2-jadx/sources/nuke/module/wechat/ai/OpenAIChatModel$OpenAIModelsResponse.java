package nuke.module.wechat.ai;

import defpackage.be0;
import defpackage.c50;
import defpackage.t11;
import defpackage.z41;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIModelsResponse {
    private final List<OpenAIChatModel$OpenAIModelInfo> data;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (wrap:java.util.List:0x0004: SGET  A[WRAPPED] (LINE:5) be0.h be0) : (r1v0 java.util.List))
 A[MD:(java.util.List<nuke.module.wechat.ai.OpenAIChatModel$OpenAIModelInfo>):void (m)] (LINE:7) call: nuke.module.wechat.ai.OpenAIChatModel$OpenAIModelsResponse.<init>(java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ OpenAIChatModel$OpenAIModelsResponse(List list, int i, c50 c50Var) {
        this((i & 1) != 0 ? be0.h : list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: nuke.module.wechat.ai.OpenAIChatModel$OpenAIModelsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenAIChatModel$OpenAIModelsResponse copy$default(OpenAIChatModel$OpenAIModelsResponse openAIChatModel$OpenAIModelsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = openAIChatModel$OpenAIModelsResponse.data;
        }
        return openAIChatModel$OpenAIModelsResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<OpenAIChatModel$OpenAIModelInfo> component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIModelsResponse copy(List<OpenAIChatModel$OpenAIModelInfo> list) {
        list.getClass();
        return new OpenAIChatModel$OpenAIModelsResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenAIChatModel$OpenAIModelsResponse) && t11.l(this.data, ((OpenAIChatModel$OpenAIModelsResponse) obj).data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<OpenAIChatModel$OpenAIModelInfo> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "OpenAIModelsResponse(data=" + this.data + ")";
    }

    public OpenAIChatModel$OpenAIModelsResponse(List<OpenAIChatModel$OpenAIModelInfo> list) {
        list.getClass();
        this.data = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public OpenAIChatModel$OpenAIModelsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
