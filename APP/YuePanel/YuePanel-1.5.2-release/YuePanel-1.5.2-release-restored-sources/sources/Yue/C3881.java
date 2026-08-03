package Yue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3881 extends C3880 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۥۡۤ$ۥ */
    @InterfaceC7507({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    public static final class C0278<T> implements Iterable<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<Iterator<T>> f7428;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends java.util.Iterator<? extends T>> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0278(InterfaceC5122<? extends Iterator<? extends T>> interfaceC5122) {
            this.f7428 = interfaceC5122;
        }

        @Override // java.lang.Iterable
        @InterfaceC6399
        public Iterator<T> iterator() {
            return this.f7428.invoke();
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <T> Iterable<T> m10755(InterfaceC5122<? extends Iterator<? extends T>> interfaceC5122) {
        C5499.m17103(interfaceC5122, "iterator");
        return new C0278(interfaceC5122);
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static <T> int m10756(@InterfaceC6399 Iterable<? extends T> iterable, int i) {
        C5499.m17103(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final <T> Integer m10757(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final <T> List<T> m10758(@InterfaceC6399 Iterable<? extends Iterable<? extends T>> iterable) {
        C5499.m17103(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            C3885.m10772(arrayList, it.next());
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final <T, R> C6599<List<T>, List<R>> m10759(@InterfaceC6399 Iterable<? extends C6599<? extends T, ? extends R>> iterable) {
        C5499.m17103(iterable, "<this>");
        int iM10756 = m10756(iterable, 10);
        ArrayList arrayList = new ArrayList(iM10756);
        ArrayList arrayList2 = new ArrayList(iM10756);
        for (C6599<? extends T, ? extends R> c6599 : iterable) {
            arrayList.add(c6599.m20938());
            arrayList2.add(c6599.m20939());
        }
        return C8003.m4014(arrayList, arrayList2);
    }
}
