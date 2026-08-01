package androidx.lifecycle;

import android.os.Looper;
import androidx.activity.AbstractC0900;
import java.util.Map;
import p199.C8591;
import p199.C8593;
import p199.C8594;
import p207.C8634;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3208 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object f7343 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public volatile Object f7344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile Object f7345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f7346;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7350;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f7351;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f7352;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f7349 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8591 f7348 = new C8591();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7347 = 0;

    public AbstractC3208() {
        Object obj = f7343;
        this.f7344 = obj;
        this.f7345 = obj;
        this.f7351 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m5052(String str) {
        C8634.m13728().f21620.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C6755.m11870(AbstractC0900.m718("Cannot invoke ", str, " on a background thread"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5053(InterfaceC3203 interfaceC3203) {
        Object obj;
        m5052("observeForever");
        C3209 c3209 = new C3209(this, interfaceC3203);
        C8591 c8591 = this.f7348;
        C8594 c8594Mo13675 = c8591.mo13675(interfaceC3203);
        if (c8594Mo13675 != null) {
            obj = c8594Mo13675.f21404;
        } else {
            C8594 c8594 = new C8594(interfaceC3203, c3209);
            c8591.f21396++;
            C8594 c85942 = c8591.f21397;
            if (c85942 == null) {
                c8591.f21399 = c8594;
                c8591.f21397 = c8594;
            } else {
                c85942.f21405 = c8594;
                c8594.f21403 = c85942;
                c8591.f21397 = c8594;
            }
            obj = null;
        }
        if (((C3209) obj) != null) {
            return;
        }
        c3209.m5055(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5054(C3209 c3209) {
        if (this.f7350) {
            this.f7352 = true;
            return;
        }
        this.f7350 = true;
        do {
            this.f7352 = false;
            if (c3209 != null) {
                if (c3209.f7355) {
                    int i = c3209.f7354;
                    int i2 = this.f7351;
                    if (i < i2) {
                        c3209.f7354 = i2;
                        c3209.f7356.mo5024(this.f7345);
                    }
                }
                c3209 = null;
            } else {
                C8591 c8591 = this.f7348;
                c8591.getClass();
                C8593 c8593 = new C8593(c8591);
                c8591.f21398.put(c8593, Boolean.FALSE);
                while (c8593.hasNext()) {
                    C3209 c32092 = (C3209) ((Map.Entry) c8593.next()).getValue();
                    if (c32092.f7355) {
                        int i3 = c32092.f7354;
                        int i4 = this.f7351;
                        if (i3 < i4) {
                            c32092.f7354 = i4;
                            c32092.f7356.mo5024(this.f7345);
                        }
                    }
                    if (this.f7352) {
                        break;
                    }
                }
            }
        } while (this.f7352);
        this.f7350 = false;
    }
}
