package yyds;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛶᛷᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1372 extends BaseAdapter {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Context f6400;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public AbstractC0041 f6401;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f6402;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2544 f6403;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public List f6404;

    @Override // android.widget.Adapter
    public final int getCount() {
        switch (this.f6402) {
        }
        return this.f6404.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        switch (this.f6402) {
        }
        return (CharSequence) this.f6404.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        switch (this.f6402) {
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x028d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0833 c0833;
        View viewInflate;
        boolean z;
        C2517 c2517;
        View viewInflate2;
        switch (this.f6402) {
            case 0:
                Context context = this.f6400;
                C1022 c1022 = (C1022) this.f6401;
                if (view == null) {
                    c0833 = new C0833();
                    LayoutInflater layoutInflaterM1961 = AbstractC0879.m1961(context);
                    c1022.f398.getClass();
                    c1022.f398.getClass();
                    c1022.mo277();
                    getCount();
                    viewInflate = layoutInflaterM1961.inflate(R.layout.item_dialogx_material_bottom_menu_normal_text, (ViewGroup) null);
                    c0833.f3812 = (ImageView) viewInflate.findViewById(R.id.img_dialogx_menu_icon);
                    c0833.f3813 = (ImageView) viewInflate.findViewById(R.id.img_dialogx_menu_selection);
                    c0833.f3814 = (TextView) viewInflate.findViewById(R.id.txt_dialogx_menu_text);
                    c0833.f3815 = (Space) viewInflate.findViewById(R.id.space_dialogx_right_padding);
                    viewInflate.setTag(c0833);
                } else {
                    c0833 = (C0833) view.getTag();
                    viewInflate = view;
                }
                ArrayList arrayList = c1022.f4665;
                C0469 c0469 = c1022.f398;
                int iIntValue = (arrayList == null || i < 0 || i >= arrayList.size()) ? i : ((Integer) c1022.f4665.get(i)).intValue();
                Boolean bool = (Boolean) c1022.f4651.get(Integer.valueOf(iIntValue));
                if (bool == null ? true : bool.booleanValue()) {
                    viewInflate.setAlpha(1.0f);
                } else {
                    viewInflate.setAlpha(0.4f);
                }
                int i2 = c1022.f4664;
                if (i2 == 2) {
                    ImageView imageView = c0833.f3813;
                    if (imageView == null) {
                        z = false;
                    } else if (c1022.f4659 == iIntValue) {
                        imageView.setVisibility(0);
                        c0469.getClass();
                        c1022.mo277();
                        c0833.f3813.setImageResource(R.mipmap.img_dialogx_bottom_menu_material_item_selection);
                        z = false;
                    } else {
                        c0469.getClass();
                        c1022.mo277();
                        c0833.f3813.setVisibility(0);
                        c0833.f3813.setImageResource(R.mipmap.img_dialogx_bottom_menu_material_item_non_select);
                        z = false;
                    }
                } else if (i2 != 3) {
                    z = false;
                    c0833.f3813.setVisibility(8);
                } else if (c0833.f3813 != null) {
                    if (c1022.f4660.contains(Integer.valueOf(iIntValue))) {
                        z = false;
                        c0833.f3813.setVisibility(0);
                        c0469.getClass();
                        c1022.mo277();
                        c0833.f3813.setImageResource(R.mipmap.img_dialogx_bottom_menu_material_item_multi_selection);
                    } else {
                        z = false;
                        c0469.getClass();
                        c1022.mo277();
                        c0833.f3813.setVisibility(0);
                        c0833.f3813.setImageResource(R.mipmap.img_dialogx_bottom_menu_material_item_non_multi_select);
                    }
                }
                c0469.getClass();
                c0469.getClass();
                c1022.mo277();
                CharSequence charSequence = (CharSequence) this.f6404.get(i);
                c1022.mo277();
                c0469.getClass();
                c0469.getClass();
                c1022.mo277();
                c0469.getClass();
                int i3 = c1022.mo277() ? R.color.black90 : R.color.white90;
                if (charSequence != null) {
                    if (this.f6403 == null) {
                        C2544 c2544 = new C2544();
                        if (c0833.f3814.getEllipsize() == TextUtils.TruncateAt.END) {
                            z = true;
                        }
                        c2544.f12538 = z;
                        c2544.f12537 = c0833.f3814.getTextColors().getDefaultColor();
                        c2544.f12539 = c0833.f3814.getPaint().isFakeBoldText();
                        c2544.f12535 = (int) ((c0833.f3814.getTextSize() / context.getResources().getDisplayMetrics().density) + 0.5f);
                        c2544.f12536 = c0833.f3814.getGravity();
                        c2544.f12534 = c0833.f3814.getMaxLines();
                        this.f6403 = c2544;
                    }
                    c0833.f3814.setText(charSequence);
                    c0833.f3814.setTextColor(context.getResources().getColor(i3));
                    WeakReference weakReference = AbstractC1655.f8450;
                    if (c0833.f3813 != null) {
                        c0469.getClass();
                        c0469.getClass();
                        c1022.mo277();
                        c0833.f3813.setImageTintList(null);
                    }
                    c0833.f3812.setVisibility(8);
                    Space space = c0833.f3815;
                    if (space != null) {
                        space.setVisibility(8);
                    }
                }
                return viewInflate;
            default:
                Context context2 = this.f6400;
                C0301 c0301 = (C0301) this.f6401;
                if (view == null) {
                    c2517 = new C2517();
                    LayoutInflater layoutInflaterM19612 = AbstractC0879.m1961(context2);
                    c0301.f398.getClass();
                    c0301.f398.getClass();
                    c0301.mo277();
                    getCount();
                    viewInflate2 = layoutInflaterM19612.inflate(R.layout.item_dialogx_material_bottom_menu_normal_text, (ViewGroup) null);
                    c2517.f12418 = (ImageView) viewInflate2.findViewById(R.id.img_dialogx_menu_icon);
                    c2517.f12419 = (ImageView) viewInflate2.findViewById(R.id.img_dialogx_menu_selection);
                    c2517.f12420 = (TextView) viewInflate2.findViewById(R.id.txt_dialogx_menu_text);
                    c2517.f12421 = (Space) viewInflate2.findViewById(R.id.space_dialogx_right_padding);
                    viewInflate2.setTag(c2517);
                } else {
                    c2517 = (C2517) view.getTag();
                    viewInflate2 = view;
                }
                c0301.getClass();
                C0469 c04692 = c0301.f398;
                Boolean bool2 = (Boolean) c0301.f1580.get(Integer.valueOf(i));
                if (bool2 == null ? true : bool2.booleanValue()) {
                    viewInflate2.setAlpha(1.0f);
                } else {
                    viewInflate2.setAlpha(0.4f);
                }
                int i4 = c0301.f1582;
                if (i4 == 2) {
                    ImageView imageView2 = c2517.f12419;
                    if (imageView2 != null) {
                        if (c0301.f1586 == i) {
                            imageView2.setVisibility(0);
                            c04692.getClass();
                            c0301.mo277();
                            c2517.f12419.setImageResource(R.mipmap.img_dialogx_bottom_menu_material_item_selection);
                        } else {
                            c04692.getClass();
                            c0301.mo277();
                            c2517.f12419.setVisibility(0);
                            c2517.f12419.setImageResource(R.mipmap.img_dialogx_bottom_menu_material_item_non_select);
                        }
                    }
                } else if (i4 != 3) {
                    c2517.f12419.setVisibility(8);
                } else if (c2517.f12419 != null) {
                    if (c0301.f1587.contains(Integer.valueOf(i))) {
                        c2517.f12419.setVisibility(0);
                        c04692.getClass();
                        c0301.mo277();
                        c2517.f12419.setImageResource(R.mipmap.img_dialogx_bottom_menu_material_item_multi_selection);
                    } else {
                        c04692.getClass();
                        c0301.mo277();
                        c2517.f12419.setVisibility(0);
                        c2517.f12419.setImageResource(R.mipmap.img_dialogx_bottom_menu_material_item_non_multi_select);
                    }
                }
                c04692.getClass();
                c04692.getClass();
                c0301.mo277();
                CharSequence charSequence2 = (CharSequence) this.f6404.get(i);
                c0301.mo277();
                c04692.getClass();
                c04692.getClass();
                c0301.mo277();
                c04692.getClass();
                int i5 = c0301.mo277() ? R.color.black90 : R.color.white90;
                if (charSequence2 != null) {
                    if (this.f6403 == null) {
                        C2544 c25442 = new C2544();
                        c25442.f12538 = c2517.f12420.getEllipsize() == TextUtils.TruncateAt.END;
                        c25442.f12537 = c2517.f12420.getTextColors().getDefaultColor();
                        c25442.f12539 = c2517.f12420.getPaint().isFakeBoldText();
                        c25442.f12535 = (int) ((c2517.f12420.getTextSize() / context2.getResources().getDisplayMetrics().density) + 0.5f);
                        c25442.f12536 = c2517.f12420.getGravity();
                        c25442.f12534 = c2517.f12420.getMaxLines();
                        this.f6403 = c25442;
                    }
                    c2517.f12420.setText(charSequence2);
                    c2517.f12420.setTextColor(context2.getResources().getColor(i5));
                    WeakReference weakReference2 = AbstractC1655.f8450;
                    if (c2517.f12419 != null) {
                        c04692.getClass();
                        c04692.getClass();
                        c0301.mo277();
                        c2517.f12419.setImageTintList(null);
                    }
                    c2517.f12418.setVisibility(8);
                    Space space2 = c2517.f12421;
                    if (space2 != null) {
                        space2.setVisibility(8);
                    }
                }
                return viewInflate2;
        }
    }
}
