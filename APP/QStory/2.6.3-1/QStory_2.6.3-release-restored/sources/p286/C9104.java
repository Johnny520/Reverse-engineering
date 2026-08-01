package p286;

import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4081;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import p275.C9073;
import p275.C9074;
import p276.C9075;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9104 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9105 f23243 = new C9105();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SimpleDateFormat f23244;

    /* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世苏兰哲$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class C9105 implements InterfaceC4081 {
        @Override // com.google.gson.InterfaceC4081
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
        public final AbstractC4083 mo7880(C4085 c4085, C9075 c9075) {
            if (c9075.f23160 == Time.class) {
                return new C9104(0);
            }
            return null;
        }
    }

    private C9104() {
        this.f23244 = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c9073.m14337();
            return;
        }
        synchronized (this) {
            str = this.f23244.format((Date) time);
        }
        c9073.m14330(str);
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        Time time;
        if (c9074.m14346() == JsonToken.NULL) {
            c9074.m14352();
            return null;
        }
        String strM14348 = c9074.m14348();
        synchronized (this) {
            TimeZone timeZone = this.f23244.getTimeZone();
            try {
                try {
                    time = new Time(this.f23244.parse(strM14348).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strM14348 + "' as SQL Time; at path " + c9074.m14366(true), e);
                }
            } finally {
                this.f23244.setTimeZone(timeZone);
            }
        }
        return time;
    }

    public /* synthetic */ C9104(int i) {
        this();
    }
}
