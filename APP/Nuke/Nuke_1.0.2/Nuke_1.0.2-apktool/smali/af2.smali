.class public final Laf2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Laf2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Laf2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Laf2;->a:Laf2;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/16 v0, 0x40

    .line 12
    .line 13
    if-gt p0, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, " must not be blank and must contain at most 64 characters."

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v4, 0x0

    .line 23
    const/16 v5, 0x1c

    .line 24
    .line 25
    const-string v0, "INVALID_ARGUMENT"

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static final b(Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-static {p0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/16 v0, 0x1000

    .line 12
    .line 13
    if-gt p0, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v5, 0x0

    .line 17
    const/16 v6, 0x1c

    .line 18
    .line 19
    const-string v1, "INVALID_ARGUMENT"

    .line 20
    .line 21
    const-string v2, "message must not be blank and must contain at most 4096 characters."

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static d(Lcom/dokar/quickjs/QuickJs;Lvn1;)V
    .locals 7

    .line 1
    new-instance v2, Ln4;

    .line 2
    .line 3
    iget-object v0, p1, Lvn1;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldf2;

    .line 6
    .line 7
    iget-object v1, v0, Ldf2;->a:Lbf2;

    .line 8
    .line 9
    invoke-direct {v2, v1}, Ln4;-><init>(Lbf2;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lv20;

    .line 13
    .line 14
    iget-object v0, v0, Ldf2;->a:Lbf2;

    .line 15
    .line 16
    invoke-direct {v3, v0}, Lv20;-><init>(Lbf2;)V

    .line 17
    .line 18
    .line 19
    new-instance v4, Ldq1;

    .line 20
    .line 21
    invoke-direct {v4, p1}, Ldq1;-><init>(Lvn1;)V

    .line 22
    .line 23
    .line 24
    new-instance v5, Ljw0;

    .line 25
    .line 26
    invoke-direct {v5, p1, v4}, Ljw0;-><init>(Lvn1;Ldq1;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lh9;

    .line 30
    .line 31
    const/4 v6, 0x3

    .line 32
    move-object v1, p1

    .line 33
    invoke-direct/range {v0 .. v6}, Lh9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Lfs1;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/dokar/quickjs/QuickJs;->getTypeConverters()Lz53;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "__nukeNative"

    .line 43
    .line 44
    invoke-direct {p1, v2, v3}, Lfs1;-><init>(Lz53;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lh9;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const-wide/16 v2, -0x1

    .line 51
    .line 52
    invoke-static {p0, p1, v2, v3}, Ls11;->G(Lcom/dokar/quickjs/QuickJs;Lfs1;J)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lfs1;

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/dokar/quickjs/QuickJs;->getTypeConverters()Lz53;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v4, "console"

    .line 62
    .line 63
    invoke-direct {p1, v0, v4}, Lfs1;-><init>(Lz53;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Lvd2;

    .line 67
    .line 68
    const/16 v4, 0xa

    .line 69
    .line 70
    invoke-direct {v0, v1, v4}, Lvd2;-><init>(Lvn1;I)V

    .line 71
    .line 72
    .line 73
    const-string v4, "debug"

    .line 74
    .line 75
    invoke-virtual {p1, v4, v0}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lvd2;

    .line 79
    .line 80
    const/16 v4, 0xb

    .line 81
    .line 82
    invoke-direct {v0, v1, v4}, Lvd2;-><init>(Lvn1;I)V

    .line 83
    .line 84
    .line 85
    const-string v4, "log"

    .line 86
    .line 87
    invoke-virtual {p1, v4, v0}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, Lvd2;

    .line 91
    .line 92
    const/16 v4, 0xc

    .line 93
    .line 94
    invoke-direct {v0, v1, v4}, Lvd2;-><init>(Lvn1;I)V

    .line 95
    .line 96
    .line 97
    const-string v4, "info"

    .line 98
    .line 99
    invoke-virtual {p1, v4, v0}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Lvd2;

    .line 103
    .line 104
    const/16 v4, 0xd

    .line 105
    .line 106
    invoke-direct {v0, v1, v4}, Lvd2;-><init>(Lvn1;I)V

    .line 107
    .line 108
    .line 109
    const-string v4, "warn"

    .line 110
    .line 111
    invoke-virtual {p1, v4, v0}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, Lvd2;

    .line 115
    .line 116
    const/16 v4, 0xe

    .line 117
    .line 118
    invoke-direct {v0, v1, v4}, Lvd2;-><init>(Lvn1;I)V

    .line 119
    .line 120
    .line 121
    const-string v1, "error"

    .line 122
    .line 123
    invoke-virtual {p1, v1, v0}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p0, p1, v2, v3}, Ls11;->G(Lcom/dokar/quickjs/QuickJs;Lfs1;J)V

    .line 127
    .line 128
    .line 129
    sget-object p1, Lcf2;->a:Lhx2;

    .line 130
    .line 131
    invoke-virtual {p1}, Lhx2;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Ljava/util/Map;

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_0

    .line 150
    .line 151
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Ljava/util/Map$Entry;

    .line 156
    .line 157
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    check-cast v1, Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {p0, v1, v0}, Lcom/dokar/quickjs/QuickJs;->addModule(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_1
    instance-of v0, p1, Ljava/lang/Number;

    .line 14
    .line 15
    if-nez v0, :cond_5

    .line 16
    .line 17
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    instance-of v0, p1, Ljava/util/List;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    move-object v1, p1

    .line 27
    check-cast v1, Ljava/lang/Iterable;

    .line 28
    .line 29
    new-instance v2, Le2;

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x3

    .line 33
    const/4 v3, 0x1

    .line 34
    const-class v5, Laf2;

    .line 35
    .line 36
    const-string v6, "formatLogValue"

    .line 37
    .line 38
    const-string v7, "formatLogValue(Ljava/lang/Object;)Ljava/lang/String;"

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    move-object v4, p0

    .line 42
    invoke-direct/range {v2 .. v10}, Le2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 43
    .line 44
    .line 45
    const/16 v6, 0x19

    .line 46
    .line 47
    move-object v5, v2

    .line 48
    const/4 v2, 0x0

    .line 49
    const-string v3, "["

    .line 50
    .line 51
    const-string v4, "]"

    .line 52
    .line 53
    invoke-static/range {v1 .. v6}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    instance-of p0, p1, Ljava/util/Map;

    .line 59
    .line 60
    if-eqz p0, :cond_4

    .line 61
    .line 62
    check-cast p1, Ljava/util/Map;

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    move-object v0, p0

    .line 69
    check-cast v0, Ljava/lang/Iterable;

    .line 70
    .line 71
    new-instance v4, Lxc2;

    .line 72
    .line 73
    const/16 p0, 0x1c

    .line 74
    .line 75
    invoke-direct {v4, p0}, Lxc2;-><init>(I)V

    .line 76
    .line 77
    .line 78
    const/16 v5, 0x19

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    const-string v2, "{"

    .line 82
    .line 83
    const-string v3, "}"

    .line 84
    .line 85
    invoke-static/range {v0 .. v5}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_5
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0
.end method

.method public final e(Lvn1;Lph2;[Ljava/lang/Object;)V
    .locals 9

    .line 1
    new-instance v0, Le2;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v8, 0x5

    .line 5
    const/4 v1, 0x1

    .line 6
    const-class v3, Laf2;

    .line 7
    .line 8
    const-string v4, "formatLogValue"

    .line 9
    .line 10
    const-string v5, "formatLogValue(Ljava/lang/Object;)Ljava/lang/String;"

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v2, p0

    .line 14
    invoke-direct/range {v0 .. v8}, Le2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 15
    .line 16
    .line 17
    const/16 p0, 0x1e

    .line 18
    .line 19
    const-string v1, " "

    .line 20
    .line 21
    invoke-static {p3, v1, v0, p0}, Lmg;->p0([Ljava/lang/Object;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1, p2, p0}, Lvn1;->t(Lph2;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
