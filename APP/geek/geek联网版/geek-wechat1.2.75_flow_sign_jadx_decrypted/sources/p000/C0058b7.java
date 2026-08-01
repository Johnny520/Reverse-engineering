package p000;

import android.app.Activity;
import android.app.C0986;
import android.window.C0991;
import androidx.activity.result.C0992;
import androidx.appcompat.widget.C1000;
import androidx.coordinatorlayout.widget.C1003;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.button.C1025;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.textfield.C1041;
import com.google.android.material.theme.C1042;
import com.google.android.material.transformation.C1046;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0058b7 extends t50 implements InterfaceC0935ym {

    /* JADX INFO: renamed from: e */
    public final int f687e;

    /* JADX INFO: renamed from: f */
    public int f688f;

    /* JADX INFO: renamed from: g */
    public final Activity f689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    public /* synthetic */ C0058b7(Activity activity, InterfaceC0814vd interfaceC0814vd, int i) {
        String str;
        super(interfaceC0814vd);
        this.f687e = i;
        this.f689g = activity;
        Double dDecode = null;
        int iM2856 = C0986.m2856("ۣۤۡ");
        while (true) {
            switch (iM2856) {
                case 56507:
                    System.out.println(dDecode);
                    iM2856 = (C1041.f5688 % C1025.f5672) + 1749225;
                    break;
                case 1749574:
                    str = "ۣۢۦ";
                    iM2856 = C1024.m3009(str);
                    break;
                case 1749576:
                    if (C1039.f5686 + (C0991.f5638 - 6543) < 0) {
                        iM2856 = C1046.m3095("ۣۤۡ");
                    } else {
                        C1046.m3094();
                        str = "ۢۢ۠";
                        iM2856 = C1024.m3009(str);
                    }
                    break;
                case 1749701:
                    break;
                case 1750688:
                    if (C1059.m3144() < 0) {
                        str = "ۣۢۦ";
                        iM2856 = C1024.m3009(str);
                    } else {
                        if (C1000.m2913() >= 0) {
                            C1037.f5684 = 61;
                        }
                        iM2856 = C0992.m2881("ۣۧ۠");
                    }
                    break;
                case 1754410:
                    dDecode = Double.decode(C1031.m3035("UOZJv24zqDCyMvsflFepJ3tmiv"));
                    if (C1003.f5650 < 0) {
                        str = "ۦۡ";
                        iM2856 = C1024.m3009(str);
                    } else {
                        C1042.m3080();
                        iM2856 = C1059.m3145("ۣۢ۟");
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0013 A[SYNTHETIC] */
    @Override // p000.t50
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.InterfaceC0814vd mo35a(p000.InterfaceC0814vd r4) {
        /*
            r3 = this;
            java.lang.String r0 = "۠ۡۧ"
            int r0 = com.ljx.wechatmod.auth.C1047.m3096(r0)
        L6:
            switch(r0) {
                case 1747718: goto La;
                case 1747775: goto L1e;
                case 1747866: goto L28;
                case 1748799: goto Lf;
                case 1751684: goto L42;
                case 1754625: goto L55;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = r3.f687e
            switch(r0) {
                case 0: goto L1e;
                default: goto Lf;
            }
        Lf:
            int r0 = androidx.legacy.content.C1012.f5659
            if (r0 > 0) goto L4b
            r0 = 29
            androidx.core.app.C1005.f5652 = r0
            java.lang.String r0 = "ۨۧ۟"
            int r0 = com.github.megatronking.stringfog.xor.C1018.m2984(r0)
            goto L6
        L1e:
            int r0 = com.google.android.material.sidesheet.C1039.f5686
            int r1 = com.github.megatronking.stringfog.annotation.C1017.f5664
            int r0 = r0 * r1
            r1 = 2051437(0x1f4d6d, float:2.874676E-39)
            r0 = r0 ^ r1
            goto L6
        L28:
            int r0 = androidx.startup.C1015.f5662
            int r1 = p000.C1058.f5705
            int r1 = r1 % (-8991)
            int r0 = r0 - r1
            if (r0 > 0) goto L38
            java.lang.String r0 = "ۥۥۨ"
            int r0 = com.google.android.material.carousel.C1027.m3021(r0)
            goto L6
        L38:
            int r0 = kotlinx.coroutines.internal.C1054.f5701
            int r1 = androidx.core.graphics.drawable.C1009.f5656
            int r0 = r0 / r1
            r1 = 1747716(0x1aab04, float:2.449072E-39)
            int r0 = r0 + r1
            goto L6
        L42:
            b7 r0 = new b7
            android.app.Activity r1 = r3.f689g
            r2 = 1
            r0.<init>(r1, r4, r2)
        L4a:
            return r0
        L4b:
            int r0 = com.google.android.material.carousel.C1028.f5675
            int r1 = androidx.appcompat.widget.C1000.f5647
            int r0 = r0 / r1
            r1 = 1751684(0x1aba84, float:2.454632E-39)
            int r0 = r0 + r1
            goto L6
        L55:
            b7 r0 = new b7
            android.app.Activity r1 = r3.f689g
            r2 = 0
            r0.<init>(r1, r4, r2)
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0058b7.mo35a(vd):vd");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x008b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097 A[SYNTHETIC] */
    @Override // p000.InterfaceC0935ym
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo36e(java.lang.Object r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0058b7.mo36e(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x031d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x039f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x054e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0547 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x03c6 A[SYNTHETIC] */
    @Override // p000.t50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo37g(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0058b7.mo37g(java.lang.Object):java.lang.Object");
    }
}
