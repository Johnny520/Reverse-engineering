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
    public final /* synthetic */ SearchView f359a;

    public ViewOnClickListenerC0030a(SearchView searchView) {
        this.f359a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f359a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f297p;
        if (view == searchView.f301t) {
            searchView.m165w(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f279L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f303v) {
            searchView.m155m();
            return;
        }
        if (view == searchView.f302u) {
            searchView.m159q();
            return;
        }
        if (view != searchView.f304w) {
            if (view == searchAutoComplete) {
                searchView.m154l();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f292b0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m153k(searchView.f276I, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f275H);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
