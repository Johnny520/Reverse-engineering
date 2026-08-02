.class public final Lhh;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lhh;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static final i:Z

.field public static final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final k:Ljava/util/Set;

.field public static final l:Ljava/util/Set;

.field public static final m:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lhh;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lhh;->d:Lhh;

    .line 8
    .line 9
    const v0, 0x790b004c

    .line 10
    .line 11
    .line 12
    sput v0, Lhh;->e:I

    .line 13
    .line 14
    const v0, 0x790b0057

    .line 15
    .line 16
    .line 17
    sput v0, Lhh;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->i:Lwm0;

    .line 20
    .line 21
    sput-object v0, Lhh;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "AutoReceiveRedPacket"

    .line 24
    .line 25
    sput-object v0, Lhh;->h:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    sput-boolean v0, Lhh;->i:Z

    .line 29
    .line 30
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lhh;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    const v2, 0x1a000031

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const v3, 0x1c000031

    .line 45
    .line 46
    .line 47
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    filled-new-array {v2, v3}, [Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    sput-object v2, Lhh;->k:Ljava/util/Set;

    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    filled-new-array {v1, v0}, [Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, Lhh;->l:Ljava/util/Set;

    .line 78
    .line 79
    const/16 v0, 0x6f

    .line 80
    .line 81
    new-array v0, v0, [I

    .line 82
    .line 83
    fill-array-data v0, :array_0

    .line 84
    .line 85
    .line 86
    sput-object v0, Lhh;->m:[I

    .line 87
    .line 88
    return-void

    .line 89
    :array_0
    .array-data 4
        0xa
        0x6d
        0xa
        0xa
        0x4c
        0x61
        0x75
        0x6e
        0x63
        0x68
        0x65
        0x72
        0x55
        0x49
        0x12
        0x24
        0x30
        0x36
        0x63
        0x30
        0x37
        0x31
        0x65
        0x38
        0x2d
        0x37
        0x34
        0x32
        0x62
        0x2d
        0x34
        0x30
        0x61
        0x63
        0x2d
        0x61
        0x64
        0x36
        0x30
        0x2d
        0x39
        0x39
        0x65
        0x33
        0x66
        0x37
        0x64
        0x62
        0x63
        0x32
        0x37
        0x31
        0x18
        -0x39
        -0x59
        -0x80
        -0x4f
        -0x29
        0x32
        0x20
        0x0
        0x28
        0x1
        0x32
        0x2e
        0x8
        0x9
        0x12
        0x2a
        0xa
        0x14
        0x31
        0x31
        0x35
        0x38
        0x33
        0x32
        0x38
        0x30
        0x32
        0x36
        0x39
        0x34
        0x33
        0x35
        0x39
        0x38
        0x31
        0x38
        0x34
        0x36
        0x28
        0x0
        0x30
        0x0
        0x38
        0x0
        0x40
        0x0
        0x48
        0x0
        0x50
        0x0
        0x60
        0x0
        0x68
        0x0
        0x70
        0x0
        0x78
        0x0
    .end array-data
.end method

.method public static q(Lgh;Ljava/lang/String;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lzm1;->d:Lzm1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lzm1;->g:Lhx2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, Ljava/lang/Class;

    .line 16
    .line 17
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-class v9, Ljava/lang/String;

    .line 23
    .line 24
    const-class v10, Ljava/lang/String;

    .line 25
    .line 26
    const-class v3, Ljava/lang/String;

    .line 27
    .line 28
    const-class v4, Ljava/lang/String;

    .line 29
    .line 30
    const-class v5, Ljava/lang/String;

    .line 31
    .line 32
    const-class v6, Ljava/lang/String;

    .line 33
    .line 34
    const-class v7, Ljava/lang/String;

    .line 35
    .line 36
    const-class v8, Ljava/lang/String;

    .line 37
    .line 38
    move-object v2, v1

    .line 39
    filled-new-array/range {v1 .. v10}, [Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 49
    .line 50
    .line 51
    iget v1, p0, Lgh;->e:I

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget v1, p0, Lgh;->f:I

    .line 58
    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v4, p0, Lgh;->a:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v5, p0, Lgh;->b:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v6, p0, Lgh;->g:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v7, p0, Lgh;->h:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v8, p0, Lgh;->c:Ljava/lang/String;

    .line 72
    .line 73
    const-string v9, "v1.0"

    .line 74
    .line 75
    const-string v11, ""

    .line 76
    .line 77
    move-object v10, p1

    .line 78
    filled-new-array/range {v2 .. v11}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    return-object p0
.end method

.method public static r(Lgh;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Ldn1;->d:Ldn1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldn1;->g:Lhx2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, Ljava/lang/Class;

    .line 16
    .line 17
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-class v6, Ljava/lang/String;

    .line 23
    .line 24
    const-class v7, Ljava/lang/String;

    .line 25
    .line 26
    const-class v3, Ljava/lang/String;

    .line 27
    .line 28
    const-class v4, Ljava/lang/String;

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    move-object v5, v1

    .line 32
    filled-new-array/range {v1 .. v7}, [Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 44
    .line 45
    .line 46
    iget v1, p0, Lgh;->e:I

    .line 47
    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget v1, p0, Lgh;->f:I

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget-object v4, p0, Lgh;->a:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v5, p0, Lgh;->b:Ljava/lang/String;

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const-string v7, "v1.0"

    .line 68
    .line 69
    iget-object v8, p0, Lgh;->c:Ljava/lang/String;

    .line 70
    .line 71
    filled-new-array/range {v2 .. v8}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    return-object p0
.end method

.method public static s()Lch;
    .locals 15

    .line 1
    sget-object v0, Lpp1;->a:Lpp1;

    .line 2
    .line 3
    invoke-static {}, Lpp1;->c()Lop1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lch;

    .line 8
    .line 9
    invoke-direct {v1}, Lch;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lch;->Companion:Lbh;

    .line 13
    .line 14
    invoke-virtual {v2}, Lbh;->serializer()Lw41;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Lse;->D(Lw41;)Lw41;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "AutoReceiveRedPacket/config"

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1, v3}, Lop1;->b(Lw41;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lch;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Lch;

    .line 33
    .line 34
    invoke-direct {v0}, Lch;-><init>()V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-wide v1, v0, Lch;->a:J

    .line 38
    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    const-wide/32 v5, 0xea60

    .line 42
    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, Lci0;->E(JJJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v8

    .line 48
    iget v1, v0, Lch;->b:I

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v3, Lhh;->l:Ljava/util/Set;

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 v2, 0x0

    .line 68
    :goto_0
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    :goto_1
    move v10, v1

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    const/4 v1, 0x1

    .line 77
    goto :goto_1

    .line 78
    :goto_2
    iget-object v1, v0, Lch;->d:Ljava/util/Set;

    .line 79
    .line 80
    check-cast v1, Ljava/lang/Iterable;

    .line 81
    .line 82
    new-instance v12, Ljava/util/LinkedHashSet;

    .line 83
    .line 84
    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :cond_3
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    move-object v3, v2

    .line 102
    check-cast v3, Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_3

    .line 109
    .line 110
    invoke-interface {v12, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    iget-object v1, v0, Lch;->e:Ljava/util/Set;

    .line 115
    .line 116
    check-cast v1, Ljava/lang/Iterable;

    .line 117
    .line 118
    new-instance v13, Ljava/util/LinkedHashSet;

    .line 119
    .line 120
    invoke-direct {v13}, Ljava/util/LinkedHashSet;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    :cond_5
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_6

    .line 132
    .line 133
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    move-object v3, v2

    .line 138
    check-cast v3, Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_5

    .line 145
    .line 146
    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_6
    iget-boolean v11, v0, Lch;->c:Z

    .line 151
    .line 152
    iget-object v14, v0, Lch;->f:Lfh;

    .line 153
    .line 154
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    new-instance v7, Lch;

    .line 158
    .line 159
    invoke-direct/range {v7 .. v14}, Lch;-><init>(JIZLjava/util/Set;Ljava/util/Set;Lfh;)V

    .line 160
    .line 161
    .line 162
    return-object v7
.end method

.method public static t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "<"

    .line 2
    .line 3
    const-string v1, ">"

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "</"

    .line 10
    .line 11
    invoke-static {v2, p1, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v1, 0x6

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {p0, v0, v2, v2, v1}, Lpv2;->q0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-gez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, v1

    .line 29
    const/4 v1, 0x4

    .line 30
    invoke-static {p0, p1, v0, v2, v1}, Lpv2;->q0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-gez p1, :cond_1

    .line 35
    .line 36
    :goto_0
    const-string p0, ""

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string p1, "<![CDATA["

    .line 52
    .line 53
    invoke-static {p0, p1, v2}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    const-string p1, "]]>"

    .line 60
    .line 61
    invoke-static {p0, p1, v2}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    add-int/lit8 p1, p1, -0x3

    .line 72
    .line 73
    const/16 v0, 0x9

    .line 74
    .line 75
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :cond_2
    return-object p0
.end method

.method public static u()V
    .locals 7

    .line 1
    const-string v0, "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI"

    .line 2
    .line 3
    invoke-static {v0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    array-length v2, v0

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_1

    .line 22
    .line 23
    aget-object v4, v0, v3

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-string v6, "onSceneEnd"

    .line 30
    .line 31
    invoke-static {v5, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/reflect/Method;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v2, Lw;

    .line 69
    .line 70
    const/16 v3, 0xf

    .line 71
    .line 72
    invoke-direct {v2, v3}, Lw;-><init>(I)V

    .line 73
    .line 74
    .line 75
    new-instance v3, Lkg3;

    .line 76
    .line 77
    sget-object v4, Lhh;->d:Lhh;

    .line 78
    .line 79
    const/4 v5, 0x0

    .line 80
    invoke-direct {v3, v4, v5, v2}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    return-void

    .line 92
    :cond_3
    const-string v0, "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.onSceneEnd was not found"

    .line 93
    .line 94
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public static v(Lgh;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lup0;->k:Landroid/app/Activity;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string v1, "hostAct"

    .line 8
    .line 9
    invoke-static {v1}, Lt11;->S(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    new-instance v2, Lx92;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object v1, v2

    .line 20
    :goto_0
    nop

    .line 21
    instance-of v2, v1, Lx92;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object v0, v1

    .line 27
    :goto_1
    check-cast v0, Landroid/app/Activity;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const-string v1, "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI"

    .line 32
    .line 33
    invoke-static {v1}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, Landroid/content/Intent;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    const-string v1, "Nuke.AutoReceiveRedPacket.ClickReceive"

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    const-string v1, "KEY_HOME_PAGE_CLS"

    .line 49
    .line 50
    const-string v4, "com.tencent.mm.ui.LauncherUI"

    .line 51
    .line 52
    invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    const-string v1, "key_username"

    .line 56
    .line 57
    iget-object v4, p0, Lgh;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    const-string v1, "key_way"

    .line 63
    .line 64
    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    const-string v1, "key_native_url"

    .line 68
    .line 69
    iget-object v4, p0, Lgh;->b:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    const-string v1, "ReportKey.CommonReportObjKey"

    .line 75
    .line 76
    sget-object v4, Lhh;->m:[I

    .line 77
    .line 78
    invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    const-string v1, "key_cropname"

    .line 82
    .line 83
    const-string v4, ""

    .line 84
    .line 85
    invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    new-instance v1, Llb;

    .line 89
    .line 90
    invoke-direct {v1, v0, v2, p0, v3}, Llb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    const-string p0, "No foreground activity is available for click receive mode"

    .line 98
    .line 99
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public static w(Lyi1;I)Lgh;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lyi1;->h:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const-string v3, "<msg"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    invoke-static {v1, v3, v4, v4, v2}, Lpv2;->q0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ltz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    :goto_0
    const-string v3, "nativeurl"

    .line 22
    .line 23
    invoke-static {v2, v3}, Lhh;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v5, "&amp;"

    .line 28
    .line 29
    const-string v6, "&"

    .line 30
    .line 31
    invoke-static {v3, v5, v6}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    invoke-static {v9}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v5, 0x0

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const-string v6, "sendid"

    .line 48
    .line 49
    invoke-virtual {v3, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    if-nez v6, :cond_2

    .line 54
    .line 55
    const-string v6, ""

    .line 56
    .line 57
    :cond_2
    move-object v8, v6

    .line 58
    invoke-static {v8}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_3

    .line 63
    .line 64
    :goto_1
    return-object v5

    .line 65
    :cond_3
    new-instance v7, Lgh;

    .line 66
    .line 67
    iget-object v10, v0, Lyi1;->c:Ljava/lang/String;

    .line 68
    .line 69
    const-string v0, "@chatroom"

    .line 70
    .line 71
    invoke-static {v10, v0, v4}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    :goto_2
    move-object v11, v10

    .line 78
    goto :goto_3

    .line 79
    :cond_4
    const/16 v0, 0x3a

    .line 80
    .line 81
    invoke-static {v1, v0}, Lpv2;->G0(Ljava/lang/String;C)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_5

    .line 98
    .line 99
    const/16 v1, 0x3c

    .line 100
    .line 101
    invoke-static {v0, v1}, Lpv2;->i0(Ljava/lang/CharSequence;C)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    move-object v5, v0

    .line 108
    :cond_5
    if-nez v5, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    move-object v11, v5

    .line 112
    :goto_3
    const-string v0, "msgtype"

    .line 113
    .line 114
    invoke-virtual {v3, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const/4 v1, 0x1

    .line 119
    if-eqz v0, :cond_7

    .line 120
    .line 121
    invoke-static {v0}, Lwv2;->e0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    move v12, v0

    .line 132
    goto :goto_4

    .line 133
    :cond_7
    move v12, v1

    .line 134
    :goto_4
    const-string v0, "channelid"

    .line 135
    .line 136
    invoke-virtual {v3, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    invoke-static {v0}, Lwv2;->e0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-eqz v0, :cond_8

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    :cond_8
    move v13, v1

    .line 153
    const-string v0, "headimgurl"

    .line 154
    .line 155
    invoke-static {v2, v0}, Lhh;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    const-string v0, "sendertitle"

    .line 160
    .line 161
    invoke-static {v2, v0}, Lhh;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v15

    .line 165
    move/from16 v16, p1

    .line 166
    .line 167
    invoke-direct/range {v7 .. v16}, Lgh;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V

    .line 168
    .line 169
    .line 170
    return-object v7
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lhh;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lhh;->u()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La83;->a:La83;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    new-instance v1, Lx92;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object v0, v1

    .line 14
    :goto_0
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v1, Lhh;->d:Lhh;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "Install click receive UI hook failed: "

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, Lhh;->h:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    sget-object v0, Ldn1;->d:Ldn1;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v0, Ldn1;->f:Lhx2;

    .line 46
    .line 47
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/reflect/Method;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v1, Lw;

    .line 57
    .line 58
    const/16 v2, 0xd

    .line 59
    .line 60
    invoke-direct {v1, v2}, Lw;-><init>(I)V

    .line 61
    .line 62
    .line 63
    new-instance v2, Lkg3;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-direct {v2, p0, v3, v1}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    sget-object v0, Lzm1;->d:Lzm1;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v0, Lzm1;->f:Lhx2;

    .line 82
    .line 83
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v1, Lw;

    .line 93
    .line 94
    const/16 v2, 0xe

    .line 95
    .line 96
    invoke-direct {v1, v2}, Lw;-><init>(I)V

    .line 97
    .line 98
    .line 99
    new-instance v2, Lkg3;

    .line 100
    .line 101
    invoke-direct {v2, p0, v3, v1}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final h(Lvb1;)V
    .locals 2

    .line 1
    invoke-static {}, Lhh;->s()Lch;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lid3;->e:Lid3;

    .line 5
    .line 6
    new-instance v0, Lw;

    .line 7
    .line 8
    const/16 v1, 0xc

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lw;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0, v0}, Lvb1;->a(Ltb1;Lin0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    sget-object p0, Lhh;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lhh;->s()Lch;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget v0, p0, Lch;->b:I

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const v0, 0x790b0061

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const v0, 0x790b0062

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lch;->f:Lfh;

    .line 27
    .line 28
    iget-boolean v1, v1, Lfh;->a:Z

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const v1, 0x790b004f

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const v1, 0x790b004e

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-wide v2, p0, Lch;->a:J

    .line 51
    .line 52
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    filled-new-array {v0, p0, v1}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const v0, 0x790b0052

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    return-object p0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Lhh;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final l()Z
    .locals 0

    .line 1
    sget-boolean p0, Lhh;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lhh;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lhh;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p(Landroid/view/View;Lxm0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :goto_0
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    instance-of p1, p0, Landroid/app/Activity;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    check-cast p0, Landroid/app/Activity;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    :goto_1
    if-nez p0, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-static {}, Lhh;->s()Lch;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v0, Lx;

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    invoke-direct {v0, v1, p1, p2}, Lx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lkw;

    .line 50
    .line 51
    const p2, -0x3f8b3955

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    invoke-direct {p1, p2, v2, v0}, Lkw;-><init>(IZLun0;)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Lt7;

    .line 59
    .line 60
    invoke-direct {p2, v1, p0, p1}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
