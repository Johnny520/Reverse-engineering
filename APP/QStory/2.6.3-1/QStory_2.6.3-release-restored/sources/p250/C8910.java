package p250;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C3896;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.InterfaceC3832;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import p238.AbstractC8818;
import p246.C8882;
import p301.C9216;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8910 implements InterfaceC3821, InterfaceC3832 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f22618;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Drawable f22619;

    public C8910(Drawable drawable, int i) {
        this.f22618 = i;
        AbstractC8818.m14028(drawable, "Argument must not be null");
        this.f22619 = drawable;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    public final Object get() {
        Drawable drawable = this.f22619;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3832
    public void initialize() {
        int i = this.f22618;
        Drawable drawable = this.f22619;
        switch (i) {
            case 0:
                ((C8913) ((C8911) drawable).f22629.f20627).f22650.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof C8911) {
                    ((C8913) ((C8911) drawable).f22629.f20627).f22650.prepareToDraw();
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    public final void recycle() {
        C3806 c3806;
        C3806 c38062;
        C3806 c38063;
        switch (this.f22618) {
            case 0:
                C8911 c8911 = (C8911) this.f22619;
                c8911.stop();
                c8911.f22622 = true;
                C8913 c8913 = (C8913) c8911.f22629.f20627;
                ComponentCallbacks2C3896 componentCallbacks2C3896 = c8913.f22639;
                c8913.f22640.clear();
                Bitmap bitmap = c8913.f22650;
                if (bitmap != null) {
                    c8913.f22638.mo7015(bitmap);
                    c8913.f22650 = null;
                }
                c8913.f22637 = false;
                C8908 c8908 = c8913.f22651;
                if (c8908 != null) {
                    componentCallbacks2C3896.m7355(c8908);
                    c8913.f22651 = null;
                }
                C8908 c89082 = c8913.f22649;
                if (c89082 != null) {
                    componentCallbacks2C3896.m7355(c89082);
                    c8913.f22649 = null;
                }
                C8908 c89083 = c8913.f22644;
                if (c89083 != null) {
                    componentCallbacks2C3896.m7355(c89083);
                    c8913.f22644 = null;
                }
                C9216 c9216 = c8913.f22642;
                C8882 c8882 = c9216.f23571;
                c9216.f23585 = null;
                byte[] bArr = c9216.f23586;
                if (bArr != null && (c38063 = (C3806) c8882.f22569) != null) {
                    c38063.m7009(bArr);
                }
                int[] iArr = c9216.f23587;
                if (iArr != null && (c38062 = (C3806) c8882.f22569) != null) {
                    c38062.m7009(iArr);
                }
                Bitmap bitmap2 = c9216.f23577;
                if (bitmap2 != null) {
                    ((InterfaceC3811) c8882.f22570).mo7015(bitmap2);
                }
                c9216.f23577 = null;
                c9216.f23570 = null;
                c9216.f23575 = null;
                byte[] bArr2 = c9216.f23569;
                if (bArr2 != null && (c3806 = (C3806) c8882.f22569) != null) {
                    c3806.m7009(bArr2);
                }
                c8913.f22652 = true;
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo7030() {
        switch (this.f22618) {
            case 0:
                return C8911.class;
            default:
                return this.f22619.getClass();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3821
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo7031() {
        int i = this.f22618;
        Drawable drawable = this.f22619;
        switch (i) {
            case 0:
                C8913 c8913 = (C8913) ((C8911) drawable).f22629.f20627;
                C9216 c9216 = c8913.f22642;
                return (c9216.f23587.length * 4) + c9216.f23570.limit() + c9216.f23586.length + c8913.f22643;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m14118() {
    }
}
