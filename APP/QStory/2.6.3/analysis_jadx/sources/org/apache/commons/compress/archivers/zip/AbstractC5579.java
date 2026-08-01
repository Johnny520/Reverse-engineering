package org.apache.commons.compress.archivers.zip;

import java.io.Closeable;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5579 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f15355 = 0;

    static {
        StandardCharsets.UTF_8.name();
        EnumSet.of(StandardOpenOption.READ);
        ZipLong.getValue(AbstractC5592.f15382);
        final int i = 0;
        final int i2 = 1;
        Comparator.comparingLong(new ToLongFunction() { // from class: org.apache.commons.compress.archivers.zip.飘花落叶言子世哲楪苏兰
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                C5585 c5585 = (C5585) obj;
                switch (i) {
                    case 0:
                        c5585.getClass();
                        return 0L;
                    default:
                        return c5585.f15365;
                }
            }
        }).thenComparingLong(new ToLongFunction() { // from class: org.apache.commons.compress.archivers.zip.飘花落叶言子世哲楪苏兰
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                C5585 c5585 = (C5585) obj;
                switch (i2) {
                    case 0:
                        c5585.getClass();
                        return 0L;
                    default:
                        return c5585.f15365;
                }
            }
        });
    }
}
