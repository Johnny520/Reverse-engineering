package p216od;

import java.io.File;
import java.nio.file.Files;
import java.util.Properties;

/* JADX INFO: renamed from: od.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5733b {

    /* JADX INFO: renamed from: a */
    public String f18075a;

    /* JADX INFO: renamed from: b */
    public String f18076b;

    /* JADX INFO: renamed from: c */
    public String f18077c;

    /* JADX INFO: renamed from: d */
    public String f18078d;

    /* JADX INFO: renamed from: e */
    public String f18079e;

    /* JADX INFO: renamed from: f */
    public File f18080f;

    /* JADX INFO: renamed from: g */
    public File f18081g;

    public C5733b(File file) {
        this.f18080f = new File(file, "main.java");
        this.f18081g = new File(file, "info.prop");
        this.f18079e = file.getAbsolutePath();
        m23195e();
    }

    /* JADX INFO: renamed from: a */
    public String m23191a() {
        return this.f18076b;
    }

    /* JADX INFO: renamed from: b */
    public String m23192b() {
        return this.f18075a;
    }

    /* JADX INFO: renamed from: c */
    public String m23193c() {
        return this.f18079e;
    }

    /* JADX INFO: renamed from: d */
    public String m23194d() {
        return this.f18077c;
    }

    /* JADX INFO: renamed from: e */
    public void m23195e() {
        if (this.f18081g.exists()) {
            try {
                Properties properties = new Properties();
                properties.load(Files.newBufferedReader(this.f18081g.toPath()));
                this.f18075a = properties.getProperty("name");
                this.f18076b = properties.getProperty("author");
                this.f18077c = properties.getProperty("version");
                this.f18078d = properties.getProperty("desc");
            } catch (Throwable th) {
                AbstractC5736e.m23199d(this, th);
            }
        }
    }
}
