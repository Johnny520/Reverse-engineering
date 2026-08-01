package p097T1;

import java.util.ArrayDeque;
import me.dartcv.nuke.BuildConfig;
import p073O1.C1041c;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: T1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1414c {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f5060a;

    public C1414c(int i5) {
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                char[] cArr = AbstractC2511o.f8029a;
                this.f5060a = new ArrayDeque(0);
                break;
            default:
                this.f5060a = new ArrayDeque();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2717a(C1041c c1041c) {
        c1041c.f3258b = null;
        c1041c.f3259c = null;
        this.f5060a.offer(c1041c);
    }
}
