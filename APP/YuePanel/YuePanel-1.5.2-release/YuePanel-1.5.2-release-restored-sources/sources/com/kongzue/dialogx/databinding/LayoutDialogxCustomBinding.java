package com.kongzue.dialogx.databinding;

import Yue.C8271;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8270;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxCustomBinding implements InterfaceC8270 {

    @InterfaceC6391
    public final MaxRelativeLayout boxCustom;

    @InterfaceC6391
    public final DialogXBaseRelativeLayout boxRoot;

    @InterfaceC6391
    private final DialogXBaseRelativeLayout rootView;

    private LayoutDialogxCustomBinding(@InterfaceC6391 DialogXBaseRelativeLayout dialogXBaseRelativeLayout, @InterfaceC6391 MaxRelativeLayout maxRelativeLayout, @InterfaceC6391 DialogXBaseRelativeLayout dialogXBaseRelativeLayout2) {
        this.rootView = dialogXBaseRelativeLayout;
        this.boxCustom = maxRelativeLayout;
        this.boxRoot = dialogXBaseRelativeLayout2;
    }

    @InterfaceC6391
    public static LayoutDialogxCustomBinding bind(@InterfaceC6391 View view) {
        int i = C2413R.id.box_custom;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) C8271.m4244(view, i);
        if (maxRelativeLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view;
        return new LayoutDialogxCustomBinding(dialogXBaseRelativeLayout, maxRelativeLayout, dialogXBaseRelativeLayout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static LayoutDialogxCustomBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static LayoutDialogxCustomBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C2413R.layout.layout_dialogx_custom, viewGroup, false);
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
