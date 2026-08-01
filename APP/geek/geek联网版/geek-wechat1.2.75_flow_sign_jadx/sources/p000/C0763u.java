package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: classes.dex */
public final class C0763u extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f4599a;

    /* JADX INFO: renamed from: b */
    public final C0357j0 f4600b;

    /* JADX INFO: renamed from: c */
    public final int f4601c;

    public C0763u(int i, C0357j0 c0357j0, int i2) {
        this.f4599a = i;
        this.f4600b = c0357j0;
        this.f4601c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4599a);
        this.f4600b.f2619a.performAction(this.f4601c, bundle);
    }
}
