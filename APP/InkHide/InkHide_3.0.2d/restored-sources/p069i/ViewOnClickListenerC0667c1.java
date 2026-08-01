package p069i;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.p055lu.wxmask272.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p008E.AbstractC0099c;
import p008E.C0097a;
import p008E.C0098b;
import p082p.AbstractC0783a;

/* JADX INFO: renamed from: i.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0667c1 extends AbstractC0099c implements View.OnClickListener {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f2254y = 0;

    /* JADX INFO: renamed from: i */
    public final int f2255i;

    /* JADX INFO: renamed from: j */
    public final int f2256j;

    /* JADX INFO: renamed from: k */
    public final LayoutInflater f2257k;

    /* JADX INFO: renamed from: l */
    public final SearchView f2258l;

    /* JADX INFO: renamed from: m */
    public final SearchableInfo f2259m;

    /* JADX INFO: renamed from: n */
    public final Context f2260n;

    /* JADX INFO: renamed from: o */
    public final WeakHashMap f2261o;

    /* JADX INFO: renamed from: p */
    public final int f2262p;

    /* JADX INFO: renamed from: q */
    public int f2263q;

    /* JADX INFO: renamed from: r */
    public ColorStateList f2264r;

    /* JADX INFO: renamed from: s */
    public int f2265s;

    /* JADX INFO: renamed from: t */
    public int f2266t;

    /* JADX INFO: renamed from: u */
    public int f2267u;

    /* JADX INFO: renamed from: v */
    public int f2268v;

    /* JADX INFO: renamed from: w */
    public int f2269w;

    /* JADX INFO: renamed from: x */
    public int f2270x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0667c1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f387c = true;
        this.f388d = null;
        this.f386b = false;
        this.f389e = -1;
        this.f390f = new C0097a(this);
        this.f391g = new C0098b(0, this);
        this.f2256j = suggestionRowLayout;
        this.f2255i = suggestionRowLayout;
        this.f2257k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f2263q = 1;
        this.f2265s = -1;
        this.f2266t = -1;
        this.f2267u = -1;
        this.f2268v = -1;
        this.f2269w = -1;
        this.f2270x = -1;
        this.f2258l = searchView;
        this.f2259m = searchableInfo;
        this.f2262p = searchView.getSuggestionCommitIconResId();
        this.f2260n = context;
        this.f2261o = weakHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m1292h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    @Override // p008E.AbstractC0099c
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo242a(View view, Cursor cursor) {
        int i2;
        Drawable drawableM1294f;
        ActivityInfo activityInfo;
        int iconResource;
        CharSequence charSequenceM1292h;
        C0664b1 c0664b1 = (C0664b1) view.getTag();
        int i3 = this.f2270x;
        int i4 = i3 != -1 ? cursor.getInt(i3) : 0;
        TextView textView = c0664b1.f2234a;
        if (textView != null) {
            String strM1292h = m1292h(cursor, this.f2265s);
            textView.setText(strM1292h);
            if (TextUtils.isEmpty(strM1292h)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f2260n;
        TextView textView2 = c0664b1.f2235b;
        if (textView2 != null) {
            String strM1292h2 = m1292h(cursor, this.f2267u);
            if (strM1292h2 != null) {
                if (this.f2264r == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f2264r = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strM1292h2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2264r, null), 0, strM1292h2.length(), 33);
                charSequenceM1292h = spannableString;
            } else {
                charSequenceM1292h = m1292h(cursor, this.f2266t);
            }
            if (TextUtils.isEmpty(charSequenceM1292h)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceM1292h);
            if (TextUtils.isEmpty(charSequenceM1292h)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = c0664b1.f2236c;
        if (imageView != null) {
            int i5 = this.f2268v;
            if (i5 == -1) {
                drawableM1294f = null;
            } else {
                drawableM1294f = m1294f(cursor.getString(i5));
                if (drawableM1294f == null) {
                    ComponentName searchActivity = this.f2259m.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f2261o;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableM1294f = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.w("SuggestionsAdapter", e2.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                                drawableM1294f = null;
                                weakHashMap.put(strFlattenToShortString, drawableM1294f == null ? null : drawableM1294f.getConstantState());
                            } else {
                                drawableM1294f = drawable;
                                weakHashMap.put(strFlattenToShortString, drawableM1294f == null ? null : drawableM1294f.getConstantState());
                            }
                        } else {
                            drawableM1294f = null;
                            weakHashMap.put(strFlattenToShortString, drawableM1294f == null ? null : drawableM1294f.getConstantState());
                        }
                    }
                    if (drawableM1294f == null) {
                        drawableM1294f = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableM1294f);
            if (drawableM1294f == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableM1294f.setVisible(false, false);
                drawableM1294f.setVisible(true, false);
            }
        }
        ImageView imageView2 = c0664b1.f2237d;
        if (imageView2 == null) {
            i2 = 1;
        } else {
            int i6 = this.f2269w;
            Drawable drawableM1294f2 = i6 == -1 ? null : m1294f(cursor.getString(i6));
            imageView2.setImageDrawable(drawableM1294f2);
            if (drawableM1294f2 == null) {
                imageView2.setVisibility(8);
                i2 = 1;
            } else {
                imageView2.setVisibility(0);
                drawableM1294f2.setVisible(false, false);
                i2 = 1;
                drawableM1294f2.setVisible(true, false);
            }
        }
        int i7 = this.f2263q;
        ImageView imageView3 = c0664b1.f2238e;
        if (i7 != 2 && (i7 != i2 || (i4 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p008E.AbstractC0099c
    /* JADX INFO: renamed from: b */
    public final void mo243b(Cursor cursor) {
        try {
            super.mo243b(cursor);
            if (cursor != null) {
                this.f2265s = cursor.getColumnIndex("suggest_text_1");
                this.f2266t = cursor.getColumnIndex("suggest_text_2");
                this.f2267u = cursor.getColumnIndex("suggest_text_2_url");
                this.f2268v = cursor.getColumnIndex("suggest_icon_1");
                this.f2269w = cursor.getColumnIndex("suggest_icon_2");
                this.f2270x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p008E.AbstractC0099c
    /* JADX INFO: renamed from: c */
    public final String mo244c(Cursor cursor) {
        String strM1292h;
        String strM1292h2;
        if (cursor == null) {
            return null;
        }
        String strM1292h3 = m1292h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM1292h3 != null) {
            return strM1292h3;
        }
        SearchableInfo searchableInfo = this.f2259m;
        if (searchableInfo.shouldRewriteQueryFromData() && (strM1292h2 = m1292h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM1292h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strM1292h = m1292h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM1292h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p008E.AbstractC0099c
    /* JADX INFO: renamed from: d */
    public final View mo245d(ViewGroup viewGroup) {
        View viewInflate = this.f2257k.inflate(this.f2255i, viewGroup, false);
        viewInflate.setTag(new C0664b1(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f2262p);
        return viewInflate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Drawable m1293e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f2260n.getPackageManager().getResourcesForApplication(authority);
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

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[CONSTRUCTOR, INVOKE, INVOKE, INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m1294f(String str) {
        WeakHashMap weakHashMap = this.f2261o;
        Context context = this.f2260n;
        Drawable drawableM1293e = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i2 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i2;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawableM1446b = AbstractC0783a.m1446b(context, i2);
                if (drawableM1446b != null) {
                    weakHashMap.put(str2, drawableM1446b.getConstantState());
                }
                return drawableM1446b;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableM1293e = m1293e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e2) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                            }
                            drawableM1293e = drawableCreateFromStream;
                        } finally {
                        }
                    }
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
                    if (drawableM1293e != null) {
                        weakHashMap.put(str, drawableM1293e.getConstantState());
                    }
                    return drawableM1293e;
                }
                if (drawableM1293e != null) {
                }
            }
        }
        return drawableM1293e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Cursor m1295g(SearchableInfo searchableInfo, String str) {
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
        return this.f2260n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p008E.AbstractC0099c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewInflate = this.f2257k.inflate(this.f2256j, viewGroup, false);
            if (viewInflate != null) {
                ((C0664b1) viewInflate.getTag()).f2234a.setText(e2.toString());
            }
            return viewInflate;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p008E.AbstractC0099c, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewMo245d = mo245d(viewGroup);
            ((C0664b1) viewMo245d.getTag()).f2234a.setText(e2.toString());
            return viewMo245d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f388d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f388d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2258l.m686q((CharSequence) tag);
        }
    }
}
