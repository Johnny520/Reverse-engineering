package p000;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g50 extends q43 {

    /* JADX INFO: renamed from: c */
    public static final d50 f3311c = new d50();

    /* JADX INFO: renamed from: a */
    public final f50 f3312a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3313b;

    public g50(f50 f50Var) {
        ArrayList arrayList = new ArrayList();
        this.f3313b = arrayList;
        Objects.requireNonNull(f50Var);
        this.f3312a = f50Var;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (j21.f4883a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        Date dateM1483b;
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        String strM2812G = l41Var.m2812G();
        synchronized (this.f3313b) {
            try {
                Iterator it = this.f3313b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateM1483b = ex0.m1483b(strM2812G, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            um2.m5515e(strM2812G, "' as Date; at path ", l41Var.m2831o(true), e);
                            return null;
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateM1483b = dateFormat.parse(strM2812G);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f3312a.mo1254a(dateM1483b);
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            o41Var.m3498p();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f3313b.get(0);
        synchronized (this.f3313b) {
            str = dateFormat.format(date);
        }
        o41Var.m3487D(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f3313b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
