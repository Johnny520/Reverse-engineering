package Yue;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
public final class C5716 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C5716 f1632 = new C5716();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final LinkOption[] f1633 = {LinkOption.NOFOLLOW_LINKS};

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final LinkOption[] f14130 = new LinkOption[0];

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final Set<FileVisitOption> f14131 = C7387.m23125();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final Set<FileVisitOption> f14132 = C7386.m23120(FileVisitOption.FOLLOW_LINKS);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final LinkOption[] m2396(boolean z) {
        return z ? f14130 : f1633;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final Set<FileVisitOption> m2397(boolean z) {
        return z ? f14132 : f14131;
    }
}
