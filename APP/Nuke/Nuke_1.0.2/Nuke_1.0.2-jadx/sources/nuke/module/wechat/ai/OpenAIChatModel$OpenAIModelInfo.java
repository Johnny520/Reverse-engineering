package nuke.module.wechat.ai;

import defpackage.c50;
import defpackage.fp2;
import defpackage.t11;
import defpackage.vi0;
import defpackage.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIModelInfo {
    private final String id;

    @fp2("owned_by")
    private final String ownedBy;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:12) call: nuke.module.wechat.ai.OpenAIChatModel$OpenAIModelInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ OpenAIChatModel$OpenAIModelInfo(String str, String str2, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ OpenAIChatModel$OpenAIModelInfo copy$default(OpenAIChatModel$OpenAIModelInfo openAIChatModel$OpenAIModelInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openAIChatModel$OpenAIModelInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = openAIChatModel$OpenAIModelInfo.ownedBy;
        }
        return openAIChatModel$OpenAIModelInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.ownedBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIModelInfo copy(String str, String str2) {
        return new OpenAIChatModel$OpenAIModelInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIModelInfo)) {
            return false;
        }
        OpenAIChatModel$OpenAIModelInfo openAIChatModel$OpenAIModelInfo = (OpenAIChatModel$OpenAIModelInfo) obj;
        return t11.l(this.id, openAIChatModel$OpenAIModelInfo.id) && t11.l(this.ownedBy, openAIChatModel$OpenAIModelInfo.ownedBy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getOwnedBy() {
        return this.ownedBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ownedBy;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return vi0.k("OpenAIModelInfo(id=", this.id, ", ownedBy=", this.ownedBy, ")");
    }

    public OpenAIChatModel$OpenAIModelInfo(String str, String str2) {
        this.id = str;
        this.ownedBy = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public OpenAIChatModel$OpenAIModelInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
