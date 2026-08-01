package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import p017.AbstractC6238;
import p033.AbstractC6325;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1832 extends ThreadLocal {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5323;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f5323) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    C1822 c1822 = new C1822(choreographer, AbstractC6325.m11873(looperMyLooper));
                    return c1822.plus(c1822.f5302);
                }
                C5919.m11250("no Looper on this thread");
                return null;
            case 1:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC6238.f17190);
                return simpleDateFormat;
        }
    }
}
