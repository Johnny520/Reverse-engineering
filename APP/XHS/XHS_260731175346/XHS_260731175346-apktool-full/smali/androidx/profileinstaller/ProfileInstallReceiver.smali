.class public Landroidx/profileinstaller/ProfileInstallReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


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
    .locals 5

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

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
    const/16 v2, 0x11

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance p2, Lxhss/ᛲᲀᛸᛶ;

    .line 20
    .line 21
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lxhss/ᲇᛵᛲᲁ;

    .line 25
    .line 26
    invoke-direct {v0, v2, p0}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    invoke-static {p1, p2, v0, p0}, Lxhss/ᛱᛱᛷᛸ;->ᛸᛶᲈᛶ(Landroid/content/Context;Ljava/util/concurrent/Executor;Lxhss/ᛸᲈᛷ;Z)V

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
    const/16 v3, 0xa

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-eqz p2, :cond_7

    .line 50
    .line 51
    const-string v0, "EXTRA_SKIP_FILE_OPERATION"

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const-string v0, "WRITE_SKIP_FILE"

    .line 58
    .line 59
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    new-instance p2, Lxhss/ᲇᛵᛲᲁ;

    .line 66
    .line 67
    invoke-direct {p2, v2, p0}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const/4 v1, 0x0

    .line 83
    :try_start_0
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 84
    .line 85
    .line 86
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᲀᲇᛳᲁ(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v3, v4}, Lxhss/ᲇᛵᛲᲁ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :catch_0
    move-exception p0

    .line 100
    const/4 p1, 0x7

    .line 101
    invoke-virtual {p2, p1, p0}, Lxhss/ᲇᛵᛲᲁ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    const-string v0, "DELETE_SKIP_FILE"

    .line 106
    .line 107
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_7

    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    new-instance p2, Ljava/io/File;

    .line 118
    .line 119
    const-string v0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 120
    .line 121
    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 125
    .line 126
    .line 127
    const/16 p1, 0xb

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_3
    const-string v1, "androidx.profileinstaller.action.SAVE_PROFILE"

    .line 134
    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_4

    .line 140
    .line 141
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-static {p1, v3}, Landroid/os/Process;->sendSignal(II)V

    .line 146
    .line 147
    .line 148
    const/16 p1, 0xc

    .line 149
    .line 150
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_4
    const-string v1, "androidx.profileinstaller.action.BENCHMARK_OPERATION"

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_7

    .line 161
    .line 162
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    if-eqz p2, :cond_7

    .line 167
    .line 168
    const-string v0, "EXTRA_BENCHMARK_OPERATION"

    .line 169
    .line 170
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    new-instance v0, Lxhss/ᲇᛵᛲᲁ;

    .line 175
    .line 176
    invoke-direct {v0, v2, p0}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    const-string p0, "DROP_SHADER_CACHE"

    .line 180
    .line 181
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-eqz p0, :cond_6

    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-virtual {p0}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-static {p0}, Lxhss/ᛵᛵᛲᲈ;->ᲈᛳᲀ(Ljava/io/File;)Z

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    if-eqz p0, :cond_5

    .line 200
    .line 201
    const/16 p0, 0xe

    .line 202
    .line 203
    invoke-virtual {v0, p0, v4}, Lxhss/ᲇᛵᛲᲁ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_5
    const/16 p0, 0xf

    .line 208
    .line 209
    invoke-virtual {v0, p0, v4}, Lxhss/ᲇᛵᛲᲁ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_6
    const/16 p0, 0x10

    .line 214
    .line 215
    invoke-virtual {v0, p0, v4}, Lxhss/ᲇᛵᛲᲁ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_7
    :goto_0
    return-void
.end method
