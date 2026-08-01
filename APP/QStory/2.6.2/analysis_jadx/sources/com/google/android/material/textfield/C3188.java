package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3188 extends AbstractC3191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public EditText f10738;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f10739;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ViewOnClickListenerC3182 f10740;

    public C3188(C3194 c3194, int i) {
        super(c3194);
        this.f10739 = R.drawable.design_password_eye;
        this.f10740 = new ViewOnClickListenerC3182(this, 2);
        if (i != 0) {
            this.f10739 = i;
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final View.OnClickListener mo7233() {
        return this.f10740;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo7235() {
        return this.f10739;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo7236() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo7263() {
        m7268();
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7232() {
        EditText editText = this.f10738;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f10738.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7240() {
        EditText editText = this.f10738;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo7264() {
        EditText editText = this.f10738;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo7243(EditText editText) {
        this.f10738 = editText;
        m7268();
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo7265() {
        return true;
    }
}
