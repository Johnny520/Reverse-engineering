package p027c0;

import android.view.textclassifier.TextClassifier;
import ci.C0594l0;
import gg.C1422r;
import java.util.concurrent.CancellationException;
import p015b0.C0145k;
import p040d0.InterfaceC0648e;
import p065eb.C0893s0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p100h0.C1542p;
import p100h0.C1553u0;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1785r0;
import p116i.InterfaceC1803y;
import p136j8.C2104o;
import p174m.C2629m2;
import p174m.C2637o2;
import p187n.C2857k;
import p187n.C2859m;
import p187n.C2860n;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p265s.AbstractC3859u;
import p265s.C3857t;
import p276sf.C3967n;
import p293u2.C4240j;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: c0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0364i extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1017h;

    /* JADX INFO: renamed from: i */
    public int f1018i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f1019j;

    /* JADX INFO: renamed from: k */
    public Object f1020k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1021l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1022m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0364i(C0365j c0365j, long j3, InterfaceC0648e interfaceC0648e, C0363h c0363h, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1017h = 0;
        this.f1020k = c0365j;
        this.f1019j = j3;
        this.f1021l = interfaceC0648e;
        this.f1022m = c0363h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1017h) {
            case 0:
                return new C0364i((C0365j) this.f1020k, this.f1019j, (InterfaceC0648e) this.f1021l, (C0363h) this.f1022m, interfaceC5557c);
            case 1:
                return new C0364i((C0594l0) this.f1021l, this.f1019j, (C2857k) this.f1022m, interfaceC5557c, 1);
            case 2:
                C0364i c0364i = new C0364i((C1542p) this.f1021l, (CharSequence) this.f1022m, this.f1019j, interfaceC5557c, 2);
                c0364i.f1020k = obj;
                return c0364i;
            case 3:
                return new C0364i((InterfaceC3596r0) this.f1021l, this.f1019j, (C2857k) this.f1022m, interfaceC5557c, 3);
            case 4:
                C0364i c0364i2 = new C0364i((C2637o2) this.f1021l, this.f1019j, (C1422r) this.f1022m, interfaceC5557c, 4);
                c0364i2.f1020k = obj;
                return c0364i2;
            default:
                return new C0364i((C3857t) this.f1021l, (InterfaceC1803y) this.f1022m, this.f1019j, interfaceC5557c, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1017h) {
            case 0:
                return ((C0364i) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            case 1:
                return ((C0364i) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            case 2:
                return ((C0364i) create((TextClassifier) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            case 3:
                return ((C0364i) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            case 4:
                return ((C0364i) create((C2629m2) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            default:
                return ((C0364i) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (p116i.C1739c.m4359c(r0, r1, r8, r9, r14, 4) != r10) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2859m c2859m;
        C2860n c2860n;
        InterfaceC1803y interfaceC1803y;
        int i9 = this.f1017h;
        int i10 = 3;
        long j3 = this.f1019j;
        int i11 = 0;
        C3967n c3967n = C3967n.f12976a;
        Object obj2 = this.f1022m;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        Object obj3 = this.f1021l;
        int i12 = 1;
        switch (i9) {
            case 0:
                int i13 = this.f1018i;
                if (i13 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1553u0 c1553u0 = ((C0365j) this.f1020k).f1023w;
                    if (c1553u0 != null) {
                        this.f1018i = 1;
                        if (new C1553u0(c1553u0.f5183j, this, i11).invokeSuspend(c3967n) != enumC5799a) {
                        }
                    }
                    return enumC5799a;
                }
                if (i13 != 1) {
                    if (i13 == 2) {
                        AbstractC1089i.m2732I0(obj);
                        return c3967n;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                this.f1018i = 2;
                if (((InterfaceC0648e) obj3).mo716a((C0363h) obj2, this) != enumC5799a) {
                    return c3967n;
                }
                return enumC5799a;
            case 1:
                C0594l0 c0594l0 = (C0594l0) obj3;
                int i14 = this.f1018i;
                if (i14 == 0 || i14 == 1) {
                    AbstractC1089i.m2732I0(obj);
                    c2859m = new C2859m();
                    this.f1020k = c2859m;
                    this.f1018i = 2;
                    if (((C2857k) obj2).m6281a(c2859m, this) == enumC5799a) {
                        return enumC5799a;
                    }
                } else {
                    if (i14 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c2859m = (C2859m) this.f1020k;
                    AbstractC1089i.m2732I0(obj);
                }
                c0594l0.f1855B = c2859m;
                return c3967n;
            case 2:
                int i15 = this.f1018i;
                if (i15 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    TextClassifier textClassifier = (TextClassifier) this.f1020k;
                    this.f1018i = 1;
                    return C1542p.m4038a((C1542p) obj3, (CharSequence) obj2, this.f1019j, textClassifier, this) == enumC5799a ? enumC5799a : c3967n;
                }
                if (i15 == 1) {
                    AbstractC1089i.m2732I0(obj);
                    return c3967n;
                }
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                C2857k c2857k = (C2857k) obj2;
                int i16 = this.f1018i;
                if (i16 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    this.f1018i = 1;
                    if (((InterfaceC3596r0) obj3).mo7488g(this) != enumC5799a) {
                    }
                    return enumC5799a;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            AbstractC1089i.m2732I0(obj);
                            return c3967n;
                        }
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c2860n = (C2860n) this.f1020k;
                    AbstractC1089i.m2732I0(obj);
                    this.f1020k = null;
                    this.f1018i = 3;
                    if (c2857k.m6281a(c2860n, this) != enumC5799a) {
                        return c3967n;
                    }
                    return enumC5799a;
                }
                AbstractC1089i.m2732I0(obj);
                C2859m c2859m2 = new C2859m();
                C2860n c2860n2 = new C2860n(c2859m2);
                this.f1020k = c2860n2;
                this.f1018i = 2;
                if (c2857k.m6281a(c2859m2, this) != enumC5799a) {
                    c2860n = c2860n2;
                    this.f1020k = null;
                    this.f1018i = 3;
                    if (c2857k.m6281a(c2860n, this) != enumC5799a) {
                    }
                }
                return enumC5799a;
            case 4:
                C2637o2 c2637o2 = (C2637o2) obj3;
                int i17 = this.f1018i;
                if (i17 != 0) {
                    if (i17 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        return c3967n;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                C2629m2 c2629m2 = (C2629m2) this.f1020k;
                float fM6094g = c2637o2.m6094g(j3);
                C0145k c0145k = new C0145k((C1422r) obj2, c2637o2, c2629m2, i10);
                this.f1018i = 1;
                return AbstractC1742d.m4369e(0.0f, fM6094g, null, c0145k, this, 12) == enumC5799a ? enumC5799a : c3967n;
            default:
                C3857t c3857t = (C3857t) obj3;
                C1739c c1739c = c3857t.f12644m;
                int i18 = this.f1018i;
                try {
                    if (i18 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        InterfaceC1803y interfaceC1803y2 = (InterfaceC1803y) obj2;
                        if (((Boolean) c1739c.f5787d.getValue()).booleanValue()) {
                            interfaceC1803y2 = interfaceC1803y2 instanceof C1785r0 ? (C1785r0) interfaceC1803y2 : AbstractC3859u.f12650a;
                        }
                        interfaceC1803y = interfaceC1803y2;
                        if (((Boolean) c1739c.f5787d.getValue()).booleanValue()) {
                            long jM8529c = C4240j.m8529c(((C4240j) c1739c.m4360d()).f13912a, j3);
                            C1739c c1739c2 = c3857t.f12644m;
                            InterfaceC1803y interfaceC1803y3 = interfaceC1803y;
                            C4240j c4240j = new C4240j(jM8529c);
                            C0893s0 c0893s0 = new C0893s0(c3857t, jM8529c, i12);
                            this.f1020k = null;
                            this.f1018i = 2;
                            break;
                        } else {
                            C4240j c4240j2 = new C4240j(j3);
                            this.f1020k = interfaceC1803y;
                            this.f1018i = 1;
                            if (c1739c.m4361e(c4240j2, this) == enumC5799a) {
                            }
                        }
                        return enumC5799a;
                    }
                    if (i18 != 1) {
                        if (i18 != 2) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1089i.m2732I0(obj);
                        int i19 = C3857t.f12631r;
                        c3857t.m8031d(false);
                        c3857t.f12636e = false;
                        return c3967n;
                    }
                    interfaceC1803y = (InterfaceC1803y) this.f1020k;
                    AbstractC1089i.m2732I0(obj);
                    c3857t.f12634c.invoke();
                    long jM8529c2 = C4240j.m8529c(((C4240j) c1739c.m4360d()).f13912a, j3);
                    C1739c c1739c22 = c3857t.f12644m;
                    InterfaceC1803y interfaceC1803y32 = interfaceC1803y;
                    C4240j c4240j3 = new C4240j(jM8529c2);
                    C0893s0 c0893s02 = new C0893s0(c3857t, jM8529c2, i12);
                    this.f1020k = null;
                    this.f1018i = 2;
                } catch (CancellationException unused) {
                    return c3967n;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0364i(Object obj, long j3, Object obj2, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1017h = i9;
        this.f1021l = obj;
        this.f1019j = j3;
        this.f1022m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0364i(Object obj, Object obj2, long j3, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1017h = i9;
        this.f1021l = obj;
        this.f1022m = obj2;
        this.f1019j = j3;
    }
}
