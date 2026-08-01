package androidx.compose.runtime;

import android.os.Trace;
import androidx.appcompat.app.C0923;
import androidx.collection.AbstractC1132;
import androidx.collection.AbstractC1134;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.collection.C1091;
import androidx.compose.foundation.text.C1807;
import androidx.compose.foundation.text.C1833;
import androidx.compose.runtime.collection.C2057;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.collection.C2060;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.C2080;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.C2096;
import androidx.compose.runtime.snapshots.C2097;
import androidx.compose.runtime.snapshots.C2106;
import androidx.window.area.AbstractC3400;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.sequences.C5960;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.flow.C6099;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m556f = "Recomposer.kt", m557l = {615, 626}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;", "parentFrameClock", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements InterfaceC7380 {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ C2218 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(C2218 c2218, InterfaceC5189<? super Recomposer$runRecomposeAndApplyChanges$2> interfaceC5189) {
        super(3, interfaceC5189);
        this.this$0 = c2218;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void invokeSuspend$clearRecompositionState(C2218 c2218, List<C2198> list, List<AbstractC2140> list2, List<C2198> list3, C1082 c1082, C1082 c10822, C1082 c10823, C1082 c10824) {
        char c;
        long j;
        long j2;
        synchronized (c2218.f4341) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    C2198 c2198 = list3.get(i);
                    c2198.m3010();
                    c2218.m3074(c2198);
                }
                list3.clear();
                Object[] objArr = c1082.f1345;
                long[] jArr = c1082.f1346;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    C2198 c21982 = (C2198) objArr[(i2 << 3) + i4];
                                    c21982.m3010();
                                    c2218.m3074(c21982);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 == length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                c1082.m1300();
                Object[] objArr2 = c10822.f1345;
                long[] jArr2 = c10822.f1346;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((C2198) objArr2[(i5 << 3) + i7]).m3024();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 == length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                c10822.m1300();
                c10823.m1300();
                Object[] objArr3 = c10824.f1345;
                long[] jArr3 = c10824.f1346;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    C2198 c21983 = (C2198) objArr3[(i8 << 3) + i10];
                                    c21983.m3010();
                                    c2218.m3074(c21983);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 == length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                c10824.m1300();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final void invokeSuspend$fillToInsert(List<AbstractC2140> list, C2218 c2218) {
        list.clear();
        synchronized (c2218.f4341) {
            try {
                ArrayList arrayList = c2218.f4358;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((AbstractC2140) arrayList.get(i));
                }
                c2218.f4358.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015f  */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.collection.飘花落叶言子世兰楪哲苏, androidx.collection.飘花落叶言子苏世楪哲兰] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C6008 invokeSuspend$lambda$2(C2218 c2218, C1082 c1082, C1082 c10822, List list, List list2, C1082 c10823, List list3, C1082 c10824, Set set, long j) {
        boolean zM3079;
        Object[] objArr;
        char c;
        long j2;
        long j3;
        boolean z;
        List list4 = list;
        ?? r4 = list3;
        C1082 c10825 = c10824;
        synchronized (c2218.f4341) {
            zM3079 = c2218.m3079();
        }
        int i = 2;
        boolean z2 = true;
        boolean z3 = false;
        if (zM3079) {
            Trace.beginSection("Recomposer:animation");
            try {
                c2218.f4343.f4271.m2727(new C1807(j, i));
                synchronized (AbstractC2115.f4090) {
                    C1082 c10826 = AbstractC2115.f4097.f4042;
                    if (c10826 != null) {
                        z = c10826.m1432();
                    }
                }
                if (z) {
                    AbstractC2115.m2823();
                }
            } finally {
                Trace.endSection();
            }
        }
        Trace.beginSection("Recomposer:recompose");
        try {
            c2218.m3071();
            synchronized (c2218.f4341) {
                try {
                    C2059 c2059 = c2218.f4360;
                    Object[] objArr2 = c2059.f3866;
                    int i2 = c2059.f3865;
                    for (int i3 = 0; i3 < i2; i3++) {
                        list4.add((C2198) objArr2[i3]);
                    }
                    c2218.f4360.m2612();
                } finally {
                }
            }
            c1082.m1300();
            c10822.m1300();
        } catch (Throwable th) {
            throw th;
        }
        while (true) {
            if (list4.isEmpty() && list2.isEmpty()) {
                break;
            }
            int i4 = i;
            ?? r6 = r4;
            boolean z4 = z2;
            List list5 = list4;
            try {
                int size = list5.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C2198 c2198 = (C2198) list5.get(i5);
                    C2198 c2198M3081 = c2218.m3081(c2198, c1082);
                    if (c2198M3081 != null) {
                        r6.add(c2198M3081);
                    }
                    c10822.m1301(c2198);
                }
                list5.clear();
                if (c1082.m1432() || c2218.f4360.f3865 != 0) {
                    synchronized (c2218.f4341) {
                        try {
                            List listM3085 = c2218.m3085();
                            int size2 = listM3085.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                C2198 c21982 = (C2198) listM3085.get(i6);
                                if (!c10822.m1434(c21982) && c21982.m3015(set)) {
                                    list5.add(c21982);
                                }
                            }
                            C2059 c20592 = c2218.f4360;
                            int i7 = c20592.f3865;
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                objArr = c20592.f3866;
                                if (i8 >= i7) {
                                    break;
                                }
                                C2198 c21983 = (C2198) objArr[i8];
                                if (!c10822.m1434(c21983) && !list5.contains(c21983)) {
                                    list5.add(c21983);
                                    i9++;
                                } else if (i9 > 0) {
                                    Object[] objArr3 = c20592.f3866;
                                    objArr3[i8 - i9] = objArr3[i8];
                                }
                                i8++;
                            }
                            int i10 = i7 - i9;
                            Arrays.fill(objArr, i10, i7, (Object) null);
                            c20592.f3865 = i10;
                        } finally {
                        }
                    }
                }
                if (list5.isEmpty()) {
                    try {
                        invokeSuspend$fillToInsert(list2, c2218);
                        while (!list2.isEmpty()) {
                            List listM3082 = c2218.m3082(list2, c1082);
                            c10823.getClass();
                            listM3082.getClass();
                            Iterator it = listM3082.iterator();
                            while (it.hasNext()) {
                                c10823.m1305(it.next());
                            }
                            invokeSuspend$fillToInsert(list2, c2218);
                        }
                        z2 = z4;
                        list4 = list5;
                        r4 = r6;
                        i = i4;
                        z3 = false;
                        c10825 = c10824;
                    } catch (Throwable th2) {
                        c2218.m3072(th2, null);
                        invokeSuspend$clearRecompositionState(c2218, list5, list2, r6, c10823, c10824, c1082, c10822);
                        return C6008.f15084;
                    }
                } else {
                    list4 = list;
                    r4 = list3;
                    c10825 = c10824;
                    z2 = z4;
                    i = i4;
                    z3 = false;
                }
            } catch (Throwable th3) {
                try {
                    c2218.m3072(th3, null);
                    invokeSuspend$clearRecompositionState(c2218, list, list2, list3, c10823, c10824, c1082, c10822);
                    return C6008.f15084;
                } finally {
                    list.clear();
                }
            }
            throw th;
        }
        AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
        AbstractC2121 c2097 = abstractC2121M2840 instanceof C2106 ? new C2097((C2106) abstractC2121M2840, null, null, true, false) : new C2096(abstractC2121M2840, null, z2, z3);
        try {
            AbstractC2121 abstractC2121M2847 = c2097.m2847();
            try {
                if (!r4.isEmpty()) {
                    try {
                        int size3 = r4.size();
                        for (?? r5 = z3; r5 < size3; r5++) {
                            c10825.m1301((C2198) r4.get(r5));
                        }
                        int size4 = r4.size();
                        for (?? r52 = z3; r52 < size4; r52++) {
                            ((C2198) r4.get(r52)).m3007();
                        }
                        r4.clear();
                    } catch (Throwable th4) {
                        try {
                            c2218.m3072(th4, null);
                            invokeSuspend$clearRecompositionState(c2218, list4, list2, r4, c10823, c10825, c1082, c10822);
                            C6008 c6008 = C6008.f15084;
                            AbstractC2121.m2844(abstractC2121M2847);
                            return c6008;
                        } finally {
                            list3.clear();
                        }
                    }
                }
                if (c10823.m1432()) {
                    try {
                        c10825.m1308(c10823);
                        Object[] objArr4 = c10823.f1345;
                        c = 7;
                        long[] jArr = c10823.f1346;
                        int length = jArr.length - 2;
                        j2 = 128;
                        ?? r7 = z3;
                        if (length >= 0) {
                            while (true) {
                                long j4 = jArr[r7];
                                j3 = 255;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8 - ((~(r7 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((j4 & 255) < 128) {
                                            ((C2198) objArr4[(r7 << 3) + i12]).m3005();
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    }
                                    if (r7 == length) {
                                        break;
                                    }
                                    r7++;
                                }
                            }
                        } else {
                            j3 = 255;
                        }
                    } catch (Throwable th5) {
                        try {
                            c2218.m3072(th5, null);
                            invokeSuspend$clearRecompositionState(c2218, list, list2, list3, c10823, c10825, c1082, c10822);
                            C6008 c60082 = C6008.f15084;
                            AbstractC2121.m2844(abstractC2121M2847);
                            return c60082;
                        } finally {
                            c10823.m1300();
                        }
                    }
                } else {
                    c = 7;
                    j2 = 128;
                    j3 = 255;
                }
                if (c10825.m1432()) {
                    try {
                        Object[] objArr5 = c10825.f1345;
                        long[] jArr2 = c10825.f1346;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j5 = jArr2[i13];
                                if ((((~j5) << c) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        if ((j5 & j3) < j2) {
                                            ((C2198) objArr5[(i13 << 3) + i15]).m3024();
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i14 != 8) {
                                        break;
                                    }
                                    if (i13 == length2) {
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        }
                        c10825.m1300();
                    } catch (Throwable th6) {
                        try {
                            c2218.m3072(th6, null);
                            invokeSuspend$clearRecompositionState(c2218, list, list2, list3, c10823, c10825, c1082, c10822);
                            C6008 c60083 = C6008.f15084;
                            AbstractC2121.m2844(abstractC2121M2847);
                            return c60083;
                        } finally {
                            c10824.m1300();
                        }
                    }
                }
                AbstractC2121.m2844(abstractC2121M2847);
                c2097.mo2765();
                synchronized (c2218.f4341) {
                    if (c2218.m3080() != null) {
                        AbstractC2209.m3067("unexpected to get continuation here");
                    }
                }
                AbstractC2115.m2840().mo2769();
                c10822.m1300();
                c1082.m1300();
                c2218.f4352 = null;
                Trace.endSection();
                return C6008.f15084;
            } catch (Throwable th7) {
                AbstractC2121.m2844(abstractC2121M2847);
                throw th7;
            }
        } finally {
            c2097.mo2765();
        }
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC2139 interfaceC2139, InterfaceC5189<? super C6008> interfaceC5189) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, interfaceC5189);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = interfaceC2139;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x016c -> B:54:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0225 -> B:12:0x00b5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2139 interfaceC2139;
        C1082 c1082;
        C1082 c10822;
        List list;
        Set set;
        final List list2;
        C1082 c10823;
        List list3;
        C1082 c10824;
        final List list4;
        final C1082 c10825;
        final List list5;
        final C1082 c10826;
        C2218 c2218;
        C2218 c22182;
        boolean z;
        Object objM11099;
        C6276 c6276;
        CoroutineSingletons coroutineSingletons;
        InterfaceC2139 interfaceC21392;
        C1091 c1091;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC2139 = (InterfaceC2139) this.L$0;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            C1082 c10827 = AbstractC1132.f1342;
            c1082 = new C1082();
            C1082 c10828 = new C1082();
            C1082 c10829 = new C1082();
            C2057 c2057 = new C2057(c10829);
            c10822 = new C1082();
            list = arrayList;
            set = c2057;
            list2 = arrayList2;
            c10823 = c10829;
            list3 = arrayList3;
            c10824 = c10828;
            c22182 = this.this$0;
            synchronized (c22182.f4341) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C1082 c108210 = (C1082) this.L$8;
                set = (Set) this.L$7;
                c10823 = (C1082) this.L$6;
                c10824 = (C1082) this.L$5;
                c1082 = (C1082) this.L$4;
                list3 = (List) this.L$3;
                list2 = (List) this.L$2;
                list = (List) this.L$1;
                InterfaceC2139 interfaceC21393 = (InterfaceC2139) this.L$0;
                AbstractC6017.m10769(obj);
                c10822 = c108210;
                interfaceC2139 = interfaceC21393;
                C2218 c22183 = this.this$0;
                synchronized (c22183.f4341) {
                    try {
                        if (c22183.f4359.m1321()) {
                            C1091 c1091M2616 = C2060.m2616(c22183.f4359);
                            c22183.f4359.m1314();
                            C0923 c0923 = c22183.f4351;
                            ((C1083) c0923.f572).m1314();
                            ((C1083) c0923.f573).m1314();
                            c22183.f4354.m1314();
                            c1091 = new C1091(c1091M2616.f1349);
                            Object[] objArr = c1091M2616.f1350;
                            int i4 = c1091M2616.f1349;
                            coroutineSingletons = coroutineSingletons2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                AbstractC2140 abstractC2140 = (AbstractC2140) objArr[i5];
                                c1091.m1335(new Pair(abstractC2140, c22183.f4350.m1317(abstractC2140)));
                                i5 = i6 + 1;
                                interfaceC2139 = interfaceC2139;
                                objArr = objArr;
                            }
                            interfaceC21392 = interfaceC2139;
                            c22183.f4350.m1314();
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                            interfaceC21392 = interfaceC2139;
                            c1091 = AbstractC1134.f1347;
                            c1091.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = c1091.f1350;
                int i7 = c1091.f1349;
                for (int i8 = 0; i8 < i7; i8++) {
                    Pair pair = (Pair) objArr2[i8];
                }
                C2175 c2175 = this.this$0.f4342;
                ((AtomicInt) c2175.f4248).set(0);
                ((C2080) c2175.f4246).m2727(new C1833(10));
                coroutineSingletons2 = coroutineSingletons;
                interfaceC2139 = interfaceC21392;
                i2 = 2;
                i3 = 1;
                c22182 = this.this$0;
                synchronized (c22182.f4341) {
                    z = c22182.f4345;
                }
                if (z) {
                    C5960 c5960M12604 = AbstractC7390.m12604((InterfaceC7383) c22182.f4347.m11126().f13273);
                    while (c5960M12604.hasNext()) {
                        if (((InterfaceC6284) c5960M12604.next()).mo11121()) {
                        }
                    }
                    return C6008.f15084;
                }
                C2218 c22184 = this.this$0;
                this.L$0 = interfaceC2139;
                this.L$1 = list;
                this.L$2 = list2;
                this.L$3 = list3;
                this.L$4 = c1082;
                this.L$5 = c10824;
                this.L$6 = c10823;
                this.L$7 = set;
                this.L$8 = c10822;
                this.label = i3;
                if (c22184.m3076()) {
                    objM11099 = C6008.f15084;
                } else {
                    C6276 c62762 = new C6276(i3, AbstractC3400.m5624(this));
                    c62762.m11102();
                    synchronized (c22184.f4341) {
                        if (c22184.m3076()) {
                            c6276 = c62762;
                        } else {
                            c22184.f4353 = c62762;
                            c6276 = null;
                        }
                    }
                    if (c6276 != null) {
                        c6276.resumeWith(Result.m9304constructorimpl(C6008.f15084));
                    }
                    objM11099 = c62762.m11099();
                    if (objM11099 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM11099 = C6008.f15084;
                    }
                }
                if (objM11099 != coroutineSingletons2) {
                    List list6 = list;
                    c10825 = c1082;
                    c10826 = c10822;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final C1082 c108211 = c10824;
                    final C1082 c108212 = c10823;
                    c2218 = this.this$0;
                    C6099 c6099 = C2218.f4335;
                    if (c2218.m3071()) {
                        List list7 = list4;
                        c10822 = c10826;
                        c1082 = c10825;
                        list = list5;
                        list3 = list7;
                        c10823 = c108212;
                        c10824 = c108211;
                        set = set2;
                        c22182 = this.this$0;
                        synchronized (c22182.f4341) {
                        }
                    } else {
                        final C2218 c22185 = this.this$0;
                        InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.runtime.飘花落叶言子苏兰哲楪世
                            @Override // p068.InterfaceC7387
                            public final Object invoke(Object obj2) {
                                return Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$lambda$2(c22185, c108212, c10826, list5, list2, c10825, list4, c108211, set2, ((Long) obj2).longValue());
                            }
                        };
                        this.L$0 = interfaceC2139;
                        this.L$1 = list5;
                        this.L$2 = list2;
                        this.L$3 = list4;
                        this.L$4 = c10825;
                        this.L$5 = c108211;
                        this.L$6 = c108212;
                        this.L$7 = set2;
                        this.L$8 = c10826;
                        this.label = i2;
                        if (interfaceC2139.mo2865(interfaceC7387, this) != coroutineSingletons2) {
                            List list8 = list4;
                            c10822 = c10826;
                            c1082 = c10825;
                            list = list5;
                            list3 = list8;
                            c10823 = c108212;
                            c10824 = c108211;
                            set = set2;
                            C2218 c221832 = this.this$0;
                            synchronized (c221832.f4341) {
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            }
            C1082 c108213 = (C1082) this.L$8;
            set = (Set) this.L$7;
            c10823 = (C1082) this.L$6;
            c10824 = (C1082) this.L$5;
            C1082 c108214 = (C1082) this.L$4;
            List list9 = (List) this.L$3;
            list2 = (List) this.L$2;
            List list10 = (List) this.L$1;
            InterfaceC2139 interfaceC21394 = (InterfaceC2139) this.L$0;
            AbstractC6017.m10769(obj);
            c10826 = c108213;
            interfaceC2139 = interfaceC21394;
            list4 = list9;
            list5 = list10;
            c10825 = c108214;
            final Set set22 = set;
            final C1082 c1082112 = c10824;
            final C1082 c1082122 = c10823;
            c2218 = this.this$0;
            C6099 c60992 = C2218.f4335;
            if (c2218.m3071()) {
            }
        }
    }
}
