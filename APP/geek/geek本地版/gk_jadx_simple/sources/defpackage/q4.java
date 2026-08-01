package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class q4 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q4(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r10, View r11, int r12, long r13) {
        switch(this.a) {
            case 0: goto L35;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((SearchView) this.b).n(r12);
        return;
    L6:
        jt r102 = (jt) this.b;
        kr r0 = r102.e;
        if (r12 < 0) goto L9;
        Object r2 = r102.getAdapter().getItem(r12);
    L13:
        jt.a(r102, r2);
        AdapterView.OnItemClickListener r3 = r102.getOnItemClickListener();
        if (r3 == null) goto L33;
        if (r11 == null) goto L20;
        if (r12 < 0) goto L20;
    L32:
        r3.onItemClick(r0.c, r11, r12, r13);
    L20:
        if (r0.z.isShowing() == true) goto L22;
        r11 = null;
    L24:
        if (r0.z.isShowing() == true) goto L27;
        int r103 = -1;
    L26:
        r12 = r103;
        if (r0.z.isShowing() == true) goto L31;
        r13 = Long.MIN_VALUE;
        goto L32
    L31:
        r13 = r0.c.getSelectedItemId();
        goto L32
    L27:
        r103 = r0.c.getSelectedItemPosition();
        goto L26
    L22:
        r11 = r0.c.getSelectedView();
    L33:
        r0.dismiss();
        return;
    L9:
        if (r0.z.isShowing() == true) goto L11;
        r2 = null;
        goto L13
    L11:
        r2 = r0.c.getSelectedItem();
        goto L13
    L35:
        s4 r104 = (s4) this.b;
        v4 r132 = r104.G;
        r132.setSelection(r12);
        if (r132.getOnItemClickListener() == null) goto L38;
        r132.performItemClick(r11, r12, r104.D.getItemId(r12));
    L38:
        r104.dismiss();
    }
}
