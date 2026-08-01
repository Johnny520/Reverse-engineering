package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.AbstractC3235;
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
import p007.AbstractC6136;
import p259.C8243;
import p259.C8244;
import p272.AbstractC8336;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8320 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8303 f22952 = new C8303();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f22953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC8321 f22954;

    public C8320(AbstractC8321 abstractC8321, int i, int i2) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f22953 = arrayList;
        Objects.requireNonNull(abstractC8321);
        this.f22954 = abstractC8321;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (AbstractC3235.f10894 >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    C5919.m11249(AbstractC6136.m11556(i, "Unknown DateFormat style: "));
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
                    C5919.m11249(AbstractC6136.m11556(i2, "Unknown DateFormat style: "));
                    throw null;
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f22953.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c8243.m13762();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f22953.get(0);
        synchronized (this.f22953) {
            str = dateFormat.format(date);
        }
        c8243.m13754(str);
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        Date dateM13836;
        if (c8244.m13770() == JsonToken.NULL) {
            c8244.m13775();
            return null;
        }
        String strM13771 = c8244.m13771();
        synchronized (this.f22953) {
            try {
                Iterator it = this.f22953.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateM13836 = AbstractC8336.m13836(strM13771, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbM11550 = AbstractC6136.m11550("Failed parsing '", strM13771, "' as Date; at path ");
                            sbM11550.append(c8244.m13789(true));
                            throw new JsonSyntaxException(sbM11550.toString(), e);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateM13836 = dateFormat.parse(strM13771);
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
        return this.f22954.mo13820(dateM13836);
    }
}
