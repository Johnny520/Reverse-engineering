package top.suzhelan.qstory.hook.item;

import android.view.View;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p303.AbstractC9234;
import p405.C9921;
import p407.C9924;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲苏楪兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6717 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Map f16409 = AbstractC5171.m9333(new Pair(AbstractC9234.m14532("呜喵喵呜呜喵呜喵~呜呜喵喵呜呜呜喵~呜呜呜喵喵喵呜喵~呜喵喵喵喵喵喵喵~呜呜喵喵呜喵呜呜~呜呜喵喵呜喵喵喵"), 0), new Pair(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜喵呜喵呜喵呜~呜呜呜喵喵喵呜呜"), 1), new Pair(AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜呜喵喵喵喵喵~呜呜喵呜呜呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵呜喵呜喵呜~呜呜呜喵喵喵呜呜"), 64), new Pair(AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜呜喵喵喵喵喵~呜呜喵呜呜呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵喵喵喵喵呜~呜呜喵喵呜喵呜呜"), 512), new Pair(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜喵喵喵喵喵呜~呜呜喵喵呜喵呜呜"), 1024));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9924 f16410 = new C9924(AbstractC9234.m14531(1878), 0);

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Class clsM12425;
        Class clsM124252;
        Class clsM124253;
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        Class clsM124254 = null;
        try {
            clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(133));
        } catch (Throwable unused) {
            clsM12425 = null;
        }
        if (clsM12425 == null) {
            try {
                clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(1880));
            } catch (Throwable unused2) {
                clsM12425 = null;
            }
            if (clsM12425 == null) {
                return;
            }
        }
        try {
            clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(136));
        } catch (Throwable unused3) {
            clsM124252 = null;
        }
        if (clsM124252 == null) {
            try {
                clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(1881));
            } catch (Throwable unused4) {
                clsM124252 = null;
            }
            if (clsM124252 == null) {
                return;
            }
        }
        try {
            clsM124253 = AbstractC7166.m12425(AbstractC9234.m14531(137));
        } catch (Throwable unused5) {
            clsM124253 = null;
        }
        if (clsM124253 == null) {
            try {
                clsM124254 = AbstractC7166.m12425(AbstractC9234.m14531(1882));
            } catch (Throwable unused6) {
            }
            if (clsM124254 == null) {
                return;
            } else {
                clsM124253 = clsM124254;
            }
        }
        C9921 c9921M15231 = C9921.m15231(clsM124253);
        c9921M15231.m15234(Long.TYPE, clsM12425, ArrayList.class, HashMap.class, clsM124252);
        c9921M15231.f25826 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
        Method method = (Method) c9921M15231.m15163();
        if (method == null) {
            return;
        }
        m12390(method, new C6714(this));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        Object objM9377;
        String strM14531 = AbstractC9234.m14531(1884);
        C9924 c9924 = this.f16410;
        c9924.getClass();
        int i = 0;
        int i2 = c9924.f25834.getInt(strM14531, 0);
        Set setKeySet = this.f16409.keySet();
        setKeySet.getClass();
        if (setKeySet instanceof List) {
            objM9377 = AbstractC5176.m9377(i2, (List) setKeySet);
        } else if (i2 < 0) {
            objM9377 = null;
        } else {
            for (Object obj : setKeySet) {
                int i3 = i + 1;
                if (i2 == i) {
                    objM9377 = obj;
                    break;
                }
                i = i3;
            }
            objM9377 = null;
        }
        if (((String) objM9377) == null) {
            AbstractC9234.m14532("呜喵喵呜呜喵呜喵~呜呜喵喵呜呜呜喵~呜呜呜喵喵喵呜喵~呜喵喵喵喵喵喵喵~呜呜喵喵呜喵呜呜~呜呜喵喵呜喵喵喵");
        }
        return AbstractC9234.m14531(1879);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 4);
    }
}
