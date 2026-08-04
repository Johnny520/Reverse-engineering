package yyds;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲀᛷᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2029 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f10127;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Map f10128;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Set f10129;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Set f10130;

    public C2029(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.f10127 = str;
        this.f10128 = map;
        this.f10129 = abstractSet;
        this.f10130 = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2029)) {
            return false;
        }
        C2029 c2029 = (C2029) obj;
        if (!this.f10127.equals(c2029.f10127) || !this.f10128.equals(c2029.f10128) || !this.f10129.equals(c2029.f10129)) {
            return false;
        }
        Set set2 = this.f10130;
        if (set2 == null || (set = c2029.f10130) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f10129.hashCode() + ((this.f10128.hashCode() + (this.f10127.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f10127);
        sb.append("',\n            |    columns = {");
        sb.append(AbstractC1367.m2778(AbstractC1595.m3272(this.f10128.values(), new C1300(21))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(AbstractC1367.m2778(this.f10129));
        sb.append("\n            |    indices = {");
        Set set = this.f10130;
        sb.append(AbstractC1367.m2778(set != null ? AbstractC1595.m3272(set, new C1300(22)) : C1860.f9345));
        sb.append("\n            |}\n        ");
        return AbstractC0786.m1776(sb.toString());
    }
}
