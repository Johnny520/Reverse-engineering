.class public final Lqd/i;
.super Lqd/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final L:Lqd/j;

.field public final M:I


# direct methods
.method public constructor <init>(ILqd/j;)V
    .locals 1

    .line 1
    sget-object v0, Lqd/j;->k:Lqd/e;

    .line 2
    .line 3
    iget-object v0, v0, Lqd/e;->K:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lqd/e;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lqd/i;->L:Lqd/j;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iput p1, p0, Lqd/i;->M:I

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    throw p1
.end method


# virtual methods
.method public final q()I
    .locals 1

    .line 1
    iget v0, p0, Lqd/i;->M:I

    .line 2
    .line 3
    return v0
.end method

.method public final r()Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/i;->L:Lqd/j;

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
    check-cast p1, Lqd/i;

    .line 8
    .line 9
    iget v0, p1, Lqd/i;->M:I

    .line 10
    .line 11
    iget v1, p0, Lqd/i;->M:I

    .line 12
    .line 13
    if-ne v1, v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lqd/i;->L:Lqd/j;

    .line 16
    .line 17
    iget-object p1, p1, Lqd/i;->L:Lqd/j;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
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
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iget v1, p0, Lqd/i;->M:I

    .line 3
    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-static {v1}, Lp/a;->d(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {v1}, Lp/a;->d(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lqd/i;->L:Lqd/j;

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method
