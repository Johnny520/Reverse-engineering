package p295u4;

import bsh.C0353j;
import java.util.concurrent.ConcurrentHashMap;
import p046d6.C0716m;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p311v4.AbstractC4446a;
import p311v4.C4451c0;
import p326w4.C4683c;
import p326w4.InterfaceC4684d;
import p376z4.InterfaceC6097k;

/* JADX INFO: renamed from: u4.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4265o implements InterfaceC4684d, InterfaceC6097k, Comparable {

    /* JADX INFO: renamed from: j */
    public static final ConcurrentHashMap f13963j = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: k */
    public static final C0716m f13964k = new C0716m(2);

    /* JADX INFO: renamed from: g */
    public final int f13965g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC4684d f13966h;

    /* JADX INFO: renamed from: i */
    public final C4261k f13967i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4265o(int i9, InterfaceC4684d interfaceC4684d, C4261k c4261k) {
        if (i9 < 0) {
            C2104o.m5294t("reg < 0");
            throw null;
        }
        if (interfaceC4684d == null) {
            C0353j.m1305c("type == null");
            throw null;
        }
        this.f13965g = i9;
        this.f13966h = interfaceC4684d;
        this.f13967i = c4261k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C4265o m8557k(int i9, InterfaceC4684d interfaceC4684d, C4261k c4261k) {
        C4264n c4264n = (C4264n) f13964k.get();
        c4264n.f13960a = i9;
        c4264n.f13961b = interfaceC4684d;
        c4264n.f13962c = c4261k;
        ConcurrentHashMap concurrentHashMap = f13963j;
        C4265o c4265o = (C4265o) concurrentHashMap.get(c4264n);
        if (c4265o == null) {
            c4265o = new C4265o(c4264n.f13960a, c4264n.f13961b, c4264n.f13962c);
            C4265o c4265o2 = (C4265o) concurrentHashMap.putIfAbsent(c4265o, c4265o);
            if (c4265o2 != null) {
                return c4265o2;
            }
        }
        return c4265o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return m8564n(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    /* JADX INFO: renamed from: b */
    public final int mo4905b() {
        return this.f13966h.mo4905b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    /* JADX INFO: renamed from: c */
    public final boolean mo4906c() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4265o c4265o) {
        int i9 = c4265o.f13965g;
        int i10 = this.f13965g;
        if (i10 < i9) {
            return -1;
        }
        if (i10 > i9) {
            return 1;
        }
        if (this == c4265o) {
            return 0;
        }
        int iCompareTo = this.f13966h.getType().f15648g.compareTo(c4265o.f13966h.getType().f15648g);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C4261k c4261k = c4265o.f13967i;
        C4261k c4261k2 = this.f13967i;
        if (c4261k2 == null) {
            return c4261k == null ? 0 : -1;
        }
        if (c4261k == null) {
            return 1;
        }
        return c4261k2.compareTo(c4261k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m8559e(int i9, InterfaceC4684d interfaceC4684d, C4261k c4261k) {
        if (this.f13965g != i9 || !this.f13966h.equals(interfaceC4684d)) {
            return false;
        }
        C4261k c4261k2 = this.f13967i;
        if (c4261k2 != c4261k) {
            return c4261k2 != null && c4261k2.equals(c4261k);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4265o) {
            C4265o c4265o = (C4265o) obj;
            return m8559e(c4265o.f13965g, c4265o.f13966h, c4265o.f13967i);
        }
        if (!(obj instanceof C4264n)) {
            return false;
        }
        C4264n c4264n = (C4264n) obj;
        return m8559e(c4264n.f13960a, c4264n.f13961b, c4264n.f13962c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    /* JADX INFO: renamed from: f */
    public final int mo4907f() {
        return this.f13966h.mo4907f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    /* JADX INFO: renamed from: g */
    public final InterfaceC4684d mo4908g() {
        return this.f13966h.mo4908g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    public final C4683c getType() {
        return this.f13966h.getType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C4261k c4261k = this.f13967i;
        return ((this.f13966h.hashCode() + ((c4261k != null ? c4261k.hashCode() : 0) * 31)) * 31) + this.f13965g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m8560i(C4265o c4265o) {
        return m8562l(c4265o) && this.f13965g == c4265o.f13965g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m8561j() {
        return this.f13966h.getType().m9188i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m8562l(C4265o c4265o) {
        if (c4265o != null && this.f13966h.getType().equals(c4265o.f13966h.getType())) {
            Object obj = c4265o.f13967i;
            C4261k c4261k = this.f13967i;
            if (c4261k == obj) {
                return true;
            }
            if (c4261k != null && c4261k.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m8563m() {
        return AbstractC0921a.m2249l(this.f13965g, "v");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final String m8564n(boolean z9) {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(m8563m());
        sb2.append(":");
        C4261k c4261k = this.f13967i;
        if (c4261k != null) {
            sb2.append(c4261k.toString());
        }
        InterfaceC4684d interfaceC4684d = this.f13966h;
        C4683c type = interfaceC4684d.getType();
        sb2.append(type);
        if (type != interfaceC4684d) {
            sb2.append("=");
            if (z9 && (interfaceC4684d instanceof C4451c0)) {
                sb2.append(((C4451c0) interfaceC4684d).m8901l());
            } else if (z9 && (interfaceC4684d instanceof AbstractC4446a)) {
                sb2.append(interfaceC4684d.mo4901a());
            } else {
                sb2.append(interfaceC4684d);
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final C4265o m8565o(int i9) {
        return this.f13965g == i9 ? this : m8557k(i9, this.f13966h, this.f13967i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final C4265o m8566p(InterfaceC4684d interfaceC4684d) {
        return m8557k(this.f13965g, interfaceC4684d, this.f13967i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8564n(false);
    }
}
