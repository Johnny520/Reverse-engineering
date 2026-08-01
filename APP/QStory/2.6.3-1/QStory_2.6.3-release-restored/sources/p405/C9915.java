package p405;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import p396.AbstractC9827;
import p407.AbstractC9925;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9915 extends AbstractC9827 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f25813 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Class f25814;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f25815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C9915 m15221(Class cls) {
        C9915 c9915 = new C9915();
        c9915.f25616 = cls;
        if (c9915.f25615 == null) {
            c9915.f25615 = cls.getName();
        }
        return c9915;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Object m15222(Class cls, String str, Object obj) {
        C9915 c9915M15221 = m15221(obj.getClass());
        c9915M15221.f25815 = str;
        c9915M15221.f25814 = cls;
        return c9915M15221.m15224(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m15223(Object obj, String str, Object obj2) {
        C9915 c9915M15221 = m15221(obj.getClass());
        c9915M15221.f25815 = str;
        c9915M15221.f25814 = obj2.getClass();
        try {
            ((Field) c9915M15221.m15164()).set(obj, obj2);
        } catch (IllegalAccessException e) {
            C6755.m11872(e);
        }
    }

    @Override // p396.AbstractC9827
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC9827 mo15166() {
        String strMo15167 = mo15167();
        HashMap map = AbstractC9827.f25611;
        List list = map.containsKey(strMo15167) ? (List) map.get(strMo15167) : null;
        if (list != null && !list.isEmpty()) {
            this.f25614 = list;
            return this;
        }
        this.f25614.addAll(Arrays.asList(this.f25616.getDeclaredFields()));
        final int i = 0;
        this.f25614.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9915 f25816;

            {
                this.f25816 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = i;
                C9915 c9915 = this.f25816;
                Field field = (Field) obj;
                switch (i2) {
                    case 0:
                        if (c9915.f25814 != null && !AbstractC9925.m15241(field.getType(), c9915.f25814)) {
                            break;
                        }
                        break;
                    default:
                        if (c9915.f25815 != null && !field.getName().equals(c9915.f25815)) {
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        final int i2 = 1;
        this.f25614.removeIf(new Predicate(this) { // from class: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C9915 f25816;

            {
                this.f25816 = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i22 = i2;
                C9915 c9915 = this.f25816;
                Field field = (Field) obj;
                switch (i22) {
                    case 0:
                        if (c9915.f25814 != null && !AbstractC9925.m15241(field.getType(), c9915.f25814)) {
                            break;
                        }
                        break;
                    default:
                        if (c9915.f25815 != null && !field.getName().equals(c9915.f25815)) {
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        map.put(mo15167(), this.f25614);
        return this;
    }

    @Override // p396.AbstractC9827
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo15167() {
        return "field:" + this.f25615 + " " + this.f25814 + " " + this.f25815;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m15224(Object obj) {
        try {
            return ((Field) m15164()).get(obj);
        } catch (IllegalAccessException e) {
            C6755.m11872(e);
            return null;
        }
    }
}
