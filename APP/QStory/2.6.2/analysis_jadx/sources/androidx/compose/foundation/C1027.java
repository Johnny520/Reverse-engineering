package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.appcompat.widget.C0137;
import androidx.collection.AbstractC0272;
import androidx.collection.C0254;
import androidx.compose.foundation.gestures.AbstractC0503;
import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.InterfaceC1863;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.InterfaceC1944;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.InterfaceC5087;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6542;
import p106.AbstractC7307;
import p108.C7314;
import p108.InterfaceC7316;
import p110.C7320;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1027 extends AbstractC1054 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public C5416 f3003;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C5416 f3004;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public C1643 f3005;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final C0254 f3006;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final C0254 f3007;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public boolean f3008;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public long f3009;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public boolean f3010;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public boolean f3011;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public C5416 f3012;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f3013;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public boolean f3014;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public long f3015;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public C5416 f3016;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public C7320 f3017;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public boolean f3018;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public boolean f3019;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public InterfaceC6542 f3020;

    public C1027(InterfaceC1095 interfaceC1095, InterfaceC0580 interfaceC0580, InterfaceC6542 interfaceC6542, InterfaceC6542 interfaceC65422) {
        super(interfaceC0580, interfaceC1095, false, true, null, null, interfaceC6542);
        this.f3020 = interfaceC65422;
        this.f3008 = true;
        int i = AbstractC0272.f977;
        this.f3007 = new C0254(6);
        this.f3006 = new C0254(6);
        this.f3015 = -1L;
        this.f3009 = -1L;
    }

    @Override // p110.InterfaceC7319
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo1211(C0137 c0137, PointerEventPass pointerEventPass) {
        ArrayList arrayList = (ArrayList) c0137.f595;
        m1957();
        if (this.f3121 && this.f3119 == null) {
            C1025 c1025 = new C1025(this);
            m3354(c1025);
            this.f3119 = c1025;
        }
        int i = 0;
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3017 == null || this.f3010) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                C7320 c7320 = (C7320) arrayList.get(i);
                if (c7320.f19528 && c7320 != this.f3017) {
                    m1922(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.f3017 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC0521.m1297((C7320) arrayList.get(i2))) {
                    C7320 c73202 = (C7320) arrayList.get(0);
                    c73202.f19528 = true;
                    this.f3017 = c73202;
                    if (this.f3121) {
                        C5416 c5416 = this.f3012;
                        if (c5416 != null && c5416.mo10557()) {
                            ((InterfaceC1863) AbstractC1785.m3346(this, AbstractC1902.f5575)).getClass();
                            if (c73202.f19524 - this.f3009 < 40) {
                                this.f3011 = true;
                                return;
                            }
                            this.f3013 = true;
                            C5416 c54162 = this.f3012;
                            if (c54162 != null) {
                                c54162.mo10252(null);
                            }
                            this.f3012 = null;
                        }
                        this.f3010 = false;
                        m1958(c73202);
                        if (this.f3020 != null) {
                            this.f3016 = AbstractC5398.m10473(m3857(), null, null, new CombinedClickableNode$handleDownEvent$2(this, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f3010) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C7320 c73203 = (C7320) arrayList.get(i3);
                if (!c73203.f19526 || c73203.f19522) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((C7320) arrayList.get(i)).f19528 = true;
                        i++;
                    }
                    return;
                }
            }
            C7320 c73204 = (C7320) arrayList.get(0);
            c73204.f19528 = true;
            long j = c73204.f19524;
            C7320 c73205 = this.f3017;
            c73205.getClass();
            m1924(j, c73205);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            C7320 c73206 = (C7320) arrayList.get(i4);
            if (c73206.f19528 || !c73206.f19526 || c73206.f19522) {
                float fMo3268 = ((InterfaceC1863) AbstractC1785.m3346(this, AbstractC1902.f5575)).mo3268();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    C7320 c73207 = (C7320) arrayList.get(i5);
                    long j2 = c73207.f19523;
                    C7320 c73208 = this.f3017;
                    c73208.getClass();
                    boolean z = Math.abs(C7328.m12500(C7328.m12499(j2, c73208.f19523))) > fMo3268;
                    if (c73207.f19528 || z) {
                        m1922(true);
                        return;
                    }
                }
                return;
            }
        }
        C7320 c73209 = (C7320) arrayList.get(0);
        c73209.f19528 = true;
        long j3 = c73209.f19524;
        C7320 c732010 = this.f3017;
        c732010.getClass();
        m1924(j3, c732010);
    }

    @Override // androidx.compose.foundation.AbstractC1054, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1214() {
        super.mo1214();
        m1922(false);
    }

    @Override // androidx.compose.foundation.AbstractC1054, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1281(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        super.mo1281(c1652, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3005 == null || this.f3019) {
                return;
            }
            List list = c1652.f4851;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1643 c1643 = (C1643) list.get(i);
                if (c1643.m3012() && c1643 != this.f3005) {
                    m1922(false);
                    return;
                }
            }
            return;
        }
        if (this.f3005 == null) {
            if (AbstractC0503.m1268(c1652, true, false)) {
                C1643 c16432 = (C1643) c1652.f4851.get(0);
                c16432.m3014();
                this.f3005 = c16432;
                if (this.f3121) {
                    C5416 c5416 = this.f3003;
                    if (c5416 != null && c5416.mo10557()) {
                        ((InterfaceC1863) AbstractC1785.m3346(this, AbstractC1902.f5575)).getClass();
                        if (c16432.f4807 - this.f3015 < 40) {
                            this.f3014 = true;
                            return;
                        }
                        this.f3018 = true;
                        C5416 c54162 = this.f3003;
                        if (c54162 != null) {
                            c54162.mo10252(null);
                        }
                        this.f3003 = null;
                    }
                    this.f3019 = false;
                    m1955(c16432);
                    if (this.f3020 != null) {
                        this.f3004 = AbstractC5398.m10473(m3857(), null, null, new CombinedClickableNode$handleDownEvent$1(this, null), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = c1652.f4849 == 2;
        List list2 = c1652.f4851;
        if (z && !this.f3019 && this.f3121 && this.f3020 != null) {
            C5416 c54163 = this.f3004;
            if (c54163 != null) {
                c54163.mo10252(null);
            }
            this.f3004 = null;
            InterfaceC6542 interfaceC6542 = this.f3020;
            if (interfaceC6542 != null) {
                interfaceC6542.invoke();
            }
            if (this.f3008) {
                ((C7314) ((InterfaceC7316) AbstractC1785.m3346(this, AbstractC1902.f5590))).m12482(0);
            }
            this.f3019 = true;
        }
        if (this.f3019) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!AbstractC1646.m3017((C1643) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((C1643) list2.get(i3)).m3014();
                    }
                    return;
                }
            }
            C1643 c16433 = (C1643) list2.get(0);
            c16433.m3014();
            long j2 = c16433.f4807;
            C1643 c16434 = this.f3005;
            c16434.getClass();
            m1921(j2, c16434);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!AbstractC1646.m3018((C1643) list2.get(i4))) {
                long jM1959 = m1959(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    C1643 c16435 = (C1643) list2.get(i5);
                    if (c16435.m3012() || AbstractC1646.m3015(c16435, j, jM1959)) {
                        m1922(false);
                        return;
                    }
                }
                return;
            }
        }
        C1643 c16436 = (C1643) list2.get(0);
        c16436.m3014();
        long j3 = c16436.f4807;
        C1643 c16437 = this.f3005;
        c16437.getClass();
        m1921(j3, c16437);
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final void mo1918() {
        m1923();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1919(android.view.KeyEvent r7) {
        /*
            r6 = this;
            long r0 = p106.AbstractC7307.m12477(r7)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r7 = r6.f3020
            r2 = 0
            if (r7 == 0) goto L24
            androidx.collection.飘花落叶言子世苏哲楪兰 r7 = r6.f3007
            java.lang.Object r3 = r7.m813(r0)
            if (r3 != 0) goto L24
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r3 = r6.m3857()
            androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1 r4 = new androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1
            r4.<init>(r6, r2)
            r5 = 3
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r2 = kotlinx.coroutines.AbstractC5398.m10473(r3, r2, r2, r4, r5)
            r7.m817(r2, r0)
            r7 = 1
            goto L25
        L24:
            r7 = 0
        L25:
            androidx.collection.飘花落叶言子世苏哲楪兰 r6 = r6.f3006
            java.lang.Object r6 = r6.m813(r0)
            androidx.compose.foundation.飘花落叶言子世楪哲兰苏 r6 = (androidx.compose.foundation.AbstractC1029) r6
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C1027.mo1919(android.view.KeyEvent):boolean");
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final C1627 mo1920() {
        return null;
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final void mo1569(InterfaceC1944 interfaceC1944) {
        if (this.f3020 != null) {
            C1030 c1030 = new C1030(this, 0);
            InterfaceC5087[] interfaceC5087Arr = AbstractC1946.f5754;
            interfaceC1944.mo3580(AbstractC1959.f5790, new C1941(null, c1030));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final void m1921(long j, C1643 c1643) {
        if (this.f3121 && !this.f3014) {
            m1956(c1643.f4806, false);
            this.f3015 = j;
            if (!this.f3019 && !this.f3018) {
                this.f3120.invoke();
            }
        }
        this.f3005 = null;
        this.f3014 = false;
        this.f3018 = false;
        C5416 c5416 = this.f3004;
        if (c5416 != null) {
            c5416.mo10252(null);
        }
        this.f3004 = null;
        this.f3019 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void m1922(boolean z) {
        if (z) {
            this.f3017 = null;
            C5416 c5416 = this.f3016;
            if (c5416 != null) {
                c5416.mo10252(null);
            }
            this.f3016 = null;
            C5416 c54162 = this.f3012;
            if (c54162 != null) {
                c54162.mo10252(null);
            }
            this.f3012 = null;
            this.f3013 = false;
            this.f3010 = false;
            this.f3009 = -1L;
            this.f3011 = false;
        } else {
            this.f3005 = null;
            C5416 c54163 = this.f3004;
            if (c54163 != null) {
                c54163.mo10252(null);
            }
            this.f3004 = null;
            C5416 c54164 = this.f3003;
            if (c54164 != null) {
                c54164.mo10252(null);
            }
            this.f3003 = null;
            this.f3018 = false;
            this.f3019 = false;
            this.f3015 = -1L;
            this.f3014 = false;
        }
        m1960(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1923() {
        /*
            r24 = this;
            r0 = r24
            androidx.collection.飘花落叶言子世苏哲楪兰 r1 = r0.f3007
            java.lang.Object[] r2 = r1.f927
            long[] r3 = r1.f929
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            r14 = 0
            if (r4 < 0) goto L5c
            r15 = r14
            r16 = 128(0x80, double:6.3E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L2e:
            if (r9 >= r8) goto L4e
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = r10
            r10 = r20
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r10 = (kotlinx.coroutines.InterfaceC5451) r10
            r10.mo10252(r5)
            goto L48
        L46:
            r21 = r10
        L48:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = r21
            goto L2e
        L4e:
            r21 = r10
            if (r8 != r13) goto L62
            goto L55
        L53:
            r21 = r10
        L55:
            if (r15 == r4) goto L62
            int r15 = r15 + 1
            r10 = r21
            goto L1a
        L5c:
            r21 = r10
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L62:
            r1.m816()
            androidx.collection.飘花落叶言子世苏哲楪兰 r0 = r0.f3006
            java.lang.Object[] r1 = r0.f927
            long[] r2 = r0.f929
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto La2
            r4 = r14
        L71:
            r6 = r2[r4]
            long r8 = ~r6
            long r8 = r8 << r21
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L9d
            int r8 = r4 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L84:
            if (r9 >= r8) goto L9b
            long r22 = r6 & r18
            int r10 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r10 < 0) goto L90
            long r6 = r6 >> r13
            int r9 = r9 + 1
            goto L84
        L90:
            int r0 = r4 << 3
            int r0 = r0 + r9
            r0 = r1[r0]
            androidx.compose.foundation.飘花落叶言子世楪哲兰苏 r0 = (androidx.compose.foundation.AbstractC1029) r0
            r0.getClass()
            throw r5
        L9b:
            if (r8 != r13) goto La2
        L9d:
            if (r4 == r3) goto La2
            int r4 = r4 + 1
            goto L71
        La2:
            r0.m816()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C1027.m1923():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final void m1924(long j, C7320 c7320) {
        if (this.f3121 && !this.f3011) {
            m1956(c7320.f19523, true);
            this.f3009 = j;
            if (!this.f3010 && !this.f3013) {
                this.f3120.invoke();
            }
        }
        this.f3017 = null;
        this.f3011 = false;
        this.f3013 = false;
        C5416 c5416 = this.f3016;
        if (c5416 != null) {
            c5416.mo10252(null);
        }
        this.f3016 = null;
        this.f3010 = false;
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final void mo1925(KeyEvent keyEvent) {
        long jM12477 = AbstractC7307.m12477(keyEvent);
        C0254 c0254 = this.f3007;
        boolean z = false;
        if (c0254.m813(jM12477) != null) {
            InterfaceC5451 interfaceC5451 = (InterfaceC5451) c0254.m813(jM12477);
            if (interfaceC5451 != null) {
                if (interfaceC5451.mo10557()) {
                    interfaceC5451.mo10252(null);
                } else {
                    z = true;
                }
            }
            c0254.m811(jM12477);
        }
        if (z) {
            return;
        }
        this.f3120.invoke();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1118() {
        m1923();
    }

    @Override // p110.InterfaceC7319
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo1224() {
        m1922(true);
    }
}
