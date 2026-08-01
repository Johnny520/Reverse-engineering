.class public final synthetic LA0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, LA0/v;->a:I

    iput-object p1, p0, LA0/v;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, LA0/v;->b:Landroid/app/Activity;

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget v0, v1, LA0/v;->a:I

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_a

    .line 17
    .line 18
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v5, 0x1c

    .line 21
    .line 22
    if-lt v0, v5, :cond_0

    .line 23
    .line 24
    sget-object v0, Lo/c;->a:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_8

    .line 30
    .line 31
    :cond_0
    sget-object v5, Lo/c;->a:Ljava/lang/Class;

    .line 32
    .line 33
    const/16 v5, 0x1b

    .line 34
    .line 35
    const/16 v6, 0x1a

    .line 36
    .line 37
    if-eq v0, v6, :cond_2

    .line 38
    .line 39
    if-ne v0, v5, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v7, v4

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :goto_0
    move v7, v3

    .line 45
    :goto_1
    sget-object v8, Lo/c;->f:Ljava/lang/reflect/Method;

    .line 46
    .line 47
    if-eqz v7, :cond_3

    .line 48
    .line 49
    if-nez v8, :cond_3

    .line 50
    .line 51
    goto/16 :goto_7

    .line 52
    .line 53
    :cond_3
    sget-object v7, Lo/c;->e:Ljava/lang/reflect/Method;

    .line 54
    .line 55
    if-nez v7, :cond_4

    .line 56
    .line 57
    sget-object v7, Lo/c;->d:Ljava/lang/reflect/Method;

    .line 58
    .line 59
    if-nez v7, :cond_4

    .line 60
    .line 61
    goto/16 :goto_7

    .line 62
    .line 63
    :cond_4
    :try_start_0
    sget-object v7, Lo/c;->c:Ljava/lang/reflect/Field;

    .line 64
    .line 65
    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    if-nez v9, :cond_5

    .line 70
    .line 71
    goto/16 :goto_7

    .line 72
    .line 73
    :cond_5
    sget-object v7, Lo/c;->b:Ljava/lang/reflect/Field;

    .line 74
    .line 75
    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :cond_6
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    new-instance v11, Lo/b;

    .line 88
    .line 89
    invoke-direct {v11, v2}, Lo/b;-><init>(Landroid/app/Activity;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v10, v11}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 93
    .line 94
    .line 95
    sget-object v12, Lo/c;->g:Landroid/os/Handler;

    .line 96
    .line 97
    :try_start_1
    new-instance v13, Lo/a;

    .line 98
    .line 99
    invoke-direct {v13, v11, v9, v4}, Lo/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v13}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 103
    .line 104
    .line 105
    if-eq v0, v6, :cond_8

    .line 106
    .line 107
    if-ne v0, v5, :cond_7

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_7
    move v0, v4

    .line 111
    goto :goto_3

    .line 112
    :cond_8
    :goto_2
    move v0, v3

    .line 113
    :goto_3
    if-eqz v0, :cond_9

    .line 114
    .line 115
    move-object v5, v12

    .line 116
    :try_start_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 121
    .line 122
    move-object v6, v10

    .line 123
    const/4 v10, 0x0

    .line 124
    move-object v14, v11

    .line 125
    const/4 v11, 0x0

    .line 126
    move-object v15, v14

    .line 127
    const/4 v14, 0x0

    .line 128
    move-object/from16 v16, v15

    .line 129
    .line 130
    const/4 v15, 0x0

    .line 131
    move-object/from16 v17, v16

    .line 132
    .line 133
    move-object/from16 v16, v13

    .line 134
    .line 135
    move-object/from16 v18, v17

    .line 136
    .line 137
    move-object/from16 v17, v13

    .line 138
    .line 139
    move-object/from16 v19, v5

    .line 140
    .line 141
    move-object/from16 v5, v18

    .line 142
    .line 143
    :try_start_3
    filled-new-array/range {v9 .. v17}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v8, v7, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :catchall_0
    move-exception v0

    .line 152
    :goto_4
    move-object/from16 v7, v19

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :catchall_1
    move-exception v0

    .line 156
    move-object/from16 v19, v5

    .line 157
    .line 158
    move-object v6, v10

    .line 159
    move-object v5, v11

    .line 160
    goto :goto_4

    .line 161
    :cond_9
    move-object v6, v10

    .line 162
    move-object v5, v11

    .line 163
    move-object/from16 v19, v12

    .line 164
    .line 165
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 166
    .line 167
    .line 168
    :goto_5
    :try_start_4
    new-instance v0, Lo/a;

    .line 169
    .line 170
    invoke-direct {v0, v6, v5, v3, v4}, Lo/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 171
    .line 172
    .line 173
    move-object/from16 v7, v19

    .line 174
    .line 175
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_8

    .line 179
    :goto_6
    new-instance v8, Lo/a;

    .line 180
    .line 181
    invoke-direct {v8, v6, v5, v3, v4}, Lo/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 185
    .line 186
    .line 187
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 188
    :catchall_2
    :goto_7
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 189
    .line 190
    .line 191
    :cond_a
    :goto_8
    return-void

    .line 192
    :pswitch_0
    sget-object v0, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 193
    .line 194
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-nez v0, :cond_b

    .line 199
    .line 200
    move-object v0, v2

    .line 201
    :cond_b
    const-string v3, "lifecycle-resume"

    .line 202
    .line 203
    invoke-static {v2, v0, v3}, LA0/y;->a(Landroid/app/Activity;Landroid/content/Context;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
