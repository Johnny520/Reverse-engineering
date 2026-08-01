package p047I0;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p123Y3.AbstractC1776g;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: I0.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0702W extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2230a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f2230a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                C0706Y c0706y = new C0706Y(choreographer, AbstractC1785a.m3245e(looperMyLooper));
                return AbstractC1785a.m3254o(c0706y, c0706y.f2244o);
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC1776g.f6076a);
                return simpleDateFormat;
        }
    }
}
