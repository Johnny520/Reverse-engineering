package p392;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import p391.AbstractC9115;
import p393.AbstractC9126;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9119 extends AbstractC9126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f25493;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Class[] f25494;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m14654(Object[] objArr, Class[] clsArr, Class cls) {
        C9119 c9119 = new C9119();
        c9119.f25514 = cls;
        if (c9119.f25513 == null) {
            c9119.f25513 = cls.getName();
        }
        c9119.f25494 = clsArr;
        c9119.f25493 = clsArr.length;
        return c9119.m14656(objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m14655(Class cls, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return m14654(objArr, clsArr, cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m14656(Object... objArr) {
        try {
            return this.f25514.cast(((Constructor) m14686()).newInstance(objArr));
        } catch (Exception e) {
            C5919.m11252(e);
            return null;
        }
    }

    @Override // p393.AbstractC9126
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC9126 mo14651() {
        String strMo14652 = mo14652();
        HashMap map = AbstractC9126.f25510;
        List list = map.containsKey(strMo14652) ? (List) map.get(strMo14652) : null;
        if (list != null && !list.isEmpty()) {
            this.f25512 = list;
            return this;
        }
        this.f25512.addAll(Arrays.asList(this.f25514.getDeclaredConstructors()));
        final int i = 0;
        this.f25512.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9119 f25495;

            {
                this.f25495 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = i;
                C9119 c9119 = this.f25495;
                Constructor constructor = (Constructor) obj;
                switch (i2) {
                    case 0:
                        if (c9119.f25493 == 0 || constructor.getParameterCount() == c9119.f25493) {
                        }
                        break;
                    default:
                        if (c9119.f25494 != null) {
                            Class<?>[] parameterTypes = constructor.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9119.f25494[i3];
                                if (cls2 != AbstractC9124.class && !AbstractC9115.m14645(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        final int i2 = 1;
        this.f25512.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9119 f25495;

            {
                this.f25495 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i2;
                C9119 c9119 = this.f25495;
                Constructor constructor = (Constructor) obj;
                switch (i22) {
                    case 0:
                        if (c9119.f25493 == 0 || constructor.getParameterCount() == c9119.f25493) {
                        }
                        break;
                    default:
                        if (c9119.f25494 != null) {
                            Class<?>[] parameterTypes = constructor.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9119.f25494[i3];
                                if (cls2 != AbstractC9124.class && !AbstractC9115.m14645(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        map.put(mo14652(), this.f25512);
        return null;
    }

    @Override // p393.AbstractC9126
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14652() {
        return "constructor:" + this.f25513 + " " + this.f25493 + " " + Arrays.toString(this.f25494);
    }
}
