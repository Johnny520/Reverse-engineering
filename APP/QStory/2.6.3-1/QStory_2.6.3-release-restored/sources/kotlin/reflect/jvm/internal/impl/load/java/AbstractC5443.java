package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5516;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.text.AbstractC5971;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5443 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5520 f13816;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5519 f13817;

    static {
        C5519 c5519 = new C5519("kotlin.jvm.JvmField");
        f13817 = c5519;
        AbstractC5516.m9866(c5519);
        AbstractC5516.m9866(new C5519("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f13816 = AbstractC5516.m9864("kotlin/jvm/internal/RepeatableContainer", false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m9788(String str) {
        str.getClass();
        if (AbstractC5971.m10698(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (AbstractC5227.m9464(97, cCharAt) > 0 || AbstractC5227.m9464(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m9789(String str) {
        str.getClass();
        return m9788(str) ? str : "get".concat(AbstractC5894.m10594(str));
    }
}
