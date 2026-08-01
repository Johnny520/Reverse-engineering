package io.ktor.http.cio;

import com.bumptech.glide.AbstractC3897;
import io.ktor.http.cio.internals.C4786;
import io.ktor.http.content.AbstractC4821;
import io.ktor.http.content.C4820;
import io.ktor.http.content.C4823;
import io.ktor.http.content.InterfaceC4809;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.C6036;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.InterfaceC6313;
import p050.AbstractC7173;
import p068.InterfaceC7372;
import p110.C8034;
import p160.C8376;
import p191.AbstractC8568;
import p252.C8939;
import p252.C8952;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4791 implements InterfaceC4809, InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public AbstractC4821 f12531;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6036 f12532;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5192 f12533;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4791(InterfaceC5192 interfaceC5192, InterfaceC5084 interfaceC5084, String str, Long l, long j) throws IOException {
        int i;
        char c;
        interfaceC5192.getClass();
        this.f12533 = interfaceC5192;
        C8034 c8034 = AbstractC4801.f12552;
        if (!AbstractC5976.m10702(str, "multipart/", true)) {
            C8376.m13328(str, "Failed to parse multipart: Content-Type should be multipart/* but it is ");
            throw null;
        }
        int length = str.length();
        char c2 = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                c = '\"';
                i = -1;
                break;
            }
            char cCharAt = str.charAt(i);
            if (c2 == 0) {
                i = cCharAt != ';' ? i + 1 : 0;
                c2 = 1;
            } else if (c2 != 1) {
                if (c2 != 2) {
                    if (c2 == 3) {
                        if (cCharAt != '\"') {
                            if (cCharAt == '\\') {
                                c2 = 4;
                            }
                        }
                        c2 = 1;
                    } else if (c2 == 4) {
                        c2 = 3;
                    }
                } else if (cCharAt != '\"') {
                    if (cCharAt != ',') {
                        if (cCharAt != ';') {
                        }
                        c2 = 1;
                    } else {
                        c2 = 0;
                    }
                }
            } else if (cCharAt == '=') {
                c2 = 2;
            } else if (cCharAt != ';') {
                if (cCharAt != ',') {
                    if (cCharAt == ' ') {
                        continue;
                    } else {
                        if (i2 == 0) {
                            c = '\"';
                            if (AbstractC5976.m10707(str, i, "boundary=", 0, 9, true)) {
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
            i2 = 0;
        }
        if (i == -1) {
            C6755.m11866("Failed to parse multipart: Content-Type's boundary parameter is missing");
            throw null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(74);
        byteBufferAllocate.getClass();
        byteBufferAllocate.put((byte) 13);
        byteBufferAllocate.put((byte) 10);
        byteBufferAllocate.put((byte) 45);
        byteBufferAllocate.put((byte) 45);
        int length2 = str.length();
        char c3 = 0;
        for (int i3 = i + 9; i3 < length2; i3++) {
            char cCharAt2 = str.charAt(i3);
            int i4 = 65535 & cCharAt2;
            if (i4 > 127) {
                AbstractC8568.m13642(16);
                String string = Integer.toString(i4, 16);
                string.getClass();
                throw new IOException("Failed to parse multipart: wrong boundary byte 0x" + string + " - should be 7bit character");
            }
            if (c3 == 0) {
                if (cCharAt2 == ' ') {
                    continue;
                } else if (cCharAt2 == c) {
                    c3 = 2;
                } else {
                    if (cCharAt2 == ',' || cCharAt2 == ';') {
                        break;
                    }
                    byteBufferAllocate.put((byte) i4);
                    c3 = 1;
                }
            } else if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 == 3) {
                        if (!byteBufferAllocate.hasRemaining()) {
                            C6755.m11866("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
                            throw null;
                        }
                        byteBufferAllocate.put((byte) i4);
                        c3 = 2;
                    }
                } else if (cCharAt2 == '\\') {
                    c3 = 3;
                } else {
                    if (cCharAt2 == c) {
                        break;
                    }
                    if (!byteBufferAllocate.hasRemaining()) {
                        C6755.m11866("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
                        throw null;
                    }
                    byteBufferAllocate.put((byte) i4);
                }
            } else {
                if (cCharAt2 == ' ' || cCharAt2 == ',' || cCharAt2 == ';') {
                    break;
                }
                if (!byteBufferAllocate.hasRemaining()) {
                    C6755.m11866("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
                    throw null;
                }
                byteBufferAllocate.put((byte) i4);
            }
        }
        byteBufferAllocate.flip();
        if (byteBufferAllocate.remaining() == 4) {
            C6755.m11866("Empty multipart boundary is not allowed");
            throw null;
        }
        int iRemaining = byteBufferAllocate.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBufferAllocate.mark();
        byteBufferAllocate.get(bArr);
        byteBufferAllocate.reset();
        this.f12532 = AbstractC6037.m10836(this, null, 0, new MultipartKt$parseMultipart$1(interfaceC5084, new C8034(bArr, 0, iRemaining), j, l, null), 3);
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12533;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: ClosedReceiveChannelException -> 0x0064, PHI: r6 r7
  0x0052: PHI (r6v1 'this' io.ktor.http.cio.飘花落叶言子楪世哲兰苏) = (r6v2 'this' io.ktor.http.cio.飘花落叶言子楪世哲兰苏), (r6v5 'this' io.ktor.http.cio.飘花落叶言子楪世哲兰苏) binds: [B:22:0x004f, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r7v2 java.lang.Object) = (r7v7 java.lang.Object), (r7v1 java.lang.Object) binds: [B:22:0x004f, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {ClosedReceiveChannelException -> 0x0064, blocks: (B:13:0x002b, B:27:0x005f, B:21:0x0040, B:24:0x0052, B:18:0x0039), top: B:31:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005c -> B:27:0x005f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8907(ContinuationImpl continuationImpl) throws Throwable {
        CIOMultipartDataBase$readPartSuspend$1 cIOMultipartDataBase$readPartSuspend$1;
        if (continuationImpl instanceof CIOMultipartDataBase$readPartSuspend$1) {
            cIOMultipartDataBase$readPartSuspend$1 = (CIOMultipartDataBase$readPartSuspend$1) continuationImpl;
            int i = cIOMultipartDataBase$readPartSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOMultipartDataBase$readPartSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOMultipartDataBase$readPartSuspend$1 = new CIOMultipartDataBase$readPartSuspend$1(this, continuationImpl);
            }
        }
        Object objM8910 = cIOMultipartDataBase$readPartSuspend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOMultipartDataBase$readPartSuspend$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(objM8910);
                C6036 c6036 = this.f12532;
                cIOMultipartDataBase$readPartSuspend$1.L$0 = this;
                cIOMultipartDataBase$readPartSuspend$1.label = 1;
                C6022 c6022 = c6036.f15143;
                c6022.getClass();
                objM8910 = C6022.m10781(c6022, cIOMultipartDataBase$readPartSuspend$1);
                if (objM8910 == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (C4791) cIOMultipartDataBase$readPartSuspend$1.L$0;
                AbstractC6017.m10769(objM8910);
                AbstractC4821 abstractC4821 = (AbstractC4821) objM8910;
                if (abstractC4821 != null) {
                    return abstractC4821;
                }
                C6036 c60362 = this.f12532;
                cIOMultipartDataBase$readPartSuspend$1.L$0 = this;
                cIOMultipartDataBase$readPartSuspend$1.label = 1;
                C6022 c60222 = c60362.f15143;
                c60222.getClass();
                objM8910 = C6022.m10781(c60222, cIOMultipartDataBase$readPartSuspend$1);
                if (objM8910 == coroutineSingletons) {
                    cIOMultipartDataBase$readPartSuspend$1.L$0 = this;
                    cIOMultipartDataBase$readPartSuspend$1.label = 2;
                    objM8910 = this.m8910((AbstractC4800) objM8910, cIOMultipartDataBase$readPartSuspend$1);
                }
                return coroutineSingletons;
            }
            this = (C4791) cIOMultipartDataBase$readPartSuspend$1.L$0;
            AbstractC6017.m10769(objM8910);
            cIOMultipartDataBase$readPartSuspend$1.L$0 = this;
            cIOMultipartDataBase$readPartSuspend$1.label = 2;
            objM8910 = this.m8910((AbstractC4800) objM8910, cIOMultipartDataBase$readPartSuspend$1);
        } catch (ClosedReceiveChannelException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0069 -> B:29:0x006c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8908(ContinuationImpl continuationImpl) throws Throwable {
        CIOMultipartDataBase$readPart$1 cIOMultipartDataBase$readPart$1;
        AbstractC4800 abstractC4800;
        if (continuationImpl instanceof CIOMultipartDataBase$readPart$1) {
            cIOMultipartDataBase$readPart$1 = (CIOMultipartDataBase$readPart$1) continuationImpl;
            int i = cIOMultipartDataBase$readPart$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOMultipartDataBase$readPart$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOMultipartDataBase$readPart$1 = new CIOMultipartDataBase$readPart$1(this, continuationImpl);
            }
        }
        Object objM8910 = cIOMultipartDataBase$readPart$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOMultipartDataBase$readPart$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM8910);
            AbstractC4821 abstractC4821 = this.f12531;
            if (abstractC4821 != null) {
                abstractC4821.f12589.invoke();
            }
            abstractC4800 = (AbstractC4800) C6034.m10831(this.f12532.f15143.mo10814());
            if (abstractC4800 != null) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(objM8910);
                return objM8910;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = (C4791) cIOMultipartDataBase$readPart$1.L$0;
        AbstractC6017.m10769(objM8910);
        AbstractC4821 abstractC48212 = (AbstractC4821) objM8910;
        if (abstractC48212 != null) {
            this.f12531 = abstractC48212;
            return abstractC48212;
        }
        abstractC4800 = (AbstractC4800) C6034.m10831(this.f12532.f15143.mo10814());
        if (abstractC4800 != null) {
            cIOMultipartDataBase$readPart$1.L$0 = null;
            cIOMultipartDataBase$readPart$1.label = 2;
            Object objM8907 = this.m8907(cIOMultipartDataBase$readPart$1);
            if (objM8907 != coroutineSingletons) {
                return objM8907;
            }
        } else {
            cIOMultipartDataBase$readPart$1.L$0 = this;
            cIOMultipartDataBase$readPart$1.label = 1;
            objM8910 = this.m8910(abstractC4800, cIOMultipartDataBase$readPart$1);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.http.cio.飘花落叶言子楪世哲苏兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8909(final C4796 c4796, ContinuationImpl continuationImpl) throws Exception {
        CIOMultipartDataBase$partToData$1 cIOMultipartDataBase$partToData$1;
        C8939 c8939;
        final C4796 c47962;
        C4806 c4806;
        if (continuationImpl instanceof CIOMultipartDataBase$partToData$1) {
            cIOMultipartDataBase$partToData$1 = (CIOMultipartDataBase$partToData$1) continuationImpl;
            int i = cIOMultipartDataBase$partToData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOMultipartDataBase$partToData$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOMultipartDataBase$partToData$1 = new CIOMultipartDataBase$partToData$1(this, continuationImpl);
            }
        }
        Object objM11132 = cIOMultipartDataBase$partToData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOMultipartDataBase$partToData$1.label;
        final int i3 = 1;
        if (i2 == 0) {
            AbstractC6017.m10769(objM11132);
            C6270 c6270 = c4796.f12544;
            cIOMultipartDataBase$partToData$1.L$0 = c4796;
            cIOMultipartDataBase$partToData$1.label = 1;
            objM11132 = c6270.m11132(cIOMultipartDataBase$partToData$1);
            if (objM11132 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            c4796 = (C4796) cIOMultipartDataBase$partToData$1.L$0;
            AbstractC6017.m10769(objM11132);
        } else {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4806 = (C4806) cIOMultipartDataBase$partToData$1.L$1;
            c47962 = (C4796) cIOMultipartDataBase$partToData$1.L$0;
            AbstractC6017.m10769(objM11132);
            InterfaceC6313 interfaceC6313 = (InterfaceC6313) objM11132;
            try {
                interfaceC6313.getClass();
                final int i4 = 0;
                C4820 c4820 = new C4820(AbstractC6310.m11189(interfaceC6313), new InterfaceC7372() { // from class: io.ktor.http.cio.飘花落叶言子楪世哲苏兰
                    @Override // p068.InterfaceC7372
                    public final Object invoke() throws Throwable {
                        int i5 = i4;
                        C6008 c6008 = C6008.f15084;
                        C4796 c47963 = c47962;
                        switch (i5) {
                            case 0:
                                c47963.mo8916();
                                break;
                            default:
                                c47963.mo8916();
                                break;
                        }
                        return c6008;
                    }
                }, new C4793(c4806));
                AbstractC3897.m7396(interfaceC6313, null);
                return c4820;
            } finally {
            }
        }
        C4806 c48062 = (C4806) objM11132;
        C4786 c4786M8939 = c48062.m8939("Content-Disposition");
        if (c4786M8939 != null) {
            int i5 = C8939.f22748;
            String string = c4786M8939.toString();
            string.getClass();
            C8952 c8952 = (C8952) AbstractC5176.m9367(AbstractC7173.m12435(string));
            c8939 = new C8939(c8952.f22767, c8952.f22766);
        } else {
            c8939 = null;
        }
        String strM869 = c8939 != null ? c8939.m869("filename") : null;
        C5081 c5081 = c4796.f12543;
        if (strM869 != null) {
            C4823 c4823 = new C4823(new InterfaceC7372() { // from class: io.ktor.http.cio.飘花落叶言子楪世哲苏兰
                @Override // p068.InterfaceC7372
                public final Object invoke() throws Throwable {
                    int i52 = i3;
                    C6008 c6008 = C6008.f15084;
                    C4796 c47963 = c4796;
                    switch (i52) {
                        case 0:
                            c47963.mo8916();
                            break;
                        default:
                            c47963.mo8916();
                            break;
                    }
                    return c6008;
                }
            }, new C4793(c48062));
            C8939 c89392 = (C8939) c4823.f12587.getValue();
            if (c89392 != null) {
                c89392.m869("filename");
            }
            return c4823;
        }
        cIOMultipartDataBase$partToData$1.L$0 = c4796;
        cIOMultipartDataBase$partToData$1.L$1 = c48062;
        cIOMultipartDataBase$partToData$1.label = 2;
        Object objM9232 = AbstractC5076.m9232(c5081, cIOMultipartDataBase$partToData$1);
        if (objM9232 != coroutineSingletons) {
            c47962 = c4796;
            c4806 = c48062;
            objM11132 = objM9232;
            InterfaceC6313 interfaceC63132 = (InterfaceC6313) objM11132;
            interfaceC63132.getClass();
            final int i42 = 0;
            C4820 c48202 = new C4820(AbstractC6310.m11189(interfaceC63132), new InterfaceC7372() { // from class: io.ktor.http.cio.飘花落叶言子楪世哲苏兰
                @Override // p068.InterfaceC7372
                public final Object invoke() throws Throwable {
                    int i52 = i42;
                    C6008 c6008 = C6008.f15084;
                    C4796 c47963 = c47962;
                    switch (i52) {
                        case 0:
                            c47963.mo8916();
                            break;
                        default:
                            c47963.mo8916();
                            break;
                    }
                    return c6008;
                }
            }, new C4793(c4806));
            AbstractC3897.m7396(interfaceC63132, null);
            return c48202;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8910(AbstractC4800 abstractC4800, ContinuationImpl continuationImpl) {
        CIOMultipartDataBase$eventToData$1 cIOMultipartDataBase$eventToData$1;
        if (continuationImpl instanceof CIOMultipartDataBase$eventToData$1) {
            cIOMultipartDataBase$eventToData$1 = (CIOMultipartDataBase$eventToData$1) continuationImpl;
            int i = cIOMultipartDataBase$eventToData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOMultipartDataBase$eventToData$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOMultipartDataBase$eventToData$1 = new CIOMultipartDataBase$eventToData$1(this, continuationImpl);
            }
        }
        Object objM8909 = cIOMultipartDataBase$eventToData$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOMultipartDataBase$eventToData$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(objM8909);
                if (!(abstractC4800 instanceof C4796)) {
                    return null;
                }
                cIOMultipartDataBase$eventToData$1.L$0 = abstractC4800;
                cIOMultipartDataBase$eventToData$1.label = 1;
                objM8909 = m8909((C4796) abstractC4800, cIOMultipartDataBase$eventToData$1);
                if (objM8909 == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(objM8909);
            }
            return (AbstractC4821) objM8909;
        } finally {
            abstractC4800.mo8916();
        }
    }
}
