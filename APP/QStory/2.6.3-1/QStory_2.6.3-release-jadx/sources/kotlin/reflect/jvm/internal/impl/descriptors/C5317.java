package kotlin.reflect.jvm.internal.impl.descriptors;

import android.text.TextUtils;
import android.util.Log;
import androidx.activity.AbstractC0900;
import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3897;
import io.github.oshai.kotlinlogging.Level;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.C5080;
import io.modelcontextprotocol.kotlin.sdk.server.C5125;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.Regex;
import p023.AbstractC6962;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.C6972;
import p023.C6973;
import p026.AbstractC7014;
import p027.C7032;
import p050.AbstractC7173;
import p052.AbstractC7187;
import p053.AbstractC7200;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p103.C7897;
import p183.C8528;
import p183.InterfaceC8536;
import p255.AbstractC8962;
import p265.C8988;
import p265.InterfaceC8989;
import p303.AbstractC9234;
import p348.C9615;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5317 implements InterfaceC8536, InterfaceC8989 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f13458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13459;

    public C5317() {
        this.f13459 = 6;
        this.f13458 = AbstractC9234.m14532("喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜");
    }

    public String toString() {
        switch (this.f13459) {
            case 0:
                return this.f13458;
            case 1:
                return AbstractC0900.m708(new StringBuilder("<"), this.f13458, '>');
            default:
                return super.toString();
        }
    }

    @Override // p183.InterfaceC8536
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean mo9603(CharSequence charSequence, int i, int i2, C8528 c8528) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f13458)) {
            return true;
        }
        c8528.f21229 = (c8528.f21229 & 3) | 4;
        return false;
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo9604(C5125 c5125) {
        m9609(Level.WARN, new C6886(c5125, 7));
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo9605(InterfaceC7372 interfaceC7372) {
        m9609(Level.INFO, new C5080(interfaceC7372, 4));
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo9606(InterfaceC7372 interfaceC7372) {
        m9609(Level.TRACE, new C5080(interfaceC7372, 2));
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo9607(InterfaceC7372 interfaceC7372) {
        m9609(Level.DEBUG, new C5080(interfaceC7372, 5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m9608() {
        Integer num;
        C9615 c9615M7267 = AbstractC3888.m7267();
        C6973 c6973M7271 = null;
        String str = c9615M7267 != null ? c9615M7267.f25092 : null;
        str.getClass();
        C9615 c9615M72672 = AbstractC3888.m7267();
        String str2 = c9615M72672 != null ? c9615M72672.f25093 : null;
        str2.getClass();
        String strM14531 = AbstractC9234.m14531(1273);
        C6956 c6956 = new C6956(new C6972());
        C2080 c2080 = new C2080(6);
        c2080.m2711(strM14531);
        int i = AbstractC6962.f17134;
        Regex regex = C6973.f17204;
        try {
            c6973M7271 = AbstractC3888.m7271(AbstractC9234.m14531(974));
        } catch (IllegalArgumentException unused) {
        }
        c2080.m2718("POST", AbstractC3897.m7401("", c6973M7271));
        c2080.m2726(str2, str);
        C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
        try {
            JSONObject object = JSONObject.parseObject(AbstractC7200.m12516(c6960M12193.f17115.m12078(), m9613()));
            if (object.getIntValue(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜")) == 200) {
                JSONObject jSONObject = object.getJSONObject(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"));
                int intValue = jSONObject.getIntValue(AbstractC9234.m14531(1052));
                if (AbstractC5227.m9466(jSONObject.getString(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵")), AbstractC3888.m7268().f25087) && ((num = AbstractC3888.m7268().f25085) == null || intValue != num.intValue())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC9234.m14531(1274));
                    sb.append(intValue);
                    sb.append(AbstractC9234.m14532("喵呜喵喵呜喵喵呜"));
                    Integer num2 = AbstractC3888.m7268().f25085;
                    AbstractC9234.m14531(1052);
                    num2.getClass();
                    sb.append(num2.intValue());
                    AbstractC7014.m12151(sb.toString());
                    Thread.sleep(3000L);
                    AbstractC3887.m7199(AbstractC7187.f17852);
                    System.exit(0);
                    throw new RuntimeException(AbstractC9234.m14531(1275));
                }
            }
            c6960M12193.close();
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m9609(Level level, InterfaceC7387 interfaceC7387) {
        boolean zIsLoggable;
        level.getClass();
        String str = this.f13458;
        int[] iArr = AbstractC8962.f22788;
        switch (iArr[level.ordinal()]) {
            case 1:
                zIsLoggable = Log.isLoggable(str, 2);
                break;
            case 2:
                zIsLoggable = Log.isLoggable(str, 3);
                break;
            case 3:
                zIsLoggable = Log.isLoggable(str, 4);
                break;
            case 4:
                zIsLoggable = Log.isLoggable(str, 5);
                break;
            case 5:
                zIsLoggable = Log.isLoggable(str, 6);
                break;
            case 6:
                zIsLoggable = false;
                break;
            default:
                C5043.m9170();
        }
        if (zIsLoggable) {
            C8988 c8988 = new C8988();
            interfaceC7387.invoke(c8988);
            switch (iArr[level.ordinal()]) {
                case 1:
                    Log.v(str, c8988.f22844, c8988.f22843);
                    break;
                case 2:
                    Log.d(str, c8988.f22844, c8988.f22843);
                    break;
                case 3:
                    Log.i(str, c8988.f22844, c8988.f22843);
                    break;
                case 4:
                    Log.w(str, c8988.f22844, c8988.f22843);
                    break;
                case 5:
                    Log.e(str, c8988.f22844, c8988.f22843);
                    break;
                case 6:
                    break;
                default:
                    C5043.m9170();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public byte[] m9612(byte[] bArr) {
        AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜喵喵呜");
        bArr.getClass();
        byte[] bArrM12513 = AbstractC7200.m12513(this.f13458, bArr);
        AbstractC9234.m14531(3256);
        bArrM12513.getClass();
        return bArrM12513;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String m9613() {
        String str = this.f13458;
        if (str != null) {
            return str;
        }
        try {
            String strM12445 = AbstractC7173.m12445(AbstractC7187.f17855);
            AbstractC9234.m14531(1276);
            Locale locale = Locale.getDefault();
            AbstractC9234.m14531(1277);
            locale.getClass();
            String upperCase = strM12445.toUpperCase(locale);
            AbstractC9234.m14531(1278);
            upperCase.getClass();
            this.f13458 = upperCase;
            return upperCase;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo9614(Throwable th, InterfaceC7372 interfaceC7372) {
        m9609(Level.ERROR, new C7897(interfaceC7372, 2, th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public byte[] m9616(byte[] bArr) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜呜呜喵");
        bArr.getClass();
        byte[] bArrM12515 = AbstractC7200.m12515(this.f13458, bArr);
        AbstractC9234.m14531(3257);
        bArrM12515.getClass();
        return bArrM12515;
    }

    @Override // p265.InterfaceC8989
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo9617(InterfaceC7372 interfaceC7372) {
        m9609(Level.ERROR, new C5080(interfaceC7372, 3));
    }

    public /* synthetic */ C5317(String str, int i) {
        this.f13459 = i;
        this.f13458 = str;
    }

    public /* synthetic */ C5317(int i) {
        this.f13459 = i;
    }

    @Override // p183.InterfaceC8536
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public Object mo9602() {
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public long m9610(long j) {
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int m9611(int i) {
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long m9615(long j) {
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int m9618(int i) {
        return i;
    }
}
