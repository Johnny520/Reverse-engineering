package p000a;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p000a.C0324Rg;
import p000a.C0734nh;

/* JADX INFO: renamed from: a.Ng */
/* JADX INFO: loaded from: classes.dex */
public final class C0253Ng implements InterfaceC0355Tb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0871v2 f868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0324Rg.a f869b;

    public C0253Ng(C0871v2 c0871v2, C0324Rg.a aVar) {
        this.f868a = c0871v2;
        this.f869b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    @Override // p000a.InterfaceC0355Tb
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0734nh mo691a(View view, C0734nh c0734nh) {
        boolean z;
        C0324Rg.a aVar = this.f869b;
        int i = aVar.f1157a;
        C0871v2 c0871v2 = this.f868a;
        C0734nh.k kVar = c0734nh.f2857a;
        C0479a9 c0479a9Mo1710f = kVar.mo1710f(7);
        C0479a9 c0479a9Mo1710f2 = kVar.mo1710f(32);
        int i2 = c0479a9Mo1710f.f1799b;
        BottomSheetBehavior bottomSheetBehavior = c0871v2.f3416b;
        bottomSheetBehavior.f5487w = i2;
        boolean zM895a = C0324Rg.m895a(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.f5479o;
        if (z2) {
            int iM1691a = c0734nh.m1691a();
            bottomSheetBehavior.f5486v = iM1691a;
            paddingBottom = iM1691a + aVar.f1159c;
        }
        int i3 = aVar.f1158b;
        boolean z3 = bottomSheetBehavior.f5480p;
        int i4 = c0479a9Mo1710f.f1798a;
        if (z3) {
            paddingLeft = (zM895a ? i3 : i) + i4;
        }
        boolean z4 = bottomSheetBehavior.f5481q;
        int i5 = c0479a9Mo1710f.f1800c;
        if (z4) {
            if (!zM895a) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z5 = true;
        if (!bottomSheetBehavior.f5483s || marginLayoutParams.leftMargin == i4) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z = true;
        }
        if (bottomSheetBehavior.f5484t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.f5485u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = c0479a9Mo1710f.f1799b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
            } else {
                z5 = z;
            }
        }
        if (z5) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z6 = c0871v2.f3415a;
        if (z6) {
            bottomSheetBehavior.f5477m = c0479a9Mo1710f2.f1801d;
        }
        if (!z2 && !z6) {
            return c0734nh;
        }
        bottomSheetBehavior.m3106J();
        return c0734nh;
    }
}
