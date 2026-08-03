package com.kongzue.dialogx.databinding;

import Yue.C8271;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8270;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxMaterialBinding implements InterfaceC8270 {

    @InterfaceC6391
    public final MaxRelativeLayout bkg;

    @InterfaceC6391
    public final LinearLayout boxButton;

    @InterfaceC6391
    public final RelativeLayout boxCustom;

    @InterfaceC6391
    public final FrameLayout boxList;

    @InterfaceC6391
    public final DialogXBaseRelativeLayout boxRoot;

    @InterfaceC6391
    public final TextView btnSelectNegative;

    @InterfaceC6391
    public final TextView btnSelectOther;

    @InterfaceC6391
    public final TextView btnSelectPositive;

    @InterfaceC6391
    private final DialogXBaseRelativeLayout rootView;

    @InterfaceC6391
    public final DialogScrollView scrollView;

    @InterfaceC6391
    public final Space spaceOtherButton;

    @InterfaceC6391
    public final TextView txtDialogTip;

    @InterfaceC6391
    public final TextView txtDialogTitle;

    @InterfaceC6391
    public final EditText txtInput;

    private LayoutDialogxMaterialBinding(@InterfaceC6391 DialogXBaseRelativeLayout dialogXBaseRelativeLayout, @InterfaceC6391 MaxRelativeLayout maxRelativeLayout, @InterfaceC6391 LinearLayout linearLayout, @InterfaceC6391 RelativeLayout relativeLayout, @InterfaceC6391 FrameLayout frameLayout, @InterfaceC6391 DialogXBaseRelativeLayout dialogXBaseRelativeLayout2, @InterfaceC6391 TextView textView, @InterfaceC6391 TextView textView2, @InterfaceC6391 TextView textView3, @InterfaceC6391 DialogScrollView dialogScrollView, @InterfaceC6391 Space space, @InterfaceC6391 TextView textView4, @InterfaceC6391 TextView textView5, @InterfaceC6391 EditText editText) {
        this.rootView = dialogXBaseRelativeLayout;
        this.bkg = maxRelativeLayout;
        this.boxButton = linearLayout;
        this.boxCustom = relativeLayout;
        this.boxList = frameLayout;
        this.boxRoot = dialogXBaseRelativeLayout2;
        this.btnSelectNegative = textView;
        this.btnSelectOther = textView2;
        this.btnSelectPositive = textView3;
        this.scrollView = dialogScrollView;
        this.spaceOtherButton = space;
        this.txtDialogTip = textView4;
        this.txtDialogTitle = textView5;
        this.txtInput = editText;
    }

    @InterfaceC6391
    public static LayoutDialogxMaterialBinding bind(@InterfaceC6391 View view) {
        int i = C2413R.id.bkg;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) C8271.m4244(view, i);
        if (maxRelativeLayout != null) {
            i = C2413R.id.box_button;
            LinearLayout linearLayout = (LinearLayout) C8271.m4244(view, i);
            if (linearLayout != null) {
                i = C2413R.id.box_custom;
                RelativeLayout relativeLayout = (RelativeLayout) C8271.m4244(view, i);
                if (relativeLayout != null) {
                    i = C2413R.id.box_list;
                    FrameLayout frameLayout = (FrameLayout) C8271.m4244(view, i);
                    if (frameLayout != null) {
                        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view;
                        i = C2413R.id.btn_selectNegative;
                        TextView textView = (TextView) C8271.m4244(view, i);
                        if (textView != null) {
                            i = C2413R.id.btn_selectOther;
                            TextView textView2 = (TextView) C8271.m4244(view, i);
                            if (textView2 != null) {
                                i = C2413R.id.btn_selectPositive;
                                TextView textView3 = (TextView) C8271.m4244(view, i);
                                if (textView3 != null) {
                                    i = C2413R.id.scrollView;
                                    DialogScrollView dialogScrollView = (DialogScrollView) C8271.m4244(view, i);
                                    if (dialogScrollView != null) {
                                        i = C2413R.id.space_other_button;
                                        Space space = (Space) C8271.m4244(view, i);
                                        if (space != null) {
                                            i = C2413R.id.txt_dialog_tip;
                                            TextView textView4 = (TextView) C8271.m4244(view, i);
                                            if (textView4 != null) {
                                                i = C2413R.id.txt_dialog_title;
                                                TextView textView5 = (TextView) C8271.m4244(view, i);
                                                if (textView5 != null) {
                                                    i = C2413R.id.txt_input;
                                                    EditText editText = (EditText) C8271.m4244(view, i);
                                                    if (editText != null) {
                                                        return new LayoutDialogxMaterialBinding(dialogXBaseRelativeLayout, maxRelativeLayout, linearLayout, relativeLayout, frameLayout, dialogXBaseRelativeLayout, textView, textView2, textView3, dialogScrollView, space, textView4, textView5, editText);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
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
    public static LayoutDialogxMaterialBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static LayoutDialogxMaterialBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C2413R.layout.layout_dialogx_material, viewGroup, false);
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
