package androidx.compose.foundation.text.selection;

import androidx.activity.C0016;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.C0965;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.contextmenu.modifier.AbstractC0825;
import androidx.compose.foundation.text.contextmenu.modifier.C0823;
import androidx.compose.foundation.text.contextmenu.modifier.C0824;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.focus.C1468;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.platform.InterfaceC1874;
import androidx.compose.ui.platform.InterfaceC1921;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2054;
import androidx.compose.ui.text.C2062;
import androidx.compose.ui.text.C2065;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.InterfaceC2022;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5400;
import p000.AbstractC6087;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p108.InterfaceC7316;
import p112.C7327;
import p112.C7328;
import p212.C7950;
import p232.C8064;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0882 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f2480;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C0886 f2481;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C0881 f2482;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C0824 f2483;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC6542 f2484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0943 f2486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0965 f2489;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f2490;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f2491;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C2035 f2492;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC1395 f2493;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2013 f2494;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C8064 f2495;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f2496;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f2497;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f2498;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1395 f2499;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public long f2500;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2035 f2501;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC5400 f2502;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC1921 f2503;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC7316 f2504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C1468 f2505;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC0917 f2506;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC1874 f2507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2022 f2488 = AbstractC0983.f2850;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC6557 f2487 = new C0016(28);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f2485 = AbstractC1367.m2465(new C2013(7, 0, (String) null));

    public C0882(C0965 c0965) {
        this.f2489 = c0965;
        Boolean bool = Boolean.TRUE;
        this.f2497 = AbstractC1367.m2465(bool);
        this.f2496 = AbstractC1367.m2465(bool);
        this.f2500 = 0L;
        this.f2498 = 0L;
        this.f2499 = AbstractC1367.m2465(null);
        this.f2491 = AbstractC1367.m2465(null);
        this.f2490 = -1;
        this.f2494 = new C2013(7, 0L, (String) null);
        this.f2493 = AbstractC1367.m2465(Boolean.FALSE);
        C0824 c0824 = new C0824();
        c0824.f2346 = ToolbarHandlerState.Uninitialized;
        this.f2483 = c0824;
        this.f2482 = new C0881(this);
        this.f2481 = new C0886(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ea  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m1739(androidx.compose.foundation.text.selection.C0882 r21, androidx.compose.ui.text.input.C2013 r22, long r23, boolean r25, boolean r26, androidx.collection.C0276 r27, boolean r28, p108.C7315 r29) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0882.m1739(androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪, androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏, long, boolean, boolean, androidx.collection.飘花落叶言子楪苏世哲兰, boolean, 飘花落叶言子世兰楪哲苏.飘花落叶言子楪世苏兰哲):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1740(C0882 c0882, C2035 c2035) {
        C2068 c2068M1750;
        String str;
        InterfaceC5400 interfaceC5400;
        if (c2035 == null) {
            return;
        }
        long j = c2035.f6003;
        InterfaceC0917 interfaceC0917 = c0882.f2506;
        if (interfaceC0917 == null || (c2068M1750 = c0882.m1750()) == null || (str = c2068M1750.f6128) == null) {
            return;
        }
        InterfaceC2022 interfaceC2022 = c0882.f2488;
        int i = (int) (j >> 32);
        interfaceC2022.mo1872(i);
        int i2 = (int) (j & 4294967295L);
        interfaceC2022.mo1872(i2);
        long jM3760 = AbstractC2048.m3760(i, i2);
        if (str.length() <= 0 || C2035.m3742(jM3760) || (interfaceC5400 = c0882.f2502) == null) {
            return;
        }
        AbstractC5398.m10473(interfaceC5400, null, null, new TextFieldSelectionManager$maybeSuggestSelection$1(interfaceC0917, str, jM3760, c2035, c0882, interfaceC2022, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Pair m1741(C0882 c0882) {
        String str;
        C2035 c2035;
        C2068 c2068M1750 = c0882.m1750();
        if (c2068M1750 == null || (str = c2068M1750.f6128) == null || (c2035 = c0882.f2492) == null) {
            return null;
        }
        long j = c2035.f6003;
        int i = (int) (j >> 32);
        c0882.f2488.mo1872(i);
        int i2 = (int) (j & 4294967295L);
        c0882.f2488.mo1872(i2);
        return new Pair(str, new C2035(AbstractC2048.m3760(i, i2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C2013 m1742(C2068 c2068, long j) {
        return new C2013(c2068, j, (C2035) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m1743(boolean z) {
        C0943 c0943 = this.f2486;
        if (c0943 != null) {
            ((AbstractC1347) c0943.f2685).setValue(Boolean.valueOf(z));
        }
        if (z) {
            m1745();
        } else {
            m1753();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1744(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1 r0 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪 r4 = (androidx.compose.foundation.text.selection.C0882) r4
            kotlin.AbstractC5184.m10206(r5)
            goto L5d
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5184.m10206(r5)
            androidx.compose.ui.platform.飘花落叶言子苏楪兰世哲 r5 = r4.f2503
            if (r5 == 0) goto L69
            r0.L$0 = r4
            r0.label = r3
            androidx.compose.ui.platform.飘花落叶言子楪苏哲世兰 r5 = (androidx.compose.ui.platform.C1899) r5
            androidx.compose.ui.platform.飘花落叶言子楪苏哲兰世 r5 = r5.f5565
            android.content.ClipboardManager r5 = r5.m3584()
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L55
            java.lang.String r2 = "text/*"
            boolean r5 = r5.hasMimeType(r2)
            if (r5 != r3) goto L55
            goto L56
        L55:
            r3 = r0
        L56:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r4 = r4.f2493
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r4 = (androidx.compose.runtime.AbstractC1347) r4
            r4.setValue(r5)
        L69:
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5175.f14739
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0882.m1744(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (((java.lang.Boolean) ((androidx.compose.runtime.AbstractC1347) r3.f2678).getValue()).booleanValue() == false) goto L18;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1745() {
        /*
            r4 = this;
            androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰 r0 = androidx.compose.runtime.snapshots.AbstractC1274.m2221()
            if (r0 == 0) goto Lb
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r1 = r0.mo2193()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰 r2 = androidx.compose.runtime.snapshots.AbstractC1274.m2233(r0)
            boolean r3 = r4.m1757()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            androidx.compose.foundation.text.飘花落叶言子世兰苏楪哲 r3 = r4.f2486     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L2b
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r3 = r3.f2678     // Catch: java.lang.Throwable -> L34
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r3 = (androidx.compose.runtime.AbstractC1347) r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L34
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L2b
            goto L36
        L2b:
            androidx.compose.runtime.snapshots.AbstractC1274.m2227(r0, r2, r1)
            androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰哲世 r4 = r4.f2483
            r4.m1632()
            return
        L34:
            r4 = move-exception
            goto L3a
        L36:
            androidx.compose.runtime.snapshots.AbstractC1274.m2227(r0, r2, r1)
            return
        L3a:
            androidx.compose.runtime.snapshots.AbstractC1274.m2227(r0, r2, r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0882.m1745():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m1746() {
        return m1760() && ((Boolean) ((AbstractC1347) this.f2493).getValue()).booleanValue() && this.f2503 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m1747() {
        return (C2035.m3742(m1749().f5945) || !m1760() || this.f2503 == null) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m1748() {
        return m1760() && C2035.m3742(m1749().f5945);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2013 m1749() {
        return (C2013) ((AbstractC1347) this.f2485).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2068 m1750() {
        C0943 c0943 = this.f2486;
        if (c0943 != null) {
            return c0943.f2669.f2955;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m1751() {
        C2013 c2013M1742 = m1742(m1749().f5946, AbstractC2048.m3760(0, m1749().f5946.f6128.length()));
        this.f2487.invoke(c2013M1742);
        long j = c2013M1742.f5945;
        this.f2492 = new C2035(j);
        this.f2494 = C2013.m3705(this.f2494, null, j, 5);
        m1764(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m1752(HandleState handleState) {
        C0943 c0943 = this.f2486;
        if (c0943 != null) {
            if (c0943.m1858() == handleState) {
                c0943 = null;
            }
            if (c0943 != null) {
                ((AbstractC1347) c0943.f2684).setValue(handleState);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m1753() {
        C5416 c5416;
        C0823 c0823 = this.f2483.f2347;
        if (c0823 == null || (c5416 = c0823.f2341) == null) {
            return;
        }
        c5416.mo10252(null);
        c0823.f2341 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m1754() {
        InterfaceC5400 interfaceC5400 = this.f2502;
        if (interfaceC5400 != null) {
            AbstractC5398.m10473(interfaceC5400, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$paste$1(this, null), 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC2129 m1755() {
        if (!m1757()) {
            return C2125.f6275;
        }
        return AbstractC0825.m1633(AbstractC0825.m1634(new TextFieldSelectionManager$contextMenuAreaModifier$1(this, null)), this.f2483, new TextFieldSelectionManager$contextMenuAreaModifier$2(this, null), new TextFieldSelectionManager$contextMenuAreaModifier$3(this, null), new C0914(this, 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7327 m1756() {
        char c;
        long j;
        float fIntBitsToFloat;
        InterfaceC1695 interfaceC1695M1856;
        C2033 c2033;
        InterfaceC1695 interfaceC1695M18562;
        C2033 c20332;
        InterfaceC1695 interfaceC1695M18563;
        InterfaceC1695 interfaceC1695M18564;
        C0943 c0943 = this.f2486;
        if (c0943 != null) {
            if (c0943.f2681) {
                c0943 = null;
            }
            if (c0943 != null) {
                InterfaceC2022 interfaceC2022 = this.f2488;
                long j2 = m1749().f5945;
                int i = C2035.f6001;
                int i2 = (int) (j2 >> 32);
                interfaceC2022.mo1872(i2);
                InterfaceC2022 interfaceC20222 = this.f2488;
                int i3 = (int) (m1749().f5945 & 4294967295L);
                interfaceC20222.mo1872(i3);
                C0943 c09432 = this.f2486;
                long jMo3066 = 0;
                long jMo30662 = (c09432 == null || (interfaceC1695M18564 = c09432.m1856()) == null) ? 0L : interfaceC1695M18564.mo3066(m1758(true));
                C0943 c09433 = this.f2486;
                if (c09433 != null && (interfaceC1695M18563 = c09433.m1856()) != null) {
                    jMo3066 = interfaceC1695M18563.mo3066(m1758(false));
                }
                C0943 c09434 = this.f2486;
                float fIntBitsToFloat2 = 0.0f;
                if (c09434 == null || (interfaceC1695M18562 = c09434.m1856()) == null) {
                    c = ' ';
                    j = jMo3066;
                    fIntBitsToFloat = 0.0f;
                } else {
                    C0963 c0963M1855 = c0943.m1855();
                    c = ' ';
                    j = jMo3066;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1695M18562.mo3066((((long) Float.floatToRawIntBits((c0963M1855 == null || (c20332 = c0963M1855.f2744) == null) ? 0.0f : c20332.m3733(i2).f19544)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                }
                C0943 c09435 = this.f2486;
                if (c09435 != null && (interfaceC1695M1856 = c09435.m1856()) != null) {
                    C0963 c0963M18552 = c0943.m1855();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1695M1856.mo3066((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits((c0963M18552 == null || (c2033 = c0963M18552.f2744) == null) ? 0.0f : c2033.m3733(i3).f19544)) & 4294967295L)) & 4294967295L));
                }
                int i4 = (int) (jMo30662 >> c);
                int i5 = (int) (j >> c);
                return new C7327(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), (c0943.f2669.f2957.mo1246() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jMo30662 & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
            }
        }
        return C7327.f19541;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m1757() {
        return ((Boolean) ((AbstractC1347) this.f2496).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long m1758(boolean z) {
        C0963 c0963M1855;
        C2033 c2033;
        long j;
        C0943 c0943 = this.f2486;
        if (c0943 != null && (c0963M1855 = c0943.m1855()) != null && (c2033 = c0963M1855.f2744) != null) {
            C2062 c2062 = c2033.f5989;
            C2068 c2068M1750 = m1750();
            if (c2068M1750 != null) {
                if (AbstractC4394.m8917(c2068M1750.f6128, c2033.f5990.f5996.f6128)) {
                    C2013 c2013M1749 = m1749();
                    if (z) {
                        long j2 = c2013M1749.f5945;
                        int i = C2035.f6001;
                        j = j2 >> 32;
                    } else {
                        long j3 = c2013M1749.f5945;
                        int i2 = C2035.f6001;
                        j = j3 & 4294967295L;
                    }
                    int i3 = (int) j;
                    this.f2488.mo1872(i3);
                    boolean zM3746 = C2035.m3746(m1749().f5945);
                    long j4 = c2033.f5988;
                    int iM3778 = c2062.m3778(i3);
                    if (iM3778 >= c2062.f6099) {
                        return 9205357640488583168L;
                    }
                    boolean z2 = c2033.m3735(((!z || zM3746) && (z || !zM3746)) ? Math.max(i3 + (-1), 0) : i3) == c2033.m3736(i3);
                    c2062.m3786(i3);
                    int length = ((C2068) c2062.f6104.f3619).f6128.length();
                    ArrayList arrayList = c2062.f6105;
                    C2065 c2065 = (C2065) arrayList.get(i3 == length ? AbstractC8189.m13673(arrayList) : AbstractC2048.m3758(i3, arrayList));
                    C2054 c2054 = c2065.f6121;
                    int iM3788 = c2065.m3788(i3);
                    C7950 c7950 = c2054.f6085;
                    return (((long) Float.floatToRawIntBits(AbstractC6087.m11419(c2062.m3780(iM3778), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC6087.m11419(z2 ? c7950.m13417(iM3788, false) : c7950.m13419(iM3788, false), 0.0f, (int) (j4 >> 32)))) << 32);
                }
            }
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C7328 m1759() {
        return (C7328) ((AbstractC1347) this.f2491).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m1760() {
        return ((Boolean) ((AbstractC1347) this.f2497).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C5416 m1761(boolean z) {
        InterfaceC5400 interfaceC5400 = this.f2502;
        if (interfaceC5400 != null) {
            return AbstractC5398.m10473(interfaceC5400, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, z, null), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m1762() {
        return C2035.m3741(m1749().f5945) != m1749().f5946.f6128.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1763(C7328 c7328) {
        int iM3740;
        if (!C2035.m3742(m1749().f5945)) {
            C0943 c0943 = this.f2486;
            C0963 c0963M1855 = c0943 != null ? c0943.m1855() : null;
            if (c7328 == null || c0963M1855 == null) {
                iM3740 = C2035.m3740(m1749().f5945);
            } else {
                InterfaceC2022 interfaceC2022 = this.f2488;
                iM3740 = c0963M1855.m1868(c7328.f19546, true);
                interfaceC2022.mo1873(iM3740);
            }
            C2013 c2013M3705 = C2013.m3705(m1749(), null, AbstractC2048.m3760(iM3740, iM3740), 5);
            this.f2487.invoke(c2013M3705);
            this.f2492 = new C2035(c2013M3705.f5945);
        }
        m1752((c7328 == null || m1749().f5946.f6128.length() <= 0) ? HandleState.None : HandleState.Cursor);
        m1743(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m1764(boolean z) {
        C1468 c1468;
        C0943 c0943 = this.f2486;
        if (c0943 != null && !c0943.m1857() && (c1468 = this.f2505) != null) {
            C1468.m2622(c1468);
        }
        this.f2494 = m1749();
        m1743(z);
        m1752(HandleState.Selection);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1765() {
        InterfaceC5400 interfaceC5400 = this.f2502;
        if (interfaceC5400 != null) {
            AbstractC5398.m10473(interfaceC5400, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null), 1);
        }
    }
}
