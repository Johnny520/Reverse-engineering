.class public final enum LYue/ۥ۠ۤۧۢ$ۥ۟۟۟ۧ;
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
    .locals 3

    invoke-static {p1}, LYue/ۥ۠ۤۧۢ;->ۥ۟۟۟(LYue/ۥۢۡۧ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟()LYue/ۥۢۡۧ۠$ۥ۟۟;

    move-result-object p1

    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۤ۟(LYue/ۥۢۡۧ۠$ۥ۟۟;)V

    goto/16 :goto_0

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

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p2, p0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢ(LYue/ۥ۠ۤۧۢ;)V

    return v1

    :cond_2
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۠۠()Z

    move-result v0

    const-string v2, "html"

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟ۡ()LYue/ۥۢۡۧ۠$ۥ۟۟۟ۢ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۥ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, LYue/ۥ۠ۤۧۢ;->ۥ۟۟ۡ:LYue/ۥ۠ۤۧۢ;

    invoke-virtual {p2, p1, v0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۦۨ(LYue/ۥۢۡۧ۠;LYue/ۥ۠ۤۧۢ;)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۠۟()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟۠()LYue/ۥۢۡۧ۠$ۥ۟۟۟ۡ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۥ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, LYue/ۥ۠ۤۧۢ;->ۥۣ۟۟ۢ:LYue/ۥ۠ۤۧۢ;

    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۨۥ(LYue/ۥ۠ۤۧۢ;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۠۠()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟ۡ()LYue/ۥۢۡۧ۠$ۥ۟۟۟ۢ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۥ()Ljava/lang/String;

    move-result-object v0

    const-string v2, "noframes"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, LYue/ۥ۠ۤۧۢ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۧۢ;

    invoke-virtual {p2, p1, v0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۦۨ(LYue/ۥۢۡۧ۠;LYue/ۥ۠ۤۧۢ;)Z

    move-result p1

    return p1

    :cond_5
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟ۨ()Z

    move-result p1

    if-eqz p1, :cond_6

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_6
    invoke-virtual {p2, p0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢ(LYue/ۥ۠ۤۧۢ;)V

    return v1
.end method
