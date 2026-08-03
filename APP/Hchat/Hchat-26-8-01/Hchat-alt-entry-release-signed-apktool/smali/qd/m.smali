.class public final Lqd/m;
.super Lqd/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final l:Lud/p;


# direct methods
.method public constructor <init>(Lud/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lud/p;->l:Lqd/r;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lqd/r;->I()Lqd/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, Lqd/j;->u:Lqd/h;

    .line 14
    .line 15
    :goto_0
    iput-object v0, p0, Lqd/l;->i:Lqd/j;

    .line 16
    .line 17
    iput-object p1, p0, Lqd/m;->l:Lud/p;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final H()Lqd/l;
    .locals 2

    .line 1
    new-instance v0, Lqd/m;

    .line 2
    .line 3
    iget-object v1, p0, Lqd/m;->l:Lud/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Lud/p;->O()Lud/p;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lqd/m;-><init>(Lud/p;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lqd/l;->i:Lqd/j;

    .line 13
    .line 14
    iput-object v1, v0, Lqd/l;->i:Lqd/j;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lmd/e;->B(Lmd/e;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lqd/l;->j:Lud/p;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lqd/m;->V(Lud/p;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final V(Lud/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/m;->l:Lud/p;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lqd/l;->j:Lud/p;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "Can\'t wrap instruction info itself: "

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final X()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lqd/m;->l:Lud/p;

    .line 2
    .line 3
    iget-object v1, v0, Lud/p;->k:Lpd/k;

    .line 4
    .line 5
    sget-object v2, Lpd/k;->h:Lpd/k;

    .line 6
    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    check-cast v0, Lpd/d;

    .line 10
    .line 11
    iget-object v0, v0, Lpd/d;->o:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "(\""

    .line 14
    .line 15
    const-string v2, "\")"

    .line 16
    .line 17
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    iget-object v1, p0, Lqd/l;->i:Lqd/j;

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v0, v0, Lud/p;->k:Lpd/k;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v2, ":"

    .line 35
    .line 36
    const-string v3, ")"

    .line 37
    .line 38
    const-string v4, "(wrap:"

    .line 39
    .line 40
    invoke-static {v4, v1, v2, v0, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lqd/m;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lqd/m;

    .line 12
    .line 13
    iget-object p1, p1, Lqd/m;->l:Lud/p;

    .line 14
    .line 15
    iget-object v1, p0, Lqd/m;->l:Lud/p;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lud/p;->Y(Lud/p;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v3, v1, Lud/p;->m:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    move v4, v2

    .line 31
    :goto_0
    if-ge v4, v3, :cond_4

    .line 32
    .line 33
    invoke-virtual {v1, v4}, Lud/p;->S(I)Lqd/l;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {p1, v4}, Lud/p;->S(I)Lqd/l;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_3

    .line 46
    .line 47
    return v2

    .line 48
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/m;->l:Lud/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lqd/m;->l:Lud/p;

    .line 2
    .line 3
    iget-object v1, v0, Lud/p;->k:Lpd/k;

    .line 4
    .line 5
    sget-object v2, Lpd/k;->h:Lpd/k;

    .line 6
    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    check-cast v0, Lpd/d;

    .line 10
    .line 11
    iget-object v0, v0, Lpd/d;->o:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "(\""

    .line 14
    .line 15
    const-string v2, "\")"

    .line 16
    .line 17
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    iget-object v1, p0, Lqd/l;->i:Lqd/j;

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v2, ":"

    .line 33
    .line 34
    const-string v3, ")"

    .line 35
    .line 36
    const-string v4, "(wrap:"

    .line 37
    .line 38
    invoke-static {v4, v1, v2, v0, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method
