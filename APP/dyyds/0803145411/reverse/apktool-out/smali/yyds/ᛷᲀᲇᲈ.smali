.class public final Lyyds/ᛷᲀᲇᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛸᛴᛳᛷ;


# static fields
.field public static ᛱᲈᲁ:Ljava/lang/Boolean;


# instance fields
.field public ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public ᲀᛲᛳᲀ:Ljava/lang/Object;

.field public ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lyyds/ᛴᛲᛷᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛲᛷᛸ;

    .line 5
    .line 6
    iput-object v0, p0, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v0, "GET"

    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance v0, Lyyds/ᲀᲈᛷᛷ;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {v0, v1}, Lyyds/ᲀᲈᛷᛷ;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 23
    iput-object p1, p0, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    return-void
.end method

.method public static ᲇᲇᲇᛱ(Landroid/app/Activity;Ljava/util/List;Lyyds/ᛵᛸᛳ;Lyyds/ᛴᛲᛷᛸ;Lyyds/ᲁᛷᲁᛳ;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p4}, Lyyds/ᲁᛷᲁᛳ;->run()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lyyds/ᛲᛴᛷᲁ;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Lyyds/ᛲᛴᛷᲁ;->ᛱᲈᲁ(Landroid/app/Activity;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, 0x2

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v0, v2

    .line 38
    :goto_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, Lyyds/ᛱᛵᛱᛱ;

    .line 42
    .line 43
    invoke-direct {v1, p3, p0, p1, p4}, Lyyds/ᛱᛵᛱᛱ;-><init>(Lyyds/ᛴᛲᛷᛸ;Landroid/app/Activity;Ljava/util/List;Lyyds/ᲁᛷᲁᛳ;)V

    .line 44
    .line 45
    .line 46
    if-ne v0, v2, :cond_3

    .line 47
    .line 48
    new-instance p0, Lyyds/ᛲᛵᛷ;

    .line 49
    .line 50
    invoke-direct {p0}, Lyyds/ᛲᛵᛷ;-><init>()V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    new-instance p0, Lyyds/ᛳᛸᛲᲈ;

    .line 55
    .line 56
    invoke-direct {p0}, Lyyds/ᛳᛸᛲᲈ;-><init>()V

    .line 57
    .line 58
    .line 59
    :goto_2
    const p3, 0xffff

    .line 60
    .line 61
    .line 62
    invoke-static {p3}, Lyyds/ᛸᲁᛵᛸ;->ᛲᲈᲁ(I)I

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    new-instance p4, Landroid/os/Bundle;

    .line 67
    .line 68
    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v0, "request_code"

    .line 72
    .line 73
    invoke-virtual {p4, v0, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    instance-of p3, p1, Ljava/util/ArrayList;

    .line 77
    .line 78
    const-string v0, "request_permissions"

    .line 79
    .line 80
    if-eqz p3, :cond_4

    .line 81
    .line 82
    check-cast p1, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {p4, v0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    new-instance p3, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p4, v0, p3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    :goto_3
    invoke-interface {p0, p4}, Lyyds/ᛱᛸᲇᛵ;->setArguments(Landroid/os/Bundle;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p0, v2}, Lyyds/ᛱᛸᲇᛵ;->setRetainInstance(Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lyyds/ᛷᲈᲈᲀ;->ᛵᛸᛸᛷ()Lyyds/ᛲᛴᲈᲈ;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iput-boolean v2, p1, Lyyds/ᛲᛴᲈᲈ;->ᛵᛸᛸᛷ:Z

    .line 107
    .line 108
    invoke-virtual {p0}, Lyyds/ᛷᲈᲈᲀ;->ᛵᛸᛸᛷ()Lyyds/ᛲᛴᲈᲈ;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iput-object v1, p1, Lyyds/ᛲᛴᲈᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛵᛱᛱ;

    .line 113
    .line 114
    iget-object p1, p2, Lyyds/ᛵᛸᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, Landroid/app/FragmentManager;

    .line 117
    .line 118
    if-nez p1, :cond_5

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_5
    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p1, p0, p2}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 134
    .line 135
    .line 136
    :goto_4
    return-void
.end method


# virtual methods
.method public ᛲᛴᛳᛲ(Lyyds/ᛳᛷ;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/content/Context;

    .line 8
    .line 9
    iget-object v3, v0, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lyyds/ᛷᛶᲇᲁ;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    new-instance v3, Lyyds/ᛷᛶᲇᲁ;

    .line 16
    .line 17
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v3, v0, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 21
    .line 22
    :cond_0
    iget-object v3, v0, Lyyds/ᛷᲀᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lyyds/ᛴᛲᛷᛸ;

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    new-instance v3, Lyyds/ᛴᛲᛷᛸ;

    .line 29
    .line 30
    const/16 v4, 0xb

    .line 31
    .line 32
    invoke-direct {v3, v4}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v3, v0, Lyyds/ᛷᲀᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 36
    .line 37
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v4, v0, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 44
    .line 45
    .line 46
    move-object v4, v2

    .line 47
    :cond_2
    instance-of v5, v4, Landroid/app/Activity;

    .line 48
    .line 49
    const/4 v10, 0x0

    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    check-cast v4, Landroid/app/Activity;

    .line 53
    .line 54
    move-object v5, v4

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    instance-of v5, v4, Landroid/content/ContextWrapper;

    .line 57
    .line 58
    if-eqz v5, :cond_4

    .line 59
    .line 60
    check-cast v4, Landroid/content/ContextWrapper;

    .line 61
    .line 62
    invoke-virtual {v4}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-nez v4, :cond_2

    .line 67
    .line 68
    :cond_4
    move-object v5, v10

    .line 69
    :goto_0
    iget-object v4, v0, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, Ljava/lang/Boolean;

    .line 72
    .line 73
    const/4 v11, 0x2

    .line 74
    const/4 v12, 0x0

    .line 75
    const/4 v13, 0x1

    .line 76
    if-nez v4, :cond_7

    .line 77
    .line 78
    sget-object v4, Lyyds/ᛷᲀᲇᲈ;->ᛱᲈᲁ:Ljava/lang/Boolean;

    .line 79
    .line 80
    if-nez v4, :cond_6

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    iget v4, v4, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 87
    .line 88
    and-int/2addr v4, v11

    .line 89
    if-eqz v4, :cond_5

    .line 90
    .line 91
    move v4, v13

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    move v4, v12

    .line 94
    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    sput-object v4, Lyyds/ᛷᲀᲇᲈ;->ᛱᲈᲁ:Ljava/lang/Boolean;

    .line 99
    .line 100
    :cond_6
    iput-object v4, v0, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 101
    .line 102
    :cond_7
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_13

    .line 107
    .line 108
    if-eqz v5, :cond_17

    .line 109
    .line 110
    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_16

    .line 115
    .line 116
    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_15

    .line 121
    .line 122
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    iget v7, v7, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    const-string v8, "addAssetPath"

    .line 143
    .line 144
    const-class v9, Ljava/lang/String;

    .line 145
    .line 146
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v7, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Ljava/lang/Integer;

    .line 163
    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    goto :goto_6

    .line 171
    :catch_0
    move-exception v0

    .line 172
    goto :goto_2

    .line 173
    :catch_1
    move-exception v0

    .line 174
    goto :goto_3

    .line 175
    :catch_2
    move-exception v0

    .line 176
    goto :goto_4

    .line 177
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_5
    move v0, v12

    .line 189
    :goto_6
    if-nez v0, :cond_9

    .line 190
    .line 191
    :goto_7
    move-object v7, v10

    .line 192
    goto :goto_9

    .line 193
    :cond_9
    :try_start_1
    invoke-static {v2, v0}, Lyyds/ᛸᛳᛷᛳ;->ᲀᛲᛲᲇ(Landroid/content/Context;I)Lyyds/ᛴᛸᛶᛱ;

    .line 194
    .line 195
    .line 196
    move-result-object v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_4

    .line 197
    :try_start_2
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iget-object v7, v4, Lyyds/ᛴᛸᛶᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v7, Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v0, v7}, Lyyds/ᛴᛶᲀᛲ;->ᛱᛳᲇ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_3

    .line 209
    if-nez v0, :cond_a

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :catch_3
    move-exception v0

    .line 213
    goto :goto_8

    .line 214
    :catch_4
    move-exception v0

    .line 215
    move-object v4, v10

    .line 216
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 217
    .line 218
    .line 219
    :cond_a
    move-object v7, v4

    .line 220
    :goto_9
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-nez v0, :cond_14

    .line 225
    .line 226
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    :goto_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_13

    .line 235
    .line 236
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    move-object v4, v0

    .line 241
    check-cast v4, Lyyds/ᛲᛴᛷᲁ;

    .line 242
    .line 243
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    const-string v15, "CREATOR"

    .line 256
    .line 257
    invoke-virtual {v0, v15}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 258
    .line 259
    .line 260
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_5

    .line 261
    goto :goto_b

    .line 262
    :catch_5
    move-exception v0

    .line 263
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 264
    .line 265
    .line 266
    move-object v0, v10

    .line 267
    :goto_b
    if-eqz v0, :cond_12

    .line 268
    .line 269
    :try_start_4
    invoke-virtual {v0, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v15
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    .line 273
    move-object/from16 v16, v10

    .line 274
    .line 275
    instance-of v10, v15, Landroid/os/Parcelable$Creator;

    .line 276
    .line 277
    if-eqz v10, :cond_11

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    instance-of v10, v0, Ljava/lang/reflect/ParameterizedType;

    .line 284
    .line 285
    if-eqz v10, :cond_10

    .line 286
    .line 287
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 288
    .line 289
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    array-length v10, v0

    .line 294
    if-ne v10, v13, :cond_f

    .line 295
    .line 296
    aget-object v0, v0, v12

    .line 297
    .line 298
    instance-of v10, v0, Ljava/lang/Class;

    .line 299
    .line 300
    if-eqz v10, :cond_e

    .line 301
    .line 302
    check-cast v0, Ljava/lang/Class;

    .line 303
    .line 304
    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_e

    .line 309
    .line 310
    check-cast v15, Landroid/os/Parcelable$Creator;

    .line 311
    .line 312
    invoke-interface {v15, v12}, Landroid/os/Parcelable$Creator;->newArray(I)[Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    if-eqz v0, :cond_d

    .line 317
    .line 318
    invoke-virtual {v4, v5}, Lyyds/ᛲᛴᛷᲁ;->ᲇᲇᲇᛱ(Landroid/app/Activity;)I

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 323
    .line 324
    .line 325
    move-result-object v8

    .line 326
    iget v8, v8, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 327
    .line 328
    if-lt v8, v0, :cond_c

    .line 329
    .line 330
    if-eqz v7, :cond_b

    .line 331
    .line 332
    iget-object v0, v7, Lyyds/ᛴᛸᛶᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 333
    .line 334
    move-object v8, v0

    .line 335
    check-cast v8, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-virtual {v4}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v0, v8}, Lyyds/ᛲᛴᛷᲁ;->ᲇᲈᛵᛷ(Ljava/lang/String;Ljava/util/ArrayList;)Lyyds/ᛸᲀᛴᛸ;

    .line 342
    .line 343
    .line 344
    move-result-object v9

    .line 345
    invoke-virtual/range {v4 .. v9}, Lyyds/ᛲᛴᛷᲁ;->ᛵᛸᛸᛷ(Landroid/app/Activity;Ljava/util/ArrayList;Lyyds/ᛴᛸᛶᛱ;Ljava/util/ArrayList;Lyyds/ᛸᲀᛴᛸ;)V

    .line 346
    .line 347
    .line 348
    :cond_b
    invoke-virtual {v4, v5, v6}, Lyyds/ᛲᛴᛷᲁ;->ᲀᛲᛳᲀ(Landroid/app/Activity;Ljava/util/ArrayList;)V

    .line 349
    .line 350
    .line 351
    move-object/from16 v10, v16

    .line 352
    .line 353
    goto :goto_a

    .line 354
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 355
    .line 356
    const-string v2, "Request \""

    .line 357
    .line 358
    invoke-virtual {v4}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    new-instance v4, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v2, "\" permission, The targetSdkVersion SDK must be "

    .line 371
    .line 372
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    const-string v0, " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permission"

    .line 379
    .line 380
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v1

    .line 391
    :cond_d
    const-string v0, "The newArray method of the CREATOR field in this "

    .line 392
    .line 393
    const-string v1, " returns an empty value. This method cannot return an empty value"

    .line 394
    .line 395
    invoke-static {v0, v9, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :cond_e
    const-string v0, "The generic type defined in the CREATOR field of this "

    .line 404
    .line 405
    const-string v1, " is incorrect"

    .line 406
    .line 407
    invoke-static {v0, v9, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    return-void

    .line 415
    :cond_f
    const-string v0, "The number of generics defined in the CREATOR field of this "

    .line 416
    .line 417
    const-string v1, " can only be one"

    .line 418
    .line 419
    invoke-static {v0, v9, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    return-void

    .line 427
    :cond_10
    const-string v0, "The generic type defined for the CREATOR field in this "

    .line 428
    .line 429
    const-string v1, " is empty"

    .line 430
    .line 431
    invoke-static {v0, v9, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :cond_11
    const-string v0, "The CREATOR field in this "

    .line 440
    .line 441
    const-string v1, " is not of type "

    .line 442
    .line 443
    invoke-static {v0, v9, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛱᛳᲇ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    const-class v1, Landroid/os/Parcelable$Creator;

    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    invoke-static {v0, v1}, Lyyds/ᛷᲈᲈᛶ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    return-void

    .line 457
    :catch_6
    const-string v0, "The CREATOR field in the "

    .line 458
    .line 459
    const-string v1, " has an access exception. Please modify CREATOR field with \"public static final\""

    .line 460
    .line 461
    invoke-static {v0, v9, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :cond_12
    const-string v0, "This permission class does not define the CREATOR field"

    .line 470
    .line 471
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :cond_13
    move-object/from16 v16, v10

    .line 476
    .line 477
    goto :goto_c

    .line 478
    :cond_14
    const-string v0, "The requested permission cannot be empty"

    .line 479
    .line 480
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    return-void

    .line 484
    :cond_15
    const-string v0, "The activity has been destroyed, please manually determine the status of the activity"

    .line 485
    .line 486
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    return-void

    .line 490
    :cond_16
    const-string v0, "The activity has been finishing, please manually determine the status of the activity"

    .line 491
    .line 492
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    return-void

    .line 496
    :cond_17
    const-string v0, "The instance of the context must be an activity object"

    .line 497
    .line 498
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    return-void

    .line 502
    :goto_c
    invoke-static {v5}, Lyyds/ᛴᛶᲀᛲ;->ᛷᲈᲈᲁ(Landroid/app/Activity;)Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    if-eqz v0, :cond_18

    .line 507
    .line 508
    goto/16 :goto_1d

    .line 509
    .line 510
    :cond_18
    const-class v4, Lyyds/ᲀᛱᛳᲈ;

    .line 511
    .line 512
    monitor-enter v4

    .line 513
    const/4 v0, -0x1

    .line 514
    move v7, v0

    .line 515
    :cond_19
    :goto_d
    add-int/2addr v7, v13

    .line 516
    :try_start_5
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 517
    .line 518
    .line 519
    move-result v8

    .line 520
    if-ge v7, v8, :cond_1d

    .line 521
    .line 522
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v8

    .line 526
    check-cast v8, Lyyds/ᛲᛴᛷᲁ;

    .line 527
    .line 528
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 529
    .line 530
    invoke-virtual {v8}, Lyyds/ᛲᛴᛷᲁ;->ᛲᛴᛳᛲ()I

    .line 531
    .line 532
    .line 533
    move-result v10

    .line 534
    if-lt v9, v10, :cond_1a

    .line 535
    .line 536
    goto :goto_d

    .line 537
    :cond_1a
    invoke-virtual {v8}, Lyyds/ᛲᛴᛷᲁ;->ᛶᛷᛲᲁ()Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    if-eqz v8, :cond_19

    .line 542
    .line 543
    check-cast v8, Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 546
    .line 547
    .line 548
    move-result v9

    .line 549
    if-eqz v9, :cond_1b

    .line 550
    .line 551
    goto :goto_d

    .line 552
    :cond_1b
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 553
    .line 554
    .line 555
    move-result-object v8

    .line 556
    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 557
    .line 558
    .line 559
    move-result v9

    .line 560
    if-eqz v9, :cond_19

    .line 561
    .line 562
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v9

    .line 566
    check-cast v9, Lyyds/ᛲᛴᛷᲁ;

    .line 567
    .line 568
    invoke-static {v6, v9}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲇᲇᛱ(Ljava/util/ArrayList;Lyyds/ᛲᛴᛷᲁ;)Z

    .line 569
    .line 570
    .line 571
    move-result v10

    .line 572
    if-eqz v10, :cond_1c

    .line 573
    .line 574
    goto :goto_e

    .line 575
    :cond_1c
    add-int/lit8 v7, v7, 0x1

    .line 576
    .line 577
    invoke-virtual {v6, v7, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 578
    .line 579
    .line 580
    goto :goto_e

    .line 581
    :catchall_0
    move-exception v0

    .line 582
    goto/16 :goto_1e

    .line 583
    .line 584
    :cond_1d
    monitor-exit v4

    .line 585
    invoke-static {v2, v6}, Lyyds/ᲀᛱᛳᲈ;->ᛶᛳᛶᛵ(Landroid/content/Context;Ljava/util/List;)Z

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    if-eqz v2, :cond_1e

    .line 590
    .line 591
    new-instance v0, Ljava/util/ArrayList;

    .line 592
    .line 593
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 594
    .line 595
    .line 596
    invoke-interface {v1, v0}, Lyyds/ᛳᛷ;->ᲇᲈᛵᛷ(Ljava/util/ArrayList;)V

    .line 597
    .line 598
    .line 599
    return-void

    .line 600
    :cond_1e
    instance-of v2, v5, Landroidx/fragment/app/FragmentActivity;

    .line 601
    .line 602
    if-nez v2, :cond_3e

    .line 603
    .line 604
    new-instance v2, Lyyds/ᛵᛸᛳ;

    .line 605
    .line 606
    invoke-virtual {v5}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 607
    .line 608
    .line 609
    move-result-object v4

    .line 610
    invoke-direct {v2, v5, v4}, Lyyds/ᛵᛸᛳ;-><init>(Landroid/app/Activity;Landroid/app/FragmentManager;)V

    .line 611
    .line 612
    .line 613
    new-instance v4, Lyyds/ᛷᲀᲇᲈ;

    .line 614
    .line 615
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 616
    .line 617
    .line 618
    iput-object v5, v4, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 619
    .line 620
    iput-object v6, v4, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 621
    .line 622
    iput-object v2, v4, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 623
    .line 624
    iput-object v3, v4, Lyyds/ᛷᲀᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 625
    .line 626
    iput-object v1, v4, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 627
    .line 628
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 629
    .line 630
    .line 631
    move-result v1

    .line 632
    if-eqz v1, :cond_1f

    .line 633
    .line 634
    goto/16 :goto_1d

    .line 635
    .line 636
    :cond_1f
    new-instance v1, Ljava/util/ArrayList;

    .line 637
    .line 638
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 639
    .line 640
    .line 641
    move-result v2

    .line 642
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 643
    .line 644
    .line 645
    new-instance v2, Ljava/util/ArrayList;

    .line 646
    .line 647
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 648
    .line 649
    .line 650
    move-result v3

    .line 651
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 652
    .line 653
    .line 654
    move v3, v12

    .line 655
    :goto_f
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 656
    .line 657
    .line 658
    move-result v7

    .line 659
    if-ge v3, v7, :cond_2f

    .line 660
    .line 661
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v7

    .line 665
    check-cast v7, Lyyds/ᛲᛴᛷᲁ;

    .line 666
    .line 667
    invoke-static {v2, v7}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲇᲇᛱ(Ljava/util/ArrayList;Lyyds/ᛲᛴᛷᲁ;)Z

    .line 668
    .line 669
    .line 670
    move-result v8

    .line 671
    if-eqz v8, :cond_20

    .line 672
    .line 673
    goto/16 :goto_13

    .line 674
    .line 675
    :cond_20
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    invoke-virtual {v7, v5}, Lyyds/ᛲᛴᛷᲁ;->ᛳᲁᲁᲇ(Landroid/content/Context;)Z

    .line 679
    .line 680
    .line 681
    move-result v8

    .line 682
    if-nez v8, :cond_21

    .line 683
    .line 684
    goto/16 :goto_13

    .line 685
    .line 686
    :cond_21
    invoke-virtual {v7, v5, v13}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛵᲇᲀ(Landroid/content/Context;Z)Z

    .line 687
    .line 688
    .line 689
    move-result v8

    .line 690
    if-eqz v8, :cond_22

    .line 691
    .line 692
    goto/16 :goto_13

    .line 693
    .line 694
    :cond_22
    invoke-virtual {v7, v5}, Lyyds/ᛲᛴᛷᲁ;->ᛱᲈᲁ(Landroid/app/Activity;)I

    .line 695
    .line 696
    .line 697
    move-result v8

    .line 698
    if-ne v8, v11, :cond_23

    .line 699
    .line 700
    filled-new-array {v7}, [Lyyds/ᛲᛴᛷᲁ;

    .line 701
    .line 702
    .line 703
    move-result-object v7

    .line 704
    invoke-static {v7}, Lyyds/ᛴᛶᲀᛲ;->ᛲᲈᲁ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 705
    .line 706
    .line 707
    move-result-object v7

    .line 708
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    goto/16 :goto_13

    .line 712
    .line 713
    :cond_23
    invoke-virtual {v7}, Lyyds/ᛲᛴᛷᲁ;->ᛲᛳᛶᲁ()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v8

    .line 717
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 718
    .line 719
    .line 720
    move-result v9

    .line 721
    if-eqz v9, :cond_24

    .line 722
    .line 723
    filled-new-array {v7}, [Lyyds/ᛲᛴᛷᲁ;

    .line 724
    .line 725
    .line 726
    move-result-object v7

    .line 727
    invoke-static {v7}, Lyyds/ᛴᛶᲀᛲ;->ᛲᲈᲁ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 728
    .line 729
    .line 730
    move-result-object v7

    .line 731
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    goto/16 :goto_13

    .line 735
    .line 736
    :cond_24
    move v7, v3

    .line 737
    move-object/from16 v9, v16

    .line 738
    .line 739
    :goto_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 740
    .line 741
    .line 742
    move-result v10

    .line 743
    if-ge v7, v10, :cond_2a

    .line 744
    .line 745
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v10

    .line 749
    check-cast v10, Lyyds/ᛲᛴᛷᲁ;

    .line 750
    .line 751
    invoke-virtual {v10}, Lyyds/ᛲᛴᛷᲁ;->ᛲᛳᛶᲁ()Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v14

    .line 755
    invoke-static {v14, v8}, Lyyds/ᛴᛶᲀᛲ;->ᛱᲈᲁ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 756
    .line 757
    .line 758
    move-result v14

    .line 759
    if-nez v14, :cond_25

    .line 760
    .line 761
    goto :goto_11

    .line 762
    :cond_25
    invoke-virtual {v10, v5}, Lyyds/ᛲᛴᛷᲁ;->ᛳᲁᲁᲇ(Landroid/content/Context;)Z

    .line 763
    .line 764
    .line 765
    move-result v14

    .line 766
    if-nez v14, :cond_26

    .line 767
    .line 768
    goto :goto_11

    .line 769
    :cond_26
    invoke-virtual {v10, v5, v13}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛵᲇᲀ(Landroid/content/Context;Z)Z

    .line 770
    .line 771
    .line 772
    move-result v14

    .line 773
    if-eqz v14, :cond_27

    .line 774
    .line 775
    goto :goto_11

    .line 776
    :cond_27
    if-nez v9, :cond_28

    .line 777
    .line 778
    new-instance v9, Ljava/util/ArrayList;

    .line 779
    .line 780
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 781
    .line 782
    .line 783
    :cond_28
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    invoke-static {v2, v10}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲇᲇᛱ(Ljava/util/ArrayList;Lyyds/ᛲᛴᛷᲁ;)Z

    .line 787
    .line 788
    .line 789
    move-result v14

    .line 790
    if-eqz v14, :cond_29

    .line 791
    .line 792
    goto :goto_11

    .line 793
    :cond_29
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    :goto_11
    add-int/lit8 v7, v7, 0x1

    .line 797
    .line 798
    goto :goto_10

    .line 799
    :cond_2a
    if-eqz v9, :cond_2e

    .line 800
    .line 801
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 802
    .line 803
    .line 804
    move-result v7

    .line 805
    if-eqz v7, :cond_2b

    .line 806
    .line 807
    goto :goto_13

    .line 808
    :cond_2b
    invoke-static {v5, v9}, Lyyds/ᲀᛱᛳᲈ;->ᛶᛳᛶᛵ(Landroid/content/Context;Ljava/util/List;)Z

    .line 809
    .line 810
    .line 811
    move-result v7

    .line 812
    if-eqz v7, :cond_2c

    .line 813
    .line 814
    goto :goto_13

    .line 815
    :cond_2c
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 816
    .line 817
    .line 818
    move-result-object v7

    .line 819
    :goto_12
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 820
    .line 821
    .line 822
    move-result v8

    .line 823
    if-eqz v8, :cond_2d

    .line 824
    .line 825
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v8

    .line 829
    check-cast v8, Lyyds/ᛲᛴᛷᲁ;

    .line 830
    .line 831
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 832
    .line 833
    .line 834
    goto :goto_12

    .line 835
    :cond_2d
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 836
    .line 837
    .line 838
    move-result v7

    .line 839
    if-nez v7, :cond_2e

    .line 840
    .line 841
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    :cond_2e
    :goto_13
    add-int/lit8 v3, v3, 0x1

    .line 845
    .line 846
    goto/16 :goto_f

    .line 847
    .line 848
    :cond_2f
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 849
    .line 850
    .line 851
    move-result v2

    .line 852
    if-eqz v2, :cond_30

    .line 853
    .line 854
    invoke-virtual {v4}, Lyyds/ᛷᲀᲇᲈ;->ᛲᲈᲁ()V

    .line 855
    .line 856
    .line 857
    goto/16 :goto_1d

    .line 858
    .line 859
    :cond_30
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 860
    .line 861
    .line 862
    move-result-object v19

    .line 863
    move-object/from16 v10, v16

    .line 864
    .line 865
    :goto_14
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 866
    .line 867
    .line 868
    move-result v1

    .line 869
    if-eqz v1, :cond_32

    .line 870
    .line 871
    if-eqz v10, :cond_31

    .line 872
    .line 873
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 874
    .line 875
    .line 876
    move-result v1

    .line 877
    if-eqz v1, :cond_32

    .line 878
    .line 879
    :cond_31
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v1

    .line 883
    move-object v10, v1

    .line 884
    check-cast v10, Ljava/util/List;

    .line 885
    .line 886
    goto :goto_14

    .line 887
    :cond_32
    if-eqz v10, :cond_33

    .line 888
    .line 889
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 890
    .line 891
    .line 892
    move-result v1

    .line 893
    if-eqz v1, :cond_34

    .line 894
    .line 895
    :cond_33
    move-object/from16 v18, v4

    .line 896
    .line 897
    goto/16 :goto_1c

    .line 898
    .line 899
    :cond_34
    iget-object v1, v4, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v1, Landroid/app/Activity;

    .line 902
    .line 903
    iget-object v2, v4, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 904
    .line 905
    move-object/from16 v21, v2

    .line 906
    .line 907
    check-cast v21, Lyyds/ᛵᛸᛳ;

    .line 908
    .line 909
    iget-object v2, v4, Lyyds/ᛷᲀᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 910
    .line 911
    move-object/from16 v22, v2

    .line 912
    .line 913
    check-cast v22, Lyyds/ᛴᛲᛷᛸ;

    .line 914
    .line 915
    sget-object v2, Lyyds/ᛲᲈᲀᛲ;->ᛲᲈᲁ:Ljava/util/HashMap;

    .line 916
    .line 917
    const-class v2, Lyyds/ᛲᲈᲀᛲ;

    .line 918
    .line 919
    monitor-enter v2

    .line 920
    :try_start_6
    invoke-virtual {v1}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 921
    .line 922
    .line 923
    move-result v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 924
    if-eq v3, v0, :cond_35

    .line 925
    .line 926
    monitor-exit v2

    .line 927
    goto/16 :goto_1a

    .line 928
    .line 929
    :cond_35
    :try_start_7
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 938
    .line 939
    const/4 v3, 0x3

    .line 940
    if-eq v0, v13, :cond_3a

    .line 941
    .line 942
    if-eq v0, v11, :cond_36

    .line 943
    .line 944
    goto :goto_19

    .line 945
    :cond_36
    invoke-virtual {v1}, Landroid/content/Context;->getDisplay()Landroid/view/Display;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    if-nez v0, :cond_37

    .line 950
    .line 951
    :goto_15
    move v13, v12

    .line 952
    goto :goto_16

    .line 953
    :cond_37
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 954
    .line 955
    .line 956
    move-result v0

    .line 957
    if-eq v0, v11, :cond_38

    .line 958
    .line 959
    if-eq v0, v3, :cond_38

    .line 960
    .line 961
    goto :goto_15

    .line 962
    :cond_38
    :goto_16
    if-eqz v13, :cond_39

    .line 963
    .line 964
    const/16 v12, 0x8

    .line 965
    .line 966
    :cond_39
    invoke-virtual {v1, v12}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 967
    .line 968
    .line 969
    sget-object v0, Lyyds/ᛲᲈᲀᛲ;->ᛲᲈᲁ:Ljava/util/HashMap;

    .line 970
    .line 971
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 972
    .line 973
    .line 974
    move-result v3

    .line 975
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 980
    .line 981
    .line 982
    move-result-object v5

    .line 983
    invoke-virtual {v0, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    goto :goto_19

    .line 987
    :catchall_1
    move-exception v0

    .line 988
    goto :goto_1b

    .line 989
    :catch_7
    move-exception v0

    .line 990
    goto :goto_18

    .line 991
    :cond_3a
    invoke-virtual {v1}, Landroid/content/Context;->getDisplay()Landroid/view/Display;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    if-nez v0, :cond_3b

    .line 996
    .line 997
    goto :goto_17

    .line 998
    :cond_3b
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 999
    .line 1000
    .line 1001
    move-result v0

    .line 1002
    if-eq v0, v11, :cond_3c

    .line 1003
    .line 1004
    if-eq v0, v3, :cond_3c

    .line 1005
    .line 1006
    goto :goto_17

    .line 1007
    :cond_3c
    move v12, v13

    .line 1008
    :goto_17
    if-eqz v12, :cond_3d

    .line 1009
    .line 1010
    const/16 v13, 0x9

    .line 1011
    .line 1012
    :cond_3d
    invoke-virtual {v1, v13}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 1013
    .line 1014
    .line 1015
    sget-object v0, Lyyds/ᛲᲈᲀᛲ;->ᛲᲈᲁ:Ljava/util/HashMap;

    .line 1016
    .line 1017
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 1018
    .line 1019
    .line 1020
    move-result v3

    .line 1021
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v3

    .line 1025
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v5

    .line 1029
    invoke-virtual {v0, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 1030
    .line 1031
    .line 1032
    goto :goto_19

    .line 1033
    :goto_18
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 1034
    .line 1035
    .line 1036
    :goto_19
    monitor-exit v2

    .line 1037
    :goto_1a
    new-instance v17, Lyyds/ᲁᛷᲁᛳ;

    .line 1038
    .line 1039
    move-object/from16 v20, v1

    .line 1040
    .line 1041
    move-object/from16 v18, v4

    .line 1042
    .line 1043
    invoke-direct/range {v17 .. v22}, Lyyds/ᲁᛷᲁᛳ;-><init>(Lyyds/ᛷᲀᲇᲈ;Ljava/util/Iterator;Landroid/app/Activity;Lyyds/ᛵᛸᛳ;Lyyds/ᛴᛲᛷᛸ;)V

    .line 1044
    .line 1045
    .line 1046
    move-object/from16 v0, v17

    .line 1047
    .line 1048
    move-object/from16 v2, v21

    .line 1049
    .line 1050
    move-object/from16 v3, v22

    .line 1051
    .line 1052
    invoke-static {v1, v10, v2, v3, v0}, Lyyds/ᛷᲀᲇᲈ;->ᲇᲇᲇᛱ(Landroid/app/Activity;Ljava/util/List;Lyyds/ᛵᛸᛳ;Lyyds/ᛴᛲᛷᛸ;Lyyds/ᲁᛷᲁᛳ;)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_1d

    .line 1056
    :goto_1b
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 1057
    throw v0

    .line 1058
    :goto_1c
    invoke-virtual/range {v18 .. v18}, Lyyds/ᛷᲀᲇᲈ;->ᛲᲈᲁ()V

    .line 1059
    .line 1060
    .line 1061
    :goto_1d
    return-void

    .line 1062
    :cond_3e
    throw v16

    .line 1063
    :goto_1e
    :try_start_a
    monitor-exit v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 1064
    throw v0
.end method

.method public ᛲᲈᲁ()V
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-static {v0}, Lyyds/ᛴᛶᲀᛲ;->ᛷᲈᲈᲁ(Landroid/app/Activity;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Lyyds/ᛲᛴᛷᲁ;

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-virtual {v4, v0, v5}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛵᲇᲀ(Landroid/content/Context;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object p0, p0, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Lyyds/ᛳᛷ;

    .line 68
    .line 69
    invoke-interface {p0, v3}, Lyyds/ᛳᛷ;->ᲇᲈᛵᛷ(Ljava/util/ArrayList;)V

    .line 70
    .line 71
    .line 72
    new-instance p0, Lyyds/ᛶᛱᲇᲁ;

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    invoke-direct {p0, v0, v1}, Lyyds/ᛶᛱᲇᲁ;-><init>(Landroid/app/Activity;I)V

    .line 76
    .line 77
    .line 78
    const-wide/16 v0, 0x64

    .line 79
    .line 80
    sget-object v2, Lyyds/ᛵᛷᛶᲁ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 81
    .line 82
    invoke-virtual {v2, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲀᲈᛷᛷ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyyds/ᲀᲈᛷᛷ;->ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public ᛶᛷᛲᲁ(Ljava/lang/String;)V
    .locals 12

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x3

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "ws:"

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "http:"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x4

    .line 28
    const/4 v8, 0x0

    .line 29
    const-string v9, "wss:"

    .line 30
    .line 31
    move-object v6, v0

    .line 32
    move v7, v1

    .line 33
    invoke-virtual/range {v6 .. v11}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x4

    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v0, "https:"

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object p1, v0

    .line 52
    :goto_0
    new-instance v0, Lyyds/ᛱᛲᛴᛲ;

    .line 53
    .line 54
    invoke-direct {v0}, Lyyds/ᛱᛲᛴᛲ;-><init>()V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-virtual {v0, v1, p1}, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ(Lyyds/ᛱᛲᲀᛶ;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lyyds/ᛱᛲᛴᛲ;->ᛲᲈᲁ()Lyyds/ᛱᛲᲀᛶ;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 66
    .line 67
    return-void
.end method

.method public ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛳᛸᲀᛵ;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_3

    .line 6
    .line 7
    const-string v0, "method "

    .line 8
    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    const-string v1, "POST"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const-string v1, "PUT"

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const-string v1, "PATCH"

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    const-string v1, "PROPPATCH"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    const-string v1, "QUERY"

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    const-string v1, "REPORT"

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const-string p0, " must have a request body."

    .line 61
    .line 62
    invoke-static {v0, p1, p0}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    invoke-static {p1}, Lyyds/ᛳᛵᲀ;->ᛱᲈᲁ(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    :goto_0
    iput-object p1, p0, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object p2, p0, Lyyds/ᛷᲀᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    const-string p0, " must not have a request body."

    .line 82
    .line 83
    invoke-static {v0, p1, p0}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    const-string p0, "method.isEmpty() == true"

    .line 92
    .line 93
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public ᲇᲈᛵᛷ(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲀᲈᛷᛷ;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lyyds/ᲀᲈᛷᛷ;->ᲇᲈᛵᛷ(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
