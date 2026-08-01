package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class lz {
    public final /* synthetic */ int a;
    public final /* synthetic */ nz b;

    public /* synthetic */ lz(nz r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    public final int a(View r3) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        oz r0 = (oz) r3.getLayoutParams();
        int r1 = r3.getBottom() + ((oz) r3.getLayoutParams()).b.bottom;
        int r32 = ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
    L6:
        return r1 + r32;
    L7:
        oz r02 = (oz) r3.getLayoutParams();
        r1 = r3.getRight() + ((oz) r3.getLayoutParams()).b.right;
        r32 = ((ViewGroup.MarginLayoutParams) r02).rightMargin;
        goto L6
    }

    public final int b(View r3) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        oz r0 = (oz) r3.getLayoutParams();
        int r1 = r3.getTop() - ((oz) r3.getLayoutParams()).b.top;
        int r32 = ((ViewGroup.MarginLayoutParams) r0).topMargin;
    L6:
        return r1 - r32;
    L7:
        oz r02 = (oz) r3.getLayoutParams();
        r1 = r3.getLeft() - ((oz) r3.getLayoutParams()).b.left;
        r32 = ((ViewGroup.MarginLayoutParams) r02).leftMargin;
        goto L6
    }

    public final int c() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        nz r0 = this.b;
        int r1 = r0.o;
        int r02 = r0.B();
    L6:
        return r1 - r02;
    L7:
        nz r03 = this.b;
        r1 = r03.n;
        r02 = r03.D();
        goto L6
    }

    public final int d() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.b.E();
    L7:
        return this.b.C();
    }
}
