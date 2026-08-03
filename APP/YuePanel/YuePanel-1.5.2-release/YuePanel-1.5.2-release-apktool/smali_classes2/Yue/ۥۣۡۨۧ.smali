.class public final LYue/ۥۣۡۨۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation build LYue/ۥ۠ۡۥ;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "Ljava/nio/file/Path;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/nio/file/Path;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:[LYue/ۥۡۤ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/nio/file/Path;[LYue/ۥۡۤ۟;)V
    .locals 1
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [LYue/ۥۡۤ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "start"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۨۧ;->ۥ:Ljava/nio/file/Path;

    iput-object p2, p0, LYue/ۥۣۡۨۧ;->ۥ۟:[LYue/ۥۡۤ۟;

    return-void
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥۣۡۨۧ;)Z
    .locals 0

    invoke-virtual {p0}, LYue/ۥۣۡۨۧ;->ۥۣ۟۟۟()Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥۣۡۨۧ;)Z
    .locals 0

    invoke-virtual {p0}, LYue/ۥۣۡۨۧ;->ۥ۟۟۟ۤ()Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۟۟۟(LYue/ۥۣۡۨۧ;)[Ljava/nio/file/LinkOption;
    .locals 0

    invoke-virtual {p0}, LYue/ۥۣۡۨۧ;->ۥ۟۟۟ۥ()[Ljava/nio/file/LinkOption;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟۠(LYue/ۥۣۡۨۧ;)Ljava/nio/file/Path;
    .locals 0

    iget-object p0, p0, LYue/ۥۣۡۨۧ;->ۥ:Ljava/nio/file/Path;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/nio/file/Path;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣۡۨۧ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣۡۨۧ;->ۥ۟۟۟ۡ()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣۡۨۧ;->ۥ۟۟۟ۢ()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/nio/file/Path;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۡۨۧ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥۣۡۨۧ$ۥ;-><init>(LYue/ۥۣۡۨۧ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۡۨۢۢ;->ۥ(LYue/ۥۣ۠ۢۢ;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/nio/file/Path;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۡۨۧ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥۣۡۨۧ$ۥ۟;-><init>(LYue/ۥۣۡۨۧ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۡۨۢۢ;->ۥ(LYue/ۥۣ۠ۢۢ;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ۥۣ۟۟۟()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣۡۨۧ;->ۥ۟:[LYue/ۥۡۤ۟;

    sget-object v1, LYue/ۥۡۤ۟;->ۥ۟۟۠ۥ:LYue/ۥۡۤ۟;

    invoke-static {v0, v1}, LYue/ۥ۟ۢ۟۠;->ۥۣ۟ۢۤ([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟ۤ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣۡۨۧ;->ۥ۟:[LYue/ۥۡۤ۟;

    sget-object v1, LYue/ۥۡۤ۟;->ۥۣ۟۟۠:LYue/ۥۡۤ۟;

    invoke-static {v0, v1}, LYue/ۥ۟ۢ۟۠;->ۥۣ۟ۢۤ([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟ۥ()[Ljava/nio/file/LinkOption;
    .locals 2

    sget-object v0, LYue/ۥ۠ۧۡۦ;->ۥ:LYue/ۥ۠ۧۡۦ;

    invoke-virtual {p0}, LYue/ۥۣۡۨۧ;->ۥۣ۟۟۟()Z

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥ۠ۧۡۦ;->ۥ(Z)[Ljava/nio/file/LinkOption;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۦ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣۡۨۧ;->ۥ۟:[LYue/ۥۡۤ۟;

    sget-object v1, LYue/ۥۡۤ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۤ۟;

    invoke-static {v0, v1}, LYue/ۥ۟ۢ۟۠;->ۥۣ۟ۢۤ([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟ۧ(LYue/ۥۡۨۢ۠;LYue/ۥۣۡۨۢ;LYue/ۥ۠۟ۡۥ;LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
            "-",
            "Ljava/nio/file/Path;",
            ">;",
            "LYue/\u06e5\u06e1\u06e3\u06e8\u06e2;",
            "LYue/\u06e5\u06e0\u06df\u06e1\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e3\u06e8\u06e2;",
            ">;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p2}, LYue/ۥۣۡۨۢ;->ۥ۟۟۟()Ljava/nio/file/Path;

    move-result-object v0

    invoke-static {p0}, LYue/ۥۣۡۨۧ;->ۥ۟۟۟۟(LYue/ۥۣۡۨۧ;)[Ljava/nio/file/LinkOption;

    move-result-object v1

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/nio/file/LinkOption;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/nio/file/LinkOption;

    invoke-static {v0, v1}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    invoke-static {p2}, LYue/ۥۣۡۨۨ;->ۥ(LYue/ۥۣۡۨۢ;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p0}, LYue/ۥۣۡۨۧ;->ۥ۟۟۟(LYue/ۥۣۡۨۧ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-virtual {p1, v0, p5}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    :cond_0
    invoke-static {p0}, LYue/ۥۣۡۨۧ;->ۥ۟۟۟۟(LYue/ۥۣۡۨۧ;)[Ljava/nio/file/LinkOption;

    move-result-object p1

    array-length p5, p1

    invoke-static {p1, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/nio/file/LinkOption;

    array-length p5, p1

    invoke-static {p1, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/nio/file/LinkOption;

    invoke-static {v0, p1}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p3, p2}, LYue/ۥ۠۟ۡۥ;->ۥ۟۟(LYue/ۥۣۡۨۢ;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p4, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/nio/file/FileSystemLoopException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/nio/file/FileSystemLoopException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object p2, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    filled-new-array {p2}, [Ljava/nio/file/LinkOption;

    move-result-object p2

    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/nio/file/LinkOption;

    invoke-static {v0, p2}, Ljava/nio/file/Files;->exists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {v2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-virtual {p1, v0, p5}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_3
    :goto_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method
