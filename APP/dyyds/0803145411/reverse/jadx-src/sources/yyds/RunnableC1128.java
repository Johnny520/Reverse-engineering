package yyds;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛵᛶᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1128 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5196;

    public RunnableC1128(C2014 c2014, int i) {
        this.f5196 = 0;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m2316() {
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x03a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        long j2;
        Integer num;
        int iIntValue;
        long j3;
        EnumC0107 enumC0107;
        Object c2658;
        EnumC0231 enumC0231;
        Method method;
        Integer num2;
        int iIntValue2;
        Object c26582;
        EnumC0107 enumC01072;
        Integer num3;
        Object c26583;
        Object c26584;
        Object c26585;
        int i;
        Object c26586 = null;
        switch (this.f5196) {
            case 0:
                return;
            case 1:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if ((C0331.f1745 != null ? 1 : 0) != 0) {
                        C0331.m1001().m1004();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 2:
                C1664 c1664 = C1664.f8513;
                c1664.getClass();
                if (C1664.f8487) {
                    Object obj = C1664.f8475.get();
                    ViewGroup viewGroup = (ViewGroup) C1664.f8470.get();
                    if (obj == null || viewGroup == null || !viewGroup.isAttachedToWindow() || !viewGroup.isShown()) {
                        C1664.m3387(c1664, null, 2);
                        return;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Object objM672 = AbstractC0145.m672(viewGroup, AbstractC2328.m4341(-847843296969582L), new Object[0]);
                    if (objM672 == null) {
                        iIntValue = 0;
                        j2 = 45000;
                        j = -872178581668718L;
                    } else {
                        j = -872178581668718L;
                        String strM4341 = AbstractC2328.m4341(-847890541609838L);
                        Object[] objArr = new Object[0];
                        try {
                            int i2 = AbstractC2293.f11258;
                            C2014 c2014M1327 = AbstractC0476.m1327(objM672);
                            j2 = 45000;
                            try {
                                ((C0903) c2014M1327.f10074).f4118 = 2;
                                C1189 c1189M3892 = c2014M1327.m3892();
                                c1189M3892.m4478();
                                c1189M3892.f12003 = strM4341;
                                AbstractC2328.m4341(-872178581668718L);
                                C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                                Object objM1372 = c0536 != null ? c0536.m1372(Arrays.copyOf(objArr, 0)) : null;
                                if (!(objM1372 instanceof Integer)) {
                                    objM1372 = null;
                                }
                                num = (Integer) objM1372;
                            } catch (Exception e) {
                                e = e;
                                C2336.f11496.m4355(AbstractC2328.m4341(-847946376184686L), e);
                                num = null;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            j2 = 45000;
                        }
                        iIntValue = num != null ? num.intValue() : 0;
                    }
                    C0126 c0126M3385 = C1664.m3385(viewGroup);
                    if (c0126M3385 == null) {
                        j3 = 0;
                    } else {
                        C0126 c0126 = C1664.f8478;
                        if (c0126 == null) {
                            C1664.f8478 = c0126M3385;
                            j3 = 0;
                        } else {
                            int i3 = c0126M3385.f823;
                            int i4 = c0126.f823;
                            j3 = 0;
                            if (i3 > i4 || c0126M3385.f824 > c0126.f824 || ((i3 == i4 && c0126M3385.f825 < c0126.f825) || ((i = c0126.f822) != Integer.MIN_VALUE && c0126M3385.f822 > i))) {
                                C1664.f8478 = c0126M3385;
                                C1664.f8517 = 0L;
                                C1664.f8488 = 0;
                                C1664.f8483 = jElapsedRealtime;
                            }
                        }
                    }
                    C0921 c0921M3394 = C1664.m3394(obj);
                    if (c0921M3394 == null) {
                        C1664.m3399(AbstractC2328.m4341(-845571259269998L));
                        return;
                    }
                    C0993 c0993 = c0921M3394.f4224;
                    C0993 c09932 = C1664.f8495;
                    if (c09932 == null) {
                        C1664.f8495 = c0993;
                    } else if (!c0993.equals(c09932)) {
                        C1664.f8495 = c0993;
                        C1664.f8489 = null;
                        C1664.f8497 = j3;
                        C1664.f8517 = j3;
                        C1664.f8488 = 0;
                        C1664.f8483 = jElapsedRealtime;
                    }
                    if (jElapsedRealtime - C1664.f8483 >= j2) {
                        C2336.f11496.m4354(AbstractC2328.m4341(-845618503910254L) + iIntValue);
                        C1664.m3399(AbstractC2328.m4341(-845717288158062L));
                        return;
                    }
                    Class cls = Integer.TYPE;
                    if (iIntValue <= 0 || iIntValue == C1664.f8508) {
                        enumC0107 = EnumC0107.f751;
                    } else {
                        try {
                            viewGroup.getClass().getMethod(AbstractC2328.m4341(-848019390628718L), cls).invoke(viewGroup, Integer.valueOf(iIntValue - 1));
                            C1664.f8508 = iIntValue;
                            c26585 = EnumC0107.f753;
                        } catch (Throwable th) {
                            c26585 = new C2658(th);
                        }
                        Throwable thM4249 = C2248.m4249(c26585);
                        if (thM4249 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-848118174876526L), thM4249);
                        }
                        EnumC0107 enumC01073 = EnumC0107.f750;
                        if (c26585 instanceof C2658) {
                            c26585 = enumC01073;
                        }
                        enumC0107 = (EnumC0107) c26585;
                    }
                    if (enumC0107 == EnumC0107.f750) {
                        C1664.m3399(AbstractC2328.m4341(-845764532798318L));
                        return;
                    }
                    boolean z = enumC0107 == EnumC0107.f753;
                    if (c0921M3394.f4223) {
                        C1664.m3389(EnumC0676.f3218);
                        C1664.m3388();
                        return;
                    }
                    if (c0921M3394.f4222) {
                        C1664.f8517 = j3;
                        C1664.f8488 = 0;
                        boolean z2 = z || !C1664.m3393(viewGroup);
                        if (iIntValue > 0) {
                            C0126 c01262 = C1664.f8478;
                            if (c01262 != null) {
                                int i5 = c01262.f824;
                                Integer numValueOf = Integer.valueOf(i5);
                                if (i5 < 0) {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    iIntValue2 = numValueOf.intValue();
                                } else {
                                    Object objM6722 = AbstractC0145.m672(viewGroup, AbstractC2328.m4341(-847203346842478L), new Object[0]);
                                    if (objM6722 != null) {
                                        String strM43412 = AbstractC2328.m4341(-847276361286510L);
                                        Object[] objArr2 = new Object[0];
                                        try {
                                            int i6 = AbstractC2293.f11258;
                                            C2014 c2014M13272 = AbstractC0476.m1327(objM6722);
                                            ((C0903) c2014M13272.f10074).f4118 = 2;
                                            C1189 c1189M38922 = c2014M13272.m3892();
                                            c1189M38922.m4478();
                                            c1189M38922.f12003 = strM43412;
                                            AbstractC2328.m4341(j);
                                            C0536 c05362 = (C0536) AbstractC1595.m3281(c1189M38922.mo736());
                                            Object objM13722 = c05362 != null ? c05362.m1372(Arrays.copyOf(objArr2, 0)) : null;
                                            if (!(objM13722 instanceof Integer)) {
                                                objM13722 = null;
                                            }
                                            num2 = (Integer) objM13722;
                                        } catch (Exception e3) {
                                            C2336.f11496.m4355(AbstractC2328.m4341(-847396620370798L), e3);
                                            num2 = null;
                                        }
                                        if (num2 != null) {
                                            iIntValue2 = num2.intValue();
                                        }
                                        if (z2) {
                                            C1664.m3389(EnumC0676.f3222);
                                            C1664.m3388();
                                            return;
                                        }
                                        break;
                                    } else {
                                        num2 = null;
                                        if (num2 != null) {
                                        }
                                        if (z2) {
                                        }
                                    }
                                }
                                int i7 = iIntValue - 9;
                                if (iIntValue2 < (i7 >= 0 ? i7 : 0)) {
                                    if (z2) {
                                    }
                                }
                            }
                        }
                        if (AbstractC1544.m3188(C1664.f8489, c0993)) {
                            enumC0231 = EnumC0231.f1283;
                        } else {
                            long j4 = C1664.f8497;
                            if (j4 == j3 || jElapsedRealtime - j4 >= 1500) {
                                C1664.f8497 = jElapsedRealtime;
                                C1664.f8489 = c0993;
                                C2336.f11496.m4354(AbstractC2328.m4341(-847469634814830L) + c0993.f4508);
                                try {
                                    method = C1664.f8499;
                                } catch (Throwable th2) {
                                    c2658 = new C2658(th2);
                                }
                                if (method == null) {
                                    throw new IllegalArgumentException(AbstractC2328.m4341(-847632843572078L).toString());
                                }
                                c2658 = method.invoke(obj, null);
                                Throwable thM42492 = C2248.m4249(c2658);
                                if (thM42492 == null) {
                                    enumC0231 = EnumC0231.f1285;
                                } else {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-847740217754478L), thM42492);
                                    C1664 c16642 = C1664.f8513;
                                    String strM43413 = AbstractC2328.m4341(-847808937231214L);
                                    c16642.getClass();
                                    C1664.m3399(strM43413);
                                    enumC0231 = EnumC0231.f1282;
                                }
                            } else {
                                enumC0231 = EnumC0231.f1283;
                            }
                        }
                        int iOrdinal = enumC0231.ordinal();
                        if (iOrdinal == 0) {
                            C1664.m3389(z2 ? EnumC0676.f3222 : EnumC0676.f3218);
                        } else {
                            if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    return;
                                }
                                C0188.m801();
                                return;
                            }
                            C1664.m3389(z2 ? EnumC0676.f3222 : EnumC0676.f3218);
                        }
                        C1664.m3388();
                        return;
                    }
                    C1664.m3389(EnumC0676.f3222);
                    if (z || !C1664.m3393(viewGroup)) {
                        C1664.m3388();
                        return;
                    }
                    long j5 = C1664.f8517;
                    if (j5 == j3) {
                        C1664.f8517 = jElapsedRealtime;
                        C1664.f8488 = 0;
                        j5 = jElapsedRealtime;
                    }
                    if (jElapsedRealtime - j5 >= 4000 && jElapsedRealtime - C1664.f8483 >= 4000) {
                        C1664.m3399(AbstractC2328.m4341(-845803187503982L));
                        return;
                    }
                    int height = (viewGroup.getHeight() * 3) / 4;
                    int i8 = height < 1 ? 1 : height;
                    ViewParent viewParentM3396 = C1664.m3396(viewGroup);
                    if (viewParentM3396 != null) {
                        try {
                            Method method2 = C1664.f8481;
                            Object objInvoke = method2 != null ? method2.invoke(viewParentM3396, 0, Integer.valueOf(i8)) : null;
                            c26582 = objInvoke instanceof Integer ? (Integer) objInvoke : null;
                        } catch (Throwable th3) {
                            c26582 = new C2658(th3);
                        }
                        Throwable thM42493 = C2248.m4249(c26582);
                        if (thM42493 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-848281383633774L), thM42493);
                        }
                        if (C2248.m4249(c26582) != null || (num3 = (Integer) c26582) == null) {
                            enumC01072 = EnumC0107.f750;
                        } else {
                            iM1487 = AbstractC0598.m1487(num3.intValue(), 0, i8);
                            if (viewParentM3396 == null) {
                                if (viewGroup.canScrollVertically(1)) {
                                }
                            }
                        }
                    } else if (viewParentM3396 == null && iM1487 > 0) {
                        Method method3 = C1664.f8514;
                        if (method3 == null) {
                            enumC01072 = EnumC0107.f750;
                        } else {
                            try {
                                method3.invoke(viewParentM3396, 0, Integer.valueOf(iM1487));
                                c26584 = EnumC0107.f753;
                            } catch (Throwable th4) {
                                c26584 = new C2658(th4);
                            }
                            Throwable thM42494 = C2248.m4249(c26584);
                            if (thM42494 != null) {
                                C2336.f11496.m4355(AbstractC2328.m4341(-848371577946990L), thM42494);
                            }
                            EnumC0107 enumC01074 = EnumC0107.f750;
                            if (c26584 instanceof C2658) {
                                c26584 = enumC01074;
                            }
                            enumC01072 = (EnumC0107) c26584;
                        }
                    } else if (viewGroup.canScrollVertically(1)) {
                        enumC01072 = EnumC0107.f751;
                    } else {
                        try {
                            viewGroup.getClass().getMethod(AbstractC2328.m4341(-848444592391022L), cls, cls).invoke(viewGroup, 0, Integer.valueOf(i8));
                            c26583 = EnumC0107.f753;
                        } catch (Throwable th5) {
                            c26583 = new C2658(th5);
                        }
                        Throwable thM42495 = C2248.m4249(c26583);
                        if (thM42495 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-848509016900462L), thM42495);
                        }
                        EnumC0107 enumC01075 = EnumC0107.f750;
                        if (c26583 instanceof C2658) {
                            c26583 = enumC01075;
                        }
                        enumC01072 = (EnumC0107) c26583;
                    }
                    int iOrdinal2 = enumC01072.ordinal();
                    if (iOrdinal2 == 0) {
                        C2336.f11496.m4354(AbstractC2328.m4341(-845936331490158L) + iIntValue);
                        viewGroup.performHapticFeedback(4);
                        C1664.m3387(c1664, EnumC0676.f3221, 1);
                        return;
                    }
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 == 2) {
                            C1664.m3399(AbstractC2328.m4341(-845897676784494L));
                            return;
                        } else {
                            C0188.m801();
                            return;
                        }
                    }
                    int i9 = C1664.f8488 + 1;
                    C1664.f8488 = i9;
                    if (i9 > 8) {
                        C1664.m3399(AbstractC2328.m4341(-845850432144238L));
                        return;
                    } else {
                        C1664.m3388();
                        return;
                    }
                    break;
                    break;
                }
                return;
            default:
                C1664.f8513.getClass();
                if (C1664.f8476) {
                    Object obj2 = C1664.f8511.get();
                    if (obj2 == null) {
                        C1664.m3384(AbstractC2328.m4341(-845034388357998L));
                        return;
                    }
                    C2235 c2235M3386 = C1664.m3386(obj2, true);
                    if (c2235M3386 == null) {
                        C1664.m3384(AbstractC2328.m4341(-845060158161774L));
                        return;
                    }
                    List list = c2235M3386.f11036;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (list.size() > C1664.f8502) {
                        C1664.f8502 = list.size();
                        C1664.f8469 = jElapsedRealtime2;
                        C1664.f8506 = 0L;
                    }
                    C1664.m3398(c2235M3386);
                    if (!c2235M3386.f11037) {
                        C1664.m3384(null);
                        return;
                    }
                    if (jElapsedRealtime2 - C1664.f8469 >= 45000) {
                        C1664.m3384(AbstractC2328.m4341(-845098812867438L) + list.size() + AbstractC2328.m4341(-845150352474990L));
                        return;
                    }
                    if (c2235M3386.f11038) {
                        Handler handler = C1664.f8494;
                        RunnableC1128 runnableC1128 = C1664.f8515;
                        handler.removeCallbacks(runnableC1128);
                        handler.postDelayed(runnableC1128, 450L);
                        return;
                    }
                    long j6 = C1664.f8506;
                    if (j6 == 0 || jElapsedRealtime2 - j6 >= 1500) {
                        C1664.f8506 = jElapsedRealtime2;
                        try {
                            Method method4 = C1664.f8499;
                            if (method4 != null) {
                                c26586 = method4.invoke(obj2, null);
                            }
                        } catch (Throwable th6) {
                            c26586 = new C2658(th6);
                        }
                        Throwable thM42496 = C2248.m4249(c26586);
                        if (thM42496 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-845171827311470L), thM42496);
                            C1664 c16643 = C1664.f8513;
                            String strM43414 = AbstractC2328.m4341(-845240546788206L);
                            c16643.getClass();
                            C1664.m3384(strM43414);
                            return;
                        }
                        break;
                    }
                    Handler handler2 = C1664.f8494;
                    RunnableC1128 runnableC11282 = C1664.f8515;
                    handler2.removeCallbacks(runnableC11282);
                    handler2.postDelayed(runnableC11282, 450L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC1128(int i) {
        this.f5196 = i;
    }
}
