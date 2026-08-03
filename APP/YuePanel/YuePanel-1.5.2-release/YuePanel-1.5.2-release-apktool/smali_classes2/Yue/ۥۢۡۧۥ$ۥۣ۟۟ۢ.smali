.class public final enum LYue/ۥۢۡۧۥ$ۥۣ۟۟ۢ;
.super LYue/ۥۢۡۧۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡۧۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LYue/ۥۢۡۧۥ;-><init>(Ljava/lang/String;ILYue/ۥۢۡۧۥ$ۥ۟۟۟ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۧ(LYue/ۥۢۡۧۤ;LYue/ۥۣ۟ۤۤ;)V
    .locals 2

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟ۡ()C

    move-result p2

    const/16 v0, 0x2d

    if-eqz p2, :cond_2

    if-eq p2, v0, :cond_1

    const v1, 0xffff

    if-eq p2, v1, :cond_0

    iget-object v1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۨ:LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    invoke-virtual {v1, v0}, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡ۟(C)LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0, p2}, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡ۟(C)LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۤۥ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۤ(LYue/ۥۢۡۧۥ;)V

    invoke-virtual {p1}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۡ()V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_1
    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۤۧ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۥ(LYue/ۥۢۡۧۥ;)V

    iget-object p2, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۨ:LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    invoke-virtual {p2, v0}, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡ۟(C)LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    move-result-object p2

    const v0, 0xfffd

    invoke-virtual {p2, v0}, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡ۟(C)LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۤۥ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    :goto_0
    return-void
.end method
