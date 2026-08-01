.class public final synthetic Llb0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic γ:Ljava/lang/Object;

.field public final synthetic δ:Ljava/io/Serializable;

.field public final synthetic ε:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lum1;Lum1;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Llb0;->α:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Llb0;->γ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Llb0;->δ:Ljava/io/Serializable;

    .line 10
    .line 11
    iput-object p3, p0, Llb0;->ε:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Llb0;->β:Ljava/util/concurrent/CountDownLatch;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;Luw0;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Llb0;->α:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb0;->γ:Ljava/lang/Object;

    iput-object p2, p0, Llb0;->β:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Llb0;->ε:Ljava/lang/Object;

    iput-object p4, p0, Llb0;->δ:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Llb0;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llb0;->δ:Ljava/io/Serializable;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Lum1;

    .line 10
    .line 11
    iget-object v0, p0, Llb0;->ε:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lum1;

    .line 15
    .line 16
    iget-object v4, p0, Llb0;->β:Ljava/util/concurrent/CountDownLatch;

    .line 17
    .line 18
    iget-object v1, p0, Llb0;->γ:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v5, p1

    .line 21
    move-object v6, p2

    .line 22
    move-object v7, p3

    .line 23
    invoke-static/range {v1 .. v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->α(Ljava/lang/Object;Lum1;Lum1;Ljava/util/concurrent/CountDownLatch;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_0
    move-object v5, p1

    .line 29
    move-object v6, p2

    .line 30
    move-object v7, p3

    .line 31
    iget-object p1, p0, Llb0;->γ:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    iget-object p2, p0, Llb0;->ε:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, Luw0;

    .line 38
    .line 39
    iget-object p3, p0, Llb0;->δ:Ljava/io/Serializable;

    .line 40
    .line 41
    check-cast p3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-class v1, Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v5, v6, v7}, Lx;->υ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_0
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "onFailure"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object p0, p0, Llb0;->β:Ljava/util/concurrent/CountDownLatch;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    if-eqz v7, :cond_1

    .line 80
    .line 81
    invoke-static {v7}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    move-object p2, v1

    .line 87
    :goto_0
    invoke-static {p2}, Lx;->φ(Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :cond_2
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    if-eqz p2, :cond_2

    .line 103
    .line 104
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, Lx;->ο(Ljava/lang/Class;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    if-eqz v7, :cond_5

    .line 120
    .line 121
    invoke-static {v7}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    :cond_5
    if-eqz v1, :cond_8

    .line 126
    .line 127
    :try_start_0
    invoke-static {v7}, Lg7;->а([Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {v0, p2}, Lx;->Ε(Ljava/lang/Object;Luw0;)Lpb0;

    .line 135
    .line 136
    .line 137
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    goto :goto_2

    .line 139
    :catchall_0
    move-exception v0

    .line 140
    move-object p2, v0

    .line 141
    new-instance v0, Leo1;

    .line 142
    .line 143
    invoke-direct {v0, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    move-object p2, v0

    .line 147
    :goto_2
    instance-of v0, p2, Leo1;

    .line 148
    .line 149
    if-nez v0, :cond_6

    .line 150
    .line 151
    move-object v0, p2

    .line 152
    check-cast v0, Lpb0;

    .line 153
    .line 154
    invoke-virtual {p3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_6
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-eqz p2, :cond_7

    .line 162
    .line 163
    invoke-static {p2}, Lx;->Ω(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    const-string p3, "\u7fa4\u7533\u8bf7\u8fd4\u56de\u89e3\u6790\u5931\u8d25\uff1a"

    .line 168
    .line 169
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_7
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {p0}, Lx;->ο(Ljava/lang/Class;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    goto :goto_3

    .line 191
    :cond_8
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-static {p0}, Lx;->ο(Ljava/lang/Class;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    :goto_3
    return-object p0

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
