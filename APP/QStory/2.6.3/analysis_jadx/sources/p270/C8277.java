package p270;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3249;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p259.C8244;
import p259.C8245;
import p260.C8246;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8277 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8278 f22900 = new C8278();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SimpleDateFormat f22901;

    /* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class C8278 implements InterfaceC3249 {
        @Override // com.google.gson.InterfaceC3249
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
        public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
            if (c8246.f22815 == Date.class) {
                return new C8277(0);
            }
            return null;
        }
    }

    private C8277() {
        this.f22901 = new SimpleDateFormat("MMM d, yyyy");
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
        synchronized (this) {
            str = this.f22901.format((java.util.Date) date);
        }
        c8244.m13771(str);
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        Date date;
        if (c8245.m13787() == JsonToken.NULL) {
            c8245.m13793();
            return null;
        }
        String strM13789 = c8245.m13789();
        synchronized (this) {
            TimeZone timeZone = this.f22901.getTimeZone();
            try {
                try {
                    date = new Date(this.f22901.parse(strM13789).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strM13789 + "' as SQL Date; at path " + c8245.m13807(true), e);
                }
            } finally {
                this.f22901.setTimeZone(timeZone);
            }
        }
        return date;
    }

    public /* synthetic */ C8277(int i) {
        this();
    }
}
