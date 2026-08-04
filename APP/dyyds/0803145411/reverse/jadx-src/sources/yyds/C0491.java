package yyds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛲᲈᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0491 extends AbstractC2019 implements Iterable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public ArrayList f2414;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0491) {
            return this.f2414.equals(((C0491) obj).f2414);
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2414.iterator();
    }

    public final String toString() {
        return AbstractC2104.m4014("[", AbstractC0902.m2014(",", "", this.f2414), "]");
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C0491 mo1344() {
        return this;
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final Class mo1345(C0864 c0864) {
        return List.class;
    }
}
