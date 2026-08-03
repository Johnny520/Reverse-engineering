package p000;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: zo */
/* JADX INFO: loaded from: classes.dex */
public final class C2811zo implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0289Go f9525a;

    public C2811zo(C0289Go c0289Go) {
        this.f9525a = c0289Go;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0365Ie c0365Ie;
        if (i == -1 || (c0365Ie = this.f9525a.f939c) == null) {
            return;
        }
        c0365Ie.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
