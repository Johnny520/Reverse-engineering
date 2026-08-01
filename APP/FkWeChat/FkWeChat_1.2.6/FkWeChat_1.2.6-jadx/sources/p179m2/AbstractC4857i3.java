package p179m2;

import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.InterfaceC0672m;
import androidx.lifecycle.InterfaceC0676o;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1067w;
import p172l8.C4700i0;

/* JADX INFO: renamed from: m2.i3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4857i3 {

    /* JADX INFO: renamed from: m2.i3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ AbstractC0668k f14453r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0672m f14454s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0668k abstractC0668k, InterfaceC0672m interfaceC0672m) {
            super(0);
            this.f14453r = abstractC0668k;
            this.f14454s = interfaceC0672m;
        }

        /* JADX INFO: renamed from: a */
        public final void m19403a() {
            this.f14453r.mo2630c(this.f14454s);
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m19403a();
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19400a(AbstractC4813a abstractC4813a, InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
        if (aVar == AbstractC0668k.a.ON_DESTROY) {
            abstractC4813a.m19267f();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0173a m19402c(final AbstractC4813a abstractC4813a, AbstractC0668k abstractC0668k) {
        if (abstractC0668k.mo2629b().compareTo(AbstractC0668k.b.f1968q) > 0) {
            InterfaceC0672m interfaceC0672m = new InterfaceC0672m() { // from class: m2.h3
                @Override // androidx.lifecycle.InterfaceC0672m
                /* JADX INFO: renamed from: j */
                public final void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
                    AbstractC4857i3.m19400a(abstractC4813a, interfaceC0676o, aVar);
                }
            };
            abstractC0668k.mo2628a(interfaceC0672m);
            return new a(abstractC0668k, interfaceC0672m);
        }
        throw new IllegalStateException(("Cannot configure " + abstractC4813a + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC0668k + "is already destroyed").toString());
    }
}
