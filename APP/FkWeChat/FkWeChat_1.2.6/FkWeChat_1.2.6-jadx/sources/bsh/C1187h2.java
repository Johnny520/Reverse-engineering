package bsh;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: bsh.h2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1187h2 extends InputStreamReader {
    public C1187h2(File file) {
        this(new FileInputStream(file));
    }

    public C1187h2(InputStream inputStream) {
        super(inputStream, StandardCharsets.UTF_8);
    }
}
