.class public final enum LYue/ۥۢۡۧۥ$ۥۣ۟۟;
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
    .locals 1

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۢ۠()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟ۦ()Ljava/lang/String;

    move-result-object p2

    iget-object p1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۧ:LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;

    iget-object p1, p1, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟ۡ()C

    move-result p2

    if-eqz p2, :cond_4

    const/16 v0, 0x20

    if-eq p2, v0, :cond_3

    const/16 v0, 0x3e

    if-eq p2, v0, :cond_2

    const v0, 0xffff

    if-eq p2, v0, :cond_1

    const/16 v0, 0x9

    if-eq p2, v0, :cond_3

    const/16 v0, 0xa

    if-eq p2, v0, :cond_3

    const/16 v0, 0xc

    if-eq p2, v0, :cond_3

    const/16 v0, 0xd

    if-eq p2, v0, :cond_3

    iget-object p1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۧ:LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;

    iget-object p1, p1, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۤ(LYue/ۥۢۡۧۥ;)V

    iget-object p2, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۧ:LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;

    const/4 v0, 0x1

    iput-boolean v0, p2, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟ۡ۠:Z

    invoke-virtual {p1}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۢ()V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۢ()V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_3
    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۥۡ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۥ(LYue/ۥۢۡۧۥ;)V

    iget-object p1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۧ:LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;

    iget-object p1, p1, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method
