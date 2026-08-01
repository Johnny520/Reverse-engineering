package androidx.compose.p001ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import p029.AbstractC7059;
import p034.AbstractC7082;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2667 extends ThreadLocal {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5669;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f5669) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    C2657 c2657 = new C2657(choreographer, AbstractC7082.m12298(looperMyLooper));
                    return c2657.plus(c2657.f5648);
                }
                C6755.m11870("no Looper on this thread");
                return null;
            case 1:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC7059.f17512);
                return simpleDateFormat;
        }
    }
}
