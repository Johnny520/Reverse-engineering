.class public final enum LYue/ۥۢۡۧۥ$ۥ۟۟ۢ;
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
    .locals 3

    iget-object v0, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۨ:LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    const/16 v1, 0x3e

    invoke-virtual {p2, v1}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠۟(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡ۠(Ljava/lang/String;)LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠ۥ()C

    move-result v0

    if-eq v0, v1, :cond_0

    const v1, 0xffff

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟ۡ()C

    invoke-virtual {p1}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۡ()V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    :cond_1
    return-void
.end method
