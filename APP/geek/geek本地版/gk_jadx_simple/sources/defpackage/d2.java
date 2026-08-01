package defpackage;

import android.widget.ArrayAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends ArrayAdapter {
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
