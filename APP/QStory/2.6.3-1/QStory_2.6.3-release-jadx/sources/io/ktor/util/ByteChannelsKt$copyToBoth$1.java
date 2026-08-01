package io.ktor.util;

import com.bumptech.glide.AbstractC3897;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;
import p068.InterfaceC7383;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", m556f = "ByteChannels.kt", m557l = {62, 64, 65, 79, 80, 79, 80, 79, 80}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ByteChannelsKt$copyToBoth$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5079 $first;
    final /* synthetic */ InterfaceC5079 $second;
    final /* synthetic */ InterfaceC5084 $this_copyToBoth;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelsKt$copyToBoth$1(InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, InterfaceC5079 interfaceC50792, InterfaceC5189<? super ByteChannelsKt$copyToBoth$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_copyToBoth = interfaceC5084;
        this.$first = interfaceC5079;
        this.$second = interfaceC50792;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ByteChannelsKt$copyToBoth$1(this.$this_copyToBoth, this.$first, this.$second, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ByteChannelsKt$copyToBoth$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r9).m9263(r8) != r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r9).m9263(r8) != r0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[Catch: all -> 0x006c, TryCatch #5 {all -> 0x006c, blocks: (B:46:0x00f5, B:26:0x0072, B:28:0x007a, B:30:0x0084, B:32:0x008e, B:35:0x00a7, B:51:0x00fd, B:52:0x0100, B:53:0x0101, B:61:0x012f, B:21:0x0068, B:36:0x00b0, B:45:0x00ec, B:49:0x00fb), top: B:90:0x0068, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x006c, blocks: (B:46:0x00f5, B:26:0x0072, B:28:0x007a, B:30:0x0084, B:32:0x008e, B:35:0x00a7, B:51:0x00fd, B:52:0x0100, B:53:0x0101, B:61:0x012f, B:21:0x0068, B:36:0x00b0, B:45:0x00ec, B:49:0x00fb), top: B:90:0x0068, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ea -> B:46:0x00f5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6313 interfaceC6313;
        InterfaceC5084 interfaceC5084;
        InterfaceC5079 interfaceC5079;
        InterfaceC5079 interfaceC50792;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        InterfaceC5079 interfaceC50793;
        InterfaceC5079 interfaceC50794;
        InterfaceC5084 interfaceC50842;
        C6309 c6309M12640;
        C6309 c6309M126402;
        Throwable thMo9203;
        InterfaceC5079 interfaceC50795;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                AbstractC6017.m10769(obj);
                if (!this.$this_copyToBoth.mo9200() || (((C5081) this.$first).m9262() && ((C5081) this.$second).m9262())) {
                    thMo9203 = this.$this_copyToBoth.mo9203();
                    if (thMo9203 == null) {
                        throw thMo9203;
                    }
                    InterfaceC5079 interfaceC50796 = this.$first;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    if (((C5081) interfaceC50796).m9263(this) != coroutineSingletons) {
                        InterfaceC5079 interfaceC50797 = this.$second;
                        this.label = 5;
                    }
                    break;
                } else {
                    InterfaceC5084 interfaceC50843 = this.$this_copyToBoth;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 1;
                    obj = AbstractC5076.m9228(interfaceC50843, 4096L, this);
                    if (obj != coroutineSingletons) {
                        autoCloseable2 = (AutoCloseable) obj;
                        interfaceC50793 = this.$first;
                        interfaceC50794 = this.$second;
                        interfaceC50842 = this.$this_copyToBoth;
                        try {
                            InterfaceC6313 interfaceC63132 = (InterfaceC6313) autoCloseable2;
                            c6309M126402 = AbstractC7684.m12640(interfaceC63132);
                            this.L$0 = autoCloseable2;
                            this.L$1 = interfaceC50793;
                            this.L$2 = interfaceC50794;
                            this.L$3 = interfaceC50842;
                            this.L$4 = interfaceC63132;
                            this.label = 2;
                            if (AbstractC5078.m9246(interfaceC50793, c6309M126402, this) != coroutineSingletons) {
                                autoCloseable = autoCloseable2;
                                interfaceC50792 = interfaceC50793;
                                interfaceC5079 = interfaceC50794;
                                interfaceC5084 = interfaceC50842;
                                interfaceC6313 = interfaceC63132;
                                c6309M12640 = AbstractC7684.m12640(interfaceC6313);
                                this.L$0 = autoCloseable;
                                this.L$1 = interfaceC50792;
                                this.L$2 = interfaceC5079;
                                this.L$3 = interfaceC5084;
                                this.L$4 = null;
                                this.label = 3;
                                if (AbstractC5078.m9246(interfaceC5079, c6309M12640, this) != coroutineSingletons) {
                                    autoCloseable2 = autoCloseable;
                                    AbstractC3897.m7396(autoCloseable2, null);
                                    if (this.$this_copyToBoth.mo9200()) {
                                    }
                                    thMo9203 = this.$this_copyToBoth.mo9203();
                                    if (thMo9203 == null) {
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                try {
                    AbstractC6017.m10769(obj);
                    autoCloseable2 = (AutoCloseable) obj;
                    interfaceC50793 = this.$first;
                    interfaceC50794 = this.$second;
                    interfaceC50842 = this.$this_copyToBoth;
                    InterfaceC6313 interfaceC631322 = (InterfaceC6313) autoCloseable2;
                    c6309M126402 = AbstractC7684.m12640(interfaceC631322);
                    this.L$0 = autoCloseable2;
                    this.L$1 = interfaceC50793;
                    this.L$2 = interfaceC50794;
                    this.L$3 = interfaceC50842;
                    this.L$4 = interfaceC631322;
                    this.label = 2;
                    if (AbstractC5078.m9246(interfaceC50793, c6309M126402, this) != coroutineSingletons) {
                    }
                } catch (Throwable th) {
                    try {
                        AbstractC5078.m9251(this.$first, th);
                        AbstractC5078.m9251(this.$second, th);
                        InterfaceC5079 interfaceC50798 = this.$first;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 6;
                        if (((C5081) interfaceC50798).m9263(this) != coroutineSingletons) {
                            InterfaceC5079 interfaceC50799 = this.$second;
                            this.label = 7;
                        }
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        InterfaceC5079 interfaceC507910 = this.$first;
                        this.L$0 = th;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 8;
                        if (((C5081) interfaceC507910).m9263(this) != coroutineSingletons) {
                            interfaceC50795 = this.$second;
                            this.L$0 = th;
                            this.label = 9;
                            if (((C5081) interfaceC50795).m9263(this) != coroutineSingletons) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                interfaceC6313 = (InterfaceC6313) this.L$4;
                interfaceC5084 = (InterfaceC5084) this.L$3;
                interfaceC5079 = (InterfaceC5079) this.L$2;
                interfaceC50792 = (InterfaceC5079) this.L$1;
                autoCloseable = (AutoCloseable) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                } catch (Throwable th3) {
                    InterfaceC5084 interfaceC50844 = interfaceC5084;
                    InterfaceC5079 interfaceC507911 = interfaceC5079;
                    InterfaceC5079 interfaceC507912 = interfaceC50792;
                    autoCloseable2 = autoCloseable;
                    interfaceC50844.mo9204(th3);
                    AbstractC5078.m9251(interfaceC507912, th3);
                    AbstractC5078.m9251(interfaceC507911, th3);
                    AbstractC3897.m7396(autoCloseable2, null);
                    if (this.$this_copyToBoth.mo9200()) {
                    }
                    thMo9203 = this.$this_copyToBoth.mo9203();
                    if (thMo9203 == null) {
                    }
                }
                c6309M12640 = AbstractC7684.m12640(interfaceC6313);
                this.L$0 = autoCloseable;
                this.L$1 = interfaceC50792;
                this.L$2 = interfaceC5079;
                this.L$3 = interfaceC5084;
                this.L$4 = null;
                this.label = 3;
                if (AbstractC5078.m9246(interfaceC5079, c6309M12640, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                interfaceC50842 = (InterfaceC5084) this.L$3;
                interfaceC50794 = (InterfaceC5079) this.L$2;
                interfaceC50793 = (InterfaceC5079) this.L$1;
                autoCloseable2 = (AutoCloseable) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                } catch (Throwable th4) {
                    interfaceC50842.mo9204(th4);
                    AbstractC5078.m9251(interfaceC50793, th4);
                    AbstractC5078.m9251(interfaceC50794, th4);
                }
                AbstractC3897.m7396(autoCloseable2, null);
                if (this.$this_copyToBoth.mo9200()) {
                }
                thMo9203 = this.$this_copyToBoth.mo9203();
                if (thMo9203 == null) {
                }
                break;
            case 4:
                AbstractC6017.m10769(obj);
                InterfaceC5079 interfaceC507972 = this.$second;
                this.label = 5;
                break;
            case 5:
            case 7:
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            case 6:
                AbstractC6017.m10769(obj);
                InterfaceC5079 interfaceC507992 = this.$second;
                this.label = 7;
                break;
            case 8:
                Throwable th5 = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                th = th5;
                interfaceC50795 = this.$second;
                this.L$0 = th;
                this.label = 9;
                if (((C5081) interfaceC50795).m9263(this) != coroutineSingletons) {
                    throw th;
                }
                return coroutineSingletons;
            case 9:
                Throwable th6 = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                throw th6;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
