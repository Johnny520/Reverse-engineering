package bsh;

/* JADX INFO: renamed from: bsh.e4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1171e4 implements InterfaceC1230o3 {

    /* JADX INFO: renamed from: q */
    public int f3541q;

    /* JADX INFO: renamed from: r */
    public String f3542r;

    /* JADX INFO: renamed from: s */
    public Object f3543s;

    /* JADX INFO: renamed from: t */
    public InterfaceC1188h3 f3544t;

    public C1171e4(int i10, String str, InterfaceC1188h3 interfaceC1188h3) {
        this.f3542r = null;
        this.f3543s = Primitive.VOID;
        this.f3541q = i10;
        this.f3542r = str;
        this.f3544t = interfaceC1188h3;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ReturnControl: ");
        int i10 = this.f3541q;
        if (i10 == 13) {
            str = "BREAK ";
        } else if (i10 == 47) {
            str = "RETURN ";
        } else if (i10 == 20) {
            str = "CONTINUE ";
        } else {
            str = "DUNNO?? " + this.f3541q;
        }
        sb2.append(str);
        sb2.append(this.f3542r);
        sb2.append(": from: ");
        sb2.append(this.f3544t);
        return sb2.toString();
    }

    public C1171e4(int i10, Object obj, InterfaceC1188h3 interfaceC1188h3) {
        this.f3542r = null;
        Primitive primitive = Primitive.TRUE;
        this.f3541q = i10;
        this.f3543s = obj;
        this.f3544t = interfaceC1188h3;
    }
}
