package p101z;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: z.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1100a extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f3740a;

    /* JADX INFO: renamed from: b */
    public final C1107h f3741b;

    /* JADX INFO: renamed from: c */
    public final int f3742c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1100a(int i2, C1107h c1107h, int i3) {
        this.f3740a = i2;
        this.f3741b = c1107h;
        this.f3742c = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3740a);
        this.f3741b.f3750a.performAction(this.f3742c, bundle);
    }
}
