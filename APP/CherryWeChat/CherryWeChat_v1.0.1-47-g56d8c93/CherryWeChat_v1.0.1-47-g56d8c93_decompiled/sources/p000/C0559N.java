package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: N */
/* JADX INFO: loaded from: classes.dex */
public final class C0559N extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f1833a;

    /* JADX INFO: renamed from: b */
    public final C1118a0 f1834b;

    /* JADX INFO: renamed from: c */
    public final int f1835c;

    public C0559N(int i, C1118a0 c1118a0, int i2) {
        this.f1833a = i;
        this.f1834b = c1118a0;
        this.f1835c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1833a);
        this.f1834b.f3530a.performAction(this.f1835c, bundle);
    }
}
