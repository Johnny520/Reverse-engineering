.class public final synthetic Lwb/nr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Li0/j1;

.field public final synthetic j:I

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Lwb/yt;

.field public final synthetic q:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/j1;Ljava/lang/String;Ljava/lang/String;Lwb/yt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lwb/nr;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p9, p0, Lwb/nr;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p8, p0, Lwb/nr;->i:Li0/j1;

    .line 9
    .line 10
    iput p1, p0, Lwb/nr;->j:I

    .line 11
    .line 12
    iput-object p3, p0, Lwb/nr;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p4, p0, Lwb/nr;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p5, p0, Lwb/nr;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p6, p0, Lwb/nr;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p10, p0, Lwb/nr;->o:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p11, p0, Lwb/nr;->p:Lwb/yt;

    .line 23
    .line 24
    iput-object p7, p0, Lwb/nr;->q:Li0/a1;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget-object v5, p0, Lwb/nr;->g:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v3, p0, Lwb/nr;->h:Ljava/lang/String;

    .line 4
    .line 5
    const-string v0, ".."

    .line 6
    .line 7
    const-string v1, "\u672a\u627e\u5230\u63d2\u4ef6\u76ee\u5f55: "

    .line 8
    .line 9
    :try_start_0
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-nez v4, :cond_3

    .line 22
    .line 23
    const-string v4, "."

    .line 24
    .line 25
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_3

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_3

    .line 36
    .line 37
    invoke-static {v2}, Lfb/a2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static {v2, v0, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    new-instance v7, Ljava/io/File;

    .line 65
    .line 66
    invoke-direct {v7, v6, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual {v7}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-static {v9, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_1

    .line 86
    .line 87
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_1

    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-eqz v7, :cond_0

    .line 98
    .line 99
    sget-object v1, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v6, v8}, Lfb/t2;->t(Ljava/io/File;Ljava/io/File;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v5, v2, v4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v8}, La/a;->F(Ljava/io/File;)V

    .line 115
    .line 116
    .line 117
    const-string v0, "Hchat_script_plugin_config"

    .line 118
    .line 119
    invoke-static {v5, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, "script_plugin_item_"

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 138
    .line 139
    .line 140
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 141
    .line 142
    move-object v1, v0

    .line 143
    goto :goto_1

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    goto :goto_0

    .line 146
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v1

    .line 160
    :cond_1
    const-string v0, "\u63d2\u4ef6\u76ee\u5f55\u4e0d\u5728\u811a\u672c\u63d2\u4ef6\u6839\u76ee\u5f55\u5185"

    .line 161
    .line 162
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v1

    .line 168
    :cond_2
    const-string v0, "\u63d2\u4ef6\u76ee\u5f55\u540d\u5305\u542b\u4e0d\u5141\u8bb8\u7684\u8def\u5f84\u5b57\u7b26"

    .line 169
    .line 170
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 171
    .line 172
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v1

    .line 176
    :cond_3
    const-string v0, "\u63d2\u4ef6\u76ee\u5f55\u540d\u4e0d\u80fd\u4e3a\u7a7a"

    .line 177
    .line 178
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 179
    .line 180
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    :goto_0
    new-instance v1, Lsf/f;

    .line 185
    .line 186
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    :goto_1
    new-instance v13, Landroid/os/Handler;

    .line 190
    .line 191
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-direct {v13, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 196
    .line 197
    .line 198
    new-instance v0, Lwb/vr;

    .line 199
    .line 200
    iget-object v2, p0, Lwb/nr;->i:Li0/j1;

    .line 201
    .line 202
    iget v4, p0, Lwb/nr;->j:I

    .line 203
    .line 204
    iget-object v6, p0, Lwb/nr;->k:Li0/a1;

    .line 205
    .line 206
    iget-object v7, p0, Lwb/nr;->l:Li0/a1;

    .line 207
    .line 208
    iget-object v8, p0, Lwb/nr;->m:Li0/a1;

    .line 209
    .line 210
    iget-object v9, p0, Lwb/nr;->n:Li0/a1;

    .line 211
    .line 212
    iget-object v10, p0, Lwb/nr;->o:Ljava/lang/String;

    .line 213
    .line 214
    iget-object v11, p0, Lwb/nr;->p:Lwb/yt;

    .line 215
    .line 216
    iget-object v12, p0, Lwb/nr;->q:Li0/a1;

    .line 217
    .line 218
    invoke-direct/range {v0 .. v12}, Lwb/vr;-><init>(Ljava/lang/Object;Li0/j1;Ljava/lang/String;ILandroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Lwb/yt;Li0/a1;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v13, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 222
    .line 223
    .line 224
    return-void
.end method
