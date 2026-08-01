package androidx.compose.p001ui.text;

import androidx.collection.AbstractC1117;
import androidx.collection.C1094;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p211.AbstractC8663;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2902 implements CharSequence {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f6473;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f6474;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f6475;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f6476;

    static {
        C5703 c5703 = AbstractC2871.f6365;
    }

    public C2902(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f6476 = list;
        this.f6474 = str;
        int i = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                C2884 c2884 = (C2884) list.get(i2);
                Object obj = c2884.f6422;
                if (obj instanceof C2881) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c2884);
                } else if (obj instanceof C2898) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c2884);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f6475 = arrayList;
        this.f6473 = arrayList2;
        List listM9337 = arrayList2 != null ? AbstractC5176.m9337(arrayList2, new C2883(i)) : null;
        if (listM9337 == null || listM9337.isEmpty()) {
            return;
        }
        int i3 = ((C2884) AbstractC5176.m9379(listM9337)).f6420;
        C1094 c1094 = AbstractC1117.f1320;
        C1094 c10942 = new C1094(1);
        c10942.m1355(i3);
        int size2 = listM9337.size();
        for (int i4 = 1; i4 < size2; i4++) {
            C2884 c28842 = (C2884) listM9337.get(i4);
            while (true) {
                if (c10942.f1330 != 0) {
                    int iM1415 = c10942.m1415();
                    int i5 = c28842.f6421;
                    int i6 = c28842.f6420;
                    if (i5 >= iM1415) {
                        c10942.m1353(c10942.f1330 - 1);
                    } else if (i6 > iM1415) {
                        AbstractC8663.m13757("Paragraph overlap not allowed, end " + i6 + " should be less than or equal to " + iM1415);
                    }
                }
            }
            c10942.m1355(c28842.f6420);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f6474.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2902)) {
            return false;
        }
        C2902 c2902 = (C2902) obj;
        return AbstractC5227.m9466(this.f6474, c2902.f6474) && AbstractC5227.m9466(this.f6476, c2902.f6476);
    }

    public final int hashCode() {
        int iHashCode = this.f6474.hashCode() * 31;
        List list = this.f6476;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6474.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6474;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2902 subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            AbstractC8663.m13757("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.f6474;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        C2902 c2902 = AbstractC2901.f6472;
        if (i > i2) {
            AbstractC8663.m13757("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.f6476;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C2884 c2884 = (C2884) list.get(i3);
                int i4 = c2884.f6421;
                int i5 = c2884.f6420;
                if (AbstractC2901.m4362(i, i2, i4, i5)) {
                    arrayList.add(new C2884(c2884.f6419, Math.max(i, c2884.f6421) - i, c2884.f6422, Math.min(i2, i5) - i));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new C2902(arrayList, strSubstring);
    }

    public C2902(String str) {
        this(str, EmptyList.INSTANCE);
    }

    public C2902(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
