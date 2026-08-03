.class public final LYue/ۥ۟ۧۦۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۧۦۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public static ۥ(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;
    .locals 1
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LYue/ۥ۟ۧۦۥ$ۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ$ۥ$ۥ;

    invoke-interface {p1, p0, v0}, LYue/ۥ۟ۧۦۥ;->fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥ۟ۧۦۥ;

    :goto_0
    return-object p0
.end method
