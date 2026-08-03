package p000;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: renamed from: Sm */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0802Sm {

    /* JADX INFO: renamed from: a */
    public static final Charset f2524a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    void mo172b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
