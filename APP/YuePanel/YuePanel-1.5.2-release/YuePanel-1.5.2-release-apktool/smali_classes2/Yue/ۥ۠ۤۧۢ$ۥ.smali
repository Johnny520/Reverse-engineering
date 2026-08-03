.class public final enum LYue/ۥ۠ۤۧۢ$ۥ;
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
    .locals 7

    iget-object v0, p1, LYue/ۥۢۡۧ۠;->ۥۣ۟۟۠:LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;

    sget-object v1, LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;->ۥ۟۟۠ۧ:LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟()LYue/ۥۢۡۧ۠$ۥ۟۟;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠$ۥ۟۟;->ۥ۟۟ۡۡ()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LYue/ۥ۠ۤۧۢ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢ(LYue/ۥ۠ۤۧۢ;)V

    return v3

    :cond_0
    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۡ(LYue/ۥۢۡۧ۠$ۥ۟۟;)V

    return v2

    :cond_1
    invoke-virtual {p2}, LYue/ۥ۠ۤۧۡ;->ۥۣ۟۟۟()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    iget-object v0, p2, LYue/ۥۢۢۡۧ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۧ۠;

    invoke-virtual {p2}, LYue/ۥ۠ۤۧۡ;->ۥۣ۟۟۟()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥۢۡۧ۠$ۥ۟۟;

    iput-object v4, p2, LYue/ۥۢۢۡۧ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۧ۠;

    invoke-static {v4}, LYue/ۥ۠ۤۧۢ;->ۥ۟۟۟(LYue/ۥۢۡۧ۠;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {p2, p0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢ(LYue/ۥ۠ۤۧۢ;)V

    invoke-virtual {p2}, LYue/ۥۢۢۡۧ;->ۥ()LYue/ۥ۠۠ۥۥ;

    move-result-object v5

    invoke-virtual {v5}, LYue/ۥ۠۠ۥۥ;->ۥۣ۟۟۠()Ljava/lang/String;

    move-result-object v5

    sget-object v6, LYue/ۥ۠ۤۧۢ$ۥ۟۟ۡ;->ۥ۟۟ۡ۠:[Ljava/lang/String;

    invoke-static {v5, v6}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p2, v2}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۨۡ(Z)V

    sget-object v5, LYue/ۥ۠ۤۧۢ;->ۥ۟۟ۡ:LYue/ۥ۠ۤۧۢ;

    invoke-virtual {p2, v4, v5}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۦۨ(LYue/ۥۢۡۧ۠;LYue/ۥ۠ۤۧۢ;)Z

    invoke-virtual {p2, v3}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۨۡ(Z)V

    goto :goto_0

    :cond_2
    sget-object v5, LYue/ۥ۠ۤۧۢ;->ۥ۟۟ۡ:LYue/ۥ۠ۤۧۢ;

    invoke-virtual {p2, v4, v5}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۦۨ(LYue/ۥۢۡۧ۠;LYue/ۥ۠ۤۧۢ;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p2, v4}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۤ۟(LYue/ۥۢۡۧ۠$ۥ۟۟;)V

    goto :goto_0

    :cond_4
    iput-object v0, p2, LYue/ۥۢۢۡۧ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۧ۠;

    invoke-virtual {p2}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۨ۟()V

    :cond_5
    invoke-virtual {p2}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۦۢ()LYue/ۥ۠ۤۧۢ;

    move-result-object v0

    invoke-virtual {p2, v0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۨۥ(LYue/ۥ۠ۤۧۢ;)V

    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟۠۟(LYue/ۥۢۡۧ۠;)Z

    move-result p1

    return p1
.end method
