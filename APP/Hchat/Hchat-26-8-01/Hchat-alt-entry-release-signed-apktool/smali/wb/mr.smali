.class public final synthetic Lwb/mr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Lfb/y;

.field public final synthetic i:Z

.field public final synthetic j:Li0/j1;

.field public final synthetic k:I

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lwb/yt;

.field public final synthetic r:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;Lfb/y;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/j1;Ljava/lang/String;Lwb/yt;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lwb/mr;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, Lwb/mr;->h:Lfb/y;

    .line 7
    .line 8
    iput-boolean p12, p0, Lwb/mr;->i:Z

    .line 9
    .line 10
    iput-object p9, p0, Lwb/mr;->j:Li0/j1;

    .line 11
    .line 12
    iput p1, p0, Lwb/mr;->k:I

    .line 13
    .line 14
    iput-object p4, p0, Lwb/mr;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p5, p0, Lwb/mr;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p6, p0, Lwb/mr;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p7, p0, Lwb/mr;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/mr;->p:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/mr;->q:Lwb/yt;

    .line 25
    .line 26
    iput-object p8, p0, Lwb/mr;->r:Li0/a1;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget-object v5, p0, Lwb/mr;->g:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v3, p0, Lwb/mr;->h:Lfb/y;

    .line 4
    .line 5
    iget-boolean v6, p0, Lwb/mr;->i:Z

    .line 6
    .line 7
    :try_start_0
    invoke-static {v3}, Lfb/a2;->c(Lfb/y;)Lfb/y;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, v0, Lfb/y;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Lfb/a2;->f(Lfb/y;)Lfb/z1;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lfb/z1;->a()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_5

    .line 22
    .line 23
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 24
    .line 25
    invoke-virtual {v2, v5}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    new-instance v7, Ljava/io/File;

    .line 34
    .line 35
    invoke-direct {v7, v4, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v7}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v7}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-static {v9, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    if-eqz v9, :cond_4

    .line 55
    .line 56
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_4

    .line 61
    .line 62
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_1

    .line 67
    .line 68
    if-nez v6, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v1, "\u63d2\u4ef6\u5df2\u5b58\u5728\uff0c\u9700\u8981\u786e\u8ba4\u8986\u76d6"

    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :cond_1
    :goto_0
    sget-object v7, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v4, v8}, Lfb/t2;->t(Ljava/io/File;Ljava/io/File;)V

    .line 88
    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    invoke-virtual {v2, v5, v1, v4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-static {v2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_3

    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_3

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_2

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    const-string v0, "\u521b\u5efa\u63d2\u4ef6\u76ee\u5f55\u5931\u8d25"

    .line 118
    .line 119
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 120
    .line 121
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_3
    :goto_1
    new-instance v2, Ljava/io/File;

    .line 126
    .line 127
    const-string v7, "main.java"

    .line 128
    .line 129
    invoke-direct {v2, v8, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v7, v0, Lfb/y;->d:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v2, v7}, La/a;->l(Ljava/io/File;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v2, Ljava/io/File;

    .line 138
    .line 139
    const-string v7, "info.prop"

    .line 140
    .line 141
    invoke-direct {v2, v8, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iget-object v0, v0, Lfb/y;->c:Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v2, v0}, La/a;->l(Ljava/io/File;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    const-string v0, "Hchat_script_plugin_config"

    .line 150
    .line 151
    invoke-static {v5, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    const-string v2, "script_plugin_item_"

    .line 163
    .line 164
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 173
    .line 174
    .line 175
    :goto_2
    move-object v1, v8

    .line 176
    goto :goto_4

    .line 177
    :cond_4
    const-string v0, "\u63d2\u4ef6\u76ee\u5f55\u4e0d\u5728\u811a\u672c\u63d2\u4ef6\u6839\u76ee\u5f55\u5185"

    .line 178
    .line 179
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 180
    .line 181
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v1

    .line 185
    :cond_5
    invoke-virtual {v2}, Lfb/z1;->b()Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    const-string v8, "\n"

    .line 190
    .line 191
    new-instance v11, Lfb/g0;

    .line 192
    .line 193
    const/16 v0, 0x1d

    .line 194
    .line 195
    invoke-direct {v11, v0}, Lfb/g0;-><init>(I)V

    .line 196
    .line 197
    .line 198
    const/16 v12, 0x1e

    .line 199
    .line 200
    const/4 v9, 0x0

    .line 201
    const/4 v10, 0x0

    .line 202
    invoke-static/range {v7 .. v12}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    :goto_3
    new-instance v8, Lsf/f;

    .line 217
    .line 218
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :goto_4
    new-instance v14, Landroid/os/Handler;

    .line 223
    .line 224
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-direct {v14, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 229
    .line 230
    .line 231
    new-instance v0, Lwb/or;

    .line 232
    .line 233
    iget-object v2, p0, Lwb/mr;->j:Li0/j1;

    .line 234
    .line 235
    iget v4, p0, Lwb/mr;->k:I

    .line 236
    .line 237
    iget-object v7, p0, Lwb/mr;->l:Li0/a1;

    .line 238
    .line 239
    iget-object v8, p0, Lwb/mr;->m:Li0/a1;

    .line 240
    .line 241
    iget-object v9, p0, Lwb/mr;->n:Li0/a1;

    .line 242
    .line 243
    iget-object v10, p0, Lwb/mr;->o:Li0/a1;

    .line 244
    .line 245
    iget-object v11, p0, Lwb/mr;->p:Ljava/lang/String;

    .line 246
    .line 247
    iget-object v12, p0, Lwb/mr;->q:Lwb/yt;

    .line 248
    .line 249
    iget-object v13, p0, Lwb/mr;->r:Li0/a1;

    .line 250
    .line 251
    invoke-direct/range {v0 .. v13}, Lwb/or;-><init>(Ljava/io/Serializable;Li0/j1;Lfb/y;ILandroid/content/Context;ZLi0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Lwb/yt;Li0/a1;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v14, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 255
    .line 256
    .line 257
    return-void
.end method
