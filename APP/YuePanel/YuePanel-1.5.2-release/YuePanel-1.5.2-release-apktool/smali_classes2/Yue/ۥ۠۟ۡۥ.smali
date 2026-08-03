.class public final LYue/ۥ۠۟ۡۥ;
.super Ljava/nio/file/SimpleFileVisitor;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/nio/file/SimpleFileVisitor<",
        "Ljava/nio/file/Path;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"
.end annotation


# instance fields
.field public final ۥ:Z

.field public ۥ۟:LYue/ۥۣۡۨۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟:LYue/ۥ۟ۡۧۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e1\u06e7\u06e1<",
            "LYue/\u06e5\u06e1\u06e3\u06e8\u06e2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/nio/file/SimpleFileVisitor;-><init>()V

    iput-boolean p1, p0, LYue/ۥ۠۟ۡۥ;->ۥ:Z

    new-instance p1, LYue/ۥ۟ۡۧۡ;

    invoke-direct {p1}, LYue/ۥ۟ۡۧۡ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۟ۡۥ;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    return-void
.end method


# virtual methods
.method public bridge synthetic preVisitDirectory(Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 0

    check-cast p1, Ljava/nio/file/Path;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۟ۡۥ;->ۥ۟(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic visitFile(Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 0

    check-cast p1, Ljava/nio/file/Path;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۟ۡۥ;->ۥ۟۟۟(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠۟ۡۥ;->ۥ:Z

    return v0
.end method

.method public ۥ۟(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 3
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/nio/file/attribute/BasicFileAttributes;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣۡۨۢ;

    invoke-interface {p2}, Ljava/nio/file/attribute/BasicFileAttributes;->fileKey()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LYue/ۥ۠۟ۡۥ;->ۥ۟:LYue/ۥۣۡۨۢ;

    invoke-direct {v0, p1, v1, v2}, LYue/ۥۣۡۨۢ;-><init>(Ljava/nio/file/Path;Ljava/lang/Object;LYue/ۥۣۡۨۢ;)V

    iget-object v1, p0, LYue/ۥ۠۟ۡۥ;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    invoke-virtual {v1, v0}, LYue/ۥ۟ۡۧۡ;->add(Ljava/lang/Object;)Z

    invoke-super {p0, p1, p2}, Ljava/nio/file/SimpleFileVisitor;->preVisitDirectory(Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    const-string p2, "super.preVisitDirectory(dir, attrs)"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ۥ۟۟(LYue/ۥۣۡۨۢ;)Ljava/util/List;
    .locals 2
    .param p1    # LYue/ۥۣۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e8\u06e2;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e3\u06e8\u06e2;",
            ">;"
        }
    .end annotation

    const-string v0, "directoryNode"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠۟ۡۥ;->ۥ۟:LYue/ۥۣۡۨۢ;

    invoke-virtual {p1}, LYue/ۥۣۡۨۢ;->ۥ۟۟۟()Ljava/nio/file/Path;

    move-result-object p1

    sget-object v0, LYue/ۥ۠ۧۡۦ;->ۥ:LYue/ۥ۠ۧۡۦ;

    iget-boolean v1, p0, LYue/ۥ۠۟ۡۥ;->ۥ:Z

    invoke-virtual {v0, v1}, LYue/ۥ۠ۧۡۦ;->ۥ۟(Z)Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, p0}, Ljava/nio/file/Files;->walkFileTree(Ljava/nio/file/Path;Ljava/util/Set;ILjava/nio/file/FileVisitor;)Ljava/nio/file/Path;

    iget-object p1, p0, LYue/ۥ۠۟ۡۥ;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    invoke-virtual {p1}, LYue/ۥ۟ۡۧۡ;->removeFirst()Ljava/lang/Object;

    iget-object p1, p0, LYue/ۥ۠۟ۡۥ;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    new-instance v0, LYue/ۥ۟ۡۧۡ;

    invoke-direct {v0}, LYue/ۥ۟ۡۧۡ;-><init>()V

    iput-object v0, p0, LYue/ۥ۠۟ۡۥ;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    return-object p1
.end method

.method public ۥ۟۟۟(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 3
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/nio/file/attribute/BasicFileAttributes;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣۡۨۢ;

    const/4 v1, 0x0

    iget-object v2, p0, LYue/ۥ۠۟ۡۥ;->ۥ۟:LYue/ۥۣۡۨۢ;

    invoke-direct {v0, p1, v1, v2}, LYue/ۥۣۡۨۢ;-><init>(Ljava/nio/file/Path;Ljava/lang/Object;LYue/ۥۣۡۨۢ;)V

    iget-object v1, p0, LYue/ۥ۠۟ۡۥ;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    invoke-virtual {v1, v0}, LYue/ۥ۟ۡۧۡ;->add(Ljava/lang/Object;)Z

    invoke-super {p0, p1, p2}, Ljava/nio/file/SimpleFileVisitor;->visitFile(Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    const-string p2, "super.visitFile(file, attrs)"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
