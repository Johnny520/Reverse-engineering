package p361yc;

import java.util.ArrayList;
import p010a9.InterfaceC0173a;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p300uc.InterfaceC8645a;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9487e;

/* JADX INFO: renamed from: yc.c3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9680c3 implements InterfaceC9487e, InterfaceC9485c {

    /* JADX INFO: renamed from: b */
    public final ArrayList f32913b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f32914c;

    /* JADX INFO: renamed from: J */
    public static Object m37832J(AbstractC9680c3 abstractC9680c3, InterfaceC8645a interfaceC8645a, Object obj) {
        return (interfaceC8645a.mo15953a().mo35889c() || abstractC9680c3.mo683p()) ? abstractC9680c3.m37834L(interfaceC8645a, obj) : abstractC9680c3.mo893j();
    }

    /* JADX INFO: renamed from: K */
    public static Object m37833K(AbstractC9680c3 abstractC9680c3, InterfaceC8645a interfaceC8645a, Object obj) {
        return abstractC9680c3.m37834L(interfaceC8645a, obj);
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: B */
    public InterfaceC9487e mo659B(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return mo667S(m37838a0(), interfaceC9218f);
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: C */
    public final Object mo36949C(InterfaceC9218f interfaceC9218f, int i10, final InterfaceC8645a interfaceC8645a, final Object obj) {
        interfaceC9218f.getClass();
        interfaceC8645a.getClass();
        return m37840c0(mo37836Y(interfaceC9218f, i10), new InterfaceC0173a() { // from class: yc.b3
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC9680c3.m37832J(this.f32907q, interfaceC8645a, obj);
            }
        });
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: D */
    public abstract Object mo660D(InterfaceC8645a interfaceC8645a);

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: E */
    public final short mo866E() {
        return mo670V(m37838a0());
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: F */
    public final float mo879F() {
        return mo666R(m37838a0());
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: G */
    public final int mo880G(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return mo665Q(m37838a0(), interfaceC9218f);
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: H */
    public final short mo36950H(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo670V(mo37836Y(interfaceC9218f, i10));
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: I */
    public final double mo881I() {
        return mo664P(m37838a0());
    }

    /* JADX INFO: renamed from: L */
    public Object m37834L(InterfaceC8645a interfaceC8645a, Object obj) {
        interfaceC8645a.getClass();
        return mo660D(interfaceC8645a);
    }

    /* JADX INFO: renamed from: M */
    public abstract boolean mo661M(Object obj);

    /* JADX INFO: renamed from: N */
    public abstract byte mo662N(Object obj);

    /* JADX INFO: renamed from: O */
    public abstract char mo663O(Object obj);

    /* JADX INFO: renamed from: P */
    public abstract double mo664P(Object obj);

    /* JADX INFO: renamed from: Q */
    public abstract int mo665Q(Object obj, InterfaceC9218f interfaceC9218f);

    /* JADX INFO: renamed from: R */
    public abstract float mo666R(Object obj);

    /* JADX INFO: renamed from: S */
    public InterfaceC9487e mo667S(Object obj, InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        m37839b0(obj);
        return this;
    }

    /* JADX INFO: renamed from: T */
    public abstract int mo668T(Object obj);

    /* JADX INFO: renamed from: U */
    public abstract long mo669U(Object obj);

    /* JADX INFO: renamed from: V */
    public abstract short mo670V(Object obj);

    /* JADX INFO: renamed from: W */
    public abstract String mo671W(Object obj);

    /* JADX INFO: renamed from: X */
    public final Object m37835X() {
        return AbstractC5081g0.m20589w0(this.f32913b);
    }

    /* JADX INFO: renamed from: Y */
    public abstract Object mo37836Y(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: Z */
    public final ArrayList m37837Z() {
        return this.f32913b;
    }

    /* JADX INFO: renamed from: a0 */
    public final Object m37838a0() {
        ArrayList arrayList = this.f32913b;
        Object objRemove = arrayList.remove(AbstractC5114x.m20802q(arrayList));
        this.f32914c = true;
        return objRemove;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m37839b0(Object obj) {
        this.f32913b.add(obj);
    }

    /* JADX INFO: renamed from: c0 */
    public final Object m37840c0(Object obj, InterfaceC0173a interfaceC0173a) {
        m37839b0(obj);
        Object objInvoke = interfaceC0173a.invoke();
        if (!this.f32914c) {
            m37838a0();
        }
        this.f32914c = false;
        return objInvoke;
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: e */
    public final boolean mo891e() {
        return mo661M(m37838a0());
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: f */
    public final char mo892f() {
        return mo663O(m37838a0());
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: g */
    public final byte mo36953g(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo662N(mo37836Y(interfaceC9218f, i10));
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: i */
    public final int mo867i() {
        return mo668T(m37838a0());
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: j */
    public final Void mo893j() {
        return null;
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: k */
    public final String mo894k() {
        return mo671W(m37838a0());
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: l */
    public final int mo36954l(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo668T(mo37836Y(interfaceC9218f, i10));
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: m */
    public final String mo36955m(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo671W(mo37836Y(interfaceC9218f, i10));
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: n */
    public final long mo868n() {
        return mo669U(m37838a0());
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: o */
    public final double mo36956o(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo664P(mo37836Y(interfaceC9218f, i10));
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: q */
    public final InterfaceC9487e mo36957q(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo667S(mo37836Y(interfaceC9218f, i10), interfaceC9218f.mo35894h(i10));
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: r */
    public boolean mo36958r() {
        return super.mo36958r();
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: s */
    public int mo36959s(InterfaceC9218f interfaceC9218f) {
        return super.mo36959s(interfaceC9218f);
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: t */
    public final boolean mo36960t(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo661M(mo37836Y(interfaceC9218f, i10));
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: u */
    public final float mo36961u(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo666R(mo37836Y(interfaceC9218f, i10));
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: w */
    public final char mo36962w(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo663O(mo37836Y(interfaceC9218f, i10));
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: x */
    public final Object mo895x(InterfaceC9218f interfaceC9218f, int i10, final InterfaceC8645a interfaceC8645a, final Object obj) {
        interfaceC9218f.getClass();
        interfaceC8645a.getClass();
        return m37840c0(mo37836Y(interfaceC9218f, i10), new InterfaceC0173a() { // from class: yc.a3
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC9680c3.m37833K(this.f32902q, interfaceC8645a, obj);
            }
        });
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: y */
    public final long mo36963y(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo669U(mo37836Y(interfaceC9218f, i10));
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: z */
    public final byte mo869z() {
        return mo662N(m37838a0());
    }
}
