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
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.SELECT_MODE;
import io.ktor.client.plugins.AbstractC3932;
import java.util.ArrayList;
import java.util.HashMap;
import p033.AbstractC6325;
import p053.AbstractC6560;
import p257.C8204;
import p261.AbstractC8247;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3772 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C3770 f11745;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Activity f11746;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f11747;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8204 f11748;

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f11747.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (CharSequence) this.f11747.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C3768 c3768;
        ArrayList arrayList = this.f11747;
        Activity activity = this.f11746;
        C8204 c8204 = this.f11748;
        if (view == null) {
            C3768 c37682 = new C3768();
            LayoutInflater layoutInflaterM12028 = AbstractC6560.m12028(activity);
            c8204.f11578.mo11877();
            c8204.f11578.mo11877();
            c8204.mo8057();
            arrayList.size();
            View viewInflate = layoutInflaterM12028.inflate(R.layout.item_dialogx_material_bottom_menu_normal_text, (ViewGroup) null);
            c37682.f11731 = (ImageView) viewInflate.findViewById(R.id.img_dialogx_menu_icon);
            c37682.f11730 = (ImageView) viewInflate.findViewById(R.id.img_dialogx_menu_selection);
            c37682.f11729 = (TextView) viewInflate.findViewById(R.id.txt_dialogx_menu_text);
            c37682.f11728 = (Space) viewInflate.findViewById(R.id.space_dialogx_right_padding);
            viewInflate.setTag(c37682);
            c3768 = c37682;
            view = viewInflate;
        } else {
            c3768 = (C3768) view.getTag();
        }
        HashMap map = c8204.f22606;
        AbstractC6325 abstractC6325 = c8204.f11578;
        Boolean bool = (Boolean) map.get(Integer.valueOf(i));
        if (bool == null ? true : bool.booleanValue()) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(0.4f);
        }
        SELECT_MODE select_mode = c8204.f22607;
        if (select_mode == SELECT_MODE.SINGLE) {
            ImageView imageView = c3768.f11730;
            if (imageView != null) {
                if (c8204.f22611 == i) {
                    imageView.setVisibility(0);
                    AbstractC3932 abstractC3932Mo11877 = abstractC6325.mo11877();
                    c8204.mo8057();
                    int iMo8327 = abstractC3932Mo11877.mo8327(true);
                    if (iMo8327 != 0) {
                        c3768.f11730.setImageResource(iMo8327);
                    }
                } else {
                    AbstractC3932 abstractC3932Mo118772 = abstractC6325.mo11877();
                    c8204.mo8057();
                    int iMo83272 = abstractC3932Mo118772.mo8327(false);
                    ImageView imageView2 = c3768.f11730;
                    if (iMo83272 != 0) {
                        imageView2.setVisibility(0);
                        c3768.f11730.setImageResource(iMo83272);
                    } else {
                        imageView2.setVisibility(4);
                    }
                }
            }
        } else if (select_mode != SELECT_MODE.MULTIPLE) {
            c3768.f11730.setVisibility(8);
        } else if (c3768.f11730 != null) {
            throw null;
        }
        abstractC6325.mo11877();
        abstractC6325.mo11877();
        c8204.mo8057();
        CharSequence charSequence = (CharSequence) arrayList.get(i);
        int iMo8328 = c8204.mo8057() ? R.color.black90 : R.color.white90;
        abstractC6325.mo11877();
        if (abstractC6325.mo11877().mo8328(c8204.mo8057()) != 0) {
            iMo8328 = abstractC6325.mo11877().mo8328(c8204.mo8057());
        }
        if (charSequence != null) {
            if (this.f11745 == null) {
                C3770 c3770 = new C3770();
                c3770.f11741 = c3768.f11729.getEllipsize() == TextUtils.TruncateAt.END;
                c3770.f11737 = c3768.f11729.getTextColors().getDefaultColor();
                c3770.f11736 = c3768.f11729.getPaint().isFakeBoldText();
                c3770.f11740 = (int) ((c3768.f11729.getTextSize() / activity.getResources().getDisplayMetrics().density) + 0.5f);
                c3770.f11738 = c3768.f11729.getGravity();
                c3770.f11735 = c3768.f11729.getMaxLines();
                this.f11745 = c3770;
            }
            c3768.f11729.setText(charSequence);
            c3768.f11729.setTextColor(activity.getResources().getColor(iMo8328));
            AbstractC6325 abstractC63252 = AbstractC8247.f22824;
            if (c3768.f11730 != null) {
                abstractC6325.mo11877();
                abstractC6325.mo11877();
                c8204.mo8057();
                c3768.f11730.setImageTintList(null);
            }
            c3768.f11731.setVisibility(8);
            Space space = c3768.f11728;
            if (space != null) {
                space.setVisibility(8);
            }
        }
        return view;
    }
}
