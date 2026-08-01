.class public final Ll7;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 0

    .line 12
    iput p1, p0, Ll7;->a:I

    iput-object p2, p0, Ll7;->c:Ljava/lang/ClassLoader;

    iput-object p3, p0, Ll7;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ll7;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ll7;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Ll7;->c:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Ll7;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class v0, Lga;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    sget-object v1, Lga;->l:Ll7;

    .line 10
    .line 11
    if-ne v1, p0, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    sput-object v1, Lga;->l:Ll7;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const-string v0, "eq_home_pull_guard"

    .line 21
    .line 22
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Ll7;->c:Ljava/lang/ClassLoader;

    .line 29
    .line 30
    iget-object p0, p0, Ll7;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, p0}, Lga;->i(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw p0

    .line 38
    :pswitch_0
    const-string v0, "eq_home_pull_guard"

    .line 39
    .line 40
    const-string v1, "mini pull dex hints installed: header="

    .line 41
    .line 42
    :try_start_2
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_2
    iget-object v2, p0, Ll7;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v2}, Li5;->m0(Ljava/lang/String;)Lo4;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v3, v2, Lo4;->a:Ljava/lang/String;

    .line 57
    .line 58
    if-nez v3, :cond_5

    .line 59
    .line 60
    iget-object v3, v2, Lo4;->c:Ljava/io/Serializable;

    .line 61
    .line 62
    check-cast v3, Ljava/util/HashSet;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    iget-boolean v3, v2, Lo4;->b:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 71
    .line 72
    if-eqz v3, :cond_3

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    :try_start_3
    sget-object v2, Lga;->k:Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    if-lez v3, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :catchall_1
    :cond_4
    :try_start_4
    const-string v2, ""

    .line 87
    .line 88
    :goto_2
    invoke-static {v2}, Li5;->m0(Ljava/lang/String;)Lo4;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    :cond_5
    :goto_3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_6

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_6
    iget-object v0, p0, Ll7;->c:Ljava/lang/ClassLoader;

    .line 100
    .line 101
    invoke-static {v0, v2}, Lga;->j(Ljava/lang/ClassLoader;Lo4;)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object p0, p0, Ll7;->c:Ljava/lang/ClassLoader;

    .line 106
    .line 107
    invoke-static {p0}, Lga;->l(Ljava/lang/ClassLoader;)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-gtz v0, :cond_7

    .line 112
    .line 113
    if-lez p0, :cond_8

    .line 114
    .line 115
    :cond_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v0, ", source="

    .line 124
    .line 125
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :catchall_2
    move-exception p0

    .line 140
    const-string v0, "mini-dex-hints-async-failed"

    .line 141
    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v2, "mini pull dex hints failed: "

    .line 145
    .line 146
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v2, ": "

    .line 161
    .line 162
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {v0, p0}, Lga;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_8
    :goto_4
    return-void

    .line 180
    :pswitch_1
    iget-object v0, p0, Ll7;->c:Ljava/lang/ClassLoader;

    .line 181
    .line 182
    iget-object p0, p0, Ll7;->b:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v0, p0}, Lga;->i(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
