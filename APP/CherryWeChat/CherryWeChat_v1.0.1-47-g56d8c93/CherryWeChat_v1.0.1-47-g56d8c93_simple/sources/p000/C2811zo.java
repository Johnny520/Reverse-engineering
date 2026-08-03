package p000;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: zo */
/* JADX INFO: loaded from: classes.dex */
public final class C2811zo implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0289Go f9525a;

    public C2811zo(C0289Go r1) {
        this.f9525a = r1;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView r1, View r2, int r3, long r4) {
        if (r3 == (-1)) goto L8;
        C0365Ie r12 = this.f9525a.f939c;
        if (r12 == null) goto L9;
        r12.setListSelectionHidden(false);
        return;
    L9:
        return;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView r1) {
    }
}
