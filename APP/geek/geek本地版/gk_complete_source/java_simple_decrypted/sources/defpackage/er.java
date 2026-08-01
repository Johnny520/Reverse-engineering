package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class er implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ er(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView r1, View r2, int r3, long r4) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        ((SearchView) this.b).o(r3);
        return;
    L7:
        if (r3 == (-1)) goto L12;
        kh r12 = ((kr) this.b).c;
        if (r12 == null) goto L13;
        r12.setListSelectionHidden(false);
        return;
    L13:
        return;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView r1) {
        int r12 = this.a;
    }

    private final void a(AdapterView r1) {
    }

    private final void b(AdapterView r1) {
    }
}
