package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ e2 a;
    public final /* synthetic */ b2 b;

    public a2(b2 r1, e2 r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        b2 r12 = this.b;
        DialogInterface.OnClickListener r22 = r12.h;
        e2 r42 = this.a;
        r22.onClick(r42.b, r3);
        if (r12.i == true) goto L6;
        r42.b.dismiss();
        return;
    }
}
