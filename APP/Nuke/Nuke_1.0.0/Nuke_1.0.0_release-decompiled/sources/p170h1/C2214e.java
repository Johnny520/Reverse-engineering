package p170h1;

import android.graphics.Canvas;
import com.bumptech.glide.AbstractC1925g;
import com.bumptech.glide.AbstractC1926h;
import me.dartcv.nuke.BuildConfig;
import p008B1.C0216d;
import p027E4.C0330q;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.EnumC0556D0;
import p041H0.InterfaceC0558E0;
import p041H0.InterfaceC0614q0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.C0891q;
import p095T.InterfaceC1339T0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p117X2.C1675t;
import p121Y1.C1753n;
import p158f0.C2085q;
import p187k0.C2449e;
import p187k0.ViewOnDragListenerC2446b;
import p197m.C2528M;
import p197m.C2529N;
import p197m.C2535U;
import p197m.C2559s;
import p197m.EnumC2517B;
import p198m0.C2567A;
import p198m0.C2584o;
import p211o0.AbstractC2744c;
import p211o0.C2735J;
import p211o0.C2741P;
import p211o0.InterfaceC2760s;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: h1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2214e extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7214e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f7215f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f7216g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f7217h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2214e(C2233x c2233x, C0564I c0564i, C2233x c2233x2) {
        super(1);
        this.f7214e = 0;
        this.f7215f = c2233x;
        this.f7217h = c0564i;
        this.f7216g = c2233x2;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [W2.c, X2.k] */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        boolean zBooleanValue;
        switch (this.f7214e) {
            case 0:
                C2233x c2233x = (C2233x) this.f7215f;
                C0564I c0564i = (C0564I) this.f7217h;
                C2233x c2233x2 = (C2233x) this.f7216g;
                InterfaceC2760s interfaceC2760sM106j = ((InterfaceC2903d) obj).mo854L().m106j();
                if (c2233x.getView().getVisibility() != 8) {
                    c2233x.f7229B = true;
                    InterfaceC0614q0 interfaceC0614q0 = c0564i.f1725r;
                    ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = interfaceC0614q0 instanceof ViewTreeObserverOnGlobalLayoutListenerC0772y ? (ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0 : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC0772y != null) {
                        Canvas canvasM4858a = AbstractC2744c.m4858a(interfaceC2760sM106j);
                        viewTreeObserverOnGlobalLayoutListenerC0772y.getAndroidViewsHandler$ui().getClass();
                        c2233x2.draw(canvasM4858a);
                    }
                    c2233x.f7229B = false;
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC0558E0 interfaceC0558E0 = (InterfaceC0558E0) obj;
                C2449e c2449e = (C2449e) interfaceC0558E0;
                if (!((ViewOnDragListenerC2446b) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u((C2449e) this.f7216g)).m5899getDragAndDropManager()).f7906b.contains(c2449e) || !AbstractC1925g.m3525b(c2449e, AbstractC1926h.m3575r((C1753n) this.f7217h))) {
                    return EnumC0556D0.f1668d;
                }
                ((C1675t) this.f7215f).f5710e = interfaceC0558E0;
                return EnumC0556D0.f1670f;
            case 2:
                return new C0216d((C2085q) this.f7215f, this.f7216g, (C2559s) this.f7217h, 2);
            case 3:
                C2735J c2735j = (C2735J) obj;
                InterfaceC1339T0 interfaceC1339T0 = (InterfaceC1339T0) this.f7216g;
                InterfaceC1339T0 interfaceC1339T02 = (InterfaceC1339T0) this.f7215f;
                c2735j.m4792d(interfaceC1339T02 != null ? ((Number) interfaceC1339T02.getValue()).floatValue() : 1.0f);
                c2735j.m4800s(interfaceC1339T0 != null ? ((Number) interfaceC1339T0.getValue()).floatValue() : 1.0f);
                c2735j.m4801v(interfaceC1339T0 != null ? ((Number) interfaceC1339T0.getValue()).floatValue() : 1.0f);
                InterfaceC1339T0 interfaceC1339T03 = (InterfaceC1339T0) this.f7217h;
                c2735j.m4789B(interfaceC1339T03 != null ? ((C2741P) interfaceC1339T03.getValue()).f8722a : C2741P.f8720b);
                return C0891q.f2780a;
            case 4:
                C2528M c2528m = (C2528M) this.f7216g;
                C2529N c2529n = (C2529N) this.f7217h;
                int iOrdinal = ((EnumC2517B) obj).ordinal();
                C2741P c2741p = null;
                if (iOrdinal == 0) {
                    C2535U c2535u = c2528m.f8089a.f8109c;
                    if (c2535u != null) {
                        c2741p = new C2741P(c2535u.f8101b);
                    } else {
                        C2535U c2535u2 = c2529n.f8092a.f8109c;
                        if (c2535u2 != null) {
                            c2741p = new C2741P(c2535u2.f8101b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    c2741p = (C2741P) this.f7215f;
                } else {
                    if (iOrdinal != 2) {
                        throw new C0330q();
                    }
                    C2535U c2535u3 = c2529n.f8092a.f8109c;
                    if (c2535u3 != null) {
                        c2741p = new C2741P(c2535u3.f8101b);
                    } else {
                        C2535U c2535u4 = c2528m.f8089a.f8109c;
                        if (c2535u4 != null) {
                            c2741p = new C2741P(c2535u4.f8101b);
                        }
                    }
                }
                return new C2741P(c2741p != null ? c2741p.f8722a : C2741P.f8720b);
            default:
                C2567A c2567a = (C2567A) obj;
                if (AbstractC1665j.m2981a(c2567a, (C2567A) this.f7215f)) {
                    zBooleanValue = false;
                } else {
                    if (AbstractC1665j.m2981a(c2567a, ((C2584o) this.f7216g).f8224c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((AbstractC1666k) this.f7217h).mo1h(c2567a)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2214e(Object obj, Object obj2, Object obj3, int i5) {
        super(1);
        this.f7214e = i5;
        this.f7215f = obj;
        this.f7216g = obj2;
        this.f7217h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2214e(C2567A c2567a, C2584o c2584o, InterfaceC1601c interfaceC1601c) {
        super(1);
        this.f7214e = 5;
        this.f7215f = c2567a;
        this.f7216g = c2584o;
        this.f7217h = (AbstractC1666k) interfaceC1601c;
    }
}
