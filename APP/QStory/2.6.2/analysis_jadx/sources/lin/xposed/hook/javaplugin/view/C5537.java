package lin.xposed.hook.javaplugin.view;

import android.widget.CompoundButton;
import androidx.core.view.C2242;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C3152;
import com.google.android.material.internal.InterfaceC3164;
import lin.xposed.hook.javaplugin.bean.PluginInfo;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5537 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15288;

    public /* synthetic */ C5537(Object obj, int i) {
        this.f15288 = i;
        this.f15287 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f15288;
        Object obj = this.f15287;
        switch (i) {
            case 0:
                PluginItemView.lambda$bindPluginInfoData$2((PluginInfo) obj, compoundButton, z);
                break;
            case 1:
                ((PluginItemView) obj).lambda$bindPluginInfoData$5(compoundButton, z);
                break;
            default:
                Chip chip = (Chip) obj;
                InterfaceC3164 interfaceC3164 = chip.f10217;
                if (interfaceC3164 != null) {
                    C3152 c3152 = (C3152) ((C2242) interfaceC3164).f6536;
                    if (!z ? c3152.m7185(chip, c3152.f10492) : c3152.m7189(chip)) {
                        c3152.m7186();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f10226;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
        }
    }
}
