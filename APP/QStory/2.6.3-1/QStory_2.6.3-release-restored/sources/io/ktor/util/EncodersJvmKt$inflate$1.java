package io.ktor.util;

import io.ktor.util.cio.AbstractC5018;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p068.InterfaceC7383;
import p073.C7682;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.EncodersJvmKt$inflate$1", m556f = "EncodersJvm.kt", m557l = {78, 95, 96, 106, 113, 119, 131}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class EncodersJvmKt$inflate$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ InterfaceC5084 $source;
    byte B$0;
    byte B$1;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    short S$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncodersJvmKt$inflate$1(boolean z, InterfaceC5084 interfaceC5084, InterfaceC5189<? super EncodersJvmKt$inflate$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$gzip = z;
        this.$source = interfaceC5084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        EncodersJvmKt$inflate$1 encodersJvmKt$inflate$1 = new EncodersJvmKt$inflate$1(this.$gzip, this.$source, interfaceC5189);
        encodersJvmKt$inflate$1.L$0 = obj;
        return encodersJvmKt$inflate$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((EncodersJvmKt$inflate$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01fb, code lost:
    
        if (io.ktor.utils.p007io.AbstractC5076.m9244(r4, 2, r19) == r1) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024f A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0270 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0288 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d6 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e8 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031e A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x026e -> B:64:0x0245). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0270 -> B:73:0x0282). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x02ad -> B:81:0x02b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0306 -> B:93:0x0307). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws EOFException {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        Inflater inflater;
        C5058 c5058;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        Inflater inflater2;
        CRC32 crc32;
        Object obj2;
        ByteBuffer byteBuffer5;
        Object objM9229;
        short s;
        byte b;
        byte b2;
        Inflater inflater3;
        ByteBuffer byteBuffer6;
        ByteBuffer byteBuffer7;
        C5058 c50582;
        CRC32 crc322;
        Object objM9233;
        Inflater inflater4;
        byte b3;
        C5058 c50583;
        ByteBuffer byteBuffer8;
        short s2;
        ByteBuffer byteBuffer9;
        CRC32 crc323;
        long jShortValue;
        InterfaceC5084 interfaceC5084;
        byte b4;
        C5058 c50584;
        ByteBuffer byteBuffer10;
        Ref$IntRef ref$IntRef;
        CRC32 crc324;
        Object objM9235;
        ByteBuffer byteBuffer11;
        ByteBuffer byteBuffer12;
        Inflater inflater5;
        boolean zMo9200;
        C5058 c50585;
        CRC32 crc325;
        Ref$IntRef ref$IntRef2;
        Object objM9184;
        C5058 c50586;
        Ref$IntRef ref$IntRef3;
        int i;
        CRC32 crc326;
        Ref$IntRef ref$IntRef4;
        int i2;
        Object objM91842;
        Ref$IntRef ref$IntRef5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            switch (this.label) {
                case 0:
                    AbstractC6017.m10769(obj);
                    c5058 = (C5058) this.L$0;
                    C7682 c7682 = AbstractC5018.f12999;
                    byteBuffer3 = (ByteBuffer) c7682.mo8894();
                    byteBuffer4 = (ByteBuffer) c7682.mo8894();
                    inflater2 = new Inflater(true);
                    crc32 = new CRC32();
                    if (this.$gzip) {
                        InterfaceC5084 interfaceC50842 = this.$source;
                        this.L$0 = c5058;
                        this.L$1 = byteBuffer3;
                        this.L$2 = byteBuffer4;
                        this.L$3 = inflater2;
                        this.L$4 = crc32;
                        this.label = 1;
                        objM9229 = AbstractC5076.m9229(interfaceC50842, 10, this);
                        if (objM9229 != coroutineSingletons) {
                            InterfaceC6313 interfaceC6313 = (InterfaceC6313) objM9229;
                            interfaceC6313.getClass();
                            C6309 c6309Mo11162 = interfaceC6313.mo11162();
                            c6309Mo11162.getClass();
                            short s3 = c6309Mo11162.readShort();
                            s = (short) (((s3 & 255) << 8) | ((65280 & s3) >>> 8));
                            b = interfaceC6313.readByte();
                            b2 = interfaceC6313.readByte();
                            obj2 = null;
                            AbstractC7684.m12639(interfaceC6313, Long.MAX_VALUE);
                            if ((b2 & 4) == 0) {
                                InterfaceC5084 interfaceC50843 = this.$source;
                                this.L$0 = c5058;
                                this.L$1 = byteBuffer3;
                                this.L$2 = byteBuffer4;
                                this.L$3 = inflater2;
                                this.L$4 = crc32;
                                this.S$0 = s;
                                this.B$0 = b;
                                this.B$1 = b2;
                                this.label = 2;
                                objM9233 = AbstractC5076.m9233(interfaceC50843, this);
                                if (objM9233 != coroutineSingletons) {
                                    C5058 c50587 = c5058;
                                    inflater4 = inflater2;
                                    b3 = b;
                                    c50583 = c50587;
                                    CRC32 crc327 = crc32;
                                    byteBuffer8 = byteBuffer4;
                                    s2 = s;
                                    byteBuffer9 = byteBuffer3;
                                    crc323 = crc327;
                                    jShortValue = ((Number) objM9233).shortValue();
                                    interfaceC5084 = this.$source;
                                    this.L$0 = c50583;
                                    this.L$1 = byteBuffer9;
                                    this.L$2 = byteBuffer8;
                                    this.L$3 = inflater4;
                                    this.L$4 = crc323;
                                    this.S$0 = s2;
                                    this.B$0 = b3;
                                    this.B$1 = b2;
                                    this.label = 3;
                                    if (AbstractC5076.m9244(interfaceC5084, jShortValue, this) != coroutineSingletons) {
                                        b4 = b2;
                                        ByteBuffer byteBuffer13 = byteBuffer9;
                                        s = s2;
                                        byteBuffer7 = byteBuffer13;
                                        b2 = b4;
                                        crc322 = crc323;
                                        inflater3 = inflater4;
                                        c50582 = c50583;
                                        b = b3;
                                        byteBuffer6 = byteBuffer8;
                                        if (s != -29921) {
                                            C6755.m11871(AbstractC7012.m12147(s, "GZIP magic invalid: "));
                                            return obj2;
                                        }
                                        if (b != 8) {
                                            throw new IllegalStateException(("Deflater method unsupported: " + ((int) b) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH).toString());
                                        }
                                        if ((b2 & 8) != 0) {
                                            C6755.m11870("Gzip file name not supported");
                                            return obj2;
                                        }
                                        if ((b2 & 16) != 0) {
                                            C6755.m11870("Gzip file comment not supported");
                                            return obj2;
                                        }
                                        if ((b2 & 2) != 0) {
                                            InterfaceC5084 interfaceC50844 = this.$source;
                                            this.L$0 = c50582;
                                            this.L$1 = byteBuffer7;
                                            this.L$2 = byteBuffer6;
                                            this.L$3 = inflater3;
                                            this.L$4 = crc322;
                                            this.label = 4;
                                        }
                                        crc32 = crc322;
                                        byteBuffer5 = byteBuffer7;
                                        c5058 = c50582;
                                        inflater = inflater3;
                                        byteBuffer2 = byteBuffer6;
                                        try {
                                            c50584 = c5058;
                                            byteBuffer10 = byteBuffer5;
                                            ref$IntRef = new Ref$IntRef();
                                            crc324 = crc32;
                                            zMo9200 = this.$source.mo9200();
                                            InterfaceC5084 interfaceC50845 = this.$source;
                                            if (zMo9200) {
                                                this.L$0 = c50584;
                                                this.L$1 = byteBuffer10;
                                                this.L$2 = byteBuffer2;
                                                this.L$3 = inflater;
                                                this.L$4 = crc324;
                                                this.L$5 = ref$IntRef;
                                                this.L$6 = obj2;
                                                this.label = 5;
                                                objM9235 = AbstractC5076.m9235(interfaceC50845, byteBuffer10, this);
                                                if (objM9235 == coroutineSingletons) {
                                                }
                                                if (((Number) objM9235).intValue() > 0) {
                                                    byteBuffer10.flip();
                                                    inflater.setInput(byteBuffer10.array(), byteBuffer10.position(), byteBuffer10.remaining());
                                                    if (!inflater.needsInput() || inflater.finished()) {
                                                        byteBuffer10.compact();
                                                    } else {
                                                        int i3 = ref$IntRef.element;
                                                        InterfaceC5079 interfaceC5079 = c50584.f13071;
                                                        this.L$0 = c50584;
                                                        this.L$1 = byteBuffer10;
                                                        this.L$2 = byteBuffer2;
                                                        this.L$3 = inflater;
                                                        this.L$4 = crc324;
                                                        this.L$5 = ref$IntRef;
                                                        this.L$6 = ref$IntRef;
                                                        this.I$0 = i3;
                                                        this.label = 6;
                                                        objM9184 = AbstractC5049.m9184(inflater, interfaceC5079, byteBuffer2, crc324, this);
                                                        if (objM9184 != coroutineSingletons) {
                                                            c50586 = c50584;
                                                            byteBuffer11 = byteBuffer10;
                                                            ref$IntRef3 = ref$IntRef;
                                                            byteBuffer12 = byteBuffer2;
                                                            i = i3;
                                                            inflater5 = inflater;
                                                            crc326 = crc324;
                                                            ref$IntRef4 = ref$IntRef3;
                                                            ref$IntRef4.element = i + ((Number) objM9184).intValue();
                                                            byteBuffer11.position(byteBuffer11.limit() - inflater5.getRemaining());
                                                            ref$IntRef = ref$IntRef3;
                                                            crc324 = crc326;
                                                            inflater = inflater5;
                                                            byteBuffer2 = byteBuffer12;
                                                            byteBuffer10 = byteBuffer11;
                                                            c50584 = c50586;
                                                            if (inflater.needsInput()) {
                                                            }
                                                            byteBuffer10.compact();
                                                        }
                                                    }
                                                }
                                                zMo9200 = this.$source.mo9200();
                                                InterfaceC5084 interfaceC508452 = this.$source;
                                                if (zMo9200) {
                                                    Throwable thMo9203 = interfaceC508452.mo9203();
                                                    if (thMo9203 != null) {
                                                        throw thMo9203;
                                                    }
                                                    byteBuffer10.flip();
                                                    c50585 = c50584;
                                                    crc325 = crc324;
                                                    ref$IntRef2 = ref$IntRef;
                                                    if (!inflater.finished()) {
                                                        i2 = ref$IntRef2.element;
                                                        InterfaceC5079 interfaceC50792 = c50585.f13071;
                                                        this.L$0 = c50585;
                                                        this.L$1 = byteBuffer10;
                                                        this.L$2 = byteBuffer2;
                                                        this.L$3 = inflater;
                                                        this.L$4 = crc325;
                                                        this.L$5 = ref$IntRef2;
                                                        this.L$6 = ref$IntRef2;
                                                        this.I$0 = i2;
                                                        this.label = 7;
                                                        objM91842 = AbstractC5049.m9184(inflater, interfaceC50792, byteBuffer2, crc325, this);
                                                        if (objM91842 != coroutineSingletons) {
                                                            ref$IntRef5 = ref$IntRef2;
                                                            ref$IntRef2.element = i2 + ((Number) objM91842).intValue();
                                                            byteBuffer10.position(byteBuffer10.limit() - inflater.getRemaining());
                                                            ref$IntRef2 = ref$IntRef5;
                                                            if (!inflater.finished()) {
                                                                if (this.$gzip) {
                                                                    if (byteBuffer10.remaining() != 8) {
                                                                        throw new IllegalStateException(("Expected 8 bytes in the trailer. Actual: " + byteBuffer10.remaining() + " $").toString());
                                                                    }
                                                                    byteBuffer10.order(ByteOrder.LITTLE_ENDIAN);
                                                                    int i4 = byteBuffer10.getInt(byteBuffer10.position());
                                                                    int i5 = byteBuffer10.getInt(byteBuffer10.position() + 4);
                                                                    if (((int) crc325.getValue()) != i4) {
                                                                        throw new IllegalStateException("Gzip checksum invalid.");
                                                                    }
                                                                    if (ref$IntRef2.element != i5) {
                                                                        throw new IllegalStateException(("Gzip size invalid. Expected " + i5 + ", actual " + ref$IntRef2.element).toString());
                                                                    }
                                                                } else if (byteBuffer10.hasRemaining()) {
                                                                    throw new IllegalStateException("Check failed.");
                                                                }
                                                                inflater.end();
                                                                C7682 c76822 = AbstractC5018.f12999;
                                                                c76822.mo8893(byteBuffer10);
                                                                c76822.mo8893(byteBuffer2);
                                                                return C6008.f15084;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            byteBuffer = byteBuffer5;
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                inflater.end();
                                                C7682 c76823 = AbstractC5018.f12999;
                                                c76823.mo8893(byteBuffer);
                                                c76823.mo8893(byteBuffer2);
                                                throw th2;
                                            }
                                        }
                                    }
                                }
                                break;
                            } else {
                                inflater3 = inflater2;
                                byteBuffer6 = byteBuffer4;
                                byteBuffer7 = byteBuffer3;
                                c50582 = c5058;
                                crc322 = crc32;
                                if (s != -29921) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    obj2 = null;
                    byteBuffer5 = byteBuffer3;
                    byteBuffer2 = byteBuffer4;
                    inflater = inflater2;
                    c50584 = c5058;
                    byteBuffer10 = byteBuffer5;
                    ref$IntRef = new Ref$IntRef();
                    crc324 = crc32;
                    zMo9200 = this.$source.mo9200();
                    InterfaceC5084 interfaceC5084522 = this.$source;
                    if (zMo9200) {
                    }
                    break;
                case 1:
                    CRC32 crc328 = (CRC32) this.L$4;
                    inflater2 = (Inflater) this.L$3;
                    byteBuffer4 = (ByteBuffer) this.L$2;
                    byteBuffer3 = (ByteBuffer) this.L$1;
                    c5058 = (C5058) this.L$0;
                    AbstractC6017.m10769(obj);
                    crc32 = crc328;
                    objM9229 = obj;
                    InterfaceC6313 interfaceC63132 = (InterfaceC6313) objM9229;
                    interfaceC63132.getClass();
                    C6309 c6309Mo111622 = interfaceC63132.mo11162();
                    c6309Mo111622.getClass();
                    short s32 = c6309Mo111622.readShort();
                    s = (short) (((s32 & 255) << 8) | ((65280 & s32) >>> 8));
                    b = interfaceC63132.readByte();
                    b2 = interfaceC63132.readByte();
                    obj2 = null;
                    AbstractC7684.m12639(interfaceC63132, Long.MAX_VALUE);
                    if ((b2 & 4) == 0) {
                    }
                    break;
                case 2:
                    byte b5 = this.B$1;
                    b3 = this.B$0;
                    s2 = this.S$0;
                    crc323 = (CRC32) this.L$4;
                    inflater4 = (Inflater) this.L$3;
                    byteBuffer8 = (ByteBuffer) this.L$2;
                    byteBuffer9 = (ByteBuffer) this.L$1;
                    c50583 = (C5058) this.L$0;
                    AbstractC6017.m10769(obj);
                    b2 = b5;
                    obj2 = null;
                    objM9233 = obj;
                    jShortValue = ((Number) objM9233).shortValue();
                    interfaceC5084 = this.$source;
                    this.L$0 = c50583;
                    this.L$1 = byteBuffer9;
                    this.L$2 = byteBuffer8;
                    this.L$3 = inflater4;
                    this.L$4 = crc323;
                    this.S$0 = s2;
                    this.B$0 = b3;
                    this.B$1 = b2;
                    this.label = 3;
                    if (AbstractC5076.m9244(interfaceC5084, jShortValue, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                case 3:
                    b4 = this.B$1;
                    b3 = this.B$0;
                    s2 = this.S$0;
                    crc323 = (CRC32) this.L$4;
                    inflater4 = (Inflater) this.L$3;
                    byteBuffer8 = (ByteBuffer) this.L$2;
                    byteBuffer9 = (ByteBuffer) this.L$1;
                    c50583 = (C5058) this.L$0;
                    AbstractC6017.m10769(obj);
                    obj2 = null;
                    ByteBuffer byteBuffer132 = byteBuffer9;
                    s = s2;
                    byteBuffer7 = byteBuffer132;
                    b2 = b4;
                    crc322 = crc323;
                    inflater3 = inflater4;
                    c50582 = c50583;
                    b = b3;
                    byteBuffer6 = byteBuffer8;
                    if (s != -29921) {
                    }
                    break;
                case 4:
                    crc322 = (CRC32) this.L$4;
                    inflater3 = (Inflater) this.L$3;
                    byteBuffer6 = (ByteBuffer) this.L$2;
                    byteBuffer7 = (ByteBuffer) this.L$1;
                    c50582 = (C5058) this.L$0;
                    AbstractC6017.m10769(obj);
                    obj2 = null;
                    crc32 = crc322;
                    byteBuffer5 = byteBuffer7;
                    c5058 = c50582;
                    inflater = inflater3;
                    byteBuffer2 = byteBuffer6;
                    c50584 = c5058;
                    byteBuffer10 = byteBuffer5;
                    ref$IntRef = new Ref$IntRef();
                    crc324 = crc32;
                    zMo9200 = this.$source.mo9200();
                    InterfaceC5084 interfaceC50845222 = this.$source;
                    if (zMo9200) {
                    }
                    break;
                case 5:
                    ref$IntRef = (Ref$IntRef) this.L$5;
                    crc324 = (CRC32) this.L$4;
                    inflater = (Inflater) this.L$3;
                    byteBuffer2 = (ByteBuffer) this.L$2;
                    byteBuffer10 = (ByteBuffer) this.L$1;
                    c50584 = (C5058) this.L$0;
                    AbstractC6017.m10769(obj);
                    obj2 = null;
                    objM9235 = obj;
                    if (((Number) objM9235).intValue() > 0) {
                    }
                    zMo9200 = this.$source.mo9200();
                    InterfaceC5084 interfaceC508452222 = this.$source;
                    if (zMo9200) {
                    }
                    break;
                case 6:
                    i = this.I$0;
                    ref$IntRef4 = (Ref$IntRef) this.L$6;
                    ref$IntRef3 = (Ref$IntRef) this.L$5;
                    crc326 = (CRC32) this.L$4;
                    inflater5 = (Inflater) this.L$3;
                    byteBuffer12 = (ByteBuffer) this.L$2;
                    byteBuffer11 = (ByteBuffer) this.L$1;
                    c50586 = (C5058) this.L$0;
                    try {
                        AbstractC6017.m10769(obj);
                        objM9184 = obj;
                        obj2 = null;
                        ref$IntRef4.element = i + ((Number) objM9184).intValue();
                        byteBuffer11.position(byteBuffer11.limit() - inflater5.getRemaining());
                        ref$IntRef = ref$IntRef3;
                        crc324 = crc326;
                        inflater = inflater5;
                        byteBuffer2 = byteBuffer12;
                        byteBuffer10 = byteBuffer11;
                        c50584 = c50586;
                        if (inflater.needsInput()) {
                        }
                        byteBuffer10.compact();
                        zMo9200 = this.$source.mo9200();
                        InterfaceC5084 interfaceC5084522222 = this.$source;
                        if (zMo9200) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inflater = inflater5;
                        byteBuffer2 = byteBuffer12;
                        byteBuffer = byteBuffer11;
                        throw th;
                    }
                    break;
                case 7:
                    i2 = this.I$0;
                    ref$IntRef2 = (Ref$IntRef) this.L$6;
                    Ref$IntRef ref$IntRef6 = (Ref$IntRef) this.L$5;
                    crc325 = (CRC32) this.L$4;
                    inflater = (Inflater) this.L$3;
                    byteBuffer2 = (ByteBuffer) this.L$2;
                    byteBuffer10 = (ByteBuffer) this.L$1;
                    c50585 = (C5058) this.L$0;
                    AbstractC6017.m10769(obj);
                    ref$IntRef5 = ref$IntRef6;
                    objM91842 = obj;
                    ref$IntRef2.element = i2 + ((Number) objM91842).intValue();
                    byteBuffer10.position(byteBuffer10.limit() - inflater.getRemaining());
                    ref$IntRef2 = ref$IntRef5;
                    if (!inflater.finished()) {
                    }
                    break;
                default:
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
