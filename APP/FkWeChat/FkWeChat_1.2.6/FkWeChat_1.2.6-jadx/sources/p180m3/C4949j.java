package p180m3;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;
import p057e1.AbstractC1984l;
import p172l8.C4700i0;

/* JADX INFO: renamed from: m3.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4949j {

    /* JADX INFO: renamed from: a */
    public static final C4949j f15025a = new C4949j();

    /* JADX INFO: renamed from: b */
    public static InterfaceC0188p f15026b = AbstractC1984l.m7162b(210148896, false, a.f15027r);

    /* JADX INFO: renamed from: m3.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public static final a f15027r = new a();

        public a() {
            super(2);
        }

        /* JADX INFO: renamed from: a */
        public final void m19998a(InterfaceC0572r interfaceC0572r, int i10) {
            if (!interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(210148896, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda$210148896.<anonymous> (AndroidDialog.android.kt:249)");
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m19998a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0188p m19997a() {
        return f15026b;
    }
}
