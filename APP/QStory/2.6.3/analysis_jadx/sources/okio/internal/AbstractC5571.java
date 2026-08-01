package okio.internal;

import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.asm.Advice;
import okio.SegmentedByteString;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final char[] f15352 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'e', 'f'};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m10936(SegmentedByteString segmentedByteString, int i) {
        int i2;
        int[] directory$okio = segmentedByteString.getDirectory();
        int i3 = i + 1;
        int length = segmentedByteString.getSegments().length;
        directory$okio.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = directory$okio[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10937(kotlin.sequences.AbstractC5125 r8, kotlin.collections.C4351 r9, boolean r10, boolean r11, kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.AbstractC5571.m10937(kotlin.sequences.飘花落叶言子楪苏兰世哲, kotlin.collections.飘花落叶言子楪苏兰哲世, boolean, boolean, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m10938(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        C5554.m10868(c, "Unexpected hex digit: ");
        return 0;
    }
}
