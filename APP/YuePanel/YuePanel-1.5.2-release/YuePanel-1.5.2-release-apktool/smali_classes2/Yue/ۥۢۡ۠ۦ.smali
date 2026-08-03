.class public LYue/ۥۢۡ۠ۦ;
.super LYue/ۥ۠ۧ۟ۥ;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۧ۟ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    return-void
.end method

.method public static ۥ۟۟ۦۡ(Ljava/lang/String;)LYue/ۥۢۡ۠ۦ;
    .locals 1

    invoke-static {p0}, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, LYue/ۥۢۡ۠ۦ;

    invoke-direct {v0, p0}, LYue/ۥۢۡ۠ۦ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۥ۟۟ۦۤ(Ljava/lang/StringBuilder;)Z
    .locals 2

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p0

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static ۥ۟۟ۦۥ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟ۦۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "^\\s+"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦ۠()LYue/ۥۢۡ۠ۦ;

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

    invoke-virtual {p0}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦ۠()LYue/ۥۢۡ۠ۦ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "#text"

    return-object v0
.end method

.method public ۥۣۣ۟۟(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p3}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥۣ۟۟۠()Z

    move-result v0

    iget-object v1, p0, LYue/ۥۣۡۢۤ;->ۥۣ۟۟۠:LYue/ۥۣۡۢۤ;

    instance-of v2, v1, LYue/ۥ۠۠ۥۥ;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, LYue/ۥ۠۠ۥۥ;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    invoke-static {v1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۥۡ(LYue/ۥۣۡۢۤ;)Z

    move-result v0

    if-nez v0, :cond_1

    move v9, v3

    goto :goto_1

    :cond_1
    move v9, v4

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦۧ()LYue/ۥۢ۠ۨۡ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢ۠ۨۡ;->ۥ۟۟۟ۨ()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦۧ()LYue/ۥۢ۠ۨۡ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢ۠ۨۡ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move v0, v3

    goto :goto_2

    :cond_3
    move v0, v4

    :goto_2
    if-eqz v9, :cond_10

    if-eqz v0, :cond_4

    iget v1, p0, LYue/ۥۣۡۢۤ;->ۥ۟۟۠ۤ:I

    if-eqz v1, :cond_5

    :cond_4
    iget-object v1, p0, LYue/ۥۣۡۢۤ;->ۥۣ۟۟۠:LYue/ۥۣۡۢۤ;

    instance-of v1, v1, LYue/ۥ۠۟ۧۥ;

    if-eqz v1, :cond_6

    :cond_5
    move v1, v3

    goto :goto_3

    :cond_6
    move v1, v4

    :goto_3
    if-eqz v0, :cond_7

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۦ()LYue/ۥۣۡۢۤ;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    move v3, v4

    :goto_4
    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۦ()LYue/ۥۣۡۢۤ;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۤ۟()LYue/ۥۣۡۢۤ;

    move-result-object v4

    invoke-virtual {p0}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦۣ()Z

    move-result v5

    instance-of v6, v0, LYue/ۥ۠۠ۥۥ;

    const-string v7, "br"

    if-eqz v6, :cond_8

    move-object v6, v0

    check-cast v6, LYue/ۥ۠۠ۥۥ;

    invoke-virtual {v6, p3}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦۤ(LYue/ۥ۠۟ۧۥ$ۥ;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_8
    instance-of v6, v0, LYue/ۥۢۡ۠ۦ;

    if-eqz v6, :cond_9

    check-cast v0, LYue/ۥۢۡ۠ۦ;

    invoke-virtual {v0}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦۣ()Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    instance-of v0, v4, LYue/ۥ۠۠ۥۥ;

    if-eqz v0, :cond_b

    move-object v0, v4

    check-cast v0, LYue/ۥ۠۠ۥۥ;

    invoke-virtual {v0}, LYue/ۥ۠۠ۥۥ;->ۥۣ۟۠ۢ()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {v4, v7}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۥ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_a
    if-eqz v5, :cond_b

    return-void

    :cond_b
    if-nez v4, :cond_c

    if-eqz v2, :cond_c

    invoke-virtual {v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦۧ()LYue/ۥۢ۠ۨۡ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢ۠ۨۡ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz v5, :cond_e

    :cond_c
    invoke-virtual {p3}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠۟()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۥۢ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_d

    if-eqz v5, :cond_e

    :cond_d
    if-eqz v4, :cond_f

    invoke-virtual {v4, v7}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۥ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    :cond_e
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۢ(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V

    :cond_f
    move v10, v1

    move v11, v3

    goto :goto_5

    :cond_10
    move v10, v4

    move v11, v10

    :goto_5
    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۥۧ()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    move-object v5, p1

    move-object v7, p3

    invoke-static/range {v5 .. v11}, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟ۡ(Ljava/lang/Appendable;Ljava/lang/String;LYue/ۥ۠۟ۧۥ$ۥ;ZZZZ)V

    return-void
.end method

.method public ۥۣ۟۟ۤ(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public ۥ۟۟ۦ۠()LYue/ۥۢۡ۠ۦ;
    .locals 1

    invoke-super {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ;

    move-result-object v0

    check-cast v0, LYue/ۥۢۡ۠ۦ;

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

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۥۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۡ(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۦۦ(I)LYue/ۥۢۡ۠ۦ;
    .locals 5

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۥۧ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    const-string v4, "Split offset must be not be negative"

    invoke-static {v3, v4}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge p1, v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    const-string v4, "Split offset must not be greater than current text length"

    invoke-static {v3, v4}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v3}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦۨ(Ljava/lang/String;)LYue/ۥۢۡ۠ۦ;

    new-instance v0, LYue/ۥۢۡ۠ۦ;

    invoke-direct {v0, p1}, LYue/ۥۢۡ۠ۦ;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, LYue/ۥۣۡۢۤ;->ۥۣ۟۟۠:LYue/ۥۣۡۢۤ;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۥۡ()I

    move-result v3

    add-int/2addr v3, v2

    new-array v2, v2, [LYue/ۥۣۡۢۤ;

    aput-object v0, v2, v1

    invoke-virtual {p1, v3, v2}, LYue/ۥۣۡۢۤ;->ۥ۟۟۟(I[LYue/ۥۣۡۢۤ;)V

    :cond_2
    return-object v0
.end method

.method public ۥ۟۟ۦۨ(Ljava/lang/String;)LYue/ۥۢۡ۠ۦ;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۥۨ(Ljava/lang/String;)V

    return-object p0
.end method

.method public ۥ۟۟ۧ()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
