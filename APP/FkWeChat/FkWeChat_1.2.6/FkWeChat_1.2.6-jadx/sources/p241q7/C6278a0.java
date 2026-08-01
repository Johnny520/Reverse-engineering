package p241q7;

import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p241q7.C6278a0;
import p281t6.AbstractC8136b;
import p299ub.AbstractC8621f0;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: q7.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6278a0 {

    /* JADX INFO: renamed from: b */
    public static final a f19679b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final C6278a0 f19680c = new C6278a0(AbstractC5114x.m20800o());

    /* JADX INFO: renamed from: a */
    public final List f19681a;

    public C6278a0(List list) {
        this.f19681a = list;
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m24865a(C6280b0 c6280b0) {
        c6280b0.getClass();
        return c6280b0.m24875d();
    }

    /* JADX INFO: renamed from: c */
    public final List m24867c() {
        return this.f19681a;
    }

    public String toString() {
        return AbstractC5081g0.m20585s0(this.f19681a, "/", null, null, 0, null, new InterfaceC0184l() { // from class: q7.x
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C6278a0.m24865a((C6280b0) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: renamed from: q7.a0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static boolean m24868a(String str) {
            str.getClass();
            return str.length() > 0;
        }

        /* JADX INFO: renamed from: b */
        public static C6280b0 m24869b(String str) {
            str.getClass();
            return (AbstractC8621f0.m33124Z(str, '{', false, 2, null) && AbstractC8621f0.m33124Z(str, '}', false, 2, null)) ? new C6280b0(str, EnumC6282c0.f19689r) : new C6280b0(AbstractC8136b.m31590e(str, 0, 0, null, 7, null), EnumC6282c0.f19688q);
        }

        /* JADX INFO: renamed from: c */
        public final C6278a0 m24870c() {
            return C6278a0.f19680c;
        }

        /* JADX INFO: renamed from: d */
        public final C6278a0 m24871d(String str) {
            str.getClass();
            return AbstractC1061t.m3842c(str, "/") ? m24870c() : new C6278a0(AbstractC7294t.m28908P(AbstractC7294t.m28901I(AbstractC7294t.m28915y(AbstractC8621f0.m33115U0(str, new String[]{"/"}, false, 0, 6, null), new InterfaceC0184l() { // from class: q7.y
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return Boolean.valueOf(C6278a0.a.m24868a((String) obj));
                }
            }), new InterfaceC0184l() { // from class: q7.z
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C6278a0.a.m24869b((String) obj);
                }
            })), null);
        }

        public a() {
        }
    }

    public /* synthetic */ C6278a0(List list, AbstractC1043k abstractC1043k) {
        this(list);
    }
}
