.class public final LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۤ۟ۡ;->ۥ۟۟ۢۡ(Ljava/nio/file/Path;Ljava/nio/file/Path;LYue/ۥۣ۠ۢۤ;ZLYue/ۥۣ۠ۢۤ;ILjava/lang/Object;)Ljava/nio/file/Path;
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

    iput-boolean p1, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۟;->ۥۣ۟۟۠:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(LYue/ۥ۟ۧۦۡ;Ljava/nio/file/Path;Ljava/nio/file/Path;)LYue/ۥ۟ۧۦۢ;
    .locals 1
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

    const-string v0, "$this$null"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "src"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dst"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۟;->ۥۣ۟۟۠:Z

    invoke-interface {p1, p2, p3, v0}, LYue/ۥ۟ۧۦۡ;->ۥ(Ljava/nio/file/Path;Ljava/nio/file/Path;Z)LYue/ۥ۟ۧۦۢ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۟ۧۦۡ;

    check-cast p2, Ljava/nio/file/Path;

    check-cast p3, Ljava/nio/file/Path;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۡۤ۟ۡ$ۥ۟۟۟۟;->ۥ۟۟(LYue/ۥ۟ۧۦۡ;Ljava/nio/file/Path;Ljava/nio/file/Path;)LYue/ۥ۟ۧۦۢ;

    move-result-object p1

    return-object p1
.end method
