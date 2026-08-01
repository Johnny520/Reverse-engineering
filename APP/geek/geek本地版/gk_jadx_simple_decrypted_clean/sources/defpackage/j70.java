package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j70 extends ct {
    public final /* synthetic */ int d;
    public boolean e;
    public int f;
    public final /* synthetic */ Object g;

    public j70(k70 r2, int r3) {
        this.d = 0;
        this.g = r2;
        this.f = r3;
        this.e = false;
    }

    @Override // defpackage.ya0
    public final void a() {
        switch(this.d) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        int r0 = this.f + 1;
        this.f = r0;
        xa0 r1 = (xa0) this.g;
        if (r0 != r1.a.size()) goto L15;
        ya0 r02 = r1.d;
        if (r02 == null) goto L9;
        r02.a();
    L9:
        this.f = 0;
        this.e = false;
        r1.e = false;
        return;
    L15:
        return;
    L12:
        if (this.e == true) goto L16;
        ((k70) this.g).a.setVisibility(this.f);
        return;
    }

    @Override // defpackage.ct, defpackage.ya0
    public void b(View r1) {
        switch(this.d) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.e = true;
    }

    @Override // defpackage.ct, defpackage.ya0
    public final void c() {
        switch(this.d) {
            case 0: goto L11;
            default: goto L5;
        };
    L11:
        ((k70) this.g).a.setVisibility(0);
        return;
    L5:
        if (this.e == true) goto L14;
        this.e = true;
        ya0 r0 = ((xa0) this.g).d;
        if (r0 == null) goto L13;
        r0.c();
        return;
    L13:
        return;
    }

    public j70(xa0 r2) {
        this.d = 1;
        this.g = r2;
        this.e = false;
        this.f = 0;
    }
}
