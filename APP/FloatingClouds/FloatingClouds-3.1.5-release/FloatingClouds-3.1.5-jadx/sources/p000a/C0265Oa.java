package p000a;

import android.view.View;

/* JADX INFO: renamed from: a.Oa */
/* JADX INFO: loaded from: classes.dex */
public final class C0265Oa implements InterfaceC0355Tb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f949a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f950b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f951c;

    public C0265Oa(View view, int i, int i2) {
        this.f949a = i;
        this.f950b = view;
        this.f951c = i2;
    }

    @Override // p000a.InterfaceC0355Tb
    /* JADX INFO: renamed from: a */
    public final C0734nh mo691a(View view, C0734nh c0734nh) {
        int i = c0734nh.f2857a.mo1710f(7).f1799b;
        View view2 = this.f950b;
        int i2 = this.f949a;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f951c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return c0734nh;
    }
}
