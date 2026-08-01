package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ SearchView a;

    public a(SearchView r1) {
        this.a = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        SearchView r0 = this.a;
        SearchView.SearchAutoComplete r1 = r0.p;
        if (r4 != r0.t) goto L9;
        r0.w(false);
        r1.requestFocus();
        r1.setImeVisibility(true);
        View.OnClickListener r42 = r0.L;
        if (r42 == null) goto L39;
        r42.onClick(r0);
        return;
    L39:
        return;
    L9:
        if (r4 != r0.v) goto L13;
        r0.m();
        return;
    L13:
        if (r4 != r0.u) goto L17;
        r0.q();
        return;
    L17:
        if (r4 != r0.w) goto L35;
        SearchableInfo r43 = r0.b0;
        if (r43 == null) goto L42;
    L33:
        Log.w("SearchView", "Could not find voice search activity");
        return;
    L22:
        if (r43.getVoiceSearchLaunchWebSearch() == false) goto L30;
        Intent r2 = new Intent(r0.H);     // Catch: ActivityNotFoundException -> L33
        ComponentName r44 = r43.getSearchActivity();     // Catch: ActivityNotFoundException -> L33
        if (r44 != null) goto L26;
        String r45 = null;
    L27:
        r2.putExtra("calling_package", r45);     // Catch: ActivityNotFoundException -> L33
        r0.getContext().startActivity(r2);     // Catch: ActivityNotFoundException -> L33
        return;
    L26:
        r45 = r44.flattenToShortString();     // Catch: ActivityNotFoundException -> L33
        goto L27
    L30:
        if (r43.getVoiceSearchLaunchRecognizer() == false) goto L40;
        Intent r46 = r0.k(r0.I, r43);     // Catch: ActivityNotFoundException -> L33
        r0.getContext().startActivity(r46);     // Catch: ActivityNotFoundException -> L33
        return;
    L40:
        return;
    L42:
        return;
    L35:
        if (r4 != r1) goto L41;
        r0.l();
        return;
    }
}
