package p117;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8077 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int f19654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int f19655;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int f19656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8092 f19657 = new C8092();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ArrayList f19658;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C8077 f19659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C8077 f19660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8077 f19661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ArrayList f19662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C8077 f19663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C8077 f19664;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int f19665;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f19666;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int f19667;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int f19668;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int f19669;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int f19670;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f19671;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f19672;

    static {
        C8078 c8078;
        int i = f19656;
        int i2 = i << 1;
        f19655 = i;
        int i3 = i << 2;
        f19654 = i2;
        int i4 = i << 3;
        f19666 = i3;
        int i5 = i << 4;
        f19665 = i4;
        int i6 = i << 5;
        f19669 = i5;
        f19670 = i6;
        f19656 = i << 7;
        int i7 = (i << 6) - 1;
        f19667 = i7;
        int i8 = i | i2 | i3;
        f19668 = i8;
        f19660 = new C8077(i7);
        f19659 = new C8077(i5 | i6);
        new C8077(i);
        new C8077(i2);
        new C8077(i3);
        f19663 = new C8077(i8);
        new C8077(i4);
        f19664 = new C8077(i5);
        f19661 = new C8077(i6);
        new C8077(i2 | i5 | i6);
        Field[] fields = C8077.class.getFields();
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
            C8078 c80782 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C8077 c8077 = obj instanceof C8077 ? (C8077) obj : null;
            if (c8077 != null) {
                int i9 = c8077.f19671;
                String name = field2.getName();
                name.getClass();
                c80782 = new C8078(i9, name);
            }
            if (c80782 != null) {
                arrayList2.add(c80782);
            }
        }
        f19662 = arrayList2;
        Field[] fields2 = C8077.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC5227.m9466(((Field) obj2).getType(), Integer.TYPE)) {
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
                c8078 = new C8078(iIntValue, name2);
            } else {
                c8078 = null;
            }
            if (c8078 != null) {
                arrayList5.add(c8078);
            }
        }
        f19658 = arrayList5;
    }

    public C8077(int i, List list) {
        list.getClass();
        this.f19672 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((AbstractC8079) it.next()).mo13034();
        }
        this.f19671 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8077.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C8077 c8077 = (C8077) obj;
        return AbstractC5227.m9466(this.f19672, c8077.f19672) && this.f19671 == c8077.f19671;
    }

    public final int hashCode() {
        return (this.f19672.hashCode() * 31) + this.f19671;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = f19662.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C8078) next).f19674 == this.f19671) {
                break;
            }
        }
        C8078 c8078 = (C8078) next;
        String strM9369 = c8078 != null ? c8078.f19673 : null;
        if (strM9369 == null) {
            ArrayList arrayList = new ArrayList();
            for (C8078 c80782 : f19658) {
                String str = m13033(c80782.f19674) ? c80782.f19673 : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strM9369 = AbstractC5176.m9369(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbM12144 = AbstractC7012.m12144("DescriptorKindFilter(", strM9369, ", ");
        sbM12144.append(this.f19672);
        sbM12144.append(')');
        return sbM12144.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13033(int i) {
        return (this.f19671 & i) != 0;
    }

    public C8077(int i) {
        this(i, EmptyList.INSTANCE);
    }
}
