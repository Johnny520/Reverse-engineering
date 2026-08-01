package p135j2;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0537m;
import androidx.compose.runtime.AbstractC0603u5;
import androidx.compose.runtime.InterfaceC0572r;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;
import p057e1.AbstractC1984l;
import p166l2.InterfaceC4541g;
import p172l8.C4700i0;

/* JADX INFO: renamed from: j2.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3516e0 {

    /* JADX INFO: renamed from: j2.e0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ List f9750r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(2);
            this.f9750r = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m13107a(InterfaceC0572r interfaceC0572r, int i10) {
            if (!interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(1271844412, i10, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:180)");
            }
            List list = this.f9750r;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC0188p interfaceC0188p = (InterfaceC0188p) list.get(i11);
                int iHashCode = Long.hashCode(AbstractC0537m.m1915b(interfaceC0572r, 0));
                InterfaceC4541g.a aVar = InterfaceC4541g.f13305j;
                InterfaceC0173a interfaceC0173aM17777g = aVar.m17777g();
                if (interfaceC0572r.mo2186v() == null) {
                    AbstractC0537m.m1917d();
                }
                interfaceC0572r.mo2183s();
                if (interfaceC0572r.mo2177m()) {
                    interfaceC0572r.mo2160S(interfaceC0173aM17777g);
                } else {
                    interfaceC0572r.mo2149H();
                }
                AbstractC0603u5.m2232c(AbstractC0603u5.m2231b(interfaceC0572r), Integer.valueOf(iHashCode), aVar.m17773c());
                interfaceC0188p.invoke(interfaceC0572r, 0);
                interfaceC0572r.mo2159R();
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m13107a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0188p m13106a(List list) {
        return AbstractC1984l.m7162b(1271844412, true, new a(list));
    }
}
