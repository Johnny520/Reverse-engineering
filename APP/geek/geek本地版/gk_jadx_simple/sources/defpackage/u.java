package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class u extends ClickableSpan {
    public final int a;
    public final j0 b;
    public final int c;

    public u(int r1, j0 r2, int r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View r3) {
        Bundle r32 = new Bundle();
        r32.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        int r0 = this.c;
        this.b.a.performAction(r0, r32);
    }
}
