package defpackage;

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
import com.ljx.wechatmod.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e50 extends we implements View.OnClickListener {
    public static final /* synthetic */ int x = 0;
    public final int h;
    public final int i;
    public final LayoutInflater j;
    public final SearchView k;
    public final SearchableInfo l;
    public final Context m;
    public final WeakHashMap n;
    public final int o;
    public int p;
    public ColorStateList q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public e50(Context r6, SearchView r7, SearchableInfo r8, WeakHashMap r9) {
        int r0 = r7.getSuggestionRowLayout();
        this.b = true;
        this.c = null;
        this.a = false;
        this.d = -1;
        this.e = new ue(this);
        this.f = new ve(0, this);
        this.i = r0;
        this.h = r0;
        this.j = (LayoutInflater) r6.getSystemService("layout_inflater");
        this.p = 1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.k = r7;
        this.l = r8;
        this.o = r7.getSuggestionCommitIconResId();
        this.m = r6;
        this.n = r9;
    }

    public static String h(Cursor r2, int r3) {
        if (r3 != (-1)) goto L10;
        return null;
    L10:
        return r2.getString(r3);
    L7:
        e = move-exception;
        Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
        return null;
    }

    @Override // defpackage.we
    public final void a(View r21, Cursor r22) {
        d50 r3 = (d50) r21.getTag();
        int r0 = this.w;
        if (r0 == (-1)) goto L5;
        int r6 = r22.getInt(r0);
    L6:
        TextView r7 = r3.a;
        TextView r02 = r3.b;
        ImageView r8 = r3.e;
        if (r7 == null) goto L12;
        String r10 = h(r22, this.r);
        r7.setText(r10);
        if (TextUtils.isEmpty(r10) == false) goto L11;
        r7.setVisibility(8);
        goto L12
    L11:
        r7.setVisibility(0);
    L12:
        Context r11 = this.m;
        if (r02 == null) goto L31;
        String r13 = h(r22, this.t);
        if (r13 != null) goto L17;
        CharSequence r5 = h(r22, this.s);
    L22:
        if (TextUtils.isEmpty(r5) == false) goto L25;
        if (r7 == null) goto L27;
        r7.setSingleLine(false);
        r7.setMaxLines(2);
    L27:
        r02.setText(r5);
        if (TextUtils.isEmpty(r5) == false) goto L30;
        r02.setVisibility(8);
        goto L31
    L30:
        r02.setVisibility(0);
        goto L31
    L25:
        if (r7 == null) goto L27;
        r7.setSingleLine(true);
        r7.setMaxLines(1);
        goto L27
    L17:
        if (this.q != null) goto L19;
        TypedValue r14 = new TypedValue();
        r11.getTheme().resolveAttribute(R.attr.textColorSearchUrl, r14, true);
        this.q = r11.getResources().getColorStateList(r14.resourceId);
    L19:
        SpannableString r52 = new SpannableString(r13);
        r52.setSpan(new TextAppearanceSpan(null, 0, 0, this.q, null), 0, r13.length(), 33);
        r5 = r52;
    L31:
        ImageView r53 = r3.c;
        if (r53 == null) goto L67;
        int r03 = this.u;
        if (r03 != (-1)) goto L36;
        Drawable r04 = null;
    L63:
        r53.setImageDrawable(r04);
        if (r04 != null) goto L66;
        r53.setVisibility(4);
        goto L67
    L66:
        r53.setVisibility(0);
        r04.setVisible(false, false);
        r04.setVisible(true, false);
        goto L67
    L36:
        r04 = f(r22.getString(r03));
        if (r04 != null) goto L63;
        ComponentName r05 = this.l.getSearchActivity();
        String r142 = r05.flattenToShortString();
        WeakHashMap r15 = this.n;
        if (r15.containsKey(r142) == false) goto L45;
        Drawable.ConstantState r06 = (Drawable.ConstantState) r15.get(r142);
        if (r06 != null) goto L44;
        r04 = null;
    L60:
        if (r04 != null) goto L63;
        r04 = r11.getPackageManager().getDefaultActivityIcon();
        goto L63
    L44:
        r04 = r06.newDrawable(r11.getResources());
        goto L60
    L45:
        PackageManager r102 = r11.getPackageManager();
        ActivityInfo r9 = r102.getActivityInfo(r05, 128);     // Catch: PackageManager.NameNotFoundException -> L54
        int r12 = r9.getIconResource();
        if (r12 != 0) goto L50;
    L49:
        r04 = null;
    L56:
        if (r04 != null) goto L58;
        Drawable.ConstantState r4 = null;
    L59:
        r15.put(r142, r4);
        goto L60
    L58:
        r4 = r04.getConstantState();
        goto L59
    L50:
        Drawable r42 = r102.getDrawable(r05.getPackageName(), r12, r9.applicationInfo);
        if (r42 != null) goto L53;
        Log.w("SuggestionsAdapter", "Invalid icon resource " + r12 + " for " + r05.flattenToShortString());
        goto L49
    L53:
        r04 = r42;
    L54:
        e = move-exception;
        Log.w("SuggestionsAdapter", e.toString());
    L67:
        ImageView r07 = r3.d;
        if (r07 == null) goto L77;
        int r32 = this.v;
        if (r32 != (-1)) goto L72;
        Drawable r132 = null;
    L73:
        r07.setImageDrawable(r132);
        if (r132 != null) goto L76;
        r07.setVisibility(8);
        goto L77
    L76:
        r07.setVisibility(0);
        r132.setVisible(false, false);
        int r54 = 1;
        r132.setVisible(true, false);
    L78:
        int r08 = this.p;
        if (r08 == 2) goto L85;
        if (r08 == r54) goto L82;
    L84:
        r8.setVisibility(8);
        return;
    L82:
        if ((r6 & 1) == 0) goto L84;
    L85:
        r8.setVisibility(0);
        r8.setTag(r7.getText());
        r8.setOnClickListener(this);
        return;
    L72:
        r132 = f(r22.getString(r32));
    L77:
        r54 = 1;
        goto L78
    L5:
        r6 = 0;
        goto L6
    }

    @Override // defpackage.we
    public final void b(Cursor r3) {
        super.b(r3);     // Catch: Exception -> L6
        if (r3 == null) goto L8;
        this.r = r3.getColumnIndex("suggest_text_1");     // Catch: Exception -> L6
        this.s = r3.getColumnIndex("suggest_text_2");     // Catch: Exception -> L6
        this.t = r3.getColumnIndex("suggest_text_2_url");     // Catch: Exception -> L6
        this.u = r3.getColumnIndex("suggest_icon_1");     // Catch: Exception -> L6
        this.v = r3.getColumnIndex("suggest_icon_2");     // Catch: Exception -> L6
        this.w = r3.getColumnIndex("suggest_flags");     // Catch: Exception -> L6
        return;
    L8:
        return;
    L6:
        e = move-exception;
        Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
    }

    @Override // defpackage.we
    public final String c(Cursor r3) {
        if (r3 == null) goto L20;
        String r0 = h(r3, r3.getColumnIndex("suggest_intent_query"));
        if (r0 == null) goto L7;
        return r0;
    L7:
        SearchableInfo r02 = this.l;
        if (r02.shouldRewriteQueryFromData() == false) goto L13;
        String r1 = h(r3, r3.getColumnIndex("suggest_intent_data"));
        if (r1 == null) goto L13;
        return r1;
    L13:
        if (r02.shouldRewriteQueryFromText() == false) goto L17;
        String r32 = h(r3, r3.getColumnIndex("suggest_text_1"));
        if (r32 == null) goto L19;
        return r32;
    L19:
        return null;
    L17:
        return null;
    L20:
        return null;
    }

    @Override // defpackage.we
    public final View d(ViewGroup r4) {
        int r0 = this.h;
        View r42 = this.j.inflate(r0, r4, false);
        r42.setTag(new d50(r42));
        ((ImageView) r42.findViewById(R.id.edit_query)).setImageResource(this.o);
        return r42;
    }

    public final Drawable e(Uri r8) {
        String r0 = r8.getAuthority();
        if (TextUtils.isEmpty(r0) == true) goto L28;
        Resources r1 = this.m.getPackageManager().getResourcesForApplication(r0);     // Catch: PackageManager.NameNotFoundException -> L25
        List<String> r2 = r8.getPathSegments();
        if (r2 == null) goto L24;
        int r3 = r2.size();
        if (r3 != 1) goto L14;
        int r02 = Integer.parseInt(r2.get(0));     // Catch: NumberFormatException -> L11
    L16:
        if (r02 == 0) goto L20;
        return r1.getDrawable(r02);
    L20:
        throw new FileNotFoundException("No resource found for: " + r8);
    L12:
        throw new FileNotFoundException("Single path segment is not a resource ID: " + r8);
    L14:
        if (r3 != 2) goto L22;
        r02 = r1.getIdentifier(r2.get(1), r2.get(0), r0);
        goto L16
    L22:
        throw new FileNotFoundException("More than two path segments: " + r8);
    L24:
        throw new FileNotFoundException("No path: " + r8);
    L26:
        throw new FileNotFoundException("No package found for authority: " + r8);
    L28:
        throw new FileNotFoundException("No authority: " + r8);
    }

    public final Drawable f(String r11) {
        WeakHashMap r0 = this.n;
        Context r2 = this.m;
        Drawable r4 = null;
        if (r11 != null) goto L5;
    L55:
        return r4;
    L5:
        if (r11.isEmpty() == true) goto L55;
        if ("0".equals(r11) == true) goto L55;
        int r5 = Integer.parseInt(r11);     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
        String r3 = "android.resource://" + r2.getPackageName() + "/" + r5;     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
        Drawable.ConstantState r6 = (Drawable.ConstantState) r0.get(r3);     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
        if (r6 != null) goto L12;
        Drawable r62 = null;
    L13:
        if (r62 == null) goto L15;
        return r62;
    L15:
        Drawable r52 = gd.b(r2, r5);     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
        if (r52 == null) goto L18;
        r0.put(r3, r52.getConstantState());     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
    L18:
        return r52;
    L12:
        r62 = r6.newDrawable();     // Catch: Resources.NotFoundException -> L19 NumberFormatException -> L21
    L19:
        Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(r11));
        return null;
    L21:
        Drawable.ConstantState r32 = (Drawable.ConstantState) r0.get(r11);
        if (r32 != null) goto L24;
        Drawable r33 = null;
    L25:
        if (r33 == null) goto L27;
        return r33;
    L27:
        Uri r34 = Uri.parse(r11);
    L32:
        e = move-exception;
        Log.w("SuggestionsAdapter", "Icon not found: " + r34 + ", " + e.getMessage());
    L53:
        if (r4 == null) goto L55;
        r0.put(r11, r4.getConstantState());
        goto L55
    L29:
        if ("android.resource".equals(r34.getScheme()) == true) goto L62;
        InputStream r22 = r2.getContentResolver().openInputStream(r34);     // Catch: FileNotFoundException -> L32
        if (r22 == null) goto L51;
        Drawable r63 = Drawable.createFromStream(r22, null);     // Catch: Throwable -> L44
    L60:
        r22.close();     // Catch: IOException -> L41
    L40:
        r4 = r63;
        goto L53
    L41:
        e = move-exception;
        Log.e("SuggestionsAdapter", "Error closing icon stream for " + r34, e);     // Catch: FileNotFoundException -> L32
    L44:
        th = move-exception;
        r22.close();     // Catch: IOException -> L47
    L49:
        throw th;     // Catch: FileNotFoundException -> L32
    L47:
        e = move-exception;
        Log.e("SuggestionsAdapter", "Error closing icon stream for " + r34, e);     // Catch: FileNotFoundException -> L32
        goto L49
    L51:
        throw new FileNotFoundException("Failed to open " + r34);     // Catch: FileNotFoundException -> L32
    L62:
        r4 = e(r34);     // Catch: FileNotFoundException -> L32 Resources.NotFoundException -> L34
    L35:
        throw new FileNotFoundException("Resource does not exist: " + r34);     // Catch: FileNotFoundException -> L32
    L24:
        r33 = r32.newDrawable();
        goto L25
    }

    public final Cursor g(SearchableInfo r10, String r11) {
        String[] r0 = null;
        if (r10 == null) goto L7;
        String r1 = r10.getSuggestAuthority();
        if (r1 == null) goto L7;
        Uri.Builder r12 = new Uri.Builder().scheme("content").authority(r1).query("").fragment("");
        String r2 = r10.getSuggestPath();
        if (r2 == null) goto L11;
        r12.appendEncodedPath(r2);
    L11:
        r12.appendPath("search_suggest_query");
        String r6 = r10.getSuggestSelection();
        if (r6 == null) goto L15;
        r0 = new String[]{r11};
    L14:
        String[] r7 = r0;
        r12.appendQueryParameter("limit", String.valueOf(50));
        return this.m.getContentResolver().query(r12.build(), null, r6, r7, null);
    L15:
        r12.appendPath(r11);
    L7:
        return null;
    }

    @Override // defpackage.we, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int r3, View r4, ViewGroup r5) {
        return super.getDropDownView(r3, r4, r5);
    L4:
        e = move-exception;
        Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
        int r42 = this.i;
        View r43 = this.j.inflate(r42, r5, false);
        if (r43 == null) goto L8;
        ((d50) r43.getTag()).a.setText(e.toString());
    L8:
        return r43;
    }

    @Override // defpackage.we, android.widget.Adapter
    public final View getView(int r2, View r3, ViewGroup r4) {
        return super.getView(r2, r3, r4);
    L4:
        e = move-exception;
        Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
        View r32 = d(r4);
        ((d50) r32.getTag()).a.setText(e.toString());
        return r32;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor r0 = this.c;
        if (r0 == null) goto L5;
        Bundle r02 = r0.getExtras();
    L6:
        if (r02 == null) goto L9;
        r02.getBoolean("in_progress");
        return;
    L9:
        return;
    L5:
        r02 = null;
        goto L6
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor r0 = this.c;
        if (r0 == null) goto L5;
        Bundle r02 = r0.getExtras();
    L6:
        if (r02 == null) goto L9;
        r02.getBoolean("in_progress");
        return;
    L9:
        return;
    L5:
        r02 = null;
        goto L6
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        Object r22 = r2.getTag();
        if ((r22 instanceof CharSequence) == false) goto L6;
        this.k.p((CharSequence) r22);
        return;
    }
}
