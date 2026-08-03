package p000a;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import p000a.C0715mh;

/* JADX INFO: renamed from: a.b9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0498b9 extends C0715mh.b {

    /* JADX INFO: renamed from: b */
    public final View f1843b;

    /* JADX INFO: renamed from: c */
    public int f1844c;

    /* JADX INFO: renamed from: d */
    public int f1845d;

    /* JADX INFO: renamed from: e */
    public final int[] f1846e = new int[2];

    public C0498b9(View view) {
        this.f1843b = view;
    }

    @Override // p000a.C0715mh.b
    /* JADX INFO: renamed from: a */
    public final C0734nh mo1228a(C0734nh c0734nh, List<C0715mh> list) {
        Iterator<C0715mh> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().f2705a.mo1637c() & 8) != 0) {
                this.f1843b.setTranslationY(C0888w0.m2114c(this.f1845d, 0, r0.f2705a.mo1636b()));
                break;
            }
        }
        return c0734nh;
    }
}
