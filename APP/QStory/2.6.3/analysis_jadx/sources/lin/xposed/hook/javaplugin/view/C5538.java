package lin.xposed.hook.javaplugin.view;

import android.widget.CompoundButton;
import androidx.core.view.C2242;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C3153;
import com.google.android.material.internal.InterfaceC3165;
import lin.xposed.hook.javaplugin.bean.PluginInfo;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5538 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15288;

    public /* synthetic */ C5538(Object obj, int i) {
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
                InterfaceC3165 interfaceC3165 = chip.f10222;
                if (interfaceC3165 != null) {
                    C3153 c3153 = (C3153) ((C2242) interfaceC3165).f6537;
                    if (!z ? c3153.m7172(chip, c3153.f10497) : c3153.m7176(chip)) {
                        c3153.m7173();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f10231;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
        }
    }
}
