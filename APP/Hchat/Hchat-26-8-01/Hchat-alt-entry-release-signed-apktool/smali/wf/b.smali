.class public final Lwf/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lwf/g;
.implements Ljava/io/Serializable;


# instance fields
.field public final g:Lwf/g;

.field public final h:Lwf/e;


# direct methods
.method public constructor <init>(Lwf/e;Lwf/g;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lwf/b;->g:Lwf/g;

    .line 11
    .line 12
    iput-object p1, p0, Lwf/b;->h:Lwf/e;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final e(Lwf/g;)Lwf/g;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lwf/h;->g:Lwf/h;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Lwb/m0;

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lwb/m0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0, p0}, Lwf/g;->k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lwf/g;

    .line 21
    .line 22
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-eq p0, p1, :cond_7

    .line 2
    .line 3
    instance-of v0, p1, Lwf/b;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    check-cast p1, Lwf/b;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    move-object v2, p1

    .line 12
    move v3, v0

    .line 13
    :goto_0
    iget-object v2, v2, Lwf/b;->g:Lwf/g;

    .line 14
    .line 15
    instance-of v4, v2, Lwf/b;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    check-cast v2, Lwf/b;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move-object v2, v5

    .line 24
    :goto_1
    if-nez v2, :cond_5

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    :goto_2
    iget-object v2, v2, Lwf/b;->g:Lwf/g;

    .line 28
    .line 29
    instance-of v4, v2, Lwf/b;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    check-cast v2, Lwf/b;

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_1
    move-object v2, v5

    .line 37
    :goto_3
    if-nez v2, :cond_4

    .line 38
    .line 39
    if-ne v3, v0, :cond_6

    .line 40
    .line 41
    move-object v0, p0

    .line 42
    :goto_4
    iget-object v2, v0, Lwf/b;->h:Lwf/e;

    .line 43
    .line 44
    invoke-interface {v2}, Lwf/e;->getKey()Lwf/f;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {p1, v3}, Lwf/b;->s(Lwf/f;)Lwf/e;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    move p1, v1

    .line 59
    goto :goto_5

    .line 60
    :cond_2
    iget-object v0, v0, Lwf/b;->g:Lwf/g;

    .line 61
    .line 62
    instance-of v2, v0, Lwf/b;

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    check-cast v0, Lwf/b;

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    check-cast v0, Lwf/e;

    .line 73
    .line 74
    invoke-interface {v0}, Lwf/e;->getKey()Lwf/f;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {p1, v2}, Lwf/b;->s(Lwf/f;)Lwf/e;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    :goto_5
    if-eqz p1, :cond_6

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_6
    return v1

    .line 96
    :cond_7
    :goto_6
    const/4 p1, 0x1

    .line 97
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lwf/b;->g:Lwf/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lwf/b;->h:Lwf/e;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    return v1
.end method

.method public final k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lwf/b;->g:Lwf/g;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lwf/g;->k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p0, Lwf/b;->h:Lwf/e;

    .line 8
    .line 9
    invoke-interface {p1, p2, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final s(Lwf/f;)Lwf/e;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    :goto_0
    iget-object v1, v0, Lwf/b;->h:Lwf/e;

    .line 6
    .line 7
    invoke-interface {v1, p1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    iget-object v0, v0, Lwf/b;->g:Lwf/g;

    .line 15
    .line 16
    instance-of v1, v0, Lwf/b;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    check-cast v0, Lwf/b;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {v0, p1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public final t(Lwf/f;)Lwf/g;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwf/b;->h:Lwf/e;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, Lwf/b;->g:Lwf/g;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    invoke-interface {v2, p1}, Lwf/g;->t(Lwf/f;)Lwf/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-ne p1, v2, :cond_1

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    sget-object v1, Lwf/h;->g:Lwf/h;

    .line 23
    .line 24
    if-ne p1, v1, :cond_2

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    new-instance v1, Lwf/b;

    .line 28
    .line 29
    invoke-direct {v1, v0, p1}, Lwf/b;-><init>(Lwf/e;Lwf/g;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lwb/m0;

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lwb/m0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-virtual {p0, v1, v2}, Lwf/b;->k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/String;

    .line 22
    .line 23
    const/16 v2, 0x5d

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Leh/a;->q(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method
