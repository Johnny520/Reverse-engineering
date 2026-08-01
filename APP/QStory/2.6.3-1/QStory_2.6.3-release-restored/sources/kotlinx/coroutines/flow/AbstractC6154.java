package kotlinx.coroutines.flow;

import androidx.compose.foundation.lazy.C1594;
import io.ktor.serialization.C4881;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.C6040;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.channels.InterfaceC6044;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import kotlinx.coroutines.flow.internal.C6060;
import kotlinx.coroutines.flow.internal.C6065;
import kotlinx.coroutines.flow.internal.C6068;
import kotlinx.coroutines.flow.internal.InterfaceC6062;
import kotlinx.coroutines.internal.C6183;
import lin.xposed.hook.javaplugin.C6385;
import p068.InterfaceC7383;
import p105.C8009;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5317 f15234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5317 f15235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5317 f15236;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8009 f15238 = new C8009(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1594 f15237 = new C1594(20);

    static {
        int i = 1;
        f15236 = new C5317("NO_VALUE", i);
        f15235 = new C5317("NONE", i);
        f15234 = new C5317("PENDING", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC6151 m10887(InterfaceC6151 interfaceC6151) {
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        return interfaceC6151 instanceof InterfaceC6062 ? InterfaceC6062.m10866((InterfaceC6062) interfaceC6151, null, 0, bufferOverflow, 1) : new C6065(interfaceC6151, 0, bufferOverflow, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m10888(ContinuationImpl continuationImpl) {
        FlowKt__LogicKt$any$1 flowKt__LogicKt$any$1;
        C6178 c6178;
        Ref$BooleanRef ref$BooleanRef;
        AbortFlowException e;
        if (continuationImpl instanceof FlowKt__LogicKt$any$1) {
            flowKt__LogicKt$any$1 = (FlowKt__LogicKt$any$1) continuationImpl;
            int i = flowKt__LogicKt$any$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LogicKt$any$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LogicKt$any$1 = new FlowKt__LogicKt$any$1(continuationImpl);
            }
        }
        Object obj = flowKt__LogicKt$any$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LogicKt$any$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6178 = (C6178) flowKt__LogicKt$any$1.L$4;
            ref$BooleanRef = (Ref$BooleanRef) flowKt__LogicKt$any$1.L$2;
            try {
                AbstractC6017.m10769(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.owner == c6178) {
                }
            }
            return Boolean.valueOf(ref$BooleanRef.element);
        }
        AbstractC6017.m10769(obj);
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        c6178 = new C6178(ref$BooleanRef2);
        try {
            flowKt__LogicKt$any$1.L$0 = null;
            flowKt__LogicKt$any$1.L$1 = null;
            flowKt__LogicKt$any$1.L$2 = ref$BooleanRef2;
            flowKt__LogicKt$any$1.L$3 = null;
            flowKt__LogicKt$any$1.L$4 = c6178;
            flowKt__LogicKt$any$1.I$0 = 0;
            flowKt__LogicKt$any$1.label = 1;
            throw null;
        } catch (AbortFlowException e3) {
            ref$BooleanRef = ref$BooleanRef2;
            e = e3;
        }
        if (e.owner == c6178) {
            throw e;
        }
        AbstractC6231.m11061(flowKt__LogicKt$any$1.getContext());
        return Boolean.valueOf(ref$BooleanRef.element);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m10889(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons m10890(InterfaceC6150 interfaceC6150, Object obj, Object obj2, ContinuationImpl continuationImpl) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (continuationImpl instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuationImpl;
            int i = flowKt__LimitKt$emitAbort$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuationImpl);
            }
        }
        Object obj3 = flowKt__LimitKt$emitAbort$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$emitAbort$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj3);
            flowKt__LimitKt$emitAbort$1.L$0 = null;
            flowKt__LimitKt$emitAbort$1.L$1 = null;
            flowKt__LimitKt$emitAbort$1.L$2 = obj2;
            flowKt__LimitKt$emitAbort$1.label = 1;
            if (interfaceC6150.emit(obj, flowKt__LimitKt$emitAbort$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = flowKt__LimitKt$emitAbort$1.L$2;
            AbstractC6017.m10769(obj3);
        }
        throw new AbortFlowException(obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6099 m10891(Object obj) {
        if (obj == null) {
            obj = AbstractC6051.f15152;
        }
        return new C6099(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6119 m10892(int i, BufferOverflow bufferOverflow) {
        int i2 = (i & 1) != 0 ? 0 : 1;
        int i3 = (i & 2) == 0 ? 16 : 0;
        if (i2 <= 0 && i3 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            C6385.m11431(bufferOverflow, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new C6119(i2, i4, bufferOverflow);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6101 m10893(C6116 c6116) {
        InterfaceC6039.f15139.getClass();
        C6040 c6040 = C6040.f15141;
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        return new C6101(c6116, EmptyCoroutineContext.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m10894(InterfaceC6151 interfaceC6151, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        int i = AbstractC6161.f15245;
        Object objMo9012 = m10887(new C6068(new FlowKt__MergeKt$mapLatest$1(interfaceC7383, null), interfaceC6151, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND)).mo9012(C6060.f15166, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C6008 c6008 = C6008.f15084;
        if (objMo9012 != coroutineSingletons) {
            objMo9012 = c6008;
        }
        return objMo9012 == coroutineSingletons ? objMo9012 : c6008;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m10895(C4881 c4881, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        InterfaceC6150 interfaceC6150;
        if (continuationImpl instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) continuationImpl;
            int i = flowKt__ReduceKt$firstOrNull$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuationImpl);
            }
        }
        Object obj = flowKt__ReduceKt$firstOrNull$3.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$firstOrNull$3.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            InterfaceC6150 c6157 = new C6157(interfaceC7383, ref$ObjectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$3.L$0 = null;
                flowKt__ReduceKt$firstOrNull$3.L$1 = null;
                flowKt__ReduceKt$firstOrNull$3.L$2 = ref$ObjectRef2;
                flowKt__ReduceKt$firstOrNull$3.L$3 = null;
                flowKt__ReduceKt$firstOrNull$3.L$4 = c6157;
                flowKt__ReduceKt$firstOrNull$3.I$0 = 0;
                flowKt__ReduceKt$firstOrNull$3.label = 1;
                if (c4881.mo9012(c6157, flowKt__ReduceKt$firstOrNull$3) == obj2) {
                    return obj2;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e2) {
                ref$ObjectRef = ref$ObjectRef2;
                e = e2;
                interfaceC6150 = c6157;
                if (e.owner == interfaceC6150) {
                }
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6150 = (C6157) flowKt__ReduceKt$firstOrNull$3.L$4;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$firstOrNull$3.L$2;
            try {
                AbstractC6017.m10769(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.owner == interfaceC6150) {
                    throw e;
                }
                AbstractC6231.m11061(flowKt__ReduceKt$firstOrNull$3.getContext());
            }
        }
        return ref$ObjectRef.element;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C6128 m10896(C6116 c6116, C6183 c6183, C6097 c6097, Float f) {
        C6101 c6101M10893 = m10893(c6116);
        C6099 c6099M10891 = m10891(f);
        return new C6128(c6099M10891, AbstractC6231.m11037(c6183, c6101M10893.f15201, c6097.equals(C6100.f15200) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(c6097, c6101M10893.f15202, c6099M10891, f, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0035, B:25:0x0060, B:29:0x0079, B:31:0x0081, B:20:0x0051, B:24:0x005c), top: B:46:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0097 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m10897(InterfaceC6150 interfaceC6150, InterfaceC6031 interfaceC6031, boolean z, InterfaceC5189 interfaceC5189) {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        InterfaceC6044 interfaceC6044;
        InterfaceC6150 interfaceC61502;
        InterfaceC6044 it;
        Object objM10823;
        if (interfaceC5189 instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
            flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1) interfaceC5189;
            int i = flowKt__ChannelsKt$emitAllImpl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ChannelsKt$emitAllImpl$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(interfaceC5189);
            }
        }
        Object obj = flowKt__ChannelsKt$emitAllImpl$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ChannelsKt$emitAllImpl$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                if (interfaceC6150 instanceof AbstractC6107) {
                    throw null;
                }
                it = interfaceC6031.iterator();
                flowKt__ChannelsKt$emitAllImpl$1.L$0 = interfaceC6150;
                flowKt__ChannelsKt$emitAllImpl$1.L$1 = interfaceC6031;
                flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                flowKt__ChannelsKt$emitAllImpl$1.L$3 = null;
                flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                C6023 c6023 = (C6023) it;
                objM10823 = c6023.m10823(flowKt__ChannelsKt$emitAllImpl$1);
                if (objM10823 != coroutineSingletons) {
                }
            } else if (i2 == 1) {
                z = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                interfaceC6044 = (InterfaceC6044) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                interfaceC6031 = (InterfaceC6031) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                interfaceC61502 = (InterfaceC6150) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                AbstractC6017.m10769(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                InterfaceC6044 interfaceC60442 = (InterfaceC6044) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                interfaceC6031 = (InterfaceC6031) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                interfaceC61502 = (InterfaceC6150) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                AbstractC6017.m10769(obj);
                InterfaceC6044 interfaceC60443 = interfaceC60442;
                it = interfaceC60443;
                interfaceC6150 = interfaceC61502;
                flowKt__ChannelsKt$emitAllImpl$1.L$0 = interfaceC6150;
                flowKt__ChannelsKt$emitAllImpl$1.L$1 = interfaceC6031;
                flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                flowKt__ChannelsKt$emitAllImpl$1.L$3 = null;
                flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                C6023 c60232 = (C6023) it;
                objM10823 = c60232.m10823(flowKt__ChannelsKt$emitAllImpl$1);
                if (objM10823 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC61502 = interfaceC6150;
                interfaceC6044 = c60232;
                obj = objM10823;
                if (((Boolean) obj).booleanValue()) {
                    if (z) {
                        interfaceC6031.mo10815(null);
                    }
                    return C6008.f15084;
                }
                C6023 c60233 = (C6023) interfaceC6044;
                Object objM10821 = c60233.m10821();
                flowKt__ChannelsKt$emitAllImpl$1.L$0 = interfaceC61502;
                flowKt__ChannelsKt$emitAllImpl$1.L$1 = interfaceC6031;
                flowKt__ChannelsKt$emitAllImpl$1.L$2 = c60233;
                flowKt__ChannelsKt$emitAllImpl$1.L$3 = null;
                flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                flowKt__ChannelsKt$emitAllImpl$1.label = 2;
                interfaceC60443 = c60233;
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m10898(InterfaceC6151 interfaceC6151, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        InterfaceC6150 interfaceC6150;
        ?? r0 = AbstractC6051.f15152;
        if (continuationImpl instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuationImpl;
            int i = flowKt__ReduceKt$first$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuationImpl);
            }
        }
        Object obj = flowKt__ReduceKt$first$3.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$first$3.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = r0;
            InterfaceC6150 c6159 = new C6159(interfaceC7383, ref$ObjectRef2);
            try {
                flowKt__ReduceKt$first$3.L$0 = null;
                flowKt__ReduceKt$first$3.L$1 = null;
                flowKt__ReduceKt$first$3.L$2 = ref$ObjectRef2;
                flowKt__ReduceKt$first$3.L$3 = null;
                flowKt__ReduceKt$first$3.L$4 = c6159;
                flowKt__ReduceKt$first$3.I$0 = 0;
                flowKt__ReduceKt$first$3.label = 1;
                if (interfaceC6151.mo9012(c6159, flowKt__ReduceKt$first$3) == obj2) {
                    return obj2;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e2) {
                ref$ObjectRef = ref$ObjectRef2;
                e = e2;
                interfaceC6150 = c6159;
                if (e.owner == interfaceC6150) {
                    throw e;
                }
                AbstractC6231.m11061(flowKt__ReduceKt$first$3.getContext());
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6150 = (C6159) flowKt__ReduceKt$first$3.L$4;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$3.L$2;
            try {
                AbstractC6017.m10769(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.owner == interfaceC6150) {
                }
            }
        }
        T t = ref$ObjectRef.element;
        if (t != r0) {
            return t;
        }
        C5043.m9176("Expected at least one element matching the predicate");
        return null;
    }
}
