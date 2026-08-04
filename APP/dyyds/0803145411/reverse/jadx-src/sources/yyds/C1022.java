package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᛵᛱᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1022 extends C0763 {

    /* JADX INFO: renamed from: ᛱᛵᛳᛳ, reason: contains not printable characters */
    public int[] f4648;

    /* JADX INFO: renamed from: ᛱᛵᲈᛸ, reason: contains not printable characters */
    public long f4649;

    /* JADX INFO: renamed from: ᛲᛳᛵᛱ, reason: contains not printable characters */
    public LinearLayout f4650;

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public HashMap f4651;

    /* JADX INFO: renamed from: ᛴᛵᛷᛳ, reason: contains not printable characters */
    public boolean f4652;

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public C1022 f4653;

    /* JADX INFO: renamed from: ᛴᛸᲁᛵ, reason: contains not printable characters */
    public EditText f4654;

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public C0860 f4655;

    /* JADX INFO: renamed from: ᛵᛲᛶᲁ, reason: contains not printable characters */
    public String f4656;

    /* JADX INFO: renamed from: ᛵᛵᛷᲀ, reason: contains not printable characters */
    public CharSequence[] f4657;

    /* JADX INFO: renamed from: ᛵᛸᛵᛶ, reason: contains not printable characters */
    public String f4658;

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public int f4659;

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public ArrayList f4660;

    /* JADX INFO: renamed from: ᛶᛵᲁᲈ, reason: contains not printable characters */
    public boolean f4661;

    /* JADX INFO: renamed from: ᛷᲈᛳᛲ, reason: contains not printable characters */
    public TextView f4662;

    /* JADX INFO: renamed from: ᛸᲀᛷᛲ, reason: contains not printable characters */
    public List f4663;

    /* JADX INFO: renamed from: ᛸᲇᛱᲇ, reason: contains not printable characters */
    public int f4664;

    /* JADX INFO: renamed from: ᲀᛳᛷᛷ, reason: contains not printable characters */
    public ArrayList f4665;

    /* JADX INFO: renamed from: ᲀᛸᲈᲁ, reason: contains not printable characters */
    public ArrayList f4666;

    /* JADX INFO: renamed from: ᲇᛶᲀᲇ, reason: contains not printable characters */
    public String f4667;

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public InterfaceC0413 f4668;

    /* JADX INFO: renamed from: ᲈᛲᛳᛶ, reason: contains not printable characters */
    public float f4669;

    /* JADX INFO: renamed from: ᲈᛳ */
    public C1372 f21;

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public LinearLayout f4670;

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public static C1022 m2209(Context context) {
        C1022 c1022 = new C1022();
        c1022.f4653 = c1022;
        c1022.f4659 = -1;
        c1022.f4664 = 1;
        c1022.f4651 = new HashMap();
        c1022.f4652 = false;
        c1022.f4656 = "Search";
        c1022.f4658 = "无匹配结果";
        c1022.f4667 = "";
        c1022.f4649 = 0L;
        c1022.f408 = context;
        return c1022;
    }

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public static C1022 m2210() {
        C1022 c1022 = new C1022();
        c1022.f4653 = c1022;
        c1022.f4659 = -1;
        c1022.f4664 = 1;
        c1022.f4651 = new HashMap();
        c1022.f4652 = false;
        c1022.f4656 = "Search";
        c1022.f4658 = "无匹配结果";
        c1022.f4667 = "";
        c1022.f4649 = 0L;
        return c1022;
    }

    /* JADX INFO: renamed from: ᛱᛵᛳᛳ, reason: contains not printable characters */
    public final void m2211() {
        this.f4664 = 2;
        this.f4659 = -1;
        this.f4660 = null;
        this.f21 = null;
        m2220();
    }

    /* JADX INFO: renamed from: ᛱᛵᲈᛸ, reason: contains not printable characters */
    public final void m2212(int[] iArr) {
        this.f4664 = 3;
        this.f4659 = -1;
        this.f4660 = new ArrayList();
        for (int i : iArr) {
            this.f4660.add(Integer.valueOf(i));
        }
        this.f21 = null;
        m2220();
    }

    @Override // yyds.C0763
    /* JADX INFO: renamed from: ᛱᲀᲈᛲ */
    public final boolean mo1710() {
        EditText editText = this.f4654;
        if (editText == null || !editText.hasFocus()) {
            return false;
        }
        m2226();
        return true;
    }

    /* JADX INFO: renamed from: ᛲᛳᛵᛱ, reason: contains not printable characters */
    public final List m2213() {
        if (!this.f4652 || TextUtils.isEmpty(this.f4667)) {
            List list = this.f4663;
            return list == null ? new ArrayList() : list;
        }
        if (this.f4666 == null) {
            m4();
        }
        ArrayList arrayList = this.f4666;
        return arrayList == null ? new ArrayList() : arrayList;
    }

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public final void m2214() {
        ViewGroup viewGroup;
        C2457 c2457 = this.f3516;
        if (c2457 == null || (viewGroup = c2457.f12141) == null || this.f4655 == null) {
            return;
        }
        viewGroup.removeAllViews();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        if (!this.f4652) {
            if (this.f4654 != null) {
                m2226();
            }
            this.f4655.setVisibility(0);
            this.f4670 = null;
            this.f4650 = null;
            this.f4654 = null;
            this.f4662 = null;
            this.f3516.f12141.addView(this.f4655, layoutParams);
            return;
        }
        Context contextM282 = this.f4653.f408;
        if (contextM282 == null) {
            contextM282 = m282();
        }
        LinearLayout linearLayout = new LinearLayout(contextM282);
        this.f4670 = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(contextM282);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(m275(20.0f), m275(8.0f), m275(20.0f), m275(8.0f));
        linearLayout2.setFocusable(true);
        linearLayout2.setFocusableInTouchMode(true);
        EditText editText = new EditText(contextM282);
        this.f4654 = editText;
        editText.setSingleLine(true);
        this.f4654.setMaxLines(1);
        this.f4654.setInputType(1);
        this.f4654.setImeOptions(3);
        this.f4654.setGravity(8388627);
        this.f4654.setTextSize(16.0f);
        this.f4654.setIncludeFontPadding(false);
        this.f4654.setPadding(m275(12.0f), 0, m275(12.0f), 0);
        this.f4654.setCompoundDrawablePadding(m275(8.0f));
        this.f4654.setBackgroundResource(mo277() ? R.drawable.rect_dialogx_material_menu_search_bkg : R.drawable.rect_dialogx_material_menu_search_bkg_night);
        EditText editText2 = this.f4654;
        Resources resourcesM286 = m286();
        mo277();
        this.f398.getClass();
        mo277();
        editText2.setTextColor(resourcesM286.getColor(mo277() ? R.color.black90 : R.color.white90));
        this.f4654.setHintTextColor(m286().getColor(m2216()));
        this.f4654.setHint(this.f4656);
        AbstractC0041.m272(this.f4654, null);
        this.f4654.setSingleLine(true);
        this.f4654.setMaxLines(1);
        m2223();
        this.f4654.setOnEditorActionListener(new C1407(0, this));
        this.f4654.setOnTouchListener(new ViewOnTouchListenerC1550(0, this));
        if (!TextUtils.isEmpty(this.f4667)) {
            this.f4654.setText(this.f4667);
            EditText editText3 = this.f4654;
            editText3.setSelection(editText3.getText().length());
        }
        this.f4654.addTextChangedListener(new C1133(0, this));
        linearLayout2.addView(this.f4654, new LinearLayout.LayoutParams(-1, m275(42.0f)));
        linearLayout2.clearFocus();
        this.f4654.clearFocus();
        this.f4650 = linearLayout2;
        TextView textView = new TextView(contextM282);
        textView.setGravity(17);
        textView.setMinHeight(m275(55.0f));
        textView.setPadding(m275(20.0f), m275(12.0f), m275(20.0f), m275(12.0f));
        textView.setTextSize(15.0f);
        textView.setTextColor(m286().getColor(m2216()));
        textView.setText(this.f4658);
        AbstractC0041.m272(textView, null);
        textView.setVisibility(8);
        this.f4662 = textView;
        this.f4670.addView(this.f4650, new LinearLayout.LayoutParams(-1, -2));
        this.f4670.addView(this.f4655, new LinearLayout.LayoutParams(-1, -2));
        this.f4670.addView(this.f4662, new LinearLayout.LayoutParams(-1, -2));
        this.f3516.f12141.addView(this.f4670, layoutParams);
    }

    @Override // yyds.C0763
    /* JADX INFO: renamed from: ᛳᛷᛶᛲ */
    public final C0763 mo1713(CharSequence charSequence) {
        throw null;
    }

    /* JADX INFO: renamed from: ᛴᛵᛷᛳ, reason: contains not printable characters */
    public final void m2215(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.f4663 = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
        this.f21 = null;
        m2220();
    }

    @Override // yyds.C0763
    /* JADX INFO: renamed from: ᛴᛸᛴᛸ */
    public final void mo1714(String str, InterfaceC1376 interfaceC1376) {
        this.f3530 = str;
        this.f3528 = interfaceC1376;
        m2220();
    }

    /* JADX INFO: renamed from: ᛴᛸᲁᛵ, reason: contains not printable characters */
    public final int m2216() {
        return mo277() ? R.color.black40 : R.color.white40;
    }

    /* JADX INFO: renamed from: ᛵᛲᛶᲁ, reason: contains not printable characters */
    public final void m2217() {
        this.f4664 = 3;
        this.f4659 = -1;
        this.f4660 = new ArrayList();
        this.f21 = null;
        m2220();
    }

    /* JADX INFO: renamed from: ᛵᛸᛵᛶ, reason: contains not printable characters */
    public final void m2218(String str, InterfaceC1006 interfaceC1006) {
        this.f3530 = str;
        this.f3528 = interfaceC1006;
        m2220();
    }

    @Override // yyds.C0763
    /* JADX INFO: renamed from: ᛶᛴᛱᛲ */
    public final boolean mo1716() {
        int i = this.f3533;
        return i != 0 ? i == 1 : this.f406;
    }

    /* JADX INFO: renamed from: ᛶᛵᲁᲈ, reason: contains not printable characters */
    public final void m2219(String str, InterfaceC1006 interfaceC1006) {
        this.f3531 = str;
        this.f3535 = interfaceC1006;
        m2220();
    }

    @Override // yyds.C0763, com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final String mo283() {
        return C1022.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // yyds.C0763
    /* JADX INFO: renamed from: ᛷᛴᛴᲁ */
    public final C2457 mo1718() {
        return this.f3516;
    }

    /* JADX INFO: renamed from: ᛷᲈᛳᛲ, reason: contains not printable characters */
    public final void m2220() {
        if (this.f3516 == null) {
            return;
        }
        AbstractC0041.m266(new RunnableC0871(3, this));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᛸᛸᛷᛱ */
    public final void mo285() {
        ViewGroup viewGroup;
        C0860 c0860;
        C2457 c2457 = this.f3516;
        if (c2457 == null || (viewGroup = c2457.f12141) == null) {
            return;
        }
        viewGroup.setVisibility(0);
        if (!super.m1711()) {
            this.f3516.f12146.getClass();
        }
        this.f398.getClass();
        boolean zMo277 = mo277();
        int i = R.drawable.rect_dialogx_material_menu_split_divider_night;
        if (zMo277) {
            i = R.drawable.rect_dialogx_material_menu_split_divider;
        }
        mo277();
        Context contextM282 = this.f408;
        if (contextM282 == null) {
            contextM282 = m282();
        }
        Context contextM3376 = AbstractC1655.m3376();
        if (contextM3376 != null) {
            contextM282 = contextM3376;
        }
        if (mo277()) {
            c0860 = new C0860(contextM282);
            this.f4655 = c0860;
        } else {
            c0860 = new C0860(contextM282, 0);
            this.f4655 = c0860;
        }
        c0860.setTag("ScrollController");
        this.f4655.setOverScrollMode(2);
        this.f4655.setDivider(m286().getDrawable(i));
        this.f4655.setDividerHeight(1);
        C2457 c24572 = this.f3516;
        C0860 c08602 = this.f4655;
        c24572.f12137 = c08602;
        c08602.f3951 = new C1270(this, 0);
        c08602.setOnItemClickListener(new C2075(1, this));
        m2214();
        mo1719();
    }

    /* JADX INFO: renamed from: ᛸᲀᛷᛲ, reason: contains not printable characters */
    public final void m2221() {
        if (this.f4662 == null || this.f4655 == null) {
            return;
        }
        boolean z = this.f4652 && !TextUtils.isEmpty(this.f4667) && m2213().isEmpty();
        this.f4662.setText(this.f4658);
        this.f4662.setTextColor(m286().getColor(m2216()));
        AbstractC0041.m272(this.f4662, null);
        this.f4662.setVisibility(z ? 0 : 8);
        this.f4655.setVisibility(z ? 8 : 0);
    }

    /* JADX INFO: renamed from: ᲀᛳᛷᛷ, reason: contains not printable characters */
    public final void m2222(List list) {
        this.f4663 = list;
        this.f21 = null;
        m2220();
    }

    /* JADX INFO: renamed from: ᲀᛸᲈᲁ, reason: contains not printable characters */
    public final void m2223() {
        Drawable drawableM2767;
        EditText editText = this.f4654;
        if (editText == null) {
            return;
        }
        Drawable drawableM27672 = AbstractC1367.m2767(editText.getContext(), R.drawable.ic_dialogx_search);
        if (drawableM27672 != null) {
            drawableM27672 = drawableM27672.mutate();
            drawableM27672.setTintList(ColorStateList.valueOf(m286().getColor(m2216())));
            drawableM27672.setBounds(0, 0, m275(18.0f), m275(18.0f));
        }
        if (TextUtils.isEmpty(this.f4654.getText())) {
            drawableM2767 = null;
        } else {
            drawableM2767 = AbstractC1367.m2767(this.f4654.getContext(), R.drawable.ic_dialogx_close);
            if (drawableM2767 != null) {
                drawableM2767 = drawableM2767.mutate();
                drawableM2767.setTintList(ColorStateList.valueOf(m286().getColor(m2216())));
                drawableM2767.setBounds(0, 0, m275(18.0f), m275(18.0f));
            }
        }
        this.f4654.setCompoundDrawables(drawableM27672, null, drawableM2767, null);
    }

    @Override // yyds.C0763
    /* JADX INFO: renamed from: ᲁᛵᲁᲁ */
    public final void mo1719() {
        C1022 c1022 = this.f4653;
        if (this.f3516 == null) {
            return;
        }
        m4();
        if (this.f4655 != null) {
            boolean z = this.f4652;
            if (z && this.f4650 == null) {
                m2214();
            } else if (!z && this.f4650 != null) {
                m2214();
            }
            C1372 c1372 = this.f21;
            if (c1372 == null) {
                Context contextM282 = c1022.f408;
                if (contextM282 == null) {
                    contextM282 = m282();
                }
                List listM2213 = m2213();
                C1372 c13722 = new C1372(0);
                c13722.f6404 = listM2213;
                Context contextM3376 = AbstractC1655.m3376();
                if (contextM3376 != null) {
                    contextM282 = contextM3376;
                }
                c13722.f6400 = contextM282;
                c13722.f6401 = c1022;
                this.f21 = c13722;
            } else {
                c1372.f6404 = m2213();
            }
            ListAdapter adapter = this.f4655.getAdapter();
            C0860 c0860 = this.f4655;
            if (adapter == null) {
                c0860.setAdapter((ListAdapter) this.f21);
            } else {
                ListAdapter adapter2 = c0860.getAdapter();
                C1372 c13723 = this.f21;
                if (adapter2 != c13723) {
                    this.f4655.setAdapter((ListAdapter) c13723);
                } else {
                    c13723.notifyDataSetChanged();
                }
            }
        }
        EditText editText = this.f4654;
        if (editText != null) {
            editText.setHint(this.f4656);
            this.f4654.setBackgroundResource(mo277() ? R.drawable.rect_dialogx_material_menu_search_bkg : R.drawable.rect_dialogx_material_menu_search_bkg_night);
            EditText editText2 = this.f4654;
            Resources resourcesM286 = m286();
            mo277();
            this.f398.getClass();
            mo277();
            editText2.setTextColor(resourcesM286.getColor(mo277() ? R.color.black90 : R.color.white90));
            this.f4654.setHintTextColor(m286().getColor(m2216()));
            AbstractC0041.m272(this.f4654, null);
            this.f4654.setSingleLine(true);
            this.f4654.setMaxLines(1);
            m2223();
            m2221();
            Editable text = this.f4654.getText();
            String str = this.f4667;
            String string = str == null ? "" : str.toString();
            if (!TextUtils.equals(text, string)) {
                this.f4661 = true;
                this.f4654.setText(string);
                EditText editText3 = this.f4654;
                editText3.setSelection(editText3.getText().length());
                this.f4661 = false;
                m2223();
                m2221();
            }
        }
        super.mo1719();
    }

    /* JADX INFO: renamed from: ᲇᛶᲀᲇ, reason: contains not printable characters */
    public final void m2224(String str) {
        this.f3531 = str;
        m2220();
    }

    /* JADX INFO: renamed from: ᲈᛲᛳᛶ, reason: contains not printable characters */
    public final void m2225(int i) {
        this.f4664 = 2;
        this.f4659 = i;
        this.f4660 = null;
        this.f21 = null;
        m2220();
    }

    /* JADX INFO: renamed from: ᲈᛳ */
    public final void m4() {
        this.f4666 = null;
        this.f4665 = null;
        if (!this.f4652 || this.f4663 == null || TextUtils.isEmpty(this.f4667)) {
            return;
        }
        String lowerCase = this.f4667.toString().toLowerCase(Locale.getDefault());
        this.f4666 = new ArrayList();
        this.f4665 = new ArrayList();
        for (int i = 0; i < this.f4663.size(); i++) {
            CharSequence charSequence = (CharSequence) this.f4663.get(i);
            if (charSequence == null ? false : charSequence.toString().toLowerCase(Locale.getDefault()).contains(lowerCase)) {
                this.f4666.add(charSequence);
                this.f4665.add(Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public final void m2226() {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout;
        EditText editText = this.f4654;
        if (editText == null) {
            return;
        }
        m281(editText, false);
        this.f4654.clearFocus();
        C2457 c2457 = this.f3516;
        if (c2457 == null || (dialogXBaseRelativeLayout = c2457.f12135) == null) {
            return;
        }
        dialogXBaseRelativeLayout.requestFocus();
    }
}
