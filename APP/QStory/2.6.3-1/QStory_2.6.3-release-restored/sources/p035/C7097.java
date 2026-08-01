package p035;

import androidx.activity.AbstractC0900;
import androidx.activity.compose.C0851;
import androidx.compose.foundation.text.selection.C1754;
import androidx.window.area.AbstractC3400;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.jvm.internal.C5860;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p020.C6921;
import p020.C6928;
import p020.InterfaceC6939;
import p025.AbstractC7012;
import p029.AbstractC7054;
import p029.AbstractC7059;
import p031.C7064;
import p064.C7341;
import p068.InterfaceC7372;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7097 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Logger f17604;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7105 f17605;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7091 f17606;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6939 f17607;

    static {
        Logger logger = Logger.getLogger(AbstractC7108.class.getName());
        logger.getClass();
        f17604 = logger;
    }

    public C7097(C6928 c6928) {
        c6928.getClass();
        this.f17607 = c6928;
        C7105 c7105 = new C7105(c6928);
        this.f17605 = c7105;
        this.f17606 = new C7091(c7105);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17607.close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m12340(int i, int i2, int i3, int i4) throws IOException {
        C7105 c7105 = this.f17605;
        c7105.f17638 = i;
        c7105.f17641 = i;
        c7105.f17640 = i2;
        c7105.f17642 = i3;
        c7105.f17639 = i4;
        C7091 c7091 = this.f17606;
        C6928 c6928 = c7091.f17585;
        ArrayList arrayList = c7091.f17586;
        while (!c6928.m12062()) {
            byte b = c6928.readByte();
            byte[] bArr = AbstractC7054.f17503;
            int i5 = b & DefaultClassResolver.NAME;
            if (i5 == 128) {
                C6755.m11866("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iM12329 = c7091.m12329(i5, 127);
                int i6 = iM12329 - 1;
                if (i6 >= 0) {
                    C7093[] c7093Arr = AbstractC7109.f17683;
                    if (i6 <= c7093Arr.length - 1) {
                        arrayList.add(c7093Arr[i6]);
                    }
                }
                int length = c7091.f17583 + 1 + (i6 - AbstractC7109.f17683.length);
                if (length >= 0) {
                    C7093[] c7093Arr2 = c7091.f17584;
                    if (length < c7093Arr2.length) {
                        C7093 c7093 = c7093Arr2[length];
                        c7093.getClass();
                        arrayList.add(c7093);
                    }
                }
                C6755.m11866(AbstractC7012.m12147(iM12329, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                C7093[] c7093Arr3 = AbstractC7109.f17683;
                ByteString byteStringM12330 = c7091.m12330();
                AbstractC7109.m12375(byteStringM12330);
                c7091.m12331(new C7093(byteStringM12330, c7091.m12330()));
            } else if ((b & 64) == 64) {
                c7091.m12331(new C7093(c7091.m12332(c7091.m12329(i5, 63) - 1), c7091.m12330()));
            } else if ((b & 32) == 32) {
                int iM123292 = c7091.m12329(i5, 31);
                c7091.f17587 = iM123292;
                if (iM123292 < 0 || iM123292 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c7091.f17587);
                }
                int i7 = c7091.f17588;
                if (iM123292 < i7) {
                    if (iM123292 == 0) {
                        C7093[] c7093Arr4 = c7091.f17584;
                        AbstractC5179.m9393(0, c7093Arr4.length, null, c7093Arr4);
                        c7091.f17583 = c7091.f17584.length - 1;
                        c7091.f17582 = 0;
                        c7091.f17588 = 0;
                    } else {
                        c7091.m12333(i7 - iM123292);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C7093[] c7093Arr5 = AbstractC7109.f17683;
                ByteString byteStringM123302 = c7091.m12330();
                AbstractC7109.m12375(byteStringM123302);
                arrayList.add(new C7093(byteStringM123302, c7091.m12330()));
            } else {
                arrayList.add(new C7093(c7091.m12332(c7091.m12329(i5, 15) - 1), c7091.m12330()));
            }
        }
        List listM9356 = AbstractC5176.m9356(arrayList);
        arrayList.clear();
        return listM9356;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        r9.m12353(p023.C6980.f17237, true);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12341(C5860 c5860, int i, int i2, final int i3) throws IOException {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            C6755.m11866("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            C6755.m11866("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f17607.readByte();
            byte[] bArr = AbstractC7054.f17503;
            i4 = b & DefaultClassResolver.NAME;
        } else {
            i4 = 0;
        }
        final int iM12363 = AbstractC7104.m12363(i, i2, i4);
        InterfaceC6939 interfaceC6939 = this.f17607;
        interfaceC6939.getClass();
        final C7106 c7106 = (C7106) c5860.f14847;
        if (!((i3 == 0 || (i3 & 1) != 0) ? false : z)) {
            C7098 c7098M12365 = c7106.m12365(i3);
            if (c7098M12365 != null) {
                TimeZone timeZone = AbstractC7059.f17512;
                C7100 c7100 = c7098M12365.f17614;
                long j = iM12363;
                c7100.getClass();
                long j2 = j;
                while (true) {
                    C7098 c7098 = c7100.f17629;
                    if (j2 <= 0) {
                        TimeZone timeZone2 = AbstractC7059.f17512;
                        c7098.f17618.m12367(j);
                        c7100.f17629.f17618.f17660.getClass();
                        break;
                    }
                    synchronized (c7098) {
                        z2 = c7100.f17630;
                        z3 = c7100.f17628.f16992 + j2 > c7100.f17632;
                    }
                    if (z3) {
                        interfaceC6939.skip(j2);
                        c7100.f17629.m12345(ErrorCode.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        interfaceC6939.skip(j2);
                        break;
                    }
                    long jMo11491 = interfaceC6939.mo11491(c7100.f17631, j2);
                    if (jMo11491 == -1) {
                        throw new EOFException();
                    }
                    j2 -= jMo11491;
                    C7098 c70982 = c7100.f17629;
                    synchronized (c70982) {
                        try {
                            if (c7100.f17627) {
                                c7100.f17631.m12034();
                            } else {
                                C6921 c6921 = c7100.f17628;
                                boolean z5 = c6921.f16992 == 0;
                                c6921.mo12027(c7100.f17631);
                                if (z5) {
                                    c70982.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                ((C7106) c5860.f14847).m12369(i3, ErrorCode.PROTOCOL_ERROR);
                long j3 = iM12363;
                ((C7106) c5860.f14847).m12367(j3);
                interfaceC6939.skip(j3);
            }
        } else {
            final C6921 c69212 = new C6921();
            long j4 = iM12363;
            interfaceC6939.mo12046(j4);
            interfaceC6939.mo11491(c69212, j4);
            C7064.m12271(c7106.f17664, c7106.f17668 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i3 + "] onData", new InterfaceC7372(i3, c69212, iM12363, z4) { // from class: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪苏哲兰世

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ int f17691;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ int f17692;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ C6921 f17693;

                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    C7106 c71062 = this.f17694;
                    int i5 = this.f17692;
                    C6921 c69213 = this.f17693;
                    int i6 = this.f17691;
                    try {
                        c71062.f17653.getClass();
                        c69213.skip(i6);
                        c71062.f17645.m12359(i5, ErrorCode.CANCEL);
                        synchronized (c71062) {
                            c71062.f17647.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return C6008.f15084;
                }
            });
        }
        this.f17607.skip(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0237, code lost:
    
        top.suzhelan.qstory.hook.item.C6755.m11866(p025.AbstractC7012.m12147(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0240, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m12342(boolean z, C5860 c5860) throws Exception {
        int iM12245;
        Object[] array;
        try {
            this.f17607.mo12046(9L);
            iM12245 = AbstractC7054.m12245(this.f17607);
        } catch (EOFException unused) {
        }
        if (iM12245 > 16384) {
            C6755.m11866(AbstractC7012.m12147(iM12245, "FRAME_SIZE_ERROR: "));
            return false;
        }
        int i = this.f17607.readByte() & DefaultClassResolver.NAME;
        byte b = this.f17607.readByte();
        int i2 = b & DefaultClassResolver.NAME;
        int i3 = this.f17607.readInt();
        int i4 = Integer.MAX_VALUE & i3;
        if (i != 8) {
            Logger logger = f17604;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC7108.m12373(true, i4, iM12245, i, i2));
            }
        }
        if (z && i != 4) {
            C7092.m12336(AbstractC7108.m12374(i), "Expected a SETTINGS frame but was ");
            return false;
        }
        ErrorCode errorCode = null;
        switch (i) {
            case 0:
                m12341(c5860, iM12245, i2, i4);
                return true;
            case 1:
                m12344(c5860, iM12245, i2, i4);
                return true;
            case 2:
                if (iM12245 != 5) {
                    C6755.m11866(AbstractC0900.m722(iM12245, "TYPE_PRIORITY length: ", " != 5"));
                    return false;
                }
                if (i4 == 0) {
                    C6755.m11866("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                InterfaceC6939 interfaceC6939 = this.f17607;
                interfaceC6939.readInt();
                interfaceC6939.readByte();
                return true;
            case 3:
                if (iM12245 != 4) {
                    C6755.m11866(AbstractC0900.m722(iM12245, "TYPE_RST_STREAM length: ", " != 4"));
                    return false;
                }
                if (i4 == 0) {
                    C6755.m11866("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int i5 = this.f17607.readInt();
                ErrorCode.Companion.getClass();
                ErrorCode[] errorCodeArrValues = ErrorCode.values();
                int length = errorCodeArrValues.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length) {
                        ErrorCode errorCode2 = errorCodeArrValues[i6];
                        if (errorCode2.getHttpCode() == i5) {
                            errorCode = errorCode2;
                        } else {
                            i6++;
                        }
                    }
                }
                if (errorCode == null) {
                    C6755.m11866(AbstractC7012.m12147(i5, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                }
                C7106 c7106 = (C7106) c5860.f14847;
                if (i4 != 0 && (i3 & 1) == 0) {
                    C7064.m12271(c7106.f17664, c7106.f17668 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i4 + "] onReset", new C1754(c7106, i4, errorCode));
                    return true;
                }
                C7098 c7098M12364 = c7106.m12364(i4);
                if (c7098M12364 != null) {
                    synchronized (c7098M12364) {
                        if (c7098M12364.m12351() == null) {
                            c7098M12364.f17609 = errorCode;
                            c7098M12364.notifyAll();
                        }
                        break;
                    }
                    return true;
                }
                return true;
            case 4:
                InterfaceC6939 interfaceC69392 = this.f17607;
                if (i4 != 0) {
                    C6755.m11866("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((b & 1) != 0) {
                    if (iM12245 != 0) {
                        C6755.m11866("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (iM12245 % 6 != 0) {
                    C6755.m11866(AbstractC7012.m12147(iM12245, "TYPE_SETTINGS length % 6 != 0: "));
                    return false;
                }
                C7087 c7087 = new C7087();
                C7341 c7341M5628 = AbstractC3400.m5628(AbstractC3400.m5627(0, iM12245), 6);
                int i7 = c7341M5628.f18163;
                int i8 = c7341M5628.f18161;
                int i9 = c7341M5628.f18162;
                if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                    while (true) {
                        short s = interfaceC69392.readShort();
                        byte[] bArr = AbstractC7054.f17503;
                        int i10 = s & 65535;
                        int i11 = interfaceC69392.readInt();
                        if (i10 != 2) {
                            if (i10 != 4) {
                                if (i10 == 5 && (i11 < 16384 || i11 > 16777215)) {
                                }
                            } else if (i11 < 0) {
                                C6755.m11866("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (i11 != 0 && i11 != 1) {
                            C6755.m11866("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        c7087.m12322(i10, i11);
                        if (i7 != i8) {
                            i7 += i9;
                        }
                        break;
                    }
                }
                C7106 c71062 = (C7106) c5860.f14847;
                C7064.m12271(c71062.f17663, AbstractC0900.m711(new StringBuilder(), c71062.f17668, " applyAndAckSettings"), new C0851(c5860, 14, c7087));
                return true;
            case 5:
                m12343(c5860, iM12245, i2, i4);
                return true;
            case 6:
                if (iM12245 != 8) {
                    C6755.m11866(AbstractC7012.m12147(iM12245, "TYPE_PING length != 8: "));
                    return false;
                }
                if (i4 != 0) {
                    C6755.m11866("TYPE_PING streamId != 0");
                    return false;
                }
                final int i12 = this.f17607.readInt();
                final int i13 = this.f17607.readInt();
                i = (b & 1) != 0 ? 1 : 0;
                C7106 c71063 = (C7106) c5860.f14847;
                if (i == 0) {
                    C7064 c7064 = c71063.f17663;
                    String strM711 = AbstractC0900.m711(new StringBuilder(), ((C7106) c5860.f14847).f17668, " ping");
                    final C7106 c71064 = (C7106) c5860.f14847;
                    C7064.m12271(c7064, strM711, new InterfaceC7372() { // from class: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪哲世兰苏
                        @Override // p068.InterfaceC7372
                        public final Object invoke() {
                            C7106 c71065 = c71064;
                            try {
                                c71065.f17645.m12361(i12, i13, true);
                            } catch (IOException e) {
                                ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                                c71065.m12366(errorCode3, errorCode3, e);
                            }
                            return C6008.f15084;
                        }
                    });
                    return true;
                }
                synchronized (c71063) {
                    try {
                        if (i12 == 1) {
                            c71063.f17652++;
                        } else if (i12 == 2) {
                            c71063.f17650++;
                        } else if (i12 == 3) {
                            c71063.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case 7:
                if (iM12245 < 8) {
                    C6755.m11866(AbstractC7012.m12147(iM12245, "TYPE_GOAWAY length < 8: "));
                    return false;
                }
                if (i4 != 0) {
                    C6755.m11866("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int i14 = this.f17607.readInt();
                int i15 = this.f17607.readInt();
                int i16 = iM12245 - 8;
                ErrorCode.Companion.getClass();
                ErrorCode[] errorCodeArrValues2 = ErrorCode.values();
                int length2 = errorCodeArrValues2.length;
                int i17 = 0;
                while (true) {
                    if (i17 < length2) {
                        ErrorCode errorCode3 = errorCodeArrValues2[i17];
                        if (errorCode3.getHttpCode() == i15) {
                            errorCode = errorCode3;
                        } else {
                            i17++;
                        }
                    }
                }
                if (errorCode == null) {
                    C6755.m11866(AbstractC7012.m12147(i15, "TYPE_GOAWAY unexpected error code: "));
                    return false;
                }
                ByteString byteStringMo12040 = ByteString.EMPTY;
                if (i16 > 0) {
                    byteStringMo12040 = this.f17607.mo12040(i16);
                }
                byteStringMo12040.getClass();
                byteStringMo12040.size();
                C7106 c71065 = (C7106) c5860.f14847;
                synchronized (c71065) {
                    array = c71065.f17667.values().toArray(new C7098[0]);
                    c71065.f17665 = true;
                }
                C7098[] c7098Arr = (C7098[]) array;
                int length3 = c7098Arr.length;
                while (i < length3) {
                    C7098 c7098 = c7098Arr[i];
                    if (c7098.f17620 > i14 && c7098.m12350()) {
                        ErrorCode errorCode4 = ErrorCode.REFUSED_STREAM;
                        errorCode4.getClass();
                        synchronized (c7098) {
                            if (c7098.m12351() == null) {
                                c7098.f17609 = errorCode4;
                                c7098.notifyAll();
                            }
                        }
                        ((C7106) c5860.f14847).m12364(c7098.f17620);
                    }
                    i++;
                }
                return true;
            case 8:
                try {
                    if (iM12245 != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iM12245);
                    }
                    long j = ((long) this.f17607.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = f17604;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(AbstractC7108.m12372(true, i4, iM12245, j));
                    }
                    C7106 c71066 = (C7106) c5860.f14847;
                    if (i4 == 0) {
                        synchronized (c71066) {
                            c71066.f17655 += j;
                            c71066.notifyAll();
                        }
                        return true;
                    }
                    C7098 c7098M12365 = c71066.m12365(i4);
                    if (c7098M12365 != null) {
                        synchronized (c7098M12365) {
                            c7098M12365.f17612 += j;
                            if (j > 0) {
                                c7098M12365.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    f17604.fine(AbstractC7108.m12373(true, i4, iM12245, 8, i2));
                    throw e;
                }
            default:
                this.f17607.skip(iM12245);
                return true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12343(C5860 c5860, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C6755.m11866("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f17607.readByte();
            byte[] bArr = AbstractC7054.f17503;
            i4 = b & DefaultClassResolver.NAME;
        } else {
            i4 = 0;
        }
        int i5 = this.f17607.readInt() & Integer.MAX_VALUE;
        List listM12340 = m12340(AbstractC7104.m12363(i - 4, i2, i4), i4, i2, i3);
        listM12340.getClass();
        C7106 c7106 = (C7106) c5860.f14847;
        synchronized (c7106) {
            if (c7106.f17647.contains(Integer.valueOf(i5))) {
                c7106.m12369(i5, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            c7106.f17647.add(Integer.valueOf(i5));
            C7064.m12271(c7106.f17664, c7106.f17668 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i5 + "] onRequest", new C7110(c7106, i5, listM12340));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12344(C5860 c5860, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C6755.m11866("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.f17607.readByte();
            byte[] bArr = AbstractC7054.f17503;
            i4 = b & DefaultClassResolver.NAME;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            InterfaceC6939 interfaceC6939 = this.f17607;
            interfaceC6939.readInt();
            interfaceC6939.readByte();
            byte[] bArr2 = AbstractC7054.f17503;
            i -= 5;
        }
        List listM12340 = m12340(AbstractC7104.m12363(i, i2, i4), i4, i2, i3);
        listM12340.getClass();
        C7106 c7106 = (C7106) c5860.f14847;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            C7064.m12271(c7106.f17664, c7106.f17668 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i3 + "] onHeaders", new C7110(c7106, i3, listM12340, z2));
            return;
        }
        synchronized (c7106) {
            C7098 c7098M12365 = c7106.m12365(i3);
            if (c7098M12365 != null) {
                c7098M12365.m12353(AbstractC7059.m12258(listM12340), z2);
                return;
            }
            if (c7106.f17665) {
                return;
            }
            if (i3 <= c7106.f17662) {
                return;
            }
            if (i3 % 2 == c7106.f17661 % 2) {
                return;
            }
            C7098 c7098 = new C7098(i3, c7106, false, z2, AbstractC7059.m12258(listM12340));
            c7106.f17662 = i3;
            c7106.f17667.put(Integer.valueOf(i3), c7098);
            C7064.m12271(c7106.f17666.m12268(), c7106.f17668 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i3 + "] onStream", new C0851(c7106, 13, c7098));
        }
    }
}
