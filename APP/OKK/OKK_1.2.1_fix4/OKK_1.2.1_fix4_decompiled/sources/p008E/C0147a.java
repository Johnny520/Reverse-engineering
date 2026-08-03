package p008E;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: E.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0147a extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f340a;

    /* JADX INFO: renamed from: b */
    public final C0156j f341b;

    /* JADX INFO: renamed from: c */
    public final int f342c;

    public C0147a(int i2, C0156j c0156j, int i3) {
        this.f340a = i2;
        this.f341b = c0156j;
        this.f342c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f340a);
        this.f341b.f357a.performAction(this.f342c, bundle);
    }
}
