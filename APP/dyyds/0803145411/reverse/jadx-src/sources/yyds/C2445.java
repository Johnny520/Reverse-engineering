package yyds;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C0040;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲇᛴᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2445 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f12026;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C0472 f12027;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C1751 f12028;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C1751 f12029;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2587 f12030;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1575 f12031;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f12032;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Handler f12033;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f12034;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C1751 f12035;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public Bitmap f12036;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f12037;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f12038;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public int f12039;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f12040;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ComponentCallbacks2C2272 f12041;

    public C2445(ComponentCallbacks2C0040 componentCallbacks2C0040, C1575 c1575, int i, int i2, Bitmap bitmap) {
        InterfaceC2587 interfaceC2587 = componentCallbacks2C0040.f383;
        C2572 c2572 = componentCallbacks2C0040.f381;
        ComponentCallbacks2C2272 componentCallbacks2C2272M252 = ComponentCallbacks2C0040.m252(c2572.getBaseContext());
        ComponentCallbacks2C2272 componentCallbacks2C2272M2522 = ComponentCallbacks2C0040.m252(c2572.getBaseContext());
        componentCallbacks2C2272M2522.getClass();
        C0472 c0472M1285 = new C0472(componentCallbacks2C2272M2522.f11200, componentCallbacks2C2272M2522, Bitmap.class, componentCallbacks2C2272M2522.f11202).mo1282(ComponentCallbacks2C2272.f11192).mo1282(((C1261) ((C1261) ((C1261) new C1261().m1786(C2340.f11505)).m1787()).m1797()).m1795(i, i2));
        this.f12038 = new ArrayList();
        this.f12041 = componentCallbacks2C2272M252;
        Handler handler = new Handler(Looper.getMainLooper(), new C1775(this));
        this.f12030 = interfaceC2587;
        this.f12033 = handler;
        this.f12027 = c0472M1285;
        this.f12031 = c1575;
        m4483(C1850.f9322, bitmap);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4481() {
        int i;
        if (!this.f12040 || this.f12034) {
            return;
        }
        C1751 c1751 = this.f12028;
        if (c1751 != null) {
            this.f12028 = null;
            m4482(c1751);
            return;
        }
        this.f12034 = true;
        C1575 c1575 = this.f12031;
        C0069 c0069 = c1575.f7992;
        int i2 = c0069.f616;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = c1575.f7991) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((C0829) c0069.f610.get(i)).f3765));
        int i3 = (c1575.f7991 + 1) % c1575.f7992.f616;
        c1575.f7991 = i3;
        this.f12035 = new C1751(this.f12033, i3, jUptimeMillis);
        C0472 c0472M1279 = this.f12027.mo1282((C1261) new C1261().m1788(new C1818(Double.valueOf(Math.random())))).m1279(c1575);
        c0472M1279.m1280(this.f12035, c0472M1279);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4482(C1751 c1751) {
        this.f12034 = false;
        boolean z = this.f12037;
        Handler handler = this.f12033;
        if (z) {
            handler.obtainMessage(2, c1751).sendToTarget();
            return;
        }
        if (!this.f12040) {
            this.f12028 = c1751;
            return;
        }
        if (c1751.f8812 != null) {
            Bitmap bitmap = this.f12036;
            if (bitmap != null) {
                this.f12030.mo1856(bitmap);
                this.f12036 = null;
            }
            C1751 c17512 = this.f12029;
            this.f12029 = c1751;
            ArrayList arrayList = this.f12038;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C2380 c2380 = (C2380) arrayList.get(size);
                Object callback = c2380.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c2380.stop();
                    c2380.invalidateSelf();
                } else {
                    c2380.invalidateSelf();
                    C1751 c17513 = c2380.f11732.f12303.f12029;
                    if ((c17513 != null ? c17513.f8813 : -1) == r5.f12031.f7992.f616 - 1) {
                        c2380.f11725++;
                    }
                    int i = c2380.f11726;
                    if (i != -1 && c2380.f11725 >= i) {
                        c2380.stop();
                    }
                }
            }
            if (c17512 != null) {
                handler.obtainMessage(2, c17512).sendToTarget();
            }
        }
        m4481();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m4483(InterfaceC0556 interfaceC0556, Bitmap bitmap) {
        AbstractC0319.m992(interfaceC0556, "Argument must not be null");
        AbstractC0319.m992(bitmap, "Argument must not be null");
        this.f12036 = bitmap;
        this.f12027 = this.f12027.mo1282(new C1261().m1796(interfaceC0556, true));
        this.f12026 = AbstractC0181.m756(bitmap);
        this.f12032 = bitmap.getWidth();
        this.f12039 = bitmap.getHeight();
    }
}
