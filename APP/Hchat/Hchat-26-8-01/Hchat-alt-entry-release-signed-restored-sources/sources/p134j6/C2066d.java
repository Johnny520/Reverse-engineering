package p134j6;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p012ah.C0086a;
import p077f8.AbstractC1089i;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p136j8.C2104o;
import p165l6.AbstractC2512c;
import p194n6.C2901a;

/* JADX INFO: renamed from: j6.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2066d implements InterfaceC1623o, Cloneable {

    /* JADX INFO: renamed from: j */
    public static final C2066d f6943j = new C2066d();

    /* JADX INFO: renamed from: g */
    public boolean f6944g = true;

    /* JADX INFO: renamed from: h */
    public final List f6945h;

    /* JADX INFO: renamed from: i */
    public final List f6946i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2066d() {
        List list = Collections.EMPTY_LIST;
        this.f6945h = list;
        this.f6946i = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.InterfaceC1623o
    /* JADX INFO: renamed from: a */
    public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
        Class cls = c2901a.f9368a;
        boolean zM5122c = m5122c(cls, true);
        boolean zM5122c2 = m5122c(cls, false);
        if (zM5122c || zM5122c2) {
            return new C2065c(this, zM5122c, c1614f, c2901a);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2066d clone() {
        try {
            return (C2066d) super.clone();
        } catch (CloneNotSupportedException e6) {
            C2104o.m5281f(e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m5122c(Class cls, boolean z9) {
        if (!this.f6944g && cls.isMemberClass()) {
            AbstractC1089i abstractC1089i = AbstractC2512c.f8137a;
            if (!Modifier.isStatic(cls.getModifiers())) {
                return true;
            }
        }
        if (!z9 && !Enum.class.isAssignableFrom(cls)) {
            AbstractC1089i abstractC1089i2 = AbstractC2512c.f8137a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z9 ? this.f6945h : this.f6946i).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        C0086a.m445d();
        return false;
    }
}
