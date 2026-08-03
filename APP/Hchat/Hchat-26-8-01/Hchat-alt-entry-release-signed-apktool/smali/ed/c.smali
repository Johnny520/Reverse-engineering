.class public final Led/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final f:Ljava/util/Set;


# instance fields
.field public final a:Lud/u;

.field public b:Ljava/util/HashMap;

.field public c:Ljava/util/HashMap;

.field public d:Ljava/util/HashMap;

.field public final e:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Led/c;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    const-string v0, "java.lang.Object"

    .line 7
    .line 8
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Led/c;->f:Ljava/util/Set;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lud/u;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Led/c;->e:Ljava/util/HashSet;

    .line 10
    .line 11
    iput-object p1, p0, Led/c;->a:Lud/u;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    iget-object v0, p0, Led/c;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Led/c;->b:Ljava/util/HashMap;

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lud/e;

    .line 31
    .line 32
    iget-object v1, v0, Lud/e;->m:Lod/a;

    .line 33
    .line 34
    iget-object v1, v1, Lod/a;->g:Lqd/j;

    .line 35
    .line 36
    invoke-virtual {v1}, Lqd/j;->l()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v3, Led/b;

    .line 41
    .line 42
    iget-object v4, v0, Lud/e;->o:Lb5/k;

    .line 43
    .line 44
    iget v4, v4, Lb5/k;->b:I

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    invoke-direct {v3, v4, v5, v1}, Led/b;-><init>(IILqd/j;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Led/a;->d:Lmh/b;

    .line 51
    .line 52
    iget-object v1, v0, Lud/e;->p:Lqd/j;

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    sget-object v0, Led/a;->e:[Lqd/j;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    iget-object v4, v0, Lud/e;->q:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-nez v4, :cond_2

    .line 66
    .line 67
    sget-object v6, Lqd/j;->k:Lqd/e;

    .line 68
    .line 69
    if-ne v1, v6, :cond_2

    .line 70
    .line 71
    sget-object v0, Led/a;->f:[Lqd/j;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    new-array v4, v4, [Lqd/j;

    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    aput-object v1, v4, v6

    .line 80
    .line 81
    iget-object v0, v0, Lud/e;->q:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    move v1, v5

    .line 88
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_3

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    check-cast v6, Lqd/j;

    .line 99
    .line 100
    aput-object v6, v4, v1

    .line 101
    .line 102
    add-int/2addr v1, v5

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    move-object v0, v4

    .line 105
    :goto_2
    iput-object v0, v3, Led/b;->c:[Lqd/j;

    .line 106
    .line 107
    iget-object v0, p0, Led/c;->b:Ljava/util/HashMap;

    .line 108
    .line 109
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    return-void
.end method

.method public final b(Led/b;Ljava/util/HashSet;)V
    .locals 6

    .line 1
    iget-object p1, p1, Led/b;->c:[Lqd/j;

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_4

    .line 6
    .line 7
    aget-object v2, p1, v1

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v3, p0, Led/c;->b:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v2}, Lqd/j;->l()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Led/b;

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    iget-object v4, p0, Led/c;->e:Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-virtual {v2}, Lqd/j;->l()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    if-eqz v3, :cond_2

    .line 36
    .line 37
    iget-object v2, v3, Led/b;->a:Lqd/j;

    .line 38
    .line 39
    invoke-virtual {v2}, Lqd/j;->l()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p2, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0, v3, p2}, Led/c;->b(Led/b;Ljava/util/HashSet;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {v2}, Lqd/j;->l()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p2, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    return-void
.end method

.method public final c(Lqd/j;)Led/b;
    .locals 1

    .line 1
    iget-object v0, p0, Led/c;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Led/b;

    .line 12
    .line 13
    return-object p1
.end method

.method public final d(Ljava/lang/String;)Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Led/c;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/Set;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 12
    .line 13
    :cond_0
    return-object p1
.end method

.method public final e()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p0, Led/c;->b:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Led/c;->b:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Led/b;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v3, v1}, Led/c;->b(Led/b;Ljava/util/HashSet;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    const/4 v5, 0x1

    .line 58
    if-eq v4, v5, :cond_0

    .line 59
    .line 60
    new-instance v4, Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Ljava/lang/String;

    .line 75
    .line 76
    const-string v5, "java.lang.Object"

    .line 77
    .line 78
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_1

    .line 83
    .line 84
    sget-object v4, Led/c;->f:Ljava/util/Set;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-static {v4}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    sget-object v4, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 93
    .line 94
    :goto_1
    iget-object v3, v3, Led/b;->a:Lqd/j;

    .line 95
    .line 96
    invoke-virtual {v3}, Lqd/j;->l()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    iput-object v0, p0, Led/c;->c:Ljava/util/HashMap;

    .line 105
    .line 106
    new-instance v0, Ljava/util/HashMap;

    .line 107
    .line 108
    iget-object v1, p0, Led/c;->b:Ljava/util/HashMap;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 115
    .line 116
    .line 117
    new-instance v1, Ljava/util/ArrayList;

    .line 118
    .line 119
    iget-object v2, p0, Led/c;->b:Ljava/util/HashMap;

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_5

    .line 140
    .line 141
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p0, v2}, Led/c;->d(Ljava/lang/String;)Ljava/util/Set;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_4

    .line 160
    .line 161
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    check-cast v4, Ljava/lang/String;

    .line 166
    .line 167
    new-instance v5, Lcom/alibaba/fastjson2/writer/b;

    .line 168
    .line 169
    const/16 v6, 0xf

    .line 170
    .line 171
    invoke-direct {v5, v6}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_5
    iput-object v0, p0, Led/c;->d:Ljava/util/HashMap;

    .line 185
    .line 186
    return-void
.end method

.method public final f()V
    .locals 7

    .line 1
    new-instance v0, Led/a;

    .line 2
    .line 3
    iget-object v1, p0, Led/c;->a:Lud/u;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Led/a;-><init>(Lud/u;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    const-class v3, Led/a;

    .line 13
    .line 14
    const-string v4, "/clst/core.jcst"

    .line 15
    .line 16
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v0, v3}, Led/a;->a(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 26
    .line 27
    .line 28
    sget-object v3, Led/a;->d:Lmh/b;

    .line 29
    .line 30
    invoke-interface {v3}, Lmh/b;->d()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    sub-long/2addr v4, v1

    .line 41
    iget-object v1, v0, Led/a;->c:[Led/b;

    .line 42
    .line 43
    invoke-static {v1}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Lae/a;

    .line 48
    .line 49
    const/16 v6, 0x8

    .line 50
    .line 51
    invoke-direct {v2, v6}, Lae/a;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->mapToInt(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, Ljava/util/stream/IntStream;->sum()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget v4, v0, Led/a;->b:I

    .line 67
    .line 68
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget-object v5, v0, Led/a;->c:[Led/b;

    .line 73
    .line 74
    array-length v5, v5

    .line 75
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    filled-new-array {v2, v4, v5, v1}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v2, "Clst file loaded in {}ms, android api: {}, classes: {}, methods: {}"

    .line 88
    .line 89
    invoke-interface {v3, v2, v1}, Lmh/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_0
    iget-object v1, p0, Led/c;->b:Ljava/util/HashMap;

    .line 93
    .line 94
    if-nez v1, :cond_2

    .line 95
    .line 96
    new-instance v1, Ljava/util/HashMap;

    .line 97
    .line 98
    iget-object v2, v0, Led/a;->c:[Led/b;

    .line 99
    .line 100
    array-length v2, v2

    .line 101
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, Led/c;->b:Ljava/util/HashMap;

    .line 105
    .line 106
    iget-object v0, v0, Led/a;->c:[Led/b;

    .line 107
    .line 108
    array-length v2, v0

    .line 109
    const/4 v3, 0x0

    .line 110
    :goto_0
    if-ge v3, v2, :cond_1

    .line 111
    .line 112
    aget-object v4, v0, v3

    .line 113
    .line 114
    iget-object v5, v4, Led/b;->a:Lqd/j;

    .line 115
    .line 116
    invoke-virtual {v5}, Lqd/j;->l()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    return-void

    .line 127
    :cond_2
    const-string v0, "Classpath already loaded"

    .line 128
    .line 129
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    goto :goto_1

    .line 135
    :cond_3
    :try_start_1
    new-instance v0, Laf/g;

    .line 136
    .line 137
    const-string v1, "Can\'t load classpath file: /clst/core.jcst"

    .line 138
    .line 139
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    :goto_1
    if-eqz v3, :cond_4

    .line 144
    .line 145
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catchall_1
    move-exception v1

    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    :goto_2
    throw v0
.end method
