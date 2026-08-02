.class public final Lwj2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final h:Ljava/util/Set;


# instance fields
.field public final a:Lhh1;

.field public final b:Lc20;

.field public final c:Ljava/time/Clock;

.field public final d:Lb5;

.field public final e:Lkl1;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:Llq2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lrk2;->l:Lrk2;

    .line 2
    .line 3
    sget-object v1, Lrk2;->m:Lrk2;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lrk2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lwj2;->h:Ljava/util/Set;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lkj1;Lb5;)V
    .locals 4

    .line 1
    sget-object v0, Lo90;->a:Lc60;

    .line 2
    .line 3
    sget-object v0, Lt50;->j:Lt50;

    .line 4
    .line 5
    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v2, Lhh1;

    .line 16
    .line 17
    const/16 v3, 0x9

    .line 18
    .line 19
    invoke-direct {v2, v3, p1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, Lwj2;->a:Lhh1;

    .line 26
    .line 27
    iput-object v0, p0, Lwj2;->b:Lc20;

    .line 28
    .line 29
    iput-object v1, p0, Lwj2;->c:Ljava/time/Clock;

    .line 30
    .line 31
    iput-object p2, p0, Lwj2;->d:Lb5;

    .line 32
    .line 33
    new-instance p1, Lkl1;

    .line 34
    .line 35
    invoke-direct {p1}, Lkl1;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lwj2;->e:Lkl1;

    .line 39
    .line 40
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lwj2;->f:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    const/16 p1, 0x40

    .line 48
    .line 49
    sget-object p2, Lhn;->i:Lhn;

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    invoke-static {p1, v0, p2}, Lp7;->e(IILhn;)Llq2;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lwj2;->g:Llq2;

    .line 57
    .line 58
    return-void
.end method

.method public static h(Lz80;Lxj2;Lfj2;Ljava/lang/String;Ljava/lang/Throwable;)Lej2;
    .locals 6

    .line 1
    new-instance v0, Lej2;

    .line 2
    .line 3
    iget-object p0, p0, Lz80;->b:Lth2;

    .line 4
    .line 5
    iget-object v1, p0, Lth2;->c:Ljava/lang/String;

    .line 6
    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move-object v5, p4

    .line 11
    invoke-direct/range {v0 .. v5}, Lej2;-><init>(Ljava/lang/String;Lxj2;Lfj2;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static q(Lz80;Ljava/io/File;Lxi2;Lxj2;)Lz80;
    .locals 9

    .line 1
    iget-object v0, p2, Lxi2;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    move-object v3, v1

    .line 19
    check-cast v3, Lz80;

    .line 20
    .line 21
    iget-object v3, v3, Lz80;->a:Ljava/io/File;

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v1, v2

    .line 31
    :goto_0
    check-cast v1, Lz80;

    .line 32
    .line 33
    sget-object v6, Lfj2;->k:Lfj2;

    .line 34
    .line 35
    if-nez v1, :cond_9

    .line 36
    .line 37
    iget-object p2, p2, Lxi2;->b:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v1, v0

    .line 54
    check-cast v1, Lzf2;

    .line 55
    .line 56
    iget-object v1, v1, Lzf2;->a:Ljava/io/File;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v3, p0, Lz80;->a:Ljava/io/File;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move-object v0, v2

    .line 76
    :goto_1
    check-cast v0, Lzf2;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    sget-object v6, Lfj2;->i:Lfj2;

    .line 86
    .line 87
    :goto_2
    if-eqz v0, :cond_5

    .line 88
    .line 89
    iget-object p2, v0, Lzf2;->c:Ljava/lang/String;

    .line 90
    .line 91
    if-nez p2, :cond_7

    .line 92
    .line 93
    :cond_5
    if-eqz p1, :cond_6

    .line 94
    .line 95
    const-string p2, "The discovered directory is no longer a valid script."

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    const-string p2, "The discovered script directory no longer exists."

    .line 99
    .line 100
    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    .line 101
    .line 102
    iget-object v2, v0, Lzf2;->d:Ljava/lang/Throwable;

    .line 103
    .line 104
    :cond_8
    invoke-static {p0, p3, v6, p2, v2}, Lwj2;->h(Lz80;Lxj2;Lfj2;Ljava/lang/String;Ljava/lang/Throwable;)Lej2;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    throw p0

    .line 109
    :cond_9
    iget-object p1, v1, Lz80;->b:Lth2;

    .line 110
    .line 111
    iget-object v0, p0, Lz80;->b:Lth2;

    .line 112
    .line 113
    iget-object p0, p0, Lz80;->b:Lth2;

    .line 114
    .line 115
    invoke-static {p1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_d

    .line 120
    .line 121
    iget-object p1, p0, Lth2;->c:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object p2, p2, Lxi2;->a:Ljava/util/List;

    .line 127
    .line 128
    new-instance v0, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    :cond_a
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_b

    .line 142
    .line 143
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    move-object v3, v2

    .line 148
    check-cast v3, Lz80;

    .line 149
    .line 150
    iget-object v3, v3, Lz80;->b:Lth2;

    .line 151
    .line 152
    iget-object v3, v3, Lth2;->c:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v3, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_a

    .line 159
    .line 160
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    const/4 p2, 0x1

    .line 169
    if-gt p1, p2, :cond_c

    .line 170
    .line 171
    return-object v1

    .line 172
    :cond_c
    new-instance v2, Lej2;

    .line 173
    .line 174
    iget-object v3, p0, Lth2;->c:Ljava/lang/String;

    .line 175
    .line 176
    sget-object v5, Lfj2;->j:Lfj2;

    .line 177
    .line 178
    const-string v6, "Multiple script directories currently declare this id."

    .line 179
    .line 180
    const/4 v7, 0x0

    .line 181
    move-object v4, p3

    .line 182
    invoke-direct/range {v2 .. v7}, Lej2;-><init>(Ljava/lang/String;Lxj2;Lfj2;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    throw v2

    .line 186
    :cond_d
    move-object v4, p3

    .line 187
    new-instance v3, Lej2;

    .line 188
    .line 189
    iget-object p0, p0, Lth2;->c:Ljava/lang/String;

    .line 190
    .line 191
    const-string v7, "The script manifest changed after it was discovered."

    .line 192
    .line 193
    const/4 v8, 0x0

    .line 194
    move-object v5, v4

    .line 195
    move-object v4, p0

    .line 196
    invoke-direct/range {v3 .. v8}, Lej2;-><init>(Ljava/lang/String;Lxj2;Lfj2;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    throw v3
.end method


# virtual methods
.method public final a(Lu00;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Ljj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ljj2;

    .line 7
    .line 8
    iget v1, v0, Ljj2;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ljj2;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljj2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ljj2;-><init>(Lwj2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ljj2;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ljj2;->r:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    sget-object v5, Lk20;->h:Lk20;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Ljj2;->o:Lil1;

    .line 41
    .line 42
    iget-object v1, v0, Ljj2;->n:Lhj2;

    .line 43
    .line 44
    iget-object v3, v0, Ljj2;->m:Ljava/util/Iterator;

    .line 45
    .line 46
    iget-object v6, v0, Ljj2;->l:Ljava/util/Collection;

    .line 47
    .line 48
    check-cast v6, Ljava/util/Collection;

    .line 49
    .line 50
    iget-object v7, v0, Ljj2;->k:Lkl1;

    .line 51
    .line 52
    check-cast v7, Ljava/util/List;

    .line 53
    .line 54
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v4

    .line 64
    :cond_2
    iget-object v1, v0, Ljj2;->k:Lkl1;

    .line 65
    .line 66
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lwj2;->e:Lkl1;

    .line 74
    .line 75
    iput-object v1, v0, Ljj2;->k:Lkl1;

    .line 76
    .line 77
    iput v3, v0, Ljj2;->r:I

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v5, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    :goto_1
    :try_start_0
    iget-object p0, p0, Lwj2;->f:Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast p0, Ljava/lang/Iterable;

    .line 96
    .line 97
    invoke-static {p0}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 101
    invoke-virtual {v1, v4}, Lkl1;->f(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance p1, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    move-object v3, p0

    .line 114
    move-object v6, p1

    .line 115
    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_8

    .line 120
    .line 121
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    move-object v1, p0

    .line 126
    check-cast v1, Lhj2;

    .line 127
    .line 128
    iget-object p0, v1, Lhj2;->a:Lil1;

    .line 129
    .line 130
    iput-object v4, v0, Ljj2;->k:Lkl1;

    .line 131
    .line 132
    move-object p1, v6

    .line 133
    check-cast p1, Ljava/util/Collection;

    .line 134
    .line 135
    iput-object p1, v0, Ljj2;->l:Ljava/util/Collection;

    .line 136
    .line 137
    iput-object v3, v0, Ljj2;->m:Ljava/util/Iterator;

    .line 138
    .line 139
    iput-object v1, v0, Ljj2;->n:Lhj2;

    .line 140
    .line 141
    iput-object p0, v0, Ljj2;->o:Lil1;

    .line 142
    .line 143
    iput v2, v0, Ljj2;->r:I

    .line 144
    .line 145
    check-cast p0, Lkl1;

    .line 146
    .line 147
    invoke-virtual {p0, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-ne p1, v5, :cond_6

    .line 152
    .line 153
    :goto_3
    return-object v5

    .line 154
    :cond_6
    :goto_4
    :try_start_1
    invoke-virtual {v1}, Lhj2;->a()Lgj2;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-eqz p1, :cond_7

    .line 159
    .line 160
    iget-object p1, p1, Lgj2;->b:Lf52;

    .line 161
    .line 162
    if-eqz p1, :cond_7

    .line 163
    .line 164
    iget-object p1, p1, Lf52;->h:Lu22;

    .line 165
    .line 166
    if-eqz p1, :cond_7

    .line 167
    .line 168
    iget-object p1, p1, Lu22;->a:Lth2;

    .line 169
    .line 170
    iget-object p1, p1, Lth2;->c:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :catchall_0
    move-exception p1

    .line 174
    goto :goto_6

    .line 175
    :cond_7
    move-object p1, v4

    .line 176
    :goto_5
    check-cast p0, Lkl1;

    .line 177
    .line 178
    invoke-virtual {p0, v4}, Lkl1;->f(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    if-eqz p1, :cond_5

    .line 182
    .line 183
    invoke-interface {v6, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :goto_6
    check-cast p0, Lkl1;

    .line 188
    .line 189
    invoke-virtual {p0, v4}, Lkl1;->f(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    throw p1

    .line 193
    :cond_8
    check-cast v6, Ljava/util/List;

    .line 194
    .line 195
    invoke-static {v6}, Ldu;->n0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-static {p0}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :catchall_1
    move-exception p0

    .line 205
    invoke-virtual {v1, v4}, Lkl1;->f(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    throw p0
.end method

.method public final b(Ljava/lang/String;Lci2;Lu00;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Lkj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lkj2;

    .line 7
    .line 8
    iget v1, v0, Lkj2;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkj2;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkj2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lkj2;-><init>(Lwj2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lkj2;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lkj2;->p:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    sget-object v6, Lk20;->h:Lk20;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v4, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, Lkj2;->m:Lil1;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_4

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_6

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :cond_2
    iget-object p0, v0, Lkj2;->m:Lil1;

    .line 58
    .line 59
    iget-object p1, v0, Lkj2;->l:Lhj2;

    .line 60
    .line 61
    iget-object p2, v0, Lkj2;->k:Lci2;

    .line 62
    .line 63
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    iget-object p2, v0, Lkj2;->k:Lci2;

    .line 68
    .line 69
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iput-object p2, v0, Lkj2;->k:Lci2;

    .line 77
    .line 78
    iput v4, v0, Lkj2;->p:I

    .line 79
    .line 80
    invoke-virtual {p0, p1, v0}, Lwj2;->c(Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    if-ne p3, v6, :cond_5

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    :goto_1
    move-object p1, p3

    .line 88
    check-cast p1, Lhj2;

    .line 89
    .line 90
    if-nez p1, :cond_6

    .line 91
    .line 92
    return-object v5

    .line 93
    :cond_6
    iget-object p0, p1, Lhj2;->a:Lil1;

    .line 94
    .line 95
    iput-object p2, v0, Lkj2;->k:Lci2;

    .line 96
    .line 97
    iput-object p1, v0, Lkj2;->l:Lhj2;

    .line 98
    .line 99
    iput-object p0, v0, Lkj2;->m:Lil1;

    .line 100
    .line 101
    iput v3, v0, Lkj2;->p:I

    .line 102
    .line 103
    check-cast p0, Lkl1;

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    if-ne p3, v6, :cond_7

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_7
    :goto_2
    :try_start_1
    invoke-virtual {p1}, Lhj2;->a()Lgj2;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-eqz p1, :cond_9

    .line 117
    .line 118
    iget-object p1, p1, Lgj2;->b:Lf52;

    .line 119
    .line 120
    if-eqz p1, :cond_9

    .line 121
    .line 122
    iput-object v5, v0, Lkj2;->k:Lci2;

    .line 123
    .line 124
    iput-object v5, v0, Lkj2;->l:Lhj2;

    .line 125
    .line 126
    iput-object p0, v0, Lkj2;->m:Lil1;

    .line 127
    .line 128
    iput v2, v0, Lkj2;->p:I

    .line 129
    .line 130
    invoke-virtual {p1, p2, v0}, Lf52;->e(Lci2;Lu00;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    if-ne p3, v6, :cond_8

    .line 135
    .line 136
    :goto_3
    return-object v6

    .line 137
    :cond_8
    :goto_4
    check-cast p3, Lbi2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_9
    move-object p3, v5

    .line 141
    :goto_5
    check-cast p0, Lkl1;

    .line 142
    .line 143
    invoke-virtual {p0, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-object p3

    .line 147
    :goto_6
    check-cast p0, Lkl1;

    .line 148
    .line 149
    invoke-virtual {p0, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    throw p1
.end method

.method public final c(Ljava/lang/String;Lu00;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Llj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Llj2;

    .line 7
    .line 8
    iget v1, v0, Llj2;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Llj2;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Llj2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Llj2;-><init>(Lwj2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Llj2;->m:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Llj2;->o:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Llj2;->l:Lkl1;

    .line 36
    .line 37
    iget-object v0, v0, Llj2;->k:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object p2, p1

    .line 43
    move-object p1, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, v0, Llj2;->k:Ljava/lang/String;

    .line 55
    .line 56
    iget-object p2, p0, Lwj2;->e:Lkl1;

    .line 57
    .line 58
    iput-object p2, v0, Llj2;->l:Lkl1;

    .line 59
    .line 60
    iput v2, v0, Llj2;->o:I

    .line 61
    .line 62
    invoke-virtual {p2, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sget-object v1, Lk20;->h:Lk20;

    .line 67
    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    :try_start_0
    iget-object p0, p0, Lwj2;->f:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Lhj2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    invoke-virtual {p2, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    invoke-virtual {p2, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    throw p0
.end method

.method public final d(Lz80;Lxj2;Lu00;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, Lmj2;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lmj2;

    .line 15
    .line 16
    iget v5, v4, Lmj2;->v:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lmj2;->v:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lmj2;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, Lmj2;-><init>(Lwj2;Lu00;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Lmj2;->t:Ljava/lang/Object;

    .line 34
    .line 35
    iget v5, v4, Lmj2;->v:I

    .line 36
    .line 37
    iget-object v6, v0, Lwj2;->b:Lc20;

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    const/4 v10, 0x0

    .line 43
    sget-object v11, Lk20;->h:Lk20;

    .line 44
    .line 45
    if-eqz v5, :cond_4

    .line 46
    .line 47
    if-eq v5, v9, :cond_3

    .line 48
    .line 49
    if-eq v5, v8, :cond_2

    .line 50
    .line 51
    if-ne v5, v7, :cond_1

    .line 52
    .line 53
    iget-object v0, v4, Lmj2;->s:Ljava/io/File;

    .line 54
    .line 55
    iget-object v1, v4, Lmj2;->r:Lz80;

    .line 56
    .line 57
    iget-object v2, v4, Lmj2;->q:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Lwj2;

    .line 60
    .line 61
    iget-object v5, v4, Lmj2;->p:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v5, Lu22;

    .line 64
    .line 65
    iget-object v6, v4, Lmj2;->o:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v6, Lz80;

    .line 68
    .line 69
    iget-object v4, v4, Lmj2;->l:Lxj2;

    .line 70
    .line 71
    invoke-static {v3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move-object v12, v0

    .line 75
    move-object v0, v2

    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v10

    .line 84
    :cond_2
    iget-object v1, v4, Lmj2;->o:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lz80;

    .line 87
    .line 88
    iget-object v2, v4, Lmj2;->n:Lwi2;

    .line 89
    .line 90
    iget-object v5, v4, Lmj2;->m:Ljava/io/File;

    .line 91
    .line 92
    iget-object v6, v4, Lmj2;->l:Lxj2;

    .line 93
    .line 94
    iget-object v8, v4, Lmj2;->k:Lz80;

    .line 95
    .line 96
    invoke-static {v3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    move-object v12, v5

    .line 100
    move-object v15, v6

    .line 101
    move-object v6, v1

    .line 102
    move-object v1, v8

    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :cond_3
    iget-object v1, v4, Lmj2;->q:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Ljava/io/File;

    .line 108
    .line 109
    iget-object v2, v4, Lmj2;->p:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, Lz80;

    .line 112
    .line 113
    iget-object v5, v4, Lmj2;->o:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v5, Lwj2;

    .line 116
    .line 117
    iget-object v9, v4, Lmj2;->n:Lwi2;

    .line 118
    .line 119
    iget-object v12, v4, Lmj2;->m:Ljava/io/File;

    .line 120
    .line 121
    iget-object v13, v4, Lmj2;->l:Lxj2;

    .line 122
    .line 123
    iget-object v14, v4, Lmj2;->k:Lz80;

    .line 124
    .line 125
    invoke-static {v3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    move-object/from16 v19, v3

    .line 129
    .line 130
    move-object v3, v1

    .line 131
    move-object v1, v2

    .line 132
    move-object v2, v9

    .line 133
    move-object v9, v5

    .line 134
    move-object/from16 v5, v19

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    invoke-static {v3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget-object v3, v1, Lz80;->a:Ljava/io/File;

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    if-eqz v5, :cond_9

    .line 151
    .line 152
    new-instance v12, Lwi2;

    .line 153
    .line 154
    invoke-direct {v12, v5, v6, v8}, Lwi2;-><init>(Ljava/io/File;Lc20;I)V

    .line 155
    .line 156
    .line 157
    iput-object v1, v4, Lmj2;->k:Lz80;

    .line 158
    .line 159
    iput-object v2, v4, Lmj2;->l:Lxj2;

    .line 160
    .line 161
    iput-object v3, v4, Lmj2;->m:Ljava/io/File;

    .line 162
    .line 163
    iput-object v12, v4, Lmj2;->n:Lwi2;

    .line 164
    .line 165
    iput-object v0, v4, Lmj2;->o:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v1, v4, Lmj2;->p:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v3, v4, Lmj2;->q:Ljava/lang/Object;

    .line 170
    .line 171
    iput v9, v4, Lmj2;->v:I

    .line 172
    .line 173
    invoke-virtual {v0, v12, v1, v2, v4}, Lwj2;->i(Lwi2;Lz80;Lxj2;Lu00;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    if-ne v5, v11, :cond_5

    .line 178
    .line 179
    goto/16 :goto_3

    .line 180
    .line 181
    :cond_5
    move-object v9, v0

    .line 182
    move-object v14, v1

    .line 183
    move-object v13, v2

    .line 184
    move-object v2, v12

    .line 185
    move-object v12, v3

    .line 186
    :goto_1
    check-cast v5, Lxi2;

    .line 187
    .line 188
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {v1, v3, v5, v13}, Lwj2;->q(Lz80;Ljava/io/File;Lxi2;Lxj2;)Lz80;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    new-instance v3, Loh2;

    .line 196
    .line 197
    new-instance v5, Lsz0;

    .line 198
    .line 199
    iget-object v9, v1, Lz80;->a:Ljava/io/File;

    .line 200
    .line 201
    invoke-direct {v5, v9, v6}, Lsz0;-><init>(Ljava/io/File;Lc20;)V

    .line 202
    .line 203
    .line 204
    invoke-direct {v3, v5}, Loh2;-><init>(Lsz0;)V

    .line 205
    .line 206
    .line 207
    iput-object v14, v4, Lmj2;->k:Lz80;

    .line 208
    .line 209
    iput-object v13, v4, Lmj2;->l:Lxj2;

    .line 210
    .line 211
    iput-object v12, v4, Lmj2;->m:Ljava/io/File;

    .line 212
    .line 213
    iput-object v2, v4, Lmj2;->n:Lwi2;

    .line 214
    .line 215
    iput-object v1, v4, Lmj2;->o:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v10, v4, Lmj2;->p:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v10, v4, Lmj2;->q:Ljava/lang/Object;

    .line 220
    .line 221
    iput v8, v4, Lmj2;->v:I

    .line 222
    .line 223
    iget-object v5, v0, Lwj2;->a:Lhh1;

    .line 224
    .line 225
    iget-object v5, v5, Lhh1;->i:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v5, Lkj1;

    .line 228
    .line 229
    iget-object v5, v5, Lkj1;->l:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v5, Ldq1;

    .line 232
    .line 233
    invoke-virtual {v5, v3, v4}, Ldq1;->M(Loh2;Lu00;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    if-ne v3, v11, :cond_6

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_6
    move-object v6, v1

    .line 241
    move-object v15, v13

    .line 242
    move-object v1, v14

    .line 243
    :goto_2
    move-object v5, v3

    .line 244
    check-cast v5, Lu22;

    .line 245
    .line 246
    iget-object v3, v5, Lu22;->a:Lth2;

    .line 247
    .line 248
    iget-object v8, v1, Lz80;->b:Lth2;

    .line 249
    .line 250
    invoke-virtual {v3, v8}, Lth2;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_8

    .line 255
    .line 256
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    iput-object v10, v4, Lmj2;->k:Lz80;

    .line 260
    .line 261
    iput-object v15, v4, Lmj2;->l:Lxj2;

    .line 262
    .line 263
    iput-object v10, v4, Lmj2;->m:Ljava/io/File;

    .line 264
    .line 265
    iput-object v10, v4, Lmj2;->n:Lwi2;

    .line 266
    .line 267
    iput-object v6, v4, Lmj2;->o:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v5, v4, Lmj2;->p:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v0, v4, Lmj2;->q:Ljava/lang/Object;

    .line 272
    .line 273
    iput-object v1, v4, Lmj2;->r:Lz80;

    .line 274
    .line 275
    iput-object v12, v4, Lmj2;->s:Ljava/io/File;

    .line 276
    .line 277
    iput v7, v4, Lmj2;->v:I

    .line 278
    .line 279
    invoke-virtual {v0, v2, v1, v15, v4}, Lwj2;->i(Lwi2;Lz80;Lxj2;Lu00;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    if-ne v3, v11, :cond_7

    .line 284
    .line 285
    :goto_3
    return-object v11

    .line 286
    :cond_7
    move-object v4, v15

    .line 287
    :goto_4
    check-cast v3, Lxi2;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-static {v1, v12, v3, v4}, Lwj2;->q(Lz80;Ljava/io/File;Lxi2;Lxj2;)Lz80;

    .line 293
    .line 294
    .line 295
    new-instance v0, Lij2;

    .line 296
    .line 297
    iget-object v1, v6, Lz80;->a:Ljava/io/File;

    .line 298
    .line 299
    invoke-direct {v0, v1, v5}, Lij2;-><init>(Ljava/io/File;Lu22;)V

    .line 300
    .line 301
    .line 302
    return-object v0

    .line 303
    :cond_8
    new-instance v13, Lej2;

    .line 304
    .line 305
    iget-object v0, v1, Lz80;->b:Lth2;

    .line 306
    .line 307
    iget-object v14, v0, Lth2;->c:Ljava/lang/String;

    .line 308
    .line 309
    sget-object v16, Lfj2;->k:Lfj2;

    .line 310
    .line 311
    const-string v17, "The script manifest changed after it was discovered."

    .line 312
    .line 313
    const/16 v18, 0x0

    .line 314
    .line 315
    invoke-direct/range {v13 .. v18}, Lej2;-><init>(Ljava/lang/String;Lxj2;Lfj2;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    throw v13

    .line 319
    :cond_9
    new-instance v0, Lej2;

    .line 320
    .line 321
    iget-object v1, v1, Lz80;->b:Lth2;

    .line 322
    .line 323
    iget-object v1, v1, Lth2;->c:Ljava/lang/String;

    .line 324
    .line 325
    sget-object v3, Lfj2;->i:Lfj2;

    .line 326
    .line 327
    const-string v4, "The discovered script directory has no parent repository."

    .line 328
    .line 329
    const/4 v5, 0x0

    .line 330
    invoke-direct/range {v0 .. v5}, Lej2;-><init>(Ljava/lang/String;Lxj2;Lfj2;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 331
    .line 332
    .line 333
    throw v0
.end method

.method public final e(Ldj2;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lwj2;->g:Llq2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Llq2;->p(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Laj2;

    .line 7
    .line 8
    sget-object v3, Lph2;->i:Lph2;

    .line 9
    .line 10
    sget-object v4, Lsh2;->i:Lsh2;

    .line 11
    .line 12
    const-string v1, "."

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move-object v0, v1

    .line 17
    new-instance v1, Lqh2;

    .line 18
    .line 19
    check-cast p1, Laj2;

    .line 20
    .line 21
    iget-object v2, p1, Laj2;->a:Ljava/time/Instant;

    .line 22
    .line 23
    iget-object v5, p1, Laj2;->b:Lxj2;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 30
    .line 31
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v6, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v7, "Starting script for "

    .line 41
    .line 42
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object p1, p1, Laj2;->d:Lth2;

    .line 56
    .line 57
    iget-object v6, p1, Lth2;->c:Ljava/lang/String;

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    invoke-direct/range {v1 .. v8}, Lqh2;-><init>(Ljava/time/Instant;Lph2;Lsh2;Ljava/lang/String;Ljava/lang/String;Lsi2;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_0
    move-object v0, v1

    .line 67
    instance-of v1, p1, Lzi2;

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    new-instance v1, Lqh2;

    .line 72
    .line 73
    check-cast p1, Lzi2;

    .line 74
    .line 75
    iget-object v2, p1, Lzi2;->a:Ljava/time/Instant;

    .line 76
    .line 77
    iget-object v5, p1, Lzi2;->e:Ljava/lang/String;

    .line 78
    .line 79
    const-string v6, "Script is running on QuickJS "

    .line 80
    .line 81
    invoke-static {v6, v5, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    iget-object p1, p1, Lzi2;->d:Lth2;

    .line 86
    .line 87
    iget-object v6, p1, Lth2;->c:Ljava/lang/String;

    .line 88
    .line 89
    const/4 v8, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    invoke-direct/range {v1 .. v8}, Lqh2;-><init>(Ljava/time/Instant;Lph2;Lsh2;Ljava/lang/String;Ljava/lang/String;Lsi2;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_4

    .line 95
    .line 96
    :cond_1
    instance-of v1, p1, Lcj2;

    .line 97
    .line 98
    if-eqz v1, :cond_2

    .line 99
    .line 100
    new-instance v1, Lqh2;

    .line 101
    .line 102
    check-cast p1, Lcj2;

    .line 103
    .line 104
    iget-object v2, p1, Lcj2;->a:Ljava/time/Instant;

    .line 105
    .line 106
    iget-object v5, p1, Lcj2;->b:Lxj2;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 113
    .line 114
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v6, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v7, "Stopping script for "

    .line 124
    .line 125
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    iget-object p1, p1, Lcj2;->d:Lth2;

    .line 139
    .line 140
    iget-object v6, p1, Lth2;->c:Ljava/lang/String;

    .line 141
    .line 142
    const/4 v8, 0x0

    .line 143
    const/4 v7, 0x0

    .line 144
    invoke-direct/range {v1 .. v8}, Lqh2;-><init>(Ljava/time/Instant;Lph2;Lsh2;Ljava/lang/String;Ljava/lang/String;Lsi2;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_2
    instance-of v0, p1, Lbj2;

    .line 149
    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    new-instance v1, Lqh2;

    .line 153
    .line 154
    check-cast p1, Lbj2;

    .line 155
    .line 156
    iget-object v2, p1, Lbj2;->a:Ljava/time/Instant;

    .line 157
    .line 158
    iget-object p1, p1, Lbj2;->d:Lth2;

    .line 159
    .line 160
    iget-object v6, p1, Lth2;->c:Ljava/lang/String;

    .line 161
    .line 162
    const/4 v8, 0x0

    .line 163
    const/4 v7, 0x0

    .line 164
    const-string v5, "Script stopped."

    .line 165
    .line 166
    invoke-direct/range {v1 .. v8}, Lqh2;-><init>(Ljava/time/Instant;Lph2;Lsh2;Ljava/lang/String;Ljava/lang/String;Lsi2;Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_3
    instance-of v0, p1, Lyi2;

    .line 171
    .line 172
    if-eqz v0, :cond_7

    .line 173
    .line 174
    new-instance v5, Lqh2;

    .line 175
    .line 176
    check-cast p1, Lyi2;

    .line 177
    .line 178
    iget-object v12, p1, Lyi2;->g:Ljava/lang/Throwable;

    .line 179
    .line 180
    iget-object v6, p1, Lyi2;->a:Ljava/time/Instant;

    .line 181
    .line 182
    instance-of v0, v12, Ljava/util/concurrent/CancellationException;

    .line 183
    .line 184
    if-eqz v0, :cond_4

    .line 185
    .line 186
    sget-object v0, Lph2;->j:Lph2;

    .line 187
    .line 188
    :goto_0
    move-object v7, v0

    .line 189
    goto :goto_1

    .line 190
    :cond_4
    sget-object v0, Lph2;->k:Lph2;

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :goto_1
    iget-object v0, p1, Lyi2;->e:Lsi2;

    .line 194
    .line 195
    if-nez v0, :cond_5

    .line 196
    .line 197
    :goto_2
    move-object v8, v4

    .line 198
    goto :goto_3

    .line 199
    :cond_5
    sget-object v4, Lsh2;->h:Lsh2;

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :goto_3
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    if-nez v0, :cond_6

    .line 207
    .line 208
    const-string v0, "Script operation failed."

    .line 209
    .line 210
    :cond_6
    move-object v9, v0

    .line 211
    iget-object v0, p1, Lyi2;->d:Lth2;

    .line 212
    .line 213
    iget-object v10, v0, Lth2;->c:Ljava/lang/String;

    .line 214
    .line 215
    iget-object v11, p1, Lyi2;->e:Lsi2;

    .line 216
    .line 217
    invoke-direct/range {v5 .. v12}, Lqh2;-><init>(Ljava/time/Instant;Lph2;Lsh2;Ljava/lang/String;Ljava/lang/String;Lsi2;Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    move-object v1, v5

    .line 221
    :goto_4
    iget-object p0, p0, Lwj2;->d:Lb5;

    .line 222
    .line 223
    invoke-virtual {p0, v1}, Lb5;->f(Lqh2;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_7
    invoke-static {}, Lc80;->s()V

    .line 228
    .line 229
    .line 230
    return-void
.end method

.method public final f(Lxj2;Ljava/io/File;Lth2;Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    new-instance v0, Lyi2;

    .line 2
    .line 3
    iget-object v1, p0, Lwj2;->c:Ljava/time/Clock;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v2, p4, Ldg2;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move-object v2, p4

    .line 18
    check-cast v2, Ldg2;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v3

    .line 22
    :goto_0
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object v2, v2, Ldg2;->h:Lsi2;

    .line 25
    .line 26
    move-object v5, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object v5, v3

    .line 29
    :goto_1
    instance-of v2, p4, Lej2;

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    move-object v2, p4

    .line 34
    check-cast v2, Lej2;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move-object v2, v3

    .line 38
    :goto_2
    if-eqz v2, :cond_3

    .line 39
    .line 40
    iget-object v3, v2, Lej2;->h:Lfj2;

    .line 41
    .line 42
    :cond_3
    move-object v2, p1

    .line 43
    move-object v4, p3

    .line 44
    move-object v7, p4

    .line 45
    move-object v6, v3

    .line 46
    move-object v3, p2

    .line 47
    invoke-direct/range {v0 .. v7}, Lyi2;-><init>(Ljava/time/Instant;Lxj2;Ljava/io/File;Lth2;Lsi2;Lfj2;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lwj2;->e(Ldj2;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final g(Lz80;Lu00;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lnj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lnj2;

    .line 7
    .line 8
    iget v1, v0, Lnj2;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lnj2;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lnj2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lnj2;-><init>(Lwj2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lnj2;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lnj2;->q:I

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    const/4 v3, 0x3

    .line 31
    const/4 v4, 0x2

    .line 32
    const/4 v5, 0x1

    .line 33
    const/4 v6, 0x0

    .line 34
    sget-object v7, Lk20;->h:Lk20;

    .line 35
    .line 36
    if-eqz v1, :cond_5

    .line 37
    .line 38
    if-eq v1, v5, :cond_4

    .line 39
    .line 40
    if-eq v1, v4, :cond_3

    .line 41
    .line 42
    if-eq v1, v3, :cond_2

    .line 43
    .line 44
    if-ne v1, v2, :cond_1

    .line 45
    .line 46
    iget-object p0, v0, Lnj2;->n:Lil1;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v6

    .line 62
    :cond_2
    iget-object p1, v0, Lnj2;->n:Lil1;

    .line 63
    .line 64
    iget-object v1, v0, Lnj2;->m:Lhj2;

    .line 65
    .line 66
    iget-object v3, v0, Lnj2;->l:Lxj2;

    .line 67
    .line 68
    iget-object v4, v0, Lnj2;->k:Lz80;

    .line 69
    .line 70
    :try_start_1
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :catchall_1
    move-exception p0

    .line 76
    move-object v8, p1

    .line 77
    move-object p1, p0

    .line 78
    move-object p0, v8

    .line 79
    goto/16 :goto_6

    .line 80
    .line 81
    :cond_3
    iget-object p1, v0, Lnj2;->n:Lil1;

    .line 82
    .line 83
    iget-object v1, v0, Lnj2;->m:Lhj2;

    .line 84
    .line 85
    iget-object v4, v0, Lnj2;->l:Lxj2;

    .line 86
    .line 87
    iget-object v5, v0, Lnj2;->k:Lz80;

    .line 88
    .line 89
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    iget-object p1, v0, Lnj2;->l:Lxj2;

    .line 94
    .line 95
    iget-object v1, v0, Lnj2;->k:Lz80;

    .line 96
    .line 97
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object v8, v1

    .line 101
    move-object v1, p1

    .line 102
    move-object p1, v8

    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object p2, p1, Lz80;->b:Lth2;

    .line 108
    .line 109
    iget-object p2, p2, Lth2;->c:Ljava/lang/String;

    .line 110
    .line 111
    iput-object p1, v0, Lnj2;->k:Lz80;

    .line 112
    .line 113
    sget-object v1, Lxj2;->j:Lxj2;

    .line 114
    .line 115
    iput-object v1, v0, Lnj2;->l:Lxj2;

    .line 116
    .line 117
    iput v5, v0, Lnj2;->q:I

    .line 118
    .line 119
    invoke-virtual {p0, p2, v0}, Lwj2;->j(Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    if-ne p2, v7, :cond_6

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    :goto_1
    check-cast p2, Lhj2;

    .line 127
    .line 128
    iget-object v5, p2, Lhj2;->a:Lil1;

    .line 129
    .line 130
    iput-object p1, v0, Lnj2;->k:Lz80;

    .line 131
    .line 132
    iput-object v1, v0, Lnj2;->l:Lxj2;

    .line 133
    .line 134
    iput-object p2, v0, Lnj2;->m:Lhj2;

    .line 135
    .line 136
    iput-object v5, v0, Lnj2;->n:Lil1;

    .line 137
    .line 138
    iput v4, v0, Lnj2;->q:I

    .line 139
    .line 140
    check-cast v5, Lkl1;

    .line 141
    .line 142
    invoke-virtual {v5, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    if-ne v4, v7, :cond_7

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_7
    move-object v4, v5

    .line 150
    move-object v5, p1

    .line 151
    move-object p1, v4

    .line 152
    move-object v4, v1

    .line 153
    move-object v1, p2

    .line 154
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Lhj2;->a()Lgj2;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    if-eqz p2, :cond_9

    .line 159
    .line 160
    iput-object v5, v0, Lnj2;->k:Lz80;

    .line 161
    .line 162
    iput-object v4, v0, Lnj2;->l:Lxj2;

    .line 163
    .line 164
    iput-object v1, v0, Lnj2;->m:Lhj2;

    .line 165
    .line 166
    iput-object p1, v0, Lnj2;->n:Lil1;

    .line 167
    .line 168
    iput v3, v0, Lnj2;->q:I

    .line 169
    .line 170
    invoke-virtual {p0, v1, p2, v4, v0}, Lwj2;->p(Lhj2;Lgj2;Lxj2;Lu00;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    if-ne p2, v7, :cond_8

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_8
    move-object v3, v4

    .line 178
    move-object v4, v5

    .line 179
    :goto_3
    move-object v5, v4

    .line 180
    move-object v4, v3

    .line 181
    :cond_9
    iput-object v6, v0, Lnj2;->k:Lz80;

    .line 182
    .line 183
    iput-object v6, v0, Lnj2;->l:Lxj2;

    .line 184
    .line 185
    iput-object v6, v0, Lnj2;->m:Lhj2;

    .line 186
    .line 187
    iput-object p1, v0, Lnj2;->n:Lil1;

    .line 188
    .line 189
    iput v2, v0, Lnj2;->q:I

    .line 190
    .line 191
    invoke-virtual {p0, v5, v1, v4, v0}, Lwj2;->m(Lz80;Lhj2;Lxj2;Lu00;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 195
    if-ne p2, v7, :cond_a

    .line 196
    .line 197
    :goto_4
    return-object v7

    .line 198
    :cond_a
    move-object p0, p1

    .line 199
    :goto_5
    :try_start_3
    check-cast p2, Lf52;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 200
    .line 201
    check-cast p0, Lkl1;

    .line 202
    .line 203
    invoke-virtual {p0, v6}, Lkl1;->f(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    return-object p2

    .line 207
    :goto_6
    check-cast p0, Lkl1;

    .line 208
    .line 209
    invoke-virtual {p0, v6}, Lkl1;->f(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    throw p1
.end method

.method public final i(Lwi2;Lz80;Lxj2;Lu00;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Loj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Loj2;

    .line 7
    .line 8
    iget v1, v0, Loj2;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Loj2;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Loj2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Loj2;-><init>(Lwj2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Loj2;->m:Ljava/lang/Object;

    .line 26
    .line 27
    iget p4, v0, Loj2;->o:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz p4, :cond_2

    .line 32
    .line 33
    if-ne p4, v2, :cond_1

    .line 34
    .line 35
    iget-object p3, v0, Loj2;->l:Lxj2;

    .line 36
    .line 37
    iget-object p2, v0, Loj2;->k:Lz80;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :try_start_1
    iput-object p2, v0, Loj2;->k:Lz80;

    .line 55
    .line 56
    iput-object p3, v0, Loj2;->l:Lxj2;

    .line 57
    .line 58
    iput v2, v0, Loj2;->o:I

    .line 59
    .line 60
    iget-object p0, p1, Lwi2;->b:Lc20;

    .line 61
    .line 62
    new-instance p4, Lvi2;

    .line 63
    .line 64
    invoke-direct {p4, p1, v1}, Lvi2;-><init>(Lwi2;Lt00;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, p4, v0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    sget-object p1, Lk20;->h:Lk20;

    .line 72
    .line 73
    if-ne p0, p1, :cond_3

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_3
    :goto_1
    :try_start_2
    check-cast p0, Lxi2;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    .line 78
    return-object p0

    .line 79
    :goto_2
    sget-object p1, Lfj2;->i:Lfj2;

    .line 80
    .line 81
    const-string p4, "Unable to rescan the script repository before starting."

    .line 82
    .line 83
    invoke-static {p2, p3, p1, p4, p0}, Lwj2;->h(Lz80;Lxj2;Lfj2;Ljava/lang/String;Ljava/lang/Throwable;)Lej2;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    throw p0

    .line 88
    :catch_0
    move-exception p0

    .line 89
    throw p0
.end method

.method public final j(Ljava/lang/String;Lu00;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lpj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lpj2;

    .line 7
    .line 8
    iget v1, v0, Lpj2;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpj2;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpj2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lpj2;-><init>(Lwj2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lpj2;->m:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lpj2;->o:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Lpj2;->l:Lkl1;

    .line 36
    .line 37
    iget-object v0, v0, Lpj2;->k:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object p2, p1

    .line 43
    move-object p1, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, v0, Lpj2;->k:Ljava/lang/String;

    .line 55
    .line 56
    iget-object p2, p0, Lwj2;->e:Lkl1;

    .line 57
    .line 58
    iput-object p2, v0, Lpj2;->l:Lkl1;

    .line 59
    .line 60
    iput v2, v0, Lpj2;->o:I

    .line 61
    .line 62
    invoke-virtual {p2, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sget-object v1, Lk20;->h:Lk20;

    .line 67
    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    :try_start_0
    iget-object p0, p0, Lwj2;->f:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-nez v0, :cond_4

    .line 78
    .line 79
    new-instance v0, Lhj2;

    .line 80
    .line 81
    invoke-direct {v0}, Lhj2;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    :goto_2
    check-cast v0, Lhj2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    invoke-virtual {p2, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :goto_3
    invoke-virtual {p2, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    throw p0
.end method

.method public final k(Lu00;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Lqj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lqj2;

    .line 7
    .line 8
    iget v1, v0, Lqj2;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lqj2;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqj2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lqj2;-><init>(Lwj2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lqj2;->p:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lk20;->h:Lk20;

    .line 28
    .line 29
    iget v2, v0, Lqj2;->r:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lqj2;->o:Lil1;

    .line 41
    .line 42
    iget-object v2, v0, Lqj2;->n:Lhj2;

    .line 43
    .line 44
    iget-object v4, v0, Lqj2;->m:Ljava/util/Iterator;

    .line 45
    .line 46
    iget-object v6, v0, Lqj2;->l:Ljava/util/Collection;

    .line 47
    .line 48
    check-cast v6, Ljava/util/Collection;

    .line 49
    .line 50
    iget-object v7, v0, Lqj2;->k:Lkl1;

    .line 51
    .line 52
    check-cast v7, Ljava/util/List;

    .line 53
    .line 54
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v5

    .line 64
    :cond_2
    iget-object v2, v0, Lqj2;->k:Lkl1;

    .line 65
    .line 66
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lwj2;->e:Lkl1;

    .line 74
    .line 75
    iput-object v2, v0, Lqj2;->k:Lkl1;

    .line 76
    .line 77
    iput v4, v0, Lqj2;->r:I

    .line 78
    .line 79
    invoke-virtual {v2, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v1, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    :goto_1
    :try_start_0
    iget-object p0, p0, Lwj2;->f:Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast p0, Ljava/lang/Iterable;

    .line 96
    .line 97
    invoke-static {p0}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 101
    invoke-virtual {v2, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance p1, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    move-object v4, p0

    .line 114
    move-object v6, p1

    .line 115
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_8

    .line 120
    .line 121
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    move-object v2, p0

    .line 126
    check-cast v2, Lhj2;

    .line 127
    .line 128
    iget-object p0, v2, Lhj2;->a:Lil1;

    .line 129
    .line 130
    iput-object v5, v0, Lqj2;->k:Lkl1;

    .line 131
    .line 132
    move-object p1, v6

    .line 133
    check-cast p1, Ljava/util/Collection;

    .line 134
    .line 135
    iput-object p1, v0, Lqj2;->l:Ljava/util/Collection;

    .line 136
    .line 137
    iput-object v4, v0, Lqj2;->m:Ljava/util/Iterator;

    .line 138
    .line 139
    iput-object v2, v0, Lqj2;->n:Lhj2;

    .line 140
    .line 141
    iput-object p0, v0, Lqj2;->o:Lil1;

    .line 142
    .line 143
    iput v3, v0, Lqj2;->r:I

    .line 144
    .line 145
    check-cast p0, Lkl1;

    .line 146
    .line 147
    invoke-virtual {p0, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-ne p1, v1, :cond_6

    .line 152
    .line 153
    :goto_3
    return-object v1

    .line 154
    :cond_6
    :goto_4
    :try_start_1
    invoke-virtual {v2}, Lhj2;->a()Lgj2;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-nez p1, :cond_7

    .line 159
    .line 160
    move-object v7, v5

    .line 161
    goto :goto_5

    .line 162
    :cond_7
    new-instance v7, Lme1;

    .line 163
    .line 164
    iget-object v2, p1, Lgj2;->b:Lf52;

    .line 165
    .line 166
    iget-object v8, v2, Lf52;->h:Lu22;

    .line 167
    .line 168
    iget-object v10, v8, Lu22;->a:Lth2;

    .line 169
    .line 170
    iget-object v8, v10, Lth2;->c:Ljava/lang/String;

    .line 171
    .line 172
    iget-object v9, p1, Lgj2;->a:Ljava/io/File;

    .line 173
    .line 174
    iget-object v11, v2, Lf52;->o:Lrk2;

    .line 175
    .line 176
    iget-object p1, p1, Lgj2;->b:Lf52;

    .line 177
    .line 178
    iget-object v12, p1, Lf52;->p:Ljava/lang/String;

    .line 179
    .line 180
    invoke-direct/range {v7 .. v12}, Lme1;-><init>(Ljava/lang/String;Ljava/io/File;Lth2;Lrk2;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    .line 182
    .line 183
    :goto_5
    check-cast p0, Lkl1;

    .line 184
    .line 185
    invoke-virtual {p0, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    if-eqz v7, :cond_5

    .line 189
    .line 190
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :catchall_0
    move-exception v0

    .line 195
    move-object p1, v0

    .line 196
    check-cast p0, Lkl1;

    .line 197
    .line 198
    invoke-virtual {p0, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    throw p1

    .line 202
    :cond_8
    check-cast v6, Ljava/util/List;

    .line 203
    .line 204
    new-instance p0, Lsl0;

    .line 205
    .line 206
    const/16 p1, 0x18

    .line 207
    .line 208
    invoke-direct {p0, p1}, Lsl0;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-static {v6, p0}, Ldu;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    new-instance p1, Lyj2;

    .line 216
    .line 217
    invoke-direct {p1, p0}, Lyj2;-><init>(Ljava/util/List;)V

    .line 218
    .line 219
    .line 220
    return-object p1

    .line 221
    :catchall_1
    move-exception v0

    .line 222
    move-object p0, v0

    .line 223
    invoke-virtual {v2, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    throw p0
.end method

.method public final l(Lz80;Lu00;)Ljava/lang/Object;
    .locals 9

    .line 1
    const-string v0, "A script session is already active with state "

    .line 2
    .line 3
    instance-of v1, p2, Lrj2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, Lrj2;

    .line 9
    .line 10
    iget v2, v1, Lrj2;->q:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lrj2;->q:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lrj2;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, Lrj2;-><init>(Lwj2;Lu00;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, Lrj2;->o:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lk20;->h:Lk20;

    .line 30
    .line 31
    iget v3, v1, Lrj2;->q:I

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v3, :cond_4

    .line 38
    .line 39
    if-eq v3, v6, :cond_3

    .line 40
    .line 41
    if-eq v3, v5, :cond_2

    .line 42
    .line 43
    if-ne v3, v4, :cond_1

    .line 44
    .line 45
    iget-object p0, v1, Lrj2;->n:Lil1;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v7

    .line 61
    :cond_2
    iget-object p1, v1, Lrj2;->n:Lil1;

    .line 62
    .line 63
    iget-object v3, v1, Lrj2;->m:Lhj2;

    .line 64
    .line 65
    iget-object v5, v1, Lrj2;->l:Lxj2;

    .line 66
    .line 67
    iget-object v6, v1, Lrj2;->k:Lz80;

    .line 68
    .line 69
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    iget-object p1, v1, Lrj2;->l:Lxj2;

    .line 74
    .line 75
    iget-object v3, v1, Lrj2;->k:Lz80;

    .line 76
    .line 77
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object v8, v3

    .line 81
    move-object v3, p1

    .line 82
    move-object p1, v8

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object p2, Lxj2;->h:Lxj2;

    .line 88
    .line 89
    iget-object v3, p1, Lz80;->b:Lth2;

    .line 90
    .line 91
    iget-object v3, v3, Lth2;->c:Ljava/lang/String;

    .line 92
    .line 93
    iput-object p1, v1, Lrj2;->k:Lz80;

    .line 94
    .line 95
    iput-object p2, v1, Lrj2;->l:Lxj2;

    .line 96
    .line 97
    iput v6, v1, Lrj2;->q:I

    .line 98
    .line 99
    invoke-virtual {p0, v3, v1}, Lwj2;->j(Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    if-ne v3, v2, :cond_5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    move-object v8, v3

    .line 107
    move-object v3, p2

    .line 108
    move-object p2, v8

    .line 109
    :goto_1
    check-cast p2, Lhj2;

    .line 110
    .line 111
    iget-object v6, p2, Lhj2;->a:Lil1;

    .line 112
    .line 113
    iput-object p1, v1, Lrj2;->k:Lz80;

    .line 114
    .line 115
    iput-object v3, v1, Lrj2;->l:Lxj2;

    .line 116
    .line 117
    iput-object p2, v1, Lrj2;->m:Lhj2;

    .line 118
    .line 119
    iput-object v6, v1, Lrj2;->n:Lil1;

    .line 120
    .line 121
    iput v5, v1, Lrj2;->q:I

    .line 122
    .line 123
    check-cast v6, Lkl1;

    .line 124
    .line 125
    invoke-virtual {v6, v1}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    if-ne v5, v2, :cond_6

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move-object v5, v6

    .line 133
    move-object v6, p1

    .line 134
    move-object p1, v5

    .line 135
    move-object v5, v3

    .line 136
    move-object v3, p2

    .line 137
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lhj2;->a()Lgj2;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    if-nez p2, :cond_8

    .line 142
    .line 143
    iput-object v7, v1, Lrj2;->k:Lz80;

    .line 144
    .line 145
    iput-object v7, v1, Lrj2;->l:Lxj2;

    .line 146
    .line 147
    iput-object v7, v1, Lrj2;->m:Lhj2;

    .line 148
    .line 149
    iput-object p1, v1, Lrj2;->n:Lil1;

    .line 150
    .line 151
    iput v4, v1, Lrj2;->q:I

    .line 152
    .line 153
    invoke-virtual {p0, v6, v3, v5, v1}, Lwj2;->m(Lz80;Lhj2;Lxj2;Lu00;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 157
    if-ne p2, v2, :cond_7

    .line 158
    .line 159
    :goto_3
    return-object v2

    .line 160
    :cond_7
    move-object p0, p1

    .line 161
    :goto_4
    :try_start_2
    check-cast p2, Lf52;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 162
    .line 163
    check-cast p0, Lkl1;

    .line 164
    .line 165
    invoke-virtual {p0, v7}, Lkl1;->f(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-object p2

    .line 169
    :catchall_1
    move-exception p0

    .line 170
    move-object v8, p1

    .line 171
    move-object p1, p0

    .line 172
    move-object p0, v8

    .line 173
    goto :goto_5

    .line 174
    :cond_8
    :try_start_3
    sget-object v1, Lfj2;->h:Lfj2;

    .line 175
    .line 176
    iget-object p2, p2, Lgj2;->b:Lf52;

    .line 177
    .line 178
    iget-object p2, p2, Lf52;->o:Lrk2;

    .line 179
    .line 180
    new-instance v2, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string p2, "."

    .line 189
    .line 190
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-static {v6, v5, v1, p2, v7}, Lwj2;->h(Lz80;Lxj2;Lfj2;Ljava/lang/String;Ljava/lang/Throwable;)Lej2;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    iget-object v0, v6, Lz80;->a:Ljava/io/File;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v1, v6, Lz80;->b:Lth2;

    .line 211
    .line 212
    invoke-virtual {p0, v5, v0, v1, p2}, Lwj2;->f(Lxj2;Ljava/io/File;Lth2;Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 216
    :goto_5
    check-cast p0, Lkl1;

    .line 217
    .line 218
    invoke-virtual {p0, v7}, Lkl1;->f(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    throw p1
.end method

.method public final m(Lz80;Lhj2;Lxj2;Lu00;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, Lsj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lsj2;

    .line 7
    .line 8
    iget v1, v0, Lsj2;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lsj2;->r:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lsj2;

    .line 22
    .line 23
    invoke-direct {v0, p0, p4}, Lsj2;-><init>(Lwj2;Lu00;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p4, v6, Lsj2;->p:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Lk20;->h:Lk20;

    .line 30
    .line 31
    iget v1, v6, Lsj2;->r:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v3, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    iget-object p1, v6, Lsj2;->o:Lij2;

    .line 42
    .line 43
    iget-object p2, v6, Lsj2;->n:Ljava/io/File;

    .line 44
    .line 45
    iget-object p3, v6, Lsj2;->m:Lxj2;

    .line 46
    .line 47
    iget-object v0, v6, Lsj2;->l:Lhj2;

    .line 48
    .line 49
    iget-object v1, v6, Lsj2;->k:Lz80;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :goto_2
    move-object v4, p3

    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :catchall_0
    move-exception v0

    .line 58
    move-object p1, v0

    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :catch_0
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    goto/16 :goto_9

    .line 64
    .line 65
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    return-object p0

    .line 72
    :cond_2
    iget-object p2, v6, Lsj2;->n:Ljava/io/File;

    .line 73
    .line 74
    iget-object p3, v6, Lsj2;->m:Lxj2;

    .line 75
    .line 76
    iget-object p1, v6, Lsj2;->l:Lhj2;

    .line 77
    .line 78
    iget-object v1, v6, Lsj2;->k:Lz80;

    .line 79
    .line 80
    :try_start_1
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    move-object v8, p2

    .line 84
    move-object p2, p1

    .line 85
    move-object p1, v1

    .line 86
    move-object v1, p4

    .line 87
    move-object p4, v8

    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p4, p1, Lz80;->a:Ljava/io/File;

    .line 93
    .line 94
    invoke-virtual {p4}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 95
    .line 96
    .line 97
    move-result-object p4

    .line 98
    new-instance v1, Laj2;

    .line 99
    .line 100
    iget-object v4, p0, Lwj2;->c:Ljava/time/Clock;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v5, p1, Lz80;->b:Lth2;

    .line 113
    .line 114
    invoke-direct {v1, v4, p3, p4, v5}, Laj2;-><init>(Ljava/time/Instant;Lxj2;Ljava/io/File;Lth2;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v1}, Lwj2;->e(Ldj2;)V

    .line 118
    .line 119
    .line 120
    :try_start_2
    iput-object p1, v6, Lsj2;->k:Lz80;

    .line 121
    .line 122
    iput-object p2, v6, Lsj2;->l:Lhj2;

    .line 123
    .line 124
    iput-object p3, v6, Lsj2;->m:Lxj2;

    .line 125
    .line 126
    iput-object p4, v6, Lsj2;->n:Ljava/io/File;

    .line 127
    .line 128
    iput v3, v6, Lsj2;->r:I

    .line 129
    .line 130
    invoke-virtual {p0, p1, p3, v6}, Lwj2;->d(Lz80;Lxj2;Lu00;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-ne v1, v0, :cond_4

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_4
    :goto_3
    move-object v7, v1

    .line 138
    check-cast v7, Lij2;

    .line 139
    .line 140
    iget-object v1, p0, Lwj2;->a:Lhh1;

    .line 141
    .line 142
    move v3, v2

    .line 143
    iget-object v2, v7, Lij2;->b:Lu22;

    .line 144
    .line 145
    iput-object p1, v6, Lsj2;->k:Lz80;

    .line 146
    .line 147
    iput-object p2, v6, Lsj2;->l:Lhj2;

    .line 148
    .line 149
    iput-object p3, v6, Lsj2;->m:Lxj2;

    .line 150
    .line 151
    iput-object p4, v6, Lsj2;->n:Ljava/io/File;

    .line 152
    .line 153
    iput-object v7, v6, Lsj2;->o:Lij2;

    .line 154
    .line 155
    iput v3, v6, Lsj2;->r:I

    .line 156
    .line 157
    iget-object v1, v1, Lhh1;->i:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, Lkj1;

    .line 160
    .line 161
    move-object v3, v1

    .line 162
    sget-object v1, Lf52;->q:Li51;

    .line 163
    .line 164
    iget-object v4, v3, Lkj1;->i:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v4, Leg2;

    .line 167
    .line 168
    iget-object v5, v3, Lkj1;->j:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v5, Ldf2;

    .line 171
    .line 172
    iget-object v3, v3, Lkj1;->k:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v3, Lc20;

    .line 175
    .line 176
    move-object v8, v5

    .line 177
    move-object v5, v3

    .line 178
    move-object v3, v4

    .line 179
    move-object v4, v8

    .line 180
    invoke-virtual/range {v1 .. v6}, Li51;->z(Lu22;Leg2;Ldf2;Lc20;Lu00;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 184
    if-ne v1, v0, :cond_5

    .line 185
    .line 186
    :goto_4
    return-object v0

    .line 187
    :cond_5
    move-object v0, p2

    .line 188
    move-object p2, p4

    .line 189
    move-object p4, v1

    .line 190
    move-object v1, p1

    .line 191
    move-object p1, v7

    .line 192
    goto/16 :goto_2

    .line 193
    .line 194
    :goto_5
    :try_start_3
    check-cast p4, Lf52;

    .line 195
    .line 196
    new-instance p3, Lgj2;

    .line 197
    .line 198
    iget-object v2, p1, Lij2;->a:Ljava/io/File;

    .line 199
    .line 200
    invoke-direct {p3, v2, p4}, Lgj2;-><init>(Ljava/io/File;Lf52;)V

    .line 201
    .line 202
    .line 203
    iput-object p3, v0, Lhj2;->b:Lgj2;

    .line 204
    .line 205
    new-instance v2, Lzi2;

    .line 206
    .line 207
    iget-object p3, p0, Lwj2;->c:Ljava/time/Clock;

    .line 208
    .line 209
    invoke-virtual {p3}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object v5, p1, Lij2;->a:Ljava/io/File;

    .line 217
    .line 218
    iget-object p1, p4, Lf52;->h:Lu22;

    .line 219
    .line 220
    iget-object v6, p1, Lu22;->a:Lth2;

    .line 221
    .line 222
    iget-object v7, p4, Lf52;->p:Ljava/lang/String;

    .line 223
    .line 224
    invoke-direct/range {v2 .. v7}, Lzi2;-><init>(Ljava/time/Instant;Lxj2;Ljava/io/File;Lth2;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, v2}, Lwj2;->e(Ldj2;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 228
    .line 229
    .line 230
    return-object p4

    .line 231
    :catchall_1
    move-exception v0

    .line 232
    move-object p1, v0

    .line 233
    move-object p3, v4

    .line 234
    goto :goto_8

    .line 235
    :catch_1
    move-exception v0

    .line 236
    move-object p1, v0

    .line 237
    move-object p3, v4

    .line 238
    goto :goto_9

    .line 239
    :goto_6
    move-object v1, p1

    .line 240
    move-object p1, p2

    .line 241
    move-object p2, p4

    .line 242
    goto :goto_8

    .line 243
    :goto_7
    move-object v1, p1

    .line 244
    move-object p1, p2

    .line 245
    move-object p2, p4

    .line 246
    goto :goto_9

    .line 247
    :catchall_2
    move-exception v0

    .line 248
    move-object p2, v0

    .line 249
    goto :goto_6

    .line 250
    :catch_2
    move-exception v0

    .line 251
    move-object p2, v0

    .line 252
    goto :goto_7

    .line 253
    :goto_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object p4, v1, Lz80;->b:Lth2;

    .line 257
    .line 258
    invoke-virtual {p0, p3, p2, p4, p1}, Lwj2;->f(Lxj2;Ljava/io/File;Lth2;Ljava/lang/Throwable;)V

    .line 259
    .line 260
    .line 261
    throw p1

    .line 262
    :goto_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    iget-object p4, v1, Lz80;->b:Lth2;

    .line 266
    .line 267
    invoke-virtual {p0, p3, p2, p4, p1}, Lwj2;->f(Lxj2;Ljava/io/File;Lth2;Ljava/lang/Throwable;)V

    .line 268
    .line 269
    .line 270
    throw p1
.end method

.method public final n(Ljava/lang/String;Lxj2;Lu00;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Ltj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ltj2;

    .line 7
    .line 8
    iget v1, v0, Ltj2;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ltj2;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ltj2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Ltj2;-><init>(Lwj2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ltj2;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ltj2;->p:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    sget-object v6, Lk20;->h:Lk20;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v4, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, Ltj2;->m:Lil1;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_4

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v5

    .line 58
    :cond_2
    iget-object p1, v0, Ltj2;->m:Lil1;

    .line 59
    .line 60
    iget-object p2, v0, Ltj2;->l:Lhj2;

    .line 61
    .line 62
    iget-object v1, v0, Ltj2;->k:Lxj2;

    .line 63
    .line 64
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    iget-object p2, v0, Ltj2;->k:Lxj2;

    .line 69
    .line 70
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iput-object p2, v0, Ltj2;->k:Lxj2;

    .line 78
    .line 79
    iput v4, v0, Ltj2;->p:I

    .line 80
    .line 81
    invoke-virtual {p0, p1, v0}, Lwj2;->c(Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    if-ne p3, v6, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    :goto_1
    move-object p1, p3

    .line 89
    check-cast p1, Lhj2;

    .line 90
    .line 91
    if-nez p1, :cond_6

    .line 92
    .line 93
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_6
    iget-object p3, p1, Lhj2;->a:Lil1;

    .line 97
    .line 98
    iput-object p2, v0, Ltj2;->k:Lxj2;

    .line 99
    .line 100
    iput-object p1, v0, Ltj2;->l:Lhj2;

    .line 101
    .line 102
    iput-object p3, v0, Ltj2;->m:Lil1;

    .line 103
    .line 104
    iput v3, v0, Ltj2;->p:I

    .line 105
    .line 106
    check-cast p3, Lkl1;

    .line 107
    .line 108
    invoke-virtual {p3, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-ne v1, v6, :cond_7

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    move-object v1, p2

    .line 116
    move-object p2, p1

    .line 117
    move-object p1, p3

    .line 118
    :goto_2
    :try_start_1
    invoke-virtual {p2}, Lhj2;->a()Lgj2;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    if-nez p3, :cond_8

    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    goto :goto_5

    .line 126
    :cond_8
    iput-object v5, v0, Ltj2;->k:Lxj2;

    .line 127
    .line 128
    iput-object v5, v0, Ltj2;->l:Lhj2;

    .line 129
    .line 130
    iput-object p1, v0, Ltj2;->m:Lil1;

    .line 131
    .line 132
    iput v2, v0, Ltj2;->p:I

    .line 133
    .line 134
    invoke-virtual {p0, p2, p3, v1, v0}, Lwj2;->p(Lhj2;Lgj2;Lxj2;Lu00;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 138
    if-ne p3, v6, :cond_9

    .line 139
    .line 140
    :goto_3
    return-object v6

    .line 141
    :cond_9
    move-object p0, p1

    .line 142
    :goto_4
    :try_start_2
    check-cast p3, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 148
    move v7, p1

    .line 149
    move-object p1, p0

    .line 150
    move p0, v7

    .line 151
    :goto_5
    :try_start_3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 152
    .line 153
    .line 154
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 155
    check-cast p1, Lkl1;

    .line 156
    .line 157
    invoke-virtual {p1, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :catchall_1
    move-exception p0

    .line 162
    move-object v7, p1

    .line 163
    move-object p1, p0

    .line 164
    move-object p0, v7

    .line 165
    :goto_6
    check-cast p0, Lkl1;

    .line 166
    .line 167
    invoke-virtual {p0, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    throw p1
.end method

.method public final o(Lu00;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Luj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Luj2;

    .line 7
    .line 8
    iget v1, v0, Luj2;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Luj2;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Luj2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Luj2;-><init>(Lwj2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Luj2;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Luj2;->m:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lk20;->h:Lk20;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput v4, v0, Luj2;->m:I

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lwj2;->a(Lu00;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v5, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 67
    .line 68
    new-instance v1, Lb2;

    .line 69
    .line 70
    const/16 v6, 0x10

    .line 71
    .line 72
    invoke-direct {v1, p1, p0, v2, v6}, Lb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 73
    .line 74
    .line 75
    iput v3, v0, Luj2;->m:I

    .line 76
    .line 77
    new-instance p0, Llw2;

    .line 78
    .line 79
    invoke-interface {v0}, Lt00;->f()La20;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {p0, v0, p1}, Lhd2;-><init>(Lt00;La20;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p0, v4, p0, v1}, Lze3;->b(Lhd2;ZLhd2;Lmn0;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v5, :cond_5

    .line 91
    .line 92
    :goto_2
    return-object v5

    .line 93
    :cond_5
    :goto_3
    check-cast p1, Ljava/util/List;

    .line 94
    .line 95
    new-instance p0, Lsk2;

    .line 96
    .line 97
    new-instance v0, Lsl0;

    .line 98
    .line 99
    const/16 v1, 0x19

    .line 100
    .line 101
    invoke-direct {v0, v1}, Lsl0;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-static {p1, v0}, Ldu;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {p0, p1}, Lsk2;-><init>(Ljava/util/List;)V

    .line 109
    .line 110
    .line 111
    return-object p0
.end method

.method public final p(Lhj2;Lgj2;Lxj2;Lu00;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, Lvj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lvj2;

    .line 7
    .line 8
    iget v1, v0, Lvj2;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lvj2;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lvj2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lvj2;-><init>(Lwj2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lvj2;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lvj2;->q:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iget-object v3, p0, Lwj2;->c:Ljava/time/Clock;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v4, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, Lvj2;->n:Lth2;

    .line 38
    .line 39
    iget-object p3, v0, Lvj2;->m:Lxj2;

    .line 40
    .line 41
    iget-object p2, v0, Lvj2;->l:Lgj2;

    .line 42
    .line 43
    iget-object v0, v0, Lvj2;->k:Lhj2;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p4

    .line 50
    goto :goto_2

    .line 51
    :catch_0
    move-exception p4

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_2
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p4, p2, Lgj2;->b:Lf52;

    .line 63
    .line 64
    iget-object p4, p4, Lf52;->h:Lu22;

    .line 65
    .line 66
    iget-object p4, p4, Lu22;->a:Lth2;

    .line 67
    .line 68
    new-instance v1, Lcj2;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v6, p2, Lgj2;->a:Ljava/io/File;

    .line 78
    .line 79
    invoke-direct {v1, v5, p3, v6, p4}, Lcj2;-><init>(Ljava/time/Instant;Lxj2;Ljava/io/File;Lth2;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v1}, Lwj2;->e(Ldj2;)V

    .line 83
    .line 84
    .line 85
    :try_start_1
    iget-object v1, p2, Lgj2;->b:Lf52;

    .line 86
    .line 87
    iput-object p1, v0, Lvj2;->k:Lhj2;

    .line 88
    .line 89
    iput-object p2, v0, Lvj2;->l:Lgj2;

    .line 90
    .line 91
    iput-object p3, v0, Lvj2;->m:Lxj2;

    .line 92
    .line 93
    iput-object p4, v0, Lvj2;->n:Lth2;

    .line 94
    .line 95
    iput v4, v0, Lvj2;->q:I

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Lf52;->k(Lu00;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    sget-object v1, Lk20;->h:Lk20;

    .line 102
    .line 103
    if-ne v0, v1, :cond_3

    .line 104
    .line 105
    return-object v1

    .line 106
    :cond_3
    move-object v0, p1

    .line 107
    move-object p1, p4

    .line 108
    :goto_1
    :try_start_2
    new-instance p4, Lbj2;

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v3, p2, Lgj2;->a:Ljava/io/File;

    .line 118
    .line 119
    invoke-direct {p4, v1, p3, v3, p1}, Lbj2;-><init>(Ljava/time/Instant;Lxj2;Ljava/io/File;Lth2;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p4}, Lwj2;->e(Ldj2;)V

    .line 123
    .line 124
    .line 125
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    .line 127
    iput-object v2, v0, Lhj2;->b:Lgj2;

    .line 128
    .line 129
    return-object p0

    .line 130
    :catchall_1
    move-exception v0

    .line 131
    move-object v7, v0

    .line 132
    move-object v0, p1

    .line 133
    move-object p1, p4

    .line 134
    move-object p4, v7

    .line 135
    goto :goto_2

    .line 136
    :catch_1
    move-exception v0

    .line 137
    move-object v7, v0

    .line 138
    move-object v0, p1

    .line 139
    move-object p1, p4

    .line 140
    move-object p4, v7

    .line 141
    goto :goto_3

    .line 142
    :goto_2
    :try_start_3
    iget-object p2, p2, Lgj2;->a:Ljava/io/File;

    .line 143
    .line 144
    invoke-virtual {p0, p3, p2, p1, p4}, Lwj2;->f(Lxj2;Ljava/io/File;Lth2;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    throw p4

    .line 148
    :catchall_2
    move-exception p0

    .line 149
    goto :goto_4

    .line 150
    :goto_3
    iget-object p2, p2, Lgj2;->a:Ljava/io/File;

    .line 151
    .line 152
    invoke-virtual {p0, p3, p2, p1, p4}, Lwj2;->f(Lxj2;Ljava/io/File;Lth2;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    throw p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 156
    :goto_4
    iput-object v2, v0, Lhj2;->b:Lgj2;

    .line 157
    .line 158
    throw p0
.end method
