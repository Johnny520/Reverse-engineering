package p151k6;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import p068eh.AbstractC0921a;
import p105h6.AbstractC1622n;
import p134j6.AbstractC2071i;
import p136j8.C2104o;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2293h extends AbstractC1622n {

    /* JADX INFO: renamed from: b */
    public static final C2287e f7616b = new C2287e();

    /* JADX INFO: renamed from: a */
    public final ArrayList f7617a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2293h(AbstractC2291g abstractC2291g, int i9, int i10) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f7617a = arrayList;
        Objects.requireNonNull(abstractC2291g);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i9, i10, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i9, i10));
        }
        if (AbstractC2071i.f6954a >= 9) {
            StringBuilder sb2 = new StringBuilder();
            if (i9 == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i9 == 1) {
                str = "MMMM d, yyyy";
            } else if (i9 == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i9 != 3) {
                    C2104o.m5294t(AbstractC0921a.m2249l(i9, "Unknown DateFormat style: "));
                    throw null;
                }
                str = "M/d/yy";
            }
            sb2.append(str);
            sb2.append(" ");
            if (i10 == 0 || i10 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i10 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i10 != 3) {
                    C2104o.m5294t(AbstractC0921a.m2249l(i10, "Unknown DateFormat style: "));
                    throw null;
                }
                str2 = "h:mm a";
            }
            sb2.append(str2);
            arrayList.add(new SimpleDateFormat(sb2.toString(), locale));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c3066a.m6508l();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f7617a.get(0);
        synchronized (this.f7617a) {
            str = dateFormat.format(date);
        }
        c3066a.m6516x(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f7617a.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
