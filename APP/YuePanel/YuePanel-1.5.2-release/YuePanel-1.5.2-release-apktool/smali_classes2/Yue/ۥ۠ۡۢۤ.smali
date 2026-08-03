.class public final LYue/ۥ۠ۡۢۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:I

.field public ۥ۟:I

.field public final ۥ۟۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:Ljava/nio/file/Path;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    invoke-direct {p0, v2, v0, v1}, LYue/ۥ۠ۡۢۤ;-><init>(IILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥ۠ۡۢۤ;->ۥ:I

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x40

    .line 4
    :cond_0
    invoke-direct {p0, p1}, LYue/ۥ۠ۡۢۤ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/lang/Exception;)V
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "exception"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟:I

    iget-object v0, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, LYue/ۥ۠ۡۢۤ;->ۥ:I

    if-ge v0, v1, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟:Ljava/nio/file/Path;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/nio/file/FileSystemException;

    iget-object v1, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟:Ljava/nio/file/Path;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/nio/file/FileSystemException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type java.nio.file.FileSystemException"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/nio/file/FileSystemException;

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final ۥ۟(Ljava/nio/file/Path;)V
    .locals 1
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟:Ljava/nio/file/Path;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->resolve(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟:Ljava/nio/file/Path;

    return-void
.end method

.method public final ۥ۟۟(Ljava/nio/file/Path;)V
    .locals 2
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟:Ljava/nio/file/Path;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/nio/file/Path;->getFileName()Ljava/nio/file/Path;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟:Ljava/nio/file/Path;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/nio/file/Path;->getParent()Ljava/nio/file/Path;

    move-result-object v1

    :cond_1
    iput-object v1, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟:Ljava/nio/file/Path;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Ljava/nio/file/Path;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟:Ljava/nio/file/Path;

    return-object v0
.end method

.method public final ۥ۟۟۟۠()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟:I

    return v0
.end method

.method public final ۥ۟۟۟ۡ(Ljava/nio/file/Path;)V
    .locals 0
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۠ۡۢۤ;->ۥ۟۟۟:Ljava/nio/file/Path;

    return-void
.end method
