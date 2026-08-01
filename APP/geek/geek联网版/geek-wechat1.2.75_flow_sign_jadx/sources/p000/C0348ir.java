package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: ir */
/* JADX INFO: loaded from: classes.dex */
public final class C0348ir implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2578b;

    public /* synthetic */ C0348ir(int i, Object obj) {
        this.f2577a = i;
        this.f2578b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0485mh c0485mh;
        switch (this.f2577a) {
            case Base64.DEFAULT /* 0 */:
                if (i != -1 && (c0485mh = ((C0569or) this.f2578b).f3519c) != null) {
                    c0485mh.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f2578b).m157o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f2577a;
    }

    /* JADX INFO: renamed from: a */
    private final void m1527a(AdapterView adapterView) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1528b(AdapterView adapterView) {
    }
}
