.class public final Lzg0;
.super Lq43;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public volatile a:Lq43;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lir0;

.field public final synthetic e:Lj63;

.field public final synthetic f:Lah0;


# direct methods
.method public constructor <init>(Lah0;ZZLir0;Lj63;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzg0;->f:Lah0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lzg0;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lzg0;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, Lzg0;->d:Lir0;

    .line 11
    .line 12
    iput-object p5, p0, Lzg0;->e:Lj63;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Ll41;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-boolean v0, p0, Lzg0;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ll41;->P()V

    .line 7
    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    iget-object v0, p0, Lzg0;->a:Lq43;

    .line 11
    .line 12
    if-nez v0, :cond_b

    .line 13
    .line 14
    iget-object v0, p0, Lzg0;->d:Lir0;

    .line 15
    .line 16
    iget-object v2, p0, Lzg0;->f:Lah0;

    .line 17
    .line 18
    iget-object v3, p0, Lzg0;->e:Lj63;

    .line 19
    .line 20
    iget-object v4, v0, Lir0;->d:Lx21;

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v5, v4, Lx21;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    sget-object v6, Lx21;->j:Lw21;

    .line 28
    .line 29
    const/4 v7, 0x1

    .line 30
    if-ne v2, v6, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v6, v3, Lj63;->a:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, Lr43;

    .line 40
    .line 41
    if-eqz v8, :cond_2

    .line 42
    .line 43
    if-ne v8, v2, :cond_6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const-class v8, Lv21;

    .line 47
    .line 48
    invoke-virtual {v6, v8}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    check-cast v8, Lv21;

    .line 53
    .line 54
    if-nez v8, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-interface {v8}, Lv21;->value()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    const-class v9, Lr43;

    .line 62
    .line 63
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-nez v9, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    iget-object v9, v4, Lx21;->h:Lsz0;

    .line 71
    .line 72
    new-instance v10, Lj63;

    .line 73
    .line 74
    invoke-direct {v10, v8}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9, v10, v7}, Lsz0;->D(Lj63;Z)Lgs1;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-interface {v8}, Lgs1;->a()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    check-cast v8, Lr43;

    .line 86
    .line 87
    invoke-virtual {v5, v6, v8}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Lr43;

    .line 92
    .line 93
    if-eqz v5, :cond_5

    .line 94
    .line 95
    move-object v8, v5

    .line 96
    :cond_5
    if-ne v8, v2, :cond_6

    .line 97
    .line 98
    :goto_0
    move-object v2, v4

    .line 99
    :cond_6
    :goto_1
    iget-object v4, v0, Lir0;->e:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const/4 v5, 0x0

    .line 106
    :cond_7
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_9

    .line 111
    .line 112
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, Lr43;

    .line 117
    .line 118
    if-nez v5, :cond_8

    .line 119
    .line 120
    if-ne v6, v2, :cond_7

    .line 121
    .line 122
    move v5, v7

    .line 123
    goto :goto_2

    .line 124
    :cond_8
    invoke-interface {v6, v0, v3}, Lr43;->a(Lir0;Lj63;)Lq43;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    if-eqz v6, :cond_7

    .line 129
    .line 130
    move-object v0, v6

    .line 131
    goto :goto_3

    .line 132
    :cond_9
    if-nez v5, :cond_a

    .line 133
    .line 134
    invoke-virtual {v0, v3}, Lir0;->c(Lj63;)Lq43;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :goto_3
    iput-object v0, p0, Lzg0;->a:Lq43;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_a
    const-string p0, "GSON cannot serialize or deserialize "

    .line 142
    .line 143
    invoke-static {p0, v3}, Ls;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-object v1

    .line 147
    :cond_b
    :goto_4
    invoke-virtual {v0, p1}, Lq43;->b(Ll41;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0
.end method

.method public final c(Lo41;Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lzg0;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lo41;->p()Lo41;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lzg0;->a:Lq43;

    .line 10
    .line 11
    if-nez v0, :cond_b

    .line 12
    .line 13
    iget-object v0, p0, Lzg0;->d:Lir0;

    .line 14
    .line 15
    iget-object v1, p0, Lzg0;->f:Lah0;

    .line 16
    .line 17
    iget-object v2, p0, Lzg0;->e:Lj63;

    .line 18
    .line 19
    iget-object v3, v0, Lir0;->d:Lx21;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v4, v3, Lx21;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    sget-object v5, Lx21;->j:Lw21;

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    if-ne v1, v5, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v5, v2, Lj63;->a:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Lr43;

    .line 39
    .line 40
    if-eqz v7, :cond_2

    .line 41
    .line 42
    if-ne v7, v1, :cond_6

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const-class v7, Lv21;

    .line 46
    .line 47
    invoke-virtual {v5, v7}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    check-cast v7, Lv21;

    .line 52
    .line 53
    if-nez v7, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-interface {v7}, Lv21;->value()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    const-class v8, Lr43;

    .line 61
    .line 62
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-nez v8, :cond_4

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    iget-object v8, v3, Lx21;->h:Lsz0;

    .line 70
    .line 71
    new-instance v9, Lj63;

    .line 72
    .line 73
    invoke-direct {v9, v7}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8, v9, v6}, Lsz0;->D(Lj63;Z)Lgs1;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-interface {v7}, Lgs1;->a()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Lr43;

    .line 85
    .line 86
    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Lr43;

    .line 91
    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    move-object v7, v4

    .line 95
    :cond_5
    if-ne v7, v1, :cond_6

    .line 96
    .line 97
    :goto_0
    move-object v1, v3

    .line 98
    :cond_6
    :goto_1
    iget-object v3, v0, Lir0;->e:Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const/4 v4, 0x0

    .line 105
    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_9

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    check-cast v5, Lr43;

    .line 116
    .line 117
    if-nez v4, :cond_8

    .line 118
    .line 119
    if-ne v5, v1, :cond_7

    .line 120
    .line 121
    move v4, v6

    .line 122
    goto :goto_2

    .line 123
    :cond_8
    invoke-interface {v5, v0, v2}, Lr43;->a(Lir0;Lj63;)Lq43;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    if-eqz v5, :cond_7

    .line 128
    .line 129
    move-object v0, v5

    .line 130
    goto :goto_3

    .line 131
    :cond_9
    if-nez v4, :cond_a

    .line 132
    .line 133
    invoke-virtual {v0, v2}, Lir0;->c(Lj63;)Lq43;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :goto_3
    iput-object v0, p0, Lzg0;->a:Lq43;

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_a
    const-string p0, "GSON cannot serialize or deserialize "

    .line 141
    .line 142
    invoke-static {p0, v2}, Ls;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_b
    :goto_4
    invoke-virtual {v0, p1, p2}, Lq43;->c(Lo41;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method
