package p089g0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0191s;
import p056e0.InterfaceC1968g;
import p057e1.AbstractC1984l;
import p118i0.InterfaceC3107i;
import p172l8.C4700i0;

/* JADX INFO: renamed from: g0.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2486s {

    /* JADX INFO: renamed from: a */
    public static final C2486s f6716a = new C2486s();

    /* JADX INFO: renamed from: b */
    public static InterfaceC0191s f6717b = AbstractC1984l.m7162b(129995601, false, b.f6721q);

    /* JADX INFO: renamed from: c */
    public static InterfaceC0191s f6718c = AbstractC1984l.m7162b(636288403, false, c.f6722q);

    /* JADX INFO: renamed from: d */
    public static InterfaceC0191s f6719d = AbstractC1984l.m7162b(-1357803046, false, a.f6720q);

    /* JADX INFO: renamed from: g0.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0191s {

        /* JADX INFO: renamed from: q */
        public static final a f6720q = new a();

        /* JADX INFO: renamed from: a */
        public final void m8953a(InterfaceC1968g interfaceC1968g, InterfaceC3107i interfaceC3107i, InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? interfaceC0572r.mo2162U(interfaceC1968g) : interfaceC0572r.mo2175k(interfaceC1968g) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? interfaceC0572r.mo2162U(interfaceC3107i) : interfaceC0572r.mo2175k(interfaceC3107i) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= interfaceC0572r.mo2175k(interfaceC0173a) ? 256 : 128;
            }
            if (!interfaceC0572r.mo2144C((i11 & 1171) != 1170, i11 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1357803046, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$-1357803046.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:99)");
            }
            AbstractC2454c0.m8875l(interfaceC1968g, interfaceC3107i, interfaceC0173a, interfaceC0572r, i11 & 1022);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0191s
        /* JADX INFO: renamed from: t */
        public /* bridge */ /* synthetic */ Object mo231t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m8953a((InterfaceC1968g) obj, (InterfaceC3107i) obj2, (InterfaceC0173a) obj3, (InterfaceC0572r) obj4, ((Number) obj5).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: g0.s$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0191s {

        /* JADX INFO: renamed from: q */
        public static final b f6721q = new b();

        /* JADX INFO: renamed from: a */
        public final void m8954a(InterfaceC1968g interfaceC1968g, InterfaceC3107i interfaceC3107i, InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? interfaceC0572r.mo2162U(interfaceC1968g) : interfaceC0572r.mo2175k(interfaceC1968g) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? interfaceC0572r.mo2162U(interfaceC3107i) : interfaceC0572r.mo2175k(interfaceC3107i) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= interfaceC0572r.mo2175k(interfaceC0173a) ? 256 : 128;
            }
            if (!interfaceC0572r.mo2144C((i11 & 1171) != 1170, i11 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(129995601, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$129995601.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:75)");
            }
            AbstractC2454c0.m8875l(interfaceC1968g, interfaceC3107i, interfaceC0173a, interfaceC0572r, i11 & 1022);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0191s
        /* JADX INFO: renamed from: t */
        public /* bridge */ /* synthetic */ Object mo231t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m8954a((InterfaceC1968g) obj, (InterfaceC3107i) obj2, (InterfaceC0173a) obj3, (InterfaceC0572r) obj4, ((Number) obj5).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: g0.s$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC0191s {

        /* JADX INFO: renamed from: q */
        public static final c f6722q = new c();

        /* JADX INFO: renamed from: a */
        public final void m8955a(InterfaceC1968g interfaceC1968g, InterfaceC3107i interfaceC3107i, InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? interfaceC0572r.mo2162U(interfaceC1968g) : interfaceC0572r.mo2175k(interfaceC1968g) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? interfaceC0572r.mo2162U(interfaceC3107i) : interfaceC0572r.mo2175k(interfaceC3107i) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= interfaceC0572r.mo2175k(interfaceC0173a) ? 256 : 128;
            }
            if (!interfaceC0572r.mo2144C((i11 & 1171) != 1170, i11 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(636288403, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$636288403.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:90)");
            }
            AbstractC2454c0.m8875l(interfaceC1968g, interfaceC3107i, interfaceC0173a, interfaceC0572r, i11 & 1022);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0191s
        /* JADX INFO: renamed from: t */
        public /* bridge */ /* synthetic */ Object mo231t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m8955a((InterfaceC1968g) obj, (InterfaceC3107i) obj2, (InterfaceC0173a) obj3, (InterfaceC0572r) obj4, ((Number) obj5).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0191s m8951a() {
        return f6719d;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0191s m8952b() {
        return f6718c;
    }
}
