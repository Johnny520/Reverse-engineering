package p000;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: wq */
/* JADX INFO: loaded from: classes.dex */
public final class C0865wq {

    /* JADX INFO: renamed from: a */
    public boolean f5002a;

    /* JADX INFO: renamed from: b */
    public int f5003b;

    /* JADX INFO: renamed from: c */
    public int f5004c;

    /* JADX INFO: renamed from: d */
    public int f5005d;

    /* JADX INFO: renamed from: e */
    public int f5006e;

    /* JADX INFO: renamed from: f */
    public int f5007f;

    /* JADX INFO: renamed from: g */
    public int f5008g;

    /* JADX INFO: renamed from: h */
    public int f5009h;

    /* JADX INFO: renamed from: i */
    public int f5010i;

    /* JADX INFO: renamed from: j */
    public int f5011j;

    /* JADX INFO: renamed from: k */
    public List f5012k;

    /* JADX INFO: renamed from: l */
    public boolean f5013l;

    /* JADX INFO: renamed from: a */
    public final void m2593a(View view) {
        int iM482b;
        int size = this.f5012k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((b00) this.f5012k.get(i2)).f697a;
            C0577oz c0577oz = (C0577oz) view3.getLayoutParams();
            if (view3 != view && !c0577oz.f3621a.m488h() && (iM482b = (c0577oz.f3621a.m482b() - this.f5005d) * this.f5006e) >= 0 && iM482b < i) {
                view2 = view3;
                if (iM482b == 0) {
                    break;
                } else {
                    i = iM482b;
                }
            }
        }
        if (view2 == null) {
            this.f5005d = -1;
        } else {
            this.f5005d = ((C0577oz) view2.getLayoutParams()).f3621a.m482b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m2594b(C0763tz c0763tz) {
        List list = this.f5012k;
        if (list == null) {
            View view = c0763tz.m2401i(this.f5005d, Long.MAX_VALUE).f697a;
            this.f5005d += this.f5006e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((b00) this.f5012k.get(i)).f697a;
            C0577oz c0577oz = (C0577oz) view2.getLayoutParams();
            if (!c0577oz.f3621a.m488h() && this.f5005d == c0577oz.f3621a.m482b()) {
                m2593a(view2);
                return view2;
            }
        }
        return null;
    }
}
