package p101;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7247 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int f19314;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int f19315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int f19316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7262 f19317 = new C7262();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ArrayList f19318;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C7247 f19319;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C7247 f19320;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7247 f19321;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ArrayList f19322;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C7247 f19323;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7247 f19324;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int f19325;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f19326;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int f19327;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int f19328;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int f19329;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int f19330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f19331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f19332;

    static {
        C7248 c7248;
        int i = f19316;
        int i2 = i << 1;
        f19315 = i;
        int i3 = i << 2;
        f19314 = i2;
        int i4 = i << 3;
        f19326 = i3;
        int i5 = i << 4;
        f19325 = i4;
        int i6 = i << 5;
        f19329 = i5;
        f19330 = i6;
        f19316 = i << 7;
        int i7 = (i << 6) - 1;
        f19327 = i7;
        int i8 = i | i2 | i3;
        f19328 = i8;
        f19320 = new C7247(i7);
        f19319 = new C7247(i5 | i6);
        new C7247(i);
        new C7247(i2);
        new C7247(i3);
        f19323 = new C7247(i8);
        new C7247(i4);
        f19324 = new C7247(i5);
        f19321 = new C7247(i6);
        new C7247(i2 | i5 | i6);
        Field[] fields = C7247.class.getFields();
        fields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            C7248 c72482 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C7247 c7247 = obj instanceof C7247 ? (C7247) obj : null;
            if (c7247 != null) {
                int i9 = c7247.f19331;
                String name = field2.getName();
                name.getClass();
                c72482 = new C7248(i9, name);
            }
            if (c72482 != null) {
                arrayList2.add(c72482);
            }
        }
        f19322 = arrayList2;
        Field[] fields2 = C7247.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC4394.m8917(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            obj3.getClass();
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                name2.getClass();
                c7248 = new C7248(iIntValue, name2);
            } else {
                c7248 = null;
            }
            if (c7248 != null) {
                arrayList5.add(c7248);
            }
        }
        f19318 = arrayList5;
    }

    public C7247(int i, List list) {
        list.getClass();
        this.f19332 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((AbstractC7249) it.next()).mo12448();
        }
        this.f19331 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7247.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C7247 c7247 = (C7247) obj;
        return AbstractC4394.m8917(this.f19332, c7247.f19332) && this.f19331 == c7247.f19331;
    }

    public final int hashCode() {
        return (this.f19332.hashCode() * 31) + this.f19331;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = f19322.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C7248) next).f19334 == this.f19331) {
                break;
            }
        }
        C7248 c7248 = (C7248) next;
        String strM8813 = c7248 != null ? c7248.f19333 : null;
        if (strM8813 == null) {
            ArrayList arrayList = new ArrayList();
            for (C7248 c72482 : f19318) {
                String str = m12447(c72482.f19334) ? c72482.f19333 : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strM8813 = AbstractC4343.m8813(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbM11550 = AbstractC6136.m11550("DescriptorKindFilter(", strM8813, ", ");
        sbM11550.append(this.f19332);
        sbM11550.append(')');
        return sbM11550.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12447(int i) {
        return (this.f19331 & i) != 0;
    }

    public C7247(int i) {
        this(i, EmptyList.INSTANCE);
    }
}
