package defpackage;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s6 extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ b7 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(b7 b7Var, int i) {
        super(0);
        this.i = i;
        this.j = b7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int actionMasked;
        int i = this.i;
        b7 b7Var = this.j;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) b7Var.x.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = b7Var.getConfiguration().getLocales();
                lc1 lc1Var = new lc1(new mc1(locales));
                if (locales.isEmpty()) {
                    lc1Var = new lc1(new mc1(LocaleList.getDefault()));
                }
                LocaleList localeList = lc1Var.a.a;
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = localeList.get(i2);
                    locale.getClass();
                    arrayList.add(new jc1(locale));
                }
                return new kc1(arrayList);
            case 2:
                MotionEvent motionEvent = b7Var.D0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    b7Var.E0 = SystemClock.uptimeMillis();
                    b7Var.post(b7Var.J0);
                }
                return a83.a;
            default:
                b7Var.get_viewTreeOwners();
                return null;
        }
    }
}
