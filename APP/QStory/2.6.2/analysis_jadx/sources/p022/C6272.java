package p022;

import androidx.activity.compose.C0004;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.jvm.internal.C5027;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p005.C6108;
import p005.InterfaceC6119;
import p007.AbstractC6136;
import p012.C6165;
import p017.AbstractC6233;
import p017.AbstractC6238;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6272 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Logger f17277;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6280 f17278;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6266 f17279;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6119 f17280;

    static {
        Logger logger = Logger.getLogger(AbstractC6283.class.getName());
        logger.getClass();
        f17277 = logger;
    }

    public C6272(C6108 c6108) {
        c6108.getClass();
        this.f17280 = c6108;
        C6280 c6280 = new C6280(c6108);
        this.f17278 = c6280;
        this.f17279 = new C6266(c6280);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17280.close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m11764(int i, int i2, int i3, int i4) throws IOException {
        C6280 c6280 = this.f17278;
        c6280.f17311 = i;
        c6280.f17314 = i;
        c6280.f17313 = i2;
        c6280.f17315 = i3;
        c6280.f17312 = i4;
        C6266 c6266 = this.f17279;
        C6108 c6108 = c6266.f17258;
        ArrayList arrayList = c6266.f17259;
        while (!c6108.m11510()) {
            byte b = c6108.readByte();
            byte[] bArr = AbstractC6233.f17181;
            int i5 = b & DefaultClassResolver.NAME;
            if (i5 == 128) {
                C5919.m11246("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iM11753 = c6266.m11753(i5, 127);
                int i6 = iM11753 - 1;
                if (i6 >= 0) {
                    C6268[] c6268Arr = AbstractC6284.f17356;
                    if (i6 <= c6268Arr.length - 1) {
                        arrayList.add(c6268Arr[i6]);
                    }
                }
                int length = c6266.f17256 + 1 + (i6 - AbstractC6284.f17356.length);
                if (length >= 0) {
                    C6268[] c6268Arr2 = c6266.f17257;
                    if (length < c6268Arr2.length) {
                        C6268 c6268 = c6268Arr2[length];
                        c6268.getClass();
                        arrayList.add(c6268);
                    }
                }
                C5919.m11246(AbstractC6136.m11556(iM11753, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                C6268[] c6268Arr3 = AbstractC6284.f17356;
                ByteString byteStringM11754 = c6266.m11754();
                AbstractC6284.m11799(byteStringM11754);
                c6266.m11755(new C6268(byteStringM11754, c6266.m11754()));
            } else if ((b & 64) == 64) {
                c6266.m11755(new C6268(c6266.m11756(c6266.m11753(i5, 63) - 1), c6266.m11754()));
            } else if ((b & 32) == 32) {
                int iM117532 = c6266.m11753(i5, 31);
                c6266.f17260 = iM117532;
                if (iM117532 < 0 || iM117532 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c6266.f17260);
                }
                int i7 = c6266.f17261;
                if (iM117532 < i7) {
                    if (iM117532 == 0) {
                        C6268[] c6268Arr4 = c6266.f17257;
                        AbstractC4346.m8861(0, c6268Arr4.length, null, c6268Arr4);
                        c6266.f17256 = c6266.f17257.length - 1;
                        c6266.f17255 = 0;
                        c6266.f17261 = 0;
                    } else {
                        c6266.m11757(i7 - iM117532);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C6268[] c6268Arr5 = AbstractC6284.f17356;
                ByteString byteStringM117542 = c6266.m11754();
                AbstractC6284.m11799(byteStringM117542);
                arrayList.add(new C6268(byteStringM117542, c6266.m11754()));
            } else {
                arrayList.add(new C6268(c6266.m11756(c6266.m11753(i5, 15) - 1), c6266.m11754()));
            }
        }
        List listM8804 = AbstractC4343.m8804(arrayList);
        arrayList.clear();
        return listM8804;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        r9.m11777(p015.C6224.f17131, true);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11765(kotlin.reflect.jvm.internal.C5027 r17, int r18, int r19, final int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p022.C6272.m11765(kotlin.reflect.jvm.internal.飘花落叶言子楪哲苏世兰, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0237, code lost:
    
        top.suzhelan.qstory.hook.item.C5919.m11246(p007.AbstractC6136.m11556(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0240, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11766(boolean r14, kotlin.reflect.jvm.internal.C5027 r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p022.C6272.m11766(boolean, kotlin.reflect.jvm.internal.飘花落叶言子楪哲苏世兰):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11767(C5027 c5027, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C5919.m11246("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f17280.readByte();
            byte[] bArr = AbstractC6233.f17181;
            i4 = b & DefaultClassResolver.NAME;
        } else {
            i4 = 0;
        }
        int i5 = this.f17280.readInt() & Integer.MAX_VALUE;
        List listM11764 = m11764(AbstractC6279.m11787(i - 4, i2, i4), i4, i2, i3);
        listM11764.getClass();
        C6281 c6281 = (C6281) c5027.f14500;
        synchronized (c6281) {
            if (c6281.f17320.contains(Integer.valueOf(i5))) {
                c6281.m11793(i5, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            c6281.f17320.add(Integer.valueOf(i5));
            C6165.m11590(c6281.f17337, c6281.f17341 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i5 + "] onRequest", new C6285(c6281, i5, listM11764));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11768(C5027 c5027, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C5919.m11246("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.f17280.readByte();
            byte[] bArr = AbstractC6233.f17181;
            i4 = b & DefaultClassResolver.NAME;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            InterfaceC6119 interfaceC6119 = this.f17280;
            interfaceC6119.readInt();
            interfaceC6119.readByte();
            byte[] bArr2 = AbstractC6233.f17181;
            i -= 5;
        }
        List listM11764 = m11764(AbstractC6279.m11787(i, i2, i4), i4, i2, i3);
        listM11764.getClass();
        C6281 c6281 = (C6281) c5027.f14500;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            C6165.m11590(c6281.f17337, c6281.f17341 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i3 + "] onHeaders", new C6285(c6281, i3, listM11764, z2));
            return;
        }
        synchronized (c6281) {
            C6273 c6273M11789 = c6281.m11789(i3);
            if (c6273M11789 != null) {
                c6273M11789.m11777(AbstractC6238.m11707(listM11764), z2);
                return;
            }
            if (c6281.f17338) {
                return;
            }
            if (i3 <= c6281.f17335) {
                return;
            }
            if (i3 % 2 == c6281.f17334 % 2) {
                return;
            }
            C6273 c6273 = new C6273(i3, c6281, false, z2, AbstractC6238.m11707(listM11764));
            c6281.f17335 = i3;
            c6281.f17340.put(Integer.valueOf(i3), c6273);
            C6165.m11590(c6281.f17339.m11587(), c6281.f17341 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i3 + "] onStream", new C0004(c6281, 13, c6273));
        }
    }
}
