package kotlin.reflect.jvm.internal.impl.descriptors;

import android.text.TextUtils;
import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import io.github.oshai.kotlinlogging.Level;
import io.ktor.util.C4211;
import io.ktor.utils.io.C4248;
import io.modelcontextprotocol.kotlin.sdk.server.C4293;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.Regex;
import p007.AbstractC6133;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p007.C6143;
import p007.C6144;
import p010.AbstractC6185;
import p011.C6203;
import p034.AbstractC6344;
import p036.AbstractC6358;
import p037.AbstractC6371;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p087.C7068;
import p167.C7699;
import p167.InterfaceC7707;
import p239.AbstractC8133;
import p249.C8159;
import p249.InterfaceC8160;
import p287.AbstractC8405;
import p332.C8786;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4485 implements InterfaceC7707, InterfaceC8160 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String f13113;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13114;

    public C4485() {
        this.f13114 = 6;
        this.f13113 = AbstractC8405.m13973("喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜");
    }

    public String toString() {
        switch (this.f13114) {
            case 0:
                return this.f13113;
            case 1:
                return AbstractC0053.m148(new StringBuilder("<"), this.f13113, '>');
            default:
                return super.toString();
        }
    }

    @Override // p167.InterfaceC7707
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean mo9044(CharSequence charSequence, int i, int i2, C7699 c7699) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f13113)) {
            return true;
        }
        c7699.f20884 = (c7699.f20884 & 3) | 4;
        return false;
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo9045(C4293 c4293) {
        m9050(Level.WARN, new C6057(c4293, 7));
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo9046(InterfaceC6543 interfaceC6543) {
        m9050(Level.INFO, new C4248(interfaceC6543, 4));
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo9047(InterfaceC6543 interfaceC6543) {
        m9050(Level.TRACE, new C4248(interfaceC6543, 2));
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo9048(InterfaceC6543 interfaceC6543) {
        m9050(Level.DEBUG, new C4248(interfaceC6543, 5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m9049() {
        Integer num;
        C8786 c8786M6707 = AbstractC3056.m6707();
        C6144 c6144M6711 = null;
        String str = c8786M6707 != null ? c8786M6707.f24747 : null;
        str.getClass();
        C8786 c8786M67072 = AbstractC3056.m6707();
        String str2 = c8786M67072 != null ? c8786M67072.f24748 : null;
        str2.getClass();
        String strM13972 = AbstractC8405.m13972(1273);
        C6127 c6127 = new C6127(new C6143());
        C1245 c1245 = new C1245(6);
        c1245.m2151(strM13972);
        int i = AbstractC6133.f16789;
        Regex regex = C6144.f16859;
        try {
            c6144M6711 = AbstractC3056.m6711(AbstractC8405.m13972(974));
        } catch (IllegalArgumentException unused) {
        }
        c1245.m2158("POST", AbstractC3065.m6841("", c6144M6711));
        c1245.m2166(str2, str);
        C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
        try {
            JSONObject object = JSONObject.parseObject(AbstractC6371.m11957(c6131M11634.f16770.m11519(), m9054()));
            if (object.getIntValue(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜")) == 200) {
                JSONObject jSONObject = object.getJSONObject(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"));
                int intValue = jSONObject.getIntValue(AbstractC8405.m13972(1052));
                if (AbstractC4395.m8907(jSONObject.getString(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵")), AbstractC3056.m6708().f24742) && ((num = AbstractC3056.m6708().f24740) == null || intValue != num.intValue())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC8405.m13972(1274));
                    sb.append(intValue);
                    sb.append(AbstractC8405.m13973("喵呜喵喵呜喵喵呜"));
                    Integer num2 = AbstractC3056.m6708().f24740;
                    AbstractC8405.m13972(1052);
                    num2.getClass();
                    sb.append(num2.intValue());
                    AbstractC6185.m11592(sb.toString());
                    Thread.sleep(3000L);
                    AbstractC3055.m6639(AbstractC6358.f17507);
                    System.exit(0);
                    throw new RuntimeException(AbstractC8405.m13972(1275));
                }
            }
            c6131M11634.close();
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m9050(Level level, InterfaceC6558 interfaceC6558) {
        boolean zIsLoggable;
        level.getClass();
        String str = this.f13113;
        int[] iArr = AbstractC8133.f22443;
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
                C4211.m8611();
        }
        if (zIsLoggable) {
            C8159 c8159 = new C8159();
            interfaceC6558.invoke(c8159);
            switch (iArr[level.ordinal()]) {
                case 1:
                    Log.v(str, c8159.f22499, c8159.f22498);
                    break;
                case 2:
                    Log.d(str, c8159.f22499, c8159.f22498);
                    break;
                case 3:
                    Log.i(str, c8159.f22499, c8159.f22498);
                    break;
                case 4:
                    Log.w(str, c8159.f22499, c8159.f22498);
                    break;
                case 5:
                    Log.e(str, c8159.f22499, c8159.f22498);
                    break;
                case 6:
                    break;
                default:
                    C4211.m8611();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public byte[] m9053(byte[] bArr) {
        AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜喵喵呜");
        bArr.getClass();
        byte[] bArrM11954 = AbstractC6371.m11954(this.f13113, bArr);
        AbstractC8405.m13972(3256);
        bArrM11954.getClass();
        return bArrM11954;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String m9054() {
        String str = this.f13113;
        if (str != null) {
            return str;
        }
        try {
            String strM11886 = AbstractC6344.m11886(AbstractC6358.f17510);
            AbstractC8405.m13972(1276);
            Locale locale = Locale.getDefault();
            AbstractC8405.m13972(1277);
            locale.getClass();
            String upperCase = strM11886.toUpperCase(locale);
            AbstractC8405.m13972(1278);
            upperCase.getClass();
            this.f13113 = upperCase;
            return upperCase;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo9055(Throwable th, InterfaceC6543 interfaceC6543) {
        m9050(Level.ERROR, new C7068(interfaceC6543, 2, th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public byte[] m9057(byte[] bArr) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜呜呜喵");
        bArr.getClass();
        byte[] bArrM11956 = AbstractC6371.m11956(this.f13113, bArr);
        AbstractC8405.m13972(3257);
        bArrM11956.getClass();
        return bArrM11956;
    }

    @Override // p249.InterfaceC8160
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo9058(InterfaceC6543 interfaceC6543) {
        m9050(Level.ERROR, new C4248(interfaceC6543, 3));
    }

    public /* synthetic */ C4485(String str, int i) {
        this.f13114 = i;
        this.f13113 = str;
    }

    public /* synthetic */ C4485(int i) {
        this.f13114 = i;
    }

    @Override // p167.InterfaceC7707
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public Object mo9043() {
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public long m9051(long j) {
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int m9052(int i) {
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long m9056(long j) {
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int m9059(int i) {
        return i;
    }
}
