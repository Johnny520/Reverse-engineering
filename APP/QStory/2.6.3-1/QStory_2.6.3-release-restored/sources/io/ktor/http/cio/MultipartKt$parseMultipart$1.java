package io.ktor.http.cio;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5074;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5084;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.InterfaceC6273;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.p010io.InterfaceC6313;
import p068.InterfaceC7383;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import p110.C8034;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", m556f = "Multipart.kt", m557l = {184, 187, 190, 191, 196, 200, Opcodes.REM_DOUBLE_2ADDR, Opcodes.DIV_INT_LIT8, Opcodes.REM_INT_LIT8, 227, 227, 230, 232}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lio/ktor/http/cio/飘花落叶言子楪哲苏世兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class MultipartKt$parseMultipart$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C8034 $boundaryPrefixed;
    final /* synthetic */ InterfaceC5084 $input;
    final /* synthetic */ long $maxPartSize;
    final /* synthetic */ Long $totalLength;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$parseMultipart$1(InterfaceC5084 interfaceC5084, C8034 c8034, long j, Long l, InterfaceC5189<? super MultipartKt$parseMultipart$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$input = interfaceC5084;
        this.$boundaryPrefixed = c8034;
        this.$maxPartSize = j;
        this.$totalLength = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MultipartKt$parseMultipart$1 multipartKt$parseMultipart$1 = new MultipartKt$parseMultipart$1(this.$input, this.$boundaryPrefixed, this.$maxPartSize, this.$totalLength, interfaceC5189);
        multipartKt$parseMultipart$1.L$0 = obj;
        return multipartKt$parseMultipart$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MultipartKt$parseMultipart$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x02df, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC6043) r0).f15143.mo8992(r2, r20) != r7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0312, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC6043) r0).f15143.mo8992(r2, r20) == r7) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096 A[PHI: r0 r2 r3 r4 r5 r10 r13
  0x0096: PHI (r0v20 long) = (r0v14 long), (r0v32 long) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r2v30 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) = (r2v27 io.ktor.utils.io.飘花落叶言子楪兰苏哲世), (r2v40 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r3v21 kotlinx.coroutines.飘花落叶言子楪哲苏兰世) = (r3v15 kotlinx.coroutines.飘花落叶言子楪哲苏兰世), (r3v25 kotlinx.coroutines.飘花落叶言子楪哲苏兰世) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r4v16 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) = (r4v11 io.ktor.utils.io.飘花落叶言子楪苏世兰哲), (r4v21 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r5v4 java.lang.Object) = (r5v3 java.lang.Object), (r5v9 java.lang.Object) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r10v2 long) = (r10v0 long), (r10v4 long) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r13v8 java.lang.Object) = (r13v7 java.lang.Object), (r13v11 java.lang.Object) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0176 A[PHI: r0 r3 r4 r9 r10
  0x0176: PHI (r0v39 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) = (r0v4 io.ktor.utils.io.飘花落叶言子楪兰苏哲世), (r0v9 io.ktor.utils.io.飘花落叶言子楪兰苏哲世), (r0v40 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) binds: [B:37:0x0155, B:42:0x0174, B:72:0x022d] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r3v30 java.lang.Object) = (r3v2 java.lang.Object), (r3v4 java.lang.Object), (r3v31 java.lang.Object) binds: [B:37:0x0155, B:42:0x0174, B:72:0x022d] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r4v25 long) = (r4v1 long), (r4v5 long), (r4v27 long) binds: [B:37:0x0155, B:42:0x0174, B:72:0x022d] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r9v11 int) = (r9v0 int), (r9v0 int), (r9v13 int) binds: [B:37:0x0155, B:42:0x0174, B:72:0x022d] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r10v7 long) = (r10v0 long), (r10v0 long), (r10v8 long) binds: [B:37:0x0155, B:42:0x0174, B:72:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0266 A[PHI: r0 r3 r4 r10
  0x0266: PHI (r0v15 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) = (r0v35 io.ktor.utils.io.飘花落叶言子楪兰苏哲世), (r0v39 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) binds: [B:94:0x0265, B:44:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0266: PHI (r3v16 java.lang.Object) = (r3v29 java.lang.Object), (r3v30 java.lang.Object) binds: [B:94:0x0265, B:44:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0266: PHI (r4v12 long) = (r4v24 long), (r4v25 long) binds: [B:94:0x0265, B:44:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0266: PHI (r10v1 long) = (r10v6 long), (r10v7 long) binds: [B:94:0x0265, B:44:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0282  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0226 -> B:129:0x022a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        Object objM9232;
        Object obj2;
        C5074 c5074;
        InterfaceC6313 interfaceC6313;
        C5074 c50742;
        long j2;
        C5074 c50743;
        Object objM9218;
        long j3;
        Object obj3;
        InterfaceC6273 interfaceC6273;
        C5081 c5081;
        Object objM8923;
        long j4;
        C8034 c8034;
        C5074 c50744;
        long j5;
        InterfaceC6273 interfaceC62732;
        long j6;
        InterfaceC6273 interfaceC62733;
        C4806 c4806;
        C5081 c50812;
        long j7;
        C4806 c48062;
        C4796 c4796;
        C8034 c80342;
        C5074 c50745;
        long j8;
        Object obj4;
        Object objM92322;
        Object objM9229;
        InterfaceC6313 interfaceC63132;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = 3;
        long j9 = 0;
        C4806 c48063 = null;
        switch (this.label) {
            case 0:
                AbstractC6017.m10769(obj);
                InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
                InterfaceC5084 interfaceC5084 = this.$input;
                interfaceC5084.getClass();
                C5074 c50746 = new C5074(interfaceC5084);
                c50746.m9215();
                j = c50746.f13091;
                C8034 c80343 = this.$boundaryPrefixed;
                int length = AbstractC4801.f12551.f19567.length;
                byte[] bArr = c80343.f19567;
                int length2 = bArr.length;
                C5081 c50813 = AbstractC5078.m9254(interfaceC6028, null, new MultipartKt$parseMultipart$1$preambleData$1(length == length2 ? C8034.f19565 : new C8034(bArr, length, length2), c50746, null), 3).f13073;
                this.L$0 = interfaceC6028;
                this.L$1 = c50746;
                this.J$0 = j;
                this.label = 1;
                objM9232 = AbstractC5076.m9232(c50813, this);
                if (objM9232 != coroutineSingletons) {
                    obj2 = interfaceC6028;
                    c5074 = c50746;
                    interfaceC6313 = (InterfaceC6313) objM9232;
                    if (AbstractC7684.m12638(interfaceC6313) <= 0) {
                        C4797 c4797 = new C4797(interfaceC6313, 1);
                        this.L$0 = obj2;
                        this.L$1 = c5074;
                        this.J$0 = j;
                        this.label = 2;
                        if (((AbstractC6043) obj2).f15143.mo8992(c4797, this) != coroutineSingletons) {
                            c50742 = c5074;
                            j2 = j;
                            j = j2;
                            c5074 = c50742;
                            if (!c5074.mo9200()) {
                                C8034 c80344 = AbstractC4801.f12551;
                                this.L$0 = obj2;
                                this.L$1 = c5074;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.J$0 = j;
                                this.label = i;
                                objM9218 = AbstractC5076.m9218(c5074, c80344, this);
                                if (objM9218 != coroutineSingletons) {
                                    c50743 = c5074;
                                    if (((Boolean) objM9218).booleanValue()) {
                                        C8034 c80345 = AbstractC4801.f12552;
                                        this.L$0 = obj2;
                                        this.L$1 = c50743;
                                        this.J$0 = j;
                                        this.label = 4;
                                        if (AbstractC5076.m9218(c50743, c80345, this) != coroutineSingletons) {
                                            j3 = j;
                                            obj3 = obj2;
                                            C5081 c50814 = new C5081(false);
                                            C6270 c6270M11049 = AbstractC6231.m11049();
                                            c4796 = new C4796(c6270M11049, c50814);
                                            this.L$0 = obj3;
                                            this.L$1 = c50743;
                                            this.L$2 = c50814;
                                            this.L$3 = c6270M11049;
                                            this.J$0 = j3;
                                            this.label = 5;
                                            if (((AbstractC6043) obj3).f15143.mo8992(c4796, this) != coroutineSingletons) {
                                                c5081 = c50814;
                                                interfaceC6273 = c6270M11049;
                                                this.L$0 = obj3;
                                                this.L$1 = c50743;
                                                this.L$2 = c5081;
                                                this.L$3 = interfaceC6273;
                                                this.J$0 = j3;
                                                this.label = 6;
                                                objM8923 = AbstractC4801.m8923(c50743, this);
                                                if (objM8923 != coroutineSingletons) {
                                                    try {
                                                        j6 = j3;
                                                        C5074 c50747 = c50743;
                                                        interfaceC62733 = interfaceC6273;
                                                        Object obj5 = obj3;
                                                        try {
                                                            if (((C6270) interfaceC62733).m11147(c4806)) {
                                                                interfaceC62732 = interfaceC62733;
                                                                c50812 = c5081;
                                                                c4806.m8936();
                                                                throw new CancellationException("Multipart processing has been cancelled");
                                                            }
                                                            try {
                                                                try {
                                                                    C8034 c80346 = this.$boundaryPrefixed;
                                                                    j7 = j9;
                                                                    long j10 = this.$maxPartSize;
                                                                    this.L$0 = obj5;
                                                                    this.L$1 = c50747;
                                                                    this.L$2 = c5081;
                                                                    this.L$3 = interfaceC62733;
                                                                    this.L$4 = c4806;
                                                                    this.J$0 = j6;
                                                                    this.label = 7;
                                                                    if (AbstractC4801.m8924(c80346, c50747, c50812, c4806, j10, this) != coroutineSingletons) {
                                                                        c5074 = c50747;
                                                                        c5081 = c50812;
                                                                        c48062 = c4806;
                                                                        obj2 = obj5;
                                                                        try {
                                                                            c5081.m9257();
                                                                            j = j6;
                                                                            j9 = j7;
                                                                            i = 3;
                                                                            if (!c5074.mo9200()) {
                                                                                j4 = j9;
                                                                                c8034 = AbstractC4801.f12552;
                                                                                this.L$0 = obj2;
                                                                                this.L$1 = c5074;
                                                                                this.L$2 = null;
                                                                                this.L$3 = null;
                                                                                this.L$4 = null;
                                                                                this.J$0 = j;
                                                                                this.label = 8;
                                                                                if (AbstractC5076.m9218(c5074, c8034, this) != coroutineSingletons) {
                                                                                    c50744 = c5074;
                                                                                    j5 = j;
                                                                                    c80342 = AbstractC4801.f12552;
                                                                                    this.L$0 = obj2;
                                                                                    this.L$1 = c50744;
                                                                                    this.J$0 = j5;
                                                                                    this.label = 9;
                                                                                    if (AbstractC5076.m9218(c50744, c80342, this) != coroutineSingletons) {
                                                                                        Object obj6 = obj2;
                                                                                        c50745 = c50744;
                                                                                        j8 = j5;
                                                                                        obj4 = obj6;
                                                                                        if (this.$totalLength == null) {
                                                                                            c50745.m9215();
                                                                                            long jLongValue = this.$totalLength.longValue() - (c50745.f13091 - j8);
                                                                                            if (jLongValue > 2147483647L) {
                                                                                                C6755.m11866("Failed to parse multipart: prologue is too long");
                                                                                                return null;
                                                                                            }
                                                                                            if (jLongValue > j4) {
                                                                                                this.L$0 = obj4;
                                                                                                this.L$1 = null;
                                                                                                this.label = 10;
                                                                                                objM9229 = AbstractC5076.m9229(c50745, (int) jLongValue, this);
                                                                                                if (objM9229 != coroutineSingletons) {
                                                                                                    C4797 c47972 = new C4797((InterfaceC6313) objM9229, 0);
                                                                                                    this.L$0 = null;
                                                                                                    this.label = 11;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            return C6008.f15084;
                                                                                        }
                                                                                        this.L$0 = obj4;
                                                                                        this.L$1 = null;
                                                                                        this.label = 12;
                                                                                        objM92322 = AbstractC5076.m9232(c50745, this);
                                                                                        if (objM92322 != coroutineSingletons) {
                                                                                            interfaceC63132 = (InterfaceC6313) objM92322;
                                                                                            if (!interfaceC63132.mo11163()) {
                                                                                                C4797 c47973 = new C4797(interfaceC63132, 0);
                                                                                                this.L$0 = null;
                                                                                                this.label = 13;
                                                                                                break;
                                                                                            }
                                                                                            return C6008.f15084;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            c48063 = c48062;
                                                                        }
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                }
                                                                interfaceC62732 = interfaceC62733;
                                                                c50812 = c5081;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                interfaceC62732 = interfaceC62733;
                                                            }
                                                            th = th2;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            interfaceC62732 = interfaceC62733;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        interfaceC62732 = interfaceC62733;
                                                        c50812 = c5081;
                                                    }
                                                    c4806 = (C4806) objM8923;
                                                    c5081 = c50812;
                                                    c48063 = c4806;
                                                    interfaceC6273 = interfaceC62732;
                                                    if (((C6270) interfaceC6273).m11088(th) && c48063 != null) {
                                                        c48063.m8936();
                                                    }
                                                    AbstractC5078.m9251(c5081, th);
                                                    throw th;
                                                }
                                            }
                                        }
                                    } else {
                                        c5074 = c50743;
                                        j4 = j9;
                                        c8034 = AbstractC4801.f12552;
                                        this.L$0 = obj2;
                                        this.L$1 = c5074;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.J$0 = j;
                                        this.label = 8;
                                        if (AbstractC5076.m9218(c5074, c8034, this) != coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!c5074.mo9200()) {
                    }
                }
                return coroutineSingletons;
            case 1:
                long j11 = this.J$0;
                c5074 = (C5074) this.L$1;
                InterfaceC6028 interfaceC60282 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
                obj2 = interfaceC60282;
                j = j11;
                objM9232 = obj;
                interfaceC6313 = (InterfaceC6313) objM9232;
                if (AbstractC7684.m12638(interfaceC6313) <= 0) {
                }
                return coroutineSingletons;
            case 2:
                j2 = this.J$0;
                c50742 = (C5074) this.L$1;
                obj2 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
                j = j2;
                c5074 = c50742;
                if (!c5074.mo9200()) {
                }
                return coroutineSingletons;
            case 3:
                long j12 = this.J$0;
                c50743 = (C5074) this.L$1;
                obj2 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
                j = j12;
                objM9218 = obj;
                if (((Boolean) objM9218).booleanValue()) {
                }
                break;
            case 4:
                j3 = this.J$0;
                c50743 = (C5074) this.L$1;
                obj2 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
                obj3 = obj2;
                C5081 c508142 = new C5081(false);
                C6270 c6270M110492 = AbstractC6231.m11049();
                c4796 = new C4796(c6270M110492, c508142);
                this.L$0 = obj3;
                this.L$1 = c50743;
                this.L$2 = c508142;
                this.L$3 = c6270M110492;
                this.J$0 = j3;
                this.label = 5;
                if (((AbstractC6043) obj3).f15143.mo8992(c4796, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                j3 = this.J$0;
                InterfaceC6273 interfaceC62734 = (InterfaceC6273) this.L$3;
                C5081 c50815 = (C5081) this.L$2;
                C5074 c50748 = (C5074) this.L$1;
                obj3 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
                interfaceC6273 = interfaceC62734;
                c50743 = c50748;
                c5081 = c50815;
                this.L$0 = obj3;
                this.L$1 = c50743;
                this.L$2 = c5081;
                this.L$3 = interfaceC6273;
                this.J$0 = j3;
                this.label = 6;
                objM8923 = AbstractC4801.m8923(c50743, this);
                if (objM8923 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                j3 = this.J$0;
                interfaceC6273 = (InterfaceC6273) this.L$3;
                c5081 = (C5081) this.L$2;
                c50743 = (C5074) this.L$1;
                obj3 = (InterfaceC6028) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    objM8923 = obj;
                    j6 = j3;
                    C5074 c507472 = c50743;
                    interfaceC62733 = interfaceC6273;
                    Object obj52 = obj3;
                    c4806 = (C4806) objM8923;
                    if (((C6270) interfaceC62733).m11147(c4806)) {
                    }
                    th = th2;
                    c5081 = c50812;
                    c48063 = c4806;
                } catch (Throwable th6) {
                    th = th6;
                }
                interfaceC6273 = interfaceC62732;
                if (((C6270) interfaceC6273).m11088(th)) {
                    c48063.m8936();
                }
                AbstractC5078.m9251(c5081, th);
                throw th;
            case 7:
                long j13 = this.J$0;
                c48062 = (C4806) this.L$4;
                interfaceC6273 = (InterfaceC6273) this.L$3;
                c5081 = (C5081) this.L$2;
                C5074 c50749 = (C5074) this.L$1;
                InterfaceC6028 interfaceC60283 = (InterfaceC6028) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    j6 = j13;
                    interfaceC62732 = interfaceC6273;
                    c5074 = c50749;
                    j7 = 0;
                    obj2 = interfaceC60283;
                    c5081.m9257();
                    j = j6;
                    j9 = j7;
                    i = 3;
                    if (!c5074.mo9200()) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th7) {
                    th = th7;
                    c48063 = c48062;
                }
                break;
            case 8:
                j5 = this.J$0;
                c50744 = (C5074) this.L$1;
                obj2 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
                j4 = 0;
                c80342 = AbstractC4801.f12552;
                this.L$0 = obj2;
                this.L$1 = c50744;
                this.J$0 = j5;
                this.label = 9;
                if (AbstractC5076.m9218(c50744, c80342, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 9:
                long j14 = this.J$0;
                C5074 c507410 = (C5074) this.L$1;
                InterfaceC6028 interfaceC60284 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
                c50745 = c507410;
                j8 = j14;
                obj4 = interfaceC60284;
                j4 = 0;
                if (this.$totalLength == null) {
                }
                return coroutineSingletons;
            case 10:
                obj4 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
                objM9229 = obj;
                C4797 c479722 = new C4797((InterfaceC6313) objM9229, 0);
                this.L$0 = null;
                this.label = 11;
                break;
            case 11:
            case 13:
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            case 12:
                obj4 = (InterfaceC6028) this.L$0;
                AbstractC6017.m10769(obj);
                objM92322 = obj;
                interfaceC63132 = (InterfaceC6313) objM92322;
                if (!interfaceC63132.mo11163()) {
                }
                return C6008.f15084;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
