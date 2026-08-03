package p001;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p001.C0481z7;

/* JADX INFO: renamed from: ۟.b4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0153b4 extends AbstractC0204f<ImageView> {
    public C0153b4(C0481z7 c0481z7, ImageView imageView, C0443w8 c0443w8, String str, InterfaceC0205f0 interfaceC0205f0, boolean z) {
        super(c0481z7, imageView, c0443w8, str, z);
    }

    @Override // p001.AbstractC0204f
    /* JADX INFO: renamed from: ۥ */
    public final void mo819() {
        this.f1435 = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: M */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001.AbstractC0204f
    /* JADX INFO: renamed from: ۥ۟ */
    public final void mo820(Bitmap bitmap, C0481z7.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f1426.get();
        if (imageView == null) {
            return;
        }
        C0481z7 c0481z7 = this.f773;
        C0143a8.m807(imageView, c0481z7.f1907, bitmap, eVar, this.f1427, c0481z7.f1915);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: M */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001.AbstractC0204f
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void mo1011() {
        ImageView imageView = (ImageView) this.f1426.get();
        if (imageView == null) {
            return;
        }
        int i = this.f1430;
        if (i != 0) {
            imageView.setImageResource(i);
            return;
        }
        Drawable drawable = this.f1431;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }
}
