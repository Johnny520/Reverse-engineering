package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.TextView;
import android.window.C0991;
import androidx.activity.result.C0992;
import androidx.activity.result.C0994;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1013;
import com.github.megatronking.stringfog.annotation.C1016;
import com.google.android.material.button.C1025;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.transformation.C1045;
import io.fastkv.C1053;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: f7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0214f7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f1750a;

    /* JADX INFO: renamed from: b */
    public final TextView f1751b;

    /* JADX INFO: renamed from: c */
    public final Dialog f1752c;

    public /* synthetic */ ViewOnClickListenerC0214f7(TextView textView, Dialog dialog, int i) {
        String str;
        String str2;
        this.f1750a = i;
        this.f1751b = textView;
        this.f1752c = dialog;
        Double dValueOf = null;
        int iM2961 = C1012.m2961("ۥ۠ۧ");
        while (true) {
            switch (iM2961) {
                case 1751527:
                    break;
                case 1752492:
                    if (C0992.m2879() >= 0) {
                        if ((C1045.f5692 | (C1025.f5672 ^ (-2211))) >= 0) {
                            C1013.m2964();
                            str2 = "ۥ۠ۧ";
                        } else {
                            str2 = "ۧۥۢ";
                        }
                        iM2961 = C1016.m2975(str2);
                    }
                    break;
                case 1753511:
                    if ((C0994.f5641 | (C1056.f5703 - 4239)) >= 0) {
                        C1053.m3123();
                        iM2961 = C0991.m2876("۟۟۟");
                    } else {
                        iM2961 = C1013.m2965("ۥ۠ۧ");
                        continue;
                    }
                    break;
                case 1754442:
                    System.out.println(dValueOf);
                    iM2961 = C1037.m3059(C1056.m3134() >= 0 ? "ۧۡۤ" : "ۨۨۨ");
                    continue;
                case 1754564:
                    dValueOf = Double.valueOf(C1033.m3044("leXzjJCaMTlVAG2"));
                    if (C1012.f5659 <= 0) {
                        C1036.f5683 = 0;
                        str = "ۣۤ۠";
                    } else {
                        str = "ۧۡۤ";
                    }
                    iM2961 = C1031.m3036(str);
                    continue;
                case 1755624:
                    return;
            }
            iM2961 = C1058.m3140("ۨۨۨ");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00b5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r4) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnClickListenerC0214f7.onClick(android.view.View):void");
    }
}
