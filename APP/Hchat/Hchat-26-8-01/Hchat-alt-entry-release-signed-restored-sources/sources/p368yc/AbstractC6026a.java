package p368yc;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import mh.AbstractC2846d;
import p012ah.C0086a;

/* JADX INFO: renamed from: yc.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6026a {

    /* JADX INFO: renamed from: a */
    public static final Set f24474a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(AbstractC6026a.class);
        try {
            new File(".").getCanonicalFile().toPath();
            f24474a = Collections.unmodifiableSet(new HashSet(Arrays.asList("zip", "jar", "apk")));
        } catch (IOException e6) {
            C0086a.m457p("Failed to init current working dir constant", e6);
        }
    }
}
