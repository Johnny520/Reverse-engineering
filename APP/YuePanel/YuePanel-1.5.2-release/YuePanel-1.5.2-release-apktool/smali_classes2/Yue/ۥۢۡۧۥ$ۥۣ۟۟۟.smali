.class public final enum LYue/ۥۢۡۧۥ$ۥۣ۟۟۟;
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

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠ۦ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۤ(LYue/ۥۢۡۧۥ;)V

    iget-object p2, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۧ:LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;

    iput-boolean v1, p2, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟ۡ۠:Z

    invoke-virtual {p1}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۢ()V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    return-void

    :cond_0
    const/4 v0, 0x5

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    invoke-virtual {p2, v0}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۡۦ([C)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ()V

    goto :goto_0

    :cond_1
    const/16 v0, 0x3e

    invoke-virtual {p2, v0}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۡۤ(C)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۢ()V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_2
    const-string v0, "PUBLIC"

    invoke-virtual {p2, v0}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۡ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object p2, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۧ:LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;

    iput-object v0, p2, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۥۢ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_3
    const-string v0, "SYSTEM"

    invoke-virtual {p2, v0}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۡ(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۧ:LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;

    iput-object v0, p2, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۥۨ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۥ(LYue/ۥۢۡۧۥ;)V

    iget-object p2, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۧ:LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;

    iput-boolean v1, p2, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟ۡ۠:Z

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۦۢ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ(LYue/ۥۢۡۧۥ;)V

    :goto_0
    return-void

    nop

    :array_0
    .array-data 2
        0x9s
        0xas
        0xds
        0xcs
        0x20s
    .end array-data
.end method
