package p392;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import p391.AbstractC9115;
import p393.AbstractC9126;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9117 extends AbstractC9126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f25488 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Class f25489;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f25490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C9117 m14648(Class cls) {
        C9117 c9117 = new C9117();
        c9117.f25514 = cls;
        if (c9117.f25513 == null) {
            c9117.f25513 = cls.getName();
        }
        return c9117;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m14649(Class cls, String str, Object obj) {
        C9117 c9117M14648 = m14648(obj.getClass());
        c9117M14648.f25490 = str;
        c9117M14648.f25489 = cls;
        return c9117M14648.m14653(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m14650(Object obj, String str, Object obj2) {
        C9117 c9117M14648 = m14648(obj.getClass());
        c9117M14648.f25490 = str;
        c9117M14648.f25489 = obj2.getClass();
        try {
            ((Field) c9117M14648.m14686()).set(obj, obj2);
        } catch (IllegalAccessException e) {
            C5919.m11252(e);
        }
    }

    @Override // p393.AbstractC9126
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC9126 mo14651() {
        String strMo14652 = mo14652();
        HashMap map = AbstractC9126.f25509;
        List list = map.containsKey(strMo14652) ? (List) map.get(strMo14652) : null;
        if (list != null && !list.isEmpty()) {
            this.f25512 = list;
            return this;
        }
        this.f25512.addAll(Arrays.asList(this.f25514.getDeclaredFields()));
        final int i = 0;
        this.f25512.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9117 f25491;

            {
                this.f25491 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = i;
                C9117 c9117 = this.f25491;
                Field field = (Field) obj;
                switch (i2) {
                    case 0:
                        if (c9117.f25489 != null && !AbstractC9115.m14645(field.getType(), c9117.f25489)) {
                            break;
                        }
                        break;
                    default:
                        if (c9117.f25490 != null && !field.getName().equals(c9117.f25490)) {
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        final int i2 = 1;
        this.f25512.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9117 f25491;

            {
                this.f25491 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i2;
                C9117 c9117 = this.f25491;
                Field field = (Field) obj;
                switch (i22) {
                    case 0:
                        if (c9117.f25489 != null && !AbstractC9115.m14645(field.getType(), c9117.f25489)) {
                            break;
                        }
                        break;
                    default:
                        if (c9117.f25490 != null && !field.getName().equals(c9117.f25490)) {
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        map.put(mo14652(), this.f25512);
        return this;
    }

    @Override // p393.AbstractC9126
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String mo14652() {
        return "field:" + this.f25513 + " " + this.f25489 + " " + this.f25490;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m14653(Object obj) {
        try {
            return ((Field) m14686()).get(obj);
        } catch (IllegalAccessException e) {
            C5919.m11252(e);
            return null;
        }
    }
}
