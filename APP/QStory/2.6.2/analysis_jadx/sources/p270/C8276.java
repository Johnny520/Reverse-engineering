package p270;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.InterfaceC3248;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p259.C8243;
import p259.C8244;
import p260.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8276 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8277 f22901 = new C8277();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SimpleDateFormat f22902;

    /* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public class C8277 implements InterfaceC3248 {
        @Override // com.google.gson.InterfaceC3248
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
        public final AbstractC3250 mo7334(C3252 c3252, C8245 c8245) {
            if (c8245.f22816 == Date.class) {
                return new C8276(0);
            }
            return null;
        }
    }

    private C8276() {
        this.f22902 = new SimpleDateFormat("MMM d, yyyy");
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
        synchronized (this) {
            str = this.f22902.format((java.util.Date) date);
        }
        c8243.m13754(str);
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        Date date;
        if (c8244.m13770() == JsonToken.NULL) {
            c8244.m13775();
            return null;
        }
        String strM13771 = c8244.m13771();
        synchronized (this) {
            TimeZone timeZone = this.f22902.getTimeZone();
            try {
                try {
                    date = new Date(this.f22902.parse(strM13771).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strM13771 + "' as SQL Date; at path " + c8244.m13789(true), e);
                }
            } finally {
                this.f22902.setTimeZone(timeZone);
            }
        }
        return date;
    }

    public /* synthetic */ C8276(int i) {
        this();
    }
}
