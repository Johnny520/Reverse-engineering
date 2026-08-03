.class public Lj8/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lj8/f;->c:Ljava/lang/Object;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lj8/f;->d:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lj8/f;->a:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Li8/f;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lj8/f;->c:Ljava/lang/Object;

    .line 38
    iput-object p2, p0, Lj8/f;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbc/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lod/b;

    .line 5
    .line 6
    invoke-direct {v0}, Lod/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lj8/f;->c:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lj8/f;->d:Ljava/lang/Object;

    .line 24
    .line 25
    iget-boolean p1, p1, Lbc/g;->B:Z

    .line 26
    .line 27
    iput-boolean p1, p0, Lj8/f;->a:Z

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Ls/b0;Lv1/j1;Ls/a1;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 44
    iput-object p2, p0, Lj8/f;->c:Ljava/lang/Object;

    .line 45
    iput-object p3, p0, Lj8/f;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p0, Lj8/f;->a:Z

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;ILjava/util/Comparator;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 41
    iput-object p3, p0, Lj8/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public static B(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :try_start_0
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    const-class v2, Ljava/lang/String;

    .line 14
    .line 15
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v1, v2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    return-object p0

    .line 38
    :catchall_0
    :try_start_1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/reflect/Field;

    .line 57
    .line 58
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {p0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-static {v2, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    if-eqz v2, :cond_1

    .line 81
    .line 82
    return-object v2

    .line 83
    :catchall_1
    :cond_4
    :goto_1
    return-object v0
.end method

.method public static i([B)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_1

    .line 5
    .line 6
    :cond_0
    array-length v1, p0

    .line 7
    const/4 v2, 0x6

    .line 8
    const/4 v3, 0x1

    .line 9
    if-lt v1, v2, :cond_1

    .line 10
    .line 11
    new-instance v1, Ljava/lang/String;

    .line 12
    .line 13
    sget-object v4, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-direct {v1, p0, v0, v2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 16
    .line 17
    .line 18
    const-string v4, "GIF87a"

    .line 19
    .line 20
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_4

    .line 25
    .line 26
    const-string v4, "GIF89a"

    .line 27
    .line 28
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_1
    array-length v1, p0

    .line 37
    const/16 v4, 0x50

    .line 38
    .line 39
    const/16 v5, 0x8

    .line 40
    .line 41
    const/16 v6, 0xa

    .line 42
    .line 43
    const/4 v7, 0x3

    .line 44
    const/4 v8, 0x2

    .line 45
    const/16 v9, 0xff

    .line 46
    .line 47
    if-lt v1, v5, :cond_2

    .line 48
    .line 49
    aget-byte v1, p0, v0

    .line 50
    .line 51
    and-int/2addr v1, v9

    .line 52
    const/16 v10, 0x89

    .line 53
    .line 54
    if-ne v1, v10, :cond_2

    .line 55
    .line 56
    aget-byte v1, p0, v3

    .line 57
    .line 58
    if-ne v1, v4, :cond_2

    .line 59
    .line 60
    aget-byte v1, p0, v8

    .line 61
    .line 62
    const/16 v10, 0x4e

    .line 63
    .line 64
    if-ne v1, v10, :cond_2

    .line 65
    .line 66
    aget-byte v1, p0, v7

    .line 67
    .line 68
    const/16 v10, 0x47

    .line 69
    .line 70
    if-ne v1, v10, :cond_2

    .line 71
    .line 72
    const/4 v1, 0x4

    .line 73
    aget-byte v1, p0, v1

    .line 74
    .line 75
    const/16 v10, 0xd

    .line 76
    .line 77
    if-ne v1, v10, :cond_2

    .line 78
    .line 79
    const/4 v1, 0x5

    .line 80
    aget-byte v1, p0, v1

    .line 81
    .line 82
    if-ne v1, v6, :cond_2

    .line 83
    .line 84
    aget-byte v1, p0, v2

    .line 85
    .line 86
    const/16 v2, 0x1a

    .line 87
    .line 88
    if-ne v1, v2, :cond_2

    .line 89
    .line 90
    const/4 v1, 0x7

    .line 91
    aget-byte v1, p0, v1

    .line 92
    .line 93
    if-ne v1, v6, :cond_2

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    array-length v1, p0

    .line 97
    if-lt v1, v7, :cond_3

    .line 98
    .line 99
    aget-byte v1, p0, v0

    .line 100
    .line 101
    and-int/2addr v1, v9

    .line 102
    if-ne v1, v9, :cond_3

    .line 103
    .line 104
    aget-byte v1, p0, v3

    .line 105
    .line 106
    and-int/2addr v1, v9

    .line 107
    const/16 v2, 0xd8

    .line 108
    .line 109
    if-ne v1, v2, :cond_3

    .line 110
    .line 111
    aget-byte v1, p0, v8

    .line 112
    .line 113
    and-int/2addr v1, v9

    .line 114
    if-ne v1, v9, :cond_3

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    array-length v1, p0

    .line 118
    const/16 v2, 0xc

    .line 119
    .line 120
    if-lt v1, v2, :cond_5

    .line 121
    .line 122
    aget-byte v1, p0, v0

    .line 123
    .line 124
    const/16 v2, 0x52

    .line 125
    .line 126
    if-ne v1, v2, :cond_5

    .line 127
    .line 128
    aget-byte v1, p0, v3

    .line 129
    .line 130
    const/16 v2, 0x49

    .line 131
    .line 132
    if-ne v1, v2, :cond_5

    .line 133
    .line 134
    aget-byte v1, p0, v8

    .line 135
    .line 136
    const/16 v2, 0x46

    .line 137
    .line 138
    if-ne v1, v2, :cond_5

    .line 139
    .line 140
    aget-byte v1, p0, v7

    .line 141
    .line 142
    if-ne v1, v2, :cond_5

    .line 143
    .line 144
    aget-byte v1, p0, v5

    .line 145
    .line 146
    const/16 v2, 0x57

    .line 147
    .line 148
    if-ne v1, v2, :cond_5

    .line 149
    .line 150
    const/16 v1, 0x9

    .line 151
    .line 152
    aget-byte v1, p0, v1

    .line 153
    .line 154
    const/16 v2, 0x45

    .line 155
    .line 156
    if-ne v1, v2, :cond_5

    .line 157
    .line 158
    aget-byte v1, p0, v6

    .line 159
    .line 160
    const/16 v2, 0x42

    .line 161
    .line 162
    if-ne v1, v2, :cond_5

    .line 163
    .line 164
    const/16 v1, 0xb

    .line 165
    .line 166
    aget-byte p0, p0, v1

    .line 167
    .line 168
    if-ne p0, v4, :cond_5

    .line 169
    .line 170
    :cond_4
    :goto_0
    return v3

    .line 171
    :cond_5
    :goto_1
    return v0
.end method

.method public static k(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object p0, v0

    .line 11
    :goto_0
    if-eqz p0, :cond_6

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0x20

    .line 18
    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    const/4 v1, 0x0

    .line 23
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ge v1, v2, :cond_5

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/16 v3, 0x30

    .line 34
    .line 35
    if-lt v2, v3, :cond_2

    .line 36
    .line 37
    const/16 v3, 0x39

    .line 38
    .line 39
    if-le v2, v3, :cond_4

    .line 40
    .line 41
    :cond_2
    const/16 v3, 0x61

    .line 42
    .line 43
    if-lt v2, v3, :cond_3

    .line 44
    .line 45
    const/16 v3, 0x66

    .line 46
    .line 47
    if-le v2, v3, :cond_4

    .line 48
    .line 49
    :cond_3
    const/16 v3, 0x41

    .line 50
    .line 51
    if-lt v2, v3, :cond_6

    .line 52
    .line 53
    const/16 v3, 0x46

    .line 54
    .line 55
    if-gt v2, v3, :cond_6

    .line 56
    .line 57
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_5
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_6
    :goto_2
    return-object v0
.end method

.method public static s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-static {p0, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, ""

    .line 22
    .line 23
    return-object p0
.end method

.method public static z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    instance-of v0, p2, Ljava/lang/Number;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast p2, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    if-ne v0, v1, :cond_4

    .line 39
    .line 40
    instance-of v0, p2, Ljava/lang/Number;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    const-wide/16 v0, 0x0

    .line 52
    .line 53
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    goto :goto_1

    .line 58
    :cond_4
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    if-ne v0, v1, :cond_6

    .line 61
    .line 62
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    check-cast p2, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    const/4 v2, 0x1

    .line 75
    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    :cond_6
    :goto_1
    invoke-static {p1, p0, p2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0, v1}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    :try_start_0
    new-array v1, v0, [Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {p1, v1}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-array v0, v0, [Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    return-object p1

    .line 46
    :catchall_0
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 47
    return-object p1
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->emojiSendMethod:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public b([B)[B
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    if-eqz v0, :cond_6

    .line 3
    .line 4
    invoke-static {p1}, Lj8/f;->i([B)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    const-string v0, "\u5b9a\u4f4dWXAM\u8f6c\u6362\u65b9\u6cd5\u5931\u8d25: "

    .line 13
    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    iget-boolean v1, p0, Lj8/f;->a:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lj8/f;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    goto :goto_3

    .line 25
    :cond_1
    const/4 v1, 0x1

    .line 26
    :try_start_1
    iput-boolean v1, p0, Lj8/f;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 27
    .line 28
    :try_start_2
    iget-object v1, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lh/Hchat/dexkit/DexFinder;

    .line 31
    .line 32
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->emojiDecodeDataMethod:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const-class v1, Lj8/f;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_0
    const-string v2, "com.tencent.mm.plugin.gif.MMWXGFJNI"

    .line 54
    .line 55
    invoke-static {v2, v1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, "nativeWxamToGif"

    .line 60
    .line 61
    const-class v3, [B

    .line 62
    .line 63
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v1, v2, v3}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-class v3, [B

    .line 84
    .line 85
    if-ne v2, v3, :cond_3

    .line 86
    .line 87
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iput-object v1, p0, Lj8/f;->d:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :goto_1
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p0, v0}, Lj8/f;->j(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    :goto_2
    iget-object v0, p0, Lj8/f;->d:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Ljava/lang/reflect/Method;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 116
    .line 117
    monitor-exit p0

    .line 118
    :goto_3
    const/4 v1, 0x0

    .line 119
    if-nez v0, :cond_4

    .line 120
    .line 121
    return-object v1

    .line 122
    :cond_4
    :try_start_4
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {v0, v1, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    instance-of v0, p1, [B

    .line 131
    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    check-cast p1, [B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 135
    .line 136
    move-object v1, p1

    .line 137
    goto :goto_4

    .line 138
    :catchall_1
    move-exception p1

    .line 139
    goto :goto_5

    .line 140
    :cond_5
    :goto_4
    return-object v1

    .line 141
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v2, "\u8f6c\u6362WXAM\u8868\u60c5\u5931\u8d25: "

    .line 144
    .line 145
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :catchall_2
    move-exception p1

    .line 164
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 165
    throw p1

    .line 166
    :cond_6
    :goto_6
    return-object p1
.end method

.method public c(Ljava/lang/String;)[B
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

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
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lj8/f;->r(Ljava/io/File;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Lj8/f;->i([B)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    return-object v2

    .line 25
    :cond_1
    invoke-static {p1}, Lj8/f;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lj8/f;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    :cond_2
    :try_start_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_7

    .line 54
    .line 55
    invoke-virtual {p0, v3}, Lj8/f;->g(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v3, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lh/Hchat/dexkit/DexFinder;

    .line 62
    .line 63
    iget-object v4, v3, Lh/Hchat/dexkit/DexFinder;->emojiDecodeDataMethod:Ljava/lang/reflect/Method;

    .line 64
    .line 65
    iget-object v3, v3, Lh/Hchat/dexkit/DexFinder;->emojiDecodeManagerGetterMethod:Ljava/lang/reflect/Method;

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    if-eqz v4, :cond_4

    .line 70
    .line 71
    if-nez v3, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/4 v5, 0x0

    .line 75
    new-array v5, v5, [Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v3, v1, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-nez v3, :cond_5

    .line 82
    .line 83
    :cond_4
    :goto_0
    move-object v0, v1

    .line 84
    goto :goto_1

    .line 85
    :cond_5
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v4, v3, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    instance-of v3, v0, [B

    .line 94
    .line 95
    if-eqz v3, :cond_4

    .line 96
    .line 97
    check-cast v0, [B

    .line 98
    .line 99
    :goto_1
    if-eqz v0, :cond_7

    .line 100
    .line 101
    array-length v3, v0

    .line 102
    if-lez v3, :cond_7

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Lj8/f;->b([B)[B

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_6

    .line 109
    .line 110
    array-length v1, p1

    .line 111
    if-lez v1, :cond_6

    .line 112
    .line 113
    return-object p1

    .line 114
    :catchall_0
    move-exception p1

    .line 115
    goto :goto_2

    .line 116
    :cond_6
    return-object v0

    .line 117
    :cond_7
    invoke-virtual {p0, p1}, Lj8/f;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    new-instance v0, Ljava/io/File;

    .line 122
    .line 123
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lj8/f;->r(Ljava/io/File;)[B

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-eqz p1, :cond_9

    .line 131
    .line 132
    array-length v0, p1

    .line 133
    if-lez v0, :cond_9

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Lj8/f;->b([B)[B

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    array-length v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    if-lez v1, :cond_8

    .line 143
    .line 144
    return-object v0

    .line 145
    :cond_8
    return-object p1

    .line 146
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v3, "\u89e3\u7801\u8868\u60c5\u6570\u636e\u5931\u8d25: "

    .line 149
    .line 150
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_9
    if-eqz v2, :cond_a

    .line 168
    .line 169
    array-length p1, v2

    .line 170
    if-lez p1, :cond_a

    .line 171
    .line 172
    move-object v1, v2

    .line 173
    :cond_a
    return-object v1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->emojiFilePathMethod:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {v0, v1, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    instance-of p2, p1, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    check-cast p1, Ljava/lang/String;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    const-string p1, ""

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    invoke-static {p1, p3}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public e(Ljava/io/File;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "MD5"

    .line 3
    .line 4
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    new-instance v2, Ljava/io/FileInputStream;

    .line 9
    .line 10
    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 11
    .line 12
    .line 13
    const/16 p1, 0x2000

    .line 14
    .line 15
    :try_start_1
    new-array p1, p1, [B

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v2, p1}, Ljava/io/FileInputStream;->read([B)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v3, 0x0

    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, p1, v3, v0}, Ljava/security/MessageDigest;->update([BII)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    move-object v0, v2

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    array-length v1, p1

    .line 38
    mul-int/lit8 v1, v1, 0x2

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 41
    .line 42
    .line 43
    array-length v1, p1

    .line 44
    :goto_1
    if-ge v3, v1, :cond_2

    .line 45
    .line 46
    aget-byte v4, p1, v3

    .line 47
    .line 48
    and-int/lit16 v4, v4, 0xff

    .line 49
    .line 50
    const/16 v5, 0x10

    .line 51
    .line 52
    if-ge v4, v5, :cond_1

    .line 53
    .line 54
    const/16 v5, 0x30

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    .line 76
    :catchall_1
    return-object p1

    .line 77
    :catchall_2
    move-exception p1

    .line 78
    :goto_2
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v2, "\u8ba1\u7b97\u8868\u60c5md5\u5931\u8d25: "

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string p1, ""
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 107
    .line 108
    .line 109
    :catchall_3
    :cond_3
    return-object p1

    .line 110
    :catchall_4
    move-exception p1

    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 114
    .line 115
    .line 116
    :catchall_5
    :cond_4
    throw p1
.end method

.method public f(Lud/e;Ljava/lang/Object;Z)Lud/l;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lj8/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lod/b;

    .line 8
    .line 9
    iget-boolean v3, v0, Lj8/f;->a:Z

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    goto/16 :goto_5

    .line 15
    .line 16
    :cond_0
    move-object/from16 v3, p1

    .line 17
    .line 18
    iget-object v5, v3, Lud/e;->k:Lud/u;

    .line 19
    .line 20
    instance-of v6, v1, Ljava/lang/Integer;

    .line 21
    .line 22
    const/4 v7, 0x1

    .line 23
    const/4 v8, 0x0

    .line 24
    if-eqz v6, :cond_8

    .line 25
    .line 26
    move-object v6, v1

    .line 27
    check-cast v6, Ljava/lang/Integer;

    .line 28
    .line 29
    iget-object v9, v0, Lj8/f;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v9, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v9, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    check-cast v9, Ljava/lang/String;

    .line 38
    .line 39
    if-nez v9, :cond_2

    .line 40
    .line 41
    :cond_1
    :goto_0
    move-object v9, v4

    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    :cond_2
    iget-object v10, v5, Lud/u;->t:Lud/e;

    .line 45
    .line 46
    if-nez v10, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    const-string v11, "/"

    .line 50
    .line 51
    const/4 v12, 0x2

    .line 52
    invoke-virtual {v9, v11, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    array-length v13, v11

    .line 57
    if-eq v13, v12, :cond_4

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    aget-object v12, v11, v8

    .line 61
    .line 62
    aget-object v11, v11, v7

    .line 63
    .line 64
    iget-object v13, v10, Lud/e;->v:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    :cond_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v14

    .line 74
    if-eqz v14, :cond_7

    .line 75
    .line 76
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v14

    .line 80
    check-cast v14, Lud/e;

    .line 81
    .line 82
    iget-object v15, v14, Lud/e;->m:Lod/a;

    .line 83
    .line 84
    iget-object v15, v15, Lod/a;->h:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v15

    .line 90
    if-eqz v15, :cond_5

    .line 91
    .line 92
    iget-object v6, v14, Lud/e;->u:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_1

    .line 103
    .line 104
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    check-cast v9, Lud/g;

    .line 109
    .line 110
    iget-object v10, v9, Lud/g;->l:Lod/c;

    .line 111
    .line 112
    iget-object v10, v10, Lod/c;->h:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_6

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_7
    const/16 v11, 0x2f

    .line 122
    .line 123
    const/16 v12, 0x2e

    .line 124
    .line 125
    invoke-virtual {v9, v11, v12}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    new-instance v11, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v12, "Not found resource field with id: "

    .line 132
    .line 133
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v6, ", name: "

    .line 140
    .line 141
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-virtual {v10, v6}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :goto_1
    if-eqz v9, :cond_8

    .line 156
    .line 157
    return-object v9

    .line 158
    :cond_8
    iget-object v6, v2, Lod/b;->b:Ljava/util/HashSet;

    .line 159
    .line 160
    iget-object v2, v2, Lod/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 161
    .line 162
    invoke-virtual {v6, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-nez v6, :cond_a

    .line 167
    .line 168
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_9

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_9
    move v7, v8

    .line 176
    :cond_a
    :goto_2
    if-eqz v7, :cond_b

    .line 177
    .line 178
    if-nez p3, :cond_b

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_b
    :goto_3
    if-eqz v3, :cond_f

    .line 182
    .line 183
    iget-object v6, v0, Lj8/f;->c:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v6, Ljava/util/HashMap;

    .line 186
    .line 187
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Lod/b;

    .line 192
    .line 193
    if-eqz v6, :cond_d

    .line 194
    .line 195
    iget-object v6, v6, Lod/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 196
    .line 197
    invoke-virtual {v6, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    check-cast v6, Lud/l;

    .line 202
    .line 203
    if-eqz v6, :cond_d

    .line 204
    .line 205
    if-eqz v7, :cond_c

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_c
    return-object v6

    .line 209
    :cond_d
    iget-object v3, v3, Lud/e;->m:Lod/a;

    .line 210
    .line 211
    iget-object v3, v3, Lod/a;->k:Lod/a;

    .line 212
    .line 213
    if-nez v3, :cond_e

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_e
    invoke-virtual {v5, v3}, Lud/u;->f(Lod/a;)Lud/e;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    goto :goto_3

    .line 221
    :cond_f
    :goto_4
    if-eqz p3, :cond_10

    .line 222
    .line 223
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, Lud/l;

    .line 228
    .line 229
    return-object v1

    .line 230
    :cond_10
    :goto_5
    return-object v4
.end method

.method public g(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->emojiGetByMd5Method:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lj8/f;->q(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0, v0}, Lj8/f;->A(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lj8/f;->q(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v0, v1, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    invoke-virtual {p0, p1}, Lj8/f;->q(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method public h(Ljava/lang/String;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->emojiCheckGifMethod:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0, v0}, Lj8/f;->A(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    :cond_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0, v1, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    return p1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, "\u68c0\u6d4bGIF\u5931\u8d25: "

    .line 44
    .line 45
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0, v0}, Lj8/f;->j(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x0

    .line 67
    const/4 v2, 0x0

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v3, "key_path"

    .line 77
    .line 78
    invoke-virtual {v0, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v3, "checkGifFile"

    .line 82
    .line 83
    invoke-virtual {p0, v3, v0}, Lj8/f;->p(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    const-string v2, "key_data"

    .line 90
    .line 91
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :cond_3
    :goto_0
    if-eqz v2, :cond_4

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    return p1

    .line 106
    :cond_4
    if-eqz p1, :cond_5

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v0, ".gif"

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_5

    .line 119
    .line 120
    const/4 v1, 0x1

    .line 121
    :cond_5
    return v1
.end method

.method public j(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[WeChatEmojiApi] "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public l()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->emojiAccPathMethod:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lj8/f;->o()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0, v0}, Lj8/f;->A(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lj8/f;->o()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :cond_1
    const/4 v2, 0x0

    .line 32
    new-array v2, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    instance-of v1, v0, Ljava/lang/String;

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Lj8/f;->o()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :cond_2
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0}, Lj8/f;->o()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :cond_3
    const-string v1, "/"

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0
.end method

.method public m(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Ljava/lang/Object;

    .line 4
    .line 5
    aget-object v1, v0, p1

    .line 6
    .line 7
    aget-object v2, v0, p2

    .line 8
    .line 9
    aput-object v2, v0, p1

    .line 10
    .line 11
    aput-object v1, v0, p2

    .line 12
    .line 13
    return-void
.end method

.method public n(Ljava/io/File;Ljava/lang/String;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v0, v1, Lj8/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v3, v0

    .line 8
    check-cast v3, Lh/Hchat/dexkit/DexFinder;

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    invoke-virtual {v1}, Lj8/f;->l()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    const/4 v9, 0x0

    .line 29
    if-eqz v8, :cond_0

    .line 30
    .line 31
    const-string v0, "\u53d1\u8868\u60c5\u5931\u8d25: \u83b7\u53d6\u5fae\u4fe1\u8868\u60c5\u76ee\u5f55\u5931\u8d25"

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lj8/f;->j(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v9

    .line 37
    :cond_0
    const-string v8, ""

    .line 38
    .line 39
    invoke-virtual {v1, v7, v8, v2}, Lj8/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    if-eqz v11, :cond_1

    .line 48
    .line 49
    const-string v0, "\u53d1\u8868\u60c5\u5931\u8d25: \u83b7\u53d6\u5fae\u4fe1\u8868\u60c5\u76ee\u6807\u8def\u5f84\u5931\u8d25"

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Lj8/f;->j(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v9

    .line 55
    :cond_1
    new-instance v11, Ljava/io/File;

    .line 56
    .line 57
    invoke-direct {v11, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :try_start_0
    invoke-virtual {v11}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 61
    .line 62
    .line 63
    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    .line 64
    if-eqz v12, :cond_2

    .line 65
    .line 66
    :try_start_1
    invoke-virtual {v12}, Ljava/io/File;->isDirectory()Z

    .line 67
    .line 68
    .line 69
    move-result v13

    .line 70
    if-nez v13, :cond_2

    .line 71
    .line 72
    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z

    .line 73
    .line 74
    .line 75
    move-result v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    if-nez v12, :cond_2

    .line 77
    .line 78
    move-object/from16 v17, v9

    .line 79
    .line 80
    goto/16 :goto_e

    .line 81
    .line 82
    :catchall_0
    move-exception v0

    .line 83
    move-object v12, v9

    .line 84
    move-object v14, v12

    .line 85
    move-object/from16 v17, v14

    .line 86
    .line 87
    goto/16 :goto_d

    .line 88
    .line 89
    :cond_2
    :try_start_2
    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    .line 90
    .line 91
    .line 92
    move-result v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_b

    .line 93
    if-eqz v12, :cond_3

    .line 94
    .line 95
    :try_start_3
    invoke-virtual {v11}, Ljava/io/File;->length()J

    .line 96
    .line 97
    .line 98
    move-result-wide v12

    .line 99
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    .line 100
    .line 101
    .line 102
    move-result-wide v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 103
    cmp-long v12, v12, v14

    .line 104
    .line 105
    if-nez v12, :cond_3

    .line 106
    .line 107
    move-object/from16 v13, p1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    :try_start_4
    new-instance v12, Ljava/io/FileInputStream;

    .line 111
    .line 112
    move-object/from16 v13, p1

    .line 113
    .line 114
    invoke-direct {v12, v13}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_b

    .line 115
    .line 116
    .line 117
    :try_start_5
    new-instance v14, Ljava/io/FileOutputStream;

    .line 118
    .line 119
    invoke-direct {v14, v11, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_a

    .line 120
    .line 121
    .line 122
    const/16 v11, 0x2000

    .line 123
    .line 124
    :try_start_6
    new-array v11, v11, [B

    .line 125
    .line 126
    :goto_0
    invoke-virtual {v12, v11}, Ljava/io/FileInputStream;->read([B)I

    .line 127
    .line 128
    .line 129
    move-result v15

    .line 130
    if-lez v15, :cond_4

    .line 131
    .line 132
    invoke-virtual {v14, v11, v0, v15}, Ljava/io/FileOutputStream;->write([BII)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :catchall_1
    move-exception v0

    .line 137
    move-object/from16 v17, v9

    .line 138
    .line 139
    goto/16 :goto_d

    .line 140
    .line 141
    :cond_4
    invoke-virtual {v14}, Ljava/io/OutputStream;->flush()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 142
    .line 143
    .line 144
    :try_start_7
    invoke-virtual {v12}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 145
    .line 146
    .line 147
    :catchall_2
    :try_start_8
    invoke-virtual {v14}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 148
    .line 149
    .line 150
    :catchall_3
    :goto_1
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v1, v10}, Lj8/f;->h(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-eqz v10, :cond_5

    .line 159
    .line 160
    const/4 v10, 0x2

    .line 161
    goto :goto_2

    .line 162
    :cond_5
    move v10, v4

    .line 163
    :goto_2
    invoke-virtual {v13}, Ljava/io/File;->length()J

    .line 164
    .line 165
    .line 166
    move-result-wide v11

    .line 167
    const-wide/16 v13, 0x0

    .line 168
    .line 169
    cmp-long v13, v11, v13

    .line 170
    .line 171
    if-gtz v13, :cond_6

    .line 172
    .line 173
    move v11, v0

    .line 174
    goto :goto_3

    .line 175
    :cond_6
    const-wide/32 v13, 0x7fffffff

    .line 176
    .line 177
    .line 178
    cmp-long v13, v11, v13

    .line 179
    .line 180
    if-lez v13, :cond_7

    .line 181
    .line 182
    const v11, 0x7fffffff

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_7
    long-to-int v11, v11

    .line 187
    :goto_3
    iget-object v12, v3, Lh/Hchat/dexkit/DexFinder;->emojiCreateInfoMethod:Ljava/lang/reflect/Method;

    .line 188
    .line 189
    if-eqz v12, :cond_9

    .line 190
    .line 191
    invoke-virtual {v1, v12}, Lj8/f;->A(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    invoke-static {v12}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 196
    .line 197
    .line 198
    move-result v14

    .line 199
    if-nez v14, :cond_8

    .line 200
    .line 201
    if-eqz v13, :cond_9

    .line 202
    .line 203
    :cond_8
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v14

    .line 207
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    filled-new-array {v2, v6, v14, v15}, [Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v14

    .line 215
    invoke-static {v12, v13, v14}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    if-eqz v12, :cond_9

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_9
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 223
    .line 224
    .line 225
    move-result v12

    .line 226
    if-eqz v12, :cond_a

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_a
    new-instance v12, Landroid/os/Bundle;

    .line 230
    .line 231
    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 232
    .line 233
    .line 234
    const-string v13, "key_md5"

    .line 235
    .line 236
    invoke-virtual {v12, v13, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    const-string v13, "key_group"

    .line 240
    .line 241
    invoke-virtual {v12, v13, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 242
    .line 243
    .line 244
    const-string v0, "key_type"

    .line 245
    .line 246
    invoke-virtual {v12, v0, v10}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 247
    .line 248
    .line 249
    const-string v0, "key_size"

    .line 250
    .line 251
    invoke-virtual {v12, v0, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 252
    .line 253
    .line 254
    const-string v0, "createEmojiInfo"

    .line 255
    .line 256
    invoke-virtual {v1, v0, v12}, Lj8/f;->p(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-nez v0, :cond_b

    .line 261
    .line 262
    :goto_4
    move-object v12, v9

    .line 263
    goto :goto_6

    .line 264
    :cond_b
    :try_start_9
    iget-object v12, v3, Lh/Hchat/dexkit/DexFinder;->emojiSendMethod:Ljava/lang/reflect/Method;

    .line 265
    .line 266
    if-eqz v12, :cond_c

    .line 267
    .line 268
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object v12

    .line 272
    invoke-virtual {v12}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 273
    .line 274
    .line 275
    move-result-object v12

    .line 276
    goto :goto_5

    .line 277
    :cond_c
    const-class v12, Lj8/f;

    .line 278
    .line 279
    invoke-virtual {v12}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    :goto_5
    invoke-virtual {v0, v12}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 284
    .line 285
    .line 286
    :catchall_4
    const-string v12, "key_emoji_info"

    .line 287
    .line 288
    invoke-virtual {v0, v12}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    :goto_6
    const/16 v0, 0x140

    .line 293
    .line 294
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    const-string v13, "field_temp"

    .line 299
    .line 300
    const-string v14, "field_groupId"

    .line 301
    .line 302
    const-string v15, "field_state"

    .line 303
    .line 304
    move/from16 v16, v4

    .line 305
    .line 306
    const-string v4, "field_start"

    .line 307
    .line 308
    move-object/from16 v17, v9

    .line 309
    .line 310
    const-string v9, "field_size"

    .line 311
    .line 312
    move-object/from16 v18, v7

    .line 313
    .line 314
    const-string v7, "field_type"

    .line 315
    .line 316
    move/from16 v19, v10

    .line 317
    .line 318
    const-string v10, "field_catalog"

    .line 319
    .line 320
    move/from16 p1, v11

    .line 321
    .line 322
    const-string v11, "field_md5"

    .line 323
    .line 324
    if-nez v12, :cond_d

    .line 325
    .line 326
    move-object/from16 v20, v10

    .line 327
    .line 328
    goto :goto_8

    .line 329
    :cond_d
    :try_start_a
    invoke-static {v12, v11, v2}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v12, v10, v6}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 333
    .line 334
    .line 335
    move-object/from16 v20, v10

    .line 336
    .line 337
    :try_start_b
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v10

    .line 341
    invoke-static {v12, v7, v10}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    invoke-static {v12, v9, v10}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    invoke-static {v12, v4, v6}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-static {v12, v15, v6}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    const-string v10, "field_needupload"

    .line 358
    .line 359
    invoke-static {v12, v10, v5}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    invoke-static {v12, v14, v8}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    const-string v10, "field_width"

    .line 366
    .line 367
    invoke-static {v12, v10, v0}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    const-string v10, "field_height"

    .line 371
    .line 372
    invoke-static {v12, v10, v0}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    invoke-static {v12, v13, v5}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 376
    .line 377
    .line 378
    goto :goto_8

    .line 379
    :catchall_5
    move-exception v0

    .line 380
    goto :goto_7

    .line 381
    :catchall_6
    move-exception v0

    .line 382
    move-object/from16 v20, v10

    .line 383
    .line 384
    :goto_7
    new-instance v10, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    move-object/from16 v21, v0

    .line 387
    .line 388
    const-string v0, "\u51c6\u5907\u672c\u5730\u8868\u60c5\u4fe1\u606f\u5931\u8d25: "

    .line 389
    .line 390
    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v1, v0}, Lj8/f;->j(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    :goto_8
    iget-object v0, v3, Lh/Hchat/dexkit/DexFinder;->emojiUpdateInfoMethod:Ljava/lang/reflect/Method;

    .line 408
    .line 409
    if-eqz v0, :cond_e

    .line 410
    .line 411
    if-nez v12, :cond_f

    .line 412
    .line 413
    :cond_e
    move-object/from16 v21, v12

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_f
    :try_start_c
    invoke-virtual {v1, v0}, Lj8/f;->A(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v10

    .line 420
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 421
    .line 422
    .line 423
    move-result v21
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 424
    if-nez v21, :cond_10

    .line 425
    .line 426
    if-eqz v10, :cond_e

    .line 427
    .line 428
    :cond_10
    move-object/from16 v21, v12

    .line 429
    .line 430
    :try_start_d
    filled-new-array/range {v21 .. v21}, [Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v12

    .line 434
    invoke-static {v0, v10, v12}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 435
    .line 436
    .line 437
    goto :goto_a

    .line 438
    :catchall_7
    move-exception v0

    .line 439
    goto :goto_9

    .line 440
    :catchall_8
    move-exception v0

    .line 441
    move-object/from16 v21, v12

    .line 442
    .line 443
    :goto_9
    new-instance v10, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    const-string v12, "\u66f4\u65b0\u672c\u5730\u8868\u60c5\u4fe1\u606f\u5931\u8d25: "

    .line 446
    .line 447
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v1, v0}, Lj8/f;->j(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    :goto_a
    iget-object v0, v3, Lh/Hchat/dexkit/DexFinder;->emojiSendMethod:Ljava/lang/reflect/Method;

    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    aget-object v0, v0, v16

    .line 471
    .line 472
    :try_start_e
    const-class v3, Ljava/lang/String;

    .line 473
    .line 474
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    filled-new-array/range {v18 .. v18}, [Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-static {v0, v11, v2}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    const/16 v3, 0x41

    .line 494
    .line 495
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 496
    .line 497
    .line 498
    move-result-object v3

    .line 499
    move-object/from16 v10, v20

    .line 500
    .line 501
    invoke-static {v0, v10, v3}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    invoke-static {v0, v7, v3}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    invoke-static {v0, v9, v3}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    invoke-static {v0, v4, v6}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    invoke-static {v0, v15, v6}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    invoke-static {v0, v14, v8}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    const-string v3, "field_name"

    .line 528
    .line 529
    invoke-static {v0, v3, v8}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    const-string v3, "field_content"

    .line 533
    .line 534
    invoke-static {v0, v3, v8}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    const-string v3, "field_reserved4"

    .line 538
    .line 539
    invoke-static {v0, v3, v6}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    invoke-static {v0, v13, v5}, Lj8/f;->z(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 543
    .line 544
    .line 545
    move-object v9, v0

    .line 546
    goto :goto_b

    .line 547
    :catchall_9
    move-object/from16 v9, v17

    .line 548
    .line 549
    :goto_b
    if-eqz v9, :cond_11

    .line 550
    .line 551
    move-object v12, v9

    .line 552
    goto :goto_c

    .line 553
    :cond_11
    move-object/from16 v12, v21

    .line 554
    .line 555
    :goto_c
    if-nez v12, :cond_12

    .line 556
    .line 557
    const-string v0, "\u53d1\u8868\u60c5\u5931\u8d25: \u521b\u5efa\u4e34\u65f6EmojiInfo\u5931\u8d25 "

    .line 558
    .line 559
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v1, v0}, Lj8/f;->j(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    :cond_12
    return-object v12

    .line 567
    :catchall_a
    move-exception v0

    .line 568
    move-object/from16 v17, v9

    .line 569
    .line 570
    move-object/from16 v14, v17

    .line 571
    .line 572
    goto :goto_d

    .line 573
    :catchall_b
    move-exception v0

    .line 574
    move-object/from16 v17, v9

    .line 575
    .line 576
    move-object/from16 v12, v17

    .line 577
    .line 578
    move-object v14, v12

    .line 579
    :goto_d
    :try_start_f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 580
    .line 581
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 582
    .line 583
    .line 584
    const-string v3, "\u590d\u5236\u8868\u60c5\u6587\u4ef6\u5f02\u5e38: "

    .line 585
    .line 586
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-virtual {v1, v0}, Lj8/f;->j(Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    .line 601
    .line 602
    .line 603
    if-eqz v12, :cond_13

    .line 604
    .line 605
    :try_start_10
    invoke-virtual {v12}, Ljava/io/FileInputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    .line 606
    .line 607
    .line 608
    :catchall_c
    :cond_13
    if-eqz v14, :cond_14

    .line 609
    .line 610
    :try_start_11
    invoke-virtual {v14}, Ljava/io/FileOutputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_d

    .line 611
    .line 612
    .line 613
    :catchall_d
    :cond_14
    :goto_e
    const-string v0, "\u53d1\u8868\u60c5\u5931\u8d25: \u590d\u5236\u5230\u5fae\u4fe1\u8868\u60c5\u76ee\u5f55\u5931\u8d25 "

    .line 614
    .line 615
    invoke-virtual {v0, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-virtual {v1, v0}, Lj8/f;->j(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    return-object v17

    .line 623
    :catchall_e
    move-exception v0

    .line 624
    if-eqz v12, :cond_15

    .line 625
    .line 626
    :try_start_12
    invoke-virtual {v12}, Ljava/io/FileInputStream;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_f

    .line 627
    .line 628
    .line 629
    :catchall_f
    :cond_15
    if-eqz v14, :cond_16

    .line 630
    .line 631
    :try_start_13
    invoke-virtual {v14}, Ljava/io/FileOutputStream;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_10

    .line 632
    .line 633
    .line 634
    :catchall_10
    :cond_16
    throw v0
.end method

.method public o()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "getAccPath"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lj8/f;->p(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, ""

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    const-string v2, "path"

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    const-string v1, "/"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public p(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 5

    .line 1
    iget-object v0, p0, Lj8/f;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v4, "content://"

    .line 13
    .line 14
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, ".storage.provider.emotion/"

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v2, v0, p1, v1, p2}, Landroid/content/ContentResolver;->call(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    return-object p1

    .line 42
    :catchall_0
    move-exception p2

    .line 43
    const-string v0, "EmotionProvider\u8c03\u7528\u5931\u8d25: "

    .line 44
    .line 45
    const-string v2, " "

    .line 46
    .line 47
    invoke-static {v0, p1, v2}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v1
.end method

.method public q(Ljava/lang/String;)Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

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
    new-instance v0, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "key_md5"

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string p1, "getEmojiByMd5"

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Lj8/f;->p(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    :goto_0
    const/4 p1, 0x0

    .line 27
    return-object p1

    .line 28
    :cond_1
    :try_start_0
    iget-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 31
    .line 32
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->emojiSendMethod:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const-class v0, Lj8/f;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :catchall_0
    const-string v0, "key_emoji_info"

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1
.end method

.method public r(Ljava/io/File;)[B
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v0, v2, v4

    .line 15
    .line 16
    if-lez v0, :cond_5

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide/32 v4, 0x7fffffff

    .line 23
    .line 24
    .line 25
    cmp-long v0, v2, v4

    .line 26
    .line 27
    if-lez v0, :cond_0

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    long-to-int v0, v2

    .line 35
    new-array v2, v0, [B

    .line 36
    .line 37
    new-instance v3, Ljava/io/FileInputStream;

    .line 38
    .line 39
    invoke-direct {v3, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    move v4, p1

    .line 44
    :goto_0
    if-ge v4, v0, :cond_2

    .line 45
    .line 46
    sub-int v5, v0, v4

    .line 47
    .line 48
    :try_start_1
    invoke-virtual {v3, v2, v4, v5}, Ljava/io/FileInputStream;->read([BII)I

    .line 49
    .line 50
    .line 51
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    if-gez v5, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    add-int/2addr v4, v5

    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    :goto_1
    if-ne v4, v0, :cond_3

    .line 60
    .line 61
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 62
    .line 63
    .line 64
    :catchall_1
    return-object v2

    .line 65
    :cond_3
    :try_start_3
    new-array v0, v4, [B

    .line 66
    .line 67
    invoke-static {v2, p1, v0, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    .line 69
    .line 70
    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 71
    .line 72
    .line 73
    :catchall_2
    return-object v0

    .line 74
    :catchall_3
    move-exception p1

    .line 75
    move-object v3, v1

    .line 76
    :goto_2
    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v2, "\u8bfb\u53d6\u8868\u60c5\u6587\u4ef6\u5931\u8d25: "

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 98
    .line 99
    .line 100
    if-eqz v3, :cond_5

    .line 101
    .line 102
    :try_start_6
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :catchall_4
    move-exception p1

    .line 107
    if-eqz v3, :cond_4

    .line 108
    .line 109
    :try_start_7
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 110
    .line 111
    .line 112
    :catchall_5
    :cond_4
    throw p1

    .line 113
    :catchall_6
    :cond_5
    :goto_3
    return-object v1
.end method

.method public t(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

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
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    cmp-long v2, v5, v3

    .line 29
    .line 30
    if-lez v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    invoke-static {p1}, Lj8/f;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Lj8/f;->l()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-virtual {p0, v0, v1, p1}, Lj8/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-nez v5, :cond_4

    .line 68
    .line 69
    new-instance v5, Ljava/io/File;

    .line 70
    .line 71
    invoke-direct {v5, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 81
    .line 82
    .line 83
    move-result-wide v6

    .line 84
    cmp-long v2, v6, v3

    .line 85
    .line 86
    if-lez v2, :cond_4

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-virtual {p0, p1}, Lj8/f;->g(Ljava/lang/String;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    const-string v5, "getGroupId"

    .line 102
    .line 103
    const-string v6, "field_groupId"

    .line 104
    .line 105
    invoke-static {v2, v5, v6}, Lj8/f;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    goto :goto_0

    .line 110
    :cond_5
    move-object v2, v1

    .line 111
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_6

    .line 116
    .line 117
    invoke-virtual {p0, v0, v2, p1}, Lj8/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    new-instance v0, Ljava/io/File;

    .line 122
    .line 123
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_6

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 133
    .line 134
    .line 135
    move-result-wide v5

    .line 136
    cmp-long p1, v5, v3

    .line 137
    .line 138
    if-lez p1, :cond_6

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    return-object p1

    .line 145
    :cond_6
    :goto_1
    return-object v1

    .line 146
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v2, "\u89e3\u6790\u8868\u60c5\u6587\u4ef6\u8def\u5f84\u5931\u8d25: "

    .line 149
    .line 150
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-object v1
.end method

.method public u(II)V
    .locals 9

    .line 1
    iget-object v0, p0, Lj8/f;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Comparator;

    .line 4
    .line 5
    iget-object v1, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Ljava/lang/Object;

    .line 8
    .line 9
    if-gt p2, p1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    sub-int v2, p2, p1

    .line 14
    .line 15
    div-int/lit8 v2, v2, 0x2

    .line 16
    .line 17
    add-int/2addr v2, p1

    .line 18
    aget-object v3, v1, v2

    .line 19
    .line 20
    iput-object v3, p0, Lj8/f;->d:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x1

    .line 24
    if-ne p1, v2, :cond_2

    .line 25
    .line 26
    aget-object v1, v1, p2

    .line 27
    .line 28
    if-ne v3, v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-interface {v0, v1, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    :goto_0
    if-gez v4, :cond_c

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, Lj8/f;->m(II)V

    .line 38
    .line 39
    .line 40
    iput-boolean v5, p0, Lj8/f;->a:Z

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    move v2, p1

    .line 44
    move v3, p2

    .line 45
    :cond_3
    :goto_1
    if-gt v2, v3, :cond_a

    .line 46
    .line 47
    :goto_2
    aget-object v6, v1, v2

    .line 48
    .line 49
    iget-object v7, p0, Lj8/f;->d:Ljava/lang/Object;

    .line 50
    .line 51
    if-ne v7, v6, :cond_4

    .line 52
    .line 53
    move v6, v4

    .line 54
    goto :goto_3

    .line 55
    :cond_4
    invoke-interface {v0, v6, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    :goto_3
    if-gez v6, :cond_5

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    :goto_4
    aget-object v7, v1, v3

    .line 65
    .line 66
    iget-object v8, p0, Lj8/f;->d:Ljava/lang/Object;

    .line 67
    .line 68
    if-ne v8, v7, :cond_6

    .line 69
    .line 70
    move v7, v4

    .line 71
    goto :goto_5

    .line 72
    :cond_6
    invoke-interface {v0, v7, v8}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    :goto_5
    if-lez v7, :cond_7

    .line 77
    .line 78
    add-int/lit8 v3, v3, -0x1

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_7
    if-gt v2, v3, :cond_3

    .line 82
    .line 83
    if-eq v2, v3, :cond_9

    .line 84
    .line 85
    if-gtz v6, :cond_8

    .line 86
    .line 87
    if-gez v7, :cond_9

    .line 88
    .line 89
    :cond_8
    invoke-virtual {p0, v2, v3}, Lj8/f;->m(II)V

    .line 90
    .line 91
    .line 92
    iput-boolean v5, p0, Lj8/f;->a:Z

    .line 93
    .line 94
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    add-int/lit8 v3, v3, -0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_a
    if-ge p1, v3, :cond_b

    .line 100
    .line 101
    invoke-virtual {p0, p1, v3}, Lj8/f;->u(II)V

    .line 102
    .line 103
    .line 104
    :cond_b
    if-ge v2, p2, :cond_c

    .line 105
    .line 106
    invoke-virtual {p0, v2, p2}, Lj8/f;->u(II)V

    .line 107
    .line 108
    .line 109
    :cond_c
    :goto_6
    return-void
.end method

.method public v(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const-string v0, "\u53d1\u8868\u60c5\u5931\u8d25: \u5fae\u4fe1\u8868\u60c5\u5e93\u4e0d\u5b58\u5728 "

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_6

    .line 9
    .line 10
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {p0}, Lj8/f;->a()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const-string p1, "\u53d1\u8868\u60c5\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return v2

    .line 29
    :cond_1
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 30
    .line 31
    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v1, p1}, Lj8/f;->y(Ljava/io/File;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {p2}, Lj8/f;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    const-string p1, "\u53d1\u8868\u60c5\u5931\u8d25: \u4e0d\u662f\u6709\u6548md5\uff0c\u4e14\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return v2

    .line 63
    :cond_3
    invoke-virtual {p0, p2}, Lj8/f;->g(Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-nez v1, :cond_4

    .line 68
    .line 69
    new-instance p1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return v2

    .line 85
    :cond_4
    invoke-virtual {p0, p1, p2}, Lj8/f;->w(Ljava/lang/String;Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_5

    .line 90
    .line 91
    const/4 p1, 0x1

    .line 92
    return p1

    .line 93
    :cond_5
    invoke-virtual {p0, v1, p1}, Lj8/f;->x(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    return p1

    .line 98
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v0, "\u53d1\u8868\u60c5\u5f02\u5e38: "

    .line 101
    .line 102
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return v2

    .line 120
    :cond_6
    :goto_1
    const-string p1, "\u53d1\u8868\u60c5\u5931\u8d25: talker/emoji\u4e3a\u7a7a"

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return v2
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lj8/f;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lh/Hchat/dexkit/DexFinder;

    .line 8
    .line 9
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->emojiManagerSendMethod:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    :try_start_0
    invoke-virtual {p0, v1}, Lj8/f;->A(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v5, 0x3

    .line 39
    aget-object v4, v4, v5

    .line 40
    .line 41
    invoke-static {v4}, Lj8/f;->B(Ljava/lang/Class;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    filled-new-array {v0, p1, p2, v4, v5}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {v1, v3, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    instance-of p2, p1, Ljava/lang/Boolean;

    .line 58
    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    check-cast p1, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    return p1

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    new-instance p2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v0, "\u539f\u751f\u8868\u60c5\u7ba1\u7406\u53d1\u9001\u5931\u8d25: "

    .line 75
    .line 76
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_0
    return v2
.end method

.method public x(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lj8/f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->emojiSendMethod:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lj8/f;->A(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

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
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string p2, "\u53d1\u8868\u60c5\u5931\u8d25: \u65e0\u6cd5\u521b\u5efa\u53d1\u9001\u5668 "

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return v3

    .line 38
    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    array-length v4, v2

    .line 43
    new-array v4, v4, [Ljava/lang/Object;

    .line 44
    .line 45
    move v5, v3

    .line 46
    :goto_0
    array-length v6, v2

    .line 47
    const/4 v7, 0x1

    .line 48
    if-ge v5, v6, :cond_b

    .line 49
    .line 50
    aget-object v6, v2, v5

    .line 51
    .line 52
    const-class v8, Ljava/lang/String;

    .line 53
    .line 54
    if-nez v5, :cond_1

    .line 55
    .line 56
    if-ne v6, v8, :cond_1

    .line 57
    .line 58
    aput-object p2, v4, v5

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_1
    if-ne v5, v7, :cond_2

    .line 62
    .line 63
    invoke-virtual {v6, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_2

    .line 68
    .line 69
    aput-object p1, v4, v5

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_2
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    if-eq v6, v7, :cond_a

    .line 75
    .line 76
    const-class v7, Ljava/lang/Long;

    .line 77
    .line 78
    if-ne v6, v7, :cond_3

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 82
    .line 83
    if-eq v6, v7, :cond_9

    .line 84
    .line 85
    const-class v7, Ljava/lang/Integer;

    .line 86
    .line 87
    if-ne v6, v7, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    if-eq v6, v7, :cond_8

    .line 93
    .line 94
    const-class v7, Ljava/lang/Boolean;

    .line 95
    .line 96
    if-ne v6, v7, :cond_5

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    if-ne v6, v8, :cond_6

    .line 100
    .line 101
    const-string v6, ""

    .line 102
    .line 103
    aput-object v6, v4, v5

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    const/4 v7, 0x3

    .line 107
    if-ne v5, v7, :cond_7

    .line 108
    .line 109
    invoke-static {v6}, Lj8/f;->B(Ljava/lang/Class;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    aput-object v6, v4, v5

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_7
    const/4 v6, 0x0

    .line 117
    aput-object v6, v4, v5

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_8
    :goto_1
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 121
    .line 122
    aput-object v6, v4, v5

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_9
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    aput-object v6, v4, v5

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_a
    :goto_3
    const-wide/16 v6, 0x0

    .line 133
    .line 134
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    aput-object v6, v4, v5

    .line 139
    .line 140
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_b
    invoke-static {v0, v1, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    return v7
.end method

.method public y(Ljava/io/File;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lj8/f;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p1, "\u53d1\u8868\u60c5\u5931\u8d25: \u672c\u5730\u8def\u5f84API\u672a\u5c31\u7eea"

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lj8/f;->e(Ljava/io/File;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const-string p1, "\u53d1\u8868\u60c5\u5931\u8d25: \u8ba1\u7b97\u672c\u5730\u6587\u4ef6md5\u5931\u8d25"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    :try_start_0
    invoke-virtual {p0, v0}, Lj8/f;->g(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, Lj8/f;->n(Ljava/io/File;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 44
    .line 45
    return v1

    .line 46
    :cond_3
    invoke-virtual {p0, p2, v0}, Lj8/f;->w(Ljava/lang/String;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    :cond_4
    invoke-virtual {p0, v2, p2}, Lj8/f;->x(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    return p1

    .line 59
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v0, "\u53d1\u8868\u60c5\u672c\u5730\u8def\u5f84\u5f02\u5e38: "

    .line 62
    .line 63
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p0, p1}, Lj8/f;->j(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return v1
.end method
