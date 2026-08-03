.class public final LYue/ۥ۠ۢ۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۢ۟۟;


# annotations
.annotation build LYue/ۥ۠ۡۥ;
.end annotation


# instance fields
.field public ۥ:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/attribute/BasicFileAttributes;",
            "+",
            "Ljava/nio/file/FileVisitResult;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/attribute/BasicFileAttributes;",
            "+",
            "Ljava/nio/file/FileVisitResult;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/io/IOException;",
            "+",
            "Ljava/nio/file/FileVisitResult;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/io/IOException;",
            "+",
            "Ljava/nio/file/FileVisitResult;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۟:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۣ۠ۢۢ;)V
    .locals 2
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/attribute/BasicFileAttributes;",
            "+",
            "Ljava/nio/file/FileVisitResult;",
            ">;)V"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟۠()V

    iget-object v0, p0, LYue/ۥ۠ۢ۟۠;->ۥ:LYue/ۥۣ۠ۢۢ;

    const-string v1, "onPreVisitDirectory"

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۢ۟۠;->ۥ:LYue/ۥۣ۠ۢۢ;

    return-void
.end method

.method public ۥ۟(LYue/ۥۣ۠ۢۢ;)V
    .locals 2
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/io/IOException;",
            "+",
            "Ljava/nio/file/FileVisitResult;",
            ">;)V"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟۠()V

    iget-object v0, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟:LYue/ۥۣ۠ۢۢ;

    const-string v1, "onPostVisitDirectory"

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟:LYue/ۥۣ۠ۢۢ;

    return-void
.end method

.method public ۥ۟۟(LYue/ۥۣ۠ۢۢ;)V
    .locals 2
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/attribute/BasicFileAttributes;",
            "+",
            "Ljava/nio/file/FileVisitResult;",
            ">;)V"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟۠()V

    iget-object v0, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟:LYue/ۥۣ۠ۢۢ;

    const-string v1, "onVisitFile"

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟:LYue/ۥۣ۠ۢۢ;

    return-void
.end method

.method public ۥ۟۟۟(LYue/ۥۣ۠ۢۢ;)V
    .locals 2
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/io/IOException;",
            "+",
            "Ljava/nio/file/FileVisitResult;",
            ">;)V"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟۠()V

    iget-object v0, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟۟:LYue/ۥۣ۠ۢۢ;

    const-string v1, "onVisitFileFailed"

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟۟:LYue/ۥۣ۠ۢۢ;

    return-void
.end method

.method public final ۥ۟۟۟۟()Ljava/nio/file/FileVisitor;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/nio/file/FileVisitor<",
            "Ljava/nio/file/Path;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟۠()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟۟:Z

    new-instance v0, LYue/ۥ۠ۢ۟ۡ;

    iget-object v1, p0, LYue/ۥ۠ۢ۟۠;->ۥ:LYue/ۥۣ۠ۢۢ;

    iget-object v2, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟:LYue/ۥۣ۠ۢۢ;

    iget-object v3, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟۟:LYue/ۥۣ۠ۢۢ;

    iget-object v4, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟:LYue/ۥۣ۠ۢۢ;

    invoke-direct {v0, v1, v2, v3, v4}, LYue/ۥ۠ۢ۟ۡ;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۢۢ;)V

    return-object v0
.end method

.method public final ۥ۟۟۟۠()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥ۠ۢ۟۠;->ۥ۟۟۟۟:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This builder was already built"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " was already defined"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
