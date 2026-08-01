package p389;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import p316.C8667;
import p380.AbstractC8998;
import p391.AbstractC9096;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9088 extends AbstractC8998 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f25473;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Class[] f25474;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m14666(Object[] objArr, Class[] clsArr, Class cls) {
        C9088 c9088 = new C9088();
        c9088.f25271 = cls;
        if (c9088.f25270 == null) {
            c9088.f25270 = cls.getName();
        }
        c9088.f25474 = clsArr;
        c9088.f25473 = clsArr.length;
        return c9088.m14668(objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m14667(Class cls, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return m14666(objArr, clsArr, cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m14668(Object... objArr) {
        try {
            return this.f25271.cast(((Constructor) m14605()).newInstance(objArr));
        } catch (Exception e) {
            C5925.m11313(e);
            return null;
        }
    }

    @Override // p380.AbstractC8998
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC8998 mo14607() {
        String strMo14608 = mo14608();
        HashMap map = AbstractC8998.f25267;
        List list = map.containsKey(strMo14608) ? (List) map.get(strMo14608) : null;
        if (list != null && !list.isEmpty()) {
            this.f25269 = list;
            return this;
        }
        this.f25269.addAll(Arrays.asList(this.f25271.getDeclaredConstructors()));
        final int i = 0;
        this.f25269.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9088 f25475;

            {
                this.f25475 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = i;
                C9088 c9088 = this.f25475;
                Constructor constructor = (Constructor) obj;
                switch (i2) {
                    case 0:
                        if (c9088.f25473 == 0 || constructor.getParameterCount() == c9088.f25473) {
                        }
                        break;
                    default:
                        if (c9088.f25474 != null) {
                            Class<?>[] parameterTypes = constructor.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9088.f25474[i3];
                                if (cls2 != C8667.class && !AbstractC9096.m14682(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        final int i2 = 1;
        this.f25269.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9088 f25475;

            {
                this.f25475 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i2;
                C9088 c9088 = this.f25475;
                Constructor constructor = (Constructor) obj;
                switch (i22) {
                    case 0:
                        if (c9088.f25473 == 0 || constructor.getParameterCount() == c9088.f25473) {
                        }
                        break;
                    default:
                        if (c9088.f25474 != null) {
                            Class<?>[] parameterTypes = constructor.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9088.f25474[i3];
                                if (cls2 != C8667.class && !AbstractC9096.m14682(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        map.put(mo14608(), this.f25269);
        return null;
    }

    @Override // p380.AbstractC8998
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14608() {
        return "constructor:" + this.f25270 + " " + this.f25473 + " " + Arrays.toString(this.f25474);
    }
}
