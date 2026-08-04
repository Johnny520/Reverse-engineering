package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListAdapter;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛲᛳᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0301 extends C1188 {

    /* JADX INFO: renamed from: ᛲᛳᛵᛱ, reason: contains not printable characters */
    public List f1579;

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public HashMap f1580;

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public C0301 f1581;

    /* JADX INFO: renamed from: ᛴᛵᛷᛳ, reason: contains not printable characters */
    public int f1582;

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public boolean f1583;

    /* JADX INFO: renamed from: ᛴᛸᲁᛵ, reason: contains not printable characters */
    public String f1584;

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public EditText f1585;

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public int f1586;

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public ArrayList f1587;

    /* JADX INFO: renamed from: ᛷᲈᛳᛲ, reason: contains not printable characters */
    public String f1588;

    /* JADX INFO: renamed from: ᛸᲀᛷᛲ, reason: contains not printable characters */
    public long f1589;

    /* JADX INFO: renamed from: ᲀᛳᛷᛷ, reason: contains not printable characters */
    public CharSequence[] f1590;

    /* JADX INFO: renamed from: ᲀᛸᲈᲁ, reason: contains not printable characters */
    public int[] f1591;

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public C0860 f1592;

    /* JADX INFO: renamed from: ᲈᛳ */
    public float f18;

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public C1372 f1593;

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public static C0301 m955(Context context) {
        C0301 c0301 = new C0301();
        c0301.f1581 = c0301;
        c0301.f1583 = true;
        c0301.f1586 = -1;
        c0301.f1582 = 1;
        c0301.f1580 = new HashMap();
        c0301.f1584 = "Search";
        c0301.f1588 = "";
        c0301.f1589 = 0L;
        c0301.f408 = context;
        return c0301;
    }

    @Override // yyds.C1188
    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public final void mo956() {
        if (this.f5436 == null) {
            return;
        }
        if (this.f1592 != null) {
            C1372 c1372 = this.f1593;
            if (c1372 == null) {
                C0301 c0301 = this.f1581;
                Context contextM282 = this.f408;
                if (contextM282 == null) {
                    contextM282 = m282();
                }
                Context contextM3376 = AbstractC1655.m3376();
                if (contextM3376 != null) {
                    contextM282 = contextM3376;
                }
                List arrayList = this.f1579;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C1372 c13722 = new C1372(1);
                c13722.f6404 = arrayList;
                Context contextM33762 = AbstractC1655.m3376();
                if (contextM33762 != null) {
                    contextM282 = contextM33762;
                }
                c13722.f6400 = contextM282;
                c13722.f6401 = c0301;
                this.f1593 = c13722;
            } else {
                List arrayList2 = this.f1579;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                c1372.f6404 = arrayList2;
            }
            ListAdapter adapter = this.f1592.getAdapter();
            C0860 c0860 = this.f1592;
            if (adapter == null) {
                c0860.setAdapter((ListAdapter) this.f1593);
            } else {
                ListAdapter adapter2 = c0860.getAdapter();
                C1372 c13723 = this.f1593;
                if (adapter2 != c13723) {
                    this.f1592.setAdapter((ListAdapter) c13723);
                } else {
                    c13723.notifyDataSetChanged();
                }
            }
        }
        EditText editText = this.f1585;
        if (editText != null) {
            editText.setHint(this.f1584);
            this.f1585.setBackgroundResource(mo277() ? R.drawable.rect_dialogx_material_menu_search_bkg : R.drawable.rect_dialogx_material_menu_search_bkg_night);
            EditText editText2 = this.f1585;
            Resources resourcesM286 = m286();
            mo277();
            this.f398.getClass();
            mo277();
            editText2.setTextColor(resourcesM286.getColor(mo277() ? R.color.black90 : R.color.white90));
            this.f1585.setHintTextColor(m286().getColor(mo277() ? R.color.black40 : R.color.white40));
            AbstractC0041.m272(this.f1585, null);
            this.f1585.setSingleLine(true);
            this.f1585.setMaxLines(1);
            m959();
            Editable text = this.f1585.getText();
            String str = this.f1588;
            String string = str == null ? "" : str.toString();
            if (!TextUtils.equals(text, string)) {
                this.f1585.setText(string);
                EditText editText3 = this.f1585;
                editText3.setSelection(editText3.getText().length());
                m959();
            }
        }
        super.mo956();
    }

    @Override // yyds.C1188
    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public final boolean mo957() {
        int i = this.f5452;
        return i != 0 ? i == 1 : this.f406;
    }

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public final void m958() {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout;
        EditText editText = this.f1585;
        if (editText == null) {
            return;
        }
        m281(editText, false);
        this.f1585.clearFocus();
        C2283 c2283 = this.f5436;
        if (c2283 == null || (dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) c2283.f11231) == null) {
            return;
        }
        dialogXBaseRelativeLayout.requestFocus();
    }

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public final void m959() {
        Drawable drawableM2767;
        EditText editText = this.f1585;
        if (editText == null) {
            return;
        }
        Drawable drawableM27672 = AbstractC1367.m2767(editText.getContext(), R.drawable.ic_dialogx_search);
        int i = R.color.white40;
        if (drawableM27672 != null) {
            drawableM27672 = drawableM27672.mutate();
            drawableM27672.setTintList(ColorStateList.valueOf(m286().getColor(mo277() ? R.color.black40 : R.color.white40)));
            drawableM27672.setBounds(0, 0, m275(18.0f), m275(18.0f));
        }
        if (TextUtils.isEmpty(this.f1585.getText())) {
            drawableM2767 = null;
        } else {
            drawableM2767 = AbstractC1367.m2767(this.f1585.getContext(), R.drawable.ic_dialogx_close);
            if (drawableM2767 != null) {
                drawableM2767 = drawableM2767.mutate();
                Resources resourcesM286 = m286();
                if (mo277()) {
                    i = R.color.black40;
                }
                drawableM2767.setTintList(ColorStateList.valueOf(resourcesM286.getColor(i)));
                drawableM2767.setBounds(0, 0, m275(18.0f), m275(18.0f));
            }
        }
        this.f1585.setCompoundDrawables(drawableM27672, null, drawableM2767, null);
    }

    @Override // yyds.C1188
    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public final boolean mo960() {
        EditText editText = this.f1585;
        if (editText == null || !editText.hasFocus()) {
            return false;
        }
        m958();
        return true;
    }

    @Override // yyds.C1188, com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final String mo283() {
        return C0301.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // yyds.C1188
    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public final C2283 mo961() {
        return this.f5436;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᛸᛸᛷᛱ */
    public final void mo285() {
        ViewGroup viewGroup;
        C0860 c0860;
        ViewGroup viewGroup2;
        C2283 c2283 = this.f5436;
        if (c2283 == null || (viewGroup = (ViewGroup) c2283.f11238) == null) {
            return;
        }
        viewGroup.setVisibility(0);
        this.f398.getClass();
        if (!this.f1583) {
            ((MaxRelativeLayout) this.f5436.f11241).getClass();
        }
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
            this.f1592 = c0860;
        } else {
            c0860 = new C0860(contextM282, 0);
            this.f1592 = c0860;
        }
        c0860.setOverScrollMode(2);
        this.f1592.setDivider(m286().getDrawable(i));
        this.f1592.setDividerHeight(1);
        C0860 c08602 = this.f1592;
        c08602.f3951 = new C1270(this, 1);
        c08602.setOnItemClickListener(new C2075(2, this));
        C2283 c22832 = this.f5436;
        if (c22832 != null && (viewGroup2 = (ViewGroup) c22832.f11238) != null && this.f1592 != null) {
            viewGroup2.removeAllViews();
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            if (this.f1585 != null) {
                m958();
            }
            this.f1592.setVisibility(0);
            this.f1585 = null;
            ((ViewGroup) this.f5436.f11238).addView(this.f1592, layoutParams);
        }
        mo956();
    }

    @Override // yyds.C1188
    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public final C1188 mo962(CharSequence charSequence, InterfaceC1376 interfaceC1376) {
        throw null;
    }

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public final void m963() {
        if (this.f5436 == null) {
            return;
        }
        AbstractC0041.m266(new RunnableC0871(13, this));
    }
}
