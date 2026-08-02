package nuke.module.wechat.ai;

import defpackage.c50;
import defpackage.t11;
import defpackage.vi0;
import defpackage.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIResponseMessage {
    private final String content;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:6) call: nuke.module.wechat.ai.OpenAIChatModel$OpenAIResponseMessage.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ OpenAIChatModel$OpenAIResponseMessage(String str, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ OpenAIChatModel$OpenAIResponseMessage copy$default(OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openAIChatModel$OpenAIResponseMessage.content;
        }
        return openAIChatModel$OpenAIResponseMessage.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIResponseMessage copy(String str) {
        return new OpenAIChatModel$OpenAIResponseMessage(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenAIChatModel$OpenAIResponseMessage) && t11.l(this.content, ((OpenAIChatModel$OpenAIResponseMessage) obj).content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        String str = this.content;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return vi0.j("OpenAIResponseMessage(content=", this.content, ")");
    }

    public OpenAIChatModel$OpenAIResponseMessage(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public OpenAIChatModel$OpenAIResponseMessage() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
