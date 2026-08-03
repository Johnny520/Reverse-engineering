package com.google.android.material.datepicker;

import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.material.C1980R;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.dialog.MaterialDialogs;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP, InterfaceC7144.EnumC1188.TESTS})
public class MaterialStyledDatePickerDialog extends DatePickerDialog {

    @InterfaceC3451
    private static final int DEF_STYLE_ATTR = 16843612;

    @InterfaceC7651
    private static final int DEF_STYLE_RES = C1980R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;

    @InterfaceC6391
    private final Drawable background;

    @InterfaceC6391
    private final Rect backgroundInsets;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialStyledDatePickerDialog(@InterfaceC6391 Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.background);
        getWindow().getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(this, this.backgroundInsets));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialStyledDatePickerDialog(@InterfaceC6391 Context context, int i) {
        this(context, i, null, -1, -1, -1);
    }

    public MaterialStyledDatePickerDialog(@InterfaceC6391 Context context, @InterfaceC6490 DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        this(context, 0, onDateSetListener, i, i2, i3);
    }

    public MaterialStyledDatePickerDialog(@InterfaceC6391 Context context, int i, @InterfaceC6490 DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        Context context2 = getContext();
        int iResolveOrThrow = MaterialAttributes.resolveOrThrow(getContext(), C1980R.attr.colorSurface, getClass().getCanonicalName());
        int i5 = DEF_STYLE_RES;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, 16843612, i5);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(iResolveOrThrow));
        Rect dialogBackgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, 16843612, i5);
        this.backgroundInsets = dialogBackgroundInsets;
        this.background = MaterialDialogs.insetDrawable(materialShapeDrawable, dialogBackgroundInsets);
    }
}
