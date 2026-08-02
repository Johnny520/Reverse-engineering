package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: r3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0642r3 extends ClickableSpan {

    /* JADX INFO: renamed from: h */
    public final int f9335h;

    /* JADX INFO: renamed from: i */
    public final C0411l4 f9336i;

    /* JADX INFO: renamed from: j */
    public final int f9337j;

    public C0642r3(int i, C0411l4 c0411l4, int i2) {
        this.f9335h = i;
        this.f9336i = c0411l4;
        this.f9337j = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f9335h);
        this.f9336i.f5914a.performAction(this.f9337j, bundle);
    }
}
