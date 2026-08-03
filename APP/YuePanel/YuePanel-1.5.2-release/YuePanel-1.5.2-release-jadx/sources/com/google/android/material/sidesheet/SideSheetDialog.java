package com.google.android.material.sidesheet;

import Yue.InterfaceC5195;
import Yue.InterfaceC5411;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7651;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetDialog extends SheetDialog<SideSheetCallback> {
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR = C1980R.attr.sideSheetDialogTheme;
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = C1980R.style.Theme_Material3_Light_SideSheetDialog;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SideSheetDialog(@InterfaceC6391 Context context) {
        this(context, 0);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public void addSheetCancelOnHideCallback(Sheet<SideSheetCallback> sheet) {
        sheet.addCallback(new SideSheetCallback() { // from class: com.google.android.material.sidesheet.SideSheetDialog.1
            @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
            public void onSlide(@InterfaceC6391 View view, float f) {
            }

            @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
            public void onStateChanged(@InterfaceC6391 View view, int i) {
                if (i == 5) {
                    SideSheetDialog.this.cancel();
                }
            }
        });
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @InterfaceC6391
    public Sheet<SideSheetCallback> getBehaviorFromSheet(@InterfaceC6391 FrameLayout frameLayout) {
        return SideSheetBehavior.from(frameLayout);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @InterfaceC5411
    public int getDialogId() {
        return C1980R.id.m3_side_sheet;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @InterfaceC5683
    public int getLayoutResId() {
        return C1980R.layout.m3_side_sheet_dialog;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public int getStateOnStart() {
        return 3;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
        return super.isDismissWithSheetAnimationEnabled();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.sidesheet.SheetDialog, Yue.DialogC3302, Yue.DialogC4065, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@InterfaceC5683 int i) {
        super.setContentView(i);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z) {
        super.setDismissWithSheetAnimationEnabled(z);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setSheetEdge(@InterfaceC5195 int i) {
        super.setSheetEdge(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SideSheetDialog(@InterfaceC6391 Context context, @InterfaceC7651 int i) {
        super(context, i, SIDE_SHEET_DIALOG_THEME_ATTR, SIDE_SHEET_DIALOG_DEFAULT_THEME_RES);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getBehavior()Lcom/google/android/material/sidesheet/Sheet; */
    @Override // com.google.android.material.sidesheet.SheetDialog
    @InterfaceC6391
    public SideSheetBehavior<? extends View> getBehavior() {
        Sheet behavior = super.getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.google.android.material.sidesheet.SheetDialog, Yue.DialogC3302, Yue.DialogC4065, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@InterfaceC6490 View view) {
        super.setContentView(view);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, Yue.DialogC3302, Yue.DialogC4065, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@InterfaceC6490 View view, @InterfaceC6490 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }
}
