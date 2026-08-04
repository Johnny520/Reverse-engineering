package yyds;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛴᛷᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0900 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f4105;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f4106;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final List f4107;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final List f4108;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public C0900(String str, boolean z, List list, List list2) {
        this.f4105 = str;
        this.f4106 = z;
        this.f4107 = list;
        this.f4108 = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.f4108 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0900)) {
            return false;
        }
        C0900 c0900 = (C0900) obj;
        String str = c0900.f4105;
        if (this.f4106 != c0900.f4106 || !this.f4107.equals(c0900.f4107) || !AbstractC1544.m3188(this.f4108, c0900.f4108)) {
            return false;
        }
        String str2 = this.f4105;
        return str2.startsWith("index_") ? str.startsWith("index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f4105;
        return this.f4108.hashCode() + ((this.f4107.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f4106 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return AbstractC0786.m1777(AbstractC0786.m1776("\n            |Index {\n            |   name = '" + this.f4105 + "',\n            |   unique = '" + this.f4106 + "',\n            |   columns = {" + AbstractC0786.m1777(AbstractC1595.m3285(this.f4107, ",", null, null, null, 62)).concat(AbstractC0786.m1777("},")) + "\n            |   orders = {" + AbstractC0786.m1777(AbstractC1595.m3285(this.f4108, ",", null, null, null, 62)).concat(AbstractC0786.m1777(" }")) + "\n            |}\n        "));
    }
}
