package p392;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import p391.AbstractC9115;
import p393.AbstractC9126;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9125 extends AbstractC9126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final /* synthetic */ int f25503 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String f25504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Integer f25505;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Class f25506;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Class[] f25507;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C9125 m14679(Object obj) {
        return m14680(obj.getClass());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C9125 m14680(Class cls) {
        C9125 c9125 = new C9125();
        c9125.f25514 = cls;
        if (c9125.f25513 == null) {
            c9125.f25513 = cls.getName();
        }
        return c9125;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C9125 m14681(String str) {
        return m14680(AbstractC9121.m14657(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m14682(Object obj, Object... objArr) {
        try {
            return ((Method) m14686()).invoke(obj, objArr);
        } catch (Exception e) {
            C5919.m11252(e);
            return null;
        }
    }

    @Override // p393.AbstractC9126
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC9126 mo14651() {
        String strMo14652 = mo14652();
        HashMap map = AbstractC9126.f25508;
        List list = map.containsKey(strMo14652) ? (List) map.get(strMo14652) : null;
        if (list != null && !list.isEmpty()) {
            this.f25512 = list;
            return this;
        }
        this.f25512.addAll(Arrays.asList(this.f25514.getDeclaredMethods()));
        final int i = 0;
        this.f25512.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪苏世兰哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9125 f25500;

            {
                this.f25500 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = i;
                C9125 c9125 = this.f25500;
                Method method = (Method) obj;
                switch (i2) {
                    case 0:
                        if (c9125.f25504 == null || method.getName().equals(c9125.f25504)) {
                        }
                        break;
                    case 1:
                        if (c9125.f25506 == null || AbstractC9115.m14645(method.getReturnType(), c9125.f25506)) {
                        }
                        break;
                    case 2:
                        if (c9125.f25505 == null || method.getParameterCount() == c9125.f25505.intValue()) {
                        }
                        break;
                    default:
                        if (c9125.f25507 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9125.f25507[i3];
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
        this.f25512.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪苏世兰哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9125 f25500;

            {
                this.f25500 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i2;
                C9125 c9125 = this.f25500;
                Method method = (Method) obj;
                switch (i22) {
                    case 0:
                        if (c9125.f25504 == null || method.getName().equals(c9125.f25504)) {
                        }
                        break;
                    case 1:
                        if (c9125.f25506 == null || AbstractC9115.m14645(method.getReturnType(), c9125.f25506)) {
                        }
                        break;
                    case 2:
                        if (c9125.f25505 == null || method.getParameterCount() == c9125.f25505.intValue()) {
                        }
                        break;
                    default:
                        if (c9125.f25507 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9125.f25507[i3];
                                if (cls2 != AbstractC9124.class && !AbstractC9115.m14645(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        final int i3 = 2;
        this.f25512.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪苏世兰哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9125 f25500;

            {
                this.f25500 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i3;
                C9125 c9125 = this.f25500;
                Method method = (Method) obj;
                switch (i22) {
                    case 0:
                        if (c9125.f25504 == null || method.getName().equals(c9125.f25504)) {
                        }
                        break;
                    case 1:
                        if (c9125.f25506 == null || AbstractC9115.m14645(method.getReturnType(), c9125.f25506)) {
                        }
                        break;
                    case 2:
                        if (c9125.f25505 == null || method.getParameterCount() == c9125.f25505.intValue()) {
                        }
                        break;
                    default:
                        if (c9125.f25507 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i32 = 0; i32 < parameterTypes.length; i32++) {
                                Class<?> cls = parameterTypes[i32];
                                Class cls2 = c9125.f25507[i32];
                                if (cls2 != AbstractC9124.class && !AbstractC9115.m14645(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        final int i4 = 3;
        this.f25512.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪苏世兰哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9125 f25500;

            {
                this.f25500 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i4;
                C9125 c9125 = this.f25500;
                Method method = (Method) obj;
                switch (i22) {
                    case 0:
                        if (c9125.f25504 == null || method.getName().equals(c9125.f25504)) {
                        }
                        break;
                    case 1:
                        if (c9125.f25506 == null || AbstractC9115.m14645(method.getReturnType(), c9125.f25506)) {
                        }
                        break;
                    case 2:
                        if (c9125.f25505 == null || method.getParameterCount() == c9125.f25505.intValue()) {
                        }
                        break;
                    default:
                        if (c9125.f25507 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i32 = 0; i32 < parameterTypes.length; i32++) {
                                Class<?> cls = parameterTypes[i32];
                                Class cls2 = c9125.f25507[i32];
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
        return this;
    }

    @Override // p393.AbstractC9126
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14652() {
        StringBuilder sb = new StringBuilder("method:");
        sb.append(this.f25513);
        sb.append(" ");
        sb.append(this.f25506);
        sb.append(" ");
        sb.append(this.f25504);
        sb.append("(");
        sb.append(this.f25505);
        return AbstractC0053.m146(sb, Arrays.toString(this.f25507), ")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m14683(Class... clsArr) {
        this.f25507 = clsArr;
        this.f25505 = Integer.valueOf(clsArr.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m14684(Object obj, Object... objArr) {
        try {
            return ((Method) m14686()).invoke(obj, objArr);
        } catch (Exception e) {
            C5919.m11252(e);
            return null;
        }
    }
}
