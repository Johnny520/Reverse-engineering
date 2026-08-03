package p357y1;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import gg.AbstractC1417m;
import java.util.ArrayList;
import java.util.Locale;
import p043d3.C0685a;
import p043d3.C0686b;
import p085fg.InterfaceC1220a;
import p225p2.C3289a;
import p225p2.C3290b;
import p276sf.C3967n;

/* JADX INFO: renamed from: y1.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5910n extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23982g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5934t f23983h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5910n(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, int i9) {
        super(0);
        this.f23982g = i9;
        this.f23983h = viewTreeObserverOnGlobalLayoutListenerC5934t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        int actionMasked;
        switch (this.f23982g) {
            case 0:
                Boolean bool = (Boolean) this.f23983h.f24142w.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = this.f23983h.getConfiguration().getLocales();
                C0685a c0685a = new C0685a(new C0686b(locales));
                if (locales.isEmpty()) {
                    c0685a = new C0685a(new C0686b(LocaleList.getDefault()));
                }
                LocaleList localeList = c0685a.f2092a.f2093a;
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i9 = 0; i9 < size; i9++) {
                    Locale locale = localeList.get(i9);
                    locale.getClass();
                    arrayList.add(new C3289a(locale));
                }
                return new C3290b(arrayList);
            case 2:
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f23983h;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC5934t.f24067C0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    viewTreeObserverOnGlobalLayoutListenerC5934t.f24069D0 = SystemClock.uptimeMillis();
                    viewTreeObserverOnGlobalLayoutListenerC5934t.post(viewTreeObserverOnGlobalLayoutListenerC5934t.f24079I0);
                }
                return C3967n.f12976a;
            default:
                this.f23983h.get_viewTreeOwners();
                return null;
        }
    }
}
