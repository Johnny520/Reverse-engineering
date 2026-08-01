package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.AbstractC4068;
import com.google.gson.stream.JsonToken;
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
import p025.AbstractC7012;
import p275.C9073;
import p275.C9074;
import p288.AbstractC9166;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9150 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C9133 f23296 = new C9133();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f23297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC9151 f23298;

    public C9150(AbstractC9151 abstractC9151, int i, int i2) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f23297 = arrayList;
        Objects.requireNonNull(abstractC9151);
        this.f23298 = abstractC9151;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (AbstractC4068.f11244 >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    C6755.m11869(AbstractC7012.m12147(i, "Unknown DateFormat style: "));
                    throw null;
                }
                str = "M/d/yy";
            }
            sb.append(str);
            sb.append(" ");
            if (i2 == 0 || i2 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i2 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i2 != 3) {
                    C6755.m11869(AbstractC7012.m12147(i2, "Unknown DateFormat style: "));
                    throw null;
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f23297.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c9073.m14337();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f23297.get(0);
        synchronized (this.f23297) {
            str = dateFormat.format(date);
        }
        c9073.m14330(str);
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        Date dateM14412;
        if (c9074.m14346() == JsonToken.NULL) {
            c9074.m14352();
            return null;
        }
        String strM14348 = c9074.m14348();
        synchronized (this.f23297) {
            try {
                Iterator it = this.f23297.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateM14412 = AbstractC9166.m14412(strM14348, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbM12144 = AbstractC7012.m12144("Failed parsing '", strM14348, "' as Date; at path ");
                            sbM12144.append(c9074.m14366(true));
                            throw new JsonSyntaxException(sbM12144.toString(), e);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateM14412 = dateFormat.parse(strM14348);
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
        return this.f23298.mo14396(dateM14412);
    }
}
