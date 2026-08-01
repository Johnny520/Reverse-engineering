package p339;

import android.view.View;
import p068.InterfaceC7387;
import top.suzhelan.qstory.p015ui.views.CustomMaterialCheckBox;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC9544 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ CustomMaterialCheckBox f24895;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24896;

    public /* synthetic */ ViewOnClickListenerC9544(CustomMaterialCheckBox customMaterialCheckBox, int i) {
        this.f24896 = i;
        this.f24895 = customMaterialCheckBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f24896;
        CustomMaterialCheckBox customMaterialCheckBox = this.f24895;
        switch (i) {
            case 0:
                customMaterialCheckBox.setChecked(!customMaterialCheckBox.f16613);
                break;
            case 1:
                customMaterialCheckBox.setChecked(!customMaterialCheckBox.f16613);
                break;
            default:
                customMaterialCheckBox.setChecked(!customMaterialCheckBox.f16613);
                InterfaceC7387 interfaceC7387 = customMaterialCheckBox.f16617;
                if (interfaceC7387 != null) {
                    interfaceC7387.invoke(Boolean.valueOf(customMaterialCheckBox.f16613));
                }
                break;
        }
    }
}
