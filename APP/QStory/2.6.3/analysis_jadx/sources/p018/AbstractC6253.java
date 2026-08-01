package p018;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import androidx.appcompat.app.AbstractC0080;
import androidx.appcompat.widget.C0137;
import androidx.compose.runtime.C1322;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.runtime.tooling.C1294;
import androidx.compose.runtime.tooling.C1296;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.colorspace.C1489;
import androidx.core.os.AbstractC2179;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2905;
import com.kongzue.dialogx.util.C3764;
import io.ktor.http.cio.C3958;
import io.ktor.util.C4211;
import io.ktor.utils.io.jvm.javaio.C4222;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4606;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.storage.C4840;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.InterfaceC4846;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4896;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.C4867;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4880;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import kotlin.reflect.jvm.internal.impl.types.C4898;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4851;
import kotlin.text.AbstractC5132;
import kotlin.text.AbstractC5139;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.io.C5476;
import lin.xposed.hook.javaplugin.C5554;
import okhttp3.Protocol;
import p049.AbstractC6530;
import p052.InterfaceC6543;
import p057.AbstractC6854;
import p057.InterfaceC6851;
import p061.AbstractC6859;
import p062.AbstractC6860;
import p069.C6895;
import p069.C6897;
import p069.InterfaceC6896;
import p087.AbstractC7124;
import p087.AbstractC7144;
import p089.C7182;
import p089.InterfaceC7184;
import p095.C7207;
import p095.ExecutorC7208;
import p105.AbstractC7303;
import p105.C7301;
import p105.C7305;
import p197.InterfaceC7846;
import p263.AbstractC8256;
import p263.C8255;
import p305.C8620;
import p344.C8825;
import p344.C8829;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6253 implements InterfaceC7846 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static AbstractC4916 m11735(AbstractC4916 abstractC4916) {
        int i = 1;
        if (!(abstractC4916 instanceof C4898)) {
            return new C4867(abstractC4916, i);
        }
        C4898 c4898 = (C4898) abstractC4916;
        InterfaceC4463[] interfaceC4463Arr = c4898.f14221;
        AbstractC4870[] abstractC4870Arr = c4898.f14220;
        abstractC4870Arr.getClass();
        interfaceC4463Arr.getClass();
        int iMin = Math.min(abstractC4870Arr.length, interfaceC4463Arr.length);
        ArrayList<Pair> arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(new Pair(abstractC4870Arr[i2], interfaceC4463Arr[i2]));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        for (Pair pair : arrayList) {
            arrayList2.add(m11755((AbstractC4870) pair.getFirst(), (InterfaceC4463) pair.getSecond()));
        }
        return new C4898(interfaceC4463Arr, (AbstractC4870[]) arrayList2.toArray(new AbstractC4870[0]), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (kotlin.text.AbstractC5139.m10130(r1.f22416, r7) != false) goto L21;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p236.C8125 m11736(p236.C8125 r6, java.nio.charset.Charset r7) {
        /*
            r6.getClass()
            r7.getClass()
            java.lang.String r7 = r7.name()
            r7.getClass()
            java.lang.Object r0 = r6.f232
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.lang.String r2 = "charset"
            if (r1 == 0) goto L5c
            r3 = 1
            if (r1 == r3) goto L44
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L23
            goto L5c
        L23:
            java.util.Iterator r1 = r0.iterator()
        L27:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r1.next()
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏 r3 = (p236.C8120) r3
            java.lang.String r4 = r3.f22417
            boolean r4 = kotlin.text.AbstractC5139.m10130(r4, r2)
            if (r4 == 0) goto L27
            java.lang.String r3 = r3.f22416
            boolean r3 = kotlin.text.AbstractC5139.m10130(r3, r7)
            if (r3 == 0) goto L27
            goto L5b
        L44:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏 r1 = (p236.C8120) r1
            java.lang.String r3 = r1.f22417
            boolean r3 = kotlin.text.AbstractC5139.m10130(r3, r2)
            if (r3 == 0) goto L5c
            java.lang.String r1 = r1.f22416
            boolean r1 = kotlin.text.AbstractC5139.m10130(r1, r7)
            if (r1 == 0) goto L5c
        L5b:
            return r6
        L5c:
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r1 = new 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰
            java.lang.String r3 = r6.f22426
            java.lang.String r4 = r6.f22425
            java.lang.Object r6 = r6.f231
            java.lang.String r6 = (java.lang.String) r6
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏 r5 = new 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏
            r5.<init>(r2, r7)
            java.util.ArrayList r7 = kotlin.collections.AbstractC4344.m8794(r0, r5)
            r1.<init>(r3, r4, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p018.AbstractC6253.m11736(飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰, java.nio.charset.Charset):飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final boolean m11737(Throwable th, InterfaceC6543 interfaceC6543) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = AbstractC6859.f18300;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = AbstractC6860.f18301;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = EmptyList.INSTANCE;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            C1296 c1296 = (C1296) interfaceC6543.invoke();
            if (c1296 != null) {
                boolean z2 = c1296.f3784;
                List list = c1296.f3785;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1294) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                c1296.getClass();
                diagnosticComposeException = new DiagnosticComposeException(c1296);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            AbstractC5187.m10216(th, diagnosticComposeException);
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static C4222 m11738(InputStream inputStream) {
        C7207 c7207 = AbstractC5395.f15030;
        ExecutorC7208 executorC7208 = ExecutorC7208.f19225;
        C3958 c3958 = AbstractC6854.f18295;
        inputStream.getClass();
        executorC7208.getClass();
        c3958.getClass();
        return new C4222(new C5476(inputStream), executorC7208);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Handler m11739(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC2179.m3980(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C5925.m11313(cause);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long[] m11740(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Charset m11741(AbstractC0080 abstractC0080) {
        abstractC0080.getClass();
        String strM309 = abstractC0080.m309("charset");
        if (strM309 == null) {
            return null;
        }
        try {
            Charset charset = AbstractC5132.f14688;
            Charset charsetForName = Charset.forName(strM309);
            charsetForName.getClass();
            return charsetForName;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m11742(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7305 m11743(AbstractC4882 abstractC4882) {
        Variance varianceM9858;
        C7301 c7301;
        abstractC4882.getClass();
        if (abstractC4882.mo9772() instanceof AbstractC4896) {
            C7305 c7305M11743 = m11743(AbstractC4893.m9826(abstractC4882));
            C7305 c7305M117432 = m11743(AbstractC4893.m9807(abstractC4882));
            return new C7305(AbstractC4893.m9824(AbstractC4893.m9809(AbstractC4893.m9826((AbstractC4882) c7305M11743.f19448), AbstractC4893.m9807((AbstractC4882) c7305M117432.f19448)), abstractC4882), AbstractC4893.m9824(AbstractC4893.m9809(AbstractC4893.m9826((AbstractC4882) c7305M11743.f19447), AbstractC4893.m9807((AbstractC4882) c7305M117432.f19447)), abstractC4882));
        }
        InterfaceC4873 interfaceC4873Mo9722 = abstractC4882.mo9722();
        if (abstractC4882.mo9722() instanceof InterfaceC6896) {
            interfaceC4873Mo9722.getClass();
            AbstractC4870 abstractC4870Mo9720 = ((InterfaceC6896) interfaceC4873Mo9722).mo9720();
            AbstractC4882 abstractC4882Mo9741 = abstractC4870Mo9720.mo9741();
            abstractC4882Mo9741.getClass();
            AbstractC4882 abstractC4882M9849 = AbstractC4917.m9849(abstractC4882Mo9741, abstractC4882.mo9725());
            abstractC4882M9849.getClass();
            int i = AbstractC7303.f19445[abstractC4870Mo9720.mo9742().ordinal()];
            if (i == 2) {
                return new C7305(abstractC4882M9849, AbstractC2905.m6317(abstractC4882).m12033());
            }
            if (i != 3) {
                C5554.m10884(abstractC4870Mo9720, "Only nontrivial projections should have been captured, not: ");
                return null;
            }
            AbstractC4882 abstractC4882M98492 = AbstractC4917.m9849(AbstractC2905.m6317(abstractC4882).m12031(), abstractC4882.mo9725());
            abstractC4882M98492.getClass();
            return new C7305(abstractC4882M98492, abstractC4882M9849);
        }
        if (abstractC4882.mo9726().isEmpty() || abstractC4882.mo9726().size() != interfaceC4873Mo9722.getParameters().size()) {
            return new C7305(abstractC4882, abstractC4882);
        }
        ArrayList<C7301> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listMo9726 = abstractC4882.mo9726();
        List parameters = interfaceC4873Mo9722.getParameters();
        parameters.getClass();
        Iterator it = AbstractC4344.m8821(listMo9726, parameters).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    for (C7301 c73012 : arrayList) {
                        c73012.getClass();
                        if (!InterfaceC4851.f14133.m9598(c73012.f19443, c73012.f19442)) {
                            break;
                        }
                    }
                    z = false;
                }
                return new C7305(z ? AbstractC2905.m6317(abstractC4882).m12031() : m11748(abstractC4882, arrayList), m11748(abstractC4882, arrayList2));
            }
            Pair pair = (Pair) it.next();
            AbstractC4870 abstractC4870 = (AbstractC4870) pair.component1();
            InterfaceC4463 interfaceC4463 = (InterfaceC4463) pair.component2();
            interfaceC4463.getClass();
            Variance varianceMo9003 = interfaceC4463.mo9003();
            if (varianceMo9003 == null) {
                C4919.m9859(35);
                throw null;
            }
            if (abstractC4870 == null) {
                C4919.m9859(36);
                throw null;
            }
            C4919 c4919 = C4919.f14248;
            if (abstractC4870.mo9740()) {
                varianceM9858 = Variance.OUT_VARIANCE;
                if (varianceM9858 == null) {
                    C4919.m9859(37);
                    throw null;
                }
            } else {
                varianceM9858 = C4919.m9858(varianceMo9003, abstractC4870.mo9742());
            }
            int i2 = AbstractC7303.f19445[varianceM9858.ordinal()];
            if (i2 == 1) {
                AbstractC4882 abstractC4882Mo97412 = abstractC4870.mo9741();
                abstractC4882Mo97412.getClass();
                AbstractC4882 abstractC4882Mo97413 = abstractC4870.mo9741();
                abstractC4882Mo97413.getClass();
                c7301 = new C7301(interfaceC4463, abstractC4882Mo97412, abstractC4882Mo97413);
            } else if (i2 == 2) {
                AbstractC4882 abstractC4882Mo97414 = abstractC4870.mo9741();
                abstractC4882Mo97414.getClass();
                c7301 = new C7301(interfaceC4463, abstractC4882Mo97414, AbstractC4773.m9499(interfaceC4463).m12033());
            } else {
                if (i2 != 3) {
                    C4211.m8611();
                    return null;
                }
                AbstractC4878 abstractC4878M12031 = AbstractC4773.m9499(interfaceC4463).m12031();
                AbstractC4882 abstractC4882Mo97415 = abstractC4870.mo9741();
                abstractC4882Mo97415.getClass();
                c7301 = new C7301(interfaceC4463, abstractC4878M12031, abstractC4882Mo97415);
            }
            if (abstractC4870.mo9740()) {
                arrayList.add(c7301);
                arrayList2.add(c7301);
            } else {
                C7305 c7305M117433 = m11743(c7301.f19443);
                AbstractC4882 abstractC48822 = (AbstractC4882) c7305M117433.f19448;
                AbstractC4882 abstractC48823 = (AbstractC4882) c7305M117433.f19447;
                C7305 c7305M117434 = m11743(c7301.f19442);
                AbstractC4882 abstractC48824 = (AbstractC4882) c7305M117434.f19448;
                AbstractC4882 abstractC48825 = (AbstractC4882) c7305M117434.f19447;
                InterfaceC4463 interfaceC44632 = c7301.f19444;
                C7301 c73013 = new C7301(interfaceC44632, abstractC48823, abstractC48824);
                C7301 c73014 = new C7301(interfaceC44632, abstractC48822, abstractC48825);
                arrayList.add(c73013);
                arrayList2.add(c73014);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Class m11744(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return m11744(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object objM8825 = AbstractC4347.m8825(upperBounds);
            objM8825.getClass();
            return m11744((Type) objM8825);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return m11744(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        sb.append(" has type ");
        C5925.m11310(AbstractC2442.m4575(AbstractC4396.f12975, type.getClass(), sb));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p089.InterfaceC7184 m11745(androidx.compose.runtime.internal.C1245 r7, java.lang.reflect.Type r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p018.AbstractC6253.m11745(androidx.compose.runtime.internal.飘花落叶言子楪世苏兰哲, java.lang.reflect.Type, boolean):飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static C4222 m11746(InputStream inputStream, InterfaceC6851 interfaceC6851) {
        C7207 c7207 = AbstractC5395.f15030;
        ExecutorC7208 executorC7208 = ExecutorC7208.f19225;
        executorC7208.getClass();
        interfaceC6851.getClass();
        return new C4222(new C5476(inputStream), executorC7208);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final InterfaceC7184 m11747(C1245 c1245, Class cls, List list) {
        InterfaceC7184[] interfaceC7184Arr = (InterfaceC7184[]) list.toArray(new InterfaceC7184[0]);
        InterfaceC7184 interfaceC7184M12413 = AbstractC7144.m12413(cls, (InterfaceC7184[]) Arrays.copyOf(interfaceC7184Arr, interfaceC7184Arr.length));
        if (interfaceC7184M12413 != null) {
            return interfaceC7184M12413;
        }
        C4397 c4397 = AbstractC4396.f12975;
        InterfaceC5093 interfaceC5093Mo8917 = c4397.mo8917(cls);
        InterfaceC7184 interfaceC7184 = (InterfaceC7184) AbstractC7124.f19061.get(interfaceC5093Mo8917);
        if (interfaceC7184 != null) {
            return interfaceC7184;
        }
        c1245.m2161(interfaceC5093Mo8917, list);
        if (cls.isInterface()) {
            return new C7182(c4397.mo8917(cls));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.types.AbstractC4882 m11748(kotlin.reflect.jvm.internal.impl.types.AbstractC4882 r7, java.util.ArrayList r8) {
        /*
            java.util.List r0 = r7.mo9726()
            r0.size()
            r8.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.AbstractC4345.m8822(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L19:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r8.next()
            飘花落叶言世苏楪子哲兰.飘花落叶言子楪世兰苏哲 r1 = (p105.C7301) r1
            r1.getClass()
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r3 = r1.f19442
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r4 = r1.f19443
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲苏兰楪 r1 = r1.f19444
            kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪哲世兰苏 r5 = kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4851.f14133
            r5.m9598(r4, r3)
            boolean r5 = kotlin.jvm.internal.AbstractC4395.m8907(r4, r3)
            if (r5 != 0) goto L91
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r1.mo9003()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r5 != r6) goto L43
            goto L91
        L43:
            boolean r5 = p049.AbstractC6530.m12018(r4)
            if (r5 == 0) goto L5f
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r1.mo9003()
            if (r5 == r6) goto L5f
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲 r2 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.mo9003()
            if (r4 != r1) goto L5b
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L5b:
            r2.<init>(r3, r4)
            goto L96
        L5f:
            if (r3 == 0) goto L8b
            boolean r2 = p049.AbstractC6530.m12022(r3)
            if (r2 == 0) goto L7b
            boolean r2 = r3.mo9725()
            if (r2 == 0) goto L7b
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲 r2 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.mo9003()
            if (r6 != r1) goto L77
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L77:
            r2.<init>(r4, r6)
            goto L96
        L7b:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲 r2 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.mo9003()
            if (r4 != r1) goto L87
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L87:
            r2.<init>(r3, r4)
            goto L96
        L8b:
            r7 = 140(0x8c, float:1.96E-43)
            p049.AbstractC6530.m12020(r7)
            throw r2
        L91:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲 r2 = new kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰楪哲
            r2.<init>(r4)
        L96:
            r0.add(r2)
            goto L19
        L9b:
            r8 = 6
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r7 = kotlin.reflect.jvm.internal.impl.types.AbstractC4893.m9821(r7, r0, r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p018.AbstractC6253.m11748(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲, java.util.ArrayList):kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Object m11749(InterfaceC4846 interfaceC4846, InterfaceC5088 interfaceC5088) {
        interfaceC4846.getClass();
        interfaceC5088.getClass();
        return interfaceC4846.invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static LayoutInflater m11750(Context context) {
        return LayoutInflater.from(context).cloneInContext(new C3764(context, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static C0137 m11751(String str) throws ProtocolException {
        Protocol protocol;
        int i;
        String strSubstring;
        if (AbstractC5139.m10139(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else if (AbstractC5139.m10139(str, "ICY ", false)) {
            protocol = Protocol.HTTP_1_0;
            i = 4;
        } else {
            if (!AbstractC5139.m10139(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            protocol = Protocol.HTTP_1_1;
            i = 12;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numM10140 = AbstractC5139.m10140(str.substring(i, i2));
        if (numM10140 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numM10140.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new C0137(protocol, iIntValue, strSubstring);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m11752(InterfaceC4480 interfaceC4480) {
        interfaceC4480.getClass();
        if (!AbstractC4606.f13454.contains(interfaceC4480.getName())) {
            return false;
        }
        if (AbstractC4344.m8806(AbstractC4606.f13455, AbstractC4773.m9501(interfaceC4480)) && interfaceC4480.mo9035().isEmpty()) {
            return true;
        }
        if (!AbstractC6530.m12012(interfaceC4480)) {
            return false;
        }
        Collection collectionMo9030 = interfaceC4480.mo9030();
        collectionMo9030.getClass();
        Collection<InterfaceC4480> collection = collectionMo9030;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC4480 interfaceC44802 : collection) {
            interfaceC44802.getClass();
            if (m11752(interfaceC44802)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C8825 m11753(C8829 c8829, boolean z) {
        long j;
        long j2;
        float f;
        long j3 = c8829.f24899;
        long j4 = c8829.f24900;
        long j5 = c8829.f24898;
        long jM11758 = m11758(C1599.m2950(0.8f, j5), j3);
        long jM117582 = m11758(C1599.m2950(0.8f, j5), j4);
        long j6 = c8829.f24897;
        long jM117583 = m11758(C1599.m2950(0.2f, j6), j3);
        long jM117584 = m11758(C1599.m2950(0.38f, j6), j3);
        long j7 = c8829.f24896;
        long jM117585 = m11758(C1599.m2950(0.38f, j7), jM117584);
        long jM117586 = m11758(C1599.m2950(0.38f, j6), j3);
        long jM117587 = m11758(C1599.m2950(0.6f, j7), jM117586);
        long jM117588 = m11758(C1599.m2950(0.38f, j6), j3);
        long jM117589 = m11758(C1599.m2950(0.5f, c8829.f24890), j3);
        long jM1175810 = m11758(C1599.m2950(0.38f, j5), jM117589);
        long jM1175811 = m11758(C1599.m2950(0.6f, j4), j3);
        long jM1175812 = m11758(C1599.m2950(0.38f, j5), jM1175811);
        long j8 = c8829.f24897;
        long j9 = c8829.f24896;
        long j10 = c8829.f24895;
        long j11 = c8829.f24894;
        long j12 = c8829.f24893;
        long j13 = c8829.f24892;
        long j14 = c8829.f24911;
        long j15 = c8829.f24910;
        long j16 = c8829.f24914;
        long j17 = c8829.f24915;
        long j18 = c8829.f24890;
        long j19 = c8829.f24891;
        long j20 = c8829.f24900;
        long j21 = c8829.f24898;
        long j22 = c8829.f24905;
        long j23 = c8829.f24904;
        long j24 = c8829.f24901;
        long j25 = c8829.f24889;
        long j26 = c8829.f24908;
        long j27 = c8829.f24909;
        long j28 = c8829.f24906;
        long j29 = c8829.f24907;
        long j30 = c8829.f24899;
        long j31 = c8829.f24902;
        long j32 = c8829.f24903;
        if (z) {
            j = j32;
            j2 = C1599.f4696;
            f = 0.6f;
        } else {
            j = j32;
            j2 = C1599.f4696;
            f = 0.3f;
        }
        return new C8825(j8, j9, j10, j11, j12, j13, j14, j15, jM117584, jM117585, jM117586, jM117587, jM117588, j16, j17, j18, j19, j20, j21, jM117589, jM1175810, jM1175811, jM1175812, j22, j23, j24, j25, j26, j27, j27, j28, j29, j8, j30, j21, j31, jM11758, j25, j25, j21, j, j21, j25, j20, jM117582, j24, j21, j19, j18, C1599.m2950(f, j2), c8829.f24897, c8829.f24900, jM117583);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m11754(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final AbstractC4870 m11755(AbstractC4870 abstractC4870, InterfaceC4463 interfaceC4463) {
        if (interfaceC4463 == null || abstractC4870.mo9742() == Variance.INVARIANT) {
            return abstractC4870;
        }
        if (interfaceC4463.mo9003() != abstractC4870.mo9742()) {
            C6895 c6895 = new C6895(abstractC4870);
            C4874.f14175.getClass();
            return new C4885(new C6897(abstractC4870, c6895, false, C4874.f14176));
        }
        if (!abstractC4870.mo9740()) {
            return new C4885(abstractC4870.mo9741());
        }
        C4840 c4840 = C4845.f14123;
        c4840.getClass();
        return new C4885(new C4880(c4840, new C1322(abstractC4870, 13)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C8255 m11756(C8255 c8255) {
        c8255.getClass();
        double dRint = Math.rint(c8255.f22856);
        return (((90.0d > dRint ? 1 : (90.0d == dRint ? 0 : -1)) <= 0 && (dRint > 111.0d ? 1 : (dRint == 111.0d ? 0 : -1)) <= 0) && ((Math.rint(c8255.f22855) > 16.0d ? 1 : (Math.rint(c8255.f22855) == 16.0d ? 0 : -1)) > 0) && (Math.rint(c8255.f22854) < 65.0d)) ? AbstractC8256.m13823(c8255.f22856, c8255.f22855, 70.0d) : c8255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m11757(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty()) {
            int i = 0;
            while (i < str.length()) {
                int iCodePointAt = Character.codePointAt(str, i);
                StringBuilder sb2 = new StringBuilder("\\u");
                String hexString = Integer.toHexString(iCodePointAt);
                if (hexString.startsWith("0")) {
                    hexString = hexString.substring(1);
                }
                if (hexString.length() <= 4) {
                    int length = hexString.length();
                    StringBuilder sb3 = new StringBuilder();
                    for (int i2 = 0; i2 < 4 - length; i2++) {
                        sb3.append("0");
                    }
                    sb2.append(sb3.toString());
                }
                sb2.append(hexString);
                sb.append(sb2.toString());
                if (Character.isHighSurrogate(str.charAt(i))) {
                    i++;
                }
                i++;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final long m11758(long j, long j2) {
        long jM2883;
        if (C1599.m2948(j) >= 1.0f) {
            return j;
        }
        float fM2948 = C1599.m2948(j);
        float fM29482 = C1599.m2948(j2);
        float f = 1.0f - fM2948;
        float f2 = (fM29482 * f) + fM2948;
        if (f2 == 0.0f) {
            jM2883 = AbstractC1581.m2883(0.0f, 0.0f, 0.0f, 0.0f, C1489.f4212);
        } else {
            jM2883 = AbstractC1581.m2883((((C1599.m2952(j2) * fM29482) * f) + (C1599.m2952(j) * fM2948)) / f2, (((C1599.m2953(j2) * fM29482) * f) + (C1599.m2953(j) * fM2948)) / f2, (((C1599.m2947(j2) * fM29482) * f) + (C1599.m2947(j) * fM2948)) / f2, f2, C1489.f4212);
        }
        return AbstractC1581.m2883(C1599.m2952(jM2883), C1599.m2953(jM2883), C1599.m2947(jM2883), 1.0f, C1489.f4212);
    }

    @Override // p197.InterfaceC7846
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public int mo9743(int i) {
        int iMo11760 = mo11760(i);
        if (iMo11760 == -1 || mo11760(iMo11760) == -1) {
            return -1;
        }
        return iMo11760;
    }

    @Override // p197.InterfaceC7846
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public int mo9744(int i) {
        int iMo11759 = mo11759(i);
        if (iMo11759 == -1 || mo11759(iMo11759) == -1) {
            return -1;
        }
        return iMo11759;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract String mo9995();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public abstract int mo11759(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract int mo11760(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract void mo11761(C8620 c8620, float f, float f2);

    @Override // p197.InterfaceC7846
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public int mo9761(int i) {
        return mo11760(i);
    }

    @Override // p197.InterfaceC7846
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public int mo9762(int i) {
        return mo11759(i);
    }
}
