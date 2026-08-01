package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C1123;
import androidx.core.view.C3075;
import io.ktor.util.C5043;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;
import org.slf4j.Marker;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5542 implements Iterable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5548 f14119 = new C5548(new byte[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC5542 m9957(Iterator it, int i) {
        if (i == 1) {
            return (AbstractC5542) it.next();
        }
        int i2 = i >>> 1;
        return m9957(it, i2).m9960(m9957(it, i - i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C5543 m9958() {
        return new C5543();
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo9905(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9959(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            C5043.m9175("Source offset < 0: ", 30, i);
            return;
        }
        if (i2 < 0) {
            C5043.m9175("Target offset < 0: ", 30, i2);
            return;
        }
        if (i3 < 0) {
            C5043.m9175("Length < 0: ", 23, i3);
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            C5043.m9175("Source end offset < 0: ", 34, i4);
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            C5043.m9175("Target end offset < 0: ", 34, i5);
        } else if (i3 > 0) {
            mo9905(bArr, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC5542 m9960(AbstractC5542 abstractC5542) {
        int size = size();
        int size2 = abstractC5542.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = C5529.f14092;
        C5529 c5529 = this instanceof C5529 ? (C5529) this : null;
        if (abstractC5542.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC5542;
        }
        int size3 = abstractC5542.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC5542.size();
            byte[] bArr = new byte[size4 + size5];
            m9959(bArr, 0, 0, size4);
            abstractC5542.m9959(bArr, 0, size4, size5);
            return new C5548(bArr);
        }
        if (c5529 != null) {
            AbstractC5542 abstractC55422 = c5529.f14094;
            if (abstractC5542.size() + abstractC55422.size() < 128) {
                int size6 = abstractC55422.size();
                int size7 = abstractC5542.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC55422.m9959(bArr2, 0, 0, size6);
                abstractC5542.m9959(bArr2, 0, size6, size7);
                return new C5529(c5529.f14098, new C5548(bArr2));
            }
        }
        if (c5529 != null) {
            AbstractC5542 abstractC55423 = c5529.f14094;
            AbstractC5542 abstractC55424 = c5529.f14098;
            if (abstractC55424.mo9911() > abstractC55423.mo9911() && c5529.f14095 > abstractC5542.mo9911()) {
                return new C5529(abstractC55424, new C5529(abstractC55423, abstractC5542));
            }
        }
        if (size3 >= C5529.f14092[Math.max(mo9911(), abstractC5542.mo9911()) + 1]) {
            return new C5529(this, abstractC5542);
        }
        C3075 c3075 = new C3075((byte) 0, 21);
        c3075.m4718(this);
        c3075.m4718(abstractC5542);
        Stack stack = (Stack) c3075.f6882;
        AbstractC5542 c55292 = (AbstractC5542) stack.pop();
        while (!stack.isEmpty()) {
            c55292 = new C5529((AbstractC5542) stack.pop(), c55292);
        }
        return c55292;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract int mo9906(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String m9961() {
        try {
            return mo9909();
        } catch (UnsupportedEncodingException e) {
            C1123.m1408("UTF-8 not supported?", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public abstract void mo9907(OutputStream outputStream, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract int mo9908();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract String mo9909();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract boolean mo9910();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract int mo9911();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract int mo9912(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract boolean mo9913();
}
