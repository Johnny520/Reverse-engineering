package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.AbstractC3236;
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
import p009.AbstractC6183;
import p259.C8244;
import p259.C8245;
import p272.AbstractC8337;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8321 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8304 f22951 = new C8304();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f22952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC8322 f22953;

    public C8321(AbstractC8322 abstractC8322, int i, int i2) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f22952 = arrayList;
        Objects.requireNonNull(abstractC8322);
        this.f22953 = abstractC8322;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (AbstractC3236.f10899 >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    C5925.m11310(AbstractC6183.m11588(i, "Unknown DateFormat style: "));
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
                    C5925.m11310(AbstractC6183.m11588(i2, "Unknown DateFormat style: "));
                    throw null;
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f22952.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c8244.m13778();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f22952.get(0);
        synchronized (this.f22952) {
            str = dateFormat.format(date);
        }
        c8244.m13771(str);
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        Date dateM13853;
        if (c8245.m13787() == JsonToken.NULL) {
            c8245.m13793();
            return null;
        }
        String strM13789 = c8245.m13789();
        synchronized (this.f22952) {
            try {
                Iterator it = this.f22952.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateM13853 = AbstractC8337.m13853(strM13789, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbM11585 = AbstractC6183.m11585("Failed parsing '", strM13789, "' as Date; at path ");
                            sbM11585.append(c8245.m13807(true));
                            throw new JsonSyntaxException(sbM11585.toString(), e);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateM13853 = dateFormat.parse(strM13789);
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
        return this.f22953.mo13837(dateM13853);
    }
}
