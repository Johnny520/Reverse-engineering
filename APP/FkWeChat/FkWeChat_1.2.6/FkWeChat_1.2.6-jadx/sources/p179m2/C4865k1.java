package p179m2;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p172l8.C4700i0;

/* JADX INFO: renamed from: m2.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4865k1 extends AbstractC4813a {

    /* JADX INFO: renamed from: y */
    public final InterfaceC0512i2 f14479y;

    /* JADX INFO: renamed from: z */
    public boolean f14480z;

    /* JADX INFO: renamed from: m2.k1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ int f14482s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(2);
            this.f14482s = i10;
        }

        /* JADX INFO: renamed from: a */
        public final void m19420a(InterfaceC0572r interfaceC0572r, int i10) {
            C4865k1.this.mo19263b(interfaceC0572r, AbstractC0541m3.m1929a(this.f14482s | 1));
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m19420a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    public /* synthetic */ C4865k1(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1043k abstractC1043k) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // p179m2.AbstractC4813a
    /* JADX INFO: renamed from: b */
    public void mo19263b(InterfaceC0572r interfaceC0572r, int i10) {
        int i11;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(420213850);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC0572rMo2181q.mo2175k(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (interfaceC0572rMo2181q.mo2144C((i11 & 3) != 2, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(420213850, i11, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:444)");
            }
            InterfaceC0188p interfaceC0188p = (InterfaceC0188p) this.f14479y.getValue();
            if (interfaceC0188p == null) {
                interfaceC0572rMo2181q.mo2163V(-1238823553);
            } else {
                interfaceC0572rMo2181q.mo2163V(98585282);
                interfaceC0188p.invoke(interfaceC0572rMo2181q, 0);
            }
            interfaceC0572rMo2181q.mo2152K();
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new a(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C4865k1.class.getName();
    }

    @Override // p179m2.AbstractC4813a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f14480z;
    }

    public final void setContent(InterfaceC0188p interfaceC0188p) {
        this.f14480z = true;
        this.f14479y.setValue(interfaceC0188p);
        if (isAttachedToWindow()) {
            m19266e();
        }
    }

    public C4865k1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14479y = AbstractC0522j5.m1773e(null, null, 2, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
