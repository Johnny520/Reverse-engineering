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
import kotlin.reflect.InterfaceC5088;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6543;
import p106.AbstractC7308;
import p108.C7315;
import p108.InterfaceC7317;
import p110.C7321;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1027 extends AbstractC1054 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public C5417 f3004;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C5417 f3005;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public C1643 f3006;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final C0254 f3007;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final C0254 f3008;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public boolean f3009;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public long f3010;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public boolean f3011;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public boolean f3012;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public C5417 f3013;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f3014;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public boolean f3015;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public long f3016;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public C5417 f3017;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public C7321 f3018;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public boolean f3019;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public boolean f3020;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public InterfaceC6543 f3021;

    public C1027(InterfaceC1095 interfaceC1095, InterfaceC0580 interfaceC0580, InterfaceC6543 interfaceC6543, InterfaceC6543 interfaceC65432) {
        super(interfaceC0580, interfaceC1095, false, true, null, null, interfaceC6543);
        this.f3021 = interfaceC65432;
        this.f3009 = true;
        int i = AbstractC0272.f977;
        this.f3008 = new C0254(6);
        this.f3007 = new C0254(6);
        this.f3016 = -1L;
        this.f3010 = -1L;
    }

    @Override // p110.InterfaceC7320
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo1221(C0137 c0137, PointerEventPass pointerEventPass) {
        ArrayList arrayList = (ArrayList) c0137.f595;
        m1967();
        if (this.f3122 && this.f3120 == null) {
            C1025 c1025 = new C1025(this);
            m3364(c1025);
            this.f3120 = c1025;
        }
        int i = 0;
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3018 == null || this.f3011) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                C7321 c7321 = (C7321) arrayList.get(i);
                if (c7321.f19523 && c7321 != this.f3018) {
                    m1932(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.f3018 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC0521.m1307((C7321) arrayList.get(i2))) {
                    C7321 c73212 = (C7321) arrayList.get(0);
                    c73212.f19523 = true;
                    this.f3018 = c73212;
                    if (this.f3122) {
                        C5417 c5417 = this.f3013;
                        if (c5417 != null && c5417.mo10562()) {
                            ((InterfaceC1863) AbstractC1785.m3356(this, AbstractC1902.f5576)).getClass();
                            if (c73212.f19519 - this.f3010 < 40) {
                                this.f3012 = true;
                                return;
                            }
                            this.f3014 = true;
                            C5417 c54172 = this.f3013;
                            if (c54172 != null) {
                                c54172.mo10256(null);
                            }
                            this.f3013 = null;
                        }
                        this.f3011 = false;
                        m1968(c73212);
                        if (this.f3021 != null) {
                            this.f3017 = AbstractC5399.m10477(m3867(), null, null, new CombinedClickableNode$handleDownEvent$2(this, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f3011) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C7321 c73213 = (C7321) arrayList.get(i3);
                if (!c73213.f19521 || c73213.f19517) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((C7321) arrayList.get(i)).f19523 = true;
                        i++;
                    }
                    return;
                }
            }
            C7321 c73214 = (C7321) arrayList.get(0);
            c73214.f19523 = true;
            long j = c73214.f19519;
            C7321 c73215 = this.f3018;
            c73215.getClass();
            m1934(j, c73215);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            C7321 c73216 = (C7321) arrayList.get(i4);
            if (c73216.f19523 || !c73216.f19521 || c73216.f19517) {
                float fMo3278 = ((InterfaceC1863) AbstractC1785.m3356(this, AbstractC1902.f5576)).mo3278();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    C7321 c73217 = (C7321) arrayList.get(i5);
                    long j2 = c73217.f19518;
                    C7321 c73218 = this.f3018;
                    c73218.getClass();
                    boolean z = Math.abs(C7329.m12527(C7329.m12526(j2, c73218.f19518))) > fMo3278;
                    if (c73217.f19523 || z) {
                        m1932(true);
                        return;
                    }
                }
                return;
            }
        }
        C7321 c73219 = (C7321) arrayList.get(0);
        c73219.f19523 = true;
        long j3 = c73219.f19519;
        C7321 c732110 = this.f3018;
        c732110.getClass();
        m1934(j3, c732110);
    }

    @Override // androidx.compose.foundation.AbstractC1054, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1224() {
        super.mo1224();
        m1932(false);
    }

    @Override // androidx.compose.foundation.AbstractC1054, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1291(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        super.mo1291(c1652, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3006 == null || this.f3020) {
                return;
            }
            List list = c1652.f4852;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1643 c1643 = (C1643) list.get(i);
                if (c1643.m3022() && c1643 != this.f3006) {
                    m1932(false);
                    return;
                }
            }
            return;
        }
        if (this.f3006 == null) {
            if (AbstractC0503.m1278(c1652, true, false)) {
                C1643 c16432 = (C1643) c1652.f4852.get(0);
                c16432.m3024();
                this.f3006 = c16432;
                if (this.f3122) {
                    C5417 c5417 = this.f3004;
                    if (c5417 != null && c5417.mo10562()) {
                        ((InterfaceC1863) AbstractC1785.m3356(this, AbstractC1902.f5576)).getClass();
                        if (c16432.f4808 - this.f3016 < 40) {
                            this.f3015 = true;
                            return;
                        }
                        this.f3019 = true;
                        C5417 c54172 = this.f3004;
                        if (c54172 != null) {
                            c54172.mo10256(null);
                        }
                        this.f3004 = null;
                    }
                    this.f3020 = false;
                    m1965(c16432);
                    if (this.f3021 != null) {
                        this.f3005 = AbstractC5399.m10477(m3867(), null, null, new CombinedClickableNode$handleDownEvent$1(this, null), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = c1652.f4850 == 2;
        List list2 = c1652.f4852;
        if (z && !this.f3020 && this.f3122 && this.f3021 != null) {
            C5417 c54173 = this.f3005;
            if (c54173 != null) {
                c54173.mo10256(null);
            }
            this.f3005 = null;
            InterfaceC6543 interfaceC6543 = this.f3021;
            if (interfaceC6543 != null) {
                interfaceC6543.invoke();
            }
            if (this.f3009) {
                ((C7315) ((InterfaceC7317) AbstractC1785.m3356(this, AbstractC1902.f5591))).m12509(0);
            }
            this.f3020 = true;
        }
        if (this.f3020) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!AbstractC1646.m3027((C1643) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((C1643) list2.get(i3)).m3024();
                    }
                    return;
                }
            }
            C1643 c16433 = (C1643) list2.get(0);
            c16433.m3024();
            long j2 = c16433.f4808;
            C1643 c16434 = this.f3006;
            c16434.getClass();
            m1931(j2, c16434);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!AbstractC1646.m3028((C1643) list2.get(i4))) {
                long jM1969 = m1969(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    C1643 c16435 = (C1643) list2.get(i5);
                    if (c16435.m3022() || AbstractC1646.m3025(c16435, j, jM1969)) {
                        m1932(false);
                        return;
                    }
                }
                return;
            }
        }
        C1643 c16436 = (C1643) list2.get(0);
        c16436.m3024();
        long j3 = c16436.f4808;
        C1643 c16437 = this.f3006;
        c16437.getClass();
        m1931(j3, c16437);
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final void mo1928() {
        m1933();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1929(android.view.KeyEvent r7) {
        /*
            r6 = this;
            long r0 = p106.AbstractC7308.m12504(r7)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r7 = r6.f3021
            r2 = 0
            if (r7 == 0) goto L24
            androidx.collection.飘花落叶言子世苏哲楪兰 r7 = r6.f3008
            java.lang.Object r3 = r7.m814(r0)
            if (r3 != 0) goto L24
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r3 = r6.m3867()
            androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1 r4 = new androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1
            r4.<init>(r6, r2)
            r5 = 3
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r2 = kotlinx.coroutines.AbstractC5399.m10477(r3, r2, r2, r4, r5)
            r7.m818(r2, r0)
            r7 = 1
            goto L25
        L24:
            r7 = 0
        L25:
            androidx.collection.飘花落叶言子世苏哲楪兰 r6 = r6.f3007
            java.lang.Object r6 = r6.m814(r0)
            androidx.compose.foundation.飘花落叶言子世楪哲兰苏 r6 = (androidx.compose.foundation.AbstractC1029) r6
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C1027.mo1929(android.view.KeyEvent):boolean");
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final C1627 mo1930() {
        return null;
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final void mo1579(InterfaceC1944 interfaceC1944) {
        if (this.f3021 != null) {
            C1030 c1030 = new C1030(this, 0);
            InterfaceC5088[] interfaceC5088Arr = AbstractC1946.f5755;
            interfaceC1944.mo3590(AbstractC1959.f5791, new C1941(null, c1030));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final void m1931(long j, C1643 c1643) {
        if (this.f3122 && !this.f3015) {
            m1966(c1643.f4807, false);
            this.f3016 = j;
            if (!this.f3020 && !this.f3019) {
                this.f3121.invoke();
            }
        }
        this.f3006 = null;
        this.f3015 = false;
        this.f3019 = false;
        C5417 c5417 = this.f3005;
        if (c5417 != null) {
            c5417.mo10256(null);
        }
        this.f3005 = null;
        this.f3020 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void m1932(boolean z) {
        if (z) {
            this.f3018 = null;
            C5417 c5417 = this.f3017;
            if (c5417 != null) {
                c5417.mo10256(null);
            }
            this.f3017 = null;
            C5417 c54172 = this.f3013;
            if (c54172 != null) {
                c54172.mo10256(null);
            }
            this.f3013 = null;
            this.f3014 = false;
            this.f3011 = false;
            this.f3010 = -1L;
            this.f3012 = false;
        } else {
            this.f3006 = null;
            C5417 c54173 = this.f3005;
            if (c54173 != null) {
                c54173.mo10256(null);
            }
            this.f3005 = null;
            C5417 c54174 = this.f3004;
            if (c54174 != null) {
                c54174.mo10256(null);
            }
            this.f3004 = null;
            this.f3019 = false;
            this.f3020 = false;
            this.f3016 = -1L;
            this.f3015 = false;
        }
        m1970(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1933() {
        /*
            r24 = this;
            r0 = r24
            androidx.collection.飘花落叶言子世苏哲楪兰 r1 = r0.f3008
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
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r10 = (kotlinx.coroutines.InterfaceC5452) r10
            r10.mo10256(r5)
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
            r1.m817()
            androidx.collection.飘花落叶言子世苏哲楪兰 r0 = r0.f3007
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
            r0.m817()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C1027.m1933():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final void m1934(long j, C7321 c7321) {
        if (this.f3122 && !this.f3012) {
            m1966(c7321.f19518, true);
            this.f3010 = j;
            if (!this.f3011 && !this.f3014) {
                this.f3121.invoke();
            }
        }
        this.f3018 = null;
        this.f3012 = false;
        this.f3014 = false;
        C5417 c5417 = this.f3017;
        if (c5417 != null) {
            c5417.mo10256(null);
        }
        this.f3017 = null;
        this.f3011 = false;
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final void mo1935(KeyEvent keyEvent) {
        long jM12504 = AbstractC7308.m12504(keyEvent);
        C0254 c0254 = this.f3008;
        boolean z = false;
        if (c0254.m814(jM12504) != null) {
            InterfaceC5452 interfaceC5452 = (InterfaceC5452) c0254.m814(jM12504);
            if (interfaceC5452 != null) {
                if (interfaceC5452.mo10562()) {
                    interfaceC5452.mo10256(null);
                } else {
                    z = true;
                }
            }
            c0254.m812(jM12504);
        }
        if (z) {
            return;
        }
        this.f3121.invoke();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1119() {
        m1933();
    }

    @Override // p110.InterfaceC7320
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo1234() {
        m1932(true);
    }
}
