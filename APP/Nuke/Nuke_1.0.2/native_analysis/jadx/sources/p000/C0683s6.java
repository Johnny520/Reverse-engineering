package p000;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: s6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0683s6 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f9932i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0045b7 f9933j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0683s6(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, int i) {
        super(0);
        this.f9932i = i;
        this.f9933j = viewTreeObserverOnGlobalLayoutListenerC0045b7;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int actionMasked;
        int i = this.f9932i;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f9933j;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) viewTreeObserverOnGlobalLayoutListenerC0045b7.f708x.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = viewTreeObserverOnGlobalLayoutListenerC0045b7.getConfiguration().getLocales();
                lc1 lc1Var = new lc1(new mc1(locales));
                if (locales.isEmpty()) {
                    lc1Var = new lc1(new mc1(LocaleList.getDefault()));
                }
                LocaleList localeList = lc1Var.f6061a.f6561a;
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = localeList.get(i2);
                    locale.getClass();
                    arrayList.add(new jc1(locale));
                }
                return new kc1(arrayList);
            case 2:
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0045b7.f633D0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.f635E0 = SystemClock.uptimeMillis();
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.post(viewTreeObserverOnGlobalLayoutListenerC0045b7.f645J0);
                }
                return a83.f116a;
            default:
                viewTreeObserverOnGlobalLayoutListenerC0045b7.get_viewTreeOwners();
                return null;
        }
    }
}
