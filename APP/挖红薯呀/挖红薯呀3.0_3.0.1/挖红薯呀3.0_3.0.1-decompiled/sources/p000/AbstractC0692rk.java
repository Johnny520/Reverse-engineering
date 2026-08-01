package p000;

/* JADX INFO: renamed from: rk */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0692rk extends AbstractC0746t implements InterfaceC0515nk {

    /* JADX INFO: renamed from: e */
    public static final C0655qk f5426e = new C0655qk(C0496n2.f4163w, new C0881w9(8));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0692rk() {
        super(C0496n2.f4163w);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo358e(InterfaceC0618pk interfaceC0618pk, Runnable runnable);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean mo1509f(InterfaceC0618pk interfaceC0618pk) {
        return !(this instanceof ka1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public AbstractC0692rk mo2815i(int i) {
        r60.m3405g(i);
        return new fa0(this, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0746t, p000.InterfaceC0618pk
    /* JADX INFO: renamed from: l */
    public final InterfaceC0515nk mo64l(InterfaceC0554ok interfaceC0554ok) {
        InterfaceC0515nk interfaceC0515nk;
        interfaceC0554ok.getClass();
        if (interfaceC0554ok instanceof C0655qk) {
            C0655qk c0655qk = (C0655qk) interfaceC0554ok;
            InterfaceC0554ok interfaceC0554ok2 = this.f5881d;
            if ((interfaceC0554ok2 == c0655qk || c0655qk.f5190e == interfaceC0554ok2) && (interfaceC0515nk = (InterfaceC0515nk) c0655qk.f5189d.invoke(this)) != null) {
                return interfaceC0515nk;
            }
        } else if (C0496n2.f4163w == interfaceC0554ok) {
            return this;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0746t, p000.InterfaceC0618pk
    /* JADX INFO: renamed from: t */
    public final InterfaceC0618pk mo66t(InterfaceC0554ok interfaceC0554ok) {
        interfaceC0554ok.getClass();
        if (interfaceC0554ok instanceof C0655qk) {
            C0655qk c0655qk = (C0655qk) interfaceC0554ok;
            InterfaceC0554ok interfaceC0554ok2 = this.f5881d;
            if ((interfaceC0554ok2 != c0655qk && c0655qk.f5190e != interfaceC0554ok2) || ((InterfaceC0515nk) c0655qk.f5189d.invoke(this)) == null) {
                return this;
            }
        } else if (C0496n2.f4163w != interfaceC0554ok) {
            return this;
        }
        return C0220fs.f1799d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0398kl.m1927m(this);
    }
}
