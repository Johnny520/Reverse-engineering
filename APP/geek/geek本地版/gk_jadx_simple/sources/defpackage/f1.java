package defpackage;

import android.content.Context;
import android.view.View;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends wu {
    public final /* synthetic */ int l;
    public final /* synthetic */ j1 m;

    public f1(j1 r9, Context r10, ku r11, View r12) {
        this.l = 1;
        this.m = r9;
        super(r10, r11, r12, true, R.attr.actionOverflowMenuStyle, 0);
        this.f = 8388613;
        l0 r92 = r9.w;
        this.h = r92;
        tu r102 = this.i;
        if (r102 == null) goto L6;
        r102.e(r92);
        return;
    }

    @Override // defpackage.wu
    public final void c() {
        switch(this.l) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        j1 r0 = this.m;
        ku r1 = r0.c;
        if (r1 == null) goto L7;
        r1.c(true);
    L7:
        r0.s = null;
        super.c();
        return;
    L9:
        j1 r12 = this.m;
        r12.t = null;
        r12.getClass();
        super.c();
    }

    public f1(j1 r9, Context r10, c50 r11, View r12) {
        this.l = 0;
        this.m = r9;
        super(r10, r11, r12, false, R.attr.actionOverflowMenuStyle, 0);
        if ((r11.A.x & 32) == 32) goto L9;
        View r102 = r9.i;
        if (r102 != null) goto L8;
        r102 = (View) r9.h;
    L8:
        this.e = r102;
    L9:
        l0 r92 = r9.w;
        this.h = r92;
        tu r103 = this.i;
        if (r103 == null) goto L13;
        r103.e(r92);
        return;
    }
}
