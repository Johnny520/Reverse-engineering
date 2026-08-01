package p000;

/* JADX INFO: renamed from: x6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0531x6 {

    /* JADX INFO: renamed from: a */
    public final String f1030a;

    /* JADX INFO: renamed from: c */
    public boolean f1032c;

    /* JADX INFO: renamed from: d */
    public boolean f1033d;

    /* JADX INFO: renamed from: e */
    public boolean f1034e;

    /* JADX INFO: renamed from: f */
    public boolean f1035f;

    /* JADX INFO: renamed from: i */
    public boolean f1038i;

    /* JADX INFO: renamed from: b */
    public String f1031b = "";

    /* JADX INFO: renamed from: g */
    public String f1036g = "";

    /* JADX INFO: renamed from: h */
    public String f1037h = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0531x6(String str) {
        this.f1030a = str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1131a(boolean z) {
        StringBuilder sb = new StringBuilder("clock-in result, manual=");
        sb.append(z);
        sb.append(", troop=");
        sb.append(this.f1030a);
        sb.append(", self=");
        sb.append(AbstractC0008a7.m59p(this.f1031b) ? "empty" : this.f1031b);
        sb.append(", handler=");
        sb.append(this.f1032c);
        sb.append(", handlerMethod=");
        sb.append(this.f1033d);
        sb.append(", handlerInvoked=");
        sb.append(this.f1034e);
        sb.append(", requestSent=");
        sb.append(this.f1035f);
        sb.append(", response=false, transportCode=none, oidbResult=none, retCode=none, message=");
        sb.append(AbstractC0008a7.m59p(this.f1036g) ? "none" : this.f1036g);
        sb.append(", success=");
        sb.append(this.f1038i);
        sb.append(AbstractC0008a7.m59p(this.f1037h) ? "" : ", error=".concat(this.f1037h));
        return sb.toString();
    }
}
