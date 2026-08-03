.class public final Li4/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li4/a0;Li4/m;Ln4/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p2, Li4/m;->a:Ll4/b;

    .line 5
    .line 6
    if-eqz p3, :cond_2

    .line 7
    .line 8
    iput-object p1, p0, Li4/c0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p1, p2, Li4/m;->c:Lh4/c;

    .line 11
    .line 12
    iget-object p1, p1, Lh4/c;->d:Li4/l;

    .line 13
    .line 14
    iput-object p1, p0, Li4/c0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p2, p0, Li4/c0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p1, p2, Li4/m;->e:Li4/r;

    .line 19
    .line 20
    iput-object p1, p0, Li4/c0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance p1, Lf1/h;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lf1/h;-><init>(Li4/c0;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Li4/c0;->e:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p3, p0, Li4/c0;->f:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object p1, p2, Li4/m;->b:Lk4/b;

    .line 32
    .line 33
    invoke-virtual {p1}, Lk4/b;->d()V

    .line 34
    .line 35
    .line 36
    iget p1, p1, Lk4/b;->e:I

    .line 37
    .line 38
    and-int/lit16 p1, p1, 0x200

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Ll4/a;->d()Lv4/z;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p1, p1, Lv4/z;->g:Lv4/c0;

    .line 47
    .line 48
    iget-object p1, p1, Lv4/c0;->g:Ljava/lang/String;

    .line 49
    .line 50
    const-string p2, "<clinit>"

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    const/16 p1, 0x18

    .line 59
    .line 60
    invoke-virtual {p3, p1}, Ln4/a;->a(I)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_1

    .line 65
    .line 66
    invoke-interface {v0}, Ll4/a;->c()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    and-int/lit8 p2, p2, 0x8

    .line 71
    .line 72
    if-eqz p2, :cond_0

    .line 73
    .line 74
    const-string p2, "static"

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string p2, "default"

    .line 78
    .line 79
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/16 v1, 0xd

    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v0}, Ll4/a;->b()Lv4/d0;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget-object v2, v2, Lv4/d0;->g:Lw4/c;

    .line 94
    .line 95
    invoke-virtual {v2}, Lw4/c;->a()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v0}, Ll4/a;->d()Lv4/z;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v3}, Lv4/z;->a()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    filled-new-array {p2, p1, v1, v2, v3}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const-string p2, "defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s"

    .line 112
    .line 113
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {v0}, Ll4/a;->b()Lv4/d0;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    iget-object p2, p2, Lv4/d0;->g:Lw4/c;

    .line 122
    .line 123
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-interface {v0}, Ll4/a;->d()Lv4/z;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Lv4/z;->a()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const-string v1, "."

    .line 136
    .line 137
    const-string v2, ": "

    .line 138
    .line 139
    const-string v3, "WARNING in "

    .line 140
    .line 141
    invoke-static {v3, p2, v1, v0, v2}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iget-object p2, p3, Ln4/a;->a:Ljava/io/PrintStream;

    .line 153
    .line 154
    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_1
    return-void

    .line 158
    :cond_2
    const-string p1, "dexOptions == null"

    .line 159
    .line 160
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const/4 p1, 0x0

    .line 164
    throw p1
.end method

.method public constructor <init>(Lud/u;)V
    .locals 1

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    new-instance v0, Lb5/h;

    invoke-direct {v0}, Lb5/h;-><init>()V

    iput-object v0, p0, Li4/c0;->b:Ljava/lang/Object;

    .line 167
    new-instance v0, Lb5/h;

    invoke-direct {v0}, Lb5/h;-><init>()V

    iput-object v0, p0, Li4/c0;->c:Ljava/lang/Object;

    .line 168
    new-instance v0, Lb5/h;

    invoke-direct {v0}, Lb5/h;-><init>()V

    iput-object v0, p0, Li4/c0;->d:Ljava/lang/Object;

    .line 169
    new-instance v0, Lb5/h;

    invoke-direct {v0}, Lb5/h;-><init>()V

    iput-object v0, p0, Li4/c0;->e:Ljava/lang/Object;

    .line 170
    new-instance v0, Lb5/h;

    invoke-direct {v0}, Lb5/h;-><init>()V

    iput-object v0, p0, Li4/c0;->f:Ljava/lang/Object;

    .line 171
    iput-object p1, p0, Li4/c0;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a()Li4/b0;
    .locals 3

    .line 1
    new-instance v0, Li4/b0;

    .line 2
    .line 3
    const-string v1, "stack mismatch: illegal top-of-stack for opcode"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static b(Lw4/c;Lw4/c;)Lw4/c;
    .locals 1

    .line 1
    sget-object v0, Lw4/c;->x:Lw4/c;

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lw4/c;->t()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lw4/c;->e()Lw4/c;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    sget-object v0, Lw4/c;->E:Lw4/c;

    .line 18
    .line 19
    if-ne p0, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Lw4/c;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lw4/c;->k()Lw4/c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lw4/c;->t()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_2
    sget-object v0, Lw4/c;->p:Lw4/c;

    .line 39
    .line 40
    if-ne p0, v0, :cond_3

    .line 41
    .line 42
    sget-object v0, Lw4/c;->R:Lw4/c;

    .line 43
    .line 44
    if-ne p1, v0, :cond_3

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_3
    invoke-virtual {p0}, Lw4/c;->e()Lw4/c;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public static j(Ljava/util/Set;)Ljava/util/List;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

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
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 20
    .line 21
    return-object p0
.end method


# virtual methods
.method public c(Lnd/b0;Lqd/j;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lhc/a;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lt3/c;->b(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    check-cast p1, Lud/r;

    .line 18
    .line 19
    new-instance v0, Lre/b;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-direct {v0, p0, p1, v1}, Lre/b;-><init>(Li4/c0;Lud/r;I)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-interface {p1}, Lhc/a;->j()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    packed-switch p1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    const-string p1, "null"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_0
    const-string p1, "END"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_1
    const-string p1, "OFFSET"

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_2
    const-string p1, "DECLARATION"

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_3
    const-string p1, "VAR_REF"

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_4
    const-string p1, "VAR"

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_5
    const-string p1, "PKG"

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_6
    const-string p1, "METHOD"

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_7
    const-string p1, "FIELD"

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_8
    const-string p1, "CLASS"

    .line 61
    .line 62
    :goto_0
    const-string p2, "Unexpected use type: "

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    check-cast p1, Lud/g;

    .line 73
    .line 74
    iget-object p1, p1, Lud/g;->k:Lud/e;

    .line 75
    .line 76
    new-instance v0, Lre/a;

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    invoke-direct {v0, p0, p1, v1}, Lre/a;-><init>(Li4/c0;Lud/e;I)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    check-cast p1, Lud/e;

    .line 84
    .line 85
    new-instance v0, Lre/a;

    .line 86
    .line 87
    const/4 v1, 0x1

    .line 88
    invoke-direct {v0, p0, p1, v1}, Lre/a;-><init>(Li4/c0;Lud/e;I)V

    .line 89
    .line 90
    .line 91
    :goto_1
    invoke-virtual {p0, p2, v0}, Li4/c0;->i(Lqd/j;Ljava/util/function/Consumer;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
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

.method public d(Lud/e;Lud/e;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lud/e;->a0()Lud/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Li4/c0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lb5/h;

    .line 8
    .line 9
    invoke-virtual {p2}, Lud/e;->a0()Lud/e;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v0, v2}, Lb5/h;->a(Lnd/b0;Lnd/b0;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Li4/c0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lb5/h;

    .line 19
    .line 20
    invoke-virtual {v1, p2, p1}, Lb5/h;->a(Lnd/b0;Lnd/b0;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p2, v0}, Lb5/h;->a(Lnd/b0;Lnd/b0;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public e(Lud/r;Lqd/j;)V
    .locals 2

    .line 1
    new-instance v0, Lre/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lre/b;-><init>(Li4/c0;Lud/r;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2, v0}, Li4/c0;->i(Lqd/j;Ljava/util/function/Consumer;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Lud/r;Lud/e;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lud/r;->l:Lud/e;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p2}, Li4/c0;->d(Lud/e;Lud/e;)V

    .line 4
    .line 5
    .line 6
    if-eq v0, p2, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Li4/c0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lb5/h;

    .line 11
    .line 12
    invoke-virtual {v0, p2, p1}, Lb5/h;->a(Lnd/b0;Lnd/b0;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Li4/c0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li4/m;

    .line 4
    .line 5
    iget-object v0, v0, Li4/m;->a:Ll4/b;

    .line 6
    .line 7
    invoke-interface {v0}, Ll4/a;->b()Lv4/d0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, Lv4/d0;->g:Lw4/c;

    .line 12
    .line 13
    invoke-virtual {v1}, Lw4/c;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0}, Ll4/a;->d()Lv4/z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lv4/z;->a()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v2, "."

    .line 26
    .line 27
    const-string v3, ": "

    .line 28
    .line 29
    const-string v4, "ERROR in "

    .line 30
    .line 31
    invoke-static {v4, v1, v2, v0, v3}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, Li4/b0;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {v0, p1, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method

.method public h(Lnd/b0;Lod/c;)V
    .locals 3

    .line 1
    iget-object v0, p0, Li4/c0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/u;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lud/u;->h(Lod/c;)Lud/g;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p2, Lud/g;->k:Lud/e;

    .line 13
    .line 14
    invoke-interface {p1}, Lhc/a;->j()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v1}, Lt3/c;->b(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eq v1, v2, :cond_1

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :cond_1
    check-cast p1, Lud/r;

    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Li4/c0;->f(Lud/r;Lud/e;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Li4/c0;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lb5/h;

    .line 36
    .line 37
    invoke-virtual {v0, p2, p1}, Lb5/h;->a(Lnd/b0;Lnd/b0;)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p2, Lud/g;->n:Lqd/j;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Li4/c0;->e(Lud/r;Lqd/j;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    check-cast p1, Lud/e;

    .line 47
    .line 48
    invoke-virtual {p0, p1, v0}, Li4/c0;->d(Lud/e;Lud/e;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public i(Lqd/j;Ljava/util/function/Consumer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Li4/c0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/u;

    .line 4
    .line 5
    if-eqz p1, :cond_6

    .line 6
    .line 7
    sget-object v1, Lqd/j;->k:Lqd/e;

    .line 8
    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    instance-of v1, p1, Lqd/a;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lqd/j;->h()Lqd/j;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1, p2}, Li4/c0;->i(Lqd/j;Ljava/util/function/Consumer;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p1}, Lqd/j;->v()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_6

    .line 30
    .line 31
    iget-object v1, v0, Lud/u;->s:Led/c;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Led/c;->c(Lqd/j;)Led/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget v1, v1, Led/b;->f:I

    .line 40
    .line 41
    const/4 v2, 0x4

    .line 42
    if-ne v1, v2, :cond_2

    .line 43
    .line 44
    iget-object v1, v0, Lud/u;->k:Ll3/w;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {v0, p1}, Lud/u;->g(Lqd/j;)Lud/e;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-interface {p2, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {p1}, Lqd/j;->j()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lxe/s;->n(Ljava/util/Collection;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lqd/j;

    .line 83
    .line 84
    invoke-virtual {p0, v1, p2}, Li4/c0;->i(Lqd/j;Ljava/util/function/Consumer;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    invoke-virtual {p1}, Lqd/j;->i()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Lxe/s;->n(Ljava/util/Collection;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_5

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Lqd/j;

    .line 113
    .line 114
    invoke-virtual {p0, v1, p2}, Li4/c0;->i(Lqd/j;Ljava/util/function/Consumer;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    invoke-virtual {p1}, Lqd/j;->r()Lqd/j;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    invoke-virtual {p0, p1, p2}, Li4/c0;->i(Lqd/j;Ljava/util/function/Consumer;)V

    .line 125
    .line 126
    .line 127
    :cond_6
    :goto_2
    return-void
.end method
