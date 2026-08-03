package p307v0;

import okio.C3193a;
import p020b5.C0184c;
import p117i0.C1823e;
import p117i0.InterfaceC1810a2;
import p322w0.InterfaceC4663n;

/* JADX INFO: renamed from: v0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4362b implements InterfaceC1810a2 {

    /* JADX INFO: renamed from: g */
    public InterfaceC4370j f14560g;

    /* JADX INFO: renamed from: h */
    public InterfaceC4366f f14561h;

    /* JADX INFO: renamed from: i */
    public String f14562i;

    /* JADX INFO: renamed from: j */
    public Object f14563j;

    /* JADX INFO: renamed from: k */
    public Object[] f14564k;

    /* JADX INFO: renamed from: l */
    public InterfaceC4365e f14565l;

    /* JADX INFO: renamed from: m */
    public final C4361a f14566m = new C4361a(this, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4362b(InterfaceC4370j interfaceC4370j, InterfaceC4366f interfaceC4366f, String str, Object obj, Object[] objArr) {
        this.f14560g = interfaceC4370j;
        this.f14561h = interfaceC4366f;
        this.f14562i = str;
        this.f14563j = obj;
        this.f14564k = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8801a() {
        String strM8803a;
        InterfaceC4366f interfaceC4366f = this.f14561h;
        if (this.f14565l != null) {
            C3193a.m6819h(this.f14565l, "entry(", ") is not null");
            return;
        }
        if (interfaceC4366f != null) {
            C4361a c4361a = this.f14566m;
            Object objInvoke = c4361a.invoke();
            if (objInvoke == null || interfaceC4366f.mo8036a(objInvoke)) {
                this.f14565l = interfaceC4366f.mo8040e(this.f14562i, c4361a);
                return;
            }
            if (objInvoke instanceof InterfaceC4663n) {
                InterfaceC4663n interfaceC4663n = (InterfaceC4663n) objInvoke;
                if (interfaceC4663n.mo4485b() == C1823e.f6049j || interfaceC4663n.mo4485b() == C1823e.f6052m || interfaceC4663n.mo4485b() == C1823e.f6050k) {
                    strM8803a = "MutableState containing " + interfaceC4663n.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM8803a = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM8803a = AbstractC4371k.m8803a(objInvoke);
            }
            throw new IllegalArgumentException(strM8803a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: d */
    public final void mo2480d() {
        InterfaceC4365e interfaceC4365e = this.f14565l;
        if (interfaceC4365e != null) {
            ((C0184c) interfaceC4365e).m805Z();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: f */
    public final void mo2481f() {
        InterfaceC4365e interfaceC4365e = this.f14565l;
        if (interfaceC4365e != null) {
            ((C0184c) interfaceC4365e).m805Z();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1810a2
    /* JADX INFO: renamed from: j */
    public final void mo2482j() {
        m8801a();
    }
}
