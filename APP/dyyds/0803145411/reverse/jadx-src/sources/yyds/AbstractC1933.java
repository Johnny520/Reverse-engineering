package yyds;

import java.util.HashMap;

/* JADX INFO: renamed from: yyds.ᲀᛱᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1933 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final HashMap f9733;

    static {
        HashMap map = new HashMap();
        f9733 = map;
        map.put(EnumC1452.EXISTS, new C0249(5));
        map.put(EnumC1452.NE, new C0249(12));
        map.put(EnumC1452.TSNE, new C0249(20));
        map.put(EnumC1452.EQ, new C0249(4));
        map.put(EnumC1452.TSEQ, new C0249(19));
        map.put(EnumC1452.LT, new C0249(10));
        map.put(EnumC1452.LTE, new C0249(9));
        map.put(EnumC1452.GT, new C0249(7));
        map.put(EnumC1452.GTE, new C0249(6));
        map.put(EnumC1452.REGEX, new C0249(15));
        map.put(EnumC1452.SIZE, new C0249(16));
        map.put(EnumC1452.EMPTY, new C0249(3));
        map.put(EnumC1452.IN, new C0249(8));
        map.put(EnumC1452.NIN, new C0249(13));
        map.put(EnumC1452.ALL, new C0249(0));
        map.put(EnumC1452.CONTAINS, new C0249(2));
        map.put(EnumC1452.MATCHES, new C0249(14));
        map.put(EnumC1452.TYPE, new C0249(18));
        map.put(EnumC1452.SUBSETOF, new C0249(17));
        map.put(EnumC1452.ANYOF, new C0249(1));
        map.put(EnumC1452.NONEOF, new C0249(11));
    }
}
