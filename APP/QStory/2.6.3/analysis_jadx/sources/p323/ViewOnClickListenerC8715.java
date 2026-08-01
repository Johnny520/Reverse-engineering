package p323;

import android.view.View;
import p052.InterfaceC6558;
import top.suzhelan.qstory.ui.views.CustomMaterialCheckBox;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC8715 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ CustomMaterialCheckBox f24550;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24551;

    public /* synthetic */ ViewOnClickListenerC8715(CustomMaterialCheckBox customMaterialCheckBox, int i) {
        this.f24551 = i;
        this.f24550 = customMaterialCheckBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f24551;
        CustomMaterialCheckBox customMaterialCheckBox = this.f24550;
        switch (i) {
            case 0:
                customMaterialCheckBox.setChecked(!customMaterialCheckBox.f16268);
                break;
            case 1:
                customMaterialCheckBox.setChecked(!customMaterialCheckBox.f16268);
                break;
            default:
                customMaterialCheckBox.setChecked(!customMaterialCheckBox.f16268);
                InterfaceC6558 interfaceC6558 = customMaterialCheckBox.f16272;
                if (interfaceC6558 != null) {
                    interfaceC6558.invoke(Boolean.valueOf(customMaterialCheckBox.f16268));
                }
                break;
        }
    }
}
