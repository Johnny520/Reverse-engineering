.class public final enum LYue/ۥۢۡۧۥ$ۥ۟۟ۢۢ;
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

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠ۥ()C

    move-result v0

    if-eqz v0, :cond_2

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    iget-object p1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۨ:LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    const/4 v0, 0x2

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    invoke-virtual {p2, v0}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠ۡ([C)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡ۠(Ljava/lang/String;)LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۤ(LYue/ۥۢۡۧۥ;)V

    invoke-virtual {p1}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۡ()V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_1
    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۤۦ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۥ(LYue/ۥۢۡۧۥ;)V

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ()V

    iget-object p1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۨ:LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡ۟(C)LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    :goto_0
    return-void

    :array_0
    .array-data 2
        0x2ds
        0x0s
    .end array-data
.end method
