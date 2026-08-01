package p020D2;

import com.bumptech.glide.AbstractC1922d;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: D2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0263a extends AbstractC1922d {

    /* JADX INFO: renamed from: f */
    public Object f855f;

    /* JADX INFO: renamed from: H */
    public final void m457H(Object obj) {
        if (this.f855f == null) {
            this.f855f = obj;
            return;
        }
        throw new IllegalStateException(("Instance already set for this resolver \"" + getClass() + "\" of \"" + mo444I() + "(" + this.f855f + ")\". To prevent problems, the instance object can only be set once in a resolver, otherwise use copy() to reuse the resolver.").toString());
    }

    /* JADX INFO: renamed from: I */
    public abstract Member mo444I();

    /* JADX INFO: renamed from: J */
    public abstract AbstractC0263a mo445J(Object obj);
}
