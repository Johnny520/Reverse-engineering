.class public final synthetic Lp1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lp1;->b:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lp1;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lp1;->b:Landroid/app/Activity;

    .line 9
    .line 10
    :try_start_0
    invoke-static {v0}, Lxh;->g(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    const-string v0, "HkhtcOOmUAowRVxG3aZWDA==\n"

    .line 15
    .line 16
    const-string v2, "Uy0DBa/HJWQ=\n"

    .line 17
    .line 18
    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, "tw==\n"

    .line 23
    .line 24
    const-string v3, "0vI8ySRxU5w=\n"

    .line 25
    .line 26
    const-string v4, "06ke\n"

    .line 27
    .line 28
    const-string v5, "p8h5VTpLcuY=\n"

    .line 29
    .line 30
    invoke-static {v4, v5, v0, v2, v3}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :pswitch_0
    iget-object v2, v1, Lp1;->b:Landroid/app/Activity;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_9

    .line 41
    .line 42
    sget-object v3, Ls1;->g:Landroid/os/Handler;

    .line 43
    .line 44
    sget-object v0, Ls1;->f:Ljava/lang/reflect/Method;

    .line 45
    .line 46
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/16 v5, 0x1c

    .line 49
    .line 50
    if-lt v4, v5, :cond_0

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_0
    const/16 v5, 0x1b

    .line 58
    .line 59
    const/16 v6, 0x1a

    .line 60
    .line 61
    if-eq v4, v6, :cond_1

    .line 62
    .line 63
    if-ne v4, v5, :cond_2

    .line 64
    .line 65
    :cond_1
    if-nez v0, :cond_2

    .line 66
    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :cond_2
    sget-object v7, Ls1;->e:Ljava/lang/reflect/Method;

    .line 70
    .line 71
    if-nez v7, :cond_3

    .line 72
    .line 73
    sget-object v7, Ls1;->d:Ljava/lang/reflect/Method;

    .line 74
    .line 75
    if-nez v7, :cond_3

    .line 76
    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_3
    :try_start_1
    sget-object v7, Ls1;->c:Ljava/lang/reflect/Field;

    .line 80
    .line 81
    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    if-nez v8, :cond_4

    .line 86
    .line 87
    goto/16 :goto_5

    .line 88
    .line 89
    :cond_4
    sget-object v7, Ls1;->b:Ljava/lang/reflect/Field;

    .line 90
    .line 91
    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    if-nez v7, :cond_5

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_5
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    new-instance v10, Lr1;

    .line 103
    .line 104
    invoke-direct {v10, v2}, Lr1;-><init>(Landroid/app/Activity;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9, v10}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 108
    .line 109
    .line 110
    new-instance v11, Lh1;

    .line 111
    .line 112
    const/4 v12, 0x1

    .line 113
    const/4 v13, 0x0

    .line 114
    invoke-direct {v11, v10, v8, v12, v13}, Lh1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 118
    .line 119
    .line 120
    const/4 v11, 0x0

    .line 121
    if-eq v4, v6, :cond_7

    .line 122
    .line 123
    if-ne v4, v5, :cond_6

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    move v4, v11

    .line 127
    goto :goto_2

    .line 128
    :cond_7
    :goto_1
    const/4 v4, 0x1

    .line 129
    :goto_2
    if-eqz v4, :cond_8

    .line 130
    .line 131
    :try_start_2
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    const/4 v14, 0x0

    .line 139
    move-object v4, v9

    .line 140
    const/4 v9, 0x0

    .line 141
    move-object v5, v10

    .line 142
    const/4 v10, 0x0

    .line 143
    move-object v15, v12

    .line 144
    move-object/from16 v16, v12

    .line 145
    .line 146
    :try_start_3
    filled-new-array/range {v8 .. v16}, [Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v0, v7, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :catchall_1
    move-exception v0

    .line 155
    goto :goto_4

    .line 156
    :catchall_2
    move-exception v0

    .line 157
    move-object v4, v9

    .line 158
    move-object v5, v10

    .line 159
    goto :goto_4

    .line 160
    :cond_8
    move-object v4, v9

    .line 161
    move-object v5, v10

    .line 162
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 163
    .line 164
    .line 165
    :goto_3
    :try_start_4
    new-instance v0, Lh1;

    .line 166
    .line 167
    const/4 v6, 0x2

    .line 168
    const/4 v7, 0x0

    .line 169
    invoke-direct {v0, v4, v5, v6, v7}, Lh1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :goto_4
    new-instance v6, Lh1;

    .line 177
    .line 178
    const/4 v7, 0x2

    .line 179
    const/4 v8, 0x0

    .line 180
    invoke-direct {v6, v4, v5, v7, v8}, Lh1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 184
    .line 185
    .line 186
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 187
    :catchall_3
    :goto_5
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 188
    .line 189
    .line 190
    :cond_9
    :goto_6
    return-void

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
