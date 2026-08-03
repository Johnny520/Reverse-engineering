.class public final Le/F;
.super Le/n;
.source "SourceFile"


# instance fields
.field private e:Le/f;


# direct methods
.method public constructor <init>(Le/l;Lj/s;Lj/o;Le/f;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Le/n;-><init>(Le/l;Lj/s;Lj/o;)V

    if-eqz p4, :cond_0

    iput-object p4, p0, Le/F;->e:Le/f;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "target == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A()I
    .locals 2

    iget-object v0, p0, Le/F;->e:Le/f;

    invoke-virtual {v0}, Le/j;->h()I

    move-result v0

    invoke-virtual {p0}, Le/j;->h()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final B()Z
    .locals 1

    invoke-virtual {p0}, Le/j;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/F;->e:Le/f;

    invoke-virtual {v0}, Le/j;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/F;->e:Le/f;

    if-nez v0, :cond_0

    const-string v0, "????"

    return-object v0

    :cond_0
    invoke-virtual {v0}, Le/j;->p()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Le/l;)Le/j;
    .locals 4

    new-instance v0, Le/F;

    invoke-virtual {p0}, Le/j;->l()Lj/s;

    move-result-object v1

    invoke-virtual {p0}, Le/j;->m()Lj/o;

    move-result-object v2

    iget-object v3, p0, Le/F;->e:Le/f;

    invoke-direct {v0, p1, v1, v2, v3}, Le/F;-><init>(Le/l;Lj/s;Lj/o;Le/f;)V

    return-object v0
.end method

.method public final w(Lj/o;)Le/j;
    .locals 4

    new-instance v0, Le/F;

    invoke-virtual {p0}, Le/j;->k()Le/l;

    move-result-object v1

    invoke-virtual {p0}, Le/j;->l()Lj/s;

    move-result-object v2

    iget-object v3, p0, Le/F;->e:Le/f;

    invoke-direct {v0, v1, v2, p1, v3}, Le/F;-><init>(Le/l;Lj/s;Lj/o;Le/f;)V

    return-object v0
.end method

.method public final y()Le/f;
    .locals 1

    iget-object v0, p0, Le/F;->e:Le/f;

    return-object v0
.end method

.method public final z()I
    .locals 1

    iget-object v0, p0, Le/F;->e:Le/f;

    invoke-virtual {v0}, Le/j;->h()I

    move-result v0

    return v0
.end method
