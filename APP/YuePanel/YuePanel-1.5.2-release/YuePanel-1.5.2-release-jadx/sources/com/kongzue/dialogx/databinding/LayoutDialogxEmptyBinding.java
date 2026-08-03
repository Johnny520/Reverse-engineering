package com.kongzue.dialogx.databinding;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8270;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.C2413R;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxEmptyBinding implements InterfaceC8270 {

    @InterfaceC6391
    private final RelativeLayout rootView;

    private LayoutDialogxEmptyBinding(@InterfaceC6391 RelativeLayout relativeLayout) {
        this.rootView = relativeLayout;
    }

    @InterfaceC6391
    public static LayoutDialogxEmptyBinding bind(@InterfaceC6391 View view) {
        if (view != null) {
            return new LayoutDialogxEmptyBinding((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static LayoutDialogxEmptyBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static LayoutDialogxEmptyBinding inflate(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C2413R.layout.layout_dialogx_empty, viewGroup, false);
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
