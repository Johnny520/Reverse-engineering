package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0381a implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchView f1113b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0381a(SearchView searchView) {
        this.f1113b = searchView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f1113b;
        ImageView imageView = searchView.f1059u;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f1055q;
        if (view == imageView) {
            searchView.m693x(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f1037M;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f1061w) {
            searchView.m683n();
            return;
        }
        if (view == searchView.f1060v) {
            searchView.m687r();
            return;
        }
        if (view != searchView.f1062x) {
            if (view == searchAutoComplete) {
                searchView.m682m();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f1050c0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m681l(searchView.f1034J, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f1033I);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
