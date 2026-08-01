.class public final Lvv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/app/Activity;

.field public final β:Lnt;

.field public final γ:Ljava/util/List;

.field public final δ:Ljava/util/ArrayList;

.field public final ε:Ljava/util/List;

.field public final ζ:J

.field public final η:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final θ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ι:Landroid/view/View;

.field public final κ:Landroid/widget/TextView;

.field public final λ:Landroid/widget/TextView;

.field public final μ:Landroid/widget/TextView;

.field public final ν:Landroid/widget/TextView;

.field public final ξ:Landroid/widget/ListView;

.field public final ο:Landroid/widget/ScrollView;

.field public final π:Landroid/widget/LinearLayout;

.field public final ρ:Landroid/widget/Button;

.field public final σ:Landroid/widget/Button;

.field public final τ:Landroid/app/AlertDialog;

.field public final υ:Lsv1;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lnt;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvv1;->α:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lvv1;->β:Lnt;

    .line 10
    .line 11
    sget-object p1, Lq71;->ζ:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {p1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lvv1;->γ:Ljava/util/List;

    .line 18
    .line 19
    new-instance p2, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v0, 0xa

    .line 22
    .line 23
    invoke-static {p1, v0}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ln71;

    .line 45
    .line 46
    iget-object v0, v0, Ln71;->α:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iput-object p2, p0, Lvv1;->δ:Ljava/util/ArrayList;

    .line 53
    .line 54
    sget-object p1, Lq71;->α:Lq71;

    .line 55
    .line 56
    invoke-static {}, Lq71;->χ()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-static {}, Lxv1;->α()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lvv1;->ε:Ljava/util/List;

    .line 65
    .line 66
    sget-object p2, Lui1;->α:Ljava/lang/Object;

    .line 67
    .line 68
    sget-wide v0, Lui1;->θ:J

    .line 69
    .line 70
    iput-wide v0, p0, Lvv1;->ζ:J

    .line 71
    .line 72
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 76
    .line 77
    .line 78
    iput-object p2, p0, Lvv1;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    .line 80
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 81
    .line 82
    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 83
    .line 84
    .line 85
    iput-object p2, p0, Lvv1;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 86
    .line 87
    sget-object p2, Lx01;->α:Lx01;

    .line 88
    .line 89
    iget-object v0, p0, Lvv1;->α:Landroid/app/Activity;

    .line 90
    .line 91
    const-string v1, "dialog_share_panel_action_config"

    .line 92
    .line 93
    const v2, 0x7f0c0039

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v2, v0, v1}, Lx01;->γ(ILandroid/content/Context;Ljava/lang/String;)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iput-object p2, p0, Lvv1;->ι:Landroid/view/View;

    .line 101
    .line 102
    const-string v0, "share_action_config_close"

    .line 103
    .line 104
    const v1, 0x7f0902a2

    .line 105
    .line 106
    .line 107
    const-class v2, Landroid/widget/TextView;

    .line 108
    .line 109
    invoke-virtual {p0, v1, v2, v0}, Lvv1;->β(ILjava/lang/Class;Ljava/lang/String;)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Landroid/widget/TextView;

    .line 114
    .line 115
    iput-object v0, p0, Lvv1;->κ:Landroid/widget/TextView;

    .line 116
    .line 117
    const-string v0, "share_action_config_count"

    .line 118
    .line 119
    const v1, 0x7f0902a4

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v1, v2, v0}, Lvv1;->β(ILjava/lang/Class;Ljava/lang/String;)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Landroid/widget/TextView;

    .line 127
    .line 128
    iput-object v0, p0, Lvv1;->λ:Landroid/widget/TextView;

    .line 129
    .line 130
    const-string v0, "share_action_config_tab_config"

    .line 131
    .line 132
    const v1, 0x7f0902ac

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v1, v2, v0}, Lvv1;->β(ILjava/lang/Class;Ljava/lang/String;)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Landroid/widget/TextView;

    .line 140
    .line 141
    iput-object v0, p0, Lvv1;->μ:Landroid/widget/TextView;

    .line 142
    .line 143
    const-string v0, "share_action_config_tab_preview"

    .line 144
    .line 145
    const v1, 0x7f0902ad

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v1, v2, v0}, Lvv1;->β(ILjava/lang/Class;Ljava/lang/String;)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Landroid/widget/TextView;

    .line 153
    .line 154
    iput-object v0, p0, Lvv1;->ν:Landroid/widget/TextView;

    .line 155
    .line 156
    const v0, 0x7f0902a7

    .line 157
    .line 158
    .line 159
    const-class v1, Landroid/widget/ListView;

    .line 160
    .line 161
    const-string v2, "share_action_config_list"

    .line 162
    .line 163
    invoke-virtual {p0, v0, v1, v2}, Lvv1;->β(ILjava/lang/Class;Ljava/lang/String;)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Landroid/widget/ListView;

    .line 168
    .line 169
    iput-object v0, p0, Lvv1;->ξ:Landroid/widget/ListView;

    .line 170
    .line 171
    const v0, 0x7f0902a9

    .line 172
    .line 173
    .line 174
    const-class v1, Landroid/widget/ScrollView;

    .line 175
    .line 176
    const-string v2, "share_action_config_preview_page"

    .line 177
    .line 178
    invoke-virtual {p0, v0, v1, v2}, Lvv1;->β(ILjava/lang/Class;Ljava/lang/String;)Landroid/view/View;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, Landroid/widget/ScrollView;

    .line 183
    .line 184
    iput-object v0, p0, Lvv1;->ο:Landroid/widget/ScrollView;

    .line 185
    .line 186
    const v0, 0x7f0902a8

    .line 187
    .line 188
    .line 189
    const-class v1, Landroid/widget/LinearLayout;

    .line 190
    .line 191
    const-string v2, "share_action_config_preview_container"

    .line 192
    .line 193
    invoke-virtual {p0, v0, v1, v2}, Lvv1;->β(ILjava/lang/Class;Ljava/lang/String;)Landroid/view/View;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, Landroid/widget/LinearLayout;

    .line 198
    .line 199
    iput-object v0, p0, Lvv1;->π:Landroid/widget/LinearLayout;

    .line 200
    .line 201
    const-string v0, "share_action_config_cancel"

    .line 202
    .line 203
    const v1, 0x7f0902a1

    .line 204
    .line 205
    .line 206
    const-class v2, Landroid/widget/Button;

    .line 207
    .line 208
    invoke-virtual {p0, v1, v2, v0}, Lvv1;->β(ILjava/lang/Class;Ljava/lang/String;)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Landroid/widget/Button;

    .line 213
    .line 214
    iput-object v0, p0, Lvv1;->ρ:Landroid/widget/Button;

    .line 215
    .line 216
    const-string v0, "share_action_config_save"

    .line 217
    .line 218
    const v1, 0x7f0902ab

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v1, v2, v0}, Lvv1;->β(ILjava/lang/Class;Ljava/lang/String;)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Landroid/widget/Button;

    .line 226
    .line 227
    iput-object v0, p0, Lvv1;->σ:Landroid/widget/Button;

    .line 228
    .line 229
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 230
    .line 231
    iget-object v1, p0, Lvv1;->α:Landroid/app/Activity;

    .line 232
    .line 233
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-virtual {p2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    iput-object p2, p0, Lvv1;->τ:Landroid/app/AlertDialog;

    .line 245
    .line 246
    new-instance v0, Lsv1;

    .line 247
    .line 248
    iget-object v1, p0, Lvv1;->α:Landroid/app/Activity;

    .line 249
    .line 250
    iget-object v2, p0, Lvv1;->γ:Ljava/util/List;

    .line 251
    .line 252
    invoke-static {p1}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    new-instance v5, Luu1;

    .line 257
    .line 258
    const/4 v11, 0x0

    .line 259
    const/16 v12, 0x8

    .line 260
    .line 261
    const/4 v6, 0x1

    .line 262
    const-class v8, Lvv1;

    .line 263
    .line 264
    const-string v9, "onSelectionChanged"

    .line 265
    .line 266
    const-string v10, "onSelectionChanged(Ljava/util/Set;)V"

    .line 267
    .line 268
    move-object v7, p0

    .line 269
    invoke-direct/range {v5 .. v12}, Luu1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 270
    .line 271
    .line 272
    invoke-direct/range {v0 .. v5}, Lsv1;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/util/Set;ZLuu1;)V

    .line 273
    .line 274
    .line 275
    iput-object v0, v7, Lvv1;->υ:Lsv1;

    .line 276
    .line 277
    return-void
.end method


# virtual methods
.method public final α(Ljava/util/Set;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "\u672a\u9009\u62e9"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, "\u5df2\u9009 "

    .line 15
    .line 16
    const-string v2, " \u9879"

    .line 17
    .line 18
    invoke-static {v1, v0, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    iget-object v1, p0, Lvv1;->λ:Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lvv1;->α:Landroid/app/Activity;

    .line 28
    .line 29
    :try_start_0
    iget-object v1, p0, Lvv1;->δ:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    move-object v4, v3

    .line 54
    check-cast v4, Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {p1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget-object p1, p0, Lvv1;->γ:Ljava/util/List;

    .line 67
    .line 68
    const/16 v1, 0xa

    .line 69
    .line 70
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-static {v1}, Lex0;->Κ(I)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/16 v3, 0x10

    .line 79
    .line 80
    if-ge v1, v3, :cond_3

    .line 81
    .line 82
    move v1, v3

    .line 83
    :cond_3
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 84
    .line 85
    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    move-object v4, v1

    .line 103
    check-cast v4, Ln71;

    .line 104
    .line 105
    iget-object v4, v4, Ln71;->α:Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    goto :goto_4

    .line 113
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_6

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Ln71;

    .line 139
    .line 140
    if-eqz v2, :cond_5

    .line 141
    .line 142
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    new-instance v1, Leu1;

    .line 147
    .line 148
    const/16 v2, 0x17

    .line 149
    .line 150
    invoke-direct {v1, v2}, Leu1;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-static {p1, v1}, Lv81;->λ(Ljava/util/ArrayList;Leu1;)Ljava/util/ArrayList;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    new-instance v1, Ltv1;

    .line 158
    .line 159
    const/4 v2, 0x0

    .line 160
    invoke-direct {v1, v2}, Ltv1;-><init>(I)V

    .line 161
    .line 162
    .line 163
    const/4 v2, 0x0

    .line 164
    invoke-static {v0, p1, v1, v2}, Lv81;->ξ(Landroid/content/Context;Ljava/util/ArrayList;Lp70;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 165
    .line 166
    .line 167
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    goto :goto_5

    .line 169
    :goto_4
    new-instance v1, Leo1;

    .line 170
    .line 171
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    move-object p1, v1

    .line 175
    :goto_5
    instance-of v1, p1, Leo1;

    .line 176
    .line 177
    iget-object p0, p0, Lvv1;->π:Landroid/widget/LinearLayout;

    .line 178
    .line 179
    if-nez v1, :cond_7

    .line 180
    .line 181
    move-object v1, p1

    .line 182
    check-cast v1, Landroid/widget/LinearLayout;

    .line 183
    .line 184
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 188
    .line 189
    .line 190
    :cond_7
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    if-eqz p1, :cond_8

    .line 195
    .line 196
    const-string v1, "DYHelper"

    .line 197
    .line 198
    const-string v2, "\u5206\u4eab\u5feb\u6377\u6309\u94ae\u5b9e\u65f6\u9884\u89c8\u6e32\u67d3\u5931\u8d25"

    .line 199
    .line 200
    invoke-static {v1, v2, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 208
    .line 209
    .line 210
    new-instance v1, Landroid/widget/TextView;

    .line 211
    .line 212
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 213
    .line 214
    .line 215
    const-string v2, "\u9884\u89c8\u6682\u672a\u751f\u6210"

    .line 216
    .line 217
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    const/16 v2, 0x11

    .line 221
    .line 222
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 223
    .line 224
    .line 225
    const/4 v2, 0x0

    .line 226
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 227
    .line 228
    .line 229
    const/16 v3, 0x30

    .line 230
    .line 231
    invoke-static {v0, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    invoke-static {v0, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    invoke-virtual {v1, v2, v4, v2, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 240
    .line 241
    .line 242
    iget-object p1, p1, Lxx;->η:Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 249
    .line 250
    .line 251
    const/high16 p1, 0x41400000    # 12.0f

    .line 252
    .line 253
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 257
    .line 258
    .line 259
    :cond_8
    return-void
.end method

.method public final β(ILjava/lang/Class;Ljava/lang/String;)Landroid/view/View;
    .locals 1

    .line 1
    sget-object v0, Lx01;->α:Lx01;

    .line 2
    .line 3
    iget-object p0, p0, Lvv1;->ι:Landroid/view/View;

    .line 4
    .line 5
    invoke-static {p0, p3, p1, p2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final γ(Z)V
    .locals 2

    .line 1
    xor-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    iget-object v1, p0, Lvv1;->κ:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lvv1;->ρ:Landroid/widget/Button;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lvv1;->μ:Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lvv1;->ν:Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lvv1;->ξ:Landroid/widget/ListView;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lvv1;->σ:Landroid/widget/Button;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const-string p1, "\u4fdd\u5b58\u4e2d..."

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p1, "\u4fdd\u5b58"

    .line 39
    .line 40
    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lvv1;->τ:Landroid/app/AlertDialog;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final δ()V
    .locals 8

    .line 1
    iget-object v0, p0, Lvv1;->α:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v1, Lxx;->β:Ljava/lang/String;

    .line 8
    .line 9
    const/16 v3, 0xe

    .line 10
    .line 11
    invoke-static {v3, v0, v2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Lvv1;->ι:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, Lxx;->γ:Ljava/lang/String;

    .line 21
    .line 22
    const/16 v3, 0xc

    .line 23
    .line 24
    invoke-static {v3, v0, v2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-object v5, p0, Lvv1;->ξ:Landroid/widget/ListView;

    .line 29
    .line 30
    invoke-virtual {v5, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    .line 34
    .line 35
    iget-object v6, v1, Lxx;->δ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-direct {v4, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v4}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    invoke-virtual {v5, v4}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 49
    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-virtual {v5, v6}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 53
    .line 54
    .line 55
    iget-object v7, v1, Lxx;->Α:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v7}, Ljx0;->Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v5, v7}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    iget-object v7, p0, Lvv1;->ο:Landroid/widget/ScrollView;

    .line 65
    .line 66
    invoke-static {v3, v0, v2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v7, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v1, Lxx;->ζ:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    iget-object v2, p0, Lvv1;->ρ:Landroid/widget/Button;

    .line 80
    .line 81
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 82
    .line 83
    .line 84
    new-instance v1, Luv1;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-direct {v1, p0, v3}, Luv1;-><init>(Lvv1;I)V

    .line 88
    .line 89
    .line 90
    iget-object v3, p0, Lvv1;->κ:Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Luv1;

    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    invoke-direct {v1, p0, v3}, Luv1;-><init>(Lvv1;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Luv1;

    .line 105
    .line 106
    const/4 v2, 0x2

    .line 107
    invoke-direct {v1, p0, v2}, Luv1;-><init>(Lvv1;I)V

    .line 108
    .line 109
    .line 110
    iget-object v2, p0, Lvv1;->μ:Landroid/widget/TextView;

    .line 111
    .line 112
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    .line 114
    .line 115
    new-instance v1, Luv1;

    .line 116
    .line 117
    const/4 v2, 0x3

    .line 118
    invoke-direct {v1, p0, v2}, Luv1;-><init>(Lvv1;I)V

    .line 119
    .line 120
    .line 121
    iget-object v2, p0, Lvv1;->ν:Landroid/widget/TextView;

    .line 122
    .line 123
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    .line 125
    .line 126
    new-instance v1, Luv1;

    .line 127
    .line 128
    const/4 v2, 0x4

    .line 129
    invoke-direct {v1, p0, v2}, Luv1;-><init>(Lvv1;I)V

    .line 130
    .line 131
    .line 132
    iget-object v2, p0, Lvv1;->σ:Landroid/widget/Button;

    .line 133
    .line 134
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lvv1;->υ:Lsv1;

    .line 138
    .line 139
    invoke-virtual {v5, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 140
    .line 141
    .line 142
    iget-object v1, v1, Lsv1;->ι:Ljava/util/LinkedHashSet;

    .line 143
    .line 144
    invoke-static {v1}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {p0, v1}, Lvv1;->α(Ljava/util/Set;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v4}, Lvv1;->ε(Z)V

    .line 152
    .line 153
    .line 154
    new-instance v1, Lvg;

    .line 155
    .line 156
    const/4 v2, 0x6

    .line 157
    invoke-direct {v1, v2, p0}, Lvg;-><init>(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-object p0, p0, Lvv1;->τ:Landroid/app/AlertDialog;

    .line 161
    .line 162
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v6}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    if-eqz p0, :cond_0

    .line 176
    .line 177
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 178
    .line 179
    invoke-direct {v1, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1, v6, v6, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 190
    .line 191
    .line 192
    const/high16 v1, 0x3f000000    # 0.5f

    .line 193
    .line 194
    invoke-virtual {p0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 195
    .line 196
    .line 197
    const/4 v1, 0x2

    .line 198
    invoke-virtual {p0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 210
    .line 211
    int-to-float v1, v1

    .line 212
    const v2, 0x3f70a3d7    # 0.94f

    .line 213
    .line 214
    .line 215
    mul-float/2addr v1, v2

    .line 216
    float-to-int v1, v1

    .line 217
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 226
    .line 227
    int-to-float v0, v0

    .line 228
    const v2, 0x3f570a3d    # 0.84f

    .line 229
    .line 230
    .line 231
    mul-float/2addr v0, v2

    .line 232
    float-to-int v0, v0

    .line 233
    invoke-virtual {p0, v1, v0}, Landroid/view/Window;->setLayout(II)V

    .line 234
    .line 235
    .line 236
    :cond_0
    return-void
.end method

.method public final ε(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lvv1;->α:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v1, Lxx;->η:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, v1, Lxx;->ι:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v4, v1, Lxx;->γ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v5, v1, Lxx;->κ:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, v1, Lxx;->Α:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/16 v7, 0x8

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    move v8, v6

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v8, v7

    .line 25
    :goto_0
    iget-object v9, p0, Lvv1;->ξ:Landroid/widget/ListView;

    .line 26
    .line 27
    invoke-virtual {v9, v8}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    move v6, v7

    .line 33
    :cond_1
    iget-object v8, p0, Lvv1;->ο:Landroid/widget/ScrollView;

    .line 34
    .line 35
    invoke-virtual {v8, v6}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    move-object v6, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v6, v4

    .line 43
    :goto_1
    invoke-static {v7, v0, v1, v6}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    iget-object v8, p0, Lvv1;->μ:Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-virtual {v8, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    move-object v4, v5

    .line 56
    :goto_2
    invoke-static {v7, v0, v1, v4}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object p0, p0, Lvv1;->ν:Landroid/widget/TextView;

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 63
    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    move-object v0, v3

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move-object v0, v2

    .line 70
    :goto_3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 75
    .line 76
    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_5
    move-object v2, v3

    .line 81
    :goto_4
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 86
    .line 87
    .line 88
    return-void
.end method
