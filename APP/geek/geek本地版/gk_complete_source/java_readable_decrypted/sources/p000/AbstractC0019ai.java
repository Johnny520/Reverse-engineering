package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: ai */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0019ai {

    /* JADX INFO: renamed from: a */
    public int f143a;

    /* JADX INFO: renamed from: b */
    public final Object f144b;

    /* JADX INFO: renamed from: c */
    public final Object f145c;

    public AbstractC0019ai(AbstractC0540nz abstractC0540nz) {
        this.f143a = Integer.MIN_VALUE;
        this.f145c = new Rect();
        this.f144b = abstractC0540nz;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0019ai m97a(AbstractC0540nz abstractC0540nz, int i) {
        if (i == 0) {
            return new C0203ex(abstractC0540nz, 0);
        }
        if (i == 1) {
            return new C0203ex(abstractC0540nz, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo98b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo99c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo100d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo101e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo102f();

    /* JADX INFO: renamed from: g */
    public abstract int mo103g();

    /* JADX INFO: renamed from: h */
    public abstract int mo104h();

    /* JADX INFO: renamed from: i */
    public abstract int mo105i();

    /* JADX INFO: renamed from: j */
    public abstract int mo106j();

    /* JADX INFO: renamed from: k */
    public abstract int mo107k();

    /* JADX INFO: renamed from: l */
    public abstract int mo108l();

    /* JADX INFO: renamed from: m */
    public abstract int mo109m(View view);

    /* JADX INFO: renamed from: n */
    public abstract int mo110n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo111o(int i);

    public AbstractC0019ai(InterfaceC0152di interfaceC0152di) {
        this.f143a = 0;
        this.f145c = new C0483mf();
        this.f144b = interfaceC0152di;
    }
}
