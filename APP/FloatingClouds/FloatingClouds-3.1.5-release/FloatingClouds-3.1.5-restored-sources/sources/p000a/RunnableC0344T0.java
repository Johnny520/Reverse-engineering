package p000a;

import android.view.ViewGroup;

/* JADX INFO: renamed from: a.T0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0344T0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C0291Q0 f1207a;

    /* JADX INFO: renamed from: a.T0$a */
    public class a extends C0726n9 {
        public a() {
        }

        @Override // p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: a */
        public final void mo553a() {
            LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = RunnableC0344T0.this.f1207a;
            layoutInflaterFactory2C0291Q0.f1037v.setAlpha(1.0f);
            layoutInflaterFactory2C0291Q0.f1040y.m491d(null);
            layoutInflaterFactory2C0291Q0.f1040y = null;
        }

        @Override // p000a.C0726n9, p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: c */
        public final void mo554c() {
            RunnableC0344T0.this.f1207a.f1037v.setVisibility(0);
        }
    }

    public RunnableC0344T0(LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0) {
        this.f1207a = layoutInflaterFactory2C0291Q0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = this.f1207a;
        layoutInflaterFactory2C0291Q0.f1038w.showAtLocation(layoutInflaterFactory2C0291Q0.f1037v, 55, 0, 0);
        C0181Jg c0181Jg = layoutInflaterFactory2C0291Q0.f1040y;
        if (c0181Jg != null) {
            c0181Jg.m489b();
        }
        if (!(layoutInflaterFactory2C0291Q0.f991A && (viewGroup = layoutInflaterFactory2C0291Q0.f992B) != null && viewGroup.isLaidOut())) {
            layoutInflaterFactory2C0291Q0.f1037v.setAlpha(1.0f);
            layoutInflaterFactory2C0291Q0.f1037v.setVisibility(0);
            return;
        }
        layoutInflaterFactory2C0291Q0.f1037v.setAlpha(0.0f);
        C0181Jg c0181JgM1994a = C0866ug.m1994a(layoutInflaterFactory2C0291Q0.f1037v);
        c0181JgM1994a.m488a(1.0f);
        layoutInflaterFactory2C0291Q0.f1040y = c0181JgM1994a;
        c0181JgM1994a.m491d(new a());
    }
}
