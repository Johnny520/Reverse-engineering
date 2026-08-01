package p250;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.C3894;
import com.bumptech.glide.C3901;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.ComponentCallbacks2C3896;
import com.bumptech.glide.load.engine.C3845;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import com.bumptech.glide.request.C3881;
import java.util.ArrayList;
import p237.C8805;
import p238.AbstractC8818;
import p242.C8833;
import p301.C9216;
import p301.C9218;
import p301.C9219;
import p302.InterfaceC9228;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8913 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f22637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC3811 f22638;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ComponentCallbacks2C3896 f22639;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f22640;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Handler f22641;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9216 f22642;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f22643;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C8908 f22644;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f22645;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f22646;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C3894 f22647;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f22648;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C8908 f22649;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Bitmap f22650;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8908 f22651;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f22652;

    public C8913(ComponentCallbacks2C3890 componentCallbacks2C3890, C9216 c9216, int i, int i2, Bitmap bitmap) {
        InterfaceC3811 interfaceC3811 = componentCallbacks2C3890.f10119;
        C3901 c3901 = componentCallbacks2C3890.f10118;
        ComponentCallbacks2C3896 componentCallbacks2C3896M7325 = ComponentCallbacks2C3890.m7325(c3901.getBaseContext());
        C3894 c3894M7344 = ComponentCallbacks2C3890.m7325(c3901.getBaseContext()).m7360(Bitmap.class).mo7179(ComponentCallbacks2C3896.f10137).mo7179(((C3881) ((C3881) ((C3881) new C3881().m7176(C3845.f9927)).m7171()).m7184()).m7186(i, i2));
        this.f22640 = new ArrayList();
        this.f22639 = componentCallbacks2C3896M7325;
        Handler handler = new Handler(Looper.getMainLooper(), new C8907(this, 0));
        this.f22638 = interfaceC3811;
        this.f22641 = handler;
        this.f22647 = c3894M7344;
        this.f22642 = c9216;
        m14122(C8833.f22450, bitmap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14122(InterfaceC9228 interfaceC9228, Bitmap bitmap) {
        AbstractC8818.m14028(interfaceC9228, "Argument must not be null");
        AbstractC8818.m14028(bitmap, "Argument must not be null");
        this.f22650 = bitmap;
        this.f22647 = this.f22647.mo7179(new C3881().m7172(interfaceC9228, true));
        this.f22643 = AbstractC8818.m14027(bitmap);
        this.f22645 = bitmap.getWidth();
        this.f22646 = bitmap.getHeight();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14123(C8908 c8908) {
        this.f22648 = false;
        boolean z = this.f22652;
        Handler handler = this.f22641;
        if (z) {
            handler.obtainMessage(2, c8908).sendToTarget();
            return;
        }
        if (!this.f22637) {
            this.f22644 = c8908;
            return;
        }
        if (c8908.f22616 != null) {
            Bitmap bitmap = this.f22650;
            if (bitmap != null) {
                this.f22638.mo7015(bitmap);
                this.f22650 = null;
            }
            C8908 c89082 = this.f22651;
            this.f22651 = c8908;
            ArrayList arrayList = this.f22640;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C8911 c8911 = (C8911) arrayList.get(size);
                Object callback = c8911.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c8911.stop();
                    c8911.invalidateSelf();
                } else {
                    c8911.invalidateSelf();
                    C8908 c89083 = ((C8913) c8911.f22629.f20627).f22651;
                    if ((c89083 != null ? c89083.f22613 : -1) == r5.f22642.f23585.f23595 - 1) {
                        c8911.f22625++;
                    }
                    int i = c8911.f22626;
                    if (i != -1 && c8911.f22625 >= i) {
                        c8911.stop();
                    }
                }
            }
            if (c89082 != null) {
                handler.obtainMessage(2, c89082).sendToTarget();
            }
        }
        m14124();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14124() {
        int i;
        if (!this.f22637 || this.f22648) {
            return;
        }
        C8908 c8908 = this.f22644;
        if (c8908 != null) {
            this.f22644 = null;
            m14123(c8908);
            return;
        }
        this.f22648 = true;
        C9216 c9216 = this.f22642;
        C9218 c9218 = c9216.f23585;
        int i2 = c9218.f23595;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = c9216.f23584) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((C9219) c9218.f23593.get(i)).f23612));
        int i3 = (c9216.f23584 + 1) % c9216.f23585.f23595;
        c9216.f23584 = i3;
        this.f22649 = new C8908(this.f22641, i3, jUptimeMillis);
        C3894 c3894M7346 = this.f22647.mo7179((C3881) new C3881().m7180(new C8805(Double.valueOf(Math.random())))).m7346(c9216);
        c3894M7346.m7348(this.f22649, c3894M7346);
    }

    public void setOnEveryFrameReadyListener(InterfaceC8914 interfaceC8914) {
    }
}
