package yyds;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛷᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1498 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C2617 f7065;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ WeakReference f7066;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0947 f7067;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f7068;

    public RunnableC1498(WeakReference weakReference, int i, C2617 c2617, C0947 c0947) {
        this.f7066 = weakReference;
        this.f7068 = i;
        this.f7065 = c2617;
        this.f7067 = c0947;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2617 c2617;
        Object c2658;
        ViewGroup viewGroup = (ViewGroup) this.f7066.get();
        if (viewGroup != null) {
            int i = this.f7068;
            C2617 c26172 = this.f7065;
            if (i == c26172.f12869 && c26172.f12864) {
                Map map = C2153.f10614;
                AbstractC2328.m4341(-979870591648622L);
                synchronized (map) {
                    c2617 = (C2617) map.get(viewGroup);
                }
                C2617 c26173 = this.f7065;
                if (c2617 == c26173) {
                    try {
                        C2153.f10615.getClass();
                        c2658 = C2153.m4106(viewGroup, c26173, false);
                    } catch (Throwable th) {
                        c2658 = new C2658(th);
                    }
                    C2617 c26174 = this.f7065;
                    Throwable thM4249 = C2248.m4249(c2658);
                    if (thM4249 != null) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-979969375896430L) + c26174.f12865, thM4249);
                    }
                    if (c2658 instanceof C2658) {
                        c2658 = null;
                    }
                    if (((EnumC2163) c2658) == EnumC2163.f10631) {
                        C0947 c0947 = this.f7067;
                        int i2 = c0947.f4410;
                        c0947.f4410 = i2 - 1;
                        if (i2 > 0 && viewGroup.isAttachedToWindow() && this.f7068 == this.f7065.f12869) {
                            viewGroup.postOnAnimation(this);
                            return;
                        }
                    }
                    int i3 = this.f7068;
                    C2617 c26175 = this.f7065;
                    if (i3 == c26175.f12869) {
                        c26175.f12867 = false;
                        return;
                    }
                    return;
                }
            }
        }
        int i4 = this.f7068;
        C2617 c26176 = this.f7065;
        if (i4 == c26176.f12869) {
            c26176.f12867 = false;
        }
    }
}
