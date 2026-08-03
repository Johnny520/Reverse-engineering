package p057g;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: g.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0905h0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0919o0 f3202a;

    public C0905h0(AbstractC0919o0 r1) {
        this.f3202a = r1;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView r1, View r2, int r3, long r4) {
        if (r3 == (-1)) goto L8;
        C0927s0 r12 = this.f3202a.f3253c;
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
