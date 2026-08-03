package com.kongzue.dialogx.databinding;

import Yue.C8271;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8270;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxWaitBinding implements InterfaceC8270 {

    @InterfaceC6391
    public final MaxRelativeLayout bkg;

    @InterfaceC6391
    public final RelativeLayout boxCustomView;

    @InterfaceC6391
    public final RelativeLayout boxProgress;

    @InterfaceC6391
    public final DialogXBaseRelativeLayout boxRoot;

    @InterfaceC6391
    private final DialogXBaseRelativeLayout rootView;

    @InterfaceC6391
    public final TextView txtInfo;

    private LayoutDialogxWaitBinding(@InterfaceC6391 DialogXBaseRelativeLayout dialogXBaseRelativeLayout, @InterfaceC6391 MaxRelativeLayout maxRelativeLayout, @InterfaceC6391 RelativeLayout relativeLayout, @InterfaceC6391 RelativeLayout relativeLayout2, @InterfaceC6391 DialogXBaseRelativeLayout dialogXBaseRelativeLayout2, @InterfaceC6391 TextView textView) {
        this.rootView = dialogXBaseRelativeLayout;
        this.bkg = maxRelativeLayout;
        this.boxCustomView = relativeLayout;
        this.boxProgress = relativeLayout2;
        this.boxRoot = dialogXBaseRelativeLayout2;
        this.txtInfo = textView;
    }

    @InterfaceC6391
    public static LayoutDialogxWaitBinding bind(@InterfaceC6391 View view) {
        int i = C2413R.id.bkg;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) C8271.m4244(view, i);
        if (maxRelativeLayout != null) {
            i = C2413R.id.box_customView;
            RelativeLayout relativeLayout = (RelativeLayout) C8271.m4244(view, i);
            if (relativeLayout != null) {
                i = C2413R.id.box_progress;
                RelativeLayout relativeLayout2 = (RelativeLayout) C8271.m4244(view, i);
                if (relativeLayout2 != null) {
                    DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view;
                    i = C2413R.id.txt_info;
                    TextView textView = (TextView) C8271.m4244(view, i);
                    if (textView != null) {
                        return new LayoutDialogxWaitBinding(dialogXBaseRelativeLayout, maxRelativeLayout, relativeLayout, relativeLayout2, dialogXBaseRelativeLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static LayoutDialogxWaitBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static LayoutDialogxWaitBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C2413R.layout.layout_dialogx_wait, viewGroup, false);
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
