.class public Landroidx/profileinstaller/ProfileInstallReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "androidx.profileinstaller.action.INSTALL_PROFILE"

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x4

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance p2, Landroidx/profileinstaller/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    invoke-direct {p2, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 25
    .line 26
    invoke-direct {v0, p0, v3}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    invoke-static {p1, p2, v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/飘花落叶言子楪世兰苏哲;Z)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    const-string v1, "androidx.profileinstaller.action.SKIP_FILE"

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const-string v4, "ProfileInstaller"

    .line 41
    .line 42
    const/16 v5, 0xa

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    if-eqz p2, :cond_8

    .line 52
    .line 53
    const-string v0, "EXTRA_SKIP_FILE_OPERATION"

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const-string v0, "WRITE_SKIP_FILE"

    .line 60
    .line 61
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    new-instance p2, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 68
    .line 69
    invoke-direct {p2, p0, v3}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :try_start_0
    invoke-virtual {v0, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 85
    .line 86
    .line 87
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p0, p1}, Landroidx/profileinstaller/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v5, v6}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_1

    .line 99
    .line 100
    :catch_0
    move-exception p0

    .line 101
    const/4 p1, 0x7

    .line 102
    invoke-virtual {p2, p1, p0}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_1

    .line 106
    .line 107
    :cond_2
    const-string v0, "DELETE_SKIP_FILE"

    .line 108
    .line 109
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_8

    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance p2, Ljava/io/File;

    .line 120
    .line 121
    const-string v0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 122
    .line 123
    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 127
    .line 128
    .line 129
    const-string p1, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 130
    .line 131
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    const/16 p1, 0xb

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_3
    const-string v1, "androidx.profileinstaller.action.SAVE_PROFILE"

    .line 141
    .line 142
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_4

    .line 147
    .line 148
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-static {p1, v5}, Landroid/os/Process;->sendSignal(II)V

    .line 153
    .line 154
    .line 155
    const-string p1, ""

    .line 156
    .line 157
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    const/16 p1, 0xc

    .line 161
    .line 162
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_4
    const-string v1, "androidx.profileinstaller.action.BENCHMARK_OPERATION"

    .line 167
    .line 168
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_8

    .line 173
    .line 174
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    if-eqz p2, :cond_8

    .line 179
    .line 180
    const-string v0, "EXTRA_BENCHMARK_OPERATION"

    .line 181
    .line 182
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    new-instance v0, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 187
    .line 188
    invoke-direct {v0, p0, v3}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 189
    .line 190
    .line 191
    const-string p0, "DROP_SHADER_CACHE"

    .line 192
    .line 193
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-eqz p0, :cond_7

    .line 198
    .line 199
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 200
    .line 201
    const/16 p2, 0x22

    .line 202
    .line 203
    if-lt p0, p2, :cond_5

    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    goto :goto_0

    .line 214
    :cond_5
    invoke-virtual {p1}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-virtual {p0}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    :goto_0
    invoke-static {p0}, Landroidx/profileinstaller/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ljava/io/File;)Z

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-eqz p0, :cond_6

    .line 227
    .line 228
    const/16 p0, 0xe

    .line 229
    .line 230
    invoke-virtual {v0, p0, v6}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(ILjava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :cond_6
    const/16 p0, 0xf

    .line 235
    .line 236
    invoke-virtual {v0, p0, v6}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(ILjava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_7
    const/16 p0, 0x10

    .line 241
    .line 242
    invoke-virtual {v0, p0, v6}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(ILjava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_8
    :goto_1
    return-void
.end method
