package Yue;

import android.annotation.SuppressLint;
import android.graphics.Path;

/* JADX INFO: renamed from: Yue.ۥۣۡۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n1#1,80:1\n43#1,3:81\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n60#1:81,3\n*E\n"})
@SuppressLint({"ClassVerificationFailure"})
public final class C6622 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final Path m3097(@InterfaceC6399 Path path, @InterfaceC6399 Path path2) {
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Iterable<C6628> m3098(@InterfaceC6399 Path path, float f) {
        return C6631.m3113(path, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Iterable m21057(Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return m3098(path, f);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Path m21058(@InterfaceC6399 Path path, @InterfaceC6399 Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Path m21059(@InterfaceC6399 Path path, @InterfaceC6399 Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Path m21060(@InterfaceC6399 Path path, @InterfaceC6399 Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Path m21061(@InterfaceC6399 Path path, @InterfaceC6399 Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
