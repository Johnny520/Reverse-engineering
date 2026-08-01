package p069i;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: i.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0634N implements ListAdapter, SpinnerAdapter {

    /* JADX INFO: renamed from: b */
    public SpinnerAdapter f2172b;

    /* JADX INFO: renamed from: c */
    public ListAdapter f2173c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f2173c;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f2172b;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f2172b;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i2, view, viewGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        SpinnerAdapter spinnerAdapter = this.f2172b;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        SpinnerAdapter spinnerAdapter = this.f2172b;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getItemViewType(int i2) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        return getDropDownView(i2, view, viewGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f2172b;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i2) {
        ListAdapter listAdapter = this.f2173c;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f2172b;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f2172b;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
