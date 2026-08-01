package p001;

import androidx.appcompat.widget.C0131;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.InterfaceC5127;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import okio.ByteString;
import org.slf4j.Marker;
import p004.C6114;
import p034.AbstractC6347;
import p251.AbstractC8175;
import p305.C8623;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6084 f16635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List f16636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ByteString f16637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0131 f16638;

    static {
        ByteString.Companion.getClass();
        f16637 = new ByteString(Arrays.copyOf(new byte[]{42}, 1));
        f16636 = AbstractC6347.m11928(Marker.ANY_MARKER);
        f16635 = new C6084(new C0131(3));
    }

    public C6084(C0131 c0131) {
        this.f16638 = c0131;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m11438(String str) {
        List listM10150 = AbstractC5144.m10150(str, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH});
        return AbstractC4395.m8907(AbstractC4344.m8808(listM10150), "") ? AbstractC4344.m8801(1, listM10150) : listM10150;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m11439(String str) throws IOException {
        String strM14311;
        String strM143112;
        String strM143113;
        List listM10150;
        int size;
        int size2;
        str.getClass();
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listM11438 = m11438(unicode);
        C0131 c0131 = this.f16638;
        AtomicBoolean atomicBoolean = (AtomicBoolean) c0131.f578;
        int i = 0;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) c0131.f577).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        try {
                            c0131.m555();
                            break;
                        } catch (InterruptedIOException unused2) {
                            Thread.interrupted();
                            z = true;
                        }
                    } catch (IOException e) {
                        c0131.f574 = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((ByteString) c0131.f576) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(c0131.f573);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) c0131.f574);
            throw illegalStateException;
        }
        int size3 = listM11438.size();
        ByteString[] byteStringArr = new ByteString[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            C6114 c6114 = ByteString.Companion;
            String str2 = (String) listM11438.get(i2);
            c6114.getClass();
            byteStringArr[i2] = C6114.m11510(str2);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strM14311 = null;
                break;
            }
            ByteString byteString = (ByteString) c0131.f576;
            if (byteString == null) {
                AbstractC4395.m8908("bytes");
                throw null;
            }
            strM14311 = C8623.m14311(byteString, byteStringArr, i3);
            if (strM14311 != null) {
                break;
            }
            i3++;
        }
        if (size3 > 1) {
            ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                byteStringArr2[i4] = f16637;
                ByteString byteString2 = (ByteString) c0131.f576;
                if (byteString2 == null) {
                    AbstractC4395.m8908("bytes");
                    throw null;
                }
                strM143112 = C8623.m14311(byteString2, byteStringArr2, i4);
                if (strM143112 != null) {
                    break;
                }
            }
            strM143112 = null;
        } else {
            strM143112 = null;
        }
        if (strM143112 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                ByteString byteString3 = (ByteString) c0131.f575;
                if (byteString3 == null) {
                    AbstractC4395.m8908("exceptionBytes");
                    throw null;
                }
                strM143113 = C8623.m14311(byteString3, byteStringArr, i6);
                if (strM143113 != null) {
                    break;
                }
            }
            strM143113 = null;
        } else {
            strM143113 = null;
        }
        if (strM143113 != null) {
            listM10150 = AbstractC5144.m10150("!".concat(strM143113), new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH});
        } else if (strM14311 == null && strM143112 == null) {
            listM10150 = f16636;
        } else {
            List listM101502 = strM14311 != null ? AbstractC5144.m10150(strM14311, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}) : EmptyList.INSTANCE;
            listM10150 = strM143112 != null ? AbstractC5144.m10150(strM143112, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}) : EmptyList.INSTANCE;
            if (listM101502.size() > listM10150.size()) {
                listM10150 = listM101502;
            }
        }
        if (listM11438.size() == listM10150.size() && ((String) listM10150.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM10150.get(0)).charAt(0) == '!') {
            size = listM11438.size();
            size2 = listM10150.size();
        } else {
            size = listM11438.size();
            size2 = listM10150.size() + 1;
        }
        InterfaceC5127 interfaceC5127M10117 = AbstractC5122.m10117(AbstractC4344.m8803(m11438(str)), size - size2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        for (Object obj : interfaceC5127M10117) {
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ".");
            }
            AbstractC8175.m13650(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }
}
