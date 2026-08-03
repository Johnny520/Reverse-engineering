package p247qe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: qe.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3517a0 {

    /* JADX INFO: renamed from: b */
    public static final C3517a0 f11451b = m7414a(new EnumC3543z[0]);

    /* JADX INFO: renamed from: c */
    public static final C3517a0 f11452c;

    /* JADX INFO: renamed from: d */
    public static final C3517a0 f11453d;

    /* JADX INFO: renamed from: e */
    public static final C3517a0 f11454e;

    /* JADX INFO: renamed from: a */
    public final Set f11455a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3543z enumC3543z = EnumC3543z.f11524g;
        f11452c = m7414a(enumC3543z);
        f11453d = m7414a(enumC3543z, EnumC3543z.f11525h);
        f11454e = m7414a(enumC3543z, EnumC3543z.f11527j, EnumC3543z.f11526i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3517a0(EnumSet enumSet) {
        this.f11455a = enumSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C3517a0 m7414a(EnumC3543z... enumC3543zArr) {
        EnumSet enumSetCopyOf;
        if (enumC3543zArr.length == 0) {
            enumSetCopyOf = EnumSet.noneOf(EnumC3543z.class);
        } else {
            ArrayList arrayList = new ArrayList(enumC3543zArr.length);
            for (EnumC3543z enumC3543z : enumC3543zArr) {
                Objects.requireNonNull(enumC3543z);
                arrayList.add(enumC3543z);
            }
            enumSetCopyOf = EnumSet.copyOf((Collection) Collections.unmodifiableList(arrayList));
        }
        return new C3517a0(enumSetCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f11455a.toString();
    }
}
