package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lr */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0458lr implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0569or f3041b;

    public /* synthetic */ RunnableC0458lr(C0569or c0569or, int i) {
        this.f3040a = i;
        this.f3041b = c0569or;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3040a;
        C0569or c0569or = this.f3041b;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                C0485mh c0485mh = c0569or.f3519c;
                if (c0485mh != null) {
                    c0485mh.setListSelectionHidden(true);
                    c0485mh.requestLayout();
                }
                break;
            default:
                C0485mh c0485mh2 = c0569or.f3519c;
                if (c0485mh2 != null) {
                    WeakHashMap weakHashMap = oa0.f3426a;
                    if (aa0.m39b(c0485mh2) && c0569or.f3519c.getCount() > c0569or.f3519c.getChildCount() && c0569or.f3519c.getChildCount() <= c0569or.f3529m) {
                        c0569or.f3542z.setInputMethodMode(2);
                        c0569or.mo976f();
                        break;
                    }
                }
                break;
        }
    }
}
