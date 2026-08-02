.class public final Lr90;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lr90;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static final i:Z

.field public static volatile j:Ljava/lang/String;

.field public static final k:Ljava/util/ArrayList;

.field public static final l:Ljava/util/Set;

.field public static final m:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr90;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr90;->d:Lr90;

    .line 8
    .line 9
    const v0, 0x790b00ff

    .line 10
    .line 11
    .line 12
    sput v0, Lr90;->e:I

    .line 13
    .line 14
    const v0, 0x790b0102

    .line 15
    .line 16
    .line 17
    sput v0, Lr90;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->j:Lwm0;

    .line 20
    .line 21
    sput-object v0, Lr90;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "DisplayContactId"

    .line 24
    .line 25
    sput-object v0, Lr90;->h:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    sput-boolean v0, Lr90;->i:Z

    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lr90;->k:Ljava/util/ArrayList;

    .line 36
    .line 37
    new-instance v0, Ljava/util/WeakHashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lr90;->l:Ljava/util/Set;

    .line 47
    .line 48
    new-instance v0, Ljava/util/WeakHashMap;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lr90;->m:Ljava/util/Map;

    .line 58
    .line 59
    return-void
.end method

.method public static q(Ljg3;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljg3;->a()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Landroid/widget/AdapterView;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Landroid/widget/AdapterView;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v2

    .line 19
    :goto_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Ljg3;->a()[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v3, 0x2

    .line 28
    invoke-static {v3, v1}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    instance-of v3, v1, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    check-cast v1, Ljava/lang/Integer;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object v1, v2

    .line 40
    :goto_1
    if-eqz v1, :cond_b

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_3
    invoke-static {v3}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Ln4;->v()Lsg1;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Lzf1;->b()V

    .line 59
    .line 60
    .line 61
    const-string v4, "getItem"

    .line 62
    .line 63
    iput-object v4, v3, Lzf1;->b:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v3}, Lsg1;->c()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v3}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lzg1;

    .line 74
    .line 75
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v3, v1}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-nez v1, :cond_4

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_4
    sget-object v3, Lr90;->m:Ljava/util/Map;

    .line 87
    .line 88
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Ljava/lang/String;

    .line 93
    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_5
    invoke-virtual {p0, v2}, Ljg3;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    :goto_2
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 108
    .line 109
    if-eqz v0, :cond_7

    .line 110
    .line 111
    instance-of v0, p0, Landroid/app/Activity;

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    check-cast p0, Landroid/app/Activity;

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    check-cast p0, Landroid/content/ContextWrapper;

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    move-object p0, v2

    .line 129
    :goto_3
    if-nez p0, :cond_a

    .line 130
    .line 131
    :try_start_0
    sget-object p0, Lup0;->k:Landroid/app/Activity;

    .line 132
    .line 133
    if-eqz p0, :cond_8

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_8
    const-string p0, "hostAct"

    .line 137
    .line 138
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    :catchall_0
    move-exception p0

    .line 143
    new-instance v0, Lx92;

    .line 144
    .line 145
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    move-object p0, v0

    .line 149
    :goto_4
    nop

    .line 150
    instance-of v0, p0, Lx92;

    .line 151
    .line 152
    if-eqz v0, :cond_9

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_9
    move-object v2, p0

    .line 156
    :goto_5
    move-object p0, v2

    .line 157
    check-cast p0, Landroid/app/Activity;

    .line 158
    .line 159
    if-nez p0, :cond_a

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_a
    new-instance v0, Lx1;

    .line 163
    .line 164
    const/4 v2, 0x1

    .line 165
    invoke-direct {v0, v1, v2}, Lx1;-><init>(Ljava/lang/String;I)V

    .line 166
    .line 167
    .line 168
    new-instance v1, Lkw;

    .line 169
    .line 170
    const v3, -0x2e37a325

    .line 171
    .line 172
    .line 173
    invoke-direct {v1, v3, v2, v0}, Lkw;-><init>(IZLun0;)V

    .line 174
    .line 175
    .line 176
    new-instance v0, Lt7;

    .line 177
    .line 178
    const/4 v2, 0x4

    .line 179
    invoke-direct {v0, v2, p0, v1}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 183
    .line 184
    .line 185
    :cond_b
    :goto_6
    return-void
.end method

.method public static r(Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lup0;->k:Landroid/app/Activity;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string v1, "hostAct"

    .line 8
    .line 9
    invoke-static {v1}, Lt11;->S(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    new-instance v2, Lx92;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object v1, v2

    .line 20
    :goto_0
    nop

    .line 21
    instance-of v2, v1, Lx92;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    move-object v1, v0

    .line 26
    :cond_1
    check-cast v1, Landroid/app/Activity;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "com.tencent.mm.plugin.profile.ui.ProfileSettingUI"

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    sget-object v2, Lr90;->l:Ljava/util/Set;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    monitor-enter v2

    .line 55
    :try_start_1
    invoke-interface {v2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 59
    monitor-exit v2

    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ln4;->r()Lhi0;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Lzf1;->b()V

    .line 72
    .line 73
    .line 74
    const-class v4, Ljava/util/LinkedList;

    .line 75
    .line 76
    iput-object v4, v3, Lhi0;->g:Ljava/lang/Class;

    .line 77
    .line 78
    invoke-virtual {v3}, Lhi0;->c()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {v3}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Lpi0;

    .line 87
    .line 88
    invoke-virtual {v3}, Lpi0;->g0()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    instance-of v4, v3, Ljava/util/LinkedList;

    .line 93
    .line 94
    if-eqz v4, :cond_5

    .line 95
    .line 96
    check-cast v3, Ljava/util/LinkedList;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    move-object v3, v0

    .line 100
    :goto_1
    if-nez v3, :cond_6

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    const/4 v4, 0x1

    .line 108
    if-ne v3, v4, :cond_7

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    const-string v5, "Contact_User"

    .line 116
    .line 117
    invoke-virtual {v3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    if-eqz v3, :cond_9

    .line 122
    .line 123
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-nez v5, :cond_8

    .line 128
    .line 129
    move-object v0, v3

    .line 130
    :cond_8
    if-eqz v0, :cond_9

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_9
    sget-object v0, Lr90;->j:Ljava/lang/String;

    .line 134
    .line 135
    if-nez v0, :cond_a

    .line 136
    .line 137
    :goto_2
    return-void

    .line 138
    :cond_a
    :goto_3
    const-class v3, Landroid/content/Context;

    .line 139
    .line 140
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 149
    .line 150
    .line 151
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-static {v3}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v4}, Ln4;->v()Lsg1;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {v4}, Lzf1;->b()V

    .line 168
    .line 169
    .line 170
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 171
    .line 172
    iput-object v5, v4, Lsg1;->C:Ljava/lang/Class;

    .line 173
    .line 174
    const-class v5, Ljava/lang/String;

    .line 175
    .line 176
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v4, v5}, Lsg1;->d([Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4}, Lsg1;->c()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    check-cast v4, Lzg1;

    .line 192
    .line 193
    const-string v5, "nuke_display_contact_id"

    .line 194
    .line 195
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v4, v5}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    sget-object v4, Lr91;->d:Lr91;

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    sget-object v4, Lr91;->f:Lhx2;

    .line 208
    .line 209
    invoke-virtual {v4}, Lhx2;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    check-cast v4, Ljava/lang/reflect/Method;

    .line 214
    .line 215
    const v5, 0x790b00ff

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v4, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1}, Ln4;->v()Lsg1;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v1}, Lzf1;->b()V

    .line 238
    .line 239
    .line 240
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 241
    .line 242
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    filled-new-array {p1, v4}, [Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {v1, p1}, Lsg1;->d([Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Lsg1;->c()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-static {p1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    check-cast p1, Lzg1;

    .line 261
    .line 262
    const/4 v1, 0x0

    .line 263
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {p1, v1}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    monitor-enter v2

    .line 275
    :try_start_2
    move-object p1, v2

    .line 276
    check-cast p1, Ljava/util/Collection;

    .line 277
    .line 278
    invoke-interface {p1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 279
    .line 280
    .line 281
    monitor-exit v2

    .line 282
    sget-object p0, Lr90;->m:Ljava/util/Map;

    .line 283
    .line 284
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-interface {p0, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    sget-object p0, Lr90;->h:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :catchall_1
    move-exception p0

    .line 297
    monitor-exit v2

    .line 298
    throw p0

    .line 299
    :catchall_2
    move-exception p0

    .line 300
    monitor-exit v2

    .line 301
    throw p0
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lr90;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    sget-boolean p0, Lr90;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final g()V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-class v1, Landroid/app/Activity;

    .line 7
    .line 8
    const-string v2, "onCreate"

    .line 9
    .line 10
    const-class v3, Landroid/os/Bundle;

    .line 11
    .line 12
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v2, Lgs;

    .line 24
    .line 25
    const/16 v3, 0xd

    .line 26
    .line 27
    invoke-direct {v2, v3}, Lgs;-><init>(I)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Lkg3;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v3, p0, v4, v2}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    const-string v1, "com.tencent.mm.ui.base.preference.MMPreference"

    .line 47
    .line 48
    invoke-static {v1}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "com.tencent.mm.ui.base.preference.Preference"

    .line 53
    .line 54
    invoke-static {v2}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v1}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ln4;->v()Lsg1;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v3, "createAdapter"

    .line 67
    .line 68
    iput-object v3, v1, Lzf1;->b:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1}, Lsg1;->c()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lzg1;

    .line 79
    .line 80
    iget-object v1, v1, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    array-length v3, v1

    .line 94
    const/4 v5, 0x0

    .line 95
    move v6, v5

    .line 96
    :goto_0
    if-ge v6, v3, :cond_0

    .line 97
    .line 98
    aget-object v7, v1, v6

    .line 99
    .line 100
    sget-object v8, Lr90;->d:Lr90;

    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v9, Lq90;

    .line 106
    .line 107
    invoke-direct {v9, v5, v2}, Lq90;-><init>(ILjava/lang/Class;)V

    .line 108
    .line 109
    .line 110
    new-instance v10, Lkg3;

    .line 111
    .line 112
    invoke-direct {v10, v8, v4, v9}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v7, v10}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    add-int/lit8 v6, v6, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :catchall_0
    move-exception p0

    .line 129
    goto :goto_1

    .line 130
    :cond_0
    const-string v1, "com.tencent.mm.ui.widget.listview.PullDownListView"

    .line 131
    .line 132
    invoke-static {v1}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ln4;->v()Lsg1;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    const-string v2, "onItemClick"

    .line 145
    .line 146
    iput-object v2, v1, Lzf1;->b:Ljava/lang/String;

    .line 147
    .line 148
    new-instance v2, Lgs;

    .line 149
    .line 150
    const/16 v3, 0xe

    .line 151
    .line 152
    invoke-direct {v2, v3}, Lgs;-><init>(I)V

    .line 153
    .line 154
    .line 155
    iput-object v2, v1, Lsg1;->i:Lin0;

    .line 156
    .line 157
    invoke-virtual {v1}, Lsg1;->c()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-static {v1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, Lzg1;

    .line 166
    .line 167
    iget-object v1, v1, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    new-instance v2, Lgs;

    .line 173
    .line 174
    const/16 v3, 0xf

    .line 175
    .line 176
    invoke-direct {v2, v3}, Lgs;-><init>(I)V

    .line 177
    .line 178
    .line 179
    new-instance v3, Lkg3;

    .line 180
    .line 181
    invoke-direct {v3, p0, v2, v4}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    sget-object p0, Lr90;->k:Ljava/util/ArrayList;

    .line 195
    .line 196
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    :try_start_1
    invoke-static {v0, p0}, Liu;->g0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 198
    .line 199
    .line 200
    :try_start_2
    monitor-exit p0

    .line 201
    return-void

    .line 202
    :catchall_1
    move-exception v1

    .line 203
    monitor-exit p0

    .line 204
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 205
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :cond_1
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_2

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 220
    .line 221
    :try_start_3
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 222
    .line 223
    .line 224
    sget-object v1, La83;->a:La83;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :catchall_2
    move-exception v1

    .line 228
    new-instance v2, Lx92;

    .line 229
    .line 230
    invoke-direct {v2, v1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    move-object v1, v2

    .line 234
    :goto_3
    invoke-static {v1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    if-eqz v1, :cond_1

    .line 239
    .line 240
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_2
    throw p0
.end method

.method public final i()V
    .locals 3

    .line 1
    sget-object p0, Lr90;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-static {p0}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 27
    .line 28
    :try_start_1
    invoke-virtual {v0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 29
    .line 30
    .line 31
    sget-object v0, La83;->a:La83;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    new-instance v1, Lx92;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v1

    .line 41
    :goto_1
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    sget-object v1, Lr90;->d:Lr90;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget-object v1, Lr90;->h:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v2, "Unable to remove contact ID hook: "

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v1, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    sget-object p0, Lr90;->l:Ljava/util/Set;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    monitor-enter p0

    .line 74
    :try_start_2
    invoke-interface {p0}, Ljava/util/Set;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 75
    .line 76
    .line 77
    monitor-exit p0

    .line 78
    sget-object p0, Lr90;->m:Ljava/util/Map;

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    sput-object p0, Lr90;->j:Ljava/lang/String;

    .line 85
    .line 86
    return-void

    .line 87
    :catchall_1
    move-exception v0

    .line 88
    monitor-exit p0

    .line 89
    throw v0

    .line 90
    :catchall_2
    move-exception v0

    .line 91
    monitor-exit p0

    .line 92
    throw v0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Lr90;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lr90;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lr90;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
