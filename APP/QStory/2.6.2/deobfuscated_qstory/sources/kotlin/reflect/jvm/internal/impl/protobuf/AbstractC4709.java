package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0276;
import androidx.core.view.C2242;
import io.ktor.util.C4210;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;
import org.slf4j.Marker;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4709 implements Iterable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4715 f13770 = new C4715(new byte[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC4709 m9408(Iterator it, int i) {
        if (i == 1) {
            return (AbstractC4709) it.next();
        }
        int i2 = i >>> 1;
        return m9408(it, i2).m9411(m9408(it, i - i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C4710 m9409() {
        return new C4710();
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo9356(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9410(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            C4210.m8626("Source offset < 0: ", 30, i);
            return;
        }
        if (i2 < 0) {
            C4210.m8626("Target offset < 0: ", 30, i2);
            return;
        }
        if (i3 < 0) {
            C4210.m8626("Length < 0: ", 23, i3);
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            C4210.m8626("Source end offset < 0: ", 34, i4);
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            C4210.m8626("Target end offset < 0: ", 34, i5);
        } else if (i3 > 0) {
            mo9356(bArr, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4709 m9411(AbstractC4709 abstractC4709) {
        int size = size();
        int size2 = abstractC4709.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = C4696.f13743;
        C4696 c4696 = this instanceof C4696 ? (C4696) this : null;
        if (abstractC4709.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC4709;
        }
        int size3 = abstractC4709.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC4709.size();
            byte[] bArr = new byte[size4 + size5];
            m9410(bArr, 0, 0, size4);
            abstractC4709.m9410(bArr, 0, size4, size5);
            return new C4715(bArr);
        }
        if (c4696 != null) {
            AbstractC4709 abstractC47092 = c4696.f13745;
            if (abstractC4709.size() + abstractC47092.size() < 128) {
                int size6 = abstractC47092.size();
                int size7 = abstractC4709.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC47092.m9410(bArr2, 0, 0, size6);
                abstractC4709.m9410(bArr2, 0, size6, size7);
                return new C4696(c4696.f13749, new C4715(bArr2));
            }
        }
        if (c4696 != null) {
            AbstractC4709 abstractC47093 = c4696.f13745;
            AbstractC4709 abstractC47094 = c4696.f13749;
            if (abstractC47094.mo9362() > abstractC47093.mo9362() && c4696.f13746 > abstractC4709.mo9362()) {
                return new C4696(abstractC47094, new C4696(abstractC47093, abstractC4709));
            }
        }
        if (size3 >= C4696.f13743[Math.max(mo9362(), abstractC4709.mo9362()) + 1]) {
            return new C4696(this, abstractC4709);
        }
        C2242 c2242 = new C2242((byte) 0, 21);
        c2242.m4148(this);
        c2242.m4148(abstractC4709);
        Stack stack = (Stack) c2242.f6536;
        AbstractC4709 c46962 = (AbstractC4709) stack.pop();
        while (!stack.isEmpty()) {
            c46962 = new C4696((AbstractC4709) stack.pop(), c46962);
        }
        return c46962;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract int mo9357(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String m9412() {
        try {
            return mo9360();
        } catch (UnsupportedEncodingException e) {
            C0276.m847("UTF-8 not supported?", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public abstract void mo9358(OutputStream outputStream, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract int mo9359();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract String mo9360();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract boolean mo9361();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract int mo9362();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract int mo9363(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract boolean mo9364();
}
