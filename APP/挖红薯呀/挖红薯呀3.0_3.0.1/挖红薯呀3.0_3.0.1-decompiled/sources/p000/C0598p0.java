package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: p0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0598p0 extends ClickableSpan {

    /* JADX INFO: renamed from: d */
    public final int f4686d;

    /* JADX INFO: renamed from: e */
    public final C0156e1 f4687e;

    /* JADX INFO: renamed from: f */
    public final int f4688f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0598p0(int i, C0156e1 c0156e1, int i2) {
        this.f4686d = i;
        this.f4687e = c0156e1;
        this.f4688f = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4686d);
        this.f4687e.f1256a.performAction(this.f4688f, bundle);
    }
}
