package p077f8;

import ac.AbstractC0063p;
import ac.C0055h;
import ac.C0056i;
import ac.C0058k;
import ac.C0066s;
import ac.SharedPreferencesC0062o;
import ae.C0071b;
import ae.C0075f;
import ae.C0077h;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.LocaleList;
import android.os.Trace;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.lifecycle.C0119x;
import be.AbstractC0283h;
import bsh.C0353j;
import bsh.ParserConstants;
import bsh.org.objectweb.asm.Opcodes;
import ch.C0570e;
import gg.AbstractC1416l;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Pattern;
import md.AbstractC2828e;
import md.C2825b;
import md.C2826c;
import md.EnumC2824a;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p002a1.RunnableC0006d;
import p003a2.C0014a;
import p012ah.C0086a;
import p023b8.AbstractC0212j;
import p023b8.C0207e;
import p023b8.C0208f;
import p023b8.C0210h;
import p025bc.AbstractC0255e;
import p027c0.C0362g;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p069f.AbstractC0957r0;
import p069f.C0943k0;
import p069f.C0945l0;
import p071f1.AbstractC0996c0;
import p085fg.InterfaceC1235p;
import p086fh.C1253k;
import p092g4.AbstractC1341a;
import p100h0.C1511d1;
import p100h0.C1512e;
import p100h0.C1514e1;
import p100h0.C1563z0;
import p100h0.InterfaceC1533l;
import p115hh.C1724i;
import p115hh.C1730o;
import p115hh.C1731p;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p119i2.AbstractC1923e0;
import p119i2.AbstractC1928h;
import p119i2.AbstractC1938m;
import p119i2.C1914a;
import p119i2.C1922e;
import p119i2.C1926g;
import p119i2.C1933j0;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1942o;
import p119i2.C1947r;
import p129ig.AbstractC2043a;
import p133j2.C2061k;
import p136j8.C2104o;
import p143jh.C2140d;
import p157kd.AbstractC2390d;
import p175m0.C2705l0;
import p176m1.C2730f;
import p199nd.C2988t;
import p199nd.C2989u;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p225p2.C3289a;
import p225p2.C3290b;
import p227p4.AbstractC3303h;
import p227p4.AbstractC3307l;
import p227p4.C3296b0;
import p233pd.EnumC3400k;
import p238q4.C3439b;
import p258r8.C3742g;
import p267s1.AbstractC3898h0;
import p276sf.C3959f;
import p276sf.C3960g;
import p280t2.EnumC4094j;
import p293u2.AbstractC4232b;
import p293u2.C4245o;
import p293u2.C4246p;
import p293u2.InterfaceC4233c;
import p295u4.C4265o;
import p295u4.C4266p;
import p300ub.AbstractC4302b;
import p302ud.C4305a;
import p302ud.C4306b;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4313i;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p311v4.AbstractC4471t;
import p311v4.AbstractC4472u;
import p311v4.C4469r;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.InterfaceC4647y0;
import p332wb.C5094m0;
import p350xd.AbstractC5774a;
import p351xe.AbstractC5798s;
import p351xe.C5781b;
import p351xe.C5786g;
import p356y0.C5850l;
import p369yd.AbstractC6027a;
import p376z4.C6090d;
import p379z7.C6116l;
import p383zd.C6138c;
import tf.AbstractC4167n;
import tf.C4173t;
import wf.C5562h;
import wf.InterfaceC5559e;
import wf.InterfaceC5560f;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: f8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1089i {

    /* JADX INFO: renamed from: a */
    public static C2730f f3503a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static final float m2717A0(long j3, float f3, InterfaceC4233c interfaceC4233c) {
        float fM8540c;
        long jM8539b = C4245o.m8539b(j3);
        if (C4246p.m8542a(jM8539b, 4294967296L)) {
            if (interfaceC4233c.mo1335q0() <= 1.05d) {
                return interfaceC4233c.mo1594O0(j3);
            }
            fM8540c = C4245o.m8540c(j3) / C4245o.m8540c(interfaceC4233c.mo1598e0(f3));
        } else {
            if (!C4246p.m8542a(jM8539b, 8589934592L)) {
                return Float.NaN;
            }
            fM8540c = C4245o.m8540c(j3);
        }
        return fM8540c * f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final long m2718B(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public static void m2719B0(SharedPreferences sharedPreferences, String str, String str2, List list) {
        if (!list.isEmpty()) {
            C0828b.f2478a.m2097j(sharedPreferences, str, str2, list);
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                editorEdit.clear().putString("cache.key", str);
            }
            editorEdit.remove(str2).apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static int m2720C(InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            Iterator it = ((InterfaceC4312h) interfaceC4314j).mo8643g().iterator();
            while (it.hasNext()) {
                int i9 = ((C4320p) it.next()).f9752i;
                if (i9 != 0) {
                    return i9;
                }
            }
        } else {
            if (interfaceC4314j instanceof AbstractC6027a) {
                return ((AbstractC6027a) interfaceC4314j).m10789H();
            }
            if (interfaceC4314j instanceof InterfaceC4313i) {
                List listMo8673i = ((InterfaceC4313i) interfaceC4314j).mo8673i();
                if (!listMo8673i.isEmpty()) {
                    Iterator it2 = listMo8673i.iterator();
                    while (it2.hasNext()) {
                        int iM2720C = m2720C((InterfaceC4314j) it2.next());
                        if (iM2720C != 0) {
                            return iM2720C;
                        }
                    }
                }
                return 0;
            }
            if (interfaceC4314j instanceof InterfaceC4318n) {
                List listMo8675u = ((InterfaceC4318n) interfaceC4314j).mo8675u();
                if (!listMo8675u.isEmpty()) {
                    Iterator it3 = listMo8675u.iterator();
                    while (it3.hasNext()) {
                        int iM2720C2 = m2720C((InterfaceC4314j) it3.next());
                        if (iM2720C2 != 0) {
                            return iM2720C2;
                        }
                    }
                }
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static final void m2721C0(Spannable spannable, long j3, int i9, int i10) {
        if (j3 != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC0996c0.m2526w(j3)), i9, i10, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static InterfaceC4312h m2722D(InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            return (InterfaceC4312h) interfaceC4314j;
        }
        if (interfaceC4314j instanceof InterfaceC4313i) {
            return null;
        }
        if (!(interfaceC4314j instanceof InterfaceC4318n)) {
            C0086a.m452k(m2740M0(interfaceC4314j));
            return null;
        }
        List listMo8675u = ((InterfaceC4318n) interfaceC4314j).mo8675u();
        if (listMo8675u.isEmpty()) {
            return null;
        }
        return m2722D((InterfaceC4314j) listMo8675u.get(listMo8675u.size() - 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static final void m2723D0(Spannable spannable, long j3, InterfaceC4233c interfaceC4233c, int i9, int i10) {
        long jM8539b = C4245o.m8539b(j3);
        if (C4246p.m8542a(jM8539b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC2043a.m5018X(interfaceC4233c.mo1594O0(j3)), false), i9, i10, 33);
        } else if (C4246p.m8542a(jM8539b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C4245o.m8540c(j3)), i9, i10, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static C4320p m2724E(InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            List listMo8643g = ((InterfaceC4312h) interfaceC4314j).mo8643g();
            if (!listMo8643g.isEmpty()) {
                return (C4320p) listMo8643g.get(listMo8643g.size() - 1);
            }
        } else {
            if (interfaceC4314j instanceof InterfaceC4313i) {
                return null;
            }
            if (!(interfaceC4314j instanceof InterfaceC4318n)) {
                C0086a.m452k(m2740M0(interfaceC4314j));
                return null;
            }
            List listMo8675u = ((InterfaceC4318n) interfaceC4314j).mo8675u();
            if (!listMo8675u.isEmpty()) {
                return m2724E((InterfaceC4314j) listMo8675u.get(listMo8675u.size() - 1));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: E0 */
    public static final void m2725E0(Spannable spannable, C3290b c3290b, int i9, int i10) {
        if (c3290b != null) {
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(c3290b));
            Iterator it = c3290b.f10461g.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3289a) it.next()).f10459a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i9, i10, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static C5781b m2726F(InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            InterfaceC4312h interfaceC4312h = (InterfaceC4312h) interfaceC4314j;
            C4320p c4320p = (C4320p) AbstractC0283h.m1126F(interfaceC4312h.mo8643g());
            if (c4320p == null) {
                return null;
            }
            return new C5781b(interfaceC4312h, c4320p);
        }
        if (!(interfaceC4314j instanceof InterfaceC4313i)) {
            if (!(interfaceC4314j instanceof InterfaceC4318n)) {
                C0086a.m452k(m2740M0(interfaceC4314j));
                return null;
            }
            List listMo8675u = ((InterfaceC4318n) interfaceC4314j).mo8675u();
            if (listMo8675u.isEmpty()) {
                return null;
            }
            return m2726F((InterfaceC4314j) AbstractC0283h.m1126F(listMo8675u));
        }
        List<InterfaceC4314j> listMo8673i = ((InterfaceC4313i) interfaceC4314j).mo8673i();
        if (listMo8673i.stream().filter(new C4306b(7)).count() != 1) {
            return null;
        }
        for (InterfaceC4314j interfaceC4314j2 : listMo8673i) {
            if (interfaceC4314j2 != null) {
                return m2726F(interfaceC4314j2);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static final void m2727F0(C2705l0 c2705l0, int i9, Object obj) {
        c2705l0.f8778g[(c2705l0.f8779h - c2705l0.f8774c[c2705l0.f8775d - 1].f8771b) + i9] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static int m2728G(int i9, int i10) {
        if (i10 >= 268435456) {
            C2104o.m5276A("data size out of limit");
            return 0;
        }
        int i11 = SharedPreferencesC0062o.f188A;
        if (i10 <= i11) {
            return i11;
        }
        while (i9 < i10) {
            i9 <<= 1;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public static final void m2729G0(C2705l0 c2705l0, int i9, Object obj, int i10, Object obj2) {
        int i11 = c2705l0.f8779h - c2705l0.f8774c[c2705l0.f8775d - 1].f8771b;
        Object[] objArr = c2705l0.f8778g;
        objArr[i9 + i11] = obj;
        objArr[i11 + i10] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static LinkedHashSet m2730H(SharedPreferencesC0062o sharedPreferencesC0062o, C0055h c0055h) {
        String str = sharedPreferencesC0062o.f192b;
        try {
            byte[] bArrM5047u = AbstractC2043a.m5047u(new File(sharedPreferencesC0062o.f191a + str, (String) c0055h.f171b));
            if (bArrM5047u == null) {
                Log.w("FastKV", str, new Exception("Read object data failed"));
                return null;
            }
            int i9 = bArrM5047u[0] & 255;
            String strM357h = sharedPreferencesC0062o.f198h.m357h(bArrM5047u, 1, i9);
            if (((C0066s) sharedPreferencesC0062o.f193c.get(strM357h)) != null) {
                int i10 = i9 + 1;
                return C0066s.m435a(bArrM5047u, i10, bArrM5047u.length - i10);
            }
            Log.w("FastKV", str, new Exception("No encoder for tag:".concat(strM357h)));
            return null;
        } catch (Exception e6) {
            Log.e("FastKV", str, e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public static long m2731H0(int i9, long j3) {
        int i10 = (i9 & 7) << 3;
        return (j3 >>> (64 - i10)) | (j3 << i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public static final void m2732I0(Object obj) {
        if (obj instanceof C3959f) {
            throw ((C3959f) obj).f12963g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static String m2733J(SharedPreferencesC0062o sharedPreferencesC0062o, C0056i c0056i) {
        String str = sharedPreferencesC0062o.f192b;
        try {
            byte[] bArrM5047u = AbstractC2043a.m5047u(new File(sharedPreferencesC0062o.f191a + str, (String) c0056i.f171b));
            if (bArrM5047u != null) {
                return new String(bArrM5047u, StandardCharsets.UTF_8);
            }
            return null;
        } catch (Exception e6) {
            Log.e("FastKV", str, e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public static void m2734J0(SharedPreferencesC0062o sharedPreferencesC0062o) {
        sharedPreferencesC0062o.f213w = 1;
        AbstractC2043a.m5036j(sharedPreferencesC0062o.f208r);
        AbstractC2043a.m5036j(sharedPreferencesC0062o.f209s);
        sharedPreferencesC0062o.f208r = null;
        sharedPreferencesC0062o.f209s = null;
        sharedPreferencesC0062o.f210t = null;
        sharedPreferencesC0062o.f211u = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static boolean m2735K(InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            return AbstractC0000a.m94v((InterfaceC4312h) interfaceC4314j, EnumC3400k.f10968T);
        }
        if (interfaceC4314j instanceof InterfaceC4318n) {
            List listMo8675u = ((InterfaceC4318n) interfaceC4314j).mo8675u();
            return !listMo8675u.isEmpty() && m2735K((InterfaceC4314j) listMo8675u.get(listMo8675u.size() - 1));
        }
        C0086a.m452k("Unknown container type: ".concat(String.valueOf(interfaceC4314j)));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public static final void m2736K0(long j3, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static boolean m2737L(InterfaceC4314j interfaceC4314j, InterfaceC4314j interfaceC4314j2) {
        boolean zIsEmpty = false;
        if (interfaceC4314j2 instanceof C4305a) {
            List list = ((C4305a) interfaceC4314j2).f14353n;
            if (list.isEmpty()) {
                zIsEmpty = true;
            } else if (list.size() == 1) {
                zIsEmpty = ((C4305a) list.get(0)).f14353n.isEmpty();
            }
            if (!zIsEmpty) {
                return m2751U((InterfaceC4312h) interfaceC4314j2, interfaceC4314j);
            }
        } else {
            if (interfaceC4314j2 instanceof InterfaceC4313i) {
                return AbstractC0283h.m1159g(((InterfaceC4313i) interfaceC4314j2).mo8673i(), new C4306b(6));
            }
            if (interfaceC4314j2 instanceof InterfaceC4312h) {
                return m2751U((InterfaceC4312h) interfaceC4314j2, interfaceC4314j);
            }
            if (!(interfaceC4314j2 instanceof InterfaceC4318n)) {
                C0086a.m452k(m2740M0(interfaceC4314j2));
                return false;
            }
            List listMo8675u = ((InterfaceC4318n) interfaceC4314j2).mo8675u();
            if (listMo8675u.isEmpty() || !m2737L(interfaceC4314j, (InterfaceC4314j) listMo8675u.get(listMo8675u.size() - 1))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public static void m2738L0(SharedPreferencesC0062o sharedPreferencesC0062o, File file, File file2) {
        String str = sharedPreferencesC0062o.f192b;
        try {
            if (m2770h0(sharedPreferencesC0062o, file)) {
                return;
            }
        } catch (IOException e6) {
            Log.w("FastKV", str, e6);
        }
        m2803z0(sharedPreferencesC0062o);
        try {
            if (m2770h0(sharedPreferencesC0062o, file2)) {
                return;
            }
        } catch (IOException e7) {
            Log.w("FastKV", str, e7);
        }
        m2803z0(sharedPreferencesC0062o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static boolean m2739M(InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            return AbstractC0000a.m0A((InterfaceC4312h) interfaceC4314j);
        }
        if (!(interfaceC4314j instanceof InterfaceC4313i)) {
            if (interfaceC4314j instanceof InterfaceC4318n) {
                InterfaceC4314j interfaceC4314j2 = (InterfaceC4314j) AbstractC5798s.m10515i(((InterfaceC4318n) interfaceC4314j).mo8675u());
                return interfaceC4314j2 != null && m2739M(interfaceC4314j2);
            }
            C0086a.m452k(m2740M0(interfaceC4314j));
            return false;
        }
        for (InterfaceC4314j interfaceC4314j3 : ((InterfaceC4313i) interfaceC4314j).mo8673i()) {
            if (interfaceC4314j3 == null || !m2739M(interfaceC4314j3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public static String m2740M0(InterfaceC4314j interfaceC4314j) {
        return interfaceC4314j == null ? "Null container variable" : "Unknown container type: ".concat(String.valueOf(interfaceC4314j.getClass()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static final boolean m2741N(C1926g c1926g) {
        int length = c1926g.f6529h.length();
        List list = c1926g.f6528g;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                C1922e c1922e = (C1922e) list.get(i9);
                if ((c1922e.f6503a instanceof AbstractC1938m) && AbstractC1928h.m4798b(0, length, c1922e.f6504b, c1922e.f6505c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public static boolean m2742N0(int i9) {
        return i9 == (i9 & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static boolean m2743O(C4305a c4305a, InterfaceC4314j interfaceC4314j) {
        if (c4305a == interfaceC4314j) {
            return true;
        }
        if (interfaceC4314j instanceof C4305a) {
            return AbstractC0000a.m89s0(c4305a, (C4305a) interfaceC4314j);
        }
        if (interfaceC4314j instanceof InterfaceC4312h) {
            return false;
        }
        if (!(interfaceC4314j instanceof InterfaceC4318n)) {
            C0086a.m452k(m2740M0(interfaceC4314j));
            return false;
        }
        Iterator it = ((InterfaceC4318n) interfaceC4314j).mo8675u().iterator();
        while (it.hasNext()) {
            if (m2743O(c4305a, (InterfaceC4314j) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public static boolean m2744O0(int i9) {
        return i9 == (i9 & 15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P0 */
    public static boolean m2745P0(int i9) {
        return i9 == (65535 & i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    public static final long m2746Q0(long j3, long j4) {
        int iM4814d;
        int iM4816f = C1939m0.m4816f(j3);
        int iM4815e = C1939m0.m4815e(j3);
        if ((C1939m0.m4816f(j4) < C1939m0.m4815e(j3)) && (C1939m0.m4816f(j3) < C1939m0.m4815e(j4))) {
            if ((C1939m0.m4816f(j4) <= C1939m0.m4816f(j3)) && (C1939m0.m4815e(j3) <= C1939m0.m4815e(j4))) {
                iM4816f = C1939m0.m4816f(j4);
                iM4815e = iM4816f;
            } else {
                if ((C1939m0.m4816f(j3) <= C1939m0.m4816f(j4)) && (C1939m0.m4815e(j4) <= C1939m0.m4815e(j3))) {
                    iM4814d = C1939m0.m4814d(j4);
                } else {
                    int iM4816f2 = C1939m0.m4816f(j4);
                    if (iM4816f >= C1939m0.m4815e(j4) || iM4816f2 > iM4816f) {
                        iM4815e = C1939m0.m4816f(j4);
                    } else {
                        iM4816f = C1939m0.m4816f(j4);
                        iM4814d = C1939m0.m4814d(j4);
                    }
                }
                iM4815e -= iM4814d;
            }
        } else if (iM4815e > C1939m0.m4816f(j4)) {
            iM4816f -= C1939m0.m4814d(j4);
            iM4814d = C1939m0.m4814d(j4);
            iM4815e -= iM4814d;
        }
        return AbstractC1923e0.m4784b(iM4816f, iM4815e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static int m2747R(InterfaceC4314j interfaceC4314j) {
        int iM2747R = 0;
        if (interfaceC4314j instanceof InterfaceC4312h) {
            for (C4320p c4320p : ((InterfaceC4312h) interfaceC4314j).mo8643g()) {
                if (!c4320p.f9217g.mo6235a(EnumC2824a.f9166s)) {
                    iM2747R++;
                }
            }
            return iM2747R;
        }
        if (!(interfaceC4314j instanceof InterfaceC4318n)) {
            C0086a.m452k(m2740M0(interfaceC4314j));
            return 0;
        }
        Iterator it = ((InterfaceC4318n) interfaceC4314j).mo8675u().iterator();
        while (it.hasNext()) {
            iM2747R += m2747R((InterfaceC4314j) it.next());
        }
        return iM2747R;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S0 */
    public static boolean m2748S0(SharedPreferencesC0062o sharedPreferencesC0062o, C0058k c0058k) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        FileChannel.MapMode mapMode;
        ByteOrder byteOrder;
        String str = sharedPreferencesC0062o.f192b;
        String str2 = sharedPreferencesC0062o.f191a;
        try {
            int length = ((byte[]) c0058k.f178j).length;
            File file = new File(str2, str + ".kva");
            File file2 = new File(str2, str + ".kvb");
            if (!AbstractC2043a.m5006L(file) || !AbstractC2043a.m5006L(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            long j3 = length;
            try {
                randomAccessFile.setLength(j3);
                FileChannel channel = randomAccessFile.getChannel();
                sharedPreferencesC0062o.f208r = channel;
                mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = channel.map(mapMode, 0L, j3);
                sharedPreferencesC0062o.f210t = map;
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                sharedPreferencesC0062o.f210t.put((byte[]) c0058k.f178j, 0, sharedPreferencesC0062o.f194d);
                randomAccessFile2 = new RandomAccessFile(file2, "rw");
            } catch (Exception e6) {
                e = e6;
                randomAccessFile2 = null;
            }
            try {
                randomAccessFile2.setLength(j3);
                FileChannel channel2 = randomAccessFile2.getChannel();
                sharedPreferencesC0062o.f209s = channel2;
                MappedByteBuffer map2 = channel2.map(mapMode, 0L, j3);
                sharedPreferencesC0062o.f211u = map2;
                map2.order(byteOrder);
                sharedPreferencesC0062o.f211u.put((byte[]) c0058k.f178j, 0, sharedPreferencesC0062o.f194d);
                return true;
            } catch (Exception e7) {
                e = e7;
                AbstractC2043a.m5036j(randomAccessFile);
                AbstractC2043a.m5036j(randomAccessFile2);
                sharedPreferencesC0062o.f208r = null;
                sharedPreferencesC0062o.f209s = null;
                sharedPreferencesC0062o.f210t = null;
                sharedPreferencesC0062o.f211u = null;
                Log.e("FastKV", str, e);
                return false;
            }
        } catch (Exception e10) {
            e = e10;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static final boolean m2749T(Context context) {
        if (context == null) {
            return false;
        }
        return AbstractC4302b.m8640c(context, "Hchat_quick_terminate_config").getBoolean("quick_terminate_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T0 */
    public static boolean m2750T0(SharedPreferencesC0062o sharedPreferencesC0062o) {
        String str = sharedPreferencesC0062o.f192b;
        String str2 = sharedPreferencesC0062o.f191a;
        try {
            File file = new File(str2, str + ".tmp");
            if (!AbstractC2043a.m5006L(file)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(sharedPreferencesC0062o.f194d);
                randomAccessFile.write((byte[]) sharedPreferencesC0062o.f198h.f178j, 0, sharedPreferencesC0062o.f194d);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                File file2 = new File(str2, str + ".kvc");
                if (!(file.renameTo(file2) || ((!file2.exists() || file2.delete()) && file.renameTo(file2)))) {
                    Log.w("FastKV", str, new Exception("rename failed"));
                    return false;
                }
                ArrayList arrayList = sharedPreferencesC0062o.f201k;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC0063p.m430w().execute(new RunnableC0006d(sharedPreferencesC0062o, 1, (String) it.next()));
                    }
                    arrayList.clear();
                }
                return true;
            } finally {
            }
        } catch (Exception e6) {
            Log.e("FastKV", str, e6);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static boolean m2751U(InterfaceC4312h interfaceC4312h, InterfaceC4314j interfaceC4314j) {
        C4320p c4320pM57c0 = AbstractC0000a.m57c0(interfaceC4312h);
        if (c4320pM57c0 == null) {
            return false;
        }
        EnumC3400k enumC3400k = c4320pM57c0.f14396k;
        if (enumC3400k == EnumC3400k.f10986p) {
            return true;
        }
        if (enumC3400k == EnumC3400k.f10988r) {
            C0071b c0071b = (C0071b) c4320pM57c0.f9217g.mo6237c(C2825b.f9179F);
            if (c0071b == null) {
                return true;
            }
            Iterator it = c0071b.f228g.iterator();
            while (it.hasNext()) {
                if (m2755Z(((C0075f) it.next()).f234c, interfaceC4314j)) {
                    return false;
                }
            }
            return true;
        }
        if (enumC3400k != EnumC3400k.f10968T) {
            return false;
        }
        C2826c c2826c = (C2826c) c4320pM57c0.f9217g.mo6237c(C2825b.f9211z);
        if (c2826c != null) {
            Iterator it2 = c2826c.f9213h.iterator();
            while (it2.hasNext()) {
                if (!m2755Z(((C2988t) it2.next()).f9755a, interfaceC4314j)) {
                    return true;
                }
            }
        }
        C2989u c2989u = (C2989u) c4320pM57c0.f9217g.mo6237c(C2825b.f9180G);
        return (c2989u == null || m2755Z(c2989u.f9760g.f9755a, interfaceC4314j)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static boolean m2752V(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && !Modifier.isAbstract(method.getModifiers()) && !method.getDeclaringClass().isInterface() && !Modifier.isStatic(method.getModifiers()) && parameterTypes.length == 2 && MenuItem.class.isAssignableFrom(parameterTypes[0]) && AbstractC1416l.m3825a(parameterTypes[1], Integer.TYPE) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.chatting.viewitems.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static boolean m2753W(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && !Modifier.isAbstract(method.getModifiers()) && !method.getDeclaringClass().isInterface() && !Modifier.isStatic(method.getModifiers()) && parameterTypes.length == 3 && !MenuItem.class.isAssignableFrom(parameterTypes[0]) && View.class.isAssignableFrom(parameterTypes[1]) && parameterTypes[2].getName().equals("android.view.ContextMenu$ContextMenuInfo") && AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.chatting.viewitems.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static boolean m2754Y(C4266p c4266p) {
        int length = c4266p.f24601h.length;
        if (length < 2) {
            return true;
        }
        int iM8561j = ((C4265o) c4266p.m10840l(0)).f13965g;
        for (int i9 = 0; i9 < length; i9++) {
            C4265o c4265o = (C4265o) c4266p.m10840l(i9);
            if (c4265o.f13965g != iM8561j) {
                return false;
            }
            iM8561j += c4265o.m8561j();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static boolean m2755Z(C4305a c4305a, InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            return interfaceC4314j == c4305a;
        }
        if (!(interfaceC4314j instanceof InterfaceC4318n)) {
            C0086a.m452k(m2740M0(interfaceC4314j));
            return false;
        }
        Iterator it = ((InterfaceC4318n) interfaceC4314j).mo8675u().iterator();
        while (it.hasNext()) {
            if (m2755Z(c4305a, (InterfaceC4314j) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2756a(boolean z9, EnumC4094j enumC4094j, C1511d1 c1511d1, C1836h0 c1836h0, int i9) {
        int i10;
        C4618m1 c4618m1M9051d;
        c1836h0.m4527b0(-1344558920);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4536g(z9) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4530d(enumC4094j.ordinal()) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(c1511d1) ? Opcodes.ACC_NATIVE : 128;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            int i11 = i10 & 14;
            boolean zM4534f = (i11 == 4) | c1836h0.m4534f(c1511d1);
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (zM4534f || objM4514P == c1823e) {
                objM4514P = new C1563z0(c1511d1, z9);
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC4647y0 interfaceC4647y0 = (InterfaceC4647y0) objM4514P;
            boolean zM4538h = (i11 == 4) | c1836h0.m4538h(c1511d1);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4538h || objM4514P2 == c1823e) {
                objM4514P2 = new C1514e1(c1511d1, z9);
                c1836h0.m4545k0(objM4514P2);
            }
            InterfaceC1533l interfaceC1533l = (InterfaceC1533l) objM4514P2;
            boolean zM4817g = C1939m0.m4817g(c1511d1.m4028n().f9317b);
            int i12 = (int) (z9 ? c1511d1.m4028n().f9317b >> 32 : c1511d1.m4028n().f9317b & 4294967295L);
            C4629q0 c4629q0 = c1511d1.f5032d;
            float fM5113e = 0.0f;
            if (c4629q0 != null && (c4618m1M9051d = c4629q0.m9051d()) != null) {
                C1935k0 c1935k0 = c4618m1M9051d.f15293a;
                if (i12 >= 0) {
                    C1933j0 c1933j0 = c1935k0.f6561a;
                    C1942o c1942o = c1935k0.f6562b;
                    if (c1933j0.f6549a.f6529h.length() != 0) {
                        int iMin = Math.min(c1942o.m4827d(i12), Math.min(c1942o.f6584b - 1, c1942o.f6588f - 1));
                        if (i12 <= c1942o.m4826c(iMin, false)) {
                            c1942o.m4834m(iMin);
                            ArrayList arrayList = c1942o.f6590h;
                            C1947r c1947r = (C1947r) arrayList.get(AbstractC1923e0.m4787e(iMin, arrayList));
                            C1914a c1914a = c1947r.f6596a;
                            int i13 = iMin - c1947r.f6599d;
                            C2061k c2061k = c1914a.f6459d;
                            fM5113e = c2061k.m5113e(i13) - c2061k.m5115g(i13);
                        }
                    }
                }
            }
            float f3 = fM5113e;
            boolean zM4538h2 = c1836h0.m4538h(interfaceC4647y0);
            Object objM4514P3 = c1836h0.m4514P();
            if (zM4538h2 || objM4514P3 == c1823e) {
                objM4514P3 = new C0362g(interfaceC4647y0, 4);
                c1836h0.m4545k0(objM4514P3);
            }
            AbstractC3165h.m6775b(interfaceC1533l, z9, enumC4094j, zM4817g, 0L, f3, AbstractC3898h0.m8090a(C5850l.f23787a, interfaceC4647y0, (PointerInputEventHandler) objM4514P3), c1836h0, (i10 << 3) & 1008);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C1512e(z9, enumC4094j, c1511d1, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: ud.n */
    /* JADX DEBUG: Multi-variable search result rejected for r5v10, resolved type: ud.j */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public static boolean m2757a0(InterfaceC4314j interfaceC4314j, InterfaceC4318n interfaceC4318n) {
        if (interfaceC4314j == interfaceC4318n) {
            return true;
        }
        if (interfaceC4318n == null) {
            return false;
        }
        InterfaceC4318n interfaceC4318n2 = ((AbstractC5774a) interfaceC4318n).f23506i;
        while (true) {
            InterfaceC4318n interfaceC4318n3 = interfaceC4318n2;
            InterfaceC4318n interfaceC4318n4 = interfaceC4318n;
            interfaceC4318n = interfaceC4318n3;
            if (interfaceC4314j == interfaceC4318n) {
                return true;
            }
            if (interfaceC4318n == null) {
                if (!((AbstractC2828e) interfaceC4318n4).f9217g.mo6236b(C2825b.f9178E)) {
                    return false;
                }
                if (interfaceC4314j == interfaceC4318n4) {
                    return true;
                }
                if (!(interfaceC4314j instanceof InterfaceC4318n)) {
                    return false;
                }
                for (InterfaceC4314j interfaceC4314j2 : ((InterfaceC4318n) interfaceC4314j).mo8675u()) {
                    C0077h c0077h = (C0077h) ((AbstractC2828e) interfaceC4314j2).f9217g.mo6237c(C2825b.f9177D);
                    if (c0077h != null && (interfaceC4314j2 instanceof InterfaceC4318n)) {
                        Iterator it = c0077h.f244h.iterator();
                        while (it.hasNext()) {
                            if (m2757a0(((C0075f) it.next()).f236e, interfaceC4318n4)) {
                                return true;
                            }
                        }
                    }
                    if (m2757a0(interfaceC4314j2, interfaceC4318n4)) {
                        return true;
                    }
                }
                return false;
            }
            interfaceC4318n2 = ((AbstractC5774a) interfaceC4318n).f23506i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m2758b(Method method) {
        return AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) && method.getParameterCount() == 1 && AbstractC3156t.m6740d0(method.getParameterTypes()[0].getName(), "com.tencent.mm.plugin.appbrand.", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static boolean m2759b0(int i9, boolean z9) {
        if (!z9 && !AbstractC2390d.m5713b(i9)) {
            return false;
        }
        if ((i9 < 880 && Character.isUnicodeIdentifierPart(i9) && !Character.isIdentifierIgnorable(i9)) || i9 == 46 || i9 == 45) {
            Pattern pattern = AbstractC2390d.f7853a;
            if (Character.isJavaIdentifierPart(i9)) {
                return true;
            }
        }
        return i9 == 46;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m2760c(C0943k0 c0943k0, Object obj, Object obj2) {
        int iM2319f = c0943k0.m2319f(obj);
        boolean z9 = iM2319f < 0;
        Object obj3 = z9 ? null : c0943k0.f2970c[iM2319f];
        if (obj3 != null) {
            if (obj3 instanceof C0945l0) {
                ((C0945l0) obj3).m2328a(obj2);
            } else if (obj3 != obj2) {
                C0945l0 c0945l0 = new C0945l0();
                c0945l0.m2328a(obj3);
                c0945l0.m2328a(obj2);
                obj2 = c0945l0;
            }
            obj2 = obj3;
        }
        if (!z9) {
            c0943k0.f2970c[iM2319f] = obj2;
            return;
        }
        int i9 = ~iM2319f;
        c0943k0.f2969b[i9] = obj;
        c0943k0.f2970c[i9] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static boolean m2761c0(StringBuilder sb2) {
        return sb2.length() >= 300;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m2762d(StringBuilder sb2, StringBuilder sb3, AbstractC0212j abstractC0212j) {
        String string;
        String string2;
        if (m2761c0(sb3)) {
            return;
        }
        if (abstractC0212j instanceof C0207e) {
            C0207e c0207e = (C0207e) abstractC0212j;
            if (m2761c0(sb3)) {
                return;
            }
            int length = sb2.length();
            String string3 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (length > 1) {
                int length2 = sb2.length();
                if (length2 == 0) {
                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    string2 = length2 > 1 ? sb2.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
                    if (length2 < 10) {
                        sb2.append(' ');
                    }
                }
                sb3.append(string2);
            }
            C0014a c0014a = c0207e.f508k;
            C6116l c6116l = new C6116l(c0207e);
            boolean z9 = false;
            while (c6116l.hasNext() && !m2761c0(sb3)) {
                m2762d(sb2, sb3, (AbstractC0212j) c6116l.next());
                z9 = true;
            }
            int length3 = sb2.length();
            if (length3 != 0) {
                if (length3 > 1) {
                    sb2.deleteCharAt(length3 - 1);
                }
                string3 = sb2.toString();
            }
            if (z9) {
                sb3.append(string3);
                return;
            }
            return;
        }
        boolean z10 = false;
        if (!(abstractC0212j instanceof C0208f)) {
            if (!(abstractC0212j instanceof C0210h)) {
                if (abstractC0212j != null) {
                    sb3.append(abstractC0212j);
                    return;
                }
                return;
            }
            C0210h c0210h = (C0210h) abstractC0212j;
            if (m2761c0(sb3)) {
                return;
            }
            String strConcat = c0210h.f517h;
            int length4 = 300 - sb3.length();
            if (length4 <= 0) {
                return;
            }
            if (length4 < strConcat.length()) {
                strConcat = strConcat.substring(0, length4).concat(" ...");
            }
            sb3.append(strConcat);
            return;
        }
        C0208f c0208f = (C0208f) abstractC0212j;
        if (m2761c0(sb3)) {
            return;
        }
        int length5 = sb2.length();
        String string4 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length5 == 0) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            string = length5 > 1 ? sb2.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
            if (length5 < 10) {
                sb2.append(' ');
            }
        }
        sb3.append(string);
        sb3.append('<');
        String str = c0208f.f512l;
        if (str == null) {
            str = "null";
        }
        sb3.append(str);
        C6116l c6116l2 = new C6116l(new C0119x(c0208f, 3));
        while (c6116l2.hasNext() && !m2761c0(sb3)) {
            sb3.append(' ');
            sb3.append(c6116l2.next());
        }
        C6116l c6116l3 = new C6116l(c0208f);
        boolean z11 = false;
        while (c6116l3.hasNext()) {
            AbstractC0212j abstractC0212j2 = (AbstractC0212j) c6116l3.next();
            if (!z10) {
                sb3.append('>');
                z11 = true;
                z10 = true;
            }
            if (z11) {
                z11 = abstractC0212j2 instanceof C0210h;
            }
            if (m2761c0(sb3)) {
                break;
            } else {
                m2762d(sb2, sb3, abstractC0212j2);
            }
        }
        int length6 = sb2.length();
        if (length6 != 0) {
            if (length6 > 1) {
                sb2.deleteCharAt(length6 - 1);
            }
            string4 = sb2.toString();
        }
        if (!z10) {
            sb3.append("/>");
            return;
        }
        if (!z11) {
            sb3.append(string4);
        }
        sb3.append("</");
        sb3.append(str);
        sb3.append('>');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static String m2763d0(AbstractC4472u abstractC4472u, int i9) {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("#");
        long jMo8913l = abstractC4472u instanceof AbstractC4471t ? ((AbstractC4471t) abstractC4472u).f14818g : abstractC4472u.mo8913l();
        if (i9 == 4) {
            sb2.append(new String(new char[]{Character.forDigit(((int) jMo8913l) & 15, 16)}));
        } else if (i9 == 8) {
            sb2.append(AbstractC0000a.m44W0((int) jMo8913l));
        } else if (i9 == 16) {
            sb2.append(AbstractC0000a.m46X0((int) jMo8913l));
        } else if (i9 == 32) {
            sb2.append(AbstractC0000a.m48Y0((int) jMo8913l));
        } else {
            if (i9 != 64) {
                C0353j.m1309g("shouldn't happen");
                return null;
            }
            sb2.append(AbstractC0000a.m50Z0(jMo8913l));
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m2764e(AbstractC3307l abstractC3307l) {
        int iM6976m = ((C3296b0) abstractC3307l).m6976m();
        if (iM6976m != ((short) iM6976m)) {
            return AbstractC0000a.m22L0(iM6976m);
        }
        char[] cArr = new char[5];
        if (iM6976m < 0) {
            cArr[0] = '-';
            iM6976m = -iM6976m;
        } else {
            cArr[0] = '+';
        }
        for (int i9 = 0; i9 < 4; i9++) {
            cArr[4 - i9] = Character.forDigit(iM6976m & 15, 16);
            iM6976m >>= 4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static String m2765e0(AbstractC4472u abstractC4472u) {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append('#');
        if (abstractC4472u instanceof C4469r) {
            sb2.append("null");
        } else {
            sb2.append(abstractC4472u.mo8898j());
            sb2.append(' ');
            sb2.append(abstractC4472u.mo4901a());
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static void m2766f0(SharedPreferencesC0062o sharedPreferencesC0062o) {
        long j3;
        String str = sharedPreferencesC0062o.f191a;
        StringBuilder sb2 = new StringBuilder();
        String str2 = sharedPreferencesC0062o.f192b;
        File file = new File(str, AbstractC0921a.m2255r(sb2, str2, ".kva"));
        File file2 = new File(str, AbstractC0255e.m1020i(str2, ".kvb"));
        try {
            if (AbstractC2043a.m5006L(file) && AbstractC2043a.m5006L(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                sharedPreferencesC0062o.f208r = randomAccessFile.getChannel();
                sharedPreferencesC0062o.f209s = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = sharedPreferencesC0062o.f208r;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : SharedPreferencesC0062o.f188A);
                    sharedPreferencesC0062o.f210t = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = sharedPreferencesC0062o.f209s;
                    if (length2 > 0) {
                        j3 = length2;
                    } else {
                        j3 = SharedPreferencesC0062o.f188A;
                        fileChannel2 = fileChannel2;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j3);
                    sharedPreferencesC0062o.f211u = map2;
                    map2.order(byteOrder);
                    sharedPreferencesC0062o.f198h = new C0058k(sharedPreferencesC0062o.f210t.capacity());
                    if (length == 0 && length2 == 0) {
                        sharedPreferencesC0062o.f194d = 12;
                        return;
                    } else {
                        m2788r0(sharedPreferencesC0062o, length, length2);
                        return;
                    }
                } catch (IOException e6) {
                    Log.e("FastKV", str2, e6);
                    m2734J0(sharedPreferencesC0062o);
                    m2738L0(sharedPreferencesC0062o, file, file2);
                    return;
                }
            }
            Log.e("FastKV", str2, new Exception("open file failed"));
            m2734J0(sharedPreferencesC0062o);
        } catch (Exception e7) {
            Log.e("FastKV", str2, e7);
            m2803z0(sharedPreferencesC0062o);
            m2734J0(sharedPreferencesC0062o);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m2767g(AbstractC3307l abstractC3307l) {
        int iM6989e = ((C3296b0) abstractC3307l).f10477f.m6989e();
        return iM6989e == ((char) iM6989e) ? AbstractC0000a.m46X0(iM6989e) : AbstractC0000a.m48Y0(iM6989e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static boolean m2768g0(SharedPreferencesC0062o sharedPreferencesC0062o) {
        String str = sharedPreferencesC0062o.f191a;
        StringBuilder sb2 = new StringBuilder();
        String str2 = sharedPreferencesC0062o.f192b;
        File file = new File(str, AbstractC0921a.m2255r(sb2, str2, ".kvc"));
        File file2 = new File(str, AbstractC0255e.m1020i(str2, ".tmp"));
        boolean z9 = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!m2770h0(sharedPreferencesC0062o, file)) {
                    m2803z0(sharedPreferencesC0062o);
                    m2787r(sharedPreferencesC0062o);
                    return false;
                }
                if (sharedPreferencesC0062o.f213w == 0) {
                    if (!m2748S0(sharedPreferencesC0062o, sharedPreferencesC0062o.f198h)) {
                        sharedPreferencesC0062o.f213w = 1;
                        return false;
                    }
                    AbstractC1341a.m3609y(sharedPreferencesC0062o, "recover from c file");
                    try {
                        m2787r(sharedPreferencesC0062o);
                        return true;
                    } catch (Exception e6) {
                        e = e6;
                        z9 = true;
                        Log.e("FastKV", str2, e);
                        return z9;
                    }
                }
            } else if (sharedPreferencesC0062o.f213w != 0) {
                File file3 = new File(str, str2 + ".kva");
                File file4 = new File(str, str2 + ".kvb");
                if (file3.exists() && file4.exists()) {
                    m2738L0(sharedPreferencesC0062o, file3, file4);
                }
            }
            return false;
        } catch (Exception e7) {
            e = e7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C4305a[] m2769h(ArrayList arrayList, Function function) {
        int i9;
        C4305a c4305a;
        int size = arrayList.size();
        C4305a[] c4305aArr = new C4305a[size];
        c4305aArr[0] = (C4305a) arrayList.get(0);
        boolean z9 = true;
        while (z9) {
            z9 = false;
            for (int i10 = 1; i10 < size; i10++) {
                C4305a c4305a2 = (C4305a) arrayList.get(i10);
                List list = (List) function.apply(c4305a2);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i9 = -1;
                        c4305a = null;
                        break;
                    }
                    c4305a = (C4305a) it.next();
                    i9 = c4305a.f14349j;
                    if (c4305aArr[i9] != null) {
                        break;
                    }
                }
                if (c4305a == null) {
                    C0086a.m452k("No immediate dominator for block: ".concat(String.valueOf(c4305a2)));
                    return null;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    int i11 = ((C4305a) it2.next()).f14349j;
                    if (i11 != i9 && c4305aArr[i11] != null) {
                        int i12 = c4305a.f14349j;
                        while (i11 != i12) {
                            while (i11 > i12) {
                                i11 = c4305aArr[i11].f14349j;
                            }
                            while (i12 > i11) {
                                i12 = c4305aArr[i12].f14349j;
                            }
                        }
                        c4305a = (C4305a) arrayList.get(i11);
                    }
                }
                if (c4305aArr[i10] != c4305a) {
                    c4305aArr[i10] = c4305a;
                    z9 = true;
                }
            }
        }
        return c4305aArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static boolean m2770h0(SharedPreferencesC0062o sharedPreferencesC0062o, File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i9 = (int) length;
            int iM2728G = m2728G(SharedPreferencesC0062o.f188A, i9);
            C0058k c0058k = sharedPreferencesC0062o.f198h;
            if (c0058k == null || ((byte[]) c0058k.f178j).length != iM2728G) {
                c0058k = new C0058k(new byte[iM2728G], 0);
                sharedPreferencesC0062o.f198h = c0058k;
            } else {
                c0058k.f176h = 0;
            }
            AbstractC2043a.m5015U(file, (byte[]) c0058k.f178j, i9);
            int iM366q = c0058k.m366q();
            if (iM366q >= 0) {
                int i10 = (-1073741825) & iM366q;
                boolean z9 = (iM366q & 1073741824) != 0;
                long jM367r = c0058k.m367r(c0058k.f176h);
                c0058k.f176h += 8;
                sharedPreferencesC0062o.f194d = i10 + 12;
                if (i10 >= 0 && i10 <= i9 - 12 && jM367r == c0058k.m362m(12, i10) && AbstractC0283h.m1135O(sharedPreferencesC0062o, z9)) {
                    sharedPreferencesC0062o.f195e = jM367r;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m2771i(SharedPreferencesC0062o sharedPreferencesC0062o) {
        if (sharedPreferencesC0062o.f213w == 0) {
            try {
                m2801y0(sharedPreferencesC0062o, sharedPreferencesC0062o.f210t);
                m2801y0(sharedPreferencesC0062o, sharedPreferencesC0062o.f211u);
            } catch (Exception unused) {
                m2734J0(sharedPreferencesC0062o);
            }
        }
        m2803z0(sharedPreferencesC0062o);
        AbstractC2043a.m5040n(new File(sharedPreferencesC0062o.f191a + sharedPreferencesC0062o.f192b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static int m2772i0(int i9, int i10) {
        if ((i9 & 15) != i9) {
            C2104o.m5294t("low out of range 0..15");
            return 0;
        }
        if ((i10 & 15) == i10) {
            return i9 | (i10 << 4);
        }
        C2104o.m5294t("high out of range 0..15");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x0123 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX INFO: renamed from: j0 */
    public static final List m2773j0(C3742g c3742g, InterfaceC1235p interfaceC1235p) {
        ?? c3959f;
        Object c3959f2;
        c3742g.getClass();
        interfaceC1235p.getClass();
        Context context = c3742g.f12143a;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_single_message_menu_method_cache");
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        List listM2090f = C0828b.m2090f(sharedPreferencesM8640c, strM2091g, classLoader, "menu_click_v1");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2090f) {
            if (m2752V((Method) obj)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((Method) obj2).toGenericString())) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3369l0(1, "com.tencent.mm.ui.chatting.viewitems.");
            C1253k.m3366q0(c1253k, "void");
            c1253k.m3372o0("android.view.MenuItem", "int");
            c1253k.m3374r0("MicroMsg.ChattingItem", "context item select failed, null dataTag");
            c0570e.f1764h = c1253k;
            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList3 = new ArrayList();
            for (C1730o c1730o : c1731pFindMethod) {
                try {
                    c1730o.getClass();
                    c3959f2 = c1730o.m4348p().m6023b(classLoader);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    arrayList3.add(method);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (m2752V((Method) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            HashSet hashSet2 = new HashSet();
            c3959f = new ArrayList();
            for (Object obj4 : arrayList4) {
                if (hashSet2.add(((Method) obj4).toGenericString())) {
                    c3959f.add(obj4);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            interfaceC1235p.invoke("定位单消息菜单点击方法失败", thM8182b);
        }
        boolean z9 = c3959f instanceof C3959f;
        ?? r42 = c3959f;
        if (z9) {
            r42 = C4173t.f13710g;
        }
        List list = (List) r42;
        m2719B0(sharedPreferencesM8640c, strM2091g, "menu_click_v1", list);
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static short m2774k(int i9, int i10) {
        if ((i9 & 255) != i9) {
            C2104o.m5294t("low out of range 0..255");
            return (short) 0;
        }
        if ((i10 & 255) == i10) {
            return (short) (i9 | (i10 << 8));
        }
        C2104o.m5294t("high out of range 0..255");
        return (short) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x011c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX INFO: renamed from: k0 */
    public static final List m2775k0(C3742g c3742g, InterfaceC1235p interfaceC1235p) {
        ?? c3959f;
        Object c3959f2;
        c3742g.getClass();
        interfaceC1235p.getClass();
        Context context = c3742g.f12143a;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_single_message_menu_method_cache");
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        List listM2090f = C0828b.m2090f(sharedPreferencesM8640c, strM2091g, classLoader, "menu_create_v1");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2090f) {
            if (m2753W((Method) obj)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((Method) obj2).toGenericString())) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3369l0(1, "com.tencent.mm.ui.chatting.viewitems.");
            C1253k.m3366q0(c1253k, "void");
            c1253k.m3370m0(3);
            c1253k.m3374r0("MicroMsg.ChattingItem", "msg is null!");
            c0570e.f1764h = c1253k;
            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList3 = new ArrayList();
            for (C1730o c1730o : c1731pFindMethod) {
                try {
                    c1730o.getClass();
                    c3959f2 = c1730o.m4348p().m6023b(classLoader);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    arrayList3.add(method);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (m2753W((Method) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            HashSet hashSet2 = new HashSet();
            c3959f = new ArrayList();
            for (Object obj4 : arrayList4) {
                if (hashSet2.add(((Method) obj4).toGenericString())) {
                    c3959f.add(obj4);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            interfaceC1235p.invoke("定位单消息菜单创建方法失败", thM8182b);
        }
        boolean z9 = c3959f instanceof C3959f;
        ?? r42 = c3959f;
        if (z9) {
            r42 = C4173t.f13710g;
        }
        List list = (List) r42;
        m2719B0(sharedPreferencesM8640c, strM2091g, "menu_create_v1", list);
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static short m2776l(int i9, int i10, int i11, int i12) {
        if ((i9 & 15) != i9) {
            C2104o.m5294t("n0 out of range 0..15");
            return (short) 0;
        }
        if ((i10 & 15) != i10) {
            C2104o.m5294t("n1 out of range 0..15");
            return (short) 0;
        }
        if ((i11 & 15) != i11) {
            C2104o.m5294t("n2 out of range 0..15");
            return (short) 0;
        }
        if ((i12 & 15) == i12) {
            return (short) (i9 | (i10 << 4) | (i11 << 8) | (i12 << 12));
        }
        C2104o.m5294t("n3 out of range 0..15");
        return (short) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static InterfaceC5561g m2777l0(InterfaceC5559e interfaceC5559e, InterfaceC5560f interfaceC5560f) {
        interfaceC5560f.getClass();
        return AbstractC1416l.m3825a(interfaceC5559e.getKey(), interfaceC5560f) ? C5562h.f22661g : interfaceC5559e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public static String m2778m0(String str, String str2) {
        int iM6718q0;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            String strConcat = str2.concat("=");
            int iM6718q02 = AbstractC3149m.m6718q0(str, '?', 0, 6);
            for (int i9 = iM6718q02 >= 0 ? iM6718q02 + 1 : 0; i9 < str.length(); i9 = iM6718q0 + 1) {
                iM6718q0 = AbstractC3149m.m6718q0(str, '&', i9, 4);
                if (iM6718q0 < 0) {
                    iM6718q0 = str.length();
                }
                if (AbstractC3156t.m6739c0(str, strConcat, i9, false)) {
                    return str.substring(i9 + strConcat.length(), iM6718q0);
                }
            }
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Throwable unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m2779n(C4322r c4322r) {
        List<C4305a> list = c4322r.f14425z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C4305a) it.next()).f14357r = null;
        }
        int size = list.size();
        for (C4305a c4305a : list) {
            List<C4305a> list2 = c4305a.f14352m;
            if (list2.size() >= 2) {
                C4305a c4305a2 = c4305a.f14358s;
                for (C4305a c4305a3 : list2) {
                    for (; c4305a3 != c4305a2; c4305a3 = c4305a3.f14358s) {
                        BitSet bitSet = c4305a3.f14357r;
                        if (bitSet == null) {
                            bitSet = new BitSet(size);
                            c4305a3.f14357r = bitSet;
                        }
                        bitSet.set(c4305a.f14349j);
                    }
                }
            }
        }
        for (C4305a c4305a4 : list) {
            BitSet bitSet2 = c4305a4.f14357r;
            if (bitSet2 == null || bitSet2.isEmpty()) {
                c4305a4.f14357r = C5786g.f23528g;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static boolean m2780n0(InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j == null) {
            return false;
        }
        if (interfaceC4314j instanceof InterfaceC4312h) {
            for (C4320p c4320p : ((InterfaceC4312h) interfaceC4314j).mo8643g()) {
                if (!c4320p.f9217g.mo6235a(EnumC2824a.f9166s)) {
                }
            }
            return false;
        }
        if (interfaceC4314j instanceof C6138c) {
            return true;
        }
        if (!(interfaceC4314j instanceof InterfaceC4318n)) {
            C0086a.m452k(m2740M0(interfaceC4314j));
            return false;
        }
        Iterator it = ((InterfaceC4318n) interfaceC4314j).mo8675u().iterator();
        while (it.hasNext()) {
            if (m2780n0((InterfaceC4314j) it.next())) {
            }
        }
        return false;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static C0943k0 m2781o() {
        long[] jArr = AbstractC0957r0.f3015a;
        return new C0943k0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static String m2782o0(int i9) {
        switch (i9) {
            case 1:
                return "nop";
            case 2:
                return "move";
            case 3:
                return "move-param";
            case 4:
                return "move-exception";
            case 5:
                return "const";
            case 6:
                return "goto";
            case 7:
                return "if-eq";
            case 8:
                return "if-ne";
            case 9:
                return "if-lt";
            case 10:
                return "if-ge";
            case 11:
                return "if-le";
            case 12:
                return "if-gt";
            case 13:
                return "switch";
            case 14:
                return "add";
            case 15:
                return "sub";
            case 16:
                return "mul";
            case 17:
                return "div";
            case 18:
                return "rem";
            case 19:
                return "neg";
            case 20:
                return "and";
            case 21:
                return "or";
            case 22:
                return "xor";
            case 23:
                return "shl";
            case 24:
                return "shr";
            case 25:
                return "ushr";
            case 26:
                return "not";
            case 27:
                return "cmpl";
            case 28:
                return "cmpg";
            case 29:
                return "conv";
            case 30:
                return "to-byte";
            case 31:
                return "to-char";
            case 32:
                return "to-short";
            case 33:
                return "return";
            case 34:
                return "array-length";
            case 35:
                return "throw";
            case 36:
                return "monitor-enter";
            case 37:
                return "monitor-exit";
            case 38:
                return "aget";
            case 39:
                return "aput";
            case 40:
                return "new-instance";
            case 41:
                return "new-array";
            case 42:
                return "filled-new-array";
            case 43:
                return "check-cast";
            case 44:
                return "instance-of";
            case ParserConstants.PROTECTED /* 45 */:
                return "get-field";
            case 46:
                return "get-static";
            case 47:
                return "put-field";
            case 48:
                return "put-static";
            case 49:
                return "invoke-static";
            case 50:
                return "invoke-virtual";
            case 51:
                return "invoke-super";
            case 52:
                return "invoke-direct";
            case 53:
                return "invoke-interface";
            case 54:
            default:
                return "unknown-".concat(AbstractC0000a.m44W0(i9));
            case 55:
                return "move-result";
            case 56:
                return "move-result-pseudo";
            case 57:
                return "fill-array-data";
            case 58:
                return "invoke-polymorphic";
            case ParserConstants.VOLATILE /* 59 */:
                return "invoke-custom";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m2783p(SharedPreferencesC0062o sharedPreferencesC0062o, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i9) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            MappedByteBuffer mappedByteBufferM2796v0 = m2796v0(mappedByteBuffer2 == sharedPreferencesC0062o.f211u ? sharedPreferencesC0062o.f209s : sharedPreferencesC0062o.f208r, mappedByteBuffer.capacity());
            if (mappedByteBufferM2796v0 == null) {
                Log.e("FastKV", sharedPreferencesC0062o.f192b, new Exception("map failed"));
                m2734J0(sharedPreferencesC0062o);
                return;
            } else {
                if (mappedByteBuffer2 == sharedPreferencesC0062o.f211u) {
                    sharedPreferencesC0062o.f211u = mappedByteBufferM2796v0;
                } else {
                    sharedPreferencesC0062o.f210t = mappedByteBufferM2796v0;
                }
                mappedByteBuffer2 = mappedByteBufferM2796v0;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i9);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static short m2784p0(AbstractC3303h abstractC3303h, int i9) {
        if ((i9 & 255) != i9) {
            C2104o.m5294t("arg out of range 0..255");
            return (short) 0;
        }
        int i10 = abstractC3303h.f10488b.f10492a;
        if ((i10 & 255) == i10) {
            return (short) (i10 | (i9 << 8));
        }
        C2104o.m5294t("opcode out of range 0..255");
        return (short) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final C3959f m2785q(Throwable th2) {
        th2.getClass();
        return new C3959f(th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static InterfaceC5561g m2786q0(InterfaceC5559e interfaceC5559e, InterfaceC5561g interfaceC5561g) {
        interfaceC5561g.getClass();
        return interfaceC5561g == C5562h.f22661g ? interfaceC5559e : (InterfaceC5561g) interfaceC5561g.mo2061k(new C5094m0(10), interfaceC5559e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m2787r(SharedPreferencesC0062o sharedPreferencesC0062o) {
        String str = sharedPreferencesC0062o.f192b;
        String str2 = sharedPreferencesC0062o.f191a;
        try {
            AbstractC2043a.m5040n(new File(str2, str + ".kvc"));
            AbstractC2043a.m5040n(new File(str2, str + ".tmp"));
        } catch (Exception e6) {
            Log.e("FastKV", str, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public static void m2788r0(SharedPreferencesC0062o sharedPreferencesC0062o, long j3, long j4) {
        long j5;
        MappedByteBuffer mappedByteBuffer = sharedPreferencesC0062o.f210t;
        String str = sharedPreferencesC0062o.f192b;
        int i9 = mappedByteBuffer.getInt();
        int i10 = i9 & (-1073741825);
        boolean z9 = (i9 & 1073741824) != 0;
        long j10 = sharedPreferencesC0062o.f210t.getLong();
        int i11 = sharedPreferencesC0062o.f211u.getInt();
        int i12 = (-1073741825) & i11;
        boolean z10 = (1073741824 & i11) != 0;
        long j11 = sharedPreferencesC0062o.f211u.getLong();
        if (i10 < 0) {
            j5 = 12;
        } else if (i10 <= j3 - 12) {
            sharedPreferencesC0062o.f194d = i10 + 12;
            sharedPreferencesC0062o.f210t.rewind();
            j5 = 12;
            sharedPreferencesC0062o.f210t.get((byte[]) sharedPreferencesC0062o.f198h.f178j, 0, sharedPreferencesC0062o.f194d);
            if (j10 == sharedPreferencesC0062o.f198h.m362m(12, i10) && AbstractC0283h.m1135O(sharedPreferencesC0062o, z9)) {
                sharedPreferencesC0062o.f195e = j10;
                if (j3 == j4) {
                    byte[] bArr = new byte[sharedPreferencesC0062o.f194d];
                    sharedPreferencesC0062o.f211u.rewind();
                    sharedPreferencesC0062o.f211u.get(bArr, 0, sharedPreferencesC0062o.f194d);
                    byte[] bArr2 = (byte[]) sharedPreferencesC0062o.f198h.f178j;
                    for (int i13 = 0; i13 < sharedPreferencesC0062o.f194d; i13++) {
                        if (bArr2[i13] == bArr[i13]) {
                        }
                    }
                    return;
                }
                Log.w("FastKV", str, new Exception("B file error"));
                m2783p(sharedPreferencesC0062o, sharedPreferencesC0062o.f210t, sharedPreferencesC0062o.f211u, sharedPreferencesC0062o.f194d);
                return;
            }
        } else {
            j5 = 12;
        }
        if (i12 >= 0 && i12 <= j4 - j5) {
            sharedPreferencesC0062o.f196f.clear();
            sharedPreferencesC0062o.f204n = 0;
            sharedPreferencesC0062o.f205o.clear();
            sharedPreferencesC0062o.f194d = i12 + 12;
            if (((byte[]) sharedPreferencesC0062o.f198h.f178j).length != sharedPreferencesC0062o.f211u.capacity()) {
                sharedPreferencesC0062o.f198h = new C0058k(sharedPreferencesC0062o.f211u.capacity());
            }
            sharedPreferencesC0062o.f211u.rewind();
            sharedPreferencesC0062o.f211u.get((byte[]) sharedPreferencesC0062o.f198h.f178j, 0, sharedPreferencesC0062o.f194d);
            if (j11 == sharedPreferencesC0062o.f198h.m362m(12, i12) && AbstractC0283h.m1135O(sharedPreferencesC0062o, z10)) {
                Log.w("FastKV", str, new Exception("A file error"));
                m2783p(sharedPreferencesC0062o, sharedPreferencesC0062o.f211u, sharedPreferencesC0062o.f210t, sharedPreferencesC0062o.f194d);
                sharedPreferencesC0062o.f195e = j11;
                return;
            }
        }
        AbstractC1341a.m3597m(sharedPreferencesC0062o, "both files error");
        m2771i(sharedPreferencesC0062o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m2789s(String str) {
        StringBuilder sb2 = new StringBuilder();
        if (!str.isEmpty()) {
            int i9 = 0;
            while (i9 < str.length()) {
                int iCodePointAt = Character.codePointAt(str, i9);
                StringBuilder sb3 = new StringBuilder("\\u");
                String hexString = Integer.toHexString(iCodePointAt);
                if (hexString.startsWith("0")) {
                    hexString = hexString.substring(1);
                }
                if (hexString.length() <= 4) {
                    int length = hexString.length();
                    StringBuilder sb4 = new StringBuilder();
                    for (int i10 = 0; i10 < 4 - length; i10++) {
                        sb4.append("0");
                    }
                    sb3.append(sb4.toString());
                }
                sb3.append(hexString);
                sb2.append(sb3.toString());
                if (Character.isHighSurrogate(str.charAt(i9))) {
                    i9++;
                }
                i9++;
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static String m2790s0(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM2778m0 = m2778m0(str, "sendid");
        return TextUtils.isEmpty(strM2778m0) ? m2778m0(str, "sendId") : strM2778m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static long m2791t(int i9, int i10, int i11, int i12) {
        int i13 = 262142;
        int iMin = Math.min(i11, 262142);
        int iMin2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i12, 262142);
        int i14 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i14 >= 8191) {
            if (i14 < 32767) {
                i13 = 65534;
            } else if (i14 < 65535) {
                i13 = 32766;
            } else {
                if (i14 >= 262143) {
                    AbstractC4232b.m8518k(i14);
                    C3193a.m6814c();
                    return 0L;
                }
                i13 = 8190;
            }
        }
        return AbstractC4232b.m8508a(Math.min(i13, i9), i10 != Integer.MAX_VALUE ? Math.min(i13, i10) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public static String m2792t0(C4266p c4266p) {
        int length = c4266p.f24601h.length;
        StringBuilder sb2 = new StringBuilder((length * 5) + 2);
        sb2.append('{');
        for (int i9 = 0; i9 < length; i9++) {
            if (i9 != 0) {
                sb2.append(", ");
            }
            sb2.append(((C4265o) c4266p.m10840l(i9)).m8563m());
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static long m2793u(int i9, int i10, int i11, int i12) {
        int i13 = 262142;
        int iMin = Math.min(i9, 262142);
        int iMin2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int i14 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i14 >= 8191) {
            if (i14 < 32767) {
                i13 = 65534;
            } else if (i14 < 65535) {
                i13 = 32766;
            } else {
                if (i14 >= 262143) {
                    AbstractC4232b.m8518k(i14);
                    C3193a.m6814c();
                    return 0L;
                }
                i13 = 8190;
            }
        }
        return AbstractC4232b.m8508a(iMin, iMin2, Math.min(i13, i11), i12 != Integer.MAX_VALUE ? Math.min(i13, i12) : Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static String m2794u0(C4266p c4266p) {
        int length = c4266p.f24601h.length;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("{");
        if (length != 0) {
            if (length != 1) {
                C4265o c4265oM8565o = (C4265o) c4266p.m10840l(length - 1);
                if (c4265oM8565o.m8561j() == 2) {
                    c4265oM8565o = c4265oM8565o.m8565o(c4265oM8565o.f13965g + 1);
                }
                sb2.append(((C4265o) c4266p.m10840l(0)).m8563m());
                sb2.append("..");
                sb2.append(c4265oM8565o.m8563m());
            } else {
                sb2.append(((C4265o) c4266p.m10840l(0)).m8563m());
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static C1724i m2795v(DexKitBridge dexKitBridge, C2140d c2140d) {
        dexKitBridge.getClass();
        int iM3645b = c2140d.m3645b(4);
        int i9 = iM3645b != 0 ? c2140d.f4500b.getInt(iM3645b + c2140d.f4499a) : 0;
        int iM3645b2 = c2140d.m3645b(6);
        int i10 = iM3645b2 != 0 ? c2140d.f4500b.getInt(iM3645b2 + c2140d.f4499a) : 0;
        int iM3645b3 = c2140d.m3645b(8);
        String strM3647d = iM3645b3 != 0 ? c2140d.m3647d(iM3645b3 + c2140d.f4499a) : null;
        String str = strM3647d == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3647d;
        int iM3645b4 = c2140d.m3645b(10);
        int i11 = iM3645b4 != 0 ? c2140d.f4500b.getInt(iM3645b4 + c2140d.f4499a) : 0;
        int iM3645b5 = c2140d.m3645b(12);
        String strM3647d2 = iM3645b5 != 0 ? c2140d.m3647d(iM3645b5 + c2140d.f4499a) : null;
        String str2 = strM3647d2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3647d2;
        int iM3645b6 = c2140d.m3645b(14);
        int i12 = iM3645b6 != 0 ? c2140d.f4500b.getInt(iM3645b6 + c2140d.f4499a) : 0;
        Integer numValueOf = i12 != -1 ? Integer.valueOf(i12) : null;
        ArrayList arrayList = new ArrayList();
        int iM3645b7 = c2140d.m3645b(16);
        int iM3649f = iM3645b7 != 0 ? c2140d.m3649f(iM3645b7) : 0;
        for (int i13 = 0; i13 < iM3649f; i13++) {
            int iM3645b8 = c2140d.m3645b(16);
            arrayList.add(Integer.valueOf(iM3645b8 != 0 ? c2140d.f4500b.getInt((i13 * 4) + c2140d.m3648e(iM3645b8)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM3645b9 = c2140d.m3645b(18);
        int iM3649f2 = iM3645b9 != 0 ? c2140d.m3649f(iM3645b9) : 0;
        for (int i14 = 0; i14 < iM3649f2; i14++) {
            int iM3645b10 = c2140d.m3645b(18);
            arrayList2.add(Integer.valueOf(iM3645b10 != 0 ? c2140d.f4500b.getInt((i14 * 4) + c2140d.m3648e(iM3645b10)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM3645b11 = c2140d.m3645b(20);
        int iM3649f3 = iM3645b11 != 0 ? c2140d.m3649f(iM3645b11) : 0;
        for (int i15 = 0; i15 < iM3649f3; i15++) {
            int iM3645b12 = c2140d.m3645b(20);
            arrayList3.add(Integer.valueOf(iM3645b12 != 0 ? c2140d.f4500b.getInt((i15 * 4) + c2140d.m3648e(iM3645b12)) : 0));
        }
        return new C1724i(dexKitBridge, i9, i10, str, i11, str2, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static MappedByteBuffer m2796v0(FileChannel fileChannel, int i9) {
        try {
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i9);
            map.order(ByteOrder.LITTLE_ENDIAN);
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static InterfaceC5559e m2797w(InterfaceC5559e interfaceC5559e, InterfaceC5560f interfaceC5560f) {
        interfaceC5560f.getClass();
        if (AbstractC1416l.m3825a(interfaceC5559e.getKey(), interfaceC5560f)) {
            return interfaceC5559e;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static final boolean m2798w0(C0943k0 c0943k0, Object obj, Object obj2) {
        Object objM2320g = c0943k0.m2320g(obj);
        if (objM2320g == null) {
            return false;
        }
        if (!(objM2320g instanceof C0945l0)) {
            if (!objM2320g.equals(obj2)) {
                return false;
            }
            c0943k0.m2324k(obj);
            return true;
        }
        C0945l0 c0945l0 = (C0945l0) objM2320g;
        boolean zM2339l = c0945l0.m2339l(obj2);
        if (zM2339l && c0945l0.m2334g()) {
            c0943k0.m2324k(obj);
        }
        return zM2339l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static final void m2799x0(C0943k0 c0943k0, Object obj) {
        boolean zM2334g;
        long[] jArr = c0943k0.f2968a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j3) < 128) {
                        int i12 = (i9 << 3) + i11;
                        Object obj2 = c0943k0.f2969b[i12];
                        Object obj3 = c0943k0.f2970c[i12];
                        if (obj3 instanceof C0945l0) {
                            C0945l0 c0945l0 = (C0945l0) obj3;
                            c0945l0.m2339l(obj);
                            zM2334g = c0945l0.m2334g();
                        } else {
                            zM2334g = obj3 == obj;
                        }
                        if (zM2334g) {
                            c0943k0.m2325l(i12);
                        }
                    }
                    j3 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length) {
                return;
            } else {
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m2800y(InterfaceC4314j interfaceC4314j, HashSet hashSet) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            hashSet.add((InterfaceC4312h) interfaceC4314j);
        } else {
            if (!(interfaceC4314j instanceof InterfaceC4318n)) {
                C0086a.m452k(m2740M0(interfaceC4314j));
                return;
            }
            Iterator it = ((InterfaceC4318n) interfaceC4314j).mo8675u().iterator();
            while (it.hasNext()) {
                m2800y((InterfaceC4314j) it.next(), hashSet);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public static void m2801y0(SharedPreferencesC0062o sharedPreferencesC0062o, MappedByteBuffer mappedByteBuffer) throws IOException {
        MappedByteBuffer mappedByteBufferM2796v0;
        int iCapacity = mappedByteBuffer.capacity();
        int i9 = SharedPreferencesC0062o.f188A;
        if (iCapacity != i9) {
            FileChannel fileChannel = mappedByteBuffer == sharedPreferencesC0062o.f210t ? sharedPreferencesC0062o.f208r : sharedPreferencesC0062o.f209s;
            try {
                fileChannel.truncate(i9);
                mappedByteBufferM2796v0 = m2796v0(fileChannel, i9);
            } catch (IOException unused) {
                mappedByteBufferM2796v0 = null;
            }
            if (mappedByteBufferM2796v0 == null) {
                C2104o.m5299y("Failed to truncate and remap buffer");
                return;
            }
            if (mappedByteBuffer == sharedPreferencesC0062o.f210t) {
                sharedPreferencesC0062o.f210t = mappedByteBufferM2796v0;
            } else {
                sharedPreferencesC0062o.f211u = mappedByteBufferM2796v0;
            }
            mappedByteBuffer = mappedByteBufferM2796v0;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static InterfaceC4314j m2802z(InterfaceC4312h interfaceC4312h, InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            if (interfaceC4314j == interfaceC4312h) {
                return interfaceC4314j;
            }
            return null;
        }
        if (!(interfaceC4314j instanceof InterfaceC4318n)) {
            C0086a.m452k(m2740M0(interfaceC4314j));
            return null;
        }
        InterfaceC4318n interfaceC4318n = (InterfaceC4318n) interfaceC4314j;
        Iterator it = interfaceC4318n.mo8675u().iterator();
        while (it.hasNext()) {
            InterfaceC4314j interfaceC4314jM2802z = m2802z(interfaceC4312h, (InterfaceC4314j) it.next());
            if (interfaceC4314jM2802z != null) {
                return interfaceC4314jM2802z instanceof InterfaceC4312h ? interfaceC4318n : interfaceC4314jM2802z;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static void m2803z0(SharedPreferencesC0062o sharedPreferencesC0062o) {
        sharedPreferencesC0062o.f194d = 12;
        sharedPreferencesC0062o.f195e = 0L;
        sharedPreferencesC0062o.f196f.clear();
        sharedPreferencesC0062o.f204n = 0;
        sharedPreferencesC0062o.f205o.clear();
        C0058k c0058k = sharedPreferencesC0062o.f198h;
        if (c0058k == null || ((byte[]) c0058k.f178j).length != SharedPreferencesC0062o.f188A) {
            sharedPreferencesC0062o.f198h = new C0058k(SharedPreferencesC0062o.f188A);
        } else {
            c0058k.m340F(4, 0L);
        }
        sharedPreferencesC0062o.f198h.m339E(0, 0);
    }

    /* JADX INFO: renamed from: A */
    public abstract Constructor mo2804A(Class cls);

    /* JADX INFO: renamed from: I */
    public abstract String[] mo2805I(Class cls);

    /* JADX INFO: renamed from: P */
    public abstract String mo2806P(AbstractC3307l abstractC3307l);

    /* JADX INFO: renamed from: Q */
    public abstract String mo2807Q(AbstractC3307l abstractC3307l);

    /* JADX INFO: renamed from: R0 */
    public abstract void mo2808R0(C6090d c6090d, AbstractC3307l abstractC3307l);

    /* JADX INFO: renamed from: S */
    public abstract boolean mo2809S(AbstractC3303h abstractC3303h);

    /* JADX INFO: renamed from: X */
    public abstract boolean mo2810X(Class cls);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean mo2811f(C3296b0 c3296b0) {
        return this instanceof C3439b;
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo2812j();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public BitSet mo2813m(AbstractC3303h abstractC3303h) {
        return new BitSet();
    }

    /* JADX INFO: renamed from: x */
    public abstract Method mo2814x(Class cls, Field field);
}
