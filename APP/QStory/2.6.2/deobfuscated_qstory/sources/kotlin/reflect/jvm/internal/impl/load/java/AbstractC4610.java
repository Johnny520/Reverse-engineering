package kotlin.reflect.jvm.internal.impl.load.java;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4683;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.text.AbstractC5138;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4610 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4687 f13467;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4686 f13468;

    static {
        C4686 c4686 = new C4686("kotlin.jvm.JvmField");
        f13468 = c4686;
        AbstractC4683.m9317(c4686);
        AbstractC4683.m9317(new C4686("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f13467 = AbstractC4683.m9315("kotlin/jvm/internal/RepeatableContainer", false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m9239(String str) {
        str.getClass();
        if (AbstractC5138.m10125(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (AbstractC4394.m8915(97, cCharAt) > 0 || AbstractC4394.m8915(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m9240(String str) {
        str.getClass();
        return m9239(str) ? str : "get".concat(AbstractC3056.m6678(str));
    }
}
