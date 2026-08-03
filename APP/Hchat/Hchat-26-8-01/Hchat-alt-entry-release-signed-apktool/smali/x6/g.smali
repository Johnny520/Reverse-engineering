.class public final Lx6/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final a(Lq6/a;Lr6/c;)Ljava/util/List;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lr6/c;->a:Ljava/lang/Class;

    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    array-length v2, v0

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v0, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_2
    new-instance v1, Lsf/f;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    sget-object v0, Ly6/b;->a:Ly6/a;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    :cond_2
    instance-of v0, v1, Lsf/f;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    :cond_3
    check-cast v1, Ljava/util/List;

    .line 54
    .line 55
    if-nez v1, :cond_4

    .line 56
    .line 57
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 58
    .line 59
    :cond_4
    new-instance v0, Ldg/n;

    .line 60
    .line 61
    const/4 v2, 0x6

    .line 62
    invoke-direct {v0, v1, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, p0, p1}, Lx6/g;->b(Ldg/n;Lr6/d;Lr6/c;)Lng/i;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0, p0, p1}, Lx6/g;->g(Lng/i;Lr6/a;Lr6/c;)Lng/i;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance v0, Lwb/sr;

    .line 74
    .line 75
    const/16 v1, 0x11

    .line 76
    .line 77
    invoke-direct {v0, v1}, Lwb/sr;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-class v0, Ljava/lang/reflect/Constructor;

    .line 85
    .line 86
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-class v2, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    invoke-static {v2}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v1, v2}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    new-instance v0, Lx6/e;

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    invoke-direct {v0, p1, v1}, Lx6/e;-><init>(Lr6/c;I)V

    .line 106
    .line 107
    .line 108
    invoke-static {p0, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    goto :goto_3

    .line 113
    :cond_5
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v1, v0}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    new-instance v0, Lx6/e;

    .line 124
    .line 125
    const/4 v1, 0x1

    .line 126
    invoke-direct {v0, p1, v1}, Lx6/e;-><init>(Lr6/c;I)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    goto :goto_3

    .line 134
    :cond_6
    const-class v0, Ljava/lang/reflect/Field;

    .line 135
    .line 136
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v1, v0}, Lgg/f;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_7

    .line 145
    .line 146
    new-instance v0, Lx6/e;

    .line 147
    .line 148
    const/4 v1, 0x2

    .line 149
    invoke-direct {v0, p1, v1}, Lx6/e;-><init>(Lr6/c;I)V

    .line 150
    .line 151
    .line 152
    invoke-static {p0, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    :goto_3
    invoke-static {p0}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :cond_7
    const-string p1, "Unsupported member type: "

    .line 162
    .line 163
    invoke-static {p0, p1}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const/4 p0, 0x0

    .line 167
    return-object p0
.end method

.method public static b(Ldg/n;Lr6/d;Lr6/c;)Lng/i;
    .locals 4

    .line 1
    new-instance v0, Lwb/sr;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwb/sr;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-object v0, p1, Lr6/d;->b:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v1, Lx6/c;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, v2}, Lx6/c;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const-string v2, "name"

    .line 21
    .line 22
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance v0, Lx6/c;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, v1}, Lx6/c;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-string v1, "nameCondition"

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {p0, p2, v1, v2, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object v0, p1, Lr6/d;->c:Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    new-instance v1, Lx6/c;

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-direct {v1, v3}, Lx6/c;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const-string v3, "modifiers"

    .line 48
    .line 49
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    iget-object v0, p1, Lr6/d;->d:Ljava/util/LinkedHashSet;

    .line 54
    .line 55
    new-instance v1, Lx6/c;

    .line 56
    .line 57
    const/4 v3, 0x3

    .line 58
    invoke-direct {v1, v3}, Lx6/c;-><init>(I)V

    .line 59
    .line 60
    .line 61
    const-string v3, "modifiersNot"

    .line 62
    .line 63
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance v0, Lx6/c;

    .line 68
    .line 69
    const/4 v1, 0x4

    .line 70
    invoke-direct {v0, v1}, Lx6/c;-><init>(I)V

    .line 71
    .line 72
    .line 73
    const-string v1, "modifiersCondition"

    .line 74
    .line 75
    invoke-static {p0, p2, v1, v2, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance v0, Lx6/c;

    .line 80
    .line 81
    const/4 v1, 0x6

    .line 82
    invoke-direct {v0, v1}, Lx6/c;-><init>(I)V

    .line 83
    .line 84
    .line 85
    const-string v1, "isSynthetic"

    .line 86
    .line 87
    invoke-static {p0, p2, v1, v2, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    new-instance v0, Lx6/c;

    .line 92
    .line 93
    const/4 v1, 0x7

    .line 94
    invoke-direct {v0, v1}, Lx6/c;-><init>(I)V

    .line 95
    .line 96
    .line 97
    const-string v1, "isSyntheticNot"

    .line 98
    .line 99
    invoke-static {p0, p2, v1, v2, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    iget-object v0, p1, Lr6/d;->e:Ljava/util/LinkedHashSet;

    .line 104
    .line 105
    new-instance v1, Lx6/a;

    .line 106
    .line 107
    const/16 v3, 0x10

    .line 108
    .line 109
    invoke-direct {v1, p2, v3}, Lx6/a;-><init>(Lr6/c;I)V

    .line 110
    .line 111
    .line 112
    const-string v3, "annotations"

    .line 113
    .line 114
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iget-object p1, p1, Lr6/d;->f:Ljava/util/LinkedHashSet;

    .line 119
    .line 120
    new-instance v0, Lx6/a;

    .line 121
    .line 122
    const/16 v1, 0x11

    .line 123
    .line 124
    invoke-direct {v0, p2, v1}, Lx6/a;-><init>(Lr6/c;I)V

    .line 125
    .line 126
    .line 127
    const-string v1, "annotationsNot"

    .line 128
    .line 129
    invoke-static {p0, p2, v1, p1, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    new-instance p1, Lx6/c;

    .line 134
    .line 135
    const/16 v0, 0x8

    .line 136
    .line 137
    invoke-direct {p1, v0}, Lx6/c;-><init>(I)V

    .line 138
    .line 139
    .line 140
    const-string v0, "genericString"

    .line 141
    .line 142
    invoke-static {p0, p2, v0, v2, p1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0
.end method

.method public static final c(Ljava/lang/String;)I
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-ge v2, v3, :cond_1

    .line 9
    .line 10
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    int-to-long v3, v3

    .line 15
    const-wide/16 v5, 0x7f

    .line 16
    .line 17
    cmp-long v3, v3, v5

    .line 18
    .line 19
    if-lez v3, :cond_0

    .line 20
    .line 21
    const-wide/16 v3, 0x2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const-wide/16 v3, 0x1

    .line 25
    .line 26
    :goto_1
    add-long/2addr v0, v3

    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    long-to-int p0, v0

    .line 31
    return p0
.end method

.method public static final d(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Lx6/g;->c(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p0, v0

    .line 6
    if-lez p0, :cond_0

    .line 7
    .line 8
    const-string v0, " "

    .line 9
    .line 10
    invoke-static {p0, v0}, Log/t;->Z(ILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p1, p0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    return-object p1
.end method

.method public static e([Ljava/lang/reflect/AnnotatedElement;)Ljava/util/List;
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    aget-object v4, p0, v2

    .line 8
    .line 9
    invoke-interface {v4}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    array-length v4, v4

    .line 14
    add-int/2addr v3, v4

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-nez v3, :cond_1

    .line 19
    .line 20
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {}, La/a;->E()Luf/c;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    array-length v2, p0

    .line 28
    move v3, v1

    .line 29
    :goto_1
    if-ge v3, v2, :cond_3

    .line 30
    .line 31
    aget-object v4, p0, v3

    .line 32
    .line 33
    invoke-interface {v4}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    array-length v5, v4

    .line 38
    move v6, v1

    .line 39
    :goto_2
    if-ge v6, v5, :cond_2

    .line 40
    .line 41
    aget-object v7, v4, v6

    .line 42
    .line 43
    invoke-static {v7}, La/a;->Q(Ljava/lang/annotation/Annotation;)Lgg/f;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-interface {v7}, Lgg/e;->a()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v7}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    add-int/lit8 v6, v6, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public static f(Ljava/util/Collection;Ljava/util/List;Lr6/c;)Z
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    check-cast p0, Ljava/lang/Iterable;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    move v0, v2

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    add-int/lit8 v3, v0, 0x1

    .line 31
    .line 32
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/lang/Class;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static {v1, p2, v4}, Lx6/g;->k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-class v4, Ls6/b;

    .line 44
    .line 45
    invoke-static {v4}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-static {v5}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v4, v5

    .line 57
    :goto_1
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_2

    .line 62
    .line 63
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    :goto_2
    return v2

    .line 70
    :cond_2
    move v0, v3

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const/4 p0, 0x1

    .line 73
    return p0
.end method

.method public static g(Lng/i;Lr6/a;Lr6/c;)Lng/i;
    .locals 4

    .line 1
    sget-object v0, Lx6/f;->h:Lx6/f;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object v0, p1, Lr6/a;->g:Ljava/util/ArrayList;

    .line 8
    .line 9
    new-instance v1, Lx6/a;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 13
    .line 14
    .line 15
    const-string v2, "parameters"

    .line 16
    .line 17
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object v0, p1, Lr6/a;->h:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance v1, Lx6/a;

    .line 24
    .line 25
    const/16 v2, 0x8

    .line 26
    .line 27
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 28
    .line 29
    .line 30
    const-string v2, "parametersNot"

    .line 31
    .line 32
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v0, Lwb/m0;

    .line 37
    .line 38
    const/16 v1, 0x17

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lwb/m0;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const-string v1, "parametersCondition"

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-static {p0, p2, v1, v2, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance v0, Lwb/m0;

    .line 51
    .line 52
    const/16 v1, 0x18

    .line 53
    .line 54
    invoke-direct {v0, v1}, Lwb/m0;-><init>(I)V

    .line 55
    .line 56
    .line 57
    const-string v1, "parameterCount"

    .line 58
    .line 59
    invoke-static {p0, p2, v1, v2, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance v0, Lwb/m0;

    .line 64
    .line 65
    const/16 v1, 0x19

    .line 66
    .line 67
    invoke-direct {v0, v1}, Lwb/m0;-><init>(I)V

    .line 68
    .line 69
    .line 70
    const-string v1, "parameterCountCondition"

    .line 71
    .line 72
    invoke-static {p0, p2, v1, v2, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iget-object v0, p1, Lr6/a;->i:Ljava/util/LinkedHashSet;

    .line 77
    .line 78
    new-instance v1, Lwb/m0;

    .line 79
    .line 80
    const/16 v3, 0x1a

    .line 81
    .line 82
    invoke-direct {v1, v3}, Lwb/m0;-><init>(I)V

    .line 83
    .line 84
    .line 85
    const-string v3, "typeParameters"

    .line 86
    .line 87
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iget-object v0, p1, Lr6/a;->j:Ljava/util/LinkedHashSet;

    .line 92
    .line 93
    new-instance v1, Lwb/m0;

    .line 94
    .line 95
    const/16 v3, 0x1b

    .line 96
    .line 97
    invoke-direct {v1, v3}, Lwb/m0;-><init>(I)V

    .line 98
    .line 99
    .line 100
    const-string v3, "typeParametersNot"

    .line 101
    .line 102
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    iget-object v0, p1, Lr6/a;->k:Ljava/util/LinkedHashSet;

    .line 107
    .line 108
    new-instance v1, Lx6/a;

    .line 109
    .line 110
    const/16 v3, 0xe

    .line 111
    .line 112
    invoke-direct {v1, p2, v3}, Lx6/a;-><init>(Lr6/c;I)V

    .line 113
    .line 114
    .line 115
    const-string v3, "exceptionTypes"

    .line 116
    .line 117
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    iget-object v0, p1, Lr6/a;->l:Ljava/util/LinkedHashSet;

    .line 122
    .line 123
    new-instance v1, Lx6/a;

    .line 124
    .line 125
    const/16 v3, 0xf

    .line 126
    .line 127
    invoke-direct {v1, p2, v3}, Lx6/a;-><init>(Lr6/c;I)V

    .line 128
    .line 129
    .line 130
    const-string v3, "exceptionTypesNot"

    .line 131
    .line 132
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    iget-object v0, p1, Lr6/a;->m:Ljava/util/LinkedHashSet;

    .line 137
    .line 138
    new-instance v1, Lwb/m0;

    .line 139
    .line 140
    const/16 v3, 0x1d

    .line 141
    .line 142
    invoke-direct {v1, v3}, Lwb/m0;-><init>(I)V

    .line 143
    .line 144
    .line 145
    const-string v3, "genericExceptionTypes"

    .line 146
    .line 147
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    iget-object v0, p1, Lr6/a;->n:Ljava/util/LinkedHashSet;

    .line 152
    .line 153
    new-instance v1, Lwb/m0;

    .line 154
    .line 155
    const/16 v3, 0x11

    .line 156
    .line 157
    invoke-direct {v1, v3}, Lwb/m0;-><init>(I)V

    .line 158
    .line 159
    .line 160
    const-string v3, "genericExceptionTypesNot"

    .line 161
    .line 162
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    iget-object v0, p1, Lr6/a;->o:Ljava/util/LinkedHashSet;

    .line 167
    .line 168
    new-instance v1, Lwb/m0;

    .line 169
    .line 170
    const/16 v3, 0x12

    .line 171
    .line 172
    invoke-direct {v1, v3}, Lwb/m0;-><init>(I)V

    .line 173
    .line 174
    .line 175
    const-string v3, "genericParameters"

    .line 176
    .line 177
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    iget-object v0, p1, Lr6/a;->p:Ljava/util/LinkedHashSet;

    .line 182
    .line 183
    new-instance v1, Lwb/m0;

    .line 184
    .line 185
    const/16 v3, 0x13

    .line 186
    .line 187
    invoke-direct {v1, v3}, Lwb/m0;-><init>(I)V

    .line 188
    .line 189
    .line 190
    const-string v3, "genericParametersNot"

    .line 191
    .line 192
    invoke-static {p0, p2, v3, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    new-instance v0, Lwb/m0;

    .line 197
    .line 198
    const/16 v1, 0x14

    .line 199
    .line 200
    invoke-direct {v0, v1}, Lwb/m0;-><init>(I)V

    .line 201
    .line 202
    .line 203
    const-string v1, "isVarArgs"

    .line 204
    .line 205
    invoke-static {p0, p2, v1, v2, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    new-instance v0, Lwb/m0;

    .line 210
    .line 211
    const/16 v1, 0x15

    .line 212
    .line 213
    invoke-direct {v0, v1}, Lwb/m0;-><init>(I)V

    .line 214
    .line 215
    .line 216
    const-string v1, "isVarArgsNot"

    .line 217
    .line 218
    invoke-static {p0, p2, v1, v2, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    iget-object v0, p1, Lr6/a;->q:Ljava/util/ArrayList;

    .line 223
    .line 224
    new-instance v1, Lx6/a;

    .line 225
    .line 226
    const/4 v2, 0x3

    .line 227
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 228
    .line 229
    .line 230
    const-string v2, "parameterAnnotations"

    .line 231
    .line 232
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    iget-object v0, p1, Lr6/a;->r:Ljava/util/ArrayList;

    .line 237
    .line 238
    new-instance v1, Lx6/a;

    .line 239
    .line 240
    const/4 v2, 0x4

    .line 241
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 242
    .line 243
    .line 244
    const-string v2, "parameterAnnotationsNot"

    .line 245
    .line 246
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    iget-object v0, p1, Lr6/a;->s:Ljava/util/LinkedHashSet;

    .line 251
    .line 252
    new-instance v1, Lx6/a;

    .line 253
    .line 254
    const/4 v2, 0x5

    .line 255
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 256
    .line 257
    .line 258
    const-string v2, "annotatedReturnType"

    .line 259
    .line 260
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    iget-object v0, p1, Lr6/a;->t:Ljava/util/LinkedHashSet;

    .line 265
    .line 266
    new-instance v1, Lx6/a;

    .line 267
    .line 268
    const/4 v2, 0x6

    .line 269
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 270
    .line 271
    .line 272
    const-string v2, "annotatedReturnTypeNot"

    .line 273
    .line 274
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    iget-object v0, p1, Lr6/a;->u:Ljava/util/LinkedHashSet;

    .line 279
    .line 280
    new-instance v1, Lx6/a;

    .line 281
    .line 282
    const/4 v2, 0x7

    .line 283
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 284
    .line 285
    .line 286
    const-string v2, "annotatedReceiverType"

    .line 287
    .line 288
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    iget-object v0, p1, Lr6/a;->v:Ljava/util/LinkedHashSet;

    .line 293
    .line 294
    new-instance v1, Lx6/a;

    .line 295
    .line 296
    const/16 v2, 0x9

    .line 297
    .line 298
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 299
    .line 300
    .line 301
    const-string v2, "annotatedReceiverTypeNot"

    .line 302
    .line 303
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    iget-object v0, p1, Lr6/a;->w:Ljava/util/LinkedHashSet;

    .line 308
    .line 309
    new-instance v1, Lx6/a;

    .line 310
    .line 311
    const/16 v2, 0xa

    .line 312
    .line 313
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 314
    .line 315
    .line 316
    const-string v2, "annotatedParameterTypes"

    .line 317
    .line 318
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    iget-object v0, p1, Lr6/a;->x:Ljava/util/LinkedHashSet;

    .line 323
    .line 324
    new-instance v1, Lx6/a;

    .line 325
    .line 326
    const/16 v2, 0xb

    .line 327
    .line 328
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 329
    .line 330
    .line 331
    const-string v2, "annotatedParameterTypesNot"

    .line 332
    .line 333
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    iget-object v0, p1, Lr6/a;->y:Ljava/util/LinkedHashSet;

    .line 338
    .line 339
    new-instance v1, Lx6/a;

    .line 340
    .line 341
    const/16 v2, 0xc

    .line 342
    .line 343
    invoke-direct {v1, p2, v2}, Lx6/a;-><init>(Lr6/c;I)V

    .line 344
    .line 345
    .line 346
    const-string v2, "annotatedExceptionTypes"

    .line 347
    .line 348
    invoke-static {p0, p2, v2, v0, v1}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    iget-object p1, p1, Lr6/a;->z:Ljava/util/LinkedHashSet;

    .line 353
    .line 354
    new-instance v0, Lx6/a;

    .line 355
    .line 356
    const/16 v1, 0xd

    .line 357
    .line 358
    invoke-direct {v0, p2, v1}, Lx6/a;-><init>(Lr6/c;I)V

    .line 359
    .line 360
    .line 361
    const-string v1, "annotatedExceptionTypesNot"

    .line 362
    .line 363
    invoke-static {p0, p2, v1, p1, v0}, Lx6/g;->h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    return-object p0
.end method

.method public static h(Lng/j;Lr6/c;Ljava/lang/String;Ljava/lang/Object;Lfg/p;)Lng/i;
    .locals 1

    .line 1
    new-instance v0, Lwb/dj;

    .line 2
    .line 3
    invoke-direct {v0, p3, p4, p1, p2}, Lwb/dj;-><init>(Ljava/lang/Object;Lfg/p;Lr6/c;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lng/i;

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    invoke-direct {p1, p0, p2, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public static i(Lr6/d;Lr6/c;Ljava/lang/Class;Lfg/l;)Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v1}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v1, v2

    .line 19
    :goto_0
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    invoke-interface {p3, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Ljava/util/Collection;

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-eqz p3, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {p0, p1}, Lx6/g;->j(Lr6/d;Lr6/c;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object v0, p2

    .line 46
    :goto_1
    check-cast v0, Ljava/util/List;

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_3
    :goto_2
    invoke-static {p0, p1}, Lx6/g;->j(Lr6/d;Lr6/c;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public static j(Lr6/d;Lr6/c;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, " (Kotlin reflection is not available)"

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v4, v2, Lr6/c;->a:Ljava/lang/Class;

    .line 11
    .line 12
    const-string v5, ""

    .line 13
    .line 14
    const-string v0, "-+"

    .line 15
    .line 16
    const-string v6, "+-"

    .line 17
    .line 18
    const-string v7, "-"

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    :try_start_0
    invoke-virtual {v1}, Lr6/d;->a()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    new-instance v10, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v11

    .line 42
    if-eqz v11, :cond_7

    .line 43
    .line 44
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    check-cast v11, Ljava/util/Map$Entry;

    .line 49
    .line 50
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v12

    .line 54
    check-cast v12, Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    const/4 v13, 0x0

    .line 61
    if-nez v11, :cond_1

    .line 62
    .line 63
    :goto_1
    move-object v11, v13

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    instance-of v14, v11, Lsf/b;

    .line 66
    .line 67
    if-eqz v14, :cond_2

    .line 68
    .line 69
    const-string v11, "(Runtime Condition)"

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :cond_2
    instance-of v14, v11, Ljava/util/Collection;

    .line 76
    .line 77
    if-eqz v14, :cond_4

    .line 78
    .line 79
    move-object v14, v11

    .line 80
    check-cast v14, Ljava/util/Collection;

    .line 81
    .line 82
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    if-eqz v14, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-static {v11}, Ls6/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-static {v11}, Ls6/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    :goto_2
    if-eqz v11, :cond_5

    .line 99
    .line 100
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    invoke-static {v11, v3, v5, v8}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    move-object v11, v13

    .line 110
    :goto_3
    if-eqz v11, :cond_6

    .line 111
    .line 112
    new-instance v13, Lsf/e;

    .line 113
    .line 114
    invoke-direct {v13, v12, v11}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    if-eqz v13, :cond_0

    .line 118
    .line 119
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_7
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-eqz v9, :cond_8

    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    goto/16 :goto_7

    .line 134
    .line 135
    :cond_8
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_f

    .line 144
    .line 145
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    check-cast v11, Lsf/e;

    .line 150
    .line 151
    iget-object v11, v11, Lsf/e;->g:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v11, Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v11}, Lx6/g;->c(Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    :cond_9
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    if-eqz v12, :cond_a

    .line 164
    .line 165
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v12

    .line 169
    check-cast v12, Lsf/e;

    .line 170
    .line 171
    iget-object v12, v12, Lsf/e;->g:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v12, Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v12}, Lx6/g;->c(Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v12

    .line 179
    if-ge v11, v12, :cond_9

    .line 180
    .line 181
    move v11, v12

    .line 182
    goto :goto_4

    .line 183
    :cond_a
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    if-eqz v12, :cond_e

    .line 192
    .line 193
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    check-cast v12, Lsf/e;

    .line 198
    .line 199
    iget-object v12, v12, Lsf/e;->h:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v12, Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v12}, Lx6/g;->c(Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    :cond_b
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    if-eqz v13, :cond_c

    .line 212
    .line 213
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    check-cast v13, Lsf/e;

    .line 218
    .line 219
    iget-object v13, v13, Lsf/e;->h:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v13, Ljava/lang/String;

    .line 222
    .line 223
    invoke-static {v13}, Lx6/g;->c(Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    if-ge v12, v13, :cond_b

    .line 228
    .line 229
    move v12, v13

    .line 230
    goto :goto_5

    .line 231
    :cond_c
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    invoke-static {v9, v3, v5, v8}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    invoke-static {v9}, Lx6/g;->c(Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    move-result v13

    .line 243
    add-int v14, v11, v12

    .line 244
    .line 245
    add-int/lit8 v14, v14, 0x3

    .line 246
    .line 247
    sub-int/2addr v13, v14

    .line 248
    if-gez v13, :cond_d

    .line 249
    .line 250
    move v13, v8

    .line 251
    :cond_d
    add-int/2addr v12, v13

    .line 252
    invoke-static {v11, v7}, Log/t;->Z(ILjava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v13

    .line 256
    invoke-static {v12, v7}, Log/t;->Z(ILjava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v14

    .line 260
    new-instance v15, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-string v13, "-+-"

    .line 272
    .line 273
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    add-int v14, v11, v12

    .line 287
    .line 288
    add-int/lit8 v14, v14, 0x3

    .line 289
    .line 290
    invoke-static {v14, v7}, Log/t;->Z(ILjava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    new-instance v15, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-static {v14, v9}, Lx6/g;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v6

    .line 316
    new-instance v7, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 319
    .line 320
    .line 321
    const-string v9, "| "

    .line 322
    .line 323
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    const-string v6, " |"

    .line 330
    .line 331
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    const-string v7, "\n"

    .line 339
    .line 340
    new-instance v14, Lx6/b;

    .line 341
    .line 342
    invoke-direct {v14, v11, v12}, Lx6/b;-><init>(II)V

    .line 343
    .line 344
    .line 345
    const/16 v15, 0x1e

    .line 346
    .line 347
    const/4 v12, 0x0

    .line 348
    move-object v9, v13

    .line 349
    const/4 v13, 0x0

    .line 350
    move-object v11, v7

    .line 351
    invoke-static/range {v10 .. v15}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    filled-new-array {v0, v6, v9, v7, v9}, [Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v9

    .line 363
    const-string v10, "\n"

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const/16 v14, 0x3e

    .line 367
    .line 368
    const/4 v11, 0x0

    .line 369
    const/4 v12, 0x0

    .line 370
    invoke-static/range {v9 .. v14}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    goto :goto_7

    .line 375
    :cond_e
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 376
    .line 377
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 378
    .line 379
    .line 380
    throw v0

    .line 381
    :cond_f
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 382
    .line 383
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 384
    .line 385
    .line 386
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 387
    :goto_6
    new-instance v6, Lsf/f;

    .line 388
    .line 389
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    move-object v0, v6

    .line 393
    :goto_7
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    invoke-static {v4, v3, v5, v8}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    const-string v4, "\nFailed to build condition table."

    .line 402
    .line 403
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    instance-of v4, v0, Lsf/f;

    .line 408
    .line 409
    if-eqz v4, :cond_10

    .line 410
    .line 411
    move-object v0, v3

    .line 412
    :cond_10
    check-cast v0, Ljava/lang/String;

    .line 413
    .line 414
    instance-of v3, v1, Lq6/c;

    .line 415
    .line 416
    const-string v4, "Unsupported condition type: "

    .line 417
    .line 418
    const-string v6, "\nSuggestion: "

    .line 419
    .line 420
    const-string v7, ".\n"

    .line 421
    .line 422
    const-string v8, "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. "

    .line 423
    .line 424
    if-eqz v3, :cond_11

    .line 425
    .line 426
    const-string v9, "No method found matching the condition for current class"

    .line 427
    .line 428
    invoke-static {v9, v5, v7, v0, v6}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    goto :goto_8

    .line 440
    :cond_11
    instance-of v9, v1, Lq6/a;

    .line 441
    .line 442
    if-eqz v9, :cond_12

    .line 443
    .line 444
    const-string v5, "No constructor found matching the condition for current class.\n"

    .line 445
    .line 446
    const-string v6, "\nSuggestion: Constructors are not inherited from superclass, check if the conditions are correct and valid, and try again. "

    .line 447
    .line 448
    invoke-static {v5, v0, v6}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    goto :goto_8

    .line 453
    :cond_12
    instance-of v9, v1, Lq6/b;

    .line 454
    .line 455
    if-eqz v9, :cond_18

    .line 456
    .line 457
    const-string v9, "No field found matching the condition for current class"

    .line 458
    .line 459
    invoke-static {v9, v5, v7, v0, v6}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    :goto_8
    iget-object v2, v2, Lr6/c;->b:Lr6/b;

    .line 471
    .line 472
    sget-object v5, Lr6/b;->g:Lr6/b;

    .line 473
    .line 474
    if-ne v2, v5, :cond_16

    .line 475
    .line 476
    const-string v2, "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"

    .line 477
    .line 478
    if-nez v3, :cond_15

    .line 479
    .line 480
    instance-of v3, v1, Lq6/a;

    .line 481
    .line 482
    if-nez v3, :cond_14

    .line 483
    .line 484
    instance-of v3, v1, Lq6/b;

    .line 485
    .line 486
    if-nez v3, :cond_13

    .line 487
    .line 488
    invoke-static {v1, v4}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    return-void

    .line 492
    :cond_13
    new-instance v1, Ljava/lang/NoSuchFieldException;

    .line 493
    .line 494
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-direct {v1, v0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    goto :goto_9

    .line 502
    :cond_14
    new-instance v1, Ljava/lang/NoSuchMethodException;

    .line 503
    .line 504
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-direct {v1, v0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    goto :goto_9

    .line 512
    :cond_15
    new-instance v1, Ljava/lang/NoSuchMethodException;

    .line 513
    .line 514
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-direct {v1, v0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    :goto_9
    throw v1

    .line 522
    :cond_16
    sget-object v1, Lr6/b;->h:Lr6/b;

    .line 523
    .line 524
    if-ne v2, v1, :cond_17

    .line 525
    .line 526
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    sget-object v0, Ly6/b;->a:Ly6/a;

    .line 534
    .line 535
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 536
    .line 537
    .line 538
    :cond_17
    return-void

    .line 539
    :cond_18
    invoke-static {v1, v4}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    return-void
.end method

.method public static k(Ljava/lang/Object;Lr6/c;Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    instance-of v0, p0, Lmg/b;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Lmg/b;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast p0, Lgg/e;

    .line 18
    .line 19
    invoke-interface {p0}, Lgg/e;->a()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v0, :cond_5

    .line 30
    .line 31
    iget-object v0, p1, Lr6/c;->b:Lr6/b;

    .line 32
    .line 33
    iget-object p1, p1, Lr6/c;->a:Ljava/lang/Class;

    .line 34
    .line 35
    sget-object v1, Lr6/b;->g:Lr6/b;

    .line 36
    .line 37
    if-ne v0, v1, :cond_2

    .line 38
    .line 39
    check-cast p0, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1, p0}, Lt6/a;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    check-cast p0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :try_start_0
    invoke-static {p1, p0}, Lt6/a;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    new-instance p1, Lsf/f;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object p0, p1

    .line 68
    :goto_0
    nop

    .line 69
    instance-of p1, p0, Lsf/f;

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    :cond_3
    check-cast p0, Ljava/lang/Class;

    .line 75
    .line 76
    if-nez p0, :cond_6

    .line 77
    .line 78
    const-class p0, Lx6/d;

    .line 79
    .line 80
    invoke-static {p0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-nez p1, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move-object p0, p1

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    instance-of p1, p0, Ls6/b;

    .line 94
    .line 95
    if-eqz p1, :cond_a

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :cond_6
    :goto_1
    const-class p1, Ls6/b;

    .line 102
    .line 103
    invoke-static {p1}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0}, La/a;->a0(Lgg/f;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-nez v0, :cond_7

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_7
    move-object p1, v0

    .line 115
    :goto_2
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_9

    .line 120
    .line 121
    if-nez p2, :cond_8

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_8
    const-string p0, "VagueType is not supported for \""

    .line 125
    .line 126
    const-string p1, "\"."

    .line 127
    .line 128
    invoke-static {p2, p0, p1}, Lokio/a;->m(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :goto_3
    const/4 p0, 0x0

    .line 132
    :cond_9
    :goto_4
    return-object p0

    .line 133
    :cond_a
    const-string p1, "Unsupported type: "

    .line 134
    .line 135
    const-string p2, ", supported types are Class, KClass, String and VagueType."

    .line 136
    .line 137
    invoke-static {p0, p1, p2}, Lokio/a;->m(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3
.end method
