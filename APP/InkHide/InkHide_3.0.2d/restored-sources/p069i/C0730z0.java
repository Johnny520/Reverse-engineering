package p069i;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import p009E0.C0103c;
import p088s0.C0995q;

/* JADX INFO: renamed from: i.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0730z0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2483c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0730z0(int i2, Object obj) {
        this.f2482b = i2;
        this.f2483c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        C0717t0 c0717t0;
        switch (this.f2482b) {
            case 0:
                if (i2 != -1 && (c0717t0 = ((AbstractC0619F0) this.f2483c).f2130d) != null) {
                    c0717t0.setListSelectionHidden(false);
                    break;
                }
                break;
            case 1:
                ((SearchView) this.f2483c).m685p(i2);
                break;
            default:
                C0995q c0995q = (C0995q) this.f2483c;
                int iIntValue = ((Number) ((C0103c) c0995q.f3580f.get(i2)).f394a).intValue();
                if (iIntValue == 0) {
                    c0995q.f3578d.setVisibility(0);
                    break;
                } else if (iIntValue == 10086) {
                    c0995q.f3578d.setVisibility(8);
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f2482b;
    }

    /* JADX INFO: renamed from: a */
    private final void m1381a(AdapterView adapterView) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1382b(AdapterView adapterView) {
    }

    /* JADX INFO: renamed from: c */
    private final void m1383c(AdapterView adapterView) {
    }
}
