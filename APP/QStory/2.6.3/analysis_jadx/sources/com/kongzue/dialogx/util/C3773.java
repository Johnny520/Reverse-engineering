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
import com.bumptech.glide.AbstractC3066;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.SELECT_MODE;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p018.AbstractC6253;
import p257.C8205;
import p261.AbstractC8248;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3773 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C3771 f11750;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Activity f11751;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f11752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8205 f11753;

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f11752.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (CharSequence) this.f11752.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C3769 c3769;
        ArrayList arrayList = this.f11752;
        Activity activity = this.f11751;
        C8205 c8205 = this.f11753;
        if (view == null) {
            C3769 c37692 = new C3769();
            LayoutInflater layoutInflaterM11750 = AbstractC6253.m11750(activity);
            c8205.f11583.mo9902();
            c8205.f11583.mo9902();
            c8205.mo8044();
            arrayList.size();
            View viewInflate = layoutInflaterM11750.inflate(R.layout.item_dialogx_material_bottom_menu_normal_text, (ViewGroup) null);
            c37692.f11736 = (ImageView) viewInflate.findViewById(R.id.img_dialogx_menu_icon);
            c37692.f11735 = (ImageView) viewInflate.findViewById(R.id.img_dialogx_menu_selection);
            c37692.f11734 = (TextView) viewInflate.findViewById(R.id.txt_dialogx_menu_text);
            c37692.f11733 = (Space) viewInflate.findViewById(R.id.space_dialogx_right_padding);
            viewInflate.setTag(c37692);
            c3769 = c37692;
            view = viewInflate;
        } else {
            c3769 = (C3769) view.getTag();
        }
        HashMap map = c8205.f22605;
        AbstractC4922 abstractC4922 = c8205.f11583;
        Boolean bool = (Boolean) map.get(Integer.valueOf(i));
        if (bool == null ? true : bool.booleanValue()) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(0.4f);
        }
        SELECT_MODE select_mode = c8205.f22606;
        if (select_mode == SELECT_MODE.SINGLE) {
            ImageView imageView = c3769.f11735;
            if (imageView != null) {
                if (c8205.f22610 == i) {
                    imageView.setVisibility(0);
                    AbstractC3066 abstractC3066Mo9902 = abstractC4922.mo9902();
                    c8205.mo8044();
                    int iMo6870 = abstractC3066Mo9902.mo6870(true);
                    if (iMo6870 != 0) {
                        c3769.f11735.setImageResource(iMo6870);
                    }
                } else {
                    AbstractC3066 abstractC3066Mo99022 = abstractC4922.mo9902();
                    c8205.mo8044();
                    int iMo68702 = abstractC3066Mo99022.mo6870(false);
                    ImageView imageView2 = c3769.f11735;
                    if (iMo68702 != 0) {
                        imageView2.setVisibility(0);
                        c3769.f11735.setImageResource(iMo68702);
                    } else {
                        imageView2.setVisibility(4);
                    }
                }
            }
        } else if (select_mode != SELECT_MODE.MULTIPLE) {
            c3769.f11735.setVisibility(8);
        } else if (c3769.f11735 != null) {
            throw null;
        }
        abstractC4922.mo9902();
        abstractC4922.mo9902();
        c8205.mo8044();
        CharSequence charSequence = (CharSequence) arrayList.get(i);
        int iMo6871 = c8205.mo8044() ? R.color.black90 : R.color.white90;
        abstractC4922.mo9902();
        if (abstractC4922.mo9902().mo6871(c8205.mo8044()) != 0) {
            iMo6871 = abstractC4922.mo9902().mo6871(c8205.mo8044());
        }
        if (charSequence != null) {
            if (this.f11750 == null) {
                C3771 c3771 = new C3771();
                c3771.f11746 = c3769.f11734.getEllipsize() == TextUtils.TruncateAt.END;
                c3771.f11742 = c3769.f11734.getTextColors().getDefaultColor();
                c3771.f11741 = c3769.f11734.getPaint().isFakeBoldText();
                c3771.f11745 = (int) ((c3769.f11734.getTextSize() / activity.getResources().getDisplayMetrics().density) + 0.5f);
                c3771.f11743 = c3769.f11734.getGravity();
                c3771.f11740 = c3769.f11734.getMaxLines();
                this.f11750 = c3771;
            }
            c3769.f11734.setText(charSequence);
            c3769.f11734.setTextColor(activity.getResources().getColor(iMo6871));
            AbstractC4922 abstractC49222 = AbstractC8248.f22823;
            if (c3769.f11735 != null) {
                abstractC4922.mo9902();
                abstractC4922.mo9902();
                c8205.mo8044();
                c3769.f11735.setImageTintList(null);
            }
            c3769.f11736.setVisibility(8);
            Space space = c3769.f11733;
            if (space != null) {
                space.setVisibility(8);
            }
        }
        return view;
    }
}
