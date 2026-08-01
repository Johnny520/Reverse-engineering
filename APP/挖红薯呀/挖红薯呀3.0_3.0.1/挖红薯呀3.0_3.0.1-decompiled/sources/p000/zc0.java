package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.widget.Toast;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import org.luckypray.dexkit.result.MethodData;
import p000.dt0;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class zc0 {

    /* JADX INFO: renamed from: a */
    private static final long f7863a = p30.m2993c(4294847573L);

    /* JADX INFO: renamed from: zc0$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    @InterfaceC0359jl(m1721c = "top.anjao2024.xp1whs.MainActivityKt$DonationThanks$1$1$1", m1722f = "MainActivity.kt", m1723l = {}, m1724m = "invokeSuspend")
    public static final class C0996a extends m51 implements InterfaceC0904ww {

        /* JADX INFO: renamed from: h */
        int f7864h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ c90 f7865i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ wg0 f7866j;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0996a(c90 c90Var, wg0 wg0Var, InterfaceC0322ik interfaceC0322ik) {
            super(2, interfaceC0322ik);
            this.f7865i = c90Var;
            this.f7866j = wg0Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.AbstractC0955y9
        /* JADX INFO: renamed from: g */
        public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
            return new C0996a(this.f7865i, this.f7866j, interfaceC0322ik);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.AbstractC0955y9
        /* JADX INFO: renamed from: m */
        public final Object mo16m(Object obj) {
            if (this.f7864h != 0) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
            zc0.m5531c0(this.f7866j, ((dp0) this.f7865i.f743e.f1697b).m720g());
            return na1.f4229a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p000.InterfaceC0904ww
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0966yk interfaceC0966yk, InterfaceC0322ik interfaceC0322ik) {
            return ((C0996a) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1.f4229a);
        }
    }

    /* JADX INFO: renamed from: zc0$b */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    @InterfaceC0359jl(m1721c = "top.anjao2024.xp1whs.MainActivityKt$HomeTab$1$2$2$1", m1722f = "MainActivity.kt", m1723l = {}, m1724m = "invokeSuspend")
    public static final class C0997b extends m51 implements InterfaceC0904ww {

        /* JADX INFO: renamed from: h */
        int f7867h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ c90 f7868i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ wg0 f7869j;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0997b(c90 c90Var, wg0 wg0Var, InterfaceC0322ik interfaceC0322ik) {
            super(2, interfaceC0322ik);
            this.f7868i = c90Var;
            this.f7869j = wg0Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.AbstractC0955y9
        /* JADX INFO: renamed from: g */
        public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
            return new C0997b(this.f7868i, this.f7869j, interfaceC0322ik);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.AbstractC0955y9
        /* JADX INFO: renamed from: m */
        public final Object mo16m(Object obj) {
            if (this.f7867h != 0) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
            zc0.m5555n0(this.f7869j, ((dp0) this.f7868i.f743e.f1697b).m720g());
            return na1.f4229a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p000.InterfaceC0904ww
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0966yk interfaceC0966yk, InterfaceC0322ik interfaceC0322ik) {
            return ((C0997b) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1.f4229a);
        }
    }

    /* JADX INFO: renamed from: zc0$c */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    @InterfaceC0359jl(m1721c = "top.anjao2024.xp1whs.MainActivityKt$MainScreen$2$1$1", m1722f = "MainActivity.kt", m1723l = {231}, m1724m = "invokeSuspend")
    public static final class C0998c extends m51 implements InterfaceC0904ww {

        /* JADX INFO: renamed from: h */
        int f7870h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ lo0 f7871i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ wg0 f7872j;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0998c(lo0 lo0Var, wg0 wg0Var, InterfaceC0322ik interfaceC0322ik) {
            super(2, interfaceC0322ik);
            this.f7871i = lo0Var;
            this.f7872j = wg0Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.AbstractC0955y9
        /* JADX INFO: renamed from: g */
        public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
            return new C0998c(this.f7871i, this.f7872j, interfaceC0322ik);
        }

        /* JADX DEBUG: Class process forced to load method for inline: lo0.g(lo0, int, m51):java.lang.Object */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.AbstractC0955y9
        /* JADX INFO: renamed from: m */
        public final Object mo16m(Object obj) {
            int i = this.f7870h;
            if (i == 0) {
                w60.m4891M(obj);
                lo0 lo0Var = this.f7871i;
                int iM5477C0 = zc0.m5477C0(this.f7872j);
                this.f7870h = 1;
                Object objM2033f = lo0Var.m2033f(iM5477C0, s91.m4028O(0.0f, 0.0f, null, 7), this);
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                if (objM2033f == enumC1007zk) {
                    return enumC1007zk;
                }
            } else {
                if (i != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
            }
            return na1.f4229a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p000.InterfaceC0904ww
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0966yk interfaceC0966yk, InterfaceC0322ik interfaceC0322ik) {
            return ((C0998c) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1.f4229a);
        }
    }

    /* JADX INFO: renamed from: zc0$d */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    @InterfaceC0359jl(m1721c = "top.anjao2024.xp1whs.MainActivityKt$MainScreen$2$2$1", m1722f = "MainActivity.kt", m1723l = {}, m1724m = "invokeSuspend")
    public static final class C0999d extends m51 implements InterfaceC0904ww {

        /* JADX INFO: renamed from: h */
        int f7873h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ lo0 f7874i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ wg0 f7875j;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0999d(lo0 lo0Var, wg0 wg0Var, InterfaceC0322ik interfaceC0322ik) {
            super(2, interfaceC0322ik);
            this.f7874i = lo0Var;
            this.f7875j = wg0Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.AbstractC0955y9
        /* JADX INFO: renamed from: g */
        public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
            return new C0999d(this.f7874i, this.f7875j, interfaceC0322ik);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p000.AbstractC0955y9
        /* JADX INFO: renamed from: m */
        public final Object mo16m(Object obj) {
            if (this.f7873h != 0) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
            zc0.m5487H0(this.f7875j, this.f7874i.f3543d.f866b.m720g());
            return na1.f4229a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p000.InterfaceC0904ww
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0966yk interfaceC0966yk, InterfaceC0322ik interfaceC0322ik) {
            return ((C0999d) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1.f4229a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final na1 m5473A0(String str, String str2, int i, InterfaceC0356ji interfaceC0356ji, int i2) {
        m5579z0(str, str2, interfaceC0356ji, j50.m1649A(i | 1));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5475B0(final lf1 lf1Var, final boolean z, final InterfaceC0742sw interfaceC0742sw, pe0 pe0Var, int i, boolean z2, InterfaceC0356ji interfaceC0356ji, final int i2, final int i3) {
        int i4;
        final pe0 pe0Var2;
        int i5;
        int i6;
        int i7;
        C0616pi c0616pi;
        final int i8;
        final boolean z3;
        ht0 ht0VarM3121r;
        interfaceC0742sw.getClass();
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3091X(-1971421103);
        int i9 = 4;
        if ((i2 & 6) == 0) {
            i4 = (c0616pi2.m3108h(lf1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0616pi2.m3106g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0616pi2.m3108h(interfaceC0742sw) ? 256 : 128;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                pe0Var2 = pe0Var;
                i4 |= c0616pi2.m3104f(pe0Var2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    i4 |= c0616pi2.m3100d(i6) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                    if ((196608 & i2) == 0) {
                        i4 |= c0616pi2.m3106g(z2) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536;
                    }
                    if (c0616pi2.m3082O(i4 & 1, (74899 & i4) == 74898)) {
                        c0616pi = c0616pi2;
                        c0616pi.m3085R();
                        i8 = i6;
                        z3 = z2;
                    } else {
                        pe0 pe0Var3 = i10 != 0 ? me0.f3922a : pe0Var2;
                        final int i11 = i5 != 0 ? 0 : i6;
                        final boolean z4 = i7 != 0 ? false : z2;
                        Object objM3080L = c0616pi2.m3080L();
                        if (objM3080L == C0320ii.f2572a) {
                            objM3080L = new dp0(i11);
                            c0616pi2.m3107g0(objM3080L);
                        }
                        final wg0 wg0Var = (wg0) objM3080L;
                        c0616pi = c0616pi2;
                        z60.m5432b(pe0Var3.mo2499c(s11.f5621b), null, AbstractC0398kl.m1937w(-2117769556, new C0956ya(i9, wg0Var), c0616pi2), null, null, 0, 0L, 0L, null, AbstractC0398kl.m1937w(925233186, new InterfaceC0941xw() { // from class: ic0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p000.InterfaceC0941xw
                            /* JADX INFO: renamed from: a */
                            public final Object mo353a(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return zc0.m5479D0(i11, wg0Var, lf1Var, z, interfaceC0742sw, z4, (jn0) obj, (InterfaceC0356ji) obj2, iIntValue);
                            }
                        }, c0616pi2), c0616pi, 805306752);
                        i8 = i11;
                        z3 = z4;
                        pe0Var2 = pe0Var3;
                    }
                    ht0VarM3121r = c0616pi.m3121r();
                    if (ht0VarM3121r == null) {
                        ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: jc0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p000.InterfaceC0904ww
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return zc0.m5485G0(lf1Var, z, interfaceC0742sw, pe0Var2, i8, z3, i2, i3, (InterfaceC0356ji) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                i4 |= 196608;
                if (c0616pi2.m3082O(i4 & 1, (74899 & i4) == 74898)) {
                }
                ht0VarM3121r = c0616pi.m3121r();
                if (ht0VarM3121r == null) {
                }
            }
            i6 = i;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if (c0616pi2.m3082O(i4 & 1, (74899 & i4) == 74898)) {
            }
            ht0VarM3121r = c0616pi.m3121r();
            if (ht0VarM3121r == null) {
            }
        }
        pe0Var2 = pe0Var;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if (c0616pi2.m3082O(i4 & 1, (74899 & i4) == 74898)) {
        }
        ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final int m5477C0(wg0 wg0Var) {
        return ((dp0) wg0Var).m720g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final na1 m5479D0(final int i, wg0 wg0Var, final lf1 lf1Var, final boolean z, final InterfaceC0742sw interfaceC0742sw, final boolean z2, jn0 jn0Var, InterfaceC0356ji interfaceC0356ji, int i2) {
        int i3;
        jn0Var.getClass();
        if ((i2 & 6) == 0) {
            i3 = i2 | (((C0616pi) interfaceC0356ji).m3104f(jn0Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = 0;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i3 & 1, (i3 & 19) != 18)) {
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (objM3080L == c0675r3) {
                objM3080L = new sc0(i4);
                c0616pi.m3107g0(objM3080L);
            }
            final InterfaceC0298hw interfaceC0298hw = (InterfaceC0298hw) objM3080L;
            no0 no0Var = oo0.f4599a;
            Object[] objArr = new Object[0];
            C0111d c0111d = C0399km.f3217J;
            boolean zM3100d = c0616pi.m3100d(i) | c0616pi.m3098c(0.0f);
            Object objM3080L2 = c0616pi.m3080L();
            if (zM3100d || objM3080L2 == c0675r3) {
                objM3080L2 = new InterfaceC0298hw() { // from class: mo0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0298hw
                    public final Object invoke() {
                        return new C0399km(i, 0.0f, interfaceC0298hw);
                    }
                };
                c0616pi.m3107g0(objM3080L2);
            }
            C0399km c0399km = (C0399km) r60.m3423y(objArr, c0111d, (InterfaceC0298hw) objM3080L2, c0616pi, 0);
            c0399km.f3218I.setValue(interfaceC0298hw);
            Integer numValueOf = Integer.valueOf(m5477C0(wg0Var));
            boolean zM3104f = c0616pi.m3104f(c0399km);
            Object objM3080L3 = c0616pi.m3080L();
            if (zM3104f || objM3080L3 == c0675r3) {
                objM3080L3 = new C0998c(c0399km, wg0Var, null);
                c0616pi.m3107g0(objM3080L3);
            }
            s91.m4039d(c0616pi, (InterfaceC0904ww) objM3080L3, numValueOf);
            Integer numValueOf2 = Integer.valueOf(c0399km.f3543d.f866b.m720g());
            boolean zM3104f2 = c0616pi.m3104f(c0399km);
            Object objM3080L4 = c0616pi.m3080L();
            if (zM3104f2 || objM3080L4 == c0675r3) {
                objM3080L4 = new C0999d(c0399km, wg0Var, null);
                c0616pi.m3107g0(objM3080L4);
            }
            s91.m4039d(c0616pi, (InterfaceC0904ww) objM3080L4, numValueOf2);
            r60.m3399a(c0399km, rd0.m3444C(me0.f3922a, jn0Var), null, null, null, null, false, null, null, null, AbstractC0398kl.m1937w(213284899, new InterfaceC0978yw() { // from class: tc0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0978yw
                /* JADX INFO: renamed from: b */
                public final Object mo259b(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return zc0.m5483F0(lf1Var, z, interfaceC0742sw, z2, (ao0) obj, ((Integer) obj2).intValue(), (InterfaceC0356ji) obj3, iIntValue);
                }
            }, c0616pi), c0616pi, 0);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final int m5481E0() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final na1 m5483F0(lf1 lf1Var, boolean z, InterfaceC0742sw interfaceC0742sw, boolean z2, ao0 ao0Var, int i, InterfaceC0356ji interfaceC0356ji, int i2) {
        C0616pi c0616pi;
        ao0Var.getClass();
        if (i != 0) {
            if (i != 1) {
                c0616pi = (C0616pi) interfaceC0356ji;
                c0616pi.m3090W(1704379263);
            } else {
                c0616pi = (C0616pi) interfaceC0356ji;
                c0616pi.m3090W(-1191634549);
                m5511T0(null, z2, c0616pi, 0, 1);
            }
            c0616pi.m3119p(false);
        } else {
            C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
            c0616pi2.m3090W(-1191640285);
            m5541g0(lf1Var, z, interfaceC0742sw, null, c0616pi2, 0, 8);
            c0616pi2.m3119p(false);
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final na1 m5485G0(lf1 lf1Var, boolean z, InterfaceC0742sw interfaceC0742sw, pe0 pe0Var, int i, boolean z2, int i2, int i3, InterfaceC0356ji interfaceC0356ji, int i4) {
        m5475B0(lf1Var, z, interfaceC0742sw, pe0Var, i, z2, interfaceC0356ji, j50.m1649A(i2 | 1), i3);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m5487H0(wg0 wg0Var, int i) {
        ((dp0) wg0Var).m721h(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final na1 m5489I0(wg0 wg0Var, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2 = 2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            oi0.m2927a(null, ((C0429lf) c0616pi.m3112j(AbstractC0510nf.f4248a)).f3467p, 0L, 3.0f, null, AbstractC0398kl.m1937w(-9025243, new C0835vc(i2, wg0Var), c0616pi), c0616pi, 199680);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final na1 m5491J0(final wg0 wg0Var, jw0 jw0Var, InterfaceC0356ji interfaceC0356ji, int i) {
        jw0 jw0Var2;
        int i2;
        jw0Var.getClass();
        if ((i & 6) == 0) {
            jw0Var2 = jw0Var;
            i2 = i | (((C0616pi) interfaceC0356ji).m3104f(jw0Var2) ? 4 : 2);
        } else {
            jw0Var2 = jw0Var;
            i2 = i;
        }
        final int i3 = 0;
        final int i4 = 1;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i2 & 1, (i2 & 19) != 18)) {
            boolean z = m5477C0(wg0Var) == 0;
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (objM3080L == c0675r3) {
                objM3080L = new InterfaceC0298hw() { // from class: oc0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0298hw
                    public final Object invoke() {
                        int i5 = i3;
                        wg0 wg0Var2 = wg0Var;
                        switch (i5) {
                            case 0:
                                return zc0.m5493K0(wg0Var2);
                            default:
                                return zc0.m5495L0(wg0Var2);
                        }
                    }
                };
                c0616pi.m3107g0(objM3080L);
            }
            C0551oh c0551oh = C0551oh.f4557a;
            int i5 = (i2 & 14) | 1576320;
            oi0.m2928b(jw0Var2, z, (InterfaceC0298hw) objM3080L, c0551oh.m2924x(), null, false, c0551oh.m2914n(), false, z60.m5447q(C0281hf.m1305d(), C0281hf.m1305d(), C0207ff.m1093b(0.12f, C0281hf.m1305d()), c0616pi), c0616pi, i5);
            boolean z2 = m5477C0(wg0Var) == 1;
            Object objM3080L2 = c0616pi.m3080L();
            if (objM3080L2 == c0675r3) {
                objM3080L2 = new InterfaceC0298hw() { // from class: oc0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0298hw
                    public final Object invoke() {
                        int i52 = i4;
                        wg0 wg0Var2 = wg0Var;
                        switch (i52) {
                            case 0:
                                return zc0.m5493K0(wg0Var2);
                            default:
                                return zc0.m5495L0(wg0Var2);
                        }
                    }
                };
                c0616pi.m3107g0(objM3080L2);
            }
            oi0.m2928b(jw0Var, z2, (InterfaceC0298hw) objM3080L2, c0551oh.m2922v(), null, false, c0551oh.m2913m(), false, z60.m5447q(C0281hf.m1305d(), C0281hf.m1305d(), C0207ff.m1093b(0.12f, C0281hf.m1305d()), c0616pi), c0616pi, i5);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final na1 m5493K0(wg0 wg0Var) {
        m5487H0(wg0Var, 0);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final na1 m5495L0(wg0 wg0Var) {
        m5487H0(wg0Var, 1);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public static final void m5497M0(InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        interfaceC0904ww.getClass();
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-485107013);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c0616pi.m3108h(interfaceC0904ww) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 1;
        if (c0616pi.m3082O(i2 & 1, (i2 & 3) != 2)) {
            C0701rt c0701rt = s11.f5620a;
            dw0 dw0VarM974a = ew0.m974a(14.0f);
            g41 g41Var = AbstractC0510nf.f4248a;
            long j = ((C0429lf) c0616pi.m3112j(g41Var)).f3467p;
            long jM2696b = AbstractC0510nf.m2696b(j, c0616pi);
            long j2 = C0207ff.f1707g;
            long jM1093b = C0207ff.m1093b(0.38f, jM2696b);
            C0205fd c0205fdM3063w = pf1.m3063w((C0429lf) c0616pi.m3112j(g41Var));
            if (j == 16) {
                j = c0205fdM3063w.f1678a;
            }
            long j3 = j;
            if (jM2696b == 16) {
                jM2696b = c0205fdM3063w.f1679b;
            }
            long j4 = jM2696b;
            if (j2 == 16) {
                j2 = c0205fdM3063w.f1680c;
            }
            AbstractC0307i4.m1525a(c0701rt, dw0VarM974a, new C0205fd(j3, j4, j2, jM1093b != 16 ? jM1093b : c0205fdM3063w.f1681d), new C0242gd((62 & 1) != 0 ? 0.0f : 2.0f, o30.f4440j, o30.f4439i), AbstractC0398kl.m1937w(580226185, new C0835vc(i4, interfaceC0904ww), c0616pi), c0616pi, 196614);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new q80(i, i3, interfaceC0904ww);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final na1 m5499N0(InterfaceC0904ww interfaceC0904ww, InterfaceC0887wf interfaceC0887wf, InterfaceC0356ji interfaceC0356ji, int i) {
        interfaceC0887wf.getClass();
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 17) != 16)) {
            pe0 pe0VarM3445D = rd0.m3445D(me0.f3922a);
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarM3445D);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, c0838vfM4197a);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            interfaceC0904ww.invoke(c0616pi, 0);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r19v0, types: [ji, pi] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [pi] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ji, pi] */
    /* JADX WARN: Type inference failed for: r1v8, types: [pi] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: O */
    public static final void m5500O(InterfaceC0356ji interfaceC0356ji, int i) {
        ?? r15;
        ?? r1;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(996003355);
        int i2 = 0;
        int i3 = 1;
        if (c0616pi.m3082O(i & 1, i != 0)) {
            Context context = (Context) c0616pi.m3112j(AbstractC0676r4.f5291b);
            List listM2783w = o30.m2783w(new uo0("DexKit", new uo0("https://github.com/LuckyPray/DexKit", "开源的高性能DEX反混淆与Hook点查找库")), new uo0("Frida", new uo0("https://github.com/frida/frida", "开源跨平台动态插桩与逆向调试框架")), new uo0("DeepSeek", new uo0("https://www.deepseek.com/", "深度求索出品的国产大语言模型")), new uo0("Trae CN", new uo0("https://www.trae.cn/", "字节跳动出品的AI编程IDE")), new uo0("JADX", new uo0("https://github.com/skylot/jadx", "开源的Android DEX/APK反编译工具")), new uo0("JADX-AI-MCP", new uo0("https://github.com/zinja-coder/jadx-ai-mcp", "开源的基于MCP协议的JADX智能AI插件")));
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, me0.f3922a);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, c0838vfM4197a);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            c0616pi.m3090W(2127425229);
            int i4 = 0;
            ?? r12 = c0616pi;
            for (Object obj : listM2783w) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    o30.m2757A();
                    throw null;
                }
                uo0 uo0Var = (uo0) obj;
                String str = (String) uo0Var.f6274d;
                uo0 uo0Var2 = (uo0) uo0Var.f6275e;
                String str2 = (String) uo0Var2.f6274d;
                String str3 = (String) uo0Var2.f6275e;
                C0701rt c0701rt = s11.f5620a;
                boolean zM3104f = r12.m3104f(str2) | r12.m3108h(context);
                Object objM3080L = r12.m3080L();
                if (zM3104f || objM3080L == C0320ii.f2572a) {
                    objM3080L = new kc0(str2, context);
                    r12.m3107g0(objM3080L);
                }
                pe0 pe0VarM3447F = rd0.m3447F(rd0.m3481j(c0701rt, (InterfaceC0298hw) objM3080L), 0.0f, 4.0f, i3);
                iw0 iw0VarM1508a = hw0.m1508a(rd0.f5362a, C0496n2.f4154n, r12, i2);
                int iHashCode2 = Long.hashCode(r12.f4878T);
                fq0 fq0VarM3115l2 = r12.m3115l();
                pe0 pe0VarM4020E2 = s91.m4020E(r12, pe0VarM3447F);
                InterfaceC0210fi.f1733b.getClass();
                C0094cj c0094cj2 = C0173ei.f1457b;
                r12.m3093Z();
                if (r12.f4877S) {
                    r12.m3114k(c0094cj2);
                } else {
                    r12.m3113j0();
                }
                w60.m4888J(r12, C0173ei.f1460e, iw0VarM1508a);
                w60.m4888J(r12, C0173ei.f1459d, fq0VarM3115l2);
                w60.m4918y(r12, Integer.valueOf(iHashCode2), C0173ei.f1461f);
                w60.m4885G(r12, C0173ei.f1462g);
                w60.m4888J(r12, C0173ei.f1458c, pe0VarM4020E2);
                ?? r19 = r12;
                d71.m659b(str, null, C0281hf.m1305d(), j50.m1667q(13), C1018zv.f8006g, null, 0L, null, 0L, 0, false, 0, 0, null, r19, 1597440, 0, 262058);
                d71.m659b(" - " + str3, null, ((C0429lf) r19.m3112j(AbstractC0510nf.f4248a)).f3470s, j50.m1667q(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, r19, 24576, 0, 262122);
                ?? r13 = r19;
                r13.m3119p(true);
                i3 = 1;
                i4 = i5;
                context = context;
                i2 = 0;
                r12 = r13;
            }
            ?? r152 = i2;
            r12.m3119p(r152);
            r12.m3119p(i3);
            r1 = r12;
            r15 = r152;
        } else {
            r15 = 0;
            c0616pi.m3085R();
            r1 = c0616pi;
        }
        ht0 ht0VarM3121r = r1.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new lc0(i, r15);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final na1 m5501O0(InterfaceC0904ww interfaceC0904ww, int i, InterfaceC0356ji interfaceC0356ji, int i2) {
        m5497M0(interfaceC0904ww, interfaceC0356ji, j50.m1649A(i | 1));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final na1 m5502P(String str, Context context) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
            Toast.makeText(context, "未找到浏览器", 0).show();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5503P0(final String str, pe0 pe0Var, InterfaceC0356ji interfaceC0356ji, final int i, final int i2) {
        int i3;
        pe0 pe0Var2;
        C0616pi c0616pi;
        final pe0 pe0Var3;
        ht0 ht0VarM3121r;
        str.getClass();
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3091X(1542540346);
        if ((i & 6) == 0) {
            i3 = i | (c0616pi2.m3104f(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                pe0Var2 = pe0Var;
                i3 |= c0616pi2.m3104f(pe0Var2) ? 32 : 16;
            }
            if (c0616pi2.m3082O(i3 & 1, (i3 & 19) == 18)) {
                c0616pi = c0616pi2;
                c0616pi.m3085R();
                pe0Var3 = pe0Var2;
            } else {
                c0616pi = c0616pi2;
                pe0Var3 = i4 != 0 ? me0.f3922a : pe0Var2;
                d71.m659b(str, pe0Var3, ((C0429lf) c0616pi2.m3112j(AbstractC0510nf.f4248a)).f3468q, j50.m1667q(16), C1018zv.f8007h, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, (i3 & 14) | 1597440 | (i3 & 112), 0, 262056);
            }
            ht0VarM3121r = c0616pi.m3121r();
            if (ht0VarM3121r == null) {
                ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: pc0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0904ww
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return zc0.m5505Q0(str, pe0Var3, i, i2, (InterfaceC0356ji) obj, iIntValue);
                    }
                };
                return;
            }
            return;
        }
        i3 |= 48;
        pe0Var2 = pe0Var;
        if (c0616pi2.m3082O(i3 & 1, (i3 & 19) == 18)) {
        }
        ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final na1 m5504Q(int i, InterfaceC0356ji interfaceC0356ji, int i2) {
        m5500O(interfaceC0356ji, j50.m1649A(i | 1));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final na1 m5505Q0(String str, pe0 pe0Var, int i, int i2, InterfaceC0356ji interfaceC0356ji, int i3) {
        m5503P0(str, pe0Var, interfaceC0356ji, j50.m1649A(i | 1), i2);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static final void m5506R(boolean z, InterfaceC0356ji interfaceC0356ji, final int i, final int i2) {
        final boolean z2;
        int i3;
        ArrayList arrayList;
        float f;
        C0675r3 c0675r3;
        boolean z3;
        oh0 oh0Var;
        boolean z4;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-280518276);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = i | (c0616pi.m3106g(z2) ? 4 : 2);
        } else {
            z2 = z;
            i3 = i;
        }
        if (c0616pi.m3082O(i3 & 1, (i3 & 3) != 2)) {
            boolean z5 = i4 != 0 ? false : z2;
            Context context = (Context) c0616pi.m3112j(AbstractC0676r4.f5291b);
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r32 = C0320ii.f2572a;
            if (objM3080L == c0675r32) {
                objM3080L = r60.m3419u(Boolean.valueOf(z5));
                c0616pi.m3107g0(objM3080L);
            }
            oh0 oh0Var2 = (oh0) objM3080L;
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            me0 me0Var = me0.f3922a;
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, me0Var);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, c0838vfM4197a);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            long jM1667q = j50.m1667q(13);
            g41 g41Var = AbstractC0510nf.f4248a;
            d71.m659b("感谢以下小伙伴的自愿打赏支持，你们的支持是我继续更新的动力！", null, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s, jM1667q, null, null, 0L, null, j50.m1667q(20), 0, false, 0, 0, null, c0616pi, 24582, 48, 260074);
            u50.m4262c(c0616pi, s11.m3999b(me0Var, 4.0f));
            d71.m659b("（不愿意透露姓名的打赏者以「匿名小伙伴x号」代替）", null, C0207ff.m1093b(0.55f, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s), j50.m1667q(11), null, null, 0L, null, j50.m1667q(16), 0, false, 0, 0, null, c0616pi, 24582, 48, 260074);
            u50.m4262c(c0616pi, s11.m3999b(me0Var, 2.0f));
            d71.m659b("（排名按打赏时间先后顺序，与金额大小无关）", null, C0207ff.m1093b(0.55f, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s), j50.m1667q(11), null, null, 0L, null, j50.m1667q(16), 0, false, 0, 0, null, c0616pi, 24582, 48, 260074);
            C0616pi c0616pi2 = c0616pi;
            u50.m4262c(c0616pi2, s11.m3999b(me0Var, 10.0f));
            List listM2783w = o30.m2783w("匿名小伙伴1号", "cuan", "*夏", "疏**月", "*峰", "匿名小伙伴2号", "晚安酒", "*喋", "匿名小伙伴3号", "匿名小伙伴4号", "匿名小伙伴5号", "好**满");
            if (listM2783w instanceof RandomAccess) {
                int size = listM2783w.size();
                arrayList = new ArrayList((size / 5) + (size % 5 == 0 ? 0 : 1));
                for (int i5 = 0; i5 >= 0 && i5 < size; i5 += 5) {
                    int i6 = size - i5;
                    if (5 <= i6) {
                        i6 = 5;
                    }
                    ArrayList arrayList2 = new ArrayList(i6);
                    for (int i7 = 0; i7 < i6; i7++) {
                        arrayList2.add(listM2783w.get(i7 + i5));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator it = listM2783w.iterator();
                it.getClass();
                Iterator itM4408n = !it.hasNext() ? C0257gs.f2042d : v50.m4408n(new u11(it, null));
                while (itM4408n.hasNext()) {
                    arrayList.add((List) itM4408n.next());
                }
            }
            ArrayList arrayList3 = arrayList;
            c90 c90VarM803a = e90.m803a(c0616pi2);
            Object objM3080L2 = c0616pi2.m3080L();
            if (objM3080L2 == c0675r32) {
                objM3080L2 = new dp0(0);
                c0616pi2.m3107g0(objM3080L2);
            }
            wg0 wg0Var = (wg0) objM3080L2;
            Integer numValueOf = Integer.valueOf(((dp0) c90VarM803a.f743e.f1697b).m720g());
            boolean zM3104f = c0616pi2.m3104f(c90VarM803a);
            Object objM3080L3 = c0616pi2.m3080L();
            if (zM3104f || objM3080L3 == c0675r32) {
                objM3080L3 = new C0996a(c90VarM803a, wg0Var, null);
                c0616pi2.m3107g0(objM3080L3);
            }
            s91.m4039d(c0616pi2, (InterfaceC0904ww) objM3080L3, numValueOf);
            C0701rt c0701rt = s11.f5620a;
            f21 f21VarM4280w = u50.m4280w(c90VarM803a, c0616pi2);
            boolean zM3108h = c0616pi2.m3108h(arrayList3);
            Object objM3080L4 = c0616pi2.m3080L();
            if (zM3108h || objM3080L4 == c0675r32) {
                objM3080L4 = new yc0(0, arrayList3);
                c0616pi2.m3107g0(objM3080L4);
            }
            w60.m4894a(c0701rt, c90VarM803a, null, null, null, f21VarM4280w, null, (InterfaceC0742sw) objM3080L4, c0616pi2, 12582918);
            if (arrayList3.size() > 1) {
                c0616pi2.m3090W(-1224893668);
                pe0 pe0VarM3448G = rd0.m3448G(c0701rt, 8.0f);
                iw0 iw0VarM1508a = hw0.m1508a(rd0.f5364c, C0496n2.f4154n, c0616pi2, 6);
                int iHashCode2 = Long.hashCode(c0616pi2.f4878T);
                fq0 fq0VarM3115l2 = c0616pi2.m3115l();
                pe0 pe0VarM4020E2 = s91.m4020E(c0616pi2, pe0VarM3448G);
                InterfaceC0210fi.f1733b.getClass();
                C0094cj c0094cj2 = C0173ei.f1457b;
                c0616pi2.m3093Z();
                if (c0616pi2.f4877S) {
                    c0616pi2.m3114k(c0094cj2);
                } else {
                    c0616pi2.m3113j0();
                }
                w60.m4888J(c0616pi2, C0173ei.f1460e, iw0VarM1508a);
                w60.m4888J(c0616pi2, C0173ei.f1459d, fq0VarM3115l2);
                w60.m4918y(c0616pi2, Integer.valueOf(iHashCode2), C0173ei.f1461f);
                w60.m4885G(c0616pi2, C0173ei.f1462g);
                w60.m4888J(c0616pi2, C0173ei.f1458c, pe0VarM4020E2);
                c0616pi2.m3090W(1810546384);
                int size2 = arrayList3.size();
                int i8 = 0;
                while (i8 < size2) {
                    pe0 pe0VarM2974J = p30.m2974J(s11.m4000c(rd0.m3447F(me0Var, 3.0f, 0.0f, 2), i8 == m5528b0(wg0Var) ? 8.0f : 6.0f), ew0.f1541a, 518143);
                    int iM5528b0 = m5528b0(wg0Var);
                    long jM1305d = C0281hf.m1305d();
                    if (i8 != iM5528b0) {
                        jM1305d = C0207ff.m1093b(0.25f, jM1305d);
                    }
                    AbstractC0993za.m5464a(s91.m4047l(pe0VarM2974J, jM1305d, pf1.f4843i), c0616pi2, 0);
                    i8++;
                }
                c0616pi2.m3119p(false);
                c0616pi2.m3119p(true);
                u50.m4262c(c0616pi2, s11.m3999b(me0Var, 4.0f));
                f = 8.0f;
                c0675r3 = c0675r32;
                d71.m659b("← 左右滑动查看更多 →", s11.f5620a, C0207ff.m1093b(0.5f, ((C0429lf) c0616pi2.m3112j(AbstractC0510nf.f4248a)).f3470s), j50.m1667q(11), null, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi2, 24630, 0, 261096);
                c0616pi2 = c0616pi2;
                z3 = false;
            } else {
                f = 8.0f;
                c0675r3 = c0675r32;
                z3 = false;
                c0616pi2.m3090W(-1262815472);
            }
            c0616pi2.m3119p(z3);
            u50.m4262c(c0616pi2, s11.m3999b(me0Var, f));
            g41 g41Var2 = AbstractC0510nf.f4248a;
            AbstractC0398kl.m1917c(null, 0.5f, ((C0429lf) c0616pi2.m3112j(g41Var2)).f3469r, c0616pi2, 48, 1);
            u50.m4262c(c0616pi2, s11.m3999b(me0Var, f));
            C0616pi c0616pi3 = c0616pi2;
            float f2 = f;
            d71.m659b("如果你觉得本模块对你有帮助，欢迎自愿打赏支持~", null, ((C0429lf) c0616pi2.m3112j(g41Var2)).f3470s, j50.m1667q(12), null, null, 0L, null, j50.m1667q(18), 0, false, 0, 0, null, c0616pi3, 24582, 48, 260074);
            c0616pi = c0616pi3;
            u50.m4262c(c0616pi, s11.m3999b(me0Var, 10.0f));
            ln0 ln0Var = AbstractC0124dc.f1045a;
            long jM1305d2 = C0281hf.m1305d();
            long j = C0207ff.f1707g;
            C0429lf c0429lf = (C0429lf) c0616pi.m3112j(g41Var2);
            C0086cc c0086cc = c0429lf.f3448W;
            if (c0086cc == null) {
                C0086cc c0086cc2 = new C0086cc(AbstractC0510nf.m2697c(c0429lf, AbstractC0398kl.f3200k), AbstractC0510nf.m2697c(c0429lf, AbstractC0398kl.f3206q), C0207ff.m1093b(AbstractC0398kl.f3202m, AbstractC0510nf.m2697c(c0429lf, AbstractC0398kl.f3201l)), C0207ff.m1093b(AbstractC0398kl.f3204o, AbstractC0510nf.m2697c(c0429lf, AbstractC0398kl.f3203n)));
                c0429lf.f3448W = c0086cc2;
                c0086cc = c0086cc2;
            }
            if (jM1305d2 == 16) {
                jM1305d2 = c0086cc.f778a;
            }
            long j2 = jM1305d2;
            long j3 = j != 16 ? j : c0086cc.f779b;
            long j4 = j != 16 ? j : c0086cc.f780c;
            if (j == 16) {
                j = c0086cc.f781d;
            }
            C0086cc c0086cc3 = new C0086cc(j2, j3, j4, j);
            dw0 dw0VarM974a = ew0.m974a(f2);
            C0701rt c0701rt2 = s11.f5620a;
            Object objM3080L5 = c0616pi.m3080L();
            C0675r3 c0675r33 = c0675r3;
            if (objM3080L5 == c0675r33) {
                oh0Var = oh0Var2;
                objM3080L5 = new q70(oh0Var, 6);
                c0616pi.m3107g0(objM3080L5);
            } else {
                oh0Var = oh0Var2;
            }
            InterfaceC0298hw interfaceC0298hw = (InterfaceC0298hw) objM3080L5;
            C0551oh c0551oh = C0551oh.f4557a;
            o30.m2764d(interfaceC0298hw, c0701rt2, false, dw0VarM974a, c0086cc3, null, null, c0551oh.m2919s(), c0616pi, 805306422, 484);
            c0616pi.m3119p(true);
            if (m5522Z(oh0Var)) {
                c0616pi.m3090W(1091885322);
                Object objM3080L6 = c0616pi.m3080L();
                if (objM3080L6 == c0675r33) {
                    objM3080L6 = BitmapFactory.decodeResource(context.getResources(), dt0.C0143c.f1182a);
                    c0616pi.m3107g0(objM3080L6);
                }
                Bitmap bitmap = (Bitmap) objM3080L6;
                Object objM3080L7 = c0616pi.m3080L();
                if (objM3080L7 == c0675r33) {
                    objM3080L7 = new q70(oh0Var, 2);
                    c0616pi.m3107g0(objM3080L7);
                }
                AbstractC0398kl.m1915a((InterfaceC0298hw) objM3080L7, AbstractC0398kl.m1937w(-270812273, new C0168ed(9, context, bitmap), c0616pi), null, AbstractC0398kl.m1937w(-894093875, new gc0(oh0Var, 0), c0616pi), c0551oh.m2916p(), AbstractC0398kl.m1937w(318467370, new C0956ya(3, bitmap), c0616pi), null, 0L, 0L, 0L, 0L, null, c0616pi, 1772598);
                c0616pi = c0616pi;
                z4 = false;
            } else {
                z4 = false;
                c0616pi.m3090W(1051982246);
            }
            c0616pi.m3119p(z4);
            z2 = z5;
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: hc0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return zc0.m5520Y(z2, i, i2, (InterfaceC0356ji) obj, iIntValue);
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R0 */
    public static final void m5507R0(InterfaceC0356ji interfaceC0356ji, int i) {
        long jM1093b;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(537549553);
        if (c0616pi.m3082O(i & 1, i != 0)) {
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            me0 me0Var = me0.f3922a;
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, me0Var);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, c0838vfM4197a);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            d71.m659b("感谢以下朋友在开发过程中提供的帮助与支持！", null, ((C0429lf) c0616pi.m3112j(AbstractC0510nf.f4248a)).f3470s, j50.m1667q(13), null, null, 0L, null, j50.m1667q(20), 0, false, 0, 0, null, c0616pi, 24582, 48, 260074);
            c0616pi = c0616pi;
            u50.m4262c(c0616pi, s11.m3999b(me0Var, 12.0f));
            List listM2783w = o30.m2783w("小八", "十代涛皇");
            c0616pi.m3090W(61195747);
            Iterator it = listM2783w.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                pe0 pe0VarM3447F = rd0.m3447F(s11.f5620a, 0.0f, 3.0f, 1);
                iw0 iw0VarM1508a = hw0.m1508a(rd0.f5362a, C0496n2.f4154n, c0616pi, 0);
                int iHashCode2 = Long.hashCode(c0616pi.f4878T);
                fq0 fq0VarM3115l2 = c0616pi.m3115l();
                pe0 pe0VarM4020E2 = s91.m4020E(c0616pi, pe0VarM3447F);
                InterfaceC0210fi.f1733b.getClass();
                C0094cj c0094cj2 = C0173ei.f1457b;
                c0616pi.m3093Z();
                if (c0616pi.f4877S) {
                    c0616pi.m3114k(c0094cj2);
                } else {
                    c0616pi.m3113j0();
                }
                w60.m4888J(c0616pi, C0173ei.f1460e, iw0VarM1508a);
                w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l2);
                w60.m4918y(c0616pi, Integer.valueOf(iHashCode2), C0173ei.f1461f);
                w60.m4885G(c0616pi, C0173ei.f1462g);
                w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E2);
                C0616pi c0616pi2 = c0616pi;
                Iterator it2 = it;
                d71.m659b("⭐", null, 0L, j50.m1667q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi2, 24582, 0, 262126);
                u50.m4262c(c0616pi2, s11.m4002e(8.0f));
                long jM1667q = j50.m1667q(13);
                if (r41.m3382S(str, "暂无", false)) {
                    c0616pi2.m3090W(-596976350);
                    jM1093b = C0207ff.m1093b(0.6f, ((C0429lf) c0616pi2.m3112j(AbstractC0510nf.f4248a)).f3470s);
                    c0616pi2.m3119p(false);
                } else {
                    c0616pi2.m3090W(-596863076);
                    jM1093b = ((C0429lf) c0616pi2.m3112j(AbstractC0510nf.f4248a)).f3468q;
                    c0616pi2.m3119p(false);
                }
                d71.m659b(str, null, jM1093b, jM1667q, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi2, 24576, 0, 262122);
                c0616pi = c0616pi2;
                c0616pi.m3119p(true);
                it = it2;
            }
            c0616pi.m3119p(false);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new lc0(i, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final na1 m5508S(oh0 oh0Var) {
        m5525a0(oh0Var, false);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final na1 m5509S0(int i, InterfaceC0356ji interfaceC0356ji, int i2) {
        m5507R0(interfaceC0356ji, j50.m1649A(i | 1));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final na1 m5510T(Context context, Bitmap bitmap, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            boolean zM3108h = c0616pi.m3108h(context) | c0616pi.m3108h(bitmap);
            Object objM3080L = c0616pi.m3080L();
            if (zM3108h || objM3080L == C0320ii.f2572a) {
                objM3080L = new C0081c7(6, context, bitmap);
                c0616pi.m3107g0(objM3080L);
            }
            o30.m2768h((InterfaceC0298hw) objM3080L, null, false, null, null, null, C0551oh.f4557a.m2920t(), c0616pi, 805306368);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5511T0(pe0 pe0Var, boolean z, InterfaceC0356ji interfaceC0356ji, int i, int i2) {
        pe0 pe0Var2;
        int i3;
        boolean z2;
        ht0 ht0VarM3121r;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-550685464);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            pe0Var2 = pe0Var;
        } else if ((i & 6) == 0) {
            pe0Var2 = pe0Var;
            i3 = i | (c0616pi.m3104f(pe0Var2) ? 4 : 2);
        } else {
            pe0Var2 = pe0Var;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= c0616pi.m3106g(z2) ? 32 : 16;
            }
            if (c0616pi.m3082O(i3 & 1, (i3 & 19) == 18)) {
                c0616pi.m3085R();
            } else {
                me0 me0Var = me0.f3922a;
                pe0 pe0Var3 = i4 != 0 ? me0Var : pe0Var2;
                if (i5 != 0) {
                    z2 = false;
                }
                pe0 pe0VarM3465X = rd0.m3465X(pe0Var3.mo2499c(s11.f5621b), rd0.m3457P(c0616pi));
                g41 g41Var = AbstractC0510nf.f4248a;
                pe0 pe0VarM3446E = rd0.m3446E(s91.m4047l(pe0VarM3465X, ((C0429lf) c0616pi.m3112j(g41Var)).f3465n, pf1.f4843i), 20.0f, 24.0f);
                C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
                int iHashCode = Long.hashCode(c0616pi.f4878T);
                fq0 fq0VarM3115l = c0616pi.m3115l();
                pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarM3446E);
                InterfaceC0210fi.f1733b.getClass();
                C0094cj c0094cj = C0173ei.f1457b;
                c0616pi.m3093Z();
                if (c0616pi.f4877S) {
                    c0616pi.m3114k(c0094cj);
                } else {
                    c0616pi.m3113j0();
                }
                w60.m4888J(c0616pi, C0173ei.f1460e, c0838vfM4197a);
                w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
                w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
                w60.m4885G(c0616pi, C0173ei.f1462g);
                w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
                long jM1667q = j50.m1667q(24);
                C1018zv c1018zv = C1018zv.f8008i;
                long jM1305d = C0281hf.m1305d();
                pe0 pe0Var4 = pe0Var3;
                C0701rt c0701rt = s11.f5620a;
                final boolean z3 = z2;
                d71.m659b("致谢", c0701rt, jM1305d, jM1667q, c1018zv, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi, 1597494, 0, 261032);
                u50.m4262c(c0616pi, s11.m3999b(me0Var, 6.0f));
                d71.m659b("感谢以下项目与工具", c0701rt, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s, j50.m1667q(13), null, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi, 24630, 0, 261096);
                u50.m4262c(c0616pi, s11.m3999b(me0Var, 28.0f));
                C0551oh c0551oh = C0551oh.f4557a;
                m5497M0(c0551oh.m2921u(), c0616pi, 6);
                u50.m4262c(c0616pi, s11.m3999b(me0Var, 14.0f));
                m5497M0(c0551oh.m2923w(), c0616pi, 6);
                u50.m4262c(c0616pi, s11.m3999b(me0Var, 14.0f));
                m5497M0(AbstractC0398kl.m1937w(-1298567616, new InterfaceC0904ww() { // from class: uc0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0904ww
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return zc0.m5513U0(z3, (InterfaceC0356ji) obj, iIntValue);
                    }
                }, c0616pi), c0616pi, 6);
                u50.m4262c(c0616pi, s11.m3999b(me0Var, 20.0f));
                d71.m659b("除了感谢以上各位以外，也同样感谢其他一直默默支持本模块的各位小伙伴的支持与帮助！", c0701rt, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s, j50.m1667q(13), null, null, 0L, new r61(3), j50.m1667q(20), 0, false, 0, 0, null, c0616pi, 24630, 48, 259048);
                c0616pi = c0616pi;
                u50.m4262c(c0616pi, s11.m3999b(me0Var, 16.0f));
                c0616pi.m3119p(true);
                pe0Var2 = pe0Var4;
                z2 = z3;
            }
            ht0VarM3121r = c0616pi.m3121r();
            if (ht0VarM3121r == null) {
                ht0VarM3121r.f2362d = new vc0(pe0Var2, z2, i, i2);
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if (c0616pi.m3082O(i3 & 1, (i3 & 19) == 18)) {
        }
        ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r == null) {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final na1 m5512U(Context context, Bitmap bitmap) {
        OutputStream outputStreamOpenOutputStream;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", "weixin_zs_" + System.currentTimeMillis() + ".png");
            contentValues.put("mime_type", "image/png");
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            Uri uriInsert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert != null && (outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert)) != null) {
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
                    outputStreamOpenOutputStream.close();
                } finally {
                }
            }
            Toast.makeText(context, "保存成功", 0).show();
        } catch (Exception unused) {
            Toast.makeText(context, "保存失败", 0).show();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final na1 m5513U0(boolean z, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            m5503P0("感谢自愿打赏", null, c0616pi, 6, 2);
            u50.m4262c(c0616pi, s11.m3999b(me0.f3922a, 8.0f));
            m5506R(z, c0616pi, 0, 0);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final na1 m5514V(oh0 oh0Var, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            Object objM3080L = c0616pi.m3080L();
            if (objM3080L == C0320ii.f2572a) {
                objM3080L = new q70(oh0Var, 3);
                c0616pi.m3107g0(objM3080L);
            }
            o30.m2768h((InterfaceC0298hw) objM3080L, null, false, null, null, null, C0551oh.f4557a.m2915o(), c0616pi, 805306374);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final na1 m5515V0(pe0 pe0Var, boolean z, int i, int i2, InterfaceC0356ji interfaceC0356ji, int i3) {
        m5511T0(pe0Var, z, interfaceC0356ji, j50.m1649A(i | 1), i2);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final na1 m5516W(oh0 oh0Var) {
        m5525a0(oh0Var, false);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W0 */
    public static final void m5517W0(InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi;
        me0 me0Var;
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3091X(-833462027);
        boolean z = true;
        boolean z2 = false;
        if (c0616pi2.m3082O(i & 1, i != 0)) {
            List listM2783w = o30.m2783w("1. 安装模块后在 LSPosed 框架激活模块并且勾选推荐作用域", "2. 首次安装使用本模块会弹窗使用协议，仔细阅读并且同意后方可使用（同意后后续不再弹出）", "3. 当进入图片帖子详情页时会有下载按钮，按钮位置可以自由拖动", "4. 下载按钮状态为灰色说明还未加载完成，无法点击", "5. 下载按钮为红色时，可正常点击弹出模块专属浏览与下载界面", "6. 剩下自己探索，一起挖红薯🍠吧😊！");
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi2, 0);
            int iHashCode = Long.hashCode(c0616pi2.f4878T);
            fq0 fq0VarM3115l = c0616pi2.m3115l();
            me0 me0Var2 = me0.f3922a;
            pe0 pe0VarM4020E = s91.m4020E(c0616pi2, me0Var2);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi2.m3093Z();
            if (c0616pi2.f4877S) {
                c0616pi2.m3114k(c0094cj);
            } else {
                c0616pi2.m3113j0();
            }
            w60.m4888J(c0616pi2, C0173ei.f1460e, c0838vfM4197a);
            w60.m4888J(c0616pi2, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi2, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi2, C0173ei.f1462g);
            w60.m4888J(c0616pi2, C0173ei.f1458c, pe0VarM4020E);
            c0616pi2.m3090W(-386815275);
            int i2 = 0;
            for (Object obj : listM2783w) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    o30.m2757A();
                    throw null;
                }
                boolean z3 = z2;
                me0 me0Var3 = me0Var2;
                C0616pi c0616pi3 = c0616pi2;
                boolean z4 = z;
                int i4 = i2;
                d71.m659b((String) obj, null, ((C0429lf) c0616pi2.m3112j(AbstractC0510nf.f4248a)).f3470s, j50.m1667q(13), null, null, 0L, null, j50.m1667q(20), 0, false, 0, 0, null, c0616pi3, 24576, 48, 260074);
                c0616pi2 = c0616pi3;
                if (i4 < listM2783w.size() - 1) {
                    c0616pi2.m3090W(-383650188);
                    me0Var = me0Var3;
                    u50.m4262c(c0616pi2, s11.m3999b(me0Var, 6.0f));
                } else {
                    me0Var = me0Var3;
                    c0616pi2.m3090W(-414724495);
                }
                c0616pi2.m3119p(z3);
                z2 = z3;
                me0Var2 = me0Var;
                i2 = i3;
                z = z4;
            }
            me0 me0Var4 = me0Var2;
            c0616pi2.m3119p(z2);
            c0616pi2.m3119p(z);
            u50.m4262c(c0616pi2, s11.m3999b(me0Var4, 8.0f));
            g41 g41Var = AbstractC0510nf.f4248a;
            AbstractC0398kl.m1917c(null, 0.5f, ((C0429lf) c0616pi2.m3112j(g41Var)).f3469r, c0616pi2, 48, 1);
            u50.m4262c(c0616pi2, s11.m3999b(me0Var4, 8.0f));
            long jM1667q = j50.m1667q(13);
            C1018zv c1018zv = C1018zv.f8008i;
            long jM1305d = C0281hf.m1305d();
            c0616pi = c0616pi2;
            C0701rt c0701rt = s11.f5620a;
            d71.m659b("⚠️ 反馈须知", c0701rt, jM1305d, jM1667q, c1018zv, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 1597494, 0, 262056);
            u50.m4262c(c0616pi, s11.m3999b(me0Var4, 4.0f));
            long jM1667q2 = j50.m1667q(12);
            C1018zv c1018zv2 = C1018zv.f8006g;
            d71.m659b("反馈问题前，请认真查看本模块各界面的说明以及交流群组内的公告和说明。若反馈的问题已有明确提醒或说明，或未按要求格式提供问题描述与日志，将被移出群组并封禁，恕不另行通知。", c0701rt, C0207ff.m1093b(0.85f, C0281hf.m1305d()), jM1667q2, c1018zv2, null, 0L, null, j50.m1667q(18), 0, false, 0, 0, null, c0616pi, 1597494, 48, 260008);
            u50.m4262c(c0616pi, s11.m3999b(me0Var4, 8.0f));
            AbstractC0398kl.m1917c(null, 0.5f, ((C0429lf) c0616pi.m3112j(g41Var)).f3469r, c0616pi, 48, 1);
            u50.m4262c(c0616pi, s11.m3999b(me0Var4, 8.0f));
            d71.m659b("注意⚠️：本模块仅供个人研究学习使用\n请在24小时内删除！", c0701rt, C0281hf.m1305d(), j50.m1667q(12), c1018zv2, null, 0L, null, j50.m1667q(18), 0, false, 0, 0, null, c0616pi, 1597494, 48, 260008);
        } else {
            c0616pi = c0616pi2;
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new lc0(i, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final na1 m5518X(Bitmap bitmap, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4158r, c0616pi, 48);
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            me0 me0Var = me0.f3922a;
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, me0Var);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, c0838vfM4197a);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            bitmap.getClass();
            C0752t5 c0752t5 = new C0752t5(bitmap);
            C0701rt c0701rt = s11.f5620a;
            C0276ha c0276ha = C0496n2.f4149i;
            boolean zM3104f = c0616pi.m3104f(c0752t5);
            Object objM3080L = c0616pi.m3080L();
            if (!zM3104f) {
                Object obj = objM3080L;
                if (objM3080L == C0320ii.f2572a) {
                    C0313ia c0313ia = new C0313ia(c0752t5, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
                    c0313ia.f2494g = 1;
                    c0616pi.m3107g0(c0313ia);
                    obj = c0313ia;
                }
                o30.m2766f((C0313ia) obj, c0701rt, c0276ha, C0132dk.f1137a, c0616pi, 440);
                u50.m4262c(c0616pi, s11.m3999b(me0Var, 8.0f));
                d71.m659b("使用微信扫一扫二维码进行自愿打赏支持", c0701rt, ((C0429lf) c0616pi.m3112j(AbstractC0510nf.f4248a)).f3470s, j50.m1667q(13), null, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi, 24630, 0, 261096);
                c0616pi.m3119p(true);
            }
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final na1 m5519X0(int i, InterfaceC0356ji interfaceC0356ji, int i2) {
        m5517W0(interfaceC0356ji, j50.m1649A(i | 1));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final na1 m5520Y(boolean z, int i, int i2, InterfaceC0356ji interfaceC0356ji, int i3) {
        m5506R(z, interfaceC0356ji, j50.m1649A(i | 1), i2);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    private static final boolean m5522Z(oh0 oh0Var) {
        return ((Boolean) oh0Var.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    private static final void m5525a0(oh0 oh0Var, boolean z) {
        oh0Var.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    private static final int m5528b0(wg0 wg0Var) {
        return ((dp0) wg0Var).m720g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final void m5531c0(wg0 wg0Var, int i) {
        ((dp0) wg0Var).m721h(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c1 */
    public static final long m5532c1() {
        return f7863a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final na1 m5534d0(List list, x80 x80Var) {
        x80Var.getClass();
        x80.m5103a(x80Var, list.size(), new C0474mh(194308294, true, new C0044b6(1, list)));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d1 */
    public static final String m5535d1() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            Iterator it = o30.m2783w("ro.product.marketname", "ro.config.marketing_name", "ro.product.vendor.marketname", "ro.product.odm.marketname").iterator();
            while (it.hasNext()) {
                Object objInvoke = method.invoke(null, (String) it.next(), "");
                objInvoke.getClass();
                String str = (String) objInvoke;
                if (!k41.m1769a0(str)) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final na1 m5537e0(List list, x60 x60Var, int i, InterfaceC0356ji interfaceC0356ji, int i2) {
        x60 x60Var2;
        int i3;
        x60Var.getClass();
        if ((i2 & 6) == 0) {
            x60Var2 = x60Var;
            i3 = i2 | (((C0616pi) interfaceC0356ji).m3104f(x60Var2) ? 4 : 2);
        } else {
            x60Var2 = x60Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ((C0616pi) interfaceC0356ji).m3100d(i) ? 32 : 16;
        }
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i3 & 1, (i3 & 147) != 146)) {
            pe0 pe0VarM3447F = rd0.m3447F(x60.m5089a(x60Var2), 4.0f, 0.0f, 2);
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarM3447F);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, c0838vfM4197a);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            c0616pi.m3090W(-1894113621);
            int i4 = 0;
            for (Object obj : (Iterable) list.get(i)) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    o30.m2757A();
                    throw null;
                }
                String str = (String) obj;
                pe0 pe0VarM3447F2 = rd0.m3447F(s11.f5620a, 0.0f, 3.0f, 1);
                iw0 iw0VarM1508a = hw0.m1508a(rd0.f5362a, C0496n2.f4154n, c0616pi, 0);
                int iHashCode2 = Long.hashCode(c0616pi.f4878T);
                fq0 fq0VarM3115l2 = c0616pi.m3115l();
                pe0 pe0VarM4020E2 = s91.m4020E(c0616pi, pe0VarM3447F2);
                InterfaceC0210fi.f1733b.getClass();
                C0094cj c0094cj2 = C0173ei.f1457b;
                c0616pi.m3093Z();
                if (c0616pi.f4877S) {
                    c0616pi.m3114k(c0094cj2);
                } else {
                    c0616pi.m3113j0();
                }
                w60.m4888J(c0616pi, C0173ei.f1460e, iw0VarM1508a);
                w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l2);
                w60.m4918y(c0616pi, Integer.valueOf(iHashCode2), C0173ei.f1461f);
                w60.m4885G(c0616pi, C0173ei.f1462g);
                w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E2);
                d71.m659b("❤", null, C0281hf.m1305d(), j50.m1667q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 24582, 0, 262122);
                u50.m4262c(c0616pi, s11.m4002e(8.0f));
                d71.m659b(((i * 5) + i4 + 1) + ". " + str, null, ((C0429lf) c0616pi.m3112j(AbstractC0510nf.f4248a)).f3468q, j50.m1667q(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 24576, 0, 262122);
                c0616pi.m3119p(true);
                i4 = i5;
            }
            c0616pi.m3119p(false);
            int size = 5 - ((List) list.get(i)).size();
            c0616pi.m3090W(-1894084047);
            for (int i6 = 0; i6 < size; i6++) {
                u50.m4262c(c0616pi, s11.m3999b(me0.f3922a, 26.0f));
            }
            c0616pi.m3119p(false);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final na1 m5539f0(oh0 oh0Var) {
        m5525a0(oh0Var, true);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015d  */
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5541g0(final lf1 lf1Var, boolean z, InterfaceC0742sw interfaceC0742sw, pe0 pe0Var, InterfaceC0356ji interfaceC0356ji, final int i, final int i2) {
        int i3;
        pe0 pe0Var2;
        final boolean z2;
        final pe0 pe0Var3;
        ht0 ht0VarM3121r;
        String str;
        String string;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List listCreateStringArrayList;
        Object objM3080L;
        C0675r3 c0675r3;
        String str7;
        Object objM3080L2;
        String str8;
        String str9;
        String str10;
        Object objM3080L3;
        String str11;
        int longVersionCode;
        Object objM3080L4;
        int i4;
        String str12;
        Object objM3080L5;
        Object objM3080L6;
        Object objM3080L7;
        oh0 oh0Var;
        C0094cj c0094cj;
        final InterfaceC0742sw interfaceC0742sw2 = interfaceC0742sw;
        interfaceC0742sw2.getClass();
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1519731781);
        if ((i & 6) == 0) {
            i3 = (c0616pi.m3108h(lf1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0616pi.m3106g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0616pi.m3108h(interfaceC0742sw2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                pe0Var2 = pe0Var;
                i3 |= c0616pi.m3104f(pe0Var2) ? 2048 : 1024;
            }
            if (c0616pi.m3082O(i3 & 1, (i3 & 1171) == 1170)) {
                z2 = z;
                c0616pi.m3085R();
                pe0Var3 = pe0Var2;
            } else {
                me0 me0Var = me0.f3922a;
                pe0 pe0Var4 = i5 != 0 ? me0Var : pe0Var2;
                final Context context = (Context) c0616pi.m3112j(AbstractC0676r4.f5291b);
                py0 py0VarM3457P = rd0.m3457P(c0616pi);
                boolean z3 = lf1Var != null;
                if (lf1Var != null) {
                    try {
                        C0373jz c0373jz = (C0373jz) lf1Var.f3481a;
                        c0373jz.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                            str = "1.7";
                            c0373jz.f2960a.transact(3, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            string = parcelObtain2.readString();
                            if (string == null) {
                            }
                            if (lf1Var == null) {
                                try {
                                    C0373jz c0373jz2 = (C0373jz) lf1Var.f3481a;
                                    c0373jz2.getClass();
                                    parcelObtain = Parcel.obtain();
                                    parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                                        str2 = string;
                                        str3 = "-";
                                        c0373jz2.f2960a.transact(4, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        String string2 = parcelObtain2.readString();
                                        if (string2 != null) {
                                            str4 = string2;
                                            if (lf1Var != null) {
                                                try {
                                                    C0373jz c0373jz3 = (C0373jz) lf1Var.f3481a;
                                                    c0373jz3.getClass();
                                                    parcelObtain = Parcel.obtain();
                                                    parcelObtain2 = Parcel.obtain();
                                                    try {
                                                        parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                                                        str5 = str4;
                                                        c0373jz3.f2960a.transact(2, parcelObtain, parcelObtain2, 0);
                                                        parcelObtain2.readException();
                                                        String string3 = Integer.valueOf(parcelObtain2.readInt()).toString();
                                                        if (string3 != null) {
                                                            str6 = string3;
                                                        }
                                                        if (lf1Var == null) {
                                                            try {
                                                                C0373jz c0373jz4 = (C0373jz) lf1Var.f3481a;
                                                                c0373jz4.getClass();
                                                                parcelObtain = Parcel.obtain();
                                                                parcelObtain2 = Parcel.obtain();
                                                                try {
                                                                    parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                                                                    c0373jz4.f2960a.transact(11, parcelObtain, parcelObtain2, 0);
                                                                    parcelObtain2.readException();
                                                                    listCreateStringArrayList = parcelObtain2.createStringArrayList();
                                                                    if (listCreateStringArrayList == null) {
                                                                        listCreateStringArrayList = C0294hs.f2354d;
                                                                    }
                                                                    final List list = listCreateStringArrayList;
                                                                    final boolean zContains = list.contains("com.xingin.xhs");
                                                                    final String str13 = Build.MANUFACTURER + " " + Build.MODEL;
                                                                    objM3080L = c0616pi.m3080L();
                                                                    c0675r3 = C0320ii.f2572a;
                                                                    if (objM3080L == c0675r3) {
                                                                        objM3080L = m5535d1();
                                                                        c0616pi.m3107g0(objM3080L);
                                                                    }
                                                                    String str14 = (String) objM3080L;
                                                                    String str15 = Build.VERSION.RELEASE;
                                                                    final String strM4154l = AbstractC0748t1.m4154l("SDK ", Build.VERSION.SDK_INT);
                                                                    String[] strArr = Build.SUPPORTED_ABIS;
                                                                    strArr.getClass();
                                                                    str7 = strArr.length != 0 ? null : strArr[0];
                                                                    if (str7 == null) {
                                                                        str7 = "unknown";
                                                                    }
                                                                    objM3080L2 = c0616pi.m3080L();
                                                                    if (objM3080L2 != c0675r3) {
                                                                        try {
                                                                            str8 = str7;
                                                                        } catch (Exception unused) {
                                                                            str8 = str7;
                                                                        }
                                                                        try {
                                                                            str9 = str14;
                                                                            try {
                                                                                str10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                                                                            } catch (Exception unused2) {
                                                                            }
                                                                        } catch (Exception unused3) {
                                                                            str9 = str14;
                                                                        }
                                                                        if (str10 == null) {
                                                                            str10 = str;
                                                                        }
                                                                        c0616pi.m3107g0(str10);
                                                                        objM3080L2 = str10;
                                                                    } else {
                                                                        str8 = str7;
                                                                        str9 = str14;
                                                                    }
                                                                    String str16 = (String) objM3080L2;
                                                                    objM3080L3 = c0616pi.m3080L();
                                                                    if (objM3080L3 != c0675r3) {
                                                                        try {
                                                                            str11 = str16;
                                                                            try {
                                                                                longVersionCode = (int) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
                                                                            } catch (Exception unused4) {
                                                                                longVersionCode = 0;
                                                                            }
                                                                        } catch (Exception unused5) {
                                                                            str11 = str16;
                                                                        }
                                                                        objM3080L3 = Integer.valueOf(longVersionCode);
                                                                        c0616pi.m3107g0(objM3080L3);
                                                                    } else {
                                                                        str11 = str16;
                                                                    }
                                                                    int iIntValue = ((Number) objM3080L3).intValue();
                                                                    objM3080L4 = c0616pi.m3080L();
                                                                    if (objM3080L4 != c0675r3) {
                                                                        i4 = iIntValue;
                                                                        str12 = str6;
                                                                        objM3080L4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(C0013ac.f98f));
                                                                        c0616pi.m3107g0(objM3080L4);
                                                                    } else {
                                                                        i4 = iIntValue;
                                                                        str12 = str6;
                                                                    }
                                                                    String str17 = (String) objM3080L4;
                                                                    objM3080L5 = c0616pi.m3080L();
                                                                    if (objM3080L5 == c0675r3) {
                                                                        objM3080L5 = r60.m3419u(Boolean.TRUE);
                                                                        c0616pi.m3107g0(objM3080L5);
                                                                    }
                                                                    oh0 oh0Var2 = (oh0) objM3080L5;
                                                                    objM3080L6 = c0616pi.m3080L();
                                                                    if (objM3080L6 == c0675r3) {
                                                                        objM3080L6 = r60.m3419u(Boolean.FALSE);
                                                                        c0616pi.m3107g0(objM3080L6);
                                                                    }
                                                                    oh0 oh0Var3 = (oh0) objM3080L6;
                                                                    pe0 pe0VarM3465X = rd0.m3465X(pe0Var4.mo2499c(s11.f5621b), py0VarM3457P);
                                                                    g41 g41Var = AbstractC0510nf.f4248a;
                                                                    long j = ((C0429lf) c0616pi.m3112j(g41Var)).f3465n;
                                                                    C0227fz c0227fz = pf1.f4843i;
                                                                    pe0 pe0VarM3446E = rd0.m3446E(s91.m4047l(pe0VarM3465X, j, c0227fz), 20.0f, 24.0f);
                                                                    C0202fa c0202fa = C0496n2.f4157q;
                                                                    C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(c0202fa, c0616pi, 0);
                                                                    pe0 pe0Var5 = pe0Var4;
                                                                    int iHashCode = Long.hashCode(c0616pi.f4878T);
                                                                    fq0 fq0VarM3115l = c0616pi.m3115l();
                                                                    pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarM3446E);
                                                                    InterfaceC0210fi.f1733b.getClass();
                                                                    C0094cj c0094cj2 = C0173ei.f1457b;
                                                                    c0616pi.m3093Z();
                                                                    if (c0616pi.f4877S) {
                                                                        c0616pi.m3113j0();
                                                                    } else {
                                                                        c0616pi.m3114k(c0094cj2);
                                                                    }
                                                                    C0462m7 c0462m7 = C0173ei.f1460e;
                                                                    w60.m4888J(c0616pi, c0462m7, c0838vfM4197a);
                                                                    C0462m7 c0462m72 = C0173ei.f1459d;
                                                                    w60.m4888J(c0616pi, c0462m72, fq0VarM3115l);
                                                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                                                    C0462m7 c0462m73 = C0173ei.f1461f;
                                                                    w60.m4918y(c0616pi, numValueOf, c0462m73);
                                                                    C0601p3 c0601p3 = C0173ei.f1462g;
                                                                    w60.m4885G(c0616pi, c0601p3);
                                                                    C0462m7 c0462m74 = C0173ei.f1458c;
                                                                    w60.m4888J(c0616pi, c0462m74, pe0VarM4020E);
                                                                    long jM1667q = j50.m1667q(24);
                                                                    C1018zv c1018zv = C1018zv.f8008i;
                                                                    long jM1305d = C0281hf.m1305d();
                                                                    C0701rt c0701rt = s11.f5620a;
                                                                    d71.m659b("挖红薯呀-WHS", c0701rt, jM1305d, jM1667q, c1018zv, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi, 1597494, 0, 261032);
                                                                    final boolean z4 = z3;
                                                                    u50.m4262c(c0616pi, s11.m3999b(me0Var, 6.0f));
                                                                    C0675r3 c0675r32 = rd0.f5364c;
                                                                    C0239ga c0239ga = C0496n2.f4155o;
                                                                    iw0 iw0VarM1508a = hw0.m1508a(c0675r32, c0239ga, c0616pi, 54);
                                                                    int iHashCode2 = Long.hashCode(c0616pi.f4878T);
                                                                    fq0 fq0VarM3115l2 = c0616pi.m3115l();
                                                                    pe0 pe0VarM4020E2 = s91.m4020E(c0616pi, c0701rt);
                                                                    c0616pi.m3093Z();
                                                                    if (c0616pi.f4877S) {
                                                                        c0616pi.m3113j0();
                                                                    } else {
                                                                        c0616pi.m3114k(c0094cj2);
                                                                    }
                                                                    w60.m4888J(c0616pi, c0462m7, iw0VarM1508a);
                                                                    w60.m4888J(c0616pi, c0462m72, fq0VarM3115l2);
                                                                    w60.m4918y(c0616pi, Integer.valueOf(iHashCode2), c0462m73);
                                                                    w60.m4885G(c0616pi, c0601p3);
                                                                    w60.m4888J(c0616pi, c0462m74, pe0VarM4020E2);
                                                                    d71.m659b("Xposed 模块 (API102)", null, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s, j50.m1667q(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 24582, 0, 262122);
                                                                    u50.m4262c(c0616pi, s11.m4002e(8.0f));
                                                                    d71.m659b("3.0", rd0.m3446E(s91.m4047l(p30.m2974J(me0Var, ew0.m974a(4.0f), 518143), p30.m2993c(4280391411L), c0227fz), 6.0f, 2.0f), C0207ff.f1703c, j50.m1667q(12), c1018zv, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 1597830, 0, 262056);
                                                                    c0616pi.m3119p(true);
                                                                    u50.m4262c(c0616pi, s11.m3999b(me0Var, 28.0f));
                                                                    final String str18 = str5;
                                                                    final String str19 = str8;
                                                                    String str20 = str11;
                                                                    int i6 = i4;
                                                                    final String str21 = str12;
                                                                    final String str22 = str2;
                                                                    final String str23 = str9;
                                                                    m5497M0(AbstractC0398kl.m1937w(662160037, new InterfaceC0904ww() { // from class: qc0
                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        {
                                                                            String str24 = Build.VERSION.RELEASE;
                                                                        }

                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        @Override // p000.InterfaceC0904ww
                                                                        public final Object invoke(Object obj, Object obj2) {
                                                                            String str24 = Build.VERSION.RELEASE;
                                                                            int iIntValue2 = ((Integer) obj2).intValue();
                                                                            return zc0.m5551l0(z4, str22, str18, str21, lf1Var, str23, str13, Build.VERSION.RELEASE, strM4154l, str19, context, zContains, list, (InterfaceC0356ji) obj, iIntValue2);
                                                                        }
                                                                    }, c0616pi), c0616pi, 6);
                                                                    u50.m4262c(c0616pi, s11.m3999b(me0Var, 14.0f));
                                                                    pe0 pe0VarM4047l = s91.m4047l(p30.m2974J(c0701rt, ew0.m974a(14.0f), 518143).mo2499c(new C0757ta(1.5f, new g31(C0207ff.m1093b(0.45f, C0281hf.m1305d())), ew0.m974a(14.0f))), C0207ff.m1093b(0.07f, C0281hf.m1305d()), c0227fz);
                                                                    objM3080L7 = c0616pi.m3080L();
                                                                    if (objM3080L7 != c0675r3) {
                                                                        oh0Var = oh0Var2;
                                                                        objM3080L7 = new q70(oh0Var, 5);
                                                                        c0616pi.m3107g0(objM3080L7);
                                                                    } else {
                                                                        oh0Var = oh0Var2;
                                                                    }
                                                                    pe0 pe0VarM3445D = rd0.m3445D(rd0.m3481j(pe0VarM4047l, (InterfaceC0298hw) objM3080L7));
                                                                    C0838vf c0838vfM4197a2 = AbstractC0762tf.m4197a(c0202fa, c0616pi, 0);
                                                                    int iHashCode3 = Long.hashCode(c0616pi.f4878T);
                                                                    fq0 fq0VarM3115l3 = c0616pi.m3115l();
                                                                    pe0 pe0VarM4020E3 = s91.m4020E(c0616pi, pe0VarM3445D);
                                                                    c0616pi.m3093Z();
                                                                    if (c0616pi.f4877S) {
                                                                        c0094cj = c0094cj2;
                                                                        c0616pi.m3113j0();
                                                                    } else {
                                                                        c0094cj = c0094cj2;
                                                                        c0616pi.m3114k(c0094cj);
                                                                    }
                                                                    w60.m4888J(c0616pi, c0462m7, c0838vfM4197a2);
                                                                    w60.m4888J(c0616pi, c0462m72, fq0VarM3115l3);
                                                                    w60.m4918y(c0616pi, Integer.valueOf(iHashCode3), c0462m73);
                                                                    w60.m4885G(c0616pi, c0601p3);
                                                                    w60.m4888J(c0616pi, c0462m74, pe0VarM4020E3);
                                                                    iw0 iw0VarM1508a2 = hw0.m1508a(rd0.f5362a, c0239ga, c0616pi, 48);
                                                                    int iHashCode4 = Long.hashCode(c0616pi.f4878T);
                                                                    fq0 fq0VarM3115l4 = c0616pi.m3115l();
                                                                    pe0 pe0VarM4020E4 = s91.m4020E(c0616pi, c0701rt);
                                                                    c0616pi.m3093Z();
                                                                    if (c0616pi.f4877S) {
                                                                        c0616pi.m3113j0();
                                                                    } else {
                                                                        c0616pi.m3114k(c0094cj);
                                                                    }
                                                                    w60.m4888J(c0616pi, c0462m7, iw0VarM1508a2);
                                                                    w60.m4888J(c0616pi, c0462m72, fq0VarM3115l4);
                                                                    w60.m4918y(c0616pi, Integer.valueOf(iHashCode4), c0462m73);
                                                                    w60.m4885G(c0616pi, c0601p3);
                                                                    w60.m4888J(c0616pi, c0462m74, pe0VarM4020E4);
                                                                    d71.m659b("⚠️", null, 0L, j50.m1667q(18), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 24582, 0, 262126);
                                                                    u50.m4262c(c0616pi, s11.m4002e(6.0f));
                                                                    int i7 = 1;
                                                                    d71.m659b("免责声明", new s60(1.0f, true), C0281hf.m1305d(), j50.m1667q(16), c1018zv, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 1597446, 0, 262056);
                                                                    d71.m659b(!m5543h0(oh0Var) ? "▲" : "▼", null, C0207ff.m1093b(0.6f, C0281hf.m1305d()), j50.m1667q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 24576, 0, 262122);
                                                                    c0616pi = c0616pi;
                                                                    c0616pi.m3119p(true);
                                                                    o30.m2762b(C0924xf.f7341a, m5543h0(oh0Var), null, AbstractC0700rs.m3985a(), AbstractC0700rs.m3986b(), null, C0551oh.f4557a.m2918r(), c0616pi, 1600518);
                                                                    c0616pi.m3119p(true);
                                                                    u50.m4262c(c0616pi, s11.m3999b(me0Var, 14.0f));
                                                                    m5497M0(AbstractC0398kl.m1937w(384210716, new gc0(oh0Var3, i7), c0616pi), c0616pi, 6);
                                                                    u50.m4262c(c0616pi, s11.m3999b(me0Var, 14.0f));
                                                                    z2 = z;
                                                                    interfaceC0742sw2 = interfaceC0742sw;
                                                                    m5497M0(AbstractC0398kl.m1937w(556624797, new InterfaceC0904ww() { // from class: wc0
                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        @Override // p000.InterfaceC0904ww
                                                                        public final Object invoke(Object obj, Object obj2) {
                                                                            int iIntValue2 = ((Integer) obj2).intValue();
                                                                            return zc0.m5573w0(z2, interfaceC0742sw2, (InterfaceC0356ji) obj, iIntValue2);
                                                                        }
                                                                    }, c0616pi), c0616pi, 6);
                                                                    u50.m4262c(c0616pi, s11.m3999b(me0Var, 14.0f));
                                                                    m5497M0(AbstractC0398kl.m1937w(729038878, new nc0(i6, i7, str17, str20), c0616pi), c0616pi, 6);
                                                                    u50.m4262c(c0616pi, s11.m3999b(me0Var, 20.0f));
                                                                    d71.m659b("by 小桥（@ANJAO2024）", c0701rt, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s, j50.m1667q(13), null, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi, 24630, 0, 261096);
                                                                    u50.m4262c(c0616pi, s11.m3999b(me0Var, 4.0f));
                                                                    d71.m659b("仅供个人学习研究使用", c0701rt, C0207ff.m1093b(0.5f, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s), j50.m1667q(11), null, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi, 24630, 0, 261096);
                                                                    u50.m4262c(c0616pi, s11.m3999b(me0Var, 16.0f));
                                                                    c0616pi.m3119p(true);
                                                                    pe0Var3 = pe0Var5;
                                                                } finally {
                                                                }
                                                            } catch (RemoteException e) {
                                                                throw new C0725sg(e);
                                                            }
                                                        } else {
                                                            listCreateStringArrayList = C0294hs.f2354d;
                                                            final List list2 = listCreateStringArrayList;
                                                            final boolean zContains2 = list2.contains("com.xingin.xhs");
                                                            final String str132 = Build.MANUFACTURER + " " + Build.MODEL;
                                                            objM3080L = c0616pi.m3080L();
                                                            c0675r3 = C0320ii.f2572a;
                                                            if (objM3080L == c0675r3) {
                                                            }
                                                            String str142 = (String) objM3080L;
                                                            String str152 = Build.VERSION.RELEASE;
                                                            final String strM4154l2 = AbstractC0748t1.m4154l("SDK ", Build.VERSION.SDK_INT);
                                                            String[] strArr2 = Build.SUPPORTED_ABIS;
                                                            strArr2.getClass();
                                                            if (strArr2.length != 0) {
                                                            }
                                                            if (str7 == null) {
                                                            }
                                                            objM3080L2 = c0616pi.m3080L();
                                                            if (objM3080L2 != c0675r3) {
                                                            }
                                                            String str162 = (String) objM3080L2;
                                                            objM3080L3 = c0616pi.m3080L();
                                                            if (objM3080L3 != c0675r3) {
                                                            }
                                                            int iIntValue2 = ((Number) objM3080L3).intValue();
                                                            objM3080L4 = c0616pi.m3080L();
                                                            if (objM3080L4 != c0675r3) {
                                                            }
                                                            String str172 = (String) objM3080L4;
                                                            objM3080L5 = c0616pi.m3080L();
                                                            if (objM3080L5 == c0675r3) {
                                                            }
                                                            oh0 oh0Var22 = (oh0) objM3080L5;
                                                            objM3080L6 = c0616pi.m3080L();
                                                            if (objM3080L6 == c0675r3) {
                                                            }
                                                            oh0 oh0Var32 = (oh0) objM3080L6;
                                                            pe0 pe0VarM3465X2 = rd0.m3465X(pe0Var4.mo2499c(s11.f5621b), py0VarM3457P);
                                                            g41 g41Var2 = AbstractC0510nf.f4248a;
                                                            long j2 = ((C0429lf) c0616pi.m3112j(g41Var2)).f3465n;
                                                            C0227fz c0227fz2 = pf1.f4843i;
                                                            pe0 pe0VarM3446E2 = rd0.m3446E(s91.m4047l(pe0VarM3465X2, j2, c0227fz2), 20.0f, 24.0f);
                                                            C0202fa c0202fa2 = C0496n2.f4157q;
                                                            C0838vf c0838vfM4197a3 = AbstractC0762tf.m4197a(c0202fa2, c0616pi, 0);
                                                            pe0 pe0Var52 = pe0Var4;
                                                            int iHashCode5 = Long.hashCode(c0616pi.f4878T);
                                                            fq0 fq0VarM3115l5 = c0616pi.m3115l();
                                                            pe0 pe0VarM4020E5 = s91.m4020E(c0616pi, pe0VarM3446E2);
                                                            InterfaceC0210fi.f1733b.getClass();
                                                            C0094cj c0094cj22 = C0173ei.f1457b;
                                                            c0616pi.m3093Z();
                                                            if (c0616pi.f4877S) {
                                                            }
                                                            C0462m7 c0462m75 = C0173ei.f1460e;
                                                            w60.m4888J(c0616pi, c0462m75, c0838vfM4197a3);
                                                            C0462m7 c0462m722 = C0173ei.f1459d;
                                                            w60.m4888J(c0616pi, c0462m722, fq0VarM3115l5);
                                                            Integer numValueOf2 = Integer.valueOf(iHashCode5);
                                                            C0462m7 c0462m732 = C0173ei.f1461f;
                                                            w60.m4918y(c0616pi, numValueOf2, c0462m732);
                                                            C0601p3 c0601p32 = C0173ei.f1462g;
                                                            w60.m4885G(c0616pi, c0601p32);
                                                            C0462m7 c0462m742 = C0173ei.f1458c;
                                                            w60.m4888J(c0616pi, c0462m742, pe0VarM4020E5);
                                                            long jM1667q2 = j50.m1667q(24);
                                                            C1018zv c1018zv2 = C1018zv.f8008i;
                                                            long jM1305d2 = C0281hf.m1305d();
                                                            C0701rt c0701rt2 = s11.f5620a;
                                                            d71.m659b("挖红薯呀-WHS", c0701rt2, jM1305d2, jM1667q2, c1018zv2, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi, 1597494, 0, 261032);
                                                            final boolean z42 = z3;
                                                            u50.m4262c(c0616pi, s11.m3999b(me0Var, 6.0f));
                                                            C0675r3 c0675r322 = rd0.f5364c;
                                                            C0239ga c0239ga2 = C0496n2.f4155o;
                                                            iw0 iw0VarM1508a3 = hw0.m1508a(c0675r322, c0239ga2, c0616pi, 54);
                                                            int iHashCode22 = Long.hashCode(c0616pi.f4878T);
                                                            fq0 fq0VarM3115l22 = c0616pi.m3115l();
                                                            pe0 pe0VarM4020E22 = s91.m4020E(c0616pi, c0701rt2);
                                                            c0616pi.m3093Z();
                                                            if (c0616pi.f4877S) {
                                                            }
                                                            w60.m4888J(c0616pi, c0462m75, iw0VarM1508a3);
                                                            w60.m4888J(c0616pi, c0462m722, fq0VarM3115l22);
                                                            w60.m4918y(c0616pi, Integer.valueOf(iHashCode22), c0462m732);
                                                            w60.m4885G(c0616pi, c0601p32);
                                                            w60.m4888J(c0616pi, c0462m742, pe0VarM4020E22);
                                                            d71.m659b("Xposed 模块 (API102)", null, ((C0429lf) c0616pi.m3112j(g41Var2)).f3470s, j50.m1667q(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 24582, 0, 262122);
                                                            u50.m4262c(c0616pi, s11.m4002e(8.0f));
                                                            d71.m659b("3.0", rd0.m3446E(s91.m4047l(p30.m2974J(me0Var, ew0.m974a(4.0f), 518143), p30.m2993c(4280391411L), c0227fz2), 6.0f, 2.0f), C0207ff.f1703c, j50.m1667q(12), c1018zv2, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 1597830, 0, 262056);
                                                            c0616pi.m3119p(true);
                                                            u50.m4262c(c0616pi, s11.m3999b(me0Var, 28.0f));
                                                            final String str182 = str5;
                                                            final String str192 = str8;
                                                            String str202 = str11;
                                                            int i62 = i4;
                                                            final String str212 = str12;
                                                            final String str222 = str2;
                                                            final String str232 = str9;
                                                            m5497M0(AbstractC0398kl.m1937w(662160037, new InterfaceC0904ww() { // from class: qc0
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                {
                                                                    String str24 = Build.VERSION.RELEASE;
                                                                }

                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p000.InterfaceC0904ww
                                                                public final Object invoke(Object obj, Object obj2) {
                                                                    String str24 = Build.VERSION.RELEASE;
                                                                    int iIntValue22 = ((Integer) obj2).intValue();
                                                                    return zc0.m5551l0(z42, str222, str182, str212, lf1Var, str232, str132, Build.VERSION.RELEASE, strM4154l2, str192, context, zContains2, list2, (InterfaceC0356ji) obj, iIntValue22);
                                                                }
                                                            }, c0616pi), c0616pi, 6);
                                                            u50.m4262c(c0616pi, s11.m3999b(me0Var, 14.0f));
                                                            pe0 pe0VarM4047l2 = s91.m4047l(p30.m2974J(c0701rt2, ew0.m974a(14.0f), 518143).mo2499c(new C0757ta(1.5f, new g31(C0207ff.m1093b(0.45f, C0281hf.m1305d())), ew0.m974a(14.0f))), C0207ff.m1093b(0.07f, C0281hf.m1305d()), c0227fz2);
                                                            objM3080L7 = c0616pi.m3080L();
                                                            if (objM3080L7 != c0675r3) {
                                                            }
                                                            pe0 pe0VarM3445D2 = rd0.m3445D(rd0.m3481j(pe0VarM4047l2, (InterfaceC0298hw) objM3080L7));
                                                            C0838vf c0838vfM4197a22 = AbstractC0762tf.m4197a(c0202fa2, c0616pi, 0);
                                                            int iHashCode32 = Long.hashCode(c0616pi.f4878T);
                                                            fq0 fq0VarM3115l32 = c0616pi.m3115l();
                                                            pe0 pe0VarM4020E32 = s91.m4020E(c0616pi, pe0VarM3445D2);
                                                            c0616pi.m3093Z();
                                                            if (c0616pi.f4877S) {
                                                            }
                                                            w60.m4888J(c0616pi, c0462m75, c0838vfM4197a22);
                                                            w60.m4888J(c0616pi, c0462m722, fq0VarM3115l32);
                                                            w60.m4918y(c0616pi, Integer.valueOf(iHashCode32), c0462m732);
                                                            w60.m4885G(c0616pi, c0601p32);
                                                            w60.m4888J(c0616pi, c0462m742, pe0VarM4020E32);
                                                            iw0 iw0VarM1508a22 = hw0.m1508a(rd0.f5362a, c0239ga2, c0616pi, 48);
                                                            int iHashCode42 = Long.hashCode(c0616pi.f4878T);
                                                            fq0 fq0VarM3115l42 = c0616pi.m3115l();
                                                            pe0 pe0VarM4020E42 = s91.m4020E(c0616pi, c0701rt2);
                                                            c0616pi.m3093Z();
                                                            if (c0616pi.f4877S) {
                                                            }
                                                            w60.m4888J(c0616pi, c0462m75, iw0VarM1508a22);
                                                            w60.m4888J(c0616pi, c0462m722, fq0VarM3115l42);
                                                            w60.m4918y(c0616pi, Integer.valueOf(iHashCode42), c0462m732);
                                                            w60.m4885G(c0616pi, c0601p32);
                                                            w60.m4888J(c0616pi, c0462m742, pe0VarM4020E42);
                                                            d71.m659b("⚠️", null, 0L, j50.m1667q(18), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 24582, 0, 262126);
                                                            u50.m4262c(c0616pi, s11.m4002e(6.0f));
                                                            int i72 = 1;
                                                            d71.m659b("免责声明", new s60(1.0f, true), C0281hf.m1305d(), j50.m1667q(16), c1018zv2, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 1597446, 0, 262056);
                                                            d71.m659b(!m5543h0(oh0Var) ? "▲" : "▼", null, C0207ff.m1093b(0.6f, C0281hf.m1305d()), j50.m1667q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 24576, 0, 262122);
                                                            c0616pi = c0616pi;
                                                            c0616pi.m3119p(true);
                                                            o30.m2762b(C0924xf.f7341a, m5543h0(oh0Var), null, AbstractC0700rs.m3985a(), AbstractC0700rs.m3986b(), null, C0551oh.f4557a.m2918r(), c0616pi, 1600518);
                                                            c0616pi.m3119p(true);
                                                            u50.m4262c(c0616pi, s11.m3999b(me0Var, 14.0f));
                                                            m5497M0(AbstractC0398kl.m1937w(384210716, new gc0(oh0Var32, i72), c0616pi), c0616pi, 6);
                                                            u50.m4262c(c0616pi, s11.m3999b(me0Var, 14.0f));
                                                            z2 = z;
                                                            interfaceC0742sw2 = interfaceC0742sw;
                                                            m5497M0(AbstractC0398kl.m1937w(556624797, new InterfaceC0904ww() { // from class: wc0
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p000.InterfaceC0904ww
                                                                public final Object invoke(Object obj, Object obj2) {
                                                                    int iIntValue22 = ((Integer) obj2).intValue();
                                                                    return zc0.m5573w0(z2, interfaceC0742sw2, (InterfaceC0356ji) obj, iIntValue22);
                                                                }
                                                            }, c0616pi), c0616pi, 6);
                                                            u50.m4262c(c0616pi, s11.m3999b(me0Var, 14.0f));
                                                            m5497M0(AbstractC0398kl.m1937w(729038878, new nc0(i62, i72, str172, str202), c0616pi), c0616pi, 6);
                                                            u50.m4262c(c0616pi, s11.m3999b(me0Var, 20.0f));
                                                            d71.m659b("by 小桥（@ANJAO2024）", c0701rt2, ((C0429lf) c0616pi.m3112j(g41Var2)).f3470s, j50.m1667q(13), null, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi, 24630, 0, 261096);
                                                            u50.m4262c(c0616pi, s11.m3999b(me0Var, 4.0f));
                                                            d71.m659b("仅供个人学习研究使用", c0701rt2, C0207ff.m1093b(0.5f, ((C0429lf) c0616pi.m3112j(g41Var2)).f3470s), j50.m1667q(11), null, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi, 24630, 0, 261096);
                                                            u50.m4262c(c0616pi, s11.m3999b(me0Var, 16.0f));
                                                            c0616pi.m3119p(true);
                                                            pe0Var3 = pe0Var52;
                                                        }
                                                    } finally {
                                                    }
                                                } catch (RemoteException e2) {
                                                    throw new C0725sg(e2);
                                                }
                                            } else {
                                                str5 = str4;
                                            }
                                            str6 = str3;
                                            if (lf1Var == null) {
                                            }
                                        }
                                    } finally {
                                    }
                                } catch (RemoteException e3) {
                                    throw new C0725sg(e3);
                                }
                            } else {
                                str2 = string;
                                str3 = "-";
                            }
                            str4 = str3;
                            if (lf1Var != null) {
                            }
                            str6 = str3;
                            if (lf1Var == null) {
                            }
                        } finally {
                        }
                    } catch (RemoteException e4) {
                        throw new C0725sg(e4);
                    }
                } else {
                    str = "1.7";
                }
                string = "未连接";
                if (lf1Var == null) {
                }
                str4 = str3;
                if (lf1Var != null) {
                }
                str6 = str3;
                if (lf1Var == null) {
                }
            }
            ht0VarM3121r = c0616pi.m3121r();
            if (ht0VarM3121r == null) {
                final boolean z5 = z2;
                final InterfaceC0742sw interfaceC0742sw3 = interfaceC0742sw2;
                ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: xc0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0904ww
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue3 = ((Integer) obj2).intValue();
                        return zc0.m5577y0(lf1Var, z5, interfaceC0742sw3, pe0Var3, i, i2, (InterfaceC0356ji) obj, iIntValue3);
                    }
                };
                return;
            }
            return;
        }
        i3 |= 3072;
        pe0Var2 = pe0Var;
        if (c0616pi.m3082O(i3 & 1, (i3 & 1171) == 1170)) {
        }
        ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    private static final boolean m5543h0(oh0 oh0Var) {
        return ((Boolean) oh0Var.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    private static final void m5545i0(oh0 oh0Var, boolean z) {
        oh0Var.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    private static final boolean m5547j0(oh0 oh0Var) {
        return ((Boolean) oh0Var.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    private static final void m5549k0(oh0 oh0Var, boolean z) {
        oh0Var.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final na1 m5551l0(boolean z, String str, String str2, String str3, lf1 lf1Var, String str4, String str5, String str6, String str7, String str8, Context context, boolean z2, List list, InterfaceC0356ji interfaceC0356ji, int i) {
        List listM2782v;
        me0 me0Var;
        boolean z3;
        C0755t8 c0755t8 = rd0.f5362a;
        C0239ga c0239ga = C0496n2.f4155o;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            m5503P0("框架状态", null, c0616pi, 6, 2);
            me0 me0Var2 = me0.f3922a;
            u50.m4262c(c0616pi, s11.m3999b(me0Var2, 12.0f));
            C0701rt c0701rt = s11.f5620a;
            iw0 iw0VarM1508a = hw0.m1508a(c0755t8, c0239ga, c0616pi, 48);
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, c0701rt);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            C0462m7 c0462m7 = C0173ei.f1460e;
            w60.m4888J(c0616pi, c0462m7, iw0VarM1508a);
            C0462m7 c0462m72 = C0173ei.f1459d;
            w60.m4888J(c0616pi, c0462m72, fq0VarM3115l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0462m7 c0462m73 = C0173ei.f1461f;
            w60.m4918y(c0616pi, numValueOf, c0462m73);
            C0601p3 c0601p3 = C0173ei.f1462g;
            w60.m4885G(c0616pi, c0601p3);
            C0462m7 c0462m74 = C0173ei.f1458c;
            w60.m4888J(c0616pi, c0462m74, pe0VarM4020E);
            AbstractC0596oz.m2962a(z ? rd0.m3491t() : r60.m3416r(), null, s11.m4000c(me0Var2, 32.0f), z ? p30.m2993c(4283215696L) : p30.m2993c(4294940672L), c0616pi, 432, 0);
            u50.m4262c(c0616pi, s11.m4002e(12.0f));
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
            int iHashCode2 = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l2 = c0616pi.m3115l();
            pe0 pe0VarM4020E2 = s91.m4020E(c0616pi, me0Var2);
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, c0462m7, c0838vfM4197a);
            w60.m4888J(c0616pi, c0462m72, fq0VarM3115l2);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode2), c0462m73);
            w60.m4885G(c0616pi, c0601p3);
            w60.m4888J(c0616pi, c0462m74, pe0VarM4020E2);
            d71.m659b(z ? "模块已激活" : "模块未激活", null, z ? p30.m2993c(4283215696L) : p30.m2993c(4294940672L), j50.m1667q(16), C1018zv.f8008i, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 1597440, 0, 262058);
            String str9 = z ? "LSPosed 框架已成功连接" : "请确保 LSPosed 框架已安装并在管理器激活模块";
            long jM1667q = j50.m1667q(12);
            g41 g41Var = AbstractC0510nf.f4248a;
            d71.m659b(str9, null, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s, jM1667q, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 24576, 0, 262122);
            C0616pi c0616pi2 = c0616pi;
            c0616pi2.m3119p(true);
            c0616pi2.m3119p(true);
            if (z) {
                c0616pi2.m3090W(-373646211);
                u50.m4262c(c0616pi2, s11.m3999b(me0Var2, 12.0f));
                AbstractC0398kl.m1917c(null, 0.0f, ((C0429lf) c0616pi2.m3112j(g41Var)).f3469r, c0616pi2, 0, 3);
                C0616pi c0616pi3 = c0616pi2;
                u50.m4262c(c0616pi3, s11.m3999b(me0Var2, 12.0f));
                uo0 uo0Var = new uo0("框架名称", str);
                me0 me0Var3 = me0Var2;
                uo0 uo0Var2 = new uo0("框架版本", str2);
                uo0 uo0Var3 = new uo0("API 版本", str3);
                uo0 uo0Var4 = new uo0("内部版本", lf1Var.m2020a() > 0 ? String.valueOf(lf1Var.m2020a()) : "-");
                try {
                    C0373jz c0373jz = (C0373jz) lf1Var.f3481a;
                    c0373jz.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                        c0373jz.f2960a.transact(6, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        List listM2782v2 = o30.m2782v(o30.m2783w(uo0Var, uo0Var2, uo0Var3, uo0Var4, new uo0("API保护", (parcelObtain2.readLong() & 4) != 0 ? "已启用" : "未启用")));
                        if (str4 != null) {
                            listM2782v = o30.m2782v(o30.m2783w(new uo0("设备名称", str4), new uo0("设备代号", str5), new uo0("系统版本", "Android " + str6), new uo0("SDK", str7), new uo0("CPU 架构", str8)));
                        } else {
                            listM2782v = o30.m2782v(o30.m2783w(new uo0("设备", str5), new uo0("系统版本", "Android " + str6), new uo0("SDK", str7), new uo0("CPU 架构", str8)));
                        }
                        ArrayList arrayListM5249S = AbstractC0960ye.m5249S(listM2782v2, listM2782v);
                        int size = arrayListM5249S.size();
                        c90 c90VarM803a = e90.m803a(c0616pi3);
                        Object objM3080L = c0616pi3.m3080L();
                        C0675r3 c0675r3 = C0320ii.f2572a;
                        if (objM3080L == c0675r3) {
                            objM3080L = new dp0(0);
                            c0616pi3.m3107g0(objM3080L);
                        }
                        wg0 wg0Var = (wg0) objM3080L;
                        Integer numValueOf2 = Integer.valueOf(((dp0) c90VarM803a.f743e.f1697b).m720g());
                        boolean zM3104f = c0616pi3.m3104f(c90VarM803a);
                        Object objM3080L2 = c0616pi3.m3080L();
                        if (zM3104f || objM3080L2 == c0675r3) {
                            objM3080L2 = new C0997b(c90VarM803a, wg0Var, null);
                            c0616pi3.m3107g0(objM3080L2);
                        }
                        s91.m4039d(c0616pi3, (InterfaceC0904ww) objM3080L2, numValueOf2);
                        f21 f21VarM4280w = u50.m4280w(c90VarM803a, c0616pi3);
                        boolean zM3100d = c0616pi3.m3100d(size) | c0616pi3.m3108h(arrayListM5249S) | c0616pi3.m3108h(context);
                        Object objM3080L3 = c0616pi3.m3080L();
                        if (zM3100d || objM3080L3 == c0675r3) {
                            objM3080L3 = new mc0(size, arrayListM5249S, context);
                            c0616pi3.m3107g0(objM3080L3);
                        }
                        w60.m4894a(c0701rt, c90VarM803a, null, null, null, f21VarM4280w, null, (InterfaceC0742sw) objM3080L3, c0616pi3, 12582918);
                        if (size > 1) {
                            c0616pi3.m3090W(-369428351);
                            pe0 pe0VarM3448G = rd0.m3448G(c0701rt, 6.0f);
                            iw0 iw0VarM1508a2 = hw0.m1508a(rd0.f5364c, C0496n2.f4154n, c0616pi3, 6);
                            int iHashCode3 = Long.hashCode(c0616pi3.f4878T);
                            fq0 fq0VarM3115l3 = c0616pi3.m3115l();
                            pe0 pe0VarM4020E3 = s91.m4020E(c0616pi3, pe0VarM3448G);
                            c0616pi3.m3093Z();
                            if (c0616pi3.f4877S) {
                                c0616pi3.m3114k(c0094cj);
                            } else {
                                c0616pi3.m3113j0();
                            }
                            w60.m4888J(c0616pi3, c0462m7, iw0VarM1508a2);
                            w60.m4888J(c0616pi3, c0462m72, fq0VarM3115l3);
                            w60.m4918y(c0616pi3, Integer.valueOf(iHashCode3), c0462m73);
                            w60.m4885G(c0616pi3, c0601p3);
                            w60.m4888J(c0616pi3, c0462m74, pe0VarM4020E3);
                            c0616pi3.m3090W(-244382870);
                            int i2 = 0;
                            while (i2 < size) {
                                me0 me0Var4 = me0Var3;
                                pe0 pe0VarM2974J = p30.m2974J(s11.m4000c(rd0.m3447F(me0Var4, 3.0f, 0.0f, 2), i2 == m5553m0(wg0Var) ? 7.0f : 5.0f), ew0.f1541a, 518143);
                                int iM5553m0 = m5553m0(wg0Var);
                                long jM1305d = C0281hf.m1305d();
                                if (i2 != iM5553m0) {
                                    jM1305d = C0207ff.m1093b(0.25f, jM1305d);
                                }
                                AbstractC0993za.m5464a(s91.m4047l(pe0VarM2974J, jM1305d, pf1.f4843i), c0616pi3, 0);
                                i2++;
                                me0Var3 = me0Var4;
                            }
                            me0Var = me0Var3;
                            c0616pi3.m3119p(false);
                            c0616pi3.m3119p(true);
                            u50.m4262c(c0616pi3, s11.m3999b(me0Var, 2.0f));
                            d71.m659b("← 左右滑动查看更多 →", s11.f5620a, C0207ff.m1093b(0.4f, ((C0429lf) c0616pi3.m3112j(AbstractC0510nf.f4248a)).f3470s), j50.m1667q(10), null, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi3, 24630, 0, 261096);
                            c0616pi3 = c0616pi3;
                            z3 = false;
                        } else {
                            me0Var = me0Var3;
                            z3 = false;
                            c0616pi3.m3090W(-387742531);
                        }
                        c0616pi3.m3119p(z3);
                        long jM1667q2 = j50.m1667q(10);
                        g41 g41Var2 = AbstractC0510nf.f4248a;
                        long jM1093b = C0207ff.m1093b(0.4f, ((C0429lf) c0616pi3.m3112j(g41Var2)).f3470s);
                        C0701rt c0701rt2 = s11.f5620a;
                        C0616pi c0616pi4 = c0616pi3;
                        d71.m659b("长按信息区域可复制当前显示的全部信息", c0701rt2, jM1093b, jM1667q2, null, null, 0L, new r61(3), 0L, 0, false, 0, 0, null, c0616pi4, 24630, 0, 261096);
                        u50.m4262c(c0616pi4, s11.m3999b(me0Var, 8.0f));
                        iw0 iw0VarM1508a3 = hw0.m1508a(c0755t8, c0239ga, c0616pi4, 48);
                        int iHashCode4 = Long.hashCode(c0616pi4.f4878T);
                        fq0 fq0VarM3115l4 = c0616pi4.m3115l();
                        pe0 pe0VarM4020E4 = s91.m4020E(c0616pi4, c0701rt2);
                        InterfaceC0210fi.f1733b.getClass();
                        C0094cj c0094cj2 = C0173ei.f1457b;
                        c0616pi4.m3093Z();
                        if (c0616pi4.f4877S) {
                            c0616pi4.m3114k(c0094cj2);
                        } else {
                            c0616pi4.m3113j0();
                        }
                        w60.m4888J(c0616pi4, C0173ei.f1460e, iw0VarM1508a3);
                        w60.m4888J(c0616pi4, C0173ei.f1459d, fq0VarM3115l4);
                        w60.m4918y(c0616pi4, Integer.valueOf(iHashCode4), C0173ei.f1461f);
                        w60.m4885G(c0616pi4, C0173ei.f1462g);
                        w60.m4888J(c0616pi4, C0173ei.f1458c, pe0VarM4020E4);
                        AbstractC0596oz.m2962a(z2 ? rd0.m3491t() : r60.m3416r(), null, s11.m4000c(me0Var, 20.0f), z2 ? p30.m2993c(4283215696L) : p30.m2993c(4294940672L), c0616pi4, 432, 0);
                        u50.m4262c(c0616pi4, s11.m4002e(8.0f));
                        d71.m659b("作用域(" + list.size() + "): " + AbstractC0960ye.m5245O(list, ", ", null, null, null, 62), null, ((C0429lf) c0616pi4.m3112j(g41Var2)).f3468q, j50.m1667q(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi4, 24576, 0, 262122);
                        c0616pi2 = c0616pi4;
                        c0616pi2.m3119p(true);
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e) {
                    throw new C0725sg(e);
                }
            } else {
                c0616pi2.m3090W(-387742531);
            }
            c0616pi2.m3119p(false);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    private static final int m5553m0(wg0 wg0Var) {
        return ((dp0) wg0Var).m720g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m5555n0(wg0 wg0Var, int i) {
        ((dp0) wg0Var).m721h(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final na1 m5557o0(int i, final List list, final Context context, x80 x80Var) {
        x80Var.getClass();
        x80.m5103a(x80Var, i, new C0474mh(812864534, true, new InterfaceC0978yw() { // from class: rc0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0978yw
            /* JADX INFO: renamed from: b */
            public final Object mo259b(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj4).intValue();
                return zc0.m5559p0(list, context, (x60) obj, ((Integer) obj2).intValue(), (InterfaceC0356ji) obj3, iIntValue);
            }
        }));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final na1 m5559p0(List list, Context context, x60 x60Var, int i, InterfaceC0356ji interfaceC0356ji, int i2) {
        x60 x60Var2;
        int i3;
        x60Var.getClass();
        if ((i2 & 6) == 0) {
            x60Var2 = x60Var;
            i3 = i2 | (((C0616pi) interfaceC0356ji).m3104f(x60Var2) ? 4 : 2);
        } else {
            x60Var2 = x60Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ((C0616pi) interfaceC0356ji).m3100d(i) ? 32 : 16;
        }
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i3 & 1, (i3 & 147) != 146)) {
            Iterable iterable = (Iterable) list.get(i);
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (objM3080L == c0675r3) {
                objM3080L = new C0621pn(28);
                c0616pi.m3107g0(objM3080L);
            }
            String strM5245O = AbstractC0960ye.m5245O(iterable, "\n", null, null, (InterfaceC0742sw) objM3080L, 30);
            float f = 4.0f;
            float f2 = 0.0f;
            pe0 pe0VarM3447F = rd0.m3447F(x60.m5089a(x60Var2), 4.0f, 0.0f, 2);
            boolean zM3108h = c0616pi.m3108h(context) | c0616pi.m3104f(strM5245O);
            Object objM3080L2 = c0616pi.m3080L();
            if (zM3108h || objM3080L2 == c0675r3) {
                objM3080L2 = new kc0(context, strM5245O);
                c0616pi.m3107g0(objM3080L2);
            }
            InterfaceC0298hw interfaceC0298hw = (InterfaceC0298hw) objM3080L2;
            Object objM3080L3 = c0616pi.m3080L();
            if (objM3080L3 == c0675r3) {
                objM3080L3 = new a00(29);
                c0616pi.m3107g0(objM3080L3);
            }
            pe0 pe0VarMo2499c = pe0VarM3447F.mo2499c(new C0961yf((InterfaceC0298hw) objM3080L3, interfaceC0298hw));
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarMo2499c);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, c0838vfM4197a);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            c0616pi.m3090W(-1156974630);
            for (uo0 uo0Var : (Iterable) list.get(i)) {
                String str = (String) uo0Var.f6274d;
                String str2 = (String) uo0Var.f6275e;
                pe0 pe0VarM3447F2 = rd0.m3447F(s11.f5620a, f2, f, 1);
                iw0 iw0VarM1508a = hw0.m1508a(rd0.f5365d, C0496n2.f4154n, c0616pi, 6);
                int iHashCode2 = Long.hashCode(c0616pi.f4878T);
                fq0 fq0VarM3115l2 = c0616pi.m3115l();
                pe0 pe0VarM4020E2 = s91.m4020E(c0616pi, pe0VarM3447F2);
                InterfaceC0210fi.f1733b.getClass();
                C0094cj c0094cj2 = C0173ei.f1457b;
                c0616pi.m3093Z();
                if (c0616pi.f4877S) {
                    c0616pi.m3114k(c0094cj2);
                } else {
                    c0616pi.m3113j0();
                }
                w60.m4888J(c0616pi, C0173ei.f1460e, iw0VarM1508a);
                w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l2);
                w60.m4918y(c0616pi, Integer.valueOf(iHashCode2), C0173ei.f1461f);
                w60.m4885G(c0616pi, C0173ei.f1462g);
                w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E2);
                long jM1667q = j50.m1667q(13);
                g41 g41Var = AbstractC0510nf.f4248a;
                C0616pi c0616pi2 = c0616pi;
                d71.m659b(str, null, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s, jM1667q, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi2, 24576, 0, 262122);
                d71.m659b(str2, null, ((C0429lf) c0616pi2.m3112j(g41Var)).f3468q, j50.m1667q(13), C1018zv.f8006g, z51.f7806c, 0L, null, 0L, 0, false, 0, 0, null, c0616pi2, 1597440, 0, 261930);
                c0616pi2.m3119p(true);
                f = f;
                f2 = f2;
                c0616pi = c0616pi2;
            }
            C0616pi c0616pi3 = c0616pi;
            c0616pi3.m3119p(false);
            c0616pi3.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final CharSequence m5561q0(uo0 uo0Var) {
        uo0Var.getClass();
        return uo0Var.f6274d + ": " + uo0Var.f6275e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final na1 m5563r0(Context context, String str) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("info", str));
        Toast.makeText(context, "已复制当前页信息", 0).show();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final na1 m5565s0() {
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final na1 m5567t0(oh0 oh0Var) {
        m5545i0(oh0Var, !m5543h0(oh0Var));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final na1 m5569u0(InterfaceC0887wf interfaceC0887wf, oh0 oh0Var, InterfaceC0356ji interfaceC0356ji, int i) {
        oh0 oh0Var2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            C0239ga c0239ga = C0496n2.f4155o;
            C0701rt c0701rt = s11.f5620a;
            Object objM3080L = c0616pi.m3080L();
            if (objM3080L == C0320ii.f2572a) {
                oh0Var2 = oh0Var;
                objM3080L = new q70(oh0Var2, 4);
                c0616pi.m3107g0(objM3080L);
            } else {
                oh0Var2 = oh0Var;
            }
            pe0 pe0VarM3481j = rd0.m3481j(c0701rt, (InterfaceC0298hw) objM3080L);
            iw0 iw0VarM1508a = hw0.m1508a(rd0.f5362a, c0239ga, c0616pi, 48);
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarM3481j);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, iw0VarM1508a);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            m5503P0("使用说明", new s60(1.0f, true), c0616pi, 6, 0);
            d71.m659b(m5547j0(oh0Var2) ? "▲" : "▼", null, ((C0429lf) c0616pi.m3112j(AbstractC0510nf.f4248a)).f3470s, j50.m1667q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 24576, 0, 262122);
            c0616pi.m3119p(true);
            o30.m2762b(interfaceC0887wf, m5547j0(oh0Var), null, AbstractC0700rs.m3985a(), AbstractC0700rs.m3986b(), null, C0551oh.f4557a.m2917q(), c0616pi, 1600512);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final na1 m5571v0(oh0 oh0Var) {
        m5549k0(oh0Var, !m5547j0(oh0Var));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final na1 m5573w0(boolean z, InterfaceC0742sw interfaceC0742sw, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            m5503P0("图标隐藏设置", null, c0616pi, 6, 2);
            me0 me0Var = me0.f3922a;
            u50.m4262c(c0616pi, s11.m3999b(me0Var, 12.0f));
            C0701rt c0701rt = s11.f5620a;
            iw0 iw0VarM1508a = hw0.m1508a(rd0.f5365d, C0496n2.f4155o, c0616pi, 54);
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, c0701rt);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            C0462m7 c0462m7 = C0173ei.f1460e;
            w60.m4888J(c0616pi, c0462m7, iw0VarM1508a);
            C0462m7 c0462m72 = C0173ei.f1459d;
            w60.m4888J(c0616pi, c0462m72, fq0VarM3115l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0462m7 c0462m73 = C0173ei.f1461f;
            w60.m4918y(c0616pi, numValueOf, c0462m73);
            C0601p3 c0601p3 = C0173ei.f1462g;
            w60.m4885G(c0616pi, c0601p3);
            C0462m7 c0462m74 = C0173ei.f1458c;
            w60.m4888J(c0616pi, c0462m74, pe0VarM4020E);
            s60 s60Var = new s60(1.0f, true);
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
            int iHashCode2 = Long.hashCode(c0616pi.f4878T);
            fq0 fq0VarM3115l2 = c0616pi.m3115l();
            pe0 pe0VarM4020E2 = s91.m4020E(c0616pi, s60Var);
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, c0462m7, c0838vfM4197a);
            w60.m4888J(c0616pi, c0462m72, fq0VarM3115l2);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode2), c0462m73);
            w60.m4885G(c0616pi, c0601p3);
            w60.m4888J(c0616pi, c0462m74, pe0VarM4020E2);
            long jM1667q = j50.m1667q(15);
            C1018zv c1018zv = C1018zv.f8006g;
            g41 g41Var = AbstractC0510nf.f4248a;
            d71.m659b("桌面图标", null, ((C0429lf) c0616pi.m3112j(g41Var)).f3468q, jM1667q, c1018zv, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi, 1597446, 0, 262058);
            u50.m4262c(c0616pi, s11.m3999b(me0Var, 2.0f));
            d71.m659b("关闭后图标立即消失，LSPosed 内仍可启动", null, ((C0429lf) c0616pi.m3112j(g41Var)).f3470s, j50.m1667q(12), null, null, 0L, null, j50.m1667q(16), 0, false, 0, 0, null, c0616pi, 24582, 48, 260074);
            c0616pi.m3119p(true);
            u50.m4262c(c0616pi, s11.m4002e(12.0f));
            long j = C0207ff.f1703c;
            long jM1305d = C0281hf.m1305d();
            long j2 = C0207ff.f1706f;
            long jM2698d = AbstractC0510nf.m2698d(o30.f4419E, c0616pi);
            long jM2698d2 = AbstractC0510nf.m2698d(o30.f4426L, c0616pi);
            long jM2698d3 = AbstractC0510nf.m2698d(o30.f4429O, c0616pi);
            long jM2698d4 = AbstractC0510nf.m2698d(o30.f4425K, c0616pi);
            long jM2698d5 = AbstractC0510nf.m2698d(o30.f4428N, c0616pi);
            long jM3011u = p30.m3011u(C0207ff.m1093b(o30.f4447q, AbstractC0510nf.m2698d(o30.f4446p, c0616pi)), ((C0429lf) c0616pi.m3112j(g41Var)).f3467p);
            long jM2698d6 = AbstractC0510nf.m2698d(o30.f4450t, c0616pi);
            float f = o30.f4451u;
            w51.m4877a(z, interfaceC0742sw, null, false, new t51(j, jM1305d, j2, jM2698d, jM2698d2, jM2698d3, jM2698d4, jM2698d5, jM3011u, p30.m3011u(C0207ff.m1093b(f, jM2698d6), ((C0429lf) c0616pi.m3112j(g41Var)).f3467p), j2, p30.m3011u(C0207ff.m1093b(o30.f4449s, AbstractC0510nf.m2698d(o30.f4448r, c0616pi)), ((C0429lf) c0616pi.m3112j(g41Var)).f3467p), p30.m3011u(C0207ff.m1093b(o30.f4453w, AbstractC0510nf.m2698d(o30.f4452v, c0616pi)), ((C0429lf) c0616pi.m3112j(g41Var)).f3467p), p30.m3011u(C0207ff.m1093b(f, AbstractC0510nf.m2698d(o30.f4456z, c0616pi)), ((C0429lf) c0616pi.m3112j(g41Var)).f3467p), p30.m3011u(C0207ff.m1093b(f, AbstractC0510nf.m2698d(o30.f4415A, c0616pi)), ((C0429lf) c0616pi.m3112j(g41Var)).f3467p), p30.m3011u(C0207ff.m1093b(o30.f4455y, AbstractC0510nf.m2698d(o30.f4454x, c0616pi)), ((C0429lf) c0616pi.m3112j(g41Var)).f3467p)), c0616pi, 0);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final na1 m5575x0(String str, String str2, int i, InterfaceC0356ji interfaceC0356ji, int i2) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(i2 & 1, (i2 & 3) != 2)) {
            m5503P0("版本信息", null, c0616pi, 6, 2);
            u50.m4262c(c0616pi, s11.m3999b(me0.f3922a, 8.0f));
            str.getClass();
            m5579z0("编译时间", str, c0616pi, 6);
            m5579z0("版本号", "v" + str2 + " (" + i + ")", c0616pi, 6);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final na1 m5577y0(lf1 lf1Var, boolean z, InterfaceC0742sw interfaceC0742sw, pe0 pe0Var, int i, int i2, InterfaceC0356ji interfaceC0356ji, int i3) {
        m5541g0(lf1Var, z, interfaceC0742sw, pe0Var, interfaceC0356ji, j50.m1649A(i | 1), i2);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static final void m5579z0(String str, String str2, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        String str3;
        C0616pi c0616pi;
        str.getClass();
        str2.getClass();
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3091X(83543971);
        if ((i & 6) == 0) {
            i2 = i | (c0616pi2.m3104f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi2.m3104f(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (c0616pi2.m3082O(i3 & 1, (i3 & 19) != 18)) {
            pe0 pe0VarM3447F = rd0.m3447F(s11.f5620a, 0.0f, 4.0f, 1);
            iw0 iw0VarM1508a = hw0.m1508a(rd0.f5365d, C0496n2.f4154n, c0616pi2, 6);
            int iHashCode = Long.hashCode(c0616pi2.f4878T);
            fq0 fq0VarM3115l = c0616pi2.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi2, pe0VarM3447F);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi2.m3093Z();
            if (c0616pi2.f4877S) {
                c0616pi2.m3114k(c0094cj);
            } else {
                c0616pi2.m3113j0();
            }
            w60.m4888J(c0616pi2, C0173ei.f1460e, iw0VarM1508a);
            w60.m4888J(c0616pi2, C0173ei.f1459d, fq0VarM3115l);
            w60.m4918y(c0616pi2, Integer.valueOf(iHashCode), C0173ei.f1461f);
            w60.m4885G(c0616pi2, C0173ei.f1462g);
            w60.m4888J(c0616pi2, C0173ei.f1458c, pe0VarM4020E);
            long jM1667q = j50.m1667q(13);
            g41 g41Var = AbstractC0510nf.f4248a;
            d71.m659b(str, null, ((C0429lf) c0616pi2.m3112j(g41Var)).f3470s, jM1667q, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0616pi2, (i3 & 14) | 24576, 0, 262122);
            str3 = str2;
            d71.m659b(str3, null, ((C0429lf) c0616pi2.m3112j(g41Var)).f3468q, j50.m1667q(13), C1018zv.f8006g, z51.f7806c, 0L, null, 0L, 0, false, 0, 0, null, c0616pi2, ((i3 >> 3) & 14) | 1597440, 0, 261930);
            c0616pi = c0616pi2;
            c0616pi.m3119p(true);
        } else {
            str3 = str2;
            c0616pi = c0616pi2;
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new nc0(i, 0, str, str3);
        }
    }
}
