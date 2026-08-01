package p352y3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: y3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9542a extends ClickableSpan {

    /* JADX INFO: renamed from: q */
    public final int f32537q;

    /* JADX INFO: renamed from: r */
    public final C9561t f32538r;

    /* JADX INFO: renamed from: s */
    public final int f32539s;

    public C9542a(int i10, C9561t c9561t, int i11) {
        this.f32537q = i10;
        this.f32538r = c9561t;
        this.f32539s = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f32537q);
        this.f32538r.m37403T(this.f32539s, bundle);
    }
}
