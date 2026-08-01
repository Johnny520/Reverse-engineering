.class public final Lha2;
.super Landroid/app/Fragment;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:Lic;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x3ed

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 p1, -0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-ne p2, p1, :cond_b

    .line 12
    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object p1, v1

    .line 21
    :goto_0
    if-nez p1, :cond_2

    .line 22
    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_2
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz p1, :cond_9

    .line 34
    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    goto/16 :goto_7

    .line 38
    .line 39
    :cond_3
    :try_start_0
    invoke-virtual {p3}, Landroid/content/Intent;->getFlags()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    and-int/lit8 p2, p2, 0x1

    .line 48
    .line 49
    invoke-virtual {p3, v3, p2}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 50
    .line 51
    .line 52
    sget-object p2, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p2, v0

    .line 57
    new-instance p3, Leo1;

    .line 58
    .line 59
    invoke-direct {p3, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    move-object p2, p3

    .line 63
    :goto_1
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-eqz p2, :cond_4

    .line 68
    .line 69
    const-string p3, "DYHelper"

    .line 70
    .line 71
    const-string v0, "\u6301\u4e45\u5316 MP3 URI \u8bfb\u53d6\u6743\u9650\u5931\u8d25"

    .line 72
    .line 73
    invoke-static {p3, v0, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    iget-object p2, p0, Lha2;->ε:Lic;

    .line 77
    .line 78
    if-eqz p2, :cond_8

    .line 79
    .line 80
    const-string p3, "_display_name"

    .line 81
    .line 82
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    filled-new-array {p3}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const/4 v6, 0x0

    .line 91
    const/4 v7, 0x0

    .line 92
    const/4 v5, 0x0

    .line 93
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    invoke-interface {p1, p3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    if-ltz p3, :cond_5

    .line 110
    .line 111
    invoke-interface {p1, p3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 115
    goto :goto_2

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    move-object p3, v0

    .line 118
    goto :goto_3

    .line 119
    :cond_5
    move-object p3, v1

    .line 120
    :goto_2
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 121
    .line 122
    .line 123
    goto :goto_5

    .line 124
    :catchall_2
    move-exception v0

    .line 125
    move-object p1, v0

    .line 126
    goto :goto_4

    .line 127
    :goto_3
    :try_start_4
    throw p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 128
    :catchall_3
    move-exception v0

    .line 129
    :try_start_5
    invoke-static {p1, p3}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 133
    :cond_6
    move-object p3, v1

    .line 134
    goto :goto_5

    .line 135
    :goto_4
    new-instance p3, Leo1;

    .line 136
    .line 137
    invoke-direct {p3, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    :goto_5
    instance-of p1, p3, Leo1;

    .line 141
    .line 142
    if-eqz p1, :cond_7

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_7
    move-object v1, p3

    .line 146
    :goto_6
    check-cast v1, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {p2, v3, v1}, Lic;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    :cond_8
    invoke-virtual {p0}, Lha2;->α()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_9
    :goto_7
    iget-object p1, p0, Lha2;->ε:Lic;

    .line 156
    .line 157
    if-eqz p1, :cond_a

    .line 158
    .line 159
    invoke-virtual {p1, v1, v1}, Lic;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :cond_a
    invoke-virtual {p0}, Lha2;->α()V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_b
    :goto_8
    iget-object p1, p0, Lha2;->ε:Lic;

    .line 167
    .line 168
    if-eqz p1, :cond_c

    .line 169
    .line 170
    invoke-virtual {p1, v1, v1}, Lic;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    :cond_c
    invoke-virtual {p0}, Lha2;->α()V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/content/Intent;

    .line 5
    .line 6
    const-string v0, "android.intent.action.OPEN_DOCUMENT"

    .line 7
    .line 8
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "android.intent.category.OPENABLE"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    const-string v0, "audio/mpeg"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x40

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    const-string v1, "audio/mp3"

    .line 31
    .line 32
    const-string v2, "audio/*"

    .line 33
    .line 34
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "android.intent.extra.MIME_TYPES"

    .line 39
    .line 40
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    const/16 v0, 0x3ed

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    const-string v0, "DYHelper"

    .line 51
    .line 52
    const-string v1, "\u6253\u5f00 MP3 \u6587\u4ef6\u9009\u62e9\u5668\u5931\u8d25"

    .line 53
    .line 54
    invoke-static {v0, v1, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lha2;->ε:Lic;

    .line 58
    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-virtual {p1, v0, v0}, Lic;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {p0}, Lha2;->α()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final α()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
