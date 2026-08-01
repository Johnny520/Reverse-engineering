package p000;

import android.content.DialogInterface;
import android.window.C0989;
import androidx.legacy.content.C1013;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1016;
import com.google.android.material.appbar.C1020;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1032;
import com.ljx.wechatmod.hook.C1049;
import io.fastkv.C1053;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0008a7 implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int iM3104 = C1049.m3104("ۦ۠");
        while (true) {
            switch (iM3104) {
                case 56506:
                    dialogInterface.dismiss();
                    iM3104 = C1020.f5667 / (C1030.f5677 ^ 5352) == 0 ? (C0989.f5636 | C1031.f5678) + 1752499 : C1032.m3039("ۦ۠");
                    break;
                case 1753451:
                    return;
                case 1754624:
                    if (C1019.f5666 + (C1032.f5679 ^ 9767) < 0) {
                        iM3104 = (C1013.f5660 - C1026.f5673) + 55963;
                    } else {
                        C1053.f5700 = 19;
                        iM3104 = C1016.m2975("ۢۨۤ");
                    }
                    break;
            }
        }
    }
}
