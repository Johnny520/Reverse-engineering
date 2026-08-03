.class public LYue/ۥۡۤ۟ۡ;
.super LYue/ۥۡۤ۟۠;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n336#1,2:424\n344#1:426\n344#1:427\n338#1,4:428\n336#1,2:432\n344#1:434\n338#1,4:435\n344#1:439\n336#1,6:440\n336#1,2:446\n344#1:448\n338#1,4:449\n1#2:421\n1855#3,2:422\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n352#1:424,2\n361#1:426\n364#1:427\n352#1:428,4\n372#1:432,2\n373#1:434\n372#1:435,4\n384#1:439\n392#1:440,6\n410#1:446,2\n411#1:448\n410#1:449,4\n274#1:422,2\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۤ۟ۡ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n336#1,2:424\n344#1:426\n344#1:427\n338#1,4:428\n336#1,2:432\n344#1:434\n338#1,4:435\n344#1:439\n336#1,6:440\n336#1,2:446\n344#1:448\n338#1,4:449\n1#2:421\n1855#3,2:422\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n352#1:424,2\n361#1:426\n364#1:427\n352#1:428,4\n372#1:432,2\n373#1:434\n372#1:435,4\n384#1:439\n392#1:440,6\n410#1:446,2\n411#1:448\n410#1:449,4\n274#1:422,2\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۤ۟۠;-><init>()V

    return-void
.end method

.method public static final synthetic ۥ۟۟ۡۦ(LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 0

    invoke-static/range {p0 .. p5}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢ۠(LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۡۧ(LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢۤ(LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡۨ(LYue/ۥ۠ۡۢۤ;LYue/ۥۣ۠۠ۨ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e1\u06e2\u06e4;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۢۤ;->ۥ(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public static final ۥ۟۟ۢ(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZLYue/ۥۣ۠ۢۤ;)Ljava/nio/file/Path;
    .locals 6
    .param p0    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/lang/Exception;",
            "+",
            "LYue/\u06e5\u06e1\u06e3\u06e2;",
            ">;Z",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e1;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "+",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e2;",
            ">;)",
            "Ljava/nio/file/Path;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "copyAction"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۠ۧۡۦ;->ۥ:LYue/ۥ۠ۧۡۦ;

    invoke-virtual {v0, p3}, LYue/ۥ۠ۧۡۦ;->ۥ(Z)[Ljava/nio/file/LinkOption;

    move-result-object v0

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/file/LinkOption;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/file/LinkOption;

    invoke-static {p0, v0}, Ljava/nio/file/Files;->exists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/nio/file/LinkOption;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/nio/file/LinkOption;

    invoke-static {p0, v1}, Ljava/nio/file/Files;->exists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v1

    if-eqz v1, :cond_7

    if-nez p3, :cond_0

    invoke-static {p0}, Ljava/nio/file/Files;->isSymbolicLink(Ljava/nio/file/Path;)Z

    move-result v1

    if-nez v1, :cond_7

    :cond_0
    new-array v1, v0, [Ljava/nio/file/LinkOption;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/nio/file/LinkOption;

    invoke-static {p1, v1}, Ljava/nio/file/Files;->exists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-static {p1}, Ljava/nio/file/Files;->isSymbolicLink(Ljava/nio/file/Path;)Z

    move-result v1

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    if-eqz v1, :cond_2

    invoke-static {p0, p1}, Ljava/nio/file/Files;->isSameFile(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    move-result v3

    if-nez v3, :cond_7

    :cond_2
    invoke-interface {p0}, Ljava/nio/file/Path;->getFileSystem()Ljava/nio/file/FileSystem;

    move-result-object v3

    invoke-interface {p1}, Ljava/nio/file/Path;->getFileSystem()Ljava/nio/file/FileSystem;

    move-result-object v4

    invoke-static {v3, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    new-array v1, v0, [Ljava/nio/file/LinkOption;

    invoke-interface {p1, v1}, Ljava/nio/file/Path;->toRealPath([Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;

    move-result-object v1

    new-array v0, v0, [Ljava/nio/file/LinkOption;

    invoke-interface {p0, v0}, Ljava/nio/file/Path;->toRealPath([Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/nio/file/Path;->startsWith(Ljava/nio/file/Path;)Z

    move-result v0

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Ljava/nio/file/Path;->getParent()Ljava/nio/file/Path;

    move-result-object v1

    if-eqz v1, :cond_5

    new-array v3, v0, [Ljava/nio/file/LinkOption;

    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/nio/file/LinkOption;

    invoke-static {v1, v3}, Ljava/nio/file/Files;->exists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v3

    if-eqz v3, :cond_5

    new-array v3, v0, [Ljava/nio/file/LinkOption;

    invoke-interface {v1, v3}, Ljava/nio/file/Path;->toRealPath([Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;

    move-result-object v1

    new-array v3, v0, [Ljava/nio/file/LinkOption;

    invoke-interface {p0, v3}, Ljava/nio/file/Path;->toRealPath([Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/nio/file/Path;->startsWith(Ljava/nio/file/Path;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v0, v2

    :cond_5
    :goto_1
    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    new-instance p2, Ljava/nio/file/FileSystemException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "Recursively copying a directory into its subdirectory is prohibited."

    invoke-direct {p2, p0, p1, p3}, Ljava/nio/file/FileSystemException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p2

    :cond_7
    :goto_2
    new-instance v3, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠;

    invoke-direct {v3, p4, p0, p1, p2}, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۠;-><init>(LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move v2, p3

    invoke-static/range {v0 .. v5}, LYue/ۥۡۤ۟ۢ;->ۥ۟۠۠ۥ(Ljava/nio/file/Path;IZLYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)V

    return-object p1

    :cond_8
    new-instance p2, Ljava/nio/file/NoSuchFileException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "The source file doesn\'t exist."

    invoke-direct {p2, p0, p1, p3}, Ljava/nio/file/NoSuchFileException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p2
.end method

.method public static final ۥ۟۟ۢ۟(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZZ)Ljava/nio/file/Path;
    .locals 7
    .param p0    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/lang/Exception;",
            "+",
            "LYue/\u06e5\u06e1\u06e3\u06e2;",
            ">;ZZ)",
            "Ljava/nio/file/Path;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_0

    new-instance p4, LYue/ۥۡۤ۟ۡ$ۥ۟۟;

    invoke-direct {p4, p3}, LYue/ۥۡۤ۟ۡ$ۥ۟۟;-><init>(Z)V

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢ(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZLYue/ۥۣ۠ۢۤ;)Ljava/nio/file/Path;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-static/range {v0 .. v6}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢۡ(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZLYue/ۥۣ۠ۢۤ;ILjava/lang/Object;)Ljava/nio/file/Path;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟ۢ۠(LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e1;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "+",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e2;",
            ">;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/lang/Exception;",
            "+",
            "LYue/\u06e5\u06e1\u06e3\u06e2;",
            ">;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/attribute/BasicFileAttributes;",
            ")",
            "Ljava/nio/file/FileVisitResult;"
        }
    .end annotation

    :try_start_0
    sget-object p5, LYue/ۥ۟ۨۥۣ;->ۥ:LYue/ۥ۟ۨۥۣ;

    invoke-static {p1, p2, p4}, LYue/ۥۡۤ۟ۡ;->ۥۣ۟۟ۢ(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object v0

    invoke-interface {p0, p5, p4, v0}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥ۟ۧۦۢ;

    invoke-static {p0}, LYue/ۥۡۤ۟ۡ;->ۥۣ۟۟ۡ(LYue/ۥ۟ۧۦۢ;)Ljava/nio/file/FileVisitResult;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {p3, p1, p2, p4, p0}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢۤ(LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static synthetic ۥ۟۟ۢۡ(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZLYue/ۥۣ۠ۢۤ;ILjava/lang/Object;)Ljava/nio/file/Path;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    sget-object p2, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۤ۟ۡ$ۥ۟۟۟;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    new-instance p4, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۟;

    invoke-direct {p4, p3}, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۟;-><init>(Z)V

    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢ(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZLYue/ۥۣ۠ۢۤ;)Ljava/nio/file/Path;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟ۢۢ(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZZILjava/lang/Object;)Ljava/nio/file/Path;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    sget-object p2, LYue/ۥۡۤ۟ۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡۤ۟ۡ$ۥ۟;

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢ۟(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZZ)Ljava/nio/file/Path;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟ۢ(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;
    .locals 0

    invoke-static {p2, p0}, LYue/ۥۡۤ۟ۢ;->ۥ۟۠۟ۤ(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/nio/file/Path;->resolve(Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object p0

    const-string p1, "target.resolve(relativePath.pathString)"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final ۥ۟۟ۢۤ(LYue/ۥۣ۠ۢۤ;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/lang/Exception;",
            "+",
            "LYue/\u06e5\u06e1\u06e3\u06e2;",
            ">;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "Ljava/lang/Exception;",
            ")",
            "Ljava/nio/file/FileVisitResult;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, LYue/ۥۡۤ۟ۡ;->ۥۣ۟۟ۢ(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-interface {p0, p3, p1, p4}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥۣۡۢ;

    invoke-static {p0}, LYue/ۥۡۤ۟ۡ;->ۥۣ۟۟ۢ(LYue/ۥۣۡۢ;)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۥ(Ljava/nio/file/Path;)V
    .locals 2
    .param p0    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢۦ(Ljava/nio/file/Path;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    new-instance v0, Ljava/nio/file/FileSystemException;

    const-string v1, "Failed to delete one or more files. See suppressed exceptions for details."

    invoke-direct {v0, v1}, Ljava/nio/file/FileSystemException;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Exception;

    invoke-static {v0, v1}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    return-void
.end method

.method public static final ۥ۟۟ۢۦ(Ljava/nio/file/Path;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/file/Path;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۡۢۤ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LYue/ۥ۠ۡۢۤ;-><init>(IILYue/ۥ۟ۨۥۢ;)V

    invoke-interface {p0}, Ljava/nio/file/Path;->getParent()Ljava/nio/file/Path;

    move-result-object v4

    if-eqz v4, :cond_1

    :try_start_0
    invoke-static {v4}, Ljava/nio/file/Files;->newDirectoryStream(Ljava/nio/file/Path;)Ljava/nio/file/DirectoryStream;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v5, v3

    :goto_0
    if-eqz v5, :cond_1

    :try_start_1
    instance-of v6, v5, Ljava/nio/file/SecureDirectoryStream;

    if-eqz v6, :cond_0

    invoke-virtual {v0, v4}, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟ۡ(Ljava/nio/file/Path;)V

    move-object v2, v5

    check-cast v2, Ljava/nio/file/SecureDirectoryStream;

    invoke-interface {p0}, Ljava/nio/file/Path;->getFileName()Ljava/nio/file/Path;

    move-result-object v4

    const-string v6, "this.fileName"

    invoke-static {v4, v6}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4, v0}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢۨ(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;LYue/ۥ۠ۡۢۤ;)V

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    :cond_0
    move v1, v2

    :goto_1
    sget-object v2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {v5, v3}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    move v2, v1

    goto :goto_3

    :goto_2
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception v0

    invoke-static {v5, p0}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    :goto_3
    if-eqz v2, :cond_2

    invoke-static {p0, v0}, LYue/ۥۡۤ۟ۡ;->ۥۣ۟۟۟(Ljava/nio/file/Path;LYue/ۥ۠ۡۢۤ;)V

    :cond_2
    invoke-virtual {v0}, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۧ(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;LYue/ۥ۠ۡۢۤ;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/file/SecureDirectoryStream<",
            "Ljava/nio/file/Path;",
            ">;",
            "Ljava/nio/file/Path;",
            "LYue/\u06e5\u06e0\u06e1\u06e2\u06e4;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    filled-new-array {v1}, [Ljava/nio/file/LinkOption;

    move-result-object v1

    invoke-interface {p0, p1, v1}, Ljava/nio/file/SecureDirectoryStream;->newDirectoryStream(Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/SecureDirectoryStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_3

    :catch_1
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    :try_start_1
    invoke-interface {p0}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/file/Path;

    invoke-interface {v1}, Ljava/nio/file/Path;->getFileName()Ljava/nio/file/Path;

    move-result-object v1

    const-string v2, "entry.fileName"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v1, p2}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢۨ(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;LYue/ۥ۠ۡۢۤ;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p0, v0}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :goto_2
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {p0, p1}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_3
    invoke-virtual {p2, p0}, LYue/ۥ۠ۡۢۤ;->ۥ(Ljava/lang/Exception;)V

    :cond_1
    :goto_4
    return-void
.end method

.method public static final ۥ۟۟ۢۨ(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;LYue/ۥ۠ۡۢۤ;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/file/SecureDirectoryStream<",
            "Ljava/nio/file/Path;",
            ">;",
            "Ljava/nio/file/Path;",
            "LYue/\u06e5\u06e0\u06e1\u06e2\u06e4;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2, p1}, LYue/ۥ۠ۡۢۤ;->ۥ۟(Ljava/nio/file/Path;)V

    :try_start_0
    sget-object v0, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    filled-new-array {v0}, [Ljava/nio/file/LinkOption;

    move-result-object v0

    invoke-static {p0, p1, v0}, LYue/ۥۡۤ۟ۡ;->ۥۣ۟۟۠(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟۠()I

    move-result v0

    invoke-static {p0, p1, p2}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢۧ(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;LYue/ۥ۠ۡۢۤ;)V

    invoke-virtual {p2}, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟۠()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v1, :cond_1

    :try_start_1
    invoke-interface {p0, p1}, Ljava/nio/file/SecureDirectoryStream;->deleteDirectory(Ljava/lang/Object;)V

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Ljava/nio/file/SecureDirectoryStream;->deleteFile(Ljava/lang/Object;)V

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :goto_0
    invoke-virtual {p2, p0}, LYue/ۥ۠ۡۢۤ;->ۥ(Ljava/lang/Exception;)V

    :catch_1
    :cond_1
    :goto_1
    invoke-virtual {p2, p1}, LYue/ۥ۠ۡۢۤ;->ۥ۟۟(Ljava/nio/file/Path;)V

    return-void
.end method

.method public static final ۥۣ۟۟(Ljava/nio/file/Path;LYue/ۥ۠ۡۢۤ;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Ljava/nio/file/Files;->newDirectoryStream(Ljava/nio/file/Path;)Ljava/nio/file/DirectoryStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_3

    :catch_1
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    :try_start_1
    invoke-interface {p0}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/nio/file/Path;

    const-string v3, "entry"

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p1}, LYue/ۥۡۤ۟ۡ;->ۥۣ۟۟۟(Ljava/nio/file/Path;LYue/ۥ۠ۡۢۤ;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p0, v0}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :goto_2
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-static {p0, v0}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_3
    invoke-virtual {p1, p0}, LYue/ۥ۠ۡۢۤ;->ۥ(Ljava/lang/Exception;)V

    :cond_1
    :goto_4
    return-void
.end method

.method public static final ۥۣ۟۟۟(Ljava/nio/file/Path;LYue/ۥ۠ۡۢۤ;)V
    .locals 2

    :try_start_0
    sget-object v0, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    filled-new-array {v0}, [Ljava/nio/file/LinkOption;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/file/LinkOption;

    invoke-static {p0, v0}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟۠()I

    move-result v0

    invoke-static {p0, p1}, LYue/ۥۡۤ۟ۡ;->ۥۣ۟۟(Ljava/nio/file/Path;LYue/ۥ۠ۡۢۤ;)V

    invoke-virtual {p1}, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟۠()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-static {p0}, Ljava/nio/file/Files;->deleteIfExists(Ljava/nio/file/Path;)Z

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/nio/file/Files;->deleteIfExists(Ljava/nio/file/Path;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    invoke-virtual {p1, p0}, LYue/ۥ۠ۡۢۤ;->ۥ(Ljava/lang/Exception;)V

    :cond_1
    :goto_1
    return-void
.end method

.method public static final varargs ۥۣ۟۟۠(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/file/SecureDirectoryStream<",
            "Ljava/nio/file/Path;",
            ">;",
            "Ljava/nio/file/Path;",
            "[",
            "Ljava/nio/file/LinkOption;",
            ")Z"
        }
    .end annotation

    :try_start_0
    const-class v0, Ljava/nio/file/attribute/BasicFileAttributeView;

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/nio/file/LinkOption;

    invoke-interface {p0, p1, v0, p2}, Ljava/nio/file/SecureDirectoryStream;->getFileAttributeView(Ljava/lang/Object;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;

    move-result-object p0

    check-cast p0, Ljava/nio/file/attribute/BasicFileAttributeView;

    invoke-interface {p0}, Ljava/nio/file/attribute/BasicFileAttributeView;->readAttributes()Ljava/nio/file/attribute/BasicFileAttributes;

    move-result-object p0

    invoke-interface {p0}, Ljava/nio/file/attribute/BasicFileAttributes;->isDirectory()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static final ۥۣ۟۟ۡ(LYue/ۥ۟ۧۦۢ;)Ljava/nio/file/FileVisitResult;
    .locals 1
    .annotation build LYue/ۥ۠ۡۥ;
    .end annotation

    sget-object v0, LYue/ۥۡۤ۟ۡ$ۥ;->ۥ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Ljava/nio/file/FileVisitResult;->SKIP_SUBTREE:Ljava/nio/file/FileVisitResult;

    goto :goto_0

    :cond_0
    new-instance p0, LYue/ۥۣۣۡۢ;

    invoke-direct {p0}, LYue/ۥۣۣۡۢ;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ljava/nio/file/FileVisitResult;->TERMINATE:Ljava/nio/file/FileVisitResult;

    goto :goto_0

    :cond_2
    sget-object p0, Ljava/nio/file/FileVisitResult;->CONTINUE:Ljava/nio/file/FileVisitResult;

    :goto_0
    return-object p0
.end method

.method public static final ۥۣ۟۟ۢ(LYue/ۥۣۡۢ;)Ljava/nio/file/FileVisitResult;
    .locals 1
    .annotation build LYue/ۥ۠ۡۥ;
    .end annotation

    sget-object v0, LYue/ۥۡۤ۟ۡ$ۥ;->ۥ۟:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Ljava/nio/file/FileVisitResult;->SKIP_SUBTREE:Ljava/nio/file/FileVisitResult;

    goto :goto_0

    :cond_0
    new-instance p0, LYue/ۥۣۣۡۢ;

    invoke-direct {p0}, LYue/ۥۣۣۡۢ;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ljava/nio/file/FileVisitResult;->TERMINATE:Ljava/nio/file/FileVisitResult;

    :goto_0
    return-object p0
.end method

.method public static final ۥۣۣ۟۟(LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TR;>;)TR;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
