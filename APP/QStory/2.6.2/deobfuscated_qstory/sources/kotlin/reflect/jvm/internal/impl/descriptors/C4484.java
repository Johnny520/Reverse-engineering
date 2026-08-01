package kotlin.reflect.jvm.internal.impl.descriptors;

import android.text.TextUtils;
import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import io.github.oshai.kotlinlogging.Level;
import io.ktor.util.C4210;
import io.ktor.utils.io.C4247;
import io.modelcontextprotocol.kotlin.sdk.server.C4292;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.Regex;
import p010.AbstractC6154;
import p013.C6177;
import p015.AbstractC6206;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.C6216;
import p015.C6217;
import p035.AbstractC6340;
import p036.AbstractC6354;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p087.C7067;
import p167.C7698;
import p167.InterfaceC7706;
import p175.AbstractC7738;
import p239.AbstractC8132;
import p249.C8158;
import p249.InterfaceC8159;
import p253.AbstractC8189;
import p316.C8675;
import p331.C8800;
import p342.C8821;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4484 implements InterfaceC7706, InterfaceC8159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f13109;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13110;

    public C4484() {
        this.f13110 = 6;
        this.f13109 = "qstory";
    }

    public String toString() {
        switch (this.f13110) {
            case 0:
                return this.f13109;
            case 1:
                return AbstractC0053.m155(new StringBuilder("<"), this.f13109, '>');
            default:
                return super.toString();
        }
    }

    @Override // p167.InterfaceC7706
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean mo9054(CharSequence charSequence, int i, int i2, C7698 c7698) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f13109)) {
            return true;
        }
        c7698.f20889 = (c7698.f20889 & 3) | 4;
        return false;
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo9055(C4292 c4292) {
        m9060(Level.WARN, new C6051(c4292, 7));
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo9056(InterfaceC6542 interfaceC6542) {
        m9060(Level.INFO, new C4247(interfaceC6542, 4));
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo9057(InterfaceC6542 interfaceC6542) {
        m9060(Level.TRACE, new C4247(interfaceC6542, 2));
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo9058(InterfaceC6542 interfaceC6542) {
        m9060(Level.DEBUG, new C4247(interfaceC6542, 5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m9059() {
        Integer num;
        C8800 c8800 = (C8800) new C8821().m14466(C8800.class, "token");
        C6217 c6217M13679 = null;
        String str = c8800 != null ? c8800.f24766 : null;
        str.getClass();
        C8800 c88002 = (C8800) new C8821().m14466(C8800.class, "token");
        String str2 = c88002 != null ? c88002.f24767 : null;
        str2.getClass();
        String strM6668 = "https://qstory.suzhelan.top/user/info";
        C6200 c6200 = new C6200(new C6216());
        C1245 c1245 = new C1245(6);
        c1245.m2141(strM6668);
        int i = AbstractC6206.f17028;
        String strM66682 = "";
        Regex regex = C6217.f17098;
        try {
            c6217M13679 = AbstractC8189.m13679("application/json");
        } catch (IllegalArgumentException unused) {
        }
        c1245.m2148("POST", C8675.m14360(strM66682, c6217M13679));
        c1245.m2156(str2, str);
        C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
        try {
            JSONObject object = JSONObject.parseObject(AbstractC6354.m11909(c6204M11615.f17009.m11648(), m9064()));
            if (object.getIntValue("code") == 200) {
                JSONObject jSONObject = object.getJSONObject("data");
                int intValue = jSONObject.getIntValue("identity");
                if (AbstractC4394.m8917(jSONObject.getString("uin"), AbstractC3054.m6612().f24761) && ((num = AbstractC3054.m6612().f24759) == null || intValue != num.intValue())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[QS]\u8eab\u4efd\u6821\u9a8c\u4e0d\u901a\u8fc7");
                    sb.append(intValue);
                    sb.append(":");
                    Integer num2 = AbstractC3054.m6612().f24759;
                    "identity";
                    num2.getClass();
                    sb.append(num2.intValue());
                    AbstractC6154.m11561(sb.toString());
                    Thread.sleep(3000L);
                    AbstractC7738.m13038(AbstractC6340.f17460);
                    System.exit(0);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                }
            }
            c6204M11615.close();
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m9060(Level level, InterfaceC6557 interfaceC6557) {
        boolean zIsLoggable;
        level.getClass();
        String str = this.f13109;
        int[] iArr = AbstractC8132.f22445;
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
                C4210.m8621();
        }
        if (zIsLoggable) {
            C8158 c8158 = new C8158();
            interfaceC6557.invoke(c8158);
            switch (iArr[level.ordinal()]) {
                case 1:
                    Log.v(str, c8158.f22501, c8158.f22500);
                    break;
                case 2:
                    Log.d(str, c8158.f22501, c8158.f22500);
                    break;
                case 3:
                    Log.i(str, c8158.f22501, c8158.f22500);
                    break;
                case 4:
                    Log.w(str, c8158.f22501, c8158.f22500);
                    break;
                case 5:
                    Log.e(str, c8158.f22501, c8158.f22500);
                    break;
                case 6:
                    break;
                default:
                    C4210.m8621();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public byte[] m9063(byte[] bArr) {
        "src";
        bArr.getClass();
        byte[] bArrM11906 = AbstractC6354.m11906(this.f13109, bArr);
        "encrypt(...)";
        bArrM11906.getClass();
        return bArrM11906;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String m9064() {
        String str = this.f13109;
        if (str != null) {
            return str;
        }
        try {
            String strM6690 = AbstractC3056.m6690(AbstractC6340.f17463);
            "getApkSignatureMD5(...)";
            Locale locale = Locale.getDefault();
            "getDefault(...)";
            locale.getClass();
            String upperCase = strM6690.toUpperCase(locale);
            "toUpperCase(...)";
            upperCase.getClass();
            this.f13109 = upperCase;
            return upperCase;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo9065(Throwable th, InterfaceC6542 interfaceC6542) {
        m9060(Level.ERROR, new C7067(interfaceC6542, 2, th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public byte[] m9067(byte[] bArr) {
        "dst";
        bArr.getClass();
        byte[] bArrM11908 = AbstractC6354.m11908(this.f13109, bArr);
        "decrypt(...)";
        bArrM11908.getClass();
        return bArrM11908;
    }

    @Override // p249.InterfaceC8159
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo9068(InterfaceC6542 interfaceC6542) {
        m9060(Level.ERROR, new C4247(interfaceC6542, 3));
    }

    public /* synthetic */ C4484(String str, int i) {
        this.f13110 = i;
        this.f13109 = str;
    }

    public /* synthetic */ C4484(int i) {
        this.f13110 = i;
    }

    @Override // p167.InterfaceC7706
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public Object mo9053() {
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public long m9061(long j) {
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int m9062(int i) {
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long m9066(long j) {
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int m9069(int i) {
        return i;
    }
}
