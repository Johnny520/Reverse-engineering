package p000;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.graphics.drawable.C0991;
import android.view.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.widget.C1001;
import androidx.constraintlayout.helper.widget.C1003;
import androidx.constraintlayout.widget.C1004;
import androidx.coordinatorlayout.widget.C1007;
import androidx.versionedparcelable.C1025;
import androidx.versionedparcelable.C1026;
import com.github.megatronking.stringfog.annotation.C1030;
import com.google.android.material.chip.C1042;
import com.google.android.material.chip.C1043;
import com.google.android.material.datepicker.C1044;
import com.google.android.material.theme.C1049;
import com.ljx.wechatmod.auth.C1051;
import com.ljx.wechatmod.p001ui.C1053;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: tv */
/* JADX INFO: loaded from: classes.dex */
public final class C0759tv extends m50 implements InterfaceC0861wm {

    /* JADX INFO: renamed from: e */
    public int f4620e;

    /* JADX INFO: renamed from: f */
    public final Dialog f4621f;

    /* JADX INFO: renamed from: g */
    public final Context f4622g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashSet f4623h;

    /* JADX INFO: renamed from: i */
    public final ClassLoader f4624i;

    /* JADX INFO: renamed from: j */
    public final String f4625j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0759tv(android.app.Dialog r4, android.content.Context r5, java.util.LinkedHashSet r6, java.lang.ClassLoader r7, java.lang.String r8, p000.InterfaceC0444ld r9) {
        /*
            r3 = this;
            r3.f4621f = r4
            r3.f4622g = r5
            r3.f4623h = r6
            r3.f4624i = r7
            r3.f4625j = r8
            r3.<init>(r9)
            r1 = 0
            java.lang.String r0 = "۠ۢ۠"
            int r0 = androidx.constraintlayout.widget.C1005.m2925(r0)
        L14:
            switch(r0) {
                case 1747742: goto L18;
                case 1749637: goto L34;
                case 1750629: goto L25;
                case 1751621: goto L50;
                case 1754506: goto L57;
                case 1755466: goto L48;
                default: goto L17;
            }
        L17:
            goto L14
        L18:
            int r0 = com.github.megatronking.stringfog.annotation.C1030.m3023()
            if (r0 < 0) goto L25
            java.lang.String r0 = "ۢۡۤ"
        L20:
            int r0 = androidx.activity.C0996.m2889(r0)
            goto L14
        L25:
            int r0 = com.google.android.material.theme.C1050.m3102()
            if (r0 < 0) goto L31
            com.ljx.wechatmod.hook.C1052.m3110()
            java.lang.String r0 = "ۣۨۧ"
            goto L20
        L31:
            java.lang.String r0 = "ۣۧۦ"
            goto L20
        L34:
            java.lang.String r0 = "Sd6B9FAhJhJSduoAbrSfk2Tz2"
            java.lang.String r0 = com.google.android.material.behavior.C1036.m3046(r0)
            java.lang.Long r1 = java.lang.Long.decode(r0)
            int r0 = com.google.android.material.bottomsheet.C1037.f5681
            int r2 = android.app.C0986.f5630
            int r0 = r0 * r2
            r2 = 1850692(0x1c3d44, float:2.593372E-39)
            int r0 = r0 + r2
            goto L14
        L48:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            java.lang.String r0 = "ۣۧۦ"
            goto L20
        L50:
            java.lang.String r0 = "۠ۢ۠"
            int r0 = androidx.emoji2.text.C1012.m2951(r0)
            goto L14
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0759tv.<init>(android.app.Dialog, android.content.Context, java.util.LinkedHashSet, java.lang.ClassLoader, java.lang.String, ld):void");
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final InterfaceC0444ld mo471a(InterfaceC0444ld interfaceC0444ld) {
        String str;
        int iM3021 = C1030.m3021("ۧ۠ۦ");
        ClassLoader classLoader = null;
        String str2 = null;
        while (true) {
            switch (iM3021) {
                case 1748866:
                    str2 = this.f4625j;
                    if (C0991.m2866() >= 0) {
                        iM3021 = C1026.m3006("ۡۧۨ");
                    } else {
                        iM3021 = (C1049.f5693 | C1030.f5674) + 1749278;
                        continue;
                    }
                    break;
                case 1749641:
                    return new C0759tv(this.f4621f, this.f4622g, this.f4623h, classLoader, str2, interfaceC0444ld);
                case 1752674:
                    if (C1025.f5669 / (C1007.f5651 * (-6847)) == 0) {
                        iM3021 = (C1043.f5687 % C1053.f5697) + 1754541;
                    } else {
                        C1057.f5701 = 47;
                        str = "ۣۢۡ";
                    }
                    break;
                case 1754413:
                    classLoader = this.f4624i;
                    str = "ۡۧۨ";
                    break;
            }
            iM3021 = C1001.m2906(str);
        }
    }

    @Override // p000.InterfaceC0861wm
    /* JADX INFO: renamed from: e */
    public final Object mo472e(Object obj, Object obj2) {
        int iM2916 = C1003.m2916("ۣۧۡ");
        while (true) {
            switch (iM2916) {
                case 1751560:
                    return ((C0759tv) mo471a((InterfaceC0444ld) obj2)).mo473g(C0819vh.f4855n);
                case 1753663:
                    if (C0993.m2877() < 0) {
                        iM2916 = (C1044.f5688 * C1053.f5697) + 1884401;
                    } else {
                        C1042.f5686 = 66;
                        iM2916 = C0994.m2881("ۣۢۦ");
                    }
                    break;
                case 1754441:
                    if (C0993.f5637 > 0) {
                        iM2916 = (C1051.f5695 | C1049.f5693) ^ (-1751328);
                    } else {
                        C0991.m2866();
                        iM2916 = C1004.m2919("ۦۧ۠");
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x024f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0243 A[SYNTHETIC] */
    @Override // p000.m50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo473g(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0759tv.mo473g(java.lang.Object):java.lang.Object");
    }
}
