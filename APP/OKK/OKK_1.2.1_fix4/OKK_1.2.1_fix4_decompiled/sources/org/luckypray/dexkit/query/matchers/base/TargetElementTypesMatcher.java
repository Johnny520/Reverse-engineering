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
    public static final Companion Companion = new Companion(null);
    private MatchType matchType;
    private Collection<? extends TargetElementType> types;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ TargetElementTypesMatcher create$default(Companion companion, Collection collection, MatchType matchType, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                matchType = MatchType.Contains;
            }
            return companion.create(collection, matchType);
        }

        public final TargetElementTypesMatcher create(Collection<? extends TargetElementType> collection, MatchType matchType) {
            AbstractC0307g.m703e(collection, "types");
            AbstractC0307g.m703e(matchType, "matchType");
            return new TargetElementTypesMatcher(collection, matchType);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TargetElementTypesMatcher(Collection<? extends TargetElementType> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
        AbstractC0307g.m703e(collection, "types");
    }

    public static final TargetElementTypesMatcher create(Collection<? extends TargetElementType> collection, MatchType matchType) {
        return Companion.create(collection, matchType);
    }

    public final MatchType getMatchType() {
        return this.matchType;
    }

    public final Collection<TargetElementType> getTypes() {
        return this.types;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        TargetElementTypesMatcher.Companion companion = org.luckypray.dexkit.schema.TargetElementTypesMatcher.Companion;
        Collection<? extends TargetElementType> collection = this.types;
        int iCreateTypesVector = 0;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf(((TargetElementType) it.next()).getValue()));
            }
            byte[] bArr = new byte[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                bArr[iCreateTypesVector] = ((Number) it2.next()).byteValue();
                iCreateTypesVector++;
            }
            iCreateTypesVector = org.luckypray.dexkit.schema.TargetElementTypesMatcher.Companion.createTypesVector(c0733b, bArr);
        }
        int iCreateTargetElementTypesMatcher = companion.createTargetElementTypesMatcher(c0733b, iCreateTypesVector, this.matchType.getValue());
        c0733b.m1931n(iCreateTargetElementTypesMatcher);
        return iCreateTargetElementTypesMatcher;
    }

    public final TargetElementTypesMatcher matchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "<set-?>");
        this.matchType = matchType;
    }

    public final /* synthetic */ void setTypes(Collection collection) {
        this.types = collection;
    }

    public final TargetElementTypesMatcher types(Collection<? extends TargetElementType> collection) {
        AbstractC0307g.m703e(collection, "types");
        this.types = collection;
        return this;
    }

    public TargetElementTypesMatcher() {
        this.matchType = MatchType.Contains;
    }

    public final TargetElementTypesMatcher types(TargetElementType... targetElementTypeArr) {
        AbstractC0307g.m703e(targetElementTypeArr, "types");
        this.types = AbstractC0179j.m540q0(targetElementTypeArr);
        return this;
    }

    public /* synthetic */ TargetElementTypesMatcher(Collection collection, MatchType matchType, int i2, AbstractC0304d abstractC0304d) {
        this(collection, (i2 & 2) != 0 ? MatchType.Contains : matchType);
    }

    public TargetElementTypesMatcher(Collection<? extends TargetElementType> collection, MatchType matchType) {
        AbstractC0307g.m703e(collection, "types");
        AbstractC0307g.m703e(matchType, "matchType");
        MatchType matchType2 = MatchType.Contains;
        this.types = collection;
        this.matchType = matchType;
    }
}
