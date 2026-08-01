package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0276;
import androidx.core.view.C2242;
import io.ktor.util.C4211;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;
import org.slf4j.Marker;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4710 implements Iterable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4716 f13774 = new C4716(new byte[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC4710 m9398(Iterator it, int i) {
        if (i == 1) {
            return (AbstractC4710) it.next();
        }
        int i2 = i >>> 1;
        return m9398(it, i2).m9401(m9398(it, i - i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C4711 m9399() {
        return new C4711();
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo9346(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9400(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            C4211.m8616("Source offset < 0: ", 30, i);
            return;
        }
        if (i2 < 0) {
            C4211.m8616("Target offset < 0: ", 30, i2);
            return;
        }
        if (i3 < 0) {
            C4211.m8616("Length < 0: ", 23, i3);
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            C4211.m8616("Source end offset < 0: ", 34, i4);
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            C4211.m8616("Target end offset < 0: ", 34, i5);
        } else if (i3 > 0) {
            mo9346(bArr, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4710 m9401(AbstractC4710 abstractC4710) {
        int size = size();
        int size2 = abstractC4710.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = C4697.f13747;
        C4697 c4697 = this instanceof C4697 ? (C4697) this : null;
        if (abstractC4710.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC4710;
        }
        int size3 = abstractC4710.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC4710.size();
            byte[] bArr = new byte[size4 + size5];
            m9400(bArr, 0, 0, size4);
            abstractC4710.m9400(bArr, 0, size4, size5);
            return new C4716(bArr);
        }
        if (c4697 != null) {
            AbstractC4710 abstractC47102 = c4697.f13749;
            if (abstractC4710.size() + abstractC47102.size() < 128) {
                int size6 = abstractC47102.size();
                int size7 = abstractC4710.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC47102.m9400(bArr2, 0, 0, size6);
                abstractC4710.m9400(bArr2, 0, size6, size7);
                return new C4697(c4697.f13753, new C4716(bArr2));
            }
        }
        if (c4697 != null) {
            AbstractC4710 abstractC47103 = c4697.f13749;
            AbstractC4710 abstractC47104 = c4697.f13753;
            if (abstractC47104.mo9352() > abstractC47103.mo9352() && c4697.f13750 > abstractC4710.mo9352()) {
                return new C4697(abstractC47104, new C4697(abstractC47103, abstractC4710));
            }
        }
        if (size3 >= C4697.f13747[Math.max(mo9352(), abstractC4710.mo9352()) + 1]) {
            return new C4697(this, abstractC4710);
        }
        C2242 c2242 = new C2242((byte) 0, 21);
        c2242.m4158(this);
        c2242.m4158(abstractC4710);
        Stack stack = (Stack) c2242.f6537;
        AbstractC4710 c46972 = (AbstractC4710) stack.pop();
        while (!stack.isEmpty()) {
            c46972 = new C4697((AbstractC4710) stack.pop(), c46972);
        }
        return c46972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract int mo9347(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String m9402() {
        try {
            return mo9350();
        } catch (UnsupportedEncodingException e) {
            C0276.m848("UTF-8 not supported?", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public abstract void mo9348(OutputStream outputStream, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract int mo9349();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract String mo9350();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract boolean mo9351();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract int mo9352();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract int mo9353(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract boolean mo9354();
}
