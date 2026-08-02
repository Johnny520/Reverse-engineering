package p000;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: renamed from: tb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0728tb extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10658a;

    public /* synthetic */ C0728tb(int i) {
        this.f10658a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f10658a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    C0804vb c0804vb = new C0804vb(choreographer, AbstractC0691se.m4812A(looperMyLooper));
                    return xe1.m6120f0(c0804vb, c0804vb.f11883s);
                }
                C0676s.m4653l("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(wg3.f12507a);
                return simpleDateFormat;
            case 2:
                return new Random();
            default:
                return new q72();
        }
    }
}
