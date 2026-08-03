.class public final enum LYue/ۥ۠ۤۧۢ$ۥ۟۟۟ۥ;
.super LYue/ۥ۠ۤۧۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۧۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۠ۤۧۢ;-><init>(Ljava/lang/String;ILYue/ۥ۠ۤۧۢ$ۥ۟۟۟ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۦ(LYue/ۥۢۡۧ۠;LYue/ۥ۠ۤۧۡ;)Z
    .locals 5

    invoke-static {p1}, LYue/ۥ۠ۤۧۢ;->ۥ۟۟۟(LYue/ۥۢۡۧ۠;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟()LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۤۡ(LYue/ۥۢۡۧ۠$ۥ۟۟۟;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟ۧ()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟۟()LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;

    move-result-object p1

    new-instance v0, LYue/ۥ۠۟ۧۧ;

    iget-object v2, p2, LYue/ۥۢۢۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۣۡۧۥ;

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟ۡ۟()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LYue/ۥۣۡۧۥ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟ۡۡ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟ۡۢ()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v2, v3, v4}, LYue/ۥ۠۟ۧۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥ۟۟ۡ۠()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦۣ(Ljava/lang/String;)V

    invoke-virtual {p2}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢۦ()LYue/ۥ۠۟ۧۥ;

    move-result-object v2

    invoke-virtual {v2, v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦۥ(LYue/ۥۣۡۢۤ;)LYue/ۥ۠۠ۥۥ;

    invoke-virtual {p2, v0}, LYue/ۥۢۢۡۧ;->ۥ۟۟۟ۦ(LYue/ۥۣۡۢۤ;)V

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۡ()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p2}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢۦ()LYue/ۥ۠۟ۧۥ;

    move-result-object p1

    sget-object v0, LYue/ۥ۠۟ۧۥ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۠۟ۧۥ$ۥ۟;

    invoke-virtual {p1, v0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۧ(LYue/ۥ۠۟ۧۥ$ۥ۟;)LYue/ۥ۠۟ۧۥ;

    :cond_2
    sget-object p1, LYue/ۥ۠ۤۧۢ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۢ;

    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۨۥ(LYue/ۥ۠ۤۧۢ;)V

    :goto_0
    return v1

    :cond_3
    sget-object v0, LYue/ۥ۠ۤۧۢ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۧۢ;

    invoke-virtual {p2, v0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۨۥ(LYue/ۥ۠ۤۧۢ;)V

    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟۠۟(LYue/ۥۢۡۧ۠;)Z

    move-result p1

    return p1
.end method
