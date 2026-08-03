package p000;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1166o;
import androidx.recyclerview.widget.C1161j;
import java.util.List;

/* JADX INFO: renamed from: jo */
/* JADX INFO: loaded from: classes.dex */
public final class C2110jo {

    /* JADX INFO: renamed from: a */
    public boolean f7412a;

    /* JADX INFO: renamed from: b */
    public int f7413b;

    /* JADX INFO: renamed from: c */
    public int f7414c;

    /* JADX INFO: renamed from: d */
    public int f7415d;

    /* JADX INFO: renamed from: e */
    public int f7416e;

    /* JADX INFO: renamed from: f */
    public int f7417f;

    /* JADX INFO: renamed from: g */
    public int f7418g;

    /* JADX INFO: renamed from: h */
    public int f7419h;

    /* JADX INFO: renamed from: i */
    public int f7420i;

    /* JADX INFO: renamed from: j */
    public int f7421j;

    /* JADX INFO: renamed from: k */
    public List f7422k;

    /* JADX INFO: renamed from: l */
    public boolean f7423l;

    /* JADX INFO: renamed from: a */
    public final void m4298a(View view) {
        int layoutPosition;
        int size = this.f7422k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC1166o) this.f7422k.get(i2)).itemView;
            C2431qv c2431qv = (C2431qv) view3.getLayoutParams();
            if (view3 != view && !c2431qv.f8526a.isRemoved() && (layoutPosition = (c2431qv.f8526a.getLayoutPosition() - this.f7415d) * this.f7416e) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f7415d = -1;
        } else {
            this.f7415d = ((C2431qv) view2.getLayoutParams()).f8526a.getLayoutPosition();
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m4299b(C1161j c1161j) {
        List list = this.f7422k;
        if (list == null) {
            View viewM2258d = c1161j.m2258d(this.f7415d);
            this.f7415d += this.f7416e;
            return viewM2258d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((AbstractC1166o) this.f7422k.get(i)).itemView;
            C2431qv c2431qv = (C2431qv) view.getLayoutParams();
            if (!c2431qv.f8526a.isRemoved() && this.f7415d == c2431qv.f8526a.getLayoutPosition()) {
                m4298a(view);
                return view;
            }
        }
        return null;
    }
}
