package org.luckypray.dexkit.query.matchers.base;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.TargetElementType;
import org.luckypray.dexkit.schema.TargetElementTypesMatcher;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0183n;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class TargetElementTypesMatcher extends BaseQuery {
    public static final Companion Companion = null;
    private MatchType matchType;
    private Collection<? extends TargetElementType> types;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ TargetElementTypesMatcher create$default(Companion r02, Collection r1, MatchType r2, int r3, Object r4) {
            if ((r3 & 2) == 0) goto L6;
            r2 = MatchType.Contains;
        L6:
            return r02.create(r1, r2);
        }

        public final TargetElementTypesMatcher create(Collection<? extends TargetElementType> r2, MatchType r3) {
            AbstractC0307g.m703e(r2, "types");
            AbstractC0307g.m703e(r3, "matchType");
            return new TargetElementTypesMatcher(r2, r3);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TargetElementTypesMatcher(Collection<? extends TargetElementType> r3) {
        AbstractC0307g.m703e(r3, "types");
        this(r3, null, 2, 0 == true ? 1 : 0);
    }

    public static final TargetElementTypesMatcher create(Collection<? extends TargetElementType> r1, MatchType r2) {
        return Companion.create(r1, r2);
    }

    public final MatchType getMatchType() {
        return this.matchType;
    }

    public final Collection<TargetElementType> getTypes() {
        return this.types;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r7) {
        AbstractC0307g.m703e(r7, "fbb");
        TargetElementTypesMatcher.Companion r02 = org.luckypray.dexkit.schema.TargetElementTypesMatcher.Companion;
        Collection<? extends TargetElementType> r1 = this.types;
        int r2 = 0;
        if (r1 == null) goto L13;
        ArrayList r3 = new ArrayList(AbstractC0183n.m559k0(r1, 10));
        Iterator<T> r12 = r1.iterator();
    L6:
        if (r12.hasNext() == false) goto L8;
        r3.add(Byte.valueOf(((TargetElementType) r12.next()).getValue()));
        goto L6
    L8:
        byte[] r13 = new byte[r3.size()];
        Iterator r32 = r3.iterator();
    L10:
        if (r32.hasNext() == false) goto L12;
        r13[r2] = ((Number) r32.next()).byteValue();
        r2 = r2 + 1;
        goto L10
    L12:
        r2 = org.luckypray.dexkit.schema.TargetElementTypesMatcher.Companion.createTypesVector(r7, r13);
    L13:
        int r03 = r02.createTargetElementTypesMatcher(r7, r2, this.matchType.getValue());
        r7.m1931n(r03);
        return r03;
    }

    public final TargetElementTypesMatcher matchType(MatchType r2) {
        AbstractC0307g.m703e(r2, "matchType");
        this.matchType = r2;
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType r2) {
        AbstractC0307g.m703e(r2, "<set-?>");
        this.matchType = r2;
    }

    public final /* synthetic */ void setTypes(Collection r1) {
        this.types = r1;
    }

    public final TargetElementTypesMatcher types(Collection<? extends TargetElementType> r2) {
        AbstractC0307g.m703e(r2, "types");
        this.types = r2;
        return this;
    }

    public TargetElementTypesMatcher() {
        this.matchType = MatchType.Contains;
    }

    public final TargetElementTypesMatcher types(TargetElementType... r2) {
        AbstractC0307g.m703e(r2, "types");
        this.types = AbstractC0179j.m540q0(r2);
        return this;
    }

    public /* synthetic */ TargetElementTypesMatcher(Collection r1, MatchType r2, int r3, AbstractC0304d r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = MatchType.Contains;
    L5:
        this(r1, r2);
    }

    public TargetElementTypesMatcher(Collection<? extends TargetElementType> r2, MatchType r3) {
        AbstractC0307g.m703e(r2, "types");
        AbstractC0307g.m703e(r3, "matchType");
        MatchType r02 = MatchType.Contains;
        this.types = r2;
        this.matchType = r3;
    }
}
