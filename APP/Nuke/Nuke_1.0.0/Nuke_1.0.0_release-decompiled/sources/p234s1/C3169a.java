package p234s1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: s1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3169a extends ClickableSpan {

    /* JADX INFO: renamed from: d */
    public final int f9918d;

    /* JADX INFO: renamed from: e */
    public final C3175g f9919e;

    /* JADX INFO: renamed from: f */
    public final int f9920f;

    public C3169a(int i5, C3175g c3175g, int i6) {
        this.f9918d = i5;
        this.f9919e = c3175g;
        this.f9920f = i6;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f9918d);
        this.f9919e.f9931a.performAction(this.f9920f, bundle);
    }
}
