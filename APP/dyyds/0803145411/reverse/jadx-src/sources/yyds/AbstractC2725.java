package yyds;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲈᛸᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2725 extends AbstractC0024 {
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static C2807 m4849(Collection collection) {
        return new C2807(0, collection.size() - 1, 1);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static int m4850(List list) {
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static void m4851() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final List m4852(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Collections.singletonList(list.get(0)) : C1860.f9345;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static void m4853() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static List m4854(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : C1860.f9345;
    }
}
