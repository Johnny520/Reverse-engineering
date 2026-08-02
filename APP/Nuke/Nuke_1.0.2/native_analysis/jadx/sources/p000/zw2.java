package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zw2 extends th1 implements s12, e70, r12 {

    /* JADX INFO: renamed from: A */
    public final zk1 f14126A;

    /* JADX INFO: renamed from: B */
    public final zk1 f14127B;

    /* JADX INFO: renamed from: C */
    public final zk1 f14128C;

    /* JADX INFO: renamed from: D */
    public h12 f14129D;

    /* JADX INFO: renamed from: E */
    public long f14130E;

    /* JADX INFO: renamed from: v */
    public Object f14131v;

    /* JADX INFO: renamed from: w */
    public Object f14132w;

    /* JADX INFO: renamed from: x */
    public PointerInputEventHandler f14133x;

    /* JADX INFO: renamed from: y */
    public zt2 f14134y;

    /* JADX INFO: renamed from: z */
    public h12 f14135z = vw2.f12207a;

    public zw2(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f14131v = obj;
        this.f14132w = obj2;
        this.f14133x = pointerInputEventHandler;
        zk1 zk1Var = new zk1(new yw2[16]);
        this.f14126A = zk1Var;
        this.f14127B = zk1Var;
        this.f14128C = new zk1(new yw2[16]);
        this.f14130E = 0L;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        m6515O0();
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: J */
    public final void mo215J(h12 h12Var, i12 i12Var, long j) {
        this.f14130E = j;
        if (i12Var == i12.f4216h) {
            this.f14135z = h12Var;
        }
        t00 t00Var = null;
        if (this.f14134y == null) {
            this.f14134y = AbstractC0570p7.m3745A(m5255A0(), null, new h50(this, t00Var, 9), 1);
        }
        m6514N0(h12Var, i12Var);
        List list = h12Var.f3776a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                h12Var = null;
                break;
            } else if (!tp0.m5369q((o12) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.f14129D = h12Var;
    }

    /* JADX INFO: renamed from: M0 */
    public final Object m6513M0(mn0 mn0Var, t00 t00Var) {
        C0469mp c0469mp = new C0469mp(1, gf1.m1908z(t00Var));
        c0469mp.m3151u();
        yw2 yw2Var = new yw2(this, c0469mp);
        synchronized (this.f14127B) {
            this.f14126A.m6423b(yw2Var);
            new xb2(gf1.m1908z(gf1.m1898p(yw2Var, yw2Var, mn0Var))).mo2509h(a83.f116a);
        }
        c0469mp.m3153w(new C0798v5(22, yw2Var));
        return c0469mp.m3150t();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /* JADX INFO: renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6514N0(h12 h12Var, i12 i12Var) {
        int i;
        int i2;
        C0469mp c0469mp;
        C0469mp c0469mp2;
        synchronized (this.f14127B) {
            zk1 zk1Var = this.f14128C;
            zk1Var.m6424c(zk1Var.f13936j, this.f14126A);
        }
        try {
            int iOrdinal = i12Var.ordinal();
            if (iOrdinal == 0) {
                zk1 zk1Var2 = this.f14128C;
                Object[] objArr = zk1Var2.f13934h;
                i = zk1Var2.f13936j;
                for (i2 = 0; i2 < i; i2++) {
                    yw2 yw2Var = (yw2) objArr[i2];
                    if (i12Var == yw2Var.f13656k && (c0469mp = yw2Var.f13655j) != null) {
                        yw2Var.f13655j = null;
                        c0469mp.mo2509h(h12Var);
                    }
                }
            } else if (iOrdinal == 1) {
                zk1 zk1Var3 = this.f14128C;
                int i3 = zk1Var3.f13936j - 1;
                Object[] objArr2 = zk1Var3.f13934h;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        yw2 yw2Var2 = (yw2) objArr2[i3];
                        if (i12Var == yw2Var2.f13656k && (c0469mp2 = yw2Var2.f13655j) != null) {
                            yw2Var2.f13655j = null;
                            c0469mp2.mo2509h(h12Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new C0594pv();
                }
                zk1 zk1Var22 = this.f14128C;
                Object[] objArr3 = zk1Var22.f13934h;
                i = zk1Var22.f13936j;
                while (i2 < i) {
                }
            }
            this.f14128C.m6428g();
        } catch (Throwable th) {
            this.f14128C.m6428g();
            throw th;
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m6515O0() {
        zt2 zt2Var = this.f14134y;
        if (zt2Var != null) {
            zt2Var.mo3477D(new xh1("Pointer input was reset", 2));
            this.f14134y = null;
        }
    }

    @Override // p000.t60, p000.r12
    /* JADX INFO: renamed from: a */
    public final void mo225a() {
        m6515O0();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return sp0.m4933c0(this).f9365F.mo693b();
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: e0 */
    public final void mo4305e0() {
        m6515O0();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return sp0.m4933c0(this).f9365F.mo697m();
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: m0 */
    public final void mo233m0() {
        h12 h12Var = this.f14129D;
        if (h12Var == null) {
            return;
        }
        List list = h12Var.f3776a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((o12) list.get(i)).f7423d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    o12 o12Var = (o12) list.get(i2);
                    long j = o12Var.f7420a;
                    long j2 = o12Var.f7422c;
                    long j3 = o12Var.f7421b;
                    float f = o12Var.f7424e;
                    boolean z = o12Var.f7423d;
                    arrayList.add(new o12(j, j3, j2, false, f, j3, j2, z, z, o12Var.f7428i, 0L, 1.0f, 0L));
                }
                h12 h12Var2 = new h12(arrayList, null);
                this.f14135z = h12Var2;
                m6514N0(h12Var2, i12.f4216h);
                m6514N0(h12Var2, i12.f4217i);
                m6514N0(h12Var2, i12.f4218j);
                this.f14129D = null;
                return;
            }
        }
    }
}
