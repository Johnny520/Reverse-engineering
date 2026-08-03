package p000a;

import ac.AbstractC0063p;
import ac.C0058k;
import ae.C0073d;
import ae.C0075f;
import ae.C0076g;
import af.C0081d;
import ai.C0089b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.system.Os;
import android.util.Log;
import be.C0294m0;
import be.C0305w;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.AbstractC1426v;
import gg.C1410f;
import gg.C1421q;
import gg.C1424t;
import gg.InterfaceC1409e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import me.C2833a;
import mg.InterfaceC2840b;
import nc.C2958a;
import nc.C2959b;
import okhttp3.HttpUrl;
import okio.C3193a;
import p003a2.C0014a;
import p007a7.AbstractC0018a;
import p012ah.C0086a;
import p015b0.C0136d0;
import p015b0.C0153s;
import p025bc.AbstractC0255e;
import p030c3.AbstractC0390a;
import p036c9.RunnableC0487t;
import p038ce.C0562o;
import p041d1.C0676v;
import p049d9.C0750k;
import p051db.C0763a;
import p057e1.C0807b;
import p057e1.C0810e;
import p059e3.C0822c;
import p059e3.C0823d;
import p068eh.AbstractC0921a;
import p071f1.C1015m;
import p071f1.InterfaceC1026r0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p089g1.C1275d;
import p099h.AbstractC1460g1;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p100h0.AbstractC1513e0;
import p100h0.C1501a0;
import p100h0.C1504b0;
import p100h0.C1507c0;
import p100h0.C1510d0;
import p100h0.C1511d1;
import p100h0.C1545q0;
import p100h0.C1556w;
import p100h0.C1560y;
import p100h0.C1562z;
import p100h0.EnumC1527j;
import p109hb.C1679g;
import p109hb.C1687k;
import p109hb.C1688k0;
import p109hb.C1695r;
import p109hb.C1696s;
import p109hb.C1697t;
import p116i.C1746e0;
import p116i.C1793u;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p119i2.C1939m0;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p144k.AbstractC2191m1;
import p144k.InterfaceC2185k1;
import p162l3.C2449c;
import p162l3.C2464r;
import p162l3.C2465s;
import p167l8.C2529d;
import p172lg.C2564d;
import p174m.AbstractC2615j0;
import p174m.C2638p;
import p174m.C2659u0;
import p199nd.C2965c0;
import p199nd.C2988t;
import p218og.AbstractC3149m;
import p222p.AbstractC3226j;
import p222p.C3272z0;
import p222p.InterfaceC3217g;
import p222p.InterfaceC3223i;
import p222p.InterfaceC3268x0;
import p233pd.C3398i;
import p233pd.C3406q;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3509m;
import p246qd.C3514r;
import p251r.AbstractC3617b0;
import p251r.C3616b;
import p251r.C3618c;
import p251r.C3641z;
import p267s1.AbstractC3913s;
import p267s1.C3903k;
import p267s1.C3904k0;
import p267s1.C3906l0;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p267s1.InterfaceC3918x;
import p269s3.C3927e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p304uf.C4329c;
import p306v.C4359d;
import p306v.InterfaceC4356a;
import p312v5.InterfaceC4479b;
import p321w.C4629q0;
import p321w.InterfaceC4647y0;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5792m;
import p351xe.AbstractC5798s;
import p351xe.C5783d;
import p351xe.C5786g;
import p351xe.C5791l;
import p352xf.EnumC5799a;
import p356y0.C5840b;
import p356y0.C5843e;
import p356y0.C5844f;
import p356y0.InterfaceC5853o;
import p369yd.C6028b;
import p370yf.AbstractC6036a;
import p384ze.C6141c;
import td.C4146b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4163j;
import tf.C4173t;
import th.AbstractC4211c;
import th.C4215g;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: a.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0000a implements InterfaceC4479b {

    /* JADX INFO: renamed from: g */
    public static volatile C1688k0 f0g;

    /* JADX INFO: renamed from: h */
    public static long f1h;

    /* JADX INFO: renamed from: i */
    public static Method f2i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0000a() {
        new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m0A(InterfaceC4312h interfaceC4312h) {
        C4320p c4320pM57c0 = m57c0(interfaceC4312h);
        if (c4320pM57c0 == null) {
            return false;
        }
        EnumC3400k enumC3400k = c4320pM57c0.f14396k;
        return enumC3400k == EnumC3400k.f10986p || enumC3400k == EnumC3400k.f10988r || enumC3400k == EnumC3400k.f10968T || enumC3400k == EnumC3400k.f10969U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static List m1A0(Object obj) {
        return obj != null ? m99x0(obj) : C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static C2465s m2B(Context context) {
        ProviderInfo providerInfo;
        C0822c c0822c;
        ApplicationInfo applicationInfo;
        C0014a c2449c = Build.VERSION.SDK_INT >= 28 ? new C2449c(27) : new C0014a(27);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0063p.m418k(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0822c = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo195i = c2449c.mo195i(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo195i) {
                    arrayList.add(signature.toByteArray());
                }
                c0822c = new C0822c(str, Collections.singletonList(arrayList), str2, "emojicompat-emoji-font");
            } catch (PackageManager.NameNotFoundException e6) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e6);
                c0822c = null;
            }
        }
        if (c0822c == null) {
            return null;
        }
        return new C2465s(new C2464r(context, c0822c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0164, code lost:
    
        if (r3 == r13) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009a), top: B:98:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3B0(C3904k0 c3904k0, C1545q0 c1545q0, C0058k c0058k, C3903k c3903k, AbstractC6036a abstractC6036a) {
        C1501a0 c1501a0;
        C1275d c1275d;
        boolean z9;
        C1421q c1421q;
        C4629q0 c4629q0;
        boolean z10;
        C3904k0 c3904k02 = c3904k0;
        C1545q0 c1545q02 = c1545q0;
        C1275d c1275d2 = C1556w.f5191d;
        if (abstractC6036a instanceof C1501a0) {
            c1501a0 = (C1501a0) abstractC6036a;
            int i9 = c1501a0.f4981k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1501a0.f4981k = i9 - Integer.MIN_VALUE;
            } else {
                c1501a0 = new C1501a0(abstractC6036a);
            }
        }
        C1501a0 c1501a02 = c1501a0;
        Object objM6067d = c1501a02.f4980j;
        int i10 = c1501a02.f4981k;
        int i11 = 0;
        try {
            try {
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(objM6067d);
                    C3914t c3914t = (C3914t) c3903k.f12800a.get(0);
                    int i12 = c3903k.f12804e & 1;
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (i12 != 0) {
                        long j3 = c3914t.f12836c;
                        C1511d1 c1511d1 = (C1511d1) c1545q02.f5154d;
                        C4629q0 c4629q02 = c1511d1.f5032d;
                        if (c4629q02 == null || c4629q02.m9051d() == null || !c1511d1.m4025k()) {
                            z10 = false;
                        } else {
                            c1511d1.f5047s = -1;
                            C0676v c0676v = c1511d1.f5039k;
                            if (c0676v != null) {
                                C0676v.m1859a(c0676v);
                            }
                            c1545q02.m4045f(c1511d1.m4028n(), j3, false, C1556w.f5191d);
                            z10 = true;
                        }
                        if (z10) {
                            c3914t.m8118a();
                            long j4 = c3914t.f12834a;
                            C0136d0 c0136d0 = new C0136d0(c1545q02, 15);
                            c1501a02.f4977g = c3904k02;
                            c1501a02.f4978h = c1545q02;
                            c1501a02.f4981k = 1;
                            objM6067d = AbstractC2615j0.m6067d(c3904k02, j4, c0136d0, c1501a02);
                            if (objM6067d == enumC5799a) {
                                return enumC5799a;
                            }
                            if (((Boolean) objM6067d).booleanValue()) {
                            }
                        }
                    } else {
                        int i13 = c0058k.f176h;
                        if (i13 != 1) {
                            c1275d = i13 != 2 ? C1556w.f5193f : C1556w.f5192e;
                        } else {
                            c1275d = c1275d2;
                        }
                        long j5 = c3914t.f12836c;
                        C1511d1 c1511d12 = (C1511d1) c1545q02.f5154d;
                        if (!c1511d12.m4025k() || c1511d12.m4028n().f9316a.f6529h.length() == 0 || (c4629q0 = c1511d12.f5032d) == null || c4629q0.m9051d() == null) {
                            z9 = false;
                        } else {
                            C0676v c0676v2 = c1511d12.f5039k;
                            if (c0676v2 != null) {
                                C0676v.m1859a(c0676v2);
                            }
                            c1511d12.f5042n = j5;
                            c1511d12.f5047s = -1;
                            z9 = true;
                            c1511d12.m4022h(true);
                            long jM4045f = c1545q02.m4045f(c1511d12.m4028n(), c1511d12.f5042n, true, c1275d);
                            if (i13 >= 2) {
                                c1545q02.f5152b = true;
                                c1545q02.f5153c = new C1939m0(jM4045f);
                            }
                        }
                        if (z9) {
                            c1421q = new C1421q();
                            c1421q.f4734g = !c1275d.equals(c1275d2);
                            long j10 = c3914t.f12834a;
                            C0153s c0153s = new C0153s(c1545q02, c1275d, c1421q, 7);
                            c1501a02.f4977g = c3904k02;
                            c1501a02.f4978h = c1545q02;
                            c1501a02.f4979i = c1421q;
                            c1501a02.f4981k = 2;
                            objM6067d = AbstractC2615j0.m6067d(c3904k02, j10, c0153s, c1501a02);
                        }
                    }
                } else if (i10 == 1) {
                    c1545q02 = c1501a02.f4978h;
                    c3904k02 = c1501a02.f4977g;
                    AbstractC1089i.m2732I0(objM6067d);
                    if (((Boolean) objM6067d).booleanValue()) {
                        ?? r02 = c3904k02.f12811l.f12826z.f12800a;
                        int size = r02.size();
                        while (i11 < size) {
                            C3914t c3914t2 = (C3914t) r02.get(i11);
                            if (AbstractC3913s.m8110c(c3914t2)) {
                                c3914t2.m8118a();
                            }
                            i11++;
                        }
                    }
                } else {
                    if (i10 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    C1421q c1421q2 = c1501a02.f4979i;
                    c1545q02 = c1501a02.f4978h;
                    C3904k0 c3904k03 = c1501a02.f4977g;
                    AbstractC1089i.m2732I0(objM6067d);
                    c1421q = c1421q2;
                    c3904k02 = c3904k03;
                    if (((Boolean) objM6067d).booleanValue() && c1421q.f4734g) {
                        ?? r03 = c3904k02.f12811l.f12826z.f12800a;
                        int size2 = r03.size();
                        while (i11 < size2) {
                            C3914t c3914t3 = (C3914t) r03.get(i11);
                            if (AbstractC3913s.m8110c(c3914t3)) {
                                c3914t3.m8118a();
                            }
                            i11++;
                        }
                    }
                    c1545q02.m4044e();
                }
                return C3967n.f12976a;
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static Handler m4C(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0390a.m1354a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e6) {
            e = e6;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e7) {
            e = e7;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static ArrayList m5C0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4163j(objArr, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static BitSet m6D0(C4322r c4322r) {
        return new BitSet(c4322r.f14425z.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static C4329c m7E() {
        return new C4329c(10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public static ArrayList m8E0(List list) {
        int i9;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0763a c0763a = (C0763a) it.next();
            String string = AbstractC3149m.m6703R0(c0763a.f2287b).toString();
            if (!(!AbstractC3149m.m6721t0(string) && (i9 = c0763a.f2286a) >= 0 && i9 < 8)) {
                c0763a = null;
            }
            C0763a c0763aM1979a = c0763a != null ? C0763a.m1979a(c0763a, string) : null;
            if (c0763aM1979a != null) {
                arrayList.add(c0763aM1979a);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static void m9F(File file) {
        File[] fileArrListFiles;
        if (!AbstractC1416l.m3825a(file.getAbsoluteFile(), file.getCanonicalFile())) {
            if (file.delete()) {
                return;
            }
            C0086a.m449h(AbstractC4855en.m9263g("删除符号链接失败: ", file.getName()));
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m9F(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        C0086a.m449h(AbstractC4855en.m9263g("删除插件文件失败: ", file.getName()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static String m10F0(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = AbstractC3149m.m6703R0(str).toString();
        return AbstractC3149m.m6721t0(string) ? "yyyy-MM-dd HH:mm:ss" : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static C1696s m11G(int i9, List list, List list2, int i10, int i11, InterfaceC1236q interfaceC1236q) {
        list.getClass();
        interfaceC1236q.getClass();
        C1688k0 c1688k0 = f0g;
        if (c1688k0 != null) {
            ArrayList arrayListM8E0 = m8E0(list);
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AbstractC2091b.m5171r((String) it.next(), arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!AbstractC3149m.m6721t0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
            if (!arrayListM8E0.isEmpty() && !listM8407P1.isEmpty()) {
                if (i9 != 1) {
                    return c1688k0.f5610a.m4273h(arrayListM8E0, listM8407P1, i10, i11, interfaceC1236q);
                }
                C1687k c1687k = c1688k0.f5612c;
                c1687k.getClass();
                ArrayList arrayListM4290c = C1687k.m4290c(arrayListM8E0);
                if (arrayListM4290c != null) {
                    return c1687k.m4299f(arrayListM4290c, listM8407P1, interfaceC1236q);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public static final List m12G0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : m99x0(list.get(0)) : C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static C1696s m13H(int i9, List list, List list2, InterfaceC1236q interfaceC1236q) {
        interfaceC1236q.getClass();
        C1688k0 c1688k0 = f0g;
        if (c1688k0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
        if (list.isEmpty() || listM8407P1.isEmpty()) {
            return null;
        }
        if (i9 == 1) {
            return c1688k0.f5612c.m4299f(list, listM8407P1, interfaceC1236q);
        }
        C1695r c1695r = c1688k0.f5611b;
        c1695r.getClass();
        return c1695r.m4323g(list, listM8407P1, interfaceC1236q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public static int m14H0(C0058k c0058k) {
        int i9;
        int i10 = 0;
        int i11 = 0;
        do {
            int iM345K = c0058k.m345K();
            i10 |= (iM345K & 127) << (i11 * 7);
            i11++;
            i9 = iM345K & 128;
            if (i9 != 128) {
                break;
            }
        } while (i11 < 5);
        if (i9 != 128) {
            return i10;
        }
        throw new C0081d("Invalid LEB128 sequence");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static final boolean m15I(char c10, char c11, boolean z9) {
        if (c10 == c11) {
            return true;
        }
        if (!z9) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public static final C3927e m16I0(C1836h0 c1836h0) {
        Object objM4514P = c1836h0.m4514P();
        C1823e c1823e = C1851l.f6155a;
        if (objM4514P == c1823e) {
            objM4514P = new C3927e();
            c1836h0.m4545k0(objM4514P);
        }
        C3927e c3927e = (C3927e) objM4514P;
        C4173t c4173t = C4173t.f13710g;
        boolean zM4538h = c1836h0.m4538h(c4173t) | c1836h0.m4538h(c4173t);
        Object objM4514P2 = c1836h0.m4514P();
        if (zM4538h || objM4514P2 == c1823e) {
            objM4514P2 = new C1746e0(c3927e, 19);
            c1836h0.m4545k0(objM4514P2);
        }
        AbstractC1874r.m4628j((InterfaceC1220a) objM4514P2, c1836h0);
        return c3927e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static final boolean m17J(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public static void m18J0(C4322r c4322r, C4305a c4305a, int i9, C4320p c4320p) {
        C4320p c4320p2 = (C4320p) c4305a.f14351l.get(i9);
        c4320p.m6225B(c4320p2);
        c4320p.m6393H(c4320p2);
        c4320p.m8685V(c4320p2);
        c4320p.f14399n = c4320p2.f14399n;
        c4305a.f14351l.set(i9, c4320p);
        C3514r c3514r = c4320p.f14397l;
        C3514r c3514r2 = c4320p2.f14397l;
        if (c3514r == null || c3514r2 == null || !c3514r.m7396h0(c3514r2)) {
            C5791l.m10478j(c4322r, c4320p2);
        } else {
            C5791l.m10476h(c4322r, c4320p2);
        }
        c4320p.mo8341Z();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static C4305a m19K(C4305a c4305a) {
        while (true) {
            C4305a c4305aM62e0 = m62e0(c4305a);
            if (c4305aM62e0 == null) {
                return c4305a;
            }
            c4305a = c4305aM62e0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public static boolean m20K0(C4322r c4322r, C4305a c4305a, C4320p c4320p, C4320p c4320p2) {
        ArrayList arrayList = c4305a.f14351l;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((C4320p) arrayList.get(i9)) == c4320p) {
                m18J0(c4322r, c4305a, i9, c4320p2);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static void m21L(C4322r c4322r, BitSet bitSet, Consumer consumer) {
        if (bitSet == C5786g.f23528g || bitSet.isEmpty()) {
            return;
        }
        List list = c4322r.f14425z;
        int i9 = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i9);
            if (iNextSetBit < 0) {
                return;
            }
            consumer.accept((C4305a) list.get(iNextSetBit));
            i9 = iNextSetBit + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public static String m22L0(int i9) {
        char[] cArr = new char[9];
        if (i9 < 0) {
            cArr[0] = '-';
            i9 = -i9;
        } else {
            cArr[0] = '+';
        }
        for (int i10 = 0; i10 < 8; i10++) {
            cArr[8 - i10] = Character.forDigit(i9 & 15, 16);
            i9 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static String m23M(long j3, String str) {
        Object c3959f;
        Date date = new Date(j3);
        try {
            c3959f = new SimpleDateFormat(m10F0(str), Locale.CHINA).format(date);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            c3959f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(date);
        }
        c3959f.getClass();
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public static AbstractC3508l m24M0(C4322r c4322r, C4320p c4320p) {
        if (!c4320p.f9217g.mo6235a(EnumC2824a.f9133S)) {
            return null;
        }
        Iterator it = c4322r.f14425z.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C4305a) it.next()).f14351l.iterator();
            while (it2.hasNext()) {
                AbstractC3508l abstractC3508lM25N = m25N((C4320p) it2.next(), c4320p);
                if (abstractC3508lM25N != null) {
                    return abstractC3508lM25N;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static AbstractC3508l m25N(C4320p c4320p, C4320p c4320p2) {
        for (AbstractC3508l abstractC3508l : c4320p.f14398m) {
            abstractC3508l.getClass();
            if (abstractC3508l instanceof C3509m) {
                C4320p c4320p3 = ((C3509m) abstractC3508l).f11421l;
                if (c4320p3 == c4320p2) {
                    return abstractC3508l;
                }
                AbstractC3508l abstractC3508lM25N = m25N(c4320p3, c4320p2);
                if (abstractC3508lM25N != null) {
                    return abstractC3508lM25N;
                }
            }
        }
        if (c4320p instanceof C4146b) {
            return m27O(((C4146b) c4320p).f13664o, c4320p2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public static C4305a m26N0(List list, C4305a c4305a) {
        if (list.size() > 2) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4305a c4305a2 = (C4305a) it.next();
                if (!m85q0(c4305a2)) {
                    arrayList.add(c4305a2);
                }
            }
            list = arrayList;
        }
        if (list.size() == 2) {
            C4305a c4305a3 = (C4305a) list.get(0);
            return c4305a3 != c4305a ? c4305a3 : (C4305a) list.get(1);
        }
        C0086a.m452k(AbstractC0255e.m1021j("Incorrect nodes count for selectOther: ", String.valueOf(c4305a), " in ", String.valueOf(list)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static AbstractC3508l m27O(C6028b c6028b, C4320p c4320p) {
        if (c6028b.m10796L()) {
            return m25N((C3398i) c6028b.f24479k.f23527b, c4320p);
        }
        Iterator it = c6028b.f24478j.iterator();
        while (it.hasNext()) {
            AbstractC3508l abstractC3508lM27O = m27O((C6028b) it.next(), c4320p);
            if (abstractC3508lM27O != null) {
                return abstractC3508lM27O;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public static C4305a m28O0(C4305a c4305a) {
        return (c4305a.f9217g.mo6235a(EnumC2824a.f9159m) && c4305a.f14351l.isEmpty() && c4305a.f14352m.size() == 1) ? (C4305a) c4305a.f14352m.get(0) : c4305a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static HashSet m29P(C4305a c4305a, C4305a c4305a2) {
        HashSet hashSet = new HashSet();
        hashSet.add(c4305a);
        if (c4305a != c4305a2) {
            m70j(hashSet, c4305a2, c4305a);
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P0 */
    public static void m30P0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static final C1410f m31Q(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return AbstractC1426v.m3834a(clsAnnotationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    public static void m32Q0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static List m33R(C2959b c2959b, String str) {
        LinkedHashMap linkedHashMap = c2959b.f9708c;
        if (linkedHashMap.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        C2958a c2958a = (C2958a) linkedHashMap.get(str);
        return (c2958a == null || c2958a.f9704g != 17) ? Collections.EMPTY_LIST : (List) c2958a.f9705h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R0 */
    public static String m34R0(long j3) {
        int i9 = (int) (j3 >> 32);
        int i10 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i9) == Float.intBitsToFloat(i10)) {
            return "CornerRadius.circular(" + AbstractC0018a.m234V(Float.intBitsToFloat(i9)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC0018a.m234V(Float.intBitsToFloat(i9)) + ", " + AbstractC0018a.m234V(Float.intBitsToFloat(i10)) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static C4305a m35S(C4322r c4322r, C4320p c4320p, List list) {
        if (c4320p == null) {
            return null;
        }
        if (c4320p instanceof C3406q) {
            C3406q c3406q = (C3406q) c4320p;
            for (C4305a c4305a : c4322r.f14425z) {
                C2965c0 c2965c0 = (C2965c0) c4305a.f9217g.mo6237c(C2825b.f9209x);
                if (c2965c0 != null) {
                    Iterator it = c2965c0.f9719g.iterator();
                    while (it.hasNext()) {
                        if (((C3406q) it.next()) == c3406q) {
                            return c4305a;
                        }
                    }
                }
            }
            return null;
        }
        if (!c4320p.f9217g.mo6235a(EnumC2824a.f9133S)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C4305a c4305a2 = (C4305a) it2.next();
                if (m88s(c4305a2, c4320p)) {
                    return c4305a2;
                }
            }
            return null;
        }
        for (C4305a c4305a3 : c4322r.f14425z) {
            for (C4320p c4320p2 : c4305a3.f14351l) {
                if (c4320p2 == c4320p || m25N(c4320p2, c4320p) != null) {
                    return c4305a3;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S0 */
    public static void m36S0(Activity activity, String str) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0487t(activity, str, 7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static C4305a m37T(int i9, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C4305a c4305a = (C4305a) it.next();
            if (c4305a.f14350k == i9) {
                return c4305a;
            }
        }
        C0086a.m452k(AbstractC0255e.m1021j("Can't find block by offset: ", AbstractC5792m.m10487d(i9), " in list ", String.valueOf(iterable)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m38T0(C3904k0 c3904k0, InterfaceC4647y0 interfaceC4647y0, C3903k c3903k, AbstractC6036a abstractC6036a) {
        C1504b0 c1504b0;
        C3914t c3914t;
        if (abstractC6036a instanceof C1504b0) {
            c1504b0 = (C1504b0) abstractC6036a;
            int i9 = c1504b0.f5002k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1504b0.f5002k = i9 - Integer.MIN_VALUE;
            } else {
                c1504b0 = new C1504b0(abstractC6036a);
            }
        }
        Object objM6065b = c1504b0.f5001j;
        int i10 = c1504b0.f5002k;
        boolean z9 = true;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        try {
            if (i10 == 0) {
                AbstractC1089i.m2732I0(objM6065b);
                c3914t = (C3914t) AbstractC4166m.m8422t1(c3903k.f12800a);
                long j3 = c3914t.f12834a;
                c1504b0.f4998g = c3904k0;
                c1504b0.f4999h = interfaceC4647y0;
                c1504b0.f5000i = c3914t;
                c1504b0.f5002k = 1;
                objM6065b = AbstractC2615j0.m6065b(c3904k0, j3, c1504b0);
                if (objM6065b == enumC5799a) {
                }
                return enumC5799a;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC4647y0 = c1504b0.f4999h;
                c3904k0 = c1504b0.f4998g;
                AbstractC1089i.m2732I0(objM6065b);
                if (((Boolean) objM6065b).booleanValue()) {
                    ?? r11 = c3904k0.f12811l.f12826z.f12800a;
                    int size = r11.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        C3914t c3914t2 = (C3914t) r11.get(i11);
                        if (AbstractC3913s.m8110c(c3914t2)) {
                            c3914t2.m8118a();
                        }
                    }
                    interfaceC4647y0.mo4010b();
                } else {
                    interfaceC4647y0.onCancel();
                }
                return C3967n.f12976a;
            }
            C3914t c3914t3 = c1504b0.f5000i;
            interfaceC4647y0 = c1504b0.f4999h;
            C3904k0 c3904k02 = c1504b0.f4998g;
            AbstractC1089i.m2732I0(objM6065b);
            c3914t = c3914t3;
            c3904k0 = c3904k02;
            C3914t c3914t4 = (C3914t) objM6065b;
            if (c3914t4 != null) {
                long j4 = c3914t4.f12836c;
                if (C0807b.m2040c(C0807b.m2041d(c3914t.f12836c, j4)) >= AbstractC2615j0.m6069f(c3904k0.m8099B(), c3914t.f12842i)) {
                    z9 = false;
                }
                if (z9) {
                    interfaceC4647y0.mo4009a(j4, AbstractC1513e0.f5060a);
                    long j5 = c3914t4.f12834a;
                    C1560y c1560y = new C1560y(interfaceC4647y0, 0);
                    c1504b0.f4998g = c3904k0;
                    c1504b0.f4999h = interfaceC4647y0;
                    c1504b0.f5000i = null;
                    c1504b0.f5002k = 2;
                    objM6065b = AbstractC2615j0.m6067d(c3904k0, j5, c1560y, c1504b0);
                }
            }
            return C3967n.f12976a;
        } catch (CancellationException e6) {
            interfaceC4647y0.onCancel();
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static C4305a m39U(List list, EnumC2824a enumC2824a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4305a c4305a = (C4305a) it.next();
            if (c4305a.f9217g.mo6235a(enumC2824a)) {
                return c4305a;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U0 */
    public static void m40U0(C4305a c4305a, BitSet bitSet, Predicate predicate) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(c4305a);
        while (true) {
            C4305a c4305a2 = (C4305a) arrayDeque.poll();
            if (c4305a2 == null || predicate.test(c4305a2)) {
                return;
            }
            for (C4305a c4305a3 : c4305a2.f14352m) {
                int i9 = c4305a3.f14349j;
                if (!bitSet.get(i9)) {
                    bitSet.set(i9);
                    arrayDeque.add(c4305a3);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static C4305a m41V(List list) {
        if (list.size() == 1) {
            return (C4305a) list.get(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4305a c4305a = (C4305a) it.next();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C4305a c4305a2 = (C4305a) it2.next();
                if (c4305a == c4305a2 || m77m0(c4305a2, c4305a)) {
                }
            }
            return c4305a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V0 */
    public static boolean m42V0(C4305a c4305a, C4305a c4305a2, BitSet bitSet, boolean z9) {
        for (C4305a c4305a3 : z9 ? c4305a.f14354o : c4305a.f14353n) {
            if (c4305a3 == c4305a2) {
                return true;
            }
            if (c4305a3 != c4305a) {
                int i9 = c4305a3.f14349j;
                if (bitSet.get(i9)) {
                    continue;
                } else {
                    bitSet.set(i9);
                    if (c4305a2.f14355p.get(c4305a3.f14349j) || m42V0(c4305a3, c4305a2, bitSet, z9)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static C4320p m43W(InterfaceC4312h interfaceC4312h) {
        if (interfaceC4312h == null) {
            return null;
        }
        List listMo8643g = interfaceC4312h.mo8643g();
        if (listMo8643g.isEmpty()) {
            return null;
        }
        return (C4320p) listMo8643g.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W0 */
    public static String m44W0(int i9) {
        char[] cArr = new char[2];
        for (int i10 = 0; i10 < 2; i10++) {
            cArr[1 - i10] = Character.forDigit(i9 & 15, 16);
            i9 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static C2564d m45X(Collection collection) {
        collection.getClass();
        return new C2564d(0, collection.size() - 1, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X0 */
    public static String m46X0(int i9) {
        char[] cArr = new char[4];
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[3 - i10] = Character.forDigit(i9 & 15, 16);
            i9 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static int m47Y(C4305a c4305a, C4320p c4320p) {
        ArrayList arrayList = c4305a.f14351l;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (arrayList.get(i9) == c4320p) {
                return i9;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y0 */
    public static String m48Y0(int i9) {
        char[] cArr = new char[8];
        for (int i10 = 0; i10 < 8; i10++) {
            cArr[7 - i10] = Character.forDigit(i9 & 15, 16);
            i9 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: Z */
    public static final Class m49Z(InterfaceC2840b interfaceC2840b) {
        interfaceC2840b.getClass();
        Class clsMo3818a = ((InterfaceC1409e) interfaceC2840b).mo3818a();
        if (clsMo3818a.isPrimitive()) {
            String name = clsMo3818a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo3818a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z0 */
    public static String m50Z0(long j3) {
        char[] cArr = new char[16];
        for (int i9 = 0; i9 < 16; i9++) {
            cArr[15 - i9] = Character.forDigit(((int) j3) & 15, 16);
            j3 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a0 */
    public static final Class m51a0(C1410f c1410f) {
        Class clsMo3818a = c1410f.mo3818a();
        if (clsMo3818a.isPrimitive()) {
            return clsMo3818a;
        }
        String name = clsMo3818a.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
    /* JADX INFO: renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m52a1(int i9, List list) {
        int i10;
        Object next;
        List listM8407P1;
        Object obj;
        Object obj2;
        Object obj3;
        boolean zM5942h;
        boolean z9;
        boolean zM5942h2;
        list.getClass();
        ArrayList<C0763a> arrayListM8E0 = m8E0(list);
        if (arrayListM8E0.isEmpty()) {
            return "请配置发送内容";
        }
        Iterator it = arrayListM8E0.iterator();
        while (true) {
            i10 = 1;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0763a c0763a = (C0763a) next;
            int i11 = c0763a.f2286a;
            if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
                if (!new File(c0763a.f2287b).isFile()) {
                    break;
                }
            }
        }
        C0763a c0763a2 = (C0763a) next;
        String str = "文本";
        if (c0763a2 != null) {
            String name = new File(c0763a2.f2287b).getName();
            if (AbstractC3149m.m6721t0(name)) {
                switch (c0763a2.f2286a) {
                    case 0:
                        break;
                    case 1:
                        str = "图片";
                        break;
                    case 2:
                        str = "视频";
                        break;
                    case 3:
                        str = "文件";
                        break;
                    case 4:
                        str = "表情";
                        break;
                    case 5:
                        str = "语音";
                        break;
                    case 6:
                        str = "视频号";
                        break;
                    case 7:
                        str = "收藏";
                        break;
                    default:
                        str = "内容";
                        break;
                }
                name = str;
            }
            return "发送文件不存在: " + ((Object) name);
        }
        C1688k0 c1688k0 = f0g;
        if (c1688k0 == null) {
            return "群发助手尚未就绪";
        }
        if (i9 == 1) {
            if (!arrayListM8E0.isEmpty()) {
                for (C0763a c0763a3 : arrayListM8E0) {
                    int i12 = c0763a3.f2286a;
                    if (i12 != 6) {
                        z9 = false;
                    } else {
                        if (i12 == 0 || i12 == i10 || i12 == 2 || i12 == 4 || i12 == 5) {
                            zM5942h2 = true;
                        } else if (i12 != 6) {
                            zM5942h2 = false;
                        } else {
                            C2529d c2529d = WeChatMessage.Companion;
                            String str2 = c0763a3.f2287b;
                            c2529d.getClass();
                            zM5942h2 = C2529d.m5942h(str2);
                        }
                        if (!zM5942h2) {
                            z9 = true;
                        }
                    }
                    if (z9) {
                        return "视频号内容无效，请填写视频号分享消息 XML";
                    }
                    i10 = 1;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : arrayListM8E0) {
                C0763a c0763a4 = (C0763a) obj4;
                c0763a4.getClass();
                int i13 = c0763a4.f2286a;
                ArrayList arrayList2 = arrayListM8E0;
                if (i13 == 0 || i13 == 1 || i13 == 2 || i13 == 4 || i13 == 5) {
                    zM5942h = true;
                } else if (i13 != 6) {
                    zM5942h = false;
                } else {
                    C2529d c2529d2 = WeChatMessage.Companion;
                    String str3 = c0763a4.f2287b;
                    c2529d2.getClass();
                    zM5942h = C2529d.m5942h(str3);
                }
                if (!zM5942h) {
                    arrayList.add(obj4);
                }
                arrayListM8E0 = arrayList2;
            }
            ArrayList<C0763a> arrayList3 = arrayListM8E0;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    switch (((C0763a) it2.next()).f2286a) {
                        case 0:
                            obj3 = "文本";
                            break;
                        case 1:
                            obj3 = "图片";
                            break;
                        case 2:
                            obj3 = "视频";
                            break;
                        case 3:
                            obj3 = "文件";
                            break;
                        case 4:
                            obj3 = "表情";
                            break;
                        case 5:
                            obj3 = "语音";
                            break;
                        case 6:
                            obj3 = "视频号";
                            break;
                        case 7:
                            obj3 = "收藏";
                            break;
                        default:
                            obj3 = "内容";
                            break;
                    }
                    arrayList4.add(obj3);
                }
                return "微信原生群发助手仅支持文字、图片、视频、语音、表情和视频号: ".concat(AbstractC4166m.m8392A1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4)), "、", null, null, null, 62));
            }
            if (!c1688k0.f5612c.m4300g()) {
                return "微信原生群发助手通道不可用";
            }
            if (!arrayList3.isEmpty()) {
                for (C0763a c0763a5 : arrayList3) {
                    int i14 = c0763a5.f2286a;
                    if ((i14 == 0 || i14 == 6) && AbstractC3149m.m6709h0(c0763a5.f2287b, "%friendName%", false)) {
                        return "微信原生群发助手不支持好友昵称变量";
                    }
                }
            }
            C1687k c1687k = c1688k0.f5612c;
            c1687k.getClass();
            C1679g c1679g = c1687k.f5605f;
            if (c1679g != null) {
                ArrayList arrayList5 = new ArrayList();
                for (C0763a c0763a6 : arrayList3) {
                    C1697t c1697tM4289b = C1687k.m4289b(c0763a6, 0);
                    if (c1697tM4289b == null || !C1687k.m4292h(c1697tM4289b, c1679g)) {
                        switch (c0763a6.f2286a) {
                            case 0:
                                obj2 = "文本";
                                break;
                            case 1:
                                obj2 = "图片";
                                break;
                            case 2:
                                obj2 = "视频";
                                break;
                            case 3:
                                obj2 = "文件";
                                break;
                            case 4:
                                obj2 = "表情";
                                break;
                            case 5:
                                obj2 = "语音";
                                break;
                            case 6:
                                obj2 = "视频号";
                                break;
                            case 7:
                                obj2 = "收藏";
                                break;
                            default:
                                obj2 = "内容";
                                break;
                        }
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        arrayList5.add(obj2);
                    }
                }
                listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList5));
            } else {
                ArrayList arrayList6 = new ArrayList(AbstractC4167n.m8429e1(arrayList3));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    switch (((C0763a) it3.next()).f2286a) {
                        case 0:
                            obj = "文本";
                            break;
                        case 1:
                            obj = "图片";
                            break;
                        case 2:
                            obj = "视频";
                            break;
                        case 3:
                            obj = "文件";
                            break;
                        case 4:
                            obj = "表情";
                            break;
                        case 5:
                            obj = "语音";
                            break;
                        case 6:
                            obj = "视频号";
                            break;
                        case 7:
                            obj = "收藏";
                            break;
                        default:
                            obj = "内容";
                            break;
                    }
                    arrayList6.add(obj);
                }
                listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList6));
            }
            List list2 = listM8407P1;
            if (!list2.isEmpty()) {
                return "微信原生群发助手不支持: ".concat(AbstractC4166m.m8392A1(list2, "、", null, null, null, 62));
            }
            c1688k0.f5612c.getClass();
            ArrayList arrayListM4290c = C1687k.m4290c(arrayList3);
            String strM4293j = arrayListM4290c != null ? C1687k.m4293j(arrayListM4290c) : "原生群发内容无效";
            if (strM4293j != null) {
                return strM4293j;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m53b(InterfaceC5853o interfaceC5853o, C3641z c3641z, InterfaceC3268x0 interfaceC3268x0, InterfaceC3223i interfaceC3223i, C5843e c5843e, C2638p c2638p, boolean z9, InterfaceC2185k1 interfaceC2185k1, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, int i9, int i10) {
        int i11;
        C3641z c3641zM7603a;
        int i12;
        InterfaceC3268x0 c3272z0;
        InterfaceC3223i interfaceC3223i2;
        int i13;
        boolean z10;
        InterfaceC2185k1 interfaceC2185k12;
        C3641z c3641z2;
        InterfaceC3268x0 interfaceC3268x02;
        InterfaceC3223i interfaceC3223i3;
        C5843e c5843e2;
        C2638p c2638p2;
        C1876r1 c1876r1M4557t;
        InterfaceC3223i interfaceC3223i4;
        InterfaceC3223i interfaceC3223i5;
        C2638p c2638p3;
        C5843e c5843e3;
        InterfaceC2185k1 interfaceC2185k1M5423a;
        int i14;
        InterfaceC3268x0 interfaceC3268x03;
        boolean z11;
        c1836h0.m4527b0(53695811);
        if ((i9 & 6) == 0) {
            i11 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i10 & 2) == 0) {
            c3641zM7603a = c3641z;
            int i15 = c1836h0.m4534f(c3641zM7603a) ? 32 : 16;
            int i16 = i11 | i15;
            i12 = i10 & 4;
            if (i12 != 0) {
                if ((i9 & 384) == 0) {
                    c3272z0 = interfaceC3268x0;
                    i16 |= c1836h0.m4534f(c3272z0) ? Opcodes.ACC_NATIVE : 128;
                }
                int i17 = i16 | 3072;
                if ((i9 & 24576) == 0) {
                    if ((i10 & 16) == 0) {
                        interfaceC3223i2 = interfaceC3223i;
                        int i18 = c1836h0.m4534f(interfaceC3223i2) ? 16384 : 8192;
                        i17 |= i18;
                    } else {
                        interfaceC3223i2 = interfaceC3223i;
                    }
                    i17 |= i18;
                } else {
                    interfaceC3223i2 = interfaceC3223i;
                }
                i13 = i17 | 46858240;
                if ((805306368 & i9) == 0) {
                    i13 |= c1836h0.m4538h(interfaceC1231l) ? 536870912 : 268435456;
                }
                if (c1836h0.m4516S(i13 & 1, (306783379 & i13) != 306783378)) {
                    c1836h0.m4521X();
                    if ((i9 & 1) == 0 || c1836h0.m4500B()) {
                        if ((i10 & 2) != 0) {
                            c3641zM7603a = AbstractC3617b0.m7603a(c1836h0);
                            i13 &= -113;
                        }
                        if (i12 != 0) {
                            float f3 = 0;
                            c3272z0 = new C3272z0(f3, f3, f3, f3);
                        }
                        if ((i10 & 16) != 0) {
                            interfaceC3223i4 = AbstractC3226j.f10300c;
                            i13 &= -57345;
                        } else {
                            interfaceC3223i4 = interfaceC3223i2;
                        }
                        C5843e c5843e4 = C5840b.f23773s;
                        C1793u c1793uM3988a = AbstractC1460g1.m3988a(c1836h0);
                        boolean zM4534f = c1836h0.m4534f(c1793uM3988a);
                        Object objM4514P = c1836h0.m4514P();
                        if (zM4534f || objM4514P == C1851l.f6155a) {
                            objM4514P = new C2638p(c1793uM3988a);
                            c1836h0.m4545k0(objM4514P);
                        }
                        interfaceC3223i5 = interfaceC3223i4;
                        c2638p3 = (C2638p) objM4514P;
                        c5843e3 = c5843e4;
                        interfaceC2185k1M5423a = AbstractC2191m1.m5423a(c1836h0);
                        i14 = i13 & (-238551041);
                        interfaceC3268x03 = c3272z0;
                        z11 = true;
                    } else {
                        c1836h0.m4519V();
                        if ((i10 & 2) != 0) {
                            i13 &= -113;
                        }
                        if ((i10 & 16) != 0) {
                            i13 &= -57345;
                        }
                        c5843e3 = c5843e;
                        c2638p3 = c2638p;
                        i14 = i13 & (-238551041);
                        interfaceC3268x03 = c3272z0;
                        interfaceC3223i5 = interfaceC3223i2;
                        z11 = z9;
                        interfaceC2185k1M5423a = interfaceC2185k1;
                    }
                    c1836h0.m4554q();
                    C3641z c3641z3 = c3641zM7603a;
                    AbstractC0018a.m237a(interfaceC5853o, c3641z3, interfaceC3268x03, true, c2638p3, z11, interfaceC2185k1M5423a, c5843e3, interfaceC3223i5, null, null, interfaceC1231l, c1836h0, 806882304 | (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896), ((i14 >> 12) & 14) | ((i14 >> 18) & 7168), 6400);
                    InterfaceC2185k1 interfaceC2185k13 = interfaceC2185k1M5423a;
                    c2638p2 = c2638p3;
                    interfaceC3223i3 = interfaceC3223i5;
                    interfaceC2185k12 = interfaceC2185k13;
                    C5843e c5843e5 = c5843e3;
                    z10 = z11;
                    c5843e2 = c5843e5;
                    interfaceC3268x02 = interfaceC3268x03;
                    c3641z2 = c3641z3;
                } else {
                    c1836h0.m4519V();
                    z10 = z9;
                    interfaceC2185k12 = interfaceC2185k1;
                    c3641z2 = c3641zM7603a;
                    interfaceC3268x02 = c3272z0;
                    interfaceC3223i3 = interfaceC3223i2;
                    c5843e2 = c5843e;
                    c2638p2 = c2638p;
                }
                c1876r1M4557t = c1836h0.m4557t();
                if (c1876r1M4557t != null) {
                    c1876r1M4557t.f6241d = new C3618c(interfaceC5853o, c3641z2, interfaceC3268x02, interfaceC3223i3, c5843e2, c2638p2, z10, interfaceC2185k12, interfaceC1231l, i9, i10);
                    return;
                }
                return;
            }
            i16 |= 384;
            c3272z0 = interfaceC3268x0;
            int i172 = i16 | 3072;
            if ((i9 & 24576) == 0) {
            }
            i13 = i172 | 46858240;
            if ((805306368 & i9) == 0) {
            }
            if (c1836h0.m4516S(i13 & 1, (306783379 & i13) != 306783378)) {
            }
            c1876r1M4557t = c1836h0.m4557t();
            if (c1876r1M4557t != null) {
            }
        } else {
            c3641zM7603a = c3641z;
        }
        int i162 = i11 | i15;
        i12 = i10 & 4;
        if (i12 != 0) {
        }
        c3272z0 = interfaceC3268x0;
        int i1722 = i162 | 3072;
        if ((i9 & 24576) == 0) {
        }
        i13 = i1722 | 46858240;
        if ((805306368 & i9) == 0) {
        }
        if (c1836h0.m4516S(i13 & 1, (306783379 & i13) != 306783378)) {
        }
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static int m54b0(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b1 */
    public static final void m55b1(C4215g c4215g) {
        c4215g.getClass();
        if (AbstractC4211c.m8477c()) {
            C1015m c1015mM402L = c4215g.f13833C;
            if (c1015mM402L == null || c4215g.f13858z != 0.0f || c4215g.f13831A != 1.0f || c4215g.f13832B != 1.5f) {
                C0089b c0089bMo8482e = c4215g.mo8482e("ColorControls", "\n    uniform shader child;\n    uniform float in_brightness;\n    uniform float in_contrast;\n    uniform float in_saturation;\n\n    half4 main(float2 xy) {\n        half4 src = child.eval(xy);\n        half a = src.a;\n        if (a < 0.001) return src;\n\n        half3 c = src.rgb / a;\n\n        if (in_brightness != 0.0) {\n            c = pow(c, half3(2.2));\n            if (in_brightness > 0.0) {\n                c = mix(c, half3(1.0), half(in_brightness));\n            } else {\n                c = c * half(1.0 + in_brightness);\n            }\n            c = pow(c, half3(0.45454545));\n        }\n\n        if (in_contrast != 1.0) {\n            c = (c - 0.5) * half(in_contrast) + 0.5;\n        }\n\n        if (in_saturation != 1.0) {\n            half lum = dot(c, half3(0.2126, 0.7152, 0.0722));\n            c = mix(half3(lum), c, half(in_saturation));\n        }\n\n        c = clamp(c, half3(0.0), half3(1.0));\n        return half4(c * a, a);\n    }\n");
                c0089bMo8482e.getClass();
                c0089bMo8482e.f255a.setFloatUniform("in_brightness", 0.0f);
                c0089bMo8482e.f255a.setFloatUniform("in_contrast", 1.0f);
                c0089bMo8482e.f255a.setFloatUniform("in_saturation", 1.5f);
                c1015mM402L = AbstractC0063p.m402L(c0089bMo8482e, "child");
                c4215g.f13858z = 0.0f;
                c4215g.f13831A = 1.0f;
                c4215g.f13832B = 1.5f;
                c4215g.f13833C = c1015mM402L;
            }
            c4215g.f13844l = AbstractC0063p.m416i(c4215g.f13844l, c1015mM402L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m56c(InterfaceC5853o interfaceC5853o, C3641z c3641z, InterfaceC3268x0 interfaceC3268x0, InterfaceC3217g interfaceC3217g, C5844f c5844f, C2638p c2638p, boolean z9, InterfaceC2185k1 interfaceC2185k1, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, int i9) {
        C3641z c3641z2;
        InterfaceC3268x0 interfaceC3268x02;
        C5844f c5844f2;
        C2638p c2638p2;
        boolean z10;
        InterfaceC2185k1 interfaceC2185k12;
        C3641z c3641zM7603a;
        int i10;
        C5844f c5844f3;
        InterfaceC3268x0 interfaceC3268x03;
        boolean z11;
        C2638p c2638p3;
        InterfaceC2185k1 interfaceC2185k1M5423a;
        c1836h0.m4527b0(-1884325601);
        int i11 = i9 | 46861712 | (c1836h0.m4538h(interfaceC1231l) ? 536870912 : 268435456);
        if (c1836h0.m4516S(i11 & 1, (306783379 & i11) != 306783378)) {
            c1836h0.m4521X();
            if ((i9 & 1) == 0 || c1836h0.m4500B()) {
                c3641zM7603a = AbstractC3617b0.m7603a(c1836h0);
                float f3 = 0;
                C3272z0 c3272z0 = new C3272z0(f3, f3, f3, f3);
                C5844f c5844f4 = C5840b.f23770p;
                C1793u c1793uM3988a = AbstractC1460g1.m3988a(c1836h0);
                boolean zM4534f = c1836h0.m4534f(c1793uM3988a);
                Object objM4514P = c1836h0.m4514P();
                if (zM4534f || objM4514P == C1851l.f6155a) {
                    objM4514P = new C2638p(c1793uM3988a);
                    c1836h0.m4545k0(objM4514P);
                }
                i10 = i11 & (-238551153);
                c5844f3 = c5844f4;
                interfaceC3268x03 = c3272z0;
                z11 = true;
                c2638p3 = (C2638p) objM4514P;
                interfaceC2185k1M5423a = AbstractC2191m1.m5423a(c1836h0);
            } else {
                c1836h0.m4519V();
                i10 = i11 & (-238551153);
                c3641zM7603a = c3641z;
                interfaceC3268x03 = interfaceC3268x0;
                c5844f3 = c5844f;
                c2638p3 = c2638p;
                z11 = z9;
                interfaceC2185k1M5423a = interfaceC2185k1;
            }
            c1836h0.m4554q();
            AbstractC0018a.m237a(interfaceC5853o, c3641zM7603a, interfaceC3268x03, false, c2638p3, z11, interfaceC2185k1M5423a, null, null, c5844f3, interfaceC3217g, interfaceC1231l, c1836h0, 1600902, 432 | ((i10 >> 18) & 7168), 1792);
            C5844f c5844f5 = c5844f3;
            interfaceC2185k12 = interfaceC2185k1M5423a;
            c5844f2 = c5844f5;
            c3641z2 = c3641zM7603a;
            c2638p2 = c2638p3;
            z10 = z11;
            interfaceC3268x02 = interfaceC3268x03;
        } else {
            c1836h0.m4519V();
            c3641z2 = c3641z;
            interfaceC3268x02 = interfaceC3268x0;
            c5844f2 = c5844f;
            c2638p2 = c2638p;
            z10 = z9;
            interfaceC2185k12 = interfaceC2185k1;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C3616b(interfaceC5853o, c3641z2, interfaceC3268x02, interfaceC3217g, c5844f2, c2638p2, z10, interfaceC2185k12, interfaceC1231l, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static C4320p m57c0(InterfaceC4312h interfaceC4312h) {
        if (interfaceC4312h == null) {
            return null;
        }
        List listMo8643g = interfaceC4312h.mo8643g();
        if (listMo8643g.isEmpty()) {
            return null;
        }
        return (C4320p) listMo8643g.get(listMo8643g.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c1 */
    public static void m58c1(C4322r c4322r, C4305a c4305a, C4305a c4305a2, Consumer consumer) {
        consumer.accept(c4305a);
        if (c4305a == c4305a2) {
            return;
        }
        if (c4305a.f14354o.contains(c4305a2)) {
            consumer.accept(c4305a2);
            return;
        }
        BitSet bitSetM6D0 = m6D0(c4322r);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(c4305a);
        while (true) {
            C4305a c4305a3 = (C4305a) arrayDeque.peekLast();
            if (c4305a3 == null) {
                return;
            }
            Iterator it = c4305a3.f14354o.iterator();
            while (true) {
                if (it.hasNext()) {
                    C4305a c4305a4 = (C4305a) it.next();
                    if (c4305a4 == c4305a2) {
                        arrayDeque.removeFirst();
                        arrayDeque.addLast(c4305a4);
                        arrayDeque.forEach(consumer);
                        return;
                    } else {
                        int i9 = c4305a4.f14349j;
                        if (!bitSetM6D0.get(i9)) {
                            bitSetM6D0.set(i9);
                            arrayDeque.addLast(c4305a4);
                            break;
                        }
                    }
                } else {
                    arrayDeque.pollLast();
                    if (arrayDeque.isEmpty()) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m59d(float f3, float f10) {
        return (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static C4305a m60d0(C4305a c4305a) {
        List list = c4305a.f14354o;
        if (list.isEmpty()) {
            return null;
        }
        return (C4305a) list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d1 */
    public static void m61d1(C4322r c4322r, C4305a c4305a, Function function, Consumer consumer) {
        ArrayDeque arrayDeque = new ArrayDeque();
        BitSet bitSet = new BitSet(c4322r.f14425z.size());
        arrayDeque.addLast(c4305a);
        bitSet.set(c4305a.f14349j);
        while (true) {
            C4305a c4305a2 = (C4305a) arrayDeque.pollLast();
            if (c4305a2 == null) {
                c4305a2 = null;
            } else {
                List list = (List) function.apply(c4305a2);
                for (int size = list.size() - 1; size >= 0; size--) {
                    C4305a c4305a3 = (C4305a) list.get(size);
                    int i9 = c4305a3.f14349j;
                    boolean z9 = bitSet.get(i9);
                    bitSet.set(i9);
                    if (!z9) {
                        arrayDeque.addLast(c4305a3);
                    }
                }
            }
            if (c4305a2 == null) {
                return;
            } else {
                consumer.accept(c4305a2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static C4305a m62e0(C4305a c4305a) {
        if (!c4305a.f14351l.isEmpty() || c4305a.f14352m.size() > 1) {
            return null;
        }
        List list = c4305a.f14354o;
        if (list.size() != 1) {
            return null;
        }
        return (C4305a) list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m63f(C3904k0 c3904k0, AbstractC6036a abstractC6036a) {
        C1562z c1562z;
        EnumC5799a enumC5799a;
        int size;
        int i9;
        if (abstractC6036a instanceof C1562z) {
            c1562z = (C1562z) abstractC6036a;
            int i10 = c1562z.f5212i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1562z.f5212i = i10 - Integer.MIN_VALUE;
            } else {
                c1562z = new C1562z(abstractC6036a);
            }
        }
        Object objM8102e = c1562z.f5211h;
        int i11 = c1562z.f5212i;
        if (i11 == 0) {
            AbstractC1089i.m2732I0(objM8102e);
            c1562z.f5210g = c3904k0;
            c1562z.f5212i = 1;
            objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, c1562z);
            enumC5799a = EnumC5799a.f23547g;
            if (objM8102e == enumC5799a) {
            }
            C3903k c3903k = (C3903k) objM8102e;
            ?? r12 = c3903k.f12800a;
            size = r12.size();
            i9 = 0;
            while (i9 < size) {
            }
            return c3903k;
        }
        if (i11 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c3904k0 = c1562z.f5210g;
        AbstractC1089i.m2732I0(objM8102e);
        C3903k c3903k2 = (C3903k) objM8102e;
        ?? r122 = c3903k2.f12800a;
        size = r122.size();
        i9 = 0;
        while (i9 < size) {
            if (AbstractC3913s.m8108a((C3914t) r122.get(i9))) {
                i9++;
            } else {
                c1562z.f5210g = c3904k0;
                c1562z.f5212i = 1;
                objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, c1562z);
                enumC5799a = EnumC5799a.f23547g;
                if (objM8102e == enumC5799a) {
                    return enumC5799a;
                }
                C3903k c3903k22 = (C3903k) objM8102e;
                ?? r1222 = c3903k22.f12800a;
                size = r1222.size();
                i9 = 0;
                while (i9 < size) {
                }
            }
        }
        return c3903k22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static C4320p m64f0(C4322r c4322r) {
        if (!c4322r.f14415p) {
            Iterator it = c4322r.f14425z.iterator();
            C4320p c4320p = null;
            while (it.hasNext()) {
                ArrayList arrayList = ((C4305a) it.next()).f14351l;
                int size = arrayList.size();
                if (size != 0) {
                    if (size <= 1 && c4320p == null) {
                        c4320p = (C4320p) arrayList.get(0);
                    }
                }
            }
            return c4320p;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m65g(p267s1.C3904k0 r6, p370yf.AbstractC6036a r7) {
        /*
            boolean r0 = r7 instanceof p001a0.C0001a
            if (r0 == 0) goto L13
            r0 = r7
            a0.a r0 = (p001a0.C0001a) r0
            int r1 = r0.f5i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5i = r1
            goto L18
        L13:
            a0.a r0 = new a0.a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4h
            int r1 = r0.f5i
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            s1.k0 r6 = r0.f3g
            p077f8.AbstractC1089i.m2732I0(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r6)
            r6 = 0
            return r6
        L2e:
            p077f8.AbstractC1089i.m2732I0(r7)
        L31:
            r0.f3g = r6
            r0.f5i = r2
            s1.l r7 = p267s1.EnumC3905l.f12813h
            java.lang.Object r7 = r6.m8102e(r7, r0)
            xf.a r1 = p352xf.EnumC5799a.f23547g
            if (r7 != r1) goto L40
            return r1
        L40:
            s1.k r7 = (p267s1.C3903k) r7
            int r1 = r7.f12803d
            java.lang.Object r7 = r7.f12800a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            s1.t r5 = (p267s1.C3914t) r5
            boolean r5 = p267s1.AbstractC3913s.m8108a(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0000a.m65g(s1.k0, yf.a):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static C4305a m66g0(C4322r c4322r, List list) {
        BitSet bitSetM6D0 = m6D0(c4322r);
        BitSet bitSetM6D02 = m6D0(c4322r);
        Iterator it = list.iterator();
        boolean z9 = true;
        while (it.hasNext()) {
            C4305a c4305a = (C4305a) it.next();
            bitSetM6D02.clear();
            bitSetM6D02.set(c4305a.f14349j);
            bitSetM6D02.or(c4305a.f14357r);
            if (z9) {
                bitSetM6D0.or(bitSetM6D02);
                z9 = false;
            } else {
                bitSetM6D0.and(bitSetM6D02);
            }
        }
        bitSetM6D0.clear(c4322r.f14403C.f14349j);
        if (!bitSetM6D0.isEmpty()) {
            C4305a c4305aM86r = m86r(c4322r, bitSetM6D0);
            if (c4305aM86r != null) {
                return c4305aM86r;
            }
            BitSet bitSetM6D03 = m6D0(c4322r);
            bitSetM6D03.set(c4322r.f14403C.f14349j);
            c4322r.f14406F.forEach(new C5783d(0, bitSetM6D03));
            if (!c4322r.f14405E.isEmpty()) {
                c4322r.f14405E.forEach(new C0305w(c4322r, 13, bitSetM6D03));
            }
            bitSetM6D0.andNot(bitSetM6D03);
            C4305a c4305aM86r2 = m86r(c4322r, bitSetM6D0);
            if (c4305aM86r2 != null) {
                return c4305aM86r2;
            }
            BitSet bitSetM6D04 = m6D0(c4322r);
            int size = c4322r.f14425z.size();
            while (true) {
                m21L(c4322r, bitSetM6D0, new C5783d(1, bitSetM6D04));
                bitSetM6D04.andNot(bitSetM6D03);
                int iCardinality = bitSetM6D04.cardinality();
                if (iCardinality == 1) {
                    return m86r(c4322r, bitSetM6D04);
                }
                if (iCardinality == 0) {
                    break;
                }
                int i9 = size - 1;
                if (size < 0) {
                    c4322r.m6383L("Path cross not found for " + String.valueOf(list) + ", limit reached: " + c4322r.f14425z.size());
                    return null;
                }
                bitSetM6D0.clear();
                bitSetM6D0.or(bitSetM6D04);
                bitSetM6D04.clear();
                size = i9;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static C4305a m67h0(C4322r c4322r, C4305a c4305a, C4305a c4305a2) {
        if (c4305a == c4305a2) {
            return c4305a;
        }
        if (c4305a == null || c4305a2 == null) {
            return null;
        }
        return m66g0(c4322r, Arrays.asList(c4305a, c4305a2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m68i(C3904k0 c3904k0, InterfaceC4647y0 interfaceC4647y0, C3903k c3903k, int i9, AbstractC6036a abstractC6036a) {
        C1507c0 c1507c0;
        long j3;
        C1424t c1424t;
        if (abstractC6036a instanceof C1507c0) {
            c1507c0 = (C1507c0) abstractC6036a;
            int i10 = c1507c0.f5016l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1507c0.f5016l = i10 - Integer.MIN_VALUE;
            } else {
                c1507c0 = new C1507c0(abstractC6036a);
            }
        }
        Object objM8101E = c1507c0.f5015k;
        int i11 = c1507c0.f5016l;
        C3967n c3967n = C3967n.f12976a;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        try {
            if (i11 == 0) {
                AbstractC1089i.m2732I0(objM8101E);
                C3914t c3914t = (C3914t) AbstractC4166m.m8422t1(c3903k.f12800a);
                j3 = c3914t.f12834a;
                interfaceC4647y0.mo4009a(c3914t.f12836c, i9 > 2 ? C1556w.f5193f : C1556w.f5192e);
                c1424t = new C1424t();
                c1424t.f4737g = 9205357640488583168L;
                long jMo10226b = c3904k0.m8099B().mo10226b();
                C1510d0 c1510d0 = new C1510d0(j3, c1424t, null);
                c1507c0.f5011g = c3904k0;
                c1507c0.f5012h = interfaceC4647y0;
                c1507c0.f5013i = c1424t;
                c1507c0.f5014j = j3;
                c1507c0.f5016l = 1;
                objM8101E = c3904k0.m8101E(jMo10226b, c1510d0, c1507c0);
                if (objM8101E == enumC5799a) {
                }
                return enumC5799a;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC4647y0 = c1507c0.f5012h;
                c3904k0 = c1507c0.f5011g;
                AbstractC1089i.m2732I0(objM8101E);
                if (!((Boolean) objM8101E).booleanValue()) {
                    interfaceC4647y0.onCancel();
                    return c3967n;
                }
                ?? r11 = c3904k0.f12811l.f12826z.f12800a;
                int size = r11.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C3914t c3914t2 = (C3914t) r11.get(i12);
                    if (AbstractC3913s.m8110c(c3914t2)) {
                        c3914t2.m8118a();
                    }
                }
                interfaceC4647y0.mo4010b();
                return c3967n;
            }
            long j4 = c1507c0.f5014j;
            c1424t = c1507c0.f5013i;
            InterfaceC4647y0 interfaceC4647y02 = c1507c0.f5012h;
            C3904k0 c3904k02 = c1507c0.f5011g;
            try {
                AbstractC1089i.m2732I0(objM8101E);
                j3 = j4;
                interfaceC4647y0 = interfaceC4647y02;
                c3904k0 = c3904k02;
            } catch (CancellationException e6) {
                e = e6;
                interfaceC4647y0 = interfaceC4647y02;
                interfaceC4647y0.onCancel();
                throw e;
            }
            EnumC1527j enumC1527j = (EnumC1527j) objM8101E;
            if (enumC1527j == null) {
                enumC1527j = EnumC1527j.f5097i;
            }
            if (enumC1527j == EnumC1527j.f5098j) {
                interfaceC4647y0.onCancel();
                return c3967n;
            }
            if (enumC1527j == EnumC1527j.f5095g) {
                interfaceC4647y0.mo4010b();
                return c3967n;
            }
            if (enumC1527j == EnumC1527j.f5096h) {
                interfaceC4647y0.mo4013e(c1424t.f4737g);
            }
            C1560y c1560y = new C1560y(interfaceC4647y0, 1);
            c1507c0.f5011g = c3904k0;
            c1507c0.f5012h = interfaceC4647y0;
            c1507c0.f5013i = null;
            c1507c0.f5016l = 2;
            objM8101E = AbstractC2615j0.m6067d(c3904k0, j3, c1560y, c1507c0);
        } catch (CancellationException e7) {
            e = e7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static C4305a m69i0(C4322r c4322r, C4305a c4305a, C4305a c4305a2) {
        C4305a c4305a3;
        List list = c4305a.f14352m;
        C6141c c6141c = new C6141c(c4322r);
        list.forEach(new C0076g(c6141c, 6));
        int i9 = c4305a2.f14349j;
        BitSet bitSet = c6141c.f24738h;
        if (bitSet.get(i9)) {
            return c4305a2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        BitSet bitSet2 = new BitSet(c4322r.f14425z.size());
        arrayDeque.addLast(c4305a2);
        bitSet2.set(c4305a2.f14349j);
        do {
            c4305a3 = (C4305a) arrayDeque.pollLast();
            if (c4305a3 == null) {
                c4305a3 = null;
            } else {
                List list2 = c4305a3.f14354o;
                for (int size = list2.size() - 1; size >= 0; size--) {
                    C4305a c4305a4 = (C4305a) list2.get(size);
                    int i10 = c4305a4.f14349j;
                    boolean z9 = bitSet2.get(i10);
                    bitSet2.set(i10);
                    if (!z9) {
                        arrayDeque.addLast(c4305a4);
                    }
                }
            }
            if (c4305a3 == null) {
                return null;
            }
        } while (!bitSet.get(c4305a3.f14349j));
        return c4305a3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m70j(HashSet hashSet, C4305a c4305a, C4305a c4305a2) {
        hashSet.add(c4305a);
        for (C4305a c4305a3 : c4305a.f14352m) {
            if (c4305a3 != c4305a2 && !hashSet.contains(c4305a3)) {
                m70j(hashSet, c4305a3, c4305a2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static C4305a m71j0(C4305a c4305a) {
        C4305a c4305aM39U = m39U(c4305a.f14352m, EnumC2824a.f9115A);
        if (c4305aM39U != null) {
            return c4305aM39U;
        }
        C0086a.m452k("Can't find top splitter block for handler:".concat(String.valueOf(c4305a)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static ArrayList m72k(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4163j(objArr, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static C4305a m73k0(C0075f c0075f, C4322r c4322r) {
        C4305a c4305a = c0075f.f234c;
        C4305a c4305aM71j0 = m71j0(c4305a);
        List list = c0075f.f238g.f244h;
        ArrayList arrayList = new ArrayList(m84q(c4322r, c4305a.f14357r));
        BitSet bitSetM6D0 = m6D0(c4322r);
        while (!arrayList.isEmpty()) {
            C4305a c4305a2 = (C4305a) arrayList.remove(0);
            if (!bitSetM6D0.get(c4305a2.f14349j)) {
                bitSetM6D0.set(c4305a2.f14349j);
                for (C4305a c4305a3 : c4305a2.f14352m) {
                    if (!list.stream().anyMatch(new C0562o(c4305a3, 4)) && m89s0(c4305aM71j0, c4305a3) && c4305a2 != c4322r.f14403C) {
                        return c4305a2;
                    }
                }
                arrayList.addAll(m84q(c4322r, c4305a2.f14357r));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: l */
    public static void m74l(File file, String str) throws IOException {
        File file2 = new File(file.getParentFile(), AbstractC0921a.m2251n(".", file.getName(), ".agent.tmp"));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            try {
                Os.rename(file2.getAbsolutePath(), file.getAbsolutePath());
            } catch (Throwable th2) {
                if (file2.renameTo(file)) {
                    return;
                }
                file2.delete();
                throw new IllegalStateException(AbstractC0921a.m2251n("写入 ", file.getName(), " 失败"), th2);
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static boolean m75l0(List list) {
        if (AbstractC5798s.m10514h(list)) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C4305a) it.next()).f14351l.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m76m(C3904k0 c3904k0, EnumC3905l enumC3905l, AbstractC6036a abstractC6036a) {
        C2659u0 c2659u0;
        EnumC5799a enumC5799a;
        int size;
        int i9;
        if (abstractC6036a instanceof C2659u0) {
            c2659u0 = (C2659u0) abstractC6036a;
            int i10 = c2659u0.f8685j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2659u0.f8685j = i10 - Integer.MIN_VALUE;
            } else {
                c2659u0 = new C2659u0(abstractC6036a);
            }
        }
        Object objM8102e = c2659u0.f8684i;
        int i11 = c2659u0.f8685j;
        if (i11 == 0) {
            AbstractC1089i.m2732I0(objM8102e);
            ?? r92 = c3904k0.f12811l.f12826z.f12800a;
            int size2 = r92.size();
            for (int i12 = 0; i12 < size2; i12++) {
                if (((C3914t) r92.get(i12)).f12837d) {
                    c2659u0.f8682g = c3904k0;
                    c2659u0.f8683h = enumC3905l;
                    c2659u0.f8685j = 1;
                    objM8102e = c3904k0.m8102e(enumC3905l, c2659u0);
                    enumC5799a = EnumC5799a.f23547g;
                    if (objM8102e == enumC5799a) {
                    }
                    ?? r93 = ((C3903k) objM8102e).f12800a;
                    size = r93.size();
                    i9 = 0;
                    while (i9 < size) {
                    }
                    return C3967n.f12976a;
                }
            }
            return C3967n.f12976a;
        }
        if (i11 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        EnumC3905l enumC3905l2 = c2659u0.f8683h;
        C3904k0 c3904k02 = c2659u0.f8682g;
        AbstractC1089i.m2732I0(objM8102e);
        enumC3905l = enumC3905l2;
        c3904k0 = c3904k02;
        ?? r932 = ((C3903k) objM8102e).f12800a;
        size = r932.size();
        i9 = 0;
        while (i9 < size) {
            if (((C3914t) r932.get(i9)).f12837d) {
                c2659u0.f8682g = c3904k0;
                c2659u0.f8683h = enumC3905l;
                c2659u0.f8685j = 1;
                objM8102e = c3904k0.m8102e(enumC3905l, c2659u0);
                enumC5799a = EnumC5799a.f23547g;
                if (objM8102e == enumC5799a) {
                    return enumC5799a;
                }
                ?? r9322 = ((C3903k) objM8102e).f12800a;
                size = r9322.size();
                i9 = 0;
                while (i9 < size) {
                }
            } else {
                i9++;
            }
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public static boolean m77m0(C4305a c4305a, C4305a c4305a2) {
        if (c4305a == c4305a2 || c4305a2.f14355p.get(c4305a.f14349j) || c4305a.f14353n.contains(c4305a2)) {
            return true;
        }
        if (c4305a.f14352m.contains(c4305a2)) {
            return false;
        }
        return m42V0(c4305a, c4305a2, new BitSet(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final Object m78n(InterfaceC3918x interfaceC3918x, InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c) {
        Object objM8105k1 = ((C3906l0) interfaceC3918x).m8105k1(new C0750k(interfaceC5557c.getContext(), interfaceC1235p, (InterfaceC5557c) null), interfaceC5557c);
        return objM8105k1 == EnumC5799a.f23547g ? objM8105k1 : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static boolean m79n0(C4305a c4305a, C4305a c4305a2) {
        if (c4305a.f14353n.size() == 1 && c4305a2.f14353n.size() == 1 && ((C4305a) c4305a.f14353n.get(0)).equals(c4305a2.f14353n.get(0))) {
            ArrayList arrayList = c4305a.f14351l;
            ArrayList arrayList2 = c4305a2.f14351l;
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    C4320p c4320p = (C4320p) arrayList.get(i9);
                    C4320p c4320p2 = (C4320p) arrayList2.get(i9);
                    if (c4320p != c4320p2) {
                        if (c4320p.mo7168Y(c4320p2) && Objects.equals(c4320p.f14398m, c4320p2.f14398m)) {
                            C3514r c3514r = c4320p.f14397l;
                            C3514r c3514r2 = c4320p2.f14397l;
                            if (c3514r == null || c3514r2 == null) {
                                if (c3514r == c3514r2) {
                                }
                            } else if (c3514r.f11439l == c3514r2.f11439l) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m80o(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static boolean m81o0(C4305a c4305a, C4305a c4305a2) {
        C4305a c4305aM19K;
        C4305a c4305aM19K2;
        if (c4305a == c4305a2) {
            return true;
        }
        if (c4305a == null || c4305a2 == null) {
            return false;
        }
        return m83p0(c4305a, c4305a2) || (c4305aM19K = m19K(c4305a)) == (c4305aM19K2 = m19K(c4305a2)) || m83p0(c4305aM19K, c4305aM19K2) || m79n0(c4305a, c4305a2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static int m82p(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i9 = 0;
        if (size < 0) {
            C2104o.m5294t(AbstractC0921a.m2248k(0, size, "fromIndex (", ") is greater than toIndex (", ")."));
            return 0;
        }
        if (size > size2) {
            C3193a.m6820i(AbstractC0921a.m2248k(size, size2, "toIndex (", ") is greater than size (", ")."));
            return 0;
        }
        int i10 = size - 1;
        while (i9 <= i10) {
            int i11 = (i9 + i10) >>> 1;
            int iM249m = AbstractC0018a.m249m((Comparable) arrayList.get(i11), comparable);
            if (iM249m < 0) {
                i9 = i11 + 1;
            } else {
                if (iM249m <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i9 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static boolean m83p0(C4305a c4305a, C4305a c4305a2) {
        C2829f c2829f = c4305a.f9217g;
        EnumC2824a enumC2824a = EnumC2824a.f9161n;
        if (c2829f.mo6235a(enumC2824a) && c4305a2.f9217g.mo6235a(enumC2824a)) {
            ArrayList arrayList = c4305a.f14351l;
            ArrayList arrayList2 = c4305a2.f14351l;
            if (arrayList.size() == 1 && arrayList2.size() == 1) {
                C4320p c4320p = (C4320p) arrayList.get(0);
                C4320p c4320p2 = (C4320p) arrayList2.get(0);
                if (c4320p.f14398m.size() == c4320p2.f14398m.size()) {
                    if (c4320p.f14398m.size() != 0) {
                        AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
                        AbstractC3508l abstractC3508lMo7179S2 = c4320p2.mo7179S(0);
                        if (!((abstractC3508lMo7179S.m7377K() && abstractC3508lMo7179S2.m7377K()) ? abstractC3508lMo7179S.equals(abstractC3508lMo7179S2) : false)) {
                            if (c4320p.f9752i == c4320p2.f9752i) {
                                return abstractC3508lMo7179S.equals(abstractC3508lMo7179S2);
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static List m84q(C4322r c4322r, BitSet bitSet) {
        if (bitSet == null || bitSet == C5786g.f23528g) {
            return Collections.EMPTY_LIST;
        }
        int iCardinality = bitSet.cardinality();
        if (iCardinality == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iCardinality);
        int i9 = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i9);
            if (iNextSetBit < 0) {
                return arrayList;
            }
            arrayList.add((C4305a) c4322r.f14425z.get(iNextSetBit));
            i9 = iNextSetBit + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static boolean m85q0(C4305a c4305a) {
        C2829f c2829f = c4305a.f9217g;
        C2825b c2825b = C2825b.f9178E;
        if (!c2829f.mo6236b(c2825b)) {
            if (!c4305a.f9217g.mo6235a(EnumC2824a.f9116B)) {
                if (!c4305a.f9217g.mo6235a(EnumC2824a.f9168u)) {
                    if (c4305a.f9217g.mo6235a(EnumC2824a.f9159m)) {
                        List list = c4305a.f14353n;
                        if (list.size() != 1 || !((C4305a) list.get(0)).f9217g.mo6236b(c2825b)) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static C4305a m86r(C4322r c4322r, BitSet bitSet) {
        if (bitSet.cardinality() != 1) {
            return null;
        }
        return (C4305a) c4322r.f14425z.get(bitSet.nextSetBit(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public static boolean m87r0(C4305a c4305a) {
        if (c4305a != null) {
            if (c4305a.f9217g.mo6235a(EnumC2824a.f9155k)) {
                List list = c4305a.f14352m;
                if (list.size() == 1) {
                    C4305a c4305a2 = (C4305a) list.get(0);
                    if (c4305a2.f9217g.mo6235a(EnumC2824a.f9157l)) {
                        for (C2988t c2988t : c4305a2.f9217g.mo6238d(C2825b.f9211z)) {
                            if (c2988t.f9755a.equals(c4305a) && c2988t.f9756b.equals(c4305a2)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m88s(C4305a c4305a, C4320p c4320p) {
        Iterator it = c4305a.f14351l.iterator();
        while (it.hasNext()) {
            if (((C4320p) it.next()) == c4320p) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static boolean m89s0(C4305a c4305a, C4305a c4305a2) {
        if (c4305a == c4305a2 || c4305a2.f14355p.get(c4305a.f14349j) || c4305a.f14354o.contains(c4305a2)) {
            return true;
        }
        if (c4305a.f14352m.contains(c4305a2)) {
            return false;
        }
        return m42V0(c4305a, c4305a2, new BitSet(), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static C4329c m90t(C4329c c4329c) {
        c4329c.m8735g();
        c4329c.f14470i = true;
        return c4329c.f14469h > 0 ? c4329c : C4329c.f14467j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public static boolean m91t0(int i9) {
        int type = Character.getType(i9);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static List m92u(C4305a c4305a) {
        if (c4305a == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (c4305a.f14354o.size() >= 2) {
            return Collections.EMPTY_LIST;
        }
        arrayList.add(c4305a);
        for (C4305a c4305aM60d0 = m60d0(c4305a); c4305aM60d0 != null && c4305aM60d0.f14354o.size() < 2 && c4305aM60d0.f14352m.size() == 1; c4305aM60d0 = m60d0(c4305aM60d0)) {
            arrayList.add(c4305aM60d0);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static boolean m93u0(String str) {
        Object c3959f;
        try {
            c3959f = new SimpleDateFormat(m10F0(str), Locale.CHINA);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return !(c3959f instanceof C3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static boolean m94v(InterfaceC4312h interfaceC4312h, EnumC3400k enumC3400k) {
        C4320p c4320pM57c0 = m57c0(interfaceC4312h);
        return c4320pM57c0 != null && c4320pM57c0.f14396k == enumC3400k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static boolean m95v0(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m96w(int i9) {
        if (2 > i9 || i9 >= 37) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "radix ", " was not in valid range ");
            sbM2257t.append(new C2564d(2, 36, 1));
            throw new IllegalArgumentException(sbM2257t.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static final void m97w0(final C4215g c4215g, final float f3, final float f10, final boolean z9, final float f11) {
        c4215g.getClass();
        if (AbstractC4211c.m8477c() && f3 > 0.0f && f10 > 0.0f) {
            if (c4215g.f13843k < f10) {
                c4215g.f13843k = f10;
            }
            InterfaceC1026r0 interfaceC1026r0 = (InterfaceC1026r0) ((InterfaceC1220a) c4215g.f13838H.f13864B.f15084c).invoke();
            float[] fArr = null;
            C4359d c4359d = interfaceC1026r0 instanceof C4359d ? (C4359d) interfaceC1026r0 : null;
            if (c4359d != null) {
                InterfaceC4356a interfaceC4356a = c4359d.f14556d;
                InterfaceC4356a interfaceC4356a2 = c4359d.f14555c;
                InterfaceC4356a interfaceC4356a3 = c4359d.f14554b;
                InterfaceC4356a interfaceC4356a4 = c4359d.f14553a;
                float fM2055b = C0810e.m2055b(c4215g.f13841i) / 2.0f;
                boolean z10 = c4215g.f13842j == EnumC4243m.f13919g;
                long j3 = c4215g.f13841i;
                float fMo8799a = z10 ? interfaceC4356a4.mo8799a(j3, c4215g) : interfaceC4356a3.mo8799a(j3, c4215g);
                long j4 = c4215g.f13841i;
                float fMo8799a2 = z10 ? interfaceC4356a3.mo8799a(j4, c4215g) : interfaceC4356a4.mo8799a(j4, c4215g);
                long j5 = c4215g.f13841i;
                float fMo8799a3 = z10 ? interfaceC4356a2.mo8799a(j5, c4215g) : interfaceC4356a.mo8799a(j5, c4215g);
                long j10 = c4215g.f13841i;
                float fMo8799a4 = z10 ? interfaceC4356a.mo8799a(j10, c4215g) : interfaceC4356a2.mo8799a(j10, c4215g);
                if (fMo8799a > fM2055b) {
                    fMo8799a = fM2055b;
                }
                if (fMo8799a2 > fM2055b) {
                    fMo8799a2 = fM2055b;
                }
                if (fMo8799a3 > fM2055b) {
                    fMo8799a3 = fM2055b;
                }
                if (fMo8799a4 <= fM2055b) {
                    fM2055b = fMo8799a4;
                }
                fArr = new float[]{fMo8799a, fMo8799a2, fMo8799a3, fM2055b};
            }
            if (fArr != null) {
                final boolean z11 = f11 > 0.0f;
                String str = z11 ? "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\nuniform float chromaticAberration;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n\n    float2 refractedCoord = coord + d * grad;\n    float dispersionIntensity = chromaticAberration * ((centeredCoord.x * centeredCoord.y) / (halfSize.x * halfSize.y));\n    float2 dispersedCoord = d * grad * dispersionIntensity;\n\n    half4 color = half4(0.0);\n\n    half4 red = content.eval(refractedCoord + dispersedCoord);\n    color.r += red.r / 3.5;\n    color.a += red.a / 7.0;\n\n    half4 orange = content.eval(refractedCoord + dispersedCoord * (2.0 / 3.0));\n    color.r += orange.r / 3.5;\n    color.g += orange.g / 7.0;\n    color.a += orange.a / 7.0;\n\n    half4 yellow = content.eval(refractedCoord + dispersedCoord * (1.0 / 3.0));\n    color.r += yellow.r / 3.5;\n    color.g += yellow.g / 3.5;\n    color.a += yellow.a / 7.0;\n\n    half4 green = content.eval(refractedCoord);\n    color.g += green.g / 3.5;\n    color.a += green.a / 7.0;\n\n    half4 cyan = content.eval(refractedCoord - dispersedCoord * (1.0 / 3.0));\n    color.g += cyan.g / 3.5;\n    color.b += cyan.b / 3.0;\n    color.a += cyan.a / 7.0;\n\n    half4 blue = content.eval(refractedCoord - dispersedCoord * (2.0 / 3.0));\n    color.b += blue.b / 3.0;\n    color.a += blue.a / 7.0;\n\n    half4 purple = content.eval(refractedCoord - dispersedCoord);\n    color.r += purple.r / 7.0;\n    color.b += purple.b / 3.0;\n    color.a += purple.a / 7.0;\n\n    return color;\n}\n" : "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n\n    float2 refractedCoord = coord + d * grad;\n    return content.eval(refractedCoord);\n}\n";
                String str2 = z11 ? "HchatLiquidGlassLensDispersion" : "HchatLiquidGlassLens";
                int i9 = c4215g.f13845m;
                final float f12 = i9 >= 1 ? i9 : 1;
                final float f13 = c4215g.f13843k / f12;
                final float[] fArr2 = fArr;
                InterfaceC1231l interfaceC1231l = new InterfaceC1231l() { // from class: wb.r4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1231l
                    public final Object invoke(Object obj) {
                        C0089b c0089b = (C0089b) obj;
                        c0089b.getClass();
                        C4215g c4215g2 = c4215g;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c4215g2.f13841i >> 32));
                        float f14 = f12;
                        c0089b.f255a.setFloatUniform("size", fIntBitsToFloat / f14, Float.intBitsToFloat((int) (c4215g2.f13841i & 4294967295L)) / f14);
                        float f15 = -f13;
                        c0089b.f255a.setFloatUniform("offset", f15, f15);
                        float[] fArr3 = fArr2;
                        int length = fArr3.length;
                        float[] fArr4 = new float[length];
                        for (int i10 = 0; i10 < length; i10++) {
                            fArr4[i10] = fArr3[i10] / f14;
                        }
                        c0089b.f255a.setFloatUniform("cornerRadii", fArr4);
                        c0089b.f255a.setFloatUniform("refractionHeight", f3 / f14);
                        c0089b.f255a.setFloatUniform("refractionAmount", (-f10) / f14);
                        c0089b.f255a.setFloatUniform("depthEffect", z9 ? 1.0f : 0.0f);
                        if (z11) {
                            c0089b.f255a.setFloatUniform("chromaticAberration", f11);
                        }
                        return C3967n.f12976a;
                    }
                };
                if (AbstractC4211c.m8477c()) {
                    C0089b c0089bMo8482e = c4215g.mo8482e(str2, str);
                    interfaceC1231l.invoke(c0089bMo8482e);
                    c4215g.f13844l = AbstractC0063p.m416i(c4215g.f13844l, AbstractC0063p.m402L(c0089bMo8482e, "content"));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m98x(int i9, int i10) {
        if (i9 > i10) {
            if (i10 == 0) {
                C0086a.m458q("Invalid value_arg value %d for an encoded_value. Expecting 0", new Object[]{Integer.valueOf(i9)});
            } else {
                C0086a.m458q("Invalid value_arg value %d for an encoded_value. Expecting 0..%d, inclusive", new Object[]{Integer.valueOf(i9), Integer.valueOf(i10)});
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static List m99x0(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static ArrayList m100y(C4322r c4322r, C4305a c4305a, boolean z9) {
        ArrayList arrayList = new ArrayList(c4322r.f14425z.size());
        m61d1(c4322r, c4305a, z9 ? new C2833a(26) : new C0073d(28), new C0294m0(3, arrayList));
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public static List m101y0(Object... objArr) {
        if (objArr.length <= 0) {
            return C4173t.f13710g;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m102z(C4305a c4305a, C4305a c4305a2, AbstractCollection abstractCollection, BitSet bitSet, boolean z9) {
        if (bitSet.get(c4305a2.f14349j)) {
            return;
        }
        bitSet.set(c4305a2.f14349j);
        for (C4305a c4305a3 : z9 ? c4305a2.f14353n : c4305a2.f14354o) {
            if (c4305a3.f14355p.get(c4305a.f14349j)) {
                abstractCollection.add(c4305a3);
                m102z(c4305a, c4305a3, abstractCollection, bitSet, z9);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static ArrayList m103z0(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public abstract Typeface mo104D(Context context, C0823d[] c0823dArr);

    @Override // p312v5.InterfaceC4479b
    /* JADX INFO: renamed from: a */
    public void mo105a() {
    }
}
