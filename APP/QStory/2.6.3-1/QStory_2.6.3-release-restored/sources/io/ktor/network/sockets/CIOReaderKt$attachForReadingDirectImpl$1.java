package io.ktor.network.sockets;

import io.ktor.network.selector.C4835;
import io.ktor.network.selector.InterfaceC4838;
import io.ktor.network.selector.InterfaceC4840;
import io.ktor.network.selector.SelectInterest;
import io.ktor.network.util.AbstractC4879;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.C5081;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SocketChannel;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1", m556f = "CIOReader.kt", m557l = {97, 106, 109, 110, 97, 106, 109, 110}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class CIOReaderKt$attachForReadingDirectImpl$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C5081 $channel;
    final /* synthetic */ ReadableByteChannel $nioChannel;
    final /* synthetic */ InterfaceC4840 $selectable;
    final /* synthetic */ InterfaceC4838 $selector;
    final /* synthetic */ AbstractC4850 $socketOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOReaderKt$attachForReadingDirectImpl$1(InterfaceC4840 interfaceC4840, AbstractC4850 abstractC4850, C5081 c5081, ReadableByteChannel readableByteChannel, InterfaceC4838 interfaceC4838, InterfaceC5189<? super CIOReaderKt$attachForReadingDirectImpl$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$selectable = interfaceC4840;
        this.$channel = c5081;
        this.$nioChannel = readableByteChannel;
        this.$selector = interfaceC4838;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CIOReaderKt$attachForReadingDirectImpl$1 cIOReaderKt$attachForReadingDirectImpl$1 = new CIOReaderKt$attachForReadingDirectImpl$1(this.$selectable, null, this.$channel, this.$nioChannel, this.$selector, interfaceC5189);
        cIOReaderKt$attachForReadingDirectImpl$1.L$0 = obj;
        return cIOReaderKt$attachForReadingDirectImpl$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CIOReaderKt$attachForReadingDirectImpl$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
    
        if (((java.lang.Number) r13).intValue() != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f0, code lost:
    
        if (r13 != r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f9, code lost:
    
        if (((java.lang.Number) r13).intValue() != 0) goto L79;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f8: INVOKE (r9 I:io.ktor.network.util.飘花落叶言子楪世苏兰哲) VIRTUAL call: io.ktor.network.util.飘花落叶言子楪世苏兰哲.飘花落叶言子楪世苏哲兰():void A[Catch: all -> 0x00f5, MD:():void (m)] (LINE:249), block:B:39:0x00f8 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[Catch: all -> 0x002f, PHI: r1 r6 r7 r8 r9 r10
  0x00d0: PHI (r1v22 io.ktor.network.selector.飘花落叶言子楪苏兰世哲) = (r1v15 io.ktor.network.selector.飘花落叶言子楪苏兰世哲), (r1v23 io.ktor.network.selector.飘花落叶言子楪苏兰世哲) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r6v20 io.ktor.network.selector.飘花落叶言子楪苏哲世兰) = (r6v14 io.ktor.network.selector.飘花落叶言子楪苏哲世兰), (r6v21 io.ktor.network.selector.飘花落叶言子楪苏哲世兰) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r7v20 java.nio.channels.ReadableByteChannel) = (r7v13 java.nio.channels.ReadableByteChannel), (r7v21 java.nio.channels.ReadableByteChannel) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r8v20 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) = (r8v13 io.ktor.utils.io.飘花落叶言子楪苏世兰哲), (r8v21 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r9v24 io.ktor.network.util.飘花落叶言子楪世苏兰哲) = (r9v14 io.ktor.network.util.飘花落叶言子楪世苏兰哲), (r9v25 io.ktor.network.util.飘花落叶言子楪世苏兰哲) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r10v13 io.ktor.network.util.飘花落叶言子楪世苏兰哲) = (r10v6 io.ktor.network.util.飘花落叶言子楪世苏兰哲), (r10v14 io.ktor.network.util.飘花落叶言子楪世苏兰哲) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x002f, blocks: (B:7:0x002a, B:34:0x00e8, B:25:0x00ab, B:31:0x00d0, B:12:0x004a, B:15:0x0067, B:18:0x0083, B:20:0x008e, B:22:0x0094), top: B:100:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:36:0x00f0, B:55:0x016f, B:57:0x0177, B:61:0x019b, B:63:0x01a3, B:65:0x01a9, B:68:0x01bd, B:74:0x01df, B:77:0x01f3, B:80:0x01fe, B:82:0x0206, B:90:0x0225, B:39:0x00f8, B:40:0x00fb, B:42:0x0110, B:45:0x0129, B:48:0x0142, B:51:0x015b, B:54:0x0166, B:7:0x002a, B:34:0x00e8, B:25:0x00ab, B:31:0x00d0, B:12:0x004a, B:15:0x0067, B:18:0x0083, B:20:0x008e, B:22:0x0094), top: B:100:0x0009, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a3 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:36:0x00f0, B:55:0x016f, B:57:0x0177, B:61:0x019b, B:63:0x01a3, B:65:0x01a9, B:68:0x01bd, B:74:0x01df, B:77:0x01f3, B:80:0x01fe, B:82:0x0206, B:90:0x0225, B:39:0x00f8, B:40:0x00fb, B:42:0x0110, B:45:0x0129, B:48:0x0142, B:51:0x015b, B:54:0x0166, B:7:0x002a, B:34:0x00e8, B:25:0x00ab, B:31:0x00d0, B:12:0x004a, B:15:0x0067, B:18:0x0083, B:20:0x008e, B:22:0x0094), top: B:100:0x0009, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01df A[Catch: all -> 0x00f5, PHI: r1 r6 r7 r8 r9
  0x01df: PHI (r1v17 io.ktor.network.selector.飘花落叶言子楪苏兰世哲) = (r1v7 io.ktor.network.selector.飘花落叶言子楪苏兰世哲), (r1v18 io.ktor.network.selector.飘花落叶言子楪苏兰世哲) binds: [B:45:0x0129, B:72:0x01dc] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r6v16 io.ktor.network.selector.飘花落叶言子楪苏哲世兰) = (r6v6 io.ktor.network.selector.飘花落叶言子楪苏哲世兰), (r6v17 io.ktor.network.selector.飘花落叶言子楪苏哲世兰) binds: [B:45:0x0129, B:72:0x01dc] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r7v15 java.nio.channels.ReadableByteChannel) = (r7v5 java.nio.channels.ReadableByteChannel), (r7v16 java.nio.channels.ReadableByteChannel) binds: [B:45:0x0129, B:72:0x01dc] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r8v15 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) = (r8v5 io.ktor.utils.io.飘花落叶言子楪苏世兰哲), (r8v16 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) binds: [B:45:0x0129, B:72:0x01dc] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r9v16 io.ktor.network.util.飘花落叶言子楪世苏兰哲) = (r9v6 io.ktor.network.util.飘花落叶言子楪世苏兰哲), (r9v17 io.ktor.network.util.飘花落叶言子楪世苏兰哲) binds: [B:45:0x0129, B:72:0x01dc] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00f5, blocks: (B:36:0x00f0, B:55:0x016f, B:57:0x0177, B:61:0x019b, B:63:0x01a3, B:65:0x01a9, B:68:0x01bd, B:74:0x01df, B:77:0x01f3, B:80:0x01fe, B:82:0x0206, B:90:0x0225, B:39:0x00f8, B:40:0x00fb, B:42:0x0110, B:45:0x0129, B:48:0x0142, B:51:0x015b, B:54:0x0166, B:7:0x002a, B:34:0x00e8, B:25:0x00ab, B:31:0x00d0, B:12:0x004a, B:15:0x0067, B:18:0x0083, B:20:0x008e, B:22:0x0094), top: B:100:0x0009, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fe A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:36:0x00f0, B:55:0x016f, B:57:0x0177, B:61:0x019b, B:63:0x01a3, B:65:0x01a9, B:68:0x01bd, B:74:0x01df, B:77:0x01f3, B:80:0x01fe, B:82:0x0206, B:90:0x0225, B:39:0x00f8, B:40:0x00fb, B:42:0x0110, B:45:0x0129, B:48:0x0142, B:51:0x015b, B:54:0x0166, B:7:0x002a, B:34:0x00e8, B:25:0x00ab, B:31:0x00d0, B:12:0x004a, B:15:0x0067, B:18:0x0083, B:20:0x008e, B:22:0x0094), top: B:100:0x0009, inners: #3 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e4 -> B:34:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01f9 -> B:68:0x01bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01fb -> B:55:0x016f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        AbstractC4879 abstractC4879M9011;
        AbstractC4879 abstractC4879;
        InterfaceC4838 interfaceC4838;
        InterfaceC4840 interfaceC4840;
        ReadableByteChannel readableByteChannel;
        C5081 c5081;
        AbstractC4879 abstractC48792;
        InterfaceC4838 interfaceC48382;
        InterfaceC4840 interfaceC48402;
        ReadableByteChannel readableByteChannel2;
        C5081 c50812;
        AbstractC4879 abstractC48793;
        Object objM8962;
        int iIntValue;
        Object objM89622;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        try {
            try {
                switch (i) {
                    case 0:
                        AbstractC6017.m10769(obj);
                        this.$selectable.mo8973(SelectInterest.READ, false);
                        abstractC4879 = null;
                        if (this.$channel.m9262()) {
                            C5081 c50813 = this.$channel;
                            ReadableByteChannel readableByteChannel3 = this.$nioChannel;
                            interfaceC4840 = this.$selectable;
                            InterfaceC4838 interfaceC48383 = this.$selector;
                            this.L$0 = abstractC4879;
                            this.L$1 = c50813;
                            this.L$2 = readableByteChannel3;
                            this.L$3 = interfaceC4840;
                            this.L$4 = interfaceC48383;
                            this.L$5 = null;
                            this.label = 1;
                            Object objM8980 = AbstractC4842.m8980(c50813, readableByteChannel3, this);
                            if (objM8980 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c5081 = c50813;
                            obj = objM8980;
                            readableByteChannel = readableByteChannel3;
                            interfaceC4838 = interfaceC48383;
                            abstractC48792 = abstractC4879;
                            iIntValue = ((Number) obj).intValue();
                            if (iIntValue == -1) {
                                c5081.m9257();
                            } else if (iIntValue <= 0) {
                                this.L$0 = abstractC48792;
                                this.L$1 = c5081;
                                this.L$2 = readableByteChannel;
                                this.L$3 = interfaceC4840;
                                this.L$4 = interfaceC4838;
                                this.label = 2;
                                if (c5081.m9259(this) != coroutineSingletons) {
                                    this.L$0 = abstractC48792;
                                    this.L$1 = c5081;
                                    this.L$2 = readableByteChannel;
                                    this.L$3 = interfaceC4840;
                                    this.L$4 = interfaceC4838;
                                    this.label = 3;
                                    SelectInterest selectInterest = SelectInterest.READ;
                                    interfaceC4840.mo8973(selectInterest, true);
                                    objM8962 = ((C4835) interfaceC4838).m8962(interfaceC4840, selectInterest, this);
                                    if (objM8962 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM8962 = c6008;
                                    }
                                    if (objM8962 == coroutineSingletons) {
                                        this.L$0 = abstractC48792;
                                        this.L$1 = c5081;
                                        this.L$2 = readableByteChannel;
                                        this.L$3 = interfaceC4840;
                                        this.L$4 = interfaceC4838;
                                        this.label = 4;
                                        obj = AbstractC4842.m8980(c5081, readableByteChannel, this);
                                        break;
                                    }
                                }
                                return coroutineSingletons;
                            }
                            abstractC4879 = abstractC48792;
                            if (this.$channel.m9262()) {
                                Throwable thMo9203 = this.$channel.mo9203();
                                if (thMo9203 != null) {
                                    throw thMo9203;
                                }
                                this.$channel.m9257();
                                ReadableByteChannel readableByteChannel4 = this.$nioChannel;
                                if (readableByteChannel4 instanceof SocketChannel) {
                                    try {
                                        if (AbstractC4853.f12625) {
                                            ((SocketChannel) readableByteChannel4).shutdownInput();
                                        } else {
                                            ((SocketChannel) readableByteChannel4).socket().shutdownInput();
                                        }
                                        break;
                                    } catch (ClosedChannelException unused) {
                                    }
                                }
                                return c6008;
                            }
                        }
                        break;
                    case 1:
                        interfaceC4838 = (InterfaceC4838) this.L$4;
                        interfaceC4840 = (InterfaceC4840) this.L$3;
                        readableByteChannel = (ReadableByteChannel) this.L$2;
                        c5081 = (C5081) this.L$1;
                        abstractC48792 = (AbstractC4879) this.L$0;
                        AbstractC6017.m10769(obj);
                        iIntValue = ((Number) obj).intValue();
                        if (iIntValue == -1) {
                        }
                        abstractC4879 = abstractC48792;
                        if (this.$channel.m9262()) {
                        }
                        break;
                    case 2:
                        interfaceC4838 = (InterfaceC4838) this.L$4;
                        interfaceC4840 = (InterfaceC4840) this.L$3;
                        readableByteChannel = (ReadableByteChannel) this.L$2;
                        c5081 = (C5081) this.L$1;
                        abstractC48792 = (AbstractC4879) this.L$0;
                        AbstractC6017.m10769(obj);
                        this.L$0 = abstractC48792;
                        this.L$1 = c5081;
                        this.L$2 = readableByteChannel;
                        this.L$3 = interfaceC4840;
                        this.L$4 = interfaceC4838;
                        this.label = 3;
                        SelectInterest selectInterest2 = SelectInterest.READ;
                        interfaceC4840.mo8973(selectInterest2, true);
                        objM8962 = ((C4835) interfaceC4838).m8962(interfaceC4840, selectInterest2, this);
                        if (objM8962 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                        if (objM8962 == coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        interfaceC4838 = (InterfaceC4838) this.L$4;
                        interfaceC4840 = (InterfaceC4840) this.L$3;
                        readableByteChannel = (ReadableByteChannel) this.L$2;
                        c5081 = (C5081) this.L$1;
                        abstractC48792 = (AbstractC4879) this.L$0;
                        AbstractC6017.m10769(obj);
                        this.L$0 = abstractC48792;
                        this.L$1 = c5081;
                        this.L$2 = readableByteChannel;
                        this.L$3 = interfaceC4840;
                        this.L$4 = interfaceC4838;
                        this.label = 4;
                        obj = AbstractC4842.m8980(c5081, readableByteChannel, this);
                        break;
                    case 4:
                        interfaceC4838 = (InterfaceC4838) this.L$4;
                        interfaceC4840 = (InterfaceC4840) this.L$3;
                        readableByteChannel = (ReadableByteChannel) this.L$2;
                        c5081 = (C5081) this.L$1;
                        abstractC48792 = (AbstractC4879) this.L$0;
                        AbstractC6017.m10769(obj);
                        break;
                    case 5:
                        interfaceC48382 = (InterfaceC4838) this.L$5;
                        interfaceC48402 = (InterfaceC4840) this.L$4;
                        readableByteChannel2 = (ReadableByteChannel) this.L$3;
                        c50812 = (C5081) this.L$2;
                        abstractC48793 = (AbstractC4879) this.L$1;
                        abstractC4879 = (AbstractC4879) this.L$0;
                        AbstractC6017.m10769(obj);
                        int iIntValue2 = ((Number) obj).intValue();
                        if (iIntValue2 == -1) {
                            c50812.m9257();
                        } else if (iIntValue2 <= 0) {
                            this.L$0 = abstractC4879;
                            this.L$1 = abstractC48793;
                            this.L$2 = c50812;
                            this.L$3 = readableByteChannel2;
                            this.L$4 = interfaceC48402;
                            this.L$5 = interfaceC48382;
                            this.label = 6;
                            if (c50812.m9259(this) != coroutineSingletons) {
                                this.L$0 = abstractC4879;
                                this.L$1 = abstractC48793;
                                this.L$2 = c50812;
                                this.L$3 = readableByteChannel2;
                                this.L$4 = interfaceC48402;
                                this.L$5 = interfaceC48382;
                                this.label = 7;
                                SelectInterest selectInterest3 = SelectInterest.READ;
                                interfaceC48402.mo8973(selectInterest3, true);
                                objM89622 = ((C4835) interfaceC48382).m8962(interfaceC48402, selectInterest3, this);
                                if (objM89622 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM89622 = c6008;
                                }
                                if (objM89622 == coroutineSingletons) {
                                    this.L$0 = abstractC4879;
                                    this.L$1 = abstractC48793;
                                    this.L$2 = c50812;
                                    this.L$3 = readableByteChannel2;
                                    this.L$4 = interfaceC48402;
                                    this.L$5 = interfaceC48382;
                                    this.label = 8;
                                    obj = AbstractC4842.m8980(c50812, readableByteChannel2, this);
                                    if (obj == coroutineSingletons) {
                                    }
                                    break;
                                }
                            }
                            return coroutineSingletons;
                        }
                        abstractC48793.m9011();
                        if (this.$channel.m9262()) {
                        }
                        break;
                    case 6:
                        interfaceC48382 = (InterfaceC4838) this.L$5;
                        interfaceC48402 = (InterfaceC4840) this.L$4;
                        readableByteChannel2 = (ReadableByteChannel) this.L$3;
                        c50812 = (C5081) this.L$2;
                        abstractC48793 = (AbstractC4879) this.L$1;
                        abstractC4879 = (AbstractC4879) this.L$0;
                        AbstractC6017.m10769(obj);
                        this.L$0 = abstractC4879;
                        this.L$1 = abstractC48793;
                        this.L$2 = c50812;
                        this.L$3 = readableByteChannel2;
                        this.L$4 = interfaceC48402;
                        this.L$5 = interfaceC48382;
                        this.label = 7;
                        SelectInterest selectInterest32 = SelectInterest.READ;
                        interfaceC48402.mo8973(selectInterest32, true);
                        objM89622 = ((C4835) interfaceC48382).m8962(interfaceC48402, selectInterest32, this);
                        if (objM89622 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                        if (objM89622 == coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 7:
                        interfaceC48382 = (InterfaceC4838) this.L$5;
                        interfaceC48402 = (InterfaceC4840) this.L$4;
                        readableByteChannel2 = (ReadableByteChannel) this.L$3;
                        c50812 = (C5081) this.L$2;
                        abstractC48793 = (AbstractC4879) this.L$1;
                        abstractC4879 = (AbstractC4879) this.L$0;
                        AbstractC6017.m10769(obj);
                        this.L$0 = abstractC4879;
                        this.L$1 = abstractC48793;
                        this.L$2 = c50812;
                        this.L$3 = readableByteChannel2;
                        this.L$4 = interfaceC48402;
                        this.L$5 = interfaceC48382;
                        this.label = 8;
                        obj = AbstractC4842.m8980(c50812, readableByteChannel2, this);
                        if (obj == coroutineSingletons) {
                        }
                        break;
                    case 8:
                        interfaceC48382 = (InterfaceC4838) this.L$5;
                        interfaceC48402 = (InterfaceC4840) this.L$4;
                        readableByteChannel2 = (ReadableByteChannel) this.L$3;
                        c50812 = (C5081) this.L$2;
                        abstractC48793 = (AbstractC4879) this.L$1;
                        abstractC4879 = (AbstractC4879) this.L$0;
                        AbstractC6017.m10769(obj);
                        break;
                    default:
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th) {
                ReadableByteChannel readableByteChannel5 = this.$nioChannel;
                if (readableByteChannel5 instanceof SocketChannel) {
                    try {
                        if (AbstractC4853.f12625) {
                            ((SocketChannel) readableByteChannel5).shutdownInput();
                        } else {
                            ((SocketChannel) readableByteChannel5).socket().shutdownInput();
                        }
                    } catch (ClosedChannelException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            abstractC4879M9011.m9011();
            throw th2;
        }
    }
}
