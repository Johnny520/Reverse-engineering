package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8284 extends AbstractC3251 {
    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            c8244.m13778();
            return;
        }
        c8244.m13772();
        c8244.m13783("year");
        c8244.m13769(r4.get(1));
        c8244.m13783("month");
        c8244.m13769(r4.get(2));
        c8244.m13783("dayOfMonth");
        c8244.m13769(r4.get(5));
        c8244.m13783("hourOfDay");
        c8244.m13769(r4.get(11));
        c8244.m13783("minute");
        c8244.m13769(r4.get(12));
        c8244.m13783("second");
        c8244.m13769(r4.get(13));
        c8244.m13785();
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        int iM13800;
        if (c8245.m13787() == JsonToken.NULL) {
            c8245.m13793();
            return null;
        }
        c8245.m13796();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c8245.m13787() != JsonToken.END_OBJECT) {
            String strM13791 = c8245.m13791();
            iM13800 = c8245.m13800();
            switch (strM13791) {
                case "dayOfMonth":
                    i3 = iM13800;
                    break;
                case "minute":
                    i5 = iM13800;
                    break;
                case "second":
                    i6 = iM13800;
                    break;
                case "year":
                    i = iM13800;
                    break;
                case "month":
                    i2 = iM13800;
                    break;
                case "hourOfDay":
                    i4 = iM13800;
                    break;
            }
        }
        c8245.m13808();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }
}
