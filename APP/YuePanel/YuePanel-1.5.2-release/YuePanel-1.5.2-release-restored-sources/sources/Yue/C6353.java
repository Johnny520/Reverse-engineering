package Yue;

import java.util.Comparator;

/* JADX INFO: renamed from: Yue.ۥۡۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6353 implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C6353 f16122 = new C6353();

    /* JADX DEBUG: Return type fixed from 'java.util.Comparator<java.lang.Comparable<java.lang.Object>>' to match base method */
    @Override // java.util.Comparator
    @InterfaceC6399
    public final Comparator<Comparable<? super Object>> reversed() {
        return C7163.f21577;
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public int compare(@InterfaceC6399 Comparable<Object> comparable, @InterfaceC6399 Comparable<Object> comparable2) {
        C5499.m17103(comparable, C6608.f2171);
        C5499.m17103(comparable2, "b");
        return comparable.compareTo(comparable2);
    }
}
