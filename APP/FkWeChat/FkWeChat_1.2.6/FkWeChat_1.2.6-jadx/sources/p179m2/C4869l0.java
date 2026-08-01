package p179m2;

import android.view.ActionMode;
import android.view.View;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1067w;
import p172l8.C4700i0;
import p205o2.C5628a;
import p205o2.C5630c;
import p250r1.C6457g;

/* JADX INFO: renamed from: m2.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4869l0 implements InterfaceC4822b3 {

    /* JADX INFO: renamed from: a */
    public final View f14493a;

    /* JADX INFO: renamed from: b */
    public ActionMode f14494b;

    /* JADX INFO: renamed from: c */
    public final C5630c f14495c = new C5630c(new a(), null, null, null, null, null, null, 126, null);

    /* JADX INFO: renamed from: d */
    public EnumC4832d3 f14496d = EnumC4832d3.f14371r;

    /* JADX INFO: renamed from: m2.l0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {
        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m19435a() {
            C4869l0.this.f14494b = null;
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m19435a();
            return C4700i0.f13910a;
        }
    }

    public C4869l0(View view) {
        this.f14493a = view;
    }

    @Override // p179m2.InterfaceC4822b3
    /* JADX INFO: renamed from: a */
    public void mo19297a() {
        this.f14496d = EnumC4832d3.f14371r;
        ActionMode actionMode = this.f14494b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f14494b = null;
    }

    @Override // p179m2.InterfaceC4822b3
    /* JADX INFO: renamed from: c */
    public EnumC4832d3 mo19298c() {
        return this.f14496d;
    }

    @Override // p179m2.InterfaceC4822b3
    /* JADX INFO: renamed from: d */
    public void mo19299d(C6457g c6457g, InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, InterfaceC0173a interfaceC0173a4, InterfaceC0173a interfaceC0173a5) {
        this.f14495c.m22808m(c6457g);
        this.f14495c.m22804i(interfaceC0173a);
        this.f14495c.m22805j(interfaceC0173a3);
        this.f14495c.m22806k(interfaceC0173a2);
        this.f14495c.m22807l(interfaceC0173a4);
        this.f14495c.m22803h(interfaceC0173a5);
        ActionMode actionMode = this.f14494b;
        if (actionMode == null) {
            this.f14496d = EnumC4832d3.f14370q;
            this.f14494b = C4827c3.f14357a.m19311a(this.f14493a, new C5628a(this.f14495c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }
}
