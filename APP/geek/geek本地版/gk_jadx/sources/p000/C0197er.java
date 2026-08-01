package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: er */
/* JADX INFO: loaded from: classes.dex */
public final class C0197er implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1834a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1835b;

    public /* synthetic */ C0197er(int i, Object obj) {
        this.f1834a = i;
        this.f1835b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0411kh c0411kh;
        switch (this.f1834a) {
            case Base64.DEFAULT /* 0 */:
                if (i != -1 && (c0411kh = ((C0421kr) this.f1835b).f2922c) != null) {
                    c0411kh.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f1835b).m172o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f1834a;
    }

    /* JADX INFO: renamed from: a */
    private final void m1067a(AdapterView adapterView) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1068b(AdapterView adapterView) {
    }
}
