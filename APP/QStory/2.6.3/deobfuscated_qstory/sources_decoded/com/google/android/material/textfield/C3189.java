package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3189 extends AbstractC3192 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public EditText f10743;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f10744;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ViewOnClickListenerC3183 f10745;

    public C3189(C3195 c3195, int i) {
        super(c3195);
        this.f10744 = R.drawable.design_password_eye;
        this.f10745 = new ViewOnClickListenerC3183(this, 2);
        if (i != 0) {
            this.f10744 = i;
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final View.OnClickListener mo7220() {
        return this.f10745;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo7222() {
        return this.f10744;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo7223() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo7250() {
        m7255();
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7219() {
        EditText editText = this.f10743;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f10743.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7227() {
        EditText editText = this.f10743;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo7251() {
        EditText editText = this.f10743;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo7230(EditText editText) {
        this.f10743 = editText;
        m7255();
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo7252() {
        return true;
    }
}
