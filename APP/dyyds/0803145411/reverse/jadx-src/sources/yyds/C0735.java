package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛳᲇᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0735 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList f3415;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f3416;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f3417;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f3418;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ArrayList f3419;

    public C0735(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f3416 = str;
        this.f3417 = str2;
        this.f3418 = str3;
        this.f3419 = arrayList;
        this.f3415 = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0735)) {
            return false;
        }
        C0735 c0735 = (C0735) obj;
        if (AbstractC1544.m3188(this.f3416, c0735.f3416) && AbstractC1544.m3188(this.f3417, c0735.f3417) && AbstractC1544.m3188(this.f3418, c0735.f3418) && this.f3419.equals(c0735.f3419)) {
            return this.f3415.equals(c0735.f3415);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3415.hashCode() + ((this.f3419.hashCode() + AbstractC0897.m1997(this.f3418, AbstractC0897.m1997(this.f3417, this.f3416.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return AbstractC0786.m1777(AbstractC0786.m1776("\n            |ForeignKey {\n            |   referenceTable = '" + this.f3416 + "',\n            |   onDelete = '" + this.f3417 + "',\n            |   onUpdate = '" + this.f3418 + "',\n            |   columnNames = {" + AbstractC0786.m1777(AbstractC1595.m3285(AbstractC1595.m3265(this.f3419), ",", null, null, null, 62)).concat(AbstractC0786.m1777("},")) + "\n            |   referenceColumnNames = {" + AbstractC0786.m1777(AbstractC1595.m3285(AbstractC1595.m3265(this.f3415), ",", null, null, null, 62)).concat(AbstractC0786.m1777(" }")) + "\n            |}\n        "));
    }
}
