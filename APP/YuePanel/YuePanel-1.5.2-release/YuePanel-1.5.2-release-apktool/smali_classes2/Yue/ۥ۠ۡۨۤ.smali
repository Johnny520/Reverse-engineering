.class public abstract LYue/ۥ۠ۡۨۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,165:1\n52#2,21:166\n52#2,21:187\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n67#1:166,21\n81#1:187,21\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۡۨۤ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,165:1\n52#2,21:166\n52#2,21:187\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n67#1:166,21\n81#1:187,21\n*E\n"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۠ۡۨۤ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥ۠ۡۨۤ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟:LYue/ۥۣۡۧۧ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟:LYue/ۥ۠ۡۨۤ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LYue/ۥ۠ۡۨۤ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۡۨۤ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۡۨۤ;->ۥ:LYue/ۥ۠ۡۨۤ$ۥ;

    :try_start_0
    const-string v0, "java.nio.file.Files"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    new-instance v0, LYue/ۥۡۢۢۨ;

    invoke-direct {v0}, LYue/ۥۡۢۢۨ;-><init>()V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, LYue/ۥ۠ۦۢ;

    invoke-direct {v0}, LYue/ۥ۠ۦۢ;-><init>()V

    :goto_0
    sput-object v0, LYue/ۥ۠ۡۨۤ;->ۥ۟:LYue/ۥ۠ۡۨۤ;

    sget-object v0, LYue/ۥۣۡۧۧ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۧۧ$ۥ;

    const-string v2, "java.io.tmpdir"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getProperty(...)"

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟۟۟ۢ(LYue/ۥۣۡۧۧ$ۥ;Ljava/lang/String;ZILjava/lang/Object;)LYue/ۥۣۡۧۧ;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۡۨۤ;->ۥ۟۟:LYue/ۥۣۡۧۧ;

    new-instance v0, LYue/ۥۡۦۦۡ;

    const-class v1, LYue/ۥۡۦۦۡ;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v1, "getClassLoader(...)"

    invoke-static {v2, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LYue/ۥۡۦۦۡ;-><init>(Ljava/lang/ClassLoader;ZLYue/ۥ۠ۡۨۤ;ILYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟:LYue/ۥ۠ۡۨۤ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;ZLYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p5, :cond_4

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    const-string p4, "file"

    invoke-static {p1, p4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "writerAction"

    invoke-static {p3, p4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۢ(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۣۡۡ;->ۥ۟۟۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۣ۟۟;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p3, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    if-eqz p0, :cond_1

    :try_start_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    :cond_1
    :goto_0
    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    goto :goto_2

    :catchall_1
    move-exception p3

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    if-eqz p0, :cond_2

    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p0

    invoke-static {p3, p0}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    move-object v0, p3

    move-object p3, p1

    move-object p1, v0

    :goto_2
    if-nez p1, :cond_3

    invoke-static {p3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object p3

    :cond_3
    throw p1

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: write"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟۟۠(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;ZILjava/lang/Object;)LYue/ۥۣۢ۟ۡ;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟۟(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: appendingSink"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟۟ۦ(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;ZILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟ۥ(LYue/ۥۣۡۧۧ;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createDirectories"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟۠(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;ZILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟ۨ(LYue/ۥۣۡۧۧ;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createDirectory"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟۠ۢ(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;ZILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۡ(LYue/ۥۣۡۧۧ;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: delete"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟۠ۥ(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;ZILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۤ(LYue/ۥۣۡۧۧ;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: deleteRecursively"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۠ۧ(Ljava/nio/file/FileSystem;)LYue/ۥ۠ۡۨۤ;
    .locals 1
    .param p0    # Ljava/nio/file/FileSystem;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "get"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۡۨۤ;->ۥ:LYue/ۥ۠ۡۨۤ$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۡۨۤ$ۥ;->ۥ(Ljava/nio/file/FileSystem;)LYue/ۥ۠ۡۨۤ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟ۡۡ(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;ZILjava/lang/Object;)LYue/ۥۡۨۢ;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡ۠(LYue/ۥۣۡۧۧ;Z)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: listRecursively"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟ۡۧ(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;ZZILjava/lang/Object;)LYue/ۥ۠ۡۧۧ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡۦ(LYue/ۥۣۡۧۧ;ZZ)LYue/ۥ۠ۡۧۧ;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: openReadWrite"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟ۢ۟(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;ZILjava/lang/Object;)LYue/ۥۣۢ۟ۡ;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۢ(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: sink"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ۥ(LYue/ۥۣۡۧۧ;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 3
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-read"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e3\u06e3\u06e0;",
            "+TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readerAction"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۢ۠(LYue/ۥۣۡۧۧ;)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p2, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    if-eqz p1, :cond_0

    :try_start_1
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :cond_0
    :goto_0
    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    if-eqz p1, :cond_1

    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    invoke-static {p2, p1}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    move-object v2, v1

    move-object v1, p2

    move-object p2, v2

    :goto_2
    if-nez v1, :cond_2

    invoke-static {p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object p2

    :cond_2
    throw v1
.end method

.method public final ۥ۟(LYue/ۥۣۡۧۧ;ZLYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 2
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-write"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            "Z",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e3\u06e3\u06df;",
            "+TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writerAction"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۢ(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥ۟۟۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۣ۟۟;

    move-result-object p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p3, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    if-eqz p1, :cond_0

    :try_start_1
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :cond_0
    :goto_0
    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    goto :goto_2

    :catchall_1
    move-exception p3

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    if-eqz p1, :cond_1

    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    invoke-static {p3, p1}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    move-object v1, v0

    move-object v0, p3

    move-object p3, v1

    :goto_2
    if-nez v0, :cond_2

    invoke-static {p3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object p3

    :cond_2
    throw v0
.end method

.method public final ۥ۟۟۟(LYue/ۥۣۡۧۧ;)LYue/ۥۣۢ۟ۡ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟۟(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۥ۟۟۟۟(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۡ(LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۢ(LYue/ۥۣۡۧۧ;)LYue/ۥۣۡۧۧ;
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public ۥۣ۟۟۟(LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LYue/ۥ۟۟۟ۢ;->ۥ۟(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V

    return-void
.end method

.method public final ۥ۟۟۟ۤ(LYue/ۥۣۡۧۧ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟ۥ(LYue/ۥۣۡۧۧ;Z)V

    return-void
.end method

.method public final ۥ۟۟۟ۥ(LYue/ۥۣۡۧۧ;Z)V
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LYue/ۥ۟۟۟ۢ;->ۥ۟۟(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;Z)V

    return-void
.end method

.method public final ۥ۟۟۟ۧ(LYue/ۥۣۡۧۧ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟ۨ(LYue/ۥۣۡۧۧ;Z)V

    return-void
.end method

.method public abstract ۥ۟۟۟ۨ(LYue/ۥۣۡۧۧ;Z)V
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۠۟(LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final ۥ۟۟۠۠(LYue/ۥۣۡۧۧ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۡ(LYue/ۥۣۡۧۧ;Z)V

    return-void
.end method

.method public abstract ۥ۟۟۠ۡ(LYue/ۥۣۡۧۧ;Z)V
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final ۥۣ۟۟۠(LYue/ۥۣۡۧۧ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "fileOrDirectory"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۤ(LYue/ۥۣۡۧۧ;Z)V

    return-void
.end method

.method public ۥ۟۟۠ۤ(LYue/ۥۣۡۧۧ;Z)V
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "fileOrDirectory"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LYue/ۥ۟۟۟ۢ;->ۥ۟۟۟(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;Z)V

    return-void
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۣۡۧۧ;)Z
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥ۟۟۟ۢ;->ۥ۟۟۟۟(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;)Z

    move-result p1

    return p1
.end method

.method public abstract ۥ۟۟۠ۨ(LYue/ۥۣۡۧۧ;)Ljava/util/List;
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡ(LYue/ۥۣۡۧۧ;)Ljava/util/List;
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;"
        }
    .end annotation
.end method

.method public final ۥ۟۟ۡ۟(LYue/ۥۣۡۧۧ;)LYue/ۥۡۨۢ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ")",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;"
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡ۠(LYue/ۥۣۡۧۧ;Z)LYue/ۥۡۨۢ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡ۠(LYue/ۥۣۡۧۧ;Z)LYue/ۥۡۨۢ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            "Z)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;"
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LYue/ۥ۟۟۟ۢ;->ۥ۟۟۟۠(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;Z)LYue/ۥۡۨۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟ۡۢ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥ۟۟۟ۢ;->ۥ۟۟۟ۡ(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۥۣ۟۟ۡ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡۤ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۧۧ;
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final ۥ۟۟ۡۥ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۧۧ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡۦ(LYue/ۥۣۡۧۧ;ZZ)LYue/ۥ۠ۡۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۥ۟۟ۡۦ(LYue/ۥۣۡۧۧ;ZZ)LYue/ۥ۠ۡۧۧ;
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final ۥ۟۟ۡۨ(LYue/ۥۣۡۧۧ;)LYue/ۥۣۢ۟ۡ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۢ(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۥ۟۟ۢ(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۢ۠(LYue/ۥۣۡۧۧ;)LYue/ۥۣۢ۟ۦ;
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
