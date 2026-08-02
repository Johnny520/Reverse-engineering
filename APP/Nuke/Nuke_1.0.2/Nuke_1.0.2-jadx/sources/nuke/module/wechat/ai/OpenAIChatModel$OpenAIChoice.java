package nuke.module.wechat.ai;

import defpackage.c50;
import defpackage.fp2;
import defpackage.t11;
import defpackage.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIChoice {

    @fp2("finish_reason")
    private final String finishReason;
    private final OpenAIChatModel$OpenAIResponseMessage message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:nuke.module.wechat.ai.OpenAIChatModel$OpenAIResponseMessage:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null nuke.module.wechat.ai.OpenAIChatModel$OpenAIResponseMessage) : (r2v0 nuke.module.wechat.ai.OpenAIChatModel$OpenAIResponseMessage))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(nuke.module.wechat.ai.OpenAIChatModel$OpenAIResponseMessage, java.lang.String):void (m)] (LINE:12) call: nuke.module.wechat.ai.OpenAIChatModel$OpenAIChoice.<init>(nuke.module.wechat.ai.OpenAIChatModel$OpenAIResponseMessage, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ OpenAIChatModel$OpenAIChoice(OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage, String str, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : openAIChatModel$OpenAIResponseMessage, (i & 2) != 0 ? null : str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ OpenAIChatModel$OpenAIChoice copy$default(OpenAIChatModel$OpenAIChoice openAIChatModel$OpenAIChoice, OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            openAIChatModel$OpenAIResponseMessage = openAIChatModel$OpenAIChoice.message;
        }
        if ((i & 2) != 0) {
            str = openAIChatModel$OpenAIChoice.finishReason;
        }
        return openAIChatModel$OpenAIChoice.copy(openAIChatModel$OpenAIResponseMessage, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIResponseMessage component1() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.finishReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIChoice copy(OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage, String str) {
        return new OpenAIChatModel$OpenAIChoice(openAIChatModel$OpenAIResponseMessage, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIChoice)) {
            return false;
        }
        OpenAIChatModel$OpenAIChoice openAIChatModel$OpenAIChoice = (OpenAIChatModel$OpenAIChoice) obj;
        return t11.l(this.message, openAIChatModel$OpenAIChoice.message) && t11.l(this.finishReason, openAIChatModel$OpenAIChoice.finishReason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getFinishReason() {
        return this.finishReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIResponseMessage getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage = this.message;
        int iHashCode = (openAIChatModel$OpenAIResponseMessage == null ? 0 : openAIChatModel$OpenAIResponseMessage.hashCode()) * 31;
        String str = this.finishReason;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "OpenAIChoice(message=" + this.message + ", finishReason=" + this.finishReason + ")";
    }

    public OpenAIChatModel$OpenAIChoice(OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage, String str) {
        this.message = openAIChatModel$OpenAIResponseMessage;
        this.finishReason = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public OpenAIChatModel$OpenAIChoice() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
