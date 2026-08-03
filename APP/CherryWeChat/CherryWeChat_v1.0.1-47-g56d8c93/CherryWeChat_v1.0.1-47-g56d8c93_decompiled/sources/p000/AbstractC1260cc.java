package p000;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: cc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1260cc {

    /* JADX INFO: renamed from: a */
    public static final List f4274a;

    static {
        try {
            f4274a = AbstractC0040Ax.m59I(new C1216bb(new C2381po(1, Arrays.asList(new C0046B2()).iterator())));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
