package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4021 extends AbstractC4024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public EditText f11088;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f11089;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ViewOnClickListenerC4015 f11090;

    public C4021(C4027 c4027, int i) {
        super(c4027);
        this.f11089 = C0328R.drawable.design_password_eye;
        this.f11090 = new ViewOnClickListenerC4015(this, 2);
        if (i != 0) {
            this.f11089 = i;
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final View.OnClickListener mo7779() {
        return this.f11090;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo7781() {
        return this.f11089;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo7782() {
        return C0328R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo7809() {
        m7814();
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7778() {
        EditText editText = this.f11088;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f11088.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7786() {
        EditText editText = this.f11088;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo7810() {
        EditText editText = this.f11088;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo7789(EditText editText) {
        this.f11088 = editText;
        m7814();
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo7811() {
        return true;
    }
}
