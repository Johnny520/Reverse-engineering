package lin.xposed.hook.util.qq;

import android.os.Bundle;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import java.util.List;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class CommonQQMethodTools {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class LegacyQQ {
        public static Class<?> getMessageClass() {
            return AbstractC6318.m11838(AbstractC3056.m6668(-3937565891810821543L));
        }

        public static Class<?> getMessageRecordClass() {
            return AbstractC6318.m11838(AbstractC3056.m6668(-3937646791814808999L));
        }
    }

    public static Class<?> getAIOContactClass() {
        return AbstractC6318.m11838(AbstractC3056.m6668(-3937591446866232743L));
    }

    public static Class<?> getAIOMsgItemClass() {
        return AbstractC6318.m11838(AbstractC3056.m6668(-3937564551781025191L));
    }

    public static Class<?> getMsgRecordClass() {
        return AbstractC6318.m11838(AbstractC3056.m6668(-3937646688735593895L));
    }

    public static Method getQQNTAIOMsgItemViewMethod() {
        C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937594028141577639L));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        return c6316M11825.m11827();
    }
}
