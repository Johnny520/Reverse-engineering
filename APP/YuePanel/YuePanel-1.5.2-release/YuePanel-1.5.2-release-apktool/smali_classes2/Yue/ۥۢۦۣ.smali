.class public LYue/ۥۢۦۣ;
.super LYue/ۥ۠ۧ۟ۥ;
.source "SourceFile"


# instance fields
.field public final ۥ۟۟۠ۨ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۧ۟ۥ;-><init>()V

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    iput-object p1, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-boolean p2, p0, LYue/ۥۢۦۣ;->ۥ۟۟۠ۨ:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۣ;->ۥ۟۟ۦ۠()LYue/ۥۢۦۣ;

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

    invoke-virtual {p0}, LYue/ۥۢۦۣ;->ۥ۟۟ۦ۠()LYue/ۥۢۦۣ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "#declaration"

    return-object v0
.end method

.method public ۥۣۣ۟۟(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string p2, "<"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    iget-boolean v0, p0, LYue/ۥۢۦۣ;->ۥ۟۟۠ۨ:Z

    const-string v1, "?"

    const-string v2, "!"

    if-eqz v0, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۥۧ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {p0, p1, p3}, LYue/ۥۢۦۣ;->ۥ۟۟ۦۢ(Ljava/lang/Appendable;LYue/ۥ۠۟ۧۥ$ۥ;)V

    iget-boolean p2, p0, LYue/ۥۢۦۣ;->ۥ۟۟۠ۨ:Z

    if-eqz p2, :cond_1

    move-object v1, v2

    :cond_1
    invoke-interface {p1, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const-string p2, ">"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public ۥۣ۟۟ۤ(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۦ۠()LYue/ۥۢۦۣ;
    .locals 1

    invoke-super {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ;

    move-result-object v0

    check-cast v0, LYue/ۥۢۦۣ;

    return-object v0
.end method

.method public ۥ۟۟ۦۡ()Ljava/lang/String;
    .locals 2

    invoke-static {}, LYue/ۥۢ۠ۡۤ;->ۥ۟()Ljava/lang/StringBuilder;

    move-result-object v0

    :try_start_0
    new-instance v1, LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-direct {v1}, LYue/ۥ۠۟ۧۥ$ۥ;-><init>()V

    invoke-virtual {p0, v0, v1}, LYue/ۥۢۦۣ;->ۥ۟۟ۦۢ(Ljava/lang/Appendable;LYue/ۥ۠۟ۧۥ$ۥ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v0}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۠۠(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, LYue/ۥۡۨۢۨ;

    invoke-direct {v1, v0}, LYue/ۥۡۨۢۨ;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ۥ۟۟ۦۢ(Ljava/lang/Appendable;LYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۥ()LYue/ۥ۟ۢ۠ۤ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۢ۠ۤ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۢ۠ۢ;

    invoke-virtual {v1}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, LYue/ۥۢۦۣ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x20

    invoke-interface {p1, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "=\""

    invoke-interface {p1, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v3, p1

    move-object v5, p2

    invoke-static/range {v3 .. v9}, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟ۡ(Ljava/lang/Appendable;Ljava/lang/String;LYue/ۥ۠۟ۧۥ$ۥ;ZZZZ)V

    const/16 v1, 0x22

    invoke-interface {p1, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public ۥ۟۟ۦۣ()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۥۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
