package p015C2;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import p020D2.AbstractC0263a;

/* JADX INFO: renamed from: C2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0242b extends AbstractC0263a {

    /* JADX INFO: renamed from: g */
    public final Field f813g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0242b(Field field) {
        this.f813g = field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020D2.AbstractC0263a
    /* JADX INFO: renamed from: I */
    public final Member mo444I() {
        return this.f813g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020D2.AbstractC0263a
    /* JADX INFO: renamed from: J */
    public final AbstractC0263a mo445J(Object obj) {
        m457H(obj);
        return this;
    }
}
