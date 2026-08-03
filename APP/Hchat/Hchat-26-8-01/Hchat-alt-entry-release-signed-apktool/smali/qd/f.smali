.class public final Lqd/f;
.super Lqd/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final L:Lqd/e;

.field public final M:Lqd/e;


# direct methods
.method public constructor <init>(Lqd/e;Lqd/e;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lqd/e;->K:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p2, Lqd/e;->K:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "$"

    .line 6
    .line 7
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Lqd/e;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lqd/f;->L:Lqd/e;

    .line 15
    .line 16
    iput-object p2, p0, Lqd/f;->M:Lqd/e;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p1, p1, Lqd/j;->a:I

    .line 23
    .line 24
    iget p2, p2, Lqd/j;->a:I

    .line 25
    .line 26
    mul-int/lit8 p2, p2, 0x1f

    .line 27
    .line 28
    add-int/2addr p2, p1

    .line 29
    mul-int/lit8 p2, p2, 0x1f

    .line 30
    .line 31
    add-int/2addr p2, v0

    .line 32
    iput p2, p0, Lqd/j;->a:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/f;->M:Lqd/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqd/j;->j()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final k()Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/f;->M:Lqd/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/f;->L:Lqd/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lqd/e;->s(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lqd/f;

    .line 8
    .line 9
    iget-object v0, p1, Lqd/f;->L:Lqd/e;

    .line 10
    .line 11
    iget-object v1, p0, Lqd/f;->L:Lqd/e;

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lqd/f;->M:Lqd/e;

    .line 20
    .line 21
    iget-object p1, p1, Lqd/f;->M:Lqd/e;

    .line 22
    .line 23
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method public final t()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lqd/f;->L:Lqd/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqd/e;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lqd/f;->M:Lqd/e;

    .line 8
    .line 9
    invoke-virtual {v1}, Lqd/e;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "$"

    .line 14
    .line 15
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
