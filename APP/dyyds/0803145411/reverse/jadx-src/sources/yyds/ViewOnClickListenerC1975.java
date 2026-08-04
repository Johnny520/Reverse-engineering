package yyds;

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
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲀᛳᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1975 extends AbstractC1589 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static final /* synthetic */ int f9889 = 0;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final SearchableInfo f9890;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final SearchView f9891;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public int f9892;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public int f9893;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final Context f9894;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public int f9895;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public int f9896;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final int f9897;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public int f9898;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public int f9899;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final int f9900;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final LayoutInflater f9901;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int f9902;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public ColorStateList f9903;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final WeakHashMap f9904;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public int f9905;

    public ViewOnClickListenerC1975(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f8084 = true;
        this.f8080 = null;
        this.f8082 = false;
        this.f8083 = -1;
        this.f8081 = new C1474(this);
        this.f8078 = new C0957(0, this);
        this.f9900 = suggestionRowLayout;
        this.f9902 = suggestionRowLayout;
        this.f9901 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f9895 = 1;
        this.f9893 = -1;
        this.f9899 = -1;
        this.f9898 = -1;
        this.f9896 = -1;
        this.f9892 = -1;
        this.f9905 = -1;
        this.f9891 = searchView;
        this.f9890 = searchableInfo;
        this.f9897 = searchView.getSuggestionCommitIconResId();
        this.f9894 = context;
        this.f9904 = weakHashMap;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static String m3804(Cursor cursor, int i) {
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

    @Override // yyds.AbstractC1589, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.f9901.inflate(this.f9900, viewGroup, false);
            if (viewInflate != null) {
                ((C2741) viewInflate.getTag()).f13449.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // yyds.AbstractC1589, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.f9901.inflate(this.f9902, viewGroup, false);
            viewInflate.setTag(new C2741(viewInflate));
            ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f9897);
            ((C2741) viewInflate.getTag()).f13449.setText(e.toString());
            return viewInflate;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f8080;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f8080;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f9891.m60((CharSequence) tag);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m3805(String str) {
        WeakHashMap weakHashMap = this.f9904;
        Context context = this.f9894;
        Drawable drawableM3807 = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = context.getDrawable(i);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
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
                            drawableM3807 = m3807(uri);
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
                            } catch (IOException e) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                            }
                            drawableM3807 = drawableCreateFromStream;
                        } finally {
                        }
                    }
                } catch (FileNotFoundException e2) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
                    if (drawableM3807 != null) {
                        weakHashMap.put(str, drawableM3807.getConstantState());
                    }
                    return drawableM3807;
                }
                if (drawableM3807 != null) {
                }
            }
        }
        return drawableM3807;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    @Override // yyds.AbstractC1589
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3256(View view, Cursor cursor) {
        int i;
        Drawable drawableM3805;
        ActivityInfo activityInfo;
        int iconResource;
        CharSequence charSequenceM3804;
        C2741 c2741 = (C2741) view.getTag();
        int i2 = this.f9905;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = c2741.f13449;
        TextView textView2 = c2741.f13450;
        ImageView imageView = c2741.f13448;
        if (textView != null) {
            String strM3804 = m3804(cursor, this.f9893);
            textView.setText(strM3804);
            if (TextUtils.isEmpty(strM3804)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f9894;
        if (textView2 != null) {
            String strM38042 = m3804(cursor, this.f9898);
            if (strM38042 != null) {
                if (this.f9903 == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f9903 = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strM38042);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f9903, null), 0, strM38042.length(), 33);
                charSequenceM3804 = spannableString;
            } else {
                charSequenceM3804 = m3804(cursor, this.f9899);
            }
            if (TextUtils.isEmpty(charSequenceM3804)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceM3804);
            if (TextUtils.isEmpty(charSequenceM3804)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = c2741.f13451;
        if (imageView2 != null) {
            int i4 = this.f9896;
            if (i4 == -1) {
                drawableM3805 = null;
            } else {
                drawableM3805 = m3805(cursor.getString(i4));
                if (drawableM3805 == null) {
                    ComponentName searchActivity = this.f9890.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f9904;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableM3805 = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                                drawableM3805 = null;
                                weakHashMap.put(strFlattenToShortString, drawableM3805 == null ? null : drawableM3805.getConstantState());
                            } else {
                                drawableM3805 = drawable;
                                weakHashMap.put(strFlattenToShortString, drawableM3805 == null ? null : drawableM3805.getConstantState());
                            }
                        } else {
                            drawableM3805 = null;
                            weakHashMap.put(strFlattenToShortString, drawableM3805 == null ? null : drawableM3805.getConstantState());
                        }
                    }
                    if (drawableM3805 == null) {
                        drawableM3805 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawableM3805);
            if (drawableM3805 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawableM3805.setVisible(false, false);
                drawableM3805.setVisible(true, false);
            }
        }
        ImageView imageView3 = c2741.f13452;
        if (imageView3 == null) {
            i = 1;
        } else {
            int i5 = this.f9892;
            Drawable drawableM38052 = i5 == -1 ? null : m3805(cursor.getString(i5));
            imageView3.setImageDrawable(drawableM38052);
            if (drawableM38052 == null) {
                imageView3.setVisibility(8);
                i = 1;
            } else {
                imageView3.setVisibility(0);
                drawableM38052.setVisible(false, false);
                i = 1;
                drawableM38052.setVisible(true, false);
            }
        }
        int i6 = this.f9895;
        if (i6 != 2 && (i6 != i || (i3 & 1) == 0)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // yyds.AbstractC1589
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo3257(Cursor cursor) {
        try {
            super.mo3257(cursor);
            if (cursor != null) {
                this.f9893 = cursor.getColumnIndex("suggest_text_1");
                this.f9899 = cursor.getColumnIndex("suggest_text_2");
                this.f9898 = cursor.getColumnIndex("suggest_text_2_url");
                this.f9896 = cursor.getColumnIndex("suggest_icon_1");
                this.f9892 = cursor.getColumnIndex("suggest_icon_2");
                this.f9905 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // yyds.AbstractC1589
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final String mo3258(Cursor cursor) {
        String strM3804;
        String strM38042;
        if (cursor == null) {
            return null;
        }
        String strM38043 = m3804(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM38043 != null) {
            return strM38043;
        }
        SearchableInfo searchableInfo = this.f9890;
        if (searchableInfo.shouldRewriteQueryFromData() && (strM38042 = m3804(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM38042;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strM3804 = m3804(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM3804;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Cursor m3806(SearchableInfo searchableInfo, String str) {
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
        return this.f9894.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Drawable m3807(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            C1693.m3441(uri, "No authority: ");
            return null;
        }
        try {
            Resources resourcesForApplication = this.f9894.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                C1693.m3441(uri, "No path: ");
                return null;
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    C1693.m3441(uri, "Single path segment is not a resource ID: ");
                    return null;
                }
            } else {
                if (size != 2) {
                    C1693.m3441(uri, "More than two path segments: ");
                    return null;
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            C1693.m3441(uri, "No resource found for: ");
            return null;
        } catch (PackageManager.NameNotFoundException unused2) {
            C1693.m3441(uri, "No package found for authority: ");
            return null;
        }
    }
}
