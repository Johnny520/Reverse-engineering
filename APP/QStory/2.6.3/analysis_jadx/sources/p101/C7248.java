package p101;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7248 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int f19309;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int f19310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int f19311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7263 f19312 = new C7263();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ArrayList f19313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C7248 f19314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C7248 f19315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7248 f19316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ArrayList f19317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C7248 f19318;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7248 f19319;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int f19320;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f19321;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int f19322;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int f19323;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int f19324;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int f19325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f19326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f19327;

    static {
        C7249 c7249;
        int i = f19311;
        int i2 = i << 1;
        f19310 = i;
        int i3 = i << 2;
        f19309 = i2;
        int i4 = i << 3;
        f19321 = i3;
        int i5 = i << 4;
        f19320 = i4;
        int i6 = i << 5;
        f19324 = i5;
        f19325 = i6;
        f19311 = i << 7;
        int i7 = (i << 6) - 1;
        f19322 = i7;
        int i8 = i | i2 | i3;
        f19323 = i8;
        f19315 = new C7248(i7);
        f19314 = new C7248(i5 | i6);
        new C7248(i);
        new C7248(i2);
        new C7248(i3);
        f19318 = new C7248(i8);
        new C7248(i4);
        f19319 = new C7248(i5);
        f19316 = new C7248(i6);
        new C7248(i2 | i5 | i6);
        Field[] fields = C7248.class.getFields();
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
            C7249 c72492 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C7248 c7248 = obj instanceof C7248 ? (C7248) obj : null;
            if (c7248 != null) {
                int i9 = c7248.f19326;
                String name = field2.getName();
                name.getClass();
                c72492 = new C7249(i9, name);
            }
            if (c72492 != null) {
                arrayList2.add(c72492);
            }
        }
        f19317 = arrayList2;
        Field[] fields2 = C7248.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC4395.m8907(((Field) obj2).getType(), Integer.TYPE)) {
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
                c7249 = new C7249(iIntValue, name2);
            } else {
                c7249 = null;
            }
            if (c7249 != null) {
                arrayList5.add(c7249);
            }
        }
        f19313 = arrayList5;
    }

    public C7248(int i, List list) {
        list.getClass();
        this.f19327 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((AbstractC7250) it.next()).mo12475();
        }
        this.f19326 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7248.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C7248 c7248 = (C7248) obj;
        return AbstractC4395.m8907(this.f19327, c7248.f19327) && this.f19326 == c7248.f19326;
    }

    public final int hashCode() {
        return (this.f19327.hashCode() * 31) + this.f19326;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = f19317.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C7249) next).f19329 == this.f19326) {
                break;
            }
        }
        C7249 c7249 = (C7249) next;
        String strM8810 = c7249 != null ? c7249.f19328 : null;
        if (strM8810 == null) {
            ArrayList arrayList = new ArrayList();
            for (C7249 c72492 : f19313) {
                String str = m12474(c72492.f19329) ? c72492.f19328 : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strM8810 = AbstractC4344.m8810(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbM11585 = AbstractC6183.m11585("DescriptorKindFilter(", strM8810, ", ");
        sbM11585.append(this.f19327);
        sbM11585.append(')');
        return sbM11585.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12474(int i) {
        return (this.f19326 & i) != 0;
    }

    public C7248(int i) {
        this(i, EmptyList.INSTANCE);
    }
}
