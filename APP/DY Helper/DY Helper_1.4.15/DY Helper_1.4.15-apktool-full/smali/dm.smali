.class public final Ldm;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ldm;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/HashSet;

.field public static final ε:Lul;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldm;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldm;->α:Ldm;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ldm;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ldm;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Ldm;->δ:Ljava/util/HashSet;

    .line 29
    .line 30
    new-instance v0, Lul;

    .line 31
    .line 32
    const/16 v1, 0x11

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lul;-><init>(I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Ldm;->ε:Lul;

    .line 38
    .line 39
    return-void
.end method

.method public static β(Ljava/lang/ClassLoader;)V
    .locals 7

    .line 1
    sget-object v0, Lem;->α:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v0, "~78F34A746881AA3660EE86BE622F7993067D6CB566F11858AD9EF7F2FE1F6FF4FE6B4A7480A0A9E6D128F8AF32912FFFC8EA4A580082EEF875A9FDE1007A42A37CB2FED7CCCA300AA4E523CA56094EE2540D07678E1F90F349"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p0, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 v0, 0x0

    .line 19
    sget-object v1, Ljz;->ε:Ljz;

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    array-length v3, v2

    .line 32
    move v4, v0

    .line 33
    :goto_0
    if-ge v4, v3, :cond_2

    .line 34
    .line 35
    aget-object v5, v2, v4

    .line 36
    .line 37
    const-class v6, Landroid/view/ViewGroup;

    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v1, Lul;

    .line 61
    .line 62
    const/16 v2, 0x12

    .line 63
    .line 64
    invoke-direct {v1, v2}, Lul;-><init>(I)V

    .line 65
    .line 66
    .line 67
    new-instance v2, Ly30;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-direct {v2, p0, v3, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 71
    .line 72
    .line 73
    new-instance p0, Lul;

    .line 74
    .line 75
    const/16 v1, 0x13

    .line 76
    .line 77
    invoke-direct {p0, v1}, Lul;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-static {v2, p0}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_3

    .line 101
    .line 102
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Ljava/lang/reflect/Method;

    .line 107
    .line 108
    new-instance v3, Lxl;

    .line 109
    .line 110
    const/4 v4, 0x3

    .line 111
    invoke-direct {v3, v4, v0}, Lxl;-><init>(IB)V

    .line 112
    .line 113
    .line 114
    sget-object v4, Ldm;->α:Ldm;

    .line 115
    .line 116
    invoke-virtual {v4, v2, v3}, Ldm;->α(Ljava/lang/reflect/Method;Lm01;)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v1, "comment input bind hooks installed: count="

    .line 127
    .line 128
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    const-string v0, "rd44bdb4944a23356"

    .line 139
    .line 140
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public static γ(Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    sget-object v0, Lem;->α:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v0, "~791C379118E47E8B07D05A90B0CB4AAAEFB24B3BF0773879FC833D3987C0B1293BF3"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p0, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    sget-object v2, Ljz;->ε:Ljz;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    move-object v0, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v3, Lul;

    .line 37
    .line 38
    const/16 v4, 0x18

    .line 39
    .line 40
    invoke-direct {v3, v4}, Lul;-><init>(I)V

    .line 41
    .line 42
    .line 43
    new-instance v4, Ly30;

    .line 44
    .line 45
    invoke-direct {v4, v0, v1, v3}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lul;

    .line 49
    .line 50
    const/16 v3, 0x19

    .line 51
    .line 52
    invoke-direct {v0, v3}, Lul;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v4, v0}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    const/4 v5, 0x0

    .line 72
    sget-object v6, Ldm;->α:Ldm;

    .line 73
    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Ljava/lang/reflect/Method;

    .line 81
    .line 82
    new-instance v7, Lxl;

    .line 83
    .line 84
    const/4 v8, 0x5

    .line 85
    invoke-direct {v7, v8, v5}, Lxl;-><init>(IB)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v4, v7}, Ldm;->α(Ljava/lang/reflect/Method;Lm01;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    sget-object v3, Lem;->α:Ljava/util/Set;

    .line 93
    .line 94
    const-string v3, "X.C242500wE"

    .line 95
    .line 96
    invoke-static {p0, v3}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-nez p0, :cond_2

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    new-instance v2, Lul;

    .line 115
    .line 116
    const/16 v3, 0x16

    .line 117
    .line 118
    invoke-direct {v2, v3}, Lul;-><init>(I)V

    .line 119
    .line 120
    .line 121
    new-instance v3, Ly30;

    .line 122
    .line 123
    invoke-direct {v3, p0, v1, v2}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 124
    .line 125
    .line 126
    new-instance p0, Lul;

    .line 127
    .line 128
    const/16 v1, 0x17

    .line 129
    .line 130
    invoke-direct {p0, v1}, Lul;-><init>(I)V

    .line 131
    .line 132
    .line 133
    invoke-static {v3, p0}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p0}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    :goto_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_3

    .line 150
    .line 151
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Ljava/lang/reflect/Method;

    .line 156
    .line 157
    new-instance v3, Lxl;

    .line 158
    .line 159
    const/4 v4, 0x6

    .line 160
    invoke-direct {v3, v4, v5}, Lxl;-><init>(IB)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6, v1, v3}, Ldm;->α(Ljava/lang/reflect/Method;Lm01;)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    new-instance v1, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v2, "legacy comment hooks installed: readers="

    .line 178
    .line 179
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string p0, ", checks="

    .line 186
    .line 187
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    const-string v0, "rd44bdb4944a23356"

    .line 198
    .line 199
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public static δ(Ljava/lang/ClassLoader;)V
    .locals 10

    .line 1
    sget-object v0, Lem;->α:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v0, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8107C98B374AA73AD003D84FDB16B9ADC2F32C07489E2A986"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {p0, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    sget-object v3, Ljz;->ε:Ljz;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    move-object v1, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v4, Lul;

    .line 37
    .line 38
    const/16 v5, 0x14

    .line 39
    .line 40
    invoke-direct {v4, v5}, Lul;-><init>(I)V

    .line 41
    .line 42
    .line 43
    new-instance v5, Ly30;

    .line 44
    .line 45
    invoke-direct {v5, v1, v2, v4}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lul;

    .line 49
    .line 50
    const/16 v4, 0x15

    .line 51
    .line 52
    invoke-direct {v1, v4}, Lul;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v5, v1}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const/4 v6, 0x0

    .line 72
    sget-object v7, Ldm;->α:Ldm;

    .line 73
    .line 74
    if-eqz v5, :cond_1

    .line 75
    .line 76
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Ljava/lang/reflect/Method;

    .line 81
    .line 82
    new-instance v8, Lxl;

    .line 83
    .line 84
    const/4 v9, 0x7

    .line 85
    invoke-direct {v8, v9, v6}, Lxl;-><init>(IB)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7, v5, v8}, Ldm;->α(Ljava/lang/reflect/Method;Lm01;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    sget-object v4, Lem;->α:Ljava/util/Set;

    .line 93
    .line 94
    sget-object v4, Lqe0;->α:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {p0, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-nez p0, :cond_2

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    new-instance v0, Lul;

    .line 119
    .line 120
    const/16 v3, 0x1a

    .line 121
    .line 122
    invoke-direct {v0, v3}, Lul;-><init>(I)V

    .line 123
    .line 124
    .line 125
    new-instance v3, Ly30;

    .line 126
    .line 127
    invoke-direct {v3, p0, v2, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 128
    .line 129
    .line 130
    new-instance p0, Lul;

    .line 131
    .line 132
    const/16 v0, 0x1b

    .line 133
    .line 134
    invoke-direct {p0, v0}, Lul;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-static {v3, p0}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    :goto_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Ljava/lang/reflect/Method;

    .line 160
    .line 161
    new-instance v2, Lxl;

    .line 162
    .line 163
    const/16 v4, 0x8

    .line 164
    .line 165
    invoke-direct {v2, v4, v6}, Lxl;-><init>(IB)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7, v0, v2}, Ldm;->α(Ljava/lang/reflect/Method;Lm01;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v2, "related search hooks installed: eligibility="

    .line 183
    .line 184
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string p0, ", registration="

    .line 191
    .line 192
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    const-string v0, "rd44bdb4944a23356"

    .line 203
    .line 204
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    return-void
.end method

.method public static ε(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    new-instance v0, Leo1;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    move-object p0, v0

    .line 18
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    instance-of v1, p0, Leo1;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    move-object p0, v0

    .line 25
    :cond_0
    check-cast p0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method


# virtual methods
.method public final declared-synchronized α(Ljava/lang/reflect/Method;Lm01;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Ldm;->δ:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_1
    sget-object v0, Lxq0;->α:Lxq0;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    throw p1
.end method
