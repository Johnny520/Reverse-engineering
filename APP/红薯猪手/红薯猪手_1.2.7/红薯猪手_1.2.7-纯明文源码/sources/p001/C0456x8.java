package p001;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;
import p001.C0443w8;
import p001.C0481z7;

/* JADX INFO: renamed from: ۟.x8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0456x8 {

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final AtomicInteger f1866 = new AtomicInteger();

    /* JADX INFO: renamed from: ۥ */
    public final C0481z7 f1192;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C0443w8.a f1193;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f1867;

    public C0456x8(C0481z7 c0481z7, Uri uri) {
        this.f1192 = c0481z7;
        this.f1193 = new C0443w8.a(uri, c0481z7.f1914);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public final void m964(ImageView imageView, InterfaceC0205f0 interfaceC0205f0) {
        long jNanoTime = System.nanoTime();
        StringBuilder sb = C0259ic.f866;
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
        C0443w8.a aVar = this.f1193;
        if (!((aVar.f1175 == null && aVar.f1176 == 0) ? false : true)) {
            this.f1192.m976(imageView);
            Paint paint = C0143a8.f1299;
            imageView.setImageDrawable(null);
            if (imageView.getDrawable() instanceof AnimationDrawable) {
                ((AnimationDrawable) imageView.getDrawable()).start();
                return;
            }
            return;
        }
        int andIncrement = f1866.getAndIncrement();
        C0443w8.a aVar2 = this.f1193;
        if (aVar2.f1856 == 0) {
            aVar2.f1856 = 2;
        }
        Uri uri = aVar2.f1175;
        int i = aVar2.f1176;
        aVar2.getClass();
        aVar2.getClass();
        C0443w8 c0443w8 = new C0443w8(uri, i, 0, 0, aVar2.f1855, aVar2.f1856);
        c0443w8.f1172 = andIncrement;
        c0443w8.f1173 = jNanoTime;
        if (this.f1192.f1916) {
            c0443w8.m1264();
            c0443w8.toString();
        }
        ((C0481z7.f.a) this.f1192.f1229).getClass();
        StringBuilder sb2 = C0259ic.f866;
        if (uri != null) {
            String string = uri.toString();
            sb2.ensureCapacity(string.length() + 50);
            sb2.append(string);
        } else {
            sb2.ensureCapacity(50);
            sb2.append(i);
        }
        sb2.append('\n');
        if (0.0f != 0.0f) {
            sb2.append("rotation:");
            sb2.append(0.0f);
            sb2.append('\n');
        }
        if (c0443w8.m957()) {
            sb2.append("resize:");
            sb2.append(0);
            sb2.append('x');
            sb2.append(0);
            sb2.append('\n');
        }
        String string2 = sb2.toString();
        C0259ic.f866.setLength(0);
        C0481z7 c0481z7 = this.f1192;
        Bitmap bitmapM866 = ((C0238h5) c0481z7.f1909).m866(string2);
        C0215fa c0215fa = c0481z7.f1910;
        if (bitmapM866 != null) {
            c0215fa.f795.sendEmptyMessage(0);
        } else {
            c0215fa.f795.sendEmptyMessage(1);
        }
        if (bitmapM866 == null) {
            Paint paint2 = C0143a8.f1299;
            imageView.setImageDrawable(null);
            if (imageView.getDrawable() instanceof AnimationDrawable) {
                ((AnimationDrawable) imageView.getDrawable()).start();
            }
            this.f1192.m1287(new C0153b4(this.f1192, imageView, c0443w8, string2, interfaceC0205f0, this.f1867));
            return;
        }
        this.f1192.m976(imageView);
        C0481z7 c0481z72 = this.f1192;
        Context context = c0481z72.f1907;
        C0481z7.e eVar = C0481z7.e.MEMORY;
        C0143a8.m807(imageView, context, bitmapM866, eVar, this.f1867, c0481z72.f1915);
        if (this.f1192.f1916) {
            c0443w8.m1264();
            eVar.toString();
        }
        if (interfaceC0205f0 != null) {
            interfaceC0205f0.m852();
        }
    }
}
