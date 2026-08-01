package p000;

import android.app.Activity;
import android.app.C0986;
import android.app.Dialog;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.C1000;
import androidx.constraintlayout.widget.C1004;
import androidx.constraintlayout.widget.C1005;
import androidx.constraintlayout.widget.C1006;
import androidx.coordinatorlayout.widget.C1008;
import androidx.core.widget.C1011;
import androidx.emoji2.text.C1012;
import androidx.fragment.app.C1013;
import androidx.profileinstaller.C1016;
import androidx.profileinstaller.C1017;
import androidx.versionedparcelable.C1024;
import androidx.versionedparcelable.C1026;
import androidx.versionedparcelable.C1028;
import androidx.viewpager2.adapter.C1029;
import com.github.megatronking.stringfog.annotation.C1030;
import com.google.android.material.bottomsheet.C1037;
import com.google.android.material.carousel.C1040;
import com.google.android.material.chip.C1043;
import com.google.android.material.datepicker.C1045;
import com.ljx.wechatmod.auth.C1051;
import io.fastkv.C1054;

/* JADX INFO: renamed from: bt */
/* JADX INFO: loaded from: classes.dex */
public final class C0080bt extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final Activity f828a;

    /* JADX INFO: renamed from: b */
    public final Dialog f829b;

    /* JADX INFO: renamed from: c */
    public final Dialog f830c;

    public C0080bt(Activity activity, Dialog dialog, Dialog dialog2) {
        this.f828a = activity;
        this.f829b = dialog;
        this.f830c = dialog2;
        Integer numDecode = null;
        int iM3108 = C1051.m3108("ۧۨۥ");
        while (true) {
            switch (iM3108) {
                case 1746785:
                    break;
                case 1746944:
                    numDecode = Integer.decode(C1012.m2953("IJ8f5RwwIut"));
                    iM3108 = (C1011.f5655 % C1054.f5698) ^ (-1749009);
                    continue;
                case 1747656:
                    if (C1006.f5650 * (C1000.f5644 / (-1827)) != 0) {
                        C1005.m2923();
                        iM3108 = C1004.m2919("ۧ۟۟");
                    } else {
                        iM3108 = (C1005.f5649 - C1030.f5674) ^ (-1754914);
                        continue;
                    }
                    break;
                case 1749794:
                    System.out.println(numDecode);
                    if ((C1037.f5681 ^ (C1043.f5687 ^ (-1749))) >= 0) {
                        C1028.f5672 = 61;
                        iM3108 = C0986.m2848("ۧۨۥ");
                    } else {
                        iM3108 = C1017.f5661 + C1045.f5689 + 1751544;
                        continue;
                    }
                    break;
                case 1750721:
                    return;
                case 1754660:
                    if (C1013.m2957() <= 0) {
                        iM3108 = (C1008.f5652 % C1043.f5687) + 1747309;
                    }
                    break;
            }
            if (C1016.f5660 * C1024.f5668 * 4418 >= 0) {
                C1040.f5684 = 25;
                iM3108 = C1030.m3021("ۢۢۥ");
            } else {
                iM3108 = (C1026.f5670 * C1029.f5673) ^ 1579097;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0080bt.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
