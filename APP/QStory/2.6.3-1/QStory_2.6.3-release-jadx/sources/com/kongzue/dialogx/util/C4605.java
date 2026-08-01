package com.kongzue.dialogx.util;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3898;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.SELECT_MODE;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p034.AbstractC7082;
import p273.C9034;
import p277.AbstractC9077;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4605 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4603 f12095;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Activity f12096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f12097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C9034 f12098;

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f12097.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (CharSequence) this.f12097.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C4601 c4601;
        ArrayList arrayList = this.f12097;
        Activity activity = this.f12096;
        C9034 c9034 = this.f12098;
        if (view == null) {
            C4601 c46012 = new C4601();
            LayoutInflater layoutInflaterM12309 = AbstractC7082.m12309(activity);
            c9034.f11928.mo10461();
            c9034.f11928.mo10461();
            c9034.mo8603();
            arrayList.size();
            View viewInflate = layoutInflaterM12309.inflate(C0328R.layout.item_dialogx_material_bottom_menu_normal_text, (ViewGroup) null);
            c46012.f12081 = (ImageView) viewInflate.findViewById(C0328R.id.img_dialogx_menu_icon);
            c46012.f12080 = (ImageView) viewInflate.findViewById(C0328R.id.img_dialogx_menu_selection);
            c46012.f12079 = (TextView) viewInflate.findViewById(C0328R.id.txt_dialogx_menu_text);
            c46012.f12078 = (Space) viewInflate.findViewById(C0328R.id.space_dialogx_right_padding);
            viewInflate.setTag(c46012);
            c4601 = c46012;
            view = viewInflate;
        } else {
            c4601 = (C4601) view.getTag();
        }
        HashMap map = c9034.f22950;
        AbstractC5754 abstractC5754 = c9034.f11928;
        Boolean bool = (Boolean) map.get(Integer.valueOf(i));
        if (bool == null ? true : bool.booleanValue()) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(0.4f);
        }
        SELECT_MODE select_mode = c9034.f22951;
        if (select_mode == SELECT_MODE.SINGLE) {
            ImageView imageView = c4601.f12080;
            if (imageView != null) {
                if (c9034.f22955 == i) {
                    imageView.setVisibility(0);
                    AbstractC3898 abstractC3898Mo10461 = abstractC5754.mo10461();
                    c9034.mo8603();
                    int iMo7430 = abstractC3898Mo10461.mo7430(true);
                    if (iMo7430 != 0) {
                        c4601.f12080.setImageResource(iMo7430);
                    }
                } else {
                    AbstractC3898 abstractC3898Mo104612 = abstractC5754.mo10461();
                    c9034.mo8603();
                    int iMo74302 = abstractC3898Mo104612.mo7430(false);
                    ImageView imageView2 = c4601.f12080;
                    if (iMo74302 != 0) {
                        imageView2.setVisibility(0);
                        c4601.f12080.setImageResource(iMo74302);
                    } else {
                        imageView2.setVisibility(4);
                    }
                }
            }
        } else if (select_mode != SELECT_MODE.MULTIPLE) {
            c4601.f12080.setVisibility(8);
        } else if (c4601.f12080 != null) {
            throw null;
        }
        abstractC5754.mo10461();
        abstractC5754.mo10461();
        c9034.mo8603();
        CharSequence charSequence = (CharSequence) arrayList.get(i);
        int iMo7431 = c9034.mo8603() ? C0328R.color.black90 : C0328R.color.white90;
        abstractC5754.mo10461();
        if (abstractC5754.mo10461().mo7431(c9034.mo8603()) != 0) {
            iMo7431 = abstractC5754.mo10461().mo7431(c9034.mo8603());
        }
        if (charSequence != null) {
            if (this.f12095 == null) {
                C4603 c4603 = new C4603();
                c4603.f12091 = c4601.f12079.getEllipsize() == TextUtils.TruncateAt.END;
                c4603.f12087 = c4601.f12079.getTextColors().getDefaultColor();
                c4603.f12086 = c4601.f12079.getPaint().isFakeBoldText();
                c4603.f12090 = (int) ((c4601.f12079.getTextSize() / activity.getResources().getDisplayMetrics().density) + 0.5f);
                c4603.f12088 = c4601.f12079.getGravity();
                c4603.f12085 = c4601.f12079.getMaxLines();
                this.f12095 = c4603;
            }
            c4601.f12079.setText(charSequence);
            c4601.f12079.setTextColor(activity.getResources().getColor(iMo7431));
            AbstractC5754 abstractC57542 = AbstractC9077.f23168;
            if (c4601.f12080 != null) {
                abstractC5754.mo10461();
                abstractC5754.mo10461();
                c9034.mo8603();
                c4601.f12080.setImageTintList(null);
            }
            c4601.f12081.setVisibility(8);
            Space space = c4601.f12078;
            if (space != null) {
                space.setVisibility(8);
            }
        }
        return view;
    }
}
