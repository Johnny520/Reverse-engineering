.class public final synthetic Lc9/o1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lr8/g;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lr8/g;I)V
    .locals 0

    .line 10
    iput p3, p0, Lc9/o1;->g:I

    iput-object p2, p0, Lc9/o1;->h:Lr8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr8/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lc9/o1;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/o1;->h:Lr8/g;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lc9/o1;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lc9/o1;->h:Lr8/g;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lhh/o;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v0, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    new-instance v0, Lsf/f;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v0

    .line 29
    :goto_0
    nop

    .line 30
    instance-of v0, p1, Lsf/f;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move-object v1, p1

    .line 36
    :goto_1
    check-cast v1, Ljava/lang/reflect/Method;

    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_0
    check-cast p1, Leb/i;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v0, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 45
    .line 46
    iget-object v8, v2, Lr8/g;->a:Landroid/content/Context;

    .line 47
    .line 48
    iget-object v4, p1, Leb/i;->a:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v5, p1, Leb/i;->c:Ljava/lang/String;

    .line 51
    .line 52
    iget v6, p1, Leb/i;->d:I

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v7, Lx8/r;

    .line 58
    .line 59
    invoke-direct {v7, v8}, Lx8/r;-><init>(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    const-string p1, "auto_accept_enable"

    .line 63
    .line 64
    invoke-virtual {v7, p1}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_1
    sget-object p1, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 72
    .line 73
    new-instance v3, Llb/a;

    .line 74
    .line 75
    invoke-direct/range {v3 .. v8}, Llb/a;-><init>(Ljava/lang/String;Ljava/lang/String;ILx8/r;Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_1
    check-cast p1, Lhh/o;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    :try_start_1
    iget-object v0, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 92
    .line 93
    .line 94
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    goto :goto_3

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    move-object p1, v0

    .line 98
    new-instance v0, Lsf/f;

    .line 99
    .line 100
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    move-object p1, v0

    .line 104
    :goto_3
    nop

    .line 105
    instance-of v0, p1, Lsf/f;

    .line 106
    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_2
    move-object v1, p1

    .line 111
    :goto_4
    check-cast v1, Ljava/lang/reflect/Method;

    .line 112
    .line 113
    return-object v1

    .line 114
    :pswitch_2
    check-cast p1, Lhh/o;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    :try_start_2
    iget-object v0, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 122
    .line 123
    .line 124
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 125
    goto :goto_5

    .line 126
    :catchall_2
    move-exception v0

    .line 127
    move-object p1, v0

    .line 128
    new-instance v0, Lsf/f;

    .line 129
    .line 130
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    move-object p1, v0

    .line 134
    :goto_5
    nop

    .line 135
    instance-of v0, p1, Lsf/f;

    .line 136
    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_3
    move-object v1, p1

    .line 141
    :goto_6
    check-cast v1, Ljava/lang/reflect/Method;

    .line 142
    .line 143
    return-object v1

    .line 144
    :pswitch_3
    check-cast p1, Lhh/o;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    :try_start_3
    iget-object v0, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 150
    .line 151
    invoke-virtual {p1, v0}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 155
    goto :goto_7

    .line 156
    :catchall_3
    move-exception v0

    .line 157
    move-object p1, v0

    .line 158
    new-instance v0, Lsf/f;

    .line 159
    .line 160
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    move-object p1, v0

    .line 164
    :goto_7
    nop

    .line 165
    instance-of v0, p1, Lsf/f;

    .line 166
    .line 167
    if-eqz v0, :cond_4

    .line 168
    .line 169
    goto :goto_8

    .line 170
    :cond_4
    move-object v1, p1

    .line 171
    :goto_8
    check-cast v1, Ljava/lang/reflect/Method;

    .line 172
    .line 173
    return-object v1

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
