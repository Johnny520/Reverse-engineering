package ci;

import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import android.widget.Toast;
import androidx.lifecycle.InterfaceC0112q;
import gg.AbstractC1416l;
import gg.AbstractC1417m;
import gg.C1422r;
import gg.C1425u;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import okio.C3193a;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p014b.C0125d;
import p036c9.C0454k;
import p058e2.ScrollCaptureCallbackC0813c;
import p070f0.C0970b;
import p070f0.C0971c;
import p070f0.C0984p;
import p071f1.AbstractC0996c0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.C1492w;
import p100h0.C1538n;
import p100h0.C1542p;
import p116i.AbstractC1748f;
import p116i.C1739c;
import p116i.C1746e0;
import p116i.C1749f0;
import p116i.C1752g0;
import p116i.C1785r0;
import p116i.InterfaceC1763k;
import p117i0.AbstractC1874r;
import p117i0.C1888v1;
import p117i0.C1894x1;
import p117i0.C1897y1;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p174m.C2571a;
import p174m.C2580b3;
import p174m.C2590d3;
import p174m.C2637o2;
import p218og.C3147k;
import p227p4.C3315t;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p251r.C3620e;
import p251r.C3641z;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p293u2.C4241k;
import p332wb.AbstractC4955ho;
import p345x8.C5707a;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p356y0.C5855q;
import p357y1.C5899k0;
import p357y1.C5928r1;
import p357y1.C5960z1;
import p370yf.AbstractC6044i;
import p371yg.C6046b;
import sg.C3971c;
import sg.EnumC3969a;
import tg.AbstractC4191i;
import tg.AbstractC4201s;
import tg.C4183b0;
import tg.C4190h;
import tg.C4195m;
import tg.C4204v;
import tg.C4206x;
import tg.C4207y;
import tg.EnumC4203u;
import tg.InterfaceC4186d;
import ug.C4342g;
import ug.C4345j;
import ug.C4351p;
import wf.C5562h;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: ci.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0579e extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1787h;

    /* JADX INFO: renamed from: i */
    public int f1788i;

    /* JADX INFO: renamed from: j */
    public Object f1789j;

    /* JADX INFO: renamed from: k */
    public Object f1790k;

    /* JADX INFO: renamed from: l */
    public Object f1791l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1792m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: fg.l */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0579e(InterfaceC1231l interfaceC1231l, AtomicReference atomicReference, InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1787h = 12;
        this.f1790k = (AbstractC1417m) interfaceC1231l;
        this.f1791l = atomicReference;
        this.f1792m = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [fg.p, yf.i] */
    /* JADX WARN: Type inference failed for: r0v8, types: [fg.l, gg.m] */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1787h) {
            case 0:
                C0579e c0579e = new C0579e((InterfaceC3918x) this.f1790k, (C0594l0) this.f1791l, (C0581f) this.f1792m, interfaceC5557c, 0);
                c0579e.f1789j = obj;
                return c0579e;
            case 1:
                return new C0579e((ScrollCaptureCallbackC0813c) this.f1789j, (ScrollCaptureSession) this.f1790k, (Rect) this.f1791l, (Consumer) this.f1792m, interfaceC5557c, 1);
            case 2:
                C0579e c0579e2 = new C0579e((InterfaceC1231l) this.f1790k, (C0971c) this.f1791l, (C0984p) this.f1792m, interfaceC5557c, 2);
                c0579e2.f1789j = obj;
                return c0579e2;
            case 3:
                return new C0579e((C1542p) this.f1791l, (InterfaceC1235p) this.f1792m, interfaceC5557c);
            case 4:
                return new C0579e(this.f1789j, (C1739c) this.f1790k, (InterfaceC1809a1) this.f1791l, (InterfaceC1809a1) this.f1792m, interfaceC5557c, 4);
            case 5:
                C0579e c0579e3 = new C0579e((InterfaceC1809a1) this.f1791l, (C1752g0) this.f1792m, interfaceC5557c);
                c0579e3.f1789j = obj;
                return c0579e3;
            case 6:
                C0579e c0579e4 = new C0579e((C2590d3) this.f1792m, interfaceC5557c);
                c0579e4.f1789j = obj;
                return c0579e4;
            case 7:
                C0579e c0579e5 = new C0579e((InterfaceC4186d) this.f1790k, (C4183b0) this.f1791l, (Float) this.f1792m, interfaceC5557c, 7);
                c0579e5.f1789j = obj;
                return c0579e5;
            case 8:
                return new C0579e((C4207y) this.f1789j, (InterfaceC4186d) this.f1790k, (C4183b0) this.f1791l, (Float) this.f1792m, interfaceC5557c, 8);
            case 9:
                return new C0579e((Context) this.f1790k, (C5707a) this.f1791l, (InterfaceC1809a1) this.f1792m, interfaceC5557c, 9);
            case 10:
                return new C0579e((List) this.f1789j, (C3641z) this.f1790k, (List) this.f1791l, (InterfaceC1809a1) this.f1792m, interfaceC5557c, 10);
            case 11:
                return new C0579e((C3641z) this.f1789j, (List) this.f1790k, (InterfaceC1809a1) this.f1791l, (InterfaceC1809a1) this.f1792m, interfaceC5557c, 11);
            case 12:
                C0579e c0579e6 = new C0579e((AbstractC1417m) this.f1790k, (AtomicReference) this.f1791l, (InterfaceC1235p) this.f1792m, interfaceC5557c);
                c0579e6.f1789j = obj;
                return c0579e6;
            default:
                return new C0579e((C1425u) this.f1789j, (C1897y1) this.f1790k, (InterfaceC0112q) this.f1791l, (C0125d) this.f1792m, interfaceC5557c, 13);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f1787h) {
            case 2:
                ((C0579e) create((C5899k0) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
                break;
            case 5:
                ((C0579e) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
                break;
        }
        return ((C0579e) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:198:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Type inference failed for: r6v26, types: [fg.l, gg.m] */
    /* JADX WARN: Type inference failed for: r8v2, types: [fg.p, yf.i] */
    /* JADX WARN: Type inference failed for: r9v2, types: [fg.q, yf.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x038b -> B:189:0x0358). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:218:0x0404 -> B:212:0x03cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x041e -> B:212:0x03cf). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM2058a;
        C1542p c1542p;
        C6046b c6046b;
        C6046b c6046b2;
        TextClassifier textClassifier;
        Object objM7571y;
        Object objM7571y2;
        InterfaceC3599t interfaceC3599t;
        C1422r c1422r;
        InterfaceC3599t interfaceC3599t2;
        C2590d3 c2590d3;
        Object objMo8198f;
        InterfaceC3599t interfaceC3599t3;
        C2637o2 c2637o2;
        EnumC3969a enumC3969a;
        Object objM7570x;
        InterfaceC1809a1 interfaceC1809a1;
        C5855q c5855q;
        Object objInvoke;
        C5855q c5855q2;
        int i9 = this.f1787h;
        int i10 = 0;
        C5855q c5855q3 = null;
        i10 = 0;
        i10 = 0;
        int i11 = 2;
        Object obj2 = C3967n.f12976a;
        Object obj3 = EnumC5799a.f23547g;
        Object obj4 = this.f1792m;
        int i12 = 1;
        C3560e1 c3560e1 = null;
        switch (i9) {
            case 0:
                InterfaceC3918x interfaceC3918x = (InterfaceC3918x) this.f1790k;
                InterfaceC3599t interfaceC3599t4 = (InterfaceC3599t) this.f1789j;
                int i13 = this.f1788i;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        return obj2;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                C0577d c0577d = new C0577d(interfaceC3599t4, (C0594l0) this.f1791l, new C0586h0(interfaceC3918x), (C0581f) obj4, (InterfaceC5557c) null, 0);
                this.f1789j = null;
                this.f1788i = 1;
                return AbstractC0000a.m78n(interfaceC3918x, c0577d, this) == obj3 ? obj3 : obj2;
            case 1:
                int i14 = this.f1788i;
                if (i14 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    ScrollCaptureCallbackC0813c scrollCaptureCallbackC0813c = (ScrollCaptureCallbackC0813c) this.f1789j;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.f1790k;
                    Rect rect = (Rect) this.f1791l;
                    C4241k c4241k = new C4241k(rect.left, rect.top, rect.right, rect.bottom);
                    this.f1788i = 1;
                    objM2058a = ScrollCaptureCallbackC0813c.m2058a(scrollCaptureCallbackC0813c, scrollCaptureSession, c4241k, this);
                    if (objM2058a == obj3) {
                        return obj3;
                    }
                } else {
                    if (i14 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM2058a = obj;
                }
                ((Consumer) obj4).accept(AbstractC0996c0.m2523t((C4241k) objM2058a));
                return obj2;
            case 2:
                int i15 = this.f1788i;
                if (i15 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C0970b c0970b = new C0970b((C5899k0) this.f1789j, (InterfaceC1231l) this.f1790k, (C0971c) this.f1791l, (C0984p) obj4, null, 0);
                    this.f1788i = 1;
                    if (AbstractC3603v.m7551e(c0970b, this) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i15 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                C3193a.m6814c();
                return null;
            case 3:
                int i16 = this.f1788i;
                try {
                    if (i16 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        c1542p = (C1542p) this.f1791l;
                        c6046b = c1542p.f5146e;
                        this.f1789j = c6046b;
                        this.f1790k = c1542p;
                        this.f1788i = 1;
                        if (c6046b.m10806d(this) != obj3) {
                        }
                        return obj3;
                    }
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 == 3) {
                                AbstractC1089i.m2732I0(obj);
                                return obj;
                            }
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c6046b2 = (C6046b) this.f1789j;
                        try {
                            AbstractC1089i.m2732I0(obj);
                            objM7571y = obj;
                            textClassifier = (TextClassifier) objM7571y;
                            c6046b = c6046b2;
                            c6046b.m10808f(null);
                            C0589j c0589j = new C0589j(textClassifier, (InterfaceC1235p) obj4, (InterfaceC5557c) null);
                            this.f1789j = null;
                            this.f1790k = null;
                            this.f1788i = 3;
                            objM7571y2 = AbstractC3603v.m7571y(200L, c0589j, this);
                            if (objM7571y2 != obj3) {
                                return objM7571y2;
                            }
                            return obj3;
                        } catch (Throwable th2) {
                            th = th2;
                            c6046b2.m10808f(null);
                            throw th;
                        }
                    }
                    c1542p = (C1542p) this.f1790k;
                    c6046b = (C6046b) this.f1789j;
                    AbstractC1089i.m2732I0(obj);
                    textClassifier = c1542p.f5147f;
                    if (textClassifier == null || textClassifier.isDestroyed()) {
                        C1538n c1538n = new C1538n(c1542p, c3560e1, i10);
                        this.f1789j = c6046b;
                        this.f1790k = null;
                        this.f1788i = 2;
                        objM7571y = AbstractC3603v.m7571y(300L, c1538n, this);
                        if (objM7571y != obj3) {
                            c6046b2 = c6046b;
                            textClassifier = (TextClassifier) objM7571y;
                            c6046b = c6046b2;
                            c6046b.m10808f(null);
                            C0589j c0589j2 = new C0589j(textClassifier, (InterfaceC1235p) obj4, (InterfaceC5557c) null);
                            this.f1789j = null;
                            this.f1790k = null;
                            this.f1788i = 3;
                            objM7571y2 = AbstractC3603v.m7571y(200L, c0589j2, this);
                            if (objM7571y2 != obj3) {
                            }
                        }
                    } else {
                        c6046b.m10808f(null);
                        C0589j c0589j22 = new C0589j(textClassifier, (InterfaceC1235p) obj4, (InterfaceC5557c) null);
                        this.f1789j = null;
                        this.f1790k = null;
                        this.f1788i = 3;
                        objM7571y2 = AbstractC3603v.m7571y(200L, c0589j22, this);
                        if (objM7571y2 != obj3) {
                        }
                    }
                    return obj3;
                } catch (Throwable th3) {
                    th = th3;
                    c6046b2 = c6046b;
                    c6046b2.m10808f(null);
                    throw th;
                }
            case 4:
                C1739c c1739c = (C1739c) this.f1790k;
                int i17 = this.f1788i;
                if (i17 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    if (AbstractC1416l.m3825a(this.f1789j, c1739c.f5788e.getValue())) {
                        return obj2;
                    }
                    C1739c c1739c2 = (C1739c) this.f1790k;
                    Object obj5 = this.f1789j;
                    InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1791l;
                    C1785r0 c1785r0 = AbstractC1748f.f5840a;
                    InterfaceC1763k interfaceC1763k = (InterfaceC1763k) interfaceC1809a12.getValue();
                    this.f1788i = 1;
                    if (C1739c.m4359c(c1739c2, obj5, interfaceC1763k, null, this, 12) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i17 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                C1785r0 c1785r02 = AbstractC1748f.f5840a;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) ((InterfaceC1809a1) obj4).getValue();
                if (interfaceC1231l == null) {
                    return obj2;
                }
                interfaceC1231l.invoke(c1739c.m4360d());
                return obj2;
            case 5:
                int i18 = this.f1788i;
                if (i18 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3599t interfaceC3599t5 = (InterfaceC3599t) this.f1789j;
                    C1422r c1422r2 = new C1422r();
                    c1422r2.f4735g = 1.0f;
                    interfaceC3599t = interfaceC3599t5;
                    c1422r = c1422r2;
                } else if (i18 == 1) {
                    C1422r c1422r3 = (C1422r) this.f1790k;
                    InterfaceC3599t interfaceC3599t6 = (InterfaceC3599t) this.f1789j;
                    AbstractC1089i.m2732I0(obj);
                    c1422r = c1422r3;
                    interfaceC3599t = interfaceC3599t6;
                    if (c1422r.f4735g == 0.0f) {
                        C2571a c2571aM4616B = AbstractC1874r.m4616B(new C1746e0(interfaceC3599t, i10));
                        C1749f0 c1749f0 = new C1749f0(2, null);
                        this.f1789j = interfaceC3599t;
                        this.f1790k = c1422r;
                        this.f1788i = 2;
                        if (AbstractC4201s.m8468f(c2571aM4616B, c1749f0, this) == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i18 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    C1422r c1422r4 = (C1422r) this.f1790k;
                    InterfaceC3599t interfaceC3599t7 = (InterfaceC3599t) this.f1789j;
                    AbstractC1089i.m2732I0(obj);
                    c1422r = c1422r4;
                    interfaceC3599t = interfaceC3599t7;
                }
                C0454k c0454k = new C0454k((InterfaceC1809a1) this.f1791l, (C1752g0) obj4, c1422r, interfaceC3599t, 6);
                this.f1789j = interfaceC3599t;
                this.f1790k = c1422r;
                this.f1788i = 1;
                if (getContext().mo2062s(C5928r1.f24041g) != null) {
                    C0086a.m445d();
                    return null;
                }
                if (AbstractC1874r.m4637s(getContext()).m4458d(c0454k, this) == obj3) {
                    return obj3;
                }
                if (c1422r.f4735g == 0.0f) {
                }
                C0454k c0454k2 = new C0454k((InterfaceC1809a1) this.f1791l, (C1752g0) obj4, c1422r, interfaceC3599t, 6);
                this.f1789j = interfaceC3599t;
                this.f1790k = c1422r;
                this.f1788i = 1;
                if (getContext().mo2062s(C5928r1.f24041g) != null) {
                }
                break;
            case 6:
                C2590d3 c2590d32 = (C2590d3) obj4;
                int i19 = this.f1788i;
                try {
                    if (i19 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        interfaceC3599t2 = (InterfaceC3599t) this.f1789j;
                    } else {
                        if (i19 == 1) {
                            c2637o2 = (C2637o2) this.f1791l;
                            C2590d3 c2590d33 = (C2590d3) this.f1790k;
                            InterfaceC3599t interfaceC3599t8 = (InterfaceC3599t) this.f1789j;
                            AbstractC1089i.m2732I0(obj);
                            c2590d3 = c2590d33;
                            interfaceC3599t3 = interfaceC3599t8;
                            objMo8198f = obj;
                            this.f1789j = interfaceC3599t3;
                            this.f1790k = null;
                            this.f1791l = null;
                            this.f1788i = 2;
                            if (C2590d3.m6053c(c2590d3, c2637o2, (C2580b3) objMo8198f, this) != obj3) {
                                interfaceC3599t2 = interfaceC3599t3;
                            }
                            return obj3;
                        }
                        if (i19 != 2) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        interfaceC3599t2 = (InterfaceC3599t) this.f1789j;
                        AbstractC1089i.m2732I0(obj);
                    }
                    if (!AbstractC3603v.m7562p(interfaceC3599t2.mo4457n())) {
                        return obj2;
                    }
                    C2637o2 c2637o22 = c2590d32.f8583a;
                    C3971c c3971c = c2590d32.f8389f;
                    this.f1789j = interfaceC3599t2;
                    this.f1790k = c2590d32;
                    this.f1791l = c2637o22;
                    this.f1788i = 1;
                    objMo8198f = c3971c.mo8198f(this);
                    if (objMo8198f == obj3) {
                        return obj3;
                    }
                    interfaceC3599t3 = interfaceC3599t2;
                    c2637o2 = c2637o22;
                    c2590d3 = c2590d32;
                    this.f1789j = interfaceC3599t3;
                    this.f1790k = null;
                    this.f1791l = null;
                    this.f1788i = 2;
                    if (C2590d3.m6053c(c2590d3, c2637o2, (C2580b3) objMo8198f, this) != obj3) {
                    }
                    return obj3;
                } finally {
                    c2590d32.f8390g = null;
                }
            case 7:
                C4183b0 c4183b0 = (C4183b0) this.f1791l;
                int i20 = this.f1788i;
                if (i20 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    int iOrdinal = ((EnumC4203u) this.f1789j).ordinal();
                    if (iOrdinal == 0) {
                        InterfaceC4186d interfaceC4186d = (InterfaceC4186d) this.f1790k;
                        this.f1788i = 1;
                        return interfaceC4186d.mo6025b(c4183b0, this) == obj3 ? obj3 : obj2;
                    }
                    if (iOrdinal == 1) {
                        return obj2;
                    }
                    if (iOrdinal == 2) {
                        Float f3 = (Float) obj4;
                        if (f3 != AbstractC4201s.f13788a) {
                            c4183b0.m8446h(null, f3);
                            return obj2;
                        }
                        c4183b0.getClass();
                        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                    }
                    C3193a.m6822k();
                } else {
                    if (i20 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        return obj2;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 8:
                InterfaceC4186d interfaceC4186d2 = (InterfaceC4186d) this.f1790k;
                C4183b0 c4183b02 = (C4183b0) this.f1791l;
                int i21 = this.f1788i;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            AbstractC1089i.m2732I0(obj);
                        } else if (i21 != 3 && i21 != 4) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    AbstractC1089i.m2732I0(obj);
                    return obj2;
                }
                AbstractC1089i.m2732I0(obj);
                C4207y c4207y = (C4207y) this.f1789j;
                if (c4207y == C4204v.f13797a) {
                    this.f1788i = 1;
                    if (interfaceC4186d2.mo6025b(c4183b02, this) != obj3) {
                        return obj2;
                    }
                } else {
                    InterfaceC5557c interfaceC5557c = null;
                    if (c4207y == C4204v.f13798b) {
                        C4351p c4351pM8792g = c4183b02.m8792g();
                        C4195m c4195m = new C4195m(2, null);
                        this.f1788i = 2;
                        if (AbstractC4201s.m8468f(c4351pM8792g, c4195m, this) != obj3) {
                        }
                    } else {
                        C4351p c4351pM8792g2 = c4183b02.m8792g();
                        C4206x c4206x = new C4206x(c4207y, null);
                        int i22 = AbstractC4191i.f13752a;
                        C5562h c5562h = C5562h.f22661g;
                        EnumC3969a enumC3969a2 = EnumC3969a.f12979g;
                        InterfaceC4186d interfaceC4186dM8466d = AbstractC4201s.m8466d(AbstractC4201s.m8466d(new C3315t(new C4342g(c4206x, c4351pM8792g2, c5562h, -2, enumC3969a2), 8, new C1888v1(i11, interfaceC5557c, i12))));
                        C0579e c0579e = new C0579e(interfaceC4186d2, c4183b02, (Float) obj4, interfaceC5557c, 7);
                        this.f1788i = 4;
                        C4342g c4342g = new C4342g(new C4190h(c0579e, null), interfaceC4186dM8466d, c5562h, -2, enumC3969a2);
                        InterfaceC5561g interfaceC5561g = c4342g.f14511g;
                        c5562h.mo2059e(interfaceC5561g);
                        EnumC3969a enumC3969a3 = EnumC3969a.f12979g;
                        EnumC3969a enumC3969a4 = c4342g.f14513i;
                        int i23 = c4342g.f14512h;
                        if (enumC3969a2 != enumC3969a3) {
                            enumC3969a = enumC3969a2;
                        } else {
                            if (i23 != -3 && i23 != -2 && (i10 = i23 + 0) < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                            enumC3969a = enumC3969a4;
                        }
                        int i24 = i10;
                        if (!AbstractC1416l.m3825a(interfaceC5561g, interfaceC5561g) || i24 != i23 || enumC3969a != enumC3969a4) {
                            c4342g = new C4342g(c4342g.f14515k, c4342g.f14514j, interfaceC5561g, i24, enumC3969a);
                        }
                        Object objMo6025b = c4342g.mo6025b(C4345j.f14519g, this);
                        if (objMo6025b != obj3) {
                            objMo6025b = obj2;
                        }
                        if (objMo6025b != obj3) {
                            objMo6025b = obj2;
                        }
                        if (objMo6025b != obj3) {
                            return obj2;
                        }
                    }
                }
                return obj3;
                this.f1788i = 3;
                if (interfaceC4186d2.mo6025b(c4183b02, this) != obj3) {
                    return obj2;
                }
                return obj3;
            case 9:
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) obj4;
                int i25 = this.f1788i;
                if (i25 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5808e c5808e = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
                    C1538n c1538n2 = new C1538n((C5707a) this.f1791l, c3560e1, i12);
                    this.f1789j = interfaceC1809a13;
                    this.f1788i = 1;
                    objM7570x = AbstractC3603v.m7570x(executorC5807d, c1538n2, this);
                    if (objM7570x == obj3) {
                        return obj3;
                    }
                    interfaceC1809a1 = interfaceC1809a13;
                } else {
                    if (i25 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1789j;
                    AbstractC1089i.m2732I0(obj);
                    interfaceC1809a1 = interfaceC1809a14;
                    objM7570x = obj;
                }
                C3147k c3147k = AbstractC4955ho.f17686a;
                interfaceC1809a1.setValue((String) objM7570x);
                Toast.makeText((Context) this.f1790k, (String) interfaceC1809a13.getValue(), 0).show();
                return obj2;
            case 10:
                int i26 = this.f1788i;
                if (i26 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    if (((List) this.f1789j).isEmpty() || !((Boolean) ((InterfaceC1809a1) obj4).getValue()).booleanValue()) {
                        return obj2;
                    }
                    this.f1788i = 1;
                    if (AbstractC3603v.m7552f(40L, this) != obj3) {
                    }
                    return obj3;
                }
                if (i26 != 1) {
                    if (i26 == 2) {
                        AbstractC1089i.m2732I0(obj);
                        return obj2;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                C3641z c3641z = (C3641z) this.f1790k;
                int size = ((List) this.f1791l).size();
                this.f1788i = 2;
                if (C3641z.m7618m(c3641z, size, this) != obj3) {
                    return obj2;
                }
                return obj3;
            case 11:
                int i27 = this.f1788i;
                if (i27 != 0) {
                    if (i27 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        return obj2;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                C2571a c2571aM4616B2 = AbstractC1874r.m4616B(new C3620e((C3641z) this.f1789j, i12));
                C1492w c1492w = new C1492w((List) this.f1790k, (InterfaceC1809a1) this.f1791l, (InterfaceC1809a1) obj4);
                this.f1788i = 1;
                return c2571aM4616B2.mo6025b(c1492w, this) == obj3 ? obj3 : obj2;
            case 12:
                AtomicReference atomicReference = (AtomicReference) this.f1791l;
                int i28 = this.f1788i;
                try {
                    if (i28 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        InterfaceC3599t interfaceC3599t9 = (InterfaceC3599t) this.f1789j;
                        c5855q3 = new C5855q(AbstractC3603v.m7557k(interfaceC3599t9.mo4457n()), ((AbstractC1417m) this.f1790k).invoke(interfaceC3599t9));
                        C5855q c5855q4 = (C5855q) atomicReference.getAndSet(c5855q3);
                        if (c5855q4 != null) {
                            InterfaceC3596r0 interfaceC3596r0 = c5855q4.f23802a;
                            this.f1789j = c5855q3;
                            this.f1788i = 1;
                            if (AbstractC3603v.m7550d(interfaceC3596r0, this) == obj3) {
                                return obj3;
                            }
                            c5855q = c5855q3;
                        }
                        Object obj6 = c5855q3.f23803b;
                        this.f1789j = c5855q3;
                        this.f1788i = 2;
                        objInvoke = ((InterfaceC1235p) obj4).invoke(obj6, this);
                        if (objInvoke == obj3) {
                            return obj3;
                        }
                        c5855q2 = c5855q3;
                        while (!atomicReference.compareAndSet(c5855q2, null)) {
                        }
                        return objInvoke;
                    }
                    if (i28 != 1) {
                        if (i28 != 2) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c5855q3 = (C5855q) this.f1789j;
                        AbstractC1089i.m2732I0(obj);
                        objInvoke = obj;
                        c5855q2 = c5855q3;
                        while (!atomicReference.compareAndSet(c5855q2, null) && atomicReference.get() == c5855q2) {
                        }
                        return objInvoke;
                    }
                    c5855q = (C5855q) this.f1789j;
                    AbstractC1089i.m2732I0(obj);
                    c5855q3 = c5855q;
                    Object obj62 = c5855q3.f23803b;
                    this.f1789j = c5855q3;
                    this.f1788i = 2;
                    objInvoke = ((InterfaceC1235p) obj4).invoke(obj62, this);
                    if (objInvoke == obj3) {
                    }
                    c5855q2 = c5855q3;
                    while (!atomicReference.compareAndSet(c5855q2, null)) {
                    }
                    return objInvoke;
                } catch (Throwable th4) {
                    while (!atomicReference.compareAndSet(c5855q3, null) && atomicReference.get() == c5855q3) {
                    }
                    throw th4;
                }
            default:
                C0125d c0125d = (C0125d) obj4;
                InterfaceC0112q interfaceC0112q = (InterfaceC0112q) this.f1791l;
                C1897y1 c1897y1 = (C1897y1) this.f1790k;
                int i29 = this.f1788i;
                try {
                    if (i29 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        C5960z1 c5960z1 = (C5960z1) ((C1425u) this.f1789j).f4738g;
                        if (c5960z1 != null) {
                            c5960z1.f24233h = AbstractC3603v.m7547a(c1897y1.f6326x);
                        }
                        this.f1788i = 1;
                        Object objM7570x2 = AbstractC3603v.m7570x(c1897y1.f6303a, new C0970b(c1897y1, new C1894x1(c1897y1, null), AbstractC1874r.m4637s(getContext()), null, 1), this);
                        if (objM7570x2 != obj3) {
                            objM7570x2 = obj2;
                        }
                        if (objM7570x2 != obj3) {
                            objM7570x2 = obj2;
                        }
                        if (objM7570x2 == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i29 != 1) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1089i.m2732I0(obj);
                    }
                    return obj2;
                } finally {
                    interfaceC0112q.mo550f().m557f(c0125d);
                }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: fg.p */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0579e(C1542p c1542p, InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1787h = 3;
        this.f1791l = c1542p;
        this.f1792m = (AbstractC6044i) interfaceC1235p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579e(InterfaceC1809a1 interfaceC1809a1, C1752g0 c1752g0, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1787h = 5;
        this.f1791l = interfaceC1809a1;
        this.f1792m = c1752g0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0579e(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1787h = i9;
        this.f1789j = obj;
        this.f1790k = obj2;
        this.f1791l = obj3;
        this.f1792m = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0579e(Object obj, Object obj2, Object obj3, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1787h = i9;
        this.f1790k = obj;
        this.f1791l = obj2;
        this.f1792m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579e(C2590d3 c2590d3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1787h = 6;
        this.f1792m = c2590d3;
    }
}
