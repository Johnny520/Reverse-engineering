package p116i;

import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: i.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1785r0 implements InterfaceC1803y {

    /* JADX INFO: renamed from: a */
    public final float f5951a;

    /* JADX INFO: renamed from: b */
    public final float f5952b;

    /* JADX INFO: renamed from: c */
    public final Object f5953c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1785r0(float f3, float f10, Object obj) {
        this.f5951a = f3;
        this.f5952b = f10;
        this.f5953c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1763k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1774n1 mo4363a(C1771m1 c1771m1) {
        Object obj = this.f5953c;
        return new C0119x(this.f5951a, this.f5952b, obj == null ? null : (AbstractC1781q) c1771m1.f5912a.invoke(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1785r0) {
            C1785r0 c1785r0 = (C1785r0) obj;
            if (c1785r0.f5951a == this.f5951a && c1785r0.f5952b == this.f5952b && AbstractC1416l.m3825a(c1785r0.f5953c, this.f5953c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f5953c;
        return Float.hashCode(this.f5952b) + AbstractC0921a.m2241d(this.f5951a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR (1.0f float), (1500.0f float), (r3v0 java.lang.Object) A[MD:(float, float, java.lang.Object):void (m)] (LINE:11) call: i.r0.<init>(float, float, java.lang.Object):void type: THIS */
    public /* synthetic */ C1785r0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
