package p405;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import p332.C9496;
import p396.AbstractC9827;
import p407.AbstractC9925;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9917 extends AbstractC9827 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f25818;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Class[] f25819;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m15225(Object[] objArr, Class[] clsArr, Class cls) {
        C9917 c9917 = new C9917();
        c9917.f25616 = cls;
        if (c9917.f25615 == null) {
            c9917.f25615 = cls.getName();
        }
        c9917.f25819 = clsArr;
        c9917.f25818 = clsArr.length;
        return c9917.m15227(objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m15226(Class cls, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return m15225(objArr, clsArr, cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m15227(Object... objArr) {
        try {
            return this.f25616.cast(((Constructor) m15164()).newInstance(objArr));
        } catch (Exception e) {
            C6755.m11872(e);
            return null;
        }
    }

    @Override // p396.AbstractC9827
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC9827 mo15166() {
        String strMo15167 = mo15167();
        HashMap map = AbstractC9827.f25612;
        List list = map.containsKey(strMo15167) ? (List) map.get(strMo15167) : null;
        if (list != null && !list.isEmpty()) {
            this.f25614 = list;
            return this;
        }
        this.f25614.addAll(Arrays.asList(this.f25616.getDeclaredConstructors()));
        final int i = 0;
        this.f25614.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9917 f25820;

            {
                this.f25820 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = i;
                C9917 c9917 = this.f25820;
                Constructor constructor = (Constructor) obj;
                switch (i2) {
                    case 0:
                        if (c9917.f25818 == 0 || constructor.getParameterCount() == c9917.f25818) {
                        }
                        break;
                    default:
                        if (c9917.f25819 != null) {
                            Class<?>[] parameterTypes = constructor.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9917.f25819[i3];
                                if (cls2 != C9496.class && !AbstractC9925.m15241(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        final int i2 = 1;
        this.f25614.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9917 f25820;

            {
                this.f25820 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i2;
                C9917 c9917 = this.f25820;
                Constructor constructor = (Constructor) obj;
                switch (i22) {
                    case 0:
                        if (c9917.f25818 == 0 || constructor.getParameterCount() == c9917.f25818) {
                        }
                        break;
                    default:
                        if (c9917.f25819 != null) {
                            Class<?>[] parameterTypes = constructor.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9917.f25819[i3];
                                if (cls2 != C9496.class && !AbstractC9925.m15241(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        map.put(mo15167(), this.f25614);
        return null;
    }

    @Override // p396.AbstractC9827
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo15167() {
        return "constructor:" + this.f25615 + " " + this.f25818 + " " + Arrays.toString(this.f25819);
    }
}
