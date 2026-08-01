.class public final LT/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LV/h;

.field public final b:I

.field public final c:LT/a;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public g:Z

.field public final h:I

.field public final i:I

.field public final j:Z

.field public k:Z

.field public final l:Z

.field public final m:LT/t;

.field public final n:LT/u;

.field public final o:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LV/h;->c:LV/h;

    .line 5
    .line 6
    iput-object v0, p0, LT/m;->a:LV/h;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput v0, p0, LT/m;->b:I

    .line 10
    .line 11
    sget-object v1, LT/h;->a:LT/a;

    .line 12
    .line 13
    iput-object v1, p0, LT/m;->c:LT/a;

    .line 14
    .line 15
    new-instance v1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LT/m;->d:Ljava/util/HashMap;

    .line 21
    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, LT/m;->e:Ljava/util/ArrayList;

    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, LT/m;->f:Ljava/util/ArrayList;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    iput-boolean v1, p0, LT/m;->g:Z

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    iput v2, p0, LT/m;->h:I

    .line 41
    .line 42
    iput v2, p0, LT/m;->i:I

    .line 43
    .line 44
    iput-boolean v0, p0, LT/m;->j:Z

    .line 45
    .line 46
    iput-boolean v1, p0, LT/m;->k:Z

    .line 47
    .line 48
    iput-boolean v0, p0, LT/m;->l:Z

    .line 49
    .line 50
    sget-object v0, LT/x;->a:LT/t;

    .line 51
    .line 52
    iput-object v0, p0, LT/m;->m:LT/t;

    .line 53
    .line 54
    sget-object v0, LT/x;->b:LT/u;

    .line 55
    .line 56
    iput-object v0, p0, LT/m;->n:LT/u;

    .line 57
    .line 58
    new-instance v0, Ljava/util/LinkedList;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, LT/m;->o:Ljava/util/LinkedList;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final a()LT/l;
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v10, Ljava/util/ArrayList;

    .line 3
    .line 4
    iget-object v1, p0, LT/m;->e:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    iget-object v3, p0, LT/m;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    add-int/2addr v4, v2

    .line 17
    add-int/lit8 v4, v4, 0x3

    .line 18
    .line 19
    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    invoke-static {v10}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 37
    .line 38
    .line 39
    sget-boolean v2, LZ/c;->a:Z

    .line 40
    .line 41
    sget-object v4, LW/f;->b:LW/e;

    .line 42
    .line 43
    iget v5, p0, LT/m;->h:I

    .line 44
    .line 45
    const/4 v6, 0x2

    .line 46
    if-eq v5, v6, :cond_1

    .line 47
    .line 48
    iget v7, p0, LT/m;->i:I

    .line 49
    .line 50
    if-eq v7, v6, :cond_1

    .line 51
    .line 52
    new-instance v6, LW/b;

    .line 53
    .line 54
    invoke-direct {v6, v4, v5, v7}, LW/b;-><init>(LW/f;II)V

    .line 55
    .line 56
    .line 57
    sget-object v4, LW/x;->a:LW/t;

    .line 58
    .line 59
    new-instance v4, LW/t;

    .line 60
    .line 61
    const-class v8, Ljava/util/Date;

    .line 62
    .line 63
    invoke-direct {v4, v8, v6, v0}, LW/t;-><init>(Ljava/lang/Class;LT/y;I)V

    .line 64
    .line 65
    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    sget-object v6, LZ/c;->c:LZ/b;

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v8, LW/b;

    .line 74
    .line 75
    invoke-direct {v8, v6, v5, v7}, LW/b;-><init>(LW/f;II)V

    .line 76
    .line 77
    .line 78
    new-instance v9, LW/t;

    .line 79
    .line 80
    iget-object v6, v6, LW/f;->a:Ljava/lang/Class;

    .line 81
    .line 82
    invoke-direct {v9, v6, v8, v0}, LW/t;-><init>(Ljava/lang/Class;LT/y;I)V

    .line 83
    .line 84
    .line 85
    sget-object v6, LZ/c;->b:LZ/b;

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v8, LW/b;

    .line 91
    .line 92
    invoke-direct {v8, v6, v5, v7}, LW/b;-><init>(LW/f;II)V

    .line 93
    .line 94
    .line 95
    new-instance v5, LW/t;

    .line 96
    .line 97
    iget-object v6, v6, LW/f;->a:Ljava/lang/Class;

    .line 98
    .line 99
    invoke-direct {v5, v6, v8, v0}, LW/t;-><init>(Ljava/lang/Class;LT/y;I)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    const/4 v9, 0x0

    .line 104
    move-object v5, v9

    .line 105
    :goto_0
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    if-eqz v2, :cond_1

    .line 109
    .line 110
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :cond_1
    move-object v0, v1

    .line 117
    new-instance v1, LT/l;

    .line 118
    .line 119
    move-object v2, v3

    .line 120
    iget-object v3, p0, LT/m;->c:LT/a;

    .line 121
    .line 122
    new-instance v4, Ljava/util/HashMap;

    .line 123
    .line 124
    iget-object v5, p0, LT/m;->d:Ljava/util/HashMap;

    .line 125
    .line 126
    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 127
    .line 128
    .line 129
    iget-boolean v5, p0, LT/m;->g:Z

    .line 130
    .line 131
    iget-boolean v7, p0, LT/m;->k:Z

    .line 132
    .line 133
    iget v9, p0, LT/m;->b:I

    .line 134
    .line 135
    new-instance v6, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 138
    .line 139
    .line 140
    new-instance v0, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 143
    .line 144
    .line 145
    iget-object v11, p0, LT/m;->m:LT/t;

    .line 146
    .line 147
    iget-object v12, p0, LT/m;->n:LT/u;

    .line 148
    .line 149
    new-instance v13, Ljava/util/ArrayList;

    .line 150
    .line 151
    iget-object v0, p0, LT/m;->o:Ljava/util/LinkedList;

    .line 152
    .line 153
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 154
    .line 155
    .line 156
    iget-object v2, p0, LT/m;->a:LV/h;

    .line 157
    .line 158
    iget-boolean v6, p0, LT/m;->j:Z

    .line 159
    .line 160
    iget-boolean v8, p0, LT/m;->l:Z

    .line 161
    .line 162
    invoke-direct/range {v1 .. v13}, LT/l;-><init>(LV/h;LT/h;Ljava/util/HashMap;ZZZZILjava/util/ArrayList;LT/x;LT/x;Ljava/util/ArrayList;)V

    .line 163
    .line 164
    .line 165
    return-object v1
.end method
