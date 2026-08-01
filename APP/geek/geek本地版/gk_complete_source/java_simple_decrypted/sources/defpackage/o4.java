package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class o4 implements u4, DialogInterface.OnClickListener {
    public g2 a;
    public p4 b;
    public CharSequence c;
    public final /* synthetic */ v4 d;

    public o4(v4 r1) {
        this.d = r1;
    }

    @Override // defpackage.u4
    public final boolean b() {
        g2 r0 = this.a;
        if (r0 != null) goto L5;
        return false;
    L5:
        return r0.isShowing();
    }

    @Override // defpackage.u4
    public final void c(int r2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.u4
    public final int d() {
        return 0;
    }

    @Override // defpackage.u4
    public final void dismiss() {
        g2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.dismiss();
        this.a = null;
        return;
    }

    @Override // defpackage.u4
    public final void e(int r5, int r6) {
        if (this.b != null) goto L5;
        return;
    L5:
        v4 r1 = this.d;
        f2 r0 = new f2(r1.getPopupContext());
        b2 r2 = (b2) r0.b;
        CharSequence r3 = this.c;
        if (r3 == null) goto L8;
        r2.d = r3;
    L8:
        p4 r32 = this.b;
        int r12 = r1.getSelectedItemPosition();
        r2.g = r32;
        r2.h = this;
        r2.j = r12;
        r2.i = true;
        g2 r02 = r0.a();
        this.a = r02;
        AlertController$RecycleListView r03 = r02.f.e;
        m4.d(r03, r5);
        m4.c(r03, r6);
        this.a.show();
    }

    @Override // defpackage.u4
    public final int g() {
        return 0;
    }

    @Override // defpackage.u4
    public final Drawable h() {
        return null;
    }

    @Override // defpackage.u4
    public final CharSequence i() {
        return this.c;
    }

    @Override // defpackage.u4
    public final void k(CharSequence r1) {
        this.c = r1;
    }

    @Override // defpackage.u4
    public final void l(Drawable r2) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.u4
    public final void m(int r2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.u4
    public final void n(ListAdapter r1) {
        this.b = (p4) r1;
    }

    @Override // defpackage.u4
    public final void o(int r2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r4, int r5) {
        v4 r42 = this.d;
        r42.setSelection(r5);
        if (r42.getOnItemClickListener() == null) goto L5;
        r42.performItemClick(null, r5, this.b.getItemId(r5));
    L5:
        dismiss();
    }
}
