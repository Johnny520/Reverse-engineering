package p000a;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: a.E9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0084E9 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0102F9 f265a;

    public C0084E9(C0102F9 c0102f9) {
        this.f265a = c0102f9;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0006A5 c0006a5;
        if (i == -1 || (c0006a5 = this.f265a.f330c) == null) {
            return;
        }
        c0006a5.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
