package p319;

import android.view.View;
import p052.InterfaceC6557;
import top.suzhelan.qstory.ui.views.CustomMaterialCheckBox;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC8693 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ CustomMaterialCheckBox f24505;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24506;

    public /* synthetic */ ViewOnClickListenerC8693(CustomMaterialCheckBox customMaterialCheckBox, int i) {
        this.f24506 = i;
        this.f24505 = customMaterialCheckBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f24506;
        CustomMaterialCheckBox customMaterialCheckBox = this.f24505;
        switch (i) {
            case 0:
                customMaterialCheckBox.setChecked(!customMaterialCheckBox.f16259);
                break;
            case 1:
                customMaterialCheckBox.setChecked(!customMaterialCheckBox.f16259);
                break;
            default:
                customMaterialCheckBox.setChecked(!customMaterialCheckBox.f16259);
                InterfaceC6557 interfaceC6557 = customMaterialCheckBox.f16263;
                if (interfaceC6557 != null) {
                    interfaceC6557.invoke(Boolean.valueOf(customMaterialCheckBox.f16259));
                }
                break;
        }
    }
}
