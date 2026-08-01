package p234;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C3063;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.InterfaceC2999;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import p222.AbstractC7988;
import p230.C8052;
import p285.C8386;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8080 implements InterfaceC2988, InterfaceC2999 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f22275;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Drawable f22276;

    public C8080(Drawable drawable, int i) {
        this.f22275 = i;
        AbstractC7988.m13441(drawable, "Argument must not be null");
        this.f22276 = drawable;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    public final Object get() {
        Drawable drawable = this.f22276;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2999
    public void initialize() {
        int i = this.f22275;
        Drawable drawable = this.f22276;
        switch (i) {
            case 0:
                ((C8083) ((C8081) drawable).f22286.f20287).f22307.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof C8081) {
                    ((C8083) ((C8081) drawable).f22286.f20287).f22307.prepareToDraw();
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    public final void recycle() {
        C2973 c2973;
        C2973 c29732;
        C2973 c29733;
        switch (this.f22275) {
            case 0:
                C8081 c8081 = (C8081) this.f22276;
                c8081.stop();
                c8081.f22279 = true;
                C8083 c8083 = (C8083) c8081.f22286.f20287;
                ComponentCallbacks2C3063 componentCallbacks2C3063 = c8083.f22296;
                c8083.f22297.clear();
                Bitmap bitmap = c8083.f22307;
                if (bitmap != null) {
                    c8083.f22295.mo6397(bitmap);
                    c8083.f22307 = null;
                }
                c8083.f22294 = false;
                C8078 c8078 = c8083.f22308;
                if (c8078 != null) {
                    componentCallbacks2C3063.m6750(c8078);
                    c8083.f22308 = null;
                }
                C8078 c80782 = c8083.f22306;
                if (c80782 != null) {
                    componentCallbacks2C3063.m6750(c80782);
                    c8083.f22306 = null;
                }
                C8078 c80783 = c8083.f22301;
                if (c80783 != null) {
                    componentCallbacks2C3063.m6750(c80783);
                    c8083.f22301 = null;
                }
                C8386 c8386 = c8083.f22299;
                C8052 c8052 = c8386.f23227;
                c8386.f23241 = null;
                byte[] bArr = c8386.f23242;
                if (bArr != null && (c29733 = (C2973) c8052.f22226) != null) {
                    c29733.m6391(bArr);
                }
                int[] iArr = c8386.f23243;
                if (iArr != null && (c29732 = (C2973) c8052.f22226) != null) {
                    c29732.m6391(iArr);
                }
                Bitmap bitmap2 = c8386.f23233;
                if (bitmap2 != null) {
                    ((InterfaceC2978) c8052.f22227).mo6397(bitmap2);
                }
                c8386.f23233 = null;
                c8386.f23226 = null;
                c8386.f23231 = null;
                byte[] bArr2 = c8386.f23225;
                if (bArr2 != null && (c2973 = (C2973) c8052.f22226) != null) {
                    c2973.m6391(bArr2);
                }
                c8083.f22309 = true;
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Class mo6412() {
        switch (this.f22275) {
            case 0:
                return C8081.class;
            default:
                return this.f22276.getClass();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2988
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo6413() {
        int i = this.f22275;
        Drawable drawable = this.f22276;
        switch (i) {
            case 0:
                C8083 c8083 = (C8083) ((C8081) drawable).f22286.f20287;
                C8386 c8386 = c8083.f22299;
                return (c8386.f23243.length * 4) + c8386.f23226.limit() + c8386.f23242.length + c8083.f22300;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m13530() {
    }
}
