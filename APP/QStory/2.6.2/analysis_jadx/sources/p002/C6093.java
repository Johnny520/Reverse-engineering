package p002;

import androidx.appcompat.widget.C0131;
import com.bumptech.glide.AbstractC3055;
import io.ktor.client.plugins.api.C3885;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.InterfaceC5126;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import okio.ByteString;
import org.slf4j.Marker;
import p005.C6123;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世兰哲楪子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6093 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6093 f16645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List f16646;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ByteString f16647;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0131 f16648;

    static {
        ByteString.Companion.getClass();
        f16647 = new ByteString(Arrays.copyOf(new byte[]{42}, 1));
        f16646 = AbstractC8189.m13660(Marker.ANY_MARKER);
        f16645 = new C6093(new C0131(3));
    }

    public C6093(C0131 c0131) {
        this.f16648 = c0131;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m11446(String str) {
        List listM10147 = AbstractC5143.m10147(str, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH});
        return AbstractC4394.m8917(AbstractC4343.m8811(listM10147), "") ? AbstractC4343.m8791(1, listM10147) : listM10147;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m11447(String str) {
        String strM8284;
        String strM82842;
        String strM82843;
        List listM10147;
        int size;
        int size2;
        str.getClass();
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listM11446 = m11446(unicode);
        C0131 c0131 = this.f16648;
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
                            c0131.m554();
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
        int size3 = listM11446.size();
        ByteString[] byteStringArr = new ByteString[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            C6123 c6123 = ByteString.Companion;
            String str2 = (String) listM11446.get(i2);
            c6123.getClass();
            byteStringArr[i2] = C6123.m11517(str2);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strM8284 = null;
                break;
            }
            ByteString byteString = (ByteString) c0131.f576;
            if (byteString == null) {
                AbstractC4394.m8918("bytes");
                throw null;
            }
            strM8284 = C3885.m8284(byteString, byteStringArr, i3);
            if (strM8284 != null) {
                break;
            }
            i3++;
        }
        if (size3 > 1) {
            ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                byteStringArr2[i4] = f16647;
                ByteString byteString2 = (ByteString) c0131.f576;
                if (byteString2 == null) {
                    AbstractC4394.m8918("bytes");
                    throw null;
                }
                strM82842 = C3885.m8284(byteString2, byteStringArr2, i4);
                if (strM82842 != null) {
                    break;
                }
            }
            strM82842 = null;
        } else {
            strM82842 = null;
        }
        if (strM82842 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                ByteString byteString3 = (ByteString) c0131.f575;
                if (byteString3 == null) {
                    AbstractC4394.m8918("exceptionBytes");
                    throw null;
                }
                strM82843 = C3885.m8284(byteString3, byteStringArr, i6);
                if (strM82843 != null) {
                    break;
                }
            }
            strM82843 = null;
        } else {
            strM82843 = null;
        }
        if (strM82843 != null) {
            listM10147 = AbstractC5143.m10147("!".concat(strM82843), new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH});
        } else if (strM8284 == null && strM82842 == null) {
            listM10147 = f16646;
        } else {
            List listM101472 = strM8284 != null ? AbstractC5143.m10147(strM8284, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}) : EmptyList.INSTANCE;
            listM10147 = strM82842 != null ? AbstractC5143.m10147(strM82842, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}) : EmptyList.INSTANCE;
            if (listM101472.size() > listM10147.size()) {
                listM10147 = listM101472;
            }
        }
        if (listM11446.size() == listM10147.size() && ((String) listM10147.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM10147.get(0)).charAt(0) == '!') {
            size = listM11446.size();
            size2 = listM10147.size();
        } else {
            size = listM11446.size();
            size2 = listM10147.size() + 1;
        }
        InterfaceC5126 interfaceC5126M10104 = AbstractC5121.m10104(AbstractC4343.m8790(m11446(str)), size - size2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        for (Object obj : interfaceC5126M10104) {
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ".");
            }
            AbstractC3055.m6631(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }
}
