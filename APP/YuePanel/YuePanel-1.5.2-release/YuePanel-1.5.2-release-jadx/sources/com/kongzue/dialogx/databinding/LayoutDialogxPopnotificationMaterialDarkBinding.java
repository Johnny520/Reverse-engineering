package com.kongzue.dialogx.databinding;

import Yue.C8271;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8270;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxLinearLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxPopnotificationMaterialDarkBinding implements InterfaceC8270 {

    @InterfaceC6391
    public final MaxLinearLayout boxBody;

    @InterfaceC6391
    public final RelativeLayout boxCustom;

    @InterfaceC6391
    public final DialogXBaseRelativeLayout boxRoot;

    @InterfaceC6391
    public final ImageView imgDialogxPopIcon;

    @InterfaceC6391
    private final DialogXBaseRelativeLayout rootView;

    @InterfaceC6391
    public final TextView txtDialogxButton;

    @InterfaceC6391
    public final TextView txtDialogxPopMessage;

    @InterfaceC6391
    public final TextView txtDialogxPopTitle;

    private LayoutDialogxPopnotificationMaterialDarkBinding(@InterfaceC6391 DialogXBaseRelativeLayout dialogXBaseRelativeLayout, @InterfaceC6391 MaxLinearLayout maxLinearLayout, @InterfaceC6391 RelativeLayout relativeLayout, @InterfaceC6391 DialogXBaseRelativeLayout dialogXBaseRelativeLayout2, @InterfaceC6391 ImageView imageView, @InterfaceC6391 TextView textView, @InterfaceC6391 TextView textView2, @InterfaceC6391 TextView textView3) {
        this.rootView = dialogXBaseRelativeLayout;
        this.boxBody = maxLinearLayout;
        this.boxCustom = relativeLayout;
        this.boxRoot = dialogXBaseRelativeLayout2;
        this.imgDialogxPopIcon = imageView;
        this.txtDialogxButton = textView;
        this.txtDialogxPopMessage = textView2;
        this.txtDialogxPopTitle = textView3;
    }

    @InterfaceC6391
    public static LayoutDialogxPopnotificationMaterialDarkBinding bind(@InterfaceC6391 View view) {
        int i = C2413R.id.box_body;
        MaxLinearLayout maxLinearLayout = (MaxLinearLayout) C8271.m4244(view, i);
        if (maxLinearLayout != null) {
            i = C2413R.id.box_custom;
            RelativeLayout relativeLayout = (RelativeLayout) C8271.m4244(view, i);
            if (relativeLayout != null) {
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view;
                i = C2413R.id.img_dialogx_pop_icon;
                ImageView imageView = (ImageView) C8271.m4244(view, i);
                if (imageView != null) {
                    i = C2413R.id.txt_dialogx_button;
                    TextView textView = (TextView) C8271.m4244(view, i);
                    if (textView != null) {
                        i = C2413R.id.txt_dialogx_pop_message;
                        TextView textView2 = (TextView) C8271.m4244(view, i);
                        if (textView2 != null) {
                            i = C2413R.id.txt_dialogx_pop_title;
                            TextView textView3 = (TextView) C8271.m4244(view, i);
                            if (textView3 != null) {
                                return new LayoutDialogxPopnotificationMaterialDarkBinding(dialogXBaseRelativeLayout, maxLinearLayout, relativeLayout, dialogXBaseRelativeLayout, imageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static LayoutDialogxPopnotificationMaterialDarkBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static LayoutDialogxPopnotificationMaterialDarkBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C2413R.layout.layout_dialogx_popnotification_material_dark, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // Yue.InterfaceC8270
    @InterfaceC6391
    public DialogXBaseRelativeLayout getRoot() {
        return this.rootView;
    }
}
