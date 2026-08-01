.class public final synthetic Lo90;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/io/Serializable;

.field public final synthetic κ:Ljava/lang/Object;

.field public final synthetic λ:Ljava/lang/Object;

.field public final synthetic μ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ls90;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Lm90;Ln90;Lpu;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lo90;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lo90;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lo90;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lo90;->ι:Ljava/io/Serializable;

    .line 12
    .line 13
    iput-object p4, p0, Lo90;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    iput-object p5, p0, Lo90;->κ:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lo90;->λ:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Lo90;->μ:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/util/LinkedHashMap;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    .line 22
    const/4 v0, 0x1

    iput v0, p0, Lo90;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo90;->η:Ljava/lang/Object;

    iput-object p2, p0, Lo90;->θ:Ljava/lang/Object;

    iput-object p3, p0, Lo90;->ι:Ljava/io/Serializable;

    iput-object p4, p0, Lo90;->κ:Ljava/lang/Object;

    iput-object p5, p0, Lo90;->λ:Ljava/lang/Object;

    iput-object p6, p0, Lo90;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p7, p0, Lo90;->μ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lo90;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo90;->η:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/reflect/Method;

    .line 9
    .line 10
    iget-object v1, p0, Lo90;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v2, p0, Lo90;->ι:Ljava/io/Serializable;

    .line 13
    .line 14
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    iget-object v3, p0, Lo90;->κ:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v4, p0, Lo90;->λ:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v5, p0, Lo90;->μ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Ljava/util/concurrent/CountDownLatch;

    .line 23
    .line 24
    :try_start_0
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    instance-of v1, v0, Ljava/lang/reflect/InvocationTargetException;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    move-object v1, v0

    .line 38
    check-cast v1, Ljava/lang/reflect/InvocationTargetException;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v1, 0x0

    .line 42
    :goto_0
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object v0, v1

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    :goto_2
    iget-object p0, p0, Lo90;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 65
    .line 66
    .line 67
    :goto_3
    return-void

    .line 68
    :pswitch_0
    const-string v0, "GeoNames \u56fd\u5916\u5730\u533a\u6570\u636e\u5e93\u4e0b\u8f7d\u3001\u89e3\u538b\u548c\u6821\u9a8c\u5b8c\u6210\uff0c\u6765\u6e90="

    .line 69
    .line 70
    iget-object v1, p0, Lo90;->η:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Landroid/content/Context;

    .line 73
    .line 74
    iget-object v2, p0, Lo90;->θ:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Ls90;

    .line 77
    .line 78
    iget-object v3, p0, Lo90;->ι:Ljava/io/Serializable;

    .line 79
    .line 80
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 81
    .line 82
    iget-object v4, p0, Lo90;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 83
    .line 84
    iget-object v5, p0, Lo90;->κ:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v5, Lm90;

    .line 87
    .line 88
    iget-object v6, p0, Lo90;->λ:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v6, Ln90;

    .line 91
    .line 92
    iget-object p0, p0, Lo90;->μ:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, Lpu;

    .line 95
    .line 96
    const-string v7, "raf02e3c7781e553e"

    .line 97
    .line 98
    sget-object v8, Lu90;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 99
    .line 100
    const-string v9, "GeoNames \u56fd\u5916\u5730\u533a\u6570\u636e\u5e93\u4e0b\u8f7d\u7ed3\u675f\uff0c\u6765\u6e90="

    .line 101
    .line 102
    const/4 v10, 0x0

    .line 103
    const/4 v11, 0x0

    .line 104
    :try_start_1
    invoke-static {v1, v2, v3, v4, v5}, Lu90;->γ(Landroid/content/Context;Ls90;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Lm90;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_4

    .line 112
    .line 113
    iget-object v1, v2, Ls90;->ζ:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const/4 v1, 0x4

    .line 120
    invoke-static {v7, v0, v11, v1, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, Ln90;->invoke()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v11}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Luk1;

    .line 131
    .line 132
    if-eqz p0, :cond_3

    .line 133
    .line 134
    :goto_4
    invoke-virtual {p0}, Luk1;->γ()V

    .line 135
    .line 136
    .line 137
    :cond_3
    invoke-virtual {v8, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 138
    .line 139
    .line 140
    goto :goto_7

    .line 141
    :catchall_1
    move-exception v0

    .line 142
    goto :goto_5

    .line 143
    :cond_4
    :try_start_2
    new-instance v0, Lk30;

    .line 144
    .line 145
    invoke-direct {v0}, Lk30;-><init>()V

    .line 146
    .line 147
    .line 148
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    :goto_5
    :try_start_3
    iget-object v1, v2, Ls90;->ζ:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    if-nez v2, :cond_5

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    goto :goto_6

    .line 166
    :catchall_2
    move-exception p0

    .line 167
    goto :goto_8

    .line 168
    :cond_5
    :goto_6
    new-instance v3, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v1, "\uff0c\u539f\u56e0="

    .line 177
    .line 178
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v7, v1, v0}, Lux;->τ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v0}, Lpu;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4, v11}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    check-cast p0, Luk1;

    .line 199
    .line 200
    if-eqz p0, :cond_3

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :goto_7
    return-void

    .line 204
    :goto_8
    invoke-virtual {v4, v11}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Luk1;

    .line 209
    .line 210
    if-eqz v0, :cond_6

    .line 211
    .line 212
    invoke-virtual {v0}, Luk1;->γ()V

    .line 213
    .line 214
    .line 215
    :cond_6
    invoke-virtual {v8, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 216
    .line 217
    .line 218
    throw p0

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
