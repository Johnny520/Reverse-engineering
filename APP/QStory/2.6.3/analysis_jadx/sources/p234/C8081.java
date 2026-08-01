package p234;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C3064;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.InterfaceC3000;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import p222.AbstractC7989;
import p230.C8053;
import p285.C8387;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8081 implements InterfaceC2989, InterfaceC3000 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f22273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Drawable f22274;

    public C8081(Drawable drawable, int i) {
        this.f22273 = i;
        AbstractC7989.m13469(drawable, "Argument must not be null");
        this.f22274 = drawable;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    public final Object get() {
        Drawable drawable = this.f22274;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3000
    public void initialize() {
        int i = this.f22273;
        Drawable drawable = this.f22274;
        switch (i) {
            case 0:
                ((C8084) ((C8082) drawable).f22284.f20282).f22305.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof C8082) {
                    ((C8084) ((C8082) drawable).f22284.f20282).f22305.prepareToDraw();
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    public final void recycle() {
        C2974 c2974;
        C2974 c29742;
        C2974 c29743;
        switch (this.f22273) {
            case 0:
                C8082 c8082 = (C8082) this.f22274;
                c8082.stop();
                c8082.f22277 = true;
                C8084 c8084 = (C8084) c8082.f22284.f20282;
                ComponentCallbacks2C3064 componentCallbacks2C3064 = c8084.f22294;
                c8084.f22295.clear();
                Bitmap bitmap = c8084.f22305;
                if (bitmap != null) {
                    c8084.f22293.mo6455(bitmap);
                    c8084.f22305 = null;
                }
                c8084.f22292 = false;
                C8079 c8079 = c8084.f22306;
                if (c8079 != null) {
                    componentCallbacks2C3064.m6795(c8079);
                    c8084.f22306 = null;
                }
                C8079 c80792 = c8084.f22304;
                if (c80792 != null) {
                    componentCallbacks2C3064.m6795(c80792);
                    c8084.f22304 = null;
                }
                C8079 c80793 = c8084.f22299;
                if (c80793 != null) {
                    componentCallbacks2C3064.m6795(c80793);
                    c8084.f22299 = null;
                }
                C8387 c8387 = c8084.f22297;
                C8053 c8053 = c8387.f23226;
                c8387.f23240 = null;
                byte[] bArr = c8387.f23241;
                if (bArr != null && (c29743 = (C2974) c8053.f22224) != null) {
                    c29743.m6449(bArr);
                }
                int[] iArr = c8387.f23242;
                if (iArr != null && (c29742 = (C2974) c8053.f22224) != null) {
                    c29742.m6449(iArr);
                }
                Bitmap bitmap2 = c8387.f23232;
                if (bitmap2 != null) {
                    ((InterfaceC2979) c8053.f22225).mo6455(bitmap2);
                }
                c8387.f23232 = null;
                c8387.f23225 = null;
                c8387.f23230 = null;
                byte[] bArr2 = c8387.f23224;
                if (bArr2 != null && (c2974 = (C2974) c8053.f22224) != null) {
                    c2974.m6449(bArr2);
                }
                c8084.f22307 = true;
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo6470() {
        switch (this.f22273) {
            case 0:
                return C8082.class;
            default:
                return this.f22274.getClass();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2989
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo6471() {
        int i = this.f22273;
        Drawable drawable = this.f22274;
        switch (i) {
            case 0:
                C8084 c8084 = (C8084) ((C8082) drawable).f22284.f20282;
                C8387 c8387 = c8084.f22297;
                return (c8387.f23242.length * 4) + c8387.f23225.limit() + c8387.f23241.length + c8084.f22298;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m13559() {
    }
}
