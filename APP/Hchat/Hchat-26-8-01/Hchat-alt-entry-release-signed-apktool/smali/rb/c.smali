.class public final Lrb/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lrb/k;

.field public final c:Lia/t;

.field public final d:Landroid/content/SharedPreferences;

.field public volatile e:Ljava/lang/reflect/Constructor;

.field public volatile f:Ljava/lang/reflect/Method;

.field public volatile g:Ljava/lang/Object;

.field public volatile h:Z


# direct methods
.method public constructor <init>(Lr8/g;Lrb/k;Lia/t;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrb/c;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lrb/c;->b:Lrb/k;

    .line 10
    .line 11
    iput-object p3, p0, Lrb/c;->c:Lia/t;

    .line 12
    .line 13
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 14
    .line 15
    const-string p2, "Hchat_zombie_check_method_cache"

    .line 16
    .line 17
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lrb/c;->d:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    return-void
.end method

.method public static c(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v2, "onGYNetEnd"

    .line 21
    .line 22
    invoke-static {p0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    array-length p0, v0

    .line 41
    const/4 p1, 0x3

    .line 42
    if-ne p0, p1, :cond_0

    .line 43
    .line 44
    aget-object p0, v0, v1

    .line 45
    .line 46
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    const/4 p0, 0x1

    .line 55
    aget-object p1, v0, p0

    .line 56
    .line 57
    const-class v2, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    const/4 p1, 0x2

    .line 66
    aget-object p1, v0, p1

    .line 67
    .line 68
    const-class v0, Lorg/json/JSONObject;

    .line 69
    .line 70
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    return p0

    .line 77
    :cond_0
    return v1
.end method

.method public static d(Ljava/lang/reflect/Method;)Z
    .locals 6

    .line 1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    array-length v2, v0

    .line 26
    const/4 v3, 0x2

    .line 27
    const-class v4, Ljava/lang/String;

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    if-ne v2, v3, :cond_1

    .line 31
    .line 32
    aget-object v2, v0, v1

    .line 33
    .line 34
    invoke-static {v2, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    aget-object v2, v0, v5

    .line 41
    .line 42
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    array-length v2, v0

    .line 52
    if-ne v2, v5, :cond_6

    .line 53
    .line 54
    aget-object v0, v0, v1

    .line 55
    .line 56
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    array-length v0, v0

    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    move v0, v5

    .line 107
    goto :goto_0

    .line 108
    :cond_5
    move v0, v1

    .line 109
    :goto_0
    if-eqz v0, :cond_4

    .line 110
    .line 111
    :goto_1
    return v5

    .line 112
    :cond_6
    :goto_2
    return v1
.end method

.method public static e(Ljava/lang/reflect/Constructor;)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/16 v2, 0x1e

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/16 v4, 0x1d

    .line 10
    .line 11
    if-eq v1, v4, :cond_0

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    aget-object v1, v0, v3

    .line 18
    .line 19
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-static {v1, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    const/16 v1, 0x15

    .line 29
    .line 30
    new-array v5, v1, [I

    .line 31
    .line 32
    fill-array-data v5, :array_0

    .line 33
    .line 34
    .line 35
    move v6, v3

    .line 36
    :goto_0
    if-ge v6, v1, :cond_3

    .line 37
    .line 38
    aget v7, v5, v6

    .line 39
    .line 40
    aget-object v7, v0, v7

    .line 41
    .line 42
    const-class v8, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-nez v7, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/4 v1, 0x6

    .line 55
    new-array v5, v1, [I

    .line 56
    .line 57
    fill-array-data v5, :array_1

    .line 58
    .line 59
    .line 60
    move v6, v3

    .line 61
    :goto_1
    if-ge v6, v1, :cond_5

    .line 62
    .line 63
    aget v7, v5, v6

    .line 64
    .line 65
    aget-object v7, v0, v7

    .line 66
    .line 67
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-nez v7, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    const/16 v1, 0x13

    .line 80
    .line 81
    aget-object v1, v0, v1

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v5, "com.tencent.mm.autogen.events.F2fDynamicStartPayEvent"

    .line 88
    .line 89
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    array-length v1, v0

    .line 97
    if-ne v1, v2, :cond_7

    .line 98
    .line 99
    aget-object v0, v0, v4

    .line 100
    .line 101
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_7

    .line 108
    .line 109
    :goto_2
    return v3

    .line 110
    :cond_7
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    const-string v0, "com.tencent.mm.plugin.remittance.model."

    .line 119
    .line 120
    invoke-static {p0, v0, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    return p0

    .line 125
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x6
        0x8
        0x9
        0xa
        0xb
        0xc
        0xe
        0xf
        0x10
        0x11
        0x12
        0x14
        0x15
        0x16
        0x17
        0x19
        0x1b
        0x1c
    .end array-data

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    :array_1
    .array-data 4
        0x4
        0x5
        0x7
        0xd
        0x18
        0x1a
    .end array-data
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Lrb/c;->e:Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_11

    .line 13
    .line 14
    invoke-static {v2}, Lrb/c;->e(Ljava/lang/reflect/Constructor;)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    goto/16 :goto_9

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    array-length v5, v4

    .line 27
    new-array v6, v5, [Ljava/lang/Object;

    .line 28
    .line 29
    move v7, v0

    .line 30
    :goto_0
    if-ge v7, v5, :cond_10

    .line 31
    .line 32
    aget-object v8, v4, v7

    .line 33
    .line 34
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-nez v9, :cond_f

    .line 44
    .line 45
    const-class v9, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-eqz v9, :cond_1

    .line 52
    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_1
    sget-object v9, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-nez v9, :cond_e

    .line 62
    .line 63
    const-class v9, Ljava/lang/Byte;

    .line 64
    .line 65
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-eqz v9, :cond_2

    .line 70
    .line 71
    goto/16 :goto_6

    .line 72
    .line 73
    :cond_2
    sget-object v9, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-nez v9, :cond_d

    .line 80
    .line 81
    const-class v9, Ljava/lang/Short;

    .line 82
    .line 83
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-eqz v9, :cond_3

    .line 88
    .line 89
    goto/16 :goto_5

    .line 90
    .line 91
    :cond_3
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 92
    .line 93
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-nez v9, :cond_c

    .line 98
    .line 99
    const-class v9, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-eqz v9, :cond_4

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-nez v9, :cond_b

    .line 115
    .line 116
    const-class v9, Ljava/lang/Long;

    .line 117
    .line 118
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_5

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 126
    .line 127
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-nez v9, :cond_a

    .line 132
    .line 133
    const-class v9, Ljava/lang/Float;

    .line 134
    .line 135
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-eqz v9, :cond_6

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 143
    .line 144
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-nez v9, :cond_9

    .line 149
    .line 150
    const-class v9, Ljava/lang/Double;

    .line 151
    .line 152
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    if-eqz v9, :cond_7

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_7
    const-class v9, Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-eqz v8, :cond_8

    .line 166
    .line 167
    const-string v8, ""

    .line 168
    .line 169
    goto :goto_8

    .line 170
    :cond_8
    move-object v8, v3

    .line 171
    goto :goto_8

    .line 172
    :cond_9
    :goto_1
    const-wide/16 v8, 0x0

    .line 173
    .line 174
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    goto :goto_8

    .line 179
    :cond_a
    :goto_2
    const/4 v8, 0x0

    .line 180
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    goto :goto_8

    .line 185
    :cond_b
    :goto_3
    const-wide/16 v8, 0x0

    .line 186
    .line 187
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    goto :goto_8

    .line 192
    :cond_c
    :goto_4
    move-object v8, v1

    .line 193
    goto :goto_8

    .line 194
    :cond_d
    :goto_5
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    goto :goto_8

    .line 199
    :cond_e
    :goto_6
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    goto :goto_8

    .line 204
    :cond_f
    :goto_7
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 205
    .line 206
    :goto_8
    aput-object v8, v6, v7

    .line 207
    .line 208
    add-int/lit8 v7, v7, 0x1

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_10
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 213
    .line 214
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    aput-object v4, v6, v0

    .line 219
    .line 220
    const-string v0, "1"

    .line 221
    .line 222
    const/4 v4, 0x1

    .line 223
    aput-object v0, v6, v4

    .line 224
    .line 225
    const/4 v0, 0x2

    .line 226
    aput-object p1, v6, v0

    .line 227
    .line 228
    const/16 p1, 0x1f

    .line 229
    .line 230
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    const/4 v4, 0x4

    .line 235
    aput-object p1, v6, v4

    .line 236
    .line 237
    const/4 p1, 0x5

    .line 238
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    aput-object v0, v6, p1

    .line 243
    .line 244
    const/16 p1, 0xb

    .line 245
    .line 246
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    const/16 v0, 0xd

    .line 251
    .line 252
    aput-object p1, v6, v0

    .line 253
    .line 254
    const/16 p1, 0x18

    .line 255
    .line 256
    aput-object v1, v6, p1

    .line 257
    .line 258
    const/16 p1, 0x1a

    .line 259
    .line 260
    aput-object v1, v6, p1

    .line 261
    .line 262
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    if-eqz p1, :cond_11

    .line 271
    .line 272
    const-string v0, "RemittanceProcess"

    .line 273
    .line 274
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    const-string v1, "setProcessName"

    .line 279
    .line 280
    invoke-static {p1, v1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    return-object p1

    .line 284
    :cond_11
    :goto_9
    return-object v3
.end method

.method public final b(Ljava/lang/String;Z)Z
    .locals 5

    .line 1
    const-string v0, "\u5220\u9664\u597d\u53cb\u670d\u52a1\u5b9e\u4f8b\u83b7\u53d6\u5931\u8d25: "

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lrb/c;->f:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lrb/c;->g()Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_9

    .line 17
    .line 18
    :goto_0
    :try_start_0
    invoke-virtual {p0, v1}, Lrb/c;->i(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v3, :cond_7

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    array-length v0, v0

    .line 29
    const/4 v4, 0x2

    .line 30
    if-ne v0, v4, :cond_6

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    move v2, v0

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_5

    .line 42
    .line 43
    invoke-virtual {p2}, Lk8/s;->h()Z

    .line 44
    .line 45
    .line 46
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    :try_start_1
    invoke-virtual {p2, p1}, Lk8/s;->b(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    if-nez p2, :cond_3

    .line 55
    .line 56
    move v2, v0

    .line 57
    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p2

    .line 63
    :try_start_2
    new-instance v0, Lsf/f;

    .line 64
    .line 65
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    move-object p2, v0

    .line 69
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 70
    .line 71
    instance-of v2, p2, Lsf/f;

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    move-object p2, v0

    .line 76
    :cond_4
    check-cast p2, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    :cond_5
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    goto :goto_3

    .line 91
    :catchall_1
    move-exception p2

    .line 92
    goto :goto_4

    .line 93
    :cond_6
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    :goto_3
    array-length v0, p2

    .line 98
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-static {v1, v3, p2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_7
    iget-object p2, p0, Lrb/c;->c:Lia/t;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    new-instance v3, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const/4 v1, 0x0

    .line 127
    invoke-virtual {p2, v0, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 128
    .line 129
    .line 130
    return v2

    .line 131
    :goto_4
    new-instance v0, Lsf/f;

    .line 132
    .line 133
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object p2, v0

    .line 137
    :goto_5
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-nez v0, :cond_8

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_8
    iget-object p2, p0, Lrb/c;->c:Lia/t;

    .line 145
    .line 146
    const-string v1, "\u5220\u9664\u5f02\u5e38\u597d\u53cb\u5931\u8d25: "

    .line 147
    .line 148
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p2, p1, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 156
    .line 157
    :goto_6
    check-cast p2, Ljava/lang/Boolean;

    .line 158
    .line 159
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    return p1

    .line 164
    :cond_9
    return v2
.end method

.method public final f(Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Method;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lrb/c;->j()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lrb/c;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lrb/c;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "probe_callback_v1"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v5, v1}, Lrb/c;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v1, v4

    .line 35
    :goto_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const/4 v5, 0x0

    .line 51
    move-object v6, v4

    .line 52
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    move-object v8, v7

    .line 63
    check-cast v8, Ljava/lang/reflect/Method;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v9, v8}, Lrb/c;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_2

    .line 77
    .line 78
    if-eqz v5, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    const/4 v5, 0x1

    .line 82
    move-object v6, v7

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    if-nez v5, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    move-object v4, v6

    .line 88
    :goto_2
    check-cast v4, Ljava/lang/reflect/Method;

    .line 89
    .line 90
    if-eqz v4, :cond_6

    .line 91
    .line 92
    invoke-static {v2, v0, v3, v4}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 93
    .line 94
    .line 95
    return-object v4

    .line 96
    :cond_6
    const-string p1, "cache.key"

    .line 97
    .line 98
    :try_start_0
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const-string v5, ""

    .line 103
    .line 104
    invoke-interface {v2, p1, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_7

    .line 113
    .line 114
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 119
    .line 120
    .line 121
    :cond_7
    invoke-interface {v1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    .line 127
    .line 128
    :catchall_0
    return-object v4
.end method

.method public final g()Ljava/lang/reflect/Method;
    .locals 9

    .line 1
    const-string v0, "MicroMsg.DeleteContactService"

    .line 2
    .line 3
    invoke-virtual {p0}, Lrb/c;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lrb/c;->d:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iget-object v3, p0, Lrb/c;->a:Lr8/g;

    .line 10
    .line 11
    iget-object v3, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    const-string v4, "delete_contact_method_v2"

    .line 14
    .line 15
    invoke-static {v2, v1, v3, v4}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-static {v2}, Lrb/c;->d(Ljava/lang/reflect/Method;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v2, v3

    .line 30
    :goto_0
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iput-object v2, p0, Lrb/c;->f:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_1
    :try_start_0
    iget-object v2, p0, Lrb/c;->a:Lr8/g;

    .line 36
    .line 37
    iget-object v2, v2, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 38
    .line 39
    new-instance v5, Lch/e;

    .line 40
    .line 41
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v6, Lfh/k;

    .line 45
    .line 46
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v7, "delete contact %s isClearRecord:%s"

    .line 50
    .line 51
    filled-new-array {v0, v7}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v6, v7}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object v6, v5, Lch/e;->h:Lfh/k;

    .line 59
    .line 60
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-instance v5, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_4

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    check-cast v6, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 84
    .line 85
    :try_start_1
    iget-object v7, p0, Lrb/c;->a:Lr8/g;

    .line 86
    .line 87
    iget-object v7, v7, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 88
    .line 89
    invoke-virtual {v6, v7}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    goto :goto_2

    .line 94
    :catchall_0
    move-exception v6

    .line 95
    :try_start_2
    new-instance v7, Lsf/f;

    .line 96
    .line 97
    invoke-direct {v7, v6}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    move-object v6, v7

    .line 101
    :goto_2
    nop

    .line 102
    instance-of v7, v6, Lsf/f;

    .line 103
    .line 104
    if-eqz v7, :cond_3

    .line 105
    .line 106
    move-object v6, v3

    .line 107
    :cond_3
    check-cast v6, Ljava/lang/reflect/Method;

    .line 108
    .line 109
    if-eqz v6, :cond_2

    .line 110
    .line 111
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    goto/16 :goto_9

    .line 117
    .line 118
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_6

    .line 132
    .line 133
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    move-object v7, v6

    .line 138
    check-cast v7, Ljava/lang/reflect/Method;

    .line 139
    .line 140
    invoke-static {v7}, Lrb/c;->d(Ljava/lang/reflect/Method;)Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_5

    .line 145
    .line 146
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    new-instance v5, Ljava/util/HashSet;

    .line 151
    .line 152
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 153
    .line 154
    .line 155
    new-instance v6, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    :cond_7
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-eqz v7, :cond_8

    .line 169
    .line 170
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    move-object v8, v7

    .line 175
    check-cast v8, Ljava/lang/reflect/Method;

    .line 176
    .line 177
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-eqz v8, :cond_7

    .line 186
    .line 187
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-nez v2, :cond_9

    .line 196
    .line 197
    goto/16 :goto_a

    .line 198
    .line 199
    :cond_9
    iget-object v2, p0, Lrb/c;->a:Lr8/g;

    .line 200
    .line 201
    iget-object v2, v2, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 202
    .line 203
    new-instance v5, Lch/e;

    .line 204
    .line 205
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 206
    .line 207
    .line 208
    new-instance v6, Lfh/k;

    .line 209
    .line 210
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 211
    .line 212
    .line 213
    const-string v7, "delete contact %s"

    .line 214
    .line 215
    filled-new-array {v0, v7}, [Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v6, v0}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    iput-object v6, v5, Lch/e;->h:Lfh/k;

    .line 223
    .line 224
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    new-instance v2, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    :cond_a
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-eqz v5, :cond_c

    .line 242
    .line 243
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    check-cast v5, Lhh/o;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 248
    .line 249
    :try_start_3
    iget-object v6, p0, Lrb/c;->a:Lr8/g;

    .line 250
    .line 251
    iget-object v6, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 252
    .line 253
    invoke-virtual {v5, v6}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 254
    .line 255
    .line 256
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 257
    goto :goto_6

    .line 258
    :catchall_2
    move-exception v5

    .line 259
    :try_start_4
    new-instance v6, Lsf/f;

    .line 260
    .line 261
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    move-object v5, v6

    .line 265
    :goto_6
    nop

    .line 266
    instance-of v6, v5, Lsf/f;

    .line 267
    .line 268
    if-eqz v6, :cond_b

    .line 269
    .line 270
    move-object v5, v3

    .line 271
    :cond_b
    check-cast v5, Ljava/lang/reflect/Method;

    .line 272
    .line 273
    if-eqz v5, :cond_a

    .line 274
    .line 275
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    :cond_d
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    if-eqz v5, :cond_e

    .line 293
    .line 294
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    move-object v6, v5

    .line 299
    check-cast v6, Ljava/lang/reflect/Method;

    .line 300
    .line 301
    invoke-static {v6}, Lrb/c;->d(Ljava/lang/reflect/Method;)Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-eqz v6, :cond_d

    .line 306
    .line 307
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_e
    new-instance v2, Ljava/util/HashSet;

    .line 312
    .line 313
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 314
    .line 315
    .line 316
    new-instance v6, Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    :cond_f
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    if-eqz v5, :cond_10

    .line 330
    .line 331
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    move-object v7, v5

    .line 336
    check-cast v7, Ljava/lang/reflect/Method;

    .line 337
    .line 338
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    invoke-virtual {v2, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    if-eqz v7, :cond_f

    .line 347
    .line 348
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 349
    .line 350
    .line 351
    goto :goto_8

    .line 352
    :goto_9
    new-instance v6, Lsf/f;

    .line 353
    .line 354
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 355
    .line 356
    .line 357
    :cond_10
    :goto_a
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    if-nez v0, :cond_11

    .line 362
    .line 363
    goto :goto_b

    .line 364
    :cond_11
    iget-object v2, p0, Lrb/c;->c:Lia/t;

    .line 365
    .line 366
    const-string v5, "\u5b9a\u4f4d\u5220\u9664\u597d\u53cb\u65b9\u6cd5\u5931\u8d25"

    .line 367
    .line 368
    invoke-virtual {v2, v5, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 372
    .line 373
    :goto_b
    check-cast v6, Ljava/util/List;

    .line 374
    .line 375
    invoke-static {v6}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, Ljava/lang/reflect/Method;

    .line 380
    .line 381
    iget-object v2, p0, Lrb/c;->d:Landroid/content/SharedPreferences;

    .line 382
    .line 383
    if-eqz v0, :cond_12

    .line 384
    .line 385
    invoke-static {v2, v1, v4, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 386
    .line 387
    .line 388
    iput-object v0, p0, Lrb/c;->f:Ljava/lang/reflect/Method;

    .line 389
    .line 390
    goto :goto_c

    .line 391
    :cond_12
    const-string v5, "cache.key"

    .line 392
    .line 393
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    :try_start_5
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    const-string v8, ""

    .line 401
    .line 402
    invoke-interface {v2, v5, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    invoke-static {v2, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    if-nez v2, :cond_13

    .line 411
    .line 412
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-interface {v2, v5, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 417
    .line 418
    .line 419
    :cond_13
    invoke-interface {v7, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 424
    .line 425
    .line 426
    :catchall_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    const/4 v2, 0x1

    .line 431
    if-le v1, v2, :cond_14

    .line 432
    .line 433
    iget-object v1, p0, Lrb/c;->c:Lia/t;

    .line 434
    .line 435
    const-string v2, "\u5220\u9664\u597d\u53cb\u65b9\u6cd5\u5019\u9009\u4e0d\u552f\u4e00"

    .line 436
    .line 437
    invoke-virtual {v1, v2, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    :cond_14
    :goto_c
    return-object v0
.end method

.method public final h()Ljava/lang/reflect/Constructor;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lrb/c;->j()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lrb/c;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v2, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v3, p0, Lrb/c;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v4, "probe_constructor_v1"

    .line 12
    .line 13
    invoke-static {v3, v0, v2, v4}, Le8/b;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-static {v2}, Lrb/c;->e(Ljava/lang/reflect/Constructor;)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v2, v5

    .line 28
    :goto_0
    if-eqz v2, :cond_1

    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_1
    :try_start_0
    iget-object v2, v1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 32
    .line 33
    new-instance v6, Lch/e;

    .line 34
    .line 35
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v7, Lfh/k;

    .line 39
    .line 40
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v8, "Micromsg.NetSceneTenpayRemittanceGen"

    .line 44
    .line 45
    const-string v9, "receiver_openid"

    .line 46
    .line 47
    const-string v10, "placeorder_attach"

    .line 48
    .line 49
    filled-new-array {v8, v9, v10}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-virtual {v7, v8}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object v7, v6, Lch/e;->h:Lfh/k;

    .line 57
    .line 58
    invoke-virtual {v2, v6}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v6, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_5

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    check-cast v7, Lhh/o;

    .line 82
    .line 83
    invoke-virtual {v7}, Lhh/o;->t()Z

    .line 84
    .line 85
    .line 86
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 87
    if-nez v8, :cond_3

    .line 88
    .line 89
    move-object v7, v5

    .line 90
    goto :goto_3

    .line 91
    :cond_3
    :try_start_1
    iget-object v8, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7}, Lhh/o;->p()Llh/d;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v7, v8}, Llh/d;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    .line 101
    .line 102
    .line 103
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    goto :goto_2

    .line 105
    :catchall_0
    move-exception v7

    .line 106
    :try_start_2
    new-instance v8, Lsf/f;

    .line 107
    .line 108
    invoke-direct {v8, v7}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    move-object v7, v8

    .line 112
    :goto_2
    nop

    .line 113
    instance-of v8, v7, Lsf/f;

    .line 114
    .line 115
    if-eqz v8, :cond_4

    .line 116
    .line 117
    move-object v7, v5

    .line 118
    :cond_4
    check-cast v7, Ljava/lang/reflect/Constructor;

    .line 119
    .line 120
    :goto_3
    if-eqz v7, :cond_2

    .line 121
    .line 122
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :catchall_1
    move-exception v1

    .line 127
    goto :goto_6

    .line 128
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :cond_6
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_7

    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    move-object v7, v6

    .line 148
    check-cast v7, Ljava/lang/reflect/Constructor;

    .line 149
    .line 150
    invoke-static {v7}, Lrb/c;->e(Ljava/lang/reflect/Constructor;)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_6

    .line 155
    .line 156
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_7
    new-instance v2, Ljava/util/HashSet;

    .line 161
    .line 162
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 163
    .line 164
    .line 165
    new-instance v6, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    :cond_8
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_9

    .line 179
    .line 180
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    move-object v8, v7

    .line 185
    check-cast v8, Ljava/lang/reflect/Constructor;

    .line 186
    .line 187
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-eqz v8, :cond_8

    .line 196
    .line 197
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :goto_6
    new-instance v6, Lsf/f;

    .line 202
    .line 203
    invoke-direct {v6, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    :cond_9
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    iget-object v2, p0, Lrb/c;->c:Lia/t;

    .line 211
    .line 212
    if-nez v1, :cond_a

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_a
    const-string v6, "\u5b9a\u4f4d\u8f6c\u8d26\u6838\u9a8c\u6784\u9020\u5668\u5931\u8d25"

    .line 216
    .line 217
    invoke-virtual {v2, v6, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 221
    .line 222
    :goto_7
    check-cast v6, Ljava/util/List;

    .line 223
    .line 224
    invoke-static {v6}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 229
    .line 230
    if-eqz v1, :cond_b

    .line 231
    .line 232
    invoke-static {v3, v0, v4, v1}, Le8/b;->i(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Constructor;)V

    .line 233
    .line 234
    .line 235
    goto :goto_8

    .line 236
    :cond_b
    const-string v7, "cache.key"

    .line 237
    .line 238
    :try_start_3
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    const-string v9, ""

    .line 243
    .line 244
    invoke-interface {v3, v7, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-static {v3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-nez v3, :cond_c

    .line 253
    .line 254
    invoke-interface {v8}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-interface {v3, v7, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 259
    .line 260
    .line 261
    :cond_c
    invoke-interface {v8, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 266
    .line 267
    .line 268
    :catchall_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    const/4 v3, 0x1

    .line 273
    if-le v0, v3, :cond_d

    .line 274
    .line 275
    const-string v0, "\u8f6c\u8d26\u6838\u9a8c\u6784\u9020\u5668\u5019\u9009\u4e0d\u552f\u4e00"

    .line 276
    .line 277
    invoke-virtual {v2, v0, v5}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    :cond_d
    :goto_8
    return-object v1
.end method

.method public final i(Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lrb/c;->g:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v1

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    iget-object v0, p0, Lrb/c;->a:Lr8/g;

    .line 25
    .line 26
    iget-object v0, v0, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 27
    .line 28
    iget-object v2, v0, Lh/Hchat/dexkit/DexFinder;->serviceGetterMethod:Ljava/lang/reflect/Method;

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->resolveServiceManagerApi()V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-static {v0, p1}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iput-object v0, p0, Lrb/c;->g:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_3
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->staticInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    move-object v0, v1

    .line 61
    :goto_1
    if-eqz v0, :cond_5

    .line 62
    .line 63
    iput-object v0, p0, Lrb/c;->g:Ljava/lang/Object;

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_5
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    const/4 v2, 0x0

    .line 79
    if-eqz v0, :cond_8

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object v3, v0

    .line 86
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    array-length v3, v3

    .line 96
    if-nez v3, :cond_7

    .line 97
    .line 98
    const/4 v3, 0x1

    .line 99
    goto :goto_2

    .line 100
    :cond_7
    move v3, v2

    .line 101
    :goto_2
    if-eqz v3, :cond_6

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_8
    move-object v0, v1

    .line 105
    :goto_3
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 106
    .line 107
    if-eqz v0, :cond_9

    .line 108
    .line 109
    new-array p1, v2, [Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :cond_9
    if-eqz v1, :cond_a

    .line 116
    .line 117
    iput-object v1, p0, Lrb/c;->g:Ljava/lang/Object;

    .line 118
    .line 119
    :cond_a
    return-object v1
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/c;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 15
    .line 16
    return-object v0
.end method
