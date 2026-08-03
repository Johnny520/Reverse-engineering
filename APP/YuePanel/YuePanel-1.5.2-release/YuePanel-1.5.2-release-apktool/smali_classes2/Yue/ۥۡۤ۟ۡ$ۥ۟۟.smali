.class public final LYue/ۥۡۤ۟ۡ$ۥ۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢ۟(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZZ)Ljava/nio/file/Path;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e1;",
        "Ljava/nio/file/Path;",
        "Ljava/nio/file/Path;",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e2;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟;->ۥۣ۟۟۠:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(LYue/ۥ۟ۧۦۡ;Ljava/nio/file/Path;Ljava/nio/file/Path;)LYue/ۥ۟ۧۦۢ;
    .locals 3
    .param p1    # LYue/ۥ۟ۧۦۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "$this$copyToRecursively"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "src"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "dst"

    invoke-static {p3, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LYue/ۥ۠ۧۡۦ;->ۥ:LYue/ۥ۠ۧۡۦ;

    iget-boolean v0, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟;->ۥۣ۟۟۠:Z

    invoke-virtual {p1, v0}, LYue/ۥ۠ۧۡۦ;->ۥ(Z)[Ljava/nio/file/LinkOption;

    move-result-object p1

    sget-object v0, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    filled-new-array {v0}, [Ljava/nio/file/LinkOption;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/file/LinkOption;

    invoke-static {p3, v0}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v0

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/nio/file/LinkOption;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/nio/file/LinkOption;

    invoke-static {p2, v1}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_2

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {p3}, LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢۥ(Ljava/nio/file/Path;)V

    :cond_1
    new-instance v0, LYue/ۥۢ۟ۧ۠;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, LYue/ۥۢ۟ۧ۠;-><init>(I)V

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۧ۠;->ۥ۟(Ljava/lang/Object;)V

    sget-object p1, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۧ۠;->ۥ(Ljava/lang/Object;)V

    invoke-virtual {v0}, LYue/ۥۢ۟ۧ۠;->ۥ۟۟()I

    move-result p1

    new-array p1, p1, [Ljava/nio/file/CopyOption;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۧ۠;->ۥ۟۟۟([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/nio/file/CopyOption;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/nio/file/CopyOption;

    invoke-static {p2, p3, p1}, Ljava/nio/file/Files;->copy(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    move-result-object p1

    const-string p2, "copy(this, target, *options)"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    sget-object p1, LYue/ۥ۟ۧۦۢ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۢ;

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۟ۧۦۡ;

    check-cast p2, Ljava/nio/file/Path;

    check-cast p3, Ljava/nio/file/Path;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۡۤ۟ۡ$ۥ۟۟;->ۥ۟۟(LYue/ۥ۟ۧۦۡ;Ljava/nio/file/Path;Ljava/nio/file/Path;)LYue/ۥ۟ۧۦۢ;

    move-result-object p1

    return-object p1
.end method
