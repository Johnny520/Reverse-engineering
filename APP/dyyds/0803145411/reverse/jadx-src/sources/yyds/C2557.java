package yyds;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: yyds.ᲇᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2557 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C2271 f12627 = new C2271();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final AbstractC2334 f12628;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f12629;

    public C2557(AbstractC2334 abstractC2334, int i) {
        ArrayList arrayList = new ArrayList();
        this.f12629 = arrayList;
        this.f12628 = abstractC2334;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC1828.f9182 >= 9) {
            arrayList.add(new SimpleDateFormat(AbstractC2104.m4014("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f12629.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        Date dateM2137;
        if (c1942.m3744() == 9) {
            c1942.m3767();
            return null;
        }
        String strM3745 = c1942.m3745();
        synchronized (this.f12629) {
            try {
                Iterator it = this.f12629.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateM2137 = AbstractC0982.m2137(strM3745, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbM3998 = AbstractC2104.m3998("Failed parsing '", strM3745, "' as Date; at path ");
                            sbM3998.append(c1942.m3749(true));
                            throw new C1600(sbM3998.toString(), e);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateM2137 = dateFormat.parse(strM3745);
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
        return this.f12628.mo3911(dateM2137);
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c1405.m2857();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f12629.get(0);
        synchronized (this.f12629) {
            str = dateFormat.format(date);
        }
        c1405.m2852(str);
    }
}
