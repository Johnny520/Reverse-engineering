package p389;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import p316.C8667;
import p380.AbstractC8998;
import p391.AbstractC9096;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9092 extends AbstractC8998 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final /* synthetic */ int f25480 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String f25481;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Integer f25482;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Class f25483;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Class[] f25484;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C9092 m14671(Object obj) {
        return m14672(obj.getClass());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C9092 m14672(Class cls) {
        C9092 c9092 = new C9092();
        c9092.f25271 = cls;
        if (c9092.f25270 == null) {
            c9092.f25270 = cls.getName();
        }
        return c9092;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C9092 m14673(String str) {
        return m14672(AbstractC9090.m14669(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m14674(Object obj, Object... objArr) {
        try {
            return ((Method) m14605()).invoke(obj, objArr);
        } catch (Exception e) {
            C5925.m11313(e);
            return null;
        }
    }

    @Override // p380.AbstractC8998
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC8998 mo14607() {
        String strMo14608 = mo14608();
        HashMap map = AbstractC8998.f25265;
        List list = map.containsKey(strMo14608) ? (List) map.get(strMo14608) : null;
        if (list != null && !list.isEmpty()) {
            this.f25269 = list;
            return this;
        }
        this.f25269.addAll(Arrays.asList(this.f25271.getDeclaredMethods()));
        final int i = 0;
        this.f25269.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9092 f25485;

            {
                this.f25485 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = i;
                C9092 c9092 = this.f25485;
                Method method = (Method) obj;
                switch (i2) {
                    case 0:
                        if (c9092.f25481 == null || method.getName().equals(c9092.f25481)) {
                        }
                        break;
                    case 1:
                        if (c9092.f25483 == null || AbstractC9096.m14682(method.getReturnType(), c9092.f25483)) {
                        }
                        break;
                    case 2:
                        if (c9092.f25482 == null || method.getParameterCount() == c9092.f25482.intValue()) {
                        }
                        break;
                    default:
                        if (c9092.f25484 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9092.f25484[i3];
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
        this.f25269.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9092 f25485;

            {
                this.f25485 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i2;
                C9092 c9092 = this.f25485;
                Method method = (Method) obj;
                switch (i22) {
                    case 0:
                        if (c9092.f25481 == null || method.getName().equals(c9092.f25481)) {
                        }
                        break;
                    case 1:
                        if (c9092.f25483 == null || AbstractC9096.m14682(method.getReturnType(), c9092.f25483)) {
                        }
                        break;
                    case 2:
                        if (c9092.f25482 == null || method.getParameterCount() == c9092.f25482.intValue()) {
                        }
                        break;
                    default:
                        if (c9092.f25484 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9092.f25484[i3];
                                if (cls2 != C8667.class && !AbstractC9096.m14682(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        final int i3 = 2;
        this.f25269.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9092 f25485;

            {
                this.f25485 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i3;
                C9092 c9092 = this.f25485;
                Method method = (Method) obj;
                switch (i22) {
                    case 0:
                        if (c9092.f25481 == null || method.getName().equals(c9092.f25481)) {
                        }
                        break;
                    case 1:
                        if (c9092.f25483 == null || AbstractC9096.m14682(method.getReturnType(), c9092.f25483)) {
                        }
                        break;
                    case 2:
                        if (c9092.f25482 == null || method.getParameterCount() == c9092.f25482.intValue()) {
                        }
                        break;
                    default:
                        if (c9092.f25484 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i32 = 0; i32 < parameterTypes.length; i32++) {
                                Class<?> cls = parameterTypes[i32];
                                Class cls2 = c9092.f25484[i32];
                                if (cls2 != C8667.class && !AbstractC9096.m14682(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        final int i4 = 3;
        this.f25269.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9092 f25485;

            {
                this.f25485 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i4;
                C9092 c9092 = this.f25485;
                Method method = (Method) obj;
                switch (i22) {
                    case 0:
                        if (c9092.f25481 == null || method.getName().equals(c9092.f25481)) {
                        }
                        break;
                    case 1:
                        if (c9092.f25483 == null || AbstractC9096.m14682(method.getReturnType(), c9092.f25483)) {
                        }
                        break;
                    case 2:
                        if (c9092.f25482 == null || method.getParameterCount() == c9092.f25482.intValue()) {
                        }
                        break;
                    default:
                        if (c9092.f25484 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i32 = 0; i32 < parameterTypes.length; i32++) {
                                Class<?> cls = parameterTypes[i32];
                                Class cls2 = c9092.f25484[i32];
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
        return this;
    }

    @Override // p380.AbstractC8998
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14608() {
        StringBuilder sb = new StringBuilder("method:");
        sb.append(this.f25270);
        sb.append(" ");
        sb.append(this.f25483);
        sb.append(" ");
        sb.append(this.f25481);
        sb.append("(");
        sb.append(this.f25482);
        return AbstractC0053.m151(sb, Arrays.toString(this.f25484), ")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m14675(Class... clsArr) {
        this.f25484 = clsArr;
        this.f25482 = Integer.valueOf(clsArr.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m14676(Object obj, Object... objArr) {
        try {
            return ((Method) m14605()).invoke(obj, objArr);
        } catch (Exception e) {
            C5925.m11313(e);
            return null;
        }
    }
}
