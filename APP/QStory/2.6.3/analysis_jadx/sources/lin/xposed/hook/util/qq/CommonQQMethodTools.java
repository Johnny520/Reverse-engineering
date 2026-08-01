package lin.xposed.hook.util.qq;

import android.os.Bundle;
import androidx.compose.runtime.internal.C1245;
import java.lang.reflect.Method;
import java.util.List;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class CommonQQMethodTools {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LegacyQQ {
        public static Class<?> getMessageClass() {
            return AbstractC6337.m11866(AbstractC8405.m13972(124));
        }

        public static Class<?> getMessageRecordClass() {
            return AbstractC6337.m11866(AbstractC8405.m13972(872));
        }
    }

    public static Class<?> getAIOContactClass() {
        return AbstractC6337.m11866(AbstractC8405.m13972(345));
    }

    public static Class<?> getAIOMsgItemClass() {
        return AbstractC6337.m11866(AbstractC8405.m13972(160));
    }

    public static Class<?> getMsgRecordClass() {
        return AbstractC6337.m11866(AbstractC8405.m13972(873));
    }

    public static Method getQQNTAIOMsgItemViewMethod() {
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(326));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C1245 c1245 = c6335M11853.f17458;
        c1245.f3619 = clsArr;
        c1245.f3617 = Void.TYPE;
        return c6335M11853.m11855();
    }
}
