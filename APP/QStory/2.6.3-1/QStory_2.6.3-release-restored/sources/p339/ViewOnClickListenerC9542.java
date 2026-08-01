package p339;

import android.view.View;
import p068.InterfaceC7387;
import top.suzhelan.qstory.p015ui.views.CustomMaterialSwitch;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC9542 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ CustomMaterialSwitch f24890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24891;

    public /* synthetic */ ViewOnClickListenerC9542(CustomMaterialSwitch customMaterialSwitch, int i) {
        this.f24891 = i;
        this.f24890 = customMaterialSwitch;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f24891;
        CustomMaterialSwitch customMaterialSwitch = this.f24890;
        switch (i) {
            case 0:
                customMaterialSwitch.setChecked(!customMaterialSwitch.f16627);
                break;
            default:
                customMaterialSwitch.setChecked(!customMaterialSwitch.f16627);
                InterfaceC7387 interfaceC7387 = customMaterialSwitch.f16626;
                if (interfaceC7387 != null) {
                    interfaceC7387.invoke(Boolean.valueOf(customMaterialSwitch.f16627));
                }
                break;
        }
    }
}
