package p000;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.ljx.wechatmod.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e50 extends AbstractC0853we implements View.OnClickListener {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f1713x = 0;

    /* JADX INFO: renamed from: h */
    public final int f1714h;

    /* JADX INFO: renamed from: i */
    public final int f1715i;

    /* JADX INFO: renamed from: j */
    public final LayoutInflater f1716j;

    /* JADX INFO: renamed from: k */
    public final SearchView f1717k;

    /* JADX INFO: renamed from: l */
    public final SearchableInfo f1718l;

    /* JADX INFO: renamed from: m */
    public final Context f1719m;

    /* JADX INFO: renamed from: n */
    public final WeakHashMap f1720n;

    /* JADX INFO: renamed from: o */
    public final int f1721o;

    /* JADX INFO: renamed from: p */
    public int f1722p;

    /* JADX INFO: renamed from: q */
    public ColorStateList f1723q;

    /* JADX INFO: renamed from: r */
    public int f1724r;

    /* JADX INFO: renamed from: s */
    public int f1725s;

    /* JADX INFO: renamed from: t */
    public int f1726t;

    /* JADX INFO: renamed from: u */
    public int f1727u;

    /* JADX INFO: renamed from: v */
    public int f1728v;

    /* JADX INFO: renamed from: w */
    public int f1729w;

    public e50(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f4957b = true;
        this.f4958c = null;
        this.f4956a = false;
        this.f4959d = -1;
        this.f4960e = new C0779ue(this);
        this.f4961f = new C0816ve(0, this);
        this.f1715i = suggestionRowLayout;
        this.f1714h = suggestionRowLayout;
        this.f1716j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f1722p = 1;
        this.f1724r = -1;
        this.f1725s = -1;
        this.f1726t = -1;
        this.f1727u = -1;
        this.f1728v = -1;
        this.f1729w = -1;
        this.f1717k = searchView;
        this.f1718l = searchableInfo;
        this.f1721o = searchView.getSuggestionCommitIconResId();
        this.f1719m = context;
        this.f1720n = weakHashMap;
    }

    /* JADX INFO: renamed from: h */
    public static String m988h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    @Override // p000.AbstractC0853we
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo989a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e50.mo989a(android.view.View, android.database.Cursor):void");
    }

    @Override // p000.AbstractC0853we
    /* JADX INFO: renamed from: b */
    public final void mo990b(Cursor cursor) {
        try {
            super.mo990b(cursor);
            if (cursor != null) {
                this.f1724r = cursor.getColumnIndex("suggest_text_1");
                this.f1725s = cursor.getColumnIndex("suggest_text_2");
                this.f1726t = cursor.getColumnIndex("suggest_text_2_url");
                this.f1727u = cursor.getColumnIndex("suggest_icon_1");
                this.f1728v = cursor.getColumnIndex("suggest_icon_2");
                this.f1729w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p000.AbstractC0853we
    /* JADX INFO: renamed from: c */
    public final String mo991c(Cursor cursor) {
        String strM988h;
        String strM988h2;
        if (cursor == null) {
            return null;
        }
        String strM988h3 = m988h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM988h3 != null) {
            return strM988h3;
        }
        SearchableInfo searchableInfo = this.f1718l;
        if (searchableInfo.shouldRewriteQueryFromData() && (strM988h2 = m988h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM988h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strM988h = m988h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM988h;
    }

    @Override // p000.AbstractC0853we
    /* JADX INFO: renamed from: d */
    public final View mo992d(ViewGroup viewGroup) {
        View viewInflate = this.f1716j.inflate(this.f1714h, viewGroup, false);
        viewInflate.setTag(new d50(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f1721o);
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m993e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1719m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m994f(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e50.m994f(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* JADX INFO: renamed from: g */
    public final Cursor m995g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f1719m.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p000.AbstractC0853we, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.f1716j.inflate(this.f1715i, viewGroup, false);
            if (viewInflate != null) {
                ((d50) viewInflate.getTag()).f1380a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // p000.AbstractC0853we, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewMo992d = mo992d(viewGroup);
            ((d50) viewMo992d.getTag()).f1380a.setText(e.toString());
            return viewMo992d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f4958c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f4958c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1717k.m173p((CharSequence) tag);
        }
    }
}
