package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: ci */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0105ci {

    /* JADX INFO: renamed from: a */
    public int f896a;

    /* JADX INFO: renamed from: b */
    public final Object f897b;

    /* JADX INFO: renamed from: c */
    public final Object f898c;

    public AbstractC0105ci(AbstractC0799uz abstractC0799uz) {
        this.f896a = Integer.MIN_VALUE;
        this.f898c = new Rect();
        this.f897b = abstractC0799uz;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0105ci m635a(AbstractC0799uz abstractC0799uz, int i) {
        if (i == 0) {
            return new C0501mx(abstractC0799uz, 0);
        }
        if (i == 1) {
            return new C0501mx(abstractC0799uz, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo636b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo637c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo638d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo639e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo640f();

    /* JADX INFO: renamed from: g */
    public abstract int mo641g();

    /* JADX INFO: renamed from: h */
    public abstract int mo642h();

    /* JADX INFO: renamed from: i */
    public abstract int mo643i();

    /* JADX INFO: renamed from: j */
    public abstract int mo644j();

    /* JADX INFO: renamed from: k */
    public abstract int mo645k();

    /* JADX INFO: renamed from: l */
    public abstract int mo646l();

    /* JADX INFO: renamed from: m */
    public abstract int mo647m(View view);

    /* JADX INFO: renamed from: n */
    public abstract int mo648n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo649o(int i);

    public AbstractC0105ci(InterfaceC0225fi interfaceC0225fi) {
        this.f896a = 0;
        this.f898c = new C0520nf();
        this.f897b = interfaceC0225fi;
    }
}
