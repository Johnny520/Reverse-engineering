package p405;

import androidx.activity.AbstractC0900;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import p332.C9496;
import p396.AbstractC9827;
import p407.AbstractC9925;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9921 extends AbstractC9827 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final /* synthetic */ int f25825 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String f25826;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Integer f25827;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Class f25828;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Class[] f25829;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C9921 m15230(Object obj) {
        return m15231(obj.getClass());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C9921 m15231(Class cls) {
        C9921 c9921 = new C9921();
        c9921.f25616 = cls;
        if (c9921.f25615 == null) {
            c9921.f25615 = cls.getName();
        }
        return c9921;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C9921 m15232(String str) {
        return m15231(AbstractC9919.m15228(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m15233(Object obj, Object... objArr) {
        try {
            return ((Method) m15164()).invoke(obj, objArr);
        } catch (Exception e) {
            C6755.m11872(e);
            return null;
        }
    }

    @Override // p396.AbstractC9827
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC9827 mo15166() {
        String strMo15167 = mo15167();
        HashMap map = AbstractC9827.f25610;
        List list = map.containsKey(strMo15167) ? (List) map.get(strMo15167) : null;
        if (list != null && !list.isEmpty()) {
            this.f25614 = list;
            return this;
        }
        this.f25614.addAll(Arrays.asList(this.f25616.getDeclaredMethods()));
        final int i = 0;
        this.f25614.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9921 f25830;

            {
                this.f25830 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = i;
                C9921 c9921 = this.f25830;
                Method method = (Method) obj;
                switch (i2) {
                    case 0:
                        if (c9921.f25826 == null || method.getName().equals(c9921.f25826)) {
                        }
                        break;
                    case 1:
                        if (c9921.f25828 == null || AbstractC9925.m15241(method.getReturnType(), c9921.f25828)) {
                        }
                        break;
                    case 2:
                        if (c9921.f25827 == null || method.getParameterCount() == c9921.f25827.intValue()) {
                        }
                        break;
                    default:
                        if (c9921.f25829 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9921.f25829[i3];
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
        this.f25614.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9921 f25830;

            {
                this.f25830 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i2;
                C9921 c9921 = this.f25830;
                Method method = (Method) obj;
                switch (i22) {
                    case 0:
                        if (c9921.f25826 == null || method.getName().equals(c9921.f25826)) {
                        }
                        break;
                    case 1:
                        if (c9921.f25828 == null || AbstractC9925.m15241(method.getReturnType(), c9921.f25828)) {
                        }
                        break;
                    case 2:
                        if (c9921.f25827 == null || method.getParameterCount() == c9921.f25827.intValue()) {
                        }
                        break;
                    default:
                        if (c9921.f25829 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                Class<?> cls = parameterTypes[i3];
                                Class cls2 = c9921.f25829[i3];
                                if (cls2 != C9496.class && !AbstractC9925.m15241(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        final int i3 = 2;
        this.f25614.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9921 f25830;

            {
                this.f25830 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i3;
                C9921 c9921 = this.f25830;
                Method method = (Method) obj;
                switch (i22) {
                    case 0:
                        if (c9921.f25826 == null || method.getName().equals(c9921.f25826)) {
                        }
                        break;
                    case 1:
                        if (c9921.f25828 == null || AbstractC9925.m15241(method.getReturnType(), c9921.f25828)) {
                        }
                        break;
                    case 2:
                        if (c9921.f25827 == null || method.getParameterCount() == c9921.f25827.intValue()) {
                        }
                        break;
                    default:
                        if (c9921.f25829 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i32 = 0; i32 < parameterTypes.length; i32++) {
                                Class<?> cls = parameterTypes[i32];
                                Class cls2 = c9921.f25829[i32];
                                if (cls2 != C9496.class && !AbstractC9925.m15241(cls, cls2)) {
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        });
        final int i4 = 3;
        this.f25614.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪苏世哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9921 f25830;

            {
                this.f25830 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i4;
                C9921 c9921 = this.f25830;
                Method method = (Method) obj;
                switch (i22) {
                    case 0:
                        if (c9921.f25826 == null || method.getName().equals(c9921.f25826)) {
                        }
                        break;
                    case 1:
                        if (c9921.f25828 == null || AbstractC9925.m15241(method.getReturnType(), c9921.f25828)) {
                        }
                        break;
                    case 2:
                        if (c9921.f25827 == null || method.getParameterCount() == c9921.f25827.intValue()) {
                        }
                        break;
                    default:
                        if (c9921.f25829 != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            for (int i32 = 0; i32 < parameterTypes.length; i32++) {
                                Class<?> cls = parameterTypes[i32];
                                Class cls2 = c9921.f25829[i32];
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
        return this;
    }

    @Override // p396.AbstractC9827
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo15167() {
        StringBuilder sb = new StringBuilder("method:");
        sb.append(this.f25615);
        sb.append(" ");
        sb.append(this.f25828);
        sb.append(" ");
        sb.append(this.f25826);
        sb.append("(");
        sb.append(this.f25827);
        return AbstractC0900.m711(sb, Arrays.toString(this.f25829), ")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m15234(Class... clsArr) {
        this.f25829 = clsArr;
        this.f25827 = Integer.valueOf(clsArr.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m15235(Object obj, Object... objArr) {
        try {
            return ((Method) m15164()).invoke(obj, objArr);
        } catch (Exception e) {
            C6755.m11872(e);
            return null;
        }
    }
}
