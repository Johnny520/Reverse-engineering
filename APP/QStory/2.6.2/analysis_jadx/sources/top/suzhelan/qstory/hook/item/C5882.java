package top.suzhelan.qstory.hook.item;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;
import p391.C9114;
import p392.C9125;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲苏楪兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5882 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Map f16055 = AbstractC4338.m8777(new Pair(AbstractC3056.m6668(-3937574138148029863L), 0), new Pair(AbstractC3056.m6668(-3937751382858401191L), 1), new Pair(AbstractC3056.m6668(-3937751361383564711L), 64), new Pair(AbstractC3056.m6668(-3937751374268466599L), 512), new Pair(AbstractC3056.m6668(-3937751421513106855L), 1024));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9114 f16056 = new C9114(AbstractC3056.m6668(-3937751400038270375L), 0);

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Class clsM11838;
        Class clsM118382;
        Class clsM118383;
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        Class clsM118384 = null;
        try {
            clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937563181686457767L));
        } catch (Throwable unused) {
            clsM11838 = null;
        }
        if (clsM11838 == null) {
            try {
                clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937751223944611239L));
            } catch (Throwable unused2) {
                clsM11838 = null;
            }
            if (clsM11838 == null) {
                return;
            }
        }
        try {
            clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937562726419924391L));
        } catch (Throwable unused3) {
            clsM118382 = null;
        }
        if (clsM118382 == null) {
            try {
                clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937751077915723175L));
            } catch (Throwable unused4) {
                clsM118382 = null;
            }
            if (clsM118382 == null) {
                return;
            }
        }
        try {
            clsM118383 = AbstractC6318.m11838(AbstractC3056.m6668(-3937562558916199847L));
        } catch (Throwable unused5) {
            clsM118383 = null;
        }
        if (clsM118383 == null) {
            try {
                clsM118384 = AbstractC6318.m11838(AbstractC3056.m6668(-3937750798742848935L));
            } catch (Throwable unused6) {
            }
            if (clsM118384 == null) {
                return;
            } else {
                clsM118383 = clsM118384;
            }
        }
        C9125 c9125M14680 = C9125.m14680(clsM118383);
        c9125M14680.m14683(Long.TYPE, clsM11838, ArrayList.class, HashMap.class, clsM118382);
        c9125M14680.f25504 = AbstractC3056.m6668(-3937579786030024103L);
        Method method = (Method) c9125M14680.m14685();
        if (method == null) {
            return;
        }
        m11803(method, new C5879(this));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        Object objM8831;
        String strM6668 = AbstractC3056.m6668(-3937750463735399847L);
        C9114 c9114 = this.f16056;
        c9114.getClass();
        int i = 0;
        int i2 = c9114.f25485.getInt(strM6668, 0);
        Set setKeySet = this.f16055.keySet();
        setKeySet.getClass();
        if (setKeySet instanceof List) {
            objM8831 = AbstractC4343.m8831(i2, (List) setKeySet);
        } else if (i2 < 0) {
            objM8831 = null;
        } else {
            for (Object obj : setKeySet) {
                int i3 = i + 1;
                if (i2 == i) {
                    objM8831 = obj;
                    break;
                }
                i = i3;
            }
            objM8831 = null;
        }
        if (((String) objM8831) == null) {
            AbstractC3056.m6668(-3937574138148029863L);
        }
        return AbstractC3056.m6668(-3937751348498662823L);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 4);
    }
}
