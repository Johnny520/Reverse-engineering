package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0913;
import androidx.appcompat.widget.C0979;
import androidx.appcompat.widget.C1039;
import androidx.appcompat.widget.C1042;
import androidx.appcompat.widget.C1043;
import androidx.appcompat.widget.C1072;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.C3939;
import com.google.android.material.textfield.C4020;
import com.google.android.material.textview.MaterialTextView;
import p327.C9487;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0913 {
    @Override // androidx.appcompat.app.C0913
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C1072 mo767(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0913
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C0979 mo768(Context context, AttributeSet attributeSet) {
        return new C9487(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0913
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C1043 mo769(Context context, AttributeSet attributeSet) {
        return new C3939(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0913
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1042 mo770(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0913
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C1039 mo771(Context context, AttributeSet attributeSet) {
        return new C4020(context, attributeSet);
    }
}
