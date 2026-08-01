package p361yc;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p329wc.AbstractC9221i;
import p329wc.AbstractC9223k;
import p329wc.AbstractC9224l;
import p329wc.AbstractC9225m;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9697g0 extends C9714j2 {

    /* JADX INFO: renamed from: m */
    public final AbstractC9224l f32939m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC4705l f32940n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9697g0(final String str, final int i10) {
        super(str, null, i10, 2, null);
        str.getClass();
        this.f32939m = AbstractC9224l.b.f31485a;
        this.f32940n = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: yc.f0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C9697g0.m37899w(i10, str, this);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static InterfaceC9218f[] m37899w(int i10, String str, C9697g0 c9697g0) {
        InterfaceC9218f[] interfaceC9218fArr = new InterfaceC9218f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9218fArr[i11] = AbstractC9223k.m35909e(str + '.' + c9697g0.mo35892f(i11), AbstractC9225m.d.f31489a, new InterfaceC9218f[0], null, 8, null);
        }
        return interfaceC9218fArr;
    }

    @Override // p361yc.C9714j2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC9218f)) {
            return false;
        }
        InterfaceC9218f interfaceC9218f = (InterfaceC9218f) obj;
        return interfaceC9218f.mo35896j() == AbstractC9224l.b.f31485a && AbstractC1061t.m3842c(mo35888a(), interfaceC9218f.mo35888a()) && AbstractC1061t.m3842c(AbstractC9689e2.m37878a(this), AbstractC9689e2.m37878a(interfaceC9218f));
    }

    @Override // p361yc.C9714j2, p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: h */
    public InterfaceC9218f mo35894h(int i10) {
        return m37900x()[i10];
    }

    @Override // p361yc.C9714j2
    public int hashCode() {
        int iHashCode = mo35888a().hashCode();
        int iHashCode2 = 1;
        for (String str : AbstractC9221i.m35902b(this)) {
            int i10 = iHashCode2 * 31;
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p361yc.C9714j2, p329wc.InterfaceC9218f
    /* JADX INFO: renamed from: j */
    public AbstractC9224l mo35896j() {
        return this.f32939m;
    }

    @Override // p361yc.C9714j2
    public String toString() {
        return AbstractC5081g0.m20585s0(AbstractC9221i.m35902b(this), ", ", mo35888a() + '(', ")", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC9218f[] m37900x() {
        return (InterfaceC9218f[]) this.f32940n.getValue();
    }
}
