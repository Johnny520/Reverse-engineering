package nuke.module.wechat.ai;

import defpackage.be0;
import defpackage.c50;
import defpackage.t11;
import defpackage.z41;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIResponse {
    private final List<OpenAIChatModel$OpenAIChoice> choices;
    private final String model;
    private final OpenAIChatModel$OpenAIUsage usage;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (wrap:java.util.List:0x000a: SGET  A[WRAPPED] (LINE:11) be0.h be0) : (r3v0 java.util.List))
  (wrap:nuke.module.wechat.ai.OpenAIChatModel$OpenAIUsage:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED] (LINE:13)) != (0 int)) ? (null nuke.module.wechat.ai.OpenAIChatModel$OpenAIUsage) : (r4v0 nuke.module.wechat.ai.OpenAIChatModel$OpenAIUsage))
 A[MD:(java.lang.String, java.util.List<nuke.module.wechat.ai.OpenAIChatModel$OpenAIChoice>, nuke.module.wechat.ai.OpenAIChatModel$OpenAIUsage):void (m)] (LINE:18) call: nuke.module.wechat.ai.OpenAIChatModel$OpenAIResponse.<init>(java.lang.String, java.util.List, nuke.module.wechat.ai.OpenAIChatModel$OpenAIUsage):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ OpenAIChatModel$OpenAIResponse(String str, List list, OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? be0.h : list, (i & 4) != 0 ? null : openAIChatModel$OpenAIUsage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: nuke.module.wechat.ai.OpenAIChatModel$OpenAIResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenAIChatModel$OpenAIResponse copy$default(OpenAIChatModel$OpenAIResponse openAIChatModel$OpenAIResponse, String str, List list, OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openAIChatModel$OpenAIResponse.model;
        }
        if ((i & 2) != 0) {
            list = openAIChatModel$OpenAIResponse.choices;
        }
        if ((i & 4) != 0) {
            openAIChatModel$OpenAIUsage = openAIChatModel$OpenAIResponse.usage;
        }
        return openAIChatModel$OpenAIResponse.copy(str, list, openAIChatModel$OpenAIUsage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<OpenAIChatModel$OpenAIChoice> component2() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIUsage component3() {
        return this.usage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIResponse copy(String str, List<OpenAIChatModel$OpenAIChoice> list, OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage) {
        list.getClass();
        return new OpenAIChatModel$OpenAIResponse(str, list, openAIChatModel$OpenAIUsage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIResponse)) {
            return false;
        }
        OpenAIChatModel$OpenAIResponse openAIChatModel$OpenAIResponse = (OpenAIChatModel$OpenAIResponse) obj;
        return t11.l(this.model, openAIChatModel$OpenAIResponse.model) && t11.l(this.choices, openAIChatModel$OpenAIResponse.choices) && t11.l(this.usage, openAIChatModel$OpenAIResponse.usage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<OpenAIChatModel$OpenAIChoice> getChoices() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIUsage getUsage() {
        return this.usage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        String str = this.model;
        int iHashCode = (this.choices.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage = this.usage;
        return iHashCode + (openAIChatModel$OpenAIUsage != null ? openAIChatModel$OpenAIUsage.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "OpenAIResponse(model=" + this.model + ", choices=" + this.choices + ", usage=" + this.usage + ")";
    }

    public OpenAIChatModel$OpenAIResponse(String str, List<OpenAIChatModel$OpenAIChoice> list, OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage) {
        list.getClass();
        this.model = str;
        this.choices = list;
        this.usage = openAIChatModel$OpenAIUsage;
    }

    public OpenAIChatModel$OpenAIResponse() {
        this(null, null, null, 7, null);
    }
}
