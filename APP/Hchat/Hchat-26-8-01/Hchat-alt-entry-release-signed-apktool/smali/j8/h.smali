.class public final Lj8/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lh/Hchat/dexkit/DexFinder;

.field public final c:Ljava/lang/ClassLoader;

.field public final d:Lorg/luckypray/dexkit/DexKitBridge;

.field public final e:Lq8/o;

.field public final f:Lfb/k1;

.field public final g:Ljava/util/LinkedHashMap;

.field public final h:Ljava/lang/Object;

.field public volatile i:J

.field public volatile j:Z

.field public volatile k:Ljava/lang/String;

.field public final l:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lq8/o;Lj8/o;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lj8/h;->a:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lj8/h;->b:Lh/Hchat/dexkit/DexFinder;

    .line 10
    .line 11
    iput-object p3, p0, Lj8/h;->c:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    iput-object p4, p0, Lj8/h;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 14
    .line 15
    iput-object p5, p0, Lj8/h;->e:Lq8/o;

    .line 16
    .line 17
    new-instance p1, Lfb/k1;

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    const/16 p3, 0x50

    .line 21
    .line 22
    const/high16 p4, 0x3f400000    # 0.75f

    .line 23
    .line 24
    const/4 p5, 0x1

    .line 25
    invoke-direct {p1, p3, p4, p5, p2}, Lfb/k1;-><init>(IFZI)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lj8/h;->f:Lfb/k1;

    .line 29
    .line 30
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    new-instance p1, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lj8/h;->h:Ljava/lang/Object;

    .line 43
    .line 44
    iput-boolean p5, p0, Lj8/h;->j:Z

    .line 45
    .line 46
    const-string p1, ""

    .line 47
    .line 48
    iput-object p1, p0, Lj8/h;->k:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lj8/h;->l:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 55
    .line 56
    return-void
.end method

.method public static C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    const-string v0, "(?:\\s[^>]*)?>(.*?)</"

    .line 9
    .line 10
    const-string v1, ">"

    .line 11
    .line 12
    const-string v2, "<"

    .line 13
    .line 14
    invoke-static {v2, p1, v0, p1, v1}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Log/l;->h:Log/l;

    .line 19
    .line 20
    sget-object v1, Log/l;->i:Log/l;

    .line 21
    .line 22
    filled-new-array {v0, v1}, [Log/l;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/Iterable;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x0

    .line 37
    move v2, v1

    .line 38
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Log/l;

    .line 49
    .line 50
    iget v3, v3, Log/l;->g:I

    .line 51
    .line 52
    or-int/2addr v2, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-static {v2}, Ll3/w;->f(I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-static {p1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const/4 p1, 0x1

    .line 83
    invoke-static {p1, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Ljava/lang/String;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const/4 p0, 0x0

    .line 91
    :goto_1
    if-nez p0, :cond_3

    .line 92
    .line 93
    :goto_2
    const-string p0, ""

    .line 94
    .line 95
    :cond_3
    return-object p0
.end method

.method public static varargs D(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-lt v1, v0, :cond_0

    .line 4
    .line 5
    const-string p0, ""

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    aget-object v2, p1, v1

    .line 9
    .line 10
    invoke-static {p0, v2}, Lj8/h;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "<![CDATA["

    .line 23
    .line 24
    invoke-static {v2, v3}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "]]>"

    .line 29
    .line 30
    invoke-static {v2, v3}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Lj8/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0
.end method

.method public static final a(Lj8/h;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-string v0, ": "

    .line 12
    .line 13
    invoke-static {p1, v0, p2}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lj8/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lj8/h;->o(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-nez p0, :cond_1

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    .line 17
    :cond_1
    return-object p0
.end method

.method public static f(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;I)V
    .locals 4

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-gt p3, v0, :cond_7

    .line 5
    .line 6
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance p2, Log/k;

    .line 19
    .line 20
    const-string p3, "(?:wxid_[A-Za-z0-9_-]+|gh_[A-Za-z0-9_-]+|[A-Za-z0-9_-]+@(?:im\\.)?chatroom)"

    .line 21
    .line 22
    invoke-direct {p2, p3}, Log/k;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast p0, Ljava/lang/CharSequence;

    .line 26
    .line 27
    invoke-static {p2, p0}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance p2, Lf/i0;

    .line 32
    .line 33
    invoke-direct {p2, p0}, Lf/i0;-><init>(Lng/c;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {p2}, Lf/i0;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_7

    .line 41
    .line 42
    invoke-virtual {p2}, Lf/i0;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Log/f;

    .line 47
    .line 48
    check-cast p0, Log/i;

    .line 49
    .line 50
    invoke-virtual {p0}, Log/i;->c()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    instance-of v0, p0, Ljava/util/Collection;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    check-cast p0, Ljava/lang/Iterable;

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_7

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    add-int/lit8 v1, p3, 0x1

    .line 79
    .line 80
    invoke-static {v0, p1, p2, v1}, Lj8/h;->f(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;I)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    instance-of v0, p0, [Ljava/lang/Object;

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    check-cast p0, [Ljava/lang/Object;

    .line 90
    .line 91
    array-length v0, p0

    .line 92
    :goto_2
    if-ge v1, v0, :cond_7

    .line 93
    .line 94
    aget-object v2, p0, v1

    .line 95
    .line 96
    add-int/lit8 v3, p3, 0x1

    .line 97
    .line 98
    invoke-static {v2, p1, p2, v3}, Lj8/h;->f(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;I)V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v2, "java."

    .line 113
    .line 114
    invoke-static {v0, v2, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_7

    .line 119
    .line 120
    const-string v2, "android."

    .line 121
    .line 122
    invoke-static {v0, v2, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :goto_3
    if-eqz v0, :cond_7

    .line 134
    .line 135
    const-class v1, Ljava/lang/Object;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_7

    .line 142
    .line 143
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    :cond_5
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_6

    .line 156
    .line 157
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, Ljava/lang/reflect/Field;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-nez v3, :cond_5

    .line 172
    .line 173
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    add-int/lit8 v3, p3, 0x1

    .line 178
    .line 179
    invoke-static {v2, p1, p2, v3}, Lj8/h;->f(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;I)V

    .line 180
    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    goto :goto_3

    .line 188
    :cond_7
    :goto_5
    return-void
.end method

.method public static g(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;I)V
    .locals 5

    .line 1
    if-eqz p0, :cond_c

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-gt p3, v0, :cond_c

    .line 5
    .line 6
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_7

    .line 13
    .line 14
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p0}, Lj8/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    :goto_0
    const-string p0, ""

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const/16 p2, 0xa0

    .line 43
    .line 44
    invoke-static {p2, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-lez p2, :cond_3

    .line 53
    .line 54
    move v1, v2

    .line 55
    :cond_3
    if-eqz v1, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    const/4 p0, 0x0

    .line 59
    :goto_2
    if-eqz p0, :cond_c

    .line 60
    .line 61
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_5
    instance-of v0, p0, Ljava/util/Collection;

    .line 66
    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    check-cast p0, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_c

    .line 80
    .line 81
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    add-int/lit8 v1, p3, 0x1

    .line 86
    .line 87
    invoke-static {v0, p1, p2, v1}, Lj8/h;->g(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    instance-of v0, p0, [Ljava/lang/Object;

    .line 92
    .line 93
    if-eqz v0, :cond_7

    .line 94
    .line 95
    check-cast p0, [Ljava/lang/Object;

    .line 96
    .line 97
    array-length v0, p0

    .line 98
    :goto_4
    if-ge v1, v0, :cond_c

    .line 99
    .line 100
    aget-object v3, p0, v1

    .line 101
    .line 102
    add-int/lit8 v4, p3, 0x1

    .line 103
    .line 104
    invoke-static {v3, p1, p2, v4}, Lj8/h;->g(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;I)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const-string v3, "java."

    .line 119
    .line 120
    invoke-static {v0, v3, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_c

    .line 125
    .line 126
    const-string v3, "android."

    .line 127
    .line 128
    invoke-static {v0, v3, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_5
    if-eqz v0, :cond_c

    .line 140
    .line 141
    const-class v1, Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_c

    .line 148
    .line 149
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    :cond_9
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_b

    .line 162
    .line 163
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, Ljava/lang/reflect/Field;

    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_a

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_a
    invoke-static {v3, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    if-eqz v3, :cond_9

    .line 185
    .line 186
    add-int/lit8 v4, p3, 0x1

    .line 187
    .line 188
    invoke-static {v3, p1, p2, v4}, Lj8/h;->g(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;I)V

    .line 189
    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    goto :goto_5

    .line 197
    :cond_c
    :goto_7
    return-void
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-static {p0, v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const v0, 0xfffc

    .line 20
    .line 21
    .line 22
    const/16 v2, 0x20

    .line 23
    .line 24
    invoke-static {p0, v0, v2}, Log/t;->b0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v0, "[\\u0000-\\u0008\\u000B\\u000C\\u000E-\\u001F\\u007F]"

    .line 29
    .line 30
    invoke-static {v0, p0, v1}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "\\s+"

    .line 35
    .line 36
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const-string v1, " "

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public static k(Ljava/lang/Object;)I
    .locals 2

    .line 1
    const-string v0, "field_type"

    .line 2
    .line 3
    const-string v1, "type"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lj8/h;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static l(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "field_content"

    .line 2
    .line 3
    const-string v1, "content"

    .line 4
    .line 5
    const-string v2, "field_xml"

    .line 6
    .line 7
    const-string v3, "xml"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    const/4 v2, 0x4

    .line 15
    if-lt v1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    aget-object v2, v0, v1

    .line 19
    .line 20
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    instance-of v3, v2, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v2, 0x0

    .line 32
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_3

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    :goto_2
    const-string p0, ""

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    return-object v2

    .line 44
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0
.end method

.method public static varargs m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-lt v1, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    aget-object v2, p1, v1

    .line 8
    .line 9
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    instance-of v3, v2, Ljava/lang/Number;

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    check-cast v2, Ljava/lang/Number;

    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0
.end method

.method public static o(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-lez v0, :cond_1

    .line 15
    .line 16
    move v0, v1

    .line 17
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ge v0, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v2}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v1
.end method

.method public static p(Ljava/lang/String;)Z
    .locals 14

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-static {v0, p0, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_7

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v3, 0x2

    .line 27
    if-ge v1, v3, :cond_0

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_0
    const-string v12, "htm"

    .line 32
    .line 33
    const-string v13, "html"

    .line 34
    .line 35
    const-string v4, "silk"

    .line 36
    .line 37
    const-string v5, "amr"

    .line 38
    .line 39
    const-string v6, "mp3"

    .line 40
    .line 41
    const-string v7, "mp4"

    .line 42
    .line 43
    const-string v8, "jpg"

    .line 44
    .line 45
    const-string v9, "jpeg"

    .line 46
    .line 47
    const-string v10, "png"

    .line 48
    .line 49
    const-string v11, "gif"

    .line 50
    .line 51
    filled-new-array/range {v4 .. v13}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_1
    const-string v1, "wxid_"

    .line 68
    .line 69
    invoke-static {v0, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_7

    .line 74
    .line 75
    const-string v1, "@chatroom"

    .line 76
    .line 77
    invoke-static {v0, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const-string v1, "content://"

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_7

    .line 91
    .line 92
    const-string v0, "/"

    .line 93
    .line 94
    invoke-static {p0, v0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_7

    .line 99
    .line 100
    const-string v0, "^[A-Za-z]:[\\\\/]"

    .line 101
    .line 102
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    const-string v0, "^[0-9a-f]{16,}$"

    .line 121
    .line 122
    invoke-static {v3}, Ll3/w;->f(I)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    const-string v1, " "

    .line 134
    .line 135
    const-string v3, ""

    .line 136
    .line 137
    invoke-static {p0, v1, v3, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_4

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_4
    const-string v0, "^[A-Za-z0-9_-]{24,}$"

    .line 153
    .line 154
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_5

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_5
    const-string v0, "."

    .line 173
    .line 174
    invoke-static {p0, v0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-eqz p0, :cond_6

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_6
    const/4 p0, 0x1

    .line 182
    return p0

    .line 183
    :cond_7
    :goto_0
    return v2
.end method

.method public static x(Ljava/lang/Object;)Ljava/util/List;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {p0, v0, v1, v2}, Lj8/h;->g(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    cmp-long v1, v1, v3

    .line 28
    .line 29
    if-gtz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-virtual {p0, v0, v1, p1}, Lj8/h;->z(JLjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :cond_1
    :goto_0
    const-string p1, "\u53d1\u9001\u6536\u85cf\u5931\u8d25: localId \u975e\u6cd5 "

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return p1
.end method

.method public final B(Ljava/lang/String;Lj8/c;)Z
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p2, Lj8/c;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lj8/p;->b:Lj8/y;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget p2, p2, Lj8/c;->b:I

    .line 27
    .line 28
    invoke-virtual {v0, p2, p1, v1}, Lj8/y;->s(ILjava/lang/String;Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 p2, 0x1

    .line 33
    if-ne p1, p2, :cond_1

    .line 34
    .line 35
    move v2, p2

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_2

    .line 44
    :goto_1
    new-instance p2, Lsf/f;

    .line 45
    .line 46
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p1, p2

    .line 50
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    if-nez p2, :cond_2

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v0, "\u53d1\u9001\u6536\u85cf\u8bed\u97f3\u5931\u8d25: "

    .line 64
    .line 65
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    return p1
.end method

.method public final b(Ljava/lang/Object;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj8/h;->f:Lfb/k1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lj8/h;->f:Lfb/k1;

    .line 5
    .line 6
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {v1, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    monitor-exit v0

    .line 17
    throw p1
.end method

.method public final c()Lj8/g;
    .locals 5

    .line 1
    iget-object v0, p0, Lj8/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lj8/g;

    .line 5
    .line 6
    iget-object v2, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v2, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-static {v2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-boolean v3, p0, Lj8/h;->j:Z

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v1, v2, v3, v4}, Lj8/g;-><init>(Ljava/util/List;ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-object v1

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    monitor-exit v0

    .line 31
    throw v1
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lj8/h;->b:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->favoriteServiceClass:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->favoriteServiceResolverMethod:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->favoriteStorageGetterMethod:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->favoriteListMethod:Ljava/lang/reflect/Method;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final i(Ljava/lang/Object;)Lj8/i;
    .locals 29

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-eqz v0, :cond_5b

    .line 4
    .line 5
    const-string v2, "localId"

    .line 6
    .line 7
    const-string v3, "id"

    .line 8
    .line 9
    const-string v4, "field_localId"

    .line 10
    .line 11
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v0, v2}, Lj8/h;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_5b

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    invoke-static {v0}, Lj8/h;->k(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    const-string v2, "datatotalsize"

    .line 30
    .line 31
    const-string v3, "totalSize"

    .line 32
    .line 33
    const-string v7, "field_datatotalsize"

    .line 34
    .line 35
    filled-new-array {v7, v2, v3}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v0, v2}, Lj8/h;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-wide/16 v7, 0x0

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    move-wide v9, v2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-wide v9, v7

    .line 54
    :goto_0
    const-string v2, "field_updateTime"

    .line 55
    .line 56
    const-string v3, "updateTime"

    .line 57
    .line 58
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v0, v2}, Lj8/h;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    const-wide/16 v7, 0x1

    .line 73
    .line 74
    cmp-long v7, v7, v2

    .line 75
    .line 76
    if-gtz v7, :cond_1

    .line 77
    .line 78
    const-wide v7, 0x2540be400L

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    cmp-long v7, v2, v7

    .line 84
    .line 85
    if-gez v7, :cond_1

    .line 86
    .line 87
    const-wide/16 v7, 0x3e8

    .line 88
    .line 89
    mul-long/2addr v2, v7

    .line 90
    :cond_1
    move-wide v7, v2

    .line 91
    :cond_2
    move-wide v11, v7

    .line 92
    invoke-static {v0}, Lj8/h;->l(Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const-string v3, "field_favProto"

    .line 97
    .line 98
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    const-string v8, ""

    .line 103
    .line 104
    const-class v14, Ljava/util/Collection;

    .line 105
    .line 106
    const-class v15, Ljava/lang/Object;

    .line 107
    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    if-ne v6, v1, :cond_b

    .line 112
    .line 113
    const-string v1, "content"

    .line 114
    .line 115
    const-string v7, "title"

    .line 116
    .line 117
    const-string v13, "desc"

    .line 118
    .line 119
    filled-new-array {v13, v1, v7}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {v2, v1}, Lj8/h;->D(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-nez v7, :cond_3

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    move-object/from16 v1, v16

    .line 135
    .line 136
    :goto_1
    if-eqz v1, :cond_4

    .line 137
    .line 138
    const/16 v7, 0xa0

    .line 139
    .line 140
    invoke-static {v7, v1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    :goto_2
    move-object/from16 v7, p0

    .line 145
    .line 146
    move-wide/from16 v21, v4

    .line 147
    .line 148
    goto/16 :goto_e

    .line 149
    .line 150
    :cond_4
    invoke-static {v3}, Lj8/h;->x(Ljava/lang/Object;)Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    new-instance v7, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    if-eqz v13, :cond_6

    .line 168
    .line 169
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    move-object/from16 v21, v13

    .line 174
    .line 175
    check-cast v21, Ljava/lang/String;

    .line 176
    .line 177
    invoke-static/range {v21 .. v21}, Lj8/h;->p(Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v21

    .line 181
    if-eqz v21, :cond_5

    .line 182
    .line 183
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_6
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-nez v7, :cond_7

    .line 196
    .line 197
    move-object/from16 v7, v16

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-nez v13, :cond_8

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_8
    move-object v13, v7

    .line 212
    check-cast v13, Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v13

    .line 222
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v21

    .line 226
    move-object/from16 v22, v21

    .line 227
    .line 228
    check-cast v22, Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    .line 231
    .line 232
    .line 233
    move-result v22

    .line 234
    move-object/from16 v23, v1

    .line 235
    .line 236
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v13, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 241
    .line 242
    .line 243
    move-result v22

    .line 244
    if-gez v22, :cond_9

    .line 245
    .line 246
    move-object v13, v1

    .line 247
    move-object/from16 v7, v21

    .line 248
    .line 249
    :cond_9
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-nez v1, :cond_a

    .line 254
    .line 255
    :goto_5
    check-cast v7, Ljava/lang/String;

    .line 256
    .line 257
    if-eqz v7, :cond_b

    .line 258
    .line 259
    const/16 v1, 0xa0

    .line 260
    .line 261
    invoke-static {v1, v7}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    goto :goto_2

    .line 266
    :cond_a
    move-object/from16 v1, v23

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_b
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_c

    .line 274
    .line 275
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 276
    .line 277
    move-object/from16 v7, p0

    .line 278
    .line 279
    move-wide/from16 v21, v4

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_c
    new-instance v1, Log/k;

    .line 283
    .line 284
    sget-object v7, Log/l;->h:Log/l;

    .line 285
    .line 286
    sget-object v13, Log/l;->i:Log/l;

    .line 287
    .line 288
    filled-new-array {v7, v13}, [Log/l;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-static {v7}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    const-string v13, "<(title|desc|description|content|filename|fileName|appname|sourcename|locationname)(?:\\s[^>]*)?>(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?</\\1>"

    .line 297
    .line 298
    invoke-direct {v1, v13, v7}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v1, v2}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    new-instance v2, Li2/z;

    .line 306
    .line 307
    const/16 v13, 0xa

    .line 308
    .line 309
    move-object/from16 v7, p0

    .line 310
    .line 311
    invoke-direct {v2, v7, v13}, Li2/z;-><init>(Ljava/lang/Object;I)V

    .line 312
    .line 313
    .line 314
    invoke-static {v1, v2}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    new-instance v2, Li2/z;

    .line 319
    .line 320
    const/16 v13, 0xb

    .line 321
    .line 322
    invoke-direct {v2, v13}, Li2/z;-><init>(I)V

    .line 323
    .line 324
    .line 325
    new-instance v13, Lng/i;

    .line 326
    .line 327
    move-wide/from16 v21, v4

    .line 328
    .line 329
    const/4 v4, 0x1

    .line 330
    invoke-direct {v13, v1, v4, v2}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 331
    .line 332
    .line 333
    invoke-static {v13}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    :goto_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    if-eqz v2, :cond_e

    .line 346
    .line 347
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    move-object v4, v2

    .line 352
    check-cast v4, Ljava/lang/String;

    .line 353
    .line 354
    invoke-static {v4}, Lj8/h;->p(Ljava/lang/String;)Z

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    if-eqz v4, :cond_d

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_e
    move-object/from16 v2, v16

    .line 362
    .line 363
    :goto_7
    check-cast v2, Ljava/lang/String;

    .line 364
    .line 365
    if-eqz v2, :cond_f

    .line 366
    .line 367
    const/16 v1, 0xa0

    .line 368
    .line 369
    invoke-static {v1, v2}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    goto/16 :goto_e

    .line 374
    .line 375
    :cond_f
    if-eqz v3, :cond_16

    .line 376
    .line 377
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    :goto_8
    if-eqz v1, :cond_16

    .line 382
    .line 383
    invoke-virtual {v1, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-nez v2, :cond_16

    .line 388
    .line 389
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    :cond_10
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    if-eqz v4, :cond_15

    .line 402
    .line 403
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    check-cast v4, Ljava/lang/reflect/Field;

    .line 408
    .line 409
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    invoke-virtual {v14, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    if-nez v5, :cond_11

    .line 418
    .line 419
    goto :goto_9

    .line 420
    :cond_11
    invoke-static {v4, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    instance-of v5, v4, Ljava/util/Collection;

    .line 425
    .line 426
    if-eqz v5, :cond_12

    .line 427
    .line 428
    check-cast v4, Ljava/util/Collection;

    .line 429
    .line 430
    goto :goto_a

    .line 431
    :cond_12
    move-object/from16 v4, v16

    .line 432
    .line 433
    :goto_a
    if-eqz v4, :cond_14

    .line 434
    .line 435
    check-cast v4, Ljava/lang/Iterable;

    .line 436
    .line 437
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    :cond_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    if-eqz v5, :cond_14

    .line 446
    .line 447
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    if-eqz v5, :cond_13

    .line 452
    .line 453
    goto :goto_b

    .line 454
    :cond_14
    move-object/from16 v5, v16

    .line 455
    .line 456
    :goto_b
    if-eqz v5, :cond_10

    .line 457
    .line 458
    goto :goto_c

    .line 459
    :cond_15
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    goto :goto_8

    .line 464
    :cond_16
    move-object/from16 v5, v16

    .line 465
    .line 466
    :goto_c
    invoke-static {v5}, Lj8/h;->x(Ljava/lang/Object;)Ljava/util/List;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-static {v3}, Lj8/h;->x(Ljava/lang/Object;)Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-static {v1, v2}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    :cond_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    if-eqz v2, :cond_18

    .line 487
    .line 488
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    move-object v3, v2

    .line 493
    check-cast v3, Ljava/lang/String;

    .line 494
    .line 495
    invoke-static {v3}, Lj8/h;->p(Ljava/lang/String;)Z

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    if-eqz v3, :cond_17

    .line 500
    .line 501
    goto :goto_d

    .line 502
    :cond_18
    move-object/from16 v2, v16

    .line 503
    .line 504
    :goto_d
    check-cast v2, Ljava/lang/String;

    .line 505
    .line 506
    if-eqz v2, :cond_19

    .line 507
    .line 508
    const/16 v1, 0xa0

    .line 509
    .line 510
    invoke-static {v1, v2}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    goto :goto_e

    .line 515
    :cond_19
    const/4 v1, 0x3

    .line 516
    if-ne v6, v1, :cond_1a

    .line 517
    .line 518
    const-string v1, "\u8bed\u97f3\u6536\u85cf"

    .line 519
    .line 520
    goto :goto_e

    .line 521
    :cond_1a
    move-object v1, v8

    .line 522
    :goto_e
    const-string v2, "\u8bed\u97f3"

    .line 523
    .line 524
    const-string v3, "\u7b14\u8bb0"

    .line 525
    .line 526
    const/16 v13, 0xa

    .line 527
    .line 528
    if-eq v6, v13, :cond_1d

    .line 529
    .line 530
    const/16 v4, 0xe

    .line 531
    .line 532
    if-eq v6, v4, :cond_1c

    .line 533
    .line 534
    const/16 v4, 0x12

    .line 535
    .line 536
    if-eq v6, v4, :cond_1d

    .line 537
    .line 538
    const/16 v3, 0x13

    .line 539
    .line 540
    if-eq v6, v3, :cond_1b

    .line 541
    .line 542
    packed-switch v6, :pswitch_data_0

    .line 543
    .line 544
    .line 545
    const-string v3, "\u7c7b\u578b"

    .line 546
    .line 547
    invoke-static {v6, v3}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    goto :goto_f

    .line 552
    :pswitch_0
    const-string v3, "\u6587\u4ef6"

    .line 553
    .line 554
    goto :goto_f

    .line 555
    :pswitch_1
    const-string v3, "\u97f3\u4e50"

    .line 556
    .line 557
    goto :goto_f

    .line 558
    :pswitch_2
    const-string v3, "\u4f4d\u7f6e"

    .line 559
    .line 560
    goto :goto_f

    .line 561
    :pswitch_3
    const-string v3, "\u94fe\u63a5"

    .line 562
    .line 563
    goto :goto_f

    .line 564
    :pswitch_4
    const-string v3, "\u89c6\u9891"

    .line 565
    .line 566
    goto :goto_f

    .line 567
    :pswitch_5
    move-object v3, v2

    .line 568
    goto :goto_f

    .line 569
    :pswitch_6
    const-string v3, "\u56fe\u7247"

    .line 570
    .line 571
    goto :goto_f

    .line 572
    :pswitch_7
    const-string v3, "\u6587\u5b57"

    .line 573
    .line 574
    goto :goto_f

    .line 575
    :cond_1b
    const-string v3, "\u5c0f\u7a0b\u5e8f"

    .line 576
    .line 577
    goto :goto_f

    .line 578
    :cond_1c
    const-string v3, "\u804a\u5929\u8bb0\u5f55"

    .line 579
    .line 580
    :cond_1d
    :goto_f
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    if-eqz v4, :cond_1e

    .line 585
    .line 586
    const-string v1, "\u6536\u85cf"

    .line 587
    .line 588
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    :cond_1e
    new-instance v4, Ljava/util/ArrayList;

    .line 593
    .line 594
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 595
    .line 596
    .line 597
    new-instance v5, Ljava/util/HashSet;

    .line 598
    .line 599
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 600
    .line 601
    .line 602
    const/4 v13, 0x0

    .line 603
    invoke-static {v0, v4, v5, v13}, Lj8/h;->f(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;I)V

    .line 604
    .line 605
    .line 606
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 607
    .line 608
    .line 609
    move-result-object v4

    .line 610
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 611
    .line 612
    .line 613
    move-result-object v4

    .line 614
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 619
    .line 620
    .line 621
    move-result v19

    .line 622
    if-eqz v19, :cond_20

    .line 623
    .line 624
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v19

    .line 628
    move-object/from16 v20, v1

    .line 629
    .line 630
    move-object/from16 v1, v19

    .line 631
    .line 632
    check-cast v1, Ljava/lang/String;

    .line 633
    .line 634
    move-object/from16 v23, v4

    .line 635
    .line 636
    const-string v4, "@chatroom"

    .line 637
    .line 638
    invoke-static {v1, v4, v13}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 639
    .line 640
    .line 641
    move-result v4

    .line 642
    if-nez v4, :cond_21

    .line 643
    .line 644
    const-string v4, "@im.chatroom"

    .line 645
    .line 646
    invoke-static {v1, v4, v13}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    if-eqz v1, :cond_1f

    .line 651
    .line 652
    goto :goto_11

    .line 653
    :cond_1f
    move-object/from16 v1, v20

    .line 654
    .line 655
    move-object/from16 v4, v23

    .line 656
    .line 657
    goto :goto_10

    .line 658
    :cond_20
    move-object/from16 v20, v1

    .line 659
    .line 660
    move-object/from16 v23, v4

    .line 661
    .line 662
    move-object/from16 v19, v16

    .line 663
    .line 664
    :cond_21
    :goto_11
    move-object/from16 v1, v19

    .line 665
    .line 666
    check-cast v1, Ljava/lang/String;

    .line 667
    .line 668
    invoke-interface/range {v23 .. v23}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 673
    .line 674
    .line 675
    move-result v5

    .line 676
    if-eqz v5, :cond_24

    .line 677
    .line 678
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    move-object/from16 v19, v4

    .line 683
    .line 684
    move-object v4, v5

    .line 685
    check-cast v4, Ljava/lang/String;

    .line 686
    .line 687
    move-object/from16 v23, v5

    .line 688
    .line 689
    const-string v5, "wxid_"

    .line 690
    .line 691
    invoke-static {v4, v5, v13}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    if-nez v5, :cond_23

    .line 696
    .line 697
    const-string v5, "gh_"

    .line 698
    .line 699
    invoke-static {v4, v5, v13}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 700
    .line 701
    .line 702
    move-result v4

    .line 703
    if-eqz v4, :cond_22

    .line 704
    .line 705
    goto :goto_13

    .line 706
    :cond_22
    move-object/from16 v4, v19

    .line 707
    .line 708
    goto :goto_12

    .line 709
    :cond_23
    :goto_13
    move-object/from16 v5, v23

    .line 710
    .line 711
    goto :goto_14

    .line 712
    :cond_24
    move-object/from16 v5, v16

    .line 713
    .line 714
    :goto_14
    check-cast v5, Ljava/lang/String;

    .line 715
    .line 716
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 717
    .line 718
    .line 719
    move-result-object v4

    .line 720
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->r()Lg8/k;

    .line 724
    .line 725
    .line 726
    move-result-object v4

    .line 727
    new-instance v13, Ljava/util/ArrayList;

    .line 728
    .line 729
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 733
    .line 734
    .line 735
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    if-eqz v2, :cond_2c

    .line 740
    .line 741
    sget-object v2, Lj8/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 742
    .line 743
    invoke-static {v0}, Lj8/d;->e(Ljava/lang/Object;)I

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    const/4 v3, 0x3

    .line 748
    if-eq v2, v3, :cond_26

    .line 749
    .line 750
    :cond_25
    move/from16 v17, v6

    .line 751
    .line 752
    move-object/from16 v2, v16

    .line 753
    .line 754
    goto :goto_16

    .line 755
    :cond_26
    invoke-static {v0}, Lj8/d;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    if-eqz v2, :cond_25

    .line 760
    .line 761
    const-string v3, "duration"

    .line 762
    .line 763
    move/from16 v17, v6

    .line 764
    .line 765
    const-string v6, "length"

    .line 766
    .line 767
    const-string v7, "y"

    .line 768
    .line 769
    filled-new-array {v7, v3, v6}, [Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v3

    .line 773
    invoke-static {v2, v3}, Lj8/d;->g(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    if-eqz v2, :cond_27

    .line 778
    .line 779
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 780
    .line 781
    .line 782
    move-result-wide v2

    .line 783
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    goto :goto_15

    .line 788
    :cond_27
    move-object/from16 v2, v16

    .line 789
    .line 790
    :goto_15
    invoke-static {v2}, Lj8/d;->k(Ljava/lang/Long;)Ljava/lang/Integer;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    :goto_16
    if-eqz v2, :cond_2d

    .line 795
    .line 796
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 797
    .line 798
    .line 799
    move-result v2

    .line 800
    if-gez v2, :cond_28

    .line 801
    .line 802
    const/4 v2, 0x0

    .line 803
    :cond_28
    add-int/lit16 v2, v2, 0x3e7

    .line 804
    .line 805
    div-int/lit16 v2, v2, 0x3e8

    .line 806
    .line 807
    const/4 v3, 0x1

    .line 808
    if-ge v2, v3, :cond_29

    .line 809
    .line 810
    move v2, v3

    .line 811
    :cond_29
    div-int/lit8 v3, v2, 0x3c

    .line 812
    .line 813
    rem-int/lit8 v2, v2, 0x3c

    .line 814
    .line 815
    const-string v6, "\u79d2"

    .line 816
    .line 817
    if-lez v3, :cond_2b

    .line 818
    .line 819
    if-nez v2, :cond_2a

    .line 820
    .line 821
    const-string v2, "\u5206\u949f"

    .line 822
    .line 823
    invoke-static {v3, v2}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    goto :goto_17

    .line 828
    :cond_2a
    new-instance v7, Ljava/lang/StringBuilder;

    .line 829
    .line 830
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 834
    .line 835
    .line 836
    const-string v3, "\u5206"

    .line 837
    .line 838
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    goto :goto_17

    .line 852
    :cond_2b
    invoke-static {v2, v6}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v2

    .line 856
    :goto_17
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    goto :goto_18

    .line 860
    :cond_2c
    move/from16 v17, v6

    .line 861
    .line 862
    :cond_2d
    :goto_18
    const-string v2, "\uff09"

    .line 863
    .line 864
    const-string v3, "\uff08"

    .line 865
    .line 866
    if-eqz v1, :cond_34

    .line 867
    .line 868
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 869
    .line 870
    .line 871
    move-result v6

    .line 872
    if-eqz v6, :cond_2e

    .line 873
    .line 874
    goto :goto_1c

    .line 875
    :cond_2e
    if-eqz v4, :cond_2f

    .line 876
    .line 877
    invoke-virtual {v4, v1}, Lg8/k;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v6

    .line 881
    goto :goto_19

    .line 882
    :cond_2f
    move-object/from16 v6, v16

    .line 883
    .line 884
    :goto_19
    if-nez v6, :cond_30

    .line 885
    .line 886
    move-object v6, v8

    .line 887
    :cond_30
    invoke-static {v6}, Lj8/h;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v6

    .line 891
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    move-result v7

    .line 895
    if-nez v7, :cond_31

    .line 896
    .line 897
    goto :goto_1a

    .line 898
    :cond_31
    move-object/from16 v6, v16

    .line 899
    .line 900
    :goto_1a
    if-nez v6, :cond_32

    .line 901
    .line 902
    move-object v6, v8

    .line 903
    :cond_32
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 904
    .line 905
    .line 906
    move-result v7

    .line 907
    if-eqz v7, :cond_33

    .line 908
    .line 909
    move-object v6, v1

    .line 910
    goto :goto_1b

    .line 911
    :cond_33
    invoke-static {v6, v3, v1, v2}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v6

    .line 915
    :goto_1b
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    :cond_34
    :goto_1c
    if-eqz v5, :cond_46

    .line 919
    .line 920
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 921
    .line 922
    .line 923
    move-result v6

    .line 924
    if-eqz v6, :cond_35

    .line 925
    .line 926
    goto/16 :goto_25

    .line 927
    .line 928
    :cond_35
    if-eqz v4, :cond_36

    .line 929
    .line 930
    invoke-virtual {v4, v5}, Lg8/k;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v6

    .line 934
    goto :goto_1d

    .line 935
    :cond_36
    move-object/from16 v6, v16

    .line 936
    .line 937
    :goto_1d
    if-nez v6, :cond_37

    .line 938
    .line 939
    move-object v6, v8

    .line 940
    :cond_37
    invoke-static {v6}, Lj8/h;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v6

    .line 944
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    move-result v7

    .line 948
    if-nez v7, :cond_38

    .line 949
    .line 950
    goto :goto_1e

    .line 951
    :cond_38
    move-object/from16 v6, v16

    .line 952
    .line 953
    :goto_1e
    if-nez v6, :cond_39

    .line 954
    .line 955
    move-object v6, v8

    .line 956
    :cond_39
    if-eqz v1, :cond_42

    .line 957
    .line 958
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 959
    .line 960
    .line 961
    move-result v7

    .line 962
    if-eqz v7, :cond_3a

    .line 963
    .line 964
    goto :goto_22

    .line 965
    :cond_3a
    if-eqz v4, :cond_3e

    .line 966
    .line 967
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 968
    .line 969
    .line 970
    move-result v7

    .line 971
    if-eqz v7, :cond_3b

    .line 972
    .line 973
    goto :goto_1f

    .line 974
    :cond_3b
    iget-object v4, v4, Lg8/k;->b:Lg8/i;

    .line 975
    .line 976
    invoke-virtual {v4, v1, v5}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v1

    .line 980
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 981
    .line 982
    .line 983
    move-result v4

    .line 984
    if-nez v4, :cond_3d

    .line 985
    .line 986
    if-eqz v1, :cond_3c

    .line 987
    .line 988
    goto :goto_20

    .line 989
    :cond_3c
    :goto_1f
    move-object v1, v8

    .line 990
    goto :goto_20

    .line 991
    :cond_3d
    move-object v1, v5

    .line 992
    goto :goto_20

    .line 993
    :cond_3e
    move-object/from16 v1, v16

    .line 994
    .line 995
    :goto_20
    if-nez v1, :cond_3f

    .line 996
    .line 997
    move-object v1, v8

    .line 998
    :cond_3f
    invoke-static {v1}, Lj8/h;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v4

    .line 1006
    if-nez v4, :cond_40

    .line 1007
    .line 1008
    goto :goto_21

    .line 1009
    :cond_40
    move-object/from16 v1, v16

    .line 1010
    .line 1011
    :goto_21
    if-nez v1, :cond_41

    .line 1012
    .line 1013
    goto :goto_22

    .line 1014
    :cond_41
    move-object v8, v1

    .line 1015
    :cond_42
    :goto_22
    filled-new-array {v6, v8}, [Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    new-instance v4, Ljava/util/ArrayList;

    .line 1024
    .line 1025
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v1

    .line 1032
    :cond_43
    :goto_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1033
    .line 1034
    .line 1035
    move-result v6

    .line 1036
    if-eqz v6, :cond_44

    .line 1037
    .line 1038
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v6

    .line 1042
    move-object v7, v6

    .line 1043
    check-cast v7, Ljava/lang/String;

    .line 1044
    .line 1045
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1046
    .line 1047
    .line 1048
    move-result v7

    .line 1049
    if-nez v7, :cond_43

    .line 1050
    .line 1051
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1052
    .line 1053
    .line 1054
    goto :goto_23

    .line 1055
    :cond_44
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v23

    .line 1063
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->isEmpty()Z

    .line 1064
    .line 1065
    .line 1066
    move-result v1

    .line 1067
    if-eqz v1, :cond_45

    .line 1068
    .line 1069
    goto :goto_24

    .line 1070
    :cond_45
    const/16 v27, 0x0

    .line 1071
    .line 1072
    const/16 v28, 0x3e

    .line 1073
    .line 1074
    const-string v24, " / "

    .line 1075
    .line 1076
    const/16 v25, 0x0

    .line 1077
    .line 1078
    const/16 v26, 0x0

    .line 1079
    .line 1080
    invoke-static/range {v23 .. v28}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    invoke-static {v1, v3, v5, v2}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v5

    .line 1088
    :goto_24
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1089
    .line 1090
    .line 1091
    :cond_46
    :goto_25
    invoke-static {v13}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    const/4 v6, 0x0

    .line 1100
    const/16 v7, 0x3e

    .line 1101
    .line 1102
    const-string v3, " \u00b7 "

    .line 1103
    .line 1104
    const/4 v4, 0x0

    .line 1105
    const/4 v5, 0x0

    .line 1106
    invoke-static/range {v2 .. v7}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v8

    .line 1110
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 1111
    .line 1112
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v2

    .line 1119
    :goto_26
    if-eqz v2, :cond_5a

    .line 1120
    .line 1121
    invoke-virtual {v2, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v3

    .line 1125
    if-nez v3, :cond_5a

    .line 1126
    .line 1127
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v3

    .line 1131
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v3

    .line 1135
    :goto_27
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1136
    .line 1137
    .line 1138
    move-result v4

    .line 1139
    if-eqz v4, :cond_59

    .line 1140
    .line 1141
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v4

    .line 1145
    check-cast v4, Ljava/lang/reflect/Field;

    .line 1146
    .line 1147
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v5

    .line 1151
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 1152
    .line 1153
    .line 1154
    move-result v5

    .line 1155
    if-nez v5, :cond_47

    .line 1156
    .line 1157
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v5

    .line 1161
    const-class v6, Ljava/lang/String;

    .line 1162
    .line 1163
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v5

    .line 1167
    if-eqz v5, :cond_48

    .line 1168
    .line 1169
    :cond_47
    move-object/from16 v18, v2

    .line 1170
    .line 1171
    move-object/from16 v19, v3

    .line 1172
    .line 1173
    goto/16 :goto_32

    .line 1174
    .line 1175
    :cond_48
    invoke-static {v4, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v4

    .line 1179
    if-eqz v4, :cond_58

    .line 1180
    .line 1181
    new-instance v5, Ljava/util/ArrayList;

    .line 1182
    .line 1183
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v6

    .line 1190
    :goto_28
    if-eqz v6, :cond_53

    .line 1191
    .line 1192
    invoke-virtual {v6, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v7

    .line 1196
    if-nez v7, :cond_53

    .line 1197
    .line 1198
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v7

    .line 1202
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v7

    .line 1206
    :goto_29
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1207
    .line 1208
    .line 1209
    move-result v13

    .line 1210
    if-eqz v13, :cond_52

    .line 1211
    .line 1212
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v13

    .line 1216
    check-cast v13, Ljava/lang/reflect/Field;

    .line 1217
    .line 1218
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    invoke-virtual {v14, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1223
    .line 1224
    .line 1225
    move-result v0

    .line 1226
    if-nez v0, :cond_4a

    .line 1227
    .line 1228
    :cond_49
    move-object/from16 v0, p1

    .line 1229
    .line 1230
    goto :goto_29

    .line 1231
    :cond_4a
    invoke-static {v13, v4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v0

    .line 1235
    instance-of v13, v0, Ljava/util/Collection;

    .line 1236
    .line 1237
    if-eqz v13, :cond_4b

    .line 1238
    .line 1239
    check-cast v0, Ljava/util/Collection;

    .line 1240
    .line 1241
    goto :goto_2a

    .line 1242
    :cond_4b
    move-object/from16 v0, v16

    .line 1243
    .line 1244
    :goto_2a
    if-eqz v0, :cond_49

    .line 1245
    .line 1246
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1247
    .line 1248
    .line 1249
    move-result v13

    .line 1250
    if-nez v13, :cond_4e

    .line 1251
    .line 1252
    check-cast v0, Ljava/lang/Iterable;

    .line 1253
    .line 1254
    instance-of v13, v0, Ljava/util/Collection;

    .line 1255
    .line 1256
    if-eqz v13, :cond_4d

    .line 1257
    .line 1258
    move-object v13, v0

    .line 1259
    check-cast v13, Ljava/util/Collection;

    .line 1260
    .line 1261
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 1262
    .line 1263
    .line 1264
    move-result v13

    .line 1265
    if-eqz v13, :cond_4d

    .line 1266
    .line 1267
    :cond_4c
    move-object/from16 v18, v0

    .line 1268
    .line 1269
    goto :goto_2c

    .line 1270
    :cond_4d
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v13

    .line 1274
    :goto_2b
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 1275
    .line 1276
    .line 1277
    move-result v18

    .line 1278
    if-eqz v18, :cond_4c

    .line 1279
    .line 1280
    move-object/from16 v18, v0

    .line 1281
    .line 1282
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v0

    .line 1286
    instance-of v0, v0, Ljava/lang/String;

    .line 1287
    .line 1288
    if-nez v0, :cond_4f

    .line 1289
    .line 1290
    :cond_4e
    move-object/from16 v18, v2

    .line 1291
    .line 1292
    move-object/from16 v19, v3

    .line 1293
    .line 1294
    goto :goto_2e

    .line 1295
    :cond_4f
    move-object/from16 v0, v18

    .line 1296
    .line 1297
    goto :goto_2b

    .line 1298
    :goto_2c
    new-instance v0, Ljava/util/ArrayList;

    .line 1299
    .line 1300
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1301
    .line 1302
    .line 1303
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v13

    .line 1307
    :goto_2d
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 1308
    .line 1309
    .line 1310
    move-result v18

    .line 1311
    if-eqz v18, :cond_51

    .line 1312
    .line 1313
    move-object/from16 v18, v2

    .line 1314
    .line 1315
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v2

    .line 1319
    move-object/from16 v19, v3

    .line 1320
    .line 1321
    instance-of v3, v2, Ljava/lang/String;

    .line 1322
    .line 1323
    if-eqz v3, :cond_50

    .line 1324
    .line 1325
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1326
    .line 1327
    .line 1328
    :cond_50
    move-object/from16 v2, v18

    .line 1329
    .line 1330
    move-object/from16 v3, v19

    .line 1331
    .line 1332
    goto :goto_2d

    .line 1333
    :cond_51
    move-object/from16 v18, v2

    .line 1334
    .line 1335
    move-object/from16 v19, v3

    .line 1336
    .line 1337
    invoke-static {v5, v0}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1338
    .line 1339
    .line 1340
    :goto_2e
    move-object/from16 v0, p1

    .line 1341
    .line 1342
    move-object/from16 v2, v18

    .line 1343
    .line 1344
    move-object/from16 v3, v19

    .line 1345
    .line 1346
    goto/16 :goto_29

    .line 1347
    .line 1348
    :cond_52
    move-object/from16 v18, v2

    .line 1349
    .line 1350
    move-object/from16 v19, v3

    .line 1351
    .line 1352
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v6

    .line 1356
    move-object/from16 v0, p1

    .line 1357
    .line 1358
    goto/16 :goto_28

    .line 1359
    .line 1360
    :cond_53
    move-object/from16 v18, v2

    .line 1361
    .line 1362
    move-object/from16 v19, v3

    .line 1363
    .line 1364
    new-instance v0, Ljava/util/ArrayList;

    .line 1365
    .line 1366
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1367
    .line 1368
    .line 1369
    move-result v2

    .line 1370
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v2

    .line 1377
    :goto_2f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1378
    .line 1379
    .line 1380
    move-result v3

    .line 1381
    if-eqz v3, :cond_54

    .line 1382
    .line 1383
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v3

    .line 1387
    check-cast v3, Ljava/lang/String;

    .line 1388
    .line 1389
    invoke-static {v3}, Lj8/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v3

    .line 1393
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1394
    .line 1395
    .line 1396
    goto :goto_2f

    .line 1397
    :cond_54
    new-instance v2, Ljava/util/ArrayList;

    .line 1398
    .line 1399
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v0

    .line 1406
    :cond_55
    :goto_30
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1407
    .line 1408
    .line 1409
    move-result v3

    .line 1410
    if-eqz v3, :cond_56

    .line 1411
    .line 1412
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v3

    .line 1416
    move-object v4, v3

    .line 1417
    check-cast v4, Ljava/lang/String;

    .line 1418
    .line 1419
    invoke-static {v4}, Lj8/h;->o(Ljava/lang/String;)Z

    .line 1420
    .line 1421
    .line 1422
    move-result v4

    .line 1423
    if-eqz v4, :cond_55

    .line 1424
    .line 1425
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1426
    .line 1427
    .line 1428
    goto :goto_30

    .line 1429
    :cond_56
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v0

    .line 1433
    :goto_31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1434
    .line 1435
    .line 1436
    move-result v2

    .line 1437
    if-eqz v2, :cond_57

    .line 1438
    .line 1439
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v2

    .line 1443
    check-cast v2, Ljava/lang/String;

    .line 1444
    .line 1445
    const/16 v3, 0x18

    .line 1446
    .line 1447
    invoke-static {v3, v2}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v2

    .line 1451
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1452
    .line 1453
    .line 1454
    goto :goto_31

    .line 1455
    :cond_57
    :goto_32
    move-object/from16 v0, p1

    .line 1456
    .line 1457
    move-object/from16 v2, v18

    .line 1458
    .line 1459
    move-object/from16 v3, v19

    .line 1460
    .line 1461
    goto/16 :goto_27

    .line 1462
    .line 1463
    :cond_58
    move-object/from16 v0, p1

    .line 1464
    .line 1465
    goto/16 :goto_27

    .line 1466
    .line 1467
    :cond_59
    move-object/from16 v18, v2

    .line 1468
    .line 1469
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v2

    .line 1473
    move-object/from16 v0, p1

    .line 1474
    .line 1475
    goto/16 :goto_26

    .line 1476
    .line 1477
    :cond_5a
    const/16 v0, 0x8

    .line 1478
    .line 1479
    invoke-static {v0, v1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v13

    .line 1483
    new-instance v3, Lj8/i;

    .line 1484
    .line 1485
    move/from16 v6, v17

    .line 1486
    .line 1487
    move-object/from16 v7, v20

    .line 1488
    .line 1489
    move-wide/from16 v4, v21

    .line 1490
    .line 1491
    invoke-direct/range {v3 .. v13}, Lj8/i;-><init>(JILjava/lang/String;Ljava/lang/String;JJLjava/util/List;)V

    .line 1492
    .line 1493
    .line 1494
    return-object v3

    .line 1495
    :cond_5b
    const/16 v16, 0x0

    .line 1496
    .line 1497
    return-object v16

    .line 1498
    nop

    .line 1499
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lj8/h;->b:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->resolveFavoriteApi()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->favoriteServiceResolverMethod:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, Lh/Hchat/dexkit/DexFinder;->favoriteServiceClass:Ljava/lang/Class;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->favoriteStorageGetterMethod:Ljava/lang/reflect/Method;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v1, v2, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    new-array v2, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_0
    return-object v2
.end method

.method public final n(Ljava/lang/reflect/Method;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    array-length v5, v4

    .line 14
    const/4 v6, 0x5

    .line 15
    const-string v7, ""

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    if-ne v5, v6, :cond_0

    .line 19
    .line 20
    new-instance v4, Ljava/util/LinkedList;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    filled-new-array {v1, v2, v7, v4, v8}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v0, v8, v1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    move-object/from16 v5, p0

    .line 37
    .line 38
    iget-object v6, v5, Lj8/h;->b:Lh/Hchat/dexkit/DexFinder;

    .line 39
    .line 40
    iget-object v6, v6, Lh/Hchat/dexkit/DexFinder;->favoriteSendParamClass:Ljava/lang/Class;

    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-static {v9, v4}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    move-object v6, v4

    .line 51
    check-cast v6, Ljava/lang/Class;

    .line 52
    .line 53
    if-eqz v6, :cond_11

    .line 54
    .line 55
    :goto_0
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-eqz v10, :cond_3

    .line 68
    .line 69
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    move-object v11, v10

    .line 74
    check-cast v11, Ljava/lang/reflect/Constructor;

    .line 75
    .line 76
    invoke-virtual {v11}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    array-length v11, v11

    .line 84
    if-nez v11, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object v10, v8

    .line 88
    :goto_1
    check-cast v10, Ljava/lang/reflect/Constructor;

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    if-eqz v10, :cond_4

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    new-array v10, v4, [Ljava/lang/Class;

    .line 95
    .line 96
    invoke-static {v6, v10}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    if-eqz v10, :cond_5

    .line 101
    .line 102
    invoke-virtual {v10}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    array-length v11, v11

    .line 110
    if-nez v11, :cond_5

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    move-object v10, v8

    .line 114
    :goto_2
    if-eqz v10, :cond_f

    .line 115
    .line 116
    :goto_3
    new-array v11, v4, [Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {v10, v11}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    if-eqz v10, :cond_f

    .line 123
    .line 124
    new-instance v11, Ljava/util/LinkedList;

    .line 125
    .line 126
    invoke-direct {v11}, Ljava/util/LinkedList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    move v12, v4

    .line 137
    move v13, v12

    .line 138
    :goto_4
    if-eqz v3, :cond_e

    .line 139
    .line 140
    const-class v14, Ljava/lang/Object;

    .line 141
    .line 142
    invoke-virtual {v3, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v14

    .line 146
    if-nez v14, :cond_e

    .line 147
    .line 148
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v14

    .line 156
    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    if-eqz v15, :cond_d

    .line 161
    .line 162
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v15

    .line 166
    check-cast v15, Ljava/lang/reflect/Field;

    .line 167
    .line 168
    invoke-static {v15}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 169
    .line 170
    .line 171
    move-result v16

    .line 172
    if-eqz v16, :cond_6

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_6
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    const-class v8, Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v9, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-eqz v8, :cond_9

    .line 186
    .line 187
    add-int/lit8 v8, v13, 0x1

    .line 188
    .line 189
    if-nez v13, :cond_7

    .line 190
    .line 191
    move-object v9, v2

    .line 192
    goto :goto_6

    .line 193
    :cond_7
    move-object v9, v7

    .line 194
    :goto_6
    invoke-static {v15, v10, v9}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    if-eqz v13, :cond_8

    .line 199
    .line 200
    invoke-static {v9, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_8

    .line 205
    .line 206
    const/4 v4, 0x1

    .line 207
    :cond_8
    move v13, v8

    .line 208
    goto :goto_8

    .line 209
    :cond_9
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 214
    .line 215
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    if-nez v8, :cond_b

    .line 220
    .line 221
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    const-class v9, Ljava/lang/Boolean;

    .line 226
    .line 227
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-eqz v8, :cond_a

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_a
    const-class v8, Ljava/util/List;

    .line 235
    .line 236
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    if-eqz v8, :cond_c

    .line 245
    .line 246
    invoke-static {v15, v10, v11}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    if-eqz v8, :cond_c

    .line 251
    .line 252
    const/4 v12, 0x1

    .line 253
    goto :goto_8

    .line 254
    :cond_b
    :goto_7
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 255
    .line 256
    invoke-static {v15, v10, v8}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    :cond_c
    :goto_8
    const/4 v8, 0x0

    .line 260
    const/4 v9, 0x1

    .line 261
    goto :goto_5

    .line 262
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    const/4 v8, 0x0

    .line 267
    const/4 v9, 0x1

    .line 268
    goto/16 :goto_4

    .line 269
    .line 270
    :cond_e
    if-eqz v4, :cond_f

    .line 271
    .line 272
    if-eqz v12, :cond_f

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_f
    const/4 v10, 0x0

    .line 276
    :goto_9
    if-eqz v10, :cond_10

    .line 277
    .line 278
    const/4 v2, 0x0

    .line 279
    filled-new-array {v1, v10, v2}, [Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-static {v0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :cond_10
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    const-string v1, "favorite request build failed: "

    .line 292
    .line 293
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :cond_11
    const-string v0, "favorite request class missing"

    .line 302
    .line 303
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    return-void
.end method

.method public final q(I)Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Lj8/h;->b:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->resolveFavoriteApi()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lj8/h;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    :try_start_0
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->favoriteServiceResolverMethod:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    iget-object v3, v0, Lh/Hchat/dexkit/DexFinder;->favoriteServiceClass:Ljava/lang/Class;

    .line 17
    .line 18
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v1, v2, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_5

    .line 27
    .line 28
    iget-object v3, v0, Lh/Hchat/dexkit/DexFinder;->favoriteStorageGetterMethod:Ljava/lang/reflect/Method;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    new-array v4, v4, [Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v3, v1, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->favoriteListMethod:Ljava/lang/reflect/Method;

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 51
    .line 52
    sget-object v5, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 53
    .line 54
    filled-new-array {v3, p1, v4, v5, v2}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v0, v1, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    instance-of v0, p1, Ljava/util/List;

    .line 63
    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    check-cast p1, Ljava/util/List;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_3

    .line 71
    :cond_1
    move-object p1, v2

    .line 72
    :goto_0
    if-eqz p1, :cond_5

    .line 73
    .line 74
    new-instance v0, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-nez v1, :cond_4

    .line 94
    .line 95
    :cond_3
    move-object v3, v2

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-virtual {p0, v1}, Lj8/h;->i(Ljava/lang/Object;)Lj8/i;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-eqz v3, :cond_3

    .line 102
    .line 103
    iget-wide v4, v3, Lj8/i;->a:J

    .line 104
    .line 105
    invoke-virtual {p0, v1, v4, v5}, Lj8/h;->b(Ljava/lang/Object;J)V

    .line 106
    .line 107
    .line 108
    :goto_2
    if-eqz v3, :cond_2

    .line 109
    .line 110
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_5
    move-object v0, v2

    .line 115
    goto :goto_4

    .line 116
    :goto_3
    new-instance v0, Lsf/f;

    .line 117
    .line 118
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :cond_6
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-nez p1, :cond_7

    .line 126
    .line 127
    move-object v2, v0

    .line 128
    goto :goto_5

    .line 129
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v1, "\u8c03\u7528\u5fae\u4fe1\u539f\u751f\u6536\u85cf\u5217\u8868\u5931\u8d25: "

    .line 136
    .line 137
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :goto_5
    check-cast v2, Ljava/util/List;

    .line 151
    .line 152
    return-object v2
.end method

.method public final r(J)Ljava/lang/Object;
    .locals 13

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_6

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lj8/h;->f:Lfb/k1;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v2, p0, Lj8/h;->f:Lfb/k1;

    .line 14
    .line 15
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v2, v3}, Lfb/k1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    monitor-exit v0

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_1
    invoke-virtual {p0}, Lj8/h;->j()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_f

    .line 32
    .line 33
    iget-object v2, p0, Lj8/h;->b:Lh/Hchat/dexkit/DexFinder;

    .line 34
    .line 35
    iget-object v3, v2, Lh/Hchat/dexkit/DexFinder;->favoriteItemClass:Ljava/lang/Class;

    .line 36
    .line 37
    if-eqz v3, :cond_f

    .line 38
    .line 39
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->favoriteGetMethod:Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-static {}, La/a;->E()Luf/c;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    new-instance v6, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    :cond_3
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    const/4 v8, 0x0

    .line 72
    if-eqz v7, :cond_5

    .line 73
    .line 74
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    move-object v9, v7

    .line 79
    check-cast v9, Ljava/lang/reflect/Method;

    .line 80
    .line 81
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-nez v10, :cond_4

    .line 86
    .line 87
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    array-length v10, v10

    .line 92
    const/4 v11, 0x1

    .line 93
    if-ne v10, v11, :cond_4

    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    aget-object v10, v10, v8

    .line 100
    .line 101
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    invoke-static {v10, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-eqz v10, :cond_4

    .line 108
    .line 109
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    invoke-virtual {v3, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-eqz v9, :cond_4

    .line 118
    .line 119
    move v8, v11

    .line 120
    :cond_4
    if-eqz v8, :cond_3

    .line 121
    .line 122
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    :cond_6
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_7

    .line 140
    .line 141
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    move-object v7, v6

    .line 146
    check-cast v7, Ljava/lang/reflect/Method;

    .line 147
    .line 148
    invoke-static {v7, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-nez v7, :cond_6

    .line 153
    .line 154
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_8

    .line 167
    .line 168
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Ljava/lang/reflect/Method;

    .line 173
    .line 174
    invoke-virtual {v4, v3}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_8
    invoke-static {v4}, La/a;->t(Luf/c;)Luf/c;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v2, v8}, Luf/c;->listIterator(I)Ljava/util/ListIterator;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    :cond_9
    :goto_3
    move-object v3, v2

    .line 187
    check-cast v3, Luf/a;

    .line 188
    .line 189
    invoke-virtual {v3}, Luf/a;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_e

    .line 194
    .line 195
    invoke-virtual {v3}, Luf/a;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    check-cast v3, Ljava/lang/reflect/Method;

    .line 200
    .line 201
    :try_start_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-static {v3, v0, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    goto :goto_4

    .line 214
    :catchall_0
    move-exception v3

    .line 215
    new-instance v4, Lsf/f;

    .line 216
    .line 217
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    move-object v3, v4

    .line 221
    :goto_4
    nop

    .line 222
    instance-of v4, v3, Lsf/f;

    .line 223
    .line 224
    if-eqz v4, :cond_a

    .line 225
    .line 226
    move-object v3, v1

    .line 227
    :cond_a
    if-eqz v3, :cond_9

    .line 228
    .line 229
    const-string v4, "field_localId"

    .line 230
    .line 231
    const-string v5, "localId"

    .line 232
    .line 233
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-static {v3, v4}, Lj8/h;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    if-eqz v4, :cond_b

    .line 242
    .line 243
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 244
    .line 245
    .line 246
    move-result-wide v4

    .line 247
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    goto :goto_5

    .line 252
    :cond_b
    move-object v4, v1

    .line 253
    :goto_5
    if-nez v4, :cond_c

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_c
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 257
    .line 258
    .line 259
    move-result-wide v4

    .line 260
    cmp-long v4, v4, p1

    .line 261
    .line 262
    if-eqz v4, :cond_d

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_d
    invoke-virtual {p0, v3, p1, p2}, Lj8/h;->b(Ljava/lang/Object;J)V

    .line 266
    .line 267
    .line 268
    return-object v3

    .line 269
    :cond_e
    const-string p1, "\u8c03\u7528\u5fae\u4fe1\u539f\u751f\u6536\u85cf\u8bfb\u53d6\u5931\u8d25: localId \u672a\u5339\u914d"

    .line 270
    .line 271
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    :cond_f
    :goto_6
    return-object v1

    .line 275
    :catchall_1
    move-exception p1

    .line 276
    monitor-exit v0

    .line 277
    throw p1
.end method

.method public final s()Lj8/g;
    .locals 8

    .line 1
    iget-object v0, p0, Lj8/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lj8/h;->j:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lj8/g;

    .line 10
    .line 11
    iget-object v3, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v3, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, v3, v2, v2}, Lj8/g;-><init>(Ljava/util/List;ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-object v1

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    :try_start_1
    iget-wide v3, p0, Lj8/h;->i:J

    .line 35
    .line 36
    invoke-virtual {p0, v3, v4}, Lj8/h;->w(J)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_9

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iput-boolean v2, p0, Lj8/h;->j:Z

    .line 49
    .line 50
    new-instance v1, Lj8/g;

    .line 51
    .line 52
    iget-object v3, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    check-cast v3, Ljava/lang/Iterable;

    .line 62
    .line 63
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-direct {v1, v3, v2, v2}, Lj8/g;-><init>(Ljava/util/List;ZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    monitor-exit v0

    .line 71
    return-object v1

    .line 72
    :cond_1
    :try_start_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    if-nez v4, :cond_3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-virtual {p0, v4}, Lj8/h;->i(Ljava/lang/Object;)Lj8/i;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    if-eqz v5, :cond_2

    .line 94
    .line 95
    iget-wide v6, v5, Lj8/i;->a:J

    .line 96
    .line 97
    invoke-virtual {p0, v4, v6, v7}, Lj8/h;->b(Ljava/lang/Object;J)V

    .line 98
    .line 99
    .line 100
    iget-object v4, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    iget-wide v6, v5, Lj8/i;->a:J

    .line 103
    .line 104
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    const/16 v4, 0x14

    .line 117
    .line 118
    if-lt v3, v4, :cond_5

    .line 119
    .line 120
    const/4 v3, 0x1

    .line 121
    goto :goto_1

    .line 122
    :cond_5
    move v3, v2

    .line 123
    :goto_1
    iput-boolean v3, p0, Lj8/h;->j:Z

    .line 124
    .line 125
    iget-boolean v3, p0, Lj8/h;->j:Z

    .line 126
    .line 127
    if-eqz v3, :cond_6

    .line 128
    .line 129
    iget-wide v3, p0, Lj8/h;->i:J

    .line 130
    .line 131
    invoke-virtual {p0, v1, v3, v4}, Lj8/h;->t(Ljava/util/List;J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v3

    .line 135
    iput-wide v3, p0, Lj8/h;->i:J

    .line 136
    .line 137
    iget-wide v3, p0, Lj8/h;->i:J

    .line 138
    .line 139
    const-wide/16 v5, 0x0

    .line 140
    .line 141
    cmp-long v1, v3, v5

    .line 142
    .line 143
    if-gtz v1, :cond_6

    .line 144
    .line 145
    iput-boolean v2, p0, Lj8/h;->j:Z

    .line 146
    .line 147
    :cond_6
    iget-object v1, p0, Lj8/h;->k:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_8

    .line 154
    .line 155
    iget-object v1, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    check-cast v1, Ljava/lang/Iterable;

    .line 165
    .line 166
    invoke-static {v1}, Ltf/m;->u1(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Lj8/i;

    .line 171
    .line 172
    if-eqz v1, :cond_7

    .line 173
    .line 174
    iget-wide v3, v1, Lj8/i;->a:J

    .line 175
    .line 176
    iget-wide v5, v1, Lj8/i;->f:J

    .line 177
    .line 178
    new-instance v1, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v3, ":"

    .line 187
    .line 188
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    goto :goto_2

    .line 199
    :cond_7
    const-string v1, "empty"

    .line 200
    .line 201
    :goto_2
    iput-object v1, p0, Lj8/h;->k:Ljava/lang/String;

    .line 202
    .line 203
    :cond_8
    new-instance v1, Lj8/g;

    .line 204
    .line 205
    iget-object v3, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    check-cast v3, Ljava/lang/Iterable;

    .line 215
    .line 216
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    iget-boolean v4, p0, Lj8/h;->j:Z

    .line 221
    .line 222
    invoke-direct {v1, v3, v4, v2}, Lj8/g;-><init>(Ljava/util/List;ZZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 223
    .line 224
    .line 225
    monitor-exit v0

    .line 226
    return-object v1

    .line 227
    :cond_9
    :try_start_3
    iput-boolean v2, p0, Lj8/h;->j:Z

    .line 228
    .line 229
    new-instance v1, Lj8/g;

    .line 230
    .line 231
    iget-object v3, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 232
    .line 233
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    check-cast v3, Ljava/lang/Iterable;

    .line 241
    .line 242
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-direct {v1, v3, v2, v2}, Lj8/g;-><init>(Ljava/util/List;ZZ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 247
    .line 248
    .line 249
    monitor-exit v0

    .line 250
    return-object v1

    .line 251
    :goto_3
    monitor-exit v0

    .line 252
    throw v1
.end method

.method public final t(Ljava/util/List;J)J
    .locals 6

    .line 1
    iget-object v0, p0, Lj8/h;->b:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->favoriteListCursorMethod:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    cmp-long v3, p2, v1

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Ltf/m;->C1(Ljava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_4

    .line 18
    .line 19
    const-string p2, "field_updateTime"

    .line 20
    .line 21
    const-string p3, "updateTime"

    .line 22
    .line 23
    filled-new-array {p2, p3}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {p1, p2}, Lj8/h;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide p2

    .line 37
    :cond_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/4 v3, -0x1

    .line 42
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const/16 v4, 0x14

    .line 47
    .line 48
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    filled-new-array {p1, v3, v4}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-static {v0, v3, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    instance-of v0, p1, Ljava/lang/Number;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    check-cast p1, Ljava/lang/Number;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    move-object p1, v3

    .line 69
    :goto_0
    if-eqz p1, :cond_4

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    cmp-long v0, v4, v1

    .line 80
    .line 81
    if-lez v0, :cond_2

    .line 82
    .line 83
    cmp-long p2, v4, p2

    .line 84
    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    const/4 p2, 0x1

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    const/4 p2, 0x0

    .line 90
    :goto_1
    if-eqz p2, :cond_3

    .line 91
    .line 92
    move-object v3, p1

    .line 93
    :cond_3
    if-eqz v3, :cond_4

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 96
    .line 97
    .line 98
    move-result-wide p1

    .line 99
    return-wide p1

    .line 100
    :cond_4
    return-wide v1
.end method

.method public final u()Lj8/g;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lj8/h;->q(I)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_2

    .line 7
    .line 8
    invoke-static {v1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lj8/i;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-wide v2, v1, Lj8/i;->a:J

    .line 17
    .line 18
    iget-wide v4, v1, Lj8/i;->f:J

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, ":"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v1, "empty"

    .line 42
    .line 43
    :goto_0
    iget-object v2, p0, Lj8/h;->h:Ljava/lang/Object;

    .line 44
    .line 45
    monitor-enter v2

    .line 46
    :try_start_0
    iget-object v3, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    xor-int/lit8 v4, v3, 0x1

    .line 53
    .line 54
    if-nez v3, :cond_1

    .line 55
    .line 56
    iget-object v3, p0, Lj8/h;->k:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    new-instance v0, Lj8/g;

    .line 65
    .line 66
    iget-object v1, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    check-cast v1, Ljava/lang/Iterable;

    .line 76
    .line 77
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-boolean v3, p0, Lj8/h;->j:Z

    .line 82
    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-direct {v0, v1, v3, v4}, Lj8/g;-><init>(Ljava/util/List;ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    monitor-exit v2

    .line 88
    return-object v0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    :try_start_1
    iget-object v3, p0, Lj8/h;->g:Ljava/util/LinkedHashMap;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    .line 94
    .line 95
    .line 96
    iget-object v3, p0, Lj8/h;->f:Lfb/k1;

    .line 97
    .line 98
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    :try_start_2
    iget-object v5, p0, Lj8/h;->f:Lfb/k1;

    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/util/AbstractMap;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 102
    .line 103
    .line 104
    :try_start_3
    monitor-exit v3

    .line 105
    const-wide/16 v5, 0x0

    .line 106
    .line 107
    iput-wide v5, p0, Lj8/h;->i:J

    .line 108
    .line 109
    iput-boolean v0, p0, Lj8/h;->j:Z

    .line 110
    .line 111
    iput-object v1, p0, Lj8/h;->k:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 112
    .line 113
    monitor-exit v2

    .line 114
    invoke-virtual {p0}, Lj8/h;->s()Lj8/g;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v1, v0, Lj8/g;->a:Ljava/util/List;

    .line 119
    .line 120
    iget-boolean v0, v0, Lj8/g;->b:Z

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance v2, Lj8/g;

    .line 126
    .line 127
    invoke-direct {v2, v1, v0, v4}, Lj8/g;-><init>(Ljava/util/List;ZZ)V

    .line 128
    .line 129
    .line 130
    return-object v2

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    :try_start_4
    monitor-exit v3

    .line 133
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 134
    :goto_1
    monitor-exit v2

    .line 135
    throw v0

    .line 136
    :cond_2
    invoke-virtual {p0}, Lj8/h;->c()Lj8/g;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    return-object v0
.end method

.method public final v(J)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0, p1, p2}, Lj8/h;->r(J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    sget-object p2, Lj8/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    new-instance v0, Lia/t;

    .line 10
    .line 11
    const-class p2, Lj8/h;

    .line 12
    .line 13
    invoke-static {p2}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x1

    .line 19
    const/4 v1, 0x2

    .line 20
    const-string v4, "logFavoriteVoice"

    .line 21
    .line 22
    const-string v5, "logFavoriteVoice(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    move-object v2, p0

    .line 26
    invoke-direct/range {v0 .. v8}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 27
    .line 28
    .line 29
    iget-object p2, v2, Lj8/h;->c:Ljava/lang/ClassLoader;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lj8/d;->e(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v3, 0x2

    .line 39
    const/4 v4, 0x4

    .line 40
    if-eq v1, v3, :cond_0

    .line 41
    .line 42
    if-eq v1, v4, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-static {p1}, Lj8/d;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    if-ne v1, v4, :cond_1

    .line 52
    .line 53
    const-string v1, "mp4"

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-string v1, "jpg"

    .line 57
    .line 58
    :goto_0
    iget-object v3, v2, Lj8/h;->a:Landroid/content/Context;

    .line 59
    .line 60
    iget-object v4, v2, Lj8/h;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 61
    .line 62
    invoke-static {v3, p2, v4, p1, v0}, Lj8/d;->d(Landroid/content/Context;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/Object;Lfg/p;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v0, Ldg/n;

    .line 67
    .line 68
    const/4 v4, 0x6

    .line 69
    invoke-direct {v0, p1, v4}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Lb0/s;

    .line 73
    .line 74
    invoke-direct {p1, v3, p2, v1}, Lb0/s;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0, p1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Lng/m;->U(Lng/j;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Ljava/lang/String;

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_2
    move-object v2, p0

    .line 89
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 90
    return-object p1
.end method

.method public final w(J)Ljava/util/List;
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p0, Lj8/h;->b:Lh/Hchat/dexkit/DexFinder;

    .line 7
    .line 8
    invoke-virtual {v1}, Lh/Hchat/dexkit/DexFinder;->resolveFavoriteApi()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lj8/h;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lj8/h;->j()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_4

    .line 25
    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    cmp-long v4, p1, v4

    .line 29
    .line 30
    if-nez v4, :cond_2

    .line 31
    .line 32
    :try_start_0
    iget-object p1, v1, Lh/Hchat/dexkit/DexFinder;->favoriteListMethod:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    const/16 p2, 0x14

    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 41
    .line 42
    sget-object v4, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 43
    .line 44
    filled-new-array {v0, p2, v1, v4, v3}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {p1, v2, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    instance-of p2, p1, Ljava/util/List;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    check-cast p1, Ljava/util/List;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move-object p1, v3

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->favoriteListNextMethod:Ljava/lang/reflect/Method;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 72
    .line 73
    sget-object v4, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 74
    .line 75
    filled-new-array {p1, v0, p2, v4, v3}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {v1, v2, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    instance-of p2, p1, Ljava/util/List;

    .line 84
    .line 85
    if-eqz p2, :cond_1

    .line 86
    .line 87
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :goto_0
    new-instance p2, Lsf/f;

    .line 91
    .line 92
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    move-object p1, p2

    .line 96
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    if-nez p2, :cond_3

    .line 101
    .line 102
    move-object v3, p1

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance p2, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v0, "\u8c03\u7528\u5fae\u4fe1\u539f\u751f\u6536\u85cf\u5206\u9875\u5931\u8d25: "

    .line 111
    .line 112
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    check-cast v3, Ljava/util/List;

    .line 126
    .line 127
    :cond_4
    :goto_3
    return-object v3
.end method

.method public final y(Ljava/lang/Object;)Lj8/c;
    .locals 10

    .line 1
    sget-object v0, Lj8/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    new-instance v1, Lia/t;

    .line 4
    .line 5
    const-class v0, Lj8/h;

    .line 6
    .line 7
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v9, 0x2

    .line 13
    const/4 v2, 0x2

    .line 14
    const-string v5, "logFavoriteVoice"

    .line 15
    .line 16
    const-string v6, "logFavoriteVoice(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    move-object v3, p0

    .line 20
    invoke-direct/range {v1 .. v9}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v3, Lj8/h;->c:Ljava/lang/ClassLoader;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lj8/d;->e(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eq v2, v4, :cond_0

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_0
    invoke-static {p1}, Lj8/d;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_6

    .line 43
    .line 44
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 45
    .line 46
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v6, v3, Lj8/h;->a:Landroid/content/Context;

    .line 50
    .line 51
    iget-object v7, v3, Lj8/h;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 52
    .line 53
    invoke-static {v6, v0, v7, v2, v1}, Lj8/d;->d(Landroid/content/Context;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/Object;Lfg/p;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_1

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    check-cast v7, Ljava/lang/String;

    .line 72
    .line 73
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-static {v0, v2}, Lj8/d;->m(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_2
    invoke-static {v0, p1}, Lj8/d;->m(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    invoke-interface {v4, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    :cond_3
    new-instance p1, Ldg/n;

    .line 96
    .line 97
    const/4 v1, 0x6

    .line 98
    invoke-direct {p1, v4, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    new-instance v1, Lc9/i;

    .line 102
    .line 103
    const/16 v4, 0x17

    .line 104
    .line 105
    invoke-direct {v1, v6, v4, v0}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p1, v1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1}, Lng/m;->U(Lng/j;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Ljava/lang/String;

    .line 117
    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    const-string v0, "duration"

    .line 121
    .line 122
    const-string v1, "length"

    .line 123
    .line 124
    const-string v4, "y"

    .line 125
    .line 126
    filled-new-array {v4, v0, v1}, [Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v2, v0}, Lj8/d;->g(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    :cond_4
    invoke-static {v5}, Lj8/d;->k(Ljava/lang/Long;)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    goto :goto_1

    .line 155
    :cond_5
    const/16 v0, 0x3e8

    .line 156
    .line 157
    :goto_1
    new-instance v1, Lj8/c;

    .line 158
    .line 159
    invoke-direct {v1, p1, v0}, Lj8/c;-><init>(Ljava/lang/String;I)V

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :cond_6
    :goto_2
    return-object v5
.end method

.method public final z(JLjava/lang/String;)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static/range {p3 .. p3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v12, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v0, p1, v2

    .line 16
    .line 17
    if-gtz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    move/from16 v16, v12

    .line 20
    .line 21
    goto/16 :goto_e

    .line 22
    .line 23
    :cond_1
    invoke-virtual/range {p0 .. p2}, Lj8/h;->r(J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v13

    .line 27
    if-eqz v13, :cond_19

    .line 28
    .line 29
    invoke-static {v13}, Lj8/h;->k(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v14, v1, Lj8/h;->a:Landroid/content/Context;

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    if-eq v0, v2, :cond_c

    .line 37
    .line 38
    const/16 v2, 0x13

    .line 39
    .line 40
    if-eq v0, v2, :cond_2

    .line 41
    .line 42
    move-object/from16 v3, p3

    .line 43
    .line 44
    goto/16 :goto_2

    .line 45
    .line 46
    :cond_2
    invoke-static {v13}, Lj8/h;->l(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v2, "appbranditem"

    .line 51
    .line 52
    invoke-static {v0, v2}, Lj8/h;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    :cond_3
    :goto_0
    move-object/from16 v3, p3

    .line 63
    .line 64
    const/4 v15, 0x0

    .line 65
    goto :goto_1

    .line 66
    :cond_4
    const-string v3, "username"

    .line 67
    .line 68
    filled-new-array {v3}, [Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v2, v3}, Lj8/h;->D(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_5

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    const-string v3, "pagepath"

    .line 84
    .line 85
    filled-new-array {v3}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-static {v2, v3}, Lj8/h;->D(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const-string v3, "appid"

    .line 94
    .line 95
    filled-new-array {v3}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v2, v3}, Lj8/h;->D(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    const-string v2, "datatitle"

    .line 104
    .line 105
    const-string v3, "title"

    .line 106
    .line 107
    const-string v4, "desc"

    .line 108
    .line 109
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v0, v2}, Lj8/h;->D(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_6

    .line 122
    .line 123
    const-string v2, "\u5c0f\u7a0b\u5e8f"

    .line 124
    .line 125
    :cond_6
    const-string v3, "datadesc"

    .line 126
    .line 127
    const-string v4, "sourcedisplayname"

    .line 128
    .line 129
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-static {v0, v3}, Lj8/h;->D(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-eqz v3, :cond_3

    .line 142
    .line 143
    const/16 v4, 0x80

    .line 144
    .line 145
    invoke-static {v4, v2}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    const/16 v2, 0x100

    .line 150
    .line 151
    invoke-static {v2, v0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    new-array v8, v12, [B

    .line 156
    .line 157
    move-object v2, v3

    .line 158
    move-object/from16 v3, p3

    .line 159
    .line 160
    invoke-virtual/range {v2 .. v9}, Lj8/p;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-nez v0, :cond_7

    .line 165
    .line 166
    const-string v2, "\u53d1\u9001\u6536\u85cf\u5c0f\u7a0b\u5e8f\u5931\u8d25: \u516c\u5171\u5c0f\u7a0b\u5e8f API \u672a\u6210\u529f"

    .line 167
    .line 168
    invoke-static {v2}, Li8/i;->f(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    :goto_1
    if-eqz v15, :cond_8

    .line 176
    .line 177
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    return v0

    .line 182
    :cond_8
    :goto_2
    iget-object v0, v1, Lj8/h;->b:Lh/Hchat/dexkit/DexFinder;

    .line 183
    .line 184
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->resolveFavoriteApi()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->resolveFavoriteApi()V

    .line 188
    .line 189
    .line 190
    iget-object v2, v0, Lh/Hchat/dexkit/DexFinder;->favoriteItemClass:Ljava/lang/Class;

    .line 191
    .line 192
    if-eqz v2, :cond_b

    .line 193
    .line 194
    iget-object v2, v0, Lh/Hchat/dexkit/DexFinder;->favoriteGetMethod:Ljava/lang/reflect/Method;

    .line 195
    .line 196
    if-eqz v2, :cond_b

    .line 197
    .line 198
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->favoriteSendMethod:Ljava/lang/reflect/Method;

    .line 199
    .line 200
    if-eqz v0, :cond_b

    .line 201
    .line 202
    iget-object v2, v1, Lj8/h;->e:Lq8/o;

    .line 203
    .line 204
    invoke-virtual {v2}, Lq8/o;->a()Landroid/app/Activity;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    if-eqz v2, :cond_9

    .line 209
    .line 210
    move-object v14, v2

    .line 211
    :cond_9
    :try_start_0
    invoke-virtual {v1, v0, v14, v3, v13}, Lj8/h;->n(Ljava/lang/reflect/Method;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :catchall_0
    move-exception v0

    .line 218
    new-instance v2, Lsf/f;

    .line 219
    .line 220
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    move-object v0, v2

    .line 224
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    if-nez v2, :cond_a

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    new-instance v2, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    const-string v3, "\u53d1\u9001\u6536\u85cf\u5f02\u5e38: "

    .line 238
    .line 239
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 253
    .line 254
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    return v0

    .line 261
    :cond_b
    const-string v0, "\u53d1\u9001\u6536\u85cf\u5931\u8d25: API \u672a\u5c31\u7eea"

    .line 262
    .line 263
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return v12

    .line 267
    :cond_c
    move-object/from16 v3, p3

    .line 268
    .line 269
    invoke-virtual {v1, v13}, Lj8/h;->y(Ljava/lang/Object;)Lj8/c;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    if-eqz v0, :cond_d

    .line 274
    .line 275
    invoke-virtual {v1, v3, v0}, Lj8/h;->B(Ljava/lang/String;Lj8/c;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    return v0

    .line 280
    :cond_d
    sget-object v0, Lj8/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 281
    .line 282
    new-instance v1, Lia/t;

    .line 283
    .line 284
    const-class v0, Lj8/h;

    .line 285
    .line 286
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    const/4 v8, 0x0

    .line 291
    const/4 v9, 0x3

    .line 292
    move v0, v2

    .line 293
    const/4 v2, 0x2

    .line 294
    const-string v5, "logFavoriteVoice"

    .line 295
    .line 296
    const-string v6, "logFavoriteVoice(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 297
    .line 298
    const/4 v7, 0x0

    .line 299
    move/from16 v16, v12

    .line 300
    .line 301
    move-object v12, v3

    .line 302
    move-object/from16 v3, p0

    .line 303
    .line 304
    invoke-direct/range {v1 .. v9}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 305
    .line 306
    .line 307
    move-object v2, v1

    .line 308
    move-object v1, v3

    .line 309
    iget-object v3, v1, Lj8/h;->c:Ljava/lang/ClassLoader;

    .line 310
    .line 311
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-static {v13}, Lj8/d;->e(Ljava/lang/Object;)I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-eq v4, v0, :cond_e

    .line 319
    .line 320
    goto/16 :goto_c

    .line 321
    .line 322
    :cond_e
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    sget-object v4, Lj8/d;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 327
    .line 328
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    check-cast v5, Ljava/lang/reflect/Method;

    .line 333
    .line 334
    if-eqz v5, :cond_f

    .line 335
    .line 336
    invoke-static {v0, v5}, Lj8/d;->i(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    if-eqz v6, :cond_f

    .line 341
    .line 342
    move-object v15, v5

    .line 343
    goto/16 :goto_9

    .line 344
    .line 345
    :cond_f
    const-string v5, "Hchat_favorite_voice_method_cache"

    .line 346
    .line 347
    invoke-static {v14, v5}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    invoke-static {v14, v3}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v7

    .line 359
    const-string v8, "fav_voice_download_v1_"

    .line 360
    .line 361
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-static {v5, v6, v3, v7}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    if-eqz v8, :cond_10

    .line 370
    .line 371
    invoke-static {v0, v8}, Lj8/d;->i(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 372
    .line 373
    .line 374
    move-result v9

    .line 375
    if-eqz v9, :cond_10

    .line 376
    .line 377
    invoke-virtual {v4, v0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-object v15, v8

    .line 381
    goto/16 :goto_9

    .line 382
    .line 383
    :cond_10
    iget-object v8, v1, Lj8/h;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 384
    .line 385
    if-nez v8, :cond_11

    .line 386
    .line 387
    const/4 v15, 0x0

    .line 388
    goto/16 :goto_9

    .line 389
    .line 390
    :cond_11
    :try_start_1
    new-instance v9, Lch/e;

    .line 391
    .line 392
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 393
    .line 394
    .line 395
    new-instance v14, Lfh/k;

    .line 396
    .line 397
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 398
    .line 399
    .line 400
    const-string v15, "key_detail_data_id"

    .line 401
    .line 402
    const-string v1, "key_detail_info_id"

    .line 403
    .line 404
    const-string v10, "get fav item info error"

    .line 405
    .line 406
    filled-new-array {v15, v1, v10}, [Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-static {v14, v1}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 415
    .line 416
    .line 417
    iput-object v14, v9, Lch/e;->h:Lfh/k;

    .line 418
    .line 419
    invoke-virtual {v8, v9}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-static {v1}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    new-instance v8, Li2/z;

    .line 428
    .line 429
    const/16 v9, 0x8

    .line 430
    .line 431
    invoke-direct {v8, v9}, Li2/z;-><init>(I)V

    .line 432
    .line 433
    .line 434
    new-instance v9, Ldg/j;

    .line 435
    .line 436
    sget-object v10, Lng/q;->n:Lng/q;

    .line 437
    .line 438
    invoke-direct {v9, v1, v8, v10}, Ldg/j;-><init>(Lng/j;Lfg/l;Lfg/l;)V

    .line 439
    .line 440
    .line 441
    new-instance v1, Lb0/d0;

    .line 442
    .line 443
    invoke-direct {v1, v3}, Lb0/d0;-><init>(Ljava/lang/ClassLoader;)V

    .line 444
    .line 445
    .line 446
    invoke-static {v9, v1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    new-instance v3, Lng/h;

    .line 451
    .line 452
    invoke-direct {v3, v1}, Lng/h;-><init>(Lng/i;)V

    .line 453
    .line 454
    .line 455
    :cond_12
    invoke-virtual {v3}, Lng/h;->hasNext()Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-eqz v1, :cond_13

    .line 460
    .line 461
    invoke-virtual {v3}, Lng/h;->next()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    move-object v8, v1

    .line 466
    check-cast v8, Ljava/lang/reflect/Method;

    .line 467
    .line 468
    invoke-static {v0, v8}, Lj8/d;->i(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 469
    .line 470
    .line 471
    move-result v8

    .line 472
    if-eqz v8, :cond_12

    .line 473
    .line 474
    goto :goto_5

    .line 475
    :catchall_1
    move-exception v0

    .line 476
    goto :goto_6

    .line 477
    :cond_13
    const/4 v1, 0x0

    .line 478
    :goto_5
    check-cast v1, Ljava/lang/reflect/Method;

    .line 479
    .line 480
    if-eqz v1, :cond_14

    .line 481
    .line 482
    invoke-virtual {v4, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    invoke-static {v5, v6, v7, v1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 486
    .line 487
    .line 488
    goto :goto_7

    .line 489
    :cond_14
    const/4 v1, 0x0

    .line 490
    goto :goto_7

    .line 491
    :goto_6
    new-instance v1, Lsf/f;

    .line 492
    .line 493
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 494
    .line 495
    .line 496
    :goto_7
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    if-nez v0, :cond_15

    .line 501
    .line 502
    move-object v15, v1

    .line 503
    goto :goto_8

    .line 504
    :cond_15
    const-string v1, "\u6536\u85cf\u8bed\u97f3\u5b9a\u4f4d\u4e0b\u8f7d\u65b9\u6cd5\u5931\u8d25"

    .line 505
    .line 506
    invoke-virtual {v2, v1, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    const/4 v15, 0x0

    .line 510
    :goto_8
    check-cast v15, Ljava/lang/reflect/Method;

    .line 511
    .line 512
    :goto_9
    if-eqz v15, :cond_18

    .line 513
    .line 514
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    if-eqz v0, :cond_18

    .line 519
    .line 520
    new-instance v1, Lac/l;

    .line 521
    .line 522
    const/16 v3, 0x11

    .line 523
    .line 524
    invoke-direct {v1, v15, v13, v2, v3}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0, v1}, Lo8/j;->e(Ljava/lang/Runnable;)V

    .line 528
    .line 529
    .line 530
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 531
    .line 532
    .line 533
    move-result-object v6

    .line 534
    if-eqz v6, :cond_17

    .line 535
    .line 536
    new-instance v0, Ljava/lang/StringBuilder;

    .line 537
    .line 538
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    const-string v1, ":"

    .line 545
    .line 546
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    move-wide/from16 v10, p1

    .line 550
    .line 551
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    move-object/from16 v1, p0

    .line 559
    .line 560
    iget-object v0, v1, Lj8/h;->l:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 561
    .line 562
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    const/4 v7, 0x1

    .line 567
    if-nez v0, :cond_16

    .line 568
    .line 569
    :goto_a
    move v12, v7

    .line 570
    goto :goto_d

    .line 571
    :cond_16
    new-instance v0, Lb9/c;

    .line 572
    .line 573
    const/16 v5, 0x8

    .line 574
    .line 575
    move-object v4, v12

    .line 576
    move-object v3, v13

    .line 577
    invoke-direct/range {v0 .. v5}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v6, v0}, Lo8/j;->d(Ljava/lang/Runnable;)V

    .line 581
    .line 582
    .line 583
    goto :goto_a

    .line 584
    :cond_17
    :goto_b
    move/from16 v12, v16

    .line 585
    .line 586
    goto :goto_d

    .line 587
    :cond_18
    :goto_c
    const-string v0, "\u53d1\u9001\u6536\u85cf\u8bed\u97f3\u5931\u8d25: \u6587\u4ef6\u4e0d\u5b58\u5728\u4e14\u65e0\u6cd5\u542f\u52a8\u4e0b\u8f7d"

    .line 588
    .line 589
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    goto :goto_b

    .line 593
    :goto_d
    return v12

    .line 594
    :cond_19
    move-wide/from16 v10, p1

    .line 595
    .line 596
    move/from16 v16, v12

    .line 597
    .line 598
    new-instance v0, Ljava/lang/StringBuilder;

    .line 599
    .line 600
    const-string v1, "\u53d1\u9001\u6536\u85cf\u5931\u8d25: \u672a\u627e\u5230\u6536\u85cf localId="

    .line 601
    .line 602
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    return v16

    .line 616
    :goto_e
    const-string v0, "\u53d1\u9001\u6536\u85cf\u5931\u8d25: talker/localId \u4e3a\u7a7a"

    .line 617
    .line 618
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    return v16
.end method
