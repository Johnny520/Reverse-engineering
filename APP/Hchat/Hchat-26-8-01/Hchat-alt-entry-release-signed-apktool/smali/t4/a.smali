.class public final Lt4/a;
.super Lz4/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;
.implements Lz4/k;


# instance fields
.field public final h:Lv4/d0;

.field public final i:I

.field public final j:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Lv4/d0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz4/j;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lt4/a;->h:Lv4/d0;

    .line 9
    .line 10
    iput p2, p0, Lt4/a;->i:I

    .line 11
    .line 12
    new-instance p1, Ljava/util/TreeMap;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lt4/a;->j:Ljava/util/TreeMap;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p1, "visibility == null"

    .line 21
    .line 22
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    throw p1

    .line 27
    :cond_1
    const-string p1, "type == null"

    .line 28
    .line 29
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lt4/a;->i:I

    .line 7
    .line 8
    invoke-static {v1}, Lp/a;->c(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "-annotation "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lt4/a;->h:Lv4/d0;

    .line 21
    .line 22
    iget-object v1, v1, Lv4/d0;->g:Lw4/c;

    .line 23
    .line 24
    invoke-virtual {v1}, Lw4/c;->a()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, " {"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lt4/a;->j:Ljava/util/TreeMap;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v2, 0x1

    .line 47
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lt4/d;

    .line 58
    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    const-string v4, ", "

    .line 64
    .line 65
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    :goto_1
    iget-object v4, v3, Lt4/d;->g:Lv4/c0;

    .line 69
    .line 70
    invoke-virtual {v4}, Lv4/c0;->a()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v4, ": "

    .line 78
    .line 79
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v3, v3, Lt4/d;->h:Lv4/a;

    .line 83
    .line 84
    invoke-interface {v3}, Lz4/k;->a()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    const-string v1, "}"

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    return-object v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lt4/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lt4/a;->m(Lt4/a;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lt4/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lt4/a;

    .line 7
    .line 8
    iget-object v0, p0, Lt4/a;->h:Lv4/d0;

    .line 9
    .line 10
    iget-object v1, p1, Lt4/a;->h:Lv4/d0;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lv4/d0;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget v0, p0, Lt4/a;->i:I

    .line 19
    .line 20
    iget v1, p1, Lt4/a;->i:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v0, p0, Lt4/a;->j:Ljava/util/TreeMap;

    .line 26
    .line 27
    iget-object p1, p1, Lt4/a;->j:Ljava/util/TreeMap;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 35
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/a;->h:Lv4/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/d0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lt4/a;->j:Ljava/util/TreeMap;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget v0, p0, Lt4/a;->i:I

    .line 19
    .line 20
    invoke-static {v0}, Lt3/c;->b(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method

.method public final l(Lt4/d;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lt4/d;->g:Lv4/c0;

    .line 5
    .line 6
    iget-object v1, p0, Lt4/a;->j:Ljava/util/TreeMap;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, v0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "name already added: "

    .line 19
    .line 20
    invoke-static {v0, p1}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final m(Lt4/a;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lt4/a;->h:Lv4/d0;

    .line 2
    .line 3
    iget-object v1, p1, Lt4/a;->h:Lv4/d0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lv4/a;->d(Lv4/a;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    iget v0, p1, Lt4/a;->i:I

    .line 13
    .line 14
    iget v1, p0, Lt4/a;->i:I

    .line 15
    .line 16
    if-eqz v1, :cond_7

    .line 17
    .line 18
    if-eqz v0, :cond_7

    .line 19
    .line 20
    sub-int/2addr v1, v0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    iget-object v0, p0, Lt4/a;->j:Ljava/util/TreeMap;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object p1, p1, Lt4/a;->j:Ljava/util/TreeMap;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lt4/d;

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lt4/d;

    .line 67
    .line 68
    iget-object v3, v1, Lt4/d;->g:Lv4/c0;

    .line 69
    .line 70
    iget-object v4, v2, Lt4/d;->g:Lv4/c0;

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Lv4/a;->d(Lv4/a;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget-object v1, v1, Lt4/d;->h:Lv4/a;

    .line 80
    .line 81
    iget-object v2, v2, Lt4/d;->h:Lv4/a;

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Lv4/a;->d(Lv4/a;)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    :goto_0
    if-eqz v3, :cond_2

    .line 88
    .line 89
    return v3

    .line 90
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    const/4 p1, 0x1

    .line 97
    return p1

    .line 98
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    const/4 p1, -0x1

    .line 105
    return p1

    .line 106
    :cond_6
    const/4 p1, 0x0

    .line 107
    return p1

    .line 108
    :cond_7
    const/4 p1, 0x0

    .line 109
    throw p1
.end method

.method public final n(Lt4/d;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt4/a;->j:Ljava/util/TreeMap;

    .line 5
    .line 6
    iget-object v1, p1, Lt4/d;->g:Lv4/c0;

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt4/a;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
