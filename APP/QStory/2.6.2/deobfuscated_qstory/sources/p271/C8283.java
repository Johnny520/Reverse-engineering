package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8283 extends AbstractC3250 {
    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            c8243.m13762();
            return;
        }
        c8243.m13755();
        c8243.m13766("year");
        c8243.m13752(r4.get(1));
        c8243.m13766("month");
        c8243.m13752(r4.get(2));
        c8243.m13766("dayOfMonth");
        c8243.m13752(r4.get(5));
        c8243.m13766("hourOfDay");
        c8243.m13752(r4.get(11));
        c8243.m13766("minute");
        c8243.m13752(r4.get(12));
        c8243.m13766("second");
        c8243.m13752(r4.get(13));
        c8243.m13768();
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        int iM13782;
        if (c8244.m13770() == JsonToken.NULL) {
            c8244.m13775();
            return null;
        }
        c8244.m13778();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c8244.m13770() != JsonToken.END_OBJECT) {
            String strM13773 = c8244.m13773();
            iM13782 = c8244.m13782();
            switch (strM13773) {
                case "dayOfMonth":
                    i3 = iM13782;
                    break;
                case "minute":
                    i5 = iM13782;
                    break;
                case "second":
                    i6 = iM13782;
                    break;
                case "year":
                    i = iM13782;
                    break;
                case "month":
                    i2 = iM13782;
                    break;
                case "hourOfDay":
                    i4 = iM13782;
                    break;
            }
        }
        c8244.m13790();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }
}
