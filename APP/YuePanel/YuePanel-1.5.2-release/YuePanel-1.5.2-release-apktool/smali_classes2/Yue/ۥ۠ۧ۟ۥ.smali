.class public abstract LYue/ۥ۠ۧ۟ۥ;
.super LYue/ۥۣۡۢۤ;
.source "SourceFile"


# instance fields
.field public ۥ۟۟۠ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۣۡۢۤ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۦ۟()V

    invoke-super {p0, p1}, LYue/ۥۣۡۢۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۢ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p2, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۦ۟()V

    invoke-super {p0, p1, p2}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    :goto_0
    return-object p0
.end method

.method public ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۢ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    return-object p1

    :cond_1
    invoke-super {p0, p1}, LYue/ۥۣۡۢۤ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۥ()LYue/ۥ۟ۢ۠ۤ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۦ۟()V

    iget-object v0, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۟ۢ۠ۤ;

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢ۟()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۦ()LYue/ۥۣۡۢۤ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public ۥ۟۟۠ۢ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic ۥ۟۟ۡ۠(LYue/ۥۣۡۢۤ;)LYue/ۥۣۡۢۤ;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۦ(LYue/ۥۣۡۢۤ;)LYue/ۥ۠ۧ۟ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۡ(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۡۢ()LYue/ۥۣۡۢۤ;
    .locals 0

    return-object p0
.end method

.method public ۥۣ۟۟ۡ()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e4;",
            ">;"
        }
    .end annotation

    sget-object v0, LYue/ۥۣۡۢۤ;->ۥ۟۟۠ۥ:Ljava/util/List;

    return-object v0
.end method

.method public ۥ۟۟ۡۨ(Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۦ۟()V

    invoke-super {p0, p1}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۡۨ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟ۢ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    instance-of v0, v0, LYue/ۥ۟ۢ۠ۤ;

    return v0
.end method

.method public ۥ۟۟ۤۢ(Ljava/lang/String;)LYue/ۥۣۡۢۤ;
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۦ۟()V

    invoke-super {p0, p1}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۤۢ(Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۥۧ()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۥۨ(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    return-void
.end method

.method public ۥ۟۟ۦ(LYue/ۥۣۡۢۤ;)LYue/ۥ۠ۧ۟ۥ;
    .locals 1

    invoke-super {p0, p1}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۡ۠(LYue/ۥۣۡۢۤ;)LYue/ۥۣۡۢۤ;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۧ۟ۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۟ۢ۠ۤ;

    invoke-virtual {v0}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟۟ۧ()LYue/ۥ۟ۢ۠ۤ;

    move-result-object v0

    iput-object v0, p1, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final ۥ۟۟ۦ۟()V
    .locals 3

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۢ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    new-instance v1, LYue/ۥ۟ۢ۠ۤ;

    invoke-direct {v1}, LYue/ۥ۟ۢ۠ۤ;-><init>()V

    iput-object v1, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۢ۠ۤ;

    :cond_0
    return-void
.end method
