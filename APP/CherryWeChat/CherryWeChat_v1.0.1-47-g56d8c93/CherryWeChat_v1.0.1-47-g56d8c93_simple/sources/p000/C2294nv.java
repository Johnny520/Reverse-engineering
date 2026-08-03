package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1160i;

/* JADX INFO: renamed from: nv */
/* JADX INFO: loaded from: classes.dex */
public final class C2294nv implements InterfaceC1002XD {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1160i f8046b;

    public /* synthetic */ C2294nv(AbstractC1160i r1, int r2) {
        this.f8045a = r2;
        this.f8046b = r1;
    }

    @Override // p000.InterfaceC1002XD
    /* JADX INFO: renamed from: a */
    public final int mo1896a() {
        switch(this.f8045a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        AbstractC1160i r0 = this.f8046b;
        int r1 = r0.getHeight();
        int r02 = r0.getPaddingBottom();
    L6:
        return r1 - r02;
    L7:
        AbstractC1160i r03 = this.f8046b;
        r1 = r03.getWidth();
        r02 = r03.getPaddingRight();
        goto L6
    }

    @Override // p000.InterfaceC1002XD
    /* JADX INFO: renamed from: b */
    public final int mo1897b(View r3) {
        switch(this.f8045a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        C2431qv r0 = (C2431qv) r3.getLayoutParams();
        int r32 = this.f8046b.getDecoratedTop(r3);
        int r02 = ((ViewGroup.MarginLayoutParams) r0).topMargin;
    L6:
        return r32 - r02;
    L7:
        C2431qv r03 = (C2431qv) r3.getLayoutParams();
        r32 = this.f8046b.getDecoratedLeft(r3);
        r02 = ((ViewGroup.MarginLayoutParams) r03).leftMargin;
        goto L6
    }

    @Override // p000.InterfaceC1002XD
    /* JADX INFO: renamed from: c */
    public final View mo1898c(int r2) {
        switch(this.f8045a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f8046b.getChildAt(r2);
    L7:
        return this.f8046b.getChildAt(r2);
    }

    @Override // p000.InterfaceC1002XD
    /* JADX INFO: renamed from: d */
    public final int mo1899d() {
        switch(this.f8045a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f8046b.getPaddingTop();
    L7:
        return this.f8046b.getPaddingLeft();
    }

    @Override // p000.InterfaceC1002XD
    /* JADX INFO: renamed from: e */
    public final int mo1900e(View r3) {
        switch(this.f8045a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        C2431qv r0 = (C2431qv) r3.getLayoutParams();
        int r32 = this.f8046b.getDecoratedBottom(r3);
        int r02 = ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
    L6:
        return r32 + r02;
    L7:
        C2431qv r03 = (C2431qv) r3.getLayoutParams();
        r32 = this.f8046b.getDecoratedRight(r3);
        r02 = ((ViewGroup.MarginLayoutParams) r03).rightMargin;
        goto L6
    }
}
