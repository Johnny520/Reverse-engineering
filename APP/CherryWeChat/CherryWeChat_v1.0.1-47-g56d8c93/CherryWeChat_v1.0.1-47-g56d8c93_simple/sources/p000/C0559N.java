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

    public C0559N(int r1, C1118a0 r2, int r3) {
        this.f1833a = r1;
        this.f1834b = r2;
        this.f1835c = r3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View r3) {
        Bundle r32 = new Bundle();
        r32.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1833a);
        int r0 = this.f1835c;
        this.f1834b.f3530a.performAction(r0, r32);
    }
}
