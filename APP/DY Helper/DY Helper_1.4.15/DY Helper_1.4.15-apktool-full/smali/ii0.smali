.class public final synthetic Lii0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 14
    iput p2, p0, Lii0;->ε:I

    iput-object p1, p0, Lii0;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Lii0;->η:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lji0;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lii0;->ε:I

    .line 3
    .line 4
    sget-object v0, Lvj0;->α:Lvj0;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lii0;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, Lii0;->η:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method private final α()V
    .locals 12

    .line 1
    iget-object v0, p0, Lii0;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, Lii0;->η:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lvv1;

    .line 8
    .line 9
    sget-object v1, Lxv1;->α:Ljava/util/List;

    .line 10
    .line 11
    iget-wide v1, p0, Lvv1;->ζ:J

    .line 12
    .line 13
    const-string v3, "\u540c\u6b65\u5199\u5165\u5df2\u8df3\u8fc7 [share_panel_actions]: expectedGeneration="

    .line 14
    .line 15
    sget-object v4, Lui1;->α:Ljava/lang/Object;

    .line 16
    .line 17
    const-string v4, "share_panel_actions"

    .line 18
    .line 19
    new-instance v5, Lorg/json/JSONArray;

    .line 20
    .line 21
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const/4 v8, 0x0

    .line 35
    if-eqz v7, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    check-cast v7, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v7}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-lez v9, :cond_1

    .line 56
    .line 57
    move-object v8, v7

    .line 58
    :cond_1
    if-eqz v8, :cond_0

    .line 59
    .line 60
    invoke-virtual {v6, v8}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-static {v6}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {v5, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x4

    .line 80
    :try_start_0
    sget-object v7, Lui1;->α:Ljava/lang/Object;

    .line 81
    .line 82
    monitor-enter v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 83
    :try_start_1
    sget-wide v9, Lui1;->θ:J

    .line 84
    .line 85
    cmp-long v9, v9, v1

    .line 86
    .line 87
    if-eqz v9, :cond_3

    .line 88
    .line 89
    const-string v0, "r24d5e64064e1c279"

    .line 90
    .line 91
    sget-wide v9, Lui1;->θ:J

    .line 92
    .line 93
    new-instance v11, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v11, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v11, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, ", currentGeneration="

    .line 102
    .line 103
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v0, v1, v8, v6, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :goto_1
    move v0, v5

    .line 117
    goto :goto_2

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto :goto_3

    .line 120
    :cond_3
    sget-object v1, Lui1;->δ:Landroid/content/SharedPreferences;

    .line 121
    .line 122
    if-nez v1, :cond_4

    .line 123
    .line 124
    sget-object v1, Lui1;->γ:Landroid/content/SharedPreferences;

    .line 125
    .line 126
    :cond_4
    if-nez v1, :cond_5

    .line 127
    .line 128
    const-string v0, "r24d5e64064e1c279"

    .line 129
    .line 130
    const-string v1, "\u540c\u6b65\u5199\u5165\u5931\u8d25 [share_panel_actions]: PrefsManager \u5c1a\u672a\u521d\u59cb\u5316"

    .line 131
    .line 132
    invoke-static {v0, v1, v8, v6, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_5
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-interface {v1, v4, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 145
    .line 146
    .line 147
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    :goto_2
    :try_start_2
    monitor-exit v7

    .line 149
    move v5, v0

    .line 150
    goto :goto_5

    .line 151
    :catchall_1
    move-exception v0

    .line 152
    goto :goto_4

    .line 153
    :goto_3
    monitor-exit v7

    .line 154
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 155
    :goto_4
    const-string v1, "r24d5e64064e1c279"

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const-string v2, "\u540c\u6b65\u5199\u5165\u5931\u8d25 [share_panel_actions]: "

    .line 162
    .line 163
    invoke-static {v2, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v1, v0, v8, v6, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :goto_5
    if-eqz v5, :cond_6

    .line 171
    .line 172
    invoke-static {v4}, Lui1;->Β(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_6
    const-string v0, "r24d5e64064e1c279"

    .line 177
    .line 178
    const-string v1, "\u540c\u6b65\u5199\u5165\u672a\u843d\u76d8 [share_panel_actions]"

    .line 179
    .line 180
    invoke-static {v0, v1, v8, v6, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :goto_6
    iget-object v0, p0, Lvv1;->α:Landroid/app/Activity;

    .line 184
    .line 185
    new-instance v1, Ljg;

    .line 186
    .line 187
    const/4 v2, 0x5

    .line 188
    invoke-direct {v1, p0, v5, v2}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 192
    .line 193
    .line 194
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lii0;->ε:I

    .line 4
    .line 5
    const/16 v3, 0x18

    .line 6
    .line 7
    const-string v4, ""

    .line 8
    .line 9
    const-string v5, "DYHelper"

    .line 10
    .line 11
    const/4 v8, 0x1

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v12, v1

    .line 20
    check-cast v12, Landroid/app/Activity;

    .line 21
    .line 22
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v13, v0

    .line 25
    check-cast v13, Lt72;

    .line 26
    .line 27
    invoke-virtual {v12}, Landroid/app/Activity;->isFinishing()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v12}, Landroid/app/Activity;->isDestroyed()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_1
    sget-object v0, Lu72;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    invoke-virtual {v0, v9, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :cond_2
    iget v0, v13, Lt72;->α:I

    .line 54
    .line 55
    sput v0, Lu72;->κ:I

    .line 56
    .line 57
    const-string v0, "\u6700\u65b0\u7248\u672c\uff1a"

    .line 58
    .line 59
    const-string v1, "v"

    .line 60
    .line 61
    :try_start_0
    sget-object v4, Lx01;->α:Lx01;

    .line 62
    .line 63
    invoke-virtual {v4, v12}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const v5, 0x7f0c003d

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v5, v10, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const v5, 0x7f090315

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Landroid/widget/TextView;

    .line 82
    .line 83
    const v8, 0x7f090311

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    check-cast v8, Landroid/widget/TextView;

    .line 91
    .line 92
    const v11, 0x7f090050

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    check-cast v11, Landroid/widget/TextView;

    .line 100
    .line 101
    const v14, 0x7f090316

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v14

    .line 108
    check-cast v14, Landroid/widget/TextView;

    .line 109
    .line 110
    const v15, 0x7f090312

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    check-cast v15, Landroid/widget/TextView;

    .line 118
    .line 119
    const v6, 0x7f090313

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    check-cast v6, Landroid/widget/TextView;

    .line 127
    .line 128
    const v10, 0x7f09025c

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    check-cast v10, Landroid/widget/ProgressBar;

    .line 136
    .line 137
    const v2, 0x7f090314

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Landroid/widget/TextView;

    .line 145
    .line 146
    const v9, 0x7f090052

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    check-cast v9, Landroid/widget/Button;

    .line 154
    .line 155
    const v7, 0x7f090051

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    move-object/from16 v16, v7

    .line 163
    .line 164
    check-cast v16, Landroid/widget/Button;

    .line 165
    .line 166
    const-string v7, "\u53d1\u73b0\u65b0\u7248\u672c"

    .line 167
    .line 168
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    iget v5, v13, Lt72;->α:I

    .line 172
    .line 173
    new-instance v7, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    .line 187
    .line 188
    iget-object v1, v13, Lt72;->β:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-eqz v5, :cond_3

    .line 195
    .line 196
    iget v1, v13, Lt72;->α:I

    .line 197
    .line 198
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    goto :goto_0

    .line 203
    :catchall_0
    move-exception v0

    .line 204
    goto/16 :goto_1

    .line 205
    .line 206
    :cond_3
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    .line 220
    .line 221
    const-string v0, "\u5f53\u524d\u7248\u672c\uff1a1.4.15 (60)"

    .line 222
    .line 223
    invoke-virtual {v15, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v13, Lt72;->δ:Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_4

    .line 233
    .line 234
    const-string v0, "\u68c0\u6d4b\u5230 DYHelper \u65b0\u7248\u672c\uff0c\u5efa\u8bae\u4e0b\u8f7d\u66f4\u65b0\u3002"

    .line 235
    .line 236
    :cond_4
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    .line 238
    .line 239
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 240
    .line 241
    invoke-direct {v0, v12}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    new-instance v1, Lsa;

    .line 253
    .line 254
    invoke-direct {v1, v0, v3}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v11, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    .line 259
    .line 260
    new-instance v1, Lc9;

    .line 261
    .line 262
    const/16 v3, 0x11

    .line 263
    .line 264
    invoke-direct {v1, v13, v12, v0, v3}, Lc9;-><init>(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/Object;I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v9, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 268
    .line 269
    .line 270
    new-instance v11, Lcl0;

    .line 271
    .line 272
    move-object v15, v2

    .line 273
    move-object/from16 v17, v9

    .line 274
    .line 275
    move-object v14, v10

    .line 276
    invoke-direct/range {v11 .. v17}, Lcl0;-><init>(Landroid/app/Activity;Lt72;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;)V

    .line 277
    .line 278
    .line 279
    move-object/from16 v7, v16

    .line 280
    .line 281
    invoke-virtual {v7, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    .line 283
    .line 284
    new-instance v1, Lz90;

    .line 285
    .line 286
    const/4 v2, 0x2

    .line 287
    invoke-direct {v1, v2}, Lz90;-><init>(I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-eqz v0, :cond_5

    .line 301
    .line 302
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 303
    .line 304
    const/4 v2, 0x0

    .line 305
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 316
    .line 317
    .line 318
    const/high16 v1, 0x3f000000    # 0.5f

    .line 319
    .line 320
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 321
    .line 322
    .line 323
    const/4 v2, 0x2

    .line 324
    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 336
    .line 337
    int-to-float v1, v1

    .line 338
    const v2, 0x3f6b851f    # 0.92f

    .line 339
    .line 340
    .line 341
    mul-float/2addr v1, v2

    .line 342
    float-to-int v1, v1

    .line 343
    const/4 v2, -0x2

    .line 344
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 345
    .line 346
    .line 347
    goto :goto_2

    .line 348
    :goto_1
    sget-object v1, Lu72;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 349
    .line 350
    const/4 v2, 0x0

    .line 351
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    const-string v1, "show update dialog failed: "

    .line 359
    .line 360
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    const-string v1, "r5f3b6ae7236977e4"

    .line 365
    .line 366
    const/4 v2, 0x4

    .line 367
    const/4 v3, 0x0

    .line 368
    invoke-static {v1, v0, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_5
    :goto_2
    return-void

    .line 372
    :pswitch_0
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v1, Ljava/lang/Class;

    .line 375
    .line 376
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v0, Ljava/util/List;

    .line 379
    .line 380
    sget-object v2, Lo22;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 381
    .line 382
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    if-nez v2, :cond_6

    .line 391
    .line 392
    goto :goto_4

    .line 393
    :cond_6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    if-eqz v3, :cond_7

    .line 402
    .line 403
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    check-cast v3, Ljava/lang/reflect/Method;

    .line 408
    .line 409
    sget-object v4, Lo22;->α:Lo22;

    .line 410
    .line 411
    invoke-virtual {v4, v3}, Lo22;->ν(Ljava/lang/reflect/Method;)V

    .line 412
    .line 413
    .line 414
    goto :goto_3

    .line 415
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    new-instance v2, Ljava/lang/StringBuilder;

    .line 424
    .line 425
    const-string v3, "rc6f8b5d3c7a9871a"

    .line 426
    .line 427
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    :goto_4
    return-void

    .line 444
    :pswitch_1
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v1, Ljava/lang/Class;

    .line 447
    .line 448
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v0, Ljava/lang/ClassLoader;

    .line 451
    .line 452
    :try_start_1
    sget-object v2, Lvb;->α:Ljava/util/List;

    .line 453
    .line 454
    invoke-static {v1, v0}, Lvb;->σ(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 458
    goto :goto_5

    .line 459
    :catchall_1
    move-exception v0

    .line 460
    new-instance v2, Leo1;

    .line 461
    .line 462
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 463
    .line 464
    .line 465
    move-object v0, v2

    .line 466
    :goto_5
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    if-nez v2, :cond_8

    .line 471
    .line 472
    goto :goto_6

    .line 473
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    new-instance v3, Ljava/lang/StringBuilder;

    .line 478
    .line 479
    const-string v4, "r68f0adab1d2830ab"

    .line 480
    .line 481
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    sget-object v0, Ljz;->ε:Ljz;

    .line 498
    .line 499
    :goto_6
    check-cast v0, Ljava/util/List;

    .line 500
    .line 501
    sget-object v2, Lo22;->ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 502
    .line 503
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-eqz v2, :cond_9

    .line 515
    .line 516
    goto :goto_7

    .line 517
    :cond_9
    sget-object v2, Lo22;->ψ:Landroid/os/Handler;

    .line 518
    .line 519
    new-instance v3, Lii0;

    .line 520
    .line 521
    const/16 v4, 0x1c

    .line 522
    .line 523
    invoke-direct {v3, v1, v4, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 527
    .line 528
    .line 529
    :goto_7
    return-void

    .line 530
    :pswitch_2
    invoke-direct {v0}, Lii0;->α()V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :pswitch_3
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v1, Landroid/app/Activity;

    .line 537
    .line 538
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v0, Lnt;

    .line 541
    .line 542
    :try_start_2
    new-instance v2, Lvv1;

    .line 543
    .line 544
    invoke-direct {v2, v1, v0}, Lvv1;-><init>(Landroid/app/Activity;Lnt;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2}, Lvv1;->δ()V

    .line 548
    .line 549
    .line 550
    sget-object v0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 551
    .line 552
    goto :goto_8

    .line 553
    :catchall_2
    move-exception v0

    .line 554
    new-instance v2, Leo1;

    .line 555
    .line 556
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 557
    .line 558
    .line 559
    move-object v0, v2

    .line 560
    :goto_8
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    if-eqz v0, :cond_a

    .line 565
    .line 566
    const-string v2, "\u5206\u4eab\u5feb\u6377\u6309\u94ae XML \u914d\u7f6e\u7a97\u53e3\u52a0\u8f7d\u5931\u8d25"

    .line 567
    .line 568
    invoke-static {v5, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 569
    .line 570
    .line 571
    const-string v0, "\u5206\u4eab\u5feb\u6377\u6309\u94ae\u914d\u7f6e\u52a0\u8f7d\u5931\u8d25"

    .line 572
    .line 573
    const/4 v2, 0x0

    .line 574
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 579
    .line 580
    .line 581
    :cond_a
    return-void

    .line 582
    :pswitch_4
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v1, Landroid/app/Activity;

    .line 585
    .line 586
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 587
    .line 588
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    if-nez v2, :cond_e

    .line 593
    .line 594
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 595
    .line 596
    .line 597
    move-result v2

    .line 598
    if-eqz v2, :cond_b

    .line 599
    .line 600
    goto/16 :goto_a

    .line 601
    .line 602
    :cond_b
    instance-of v2, v0, Leo1;

    .line 603
    .line 604
    if-nez v2, :cond_d

    .line 605
    .line 606
    move-object v2, v0

    .line 607
    check-cast v2, Lsi1;

    .line 608
    .line 609
    new-instance v3, Ljava/lang/StringBuilder;

    .line 610
    .line 611
    const-string v4, "\u5168\u91cf\u6e05\u9664\u7528\u6237\u914d\u7f6e\u7ed3\u679c: "

    .line 612
    .line 613
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    const/4 v4, 0x4

    .line 624
    const/4 v6, 0x0

    .line 625
    invoke-static {v5, v3, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    :try_start_3
    invoke-static {v1}, Lx9;->ο(Landroid/content/Context;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 629
    .line 630
    .line 631
    :catchall_3
    iget-boolean v3, v2, Lsi1;->α:Z

    .line 632
    .line 633
    if-eqz v3, :cond_c

    .line 634
    .line 635
    iget v3, v2, Lsi1;->γ:I

    .line 636
    .line 637
    iget v2, v2, Lsi1;->δ:I

    .line 638
    .line 639
    const-string v4, " \u4e2a\u914d\u7f6e\uff0c\u5220\u9664 "

    .line 640
    .line 641
    const-string v6, " \u4e2a\u6587\u4ef6"

    .line 642
    .line 643
    const-string v7, "\u5df2\u6e05\u9664\u5168\u90e8\u7528\u6237\u914d\u7f6e\uff1a"

    .line 644
    .line 645
    invoke-static {v7, v3, v4, v2, v6}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    invoke-static {v1, v2, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 654
    .line 655
    .line 656
    sget-object v2, Lbv1;->β:Landroid/app/AlertDialog;

    .line 657
    .line 658
    if-eqz v2, :cond_d

    .line 659
    .line 660
    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    .line 661
    .line 662
    .line 663
    goto :goto_9

    .line 664
    :cond_c
    iget-object v2, v2, Lsi1;->ε:Ljava/util/List;

    .line 665
    .line 666
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    new-instance v3, Ljava/lang/StringBuilder;

    .line 671
    .line 672
    const-string v4, "\u6e05\u9664\u5b8c\u6210\uff0c\u4f46\u6709 "

    .line 673
    .line 674
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    const-string v2, " \u9879\u5931\u8d25\uff0c\u8bf7\u67e5\u770b DyLog"

    .line 681
    .line 682
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    invoke-static {v1, v2, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 694
    .line 695
    .line 696
    :cond_d
    :goto_9
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    if-eqz v0, :cond_e

    .line 701
    .line 702
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    new-instance v3, Ljava/lang/StringBuilder;

    .line 707
    .line 708
    const-string v4, "\u6e05\u9664\u5931\u8d25: "

    .line 709
    .line 710
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    const/4 v3, 0x0

    .line 721
    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    new-instance v2, Ljava/lang/StringBuilder;

    .line 733
    .line 734
    const-string v3, "\u5168\u91cf\u6e05\u9664\u7528\u6237\u914d\u7f6e\u5931\u8d25: "

    .line 735
    .line 736
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    invoke-static {v5, v1, v0}, Lux;->τ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 747
    .line 748
    .line 749
    :cond_e
    :goto_a
    return-void

    .line 750
    :pswitch_5
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v1, Lju1;

    .line 753
    .line 754
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v0, Landroid/content/Intent;

    .line 757
    .line 758
    const/16 v2, 0x3e9

    .line 759
    .line 760
    :try_start_4
    invoke-virtual {v1, v0, v2}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 761
    .line 762
    .line 763
    goto :goto_b

    .line 764
    :catch_0
    move-exception v0

    .line 765
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    const-string v3, "\u542f\u52a8\u5bfc\u51fa Intent \u5931\u8d25: "

    .line 770
    .line 771
    invoke-static {v3, v2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    const/4 v3, 0x0

    .line 776
    const/4 v4, 0x4

    .line 777
    invoke-static {v5, v2, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    iget-object v1, v1, Lju1;->ζ:Lit1;

    .line 781
    .line 782
    if-eqz v1, :cond_f

    .line 783
    .line 784
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 785
    .line 786
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    new-instance v3, Ljava/lang/StringBuilder;

    .line 791
    .line 792
    const-string v4, "\u5bfc\u51fa\u5931\u8d25: "

    .line 793
    .line 794
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    invoke-virtual {v1, v2, v0}, Lit1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    :cond_f
    :goto_b
    return-void

    .line 808
    :pswitch_6
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v1, Lkt0;

    .line 811
    .line 812
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast v0, Landroid/widget/LinearLayout;

    .line 815
    .line 816
    invoke-virtual {v1}, Lkt0;->invoke()Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    const/high16 v1, 0x41000000    # 8.0f

    .line 820
    .line 821
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    const/high16 v1, 0x3f800000    # 1.0f

    .line 829
    .line 830
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    const/4 v1, 0x0

    .line 835
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    const-wide/16 v1, 0xdc

    .line 840
    .line 841
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 846
    .line 847
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 855
    .line 856
    .line 857
    return-void

    .line 858
    :pswitch_7
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v1, Ly5;

    .line 861
    .line 862
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v0, Landroid/graphics/Typeface;

    .line 865
    .line 866
    invoke-virtual {v1, v0}, Ly5;->β(Landroid/graphics/Typeface;)V

    .line 867
    .line 868
    .line 869
    return-void

    .line 870
    :pswitch_8
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v1, Landroid/view/View;

    .line 873
    .line 874
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;

    .line 877
    .line 878
    invoke-static {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->ε(Landroid/view/View;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)V

    .line 879
    .line 880
    .line 881
    return-void

    .line 882
    :pswitch_9
    sget-object v1, Laz0;->ε:Laz0;

    .line 883
    .line 884
    sget-object v2, Lh8;->ζ:Lh8;

    .line 885
    .line 886
    sget-object v4, Laz0;->ζ:Laz0;

    .line 887
    .line 888
    sget-object v5, Lh8;->ε:Lh8;

    .line 889
    .line 890
    iget-object v6, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v6, Ljava/util/List;

    .line 893
    .line 894
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 895
    .line 896
    move-object v10, v0

    .line 897
    check-cast v10, Landroid/app/Activity;

    .line 898
    .line 899
    sget-object v0, Lcj1;->α:Lcj1;

    .line 900
    .line 901
    new-instance v11, Ljava/util/ArrayList;

    .line 902
    .line 903
    const/16 v0, 0xa

    .line 904
    .line 905
    invoke-static {v6, v0}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 906
    .line 907
    .line 908
    move-result v0

    .line 909
    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 910
    .line 911
    .line 912
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    const/16 v21, 0x0

    .line 917
    .line 918
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 919
    .line 920
    .line 921
    move-result v6

    .line 922
    if-eqz v6, :cond_28

    .line 923
    .line 924
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v6

    .line 928
    add-int/lit8 v7, v21, 0x1

    .line 929
    .line 930
    if-ltz v21, :cond_27

    .line 931
    .line 932
    check-cast v6, Lf8;

    .line 933
    .line 934
    new-instance v19, Lzy0;

    .line 935
    .line 936
    iget-object v9, v6, Lf8;->ζ:Lh8;

    .line 937
    .line 938
    iget-object v12, v6, Lf8;->Η:Ljava/util/List;

    .line 939
    .line 940
    sget-object v13, Lh8;->η:Lh8;

    .line 941
    .line 942
    if-eq v9, v13, :cond_17

    .line 943
    .line 944
    invoke-virtual {v6}, Lf8;->λ()Z

    .line 945
    .line 946
    .line 947
    move-result v14

    .line 948
    if-eqz v14, :cond_10

    .line 949
    .line 950
    goto :goto_12

    .line 951
    :cond_10
    if-ne v9, v5, :cond_11

    .line 952
    .line 953
    :goto_d
    move-object/from16 v20, v4

    .line 954
    .line 955
    goto :goto_13

    .line 956
    :cond_11
    if-eq v9, v2, :cond_16

    .line 957
    .line 958
    invoke-virtual {v6}, Lf8;->κ()Z

    .line 959
    .line 960
    .line 961
    move-result v14

    .line 962
    if-eqz v14, :cond_12

    .line 963
    .line 964
    goto :goto_11

    .line 965
    :cond_12
    if-eqz v12, :cond_14

    .line 966
    .line 967
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 968
    .line 969
    .line 970
    move-result v14

    .line 971
    if-eqz v14, :cond_13

    .line 972
    .line 973
    goto :goto_e

    .line 974
    :cond_13
    const/4 v14, 0x0

    .line 975
    goto :goto_f

    .line 976
    :cond_14
    :goto_e
    move v14, v8

    .line 977
    :goto_f
    if-nez v14, :cond_15

    .line 978
    .line 979
    sget-object v14, Laz0;->η:Laz0;

    .line 980
    .line 981
    :goto_10
    move-object/from16 v20, v14

    .line 982
    .line 983
    goto :goto_13

    .line 984
    :cond_15
    invoke-virtual {v6}, Lf8;->ν()Z

    .line 985
    .line 986
    .line 987
    move-result v14

    .line 988
    if-eqz v14, :cond_16

    .line 989
    .line 990
    goto :goto_d

    .line 991
    :cond_16
    :goto_11
    move-object/from16 v20, v1

    .line 992
    .line 993
    goto :goto_13

    .line 994
    :cond_17
    :goto_12
    sget-object v14, Laz0;->θ:Laz0;

    .line 995
    .line 996
    goto :goto_10

    .line 997
    :goto_13
    iget-object v14, v6, Lf8;->β:Ljava/lang/String;

    .line 998
    .line 999
    invoke-static {v14}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v14

    .line 1003
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v14

    .line 1007
    invoke-static {v14}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1008
    .line 1009
    .line 1010
    move-result v15

    .line 1011
    if-nez v15, :cond_18

    .line 1012
    .line 1013
    const-string v15, "\u65e0\u63cf\u8ff0"

    .line 1014
    .line 1015
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1016
    .line 1017
    .line 1018
    move-result v15

    .line 1019
    if-nez v15, :cond_18

    .line 1020
    .line 1021
    goto :goto_14

    .line 1022
    :cond_18
    const/4 v14, 0x0

    .line 1023
    :goto_14
    if-eqz v14, :cond_19

    .line 1024
    .line 1025
    invoke-static {v14, v3}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v14

    .line 1029
    :goto_15
    move-object/from16 v23, v14

    .line 1030
    .line 1031
    goto :goto_16

    .line 1032
    :cond_19
    const-string v14, "\u4f5c\u54c1 "

    .line 1033
    .line 1034
    invoke-static {v14, v7}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v14

    .line 1038
    goto :goto_15

    .line 1039
    :goto_16
    const-string v14, "\u52a8\u56fe"

    .line 1040
    .line 1041
    if-eq v9, v13, :cond_1f

    .line 1042
    .line 1043
    invoke-virtual {v6}, Lf8;->λ()Z

    .line 1044
    .line 1045
    .line 1046
    move-result v13

    .line 1047
    if-eqz v13, :cond_1a

    .line 1048
    .line 1049
    goto :goto_19

    .line 1050
    :cond_1a
    if-eq v9, v5, :cond_22

    .line 1051
    .line 1052
    invoke-virtual {v6}, Lf8;->ν()Z

    .line 1053
    .line 1054
    .line 1055
    move-result v13

    .line 1056
    if-eqz v13, :cond_1b

    .line 1057
    .line 1058
    goto :goto_1b

    .line 1059
    :cond_1b
    if-eq v9, v2, :cond_21

    .line 1060
    .line 1061
    invoke-virtual {v6}, Lf8;->κ()Z

    .line 1062
    .line 1063
    .line 1064
    move-result v9

    .line 1065
    if-eqz v9, :cond_1c

    .line 1066
    .line 1067
    goto :goto_1a

    .line 1068
    :cond_1c
    if-eqz v12, :cond_1e

    .line 1069
    .line 1070
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 1071
    .line 1072
    .line 1073
    move-result v9

    .line 1074
    if-eqz v9, :cond_1d

    .line 1075
    .line 1076
    goto :goto_17

    .line 1077
    :cond_1d
    const/4 v9, 0x0

    .line 1078
    goto :goto_18

    .line 1079
    :cond_1e
    :goto_17
    move v9, v8

    .line 1080
    :goto_18
    if-nez v9, :cond_20

    .line 1081
    .line 1082
    :cond_1f
    :goto_19
    move-object/from16 v24, v14

    .line 1083
    .line 1084
    goto :goto_1c

    .line 1085
    :cond_20
    const-string v14, "\u4f5c\u54c1"

    .line 1086
    .line 1087
    goto :goto_19

    .line 1088
    :cond_21
    :goto_1a
    const-string v14, "\u56fe\u6587"

    .line 1089
    .line 1090
    goto :goto_19

    .line 1091
    :cond_22
    :goto_1b
    const-string v14, "\u89c6\u9891"

    .line 1092
    .line 1093
    goto :goto_19

    .line 1094
    :goto_1c
    invoke-static {v6}, Lcj1;->ρ(Lf8;)Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v25

    .line 1098
    invoke-static {v6}, Lcj1;->ρ(Lf8;)Ljava/lang/String;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v26

    .line 1102
    invoke-virtual {v6}, Lf8;->ζ()Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v9

    .line 1106
    if-nez v9, :cond_23

    .line 1107
    .line 1108
    invoke-static {v12}, Lcj1;->ζ(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v9

    .line 1112
    if-nez v9, :cond_23

    .line 1113
    .line 1114
    invoke-virtual {v6}, Lf8;->η()Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v9

    .line 1118
    :cond_23
    move-object/from16 v27, v9

    .line 1119
    .line 1120
    iget-object v9, v6, Lf8;->γ:Ljava/util/List;

    .line 1121
    .line 1122
    if-nez v9, :cond_24

    .line 1123
    .line 1124
    sget-object v9, Ljz;->ε:Ljz;

    .line 1125
    .line 1126
    :cond_24
    new-instance v12, Ljava/util/ArrayList;

    .line 1127
    .line 1128
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1129
    .line 1130
    .line 1131
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v9

    .line 1135
    :cond_25
    :goto_1d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1136
    .line 1137
    .line 1138
    move-result v13

    .line 1139
    if-eqz v13, :cond_26

    .line 1140
    .line 1141
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v13

    .line 1145
    check-cast v13, Ljava/lang/String;

    .line 1146
    .line 1147
    invoke-static {v13}, Lcj1;->θ(Ljava/lang/String;)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v13

    .line 1151
    if-eqz v13, :cond_25

    .line 1152
    .line 1153
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    goto :goto_1d

    .line 1157
    :cond_26
    invoke-static {v12}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v9

    .line 1161
    invoke-static {v9}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v28

    .line 1165
    move-object/from16 v29, v6

    .line 1166
    .line 1167
    move/from16 v22, v7

    .line 1168
    .line 1169
    invoke-direct/range {v19 .. v29}, Lzy0;-><init>(Laz0;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)V

    .line 1170
    .line 1171
    .line 1172
    move-object/from16 v6, v19

    .line 1173
    .line 1174
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1175
    .line 1176
    .line 1177
    move/from16 v21, v22

    .line 1178
    .line 1179
    goto/16 :goto_c

    .line 1180
    .line 1181
    :cond_27
    invoke-static {}, Lyh;->х()V

    .line 1182
    .line 1183
    .line 1184
    const/16 v18, 0x0

    .line 1185
    .line 1186
    throw v18

    .line 1187
    :cond_28
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1188
    .line 1189
    .line 1190
    move-result v0

    .line 1191
    if-eqz v0, :cond_29

    .line 1192
    .line 1193
    const-string v0, "\u6ca1\u6709\u53ef\u9009\u62e9\u4e0b\u8f7d\u7684\u4f5c\u54c1"

    .line 1194
    .line 1195
    invoke-static {v10, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0

    .line 1199
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1200
    .line 1201
    .line 1202
    goto :goto_1e

    .line 1203
    :cond_29
    new-instance v9, Ldz0;

    .line 1204
    .line 1205
    sget-object v12, Lyy0;->ζ:Lyy0;

    .line 1206
    .line 1207
    new-instance v15, Lg71;

    .line 1208
    .line 1209
    const/16 v0, 0x8

    .line 1210
    .line 1211
    invoke-direct {v15, v10, v0}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 1212
    .line 1213
    .line 1214
    const-string v13, "\u9009\u62e9\u4e3b\u9875\u4f5c\u54c1"

    .line 1215
    .line 1216
    const-string v14, "\u4f5c\u54c1"

    .line 1217
    .line 1218
    invoke-direct/range {v9 .. v15}, Ldz0;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;Lyy0;Ljava/lang/String;Ljava/lang/String;La80;)V

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v9}, Ldz0;->θ()V

    .line 1222
    .line 1223
    .line 1224
    :goto_1e
    return-void

    .line 1225
    :pswitch_a
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 1226
    .line 1227
    check-cast v1, Landroid/app/Activity;

    .line 1228
    .line 1229
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 1230
    .line 1231
    check-cast v0, Lzi1;

    .line 1232
    .line 1233
    sget-object v2, Lcj1;->α:Lcj1;

    .line 1234
    .line 1235
    sget-object v2, Ljz;->ε:Ljz;

    .line 1236
    .line 1237
    iget-object v3, v0, Lzi1;->γ:Ljava/util/List;

    .line 1238
    .line 1239
    iget-object v5, v0, Lzi1;->ε:Ljava/lang/Object;

    .line 1240
    .line 1241
    iget-object v6, v0, Lzi1;->δ:Ljava/lang/Object;

    .line 1242
    .line 1243
    iget-object v7, v0, Lzi1;->α:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 1244
    .line 1245
    if-eqz v3, :cond_2a

    .line 1246
    .line 1247
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1248
    .line 1249
    .line 1250
    move-result v9

    .line 1251
    if-eqz v9, :cond_2a

    .line 1252
    .line 1253
    const/4 v10, 0x0

    .line 1254
    goto :goto_20

    .line 1255
    :cond_2a
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v9

    .line 1259
    const/4 v10, 0x0

    .line 1260
    :cond_2b
    :goto_1f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1261
    .line 1262
    .line 1263
    move-result v11

    .line 1264
    if-eqz v11, :cond_2e

    .line 1265
    .line 1266
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v11

    .line 1270
    check-cast v11, Lf8;

    .line 1271
    .line 1272
    iget-object v12, v11, Lf8;->ζ:Lh8;

    .line 1273
    .line 1274
    sget-object v13, Lh8;->η:Lh8;

    .line 1275
    .line 1276
    if-eq v12, v13, :cond_2c

    .line 1277
    .line 1278
    invoke-virtual {v11}, Lf8;->λ()Z

    .line 1279
    .line 1280
    .line 1281
    move-result v11

    .line 1282
    if-eqz v11, :cond_2b

    .line 1283
    .line 1284
    :cond_2c
    add-int/lit8 v10, v10, 0x1

    .line 1285
    .line 1286
    if-ltz v10, :cond_2d

    .line 1287
    .line 1288
    goto :goto_1f

    .line 1289
    :cond_2d
    invoke-static {}, Lyh;->ф()V

    .line 1290
    .line 1291
    .line 1292
    const/16 v18, 0x0

    .line 1293
    .line 1294
    throw v18

    .line 1295
    :cond_2e
    :goto_20
    if-eqz v3, :cond_2f

    .line 1296
    .line 1297
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1298
    .line 1299
    .line 1300
    move-result v9

    .line 1301
    if-eqz v9, :cond_2f

    .line 1302
    .line 1303
    const/4 v11, 0x0

    .line 1304
    goto :goto_22

    .line 1305
    :cond_2f
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v9

    .line 1309
    const/4 v11, 0x0

    .line 1310
    :cond_30
    :goto_21
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1311
    .line 1312
    .line 1313
    move-result v12

    .line 1314
    if-eqz v12, :cond_32

    .line 1315
    .line 1316
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v12

    .line 1320
    check-cast v12, Lf8;

    .line 1321
    .line 1322
    iget-object v12, v12, Lf8;->ζ:Lh8;

    .line 1323
    .line 1324
    sget-object v13, Lh8;->ε:Lh8;

    .line 1325
    .line 1326
    if-ne v12, v13, :cond_30

    .line 1327
    .line 1328
    add-int/lit8 v11, v11, 0x1

    .line 1329
    .line 1330
    if-ltz v11, :cond_31

    .line 1331
    .line 1332
    goto :goto_21

    .line 1333
    :cond_31
    invoke-static {}, Lyh;->ф()V

    .line 1334
    .line 1335
    .line 1336
    const/16 v18, 0x0

    .line 1337
    .line 1338
    throw v18

    .line 1339
    :cond_32
    :goto_22
    if-eqz v3, :cond_33

    .line 1340
    .line 1341
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1342
    .line 1343
    .line 1344
    move-result v9

    .line 1345
    if-eqz v9, :cond_33

    .line 1346
    .line 1347
    const/4 v12, 0x0

    .line 1348
    goto :goto_24

    .line 1349
    :cond_33
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v9

    .line 1353
    const/4 v12, 0x0

    .line 1354
    :cond_34
    :goto_23
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1355
    .line 1356
    .line 1357
    move-result v13

    .line 1358
    if-eqz v13, :cond_36

    .line 1359
    .line 1360
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v13

    .line 1364
    check-cast v13, Lf8;

    .line 1365
    .line 1366
    iget-object v13, v13, Lf8;->ζ:Lh8;

    .line 1367
    .line 1368
    sget-object v14, Lh8;->ζ:Lh8;

    .line 1369
    .line 1370
    if-ne v13, v14, :cond_34

    .line 1371
    .line 1372
    add-int/lit8 v12, v12, 0x1

    .line 1373
    .line 1374
    if-ltz v12, :cond_35

    .line 1375
    .line 1376
    goto :goto_23

    .line 1377
    :cond_35
    invoke-static {}, Lyh;->ф()V

    .line 1378
    .line 1379
    .line 1380
    const/16 v18, 0x0

    .line 1381
    .line 1382
    throw v18

    .line 1383
    :cond_36
    :goto_24
    new-instance v9, Lorg/json/JSONObject;

    .line 1384
    .line 1385
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 1386
    .line 1387
    .line 1388
    const-string v13, "mode"

    .line 1389
    .line 1390
    const-string v14, "profile_active_aweme_debug"

    .line 1391
    .line 1392
    invoke-virtual {v9, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v9

    .line 1396
    iget-object v13, v0, Lzi1;->β:Ljava/lang/String;

    .line 1397
    .line 1398
    const-string v14, "source"

    .line 1399
    .line 1400
    invoke-virtual {v9, v14, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v9

    .line 1404
    new-instance v13, Lorg/json/JSONObject;

    .line 1405
    .line 1406
    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    .line 1407
    .line 1408
    .line 1409
    const-string v15, "uid"

    .line 1410
    .line 1411
    move/from16 v16, v8

    .line 1412
    .line 1413
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v8

    .line 1417
    invoke-virtual {v13, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v8

    .line 1421
    const-string v13, "secUid"

    .line 1422
    .line 1423
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v15

    .line 1427
    invoke-virtual {v8, v13, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v8

    .line 1431
    const-string v13, "nickname"

    .line 1432
    .line 1433
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v7

    .line 1437
    invoke-virtual {v8, v13, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v7

    .line 1441
    const-string v8, "profile"

    .line 1442
    .line 1443
    invoke-virtual {v9, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v7

    .line 1447
    new-instance v8, Lorg/json/JSONObject;

    .line 1448
    .line 1449
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 1450
    .line 1451
    .line 1452
    const-string v9, "recognized"

    .line 1453
    .line 1454
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1455
    .line 1456
    .line 1457
    move-result v13

    .line 1458
    invoke-virtual {v8, v9, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v8

    .line 1462
    const-string v9, "unrecognized"

    .line 1463
    .line 1464
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1465
    .line 1466
    .line 1467
    move-result v13

    .line 1468
    invoke-virtual {v8, v9, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v8

    .line 1472
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1473
    .line 1474
    .line 1475
    move-result v9

    .line 1476
    const-string v13, "pages"

    .line 1477
    .line 1478
    invoke-virtual {v8, v13, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v8

    .line 1482
    const-string v9, "image"

    .line 1483
    .line 1484
    invoke-virtual {v8, v9, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v8

    .line 1488
    const-string v9, "video"

    .line 1489
    .line 1490
    invoke-virtual {v8, v9, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v8

    .line 1494
    const-string v9, "livePhoto"

    .line 1495
    .line 1496
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v8

    .line 1500
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v9

    .line 1504
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1505
    .line 1506
    .line 1507
    move-result v10

    .line 1508
    if-nez v10, :cond_37

    .line 1509
    .line 1510
    const/4 v10, 0x0

    .line 1511
    goto :goto_26

    .line 1512
    :cond_37
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v10

    .line 1516
    check-cast v10, Lf8;

    .line 1517
    .line 1518
    iget v10, v10, Lf8;->ξ:I

    .line 1519
    .line 1520
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v10

    .line 1524
    :cond_38
    :goto_25
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1525
    .line 1526
    .line 1527
    move-result v11

    .line 1528
    if-eqz v11, :cond_39

    .line 1529
    .line 1530
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v11

    .line 1534
    check-cast v11, Lf8;

    .line 1535
    .line 1536
    iget v11, v11, Lf8;->ξ:I

    .line 1537
    .line 1538
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v11

    .line 1542
    invoke-virtual {v10, v11}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 1543
    .line 1544
    .line 1545
    move-result v12

    .line 1546
    if-gez v12, :cond_38

    .line 1547
    .line 1548
    move-object v10, v11

    .line 1549
    goto :goto_25

    .line 1550
    :cond_39
    :goto_26
    if-eqz v10, :cond_3a

    .line 1551
    .line 1552
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 1553
    .line 1554
    .line 1555
    move-result v9

    .line 1556
    goto :goto_27

    .line 1557
    :cond_3a
    const/4 v9, 0x0

    .line 1558
    :goto_27
    const-string v10, "expectedAuthorAwemeCount"

    .line 1559
    .line 1560
    invoke-virtual {v8, v10, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v8

    .line 1564
    const-string v9, "counts"

    .line 1565
    .line 1566
    invoke-virtual {v7, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v7

    .line 1570
    iget-object v0, v0, Lzi1;->ζ:Ljava/lang/String;

    .line 1571
    .line 1572
    if-nez v0, :cond_3b

    .line 1573
    .line 1574
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 1575
    .line 1576
    :cond_3b
    const-string v8, "error"

    .line 1577
    .line 1578
    invoke-virtual {v7, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v0

    .line 1582
    new-instance v7, Lorg/json/JSONArray;

    .line 1583
    .line 1584
    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 1585
    .line 1586
    .line 1587
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v5

    .line 1591
    :goto_28
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v8

    .line 1595
    const-string v9, "page"

    .line 1596
    .line 1597
    if-eqz v8, :cond_3c

    .line 1598
    .line 1599
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v8

    .line 1603
    check-cast v8, Laj1;

    .line 1604
    .line 1605
    new-instance v10, Lorg/json/JSONObject;

    .line 1606
    .line 1607
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 1608
    .line 1609
    .line 1610
    iget v11, v8, Laj1;->α:I

    .line 1611
    .line 1612
    invoke-virtual {v10, v9, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v9

    .line 1616
    iget-object v10, v8, Laj1;->ι:Ljava/lang/String;

    .line 1617
    .line 1618
    invoke-virtual {v9, v14, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v9

    .line 1622
    const-string v10, "rawCount"

    .line 1623
    .line 1624
    iget v11, v8, Laj1;->β:I

    .line 1625
    .line 1626
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v9

    .line 1630
    const-string v10, "recognizedCount"

    .line 1631
    .line 1632
    iget v11, v8, Laj1;->γ:I

    .line 1633
    .line 1634
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v9

    .line 1638
    const-string v10, "unrecognizedCount"

    .line 1639
    .line 1640
    iget v11, v8, Laj1;->δ:I

    .line 1641
    .line 1642
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v9

    .line 1646
    const-string v10, "totalRecognized"

    .line 1647
    .line 1648
    iget v11, v8, Laj1;->ε:I

    .line 1649
    .line 1650
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v9

    .line 1654
    const-string v10, "hasMore"

    .line 1655
    .line 1656
    iget-boolean v11, v8, Laj1;->ζ:Z

    .line 1657
    .line 1658
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v9

    .line 1662
    const-string v10, "nextCursor"

    .line 1663
    .line 1664
    iget-wide v11, v8, Laj1;->η:J

    .line 1665
    .line 1666
    invoke-virtual {v9, v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v9

    .line 1670
    const-string v10, "tailProbe"

    .line 1671
    .line 1672
    iget-boolean v8, v8, Laj1;->θ:Z

    .line 1673
    .line 1674
    invoke-virtual {v9, v10, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v8

    .line 1678
    invoke-virtual {v7, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1679
    .line 1680
    .line 1681
    goto :goto_28

    .line 1682
    :cond_3c
    invoke-virtual {v0, v13, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    new-instance v5, Lorg/json/JSONArray;

    .line 1687
    .line 1688
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 1689
    .line 1690
    .line 1691
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v3

    .line 1695
    const/4 v7, 0x0

    .line 1696
    :goto_29
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1697
    .line 1698
    .line 1699
    move-result v8

    .line 1700
    const-string v10, "desc"

    .line 1701
    .line 1702
    const-string v11, "awemeId"

    .line 1703
    .line 1704
    const-string v12, "index"

    .line 1705
    .line 1706
    if-eqz v8, :cond_47

    .line 1707
    .line 1708
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v8

    .line 1712
    add-int/lit8 v13, v7, 0x1

    .line 1713
    .line 1714
    if-ltz v7, :cond_46

    .line 1715
    .line 1716
    check-cast v8, Lf8;

    .line 1717
    .line 1718
    new-instance v7, Lorg/json/JSONObject;

    .line 1719
    .line 1720
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 1721
    .line 1722
    .line 1723
    invoke-virtual {v7, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v7

    .line 1727
    iget-object v12, v8, Lf8;->θ:Ljava/lang/String;

    .line 1728
    .line 1729
    if-nez v12, :cond_3d

    .line 1730
    .line 1731
    move-object v12, v4

    .line 1732
    :cond_3d
    invoke-virtual {v7, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v7

    .line 1736
    iget-object v11, v8, Lf8;->ζ:Lh8;

    .line 1737
    .line 1738
    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v11

    .line 1742
    const-string v12, "type"

    .line 1743
    .line 1744
    invoke-virtual {v7, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v7

    .line 1748
    iget-object v11, v8, Lf8;->β:Ljava/lang/String;

    .line 1749
    .line 1750
    invoke-virtual {v7, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v7

    .line 1754
    const-string v10, "author"

    .line 1755
    .line 1756
    iget-object v11, v8, Lf8;->α:Ljava/lang/String;

    .line 1757
    .line 1758
    invoke-virtual {v7, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v7

    .line 1762
    const-string v10, "createTime"

    .line 1763
    .line 1764
    iget-wide v11, v8, Lf8;->σ:J

    .line 1765
    .line 1766
    invoke-virtual {v7, v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v7

    .line 1770
    iget-object v10, v8, Lf8;->δ:Ljava/util/List;

    .line 1771
    .line 1772
    if-nez v10, :cond_3e

    .line 1773
    .line 1774
    move-object v10, v2

    .line 1775
    :cond_3e
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1776
    .line 1777
    .line 1778
    move-result v10

    .line 1779
    const-string v11, "imageCount"

    .line 1780
    .line 1781
    invoke-virtual {v7, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v7

    .line 1785
    iget-object v10, v8, Lf8;->γ:Ljava/util/List;

    .line 1786
    .line 1787
    if-nez v10, :cond_3f

    .line 1788
    .line 1789
    move-object v10, v2

    .line 1790
    :cond_3f
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1791
    .line 1792
    .line 1793
    move-result v10

    .line 1794
    const-string v11, "videoUrlCount"

    .line 1795
    .line 1796
    invoke-virtual {v7, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v7

    .line 1800
    iget-object v10, v8, Lf8;->Η:Ljava/util/List;

    .line 1801
    .line 1802
    if-nez v10, :cond_40

    .line 1803
    .line 1804
    move-object v10, v2

    .line 1805
    :cond_40
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1806
    .line 1807
    .line 1808
    move-result v10

    .line 1809
    const-string v11, "animatedUrlCount"

    .line 1810
    .line 1811
    invoke-virtual {v7, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v7

    .line 1815
    iget-object v10, v8, Lf8;->Ο:Ljava/util/List;

    .line 1816
    .line 1817
    if-nez v10, :cond_41

    .line 1818
    .line 1819
    move-object v10, v2

    .line 1820
    :cond_41
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1821
    .line 1822
    .line 1823
    move-result v10

    .line 1824
    const-string v11, "livePhotoItemCount"

    .line 1825
    .line 1826
    invoke-virtual {v7, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v7

    .line 1830
    const-string v10, "hasLivePhoto"

    .line 1831
    .line 1832
    invoke-virtual {v8}, Lf8;->λ()Z

    .line 1833
    .line 1834
    .line 1835
    move-result v11

    .line 1836
    invoke-virtual {v7, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v7

    .line 1840
    iget-object v10, v8, Lf8;->ε:Ljava/lang/String;

    .line 1841
    .line 1842
    if-eqz v10, :cond_43

    .line 1843
    .line 1844
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1845
    .line 1846
    .line 1847
    move-result v10

    .line 1848
    if-eqz v10, :cond_42

    .line 1849
    .line 1850
    goto :goto_2a

    .line 1851
    :cond_42
    const/4 v10, 0x0

    .line 1852
    goto :goto_2b

    .line 1853
    :cond_43
    :goto_2a
    move/from16 v10, v16

    .line 1854
    .line 1855
    :goto_2b
    xor-int/lit8 v10, v10, 0x1

    .line 1856
    .line 1857
    const-string v11, "hasCover"

    .line 1858
    .line 1859
    invoke-virtual {v7, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v7

    .line 1863
    invoke-static {v8}, Lcj1;->ρ(Lf8;)Ljava/lang/String;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v8

    .line 1867
    if-eqz v8, :cond_45

    .line 1868
    .line 1869
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1870
    .line 1871
    .line 1872
    move-result v8

    .line 1873
    if-eqz v8, :cond_44

    .line 1874
    .line 1875
    goto :goto_2c

    .line 1876
    :cond_44
    const/4 v8, 0x0

    .line 1877
    goto :goto_2d

    .line 1878
    :cond_45
    :goto_2c
    move/from16 v8, v16

    .line 1879
    .line 1880
    :goto_2d
    xor-int/lit8 v8, v8, 0x1

    .line 1881
    .line 1882
    const-string v10, "hasDownloadablePreview"

    .line 1883
    .line 1884
    invoke-virtual {v7, v10, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v7

    .line 1888
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1889
    .line 1890
    .line 1891
    move v7, v13

    .line 1892
    goto/16 :goto_29

    .line 1893
    .line 1894
    :cond_46
    invoke-static {}, Lyh;->х()V

    .line 1895
    .line 1896
    .line 1897
    const/16 v18, 0x0

    .line 1898
    .line 1899
    throw v18

    .line 1900
    :cond_47
    const-string v2, "recognizedWorks"

    .line 1901
    .line 1902
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v0

    .line 1906
    new-instance v2, Lorg/json/JSONArray;

    .line 1907
    .line 1908
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 1909
    .line 1910
    .line 1911
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v3

    .line 1915
    :goto_2e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1916
    .line 1917
    .line 1918
    move-result v4

    .line 1919
    if-eqz v4, :cond_4b

    .line 1920
    .line 1921
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v4

    .line 1925
    check-cast v4, Lbj1;

    .line 1926
    .line 1927
    new-instance v5, Lorg/json/JSONObject;

    .line 1928
    .line 1929
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 1930
    .line 1931
    .line 1932
    iget v6, v4, Lbj1;->α:I

    .line 1933
    .line 1934
    invoke-virtual {v5, v9, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v5

    .line 1938
    iget v6, v4, Lbj1;->β:I

    .line 1939
    .line 1940
    invoke-virtual {v5, v12, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v5

    .line 1944
    const-string v6, "className"

    .line 1945
    .line 1946
    iget-object v7, v4, Lbj1;->γ:Ljava/lang/String;

    .line 1947
    .line 1948
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v5

    .line 1952
    const-string v6, "reason"

    .line 1953
    .line 1954
    iget-object v7, v4, Lbj1;->δ:Ljava/lang/String;

    .line 1955
    .line 1956
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v5

    .line 1960
    iget-object v6, v4, Lbj1;->ε:Ljava/lang/String;

    .line 1961
    .line 1962
    if-nez v6, :cond_48

    .line 1963
    .line 1964
    sget-object v6, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 1965
    .line 1966
    :cond_48
    invoke-virtual {v5, v11, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v5

    .line 1970
    iget-object v6, v4, Lbj1;->η:Ljava/lang/String;

    .line 1971
    .line 1972
    if-nez v6, :cond_49

    .line 1973
    .line 1974
    sget-object v6, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 1975
    .line 1976
    :cond_49
    const-string v7, "awemeType"

    .line 1977
    .line 1978
    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v5

    .line 1982
    iget-object v4, v4, Lbj1;->ζ:Ljava/lang/String;

    .line 1983
    .line 1984
    if-nez v4, :cond_4a

    .line 1985
    .line 1986
    sget-object v4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 1987
    .line 1988
    :cond_4a
    invoke-virtual {v5, v10, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v4

    .line 1992
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1993
    .line 1994
    .line 1995
    goto :goto_2e

    .line 1996
    :cond_4b
    const-string v3, "unrecognizedWorks"

    .line 1997
    .line 1998
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v0

    .line 2002
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2003
    .line 2004
    .line 2005
    const/4 v2, 0x2

    .line 2006
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v0

    .line 2010
    new-instance v2, Landroid/widget/TextView;

    .line 2011
    .line 2012
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2013
    .line 2014
    .line 2015
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2016
    .line 2017
    .line 2018
    const/high16 v3, 0x41400000    # 12.0f

    .line 2019
    .line 2020
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2021
    .line 2022
    .line 2023
    move/from16 v3, v16

    .line 2024
    .line 2025
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 2026
    .line 2027
    .line 2028
    const/16 v3, 0x10

    .line 2029
    .line 2030
    invoke-static {v1, v3}, Lcj1;->δ(Landroid/content/Context;I)I

    .line 2031
    .line 2032
    .line 2033
    move-result v4

    .line 2034
    const/16 v5, 0xc

    .line 2035
    .line 2036
    invoke-static {v1, v5}, Lcj1;->δ(Landroid/content/Context;I)I

    .line 2037
    .line 2038
    .line 2039
    move-result v6

    .line 2040
    invoke-static {v1, v3}, Lcj1;->δ(Landroid/content/Context;I)I

    .line 2041
    .line 2042
    .line 2043
    move-result v3

    .line 2044
    invoke-static {v1, v5}, Lcj1;->δ(Landroid/content/Context;I)I

    .line 2045
    .line 2046
    .line 2047
    move-result v5

    .line 2048
    invoke-virtual {v2, v4, v6, v3, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 2049
    .line 2050
    .line 2051
    new-instance v3, Landroid/widget/ScrollView;

    .line 2052
    .line 2053
    invoke-direct {v3, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 2054
    .line 2055
    .line 2056
    invoke-virtual {v3, v2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 2057
    .line 2058
    .line 2059
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 2060
    .line 2061
    invoke-direct {v2, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2062
    .line 2063
    .line 2064
    const-string v4, "\u4e3b\u9875\u4f5c\u54c1\u8c03\u8bd5\u7ed3\u679c"

    .line 2065
    .line 2066
    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v2

    .line 2070
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v2

    .line 2074
    new-instance v3, Lyi1;

    .line 2075
    .line 2076
    invoke-direct {v3, v1, v0}, Lyi1;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2077
    .line 2078
    .line 2079
    const-string v4, "\u590d\u5236 JSON"

    .line 2080
    .line 2081
    invoke-virtual {v2, v4, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v2

    .line 2085
    new-instance v3, Lyi1;

    .line 2086
    .line 2087
    invoke-direct {v3, v0, v1}, Lyi1;-><init>(Ljava/lang/String;Landroid/app/Activity;)V

    .line 2088
    .line 2089
    .line 2090
    const-string v0, "\u6253\u5370\u65e5\u5fd7"

    .line 2091
    .line 2092
    invoke-virtual {v2, v0, v3}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v0

    .line 2096
    const-string v1, "\u5173\u95ed"

    .line 2097
    .line 2098
    const/4 v3, 0x0

    .line 2099
    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v0

    .line 2103
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 2104
    .line 2105
    .line 2106
    return-void

    .line 2107
    :pswitch_b
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2108
    .line 2109
    check-cast v1, Landroid/app/Activity;

    .line 2110
    .line 2111
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2112
    .line 2113
    check-cast v0, Leg1;

    .line 2114
    .line 2115
    sget-object v2, Lwg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2116
    .line 2117
    iget-object v2, v0, Leg1;->δ:Ljava/lang/String;

    .line 2118
    .line 2119
    iget v3, v0, Leg1;->β:I

    .line 2120
    .line 2121
    iget v0, v0, Leg1;->γ:I

    .line 2122
    .line 2123
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2124
    .line 2125
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 2126
    .line 2127
    .line 2128
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2129
    .line 2130
    .line 2131
    const-string v2, "\nbridge="

    .line 2132
    .line 2133
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2134
    .line 2135
    .line 2136
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2137
    .line 2138
    .line 2139
    const-string v2, " image="

    .line 2140
    .line 2141
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2142
    .line 2143
    .line 2144
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2145
    .line 2146
    .line 2147
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2148
    .line 2149
    .line 2150
    move-result-object v0

    .line 2151
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 2152
    .line 2153
    .line 2154
    move-result v2

    .line 2155
    if-eqz v2, :cond_4c

    .line 2156
    .line 2157
    goto :goto_2f

    .line 2158
    :cond_4c
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 2159
    .line 2160
    invoke-direct {v2, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2161
    .line 2162
    .line 2163
    const-string v1, "\u56fe\u7247\u53d1\u9001\u6d4b\u8bd5"

    .line 2164
    .line 2165
    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v1

    .line 2169
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v0

    .line 2173
    const-string v1, "\u786e\u5b9a"

    .line 2174
    .line 2175
    const/4 v3, 0x0

    .line 2176
    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v0

    .line 2180
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 2181
    .line 2182
    .line 2183
    :goto_2f
    return-void

    .line 2184
    :pswitch_c
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2185
    .line 2186
    check-cast v1, La80;

    .line 2187
    .line 2188
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2189
    .line 2190
    check-cast v0, Lmg1;

    .line 2191
    .line 2192
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2193
    .line 2194
    .line 2195
    return-void

    .line 2196
    :pswitch_d
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2197
    .line 2198
    check-cast v1, Lf9;

    .line 2199
    .line 2200
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2201
    .line 2202
    check-cast v0, Lzf1;

    .line 2203
    .line 2204
    invoke-virtual {v1, v0}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2205
    .line 2206
    .line 2207
    return-void

    .line 2208
    :pswitch_e
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2209
    .line 2210
    check-cast v1, Ljava/util/List;

    .line 2211
    .line 2212
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2213
    .line 2214
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v1

    .line 2218
    :goto_30
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2219
    .line 2220
    .line 2221
    move-result v2

    .line 2222
    if-eqz v2, :cond_4d

    .line 2223
    .line 2224
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v2

    .line 2228
    check-cast v2, La80;

    .line 2229
    .line 2230
    new-instance v3, Lfo1;

    .line 2231
    .line 2232
    invoke-direct {v3, v0}, Lfo1;-><init>(Ljava/lang/Object;)V

    .line 2233
    .line 2234
    .line 2235
    invoke-interface {v2, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2236
    .line 2237
    .line 2238
    goto :goto_30

    .line 2239
    :cond_4d
    return-void

    .line 2240
    :pswitch_f
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2241
    .line 2242
    check-cast v1, Lf9;

    .line 2243
    .line 2244
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2245
    .line 2246
    check-cast v0, Lkf1;

    .line 2247
    .line 2248
    invoke-virtual {v1, v0}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2249
    .line 2250
    .line 2251
    return-void

    .line 2252
    :pswitch_10
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2253
    .line 2254
    check-cast v1, Lf9;

    .line 2255
    .line 2256
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2257
    .line 2258
    check-cast v0, Lhf1;

    .line 2259
    .line 2260
    invoke-virtual {v1, v0}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2261
    .line 2262
    .line 2263
    return-void

    .line 2264
    :pswitch_11
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2265
    .line 2266
    check-cast v1, Lg71;

    .line 2267
    .line 2268
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2269
    .line 2270
    check-cast v0, Lte1;

    .line 2271
    .line 2272
    invoke-virtual {v1, v0}, Lg71;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2273
    .line 2274
    .line 2275
    return-void

    .line 2276
    :pswitch_12
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2277
    .line 2278
    check-cast v1, Lf9;

    .line 2279
    .line 2280
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2281
    .line 2282
    check-cast v0, Lqe1;

    .line 2283
    .line 2284
    invoke-virtual {v1, v0}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2285
    .line 2286
    .line 2287
    return-void

    .line 2288
    :pswitch_13
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2289
    .line 2290
    check-cast v1, Landroid/app/Activity;

    .line 2291
    .line 2292
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2293
    .line 2294
    check-cast v0, Lyd1;

    .line 2295
    .line 2296
    :try_start_5
    sget-object v2, Lx01;->α:Lx01;

    .line 2297
    .line 2298
    invoke-virtual {v2, v1}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v2

    .line 2302
    const v3, 0x7f0c0035

    .line 2303
    .line 2304
    .line 2305
    const/4 v5, 0x0

    .line 2306
    const/4 v6, 0x0

    .line 2307
    invoke-virtual {v2, v3, v6, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 2308
    .line 2309
    .line 2310
    move-result-object v2

    .line 2311
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 2312
    .line 2313
    invoke-direct {v3, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2314
    .line 2315
    .line 2316
    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v3

    .line 2320
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 2321
    .line 2322
    .line 2323
    move-result-object v3

    .line 2324
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2325
    .line 2326
    .line 2327
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2328
    .line 2329
    .line 2330
    invoke-static {v1, v2, v3, v0}, Li91;->ζ(Landroid/app/Activity;Landroid/view/View;Landroid/app/AlertDialog;Lyd1;)V

    .line 2331
    .line 2332
    .line 2333
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    .line 2334
    .line 2335
    .line 2336
    invoke-virtual {v3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2337
    .line 2338
    .line 2339
    move-result-object v0

    .line 2340
    if-eqz v0, :cond_4f

    .line 2341
    .line 2342
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 2343
    .line 2344
    const/4 v3, 0x0

    .line 2345
    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 2346
    .line 2347
    .line 2348
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2349
    .line 2350
    .line 2351
    const/high16 v2, 0x3f000000    # 0.5f

    .line 2352
    .line 2353
    invoke-virtual {v0, v2}, Landroid/view/Window;->setDimAmount(F)V

    .line 2354
    .line 2355
    .line 2356
    const/4 v2, 0x2

    .line 2357
    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 2358
    .line 2359
    .line 2360
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2361
    .line 2362
    .line 2363
    move-result-object v2

    .line 2364
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v2

    .line 2368
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2369
    .line 2370
    int-to-float v2, v2

    .line 2371
    const v3, 0x3f70a3d7    # 0.94f

    .line 2372
    .line 2373
    .line 2374
    mul-float/2addr v2, v3

    .line 2375
    float-to-int v2, v2

    .line 2376
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v3

    .line 2380
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2381
    .line 2382
    .line 2383
    move-result-object v3

    .line 2384
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 2385
    .line 2386
    int-to-float v3, v3

    .line 2387
    const v5, 0x3f5c28f6    # 0.86f

    .line 2388
    .line 2389
    .line 2390
    mul-float/2addr v3, v5

    .line 2391
    float-to-int v3, v3

    .line 2392
    invoke-virtual {v0, v2, v3}, Landroid/view/Window;->setLayout(II)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 2393
    .line 2394
    .line 2395
    goto :goto_32

    .line 2396
    :catchall_4
    move-exception v0

    .line 2397
    const-string v2, "ra6d9ee35efc12f2d"

    .line 2398
    .line 2399
    const-string v3, "\u6253\u5f00\u8425\u5730\u7edf\u8ba1\u9762\u677f\u5931\u8d25"

    .line 2400
    .line 2401
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2402
    .line 2403
    .line 2404
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v0

    .line 2408
    if-nez v0, :cond_4e

    .line 2409
    .line 2410
    goto :goto_31

    .line 2411
    :cond_4e
    move-object v4, v0

    .line 2412
    :goto_31
    const-string v0, "\u6253\u5f00\u8425\u5730\u7edf\u8ba1\u5931\u8d25: "

    .line 2413
    .line 2414
    const/4 v3, 0x1

    .line 2415
    invoke-static {v3, v1, v0, v4}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 2416
    .line 2417
    .line 2418
    :cond_4f
    :goto_32
    return-void

    .line 2419
    :pswitch_14
    move v3, v8

    .line 2420
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2421
    .line 2422
    check-cast v1, Landroid/app/Activity;

    .line 2423
    .line 2424
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2425
    .line 2426
    check-cast v0, La80;

    .line 2427
    .line 2428
    invoke-static {v1}, Ldd1;->ζ(Landroid/app/Activity;)Ljava/lang/ClassLoader;

    .line 2429
    .line 2430
    .line 2431
    move-result-object v2

    .line 2432
    invoke-static {v2, v3}, Lln0;->ψ(Ljava/lang/ClassLoader;Z)Ljava/lang/Object;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v2

    .line 2436
    :try_start_6
    new-instance v3, Lii0;

    .line 2437
    .line 2438
    const/4 v4, 0x5

    .line 2439
    invoke-direct {v3, v0, v4, v2}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2440
    .line 2441
    .line 2442
    invoke-virtual {v1, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 2443
    .line 2444
    .line 2445
    sget-object v0, Ls62;->α:Ls62;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 2446
    .line 2447
    goto :goto_33

    .line 2448
    :catchall_5
    move-exception v0

    .line 2449
    new-instance v1, Leo1;

    .line 2450
    .line 2451
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2452
    .line 2453
    .line 2454
    move-object v0, v1

    .line 2455
    :goto_33
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2456
    .line 2457
    .line 2458
    move-result-object v0

    .line 2459
    if-eqz v0, :cond_50

    .line 2460
    .line 2461
    const-string v1, "r7ce9b41b1577bc7d"

    .line 2462
    .line 2463
    const-string v2, "\u4f5c\u7269\u76ee\u5f55\u5237\u65b0\u7ed3\u679c\u56de\u8c03\u5931\u8d25"

    .line 2464
    .line 2465
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2466
    .line 2467
    .line 2468
    :cond_50
    return-void

    .line 2469
    :pswitch_15
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2470
    .line 2471
    check-cast v1, La80;

    .line 2472
    .line 2473
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2474
    .line 2475
    check-cast v0, Lgc1;

    .line 2476
    .line 2477
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2478
    .line 2479
    .line 2480
    return-void

    .line 2481
    :pswitch_16
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2482
    .line 2483
    check-cast v1, La80;

    .line 2484
    .line 2485
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2486
    .line 2487
    check-cast v0, Ldc1;

    .line 2488
    .line 2489
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2490
    .line 2491
    .line 2492
    return-void

    .line 2493
    :pswitch_17
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2494
    .line 2495
    check-cast v1, La80;

    .line 2496
    .line 2497
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2498
    .line 2499
    new-instance v2, Lfo1;

    .line 2500
    .line 2501
    invoke-direct {v2, v0}, Lfo1;-><init>(Ljava/lang/Object;)V

    .line 2502
    .line 2503
    .line 2504
    invoke-interface {v1, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2505
    .line 2506
    .line 2507
    return-void

    .line 2508
    :pswitch_18
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2509
    .line 2510
    check-cast v1, Landroid/app/Activity;

    .line 2511
    .line 2512
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2513
    .line 2514
    check-cast v0, Landroid/widget/TextView;

    .line 2515
    .line 2516
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 2517
    .line 2518
    .line 2519
    move-result v2

    .line 2520
    if-nez v2, :cond_51

    .line 2521
    .line 2522
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 2523
    .line 2524
    .line 2525
    move-result v2

    .line 2526
    if-nez v2, :cond_51

    .line 2527
    .line 2528
    sget-object v2, Lq71;->α:Lq71;

    .line 2529
    .line 2530
    invoke-static {v1, v0}, Lq71;->Ο(Landroid/content/Context;Landroid/widget/TextView;)V

    .line 2531
    .line 2532
    .line 2533
    :cond_51
    return-void

    .line 2534
    :pswitch_19
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2535
    .line 2536
    check-cast v1, La80;

    .line 2537
    .line 2538
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2539
    .line 2540
    check-cast v0, Lyj0;

    .line 2541
    .line 2542
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2543
    .line 2544
    .line 2545
    return-void

    .line 2546
    :pswitch_1a
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2547
    .line 2548
    check-cast v1, Ljava/lang/ClassLoader;

    .line 2549
    .line 2550
    sget-object v2, Lnz;->ε:Lnz;

    .line 2551
    .line 2552
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2553
    .line 2554
    move-object v3, v0

    .line 2555
    check-cast v3, La80;

    .line 2556
    .line 2557
    sget-object v4, Lzj0;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2558
    .line 2559
    sget-object v0, Lzj0;->α:Lzj0;

    .line 2560
    .line 2561
    const-string v5, "\u4e00\u952e\u5df2\u8bfb\u5931\u8d25\uff1a"

    .line 2562
    .line 2563
    const-string v6, "\u4e00\u952e\u5df2\u8bfb\u5931\u8d25: "

    .line 2564
    .line 2565
    const/4 v7, 0x1

    .line 2566
    const/4 v8, 0x0

    .line 2567
    :try_start_7
    invoke-virtual {v0, v1, v7, v8, v2}, Lzj0;->ε(Ljava/lang/ClassLoader;ZILjava/util/Set;)Lyj0;

    .line 2568
    .line 2569
    .line 2570
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 2571
    invoke-virtual {v4, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 2572
    .line 2573
    .line 2574
    goto :goto_35

    .line 2575
    :catchall_6
    move-exception v0

    .line 2576
    :try_start_8
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v0

    .line 2580
    const-string v1, "DYHelperIMMarkAllReadHelper"

    .line 2581
    .line 2582
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2583
    .line 2584
    .line 2585
    move-result-object v2

    .line 2586
    new-instance v7, Ljava/lang/StringBuilder;

    .line 2587
    .line 2588
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2589
    .line 2590
    .line 2591
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2592
    .line 2593
    .line 2594
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2595
    .line 2596
    .line 2597
    move-result-object v2

    .line 2598
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2599
    .line 2600
    .line 2601
    new-instance v1, Lyj0;

    .line 2602
    .line 2603
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2604
    .line 2605
    .line 2606
    move-result-object v2

    .line 2607
    if-nez v2, :cond_52

    .line 2608
    .line 2609
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2610
    .line 2611
    .line 2612
    move-result-object v2

    .line 2613
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2614
    .line 2615
    .line 2616
    move-result-object v2

    .line 2617
    goto :goto_34

    .line 2618
    :catchall_7
    move-exception v0

    .line 2619
    const/4 v2, 0x0

    .line 2620
    goto :goto_36

    .line 2621
    :cond_52
    :goto_34
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2622
    .line 2623
    .line 2624
    move-result-object v2

    .line 2625
    const/4 v5, 0x0

    .line 2626
    invoke-direct {v1, v5, v2, v0}, Lyj0;-><init>(ZLjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 2627
    .line 2628
    .line 2629
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 2630
    .line 2631
    .line 2632
    move-object v0, v1

    .line 2633
    :goto_35
    invoke-static {v3, v0}, Lzj0;->Γ(La80;Lyj0;)V

    .line 2634
    .line 2635
    .line 2636
    return-void

    .line 2637
    :goto_36
    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 2638
    .line 2639
    .line 2640
    throw v0

    .line 2641
    :pswitch_1b
    move-object v6, v10

    .line 2642
    sget-object v1, Lvj0;->α:Lvj0;

    .line 2643
    .line 2644
    iget-object v2, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2645
    .line 2646
    check-cast v2, Lji0;

    .line 2647
    .line 2648
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2649
    .line 2650
    check-cast v0, Ljava/lang/ClassLoader;

    .line 2651
    .line 2652
    :try_start_9
    invoke-virtual {v1, v2, v0}, Lvj0;->γ(Lji0;Ljava/lang/ClassLoader;)Luj0;

    .line 2653
    .line 2654
    .line 2655
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 2656
    goto :goto_37

    .line 2657
    :catchall_8
    move-exception v0

    .line 2658
    new-instance v1, Leo1;

    .line 2659
    .line 2660
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2661
    .line 2662
    .line 2663
    move-object v0, v1

    .line 2664
    :goto_37
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2665
    .line 2666
    .line 2667
    move-result-object v1

    .line 2668
    const-string v3, "r52bdfd08354d522"

    .line 2669
    .line 2670
    if-nez v1, :cond_53

    .line 2671
    .line 2672
    const/4 v5, 0x0

    .line 2673
    goto :goto_3d

    .line 2674
    :cond_53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v0

    .line 2678
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2679
    .line 2680
    .line 2681
    move-result-object v0

    .line 2682
    const-string v4, "\u4e92\u52a8\u6d88\u606f\u670d\u52a1\u7aef\u6e05\u7406\u4e2d\u6b62 type="

    .line 2683
    .line 2684
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v0

    .line 2688
    invoke-static {v3, v0, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2689
    .line 2690
    .line 2691
    new-instance v0, Luj0;

    .line 2692
    .line 2693
    instance-of v4, v1, Ljava/lang/ClassNotFoundException;

    .line 2694
    .line 2695
    if-nez v4, :cond_58

    .line 2696
    .line 2697
    instance-of v4, v1, Ljava/lang/NoSuchMethodException;

    .line 2698
    .line 2699
    if-nez v4, :cond_58

    .line 2700
    .line 2701
    instance-of v4, v1, Ljava/lang/NoSuchFieldException;

    .line 2702
    .line 2703
    if-eqz v4, :cond_54

    .line 2704
    .line 2705
    goto :goto_3b

    .line 2706
    :cond_54
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2707
    .line 2708
    .line 2709
    move-result-object v1

    .line 2710
    if-eqz v1, :cond_57

    .line 2711
    .line 2712
    const-string v4, "\u4e92\u52a8\u6d88\u606f"

    .line 2713
    .line 2714
    const/4 v5, 0x0

    .line 2715
    invoke-static {v1, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2716
    .line 2717
    .line 2718
    move-result v4

    .line 2719
    if-nez v4, :cond_56

    .line 2720
    .line 2721
    const-string v4, "\u5bbf\u4e3b"

    .line 2722
    .line 2723
    invoke-static {v1, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2724
    .line 2725
    .line 2726
    move-result v4

    .line 2727
    if-nez v4, :cond_56

    .line 2728
    .line 2729
    const-string v4, "\u5f53\u524d\u6296\u97f3"

    .line 2730
    .line 2731
    invoke-static {v1, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2732
    .line 2733
    .line 2734
    move-result v4

    .line 2735
    if-eqz v4, :cond_55

    .line 2736
    .line 2737
    goto :goto_38

    .line 2738
    :cond_55
    move-object v10, v6

    .line 2739
    goto :goto_39

    .line 2740
    :cond_56
    :goto_38
    move-object v10, v1

    .line 2741
    :goto_39
    if-eqz v10, :cond_57

    .line 2742
    .line 2743
    :goto_3a
    const/4 v5, 0x0

    .line 2744
    goto :goto_3c

    .line 2745
    :cond_57
    const-string v10, "\u4e92\u52a8\u6d88\u606f\u670d\u52a1\u7aef\u8bf7\u6c42\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 2746
    .line 2747
    goto :goto_3a

    .line 2748
    :cond_58
    :goto_3b
    const-string v10, "\u5f53\u524d\u6296\u97f3\u7248\u672c\u6682\u4e0d\u652f\u6301\u4e92\u52a8\u6d88\u606f\u6e05\u7406"

    .line 2749
    .line 2750
    goto :goto_3a

    .line 2751
    :goto_3c
    invoke-direct {v0, v5, v5, v5, v10}, Luj0;-><init>(IIILjava/lang/String;)V

    .line 2752
    .line 2753
    .line 2754
    :goto_3d
    check-cast v0, Luj0;

    .line 2755
    .line 2756
    sget-object v1, Lvj0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2757
    .line 2758
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 2759
    .line 2760
    .line 2761
    :try_start_a
    iget-object v1, v2, Lji0;->α:Lli0;

    .line 2762
    .line 2763
    new-instance v2, Lp3;

    .line 2764
    .line 2765
    const/16 v4, 0x19

    .line 2766
    .line 2767
    invoke-direct {v2, v1, v4, v0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2768
    .line 2769
    .line 2770
    invoke-virtual {v1, v2}, Lli0;->δ(Lp70;)V

    .line 2771
    .line 2772
    .line 2773
    sget-object v0, Ls62;->α:Ls62;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 2774
    .line 2775
    goto :goto_3e

    .line 2776
    :catchall_9
    move-exception v0

    .line 2777
    new-instance v1, Leo1;

    .line 2778
    .line 2779
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2780
    .line 2781
    .line 2782
    move-object v0, v1

    .line 2783
    :goto_3e
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2784
    .line 2785
    .line 2786
    move-result-object v0

    .line 2787
    if-eqz v0, :cond_59

    .line 2788
    .line 2789
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2790
    .line 2791
    .line 2792
    move-result-object v0

    .line 2793
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2794
    .line 2795
    .line 2796
    move-result-object v0

    .line 2797
    const-string v1, "\u4e92\u52a8\u6d88\u606f\u6e05\u7406\u7ed3\u679c\u56de\u8c03\u5931\u8d25 type="

    .line 2798
    .line 2799
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2800
    .line 2801
    .line 2802
    move-result-object v0

    .line 2803
    invoke-static {v3, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 2804
    .line 2805
    .line 2806
    :cond_59
    return-void

    .line 2807
    :pswitch_1c
    move-object v6, v10

    .line 2808
    iget-object v1, v0, Lii0;->ζ:Ljava/lang/Object;

    .line 2809
    .line 2810
    check-cast v1, Lli0;

    .line 2811
    .line 2812
    iget-object v0, v0, Lii0;->η:Ljava/lang/Object;

    .line 2813
    .line 2814
    check-cast v0, Ljava/lang/CharSequence;

    .line 2815
    .line 2816
    if-eqz v0, :cond_5a

    .line 2817
    .line 2818
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2819
    .line 2820
    .line 2821
    move-result-object v10

    .line 2822
    goto :goto_3f

    .line 2823
    :cond_5a
    move-object v10, v6

    .line 2824
    :goto_3f
    if-nez v10, :cond_5b

    .line 2825
    .line 2826
    goto :goto_40

    .line 2827
    :cond_5b
    move-object v4, v10

    .line 2828
    :goto_40
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2829
    .line 2830
    .line 2831
    move-result-object v0

    .line 2832
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2833
    .line 2834
    .line 2835
    move-result-object v0

    .line 2836
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2837
    .line 2838
    invoke-static {v2, v0, v2}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 2839
    .line 2840
    .line 2841
    move-result-object v0

    .line 2842
    iput-object v0, v1, Lli0;->Α:Ljava/lang/String;

    .line 2843
    .line 2844
    invoke-virtual {v1}, Lli0;->α()V

    .line 2845
    .line 2846
    .line 2847
    return-void

    .line 2848
    nop

    .line 2849
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
