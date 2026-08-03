.class public final Lqd/h;
.super Lqd/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final J:[Lqd/q;


# direct methods
.method public constructor <init>([Lqd/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqd/h;->J:[Lqd/q;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lqd/j;->a:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final A()Lqd/j;
    .locals 2

    .line 1
    sget-object v0, Lqd/q;->r:Lqd/q;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lqd/h;->a(Lqd/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lqd/j;->k:Lqd/e;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    sget-object v0, Lqd/q;->s:Lqd/q;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lqd/h;->a(Lqd/q;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Lqd/a;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lqd/a;-><init>(Lqd/j;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    iget-object v0, p0, Lqd/h;->J:[Lqd/q;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    aget-object v0, v0, v1

    .line 30
    .line 31
    new-instance v1, Lqd/g;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lqd/g;-><init>(Lqd/q;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method

.method public final a(Lqd/q;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lqd/h;->J:[Lqd/q;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    if-ne v4, p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return v2
.end method

.method public final n()[Lqd/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/h;->J:[Lqd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    check-cast p1, Lqd/h;

    .line 2
    .line 3
    iget-object p1, p1, Lqd/h;->J:[Lqd/q;

    .line 4
    .line 5
    iget-object v0, p0, Lqd/h;->J:[Lqd/q;

    .line 6
    .line 7
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lqd/h;->J:[Lqd/q;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {}, Lqd/q;->values()[Lqd/q;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    array-length v2, v2

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    const-string v0, "??"

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    move v2, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    array-length v2, v0

    .line 20
    :goto_0
    if-nez v2, :cond_2

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    aget-object v1, v0, v1

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    :goto_1
    if-ge v1, v2, :cond_3

    .line 37
    .line 38
    const-string v4, ", "

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    aget-object v4, v0, v1

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_2
    const-string v1, "??["

    .line 56
    .line 57
    const-string v2, "]"

    .line 58
    .line 59
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
.end method

.method public final w()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
