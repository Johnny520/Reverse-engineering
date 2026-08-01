package p000;

import android.content.res.Resources;

/* JADX INFO: renamed from: n3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0497n3 extends C0299hx implements InterfaceC0941xw {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0941xw
    /* JADX INFO: renamed from: a */
    public final Object mo353a(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            C0921xc.m5123d();
            return null;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = (ViewTreeObserverOnGlobalLayoutListenerC0875w3) this.receiver;
        Resources resources = viewTreeObserverOnGlobalLayoutListenerC0875w3.getContext().getResources();
        return Boolean.valueOf(C0159e4.f1294a.m779a(viewTreeObserverOnGlobalLayoutListenerC0875w3, null, new C0803uh(new C1009zm(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((q11) obj2).f5022a, (InterfaceC0742sw) obj3)));
    }
}
