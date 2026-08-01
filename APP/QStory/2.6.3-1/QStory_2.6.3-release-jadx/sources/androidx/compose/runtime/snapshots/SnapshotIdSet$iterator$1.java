package androidx.compose.runtime.snapshots;

import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5957;
import lin.xposed.BuildConfig;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m556f = "SnapshotIdSet.kt", m557l = {Opcodes.INVOKE_CUSTOM, 256, BuildConfig.VERSION_CODE}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C2122 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(C2122 c2122, InterfaceC5189<? super SnapshotIdSet$iterator$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c2122;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, interfaceC5189);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SnapshotIdSet$iterator$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r15.mo10680(r9, r20) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (r13.mo10680(r9, r20) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:19:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:30:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a9 -> B:30:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c4 -> B:43:0x00e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e1 -> B:42:0x00e2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC5957 abstractC5957;
        AbstractC5957 abstractC59572;
        int length;
        long[] jArr;
        int i;
        long j;
        AbstractC5957 abstractC59573;
        int i2;
        AbstractC5957 abstractC59574;
        int i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            AbstractC6017.m10769(obj);
            abstractC5957 = (AbstractC5957) this.L$0;
            long[] jArr2 = this.this$0.f4110;
            if (jArr2 != null) {
                abstractC59572 = abstractC5957;
                length = jArr2.length;
                jArr = jArr2;
                i = 0;
                if (i < length) {
                }
            }
            j = 1;
            if (this.this$0.f4111 != 0) {
            }
            if (this.this$0.f4113 != 0) {
            }
            return C6008.f15084;
        }
        if (i4 == 1) {
            length = this.I$1;
            i = this.I$0;
            jArr = (long[]) this.L$1;
            abstractC59572 = (AbstractC5957) this.L$0;
            AbstractC6017.m10769(obj);
            i++;
            if (i < length) {
                abstractC5957 = abstractC59572;
                j = 1;
                if (this.this$0.f4111 != 0) {
                    abstractC59573 = abstractC5957;
                    i2 = 0;
                    if (i2 < 64) {
                    }
                }
                if (this.this$0.f4113 != 0) {
                }
                return C6008.f15084;
            }
            Long l = new Long(jArr[i]);
            this.L$0 = abstractC59572;
            this.L$1 = jArr;
            this.I$0 = i;
            this.I$1 = length;
            this.label = 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = this.I$0;
                abstractC59574 = (AbstractC5957) this.L$0;
                AbstractC6017.m10769(obj);
                j = 1;
                i3 = i5;
                i3++;
                if (i3 < 64) {
                    C2122 c2122 = this.this$0;
                    if ((c2122.f4113 & (j << i3)) != 0) {
                        Long l2 = new Long(c2122.f4112 + ((long) i3) + 64);
                        this.L$0 = abstractC59574;
                        this.L$1 = null;
                        this.I$0 = i3;
                        this.label = 3;
                        if (abstractC59574.mo10680(l2, this) != coroutineSingletons) {
                            i5 = i3;
                            i3 = i5;
                        }
                        return coroutineSingletons;
                    }
                    i3++;
                    if (i3 < 64) {
                    }
                }
                return C6008.f15084;
            }
            i2 = this.I$0;
            abstractC59573 = (AbstractC5957) this.L$0;
            AbstractC6017.m10769(obj);
            j = 1;
            i2++;
            if (i2 < 64) {
                C2122 c21222 = this.this$0;
                if ((c21222.f4111 & (j << i2)) != 0) {
                    Long l3 = new Long(c21222.f4112 + ((long) i2));
                    this.L$0 = abstractC59573;
                    this.L$1 = null;
                    this.I$0 = i2;
                    this.label = 2;
                }
                i2++;
                if (i2 < 64) {
                    abstractC5957 = abstractC59573;
                    if (this.this$0.f4113 != 0) {
                        abstractC59574 = abstractC5957;
                        i3 = 0;
                        if (i3 < 64) {
                        }
                    }
                    return C6008.f15084;
                }
            }
        }
    }
}
