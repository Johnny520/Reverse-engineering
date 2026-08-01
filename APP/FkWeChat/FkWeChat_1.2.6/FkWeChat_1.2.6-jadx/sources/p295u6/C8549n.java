package p295u6;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p295u6.C8549n;
import p310v6.C8842c;

/* JADX INFO: renamed from: u6.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8549n {

    /* JADX INFO: renamed from: e */
    public static final a f28520e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C8549n f28521f;

    /* JADX INFO: renamed from: g */
    public static final C8549n f28522g;

    /* JADX INFO: renamed from: h */
    public static final C8549n f28523h;

    /* JADX INFO: renamed from: i */
    public static final C8842c f28524i;

    /* JADX INFO: renamed from: a */
    public final boolean f28525a;

    /* JADX INFO: renamed from: b */
    public final boolean f28526b;

    /* JADX INFO: renamed from: c */
    public final boolean f28527c;

    /* JADX INFO: renamed from: d */
    public final List f28528d;

    static {
        boolean z10 = false;
        C8549n c8549n = new C8549n(true, z10, false, null, 14, null);
        f28521f = c8549n;
        boolean z11 = false;
        C8549n c8549n2 = new C8549n(z10, true, z11, null, 13, null);
        f28522g = c8549n2;
        C8549n c8549n3 = new C8549n(false, z11, true, null, 11, null);
        f28523h = c8549n3;
        f28524i = C8842c.f29376b.m33945d(AbstractC5114x.m20803r(AbstractC4717x.m18815a("close", c8549n), AbstractC4717x.m18815a("keep-alive", c8549n2), AbstractC4717x.m18815a("upgrade", c8549n3)), new InterfaceC0184l() { // from class: u6.j
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Integer.valueOf(C8549n.m32879a((C4711r) obj));
            }
        }, new InterfaceC0188p() { // from class: u6.k
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return Character.valueOf(C8549n.m32880b((C4711r) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    public /* synthetic */ C8549n(boolean z10, boolean z11, boolean z12, List list, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? AbstractC5114x.m20800o() : list);
    }

    /* JADX INFO: renamed from: a */
    public static int m32879a(C4711r c4711r) {
        c4711r.getClass();
        return ((String) c4711r.m18795e()).length();
    }

    /* JADX INFO: renamed from: b */
    public static char m32880b(C4711r c4711r, int i10) {
        c4711r.getClass();
        return ((String) c4711r.m18795e()).charAt(i10);
    }

    /* JADX INFO: renamed from: e */
    public final String m32883e() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList(this.f28528d.size() + 3);
        if (this.f28525a) {
            arrayList.add("close");
        }
        if (this.f28526b) {
            arrayList.add("keep-alive");
        }
        if (this.f28527c) {
            arrayList.add("Upgrade");
        }
        if (!this.f28528d.isEmpty()) {
            arrayList.addAll(this.f28528d);
        }
        AbstractC5081g0.m20583q0(arrayList, sb2, null, null, null, 0, null, null, 126, null);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8549n.class != obj.getClass()) {
            return false;
        }
        C8549n c8549n = (C8549n) obj;
        return this.f28525a == c8549n.f28525a && this.f28526b == c8549n.f28526b && this.f28527c == c8549n.f28527c && AbstractC1061t.m3842c(this.f28528d, c8549n.f28528d);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m32884f() {
        return this.f28525a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m32885g() {
        return this.f28526b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m32886h() {
        return this.f28527c;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f28525a) * 31) + Boolean.hashCode(this.f28526b)) * 31) + Boolean.hashCode(this.f28527c)) * 31) + this.f28528d.hashCode();
    }

    public String toString() {
        if (!this.f28528d.isEmpty()) {
            return m32883e();
        }
        boolean z10 = this.f28525a;
        return (!z10 || this.f28526b || this.f28527c) ? (z10 || !this.f28526b || this.f28527c) ? (!z10 && this.f28526b && this.f28527c) ? "keep-alive, Upgrade" : m32883e() : "keep-alive" : "close";
    }

    /* JADX INFO: renamed from: u6.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static boolean m32887a(char c10, int i10) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m32888b(char c10, int i10) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public final C8549n m32889c() {
            return C8549n.f28522g;
        }

        /* JADX INFO: renamed from: d */
        public final C8549n m32890d(CharSequence charSequence) {
            if (charSequence == null) {
                return null;
            }
            List listM33940b = C8842c.m33940b(C8549n.f28524i, charSequence, 0, 0, true, new InterfaceC0188p() { // from class: u6.l
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(C8549n.a.m32887a(((Character) obj).charValue(), ((Integer) obj2).intValue()));
                }
            }, 6, null);
            return listM33940b.size() == 1 ? (C8549n) ((C4711r) listM33940b.get(0)).m18796f() : m32891e(charSequence);
        }

        /* JADX INFO: renamed from: e */
        public final C8549n m32891e(CharSequence charSequence) {
            int i10;
            int length = charSequence.length();
            C8549n c8549nM32889c = null;
            ArrayList arrayList = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                while (true) {
                    char cCharAt = charSequence.charAt(i11);
                    if (cCharAt != ' ' && cCharAt != ',') {
                        i12 = i11;
                        i10 = i12;
                        break;
                    }
                    i11++;
                    if (i11 >= length) {
                        i10 = i11;
                        break;
                    }
                }
                while (i10 < length) {
                    char cCharAt2 = charSequence.charAt(i10);
                    if (cCharAt2 == ' ' || cCharAt2 == ',') {
                        break;
                    }
                    i10++;
                }
                C4711r c4711r = (C4711r) AbstractC5081g0.m20539K0(C8549n.f28524i.m33941a(charSequence, i12, i10, true, new InterfaceC0188p() { // from class: u6.m
                    @Override // p010a9.InterfaceC0188p
                    public final Object invoke(Object obj, Object obj2) {
                        return Boolean.valueOf(C8549n.a.m32888b(((Character) obj).charValue(), ((Integer) obj2).intValue()));
                    }
                }));
                if (c4711r == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(i12, i10).toString());
                } else if (c8549nM32889c == null) {
                    c8549nM32889c = (C8549n) c4711r.m18796f();
                } else {
                    boolean z10 = true;
                    boolean z11 = c8549nM32889c.m32884f() || ((C8549n) c4711r.m18796f()).m32884f();
                    boolean z12 = c8549nM32889c.m32885g() || ((C8549n) c4711r.m18796f()).m32885g();
                    if (!c8549nM32889c.m32886h() && !((C8549n) c4711r.m18796f()).m32886h()) {
                        z10 = false;
                    }
                    i11 = i10;
                    c8549nM32889c = new C8549n(z11, z12, z10, AbstractC5114x.m20800o());
                }
                i11 = i10;
            }
            if (c8549nM32889c == null) {
                c8549nM32889c = m32889c();
            }
            return arrayList == null ? c8549nM32889c : new C8549n(c8549nM32889c.m32884f(), c8549nM32889c.m32885g(), c8549nM32889c.m32886h(), arrayList);
        }

        public a() {
        }
    }

    public C8549n(boolean z10, boolean z11, boolean z12, List list) {
        list.getClass();
        this.f28525a = z10;
        this.f28526b = z11;
        this.f28527c = z12;
        this.f28528d = list;
    }
}
