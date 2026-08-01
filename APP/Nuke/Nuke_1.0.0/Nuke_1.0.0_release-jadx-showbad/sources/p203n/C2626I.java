package p203n;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;

/* JADX INFO: renamed from: n.I */
/* JADX INFO: loaded from: classes.dex */
public final class C2626I implements InterfaceC2677v {

    /* JADX INFO: renamed from: a */
    public final float f8339a;

    /* JADX INFO: renamed from: b */
    public final float f8340b;

    /* JADX INFO: renamed from: c */
    public final Object f8341c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2626I(float f2, float f5, Object obj) {
        this.f8339a = f2;
        this.f8340b = f5;
        this.f8341c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2659i
    /* JADX INFO: renamed from: a */
    public final InterfaceC2656g0 mo4572a(C2652e0 c2652e0) {
        Object obj = this.f8341c;
        return new C1753n(this.f8339a, this.f8340b, obj == null ? null : (AbstractC2670o) c2652e0.f8459a.mo1h(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2626I) {
            C2626I c2626i = (C2626I) obj;
            if (c2626i.f8339a == this.f8339a && c2626i.f8340b == this.f8340b && AbstractC1665j.m2981a(c2626i.f8341c, this.f8341c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f8341c;
        return Float.hashCode(this.f8340b) + AbstractC0231b.m390a(this.f8339a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR (1.0f float), (1500.0f float), (r3v0 java.lang.Object) A[MD:(float, float, java.lang.Object):void (m)] (LINE:5) call: n.I.<init>(float, float, java.lang.Object):void type: THIS */
    public /* synthetic */ C2626I(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
