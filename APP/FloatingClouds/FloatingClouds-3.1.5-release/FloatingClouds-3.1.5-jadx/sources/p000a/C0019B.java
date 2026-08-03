package p000a;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: a.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0019B extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f59a;

    /* JADX INFO: renamed from: b */
    public final C0146I f60b;

    /* JADX INFO: renamed from: c */
    public final int f61c;

    public C0019B(int i, C0146I c0146i, int i2) {
        this.f59a = i;
        this.f60b = c0146i;
        this.f61c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f59a);
        this.f60b.f505a.performAction(this.f61c, bundle);
    }
}
