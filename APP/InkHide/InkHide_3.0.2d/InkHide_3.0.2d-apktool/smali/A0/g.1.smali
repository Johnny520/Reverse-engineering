.class public final LA0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;

.field public static final d:[Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "sd5"

    .line 2
    .line 3
    const-string v1, "yf5"

    .line 4
    .line 5
    const-string v2, "com.tencent.mm"

    .line 6
    .line 7
    const-string v3, "va5"

    .line 8
    .line 9
    const-string v4, "kc5"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LA0/g;->a:[Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "fh5"

    .line 18
    .line 19
    filled-new-array {v0}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LA0/g;->b:[Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "sd5."

    .line 26
    .line 27
    const-string v1, "yf5."

    .line 28
    .line 29
    const-string v2, "va5."

    .line 30
    .line 31
    const-string v3, "kc5."

    .line 32
    .line 33
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, LA0/g;->c:[Ljava/lang/String;

    .line 38
    .line 39
    const-string v0, "fh5."

    .line 40
    .line 41
    filled-new-array {v0}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, LA0/g;->d:[Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method

.method public static A(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/Set;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "bridge"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v0, LW0/a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, LW0/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, LZ0/b;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v1, p1}, LZ0/b;->e0(LZ0/b;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, LW0/a;->f:LD/h;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lb1/j;

    .line 46
    .line 47
    iget-object v0, v0, Lb1/j;->e:LE0/f;

    .line 48
    .line 49
    invoke-virtual {v0}, LE0/f;->a()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/util/List;

    .line 54
    .line 55
    new-instance v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Lb1/l;

    .line 75
    .line 76
    iget-object v3, v2, Lb1/l;->a:Lb1/f;

    .line 77
    .line 78
    invoke-virtual {v3}, Lb1/f;->b()Lf1/b;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iget-object v3, v3, Lf1/b;->b:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v2, v2, Lb1/l;->a:Lb1/f;

    .line 85
    .line 86
    invoke-virtual {v2}, Lb1/f;->b()Lf1/b;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iget-object v2, v2, Lf1/b;->a:Ljava/lang/String;

    .line 91
    .line 92
    const-string v4, ".R$id"

    .line 93
    .line 94
    invoke-static {v2, v4}, LU0/q;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_1

    .line 99
    .line 100
    if-eqz p2, :cond_2

    .line 101
    .line 102
    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_1
    const/4 v3, 0x0

    .line 110
    :cond_2
    :goto_2
    if-eqz v3, :cond_0

    .line 111
    .line 112
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    invoke-static {v1, p1}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :catchall_0
    move-exception p0

    .line 121
    new-instance p1, LE0/d;

    .line 122
    .line 123
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    sget-object p0, LF0/s;->a:LF0/s;

    .line 127
    .line 128
    instance-of p2, p1, LE0/d;

    .line 129
    .line 130
    if-eqz p2, :cond_5

    .line 131
    .line 132
    move-object p1, p0

    .line 133
    :cond_5
    check-cast p1, Ljava/util/List;

    .line 134
    .line 135
    return-object p1
.end method

.method public static B(Ljava/lang/Class;)Z
    .locals 4

    .line 1
    invoke-static {p0}, LA0/g;->o(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/reflect/Method;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "onMMMenuItemSelected"

    .line 34
    .line 35
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    array-length v2, v2

    .line 46
    const/4 v3, 0x2

    .line 47
    if-ne v2, v3, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    aget-object v2, v2, v1

    .line 54
    .line 55
    const-class v3, Landroid/view/MenuItem;

    .line 56
    .line 57
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v2, 0x1

    .line 68
    aget-object v0, v0, v2

    .line 69
    .line 70
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    return v2

    .line 79
    :cond_2
    :goto_0
    return v1
.end method

.method public static C(Ljava/lang/Class;Ljava/util/Set;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p0}, LA0/g;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/reflect/Field;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    const/4 p0, 0x1

    .line 50
    return p0

    .line 51
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public static D(Ljava/lang/String;)Z
    .locals 6

    .line 1
    const-string v0, "com.tencent.mm"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    invoke-static {}, LA0/g;->G()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget-object v3, LA0/g;->c:[Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, LA0/g;->d:[Ljava/lang/String;

    .line 20
    .line 21
    const/4 v4, 0x5

    .line 22
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v4, 0x4

    .line 27
    invoke-static {v0, v1, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    .line 29
    .line 30
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast v3, [Ljava/lang/String;

    .line 34
    .line 35
    :cond_0
    array-length v0, v3

    .line 36
    move v4, v1

    .line 37
    :goto_0
    if-ge v4, v0, :cond_2

    .line 38
    .line 39
    aget-object v5, v3, v4

    .line 40
    .line 41
    invoke-static {p0, v1, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return v1

    .line 52
    :cond_3
    :goto_1
    return v2
.end method

.method public static E(Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-static {}, LA0/g;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, LA0/g;->c:[Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, LA0/g;->d:[Ljava/lang/String;

    .line 12
    .line 13
    const/4 v4, 0x5

    .line 14
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v4, 0x4

    .line 19
    invoke-static {v0, v3, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    check-cast v1, [Ljava/lang/String;

    .line 26
    .line 27
    :cond_0
    array-length v0, v1

    .line 28
    move v4, v3

    .line 29
    :goto_0
    if-ge v4, v0, :cond_2

    .line 30
    .line 31
    aget-object v5, v1, v4

    .line 32
    .line 33
    invoke-static {p0, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    return v2

    .line 40
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return v3
.end method

.method public static F(Ljava/lang/Class;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "java."

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, v2, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "android."

    .line 25
    .line 26
    invoke-static {v0, v2, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v0, "kotlin."

    .line 37
    .line 38
    invoke-static {p0, v2, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return v2

    .line 46
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 47
    return p0
.end method

.method public static G()Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const-string v2, ""

    .line 18
    .line 19
    :cond_0
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/16 v4, 0xc30

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-static {}, Lz0/r;->p()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-le v2, v4, :cond_6

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_1
    const/16 v3, 0x2d

    .line 36
    .line 37
    invoke-static {v2, v3}, LU0/i;->x0(Ljava/lang/String;C)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/16 v3, 0x28

    .line 42
    .line 43
    invoke-static {v2, v3}, LU0/i;->x0(Ljava/lang/String;C)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-array v3, v1, [C

    .line 56
    .line 57
    const/16 v5, 0x2e

    .line 58
    .line 59
    aput-char v5, v3, v0

    .line 60
    .line 61
    invoke-static {v2, v3}, LU0/i;->u0(Ljava/lang/String;[C)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    new-instance v3, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_3

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v5}, LU0/p;->Z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    if-eqz v5, :cond_2

    .line 91
    .line 92
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    const/4 v5, 0x3

    .line 101
    if-lt v2, v5, :cond_4

    .line 102
    .line 103
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    const/16 v5, 0x8

    .line 114
    .line 115
    if-ne v2, v5, :cond_4

    .line 116
    .line 117
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-nez v2, :cond_4

    .line 128
    .line 129
    const/4 v2, 0x2

    .line 130
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    const/16 v3, 0x4c

    .line 141
    .line 142
    if-lt v2, v3, :cond_6

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    sget v2, Lz0/r;->e:I

    .line 146
    .line 147
    const/4 v3, -0x1

    .line 148
    if-ne v2, v3, :cond_5

    .line 149
    .line 150
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-virtual {v2, v5, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iget v3, v2, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :catch_0
    move-exception v2

    .line 174
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-static {v2}, Li0/a;->b([Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :goto_1
    sput v3, Lz0/r;->e:I

    .line 182
    .line 183
    :cond_5
    sget v2, Lz0/r;->e:I

    .line 184
    .line 185
    if-le v2, v4, :cond_6

    .line 186
    .line 187
    :goto_2
    return v1

    .line 188
    :cond_6
    return v0
.end method

.method public static H(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1, v0, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p0

    .line 8
    new-instance p1, LE0/d;

    .line 9
    .line 10
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object p0, p1

    .line 14
    :goto_0
    nop

    .line 15
    instance-of p1, p0, LE0/d;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 21
    .line 22
    return-object p0
.end method

.method public static I(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, ".g"

    .line 2
    .line 3
    invoke-static {p0, v0}, LU0/q;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "contact"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "address"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_1
    :goto_0
    return v1
.end method

.method public static J(Ljava/lang/Class;)Z
    .locals 7

    .line 1
    const-string v0, "clazz"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    move-object v1, p0

    .line 12
    :goto_0
    if-eqz v1, :cond_1

    .line 13
    .line 14
    const-class v2, Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "getDeclaredMethods(...)"

    .line 27
    .line 28
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v2

    .line 37
    new-instance v3, LE0/d;

    .line 38
    .line 39
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    move-object v2, v3

    .line 43
    :goto_1
    sget-object v3, LF0/s;->a:LF0/s;

    .line 44
    .line 45
    instance-of v4, v2, LE0/d;

    .line 46
    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    move-object v2, v3

    .line 50
    :cond_0
    check-cast v2, Ljava/util/Collection;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v3, 0x1

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    :cond_2
    move v1, v2

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_2

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/reflect/Method;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    const-string v6, "onBindViewHolder"

    .line 91
    .line 92
    invoke-static {v5, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_4

    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    array-length v5, v5

    .line 103
    const/4 v6, 0x2

    .line 104
    if-lt v5, v6, :cond_4

    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    aget-object v4, v4, v3

    .line 111
    .line 112
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 113
    .line 114
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_4

    .line 119
    .line 120
    move v1, v3

    .line 121
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_6

    .line 126
    .line 127
    :cond_5
    move v0, v2

    .line 128
    goto :goto_3

    .line 129
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_5

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    check-cast v4, Ljava/lang/reflect/Method;

    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    const-string v5, "getName(...)"

    .line 150
    .line 151
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const-string v5, "notify"

    .line 155
    .line 156
    invoke-static {v4, v2, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_7

    .line 161
    .line 162
    move v0, v3

    .line 163
    :goto_3
    if-eqz v1, :cond_8

    .line 164
    .line 165
    if-eqz v0, :cond_8

    .line 166
    .line 167
    invoke-static {p0}, LA0/g;->y(Ljava/lang/Class;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    if-nez p0, :cond_8

    .line 176
    .line 177
    return v3

    .line 178
    :cond_8
    return v2
.end method

.method public static K(Ljava/lang/Class;)Z
    .locals 5

    .line 1
    invoke-static {p0}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/reflect/Method;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    array-length v3, v2

    .line 34
    const/4 v4, 0x2

    .line 35
    if-lt v3, v4, :cond_1

    .line 36
    .line 37
    aget-object v3, v2, v1

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v4, "androidx.recyclerview.widget.k3"

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    aget-object v2, v2, v3

    .line 53
    .line 54
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    invoke-static {v2, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    return v3

    .line 75
    :cond_2
    :goto_0
    return v1
.end method

.method public static L(Ljava/lang/Class;Ljava/util/Map;Ljava/util/Map;I)I
    .locals 5

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    sget-object v1, LF0/t;->a:LF0/t;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object p1, v1

    .line 8
    :cond_0
    and-int/lit8 v0, p3, 0x8

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x6

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v0, v1

    .line 17
    :goto_0
    and-int/lit8 p3, p3, 0x10

    .line 18
    .line 19
    if-eqz p3, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    :cond_2
    const-string p3, "clazz"

    .line 23
    .line 24
    invoke-static {p0, p3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Integer;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    move p1, v2

    .line 46
    :goto_1
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_5

    .line 59
    .line 60
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/util/Map$Entry;

    .line 65
    .line 66
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-static {p3, v2, v4}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_4

    .line 87
    .line 88
    add-int/2addr p1, v3

    .line 89
    goto :goto_2

    .line 90
    :cond_5
    invoke-static {p3}, LU0/i;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    const/4 p3, 0x3

    .line 99
    if-gt p2, p3, :cond_6

    .line 100
    .line 101
    add-int/2addr p1, v0

    .line 102
    :cond_6
    invoke-static {p0}, LA0/g;->y(Ljava/lang/Class;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-nez p0, :cond_7

    .line 111
    .line 112
    add-int/2addr p1, v1

    .line 113
    :cond_7
    return p1
.end method

.method public static M(Ljava/lang/Class;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "contact"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v0, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v3, 0x2

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    move v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v4

    .line 19
    :goto_0
    const-string v5, "address"

    .line 20
    .line 21
    invoke-static {v0, v5, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x3

    .line 28
    .line 29
    :cond_1
    const-string v5, "fragment"

    .line 30
    .line 31
    invoke-static {v0, v5, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x3

    .line 38
    .line 39
    :cond_2
    invoke-static {p0}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-string v2, "getParameterTypes(...)"

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_5

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Ljava/lang/reflect/Method;

    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v6, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    array-length v6, v6

    .line 76
    if-nez v6, :cond_4

    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    const-string v6, "LiveList"

    .line 87
    .line 88
    invoke-static {v5, v6, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_4

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x6

    .line 95
    .line 96
    :cond_5
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_8

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Ljava/lang/reflect/Method;

    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-static {v5, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    array-length v5, v5

    .line 127
    if-nez v5, :cond_7

    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    const-string v5, "getReturnType(...)"

    .line 134
    .line 135
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v4}, LA0/g;->K(Ljava/lang/Class;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_7

    .line 143
    .line 144
    add-int/lit8 v1, v1, 0x6

    .line 145
    .line 146
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_9

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_c

    .line 162
    .line 163
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Ljava/lang/reflect/Method;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const-string v4, "onViewCreated"

    .line 174
    .line 175
    invoke-static {v2, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-nez v2, :cond_b

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const-string v2, "onResume"

    .line 186
    .line 187
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_a

    .line 192
    .line 193
    :cond_b
    add-int/2addr v1, v3

    .line 194
    :cond_c
    :goto_3
    return v1
.end method

.method public static N(Ljava/lang/Class;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "LiveList"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v0, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v3

    .line 18
    :goto_0
    const-string v4, "Address"

    .line 19
    .line 20
    invoke-static {v0, v4, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x3

    .line 27
    .line 28
    :cond_1
    const-string v4, "contact"

    .line 29
    .line 30
    invoke-static {v0, v4, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x2

    .line 37
    .line 38
    :cond_2
    invoke-static {p0}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/lang/reflect/Method;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    array-length v4, v4

    .line 70
    if-ne v4, v2, :cond_4

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    aget-object v0, v0, v3

    .line 77
    .line 78
    const-class v4, Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v4, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    add-int/lit8 v1, v1, 0x6

    .line 87
    .line 88
    :cond_5
    :goto_1
    return v1
.end method

.method public static O(Ljava/lang/Class;)I
    .locals 12

    .line 1
    invoke-static {p0}, LA0/g;->F(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, LU0/i;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "c"

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const-string v3, "a"

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v2, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    :goto_0
    const/16 v2, 0x8

    .line 37
    .line 38
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v4, 0x2

    .line 43
    if-gt v0, v4, :cond_3

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x3

    .line 46
    .line 47
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v5, "getDeclaredFields(...)"

    .line 52
    .line 53
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    array-length v6, v0

    .line 57
    move v7, v1

    .line 58
    move v8, v7

    .line 59
    :goto_2
    const-class v9, Ljava/lang/String;

    .line 60
    .line 61
    if-ge v7, v6, :cond_5

    .line 62
    .line 63
    aget-object v10, v0, v7

    .line 64
    .line 65
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    if-nez v11, :cond_4

    .line 74
    .line 75
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    invoke-static {v10, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-eqz v9, :cond_4

    .line 84
    .line 85
    add-int/lit8 v8, v8, 0x1

    .line 86
    .line 87
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    const/4 v0, 0x1

    .line 91
    if-gt v0, v8, :cond_6

    .line 92
    .line 93
    const/4 v0, 0x7

    .line 94
    if-ge v8, v0, :cond_6

    .line 95
    .line 96
    add-int/lit8 v2, v2, 0x8

    .line 97
    .line 98
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    array-length v6, v0

    .line 106
    move v7, v1

    .line 107
    :goto_3
    if-ge v7, v6, :cond_9

    .line 108
    .line 109
    aget-object v8, v0, v7

    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-static {v10, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-eqz v10, :cond_8

    .line 120
    .line 121
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-static {v10, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-nez v10, :cond_7

    .line 130
    .line 131
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    const-string v10, "getName(...)"

    .line 136
    .line 137
    invoke-static {v8, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_8

    .line 145
    .line 146
    :cond_7
    add-int/lit8 v2, v2, 0xa

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_8
    add-int/lit8 v7, v7, 0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_9
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-static {p0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    array-length v0, p0

    .line 160
    :goto_5
    if-ge v1, v0, :cond_b

    .line 161
    .line 162
    aget-object v3, p0, v1

    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-nez v5, :cond_a

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 179
    .line 180
    invoke-static {v3, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_a

    .line 185
    .line 186
    add-int/2addr v2, v4

    .line 187
    return v2

    .line 188
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_b
    return v2
.end method

.method public static final a(Lb1/j;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lb1/j;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lb1/j;->b()Lf1/d;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, Lf1/d;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "(Landroid/widget/ImageView;Ljava/lang/String;FZ)V"

    .line 12
    .line 13
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x64

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    const-string v3, "(Landroid/widget/ImageView;Ljava/lang/String;)V"

    .line 25
    .line 26
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x50

    .line 33
    .line 34
    :cond_1
    const-string v3, "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;F)V"

    .line 35
    .line 36
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x46

    .line 43
    .line 44
    :cond_2
    const-string v0, "com.tencent.mm.pluginsdk.ui"

    .line 45
    .line 46
    invoke-static {p0, v2, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x28

    .line 53
    .line 54
    :cond_3
    const-string v0, "com.tencent.mm.feature.avatar"

    .line 55
    .line 56
    invoke-static {p0, v2, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x23

    .line 63
    .line 64
    :cond_4
    const-string v0, "com.tencent.mm"

    .line 65
    .line 66
    invoke-static {p0, v2, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    add-int/lit8 v1, v1, 0xa

    .line 73
    .line 74
    :cond_5
    return v1
.end method

.method public static final b(Ljava/lang/Class;)I
    .locals 4

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LE0/c;

    .line 8
    .line 9
    const-string v2, "com.tencent.mm.ui.contact.h0"

    .line 10
    .line 11
    invoke-direct {v1, v2, v0}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, LF0/v;->Z(LE0/c;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/16 v1, 0xc

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, LE0/c;

    .line 25
    .line 26
    const-string v3, "com.tencent.mm.ui.contact"

    .line 27
    .line 28
    invoke-direct {v2, v3, v1}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, LF0/v;->Z(LE0/c;)Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/16 v2, 0x18

    .line 36
    .line 37
    invoke-static {p0, v0, v1, v2}, LA0/g;->L(Ljava/lang/Class;Ljava/util/Map;Ljava/util/Map;I)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public static final c(Ljava/lang/Class;)I
    .locals 4

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LE0/c;

    .line 8
    .line 9
    const-string v2, "com.tencent.mm.ui.contact"

    .line 10
    .line 11
    invoke-direct {v1, v2, v0}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v2, LE0/c;

    .line 21
    .line 22
    const-string v3, "com.tencent.mm.ui.mvvm"

    .line 23
    .line 24
    invoke-direct {v2, v3, v0}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    filled-new-array {v1, v2}, [LE0/c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    invoke-static {v2}, LF0/v;->Y(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v0}, LF0/v;->b0(Ljava/util/LinkedHashMap;[LE0/c;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    const/16 v2, 0x1a

    .line 46
    .line 47
    invoke-static {p0, v0, v1, v2}, LA0/g;->L(Ljava/lang/Class;Ljava/util/Map;Ljava/util/Map;I)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0
.end method

.method public static final d(Ljava/lang/Class;)I
    .locals 3

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LE0/c;

    .line 8
    .line 9
    const-string v2, "com.tencent.mm.plugin.textstatus"

    .line 10
    .line 11
    invoke-direct {v1, v2, v0}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, LF0/v;->Z(LE0/c;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p0, v1, v0, v2}, LA0/g;->L(Ljava/lang/Class;Ljava/util/Map;Ljava/util/Map;I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public static final e(Ljava/lang/Class;Ljava/util/Set;Ljava/util/Set;)I
    .locals 4

    .line 1
    invoke-static {p0}, LA0/g;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, LA0/g;->B(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/reflect/Field;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0xa

    .line 53
    .line 54
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ljava/lang/reflect/Field;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x6

    .line 92
    .line 93
    :cond_6
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    const/4 p1, 0x3

    .line 102
    if-gt p0, p1, :cond_7

    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x2

    .line 105
    .line 106
    :cond_7
    return v1
.end method

.method public static final f(Ljava/lang/Class;)I
    .locals 6

    .line 1
    const-class v0, Landroid/view/View$OnCreateContextMenuListener;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    invoke-static {p0}, LA0/g;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/reflect/Field;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const-string v4, "com.tencent.mm.ui.contact"

    .line 50
    .line 51
    invoke-static {v3, v1, v4}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x6

    .line 58
    .line 59
    :cond_3
    :goto_1
    invoke-static {p0}, LA0/g;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_8

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Ljava/lang/reflect/Field;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const-string v4, "getType(...)"

    .line 91
    .line 92
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v3}, LA0/g;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_5

    .line 115
    .line 116
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Ljava/lang/reflect/Field;

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    const-string v5, "com.tencent.mm.storage."

    .line 131
    .line 132
    invoke-static {v4, v1, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-eqz v4, :cond_7

    .line 137
    .line 138
    add-int/lit8 v0, v0, 0x8

    .line 139
    .line 140
    :cond_8
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    const/4 v1, 0x3

    .line 149
    if-gt p0, v1, :cond_9

    .line 150
    .line 151
    add-int/lit8 v0, v0, 0x2

    .line 152
    .line 153
    :cond_9
    return v0
.end method

.method public static final g(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "q7"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0x64

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const-string v0, "N7"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string v0, "m7"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-string v0, "C7"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const-string v0, "I7"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    :goto_0
    const/16 p0, 0x5f

    .line 48
    .line 49
    return p0

    .line 50
    :cond_4
    const-string v0, "a7"

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    const/16 p0, -0x14

    .line 59
    .line 60
    return p0

    .line 61
    :cond_5
    const-string v0, "o7"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_6

    .line 68
    .line 69
    const/16 p0, -0xa

    .line 70
    .line 71
    return p0

    .line 72
    :cond_6
    const/4 p0, 0x0

    .line 73
    return p0
.end method

.method public static final h(Lb1/j;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lb1/j;->b()Lf1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lf1/d;->a:Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "com.tencent.mm.storage."

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v0, v2, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x50

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v2

    .line 20
    :goto_0
    invoke-virtual {p0}, Lb1/j;->c()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v3, ")J"

    .line 25
    .line 26
    invoke-static {v1, v3}, LU0/q;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x28

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lb1/j;->c()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v3, "Lcom/tencent/mm/storage/"

    .line 39
    .line 40
    invoke-static {v1, v3, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x1e

    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0}, Lb1/j;->b()Lf1/d;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object p0, p0, Lf1/d;->a:Ljava/lang/String;

    .line 53
    .line 54
    const-string v1, "com.tencent.mm"

    .line 55
    .line 56
    invoke-static {p0, v2, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    add-int/lit8 v0, v0, 0xa

    .line 63
    .line 64
    :cond_3
    return v0
.end method

.method public static i(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getDeclaredFields(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, LF0/q;->f0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    new-instance v2, LE0/d;

    .line 36
    .line 37
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object v1, v2

    .line 41
    :goto_1
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v3, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v4, "conversation dexkit read fields fail "

    .line 62
    .line 63
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, " "

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1}, LA0/g;->q(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    :catchall_1
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/lang/reflect/Field;

    .line 104
    .line 105
    const/4 v2, 0x1

    .line 106
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_2
    return-object v0
.end method

.method public static j(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getDeclaredFields(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    new-instance v2, LE0/d;

    .line 32
    .line 33
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v2

    .line 37
    :goto_1
    sget-object v2, LF0/s;->a:LF0/s;

    .line 38
    .line 39
    instance-of v3, v1, LE0/d;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    move-object v1, v2

    .line 44
    :cond_0
    check-cast v1, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-object v0
.end method

.method public static k(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getDeclaredFields(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    new-instance v2, LE0/d;

    .line 32
    .line 33
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v2

    .line 37
    :goto_1
    sget-object v2, LF0/s;->a:LF0/s;

    .line 38
    .line 39
    instance-of v3, v1, LE0/d;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    move-object v1, v2

    .line 44
    :cond_0
    check-cast v1, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-object v0
.end method

.method public static l(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    const-string v0, "clazz"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    const-class v1, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "getDeclaredFields(...)"

    .line 26
    .line 27
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    new-instance v2, LE0/d;

    .line 37
    .line 38
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object v1, v2

    .line 42
    :goto_1
    sget-object v2, LF0/s;->a:LF0/s;

    .line 43
    .line 44
    instance-of v3, v1, LE0/d;

    .line 45
    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    move-object v1, v2

    .line 49
    :cond_0
    check-cast v1, Ljava/util/Collection;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-object v0
.end method

.method public static m(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getDeclaredMethods(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, LF0/q;->f0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v3, v2

    .line 58
    check-cast v3, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const-string v6, "getParameterTypes(...)"

    .line 77
    .line 78
    invoke-static {v3, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v6, LA0/a;

    .line 82
    .line 83
    const/4 v7, 0x6

    .line 84
    invoke-direct {v6, v7}, LA0/a;-><init>(I)V

    .line 85
    .line 86
    .line 87
    const/16 v7, 0x19

    .line 88
    .line 89
    const/4 v8, 0x0

    .line 90
    invoke-static {v3, v8, v6, v7}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    new-instance v6, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v4, "#"

    .line 103
    .line 104
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_1

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Ljava/lang/reflect/Method;

    .line 142
    .line 143
    const/4 v2, 0x1

    .line 144
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    return-object v1
.end method

.method public static n(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getDeclaredMethods(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, LF0/q;->f0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    new-instance v2, LE0/d;

    .line 36
    .line 37
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object v1, v2

    .line 41
    :goto_1
    invoke-static {v1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v3, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v4, "conversation dexkit read methods fail "

    .line 62
    .line 63
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, " "

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1}, LA0/g;->q(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    new-instance p0, Ljava/util/HashSet;

    .line 90
    .line 91
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 92
    .line 93
    .line 94
    new-instance v1, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    move-object v3, v2

    .line 114
    check-cast v3, Ljava/lang/reflect/Method;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    const-string v6, "getParameterTypes(...)"

    .line 133
    .line 134
    invoke-static {v3, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v6, LA0/a;

    .line 138
    .line 139
    const/16 v7, 0xd

    .line 140
    .line 141
    invoke-direct {v6, v7}, LA0/a;-><init>(I)V

    .line 142
    .line 143
    .line 144
    const/16 v7, 0x19

    .line 145
    .line 146
    const/4 v8, 0x0

    .line 147
    invoke-static {v3, v8, v6, v7}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    new-instance v6, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v4, "#"

    .line 160
    .line 161
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_2

    .line 179
    .line 180
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    :catchall_1
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_4

    .line 193
    .line 194
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Ljava/lang/reflect/Method;

    .line 199
    .line 200
    const/4 v2, 0x1

    .line 201
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_4
    return-object v1
.end method

.method public static o(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getDeclaredMethods(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    new-instance v2, LE0/d;

    .line 32
    .line 33
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v2

    .line 37
    :goto_1
    sget-object v2, LF0/s;->a:LF0/s;

    .line 38
    .line 39
    instance-of v3, v1, LE0/d;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    move-object v1, v2

    .line 44
    :cond_0
    check-cast v1, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-object v0
.end method

.method public static p(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getDeclaredMethods(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, LF0/q;->f0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v0
.end method

.method public static q(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "WXMaskDexKit"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static varargs r(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, LW0/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LW0/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, LZ0/b;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    array-length v2, p1

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v1, v2}, LZ0/b;->e0(LZ0/b;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    array-length v2, p1

    .line 27
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, [Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, LZ0/b;->d0([Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iput-object v1, v0, LW0/a;->f:LD/h;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    goto :goto_2

    .line 47
    :goto_1
    new-instance v0, LE0/d;

    .line 48
    .line 49
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object p0, v0

    .line 53
    :goto_2
    invoke-static {p0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    const-string v1, ","

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    const/16 v3, 0x3e

    .line 63
    .line 64
    invoke-static {p1, v1, v2, v3}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v1, "custom avatar dexkit string scan fail"

    .line 69
    .line 70
    filled-new-array {v1, p1, v0}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    sget-object p1, LF0/s;->a:LF0/s;

    .line 78
    .line 79
    instance-of v0, p0, LE0/d;

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    move-object p0, p1

    .line 84
    :cond_2
    check-cast p0, Ljava/util/List;

    .line 85
    .line 86
    return-object p0
.end method

.method public static s(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    :try_start_0
    new-instance v2, LW0/a;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v2, v3}, LW0/a;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, LA0/g;->G()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    sget-object v4, LA0/g;->a:[Ljava/lang/String;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    sget-object v3, LA0/g;->b:[Ljava/lang/String;

    .line 39
    .line 40
    const/4 v7, 0x6

    .line 41
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/4 v7, 0x5

    .line 46
    invoke-static {v3, v5, v4, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    invoke-static {v4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    check-cast v4, [Ljava/lang/String;

    .line 53
    .line 54
    :cond_0
    array-length v3, v4

    .line 55
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, [Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v2, v3}, LW0/a;->Z([Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, LZ0/a;

    .line 65
    .line 66
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v1, v6, v5}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 70
    .line 71
    .line 72
    iput-object v3, v2, LW0/a;->f:LD/h;

    .line 73
    .line 74
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    new-instance v3, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_1

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Lb1/d;

    .line 98
    .line 99
    invoke-virtual {v4, p1}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_0
    move-exception v2

    .line 108
    new-instance v3, LE0/d;

    .line 109
    .line 110
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    invoke-static {v3}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    if-eqz v2, :cond_2

    .line 118
    .line 119
    const-string v4, "conversation dexkit find class fail"

    .line 120
    .line 121
    filled-new-array {v4, v1, v2}, [Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    sget-object v1, LF0/s;->a:LF0/s;

    .line 129
    .line 130
    instance-of v2, v3, LE0/d;

    .line 131
    .line 132
    if-eqz v2, :cond_3

    .line 133
    .line 134
    move-object v3, v1

    .line 135
    :cond_3
    check-cast v3, Ljava/lang/Iterable;

    .line 136
    .line 137
    invoke-static {v3, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :cond_4
    new-instance p0, Ljava/util/HashSet;

    .line 143
    .line 144
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 145
    .line 146
    .line 147
    new-instance p1, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_6

    .line 161
    .line 162
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    move-object v1, v0

    .line 167
    check-cast v1, Ljava/lang/Class;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_5

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    return-object p1
.end method

.method public static t(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;)Ljava/lang/Class;
    .locals 12

    .line 1
    const-string v1, ":"

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    :try_start_0
    invoke-static {v0, v3, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    new-instance v3, LE0/d;

    .line 28
    .line 29
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object v0, v3

    .line 33
    :goto_0
    nop

    .line 34
    instance-of v3, v0, LE0/d;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v4, v0

    .line 40
    :goto_1
    check-cast v4, Ljava/lang/Class;

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    return-object v4

    .line 45
    :cond_2
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_6

    .line 54
    .line 55
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    :try_start_1
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->f(Ljava/lang/String;)Lb1/d;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    goto :goto_3

    .line 72
    :catchall_1
    move-exception v0

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    move-object v0, v4

    .line 75
    goto :goto_3

    .line 76
    :goto_2
    new-instance v2, LE0/d;

    .line 77
    .line 78
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    move-object v0, v2

    .line 82
    :goto_3
    nop

    .line 83
    instance-of v2, v0, LE0/d;

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    move-object v0, v4

    .line 88
    :cond_5
    check-cast v0, Ljava/lang/Class;

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_6
    :try_start_2
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    :cond_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_d

    .line 102
    .line 103
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ljava/lang/String;

    .line 108
    .line 109
    new-instance v2, LW0/a;

    .line 110
    .line 111
    const/4 v5, 0x0

    .line 112
    invoke-direct {v2, v5}, LW0/a;-><init>(I)V

    .line 113
    .line 114
    .line 115
    const-string v5, "com.tencent.mm.ui.contact"

    .line 116
    .line 117
    filled-new-array {v5}, [Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v2, v5}, LW0/a;->Z([Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    new-instance v5, LZ0/a;

    .line 125
    .line 126
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 127
    .line 128
    .line 129
    const/4 v6, 0x1

    .line 130
    invoke-virtual {v5, v0, v6, v3}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 131
    .line 132
    .line 133
    iput-object v5, v2, LW0/a;->f:LD/h;

    .line 134
    .line 135
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-nez v5, :cond_8

    .line 148
    .line 149
    move-object v5, v4

    .line 150
    goto :goto_4

    .line 151
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-nez v7, :cond_9

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_9
    move-object v7, v5

    .line 163
    check-cast v7, Lb1/d;

    .line 164
    .line 165
    invoke-virtual {v7}, Lb1/d;->b()Lf1/a;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    iget-object v8, v8, Lf1/a;->a:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v8}, LU0/i;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    invoke-virtual {v8, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    xor-int/2addr v8, v6

    .line 180
    invoke-virtual {v7}, Lb1/d;->b()Lf1/a;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    iget-object v7, v7, Lf1/a;->a:Ljava/lang/String;

    .line 185
    .line 186
    new-instance v9, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    move-object v9, v8

    .line 209
    check-cast v9, Lb1/d;

    .line 210
    .line 211
    invoke-virtual {v9}, Lb1/d;->b()Lf1/a;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    iget-object v10, v10, Lf1/a;->a:Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {v10}, LU0/i;->w0(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    xor-int/2addr v10, v6

    .line 226
    invoke-virtual {v9}, Lb1/d;->b()Lf1/a;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    iget-object v9, v9, Lf1/a;->a:Ljava/lang/String;

    .line 231
    .line 232
    new-instance v11, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    invoke-virtual {v7, v9}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    if-lez v10, :cond_b

    .line 255
    .line 256
    move-object v5, v8

    .line 257
    move-object v7, v9

    .line 258
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-nez v8, :cond_a

    .line 263
    .line 264
    :goto_4
    check-cast v5, Lb1/d;

    .line 265
    .line 266
    if-eqz v5, :cond_c

    .line 267
    .line 268
    invoke-virtual {v5, p0}, Lb1/d;->c(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 272
    goto :goto_5

    .line 273
    :catchall_2
    move-exception v0

    .line 274
    move-object p0, v0

    .line 275
    goto :goto_6

    .line 276
    :cond_c
    move-object v0, v4

    .line 277
    :goto_5
    if-eqz v0, :cond_7

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_d
    move-object v0, v4

    .line 281
    goto :goto_7

    .line 282
    :goto_6
    new-instance v0, LE0/d;

    .line 283
    .line 284
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 285
    .line 286
    .line 287
    :goto_7
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    if-eqz p0, :cond_e

    .line 292
    .line 293
    const/4 v8, 0x0

    .line 294
    const/4 v9, 0x0

    .line 295
    const-string v6, ","

    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const/16 v10, 0x3e

    .line 299
    .line 300
    move-object v5, p3

    .line 301
    invoke-static/range {v5 .. v10}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    const-string p2, "contact dexkit find class by simple name fail"

    .line 306
    .line 307
    filled-new-array {p2, p1, p0}, [Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_e
    instance-of p0, v0, LE0/d;

    .line 315
    .line 316
    if-eqz p0, :cond_f

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_f
    move-object v4, v0

    .line 320
    :goto_8
    check-cast v4, Ljava/lang/Class;

    .line 321
    .line 322
    return-object v4
.end method

.method public static u(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "bridge"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    :try_start_0
    new-instance v2, LW0/a;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v2, v3}, LW0/a;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    new-array v3, v3, [Ljava/lang/String;

    .line 35
    .line 36
    invoke-interface {p1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, [Ljava/lang/String;

    .line 41
    .line 42
    array-length v4, v3

    .line 43
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, [Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, LW0/a;->Z([Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v3, LZ0/a;

    .line 53
    .line 54
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-virtual {v3, v1, v4, p3}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 59
    .line 60
    .line 61
    iput-object v3, v2, LW0/a;->f:LD/h;

    .line 62
    .line 63
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v2, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-static {v1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Lb1/d;

    .line 91
    .line 92
    invoke-virtual {v3}, Lb1/d;->b()Lf1/a;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget-object v3, v3, Lf1/a;->a:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :catchall_0
    move-exception v1

    .line 103
    new-instance v2, LE0/d;

    .line 104
    .line 105
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :cond_0
    sget-object v1, LF0/s;->a:LF0/s;

    .line 109
    .line 110
    instance-of v3, v2, LE0/d;

    .line 111
    .line 112
    if-eqz v3, :cond_1

    .line 113
    .line 114
    move-object v2, v1

    .line 115
    :cond_1
    check-cast v2, Ljava/lang/Iterable;

    .line 116
    .line 117
    invoke-static {v2, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0
.end method

.method public static v(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    sget-object v4, LF0/s;->a:LF0/s;

    .line 7
    .line 8
    :try_start_0
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v0, "dalvik.system.BaseDexClassLoader"

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v6, "pathList"

    .line 20
    .line 21
    invoke-virtual {v0, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 26
    .line 27
    .line 28
    const-string v6, "dalvik.system.DexPathList"

    .line 29
    .line 30
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const-string v7, "dexElements"

    .line 35
    .line 36
    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 41
    .line 42
    .line 43
    const-string v7, "dalvik.system.DexPathList$Element"

    .line 44
    .line 45
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const-string v8, "dexFile"

    .line 50
    .line 51
    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v7, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_0

    .line 63
    .line 64
    :goto_0
    move-object v0, v4

    .line 65
    goto/16 :goto_11

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    instance-of v6, v0, [Ljava/lang/Object;

    .line 72
    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    check-cast v0, [Ljava/lang/Object;

    .line 76
    .line 77
    move-object v6, v0

    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto/16 :goto_10

    .line 81
    .line 82
    :cond_1
    const/4 v6, 0x0

    .line 83
    :goto_1
    if-nez v6, :cond_2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    array-length v9, v6

    .line 87
    const/4 v10, 0x0

    .line 88
    move v0, v10

    .line 89
    move v11, v0

    .line 90
    :goto_2
    if-ge v11, v9, :cond_13

    .line 91
    .line 92
    aget-object v12, v6, v11

    .line 93
    .line 94
    invoke-virtual {v7, v12}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    instance-of v13, v12, Ldalvik/system/DexFile;

    .line 99
    .line 100
    if-eqz v13, :cond_3

    .line 101
    .line 102
    check-cast v12, Ldalvik/system/DexFile;

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    const/4 v12, 0x0

    .line 106
    :goto_3
    if-nez v12, :cond_4

    .line 107
    .line 108
    :goto_4
    move/from16 v17, v3

    .line 109
    .line 110
    goto/16 :goto_f

    .line 111
    .line 112
    :cond_4
    invoke-virtual {v12}, Ldalvik/system/DexFile;->entries()Ljava/util/Enumeration;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    move v13, v0

    .line 117
    :goto_5
    invoke-interface {v12}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_12

    .line 122
    .line 123
    invoke-interface {v12}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    move-object v14, v0

    .line 128
    check-cast v14, Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v14}, LN0/g;->b(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v14}, LA0/g;->E(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    const-string v0, "com.tencent.mm.storage."

    .line 140
    .line 141
    invoke-static {v14, v10, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_5

    .line 146
    .line 147
    const-string v0, "finder"

    .line 148
    .line 149
    invoke-static {v14, v0, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_5

    .line 154
    .line 155
    const-string v0, "game"

    .line 156
    .line 157
    invoke-static {v14, v0, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_5

    .line 162
    .line 163
    const-string v0, "scanner"

    .line 164
    .line 165
    invoke-static {v14, v0, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 166
    .line 167
    .line 168
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    if-eqz v0, :cond_6

    .line 170
    .line 171
    :cond_5
    move/from16 v17, v3

    .line 172
    .line 173
    goto/16 :goto_e

    .line 174
    .line 175
    :cond_6
    :try_start_1
    invoke-static {v2, v14}, LA0/g;->H(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-nez v0, :cond_7

    .line 180
    .line 181
    move/from16 v17, v3

    .line 182
    .line 183
    goto/16 :goto_b

    .line 184
    .line 185
    :cond_7
    invoke-static {v0}, LA0/g;->i(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result v16

    .line 193
    if-eqz v16, :cond_9

    .line 194
    .line 195
    :cond_8
    move/from16 v17, v3

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_9
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v15

    .line 202
    :goto_6
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v16

    .line 206
    if-eqz v16, :cond_8

    .line 207
    .line 208
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v16

    .line 212
    check-cast v16, Ljava/lang/reflect/Field;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 213
    .line 214
    move/from16 v17, v3

    .line 215
    .line 216
    :try_start_2
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-static {v3, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-eqz v3, :cond_a

    .line 225
    .line 226
    goto :goto_a

    .line 227
    :cond_a
    move/from16 v3, v17

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :catchall_1
    move-exception v0

    .line 231
    goto :goto_c

    .line 232
    :catchall_2
    move-exception v0

    .line 233
    move/from16 v17, v3

    .line 234
    .line 235
    goto :goto_c

    .line 236
    :goto_7
    invoke-static {v0}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    if-eqz v15, :cond_b

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_b
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v15

    .line 255
    if-eqz v15, :cond_f

    .line 256
    .line 257
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v15

    .line 261
    check-cast v15, Ljava/lang/reflect/Method;

    .line 262
    .line 263
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    invoke-static {v8, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-nez v8, :cond_e

    .line 272
    .line 273
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    const-string v15, "getParameterTypes(...)"

    .line 278
    .line 279
    invoke-static {v8, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    array-length v15, v8

    .line 283
    :goto_9
    if-ge v10, v15, :cond_d

    .line 284
    .line 285
    aget-object v2, v8, v10

    .line 286
    .line 287
    invoke-static {v2, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eqz v2, :cond_c

    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_c
    add-int/lit8 v10, v10, 0x1

    .line 295
    .line 296
    move-object/from16 v2, p1

    .line 297
    .line 298
    goto :goto_9

    .line 299
    :cond_d
    move-object/from16 v2, p1

    .line 300
    .line 301
    const/4 v10, 0x0

    .line 302
    goto :goto_8

    .line 303
    :cond_e
    :goto_a
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    :cond_f
    :goto_b
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 307
    .line 308
    goto :goto_d

    .line 309
    :goto_c
    :try_start_3
    new-instance v2, LE0/d;

    .line 310
    .line 311
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 312
    .line 313
    .line 314
    move-object v0, v2

    .line 315
    :goto_d
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    if-eqz v0, :cond_11

    .line 320
    .line 321
    const/16 v2, 0xc

    .line 322
    .line 323
    if-ge v13, v2, :cond_10

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    new-instance v2, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    const-string v3, "conversation dexkit skip bad class "

    .line 339
    .line 340
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v3, " "

    .line 347
    .line 348
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-static {v0}, LA0/g;->q(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    :cond_10
    add-int/lit8 v13, v13, 0x1

    .line 362
    .line 363
    :cond_11
    :goto_e
    move-object/from16 v2, p1

    .line 364
    .line 365
    move/from16 v3, v17

    .line 366
    .line 367
    const/4 v10, 0x0

    .line 368
    goto/16 :goto_5

    .line 369
    .line 370
    :cond_12
    move v0, v13

    .line 371
    goto/16 :goto_4

    .line 372
    .line 373
    :goto_f
    add-int/lit8 v11, v11, 0x1

    .line 374
    .line 375
    move-object/from16 v2, p1

    .line 376
    .line 377
    move/from16 v3, v17

    .line 378
    .line 379
    const/4 v10, 0x0

    .line 380
    goto/16 :goto_2

    .line 381
    .line 382
    :cond_13
    if-lez v0, :cond_14

    .line 383
    .line 384
    new-instance v2, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 387
    .line 388
    .line 389
    const-string v3, "conversation dexkit skipped bad classes "

    .line 390
    .line 391
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-static {v0}, LA0/g;->q(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    :cond_14
    invoke-static {v5}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 405
    .line 406
    .line 407
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 408
    goto :goto_11

    .line 409
    :goto_10
    new-instance v2, LE0/d;

    .line 410
    .line 411
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 412
    .line 413
    .line 414
    move-object v0, v2

    .line 415
    :goto_11
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    if-eqz v2, :cond_15

    .line 420
    .line 421
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    const-string v3, "conversation dexkit class reference scan fail"

    .line 426
    .line 427
    filled-new-array {v3, v1, v2}, [Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    :cond_15
    instance-of v1, v0, LE0/d;

    .line 435
    .line 436
    if-eqz v1, :cond_16

    .line 437
    .line 438
    goto :goto_12

    .line 439
    :cond_16
    move-object v4, v0

    .line 440
    :goto_12
    check-cast v4, Ljava/util/List;

    .line 441
    .line 442
    return-object v4
.end method

.method public static w(Ljava/lang/Class;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p0}, LA0/g;->n(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const/4 v3, 0x0

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    move-object v4, v2

    .line 63
    check-cast v4, Ljava/lang/reflect/Method;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const-string v6, "getParameterTypes(...)"

    .line 70
    .line 71
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    array-length v6, v5

    .line 75
    move v7, v3

    .line 76
    :goto_2
    if-ge v7, v6, :cond_1

    .line 77
    .line 78
    aget-object v8, v5, v7

    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_2

    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v5}, LA0/g;->D(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_1

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-nez v5, :cond_1

    .line 117
    .line 118
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    const-string v6, "com.tencent.mm.storage."

    .line 127
    .line 128
    invoke-static {v5, v3, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-nez v3, :cond_1

    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 139
    .line 140
    invoke-static {v3, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_1

    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    const-class v4, Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v3, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-nez v3, :cond_1

    .line 157
    .line 158
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-static {v1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_4

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Ljava/lang/reflect/Method;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    :cond_5
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_f

    .line 212
    .line 213
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    move-object v2, v1

    .line 218
    check-cast v2, Ljava/lang/Class;

    .line 219
    .line 220
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    new-instance v4, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-static {p1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-eqz v6, :cond_6

    .line 241
    .line 242
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    check-cast v6, Ljava/lang/Class;

    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_6
    invoke-static {v4}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-static {v5}, LA0/g;->D(Ljava/lang/String;)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eqz v5, :cond_5

    .line 269
    .line 270
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    if-eqz v5, :cond_7

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    const-string v6, "android."

    .line 286
    .line 287
    invoke-static {v5, v3, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-nez v5, :cond_5

    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    const-string v6, "java."

    .line 298
    .line 299
    invoke-static {v5, v3, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    if-eqz v5, :cond_8

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_8
    invoke-static {v2}, LA0/g;->i(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    if-eqz v5, :cond_9

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    :cond_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    if-eqz v6, :cond_b

    .line 326
    .line 327
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    check-cast v6, Ljava/lang/reflect/Field;

    .line 332
    .line 333
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    const-string v8, "getName(...)"

    .line 338
    .line 339
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    const-string v9, "unRead"

    .line 343
    .line 344
    const/4 v10, 0x1

    .line 345
    invoke-static {v7, v9, v10}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 346
    .line 347
    .line 348
    move-result v7

    .line 349
    if-nez v7, :cond_e

    .line 350
    .line 351
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    const-string v9, "digest"

    .line 359
    .line 360
    invoke-static {v7, v9, v10}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    if-nez v7, :cond_e

    .line 365
    .line 366
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    invoke-static {v6, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    const-string v7, "content"

    .line 374
    .line 375
    invoke-static {v6, v7, v10}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 376
    .line 377
    .line 378
    move-result v6

    .line 379
    if-eqz v6, :cond_a

    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_b
    :goto_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    if-eqz v5, :cond_c

    .line 387
    .line 388
    goto/16 :goto_4

    .line 389
    .line 390
    :cond_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    :cond_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    if-eqz v5, :cond_5

    .line 399
    .line 400
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    check-cast v5, Ljava/lang/reflect/Field;

    .line 405
    .line 406
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v5

    .line 418
    if-eqz v5, :cond_d

    .line 419
    .line 420
    :cond_e
    :goto_7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    goto/16 :goto_4

    .line 424
    .line 425
    :cond_f
    new-instance p0, Ljava/util/HashSet;

    .line 426
    .line 427
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 428
    .line 429
    .line 430
    new-instance p1, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    :cond_10
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    if-eqz v1, :cond_11

    .line 444
    .line 445
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    move-object v2, v1

    .line 450
    check-cast v2, Ljava/lang/Class;

    .line 451
    .line 452
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-virtual {p0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    if-eqz v2, :cond_10

    .line 461
    .line 462
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_11
    return-object p1
.end method

.method public static x(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, LF0/s;->a:LF0/s;

    .line 3
    .line 4
    :try_start_0
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v3, "dalvik.system.BaseDexClassLoader"

    .line 10
    .line 11
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, "pathList"

    .line 16
    .line 17
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 22
    .line 23
    .line 24
    const-string v4, "dalvik.system.DexPathList"

    .line 25
    .line 26
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, "dexElements"

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    .line 38
    .line 39
    const-string v5, "dalvik.system.DexPathList$Element"

    .line 40
    .line 41
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const-string v6, "dexFile"

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v5, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-nez v3, :cond_0

    .line 59
    .line 60
    :goto_0
    move-object p0, v1

    .line 61
    goto/16 :goto_7

    .line 62
    .line 63
    :cond_0
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    instance-of v4, v3, [Ljava/lang/Object;

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    check-cast v3, [Ljava/lang/Object;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_1
    move-object v3, v6

    .line 79
    :goto_1
    if-nez v3, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    array-length v4, v3

    .line 83
    const/4 v7, 0x0

    .line 84
    move v8, v7

    .line 85
    :goto_2
    if-ge v8, v4, :cond_8

    .line 86
    .line 87
    aget-object v9, v3, v8

    .line 88
    .line 89
    invoke-virtual {v5, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    instance-of v10, v9, Ldalvik/system/DexFile;

    .line 94
    .line 95
    if-eqz v10, :cond_3

    .line 96
    .line 97
    check-cast v9, Ldalvik/system/DexFile;

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    move-object v9, v6

    .line 101
    :goto_3
    if-nez v9, :cond_4

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_4
    invoke-virtual {v9}, Ldalvik/system/DexFile;->entries()Ljava/util/Enumeration;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    :cond_5
    :goto_4
    invoke-interface {v9}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    if-eqz v10, :cond_7

    .line 113
    .line 114
    invoke-interface {v9}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    check-cast v10, Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v10}, LN0/g;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v10}, LA0/g;->E(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-eqz v11, :cond_5

    .line 128
    .line 129
    const-string v11, "$"

    .line 130
    .line 131
    invoke-static {v10, v11, v7}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-eqz v11, :cond_6

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_6
    invoke-static {p0, v10}, LA0/g;->H(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    if-eqz v10, :cond_5

    .line 143
    .line 144
    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    :goto_5
    add-int/2addr v8, v0

    .line 149
    goto :goto_2

    .line 150
    :cond_8
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const-string v3, "conversation dexkit core classes "

    .line 160
    .line 161
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {p0}, LA0/g;->q(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    goto :goto_7

    .line 179
    :goto_6
    new-instance v0, LE0/d;

    .line 180
    .line 181
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    move-object p0, v0

    .line 185
    :goto_7
    invoke-static {p0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-eqz v0, :cond_9

    .line 190
    .line 191
    const-string v2, "conversation dexkit core class scan fail"

    .line 192
    .line 193
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_9
    instance-of v0, p0, LE0/d;

    .line 201
    .line 202
    if-eqz v0, :cond_a

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_a
    move-object v1, p0

    .line 206
    :goto_8
    check-cast v1, Ljava/util/List;

    .line 207
    .line 208
    return-object v1
.end method

.method public static y(Ljava/lang/Class;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "clazz"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    const-class v1, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "getDeclaredFields(...)"

    .line 26
    .line 27
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    new-instance v2, LE0/d;

    .line 37
    .line 38
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object v1, v2

    .line 42
    :goto_1
    sget-object v2, LF0/s;->a:LF0/s;

    .line 43
    .line 44
    instance-of v3, v1, LE0/d;

    .line 45
    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    move-object v1, v2

    .line 49
    :cond_0
    check-cast v1, Ljava/util/Collection;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    move-object v2, v1

    .line 79
    check-cast v2, Ljava/lang/reflect/Field;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_2

    .line 90
    .line 91
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    :cond_4
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    move-object v2, v1

    .line 115
    check-cast v2, Ljava/lang/reflect/Field;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const-class v4, Ljava/util/List;

    .line 122
    .line 123
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_5

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    const-string v3, "data"

    .line 134
    .line 135
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_4

    .line 140
    .line 141
    :cond_5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_6
    new-instance p0, LA0/e;

    .line 146
    .line 147
    const/4 v1, 0x4

    .line 148
    invoke-direct {p0, v1}, LA0/e;-><init>(I)V

    .line 149
    .line 150
    .line 151
    new-instance v1, LA0/f;

    .line 152
    .line 153
    const/4 v2, 0x6

    .line 154
    invoke-direct {v1, v2, p0}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v0, v1}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    new-instance v0, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-static {p0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_7

    .line 179
    .line 180
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, Ljava/lang/reflect/Field;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_7
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-static {p0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0
.end method

.method public static z(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    invoke-static {p0}, LA0/g;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Ljava/lang/reflect/Method;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "getParameterTypes(...)"

    .line 27
    .line 28
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    array-length v2, v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    :goto_0
    check-cast v0, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    return-object v0
.end method
