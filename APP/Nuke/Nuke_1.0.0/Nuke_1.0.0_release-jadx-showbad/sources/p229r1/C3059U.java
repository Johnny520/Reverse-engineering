package p229r1;

import android.view.WindowInsets;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.U */
/* JADX INFO: loaded from: classes.dex */
public class C3059U extends C3058T {

    /* JADX INFO: renamed from: t */
    public C2688b f9770t;

    /* JADX INFO: renamed from: u */
    public C2688b f9771u;

    /* JADX INFO: renamed from: v */
    public C2688b f9772v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3059U(C3070c0 c3070c0, WindowInsets windowInsets) {
        super(c3070c0, windowInsets);
        this.f9770t = null;
        this.f9771u = null;
        this.f9772v = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: k */
    public C2688b mo5386k() {
        if (this.f9771u == null) {
            this.f9771u = C2688b.m4668c(this.f9758c.getMandatorySystemGestureInsets());
        }
        return this.f9771u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: m */
    public C2688b mo5387m() {
        if (this.f9770t == null) {
            this.f9770t = C2688b.m4668c(this.f9758c.getSystemGestureInsets());
        }
        return this.f9770t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: o */
    public C2688b mo5388o() {
        if (this.f9772v == null) {
            this.f9772v = C2688b.m4668c(this.f9758c.getTappableElementInsets());
        }
        return this.f9772v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: r */
    public C3070c0 mo5372r(int i5, int i6, int i7, int i8) {
        return C3070c0.m5393c(null, this.f9758c.inset(i5, i6, i7, i8));
    }

    public C3059U(C3070c0 c3070c0, C3059U c3059u) {
        super(c3070c0, c3059u);
        this.f9770t = null;
        this.f9771u = null;
        this.f9772v = null;
    }

    @Override // p229r1.C3057S, p229r1.C3064Z
    /* JADX INFO: renamed from: z */
    public void mo5383z(C2688b c2688b) {
    }
}
