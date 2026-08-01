package io.ktor.client.utils;

import com.alibaba.fastjson2.C3775;
import io.ktor.client.content.InterfaceC4701;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p073.AbstractC7683;
import p073.InterfaceC7680;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", m556f = "ByteChannelUtils.kt", m557l = {22, 24, 26, 31}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ByteChannelUtilsKt$observable$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Long $contentLength;
    final /* synthetic */ InterfaceC4701 $listener;
    final /* synthetic */ InterfaceC5084 $this_observable;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelUtilsKt$observable$1(InterfaceC5084 interfaceC5084, InterfaceC4701 interfaceC4701, Long l, InterfaceC5189<? super ByteChannelUtilsKt$observable$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_observable = interfaceC5084;
        this.$contentLength = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ByteChannelUtilsKt$observable$1 byteChannelUtilsKt$observable$1 = new ByteChannelUtilsKt$observable$1(this.$this_observable, null, this.$contentLength, interfaceC5189);
        byteChannelUtilsKt$observable$1.L$0 = obj;
        return byteChannelUtilsKt$observable$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ByteChannelUtilsKt$observable$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Path cross not found for [B:4:0x000d, B:43:0x00c1], limit reached: 84 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:46:0x00dc, B:48:0x00e2, B:51:0x00fc, B:53:0x0104, B:57:0x012b, B:58:0x013f, B:61:0x0144, B:66:0x0154, B:67:0x0164), top: B:75:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:46:0x00dc, B:48:0x00e2, B:51:0x00fc, B:53:0x0104, B:57:0x012b, B:58:0x013f, B:61:0x0144, B:66:0x0154, B:67:0x0164), top: B:75:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:46:0x00dc, B:48:0x00e2, B:51:0x00fc, B:53:0x0104, B:57:0x012b, B:58:0x013f, B:61:0x0144, B:66:0x0154, B:67:0x0164), top: B:75:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc A[EXC_TOP_SPLITTER, PHI: r2 r3 r4 r10 r13 r14 r15 r16
  0x00dc: PHI (r2v9 byte[]) = (r2v3 byte[]), (r2v7 byte[]), (r2v20 byte[]) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r3v3 io.ktor.utils.io.飘花落叶言子世楪兰苏哲) = (r3v1 io.ktor.utils.io.飘花落叶言子世楪兰苏哲), (r3v2 io.ktor.utils.io.飘花落叶言子世楪兰苏哲), (r3v6 io.ktor.utils.io.飘花落叶言子世楪兰苏哲) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r4v3 java.lang.Object) = (r4v0 java.lang.Object), (r4v2 java.lang.Object), (r4v10 java.lang.Object) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r10v4 long) = (r10v2 long), (r10v3 long), (r10v9 long) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r13v2 java.lang.Long) = (r13v0 java.lang.Long), (r13v1 java.lang.Long), (r13v7 java.lang.Long) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r14v2 io.ktor.utils.io.飘花落叶言子楪苏兰哲世) = (r14v0 io.ktor.utils.io.飘花落叶言子楪苏兰哲世), (r14v1 io.ktor.utils.io.飘花落叶言子楪苏兰哲世), (r14v8 io.ktor.utils.io.飘花落叶言子楪苏兰哲世) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r15v4 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏) = (r15v0 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏), (r15v3 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏), (r15v9 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r16v2 long) = (r16v0 long), (r16v1 long), (r16v4 long) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0102 -> B:75:0x00dc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        C5058 c5058;
        InterfaceC7680 interfaceC7680;
        InterfaceC5084 interfaceC5084;
        Long l;
        Object objMo8894;
        Object obj2;
        InterfaceC7680 interfaceC76802;
        byte[] bArr;
        long j2;
        C5058 c50582;
        InterfaceC5084 interfaceC50842;
        Long l2;
        byte[] bArr2;
        long j3;
        int i;
        Object objM9234;
        int iIntValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                j = 0;
                long j4 = this.J$0;
                byte[] bArr3 = (byte[]) this.L$6;
                Object obj3 = this.L$5;
                Long l3 = (Long) this.L$4;
                if (this.L$3 != null) {
                    C3775.m6954();
                    return null;
                }
                InterfaceC5084 interfaceC50843 = (InterfaceC5084) this.L$2;
                InterfaceC7680 interfaceC76803 = (InterfaceC7680) this.L$1;
                C5058 c50583 = (C5058) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    interfaceC76802 = interfaceC76803;
                    l = l3;
                    objM9234 = obj;
                    bArr = bArr3;
                    objMo8894 = obj3;
                    c5058 = c50583;
                    j2 = j4;
                    interfaceC5084 = interfaceC50843;
                    iIntValue = ((Number) objM9234).intValue();
                    if (iIntValue <= 0) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    th = th;
                    obj2 = obj3;
                    interfaceC7680 = interfaceC76803;
                }
            } else if (i2 == 2) {
                i = this.I$0;
                j3 = this.J$0;
                byte[] bArr4 = (byte[]) this.L$6;
                Object obj4 = this.L$5;
                l2 = (Long) this.L$4;
                if (this.L$3 != null) {
                    C3775.m6954();
                    return null;
                }
                interfaceC50842 = (InterfaceC5084) this.L$2;
                InterfaceC7680 interfaceC76804 = (InterfaceC7680) this.L$1;
                c50582 = (C5058) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    bArr2 = bArr4;
                    objMo8894 = obj4;
                    interfaceC76802 = interfaceC76804;
                    this.L$0 = c50582;
                    this.L$1 = interfaceC76802;
                    this.L$2 = interfaceC50842;
                    this.L$3 = null;
                    this.L$4 = l2;
                    this.L$5 = objMo8894;
                    this.L$6 = bArr2;
                    this.J$0 = j3 + ((long) i);
                    this.label = 3;
                    throw null;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = obj4;
                    interfaceC7680 = interfaceC76804;
                }
            } else if (i2 == 3) {
                j2 = this.J$0;
                bArr = (byte[]) this.L$6;
                Object obj5 = this.L$5;
                l = (Long) this.L$4;
                if (this.L$3 != null) {
                    C3775.m6954();
                    return null;
                }
                interfaceC5084 = (InterfaceC5084) this.L$2;
                interfaceC76802 = (InterfaceC7680) this.L$1;
                j = 0;
                c5058 = (C5058) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    objMo8894 = obj5;
                    try {
                        if (!interfaceC5084.mo9200()) {
                            this.L$0 = c5058;
                            this.L$1 = interfaceC76802;
                            this.L$2 = interfaceC5084;
                            this.L$3 = null;
                            this.L$4 = l;
                            this.L$5 = objMo8894;
                            this.L$6 = bArr;
                            this.J$0 = j2;
                            this.label = 1;
                            objM9234 = AbstractC5076.m9234(interfaceC5084, bArr, bArr.length, this);
                            if (objM9234 != coroutineSingletons) {
                                iIntValue = ((Number) objM9234).intValue();
                                if (iIntValue <= 0) {
                                    InterfaceC5079 interfaceC5079 = c5058.f13071;
                                    this.L$0 = c5058;
                                    this.L$1 = interfaceC76802;
                                    this.L$2 = interfaceC5084;
                                    this.L$3 = null;
                                    this.L$4 = l;
                                    this.L$5 = objMo8894;
                                    this.L$6 = bArr;
                                    this.J$0 = j2;
                                    this.I$0 = iIntValue;
                                    this.label = 2;
                                    if (AbstractC5078.m9248(interfaceC5079, bArr, 0, iIntValue, this) != coroutineSingletons) {
                                        bArr2 = bArr;
                                        i = iIntValue;
                                        l2 = l;
                                        interfaceC50842 = interfaceC5084;
                                        c50582 = c5058;
                                        j3 = j2;
                                        this.L$0 = c50582;
                                        this.L$1 = interfaceC76802;
                                        this.L$2 = interfaceC50842;
                                        this.L$3 = null;
                                        this.L$4 = l2;
                                        this.L$5 = objMo8894;
                                        this.L$6 = bArr2;
                                        this.J$0 = j3 + ((long) i);
                                        this.label = 3;
                                        throw null;
                                    }
                                } else if (!interfaceC5084.mo9200()) {
                                    Throwable thMo9203 = interfaceC5084.mo9203();
                                    AbstractC5078.m9251(c5058.f13071, thMo9203);
                                    if (thMo9203 == null && j2 == j) {
                                        this.L$0 = interfaceC76802;
                                        this.L$1 = objMo8894;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.label = 4;
                                        throw null;
                                    }
                                    obj2 = objMo8894;
                                    interfaceC7680 = interfaceC76802;
                                    interfaceC7680.mo8893(obj2);
                                    return C6008.f15084;
                                }
                            }
                            return coroutineSingletons;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = objMo8894;
                        interfaceC7680 = interfaceC76802;
                        interfaceC7680.mo8893(obj2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj2 = obj5;
                    interfaceC7680 = interfaceC76802;
                    interfaceC7680.mo8893(obj2);
                    throw th;
                }
            } else {
                if (i2 != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$1;
                interfaceC7680 = (InterfaceC7680) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    interfaceC7680.mo8893(obj2);
                    return C6008.f15084;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            interfaceC7680.mo8893(obj2);
            throw th;
        }
        j = 0;
        AbstractC6017.m10769(obj);
        c5058 = (C5058) this.L$0;
        interfaceC7680 = AbstractC7683.f18640;
        interfaceC5084 = this.$this_observable;
        l = this.$contentLength;
        objMo8894 = interfaceC7680.mo8894();
        try {
            interfaceC76802 = interfaceC7680;
            bArr = (byte[]) objMo8894;
            j2 = 0;
            if (!interfaceC5084.mo9200()) {
            }
        } catch (Throwable th6) {
            th = th6;
            obj2 = objMo8894;
        }
    }
}
