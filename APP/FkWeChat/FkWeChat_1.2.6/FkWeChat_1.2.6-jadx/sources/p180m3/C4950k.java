package p180m3;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;
import p057e1.AbstractC1984l;
import p172l8.C4700i0;

/* JADX INFO: renamed from: m3.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4950k {

    /* JADX INFO: renamed from: a */
    public static final C4950k f15028a = new C4950k();

    /* JADX INFO: renamed from: b */
    public static InterfaceC0188p f15029b = AbstractC1984l.m7162b(-1131826196, false, a.f15030r);

    /* JADX INFO: renamed from: m3.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public static final a f15030r = new a();

        public a() {
            super(2);
        }

        /* JADX INFO: renamed from: a */
        public final void m20000a(InterfaceC0572r interfaceC0572r, int i10) {
            if (!interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1131826196, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.lambda$-1131826196.<anonymous> (AndroidPopup.android.kt:574)");
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m20000a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0188p m19999a() {
        return f15029b;
    }
}
