package yyds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛴᲈᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0989 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0052 f4503;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1449 f4504;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Set f4505;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Collection f4506;

    public C0989(C0052 c0052, C1449 c1449, EnumSet enumSet, ArrayList arrayList) {
        AbstractC0902.m2010(c0052, "jsonProvider can not be null");
        AbstractC0902.m2010(c1449, "mappingProvider can not be null");
        AbstractC0902.m2010(enumSet, "setOptions can not be null");
        AbstractC0902.m2010(arrayList, "evaluationListeners can not be null");
        this.f4503 = c0052;
        this.f4504 = c1449;
        this.f4505 = Collections.unmodifiableSet(enumSet);
        this.f4506 = Collections.unmodifiableCollection(arrayList);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0299 m2175() {
        C0299 c0299 = new C0299(2);
        c0299.f1576 = EnumSet.noneOf(EnumC0445.class);
        c0299.f1574 = new ArrayList();
        return c0299;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0989.class == obj.getClass()) {
            C0989 c0989 = (C0989) obj;
            if (this.f4503.getClass() == c0989.f4503.getClass() && this.f4504.getClass() == c0989.f4504.getClass() && Objects.equals(this.f4505, c0989.f4505)) {
                return true;
            }
        }
        return false;
    }
}
