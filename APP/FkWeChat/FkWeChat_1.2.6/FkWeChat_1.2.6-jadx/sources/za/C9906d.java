package za;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: za.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9906d {

    /* JADX INFO: renamed from: c */
    public static final a f33395c;

    /* JADX INFO: renamed from: d */
    public static int f33396d;

    /* JADX INFO: renamed from: e */
    public static final int f33397e;

    /* JADX INFO: renamed from: f */
    public static final int f33398f;

    /* JADX INFO: renamed from: g */
    public static final int f33399g;

    /* JADX INFO: renamed from: h */
    public static final int f33400h;

    /* JADX INFO: renamed from: i */
    public static final int f33401i;

    /* JADX INFO: renamed from: j */
    public static final int f33402j;

    /* JADX INFO: renamed from: k */
    public static final int f33403k;

    /* JADX INFO: renamed from: l */
    public static final int f33404l;

    /* JADX INFO: renamed from: m */
    public static final int f33405m;

    /* JADX INFO: renamed from: n */
    public static final int f33406n;

    /* JADX INFO: renamed from: o */
    public static final C9906d f33407o;

    /* JADX INFO: renamed from: p */
    public static final C9906d f33408p;

    /* JADX INFO: renamed from: q */
    public static final C9906d f33409q;

    /* JADX INFO: renamed from: r */
    public static final C9906d f33410r;

    /* JADX INFO: renamed from: s */
    public static final C9906d f33411s;

    /* JADX INFO: renamed from: t */
    public static final C9906d f33412t;

    /* JADX INFO: renamed from: u */
    public static final C9906d f33413u;

    /* JADX INFO: renamed from: v */
    public static final C9906d f33414v;

    /* JADX INFO: renamed from: w */
    public static final C9906d f33415w;

    /* JADX INFO: renamed from: x */
    public static final C9906d f33416x;

    /* JADX INFO: renamed from: y */
    public static final List f33417y;

    /* JADX INFO: renamed from: z */
    public static final List f33418z;

    /* JADX INFO: renamed from: a */
    public final List f33419a;

    /* JADX INFO: renamed from: b */
    public final int f33420b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a.C10260a c10260a;
        a.C10260a c10260a2;
        a aVar = new a(null);
        f33395c = aVar;
        f33396d = 1;
        int iM38446j = aVar.m38446j();
        f33397e = iM38446j;
        int iM38446j2 = aVar.m38446j();
        f33398f = iM38446j2;
        int iM38446j3 = aVar.m38446j();
        f33399g = iM38446j3;
        int iM38446j4 = aVar.m38446j();
        f33400h = iM38446j4;
        int iM38446j5 = aVar.m38446j();
        f33401i = iM38446j5;
        int iM38446j6 = aVar.m38446j();
        f33402j = iM38446j6;
        int iM38446j7 = aVar.m38446j() - 1;
        f33403k = iM38446j7;
        int i10 = iM38446j | iM38446j2 | iM38446j3;
        f33404l = i10;
        int i11 = iM38446j2 | iM38446j5 | iM38446j6;
        f33405m = i11;
        int i12 = iM38446j5 | iM38446j6;
        f33406n = i12;
        int i13 = 2;
        f33407o = new C9906d(iM38446j7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f33408p = new C9906d(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f33409q = new C9906d(iM38446j, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f33410r = new C9906d(iM38446j2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f33411s = new C9906d(iM38446j3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f33412t = new C9906d(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f33413u = new C9906d(iM38446j4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f33414v = new C9906d(iM38446j5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f33415w = new C9906d(iM38446j6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f33416x = new C9906d(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = C9906d.class.getFields();
        fields.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            C9906d c9906d = obj instanceof C9906d ? (C9906d) obj : null;
            if (c9906d != null) {
                int i14 = c9906d.f33420b;
                String name = field2.getName();
                name.getClass();
                c10260a2 = new a.C10260a(i14, name);
            } else {
                c10260a2 = null;
            }
            if (c10260a2 != null) {
                arrayList2.add(c10260a2);
            }
        }
        f33417y = arrayList2;
        Field[] fields2 = C9906d.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC1061t.m3842c(((Field) obj2).getType(), Integer.TYPE)) {
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
                c10260a = new a.C10260a(iIntValue, name2);
            } else {
                c10260a = null;
            }
            if (c10260a != null) {
                arrayList5.add(c10260a);
            }
        }
        f33418z = arrayList5;
    }

    public C9906d(int i10, List list) {
        list.getClass();
        this.f33419a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i10 &= ~((AbstractC9905c) it.next()).mo38422a();
        }
        this.f33420b = i10;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m38433a(int i10) {
        return (i10 & this.f33420b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1061t.m3842c(C9906d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C9906d c9906d = (C9906d) obj;
        return AbstractC1061t.m3842c(this.f33419a, c9906d.f33419a) && this.f33420b == c9906d.f33420b;
    }

    public int hashCode() {
        return (this.f33419a.hashCode() * 31) + this.f33420b;
    }

    /* JADX INFO: renamed from: l */
    public final List m38434l() {
        return this.f33419a;
    }

    /* JADX INFO: renamed from: m */
    public final int m38435m() {
        return this.f33420b;
    }

    /* JADX INFO: renamed from: n */
    public final C9906d m38436n(int i10) {
        int i11 = i10 & this.f33420b;
        if (i11 == 0) {
            return null;
        }
        return new C9906d(i11, this.f33419a);
    }

    public String toString() {
        Object next;
        Iterator it = f33417y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C10260a) next).m38447a() == this.f33420b) {
                break;
            }
        }
        a.C10260a c10260a = (a.C10260a) next;
        String strM38448b = c10260a != null ? c10260a.m38448b() : null;
        if (strM38448b == null) {
            List<a.C10260a> list = f33418z;
            ArrayList arrayList = new ArrayList();
            for (a.C10260a c10260a2 : list) {
                String strM38448b2 = m38433a(c10260a2.m38447a()) ? c10260a2.m38448b() : null;
                if (strM38448b2 != null) {
                    arrayList.add(strM38448b2);
                }
            }
            strM38448b = AbstractC5081g0.m20585s0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strM38448b + ", " + this.f33419a + ')';
    }

    /* JADX INFO: renamed from: za.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: za.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10260a {

            /* JADX INFO: renamed from: a */
            public final int f33421a;

            /* JADX INFO: renamed from: b */
            public final String f33422b;

            public C10260a(int i10, String str) {
                str.getClass();
                this.f33421a = i10;
                this.f33422b = str;
            }

            /* JADX INFO: renamed from: a */
            public final int m38447a() {
                return this.f33421a;
            }

            /* JADX INFO: renamed from: b */
            public final String m38448b() {
                return this.f33422b;
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final int m38438b() {
            return C9906d.f33403k;
        }

        /* JADX INFO: renamed from: c */
        public final int m38439c() {
            return C9906d.f33404l;
        }

        /* JADX INFO: renamed from: d */
        public final int m38440d() {
            return C9906d.f33401i;
        }

        /* JADX INFO: renamed from: e */
        public final int m38441e() {
            return C9906d.f33397e;
        }

        /* JADX INFO: renamed from: f */
        public final int m38442f() {
            return C9906d.f33400h;
        }

        /* JADX INFO: renamed from: g */
        public final int m38443g() {
            return C9906d.f33398f;
        }

        /* JADX INFO: renamed from: h */
        public final int m38444h() {
            return C9906d.f33399g;
        }

        /* JADX INFO: renamed from: i */
        public final int m38445i() {
            return C9906d.f33402j;
        }

        /* JADX INFO: renamed from: j */
        public final int m38446j() {
            int i10 = C9906d.f33396d;
            C9906d.f33396d <<= 1;
            return i10;
        }

        public a() {
        }
    }

    public /* synthetic */ C9906d(int i10, List list, int i11, AbstractC1043k abstractC1043k) {
        this(i10, (i11 & 2) != 0 ? AbstractC5114x.m20800o() : list);
    }
}
