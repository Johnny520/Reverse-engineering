package lin.xposed.hook.javaplugin.view;

import android.widget.CompoundButton;
import androidx.core.view.C3075;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C3985;
import com.google.android.material.internal.InterfaceC3997;
import lin.xposed.hook.javaplugin.bean.PluginInfo;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6369 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15633;

    public /* synthetic */ C6369(Object obj, int i) {
        this.f15633 = i;
        this.f15632 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f15633;
        Object obj = this.f15632;
        switch (i) {
            case 0:
                PluginItemView.lambda$bindPluginInfoData$2((PluginInfo) obj, compoundButton, z);
                break;
            case 1:
                ((PluginItemView) obj).lambda$bindPluginInfoData$5(compoundButton, z);
                break;
            default:
                Chip chip = (Chip) obj;
                InterfaceC3997 interfaceC3997 = chip.f10567;
                if (interfaceC3997 != null) {
                    C3985 c3985 = (C3985) ((C3075) interfaceC3997).f6882;
                    if (!z ? c3985.m7731(chip, c3985.f10842) : c3985.m7735(chip)) {
                        c3985.m7732();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f10576;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
        }
    }
}
