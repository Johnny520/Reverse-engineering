package p100h0;

import android.os.Build;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p144k.AbstractC2161c1;
import p144k.C2203q1;
import p144k.C2229z0;
import p276sf.C3967n;
import p293u2.C4238h;
import p293u2.C4242l;
import p293u2.InterfaceC4233c;
import p356y0.C5850l;

/* JADX INFO: renamed from: h0.h1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1523h1 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5087g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC4233c f5088h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f5089i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1523h1(InterfaceC4233c interfaceC4233c, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f5087g = i9;
        this.f5088h = interfaceC4233c;
        this.f5089i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f5087g) {
            case 0:
                C4238h c4238h = (C4238h) obj;
                float fM8524b = C4238h.m8524b(c4238h.f13911a);
                InterfaceC4233c interfaceC4233c = this.f5088h;
                this.f5089i.setValue(new C4242l((((long) interfaceC4233c.mo1590G0(fM8524b)) << 32) | (((long) interfaceC4233c.mo1590G0(C4238h.m8523a(c4238h.f13911a))) & 4294967295L)));
                return C3967n.f12976a;
            default:
                C1520g1 c1520g1 = new C1520g1((InterfaceC1220a) obj, 0);
                C1523h1 c1523h1 = new C1523h1(this.f5088h, this.f5089i, 0);
                if (AbstractC2161c1.m5388a()) {
                    return AbstractC2161c1.m5388a() ? new C2229z0(c1520g1, c1523h1, Build.VERSION.SDK_INT == 28 ? C2203q1.f7301b : C2203q1.f7302c) : C5850l.f23787a;
                }
                C2104o.m5297w("Magnifier is only supported on API level 28 and higher.");
                return null;
        }
    }
}
