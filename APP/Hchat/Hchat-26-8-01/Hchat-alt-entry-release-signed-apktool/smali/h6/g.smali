.class public final Lh6/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Lj6/d;

.field public final b:I

.field public c:I

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:I

.field public final h:I

.field public i:Z

.field public j:Lh6/a;

.field public k:I

.field public l:Z

.field public final m:I

.field public final n:I

.field public final o:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lj6/d;->j:Lj6/d;

    .line 5
    .line 6
    iput-object v0, p0, Lh6/g;->a:Lj6/d;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput v0, p0, Lh6/g;->b:I

    .line 10
    .line 11
    iput v0, p0, Lh6/g;->c:I

    .line 12
    .line 13
    new-instance v1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lh6/g;->d:Ljava/util/HashMap;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lh6/g;->e:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lh6/g;->f:Ljava/util/ArrayList;

    .line 33
    .line 34
    sget-object v1, Lh6/f;->i:Lh6/a;

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    iput v1, p0, Lh6/g;->g:I

    .line 38
    .line 39
    iput v1, p0, Lh6/g;->h:I

    .line 40
    .line 41
    iput-boolean v0, p0, Lh6/g;->i:Z

    .line 42
    .line 43
    sget-object v1, Lh6/f;->i:Lh6/a;

    .line 44
    .line 45
    iput-object v1, p0, Lh6/g;->j:Lh6/a;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    iput v1, p0, Lh6/g;->k:I

    .line 49
    .line 50
    iput-boolean v0, p0, Lh6/g;->l:Z

    .line 51
    .line 52
    sget v0, Lh6/f;->j:I

    .line 53
    .line 54
    iput v0, p0, Lh6/g;->m:I

    .line 55
    .line 56
    sget v0, Lh6/f;->k:I

    .line 57
    .line 58
    iput v0, p0, Lh6/g;->n:I

    .line 59
    .line 60
    new-instance v0, Ljava/util/ArrayDeque;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lh6/g;->o:Ljava/util/ArrayDeque;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final a()Lh6/f;
    .locals 13

    .line 1
    new-instance v9, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v0, p0, Lh6/g;->e:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lh6/g;->f:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    add-int/2addr v3, v1

    .line 16
    add-int/lit8 v3, v3, 0x3

    .line 17
    .line 18
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    invoke-static {v9}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 36
    .line 37
    .line 38
    sget-boolean v1, Lm6/f;->a:Z

    .line 39
    .line 40
    iget v3, p0, Lh6/g;->g:I

    .line 41
    .line 42
    iget v4, p0, Lh6/g;->h:I

    .line 43
    .line 44
    const/4 v5, 0x2

    .line 45
    if-ne v3, v5, :cond_0

    .line 46
    .line 47
    if-eq v4, v5, :cond_2

    .line 48
    .line 49
    :cond_0
    new-instance v5, Lk6/h;

    .line 50
    .line 51
    sget-object v6, Lk6/g;->b:Lk6/f;

    .line 52
    .line 53
    invoke-direct {v5, v6, v3, v4}, Lk6/h;-><init>(Lk6/g;II)V

    .line 54
    .line 55
    .line 56
    sget-object v6, Lk6/c1;->a:Lk6/s0;

    .line 57
    .line 58
    new-instance v6, Lk6/s0;

    .line 59
    .line 60
    const-class v7, Ljava/util/Date;

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    invoke-direct {v6, v7, v5, v8}, Lk6/s0;-><init>(Ljava/lang/Class;Lh6/n;I)V

    .line 64
    .line 65
    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    sget-object v5, Lm6/f;->c:Lm6/e;

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v7, Lk6/h;

    .line 74
    .line 75
    invoke-direct {v7, v5, v3, v4}, Lk6/h;-><init>(Lk6/g;II)V

    .line 76
    .line 77
    .line 78
    iget-object v5, v5, Lk6/g;->a:Ljava/lang/Class;

    .line 79
    .line 80
    new-instance v10, Lk6/s0;

    .line 81
    .line 82
    invoke-direct {v10, v5, v7, v8}, Lk6/s0;-><init>(Ljava/lang/Class;Lh6/n;I)V

    .line 83
    .line 84
    .line 85
    sget-object v5, Lm6/f;->b:Lm6/e;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v7, Lk6/h;

    .line 91
    .line 92
    invoke-direct {v7, v5, v3, v4}, Lk6/h;-><init>(Lk6/g;II)V

    .line 93
    .line 94
    .line 95
    iget-object v3, v5, Lk6/g;->a:Ljava/lang/Class;

    .line 96
    .line 97
    new-instance v4, Lk6/s0;

    .line 98
    .line 99
    invoke-direct {v4, v3, v7, v8}, Lk6/s0;-><init>(Ljava/lang/Class;Lh6/n;I)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const/4 v10, 0x0

    .line 104
    move-object v4, v10

    .line 105
    :goto_0
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :cond_2
    move-object v1, v0

    .line 117
    new-instance v0, Lh6/f;

    .line 118
    .line 119
    move-object v3, v1

    .line 120
    iget-object v1, p0, Lh6/g;->a:Lj6/d;

    .line 121
    .line 122
    move-object v4, v2

    .line 123
    iget v2, p0, Lh6/g;->c:I

    .line 124
    .line 125
    move-object v5, v3

    .line 126
    new-instance v3, Ljava/util/HashMap;

    .line 127
    .line 128
    iget-object v6, p0, Lh6/g;->d:Ljava/util/HashMap;

    .line 129
    .line 130
    invoke-direct {v3, v6}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 131
    .line 132
    .line 133
    move-object v6, v4

    .line 134
    iget-boolean v4, p0, Lh6/g;->i:Z

    .line 135
    .line 136
    move-object v7, v5

    .line 137
    iget-object v5, p0, Lh6/g;->j:Lh6/a;

    .line 138
    .line 139
    move-object v8, v6

    .line 140
    iget v6, p0, Lh6/g;->k:I

    .line 141
    .line 142
    move-object v10, v7

    .line 143
    iget-boolean v7, p0, Lh6/g;->l:Z

    .line 144
    .line 145
    new-instance v11, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 148
    .line 149
    .line 150
    new-instance v10, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v10, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 153
    .line 154
    .line 155
    new-instance v12, Ljava/util/ArrayList;

    .line 156
    .line 157
    iget-object v8, p0, Lh6/g;->o:Ljava/util/ArrayDeque;

    .line 158
    .line 159
    invoke-direct {v12, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 160
    .line 161
    .line 162
    iget v8, p0, Lh6/g;->b:I

    .line 163
    .line 164
    iget v10, p0, Lh6/g;->m:I

    .line 165
    .line 166
    iget v11, p0, Lh6/g;->n:I

    .line 167
    .line 168
    invoke-direct/range {v0 .. v12}, Lh6/f;-><init>(Lj6/d;ILjava/util/HashMap;ZLh6/a;IZILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 169
    .line 170
    .line 171
    return-object v0
.end method
