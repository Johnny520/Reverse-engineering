.class public final Lfc/b;
.super Lfc/f;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:I

.field public h:I

.field public i:Ljava/util/Map;

.field public j:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lbc/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lfc/f;-><init>(Lbc/g;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput p1, p0, Lfc/b;->g:I

    .line 6
    .line 7
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 8
    .line 9
    iput-object p1, p0, Lfc/b;->i:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, Lfc/b;->j:Ljava/util/Map;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(C)Lfc/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lfc/b;->h:I

    .line 7
    .line 8
    add-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lfc/b;->h:I

    .line 11
    .line 12
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lfc/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lfc/b;->h:I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    add-int/2addr p1, v0

    .line 13
    iput p1, p0, Lfc/b;->h:I

    .line 14
    .line 15
    return-object p0
.end method

.method public final c(Lfc/b;)V
    .locals 4

    .line 1
    iget v0, p0, Lfc/b;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lfc/b;->g:I

    .line 6
    .line 7
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p1, Lfc/b;->i:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/2addr v3, v0

    .line 46
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lhc/a;

    .line 51
    .line 52
    invoke-virtual {p0, v2, v3}, Lfc/b;->v(Lhc/a;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object v0, p1, Lfc/b;->j:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Ljava/util/Map$Entry;

    .line 77
    .line 78
    iget v2, p0, Lfc/b;->g:I

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    add-int/2addr v3, v2

    .line 91
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    iget-object v2, p0, Lfc/b;->j:Ljava/util/Map;

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    new-instance v2, Ljava/util/TreeMap;

    .line 109
    .line 110
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v2, p0, Lfc/b;->j:Ljava/util/Map;

    .line 114
    .line 115
    :cond_1
    iget-object v2, p0, Lfc/b;->j:Ljava/util/Map;

    .line 116
    .line 117
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    iget v0, p0, Lfc/b;->g:I

    .line 126
    .line 127
    iget v1, p1, Lfc/b;->g:I

    .line 128
    .line 129
    add-int/2addr v0, v1

    .line 130
    iput v0, p0, Lfc/b;->g:I

    .line 131
    .line 132
    iget v0, p1, Lfc/b;->h:I

    .line 133
    .line 134
    iput v0, p0, Lfc/b;->h:I

    .line 135
    .line 136
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 137
    .line 138
    iget-object p1, p1, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public final d(C)Lfc/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lfc/b;->h:I

    .line 7
    .line 8
    add-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lfc/b;->h:I

    .line 11
    .line 12
    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lfc/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lfc/b;->h:I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    add-int/2addr p1, v0

    .line 13
    iput p1, p0, Lfc/b;->h:I

    .line 14
    .line 15
    return-object p0
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lfc/f;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lfc/b;->g:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Lfc/b;->g:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lfc/b;->h:I

    .line 16
    .line 17
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lfc/f;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lfc/b;->h:I

    .line 9
    .line 10
    iget-object v1, p0, Lfc/f;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    iput v1, p0, Lfc/b;->h:I

    .line 18
    .line 19
    return-void
.end method

.method public final bridge synthetic h(Ljava/lang/String;)Lfc/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfc/b;->u(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final bridge synthetic i(Ljava/lang/String;)Lfc/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfc/b;->u(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final j(Lhc/a;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, p1, v0}, Lfc/b;->v(Lhc/a;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final k(Lhc/c;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lic/b;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lic/b;-><init>(Lhc/c;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lfc/b;->j(Lhc/a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final l(Lic/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lfc/b;->h:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    invoke-virtual {p0, p1, v0}, Lfc/b;->v(Lhc/a;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final m(I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget v0, p0, Lfc/b;->g:I

    .line 5
    .line 6
    iget-object v1, p0, Lfc/b;->j:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    new-instance v1, Ljava/util/TreeMap;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lfc/b;->j:Ljava/util/Map;

    .line 20
    .line 21
    :cond_1
    iget-object v1, p0, Lfc/b;->j:Ljava/util/Map;

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final u(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lfc/f;->e:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 8
    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    iget-object v1, p0, Lfc/f;->b:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lfc/b;->g:I

    .line 36
    .line 37
    sget-object v2, Lxe/q;->b:Lxe/q;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    move v4, v3

    .line 60
    move v5, v4

    .line 61
    :goto_0
    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    const/4 v6, -0x1

    .line 66
    if-eq v4, v6, :cond_2

    .line 67
    .line 68
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    add-int/2addr v4, v2

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    :goto_1
    move v5, v3

    .line 73
    :cond_2
    add-int/2addr v1, v5

    .line 74
    iput v1, p0, Lfc/b;->g:I

    .line 75
    .line 76
    iput v3, p0, Lfc/b;->h:I

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final v(Lhc/a;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/b;->i:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lfc/b;->i:Ljava/util/Map;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lfc/b;->i:Ljava/util/Map;

    .line 17
    .line 18
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final w()Lbc/d;
    .locals 4

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 9
    .line 10
    new-instance v1, Lfc/a;

    .line 11
    .line 12
    iget-object v2, p0, Lfc/b;->j:Ljava/util/Map;

    .line 13
    .line 14
    iget-object v3, p0, Lfc/b;->i:Ljava/util/Map;

    .line 15
    .line 16
    invoke-direct {v1, v0, v2, v3}, Lfc/a;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method
