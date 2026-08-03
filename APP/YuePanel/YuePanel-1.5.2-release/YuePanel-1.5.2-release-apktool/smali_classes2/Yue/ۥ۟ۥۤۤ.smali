.class public LYue/ۥ۟ۥۤۤ;
.super LYue/ۥ۠ۧ۟ۥ;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۧ۟ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    return-void
.end method

.method public static ۥ۟۟ۦۤ(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v0, "!"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "?"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۥۤۤ;->ۥ۟۟ۦۡ()LYue/ۥ۟ۥۤۤ;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۡ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۥۤۤ;->ۥ۟۟ۦۡ()LYue/ۥ۟ۥۤۤ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "#comment"

    return-object v0
.end method

.method public ۥۣۣ۟۟(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p3}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥۣ۟۟۠()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۣۡۢۤ;->ۥۣ۟۟۠:LYue/ۥۣۡۢۤ;

    instance-of v1, v0, LYue/ۥ۠۠ۥۥ;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥ۠۠ۥۥ;

    invoke-virtual {v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦۧ()LYue/ۥۢ۠ۨۡ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢ۠ۨۡ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p3}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠۟()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۢ(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V

    :cond_2
    const-string p2, "<!--"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    invoke-virtual {p0}, LYue/ۥ۟ۥۤۤ;->ۥ۟۟ۦۢ()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const-string p2, "-->"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public ۥۣ۟۟ۤ(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۦ۠()LYue/ۥۢۦۣ;
    .locals 5

    invoke-virtual {p0}, LYue/ۥ۟ۥۤۤ;->ۥ۟۟ۦۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۥۤۤ;->ۥ۟۟ۦۤ(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    return-object v3

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "<"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LYue/ۥۣۡۧۦ;->ۥ۟۟۟()LYue/ۥۣۡۧۦ;

    move-result-object v2

    sget-object v4, LYue/ۥۣۡۧۥ;->ۥ۟۟۟:LYue/ۥۣۡۧۥ;

    invoke-virtual {v2, v4}, LYue/ۥۣۡۧۦ;->ۥ۟۟۠ۤ(LYue/ۥۣۡۧۥ;)LYue/ۥۣۡۧۦ;

    move-result-object v2

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v1, v4}, LYue/ۥۣۡۧۦ;->ۥ۟۟۠(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠۟ۧۥ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨ۟()LYue/ۥ۠۠ۥۥ;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۨ۟()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v1}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨ۟()LYue/ۥ۠۠ۥۥ;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۧۧ(I)LYue/ۥ۠۠ۥۥ;

    move-result-object v2

    new-instance v3, LYue/ۥۢۦۣ;

    invoke-static {v1}, LYue/ۥۡۢۤ;->ۥ۟(LYue/ۥۣۡۢۤ;)LYue/ۥۣۡۧۦ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۣۡۧۦ;->ۥۣ۟۟۠()LYue/ۥۣۡۧۥ;

    move-result-object v1

    invoke-virtual {v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۧ۟()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, LYue/ۥۣۡۧۥ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "!"

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    invoke-direct {v3, v1, v0}, LYue/ۥۢۦۣ;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v3}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۥ()LYue/ۥ۟ۢ۠ۤ;

    move-result-object v0

    invoke-virtual {v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟۟ۥ()LYue/ۥ۟ۢ۠ۤ;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۢ۠ۤ;)V

    :cond_1
    return-object v3
.end method

.method public ۥ۟۟ۦۡ()LYue/ۥ۟ۥۤۤ;
    .locals 1

    invoke-super {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۥۤۤ;

    return-object v0
.end method

.method public ۥ۟۟ۦۢ()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۥۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۦۣ()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۥۤۤ;->ۥ۟۟ۦۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۥۤۤ;->ۥ۟۟ۦۤ(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۦۥ(Ljava/lang/String;)LYue/ۥ۟ۥۤۤ;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۥۨ(Ljava/lang/String;)V

    return-object p0
.end method
