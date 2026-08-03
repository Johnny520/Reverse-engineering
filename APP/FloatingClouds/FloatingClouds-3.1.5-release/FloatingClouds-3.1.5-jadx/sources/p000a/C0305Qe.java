package p000a;

import android.view.View;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.Qe */
/* JADX INFO: loaded from: classes.dex */
public class C0305Qe {

    /* JADX INFO: renamed from: a */
    public int f1102a;

    /* JADX INFO: renamed from: b */
    public int f1103b;

    /* JADX INFO: renamed from: c */
    public int f1104c;

    /* JADX INFO: renamed from: d */
    public Object f1105d;

    public C0305Qe() {
        if (C0726n9.f2847a == null) {
            C0726n9.f2847a = new C0726n9();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m849a(int i) {
        if (i < this.f1104c) {
            return ((ByteBuffer) this.f1105d).getShort(this.f1103b + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m850b() {
        int i = this.f1104c;
        View view = (View) this.f1105d;
        int top2 = i - (view.getTop() - this.f1102a);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        view.offsetTopAndBottom(top2);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f1103b));
    }
}
