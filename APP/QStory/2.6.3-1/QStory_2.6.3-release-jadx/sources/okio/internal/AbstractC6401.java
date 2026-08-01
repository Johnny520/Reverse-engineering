package okio.internal;

import com.alibaba.fastjson2.C3775;
import java.util.Iterator;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.C5183;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.sequences.AbstractC5957;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.asm.Advice;
import okio.SegmentedByteString;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final char[] f15697 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'e', 'f'};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m11495(SegmentedByteString segmentedByteString, int i) {
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
    */
    public static final Object m11496(AbstractC5957 abstractC5957, C5183 c5183, boolean z, boolean z2, BaseContinuationImpl baseContinuationImpl) {
        FileSystem$collectRecursively$1 fileSystem$collectRecursively$1;
        if (baseContinuationImpl instanceof FileSystem$collectRecursively$1) {
            fileSystem$collectRecursively$1 = (FileSystem$collectRecursively$1) baseContinuationImpl;
            int i = fileSystem$collectRecursively$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fileSystem$collectRecursively$1.label = i - Integer.MIN_VALUE;
            } else {
                fileSystem$collectRecursively$1 = new FileSystem$collectRecursively$1(baseContinuationImpl);
            }
        }
        Object obj = fileSystem$collectRecursively$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fileSystem$collectRecursively$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (z2) {
                throw null;
            }
            fileSystem$collectRecursively$1.L$0 = abstractC5957;
            fileSystem$collectRecursively$1.L$1 = null;
            fileSystem$collectRecursively$1.L$2 = c5183;
            fileSystem$collectRecursively$1.L$3 = null;
            fileSystem$collectRecursively$1.Z$0 = z;
            fileSystem$collectRecursively$1.Z$1 = z2;
            fileSystem$collectRecursively$1.label = 1;
            if (abstractC5957.mo10680(null, fileSystem$collectRecursively$1) != coroutineSingletons) {
                throw null;
            }
        } else {
            if (i2 == 1) {
                if (fileSystem$collectRecursively$1.L$3 != null) {
                    C3775.m6954();
                    return null;
                }
                if (fileSystem$collectRecursively$1.L$1 != null) {
                    C3775.m6954();
                    return null;
                }
                AbstractC6017.m10769(obj);
                throw null;
            }
            C6008 c6008 = C6008.f15084;
            if (i2 != 2) {
                if (i2 != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (fileSystem$collectRecursively$1.L$3 != null) {
                    C3775.m6954();
                    return null;
                }
                if (fileSystem$collectRecursively$1.L$1 != null) {
                    C3775.m6954();
                    return null;
                }
                AbstractC6017.m10769(obj);
                return c6008;
            }
            int i3 = fileSystem$collectRecursively$1.I$0;
            boolean z3 = fileSystem$collectRecursively$1.Z$1;
            boolean z4 = fileSystem$collectRecursively$1.Z$0;
            if (fileSystem$collectRecursively$1.L$7 != null) {
                C3775.m6954();
                return null;
            }
            Iterator it = (Iterator) fileSystem$collectRecursively$1.L$6;
            if (fileSystem$collectRecursively$1.L$5 != null) {
                C3775.m6954();
                return null;
            }
            if (fileSystem$collectRecursively$1.L$3 != null) {
                C3775.m6954();
                return null;
            }
            C5183 c51832 = (C5183) fileSystem$collectRecursively$1.L$2;
            if (fileSystem$collectRecursively$1.L$1 != null) {
                C3775.m6954();
                return null;
            }
            AbstractC5957 abstractC59572 = (AbstractC5957) fileSystem$collectRecursively$1.L$0;
            try {
                AbstractC6017.m10769(obj);
                while (true) {
                    if (!it.hasNext()) {
                        c51832.removeLast();
                        if (z3) {
                            fileSystem$collectRecursively$1.L$0 = null;
                            fileSystem$collectRecursively$1.L$1 = null;
                            fileSystem$collectRecursively$1.L$2 = null;
                            fileSystem$collectRecursively$1.L$3 = null;
                            fileSystem$collectRecursively$1.L$4 = null;
                            fileSystem$collectRecursively$1.L$5 = null;
                            fileSystem$collectRecursively$1.L$6 = null;
                            fileSystem$collectRecursively$1.L$7 = null;
                            fileSystem$collectRecursively$1.Z$0 = z4;
                            fileSystem$collectRecursively$1.Z$1 = z3;
                            fileSystem$collectRecursively$1.label = 3;
                            if (abstractC59572.mo10680(null, fileSystem$collectRecursively$1) == coroutineSingletons) {
                                break;
                            }
                        }
                        return c6008;
                    }
                    if (it.next() != null) {
                        break;
                    }
                    fileSystem$collectRecursively$1.L$0 = abstractC59572;
                    fileSystem$collectRecursively$1.L$1 = null;
                    fileSystem$collectRecursively$1.L$2 = c51832;
                    fileSystem$collectRecursively$1.L$3 = null;
                    fileSystem$collectRecursively$1.L$4 = null;
                    fileSystem$collectRecursively$1.L$5 = null;
                    fileSystem$collectRecursively$1.L$6 = it;
                    fileSystem$collectRecursively$1.L$7 = null;
                    fileSystem$collectRecursively$1.Z$0 = z4;
                    fileSystem$collectRecursively$1.Z$1 = z3;
                    fileSystem$collectRecursively$1.I$0 = i3;
                    fileSystem$collectRecursively$1.label = 2;
                    if (m11496(abstractC59572, c51832, z4, z3, fileSystem$collectRecursively$1) == coroutineSingletons) {
                        break;
                    }
                }
            } catch (Throwable th) {
                c51832.removeLast();
                throw th;
            }
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m11497(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        C6385.m11427(c, "Unexpected hex digit: ");
        return 0;
    }
}
