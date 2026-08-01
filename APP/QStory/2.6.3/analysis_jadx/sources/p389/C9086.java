package p389;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import p380.AbstractC8998;
import p391.AbstractC9096;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9086 extends AbstractC8998 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f25468 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Class f25469;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f25470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C9086 m14662(Class cls) {
        C9086 c9086 = new C9086();
        c9086.f25271 = cls;
        if (c9086.f25270 == null) {
            c9086.f25270 = cls.getName();
        }
        return c9086;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m14663(Class cls, String str, Object obj) {
        C9086 c9086M14662 = m14662(obj.getClass());
        c9086M14662.f25470 = str;
        c9086M14662.f25469 = cls;
        return c9086M14662.m14665(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m14664(Object obj, String str, Object obj2) {
        C9086 c9086M14662 = m14662(obj.getClass());
        c9086M14662.f25470 = str;
        c9086M14662.f25469 = obj2.getClass();
        try {
            ((Field) c9086M14662.m14605()).set(obj, obj2);
        } catch (IllegalAccessException e) {
            C5925.m11313(e);
        }
    }

    @Override // p380.AbstractC8998
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC8998 mo14607() {
        String strMo14608 = mo14608();
        HashMap map = AbstractC8998.f25266;
        List list = map.containsKey(strMo14608) ? (List) map.get(strMo14608) : null;
        if (list != null && !list.isEmpty()) {
            this.f25269 = list;
            return this;
        }
        this.f25269.addAll(Arrays.asList(this.f25271.getDeclaredFields()));
        final int i = 0;
        this.f25269.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9086 f25471;

            {
                this.f25471 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = i;
                C9086 c9086 = this.f25471;
                Field field = (Field) obj;
                switch (i2) {
                    case 0:
                        if (c9086.f25469 != null && !AbstractC9096.m14682(field.getType(), c9086.f25469)) {
                            break;
                        }
                        break;
                    default:
                        if (c9086.f25470 != null && !field.getName().equals(c9086.f25470)) {
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        final int i2 = 1;
        this.f25269.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9086 f25471;

            {
                this.f25471 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i2;
                C9086 c9086 = this.f25471;
                Field field = (Field) obj;
                switch (i22) {
                    case 0:
                        if (c9086.f25469 != null && !AbstractC9096.m14682(field.getType(), c9086.f25469)) {
                            break;
                        }
                        break;
                    default:
                        if (c9086.f25470 != null && !field.getName().equals(c9086.f25470)) {
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        map.put(mo14608(), this.f25269);
        return this;
    }

    @Override // p380.AbstractC8998
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14608() {
        return "field:" + this.f25270 + " " + this.f25469 + " " + this.f25470;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m14665(Object obj) {
        try {
            return ((Field) m14605()).get(obj);
        } catch (IllegalAccessException e) {
            C5925.m11313(e);
            return null;
        }
    }
}
