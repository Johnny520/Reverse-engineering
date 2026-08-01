package p170h1;

import android.view.WindowInsets;
import java.util.HashMap;
import me.dartcv.nuke.BuildConfig;
import p029F0.InterfaceC0430v;
import p041H0.C0564I;
import p041H0.InterfaceC0614q0;
import p047I0.C0754p;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p153e1.C2016l;
import p229r1.AbstractC3092v;
import p229r1.C3070c0;

/* JADX INFO: renamed from: h1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2212c extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7209e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2233x f7210f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0564I f7211g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2212c(C2233x c2233x, C0564I c0564i, int i5) {
        super(1);
        this.f7209e = i5;
        this.f7210f = c2233x;
        this.f7211g = c0564i;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        WindowInsets windowInsetsM5394b;
        switch (this.f7209e) {
            case 0:
                InterfaceC0614q0 interfaceC0614q0 = (InterfaceC0614q0) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = interfaceC0614q0 instanceof ViewTreeObserverOnGlobalLayoutListenerC0772y ? (ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0 : null;
                C2233x c2233x = this.f7210f;
                if (viewTreeObserverOnGlobalLayoutListenerC0772y != null) {
                    HashMap<AbstractC2218i, C0564I> holderToLayoutNode = viewTreeObserverOnGlobalLayoutListenerC0772y.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    C0564I c0564i = this.f7211g;
                    holderToLayoutNode.put(c2233x, c0564i);
                    viewTreeObserverOnGlobalLayoutListenerC0772y.getAndroidViewsHandler$ui().addView(c2233x);
                    viewTreeObserverOnGlobalLayoutListenerC0772y.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(c0564i, c2233x);
                    c2233x.setImportantForAccessibility(1);
                    AbstractC3092v.m5408b(c2233x, new C0754p(viewTreeObserverOnGlobalLayoutListenerC0772y, c0564i, viewTreeObserverOnGlobalLayoutListenerC0772y));
                }
                if (c2233x.getView().getParent() != c2233x) {
                    c2233x.addView(c2233x.getView());
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC2219j.m4032d(this.f7210f, this.f7211g);
                break;
            default:
                C0564I c0564i2 = this.f7211g;
                C2233x c2233x2 = this.f7210f;
                AbstractC2219j.m4032d(c2233x2, c0564i2);
                ((ViewTreeObserverOnGlobalLayoutListenerC0772y) c2233x2.f7233f).f2444J = true;
                int[] iArr = c2233x2.f7244q;
                int i5 = iArr[0];
                int i6 = iArr[1];
                c2233x2.getView().getLocationOnScreen(iArr);
                long j5 = c2233x2.f7245r;
                long jMo637Q = ((InterfaceC0430v) obj).mo637Q();
                c2233x2.f7245r = jMo637Q;
                C3070c0 c3070c0 = c2233x2.f7246s;
                if (c3070c0 != null && ((i5 != iArr[0] || i6 != iArr[1] || !C2016l.m3704a(j5, jMo637Q)) && (windowInsetsM5394b = c2233x2.m4028g(c3070c0).m5394b()) != null)) {
                    c2233x2.getView().dispatchApplyWindowInsets(windowInsetsM5394b);
                }
                break;
        }
        return C0891q.f2780a;
    }
}
