package org.apache.commons.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.util.Objects;
import p358.InterfaceC8907;
import p358.InterfaceC8908;
import p376.C8986;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum RandomAccessFileMode {
    READ_ONLY(R, 1),
    READ_WRITE(RW, 2),
    READ_WRITE_SYNC_ALL(RWS, 4),
    READ_WRITE_SYNC_CONTENT(RWD, 3);

    private static final String R = "r";
    private static final String RW = "rw";
    private static final String RWD = "rwd";
    private static final String RWS = "rws";
    private final int level;
    private final String mode;

    RandomAccessFileMode(String str, int i) {
        this.mode = str;
        this.level = i;
    }

    private int getLevel() {
        return this.level;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[PHI: r3
  0x0028: PHI (r3v5 org.apache.commons.io.RandomAccessFileMode) = 
  (r3v4 org.apache.commons.io.RandomAccessFileMode)
  (r3v6 org.apache.commons.io.RandomAccessFileMode)
  (r3v7 org.apache.commons.io.RandomAccessFileMode)
 binds: [B:20:0x0039, B:17:0x0030, B:14:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.apache.commons.io.RandomAccessFileMode valueOf(java.nio.file.OpenOption... r5) {
        /*
            org.apache.commons.io.RandomAccessFileMode r0 = org.apache.commons.io.RandomAccessFileMode.READ_ONLY
            int r1 = r5.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L3f
            r3 = r5[r2]
            boolean r4 = r3 instanceof java.nio.file.StandardOpenOption
            if (r4 == 0) goto L3c
            int[] r4 = p376.AbstractC8987.f25217
            java.nio.file.StandardOpenOption r3 = (java.nio.file.StandardOpenOption) r3
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 1
            if (r3 == r4) goto L33
            r4 = 2
            if (r3 == r4) goto L2a
            r4 = 3
            if (r3 == r4) goto L20
            goto L3c
        L20:
            org.apache.commons.io.RandomAccessFileMode r3 = org.apache.commons.io.RandomAccessFileMode.READ_WRITE_SYNC_ALL
            boolean r4 = r0.implies(r3)
            if (r4 != 0) goto L3c
        L28:
            r0 = r3
            goto L3c
        L2a:
            org.apache.commons.io.RandomAccessFileMode r3 = org.apache.commons.io.RandomAccessFileMode.READ_WRITE_SYNC_CONTENT
            boolean r4 = r0.implies(r3)
            if (r4 != 0) goto L3c
            goto L28
        L33:
            org.apache.commons.io.RandomAccessFileMode r3 = org.apache.commons.io.RandomAccessFileMode.READ_WRITE
            boolean r4 = r0.implies(r3)
            if (r4 != 0) goto L3c
            goto L28
        L3c:
            int r2 = r2 + 1
            goto L4
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.RandomAccessFileMode.valueOf(java.nio.file.OpenOption[]):org.apache.commons.io.RandomAccessFileMode");
    }

    public static RandomAccessFileMode valueOfMode(String str) {
        str.getClass();
        switch (str) {
            case "r":
                return READ_ONLY;
            case "rw":
                return READ_WRITE;
            case "rwd":
                return READ_WRITE_SYNC_CONTENT;
            case "rws":
                return READ_WRITE_SYNC_ALL;
            default:
                C5925.m11310(str);
                return null;
        }
    }

    public void accept(Path path, InterfaceC8908 interfaceC8908) throws IOException {
        RandomAccessFile randomAccessFileCreate = create(path);
        try {
            interfaceC8908.accept(randomAccessFileCreate);
            if (randomAccessFileCreate != null) {
                randomAccessFileCreate.close();
            }
        } catch (Throwable th) {
            if (randomAccessFileCreate != null) {
                try {
                    randomAccessFileCreate.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public <T> T apply(Path path, InterfaceC8907 interfaceC8907) throws IOException {
        RandomAccessFile randomAccessFileCreate = create(path);
        try {
            T t = (T) interfaceC8907.mo14474(randomAccessFileCreate);
            if (randomAccessFileCreate != null) {
                randomAccessFileCreate.close();
            }
            return t;
        } catch (Throwable th) {
            if (randomAccessFileCreate != null) {
                try {
                    randomAccessFileCreate.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public RandomAccessFile create(Path path) {
        File file = path.toFile();
        Objects.requireNonNull(file, "file");
        return create(file);
    }

    public String getMode() {
        return this.mode;
    }

    public boolean implies(RandomAccessFileMode randomAccessFileMode) {
        return getLevel() >= randomAccessFileMode.getLevel();
    }

    public C8986 io(String str) {
        return new C8986(str, this.mode);
    }

    public RandomAccessFile create(File file) {
        return new C8986(file, this.mode);
    }

    public RandomAccessFile create(String str) {
        return new C8986(str, this.mode);
    }
}
