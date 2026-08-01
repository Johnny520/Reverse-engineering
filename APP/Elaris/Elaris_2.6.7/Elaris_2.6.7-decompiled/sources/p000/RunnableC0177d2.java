package p000;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: d2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0177d2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f185a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f186b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f187c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f188d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f189e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0177d2(int i, Runnable runnable, String str, AtomicReference atomicReference) {
        this.f186b = i;
        this.f189e = runnable;
        this.f188d = str;
        this.f187c = atomicReference;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, CHECK_CAST]}, finally: {[INVOKE, CHECK_CAST, SGET, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Future future;
        Future future2;
        int i = this.f185a;
        Object obj = this.f189e;
        int i2 = this.f186b;
        Object obj2 = this.f187c;
        Object obj3 = this.f188d;
        switch (i) {
            case 0:
                try {
                    C0540y c0540yM564R0 = AbstractC0260i5.m564R0((String) obj3, (String) obj);
                    AbstractC0225g2.f294d.post(new RunnableC0035c2(this, c0540yM564R0, (ArrayList) c0540yM564R0.f1081a));
                    return;
                } catch (Throwable th) {
                    AbstractC0225g2.m427m((C0193e2) obj2, AbstractC0225g2.m425k(th));
                    return;
                }
            case 1:
                C0307l1 c0307l1 = (C0307l1) obj3;
                try {
                    Bitmap bitmapM415a = AbstractC0225g2.m415a(i2, AbstractC0260i5.m584Y(c0307l1));
                    if (bitmapM415a != null) {
                        AbstractC0225g2.f295e.put(c0307l1.f507a, bitmapM415a);
                    }
                    if (bitmapM415a != null) {
                        AbstractC0225g2.f294d.post(new RunnableC0412q(this, bitmapM415a, 3, false));
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                AtomicReference atomicReference = (AtomicReference) obj2;
                String str = (String) obj3;
                try {
                    if (HookEntry.isCurrentHotReloadGeneration(i2)) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ((Runnable) obj).run();
                        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                            HookEntry.log(str + " completed in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                        }
                        future2 = (Future) atomicReference.get();
                        if (future2 == null) {
                            return;
                        }
                    } else if (future == null) {
                        return;
                    }
                } catch (Throwable th2) {
                    try {
                        AbstractC0198e7.m343a("hook-task", str, th2);
                        future2 = (Future) atomicReference.get();
                        if (future2 == null) {
                            return;
                        }
                    } finally {
                        future = (Future) atomicReference.get();
                        if (future != null) {
                            AbstractC0361o7.f643a.remove(str, future);
                        }
                    }
                }
                return;
        }
    }

    public RunnableC0177d2(String str, String str2, C0193e2 c0193e2, int i) {
        this.f188d = str;
        this.f189e = str2;
        this.f187c = c0193e2;
        this.f186b = i;
    }

    public RunnableC0177d2(C0307l1 c0307l1, int i, C0193e2 c0193e2, ImageView imageView) {
        this.f188d = c0307l1;
        this.f186b = i;
        this.f187c = c0193e2;
        this.f189e = imageView;
    }
}
