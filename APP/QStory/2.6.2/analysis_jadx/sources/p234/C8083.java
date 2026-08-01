package p234;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.C3061;
import com.bumptech.glide.C3068;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.ComponentCallbacks2C3063;
import com.bumptech.glide.load.engine.C3012;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import com.bumptech.glide.request.C3048;
import java.util.ArrayList;
import p221.C7975;
import p222.AbstractC7988;
import p226.C8003;
import p285.C8386;
import p285.C8388;
import p285.C8389;
import p286.InterfaceC8398;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f22294;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2978 f22295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ComponentCallbacks2C3063 f22296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f22297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Handler f22298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8386 f22299;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f22300;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C8078 f22301;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f22302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f22303;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C3061 f22304;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f22305;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C8078 f22306;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Bitmap f22307;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8078 f22308;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f22309;

    public C8083(ComponentCallbacks2C3057 componentCallbacks2C3057, C8386 c8386, int i, int i2, Bitmap bitmap) {
        InterfaceC2978 interfaceC2978 = componentCallbacks2C3057.f9765;
        C3068 c3068 = componentCallbacks2C3057.f9764;
        ComponentCallbacks2C3063 componentCallbacks2C3063M6720 = ComponentCallbacks2C3057.m6720(c3068.getBaseContext());
        C3061 c3061M6739 = ComponentCallbacks2C3057.m6720(c3068.getBaseContext()).m6755(Bitmap.class).mo6559(ComponentCallbacks2C3063.f9783).mo6559(((C3048) ((C3048) ((C3048) new C3048().m6556(C3012.f9580)).m6551()).m6564()).m6566(i, i2));
        this.f22297 = new ArrayList();
        this.f22296 = componentCallbacks2C3063M6720;
        Handler handler = new Handler(Looper.getMainLooper(), new C8077(this, 0));
        this.f22295 = interfaceC2978;
        this.f22298 = handler;
        this.f22304 = c3061M6739;
        this.f22299 = c8386;
        m13534(C8003.f22108, bitmap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13534(InterfaceC8398 interfaceC8398, Bitmap bitmap) {
        AbstractC7988.m13441(interfaceC8398, "Argument must not be null");
        AbstractC7988.m13441(bitmap, "Argument must not be null");
        this.f22307 = bitmap;
        this.f22304 = this.f22304.mo6559(new C3048().m6552(interfaceC8398, true));
        this.f22300 = AbstractC7988.m13440(bitmap);
        this.f22302 = bitmap.getWidth();
        this.f22303 = bitmap.getHeight();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13535(C8078 c8078) {
        this.f22305 = false;
        boolean z = this.f22309;
        Handler handler = this.f22298;
        if (z) {
            handler.obtainMessage(2, c8078).sendToTarget();
            return;
        }
        if (!this.f22294) {
            this.f22301 = c8078;
            return;
        }
        if (c8078.f22273 != null) {
            Bitmap bitmap = this.f22307;
            if (bitmap != null) {
                this.f22295.mo6397(bitmap);
                this.f22307 = null;
            }
            C8078 c80782 = this.f22308;
            this.f22308 = c8078;
            ArrayList arrayList = this.f22297;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C8081 c8081 = (C8081) arrayList.get(size);
                Object callback = c8081.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c8081.stop();
                    c8081.invalidateSelf();
                } else {
                    c8081.invalidateSelf();
                    C8078 c80783 = ((C8083) c8081.f22286.f20287).f22308;
                    if ((c80783 != null ? c80783.f22270 : -1) == r5.f22299.f23241.f23251 - 1) {
                        c8081.f22282++;
                    }
                    int i = c8081.f22283;
                    if (i != -1 && c8081.f22282 >= i) {
                        c8081.stop();
                    }
                }
            }
            if (c80782 != null) {
                handler.obtainMessage(2, c80782).sendToTarget();
            }
        }
        m13536();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13536() {
        int i;
        if (!this.f22294 || this.f22305) {
            return;
        }
        C8078 c8078 = this.f22301;
        if (c8078 != null) {
            this.f22301 = null;
            m13535(c8078);
            return;
        }
        this.f22305 = true;
        C8386 c8386 = this.f22299;
        C8388 c8388 = c8386.f23241;
        int i2 = c8388.f23251;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = c8386.f23240) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((C8389) c8388.f23249.get(i)).f23268));
        int i3 = (c8386.f23240 + 1) % c8386.f23241.f23251;
        c8386.f23240 = i3;
        this.f22306 = new C8078(this.f22298, i3, jUptimeMillis);
        C3061 c3061M6741 = this.f22304.mo6559((C3048) new C3048().m6560(new C7975(Double.valueOf(Math.random())))).m6741(c8386);
        c3061M6741.m6743(this.f22306, c3061M6741);
    }

    public void setOnEveryFrameReadyListener(InterfaceC8084 interfaceC8084) {
    }
}
