package androidx.compose.ui.text;

import androidx.collection.AbstractC0270;
import androidx.collection.C0247;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p195.AbstractC7834;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2068 implements CharSequence {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f6128;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f6129;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f6130;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f6131;

    static {
        C4871 c4871 = AbstractC2037.f6020;
    }

    public C2068(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f6131 = list;
        this.f6129 = str;
        int i = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                C2050 c2050 = (C2050) list.get(i2);
                Object obj = c2050.f6077;
                if (obj instanceof C2047) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c2050);
                } else if (obj instanceof C2064) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c2050);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f6130 = arrayList;
        this.f6128 = arrayList2;
        List listM8778 = arrayList2 != null ? AbstractC4344.m8778(arrayList2, new C2049(i)) : null;
        if (listM8778 == null || listM8778.isEmpty()) {
            return;
        }
        int i3 = ((C2050) AbstractC4344.m8820(listM8778)).f6075;
        C0247 c0247 = AbstractC0270.f975;
        C0247 c02472 = new C0247(1);
        c02472.m795(i3);
        int size2 = listM8778.size();
        for (int i4 = 1; i4 < size2; i4++) {
            C2050 c20502 = (C2050) listM8778.get(i4);
            while (true) {
                if (c02472.f985 != 0) {
                    int iM855 = c02472.m855();
                    int i5 = c20502.f6076;
                    int i6 = c20502.f6075;
                    if (i5 >= iM855) {
                        c02472.m793(c02472.f985 - 1);
                    } else if (i6 > iM855) {
                        AbstractC7834.m13198("Paragraph overlap not allowed, end " + i6 + " should be less than or equal to " + iM855);
                    }
                }
            }
            c02472.m795(c20502.f6075);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f6129.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2068)) {
            return false;
        }
        C2068 c2068 = (C2068) obj;
        return AbstractC4395.m8907(this.f6129, c2068.f6129) && AbstractC4395.m8907(this.f6131, c2068.f6131);
    }

    public final int hashCode() {
        int iHashCode = this.f6129.hashCode() * 31;
        List list = this.f6131;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6129.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6129;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.text.C2068 subSequence(int r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 > r11) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p195.AbstractC7834.m13198(r1)
        L26:
            java.lang.String r1 = r9.f6129
            if (r10 != 0) goto L31
            int r4 = r1.length()
            if (r11 != r4) goto L31
            return r9
        L31:
            java.lang.String r1 = r1.substring(r10, r11)
            androidx.compose.ui.text.飘花落叶言子楪苏世哲兰 r4 = androidx.compose.ui.text.AbstractC2067.f6127
            if (r10 > r11) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r10)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r11)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            p195.AbstractC7834.m13198(r2)
        L54:
            java.util.List r9 = r9.f6131
            if (r9 != 0) goto L59
            goto L99
        L59:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r9.size()
            r2.<init>(r3)
            int r3 = r9.size()
        L66:
            if (r0 >= r3) goto L93
            java.lang.Object r4 = r9.get(r0)
            androidx.compose.ui.text.飘花落叶言子楪世兰苏哲 r4 = (androidx.compose.ui.text.C2050) r4
            int r5 = r4.f6076
            int r6 = r4.f6075
            boolean r5 = androidx.compose.ui.text.AbstractC2067.m3802(r10, r11, r5, r6)
            if (r5 == 0) goto L90
            androidx.compose.ui.text.飘花落叶言子楪世兰苏哲 r5 = new androidx.compose.ui.text.飘花落叶言子楪世兰苏哲
            java.lang.Object r7 = r4.f6077
            int r8 = r4.f6076
            int r8 = java.lang.Math.max(r10, r8)
            int r8 = r8 - r10
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r10
            java.lang.String r4 = r4.f6074
            r5.<init>(r4, r8, r7, r6)
            r2.add(r5)
        L90:
            int r0 = r0 + 1
            goto L66
        L93:
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L9a
        L99:
            r2 = 0
        L9a:
            androidx.compose.ui.text.飘花落叶言子楪苏世哲兰 r9 = new androidx.compose.ui.text.飘花落叶言子楪苏世哲兰
            r9.<init>(r2, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.C2068.subSequence(int, int):androidx.compose.ui.text.飘花落叶言子楪苏世哲兰");
    }

    public C2068(String str) {
        this(str, EmptyList.INSTANCE);
    }

    public C2068(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
