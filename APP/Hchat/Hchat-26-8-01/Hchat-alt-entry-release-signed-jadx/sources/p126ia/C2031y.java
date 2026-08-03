package p126ia;

import ba.RunnableC0225e;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p254r3.C3654a;
import p254r3.C3656c;
import p254r3.C3657d;
import p269s3.C3923a;
import p269s3.C3927e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import tf.AbstractC4156d0;
import tf.C4175v;

/* JADX INFO: renamed from: ia.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2031y implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6862g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f6863h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f6864i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6865j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f6866k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2031y(C2007a0 c2007a0, boolean z9, boolean z10, InterfaceC1231l interfaceC1231l) {
        this.f6865j = c2007a0;
        this.f6863h = z9;
        this.f6864i = z10;
        this.f6866k = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Object objValueOf;
        C3657d c3657d;
        C3657d c3657d2;
        C3657d c3657d3;
        switch (this.f6862g) {
            case 0:
                C2007a0 c2007a0 = (C2007a0) this.f6865j;
                AtomicBoolean atomicBoolean = c2007a0.f6769l;
                boolean z9 = this.f6863h;
                boolean z10 = this.f6864i;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f6866k;
                try {
                    try {
                        objValueOf = Boolean.valueOf(c2007a0.m4958p(z9, z10));
                    } finally {
                    }
                    Throwable thM8182b = C3960g.m8182b(objValueOf);
                    if (thM8182b != null) {
                        c2007a0.f6761d.invoke("恢复朋友圈伪互动缓存失败", thM8182b);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (objValueOf instanceof C3959f) {
                        objValueOf = bool;
                    }
                    boolean zBooleanValue = ((Boolean) objValueOf).booleanValue();
                    atomicBoolean.set(false);
                    c2007a0.f6765h.post(new RunnableC0225e(interfaceC1231l, zBooleanValue, 2));
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                }
                break;
            case 1:
                C3923a c3923a = (C3923a) this.f6865j;
                C3927e c3927e = (C3927e) this.f6866k;
                boolean z11 = c3923a.f12882e;
                boolean z12 = this.f6863h;
                if (z11 != z12) {
                    c3923a.f12882e = z12;
                    C3654a c3654a = c3923a.f12883f;
                    if (c3654a != null && (c3657d3 = c3654a.f11851b) != null) {
                        c3657d3.m7636a();
                    }
                }
                boolean z13 = c3923a.f12881d;
                boolean z14 = this.f6864i;
                if (z13 != z14) {
                    c3923a.f12881d = z14;
                    C3654a c3654a2 = c3923a.f12883f;
                    if (c3654a2 != null && (c3657d2 = c3654a2.f11851b) != null) {
                        c3657d2.m7636a();
                    }
                }
                C3656c c3656c = (C3656c) c3927e.f12903c.getValue();
                List list = (List) c3927e.f12902b.getValue();
                List list2 = (List) c3927e.f12904d.getValue();
                c3656c.getClass();
                list.getClass();
                list2.getClass();
                c3923a.f12878a = c3656c;
                c3923a.f12879b = list;
                c3923a.f12880c = list2;
                C3654a c3654a3 = c3923a.f12883f;
                if (c3654a3 != null && (c3657d = c3654a3.f11851b) != null) {
                    c3657d.m7637c(c3923a);
                }
                return C3967n.f12976a;
            default:
                Set set = (Set) this.f6865j;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f6866k;
                interfaceC1809a1.setValue((!this.f6863h || ((Set) interfaceC1809a1.getValue()).isEmpty()) ? this.f6864i ? AbstractC4156d0.m8352T((Set) interfaceC1809a1.getValue(), set) : AbstractC4156d0.m8353U((Set) interfaceC1809a1.getValue(), set) : C4175v.f13712g);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C2031y(C3923a c3923a, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, boolean z10, InterfaceC1220a interfaceC1220a3, InterfaceC1220a interfaceC1220a4, C3927e c3927e) {
        this.f6865j = c3923a;
        this.f6863h = z9;
        this.f6864i = z10;
        this.f6866k = c3927e;
    }

    public /* synthetic */ C2031y(boolean z9, boolean z10, Set set, InterfaceC1809a1 interfaceC1809a1) {
        this.f6863h = z9;
        this.f6864i = z10;
        this.f6865j = set;
        this.f6866k = interfaceC1809a1;
    }
}
