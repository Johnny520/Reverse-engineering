package lin.xposed.hook.util.p011qq;

import android.os.Bundle;
import androidx.compose.runtime.internal.C2080;
import java.lang.reflect.Method;
import java.util.List;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class CommonQQMethodTools {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LegacyQQ {
        public static Class<?> getMessageClass() {
            return AbstractC7166.m12425(AbstractC9234.m14531(124));
        }

        public static Class<?> getMessageRecordClass() {
            return AbstractC7166.m12425(AbstractC9234.m14531(872));
        }
    }

    public static Class<?> getAIOContactClass() {
        return AbstractC7166.m12425(AbstractC9234.m14531(345));
    }

    public static Class<?> getAIOMsgItemClass() {
        return AbstractC7166.m12425(AbstractC9234.m14531(160));
    }

    public static Class<?> getMsgRecordClass() {
        return AbstractC7166.m12425(AbstractC9234.m14531(873));
    }

    public static Method getQQNTAIOMsgItemViewMethod() {
        C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(326));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        return c7164M12412.m12414();
    }
}
