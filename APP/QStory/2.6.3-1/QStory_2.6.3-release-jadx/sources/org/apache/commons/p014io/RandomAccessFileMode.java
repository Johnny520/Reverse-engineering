package org.apache.commons.p014io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import p374.InterfaceC9736;
import p374.InterfaceC9737;
import p392.AbstractC9816;
import p392.C9815;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum RandomAccessFileMode {
    READ_ONLY(f331R, 1),
    READ_WRITE(f332RW, 2),
    READ_WRITE_SYNC_ALL(RWS, 4),
    READ_WRITE_SYNC_CONTENT(RWD, 3);


    /* JADX INFO: renamed from: R */
    private static final String f331R = "r";

    /* JADX INFO: renamed from: RW */
    private static final String f332RW = "rw";
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
    */
    public static RandomAccessFileMode valueOf(OpenOption... openOptionArr) {
        RandomAccessFileMode randomAccessFileMode;
        RandomAccessFileMode randomAccessFileMode2 = READ_ONLY;
        for (OpenOption openOption : openOptionArr) {
            if (openOption instanceof StandardOpenOption) {
                int i = AbstractC9816.f25562[((StandardOpenOption) openOption).ordinal()];
                if (i == 1) {
                    randomAccessFileMode = READ_WRITE;
                    if (!randomAccessFileMode2.implies(randomAccessFileMode)) {
                    }
                } else if (i == 2) {
                    randomAccessFileMode = READ_WRITE_SYNC_CONTENT;
                    if (!randomAccessFileMode2.implies(randomAccessFileMode)) {
                    }
                } else if (i == 3) {
                    randomAccessFileMode = READ_WRITE_SYNC_ALL;
                    if (!randomAccessFileMode2.implies(randomAccessFileMode)) {
                        randomAccessFileMode2 = randomAccessFileMode;
                    }
                }
            }
        }
        return randomAccessFileMode2;
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
                C6755.m11869(str);
                return null;
        }
    }

    public void accept(Path path, InterfaceC9737 interfaceC9737) throws IOException {
        RandomAccessFile randomAccessFileCreate = create(path);
        try {
            interfaceC9737.accept(randomAccessFileCreate);
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

    public <T> T apply(Path path, InterfaceC9736 interfaceC9736) throws IOException {
        RandomAccessFile randomAccessFileCreate = create(path);
        try {
            T t = (T) interfaceC9736.mo15033(randomAccessFileCreate);
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

    /* JADX INFO: renamed from: io */
    public C9815 m505io(String str) {
        return new C9815(str, this.mode);
    }

    public RandomAccessFile create(File file) {
        return new C9815(file, this.mode);
    }

    public RandomAccessFile create(String str) {
        return new C9815(str, this.mode);
    }
}
