package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0066;
import androidx.appcompat.widget.C0132;
import androidx.appcompat.widget.C0192;
import androidx.appcompat.widget.C0195;
import androidx.appcompat.widget.C0196;
import androidx.appcompat.widget.C0225;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.C3106;
import com.google.android.material.textfield.C3187;
import com.google.android.material.textview.MaterialTextView;
import p311.C8666;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0066 {
    @Override // androidx.appcompat.app.C0066
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C0225 mo206(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0066
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C0132 mo207(Context context, AttributeSet attributeSet) {
        return new C8666(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0066
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C0196 mo208(Context context, AttributeSet attributeSet) {
        return new C3106(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0066
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C0195 mo209(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0066
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C0192 mo210(Context context, AttributeSet attributeSet) {
        return new C3187(context, attributeSet);
    }
}
