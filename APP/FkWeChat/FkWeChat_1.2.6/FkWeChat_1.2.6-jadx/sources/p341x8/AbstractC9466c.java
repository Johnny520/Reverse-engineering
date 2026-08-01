package p341x8;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import p185m8.AbstractC5081g0;
import p325w8.AbstractC9202b;

/* JADX INFO: renamed from: x8.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9466c extends AbstractC9465b {
    /* JADX INFO: renamed from: a */
    public static final List m36882a(Path path, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        path.getClass();
        str.getClass();
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            directoryStreamNewDirectoryStream.getClass();
            List listM20554X0 = AbstractC5081g0.m20554X0(directoryStreamNewDirectoryStream);
            AbstractC9202b.m35830a(directoryStreamNewDirectoryStream, null);
            return listM20554X0;
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m36883b(Path path, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "*";
        }
        return m36882a(path, str);
    }
}
