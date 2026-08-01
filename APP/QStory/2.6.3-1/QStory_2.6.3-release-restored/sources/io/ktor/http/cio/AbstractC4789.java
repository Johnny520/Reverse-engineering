package io.ktor.http.cio;

import io.ktor.http.cio.internals.AbstractC4782;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5062;
import io.ktor.utils.p007io.C5077;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.AbstractC5964;
import kotlinx.coroutines.C6299;
import kotlinx.p010io.C6309;
import kotlinx.p010io.C6311;
import p074.AbstractC7684;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f12527;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f12528;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4790 f12529 = new C4790(2048, 0);

    static {
        Charset charset = AbstractC5964.f15033;
        f12528 = AbstractC7684.m12643("\r\n", charset);
        f12527 = AbstractC7684.m12643("0\r\n\r\n", charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r1.mo9202().mo11163() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        r11.L$0 = r3;
        r11.L$1 = r1;
        r11.L$2 = r1;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.L$5 = null;
        r11.label = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        if (r1.mo9201(r9, r11) != r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        r12 = r3;
        r3 = r1;
        r1 = r11;
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
    
        r12 = r11;
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a7, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r4).m9259(r1) == r2) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[Catch: all -> 0x00cd, TryCatch #6 {all -> 0x00cd, blocks: (B:35:0x0096, B:37:0x009c, B:39:0x00a2, B:41:0x00ac, B:80:0x0170, B:82:0x0174, B:85:0x017f, B:94:0x01ad), top: B:114:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db A[Catch: all -> 0x0162, TryCatch #0 {all -> 0x0162, blocks: (B:49:0x00d5, B:51:0x00db, B:53:0x00ee, B:55:0x00fb, B:57:0x010a, B:77:0x0164, B:78:0x016b), top: B:103:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00fb -> B:113:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0120 -> B:61:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x016c -> B:114:0x0096). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8901(InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, ContinuationImpl continuationImpl) throws Throwable {
        ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$2;
        InterfaceC5079 interfaceC50792;
        ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$22;
        InterfaceC5084 interfaceC50842;
        ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$23;
        InterfaceC5084 interfaceC50843;
        InterfaceC5079 interfaceC50793;
        InterfaceC5084 interfaceC50844;
        if (continuationImpl instanceof ChunkedTransferEncodingKt$encodeChunked$2) {
            chunkedTransferEncodingKt$encodeChunked$2 = (ChunkedTransferEncodingKt$encodeChunked$2) continuationImpl;
            int i = chunkedTransferEncodingKt$encodeChunked$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chunkedTransferEncodingKt$encodeChunked$2.label = i - Integer.MIN_VALUE;
            } else {
                chunkedTransferEncodingKt$encodeChunked$2 = new ChunkedTransferEncodingKt$encodeChunked$2(continuationImpl);
            }
        }
        Object obj = chunkedTransferEncodingKt$encodeChunked$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chunkedTransferEncodingKt$encodeChunked$2.label;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC50792 = interfaceC5079;
            chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$2;
            interfaceC50842 = interfaceC5084;
            while (true) {
                if (!interfaceC50842.mo9200()) {
                }
            }
            if (interfaceC50842.mo9200()) {
            }
            AbstractC5078.m9251(interfaceC50793, th);
            interfaceC50844.mo9204(th);
            throw th;
        }
        if (i2 == 1) {
            InterfaceC5084 interfaceC50845 = (InterfaceC5084) chunkedTransferEncodingKt$encodeChunked$2.L$2;
            interfaceC50843 = (InterfaceC5084) chunkedTransferEncodingKt$encodeChunked$2.L$1;
            InterfaceC5079 interfaceC50794 = (InterfaceC5079) chunkedTransferEncodingKt$encodeChunked$2.L$0;
            try {
                AbstractC6017.m10769(obj);
                InterfaceC5079 interfaceC50795 = interfaceC50794;
                chunkedTransferEncodingKt$encodeChunked$23 = chunkedTransferEncodingKt$encodeChunked$2;
                interfaceC50842 = interfaceC50845;
                interfaceC50792 = interfaceC50795;
                if (interfaceC50842.mo9200()) {
                }
            } catch (Throwable th) {
                th = th;
                interfaceC50844 = interfaceC50843;
                interfaceC50793 = interfaceC50794;
            }
        } else if (i2 == 2) {
            Ref$IntRef ref$IntRef = (Ref$IntRef) chunkedTransferEncodingKt$encodeChunked$2.L$5;
            C6311 c6311 = (C6311) chunkedTransferEncodingKt$encodeChunked$2.L$4;
            C6309 c6309 = (C6309) chunkedTransferEncodingKt$encodeChunked$2.L$3;
            Ref$IntRef ref$IntRef2 = (Ref$IntRef) chunkedTransferEncodingKt$encodeChunked$2.L$2;
            InterfaceC5084 interfaceC50846 = (InterfaceC5084) chunkedTransferEncodingKt$encodeChunked$2.L$1;
            InterfaceC5079 interfaceC50796 = (InterfaceC5079) chunkedTransferEncodingKt$encodeChunked$2.L$0;
            try {
                AbstractC6017.m10769(obj);
                C6311 c63112 = c6311;
                chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$2;
                C6309 c6309Mo11162 = c6309;
                C6311 c63113 = c63112;
                Object num = obj;
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                interfaceC50792 = interfaceC50796;
                try {
                    try {
                        ref$IntRef3.element = ((Number) num).intValue();
                        int i4 = ref$IntRef2.element;
                        if (i4 != 0) {
                            if (i4 < 0) {
                                throw new IllegalStateException("Returned negative read bytes count");
                            }
                            if (i4 > c63113.m11196()) {
                                throw new IllegalStateException("Returned too many bytes");
                            }
                            c6309Mo11162.skip(i4);
                        }
                        interfaceC50842 = interfaceC50846;
                        i3 = 1;
                        while (true) {
                            try {
                                if (!interfaceC50842.mo9200()) {
                                    if (!interfaceC50842.mo9200()) {
                                        break;
                                    }
                                } else {
                                    Throwable thMo9203 = interfaceC50842 instanceof C5081 ? ((C5081) interfaceC50842).mo9203() : null;
                                    if (thMo9203 != null) {
                                        throw thMo9203;
                                    }
                                    byte[] bArr = f12527;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$0 = interfaceC50792;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$1 = interfaceC50842;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$2 = null;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$3 = null;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$4 = null;
                                    chunkedTransferEncodingKt$encodeChunked$22.L$5 = null;
                                    chunkedTransferEncodingKt$encodeChunked$22.label = 3;
                                    C5077 c5077 = AbstractC5078.f13099;
                                    if (AbstractC5078.m9248(interfaceC50792, bArr, 0, bArr.length, chunkedTransferEncodingKt$encodeChunked$22) != coroutineSingletons) {
                                        interfaceC50793 = interfaceC50792;
                                        chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$22;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC50793 = interfaceC50792;
                                interfaceC50844 = interfaceC50842;
                                chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$22;
                            }
                        }
                        if (interfaceC50842.mo9200()) {
                            ref$IntRef3 = new Ref$IntRef();
                            c6309Mo11162 = interfaceC50842.mo9202().mo11162();
                            if (c6309Mo11162.mo11163()) {
                                throw new IllegalArgumentException("Buffer is empty");
                            }
                            C6311 c63114 = c6309Mo11162.f15488;
                            c63114.getClass();
                            byte[] bArr2 = c63114.f15495;
                            int i5 = c63114.f15494;
                            int i6 = c63114.f15493;
                            if (i6 != i5) {
                                chunkedTransferEncodingKt$encodeChunked$23.L$0 = interfaceC50792;
                                chunkedTransferEncodingKt$encodeChunked$23.L$1 = interfaceC50843;
                                chunkedTransferEncodingKt$encodeChunked$23.L$2 = ref$IntRef3;
                                chunkedTransferEncodingKt$encodeChunked$23.L$3 = c6309Mo11162;
                                chunkedTransferEncodingKt$encodeChunked$23.L$4 = c63114;
                                chunkedTransferEncodingKt$encodeChunked$23.L$5 = ref$IntRef3;
                                chunkedTransferEncodingKt$encodeChunked$23.label = 2;
                                Object objM8904 = m8904(interfaceC50792, bArr2, i5, i6, chunkedTransferEncodingKt$encodeChunked$23);
                                if (objM8904 != coroutineSingletons) {
                                    ChunkedTransferEncodingKt$encodeChunked$2 chunkedTransferEncodingKt$encodeChunked$24 = chunkedTransferEncodingKt$encodeChunked$23;
                                    c6309 = c6309Mo11162;
                                    chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$24;
                                    interfaceC50796 = interfaceC50792;
                                    interfaceC50846 = interfaceC50843;
                                    c6311 = c63114;
                                    ref$IntRef = ref$IntRef3;
                                    ref$IntRef2 = ref$IntRef;
                                    obj = objM8904;
                                    C6311 c631122 = c6311;
                                    chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$2;
                                    C6309 c6309Mo111622 = c6309;
                                    C6311 c631132 = c631122;
                                    Object num2 = obj;
                                    Ref$IntRef ref$IntRef32 = ref$IntRef;
                                    interfaceC50792 = interfaceC50796;
                                    ref$IntRef32.element = ((Number) num2).intValue();
                                    int i42 = ref$IntRef2.element;
                                    if (i42 != 0) {
                                    }
                                    interfaceC50842 = interfaceC50846;
                                    i3 = 1;
                                    while (true) {
                                        if (!interfaceC50842.mo9200()) {
                                        }
                                    }
                                    if (interfaceC50842.mo9200()) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            num2 = new Integer(0);
                            interfaceC50846 = interfaceC50843;
                            chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$23;
                            c631132 = c63114;
                            ref$IntRef2 = ref$IntRef32;
                            ref$IntRef32.element = ((Number) num2).intValue();
                            int i422 = ref$IntRef2.element;
                            if (i422 != 0) {
                            }
                            interfaceC50842 = interfaceC50846;
                            i3 = 1;
                            while (true) {
                                if (!interfaceC50842.mo9200()) {
                                }
                            }
                            if (interfaceC50842.mo9200()) {
                                interfaceC50842 = interfaceC50843;
                                chunkedTransferEncodingKt$encodeChunked$22 = chunkedTransferEncodingKt$encodeChunked$23;
                                while (true) {
                                    if (!interfaceC50842.mo9200()) {
                                    }
                                }
                                if (interfaceC50842.mo9200()) {
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC50793 = interfaceC50792;
                        interfaceC50844 = interfaceC50843;
                        chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$23;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC50793 = interfaceC50792;
                    chunkedTransferEncodingKt$encodeChunked$2 = chunkedTransferEncodingKt$encodeChunked$22;
                    interfaceC50844 = interfaceC50846;
                }
            } catch (Throwable th5) {
                th = th5;
                interfaceC50844 = interfaceC50846;
                interfaceC50793 = interfaceC50796;
            }
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                if (i2 != 5) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th6 = (Throwable) chunkedTransferEncodingKt$encodeChunked$2.L$0;
                AbstractC6017.m10769(obj);
                throw th6;
            }
            interfaceC50844 = (InterfaceC5084) chunkedTransferEncodingKt$encodeChunked$2.L$1;
            interfaceC50793 = (InterfaceC5079) chunkedTransferEncodingKt$encodeChunked$2.L$0;
            try {
                AbstractC6017.m10769(obj);
                chunkedTransferEncodingKt$encodeChunked$2.L$0 = null;
                chunkedTransferEncodingKt$encodeChunked$2.L$1 = null;
                chunkedTransferEncodingKt$encodeChunked$2.label = 4;
            } catch (Throwable th7) {
                th = th7;
                AbstractC5078.m9251(interfaceC50793, th);
                interfaceC50844.mo9204(th);
                throw th;
            }
        }
        try {
            AbstractC5078.m9251(interfaceC50793, th);
            interfaceC50844.mo9204(th);
            throw th;
        } catch (Throwable th8) {
            chunkedTransferEncodingKt$encodeChunked$2.L$0 = th8;
            chunkedTransferEncodingKt$encodeChunked$2.L$1 = null;
            chunkedTransferEncodingKt$encodeChunked$2.L$2 = null;
            chunkedTransferEncodingKt$encodeChunked$2.L$3 = null;
            chunkedTransferEncodingKt$encodeChunked$2.L$4 = null;
            chunkedTransferEncodingKt$encodeChunked$2.L$5 = null;
            chunkedTransferEncodingKt$encodeChunked$2.label = 5;
            if (((C5081) interfaceC50793).m9259(chunkedTransferEncodingKt$encodeChunked$2) != coroutineSingletons) {
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5062 m8902(InterfaceC5079 interfaceC5079, InterfaceC5192 interfaceC5192) {
        interfaceC5079.getClass();
        interfaceC5192.getClass();
        ChunkedTransferEncodingKt$encodeChunked$1 chunkedTransferEncodingKt$encodeChunked$1 = new ChunkedTransferEncodingKt$encodeChunked$1(interfaceC5079, null);
        return AbstractC5076.m9219(C6299.f15471, interfaceC5192, new C5081(false), chunkedTransferEncodingKt$encodeChunked$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x017e, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r1).m9263(r3) == r2) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da A[Catch: all -> 0x0057, TryCatch #2 {all -> 0x0057, blocks: (B:15:0x004f, B:33:0x00d2, B:35:0x00da, B:37:0x00e0, B:39:0x00e6, B:45:0x00f9, B:49:0x0113, B:53:0x012c, B:55:0x0138, B:42:0x00f1, B:77:0x01b2, B:78:0x01b9, B:79:0x01ba, B:80:0x01c1, B:20:0x006d, B:23:0x0085, B:26:0x009b), top: B:94:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162 A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #0 {all -> 0x0191, blocks: (B:59:0x015a, B:61:0x0162, B:71:0x0189, B:72:0x0190, B:75:0x0196, B:76:0x01b1), top: B:91:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0196 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:59:0x015a, B:61:0x0162, B:71:0x0189, B:72:0x0190, B:75:0x0196, B:76:0x01b1), top: B:91:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba A[Catch: all -> 0x0057, TryCatch #2 {all -> 0x0057, blocks: (B:15:0x004f, B:33:0x00d2, B:35:0x00da, B:37:0x00e0, B:39:0x00e6, B:45:0x00f9, B:49:0x0113, B:53:0x012c, B:55:0x0138, B:42:0x00f1, B:77:0x01b2, B:78:0x01b9, B:79:0x01ba, B:80:0x01c1, B:20:0x006d, B:23:0x0085, B:26:0x009b), top: B:94:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0153 -> B:16:0x0052). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8903(InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, ContinuationImpl continuationImpl) {
        ChunkedTransferEncodingKt$decodeChunked$2 chunkedTransferEncodingKt$decodeChunked$2;
        InterfaceC5079 interfaceC50792;
        long j;
        ChunkedTransferEncodingKt$decodeChunked$2 chunkedTransferEncodingKt$decodeChunked$22;
        InterfaceC5079 interfaceC50793;
        long j2;
        StringBuilder sb;
        InterfaceC5079 interfaceC50794;
        InterfaceC5084 interfaceC50842;
        long j3;
        long j4;
        InterfaceC5084 interfaceC50843;
        long j5;
        InterfaceC5084 interfaceC50844;
        long j6;
        C5081 c5081;
        StringBuilder sb2;
        if (continuationImpl instanceof ChunkedTransferEncodingKt$decodeChunked$2) {
            chunkedTransferEncodingKt$decodeChunked$2 = (ChunkedTransferEncodingKt$decodeChunked$2) continuationImpl;
            int i = chunkedTransferEncodingKt$decodeChunked$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chunkedTransferEncodingKt$decodeChunked$2.label = i - Integer.MIN_VALUE;
            } else {
                chunkedTransferEncodingKt$decodeChunked$2 = new ChunkedTransferEncodingKt$decodeChunked$2(continuationImpl);
            }
        }
        Object objM9231 = chunkedTransferEncodingKt$decodeChunked$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj = chunkedTransferEncodingKt$decodeChunked$2.label;
        C4790 c4790 = f12529;
        try {
            switch (obj) {
                case 0:
                    j = 0;
                    AbstractC6017.m10769(objM9231);
                    StringBuilder sb3 = (StringBuilder) c4790.mo8894();
                    chunkedTransferEncodingKt$decodeChunked$22 = chunkedTransferEncodingKt$decodeChunked$2;
                    long j7 = 0;
                    InterfaceC5084 interfaceC50845 = interfaceC5084;
                    interfaceC50793 = interfaceC5079;
                    try {
                        sb3.setLength(0);
                        chunkedTransferEncodingKt$decodeChunked$22.L$0 = interfaceC50845;
                        chunkedTransferEncodingKt$decodeChunked$22.L$1 = interfaceC50793;
                        chunkedTransferEncodingKt$decodeChunked$22.L$2 = sb3;
                        chunkedTransferEncodingKt$decodeChunked$22.J$0 = j7;
                        chunkedTransferEncodingKt$decodeChunked$22.label = 1;
                        Object objM92312 = AbstractC5076.m9231(interfaceC50845, sb3, 128, chunkedTransferEncodingKt$decodeChunked$22);
                        if (objM92312 != coroutineSingletons) {
                            interfaceC50794 = interfaceC50793;
                            chunkedTransferEncodingKt$decodeChunked$2 = chunkedTransferEncodingKt$decodeChunked$22;
                            sb = sb3;
                            long j8 = j7;
                            interfaceC50842 = interfaceC50845;
                            objM9231 = objM92312;
                            j2 = j8;
                            if (!((Boolean) objM9231).booleanValue()) {
                                throw new EOFException("Chunked stream has ended unexpectedly: no chunk size");
                            }
                            if (sb.length() == 0) {
                                throw new EOFException("Invalid chunk size: empty");
                            }
                            long jM8888 = (sb.length() == 1 && sb.charAt(0) == '0') ? j : AbstractC4782.m8888(sb);
                            if (jM8888 > j) {
                                chunkedTransferEncodingKt$decodeChunked$2.L$0 = interfaceC50842;
                                chunkedTransferEncodingKt$decodeChunked$2.L$1 = interfaceC50794;
                                chunkedTransferEncodingKt$decodeChunked$2.L$2 = sb;
                                chunkedTransferEncodingKt$decodeChunked$2.J$0 = j2;
                                chunkedTransferEncodingKt$decodeChunked$2.J$1 = jM8888;
                                chunkedTransferEncodingKt$decodeChunked$2.label = 2;
                                if (AbstractC5076.m9222(interfaceC50842, interfaceC50794, jM8888, chunkedTransferEncodingKt$decodeChunked$2) != coroutineSingletons) {
                                    interfaceC50843 = interfaceC50842;
                                    j4 = j2;
                                    j3 = jM8888;
                                    chunkedTransferEncodingKt$decodeChunked$2.L$0 = interfaceC50843;
                                    chunkedTransferEncodingKt$decodeChunked$2.L$1 = interfaceC50794;
                                    chunkedTransferEncodingKt$decodeChunked$2.L$2 = sb;
                                    chunkedTransferEncodingKt$decodeChunked$2.J$0 = j4;
                                    chunkedTransferEncodingKt$decodeChunked$2.J$1 = j3;
                                    chunkedTransferEncodingKt$decodeChunked$2.label = 3;
                                    c5081 = (C5081) interfaceC50794;
                                    if (c5081.m9259(chunkedTransferEncodingKt$decodeChunked$2) == coroutineSingletons) {
                                        interfaceC50794 = c5081;
                                        long j9 = j4 + j3;
                                        interfaceC50842 = interfaceC50843;
                                        j5 = j9;
                                        sb.getClass();
                                        sb.setLength(0);
                                        chunkedTransferEncodingKt$decodeChunked$2.L$0 = interfaceC50842;
                                        chunkedTransferEncodingKt$decodeChunked$2.L$1 = interfaceC50794;
                                        chunkedTransferEncodingKt$decodeChunked$2.L$2 = sb;
                                        chunkedTransferEncodingKt$decodeChunked$2.J$0 = j5;
                                        chunkedTransferEncodingKt$decodeChunked$2.J$1 = j3;
                                        chunkedTransferEncodingKt$decodeChunked$2.label = 4;
                                        objM9231 = AbstractC5076.m9231(interfaceC50842, sb, 2, chunkedTransferEncodingKt$decodeChunked$2);
                                        if (objM9231 != coroutineSingletons) {
                                            try {
                                                long j10 = j3;
                                                interfaceC50844 = interfaceC50842;
                                                j6 = j10;
                                                if (!((Boolean) objM9231).booleanValue()) {
                                                    throw new EOFException("Invalid chunk: content block of size " + j6 + " ended unexpectedly");
                                                }
                                                if (sb2.length() > 0) {
                                                    throw new EOFException("Invalid chunk: content block should end with CR+LF");
                                                }
                                                if (j6 == j) {
                                                    c4790.mo8893(sb2);
                                                    chunkedTransferEncodingKt$decodeChunked$22.L$0 = null;
                                                    chunkedTransferEncodingKt$decodeChunked$22.L$1 = null;
                                                    chunkedTransferEncodingKt$decodeChunked$22.L$2 = null;
                                                    chunkedTransferEncodingKt$decodeChunked$22.label = 5;
                                                    break;
                                                } else {
                                                    interfaceC50845 = interfaceC50844;
                                                    sb3 = sb2;
                                                    j7 = j5;
                                                    sb3.setLength(0);
                                                    chunkedTransferEncodingKt$decodeChunked$22.L$0 = interfaceC50845;
                                                    chunkedTransferEncodingKt$decodeChunked$22.L$1 = interfaceC50793;
                                                    chunkedTransferEncodingKt$decodeChunked$22.L$2 = sb3;
                                                    chunkedTransferEncodingKt$decodeChunked$22.J$0 = j7;
                                                    chunkedTransferEncodingKt$decodeChunked$22.label = 1;
                                                    Object objM923122 = AbstractC5076.m9231(interfaceC50845, sb3, 128, chunkedTransferEncodingKt$decodeChunked$22);
                                                    if (objM923122 != coroutineSingletons) {
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                interfaceC50792 = interfaceC50793;
                                                chunkedTransferEncodingKt$decodeChunked$2 = chunkedTransferEncodingKt$decodeChunked$22;
                                                obj = sb2;
                                                try {
                                                    AbstractC5078.m9251(interfaceC50792, th);
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    c4790.mo8893(obj);
                                                    chunkedTransferEncodingKt$decodeChunked$2.L$0 = th2;
                                                    chunkedTransferEncodingKt$decodeChunked$2.L$1 = null;
                                                    chunkedTransferEncodingKt$decodeChunked$2.L$2 = null;
                                                    chunkedTransferEncodingKt$decodeChunked$2.label = 6;
                                                    if (((C5081) interfaceC50792).m9263(chunkedTransferEncodingKt$decodeChunked$2) != coroutineSingletons) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            sb2 = sb;
                                            chunkedTransferEncodingKt$decodeChunked$22 = chunkedTransferEncodingKt$decodeChunked$2;
                                            interfaceC50793 = interfaceC50794;
                                        }
                                    }
                                }
                            } else {
                                j5 = j2;
                                j3 = jM8888;
                                sb.getClass();
                                sb.setLength(0);
                                chunkedTransferEncodingKt$decodeChunked$2.L$0 = interfaceC50842;
                                chunkedTransferEncodingKt$decodeChunked$2.L$1 = interfaceC50794;
                                chunkedTransferEncodingKt$decodeChunked$2.L$2 = sb;
                                chunkedTransferEncodingKt$decodeChunked$2.J$0 = j5;
                                chunkedTransferEncodingKt$decodeChunked$2.J$1 = j3;
                                chunkedTransferEncodingKt$decodeChunked$2.label = 4;
                                objM9231 = AbstractC5076.m9231(interfaceC50842, sb, 2, chunkedTransferEncodingKt$decodeChunked$2);
                                if (objM9231 != coroutineSingletons) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC50792 = interfaceC50793;
                        chunkedTransferEncodingKt$decodeChunked$2 = chunkedTransferEncodingKt$decodeChunked$22;
                        obj = sb3;
                        AbstractC5078.m9251(interfaceC50792, th);
                        throw th;
                    }
                case 1:
                    j = 0;
                    j2 = chunkedTransferEncodingKt$decodeChunked$2.J$0;
                    sb = (StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.L$2;
                    interfaceC50794 = (InterfaceC5079) chunkedTransferEncodingKt$decodeChunked$2.L$1;
                    interfaceC50842 = (InterfaceC5084) chunkedTransferEncodingKt$decodeChunked$2.L$0;
                    AbstractC6017.m10769(objM9231);
                    if (!((Boolean) objM9231).booleanValue()) {
                    }
                    break;
                case 2:
                    j = 0;
                    j3 = chunkedTransferEncodingKt$decodeChunked$2.J$1;
                    j4 = chunkedTransferEncodingKt$decodeChunked$2.J$0;
                    sb = (StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.L$2;
                    interfaceC50794 = (InterfaceC5079) chunkedTransferEncodingKt$decodeChunked$2.L$1;
                    interfaceC50843 = (InterfaceC5084) chunkedTransferEncodingKt$decodeChunked$2.L$0;
                    AbstractC6017.m10769(objM9231);
                    chunkedTransferEncodingKt$decodeChunked$2.L$0 = interfaceC50843;
                    chunkedTransferEncodingKt$decodeChunked$2.L$1 = interfaceC50794;
                    chunkedTransferEncodingKt$decodeChunked$2.L$2 = sb;
                    chunkedTransferEncodingKt$decodeChunked$2.J$0 = j4;
                    chunkedTransferEncodingKt$decodeChunked$2.J$1 = j3;
                    chunkedTransferEncodingKt$decodeChunked$2.label = 3;
                    c5081 = (C5081) interfaceC50794;
                    if (c5081.m9259(chunkedTransferEncodingKt$decodeChunked$2) == coroutineSingletons) {
                    }
                    break;
                case 3:
                    j = 0;
                    j3 = chunkedTransferEncodingKt$decodeChunked$2.J$1;
                    j4 = chunkedTransferEncodingKt$decodeChunked$2.J$0;
                    sb = (StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.L$2;
                    interfaceC50794 = (InterfaceC5079) chunkedTransferEncodingKt$decodeChunked$2.L$1;
                    interfaceC50843 = (InterfaceC5084) chunkedTransferEncodingKt$decodeChunked$2.L$0;
                    AbstractC6017.m10769(objM9231);
                    long j92 = j4 + j3;
                    interfaceC50842 = interfaceC50843;
                    j5 = j92;
                    sb.getClass();
                    sb.setLength(0);
                    chunkedTransferEncodingKt$decodeChunked$2.L$0 = interfaceC50842;
                    chunkedTransferEncodingKt$decodeChunked$2.L$1 = interfaceC50794;
                    chunkedTransferEncodingKt$decodeChunked$2.L$2 = sb;
                    chunkedTransferEncodingKt$decodeChunked$2.J$0 = j5;
                    chunkedTransferEncodingKt$decodeChunked$2.J$1 = j3;
                    chunkedTransferEncodingKt$decodeChunked$2.label = 4;
                    objM9231 = AbstractC5076.m9231(interfaceC50842, sb, 2, chunkedTransferEncodingKt$decodeChunked$2);
                    if (objM9231 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                case 4:
                    j6 = chunkedTransferEncodingKt$decodeChunked$2.J$1;
                    j5 = chunkedTransferEncodingKt$decodeChunked$2.J$0;
                    sb = (StringBuilder) chunkedTransferEncodingKt$decodeChunked$2.L$2;
                    interfaceC50794 = (InterfaceC5079) chunkedTransferEncodingKt$decodeChunked$2.L$1;
                    j = 0;
                    interfaceC50844 = (InterfaceC5084) chunkedTransferEncodingKt$decodeChunked$2.L$0;
                    AbstractC6017.m10769(objM9231);
                    sb2 = sb;
                    chunkedTransferEncodingKt$decodeChunked$22 = chunkedTransferEncodingKt$decodeChunked$2;
                    interfaceC50793 = interfaceC50794;
                    if (!((Boolean) objM9231).booleanValue()) {
                    }
                    break;
                case 5:
                    AbstractC6017.m10769(objM9231);
                    return C6008.f15084;
                case 6:
                    Throwable th4 = (Throwable) chunkedTransferEncodingKt$decodeChunked$2.L$0;
                    AbstractC6017.m10769(objM9231);
                    throw th4;
                default:
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r10).m9259(r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[PHI: r9 r10
  0x00ce: PHI (r9v5 int) = (r9v4 int), (r9v11 int) binds: [B:34:0x00cb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r10v7 io.ktor.utils.io.飘花落叶言子楪哲苏世兰) = (r10v6 io.ktor.utils.io.飘花落叶言子楪哲苏世兰), (r10v17 io.ktor.utils.io.飘花落叶言子楪哲苏世兰) binds: [B:34:0x00cb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8904(InterfaceC5079 interfaceC5079, byte[] bArr, int i, int i2, ContinuationImpl continuationImpl) {
        ChunkedTransferEncodingKt$writeChunk$1 chunkedTransferEncodingKt$writeChunk$1;
        int i3;
        byte[] bArr2;
        int i4;
        InterfaceC5079 interfaceC50792;
        int i5;
        InterfaceC5079 interfaceC50793;
        byte[] bArr3;
        if (continuationImpl instanceof ChunkedTransferEncodingKt$writeChunk$1) {
            chunkedTransferEncodingKt$writeChunk$1 = (ChunkedTransferEncodingKt$writeChunk$1) continuationImpl;
            int i6 = chunkedTransferEncodingKt$writeChunk$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                chunkedTransferEncodingKt$writeChunk$1.label = i6 - Integer.MIN_VALUE;
            } else {
                chunkedTransferEncodingKt$writeChunk$1 = new ChunkedTransferEncodingKt$writeChunk$1(continuationImpl);
            }
        }
        Object obj = chunkedTransferEncodingKt$writeChunk$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = chunkedTransferEncodingKt$writeChunk$1.label;
        if (i7 == 0) {
            AbstractC6017.m10769(obj);
            i3 = i2 - i;
            chunkedTransferEncodingKt$writeChunk$1.L$0 = interfaceC5079;
            chunkedTransferEncodingKt$writeChunk$1.L$1 = bArr;
            chunkedTransferEncodingKt$writeChunk$1.I$0 = i;
            chunkedTransferEncodingKt$writeChunk$1.I$1 = i2;
            chunkedTransferEncodingKt$writeChunk$1.I$2 = i3;
            chunkedTransferEncodingKt$writeChunk$1.label = 1;
            if (AbstractC4782.m8887(interfaceC5079, i3, chunkedTransferEncodingKt$writeChunk$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i7 == 1) {
            int i8 = chunkedTransferEncodingKt$writeChunk$1.I$2;
            i2 = chunkedTransferEncodingKt$writeChunk$1.I$1;
            i = chunkedTransferEncodingKt$writeChunk$1.I$0;
            bArr = (byte[]) chunkedTransferEncodingKt$writeChunk$1.L$1;
            InterfaceC5079 interfaceC50794 = (InterfaceC5079) chunkedTransferEncodingKt$writeChunk$1.L$0;
            AbstractC6017.m10769(obj);
            i3 = i8;
            interfaceC5079 = interfaceC50794;
        } else {
            if (i7 == 2) {
                i5 = chunkedTransferEncodingKt$writeChunk$1.I$2;
                i4 = chunkedTransferEncodingKt$writeChunk$1.I$1;
                i = chunkedTransferEncodingKt$writeChunk$1.I$0;
                bArr2 = (byte[]) chunkedTransferEncodingKt$writeChunk$1.L$1;
                interfaceC50792 = (InterfaceC5079) chunkedTransferEncodingKt$writeChunk$1.L$0;
                AbstractC6017.m10769(obj);
                chunkedTransferEncodingKt$writeChunk$1.L$0 = interfaceC50792;
                chunkedTransferEncodingKt$writeChunk$1.L$1 = null;
                chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                chunkedTransferEncodingKt$writeChunk$1.label = 3;
                if (AbstractC5078.m9248(interfaceC50792, bArr2, i, i4, chunkedTransferEncodingKt$writeChunk$1) != coroutineSingletons) {
                    interfaceC50793 = interfaceC50792;
                    chunkedTransferEncodingKt$writeChunk$1.L$0 = interfaceC50793;
                    chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                    chunkedTransferEncodingKt$writeChunk$1.label = 4;
                    C5077 c5077 = AbstractC5078.f13099;
                    bArr3 = f12528;
                    if (AbstractC5078.m9248(interfaceC50793, bArr3, 0, bArr3.length, chunkedTransferEncodingKt$writeChunk$1) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i7 == 3) {
                i5 = chunkedTransferEncodingKt$writeChunk$1.I$0;
                interfaceC50793 = (InterfaceC5079) chunkedTransferEncodingKt$writeChunk$1.L$0;
                AbstractC6017.m10769(obj);
                chunkedTransferEncodingKt$writeChunk$1.L$0 = interfaceC50793;
                chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                chunkedTransferEncodingKt$writeChunk$1.label = 4;
                C5077 c50772 = AbstractC5078.f13099;
                bArr3 = f12528;
                if (AbstractC5078.m9248(interfaceC50793, bArr3, 0, bArr3.length, chunkedTransferEncodingKt$writeChunk$1) != coroutineSingletons) {
                    chunkedTransferEncodingKt$writeChunk$1.L$0 = null;
                    chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
                    chunkedTransferEncodingKt$writeChunk$1.label = 5;
                }
                return coroutineSingletons;
            }
            if (i7 != 4) {
                if (i7 != 5) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = chunkedTransferEncodingKt$writeChunk$1.I$0;
                AbstractC6017.m10769(obj);
                return new Integer(i5);
            }
            i5 = chunkedTransferEncodingKt$writeChunk$1.I$0;
            interfaceC50793 = (InterfaceC5079) chunkedTransferEncodingKt$writeChunk$1.L$0;
            AbstractC6017.m10769(obj);
            chunkedTransferEncodingKt$writeChunk$1.L$0 = null;
            chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
            chunkedTransferEncodingKt$writeChunk$1.label = 5;
        }
        chunkedTransferEncodingKt$writeChunk$1.L$0 = interfaceC5079;
        chunkedTransferEncodingKt$writeChunk$1.L$1 = bArr;
        chunkedTransferEncodingKt$writeChunk$1.I$0 = i;
        chunkedTransferEncodingKt$writeChunk$1.I$1 = i2;
        chunkedTransferEncodingKt$writeChunk$1.I$2 = i3;
        chunkedTransferEncodingKt$writeChunk$1.label = 2;
        if (AbstractC5078.m9253(interfaceC5079, (short) 3338, chunkedTransferEncodingKt$writeChunk$1) != coroutineSingletons) {
            int i9 = i2;
            bArr2 = bArr;
            i4 = i9;
            interfaceC50792 = interfaceC5079;
            i5 = i3;
            chunkedTransferEncodingKt$writeChunk$1.L$0 = interfaceC50792;
            chunkedTransferEncodingKt$writeChunk$1.L$1 = null;
            chunkedTransferEncodingKt$writeChunk$1.I$0 = i5;
            chunkedTransferEncodingKt$writeChunk$1.label = 3;
            if (AbstractC5078.m9248(interfaceC50792, bArr2, i, i4, chunkedTransferEncodingKt$writeChunk$1) != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
