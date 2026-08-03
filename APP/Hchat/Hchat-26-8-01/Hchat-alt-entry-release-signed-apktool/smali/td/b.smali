.class public final Ltd/b;
.super Lud/p;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public o:Lyd/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 56
    sget-object v0, Lpd/k;->R:Lpd/k;

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lud/p;-><init>(Lpd/k;I)V

    return-void
.end method

.method public constructor <init>(Lyd/b;Lqd/r;Lqd/l;Lqd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltd/b;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lud/p;->d0(Lqd/r;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Lqd/l;->L()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p4}, Lqd/l;->O()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lyd/b;->K(Lyd/b;)Lyd/b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Ltd/b;->o:Lyd/b;

    .line 24
    .line 25
    invoke-virtual {p0, p4}, Lud/p;->I(Lqd/l;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p3}, Lud/p;->I(Lqd/l;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, Ltd/b;->o:Lyd/b;

    .line 33
    .line 34
    invoke-virtual {p0, p3}, Lud/p;->I(Lqd/l;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p4}, Lud/p;->I(Lqd/l;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    new-instance p1, Lae/g;

    .line 41
    .line 42
    const/16 p2, 0x13

    .line 43
    .line 44
    invoke-direct {p1, p0, p2}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-super {p0, p1}, Lud/p;->h0(Ljava/util/function/Consumer;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Ltd/b;->o:Lyd/b;

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Lyd/b;->P(Ljava/util/function/Consumer;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 2

    .line 1
    new-instance v0, Ltd/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ltd/b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ltd/b;->o:Lyd/b;

    .line 7
    .line 8
    iput-object v1, v0, Ltd/b;->o:Lyd/b;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final U(Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lud/p;->U(Ljava/util/Collection;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltd/b;->o:Lyd/b;

    .line 5
    .line 6
    invoke-virtual {v0}, Lyd/b;->J()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final Y(Lud/p;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Ltd/b;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-super {p0, p1}, Lud/p;->Y(Lud/p;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Ltd/b;

    .line 17
    .line 18
    iget-object v0, p0, Ltd/b;->o:Lyd/b;

    .line 19
    .line 20
    iget-object p1, p1, Ltd/b;->o:Lyd/b;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lyd/b;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-super {p0}, Lud/p;->Z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltd/b;->o:Lyd/b;

    .line 5
    .line 6
    invoke-virtual {v0}, Lyd/b;->J()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lqd/r;

    .line 25
    .line 26
    iget-object v1, v1, Lqd/l;->j:Lud/p;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Lud/p;->Z()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final b0(Lqd/l;Lqd/l;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Ltd/b;->o:Lyd/b;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lyd/b;->N(Lqd/l;Lqd/l;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final h0(Ljava/util/function/Consumer;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lud/p;->h0(Ljava/util/function/Consumer;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltd/b;->o:Lyd/b;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lyd/b;->P(Ljava/util/function/Consumer;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final i0()V
    .locals 4

    .line 1
    iget-object v0, p0, Ltd/b;->o:Lyd/b;

    .line 2
    .line 3
    invoke-static {v0}, Lyd/b;->O(Lyd/b;)Lyd/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Ltd/b;->o:Lyd/b;

    .line 8
    .line 9
    iget v1, v0, Lyd/b;->i:I

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, Lyd/b;->K(Lyd/b;)Lyd/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Ltd/b;->o:Lyd/b;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Lud/p;->S(I)Lqd/l;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {p0, v2}, Lud/p;->S(I)Lqd/l;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p0, v0, v3}, Lud/p;->c0(ILqd/l;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v2, v1}, Lud/p;->c0(ILqd/l;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lud/p;->n:I

    .line 2
    .line 3
    invoke-static {v0}, Lxe/m;->d(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lud/p;->l:Lqd/r;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Ltd/b;->o:Lyd/b;

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {p0, v3}, Lud/p;->S(I)Lqd/l;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-virtual {p0, v4}, Lud/p;->S(I)Lqd/l;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    new-instance v5, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ": TERNARY "

    .line 46
    .line 47
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, " = ("

    .line 54
    .line 55
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, ") ? "

    .line 62
    .line 63
    const-string v1, " : "

    .line 64
    .line 65
    invoke-static {v5, v0, v3, v1, v4}, Lj8/b;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
.end method
