package p017;

import androidx.appcompat.widget.C0978;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.InterfaceC5959;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import okio.ByteString;
import org.slf4j.Marker;
import p020.C6943;
import p050.AbstractC7176;
import p267.AbstractC9004;
import p321.C9452;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6913 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6913 f16980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List f16981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ByteString f16982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0978 f16983;

    static {
        ByteString.Companion.getClass();
        f16982 = new ByteString(Arrays.copyOf(new byte[]{42}, 1));
        f16981 = AbstractC7176.m12487(Marker.ANY_MARKER);
        f16980 = new C6913(new C0978(3));
    }

    public C6913(C0978 c0978) {
        this.f16983 = c0978;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m11997(String str) {
        List listM10709 = AbstractC5976.m10709(str, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH});
        return AbstractC5227.m9466(AbstractC5176.m9367(listM10709), "") ? AbstractC5176.m9360(1, listM10709) : listM10709;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m11998(String str) throws IOException {
        String strM14870;
        String strM148702;
        String strM148703;
        List listM10709;
        int size;
        int size2;
        str.getClass();
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listM11997 = m11997(unicode);
        C0978 c0978 = this.f16983;
        AtomicBoolean atomicBoolean = (AtomicBoolean) c0978.f923;
        int i = 0;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) c0978.f922).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        try {
                            c0978.m1115();
                            break;
                        } catch (InterruptedIOException unused2) {
                            Thread.interrupted();
                            z = true;
                        }
                    } catch (IOException e) {
                        c0978.f919 = e;
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
        if (((ByteString) c0978.f921) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(c0978.f918);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) c0978.f919);
            throw illegalStateException;
        }
        int size3 = listM11997.size();
        ByteString[] byteStringArr = new ByteString[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            C6943 c6943 = ByteString.Companion;
            String str2 = (String) listM11997.get(i2);
            c6943.getClass();
            byteStringArr[i2] = C6943.m12069(str2);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strM14870 = null;
                break;
            }
            ByteString byteString = (ByteString) c0978.f921;
            if (byteString == null) {
                AbstractC5227.m9467("bytes");
                throw null;
            }
            strM14870 = C9452.m14870(byteString, byteStringArr, i3);
            if (strM14870 != null) {
                break;
            }
            i3++;
        }
        if (size3 > 1) {
            ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                byteStringArr2[i4] = f16982;
                ByteString byteString2 = (ByteString) c0978.f921;
                if (byteString2 == null) {
                    AbstractC5227.m9467("bytes");
                    throw null;
                }
                strM148702 = C9452.m14870(byteString2, byteStringArr2, i4);
                if (strM148702 != null) {
                    break;
                }
            }
            strM148702 = null;
        } else {
            strM148702 = null;
        }
        if (strM148702 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                ByteString byteString3 = (ByteString) c0978.f920;
                if (byteString3 == null) {
                    AbstractC5227.m9467("exceptionBytes");
                    throw null;
                }
                strM148703 = C9452.m14870(byteString3, byteStringArr, i6);
                if (strM148703 != null) {
                    break;
                }
            }
            strM148703 = null;
        } else {
            strM148703 = null;
        }
        if (strM148703 != null) {
            listM10709 = AbstractC5976.m10709("!".concat(strM148703), new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH});
        } else if (strM14870 == null && strM148702 == null) {
            listM10709 = f16981;
        } else {
            List listM107092 = strM14870 != null ? AbstractC5976.m10709(strM14870, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}) : EmptyList.INSTANCE;
            listM10709 = strM148702 != null ? AbstractC5976.m10709(strM148702, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}) : EmptyList.INSTANCE;
            if (listM107092.size() > listM10709.size()) {
                listM10709 = listM107092;
            }
        }
        if (listM11997.size() == listM10709.size() && ((String) listM10709.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM10709.get(0)).charAt(0) == '!') {
            size = listM11997.size();
            size2 = listM10709.size();
        } else {
            size = listM11997.size();
            size2 = listM10709.size() + 1;
        }
        InterfaceC5959 interfaceC5959M10676 = AbstractC5954.m10676(AbstractC5176.m9362(m11997(str)), size - size2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        for (Object obj : interfaceC5959M10676) {
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ".");
            }
            AbstractC9004.m14209(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }
}
