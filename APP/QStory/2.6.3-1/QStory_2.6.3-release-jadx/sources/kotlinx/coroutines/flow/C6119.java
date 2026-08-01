package kotlinx.coroutines.flow;

import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import java.util.Arrays;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.C6274;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC6050;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import kotlinx.coroutines.flow.internal.AbstractC6052;
import kotlinx.coroutines.flow.internal.C6065;
import kotlinx.coroutines.flow.internal.InterfaceC6062;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6119 extends AbstractC6052 implements InterfaceC6126, InterfaceC6151, InterfaceC6062 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f15215;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f15216;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public long f15217;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f15218;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Object[] f15219;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f15220;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f15221;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final BufferOverflow f15222;

    public C6119(int i, int i2, BufferOverflow bufferOverflow) {
        this.f15218 = i;
        this.f15221 = i2;
        this.f15222 = bufferOverflow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r9 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (r9.mo11121() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        throw r9.mo11122();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        r0.L$0 = r6;
        r0.L$1 = r2;
        r0.L$2 = r10;
        r0.L$3 = r9;
        r0.L$4 = null;
        r0.label = 3;
        r11 = r2.emit(r11, r0);
        r2 = r2;
        r6 = r6;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (r11 != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:15:0x003a, B:32:0x008f, B:34:0x0097, B:38:0x00ac, B:41:0x00b3, B:42:0x00b7, B:43:0x00b8, B:22:0x005a), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa A[EDGE_INSN: B:56:0x00aa->B:37:0x00aa BREAK  A[LOOP:0: B:32:0x008f->B:59:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlinx.coroutines.flow.internal.飘花落叶言子楪世哲苏兰] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlinx.coroutines.flow.飘花落叶言子哲兰苏世楪] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9, types: [kotlinx.coroutines.flow.飘花落叶言子哲兰苏世楪] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.flow.internal.飘花落叶言子楪世苏哲兰] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlinx.coroutines.flow.飘花落叶言子哲兰苏楪世] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c8 -> B:16:0x003d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CoroutineSingletons m10874(C6119 c6119, InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) throws Throwable {
        SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        ?? r6;
        ?? r11;
        C6119 c61192;
        InterfaceC6284 interfaceC6284;
        InterfaceC6284 interfaceC62842;
        ?? r2;
        Object objM10878;
        ?? r112;
        ?? r10;
        ?? r9;
        if (interfaceC5189 instanceof SharedFlowImpl$collect$1) {
            sharedFlowImpl$collect$1 = (SharedFlowImpl$collect$1) interfaceC5189;
            int i = sharedFlowImpl$collect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sharedFlowImpl$collect$1.label = i - Integer.MIN_VALUE;
            } else {
                sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(c6119, interfaceC5189);
            }
        }
        Object obj = sharedFlowImpl$collect$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sharedFlowImpl$collect$1.label;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                r11 = interfaceC6150;
                interfaceC6150 = (C6118) c6119.m10859();
                c61192 = c6119;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        interfaceC62842 = (InterfaceC6284) sharedFlowImpl$collect$1.L$3;
                        C6118 c6118 = (C6118) sharedFlowImpl$collect$1.L$2;
                        InterfaceC6150 interfaceC61502 = (InterfaceC6150) sharedFlowImpl$collect$1.L$1;
                        C6119 c61193 = (C6119) sharedFlowImpl$collect$1.L$0;
                        AbstractC6017.m10769(obj);
                        r2 = interfaceC61502;
                        r6 = c61193;
                        interfaceC6150 = c6118;
                        while (true) {
                            objM10878 = r6.m10878(interfaceC6150);
                            if (objM10878 != AbstractC6154.f15236) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i2 != 3) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC62842 = (InterfaceC6284) sharedFlowImpl$collect$1.L$3;
                    C6118 c61182 = (C6118) sharedFlowImpl$collect$1.L$2;
                    InterfaceC6150 interfaceC61503 = (InterfaceC6150) sharedFlowImpl$collect$1.L$1;
                    C6119 c61194 = (C6119) sharedFlowImpl$collect$1.L$0;
                    AbstractC6017.m10769(obj);
                    ?? r22 = interfaceC61503;
                    ?? r62 = c61194;
                    ?? r102 = c61182;
                    r112 = r22;
                    interfaceC6284 = interfaceC62842;
                    r9 = r62;
                    r10 = r102;
                    r6 = r9;
                    interfaceC62842 = interfaceC6284;
                    r2 = r112;
                    interfaceC6150 = r10;
                    while (true) {
                        objM10878 = r6.m10878(interfaceC6150);
                        if (objM10878 != AbstractC6154.f15236) {
                            break;
                        }
                        sharedFlowImpl$collect$1.L$0 = r6;
                        sharedFlowImpl$collect$1.L$1 = r2;
                        sharedFlowImpl$collect$1.L$2 = interfaceC6150;
                        sharedFlowImpl$collect$1.L$3 = interfaceC62842;
                        sharedFlowImpl$collect$1.L$4 = null;
                        sharedFlowImpl$collect$1.label = 2;
                        if (r6.m10885(interfaceC6150, sharedFlowImpl$collect$1) == coroutineSingletons) {
                            break;
                        }
                    }
                    return coroutineSingletons;
                }
                interfaceC6150 = (C6118) sharedFlowImpl$collect$1.L$2;
                InterfaceC6150 interfaceC61504 = (InterfaceC6150) sharedFlowImpl$collect$1.L$1;
                C6119 c61195 = (C6119) sharedFlowImpl$collect$1.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    r11 = interfaceC61504;
                    c61192 = c61195;
                    interfaceC6150 = interfaceC6150;
                } catch (Throwable th2) {
                    th = th2;
                    r6 = c61195;
                    r6.m10862(interfaceC6150);
                    throw th;
                }
            }
            interfaceC6284 = (InterfaceC6284) sharedFlowImpl$collect$1.getContext().get(C6285.f15450);
            r9 = c61192;
            r10 = interfaceC6150;
            r112 = r11;
            r6 = r9;
            interfaceC62842 = interfaceC6284;
            r2 = r112;
            interfaceC6150 = r10;
            while (true) {
                objM10878 = r6.m10878(interfaceC6150);
                if (objM10878 != AbstractC6154.f15236) {
                }
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            r6 = c61192;
            th = th3;
            r6.m10862(interfaceC6150);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) throws Throwable {
        C6119 c6119;
        Throwable th;
        InterfaceC5189[] interfaceC5189ArrM10884;
        C6114 c6114;
        Object objM11099;
        CoroutineSingletons coroutineSingletons;
        if (mo10868(obj)) {
            return C6008.f15084;
        }
        int i = 1;
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        InterfaceC5189[] interfaceC5189ArrM108842 = AbstractC6051.f15153;
        synchronized (this) {
            try {
                if (m10876(obj)) {
                    try {
                        c6276.resumeWith(Result.m9304constructorimpl(C6008.f15084));
                        interfaceC5189ArrM10884 = m10884(interfaceC5189ArrM108842);
                        c6114 = null;
                        c6119 = this;
                        if (c6114 != null) {
                            c6276.m11101(new C6274(c6114, i));
                        }
                        for (InterfaceC5189 interfaceC51892 : interfaceC5189ArrM10884) {
                            if (interfaceC51892 != null) {
                                interfaceC51892.resumeWith(Result.m9304constructorimpl(C6008.f15084));
                            }
                        }
                        objM11099 = c6276.m11099();
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (objM11099 != coroutineSingletons) {
                            objM11099 = C6008.f15084;
                        }
                        return objM11099 != coroutineSingletons ? objM11099 : C6008.f15084;
                    } catch (Throwable th2) {
                        th = th2;
                        c6119 = this;
                    }
                } else {
                    try {
                        c6119 = this;
                        try {
                            C6114 c61142 = new C6114(c6119, m10881() + ((long) (this.f15216 + this.f15215)), obj, c6276);
                            c6119.m10883(c61142);
                            c6119.f15215++;
                            if (c6119.f15221 == 0) {
                                interfaceC5189ArrM108842 = c6119.m10884(interfaceC5189ArrM108842);
                            }
                            interfaceC5189ArrM10884 = interfaceC5189ArrM108842;
                            c6114 = c61142;
                            if (c6114 != null) {
                            }
                            while (i < r7) {
                            }
                            objM11099 = c6276.m11099();
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (objM11099 != coroutineSingletons) {
                            }
                            if (objM11099 != coroutineSingletons) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        c6119 = this;
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                c6119 = this;
            }
            th = th;
            throw th;
        }
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC6062
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6151 mo10851(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        return ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? this : new C6065(this, interfaceC5192, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6126
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo10868(Object obj) {
        int i;
        boolean z;
        InterfaceC5189[] interfaceC5189ArrM10884 = AbstractC6051.f15153;
        synchronized (this) {
            if (m10876(obj)) {
                interfaceC5189ArrM10884 = m10884(interfaceC5189ArrM10884);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC5189 interfaceC5189 : interfaceC5189ArrM10884) {
            if (interfaceC5189 != null) {
                interfaceC5189.resumeWith(Result.m9304constructorimpl(C6008.f15084));
            }
        }
        return z;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6126
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo10869() throws Throwable {
        C6119 c6119;
        synchronized (this) {
            try {
                c6119 = this;
                try {
                    c6119.m10879(m10881() + ((long) this.f15216), this.f15217, m10881() + ((long) this.f15216), m10881() + ((long) this.f15216) + ((long) this.f15215));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                c6119 = this;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) {
        return m10874(this, interfaceC6150, interfaceC5189);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long m10875(C6118 c6118) {
        long j = c6118.f15214;
        if (j >= m10881() + ((long) this.f15216) && (this.f15221 > 0 || j > m10881() || this.f15215 == 0)) {
            return -1L;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10876(Object obj) {
        int i;
        long jM10881;
        long j;
        int i2 = this.f15155;
        int i3 = this.f15218;
        if (i2 != 0) {
            int i4 = this.f15216;
            int i5 = this.f15221;
            if (i4 < i5 || this.f15217 > this.f15220) {
                m10883(obj);
                i = this.f15216 + 1;
                this.f15216 = i;
                if (i > i5) {
                    m10880();
                }
                jM10881 = m10881() + ((long) this.f15216);
                j = this.f15220;
                if (((int) (jM10881 - j)) > i3) {
                    m10879(1 + j, this.f15217, m10881() + ((long) this.f15216), m10881() + ((long) this.f15216) + ((long) this.f15215));
                }
            } else {
                int i6 = AbstractC6115.f15211[this.f15222.ordinal()];
                if (i6 == 1) {
                    return false;
                }
                if (i6 != 2) {
                    if (i6 != 3) {
                        C5043.m9170();
                        return false;
                    }
                    m10883(obj);
                    i = this.f15216 + 1;
                    this.f15216 = i;
                    if (i > i5) {
                    }
                    jM10881 = m10881() + ((long) this.f15216);
                    j = this.f15220;
                    if (((int) (jM10881 - j)) > i3) {
                    }
                }
            }
        } else if (i3 != 0) {
            m10883(obj);
            int i7 = this.f15216 + 1;
            this.f15216 = i7;
            if (i7 > i3) {
                m10880();
            }
            this.f15217 = m10881() + ((long) this.f15216);
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5189[] m10877(long j) {
        long j2;
        long j3;
        int i;
        long j4;
        InterfaceC5189[] interfaceC5189Arr;
        InterfaceC5189[] interfaceC5189Arr2;
        AbstractC6050[] abstractC6050Arr;
        C5317 c5317 = AbstractC6154.f15236;
        InterfaceC5189[] interfaceC5189Arr3 = AbstractC6051.f15153;
        if (j <= this.f15217) {
            long jM10881 = m10881();
            long j5 = ((long) this.f15216) + jM10881;
            int i2 = this.f15221;
            if (i2 == 0 && this.f15215 > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.f15155 != 0 && (abstractC6050Arr = this.f15157) != null) {
                for (AbstractC6050 abstractC6050 : abstractC6050Arr) {
                    if (abstractC6050 != null) {
                        long j6 = ((C6118) abstractC6050).f15214;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.f15217) {
                long jM108812 = m10881() + ((long) this.f15216);
                int i4 = this.f15155;
                int iMin = this.f15215;
                if (i4 > 0) {
                    j2 = 1;
                    iMin = Math.min(iMin, i2 - ((int) (jM108812 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = ((long) this.f15215) + jM108812;
                if (iMin > 0) {
                    InterfaceC5189[] interfaceC5189Arr4 = new InterfaceC5189[iMin];
                    Object[] objArr = this.f15219;
                    objArr.getClass();
                    j3 = j5;
                    long j8 = jM108812;
                    while (true) {
                        if (jM108812 >= j7) {
                            interfaceC5189Arr2 = interfaceC5189Arr4;
                            i = i2;
                            j4 = j7;
                            break;
                        }
                        interfaceC5189Arr2 = interfaceC5189Arr4;
                        Object obj = objArr[((int) jM108812) & (objArr.length - 1)];
                        if (obj != c5317) {
                            obj.getClass();
                            C6114 c6114 = (C6114) obj;
                            i = i2;
                            int i5 = i3 + 1;
                            j4 = j7;
                            interfaceC5189Arr2[i3] = c6114.f15207;
                            AbstractC6154.m10889(objArr, jM108812, c5317);
                            AbstractC6154.m10889(objArr, j8, c6114.f15209);
                            j8 += j2;
                            if (i5 >= iMin) {
                                break;
                            }
                            i3 = i5;
                        } else {
                            i = i2;
                            j4 = j7;
                        }
                        jM108812 += j2;
                        interfaceC5189Arr4 = interfaceC5189Arr2;
                        i2 = i;
                        j7 = j4;
                    }
                    jM108812 = j8;
                    interfaceC5189Arr = interfaceC5189Arr2;
                } else {
                    j3 = j5;
                    i = i2;
                    j4 = j7;
                    interfaceC5189Arr = interfaceC5189Arr3;
                }
                long jMax = Math.max(this.f15220, Math.max(jM10881, jM108812 - ((long) this.f15218)));
                if (i == 0 && jMax < j4) {
                    Object[] objArr2 = this.f15219;
                    objArr2.getClass();
                    if (AbstractC5227.m9466(objArr2[((int) jMax) & (objArr2.length - 1)], c5317)) {
                        jM108812 += j2;
                        jMax += j2;
                    }
                }
                long j9 = jM108812;
                m10879(jMax, this.f15155 == 0 ? j9 : j3, j9, j4);
                m10886();
                return interfaceC5189Arr.length == 0 ? interfaceC5189Arr : m10884(interfaceC5189Arr);
            }
        }
        return interfaceC5189Arr3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object m10878(C6118 c6118) {
        Object obj;
        InterfaceC5189[] interfaceC5189ArrM10877 = AbstractC6051.f15153;
        synchronized (this) {
            try {
                long jM10875 = m10875(c6118);
                if (jM10875 < 0) {
                    obj = AbstractC6154.f15236;
                } else {
                    long j = c6118.f15214;
                    Object[] objArr = this.f15219;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jM10875) & (objArr.length - 1)];
                    if (obj2 instanceof C6114) {
                        obj2 = ((C6114) obj2).f15209;
                    }
                    c6118.f15214 = jM10875 + 1;
                    Object obj3 = obj2;
                    interfaceC5189ArrM10877 = m10877(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC5189 interfaceC5189 : interfaceC5189ArrM10877) {
            if (interfaceC5189 != null) {
                interfaceC5189.resumeWith(Result.m9304constructorimpl(C6008.f15084));
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m10879(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jM10881 = m10881(); jM10881 < jMin; jM10881++) {
            Object[] objArr = this.f15219;
            objArr.getClass();
            AbstractC6154.m10889(objArr, jM10881, null);
        }
        this.f15220 = j;
        this.f15217 = j2;
        this.f15216 = (int) (j3 - jMin);
        this.f15215 = (int) (j4 - j3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m10880() {
        AbstractC6050[] abstractC6050Arr;
        Object[] objArr = this.f15219;
        objArr.getClass();
        AbstractC6154.m10889(objArr, m10881(), null);
        this.f15216--;
        long jM10881 = m10881() + 1;
        if (this.f15220 < jM10881) {
            this.f15220 = jM10881;
        }
        if (this.f15217 < jM10881) {
            if (this.f15155 != 0 && (abstractC6050Arr = this.f15157) != null) {
                for (AbstractC6050 abstractC6050 : abstractC6050Arr) {
                    if (abstractC6050 != null) {
                        C6118 c6118 = (C6118) abstractC6050;
                        long j = c6118.f15214;
                        if (0 <= j && j < jM10881) {
                            c6118.f15214 = jM10881;
                        }
                    }
                }
            }
            this.f15217 = jM10881;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long m10881() {
        return Math.min(this.f15217, this.f15220);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object[] m10882(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            C6755.m11870("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.f15219 = objArr2;
        if (objArr != null) {
            long jM10881 = m10881();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jM10881;
                AbstractC6154.m10889(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m10883(Object obj) {
        int i = this.f15216 + this.f15215;
        Object[] objArrM10882 = this.f15219;
        if (objArrM10882 == null) {
            objArrM10882 = m10882(null, 0, 2);
        } else if (i >= objArrM10882.length) {
            objArrM10882 = m10882(objArrM10882, i, objArrM10882.length * 2);
        }
        AbstractC6154.m10889(objArrM10882, m10881() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.飘花落叶言子楪世哲苏兰[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5189[] m10884(InterfaceC5189[] interfaceC5189Arr) {
        AbstractC6050[] abstractC6050Arr;
        C6118 c6118;
        C6276 c6276;
        int length = interfaceC5189Arr.length;
        if (this.f15155 != 0 && (abstractC6050Arr = this.f15157) != null) {
            int length2 = abstractC6050Arr.length;
            int i = 0;
            interfaceC5189Arr = interfaceC5189Arr;
            while (i < length2) {
                AbstractC6050 abstractC6050 = abstractC6050Arr[i];
                if (abstractC6050 != null && (c6276 = (c6118 = (C6118) abstractC6050).f15213) != null && m10875(c6118) >= 0) {
                    int length3 = interfaceC5189Arr.length;
                    interfaceC5189Arr = interfaceC5189Arr;
                    if (length >= length3) {
                        interfaceC5189Arr = Arrays.copyOf((Object[]) interfaceC5189Arr, Math.max(2, interfaceC5189Arr.length * 2));
                    }
                    ((InterfaceC5189[]) interfaceC5189Arr)[length] = c6276;
                    c6118.f15213 = null;
                    length++;
                }
                i++;
                interfaceC5189Arr = interfaceC5189Arr;
            }
        }
        return (InterfaceC5189[]) interfaceC5189Arr;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6052
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final AbstractC6050[] mo10860() {
        return new C6118[2];
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6052
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC6050 mo10861() {
        C6118 c6118 = new C6118();
        c6118.f15214 = -1L;
        return c6118;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Object m10885(C6118 c6118, InterfaceC5189 interfaceC5189) {
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        synchronized (this) {
            try {
                if (m10875(c6118) < 0) {
                    c6118.f15213 = c6276;
                } else {
                    c6276.resumeWith(Result.m9304constructorimpl(C6008.f15084));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM11099 = c6276.m11099();
        return objM11099 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11099 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m10886() {
        if (this.f15221 != 0 || this.f15215 > 1) {
            Object[] objArr = this.f15219;
            objArr.getClass();
            while (this.f15215 > 0) {
                long jM10881 = m10881();
                int i = this.f15216;
                int i2 = this.f15215;
                if (objArr[((int) ((jM10881 + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != AbstractC6154.f15236) {
                    return;
                }
                this.f15215 = i2 - 1;
                AbstractC6154.m10889(objArr, m10881() + ((long) (this.f15216 + this.f15215)), null);
            }
        }
    }
}
