.class public final LYue/ۥ۟ۢ۟ۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,76:1\n30#1,13:77\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n48#1:77,13\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,76:1\n30#1,13:77\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n48#1:77,13\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(Landroid/util/AtomicFile;)[B
    .locals 0
    .param p0    # Landroid/util/AtomicFile;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, Landroid/util/AtomicFile;->readFully()[B

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1
    .param p0    # Landroid/util/AtomicFile;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/nio/charset/Charset;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Landroid/util/AtomicFile;->readFully()[B

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public static synthetic ۥ۟۟(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, LYue/ۥ۟ۤۤ۠;->ۥ۟:Ljava/nio/charset/Charset;

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۟ۢ۟ۧ;->ۥ۟(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟(Landroid/util/AtomicFile;LYue/ۥۣ۠ۡ۟;)V
    .locals 2
    .param p0    # Landroid/util/AtomicFile;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/AtomicFile;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/io/FileOutputStream;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-virtual {p0, v0}, Landroid/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-virtual {p0, v0}, Landroid/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method

.method public static final ۥ۟۟۟۟(Landroid/util/AtomicFile;[B)V
    .locals 1
    .param p0    # Landroid/util/AtomicFile;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Landroid/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Landroid/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    throw p1
.end method

.method public static final ۥ۟۟۟۠(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 0
    .param p0    # Landroid/util/AtomicFile;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/nio/charset/Charset;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string p2, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥ۟ۢ۟ۧ;->ۥ۟۟۟۟(Landroid/util/AtomicFile;[B)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۡ(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, LYue/ۥ۟ۤۤ۠;->ۥ۟:Ljava/nio/charset/Charset;

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۢ۟ۧ;->ۥ۟۟۟۠(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    return-void
.end method
