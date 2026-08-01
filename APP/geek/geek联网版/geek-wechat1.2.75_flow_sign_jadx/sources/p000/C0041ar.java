package p000;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: ar */
/* JADX INFO: loaded from: classes.dex */
public final class C0041ar {

    /* JADX INFO: renamed from: a */
    public boolean f618a;

    /* JADX INFO: renamed from: b */
    public int f619b;

    /* JADX INFO: renamed from: c */
    public int f620c;

    /* JADX INFO: renamed from: d */
    public int f621d;

    /* JADX INFO: renamed from: e */
    public int f622e;

    /* JADX INFO: renamed from: f */
    public int f623f;

    /* JADX INFO: renamed from: g */
    public int f624g;

    /* JADX INFO: renamed from: h */
    public int f625h;

    /* JADX INFO: renamed from: i */
    public int f626i;

    /* JADX INFO: renamed from: j */
    public int f627j;

    /* JADX INFO: renamed from: k */
    public List f628k;

    /* JADX INFO: renamed from: l */
    public boolean f629l;

    /* JADX INFO: renamed from: a */
    public final void m468a(View view) {
        int iM1420b;
        int size = this.f628k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((i00) this.f628k.get(i2)).f2296a;
            C0836vz c0836vz = (C0836vz) view3.getLayoutParams();
            if (view3 != view && !c0836vz.f5017a.m1426h() && (iM1420b = (c0836vz.f5017a.m1420b() - this.f621d) * this.f622e) >= 0 && iM1420b < i) {
                view2 = view3;
                if (iM1420b == 0) {
                    break;
                } else {
                    i = iM1420b;
                }
            }
        }
        if (view2 == null) {
            this.f621d = -1;
        } else {
            this.f621d = ((C0836vz) view2.getLayoutParams()).f5017a.m1420b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m469b(a00 a00Var) {
        List list = this.f628k;
        if (list == null) {
            View view = a00Var.m11i(this.f621d, Long.MAX_VALUE).f2296a;
            this.f621d += this.f622e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((i00) this.f628k.get(i)).f2296a;
            C0836vz c0836vz = (C0836vz) view2.getLayoutParams();
            if (!c0836vz.f5017a.m1426h() && this.f621d == c0836vz.f5017a.m1420b()) {
                m468a(view2);
                return view2;
            }
        }
        return null;
    }
}
