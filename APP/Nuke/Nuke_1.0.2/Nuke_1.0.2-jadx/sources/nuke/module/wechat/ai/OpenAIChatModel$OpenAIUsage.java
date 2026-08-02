package nuke.module.wechat.ai;

import defpackage.c50;
import defpackage.fp2;
import defpackage.t11;
import defpackage.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIUsage {

    @fp2("completion_tokens")
    private final Integer completionTokens;

    @fp2("prompt_tokens")
    private final Integer promptTokens;

    @fp2("total_tokens")
    private final Integer totalTokens;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED] (LINE:12)) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:17) call: nuke.module.wechat.ai.OpenAIChatModel$OpenAIUsage.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ OpenAIChatModel$OpenAIUsage(Integer num, Integer num2, Integer num3, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ OpenAIChatModel$OpenAIUsage copy$default(OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = openAIChatModel$OpenAIUsage.promptTokens;
        }
        if ((i & 2) != 0) {
            num2 = openAIChatModel$OpenAIUsage.completionTokens;
        }
        if ((i & 4) != 0) {
            num3 = openAIChatModel$OpenAIUsage.totalTokens;
        }
        return openAIChatModel$OpenAIUsage.copy(num, num2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer component1() {
        return this.promptTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer component2() {
        return this.completionTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer component3() {
        return this.totalTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIUsage copy(Integer num, Integer num2, Integer num3) {
        return new OpenAIChatModel$OpenAIUsage(num, num2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIUsage)) {
            return false;
        }
        OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage = (OpenAIChatModel$OpenAIUsage) obj;
        return t11.l(this.promptTokens, openAIChatModel$OpenAIUsage.promptTokens) && t11.l(this.completionTokens, openAIChatModel$OpenAIUsage.completionTokens) && t11.l(this.totalTokens, openAIChatModel$OpenAIUsage.totalTokens);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer getCompletionTokens() {
        return this.completionTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer getPromptTokens() {
        return this.promptTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer getTotalTokens() {
        return this.totalTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        Integer num = this.promptTokens;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.completionTokens;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalTokens;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "OpenAIUsage(promptTokens=" + this.promptTokens + ", completionTokens=" + this.completionTokens + ", totalTokens=" + this.totalTokens + ")";
    }

    public OpenAIChatModel$OpenAIUsage(Integer num, Integer num2, Integer num3) {
        this.promptTokens = num;
        this.completionTokens = num2;
        this.totalTokens = num3;
    }

    public OpenAIChatModel$OpenAIUsage() {
        this(null, null, null, 7, null);
    }
}
