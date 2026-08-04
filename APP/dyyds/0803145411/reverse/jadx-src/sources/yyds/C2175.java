package yyds;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲁᛲᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2175 implements InterfaceC0652, Cloneable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C2175 f10659 = new C2175();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final List f10660;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final List f10661;

    public C2175() {
        List list = Collections.EMPTY_LIST;
        this.f10660 = list;
        this.f10661 = list;
    }

    public final Object clone() {
        try {
            return (C2175) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // yyds.InterfaceC0652
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
        Class cls = c2805.f13682;
        boolean zM4145 = m4145(cls, true);
        boolean zM41452 = m4145(cls, false);
        if (zM4145 || zM41452) {
            return new C2669(this, zM41452, zM4145, c0114, c2805);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean m4145(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            AbstractC1741 abstractC1741 = AbstractC1301.f5958;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f10660 : this.f10661).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        C0188.m794();
        return false;
    }
}
