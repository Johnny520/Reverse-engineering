package Yue;

import Yue.C6898;
import android.R;
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
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC7675 extends AbstractC7121 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final boolean f23093 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f23094 = "SuggestionsAdapter";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f23095 = 50;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f23096 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f23097 = 1;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final int f23098 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int f23099 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final SearchView f23100;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final SearchableInfo f23101;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final Context f23102;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final WeakHashMap<String, Drawable.ConstantState> f23103;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final int f23104;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean f23105;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f23106;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public ColorStateList f23107;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f23108;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int f23109;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public int f23110;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public int f23111;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public int f23112;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public int f23113;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۤۥ$ۥ */
    public static final class C1322 {

        /* JADX INFO: renamed from: ۥ */
        public final TextView f3007;

        /* JADX INFO: renamed from: ۥ۟ */
        public final TextView f3008;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final ImageView f23114;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final ImageView f23115;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final ImageView f23116;

        public C1322(View view) {
            this.f3007 = (TextView) view.findViewById(R.id.text1);
            this.f3008 = (TextView) view.findViewById(R.id.text2);
            this.f23114 = (ImageView) view.findViewById(R.id.icon1);
            this.f23115 = (ImageView) view.findViewById(R.id.icon2);
            this.f23116 = (ImageView) view.findViewById(C6898.C6903.f18910);
        }
    }

    public ViewOnClickListenerC7675(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f23105 = false;
        this.f23106 = 1;
        this.f23108 = -1;
        this.f23109 = -1;
        this.f23110 = -1;
        this.f23111 = -1;
        this.f23112 = -1;
        this.f23113 = -1;
        this.f23100 = searchView;
        this.f23101 = searchableInfo;
        this.f23104 = searchView.getSuggestionCommitIconResId();
        this.f23102 = context;
        this.f23103 = weakHashMap;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static String m24427(Cursor cursor, String str) {
        return m24428(cursor, cursor.getColumnIndex(str));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static String m24428(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e(f23094, "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // Yue.AbstractC4256, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(f23094, "Search suggestions cursor threw exception.", e);
            View viewMo12285 = mo12285(this.f23102, getCursor(), viewGroup);
            if (viewMo12285 != null) {
                ((C1322) viewMo12285.getTag()).f3007.setText(e.toString());
            }
            return viewMo12285;
        }
    }

    @Override // Yue.AbstractC4256, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(f23094, "Search suggestions cursor threw exception.", e);
            View viewMo12286 = mo12286(this.f23102, getCursor(), viewGroup);
            if (viewMo12286 != null) {
                ((C1322) viewMo12286.getTag()).f3007.setText(e.toString());
            }
            return viewMo12286;
        }
    }

    @Override // Yue.AbstractC4256, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m24446(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m24446(getCursor());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f23100.m29140((CharSequence) tag);
        }
    }

    @Override // Yue.AbstractC4256, Yue.C4257.InterfaceC0371
    /* JADX INFO: renamed from: ۥ */
    public CharSequence mo1220(Cursor cursor) {
        String strM24427;
        String strM244272;
        if (cursor == null) {
            return null;
        }
        String strM244273 = m24427(cursor, "suggest_intent_query");
        if (strM244273 != null) {
            return strM244273;
        }
        if (this.f23101.shouldRewriteQueryFromData() && (strM244272 = m24427(cursor, "suggest_intent_data")) != null) {
            return strM244272;
        }
        if (!this.f23101.shouldRewriteQueryFromText() || (strM24427 = m24427(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strM24427;
    }

    @Override // Yue.AbstractC4256, Yue.C4257.InterfaceC0371
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1221(Cursor cursor) {
        if (this.f23105) {
            Log.w(f23094, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1221(cursor);
            if (cursor != null) {
                this.f23108 = cursor.getColumnIndex("suggest_text_1");
                this.f23109 = cursor.getColumnIndex("suggest_text_2");
                this.f23110 = cursor.getColumnIndex("suggest_text_2_url");
                this.f23111 = cursor.getColumnIndex("suggest_icon_1");
                this.f23112 = cursor.getColumnIndex("suggest_icon_2");
                this.f23113 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(f23094, "error changing cursor and caching columns", e);
        }
    }

    @Override // Yue.AbstractC4256, Yue.C4257.InterfaceC0371
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Cursor mo12280(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f23100.getVisibility() == 0 && this.f23100.getWindowVisibility() == 0) {
            try {
                Cursor cursorM24441 = m24441(this.f23101, string, 50);
                if (cursorM24441 != null) {
                    cursorM24441.getCount();
                    return cursorM24441;
                }
            } catch (RuntimeException e) {
                Log.w(f23094, "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // Yue.AbstractC4256
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo12281(View view, Context context, Cursor cursor) {
        C1322 c1322 = (C1322) view.getTag();
        int i = this.f23113;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c1322.f3007 != null) {
            m24444(c1322.f3007, m24428(cursor, this.f23108));
        }
        if (c1322.f3008 != null) {
            String strM24428 = m24428(cursor, this.f23110);
            CharSequence charSequenceM24431 = strM24428 != null ? m24431(strM24428) : m24428(cursor, this.f23109);
            if (TextUtils.isEmpty(charSequenceM24431)) {
                TextView textView = c1322.f3007;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c1322.f3007.setMaxLines(2);
                }
            } else {
                TextView textView2 = c1322.f3007;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c1322.f3007.setMaxLines(1);
                }
            }
            m24444(c1322.f3008, charSequenceM24431);
        }
        ImageView imageView = c1322.f23114;
        if (imageView != null) {
            m24443(imageView, m24438(cursor), 4);
        }
        ImageView imageView2 = c1322.f23115;
        if (imageView2 != null) {
            m24443(imageView2, m24439(cursor), 8);
        }
        int i3 = this.f23106;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            c1322.f23116.setVisibility(8);
            return;
        }
        c1322.f23116.setVisibility(0);
        c1322.f23116.setTag(c1322.f3007.getText());
        c1322.f23116.setOnClickListener(this);
    }

    @Override // Yue.AbstractC7121, Yue.AbstractC4256
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public View mo12286(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewMo12286 = super.mo12286(context, cursor, viewGroup);
        viewMo12286.setTag(new C1322(viewMo12286));
        ((ImageView) viewMo12286.findViewById(C6898.C6903.f18910)).setImageResource(this.f23104);
        return viewMo12286;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final Drawable m24429(String str) {
        Drawable.ConstantState constantState = this.f23103.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m24430() {
        mo1221(null);
        this.f23105 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final CharSequence m24431(CharSequence charSequence) {
        if (this.f23107 == null) {
            TypedValue typedValue = new TypedValue();
            this.f23102.getTheme().resolveAttribute(C6898.C1110.f18581, typedValue, true);
            this.f23107 = this.f23102.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f23107, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final Drawable m24432(ComponentName componentName) {
        PackageManager packageManager = this.f23102.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w(f23094, "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(f23094, e.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Drawable m24433(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f23103.containsKey(strFlattenToShortString)) {
            Drawable drawableM24432 = m24432(componentName);
            this.f23103.put(strFlattenToShortString, drawableM24432 != null ? drawableM24432.getConstantState() : null);
            return drawableM24432;
        }
        Drawable.ConstantState constantState = this.f23103.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f23102.getResources());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Drawable m24434() {
        Drawable drawableM24433 = m24433(this.f23101.getSearchActivity());
        return drawableM24433 != null ? drawableM24433 : this.f23102.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[CONSTRUCTOR, INVOKE, INVOKE, INVOKE, INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Drawable m24435(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m24436(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f23102.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e) {
                    Log.e(f23094, "Error closing icon stream for " + uri, e);
                }
            }
        } catch (FileNotFoundException e2) {
            Log.w(f23094, "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w(f23094, "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Drawable m24436(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f23102.getPackageManager().getResourcesForApplication(authority);
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

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final Drawable m24437(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f23102.getPackageName() + "/" + i;
            Drawable drawableM24429 = m24429(str2);
            if (drawableM24429 != null) {
                return drawableM24429;
            }
            Drawable drawableM12065 = C4187.m12065(this.f23102, i);
            m24445(str2, drawableM12065);
            return drawableM12065;
        } catch (Resources.NotFoundException unused) {
            Log.w(f23094, "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableM244292 = m24429(str);
            if (drawableM244292 != null) {
                return drawableM244292;
            }
            Drawable drawableM24435 = m24435(Uri.parse(str));
            m24445(str, drawableM24435);
            return drawableM24435;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final Drawable m24438(Cursor cursor) {
        int i = this.f23111;
        if (i == -1) {
            return null;
        }
        Drawable drawableM24437 = m24437(cursor.getString(i));
        return drawableM24437 != null ? drawableM24437 : m24434();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final Drawable m24439(Cursor cursor) {
        int i = this.f23112;
        if (i == -1) {
            return null;
        }
        return m24437(cursor.getString(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int m24440() {
        return this.f23106;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public Cursor m24441(SearchableInfo searchableInfo, String str, int i) {
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
        if (i > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f23102.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m24442(int i) {
        this.f23106 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m24443(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m24444(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m24445(String str, Drawable drawable) {
        if (drawable != null) {
            this.f23103.put(str, drawable.getConstantState());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m24446(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }
}
