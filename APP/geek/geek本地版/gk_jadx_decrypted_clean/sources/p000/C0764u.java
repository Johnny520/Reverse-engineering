package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: classes.dex */
public final class C0764u extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f4641a;

    /* JADX INFO: renamed from: b */
    public final C0357j0 f4642b;

    /* JADX INFO: renamed from: c */
    public final int f4643c;

    public C0764u(int i, C0357j0 c0357j0, int i2) {
        this.f4641a = i;
        this.f4642b = c0357j0;
        this.f4643c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4641a);
        this.f4642b.f2513a.performAction(this.f4643c, bundle);
    }
}
