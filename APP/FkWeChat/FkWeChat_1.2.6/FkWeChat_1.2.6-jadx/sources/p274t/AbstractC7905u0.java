package p274t;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.C1050n0;
import p117i.AbstractC3077p;
import p117i.AbstractC3081r;
import p117i.C3055g0;
import p117i.C3058h0;
import p117i.C3061i0;
import p117i.C3069l;
import p121i3.C3173c;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3570t0;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p274t.AbstractC7835g0;
import p274t.C7823e;
import p274t.C7870n0;
import p349y0.C9508c;

/* JADX INFO: renamed from: t.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7905u0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC7835g0 f26349a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC7835g0 f26350b;

    /* JADX INFO: renamed from: t.u0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0189q f26351q;

        public a(InterfaceC0189q interfaceC0189q) {
            this.f26351q = interfaceC0189q;
        }

        /* JADX INFO: renamed from: a */
        public final void m30538a(InterfaceC0572r interfaceC0572r, int i10) {
            if (!interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1192950673, i10, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:113)");
            }
            this.f26351q.mo236e(C7841h1.f26155b, interfaceC0572r, 6);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m30538a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    static {
        AbstractC7835g0.b bVar = AbstractC7835g0.f26136a;
        InterfaceC4499e.a aVar = InterfaceC4499e.f13028a;
        f26349a = bVar.m30365b(aVar.m17423l());
        f26350b = bVar.m30364a(aVar.m17422k());
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m30522a(InterfaceC4507m interfaceC4507m, C7823e.e eVar, C7823e.m mVar, InterfaceC4499e.c cVar, int i10, int i11, InterfaceC0189q interfaceC0189q, int i12, int i13, InterfaceC0572r interfaceC0572r, int i14) {
        m30527f(interfaceC4507m, eVar, mVar, cVar, i10, i11, interfaceC0189q, interfaceC0572r, AbstractC0541m3.m1929a(i12 | 1), i13);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m30523b(C1050n0 c1050n0, AbstractC3545l1 abstractC3545l1) {
        c1050n0.f3208q = abstractC3545l1;
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m30524c(C1050n0 c1050n0, AbstractC3545l1 abstractC3545l1) {
        c1050n0.f3208q = abstractC3545l1;
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d */
    public static C4700i0 m30525d(C9508c c9508c, AbstractC3545l1.a aVar) {
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            ((InterfaceC3558p0) objArr[i10]).mo13080m();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: e */
    public static C4700i0 m30526e(InterfaceC4507m interfaceC4507m, C7823e.e eVar, C7823e.m mVar, InterfaceC4499e.c cVar, int i10, int i11, C7831f1 c7831f1, InterfaceC0189q interfaceC0189q, int i12, int i13, InterfaceC0572r interfaceC0572r, int i14) {
        m30528g(interfaceC4507m, eVar, mVar, cVar, i10, i11, c7831f1, interfaceC0189q, interfaceC0572r, AbstractC0541m3.m1929a(i12 | 1), i13);
        return C4700i0.f13910a;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m30527f(p165l1.InterfaceC4507m r21, p274t.C7823e.e r22, p274t.C7823e.m r23, p165l1.InterfaceC4499e.c r24, int r25, int r26, final p010a9.InterfaceC0189q r27, androidx.compose.runtime.InterfaceC0572r r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p274t.AbstractC7905u0.m30527f(l1.m, t.e$e, t.e$m, l1.e$c, int, int, a9.q, androidx.compose.runtime.r, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m30528g(p165l1.InterfaceC4507m r24, p274t.C7823e.e r25, p274t.C7823e.m r26, p165l1.InterfaceC4499e.c r27, int r28, int r29, p274t.C7831f1 r30, final p010a9.InterfaceC0189q r31, androidx.compose.runtime.InterfaceC0572r r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p274t.AbstractC7905u0.m30528g(l1.m, t.e$e, t.e$m, l1.e$c, int, int, t.f1, a9.q, androidx.compose.runtime.r, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC3558p0 m30530i(InterfaceC3561q0 interfaceC3561q0, InterfaceC7807b1 interfaceC7807b1, Iterator it, float f10, float f11, long j10, int i10, int i11, C7925y0 c7925y0) {
        int i12;
        C7870n0.a aVarM30431a;
        int i13;
        int i14;
        InterfaceC3561q0 interfaceC3561q02;
        InterfaceC7807b1 interfaceC7807b12;
        int[] iArr;
        int[] iArr2;
        long j11;
        int i15;
        int iMo13077a;
        int iMo13078e;
        Integer num;
        C3069l c3069lM11390a;
        int i16;
        int i17;
        C3055g0 c3055g0;
        C3055g0 c3055g02;
        C3061i0 c3061i0;
        int i18;
        C7870n0.a aVar;
        InterfaceC7807b1 interfaceC7807b13 = interfaceC7807b1;
        Iterator it2 = it;
        C9508c c9508c = new C9508c(new InterfaceC3558p0[16], 0);
        int iM11973l = C3173c.m11973l(j10);
        int iM11975n = C3173c.m11975n(j10);
        int iM11972k = C3173c.m11972k(j10);
        C3058h0 c3058h0M11480c = AbstractC3077p.m11480c();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(interfaceC3561q0.mo1233i1(f10));
        int iCeil2 = (int) Math.ceil(interfaceC3561q0.mo1233i1(f11));
        long jM30369a = AbstractC7842h2.m30369a(0, iM11973l, 0, iM11972k);
        long jM30374f = AbstractC7842h2.m30374f(AbstractC7842h2.m30373e(jM30369a, 0, 0, 0, 0, 14, null), interfaceC7807b13.mo30251q() ? EnumC7926y1.f26418q : EnumC7926y1.f26419r);
        final C1050n0 c1050n0 = new C1050n0();
        InterfaceC3552n0 interfaceC3552n0M30537p = !it2.hasNext() ? null : m30537p(it2, null);
        C3069l c3069lM11390a2 = interfaceC3552n0M30537p != null ? C3069l.m11390a(m30534m(interfaceC3552n0M30537p, interfaceC7807b13, jM30374f, new InterfaceC0184l() { // from class: t.r0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC7905u0.m30524c(c1050n0, (AbstractC3545l1) obj);
            }
        })) : null;
        Integer numValueOf = c3069lM11390a2 != null ? Integer.valueOf(C3069l.m11394e(c3069lM11390a2.m11398i())) : null;
        Integer numValueOf2 = c3069lM11390a2 != null ? Integer.valueOf(C3069l.m11395f(c3069lM11390a2.m11398i())) : null;
        Integer num2 = numValueOf;
        C3055g0 c3055g03 = new C3055g0(0, 1, null);
        C3055g0 c3055g04 = new C3055g0(0, 1, null);
        C3061i0 c3061i0M11514b = AbstractC3081r.m11514b();
        InterfaceC3552n0 interfaceC3552n0 = interfaceC3552n0M30537p;
        C7870n0 c7870n0 = new C7870n0(i10, c7925y0, j10, i11, iCeil, iCeil2, null);
        int i19 = iCeil;
        C7870n0.b bVarM30432b = c7870n0.m30432b(it2.hasNext(), 0, C3069l.m11391b(iM11973l, iM11972k), c3069lM11390a2, 0, 0, 0, false, false);
        if (bVarM30432b.m30438a()) {
            aVarM30431a = c7870n0.m30431a(bVarM30432b, c3069lM11390a2 != null, -1, 0, iM11973l, 0);
            i12 = iM11973l;
        } else {
            i12 = iM11973l;
            aVarM30431a = null;
        }
        C7870n0.a aVar2 = aVarM30431a;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z10 = false;
        int i23 = 0;
        int i24 = 0;
        int i25 = i12;
        C7870n0.b bVar = bVarM30432b;
        Integer numValueOf3 = num2;
        InterfaceC3552n0 interfaceC3552n0M30537p2 = interfaceC3552n0;
        int i26 = 0;
        int i27 = iM11975n;
        int i28 = iM11972k;
        while (!bVar.m30438a() && interfaceC3552n0M30537p2 != null) {
            numValueOf3.getClass();
            int iIntValue = numValueOf3.intValue();
            numValueOf2.getClass();
            C3055g0 c3055g05 = c3055g03;
            C3061i0 c3061i02 = c3061i0M11514b;
            int i29 = i21 + iIntValue;
            int iMax = Math.max(i20, numValueOf2.intValue());
            int i30 = i25 - iIntValue;
            int i31 = i26 + 1;
            C3055g0 c3055g06 = c3055g04;
            c7925y0.m30608i(i31);
            arrayList.add(interfaceC3552n0M30537p2);
            c3058h0M11480c.m11326r(i26, c1050n0.f3208q);
            Object objMo13149o = interfaceC3552n0M30537p2.mo13149o();
            C7927y2 c7927y2 = objMo13149o instanceof C7927y2 ? (C7927y2) objMo13149o : null;
            if (c7927y2 != null) {
                c7927y2.m30614c();
            }
            int i32 = i31 - i22;
            if (it2.hasNext()) {
                num = null;
                interfaceC3552n0M30537p2 = m30537p(it2, null);
            } else {
                num = null;
                interfaceC3552n0M30537p2 = null;
            }
            c1050n0.f3208q = num;
            C3069l c3069lM11390a3 = interfaceC3552n0M30537p2 != null ? C3069l.m11390a(m30534m(interfaceC3552n0M30537p2, interfaceC7807b13, jM30374f, new InterfaceC0184l() { // from class: t.s0
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return AbstractC7905u0.m30523b(c1050n0, (AbstractC3545l1) obj);
                }
            })) : num;
            Integer numValueOf4 = c3069lM11390a3 != 0 ? Integer.valueOf(C3069l.m11394e(c3069lM11390a3.m11398i()) + i19) : num;
            numValueOf2 = c3069lM11390a3 != 0 ? Integer.valueOf(C3069l.m11395f(c3069lM11390a3.m11398i())) : num;
            boolean zHasNext = it2.hasNext();
            int i33 = i23;
            long jM11391b = C3069l.m11391b(i30, i28);
            if (c3069lM11390a3 == 0) {
                c3069lM11390a = num;
            } else {
                numValueOf4.getClass();
                int iIntValue2 = numValueOf4.intValue();
                numValueOf2.getClass();
                c3069lM11390a = C3069l.m11390a(C3069l.m11391b(iIntValue2, numValueOf2.intValue()));
            }
            C7870n0.b bVarM30432b2 = c7870n0.m30432b(zHasNext, i32, jM11391b, c3069lM11390a, i33, i24, iMax, false, false);
            if (bVarM30432b2.m30439b()) {
                int iMin = Math.min(Math.max(i27, i29), i12);
                int i34 = i24 + iMax;
                C7870n0.a aVarM30431a2 = c7870n0.m30431a(bVarM30432b2, c3069lM11390a3 != 0, i33, i34, i30, i32);
                c3055g06.m11303j(iMax);
                c3061i0 = c3061i02;
                if (z10) {
                    c3061i0.m11347r(i33);
                }
                i28 = (iM11972k - i34) - iCeil2;
                c3055g05.m11303j(i31);
                numValueOf3 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i19) : null;
                i23 = i33 + 1;
                i24 = i34 + iCeil2;
                aVar = aVarM30431a2;
                c3055g02 = c3055g05;
                i18 = iMin;
                c3055g0 = c3055g06;
                i22 = i31;
                i17 = i12;
                i21 = 0;
                z10 = false;
                i16 = 0;
            } else {
                i16 = iMax;
                i17 = i30;
                c3055g0 = c3055g06;
                c3055g02 = c3055g05;
                c3061i0 = c3061i02;
                i23 = i33;
                numValueOf3 = numValueOf4;
                i21 = i29;
                i18 = i27;
                aVar = aVar2;
            }
            c3055g04 = c3055g0;
            aVar2 = aVar;
            i27 = i18;
            bVar = bVarM30432b2;
            i25 = i17;
            c3061i0M11514b = c3061i0;
            i26 = i31;
            it2 = it;
            c3055g03 = c3055g02;
            i20 = i16;
        }
        C3055g0 c3055g07 = c3055g03;
        C3061i0 c3061i03 = c3061i0M11514b;
        C3055g0 c3055g08 = c3055g04;
        if (aVar2 != null) {
            arrayList.add(aVar2.m30433a());
            c3058h0M11480c.m11326r(arrayList.size() - 1, aVar2.m30436d());
            int i35 = c3055g07.f8151b - 1;
            if (aVar2.m30435c()) {
                int i36 = c3055g07.f8151b - 1;
                c3055g08.m11309p(i35, Math.max(c3055g08.m11417e(i35), C3069l.m11395f(aVar2.m30434b())));
                c3055g07.m11309p(i36, c3055g07.m11419h() + 1);
                C4700i0 c4700i0 = C4700i0.f13910a;
            } else {
                c3055g08.m11303j(C3069l.m11395f(aVar2.m30434b()));
                c3055g07.m11303j(c3055g07.m11419h() + 1);
            }
        }
        int size = arrayList.size();
        AbstractC3545l1[] abstractC3545l1Arr = new AbstractC3545l1[size];
        for (int i37 = 0; i37 < size; i37++) {
            abstractC3545l1Arr[i37] = c3058h0M11480c.m11449b(i37);
        }
        int i38 = c3055g07.f8151b;
        int[] iArr3 = new int[i38];
        int[] iArr4 = new int[i38];
        int[] iArr5 = c3055g07.f8150a;
        int iMax2 = i27;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        while (i40 < i38) {
            int i42 = iArr5[i40];
            int iM11417e = c3055g08.m11417e(i40);
            if (c3061i03.m11505a(i40)) {
                i15 = iM11417e;
            } else {
                i15 = Integer.MAX_VALUE;
                if (C3173c.m11972k(jM30369a) != Integer.MAX_VALUE) {
                    iM11417e = C3173c.m11972k(jM30369a) - i41;
                    i15 = iM11417e;
                }
            }
            C3055g0 c3055g09 = c3055g08;
            C3061i0 c3061i04 = c3061i03;
            InterfaceC7807b1 interfaceC7807b14 = interfaceC7807b13;
            ArrayList arrayList2 = arrayList;
            int i43 = i19;
            InterfaceC3558p0 interfaceC3558p0M30575a = AbstractC7922x2.m30575a(interfaceC7807b14, iMax2, C3173c.m11974m(jM30369a), C3173c.m11973l(jM30369a), i15, i43, interfaceC3561q0, arrayList2, abstractC3545l1Arr, i39, i42, iArr3, i40);
            if (interfaceC7807b1.mo30251q()) {
                iMo13077a = interfaceC3558p0M30575a.mo13078e();
                iMo13078e = interfaceC3558p0M30575a.mo13077a();
            } else {
                iMo13077a = interfaceC3558p0M30575a.mo13077a();
                iMo13078e = interfaceC3558p0M30575a.mo13078e();
            }
            iArr4[i40] = iMo13078e;
            i41 += iMo13078e;
            iMax2 = Math.max(iMax2, iMo13077a);
            c9508c.m37029b(interfaceC3558p0M30575a);
            i40++;
            arrayList = arrayList2;
            i39 = i42;
            c3055g08 = c3055g09;
            i19 = i43;
            c3061i03 = c3061i04;
            interfaceC7807b13 = interfaceC7807b1;
        }
        if (c9508c.m37039l() == 0) {
            i13 = 0;
            i14 = 0;
            interfaceC3561q02 = interfaceC3561q0;
            interfaceC7807b12 = interfaceC7807b1;
            j11 = j10;
            iArr = iArr3;
            iArr2 = iArr4;
        } else {
            i13 = iMax2;
            i14 = i41;
            interfaceC3561q02 = interfaceC3561q0;
            interfaceC7807b12 = interfaceC7807b1;
            iArr = iArr3;
            iArr2 = iArr4;
            j11 = j10;
        }
        return m30535n(interfaceC3561q02, j11, i13, i14, iArr2, c9508c, interfaceC7807b12, iArr);
    }

    /* JADX INFO: renamed from: j */
    public static final int m30531j(InterfaceC3563r interfaceC3563r, boolean z10, int i10) {
        return z10 ? interfaceC3563r.mo13151z0(i10) : interfaceC3563r.mo13146S(i10);
    }

    /* JADX INFO: renamed from: k */
    public static final long m30532k(List list, int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, int i14, C7925y0 c7925y0) {
        if (list.isEmpty()) {
            return C3069l.m11391b(0, 0);
        }
        C7870n0 c7870n0 = new C7870n0(i13, c7925y0, AbstractC7842h2.m30369a(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
        InterfaceC3563r interfaceC3563r = (InterfaceC3563r) AbstractC5081g0.m20579m0(list, 0);
        int i15 = interfaceC3563r != null ? iArr2[0] : 0;
        int i16 = interfaceC3563r != null ? iArr[0] : 0;
        int i17 = 0;
        if (c7870n0.m30432b(list.size() > 1, 0, C3069l.m11391b(i10, Integer.MAX_VALUE), interfaceC3563r == null ? null : C3069l.m11390a(C3069l.m11391b(i16, i15)), 0, 0, 0, false, false).m30438a()) {
            C3069l c3069lM30603d = c7925y0.m30603d(interfaceC3563r != null, 0, 0);
            return C3069l.m11391b(c3069lM30603d != null ? C3069l.m11395f(c3069lM30603d.m11398i()) : 0, 0);
        }
        int size = list.size();
        int i18 = i10;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            if (i19 >= size) {
                break;
            }
            int i24 = i18 - i16;
            int i25 = i19 + 1;
            int iMax = Math.max(i23, i15);
            InterfaceC3563r interfaceC3563r2 = (InterfaceC3563r) AbstractC5081g0.m20579m0(list, i25);
            int i26 = interfaceC3563r2 != null ? iArr2[i25] : 0;
            int i27 = interfaceC3563r2 != null ? iArr[i25] + i11 : 0;
            int i28 = i25 - i21;
            int i29 = i22;
            int i30 = i26;
            int i31 = i27;
            C7870n0.b bVarM30432b = c7870n0.m30432b(i19 + 2 < list.size(), i28, C3069l.m11391b(i24, Integer.MAX_VALUE), interfaceC3563r2 == null ? null : C3069l.m11390a(C3069l.m11391b(i27, i26)), i29, i17, iMax, false, false);
            if (bVarM30432b.m30439b()) {
                int iM11395f = i17 + iMax + i12;
                C7870n0.a aVarM30431a = c7870n0.m30431a(bVarM30432b, interfaceC3563r2 != null, i29, iM11395f, i24, i28);
                int i32 = i31 - i11;
                i22 = i29 + 1;
                if (bVarM30432b.m30438a()) {
                    if (aVarM30431a != null) {
                        long jM30434b = aVarM30431a.m30434b();
                        if (!aVarM30431a.m30435c()) {
                            iM11395f += C3069l.m11395f(jM30434b) + i12;
                        }
                    }
                    i17 = iM11395f;
                    i20 = i25;
                } else {
                    i23 = 0;
                    i17 = iM11395f;
                    i16 = i32;
                    i21 = i25;
                    i18 = i10;
                }
            } else {
                i18 = i24;
                i22 = i29;
                i23 = iMax;
                i16 = i31;
            }
            i19 = i25;
            i20 = i19;
            i15 = i30;
        }
        return C3069l.m11391b(i17 - i12, i20);
    }

    /* JADX INFO: renamed from: l */
    public static final int m30533l(InterfaceC3563r interfaceC3563r, boolean z10, int i10) {
        return z10 ? interfaceC3563r.mo13146S(i10) : interfaceC3563r.mo13151z0(i10);
    }

    /* JADX INFO: renamed from: m */
    public static final long m30534m(InterfaceC3552n0 interfaceC3552n0, InterfaceC7807b1 interfaceC7807b1, long j10, InterfaceC0184l interfaceC0184l) {
        if (AbstractC7912v2.m30549e(AbstractC7912v2.m30547c(interfaceC3552n0)) != 0.0f) {
            int iM30533l = m30533l(interfaceC3552n0, interfaceC7807b1.mo30251q(), Integer.MAX_VALUE);
            return C3069l.m11391b(iM30533l, m30531j(interfaceC3552n0, interfaceC7807b1.mo30251q(), iM30533l));
        }
        C7927y2 c7927y2M30547c = AbstractC7912v2.m30547c(interfaceC3552n0);
        if (c7927y2M30547c != null) {
            c7927y2M30547c.m30614c();
        }
        AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(j10);
        interfaceC0184l.mo27m(abstractC3545l1Mo13148X);
        return C3069l.m11391b(interfaceC7807b1.mo30244j(abstractC3545l1Mo13148X), interfaceC7807b1.mo30240a(abstractC3545l1Mo13148X));
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC3558p0 m30535n(InterfaceC3561q0 interfaceC3561q0, long j10, int i10, int i11, int[] iArr, final C9508c c9508c, InterfaceC7807b1 interfaceC7807b1, int[] iArr2) {
        int iM11972k;
        int i12;
        int i13;
        boolean zMo30251q = interfaceC7807b1.mo30251q();
        C7823e.m mVarMo30250p = interfaceC7807b1.mo30250p();
        C7823e.e eVarMo30249o = interfaceC7807b1.mo30249o();
        if (zMo30251q) {
            int iMo1236x1 = i11 + (interfaceC3561q0.mo1236x1(mVarMo30250p.mo30293a()) * (c9508c.m37039l() - 1));
            int iM11974m = C3173c.m11974m(j10);
            iM11972k = C3173c.m11972k(j10);
            if (iMo1236x1 < iM11974m) {
                iMo1236x1 = iM11974m;
            }
            if (iMo1236x1 <= iM11972k) {
                iM11972k = iMo1236x1;
            }
            mVarMo30250p.mo30292c(interfaceC3561q0, iM11972k, iArr, iArr2);
        } else {
            int iMo1236x12 = i11 + (interfaceC3561q0.mo1236x1(eVarMo30249o.mo30293a()) * (c9508c.m37039l() - 1));
            int iM11974m2 = C3173c.m11974m(j10);
            int iM11972k2 = C3173c.m11972k(j10);
            if (iMo1236x12 < iM11974m2) {
                iMo1236x12 = iM11974m2;
            }
            int i14 = iMo1236x12 > iM11972k2 ? iM11972k2 : iMo1236x12;
            eVarMo30249o.mo30291b(interfaceC3561q0, i14, iArr, interfaceC3561q0.getLayoutDirection(), iArr2);
            iM11972k = i14;
        }
        int iM11975n = C3173c.m11975n(j10);
        int iM11973l = C3173c.m11973l(j10);
        if (i10 < iM11975n) {
            i10 = iM11975n;
        }
        if (i10 <= iM11973l) {
            iM11973l = i10;
        }
        if (zMo30251q) {
            i13 = iM11973l;
            i12 = iM11972k;
        } else {
            i12 = iM11973l;
            i13 = iM11972k;
        }
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, i13, i12, null, new InterfaceC0184l() { // from class: t.t0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC7905u0.m30525d(c9508c, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC3570t0 m30536o(C7823e.e eVar, C7823e.m mVar, InterfaceC4499e.c cVar, int i10, int i11, C7925y0 c7925y0, InterfaceC0572r interfaceC0572r, int i12) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-2010142641, i12, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:470)");
        }
        boolean zMo2162U = ((((i12 & 14) ^ 6) > 4 && interfaceC0572r.mo2162U(eVar)) || (i12 & 6) == 4) | ((((i12 & Opcodes.IREM) ^ 48) > 32 && interfaceC0572r.mo2162U(mVar)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && interfaceC0572r.mo2162U(cVar)) || (i12 & 384) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && interfaceC0572r.mo2172h(i10)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && interfaceC0572r.mo2172h(i11)) || (i12 & 24576) == 16384) | interfaceC0572r.mo2162U(c7925y0);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            C7825e1 c7825e1 = new C7825e1(true, eVar, mVar, eVar.mo30293a(), AbstractC7835g0.f26136a.m30365b(cVar), mVar.mo30293a(), i10, i11, c7925y0, null);
            interfaceC0572r.mo2153L(c7825e1);
            objMo2170f = c7825e1;
        }
        C7825e1 c7825e12 = (C7825e1) objMo2170f;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c7825e12;
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC3552n0 m30537p(Iterator it, AbstractC7930z0 abstractC7930z0) {
        try {
            return (InterfaceC3552n0) it.next();
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
