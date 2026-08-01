package p230r2;

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
import p011B4.AbstractC0231b;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p224q2.AbstractC2918i;
import p235s2.AbstractC3184a;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3132h extends AbstractC2770B {

    /* JADX INFO: renamed from: c */
    public static final C3129e f9866c = new C3129e();

    /* JADX INFO: renamed from: a */
    public final AbstractC3131g f9867a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9868b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3132h(AbstractC3131g abstractC3131g, int i5, int i6) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f9868b = arrayList;
        Objects.requireNonNull(abstractC3131g);
        this.f9867a = abstractC3131g;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i5, i6, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i5, i6));
        }
        if (AbstractC2918i.f9217a >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i5 == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i5 == 1) {
                str = "MMMM d, yyyy";
            } else if (i5 == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i5 != 3) {
                    throw new IllegalArgumentException(AbstractC0231b.m398i("Unknown DateFormat style: ", i5));
                }
                str = "M/d/yy";
            }
            sb.append(str);
            sb.append(" ");
            if (i6 == 0 || i6 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i6 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i6 != 3) {
                    throw new IllegalArgumentException(AbstractC0231b.m398i("Unknown DateFormat style: ", i6));
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        Date dateM5456b;
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        String strM5628H = c3390a.m5628H();
        synchronized (this.f9868b) {
            try {
                Iterator it = this.f9868b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateM5456b = AbstractC3184a.m5456b(strM5628H, new ParsePosition(0));
                            break;
                        } catch (ParseException e5) {
                            throw new C2789r("Failed parsing '" + strM5628H + "' as Date; at path " + c3390a.m5646m(true), e5);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateM5456b = dateFormat.parse(strM5628H);
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
        return this.f9867a.mo5410a(dateM5456b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c3391b.m5666n();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f9868b.get(0);
        synchronized (this.f9868b) {
            str = dateFormat.format(date);
        }
        c3391b.m5655E(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f9868b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
