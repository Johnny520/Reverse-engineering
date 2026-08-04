package yyds;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: yyds.ᛴᛸᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0920 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ float f4221;

    public C0920(float f) {
        this.f4221 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC2328.m4341(-157650642436974L);
        AbstractC2328.m4341(-157672117273454L);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 20.0f * this.f4221);
    }
}
