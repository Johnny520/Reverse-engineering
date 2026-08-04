package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;
import yyds.AbstractC0146;
import yyds.AbstractC1256;
import yyds.AbstractC1423;
import yyds.AbstractC1589;
import yyds.AbstractC1592;
import yyds.AbstractC1640;
import yyds.C0095;
import yyds.C0294;
import yyds.C0630;
import yyds.C0644;
import yyds.C1133;
import yyds.C1407;
import yyds.C1800;
import yyds.C2075;
import yyds.InterfaceC0226;
import yyds.InterfaceC0546;
import yyds.InterfaceC2348;
import yyds.InterfaceC2697;
import yyds.RunnableC0164;
import yyds.ViewOnClickListenerC1975;
import yyds.ViewOnFocusChangeListenerC0489;
import yyds.ViewOnLayoutChangeListenerC0926;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends AbstractC1423 implements InterfaceC2697 {

    /* JADX INFO: renamed from: ᲈᛳ */
    public static final /* synthetic */ int f0 = 0;

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final Rect f155;

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final Intent f156;

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public CharSequence f157;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public final Intent f158;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public C0294 f159;

    /* JADX INFO: renamed from: ᛲᛳᛵᛱ, reason: contains not printable characters */
    public final RunnableC0164 f160;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final ImageView f161;

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public AbstractC1589 f162;

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public boolean f163;

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public boolean f164;

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public boolean f165;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final View f166;

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public int f167;

    /* JADX INFO: renamed from: ᛴᛸᲁᛵ, reason: contains not printable characters */
    public final RunnableC0164 f168;

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public SearchableInfo f169;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final SearchAutoComplete f170;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final View f171;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final ImageView f172;

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public boolean f173;

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public boolean f174;

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public CharSequence f175;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final ImageView f176;

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public View.OnClickListener f177;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final View f178;

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public boolean f179;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final Drawable f180;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final Rect f181;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public final int f182;

    /* JADX INFO: renamed from: ᛷᲈᛳᛲ, reason: contains not printable characters */
    public final WeakHashMap f183;

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public final CharSequence f184;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final int[] f185;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final int[] f186;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final View f187;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public final ImageView f188;

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public boolean f189;

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public View.OnFocusChangeListener f190;

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public int f191;

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public Bundle f192;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final int f193;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final ImageView f194;

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f181 = new Rect();
        this.f155 = new Rect();
        this.f185 = new int[2];
        this.f186 = new int[2];
        this.f160 = new RunnableC0164(this, 0);
        this.f168 = new RunnableC0164(this, 1);
        this.f183 = new WeakHashMap();
        ViewOnClickListenerC0034 viewOnClickListenerC0034 = new ViewOnClickListenerC0034(this);
        ViewOnKeyListenerC0035 viewOnKeyListenerC0035 = new ViewOnKeyListenerC0035(this);
        C1407 c1407 = new C1407(1, this);
        C2075 c2075 = new C2075(3, this);
        C0630 c0630 = new C0630(1, this);
        C1133 c1133 = new C1133(1, this);
        int[] iArr = AbstractC1592.f8104;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C0644 c0644 = new C0644(context, typedArrayObtainStyledAttributes);
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC1256.m2535(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f170 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f187 = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f166 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f178 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f176 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f172 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f161 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f194 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f188 = imageView5;
        viewFindViewById.setBackground(c0644.m1554(10));
        viewFindViewById2.setBackground(c0644.m1554(14));
        imageView.setImageDrawable(c0644.m1554(13));
        imageView2.setImageDrawable(c0644.m1554(7));
        imageView3.setImageDrawable(c0644.m1554(4));
        imageView4.setImageDrawable(c0644.m1554(16));
        imageView5.setImageDrawable(c0644.m1554(13));
        this.f180 = c0644.m1554(12);
        AbstractC0146.m690(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f182 = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f193 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(viewOnClickListenerC0034);
        imageView3.setOnClickListener(viewOnClickListenerC0034);
        imageView2.setOnClickListener(viewOnClickListenerC0034);
        imageView4.setOnClickListener(viewOnClickListenerC0034);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0034);
        searchAutoComplete.addTextChangedListener(c1133);
        searchAutoComplete.setOnEditorActionListener(c1407);
        searchAutoComplete.setOnItemClickListener(c2075);
        searchAutoComplete.setOnItemSelectedListener(c0630);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0035);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0489(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f184 = typedArrayObtainStyledAttributes.getText(6);
        this.f157 = typedArrayObtainStyledAttributes.getText(11);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        c0644.m1568();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f158 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f156 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f171 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0926(1, this));
        }
        m67(this.f163);
        m65();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f170;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f165 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f170;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f165 = false;
    }

    public int getImeOptions() {
        return this.f170.getImeOptions();
    }

    public int getInputType() {
        return this.f170.getInputType();
    }

    public int getMaxWidth() {
        return this.f167;
    }

    public CharSequence getQuery() {
        return this.f170.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f157;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f169;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f184 : getContext().getText(this.f169.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f193;
    }

    public int getSuggestionRowLayout() {
        return this.f182;
    }

    public AbstractC1589 getSuggestionsAdapter() {
        return this.f162;
    }

    @Override // yyds.InterfaceC2697
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f170;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f175 = "";
        clearFocus();
        m67(true);
        searchAutoComplete.setImeOptions(this.f191);
        this.f164 = false;
    }

    @Override // yyds.InterfaceC2697
    public final void onActionViewExpanded() {
        if (this.f164) {
            return;
        }
        this.f164 = true;
        SearchAutoComplete searchAutoComplete = this.f170;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f191 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f160);
        post(this.f168);
        super.onDetachedFromWindow();
    }

    @Override // yyds.AbstractC1423, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f170;
            int[] iArr = this.f185;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f186;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.f181;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f155;
            rect2.set(i7, 0, i8, i9);
            C0294 c0294 = this.f159;
            if (c0294 == null) {
                C0294 c02942 = new C0294(rect2, rect, searchAutoComplete);
                this.f159 = c02942;
                setTouchDelegate(c02942);
            } else {
                c0294.f1562.set(rect2);
                Rect rect3 = c0294.f1565;
                rect3.set(rect2);
                int i10 = -c0294.f1560;
                rect3.inset(i10, i10);
                c0294.f1563.set(rect);
            }
        }
    }

    @Override // yyds.AbstractC1423, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f179) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f167;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f167;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f167) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0095)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0095 c0095 = (C0095) parcelable;
        super.onRestoreInstanceState(c0095.f8458);
        m67(c0095.f709);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0095 c0095 = new C0095(super.onSaveInstanceState());
        c0095.f709 = this.f179;
        return c0095;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f160);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f165 || !isFocusable()) {
            return false;
        }
        if (this.f179) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f170.requestFocus(i, rect);
        if (zRequestFocus) {
            m67(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f192 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m68();
            return;
        }
        m67(false);
        SearchAutoComplete searchAutoComplete = this.f170;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f177;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f163 == z) {
            return;
        }
        this.f163 = z;
        m67(z);
        m65();
    }

    public void setImeOptions(int i) {
        this.f170.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f170.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f167 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0226 interfaceC0226) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f190 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0546 interfaceC0546) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f177 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC2348 interfaceC2348) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f157 = charSequence;
        m65();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f189 = z;
        AbstractC1589 abstractC1589 = this.f162;
        if (abstractC1589 instanceof ViewOnClickListenerC1975) {
            ((ViewOnClickListenerC1975) abstractC1589).f9895 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f169 = searchableInfo;
        Intent intent = null;
        boolean z = true;
        SearchAutoComplete searchAutoComplete = this.f170;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f169.getImeOptions());
            int inputType = this.f169.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f169.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            AbstractC1589 abstractC1589 = this.f162;
            if (abstractC1589 != null) {
                abstractC1589.mo3257(null);
            }
            if (this.f169.getSuggestAuthority() != null) {
                ViewOnClickListenerC1975 viewOnClickListenerC1975 = new ViewOnClickListenerC1975(getContext(), this, this.f169, this.f183);
                this.f162 = viewOnClickListenerC1975;
                searchAutoComplete.setAdapter(viewOnClickListenerC1975);
                ((ViewOnClickListenerC1975) this.f162).f9895 = this.f189 ? 2 : 1;
            }
            m65();
        }
        SearchableInfo searchableInfo2 = this.f169;
        if (searchableInfo2 == null || !searchableInfo2.getVoiceSearchEnabled()) {
            z = false;
        } else {
            if (this.f169.getVoiceSearchLaunchWebSearch()) {
                intent = this.f158;
            } else if (this.f169.getVoiceSearchLaunchRecognizer()) {
                intent = this.f156;
            }
            if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            }
        }
        this.f173 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        m67(this.f179);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f174 = z;
        m67(this.f179);
    }

    public void setSuggestionsAdapter(AbstractC1589 abstractC1589) {
        this.f162 = abstractC1589;
        this.f170.setAdapter(abstractC1589);
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void m60(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m61(int i) {
        Editable text = this.f170.getText();
        Cursor cursor = this.f162.f8080;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strMo3258 = this.f162.mo3258(cursor);
        if (strMo3258 != null) {
            setQuery(strMo3258);
        } else {
            setQuery(text);
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final Intent m62(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f175);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f192;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f169.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void m63(boolean z) {
        boolean z2 = this.f174;
        this.f172.setVisibility((!z2 || !(z2 || this.f173) || this.f179 || !hasFocus() || (!z && this.f173)) ? 8 : 0);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m64() {
        SearchAutoComplete searchAutoComplete = this.f170;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f169 != null) {
            getContext().startActivity(m62("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final void m65() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.f163;
        SearchAutoComplete searchAutoComplete = this.f170;
        CharSequence charSequence2 = charSequence;
        if (z) {
            Drawable drawable = this.f180;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchAutoComplete.setHint(charSequence2);
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final void m66() {
        int[] iArr = this.f170.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f166.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f178.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final void m67(boolean z) {
        this.f179 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f170.getText());
        this.f176.setVisibility(i2);
        m63(!zIsEmpty);
        this.f187.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f188;
        imageView.setVisibility((imageView.getDrawable() == null || this.f163) ? 8 : 0);
        m72();
        if (this.f173 && !this.f179 && zIsEmpty) {
            this.f172.setVisibility(8);
            i = 0;
        }
        this.f194.setVisibility(i);
        m71();
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m68() {
        SearchAutoComplete searchAutoComplete = this.f170;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f163) {
            clearFocus();
            m67(true);
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m69(int i) {
        int position;
        String strM3804;
        Cursor cursor = this.f162.f8080;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentM62 = null;
            try {
                int i2 = ViewOnClickListenerC1975.f9889;
                String strM38042 = ViewOnClickListenerC1975.m3804(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strM38042 == null) {
                    strM38042 = this.f169.getSuggestIntentAction();
                }
                if (strM38042 == null) {
                    strM38042 = "android.intent.action.SEARCH";
                }
                String strM38043 = ViewOnClickListenerC1975.m3804(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strM38043 == null) {
                    strM38043 = this.f169.getSuggestIntentData();
                }
                if (strM38043 != null && (strM3804 = ViewOnClickListenerC1975.m3804(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strM38043 = strM38043 + "/" + Uri.encode(strM3804);
                }
                intentM62 = m62(strM38042, strM38043 == null ? null : Uri.parse(strM38043), ViewOnClickListenerC1975.m3804(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC1975.m3804(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentM62 != null) {
                try {
                    getContext().startActivity(intentM62);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentM62, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f170;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final Intent m70(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f192;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final void m71() {
        this.f178.setVisibility(((this.f174 || this.f173) && !this.f179 && (this.f172.getVisibility() == 0 || this.f194.getVisibility() == 0)) ? 0 : 8);
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m72() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f170.getText());
        int i = (!zIsEmpty || (this.f163 && !this.f164)) ? 0 : 8;
        ImageView imageView = this.f161;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static class SearchAutoComplete extends C1800 {

        /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
        public SearchView f195;

        /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
        public boolean f196;

        /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
        public int f197;

        /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
        public final RunnableC0037 f198;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f198 = new RunnableC0037(this);
            this.f197 = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f197 <= 0 || super.enoughToFilter();
        }

        @Override // yyds.C1800, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f196) {
                RunnableC0037 runnableC0037 = this.f198;
                removeCallbacks(runnableC0037);
                post(runnableC0037);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f195;
            searchView.m67(searchView.f179);
            searchView.post(searchView.f160);
            SearchAutoComplete searchAutoComplete = searchView.f170;
            if (searchAutoComplete.hasFocus()) {
                AbstractC0036.m94(searchAutoComplete);
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f195.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f195.hasFocus() && getVisibility() == 0) {
                this.f196 = true;
                Context context = getContext();
                int i = SearchView.f0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    AbstractC0036.m95(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0037 runnableC0037 = this.f198;
            if (!z) {
                this.f196 = false;
                removeCallbacks(runnableC0037);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f196 = true;
                    return;
                }
                this.f196 = false;
                removeCallbacks(runnableC0037);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f195 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f197 = i;
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
