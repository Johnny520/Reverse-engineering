package p000;

import android.animation.ValueAnimator;
import android.app.C0986;
import android.view.View;
import androidx.activity.C0995;
import androidx.appcompat.view.menu.C0998;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.core.widget.C1011;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.annotation.C1017;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1030;
import com.google.android.material.internal.C1038;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.textfield.C1041;

/* JADX INFO: renamed from: un */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0787un implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final int f4840a;

    /* JADX INFO: renamed from: b */
    public final View f4841b;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    public /* synthetic */ C0787un(View view, int i) {
        String str;
        this.f4840a = i;
        this.f4841b = view;
        String strM2957 = null;
        int iM2922 = C1003.m2922("ۧ۠ۢ");
        while (true) {
            switch (iM2922) {
                case 1748672:
                    break;
                case 1748771:
                    if (C1059.f5706 >= 0) {
                        C1026.f5673 = 21;
                        str = "ۣۨ۠";
                    } else {
                        str = "ۧ۠ۢ";
                    }
                    iM2922 = C1002.m2920(str);
                    break;
                case 1751652:
                    iM2922 = C1041.f5688 + C0986.f5633 + 1747296;
                    break;
                case 1753637:
                    System.out.println(strM2957);
                    iM2922 = C0998.f5645 - (C1024.f5671 + (-1347)) <= 0 ? C1040.m3072("ۦۦۥ") : (C1017.f5664 ^ C0995.f5642) + 1749540;
                    break;
                case 1754409:
                    if (C1030.m3031() < 0) {
                        iM2922 = C1041.f5688 + C0986.f5633 + 1747296;
                    } else {
                        if ((C1016.f5663 | (C1038.f5685 / 7885)) >= 0) {
                            C0995.f5642 = 57;
                        }
                        iM2922 = C1018.m2984("ۨۥۦ");
                    }
                    break;
                case 1755529:
                    strM2957 = C1011.m2957("bezLa");
                    str = "ۦۦۥ";
                    iM2922 = C1002.m2920(str);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0063. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e4 A[SYNTHETIC] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationUpdate(android.animation.ValueAnimator r11) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0787un.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
