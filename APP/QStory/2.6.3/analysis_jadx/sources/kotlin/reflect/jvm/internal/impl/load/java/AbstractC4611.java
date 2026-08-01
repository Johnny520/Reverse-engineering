package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4684;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.text.AbstractC5139;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4611 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4688 f13471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4687 f13472;

    static {
        C4687 c4687 = new C4687("kotlin.jvm.JvmField");
        f13472 = c4687;
        AbstractC4684.m9307(c4687);
        AbstractC4684.m9307(new C4687("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f13471 = AbstractC4684.m9305("kotlin/jvm/internal/RepeatableContainer", false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m9229(String str) {
        str.getClass();
        if (AbstractC5139.m10139(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (AbstractC4395.m8905(97, cCharAt) > 0 || AbstractC4395.m8905(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m9230(String str) {
        str.getClass();
        return m9229(str) ? str : "get".concat(AbstractC5062.m10035(str));
    }
}
