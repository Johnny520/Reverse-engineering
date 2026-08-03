package Yue;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۡۨۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7387 extends C7386 {
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <E> Set<E> m23123(int i, @InterfaceC3614 InterfaceC5124<? super Set<E>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        Set setM23119 = C7386.m23119(i);
        interfaceC5124.invoke(setM23119);
        return C7386.m3593(setM23119);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <E> Set<E> m23124(@InterfaceC3614 InterfaceC5124<? super Set<E>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        Set setM23118 = C7386.m23118();
        interfaceC5124.invoke(setM23118);
        return C7386.m3593(setM23118);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static <T> Set<T> m23125() {
        return C4636.f9949;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> HashSet<T> m23126() {
        return new HashSet<>();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> HashSet<T> m23127(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return (HashSet) C3411.m8905(tArr, new HashSet(C5942.m18568(tArr.length)));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> LinkedHashSet<T> m23128() {
        return new LinkedHashSet<>();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> LinkedHashSet<T> m23129(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return (LinkedHashSet) C3411.m8905(tArr, new LinkedHashSet(C5942.m18568(tArr.length)));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <T> Set<T> m23130() {
        return new LinkedHashSet();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <T> Set<T> m23131(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return (Set) C3411.m8905(tArr, new LinkedHashSet(C5942.m18568(tArr.length)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <T> Set<T> m23132(@InterfaceC6399 Set<? extends T> set) {
        C5499.m17103(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C7386.m23120(set.iterator().next()) : m23125();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Set<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <T> Set<T> m23133(Set<? extends T> set) {
        return set == 0 ? m23125() : set;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <T> Set<T> m23134() {
        return m23125();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <T> Set<T> m23135(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return tArr.length > 0 ? C3411.m8954(tArr) : m23125();
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final <T> Set<T> m23136(@InterfaceC6489 T t) {
        return t != null ? C7386.m23120(t) : m23125();
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final <T> Set<T> m23137(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return (Set) C3411.m7692(tArr, new LinkedHashSet());
    }
}
