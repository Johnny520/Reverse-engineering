package p000;

import android.app.C0986;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.C0993;
import android.widget.LinearLayout;
import androidx.activity.C0997;
import androidx.core.content.C1010;
import androidx.lifecycle.C1015;
import androidx.recyclerview.widget.C1018;
import androidx.startup.C1023;
import androidx.versionedparcelable.C1024;
import androidx.versionedparcelable.C1028;
import com.google.android.material.appbar.C1035;
import com.google.android.material.carousel.C1041;
import com.google.android.material.internal.C1047;
import com.google.android.material.theme.C1049;

/* JADX INFO: renamed from: b6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC0057b6 implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    public final int f749a;

    /* JADX INFO: renamed from: b */
    public final Dialog f750b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f751c;

    public /* synthetic */ DialogInterfaceOnShowListenerC0057b6(int i, Dialog dialog, LinearLayout linearLayout) {
        String str;
        this.f749a = i;
        this.f750b = dialog;
        this.f751c = linearLayout;
        int iM2995 = C1023.m2995("ۣ۟ۨ");
        long j = 0;
        while (true) {
            switch (iM2995) {
                case 56289:
                    long j2 = Long.parseLong(C1035.m3041("SQ9mfwfuXcQVBOf1PAtuI"));
                    iM2995 = (C1028.f5672 ^ C1041.f5685) + 1746390;
                    j = j2;
                    continue;
                case 1746696:
                    System.out.println(j);
                    if (C1047.f5691 % (C1024.f5668 | (-6963)) <= 0) {
                        C1015.f5659 = 88;
                        str = "۟۟ۨ";
                    } else {
                        str = "۟ۨۢ";
                    }
                    iM2995 = C1015.m2962(str);
                    continue;
                case 1746969:
                    return;
                case 1750532:
                    break;
                case 1750540:
                    if (C1049.m3098() <= 0) {
                        iM2995 = C1018.m2974() >= 0 ? C1024.m2999("ۣ۟۠") : (C1010.f5654 / C0986.f5630) + 56289;
                    }
                    break;
                case 1750726:
                    iM2995 = C1047.m3091(C0997.m2890() <= 0 ? "ۨۢۥ" : "ۣ۟ۨ");
                    continue;
            }
            iM2995 = C0993.m2874("۟ۨۢ");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x01ed. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a8 A[SYNTHETIC] */
    @Override // android.content.DialogInterface.OnShowListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShow(android.content.DialogInterface r25) {
        /*
            Method dump skipped, instruction units count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DialogInterfaceOnShowListenerC0057b6.onShow(android.content.DialogInterface):void");
    }
}
