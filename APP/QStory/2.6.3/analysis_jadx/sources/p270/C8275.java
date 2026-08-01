package p270;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3249;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import p259.C8244;
import p259.C8245;
import p260.C8246;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8275 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8276 f22898 = new C8276();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SimpleDateFormat f22899;

    /* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世苏兰哲$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class C8276 implements InterfaceC3249 {
        @Override // com.google.gson.InterfaceC3249
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
        public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
            if (c8246.f22815 == Time.class) {
                return new C8275(0);
            }
            return null;
        }
    }

    private C8275() {
        this.f22899 = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c8244.m13778();
            return;
        }
        synchronized (this) {
            str = this.f22899.format((Date) time);
        }
        c8244.m13771(str);
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        Time time;
        if (c8245.m13787() == JsonToken.NULL) {
            c8245.m13793();
            return null;
        }
        String strM13789 = c8245.m13789();
        synchronized (this) {
            TimeZone timeZone = this.f22899.getTimeZone();
            try {
                try {
                    time = new Time(this.f22899.parse(strM13789).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strM13789 + "' as SQL Time; at path " + c8245.m13807(true), e);
                }
            } finally {
                this.f22899.setTimeZone(timeZone);
            }
        }
        return time;
    }

    public /* synthetic */ C8275(int i) {
        this();
    }
}
