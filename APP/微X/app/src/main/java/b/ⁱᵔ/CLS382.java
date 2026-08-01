// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.widget.RadioButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioGroup;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;

public final class CLS382 implements RadioGroup.OnCheckedChangeListener {
    public final ArrayList FLD3554;
    public final ArrayList FLD3555;
    public final RadioButton FLD3556;
    public final ContentValues[] FLD3557;
    public final RadioButton FLD3558;
    public final RadioButton FLD3559;
    public final RadioButton FLD3560;
    public final RadioButton FLD3561;
    public final ArrayList FLD3562;
    public final CLS335 FLD3563;
    public final ArrayList FLD3564;
    public final ArrayList FLD3565;
    public final RadioButton FLD3566;
    public final ArrayList FLD3567;

    public CLS382(ContentValues[] arr_contentValues, CLS335 ˑٴ0, RadioButton radioButton0, ArrayList arrayList0, RadioButton radioButton1, ArrayList arrayList1, RadioButton radioButton2, ArrayList arrayList2, RadioButton radioButton3, ArrayList arrayList3, RadioButton radioButton4, ArrayList arrayList4, RadioButton radioButton5, ArrayList arrayList5) {
        this.FLD3557 = arr_contentValues;
        this.FLD3563 = ˑٴ0;
        this.FLD3561 = radioButton0;
        this.FLD3564 = arrayList0;
        this.FLD3559 = radioButton1;
        this.FLD3567 = arrayList1;
        this.FLD3566 = radioButton2;
        this.FLD3555 = arrayList2;
        this.FLD3556 = radioButton3;
        this.FLD3554 = arrayList3;
        this.FLD3558 = radioButton4;
        this.FLD3562 = arrayList4;
        this.FLD3560 = radioButton5;
        this.FLD3565 = arrayList5;
    }

    @Override  // android.widget.RadioGroup$OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup0, int v) {
        ArrayList arrayList0;
        this.FLD3557[0] = null;
        CLS335 ˑٴ0 = this.FLD3563;
        ˑٴ0.FLD3337 = -1;
        if(this.FLD3561.isChecked()) {
            arrayList0 = this.FLD3564;
        }
        else {
            if(this.FLD3559.isChecked()) {
                arrayList0 = this.FLD3567;
                ˑٴ0.MTH5111(arrayList0);
                return;
            }
            if(this.FLD3566.isChecked()) {
                arrayList0 = this.FLD3555;
                ˑٴ0.MTH5111(arrayList0);
                return;
            }
            if(this.FLD3556.isChecked()) {
                arrayList0 = this.FLD3554;
                ˑٴ0.MTH5111(arrayList0);
                return;
            }
            if(this.FLD3558.isChecked()) {
                arrayList0 = this.FLD3562;
            }
            else if(this.FLD3560.isChecked()) {
                arrayList0 = this.FLD3565;
            }
            else {
                return;
            }
        }
        ˑٴ0.MTH5111(arrayList0);
    }
}

