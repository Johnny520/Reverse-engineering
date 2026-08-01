package p034G;

import android.view.textclassifier.TextClassifier;
import me.dartcv.nuke.BuildConfig;
import p000A.C0049a;
import p000A.C0095x;
import p040H.InterfaceC0547e;
import p056K2.C0891q;
import p058L.C0912N;
import p058L.C0943o;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.C1672q;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p203n.AbstractC2649d;
import p203n.AbstractC2670o;
import p203n.C2626I;
import p203n.C2633P;
import p203n.C2652e0;
import p203n.C2661j;
import p227r.C2940A0;
import p227r.C3025y0;
import p232s.C3162i;
import p232s.C3164k;
import p232s.C3165l;

/* JADX INFO: renamed from: G.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0462g extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1366h;

    /* JADX INFO: renamed from: i */
    public int f1367i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f1368j;

    /* JADX INFO: renamed from: k */
    public Object f1369k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1370l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1371m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462g(long j5, C0943o c0943o, InterfaceC1046d interfaceC1046d, CharSequence charSequence) {
        super(2, interfaceC1046d);
        this.f1366h = 1;
        this.f1370l = c0943o;
        this.f1371m = charSequence;
        this.f1368j = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1366h) {
            case 0:
                return ((C0462g) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0462g) mo7n((InterfaceC1046d) obj2, (TextClassifier) obj)).mo8p(C0891q.f2780a);
            case 2:
                return ((C0462g) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0462g) mo7n((InterfaceC1046d) obj2, (C3025y0) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f1366h) {
            case 0:
                return new C0462g((C0463h) this.f1369k, this.f1368j, (InterfaceC0547e) this.f1370l, (C0461f) this.f1371m, interfaceC1046d);
            case BuildConfig.VERSION_CODE /* 1 */:
                C0462g c0462g = new C0462g(this.f1368j, (C0943o) this.f1370l, interfaceC1046d, (CharSequence) this.f1371m);
                c0462g.f1369k = obj;
                return c0462g;
            case 2:
                return new C0462g((InterfaceC2115S) this.f1370l, this.f1368j, (C3162i) this.f1371m, interfaceC1046d, 2);
            default:
                C0462g c0462g2 = new C0462g((C2940A0) this.f1370l, this.f1368j, (C1672q) this.f1371m, interfaceC1046d, 3);
                c0462g2.f1369k = obj;
                return c0462g2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        C3165l c3165l;
        switch (this.f1366h) {
            case 0:
                int i5 = this.f1367i;
                C0891q c0891q = C0891q.f2780a;
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C0912N c0912n = ((C0463h) this.f1369k).f1372t;
                    if (c0912n != null) {
                        this.f1367i = 1;
                        if (new C0912N(c0912n.f2840j, this, 0).mo8p(c0891q) != enumC1152a) {
                        }
                    }
                    return enumC1152a;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return c0891q;
                }
                AbstractC1784a.m3205S(obj);
                InterfaceC0547e interfaceC0547e = (InterfaceC0547e) this.f1370l;
                C0461f c0461f = (C0461f) this.f1371m;
                this.f1367i = 2;
                if (interfaceC0547e.mo556a(c0461f, this) != enumC1152a) {
                    return c0891q;
                }
                return enumC1152a;
            case BuildConfig.VERSION_CODE /* 1 */:
                int i6 = this.f1367i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    TextClassifier textClassifier = (TextClassifier) this.f1369k;
                    C0943o c0943o = (C0943o) this.f1370l;
                    CharSequence charSequence = (CharSequence) this.f1371m;
                    this.f1367i = 1;
                    Object objM1947a = C0943o.m1947a(c0943o, charSequence, this.f1368j, textClassifier, this);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objM1947a == enumC1152a2) {
                        return enumC1152a2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            case 2:
                C3162i c3162i = (C3162i) this.f1371m;
                int i7 = this.f1367i;
                EnumC1152a enumC1152a3 = EnumC1152a.f3788d;
                if (i7 == 0) {
                    AbstractC1784a.m3205S(obj);
                    InterfaceC2115S interfaceC2115S = (InterfaceC2115S) this.f1370l;
                    this.f1367i = 1;
                    if (interfaceC2115S.mo3908t(this) == enumC1152a3) {
                        return enumC1152a3;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1784a.m3205S(obj);
                            return C0891q.f2780a;
                        }
                        c3165l = (C3165l) this.f1369k;
                        AbstractC1784a.m3205S(obj);
                        this.f1369k = null;
                        this.f1367i = 3;
                        if (c3162i.m5429a(c3165l, this) == enumC1152a3) {
                            return enumC1152a3;
                        }
                        return C0891q.f2780a;
                    }
                    AbstractC1784a.m3205S(obj);
                }
                C3164k c3164k = new C3164k(this.f1368j);
                C3165l c3165l2 = new C3165l(c3164k);
                this.f1369k = c3165l2;
                this.f1367i = 2;
                if (c3162i.m5429a(c3164k, this) == enumC1152a3) {
                    return enumC1152a3;
                }
                c3165l = c3165l2;
                this.f1369k = null;
                this.f1367i = 3;
                if (c3162i.m5429a(c3165l, this) == enumC1152a3) {
                }
                return C0891q.f2780a;
            default:
                C2940A0 c2940a0 = (C2940A0) this.f1370l;
                int i8 = this.f1367i;
                C0891q c0891q2 = C0891q.f2780a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return c0891q2;
                }
                AbstractC1784a.m3205S(obj);
                C3025y0 c3025y0 = (C3025y0) this.f1369k;
                float fM5147g = c2940a0.m5147g(this.f1368j);
                C0095x c0095x = new C0095x((C1672q) this.f1371m, c2940a0, c3025y0, 8);
                this.f1367i = 1;
                C2626I c2626iM4617j = AbstractC2649d.m4617j(0.0f, 0.0f, null, 7);
                C2652e0 c2652e0 = AbstractC2649d.f8446j;
                Float f2 = new Float(0.0f);
                Float f5 = new Float(fM5147g);
                Float f6 = new Float(0.0f);
                InterfaceC1601c interfaceC1601c = c2652e0.f8459a;
                AbstractC2670o abstractC2670oMo4626c = (AbstractC2670o) interfaceC1601c.mo1h(f6);
                if (abstractC2670oMo4626c == null) {
                    abstractC2670oMo4626c = ((AbstractC2670o) interfaceC1601c.mo1h(f2)).mo4626c();
                }
                AbstractC2670o abstractC2670o = abstractC2670oMo4626c;
                Object objM4609b = AbstractC2649d.m4609b(new C2661j(c2652e0, f2, abstractC2670o, 56), new C2633P(c2626iM4617j, c2652e0, f2, f5, abstractC2670o), Long.MIN_VALUE, new C0049a(21, c0095x), this);
                EnumC1152a enumC1152a4 = EnumC1152a.f3788d;
                if (objM4609b != enumC1152a4) {
                    objM4609b = c0891q2;
                }
                if (objM4609b != enumC1152a4) {
                    objM4609b = c0891q2;
                }
                return objM4609b == enumC1152a4 ? enumC1152a4 : c0891q2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462g(C0463h c0463h, long j5, InterfaceC0547e interfaceC0547e, C0461f c0461f, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f1366h = 0;
        this.f1369k = c0463h;
        this.f1368j = j5;
        this.f1370l = interfaceC0547e;
        this.f1371m = c0461f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0462g(Object obj, long j5, Object obj2, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f1366h = i5;
        this.f1370l = obj;
        this.f1368j = j5;
        this.f1371m = obj2;
    }
}
