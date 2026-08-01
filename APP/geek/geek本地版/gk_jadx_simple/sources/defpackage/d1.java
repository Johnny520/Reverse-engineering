package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends jl {
    public final /* synthetic */ int j;
    public final /* synthetic */ View k;

    public d1(ActionMenuItemView r2) {
        this.j = 0;
        this.k = r2;
        super(r2);
    }

    @Override // defpackage.jl
    public final r30 b() {
        switch(this.j) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        f1 r0 = ((i1) this.k).d.s;
        if (r0 != null) goto L8;
        return null;
    L8:
        return r0.a();
    L9:
        e1 r02 = ((ActionMenuItemView) this.k).m;
        if (r02 == null) goto L14;
        f1 r03 = ((g1) r02).a.t;
        if (r03 == null) goto L14;
        return r03.a();
    L14:
        return null;
    }

    @Override // defpackage.jl
    public final boolean c() {
        switch(this.j) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((i1) this.k).d.l();
        return true;
    L6:
        ActionMenuItemView r0 = (ActionMenuItemView) this.k;
        ju r1 = r0.k;
        if (r1 != null) goto L9;
    L15:
        return false;
    L9:
        if (r1.a(r0.h) == false) goto L15;
        r30 r02 = b();
        if (r02 == null) goto L15;
        if (r02.b() == false) goto L15;
        return true;
    }

    @Override // defpackage.jl
    public boolean d() {
        switch(this.j) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        j1 r0 = ((i1) this.k).d;
        if (r0.u == null) goto L9;
        return false;
    L9:
        r0.f();
        return true;
    L5:
        return super.d();
    }

    public d1(i1 r2, i1 r3) {
        this.j = 1;
        this.k = r2;
        super(r3);
    }
}
