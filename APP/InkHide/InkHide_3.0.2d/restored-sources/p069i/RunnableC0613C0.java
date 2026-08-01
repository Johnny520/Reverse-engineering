package p069i;

import java.util.WeakHashMap;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: i.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0613C0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2117a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0619F0 f2118b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0613C0(AbstractC0619F0 abstractC0619F0, int i2) {
        this.f2117a = i2;
        this.f2118b = abstractC0619F0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0619F0 abstractC0619F0 = this.f2118b;
        switch (this.f2117a) {
            case 0:
                C0717t0 c0717t0 = abstractC0619F0.f2130d;
                if (c0717t0 != null) {
                    c0717t0.setListSelectionHidden(true);
                    c0717t0.requestLayout();
                }
                break;
            default:
                C0717t0 c0717t02 = abstractC0619F0.f2130d;
                if (c0717t02 != null) {
                    WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                    if (c0717t02.isAttachedToWindow() && abstractC0619F0.f2130d.getCount() > abstractC0619F0.f2130d.getChildCount() && abstractC0619F0.f2130d.getChildCount() <= abstractC0619F0.f2140n) {
                        abstractC0619F0.f2152z.setInputMethodMode(2);
                        abstractC0619F0.mo1146h();
                        break;
                    }
                }
                break;
        }
    }
}
