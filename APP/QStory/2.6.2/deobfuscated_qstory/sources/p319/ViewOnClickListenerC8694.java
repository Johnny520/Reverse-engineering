package p319;

import android.view.View;
import p052.InterfaceC6557;
import top.suzhelan.qstory.ui.views.CustomMaterialSwitch;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC8694 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ CustomMaterialSwitch f24507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24508;

    public /* synthetic */ ViewOnClickListenerC8694(CustomMaterialSwitch customMaterialSwitch, int i) {
        this.f24508 = i;
        this.f24507 = customMaterialSwitch;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f24508;
        CustomMaterialSwitch customMaterialSwitch = this.f24507;
        switch (i) {
            case 0:
                customMaterialSwitch.setChecked(!customMaterialSwitch.f16273);
                break;
            default:
                customMaterialSwitch.setChecked(!customMaterialSwitch.f16273);
                InterfaceC6557 interfaceC6557 = customMaterialSwitch.f16272;
                if (interfaceC6557 != null) {
                    interfaceC6557.invoke(Boolean.valueOf(customMaterialSwitch.f16273));
                }
                break;
        }
    }
}
