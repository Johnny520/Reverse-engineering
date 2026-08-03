package p000a;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: a.Ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0089Ee extends AbstractC0730nd implements View.OnClickListener {

    /* JADX INFO: renamed from: e */
    public int f290e;

    /* JADX INFO: renamed from: f */
    public int f291f;

    /* JADX INFO: renamed from: g */
    public int f292g;

    /* JADX INFO: renamed from: h */
    public int f293h;

    /* JADX INFO: renamed from: i */
    public int f294i;

    /* JADX INFO: renamed from: j */
    public int f295j;

    /* JADX INFO: renamed from: k */
    public int f296k;

    /* JADX INFO: renamed from: a.Ee$a */
    public static final class a {
    }

    public ViewOnClickListenerC0089Ee() {
        throw null;
    }

    @Override // p000a.AbstractC0024B4
    /* JADX INFO: renamed from: b */
    public final void mo58b(View view, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i = this.f296k;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        aVar.getClass();
        int i3 = this.f290e;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            throw null;
        }
        throw null;
    }

    @Override // p000a.AbstractC0024B4
    /* JADX INFO: renamed from: c */
    public final void mo59c(Cursor cursor) {
        try {
            super.mo59c(cursor);
            if (cursor != null) {
                this.f291f = cursor.getColumnIndex("suggest_text_1");
                this.f292g = cursor.getColumnIndex("suggest_text_2");
                this.f293h = cursor.getColumnIndex("suggest_text_2_url");
                this.f294i = cursor.getColumnIndex("suggest_icon_1");
                this.f295j = cursor.getColumnIndex("suggest_icon_2");
                this.f296k = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m217d(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            Integer.parseInt(str);
            throw null;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
            return null;
        } catch (NumberFormatException unused2) {
            throw null;
        }
    }

    @Override // p000a.AbstractC0024B4, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            throw null;
        }
    }

    @Override // p000a.AbstractC0024B4, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            super.getView(i, view, viewGroup);
            return view;
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            throw null;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f71b;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f71b;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getTag() instanceof CharSequence) {
            throw null;
        }
    }
}
