package com.kongzue.dialogx.databinding;

import Yue.C8271;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8270;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.kongzue.dialogx.C2413R;

/* JADX INFO: loaded from: classes2.dex */
public final class ItemDialogxMaterialContextMenuNormalTextBinding implements InterfaceC8270 {

    @InterfaceC6391
    public final LinearLayout boxItem;

    @InterfaceC6391
    public final ImageView imgDialogxMenuIcon;

    @InterfaceC6391
    private final LinearLayout rootView;

    @InterfaceC6391
    public final Space spaceDialogxRightPadding;

    @InterfaceC6391
    public final TextView txtDialogxMenuText;

    private ItemDialogxMaterialContextMenuNormalTextBinding(@InterfaceC6391 LinearLayout linearLayout, @InterfaceC6391 LinearLayout linearLayout2, @InterfaceC6391 ImageView imageView, @InterfaceC6391 Space space, @InterfaceC6391 TextView textView) {
        this.rootView = linearLayout;
        this.boxItem = linearLayout2;
        this.imgDialogxMenuIcon = imageView;
        this.spaceDialogxRightPadding = space;
        this.txtDialogxMenuText = textView;
    }

    @InterfaceC6391
    public static ItemDialogxMaterialContextMenuNormalTextBinding bind(@InterfaceC6391 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C2413R.id.img_dialogx_menu_icon;
        ImageView imageView = (ImageView) C8271.m4244(view, i);
        if (imageView != null) {
            i = C2413R.id.space_dialogx_right_padding;
            Space space = (Space) C8271.m4244(view, i);
            if (space != null) {
                i = C2413R.id.txt_dialogx_menu_text;
                TextView textView = (TextView) C8271.m4244(view, i);
                if (textView != null) {
                    return new ItemDialogxMaterialContextMenuNormalTextBinding(linearLayout, linearLayout, imageView, space, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static ItemDialogxMaterialContextMenuNormalTextBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static ItemDialogxMaterialContextMenuNormalTextBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C2413R.layout.item_dialogx_material_context_menu_normal_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // Yue.InterfaceC8270
    @InterfaceC6391
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
