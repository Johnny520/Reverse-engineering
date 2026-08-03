package Yue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6630 {
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m21100(C6624 c6624) {
        for (C6624 c6624M21062 = c6624.m21062(); c6624M21062 != null; c6624M21062 = c6624M21062.m21062()) {
            if (c6624M21062.m3100() == null || c6624.m3100() == null) {
                try {
                    if (Files.isSameFile(c6624M21062.m21063(), c6624.m21063())) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (C5499.m17094(c6624M21062.m3100(), c6624.m3100())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Object m21101(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            C5499.m17102(attributes, "readAttributes(this, A::class.java, *options)");
            return attributes.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }
}
