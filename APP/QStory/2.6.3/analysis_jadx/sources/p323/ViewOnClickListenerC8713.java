package p323;

import android.view.View;
import p052.InterfaceC6558;
import top.suzhelan.qstory.ui.views.CustomMaterialSwitch;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC8713 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ CustomMaterialSwitch f24545;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24546;

    public /* synthetic */ ViewOnClickListenerC8713(CustomMaterialSwitch customMaterialSwitch, int i) {
        this.f24546 = i;
        this.f24545 = customMaterialSwitch;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f24546;
        CustomMaterialSwitch customMaterialSwitch = this.f24545;
        switch (i) {
            case 0:
                customMaterialSwitch.setChecked(!customMaterialSwitch.f16282);
                break;
            default:
                customMaterialSwitch.setChecked(!customMaterialSwitch.f16282);
                InterfaceC6558 interfaceC6558 = customMaterialSwitch.f16281;
                if (interfaceC6558 != null) {
                    interfaceC6558.invoke(Boolean.valueOf(customMaterialSwitch.f16282));
                }
                break;
        }
    }
}
