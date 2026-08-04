package yyds;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: renamed from: yyds.ᛸᛴᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1751 extends AbstractC0429 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final long f8811;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public Bitmap f8812;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int f8813;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Handler f8814;

    public C1751(Handler handler, int i, long j) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f8814 = handler;
        this.f8813 = i;
        this.f8811 = j;
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo2328(Drawable drawable) {
        this.f8812 = null;
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo2329(Object obj) {
        this.f8812 = (Bitmap) obj;
        Handler handler = this.f8814;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f8811);
    }
}
