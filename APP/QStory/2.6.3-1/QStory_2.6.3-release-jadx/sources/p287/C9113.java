package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9113 extends AbstractC4083 {
    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            c9073.m14337();
            return;
        }
        c9073.m14331();
        c9073.m14342("year");
        c9073.m14328(r4.get(1));
        c9073.m14342("month");
        c9073.m14328(r4.get(2));
        c9073.m14342("dayOfMonth");
        c9073.m14328(r4.get(5));
        c9073.m14342("hourOfDay");
        c9073.m14328(r4.get(11));
        c9073.m14342("minute");
        c9073.m14328(r4.get(12));
        c9073.m14342("second");
        c9073.m14328(r4.get(13));
        c9073.m14344();
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        int iM14359;
        if (c9074.m14346() == JsonToken.NULL) {
            c9074.m14352();
            return null;
        }
        c9074.m14355();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c9074.m14346() != JsonToken.END_OBJECT) {
            String strM14350 = c9074.m14350();
            iM14359 = c9074.m14359();
            switch (strM14350) {
                case "dayOfMonth":
                    i3 = iM14359;
                    break;
                case "minute":
                    i5 = iM14359;
                    break;
                case "second":
                    i6 = iM14359;
                    break;
                case "year":
                    i = iM14359;
                    break;
                case "month":
                    i2 = iM14359;
                    break;
                case "hourOfDay":
                    i4 = iM14359;
                    break;
            }
        }
        c9074.m14367();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }
}
