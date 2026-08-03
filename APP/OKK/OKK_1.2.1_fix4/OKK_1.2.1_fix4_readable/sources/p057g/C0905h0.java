package p057g;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: g.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0905h0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0919o0 f3202a;

    public C0905h0(AbstractC0919o0 abstractC0919o0) {
        this.f3202a = abstractC0919o0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        C0927s0 c0927s0;
        if (i2 == -1 || (c0927s0 = this.f3202a.f3253c) == null) {
            return;
        }
        c0927s0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
