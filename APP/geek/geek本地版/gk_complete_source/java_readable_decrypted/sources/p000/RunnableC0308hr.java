package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: hr */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0308hr implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0421kr f2298b;

    public /* synthetic */ RunnableC0308hr(C0421kr c0421kr, int i) {
        this.f2297a = i;
        this.f2298b = c0421kr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2297a;
        C0421kr c0421kr = this.f2298b;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                C0411kh c0411kh = c0421kr.f2922c;
                if (c0411kh != null) {
                    c0411kh.setListSelectionHidden(true);
                    c0411kh.requestLayout();
                }
                break;
            default:
                C0411kh c0411kh2 = c0421kr.f2922c;
                if (c0411kh2 != null) {
                    WeakHashMap weakHashMap = ja0.f2600a;
                    if (v90.m2495b(c0411kh2) && c0421kr.f2922c.getCount() > c0421kr.f2922c.getChildCount() && c0421kr.f2922c.getChildCount() <= c0421kr.f2932m) {
                        c0421kr.f2945z.setInputMethodMode(2);
                        c0421kr.mo1708f();
                        break;
                    }
                }
                break;
        }
    }
}
