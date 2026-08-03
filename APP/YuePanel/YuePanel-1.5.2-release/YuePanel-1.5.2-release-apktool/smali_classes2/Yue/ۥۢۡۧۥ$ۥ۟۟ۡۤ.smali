.class public final enum LYue/ۥۢۡۧۥ$ۥ۟۟ۡۤ;
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
    .locals 5

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟ۢ(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    iget-object v3, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result v4

    invoke-virtual {v3, v2, v0, v4}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۢ(Ljava/lang/String;II)V

    goto :goto_0

    :cond_0
    iget-object v0, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۨ()V

    :goto_0
    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result v0

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟ۡ()C

    move-result v2

    if-eqz v2, :cond_5

    const v3, 0xffff

    if-eq v2, v3, :cond_4

    const/16 v3, 0x27

    const/16 v4, 0x26

    if-eq v2, v4, :cond_2

    if-eq v2, v3, :cond_1

    iget-object p1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result p2

    invoke-virtual {p1, v2, v0, p2}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ(CII)V

    goto :goto_1

    :cond_1
    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۤ۟:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_1

    :cond_2
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, LYue/ۥۢۡۧۤ;->ۥ۟۟۟۟(Ljava/lang/Character;Z)[I

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object p1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result p2

    invoke-virtual {p1, v1, v0, p2}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥۣ۟۟ۡ([III)V

    goto :goto_1

    :cond_3
    iget-object p1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result p2

    invoke-virtual {p1, v4, v0, p2}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ(CII)V

    goto :goto_1

    :cond_4
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۤ(LYue/ۥۢۡۧۥ;)V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۥ(LYue/ۥۢۡۧۥ;)V

    iget-object p1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    const v1, 0xfffd

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result p2

    invoke-virtual {p1, v1, v0, p2}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ(CII)V

    :goto_1
    return-void
.end method
