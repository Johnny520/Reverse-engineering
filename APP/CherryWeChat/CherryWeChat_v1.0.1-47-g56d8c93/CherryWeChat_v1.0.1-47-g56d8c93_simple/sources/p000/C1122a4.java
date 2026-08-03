package p000;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: a4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1122a4 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3535b;

    public /* synthetic */ C1122a4(int r1, Object r2) {
        this.f3534a = r1;
        this.f3535b = r2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r11, View r12, int r13, long r14) {
        switch(this.f3534a) {
            case 0: goto L33;
            default: goto L4;
        };
    L4:
        C0076Bq r112 = (C0076Bq) this.f3535b;
        C0289Go r0 = r112.f177e;
        if (r13 < 0) goto L7;
        Object r2 = r112.getAdapter().getItem(r13);
    L11:
        r112.setText(C0076Bq.m125a(r112, r2), false);
        AdapterView.OnItemClickListener r4 = r112.getOnItemClickListener();
        if (r4 == null) goto L31;
        if (r12 == null) goto L18;
        if (r13 < 0) goto L18;
    L30:
        r4.onItemClick(r0.f939c, r12, r13, r14);
    L18:
        if (r0.f962z.isShowing() == true) goto L20;
        r12 = null;
    L22:
        if (r0.f962z.isShowing() == true) goto L25;
        int r113 = -1;
    L24:
        r13 = r113;
        if (r0.f962z.isShowing() == true) goto L29;
        r14 = Long.MIN_VALUE;
        goto L30
    L29:
        r14 = r0.f939c.getSelectedItemId();
        goto L30
    L25:
        r113 = r0.f939c.getSelectedItemPosition();
        goto L24
    L20:
        r12 = r0.f939c.getSelectedView();
    L31:
        r0.dismiss();
        return;
    L7:
        if (r0.f962z.isShowing() == true) goto L9;
        r2 = null;
        goto L11
    L9:
        r2 = r0.f939c.getSelectedItem();
        goto L11
    L33:
        C1245c4 r114 = (C1245c4) this.f3535b;
        C1394f4 r142 = r114.f4236G;
        r142.setSelection(r13);
        if (r142.getOnItemClickListener() == null) goto L36;
        r142.performItemClick(r12, r13, r114.f4233D.getItemId(r13));
    L36:
        r114.dismiss();
    }
}
