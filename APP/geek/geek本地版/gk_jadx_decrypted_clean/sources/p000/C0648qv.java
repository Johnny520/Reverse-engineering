package p000;

import android.support.v4.graphics.drawable.C0992;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.activity.C0996;
import androidx.profileinstaller.C1017;
import androidx.recyclerview.widget.C1019;
import androidx.versionedparcelable.C1025;
import androidx.viewpager2.adapter.C1029;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.xor.C1032;
import com.google.android.material.behavior.C1036;
import com.google.android.material.chip.C1042;
import com.google.android.material.datepicker.C1044;
import com.google.android.material.floatingactionbutton.C1046;
import com.google.android.material.internal.C1047;
import java.util.ArrayList;

/* JADX INFO: renamed from: qv */
/* JADX INFO: loaded from: classes.dex */
public final class C0648qv implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final i00 f4121a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f4122b;

    /* JADX INFO: renamed from: c */
    public final g00 f4123c;

    /* JADX INFO: renamed from: d */
    public final i00 f4124d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0648qv(p000.g00 r4, p000.i00 r5, p000.i00 r6, java.util.ArrayList r7) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0648qv.<init>(g00, i00, i00, java.util.ArrayList):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        int iM3079 = C1044.m3079("ۣۧۦ");
        String str3 = null;
        i00 i00Var = null;
        while (true) {
            switch (iM3079) {
                case 56359:
                    AbstractC0796uv.m2477g(this.f4123c, i00Var, this.f4124d, this.f4122b);
                    if ((C1032.f5676 ^ (C1025.f5669 / 5549)) > 0) {
                        iM3079 = (C0992.f5636 % C0992.f5636) ^ 1747838;
                    } else {
                        C1019.m2981();
                        str = "ۡۨ";
                        iM3079 = C1046.m3086(str);
                    }
                    break;
                case 56443:
                    i00Var.f2326b = str3;
                    str2 = "ۡۨ";
                    iM3079 = C0996.m2889(str2);
                    break;
                case 1747838:
                    break;
                case 1748617:
                    iM3079 = C1032.m3031(C1017.m2970() <= 0 ? "ۢۢ" : "ۣۧۦ");
                    break;
                case 1749730:
                    i00Var = this.f4121a;
                    if (C1029.m3018() < 0) {
                        str = "ۤ۟";
                        iM3079 = C1046.m3086(str);
                    } else {
                        str2 = "ۣۧۦ";
                        iM3079 = C0996.m2889(str2);
                    }
                    break;
                case 1750786:
                    String strValueOf = String.valueOf(editable);
                    if (C1047.f5691 <= 0) {
                        iM3079 = C1042.m3071("۠ۥۣ");
                        str3 = strValueOf;
                    } else {
                        iM3079 = 1749723 + (C1036.f5680 % C1033.f5677);
                        str3 = strValueOf;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0039 A[SYNTHETIC] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void beforeTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "ۥۦۥ"
            int r2 = io.fastkv.C1054.m3117(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 56326: goto Lc;
                case 1750627: goto L6c;
                case 1752454: goto L33;
                case 1752676: goto Ld;
                case 1753604: goto L89;
                case 1755522: goto L50;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            return
        Ld:
            int r0 = com.github.megatronking.stringfog.xor.C1032.m3030()
            if (r0 > 0) goto L33
            int r0 = androidx.savedstate.C1021.f5665
            int r2 = androidx.core.content.C1009.f5653
            int r2 = r2 + (-1318)
            r0 = r0 | r2
            if (r0 < 0) goto L28
            r0 = 23
            androidx.savedstate.C1020.f5664 = r0
            java.lang.String r0 = "ۥۦۥ"
            int r0 = com.google.android.material.carousel.C1039.m3058(r0)
            r2 = r0
            goto L8
        L28:
            int r0 = android.app.C0989.f5633
            int r2 = androidx.profileinstaller.C1016.f5660
            int r0 = r0 - r2
            r2 = 1750228(0x1ab4d4, float:2.452592E-39)
            r0 = r0 ^ r2
            r2 = r0
            goto L8
        L33:
            int r0 = androidx.versionedparcelable.C1027.m3013()
            if (r0 > 0) goto L45
            r0 = 84
            androidx.versionedparcelable.C1025.f5669 = r0
            java.lang.String r0 = "ۦ۠ۨ"
        L3f:
            int r0 = androidx.constraintlayout.widget.C1005.m2925(r0)
            r2 = r0
            goto L8
        L45:
            int r0 = p000.C1058.f5702
            int r2 = android.app.C0987.f5631
            r0 = r0 ^ r2
            r2 = 57024(0xdec0, float:7.9908E-41)
            r0 = r0 ^ r2
            r2 = r0
            goto L8
        L50:
            int r0 = com.google.android.material.appbar.C1035.f5679
            int r2 = androidx.appcompat.widget.C1001.f5645
            r2 = r2 | 7703(0x1e17, float:1.0794E-41)
            r0 = r0 | r2
            if (r0 < 0) goto L61
            java.lang.String r0 = "ۧۥۣ"
            int r0 = p000.C1058.m3133(r0)
            r2 = r0
            goto L8
        L61:
            int r0 = androidx.activity.C0996.f5640
            int r2 = kotlinx.coroutines.C1056.f5700
            int r0 = r0 + r2
            r2 = 1752842(0x1abf0a, float:2.456255E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L6c:
            java.lang.String r0 = "BjZiBXXMISGnPJy4vJl9PHLL2VX0U"
            java.lang.String r1 = androidx.savedstate.C1022.m2992(r0)
            int r0 = com.ljx.wechatmod.auth.C1051.f5695
            int r2 = androidx.appcompat.widget.C1000.f5644
            int r2 = r2 + (-825)
            r0 = r0 ^ r2
            if (r0 > 0) goto L86
            com.ljx.wechatmod.hook.C1052.m3110()
            java.lang.String r0 = "ۨۥ۟"
        L80:
            int r0 = android.app.C0987.m2851(r0)
            r2 = r0
            goto L8
        L86:
            java.lang.String r0 = "ۦۥۣ"
            goto L80
        L89:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = android.app.C0989.f5633
            if (r0 > 0) goto L9b
            java.lang.String r0 = "۠ۦ"
            int r0 = android.support.v4.graphics.drawable.C0992.m2872(r0)
            r2 = r0
            goto L8
        L9b:
            java.lang.String r0 = "۠ۦ"
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0648qv.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045 A[SYNTHETIC] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "ۡۢ۠"
            int r1 = androidx.constraintlayout.widget.C1004.m2919(r1)
        L7:
            switch(r1) {
                case 56448: goto Lb;
                case 1748703: goto L65;
                case 1750538: goto L3c;
                case 1750780: goto L1c;
                case 1751740: goto L7f;
                case 1753663: goto L5a;
                default: goto La;
            }
        La:
            goto L7
        Lb:
            int r1 = androidx.versionedparcelable.C1024.f5668
            if (r1 < 0) goto L19
            com.github.megatronking.stringfog.annotation.C1030.m3023()
            java.lang.String r1 = "ۦۥۨ"
        L14:
            int r1 = com.github.megatronking.stringfog.annotation.C1030.m3021(r1)
            goto L7
        L19:
            java.lang.String r1 = "ۡۢ۠"
            goto L14
        L1c:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = androidx.profileinstaller.C1016.m2967()
            if (r1 < 0) goto L32
            r1 = 73
            androidx.appcompat.widget.C1002.f5646 = r1
        L2b:
            java.lang.String r1 = "ۣۧ۠"
            int r1 = android.support.v4.graphics.drawable.C0991.m2869(r1)
            goto L7
        L32:
            int r1 = androidx.savedstate.C1022.f5666
            int r2 = com.github.megatronking.stringfog.xor.C1032.f5676
            int r1 = r1 + r2
            r2 = 1750491(0x1ab5db, float:2.45296E-39)
            int r1 = r1 + r2
            goto L7
        L3c:
            int r1 = com.github.megatronking.stringfog.annotation.C1030.f5674
            int r2 = com.google.android.material.theme.C1049.f5693
            int r2 = r2 % 3322
            int r1 = r1 + r2
            if (r1 > 0) goto L50
            r1 = 26
            androidx.constraintlayout.widget.C1004.f5648 = r1
            java.lang.String r1 = "ۤۧۤ"
        L4b:
            int r1 = com.github.megatronking.stringfog.xor.C1032.m3031(r1)
            goto L7
        L50:
            int r1 = com.google.android.material.chip.C1042.f5686
            int r2 = androidx.activity.result.C0994.f5638
            r1 = r1 | r2
            r2 = -1751997(0xffffffffffe54443, float:NaN)
            r1 = r1 ^ r2
            goto L7
        L5a:
            java.lang.String r0 = "eoStiZvq7hitXPzwLWzVyOC"
            java.lang.String r0 = androidx.profileinstaller.C1017.m2971(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            goto L2b
        L65:
            int r1 = androidx.core.widget.C1011.m2949()
            if (r1 < 0) goto L3c
            int r1 = androidx.savedstate.C1021.m2989()
            if (r1 > 0) goto L7c
            r1 = 38
            com.google.android.material.appbar.C1035.f5679 = r1
            java.lang.String r1 = "ۤۤ"
            int r1 = com.google.android.material.datepicker.C1045.m3084(r1)
            goto L7
        L7c:
            java.lang.String r1 = "ۦۧ۠"
            goto L4b
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0648qv.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
