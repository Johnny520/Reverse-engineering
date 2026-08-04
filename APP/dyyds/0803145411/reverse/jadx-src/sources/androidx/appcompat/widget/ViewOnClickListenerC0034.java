package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: androidx.appcompat.widget.ᛲᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0034 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ SearchView f246;

    public ViewOnClickListenerC0034(SearchView searchView) {
        this.f246 = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f246;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f170;
        if (view == searchView.f176) {
            searchView.m67(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f177;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f161) {
            searchView.m68();
            return;
        }
        if (view == searchView.f172) {
            searchView.m64();
            return;
        }
        if (view != searchView.f194) {
            if (view == searchAutoComplete) {
                AbstractC0036.m94(searchAutoComplete);
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f169;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m70(searchView.f156, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f158);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
