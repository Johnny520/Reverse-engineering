package yyds;

import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲁᛷᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2273 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f11203;

    public C2273(C1213 c1213) {
        this.f11203 = c1213;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4283() {
        C1213 c1213 = this.f11203;
        if (!c1213.f5555 || !c1213.f5557) {
            c1213.f5517 = true;
            c1213.requestLayout();
        } else {
            RunnableC0086 runnableC0086 = c1213.f5558;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            c1213.postOnAnimation(runnableC0086);
        }
    }
}
