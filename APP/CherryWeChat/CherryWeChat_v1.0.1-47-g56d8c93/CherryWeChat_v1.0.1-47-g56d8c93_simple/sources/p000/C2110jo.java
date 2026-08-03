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
    public final void m4298a(View r8) {
        int r0 = this.f7422k.size();
        View r1 = null;
        int r2 = Integer.MAX_VALUE;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L18;
        View r4 = ((AbstractC1166o) this.f7422k.get(r3)).itemView;
        C2431qv r5 = (C2431qv) r4.getLayoutParams();
        if (r4 == r8) goto L17;
        if (r5.f8526a.isRemoved() == true) goto L17;
        int r52 = (r5.f8526a.getLayoutPosition() - this.f7415d) * this.f7416e;
        if (r52 < 0) goto L17;
        if (r52 >= r2) goto L17;
        r1 = r4;
        if (r52 == 0) goto L18;
        r2 = r52;
    L17:
        r3 = r3 + 1;
    L18:
        if (r1 != null) goto L21;
        this.f7415d = -1;
        return;
    L21:
        this.f7415d = ((C2431qv) r1.getLayoutParams()).f8526a.getLayoutPosition();
    }

    /* JADX INFO: renamed from: b */
    public final View m4299b(C1161j r5) {
        List r0 = this.f7422k;
        if (r0 == null) goto L16;
        int r52 = r0.size();
        int r02 = 0;
    L5:
        if (r02 >= r52) goto L14;
        View r1 = ((AbstractC1166o) this.f7422k.get(r02)).itemView;
        C2431qv r2 = (C2431qv) r1.getLayoutParams();
        if (r2.f8526a.isRemoved() == true) goto L13;
        if (this.f7415d != r2.f8526a.getLayoutPosition()) goto L13;
        m4298a(r1);
        return r1;
    L13:
        r02 = r02 + 1;
        goto L5
    L14:
        return null;
    L16:
        View r53 = r5.m2258d(this.f7415d);
        this.f7415d += this.f7416e;
        return r53;
    }
}
