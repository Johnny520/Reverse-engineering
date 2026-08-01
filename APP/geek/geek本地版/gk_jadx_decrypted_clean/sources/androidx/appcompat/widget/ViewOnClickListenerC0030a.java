package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0030a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView f396a;

    public ViewOnClickListenerC0030a(SearchView searchView) {
        this.f396a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f396a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f334p;
        if (view == searchView.f338t) {
            searchView.m180w(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f316L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f340v) {
            searchView.m170m();
            return;
        }
        if (view == searchView.f339u) {
            searchView.m174q();
            return;
        }
        if (view != searchView.f341w) {
            if (view == searchAutoComplete) {
                searchView.m169l();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f329b0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m168k(searchView.f313I, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f312H);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
