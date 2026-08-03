package p099h.Hchat.hooks.items.script;

import gg.AbstractC1411g;
import p065eb.C0867f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptQuoteMsgBean {
    public static final int $stable = 0;
    public static final C0867f0 Companion = new C0867f0();
    private final String content;
    private final long createTime;
    private final String displayName;
    private final String msgSource;
    private final String sendTalker;
    private final String strId;
    private final long svrId;
    private final String talker;
    private final String title;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ScriptQuoteMsgBean(String str, String str2, String str3, String str4, String str5, int i9, String str6, long j3, String str7, long j4) {
        this.title = str;
        this.msgSource = str2;
        this.sendTalker = str3;
        this.displayName = str4;
        this.talker = str5;
        this.type = i9;
        this.content = str6;
        this.svrId = j3;
        this.strId = str7;
        this.createTime = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMsgSource() {
        return this.msgSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSendTalker() {
        return this.sendTalker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSenderId() {
        return this.sendTalker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getStrId() {
        return this.strId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getSvrId() {
        return this.svrId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTalker() {
        return this.talker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTalkerId() {
        return this.talker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 int)
  (r7v0 java.lang.String)
  (r8v0 long)
  (r10v0 java.lang.String)
  (r11v0 long)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, long, java.lang.String, long):void (m)] (LINE:25) call: h.Hchat.hooks.items.script.ScriptQuoteMsgBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, long, java.lang.String, long):void type: THIS */
    public /* synthetic */ ScriptQuoteMsgBean(String str, String str2, String str3, String str4, String str5, int i9, String str6, long j3, String str7, long j4, AbstractC1411g abstractC1411g) {
        this(str, str2, str3, str4, str5, i9, str6, j3, str7, j4);
    }
}
