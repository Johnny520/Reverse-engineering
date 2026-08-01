package p234;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.C3062;
import com.bumptech.glide.C3069;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.ComponentCallbacks2C3064;
import com.bumptech.glide.load.engine.C3013;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import com.bumptech.glide.request.C3049;
import java.util.ArrayList;
import p221.C7976;
import p222.AbstractC7989;
import p226.C8004;
import p285.C8387;
import p285.C8389;
import p285.C8390;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f22292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2979 f22293;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ComponentCallbacks2C3064 f22294;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f22295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Handler f22296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8387 f22297;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f22298;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C8079 f22299;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f22300;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f22301;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C3062 f22302;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f22303;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C8079 f22304;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Bitmap f22305;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8079 f22306;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f22307;

    public C8084(ComponentCallbacks2C3058 componentCallbacks2C3058, C8387 c8387, int i, int i2, Bitmap bitmap) {
        InterfaceC2979 interfaceC2979 = componentCallbacks2C3058.f9774;
        C3069 c3069 = componentCallbacks2C3058.f9773;
        ComponentCallbacks2C3064 componentCallbacks2C3064M6765 = ComponentCallbacks2C3058.m6765(c3069.getBaseContext());
        C3062 c3062M6784 = ComponentCallbacks2C3058.m6765(c3069.getBaseContext()).m6800(Bitmap.class).mo6619(ComponentCallbacks2C3064.f9792).mo6619(((C3049) ((C3049) ((C3049) new C3049().m6616(C3013.f9582)).m6611()).m6624()).m6626(i, i2));
        this.f22295 = new ArrayList();
        this.f22294 = componentCallbacks2C3064M6765;
        Handler handler = new Handler(Looper.getMainLooper(), new C8078(this, 0));
        this.f22293 = interfaceC2979;
        this.f22296 = handler;
        this.f22302 = c3062M6784;
        this.f22297 = c8387;
        m13563(C8004.f22105, bitmap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13563(InterfaceC8399 interfaceC8399, Bitmap bitmap) {
        AbstractC7989.m13469(interfaceC8399, "Argument must not be null");
        AbstractC7989.m13469(bitmap, "Argument must not be null");
        this.f22305 = bitmap;
        this.f22302 = this.f22302.mo6619(new C3049().m6612(interfaceC8399, true));
        this.f22298 = AbstractC7989.m13468(bitmap);
        this.f22300 = bitmap.getWidth();
        this.f22301 = bitmap.getHeight();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13564(C8079 c8079) {
        this.f22303 = false;
        boolean z = this.f22307;
        Handler handler = this.f22296;
        if (z) {
            handler.obtainMessage(2, c8079).sendToTarget();
            return;
        }
        if (!this.f22292) {
            this.f22299 = c8079;
            return;
        }
        if (c8079.f22271 != null) {
            Bitmap bitmap = this.f22305;
            if (bitmap != null) {
                this.f22293.mo6455(bitmap);
                this.f22305 = null;
            }
            C8079 c80792 = this.f22306;
            this.f22306 = c8079;
            ArrayList arrayList = this.f22295;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C8082 c8082 = (C8082) arrayList.get(size);
                Object callback = c8082.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c8082.stop();
                    c8082.invalidateSelf();
                } else {
                    c8082.invalidateSelf();
                    C8079 c80793 = ((C8084) c8082.f22284.f20282).f22306;
                    if ((c80793 != null ? c80793.f22268 : -1) == r5.f22297.f23240.f23250 - 1) {
                        c8082.f22280++;
                    }
                    int i = c8082.f22281;
                    if (i != -1 && c8082.f22280 >= i) {
                        c8082.stop();
                    }
                }
            }
            if (c80792 != null) {
                handler.obtainMessage(2, c80792).sendToTarget();
            }
        }
        m13565();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13565() {
        int i;
        if (!this.f22292 || this.f22303) {
            return;
        }
        C8079 c8079 = this.f22299;
        if (c8079 != null) {
            this.f22299 = null;
            m13564(c8079);
            return;
        }
        this.f22303 = true;
        C8387 c8387 = this.f22297;
        C8389 c8389 = c8387.f23240;
        int i2 = c8389.f23250;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = c8387.f23239) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((C8390) c8389.f23248.get(i)).f23267));
        int i3 = (c8387.f23239 + 1) % c8387.f23240.f23250;
        c8387.f23239 = i3;
        this.f22304 = new C8079(this.f22296, i3, jUptimeMillis);
        C3062 c3062M6786 = this.f22302.mo6619((C3049) new C3049().m6620(new C7976(Double.valueOf(Math.random())))).m6786(c8387);
        c3062M6786.m6788(this.f22304, c3062M6786);
    }

    public void setOnEveryFrameReadyListener(InterfaceC8085 interfaceC8085) {
    }
}
