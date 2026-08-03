.class public abstract LYue/ۥ۠ۢۦۧ;
.super LYue/ۥ۠ۡۨۤ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡۨۤ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥ۠ۡۨۤ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۡۦۣ;->ۥ۟۟۟(Ljava/lang/Class;)LYue/ۥ۠ۦۢۢ;

    move-result-object v1

    invoke-interface {v1}, LYue/ۥ۠ۦۢۢ;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;
    .locals 2
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

    const-string v1, "appendingSink"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟۟(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V
    .locals 3
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

    const-string v1, "target"

    invoke-static {p2, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "atomicMove"

    invoke-virtual {p0, p1, v2, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    invoke-virtual {p0, p2, v2, v1}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p2

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟ۡ(LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V

    return-void
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥۣۡۧۧ;)LYue/ۥۣۡۧۧ;
    .locals 2
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

    const-string v1, "canonicalize"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟ۢ(LYue/ۥۣۡۧۧ;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, LYue/ۥ۠ۢۦۧ;->ۥۣ۟۟ۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥۣۡۧۧ;Z)V
    .locals 2
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

    const-string v1, "createDirectory"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۟ۨ(LYue/ۥۣۡۧۧ;Z)V

    return-void
.end method

.method public ۥ۟۟۠۟(LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V
    .locals 3
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

    const-string v1, "target"

    invoke-static {p2, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "createSymlink"

    invoke-virtual {p0, p1, v2, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    invoke-virtual {p0, p2, v2, v1}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p2

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠۟(LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥۣۡۧۧ;Z)V
    .locals 2
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

    const-string v1, "delete"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۡ(LYue/ۥۣۡۧۧ;Z)V

    return-void
.end method

.method public ۥ۟۟۠ۨ(LYue/ۥۣۡۧۧ;)Ljava/util/List;
    .locals 3
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

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "list"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۨ(LYue/ۥۣۡۧۧ;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۣۡۧۧ;

    invoke-virtual {p0, v2, v1}, LYue/ۥ۠ۢۦۧ;->ۥۣ۟۟ۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, LYue/ۥ۟ۥۡۧ;->ۥ۟۟ۤۡ(Ljava/util/List;)V

    return-object v0
.end method

.method public ۥ۟۟ۡ(LYue/ۥۣۡۧۧ;)Ljava/util/List;
    .locals 3
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

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "listOrNull"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡ(LYue/ۥۣۡۧۧ;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۣۡۧۧ;

    invoke-virtual {p0, v2, v1}, LYue/ۥ۠ۢۦۧ;->ۥۣ۟۟ۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, LYue/ۥ۟ۥۡۧ;->ۥ۟۟ۤۡ(Ljava/util/List;)V

    return-object v0
.end method

.method public ۥ۟۟ۡ۠(LYue/ۥۣۡۧۧ;Z)LYue/ۥۡۨۢ;
    .locals 2
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

    const-string v1, "listRecursively"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡ۠(LYue/ۥۣۡۧۧ;Z)LYue/ۥۡۨۢ;

    move-result-object p1

    new-instance p2, LYue/ۥ۠ۢۦۧ$ۥ;

    invoke-direct {p2, p0}, LYue/ۥ۠ۢۦۧ$ۥ;-><init>(LYue/ۥ۠ۢۦۧ;)V

    invoke-static {p1, p2}, LYue/ۥۡۨۢۦ;->ۥ۟۠۟(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟ۡ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;
    .locals 13
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

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "metadataOrNull"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۡۨۤ;->ۥۣ۟۟ۡ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v2}, LYue/ۥ۠ۡۨ;->ۥۣ۟۟۟()LYue/ۥۣۡۧۧ;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {v2}, LYue/ۥ۠ۡۨ;->ۥۣ۟۟۟()LYue/ۥۣۡۧۧ;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, LYue/ۥ۠ۢۦۧ;->ۥۣ۟۟ۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object v5

    const/16 v11, 0xfb

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v12}, LYue/ۥ۠ۡۨ;->ۥ۟(LYue/ۥ۠ۡۨ;ZZLYue/ۥۣۡۧۧ;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;ILjava/lang/Object;)LYue/ۥ۠ۡۨ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۤ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۧۧ;
    .locals 2
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

    const-string v1, "openReadOnly"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡۤ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۦ(LYue/ۥۣۡۧۧ;ZZ)LYue/ۥ۠ۡۧۧ;
    .locals 2
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

    const-string v1, "openReadWrite"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۡۦ(LYue/ۥۣۡۧۧ;ZZ)LYue/ۥ۠ۡۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢ(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;
    .locals 2
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

    const-string v1, "sink"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۢ(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢ۠(LYue/ۥۣۡۧۧ;)LYue/ۥۣۢ۟ۦ;
    .locals 2
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

    const-string v1, "source"

    invoke-virtual {p0, p1, v1, v0}, LYue/ۥ۠ۢۦۧ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟ۢ۠(LYue/ۥۣۡۧۧ;)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟ۢۡ()LYue/ۥ۠ۡۨۤ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "delegate"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۦۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۤ;

    return-object v0
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۧۧ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functionName"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "parameterName"

    invoke-static {p3, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public ۥۣ۟۟ۢ(LYue/ۥۣۡۧۧ;Ljava/lang/String;)LYue/ۥۣۡۧۧ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functionName"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
