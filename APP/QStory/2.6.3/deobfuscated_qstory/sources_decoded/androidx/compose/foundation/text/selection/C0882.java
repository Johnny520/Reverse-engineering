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
import androidx.window.area.AbstractC2567;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p108.InterfaceC7317;
import p112.C7328;
import p112.C7329;
import p212.C7951;
import p232.C8065;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0882 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f2481;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C0886 f2482;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C0881 f2483;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C0824 f2484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC6543 f2485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0943 f2487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0965 f2490;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f2491;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f2492;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C2035 f2493;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC1395 f2494;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2013 f2495;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C8065 f2496;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f2497;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f2498;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f2499;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1395 f2500;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public long f2501;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2035 f2502;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC5401 f2503;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC1921 f2504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC7317 f2505;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C1468 f2506;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC0917 f2507;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC1874 f2508;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2022 f2489 = AbstractC0983.f2851;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC6558 f2488 = new C0016(28);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f2486 = AbstractC1367.m2474(new C2013(7, 0, (String) null));

    public C0882(C0965 c0965) {
        this.f2490 = c0965;
        Boolean bool = Boolean.TRUE;
        this.f2498 = AbstractC1367.m2474(bool);
        this.f2497 = AbstractC1367.m2474(bool);
        this.f2501 = 0L;
        this.f2499 = 0L;
        this.f2500 = AbstractC1367.m2474(null);
        this.f2492 = AbstractC1367.m2474(null);
        this.f2491 = -1;
        this.f2495 = new C2013(7, 0L, (String) null);
        this.f2494 = AbstractC1367.m2474(Boolean.FALSE);
        C0824 c0824 = new C0824();
        c0824.f2347 = ToolbarHandlerState.Uninitialized;
        this.f2484 = c0824;
        this.f2483 = new C0881(this);
        this.f2482 = new C0886(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ea  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m1749(androidx.compose.foundation.text.selection.C0882 r21, androidx.compose.ui.text.input.C2013 r22, long r23, boolean r25, boolean r26, androidx.collection.C0276 r27, boolean r28, p108.C7316 r29) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0882.m1749(androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪, androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏, long, boolean, boolean, androidx.collection.飘花落叶言子楪苏世哲兰, boolean, 飘花落叶言子世兰楪哲苏.飘花落叶言子楪世苏兰哲):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1750(C0882 c0882, C2035 c2035) {
        C2068 c2068M1760;
        String str;
        InterfaceC5401 interfaceC5401;
        if (c2035 == null) {
            return;
        }
        long j = c2035.f6004;
        InterfaceC0917 interfaceC0917 = c0882.f2507;
        if (interfaceC0917 == null || (c2068M1760 = c0882.m1760()) == null || (str = c2068M1760.f6129) == null) {
            return;
        }
        InterfaceC2022 interfaceC2022 = c0882.f2489;
        int i = (int) (j >> 32);
        interfaceC2022.mo1882(i);
        int i2 = (int) (j & 4294967295L);
        interfaceC2022.mo1882(i2);
        long jM3770 = AbstractC2048.m3770(i, i2);
        if (str.length() <= 0 || C2035.m3752(jM3770) || (interfaceC5401 = c0882.f2503) == null) {
            return;
        }
        AbstractC5399.m10477(interfaceC5401, null, null, new TextFieldSelectionManager$maybeSuggestSelection$1(interfaceC0917, str, jM3770, c2035, c0882, interfaceC2022, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Pair m1751(C0882 c0882) {
        String str;
        C2035 c2035;
        C2068 c2068M1760 = c0882.m1760();
        if (c2068M1760 == null || (str = c2068M1760.f6129) == null || (c2035 = c0882.f2493) == null) {
            return null;
        }
        long j = c2035.f6004;
        int i = (int) (j >> 32);
        c0882.f2489.mo1882(i);
        int i2 = (int) (j & 4294967295L);
        c0882.f2489.mo1882(i2);
        return new Pair(str, new C2035(AbstractC2048.m3770(i, i2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C2013 m1752(C2068 c2068, long j) {
        return new C2013(c2068, j, (C2035) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m1753(boolean z) {
        C0943 c0943 = this.f2487;
        if (c0943 != null) {
            ((AbstractC1347) c0943.f2686).setValue(Boolean.valueOf(z));
        }
        if (z) {
            m1755();
        } else {
            m1763();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1754(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
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
            kotlin.AbstractC5185.m10210(r5)
            goto L5d
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5185.m10210(r5)
            androidx.compose.ui.platform.飘花落叶言子苏楪兰世哲 r5 = r4.f2504
            if (r5 == 0) goto L69
            r0.L$0 = r4
            r0.label = r3
            androidx.compose.ui.platform.飘花落叶言子楪苏哲世兰 r5 = (androidx.compose.ui.platform.C1899) r5
            androidx.compose.ui.platform.飘花落叶言子楪苏哲兰世 r5 = r5.f5566
            android.content.ClipboardManager r5 = r5.m3594()
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
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r4 = r4.f2494
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r4 = (androidx.compose.runtime.AbstractC1347) r4
            r4.setValue(r5)
        L69:
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0882.m1754(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (((java.lang.Boolean) ((androidx.compose.runtime.AbstractC1347) r3.f2679).getValue()).booleanValue() == false) goto L18;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1755() {
        /*
            r4 = this;
            androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰 r0 = androidx.compose.runtime.snapshots.AbstractC1274.m2231()
            if (r0 == 0) goto Lb
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r1 = r0.mo2203()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰 r2 = androidx.compose.runtime.snapshots.AbstractC1274.m2243(r0)
            boolean r3 = r4.m1767()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            androidx.compose.foundation.text.飘花落叶言子世兰苏楪哲 r3 = r4.f2487     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L2b
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r3 = r3.f2679     // Catch: java.lang.Throwable -> L34
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r3 = (androidx.compose.runtime.AbstractC1347) r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L34
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L2b
            goto L36
        L2b:
            androidx.compose.runtime.snapshots.AbstractC1274.m2237(r0, r2, r1)
            androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰哲世 r4 = r4.f2484
            r4.m1642()
            return
        L34:
            r4 = move-exception
            goto L3a
        L36:
            androidx.compose.runtime.snapshots.AbstractC1274.m2237(r0, r2, r1)
            return
        L3a:
            androidx.compose.runtime.snapshots.AbstractC1274.m2237(r0, r2, r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0882.m1755():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m1756() {
        return m1770() && ((Boolean) ((AbstractC1347) this.f2494).getValue()).booleanValue() && this.f2504 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m1757() {
        return (C2035.m3752(m1759().f5946) || !m1770() || this.f2504 == null) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m1758() {
        return m1770() && C2035.m3752(m1759().f5946);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2013 m1759() {
        return (C2013) ((AbstractC1347) this.f2486).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2068 m1760() {
        C0943 c0943 = this.f2487;
        if (c0943 != null) {
            return c0943.f2670.f2956;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m1761() {
        C2013 c2013M1752 = m1752(m1759().f5947, AbstractC2048.m3770(0, m1759().f5947.f6129.length()));
        this.f2488.invoke(c2013M1752);
        long j = c2013M1752.f5946;
        this.f2493 = new C2035(j);
        this.f2495 = C2013.m3715(this.f2495, null, j, 5);
        m1774(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m1762(HandleState handleState) {
        C0943 c0943 = this.f2487;
        if (c0943 != null) {
            if (c0943.m1868() == handleState) {
                c0943 = null;
            }
            if (c0943 != null) {
                ((AbstractC1347) c0943.f2685).setValue(handleState);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m1763() {
        C5417 c5417;
        C0823 c0823 = this.f2484.f2348;
        if (c0823 == null || (c5417 = c0823.f2342) == null) {
            return;
        }
        c5417.mo10256(null);
        c0823.f2342 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m1764() {
        InterfaceC5401 interfaceC5401 = this.f2503;
        if (interfaceC5401 != null) {
            AbstractC5399.m10477(interfaceC5401, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$paste$1(this, null), 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC2129 m1765() {
        if (!m1767()) {
            return C2125.f6276;
        }
        return AbstractC0825.m1643(AbstractC0825.m1644(new TextFieldSelectionManager$contextMenuAreaModifier$1(this, null)), this.f2484, new TextFieldSelectionManager$contextMenuAreaModifier$2(this, null), new TextFieldSelectionManager$contextMenuAreaModifier$3(this, null), new C0914(this, 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7328 m1766() {
        char c;
        long j;
        float fIntBitsToFloat;
        InterfaceC1695 interfaceC1695M1866;
        C2033 c2033;
        InterfaceC1695 interfaceC1695M18662;
        C2033 c20332;
        InterfaceC1695 interfaceC1695M18663;
        InterfaceC1695 interfaceC1695M18664;
        C0943 c0943 = this.f2487;
        if (c0943 != null) {
            if (c0943.f2682) {
                c0943 = null;
            }
            if (c0943 != null) {
                InterfaceC2022 interfaceC2022 = this.f2489;
                long j2 = m1759().f5946;
                int i = C2035.f6002;
                int i2 = (int) (j2 >> 32);
                interfaceC2022.mo1882(i2);
                InterfaceC2022 interfaceC20222 = this.f2489;
                int i3 = (int) (m1759().f5946 & 4294967295L);
                interfaceC20222.mo1882(i3);
                C0943 c09432 = this.f2487;
                long jMo3076 = 0;
                long jMo30762 = (c09432 == null || (interfaceC1695M18664 = c09432.m1866()) == null) ? 0L : interfaceC1695M18664.mo3076(m1768(true));
                C0943 c09433 = this.f2487;
                if (c09433 != null && (interfaceC1695M18663 = c09433.m1866()) != null) {
                    jMo3076 = interfaceC1695M18663.mo3076(m1768(false));
                }
                C0943 c09434 = this.f2487;
                float fIntBitsToFloat2 = 0.0f;
                if (c09434 == null || (interfaceC1695M18662 = c09434.m1866()) == null) {
                    c = ' ';
                    j = jMo3076;
                    fIntBitsToFloat = 0.0f;
                } else {
                    C0963 c0963M1865 = c0943.m1865();
                    c = ' ';
                    j = jMo3076;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1695M18662.mo3076((((long) Float.floatToRawIntBits((c0963M1865 == null || (c20332 = c0963M1865.f2745) == null) ? 0.0f : c20332.m3743(i2).f19539)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                }
                C0943 c09435 = this.f2487;
                if (c09435 != null && (interfaceC1695M1866 = c09435.m1866()) != null) {
                    C0963 c0963M18652 = c0943.m1865();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1695M1866.mo3076((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits((c0963M18652 == null || (c2033 = c0963M18652.f2745) == null) ? 0.0f : c2033.m3743(i3).f19539)) & 4294967295L)) & 4294967295L));
                }
                int i4 = (int) (jMo30762 >> c);
                int i5 = (int) (j >> c);
                return new C7328(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), (c0943.f2670.f2958.mo1256() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jMo30762 & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
            }
        }
        return C7328.f19536;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m1767() {
        return ((Boolean) ((AbstractC1347) this.f2497).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long m1768(boolean z) {
        C0963 c0963M1865;
        C2033 c2033;
        long j;
        C0943 c0943 = this.f2487;
        if (c0943 != null && (c0963M1865 = c0943.m1865()) != null && (c2033 = c0963M1865.f2745) != null) {
            C2062 c2062 = c2033.f5990;
            C2068 c2068M1760 = m1760();
            if (c2068M1760 != null) {
                if (AbstractC4395.m8907(c2068M1760.f6129, c2033.f5991.f5997.f6129)) {
                    C2013 c2013M1759 = m1759();
                    if (z) {
                        long j2 = c2013M1759.f5946;
                        int i = C2035.f6002;
                        j = j2 >> 32;
                    } else {
                        long j3 = c2013M1759.f5946;
                        int i2 = C2035.f6002;
                        j = j3 & 4294967295L;
                    }
                    int i3 = (int) j;
                    this.f2489.mo1882(i3);
                    boolean zM3756 = C2035.m3756(m1759().f5946);
                    long j4 = c2033.f5989;
                    int iM3788 = c2062.m3788(i3);
                    if (iM3788 >= c2062.f6100) {
                        return 9205357640488583168L;
                    }
                    boolean z2 = c2033.m3745(((!z || zM3756) && (z || !zM3756)) ? Math.max(i3 + (-1), 0) : i3) == c2033.m3746(i3);
                    c2062.m3796(i3);
                    int length = ((C2068) c2062.f6105.f3620).f6129.length();
                    ArrayList arrayList = c2062.f6106;
                    C2065 c2065 = (C2065) arrayList.get(i3 == length ? AbstractC6347.m11901(arrayList) : AbstractC2048.m3768(i3, arrayList));
                    C2054 c2054 = c2065.f6122;
                    int iM3798 = c2065.m3798(i3);
                    C7951 c7951 = c2054.f6086;
                    return (((long) Float.floatToRawIntBits(AbstractC2567.m5071(c2062.m3790(iM3788), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC2567.m5071(z2 ? c7951.m13445(iM3798, false) : c7951.m13447(iM3798, false), 0.0f, (int) (j4 >> 32)))) << 32);
                }
            }
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C7329 m1769() {
        return (C7329) ((AbstractC1347) this.f2492).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m1770() {
        return ((Boolean) ((AbstractC1347) this.f2498).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C5417 m1771(boolean z) {
        InterfaceC5401 interfaceC5401 = this.f2503;
        if (interfaceC5401 != null) {
            return AbstractC5399.m10477(interfaceC5401, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, z, null), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m1772() {
        return C2035.m3751(m1759().f5946) != m1759().f5947.f6129.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1773(C7329 c7329) {
        int iM3750;
        if (!C2035.m3752(m1759().f5946)) {
            C0943 c0943 = this.f2487;
            C0963 c0963M1865 = c0943 != null ? c0943.m1865() : null;
            if (c7329 == null || c0963M1865 == null) {
                iM3750 = C2035.m3750(m1759().f5946);
            } else {
                InterfaceC2022 interfaceC2022 = this.f2489;
                iM3750 = c0963M1865.m1878(c7329.f19541, true);
                interfaceC2022.mo1883(iM3750);
            }
            C2013 c2013M3715 = C2013.m3715(m1759(), null, AbstractC2048.m3770(iM3750, iM3750), 5);
            this.f2488.invoke(c2013M3715);
            this.f2493 = new C2035(c2013M3715.f5946);
        }
        m1762((c7329 == null || m1759().f5947.f6129.length() <= 0) ? HandleState.None : HandleState.Cursor);
        m1753(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m1774(boolean z) {
        C1468 c1468;
        C0943 c0943 = this.f2487;
        if (c0943 != null && !c0943.m1867() && (c1468 = this.f2506) != null) {
            C1468.m2632(c1468);
        }
        this.f2495 = m1759();
        m1753(z);
        m1762(HandleState.Selection);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1775() {
        InterfaceC5401 interfaceC5401 = this.f2503;
        if (interfaceC5401 != null) {
            AbstractC5399.m10477(interfaceC5401, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null), 1);
        }
    }
}
