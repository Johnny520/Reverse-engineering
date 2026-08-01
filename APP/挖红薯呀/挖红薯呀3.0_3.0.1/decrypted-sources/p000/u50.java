package p000;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.window.BackEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u50 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final void m4257A(C0878w6 c0878w6, int i) {
        Object next;
        Iterator<T> it = c0878w6.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((b60) ((Map.Entry) next).getKey()).f406e == i) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        C0921xc.m5123d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final Rect m4258B(a30 a30Var) {
        return new Rect(a30Var.f39a, a30Var.f40b, a30Var.f41c, a30Var.f42d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final q20 m4259C(i20 i20Var) {
        return new q20(i20Var.f2404a, i20Var.f2405b, i20Var.f2406c, i20Var.f2407d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final String m4260D(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final qi0 m4261b(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new qi0(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m4262c(InterfaceC0356ji interfaceC0356ji, pe0 pe0Var) {
        C0043b5 c0043b5 = C0043b5.f379g;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        int iHashCode = Long.hashCode(c0616pi.f4878T);
        pe0 pe0VarM4020E = s91.m4020E(interfaceC0356ji, pe0Var);
        fq0 fq0VarM3115l = c0616pi.m3115l();
        InterfaceC0210fi.f1733b.getClass();
        C0094cj c0094cj = C0173ei.f1457b;
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3093Z();
        if (c0616pi2.f4877S) {
            c0616pi2.m3114k(c0094cj);
        } else {
            c0616pi2.m3113j0();
        }
        w60.m4888J(interfaceC0356ji, C0173ei.f1460e, c0043b5);
        w60.m4888J(interfaceC0356ji, C0173ei.f1459d, fq0VarM3115l);
        w60.m4885G(interfaceC0356ji, C0173ei.f1462g);
        w60.m4888J(interfaceC0356ji, C0173ei.f1458c, pe0VarM4020E);
        w60.m4918y(interfaceC0356ji, Integer.valueOf(iHashCode), C0173ei.f1461f);
        c0616pi2.m3119p(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m4263d(yb0 yb0Var, AbstractC0535o2 abstractC0535o2) {
        yb0 yb0VarMo51k0 = yb0Var.mo51k0();
        if (yb0VarMo51k0 == null) {
            w10.m4824b("Child of " + yb0Var + " cannot be null when calculating alignment line");
        }
        if (yb0Var.mo56o0().mo667a().containsKey(abstractC0535o2)) {
            Integer num = (Integer) yb0Var.mo56o0().mo667a().get(abstractC0535o2);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iM5235g0 = yb0VarMo51k0.m5235g0(abstractC0535o2);
            if (iM5235g0 != Integer.MIN_VALUE) {
                yb0VarMo51k0.f7596m = true;
                yb0Var.f7597n = true;
                yb0Var.mo59u0();
                yb0VarMo51k0.f7596m = false;
                yb0Var.f7597n = false;
                return iM5235g0 + ((int) (abstractC0535o2 instanceof C0110cz ? yb0VarMo51k0.mo58q0() & 4294967295L : yb0VarMo51k0.mo58q0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m4264e(jh0 jh0Var, Object obj, Object obj2) {
        int iM1700f = jh0Var.m1700f(obj);
        boolean z = iM1700f < 0;
        Object obj3 = z ? null : jh0Var.f2880c[iM1700f];
        if (obj3 != null) {
            if (obj3 instanceof kh0) {
                ((kh0) obj3).m1890a(obj2);
            } else if (obj3 != obj2) {
                kh0 kh0Var = new kh0();
                kh0Var.m1890a(obj3);
                kh0Var.m1890a(obj2);
                obj2 = kh0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            jh0Var.f2880c[iM1700f] = obj2;
            return;
        }
        int i = ~iM1700f;
        jh0Var.f2879b[i] = obj;
        jh0Var.f2880c[i] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static jh0 m4265f() {
        long[] jArr = dy0.f1212a;
        return new jh0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final long m4266g() {
        return Thread.currentThread().getId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final float m4267h(C0399km c0399km) {
        return c0399km.m2038m().f7941e == um0.f6265e ? Float.intBitsToFloat((int) (c0399km.m2041q() >> 32)) : Float.intBitsToFloat((int) (c0399km.m2041q() & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final boolean m4268i(long j, long j2) {
        return j == j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final nx0 m4269j(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(C0587R.id.view_tree_saved_state_registry_owner);
            nx0 nx0Var = tag instanceof nx0 ? (nx0) tag : null;
            if (nx0Var != null) {
                return nx0Var;
            }
            Object objM5455y = z60.m5455y(view);
            view = objM5455y instanceof View ? (View) objM5455y : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static l21 m4270k() {
        return (l21) t21.f5892b.m2801e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final ac0 m4271n(ac0 ac0Var) {
        b60 b60Var = ac0Var.f101r.f5180r;
        while (true) {
            b60 b60VarM315v = b60Var.m315v();
            b60 b60Var2 = null;
            if ((b60VarM315v != null ? b60VarM315v.f413l : null) == null) {
                ac0 ac0VarMo435E0 = b60Var.f395I.f3996d.mo435E0();
                ac0VarMo435E0.getClass();
                return ac0VarMo435E0;
            }
            b60 b60VarM315v2 = b60Var.m315v();
            if (b60VarM315v2 != null) {
                b60Var2 = b60VarM315v2.f413l;
            }
            b60Var2.getClass();
            b60 b60VarM315v3 = b60Var.m315v();
            b60VarM315v3.getClass();
            b60Var = b60VarM315v3.f413l;
            b60Var.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final gw0 m4272o(sd0 sd0Var) {
        Object objMo50j = sd0Var.mo50j();
        if (objMo50j instanceof gw0) {
            return (gw0) objMo50j;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final g71 m4273p(sz0 sz0Var) {
        InterfaceC0742sw interfaceC0742sw;
        ArrayList arrayList = new ArrayList();
        Object objM1701g = sz0Var.f5877d.m1701g(rz0.f5588a);
        if (objM1701g == null) {
            objM1701g = null;
        }
        C0533o0 c0533o0 = (C0533o0) objM1701g;
        if (c0533o0 == null || (interfaceC0742sw = (InterfaceC0742sw) c0533o0.f4378b) == null || !((Boolean) interfaceC0742sw.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (g71) arrayList.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final float m4274q(gw0 gw0Var) {
        if (gw0Var != null) {
            return gw0Var.f2082a;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final boolean m4275r(C0399km c0399km, float f) {
        c0399km.m2038m().getClass();
        return !(((c0399km.m2042r() ? -f : m4267h(c0399km)) > 0.0f ? 1 : ((c0399km.m2042r() ? -f : m4267h(c0399km)) == 0.0f ? 0 : -1)) > 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static l21 m4276s(l21 l21Var) {
        if (l21Var instanceof e91) {
            e91 e91Var = (e91) l21Var;
            if (e91Var.f1359t == m4266g()) {
                e91Var.f1357r = null;
                return l21Var;
            }
        }
        if (l21Var instanceof f91) {
            f91 f91Var = (f91) l21Var;
            if (f91Var.f1638i == m4266g()) {
                f91Var.f1637h = null;
                return l21Var;
            }
        }
        l21 l21VarM4169g = t21.m4169g(l21Var, null, false);
        l21VarM4169g.m1969j();
        return l21VarM4169g;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: t */
    public static MappedByteBuffer m4277t(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static Object m4278u(C0340j2 c0340j2, InterfaceC0298hw interfaceC0298hw) {
        l21 e91Var;
        l21 l21Var = (l21) t21.f5892b.m2801e();
        if (l21Var instanceof e91) {
            e91 e91Var2 = (e91) l21Var;
            if (e91Var2.f1359t == m4266g()) {
                InterfaceC0742sw interfaceC0742sw = e91Var2.f1357r;
                InterfaceC0742sw interfaceC0742sw2 = e91Var2.f1358s;
                try {
                    ((e91) l21Var).f1357r = t21.m4173k(c0340j2, interfaceC0742sw, true);
                    ((e91) l21Var).f1358s = interfaceC0742sw2;
                    return interfaceC0298hw.invoke();
                } finally {
                    e91Var2.f1357r = interfaceC0742sw;
                    e91Var2.f1358s = interfaceC0742sw2;
                }
            }
        }
        if (l21Var == null || (l21Var instanceof nh0)) {
            e91Var = new e91(l21Var instanceof nh0 ? (nh0) l21Var : null, c0340j2, null, true, false);
        } else {
            e91Var = l21Var.mo821u(c0340j2);
        }
        try {
            l21 l21VarM1969j = e91Var.m1969j();
            try {
                Object objInvoke = interfaceC0298hw.invoke();
                l21.m1966q(l21VarM1969j);
                e91Var.mo807c();
                return objInvoke;
            } catch (Throwable th) {
                l21.m1966q(l21VarM1969j);
                throw th;
            }
        } catch (Throwable th2) {
            e91Var.mo807c();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v12, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173 A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x0173: PHI (r6v12 w4) = (r6v11 w4), (r6v13 w4) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r21v8 p81) = (r21v7 p81), (r21v9 p81) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r22v5 f8) = (r22v4 f8), (r22v6 f8) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r23v5 m5) = (r23v4 m5), (r23v6 m5) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r24v6 fk) = (r24v5 fk), (r24v7 fk) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r26v8 xv0) = (r26v7 xv0), (r26v9 xv0) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4279v(ViewStructure viewStructure, b60 b60Var, AutofillId autofillId, String str, ut0 ut0Var) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        p81 p81Var;
        C0200f8 c0200f8;
        C0460m5 c0460m5;
        xv0 xv0Var;
        C0876w4 c0876w4;
        boolean z;
        InterfaceC0212fk interfaceC0212fk;
        Boolean bool;
        boolean z2;
        Integer num;
        int i2;
        List list;
        Integer numValueOf;
        boolean z3;
        String[] strArrM3492u;
        String strM4260D;
        String[] strArrM3492u2;
        String[] strArrM3492u3;
        jh0 jh0Var;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        jh0 jh0Var2;
        p81 p81Var2;
        C0200f8 c0200f82;
        C0460m5 c0460m52;
        xv0 xv0Var2;
        e01 e01Var = b01.f322a;
        e01 e01Var2 = rz0.f5588a;
        sz0 sz0VarM317x = b60Var.m317x();
        int i4 = 8;
        if (sz0VarM317x == null || (jh0Var2 = sz0VarM317x.f5877d) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            p81Var = null;
            c0200f8 = null;
            c0460m5 = null;
            xv0Var = null;
            c0876w4 = null;
            z = false;
            interfaceC0212fk = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            Object[] objArr3 = jh0Var2.f2879b;
            j = 128;
            Object[] objArr4 = jh0Var2.f2880c;
            long[] jArr3 = jh0Var2.f2878a;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i5 = 0;
                c0876w4 = null;
                j2 = 255;
                z = false;
                p81Var2 = null;
                c0200f82 = null;
                c0460m52 = null;
                interfaceC0212fk = null;
                bool = null;
                xv0Var2 = null;
                z2 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                e01 e01Var3 = (e01) obj;
                                if (p30.m3002l(e01Var3, b01.f339r)) {
                                    obj2.getClass();
                                    c0876w4 = (C0876w4) obj2;
                                } else if (p30.m3002l(e01Var3, b01.f322a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) AbstractC0960ye.m5241K((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (p30.m3002l(e01Var3, b01.f338q)) {
                                    obj2.getClass();
                                    interfaceC0212fk = (InterfaceC0212fk) obj2;
                                } else if (p30.m3002l(e01Var3, b01.f340s)) {
                                    obj2.getClass();
                                    c0460m52 = (C0460m5) obj2;
                                } else if (p30.m3002l(e01Var3, b01.f312E)) {
                                    obj2.getClass();
                                    c0200f82 = (C0200f8) obj2;
                                } else if (p30.m3002l(e01Var3, b01.f332k)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (p30.m3002l(e01Var3, b01.f320M)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (p30.m3002l(e01Var3, b01.f316I)) {
                                    z2 = true;
                                } else if (p30.m3002l(e01Var3, b01.f335n)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (p30.m3002l(e01Var3, b01.f345x)) {
                                    obj2.getClass();
                                    xv0Var2 = (xv0) obj2;
                                } else if (p30.m3002l(e01Var3, b01.f314G)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (p30.m3002l(e01Var3, b01.f315H)) {
                                    obj2.getClass();
                                    p81Var2 = (p81) obj2;
                                } else if (p30.m3002l(e01Var3, rz0.f5589b)) {
                                    viewStructure.setClickable(true);
                                } else if (p30.m3002l(e01Var3, rz0.f5590c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (p30.m3002l(e01Var3, rz0.f5609v)) {
                                    viewStructure.setFocusable(true);
                                } else if (p30.m3002l(e01Var3, rz0.f5598k)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                c0876w4 = null;
                z = false;
                p81Var2 = null;
                c0200f82 = null;
                c0460m52 = null;
                interfaceC0212fk = null;
                bool = null;
                xv0Var2 = null;
                z2 = false;
                num = null;
            }
            p81Var = p81Var2;
            c0200f8 = c0200f82;
            c0460m5 = c0460m52;
            xv0Var = xv0Var2;
        }
        sz0 sz0VarM317x2 = b60Var.m317x();
        if (sz0VarM317x2 != null && sz0VarM317x2.f5879f && !sz0VarM317x2.f5880g) {
            sz0VarM317x2 = sz0VarM317x2.m4136b();
            dh0 dh0Var = new dh0(((ph0) b60Var.m307n()).f4858d.f5770f);
            dh0Var.m699c(b60Var.m307n());
            while (dh0Var.m705i()) {
                b60 b60Var2 = (b60) dh0Var.m707k(dh0Var.f1109b - 1);
                sz0 sz0VarM317x3 = b60Var2.m317x();
                if (sz0VarM317x3 != null && !sz0VarM317x3.f5879f) {
                    sz0VarM317x2.m4138d(sz0VarM317x3);
                    if (!sz0VarM317x3.f5880g) {
                        dh0Var.m699c(b60Var2.m307n());
                    }
                }
            }
        }
        if (sz0VarM317x2 == null || (jh0Var = sz0VarM317x2.f5877d) == null) {
            i2 = 1;
        } else {
            Object[] objArr5 = jh0Var.f2879b;
            Object[] objArr6 = jh0Var.f2880c;
            long[] jArr4 = jh0Var.f2878a;
            int length2 = jArr4.length - 2;
            i2 = 1;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr5[i14];
                                Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                e01 e01Var4 = (e01) obj3;
                                objArr2 = objArr5;
                                if (p30.m3002l(e01Var4, b01.f330i)) {
                                    viewStructure.setEnabled(false);
                                } else if (p30.m3002l(e01Var4, b01.f308A)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
            }
            Integer numValueOf2 = Integer.valueOf(b60Var.f406e);
            if (b60Var.m315v() == null) {
                numValueOf2 = null;
            }
            int iIntValue = numValueOf2 == null ? numValueOf2.intValue() : -1;
            viewStructure.setAutofillId(autofillId, iIntValue);
            viewStructure.setId(iIntValue, str, null, null);
            numValueOf = c0876w4 == null ? Integer.valueOf(c0876w4.f6998a) : z ? Integer.valueOf(i2) : p81Var != null ? Integer.valueOf(i) : null;
            if (numValueOf != null) {
                viewStructure.setAutofillType(numValueOf.intValue());
            }
            if (c0200f8 != null) {
                viewStructure.setAutofillValue(AutofillValue.forText(c0200f8.f1625e));
            }
            if (c0460m5 != null) {
                viewStructure.setAutofillValue(c0460m5.f3805a);
            }
            if (interfaceC0212fk != null && (strArrM3492u3 = rd0.m3492u(interfaceC0212fk)) != null) {
                viewStructure.setAutofillHints(strArrM3492u3);
            }
            ut0Var.f6297a.m4256h(b60Var.f406e, new vr0(viewStructure));
            if (bool != null) {
                viewStructure.setSelected(bool.booleanValue());
            }
            if (p81Var != null) {
                if (bool != null && (xv0Var == null || xv0Var.f7427a != 4)) {
                    z3 = true;
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                InterfaceC0212fk.f1745a.getClass();
                strArrM3492u = rd0.m3492u(C0175ek.f1478b);
                strArrM3492u.getClass();
                if (strArrM3492u.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                boolean z4 = (z2 || ((interfaceC0212fk == null || (strArrM3492u2 = rd0.m3492u(interfaceC0212fk)) == null || AbstractC0201f9.m1066l0(strArrM3492u2, strArrM3492u[0]) < 0) ? false : z3)) ? z3 : false;
                viewStructure.setDataIsSensitive((z4 || zBooleanValue) ? z3 : false);
                viewStructure.setVisibility(b60Var.f395I.f3996d.m3274O0() ? 4 : 0);
                if (list != null) {
                    int size = list.size();
                    String str2 = "";
                    for (int i15 = 0; i15 < size; i15++) {
                        str2 = str2 + ((C0200f8) list.get(i15)).f1625e + '\n';
                    }
                    viewStructure.setText(str2);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (((ph0) b60Var.m307n()).isEmpty() && xv0Var != null && (strM4260D = m4260D(xv0Var.f7427a)) != null) {
                    viewStructure.setClassName(strM4260D);
                }
                if (z) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (num != null) {
                        viewStructure.setMaxTextLength(num.intValue());
                    }
                    if (z4) {
                        viewStructure.setInputType(129);
                        return;
                    }
                    return;
                }
                return;
            }
            viewStructure.setCheckable(i2);
            viewStructure.setChecked(p81Var == p81.f4779d);
            z3 = true;
            InterfaceC0212fk.f1745a.getClass();
            strArrM3492u = rd0.m3492u(C0175ek.f1478b);
            strArrM3492u.getClass();
            if (strArrM3492u.length == 0) {
            }
        }
        list = null;
        Integer numValueOf22 = Integer.valueOf(b60Var.f406e);
        if (b60Var.m315v() == null) {
        }
        if (numValueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (c0876w4 == null) {
        }
        if (numValueOf != null) {
        }
        if (c0200f8 != null) {
        }
        if (c0460m5 != null) {
        }
        if (interfaceC0212fk != null) {
            viewStructure.setAutofillHints(strArrM3492u3);
        }
        ut0Var.f6297a.m4256h(b60Var.f406e, new vr0(viewStructure));
        if (bool != null) {
        }
        if (p81Var != null) {
        }
        z3 = true;
        InterfaceC0212fk.f1745a.getClass();
        strArrM3492u = rd0.m3492u(C0175ek.f1478b);
        strArrM3492u.getClass();
        if (strArrM3492u.length == 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final f21 m4280w(c90 c90Var, C0616pi c0616pi) {
        boolean zM3104f = c0616pi.m3104f(c90Var);
        Object objM3080L = c0616pi.m3080L();
        Object obj = C0320ii.f2572a;
        if (zM3104f || objM3080L == obj) {
            objM3080L = new y80(c90Var);
            c0616pi.m3107g0(objM3080L);
        }
        j21 j21Var = (j21) objM3080L;
        Object obj2 = (InterfaceC0968ym) c0616pi.m3112j(AbstractC0131dj.f1121h);
        C0478ml c0478mlM2429a = m31.m2429a(c0616pi);
        boolean zM3104f2 = c0616pi.m3104f(obj2) | c0616pi.m3104f(j21Var) | c0616pi.m3104f(c0478mlM2429a);
        Object objM3080L2 = c0616pi.m3080L();
        if (zM3104f2 || objM3080L2 == obj) {
            objM3080L2 = new f21(j21Var, c0478mlM2429a, s91.m4028O(0.0f, 400.0f, null, 5));
            c0616pi.m3107g0(objM3080L2);
        }
        return (f21) objM3080L2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final boolean m4281x(jh0 jh0Var, Object obj, Object obj2) {
        Object objM1701g = jh0Var.m1701g(obj);
        if (objM1701g == null) {
            return false;
        }
        if (!(objM1701g instanceof kh0)) {
            if (!objM1701g.equals(obj2)) {
                return false;
            }
            jh0Var.m1705k(obj);
            return true;
        }
        kh0 kh0Var = (kh0) objM1701g;
        boolean zM1901l = kh0Var.m1901l(obj2);
        if (zM1901l && kh0Var.m1896g()) {
            jh0Var.m1705k(obj);
        }
        return zM1901l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final void m4282y(jh0 jh0Var, Object obj) {
        boolean zM1896g;
        long[] jArr = jh0Var.f2878a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = jh0Var.f2879b[i4];
                        Object obj3 = jh0Var.f2880c[i4];
                        if (obj3 instanceof kh0) {
                            kh0 kh0Var = (kh0) obj3;
                            kh0Var.m1901l(obj);
                            zM1896g = kh0Var.m1896g();
                        } else {
                            zM1896g = obj3 == obj;
                        }
                        if (zM1896g) {
                            jh0Var.m1706l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m4283z(l21 l21Var, l21 l21Var2, InterfaceC0742sw interfaceC0742sw) {
        if (l21Var != l21Var2) {
            l21Var2.getClass();
            l21.m1966q(l21Var);
            l21Var2.mo807c();
        } else if (l21Var instanceof e91) {
            ((e91) l21Var).f1357r = interfaceC0742sw;
        } else if (l21Var instanceof f91) {
            ((f91) l21Var).f1637h = interfaceC0742sw;
        } else {
            C0921xc.m5130k(l21Var, "Non-transparent snapshot was reused: ");
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract C0791u5 mo3023l();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public Object m4284m(int i) {
        Object objInvoke;
        k30 k30VarM4251b = mo3023l().m4251b(i);
        int i2 = i - k30VarM4251b.f3000a;
        InterfaceC0742sw key = k30VarM4251b.f3002c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new C0097cm(i) : objInvoke;
    }
}
