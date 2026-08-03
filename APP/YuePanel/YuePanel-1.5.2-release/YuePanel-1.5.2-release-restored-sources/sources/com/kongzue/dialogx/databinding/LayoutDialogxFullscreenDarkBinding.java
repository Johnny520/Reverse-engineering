package com.kongzue.dialogx.databinding;

import Yue.C8271;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8270;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.util.views.ActivityScreenShotImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxFullscreenDarkBinding implements InterfaceC8270 {

    @InterfaceC6391
    public final MaxRelativeLayout bkg;

    @InterfaceC6391
    public final RelativeLayout boxBkg;

    @InterfaceC6391
    public final RelativeLayout boxCustom;

    @InterfaceC6391
    public final DialogXBaseRelativeLayout boxRoot;

    @InterfaceC6391
    public final ActivityScreenShotImageView imgZoomActivity;

    @InterfaceC6391
    private final RelativeLayout rootView;

    private LayoutDialogxFullscreenDarkBinding(@InterfaceC6391 RelativeLayout relativeLayout, @InterfaceC6391 MaxRelativeLayout maxRelativeLayout, @InterfaceC6391 RelativeLayout relativeLayout2, @InterfaceC6391 RelativeLayout relativeLayout3, @InterfaceC6391 DialogXBaseRelativeLayout dialogXBaseRelativeLayout, @InterfaceC6391 ActivityScreenShotImageView activityScreenShotImageView) {
        this.rootView = relativeLayout;
        this.bkg = maxRelativeLayout;
        this.boxBkg = relativeLayout2;
        this.boxCustom = relativeLayout3;
        this.boxRoot = dialogXBaseRelativeLayout;
        this.imgZoomActivity = activityScreenShotImageView;
    }

    @InterfaceC6391
    public static LayoutDialogxFullscreenDarkBinding bind(@InterfaceC6391 View view) {
        int i = C2413R.id.bkg;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) C8271.m4244(view, i);
        if (maxRelativeLayout != null) {
            i = C2413R.id.box_bkg;
            RelativeLayout relativeLayout = (RelativeLayout) C8271.m4244(view, i);
            if (relativeLayout != null) {
                i = C2413R.id.box_custom;
                RelativeLayout relativeLayout2 = (RelativeLayout) C8271.m4244(view, i);
                if (relativeLayout2 != null) {
                    i = C2413R.id.box_root;
                    DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) C8271.m4244(view, i);
                    if (dialogXBaseRelativeLayout != null) {
                        i = C2413R.id.img_zoom_activity;
                        ActivityScreenShotImageView activityScreenShotImageView = (ActivityScreenShotImageView) C8271.m4244(view, i);
                        if (activityScreenShotImageView != null) {
                            return new LayoutDialogxFullscreenDarkBinding((RelativeLayout) view, maxRelativeLayout, relativeLayout, relativeLayout2, dialogXBaseRelativeLayout, activityScreenShotImageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static LayoutDialogxFullscreenDarkBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static LayoutDialogxFullscreenDarkBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C2413R.layout.layout_dialogx_fullscreen_dark, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // Yue.InterfaceC8270
    @InterfaceC6391
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
