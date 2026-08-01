package p019;

import androidx.activity.compose.C0004;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.reflect.jvm.internal.C5028;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p004.C6099;
import p004.InterfaceC6110;
import p009.AbstractC6183;
import p013.AbstractC6225;
import p013.AbstractC6230;
import p015.C6235;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6268 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Logger f17259;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6276 f17260;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6262 f17261;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6110 f17262;

    static {
        Logger logger = Logger.getLogger(AbstractC6279.class.getName());
        logger.getClass();
        f17259 = logger;
    }

    public C6268(C6099 c6099) {
        c6099.getClass();
        this.f17262 = c6099;
        C6276 c6276 = new C6276(c6099);
        this.f17260 = c6276;
        this.f17261 = new C6262(c6276);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17262.close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m11781(int i, int i2, int i3, int i4) throws IOException {
        C6276 c6276 = this.f17260;
        c6276.f17293 = i;
        c6276.f17296 = i;
        c6276.f17295 = i2;
        c6276.f17297 = i3;
        c6276.f17294 = i4;
        C6262 c6262 = this.f17261;
        C6099 c6099 = c6262.f17240;
        ArrayList arrayList = c6262.f17241;
        while (!c6099.m11503()) {
            byte b = c6099.readByte();
            byte[] bArr = AbstractC6225.f17158;
            int i5 = b & DefaultClassResolver.NAME;
            if (i5 == 128) {
                C5925.m11307("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iM11770 = c6262.m11770(i5, 127);
                int i6 = iM11770 - 1;
                if (i6 >= 0) {
                    C6264[] c6264Arr = AbstractC6280.f17338;
                    if (i6 <= c6264Arr.length - 1) {
                        arrayList.add(c6264Arr[i6]);
                    }
                }
                int length = c6262.f17238 + 1 + (i6 - AbstractC6280.f17338.length);
                if (length >= 0) {
                    C6264[] c6264Arr2 = c6262.f17239;
                    if (length < c6264Arr2.length) {
                        C6264 c6264 = c6264Arr2[length];
                        c6264.getClass();
                        arrayList.add(c6264);
                    }
                }
                C5925.m11307(AbstractC6183.m11588(iM11770, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                C6264[] c6264Arr3 = AbstractC6280.f17338;
                ByteString byteStringM11771 = c6262.m11771();
                AbstractC6280.m11816(byteStringM11771);
                c6262.m11772(new C6264(byteStringM11771, c6262.m11771()));
            } else if ((b & 64) == 64) {
                c6262.m11772(new C6264(c6262.m11773(c6262.m11770(i5, 63) - 1), c6262.m11771()));
            } else if ((b & 32) == 32) {
                int iM117702 = c6262.m11770(i5, 31);
                c6262.f17242 = iM117702;
                if (iM117702 < 0 || iM117702 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c6262.f17242);
                }
                int i7 = c6262.f17243;
                if (iM117702 < i7) {
                    if (iM117702 == 0) {
                        C6264[] c6264Arr4 = c6262.f17239;
                        AbstractC4347.m8834(0, c6264Arr4.length, null, c6264Arr4);
                        c6262.f17238 = c6262.f17239.length - 1;
                        c6262.f17237 = 0;
                        c6262.f17243 = 0;
                    } else {
                        c6262.m11774(i7 - iM117702);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C6264[] c6264Arr5 = AbstractC6280.f17338;
                ByteString byteStringM117712 = c6262.m11771();
                AbstractC6280.m11816(byteStringM117712);
                arrayList.add(new C6264(byteStringM117712, c6262.m11771()));
            } else {
                arrayList.add(new C6264(c6262.m11773(c6262.m11770(i5, 15) - 1), c6262.m11771()));
            }
        }
        List listM8797 = AbstractC4344.m8797(arrayList);
        arrayList.clear();
        return listM8797;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        r9.m11794(p007.C6151.f16892, true);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11782(kotlin.reflect.jvm.internal.C5028 r17, int r18, int r19, final int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p019.C6268.m11782(kotlin.reflect.jvm.internal.飘花落叶言子楪哲苏世兰, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0237, code lost:
    
        top.suzhelan.qstory.hook.item.C5925.m11307(p009.AbstractC6183.m11588(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0240, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11783(boolean r14, kotlin.reflect.jvm.internal.C5028 r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p019.C6268.m11783(boolean, kotlin.reflect.jvm.internal.飘花落叶言子楪哲苏世兰):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11784(C5028 c5028, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C5925.m11307("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f17262.readByte();
            byte[] bArr = AbstractC6225.f17158;
            i4 = b & DefaultClassResolver.NAME;
        } else {
            i4 = 0;
        }
        int i5 = this.f17262.readInt() & Integer.MAX_VALUE;
        List listM11781 = m11781(AbstractC6275.m11804(i - 4, i2, i4), i4, i2, i3);
        listM11781.getClass();
        C6277 c6277 = (C6277) c5028.f14502;
        synchronized (c6277) {
            if (c6277.f17302.contains(Integer.valueOf(i5))) {
                c6277.m11810(i5, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            c6277.f17302.add(Integer.valueOf(i5));
            C6235.m11712(c6277.f17319, c6277.f17323 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i5 + "] onRequest", new C6281(c6277, i5, listM11781));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11785(C5028 c5028, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C5925.m11307("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.f17262.readByte();
            byte[] bArr = AbstractC6225.f17158;
            i4 = b & DefaultClassResolver.NAME;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            InterfaceC6110 interfaceC6110 = this.f17262;
            interfaceC6110.readInt();
            interfaceC6110.readByte();
            byte[] bArr2 = AbstractC6225.f17158;
            i -= 5;
        }
        List listM11781 = m11781(AbstractC6275.m11804(i, i2, i4), i4, i2, i3);
        listM11781.getClass();
        C6277 c6277 = (C6277) c5028.f14502;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            C6235.m11712(c6277.f17319, c6277.f17323 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i3 + "] onHeaders", new C6281(c6277, i3, listM11781, z2));
            return;
        }
        synchronized (c6277) {
            C6269 c6269M11806 = c6277.m11806(i3);
            if (c6269M11806 != null) {
                c6269M11806.m11794(AbstractC6230.m11699(listM11781), z2);
                return;
            }
            if (c6277.f17320) {
                return;
            }
            if (i3 <= c6277.f17317) {
                return;
            }
            if (i3 % 2 == c6277.f17316 % 2) {
                return;
            }
            C6269 c6269 = new C6269(i3, c6277, false, z2, AbstractC6230.m11699(listM11781));
            c6277.f17317 = i3;
            c6277.f17322.put(Integer.valueOf(i3), c6269);
            C6235.m11712(c6277.f17321.m11709(), c6277.f17323 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i3 + "] onStream", new C0004(c6277, 13, c6269));
        }
    }
}
