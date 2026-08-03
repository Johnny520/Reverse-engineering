.class public final Lr9/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final G:Log/k;

.field public static final H:Log/k;

.field public static final I:Ljava/time/format/DateTimeFormatter;

.field public static final J:Llg/f;

.field public static final K:Llg/f;

.field public static final L:Ljava/util/Set;

.field public static final M:Ljava/util/LinkedHashSet;

.field public static final N:Ljava/util/LinkedHashSet;


# instance fields
.field public final A:Ljava/lang/ThreadLocal;

.field public volatile B:Lr9/z;

.field public volatile C:Z

.field public volatile D:Z

.field public E:Ljava/lang/Class;

.field public volatile F:Z

.field public final a:Lr8/g;

.field public final b:Lia/t;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Landroid/content/SharedPreferences;

.field public final e:Landroid/content/SharedPreferences;

.field public final f:Ljava/util/Set;

.field public final g:Ljava/util/Set;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Ljava/util/concurrent/ConcurrentHashMap;

.field public final l:Ljava/util/concurrent/ConcurrentHashMap;

.field public final m:Ljava/util/concurrent/ConcurrentHashMap;

.field public final n:Ljava/util/concurrent/ConcurrentHashMap;

.field public final o:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final p:Ljava/util/concurrent/ConcurrentHashMap;

.field public final q:Ljava/util/concurrent/ConcurrentHashMap;

.field public final r:Ljava/util/concurrent/ConcurrentHashMap;

.field public final s:Ljava/util/concurrent/ConcurrentHashMap;

.field public final t:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final u:Ljava/util/Set;

.field public final v:Ljava/util/WeakHashMap;

.field public final w:Ljava/util/WeakHashMap;

.field public final x:Ljava/util/WeakHashMap;

.field public final y:Ljava/util/WeakHashMap;

.field public final z:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Log/k;

    .line 2
    .line 3
    const-string v1, "\\$\\{([A-Za-z][A-Za-z0-9]*)\\}|\\$([A-Za-z][A-Za-z0-9]*)"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr9/d0;->G:Log/k;

    .line 9
    .line 10
    new-instance v0, Log/k;

    .line 11
    .line 12
    sget-object v1, Log/l;->h:Log/l;

    .line 13
    .line 14
    sget-object v2, Log/l;->i:Log/l;

    .line 15
    .line 16
    filled-new-array {v1, v2}, [Log/l;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "<atuserlist><!\\[CDATA\\[(.*?)]]></atuserlist>|<atuserlist>(.*?)</atuserlist>"

    .line 25
    .line 26
    invoke-direct {v0, v2, v1}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lr9/d0;->H:Log/k;

    .line 30
    .line 31
    const-string v0, "HH:mm:ss"

    .line 32
    .line 33
    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lr9/d0;->I:Ljava/time/format/DateTimeFormatter;

    .line 38
    .line 39
    new-instance v0, Llg/f;

    .line 40
    .line 41
    const-wide/32 v1, 0x4b3d3b00

    .line 42
    .line 43
    .line 44
    const-wide v3, 0xf4865700L

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1, v2, v3, v4}, Llg/f;-><init>(JJ)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lr9/d0;->J:Llg/f;

    .line 53
    .line 54
    new-instance v0, Llg/f;

    .line 55
    .line 56
    const-wide v1, 0x125e72e7800L

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    const-wide v3, 0x3bb2cc3d800L

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1, v2, v3, v4}, Llg/f;-><init>(JJ)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lr9/d0;->K:Llg/f;

    .line 70
    .line 71
    const-string v0, "message_details_dark_bg"

    .line 72
    .line 73
    const-string v1, "message_details_dark_text"

    .line 74
    .line 75
    const-string v2, "message_details_light_bg"

    .line 76
    .line 77
    const-string v3, "message_details_light_text"

    .line 78
    .line 79
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lr9/d0;->L:Ljava/util/Set;

    .line 88
    .line 89
    const-string v1, "message_details_left_margin"

    .line 90
    .line 91
    const-string v2, "message_details_right_margin"

    .line 92
    .line 93
    const-string v3, "message_details_position"

    .line 94
    .line 95
    const-string v4, "message_details_text_size"

    .line 96
    .line 97
    const-string v5, "message_details_avatar_gap"

    .line 98
    .line 99
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v1}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const-string v2, "message_details_time_format"

    .line 108
    .line 109
    const-string v3, "message_details_click_show"

    .line 110
    .line 111
    const-string v4, "message_details_format"

    .line 112
    .line 113
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-static {v2}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Ljava/lang/Iterable;

    .line 122
    .line 123
    invoke-static {v1, v2}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    sput-object v1, Lr9/d0;->M:Ljava/util/LinkedHashSet;

    .line 128
    .line 129
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-string v1, "message_details_enable"

    .line 134
    .line 135
    invoke-static {v1}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Ljava/lang/Iterable;

    .line 140
    .line 141
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    sput-object v0, Lr9/d0;->N:Ljava/util/LinkedHashSet;

    .line 146
    .line 147
    return-void
.end method

.method public constructor <init>(Lr8/g;Lia/t;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lr9/d0;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lr9/d0;->b:Lia/t;

    .line 10
    .line 11
    iget-object p2, p1, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string v0, "Hchat_extra_config"

    .line 14
    .line 15
    invoke-static {p2, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 22
    .line 23
    const-string v1, "Hchat_hide_chat_avatar_config"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lr9/d0;->d:Landroid/content/SharedPreferences;

    .line 30
    .line 31
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 32
    .line 33
    const-string v1, "Hchat_extra_method_cache"

    .line 34
    .line 35
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lr9/d0;->e:Landroid/content/SharedPreferences;

    .line 40
    .line 41
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lr9/d0;->f:Ljava/util/Set;

    .line 46
    .line 47
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lr9/d0;->g:Ljava/util/Set;

    .line 52
    .line 53
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lr9/d0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lr9/d0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lr9/d0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lr9/d0;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    .line 81
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 82
    .line 83
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lr9/d0;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    .line 88
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 89
    .line 90
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, Lr9/d0;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 94
    .line 95
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Lr9/d0;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 101
    .line 102
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iput-object p1, p0, Lr9/d0;->o:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 107
    .line 108
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 109
    .line 110
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lr9/d0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 114
    .line 115
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 116
    .line 117
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object p1, p0, Lr9/d0;->q:Ljava/util/concurrent/ConcurrentHashMap;

    .line 121
    .line 122
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 123
    .line 124
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, Lr9/d0;->r:Ljava/util/concurrent/ConcurrentHashMap;

    .line 128
    .line 129
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 130
    .line 131
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object p1, p0, Lr9/d0;->s:Ljava/util/concurrent/ConcurrentHashMap;

    .line 135
    .line 136
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iput-object p1, p0, Lr9/d0;->t:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 141
    .line 142
    new-instance p1, Ljava/util/WeakHashMap;

    .line 143
    .line 144
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iput-object p1, p0, Lr9/d0;->u:Ljava/util/Set;

    .line 152
    .line 153
    new-instance p1, Ljava/util/WeakHashMap;

    .line 154
    .line 155
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object p1, p0, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 159
    .line 160
    new-instance p1, Ljava/util/WeakHashMap;

    .line 161
    .line 162
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object p1, p0, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 166
    .line 167
    new-instance p1, Ljava/util/WeakHashMap;

    .line 168
    .line 169
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object p1, p0, Lr9/d0;->x:Ljava/util/WeakHashMap;

    .line 173
    .line 174
    new-instance p1, Ljava/util/WeakHashMap;

    .line 175
    .line 176
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 177
    .line 178
    .line 179
    iput-object p1, p0, Lr9/d0;->y:Ljava/util/WeakHashMap;

    .line 180
    .line 181
    new-instance p1, Ljava/util/WeakHashMap;

    .line 182
    .line 183
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 184
    .line 185
    .line 186
    iput-object p1, p0, Lr9/d0;->z:Ljava/util/WeakHashMap;

    .line 187
    .line 188
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 189
    .line 190
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 191
    .line 192
    .line 193
    iput-object p1, p0, Lr9/d0;->A:Ljava/lang/ThreadLocal;

    .line 194
    .line 195
    invoke-virtual {p0}, Lr9/d0;->m0()Lr9/z;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iput-object p1, p0, Lr9/d0;->B:Lr9/z;

    .line 200
    .line 201
    const-string p1, "hide_chat_avatar_self"

    .line 202
    .line 203
    const/4 v1, 0x0

    .line 204
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    iput-boolean p1, p0, Lr9/d0;->C:Z

    .line 209
    .line 210
    const-string p1, "hide_chat_avatar_other"

    .line 211
    .line 212
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    iput-boolean p1, p0, Lr9/d0;->D:Z

    .line 217
    .line 218
    new-instance p1, Lr9/b;

    .line 219
    .line 220
    invoke-direct {p1, p0, v1}, Lr9/b;-><init>(Lr9/d0;I)V

    .line 221
    .line 222
    .line 223
    new-instance v1, Lr9/b;

    .line 224
    .line 225
    const/4 v2, 0x1

    .line 226
    invoke-direct {v1, p0, v2}, Lr9/b;-><init>(Lr9/d0;I)V

    .line 227
    .line 228
    .line 229
    const-string v2, "message_details_format"

    .line 230
    .line 231
    invoke-interface {p2, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-nez v3, :cond_0

    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_0
    const/4 v3, 0x0

    .line 239
    invoke-interface {p2, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    const-string v4, "${time} | ${type}"

    .line 244
    .line 245
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-eqz v3, :cond_1

    .line 250
    .line 251
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    const-string v4, "${time}"

    .line 256
    .line 257
    invoke-interface {v3, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 262
    .line 263
    .line 264
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lr9/d0;->m0()Lr9/z;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    iput-object v2, p0, Lr9/d0;->B:Lr9/z;

    .line 269
    .line 270
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 274
    .line 275
    .line 276
    return-void
.end method

.method public static A0(Landroid/view/View;Landroid/view/View;Ljava/util/WeakHashMap;Lfg/a;)Z
    .locals 6

    .line 1
    invoke-static {p0, p2}, Lr9/d0;->h(Landroid/view/View;Ljava/util/WeakHashMap;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_0
    new-instance v2, Lgg/u;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lr9/o;

    .line 22
    .line 23
    move-object v5, p0

    .line 24
    move-object v3, p2

    .line 25
    move-object v4, p3

    .line 26
    invoke-direct/range {v0 .. v5}, Lr9/o;-><init>(Landroid/view/ViewTreeObserver;Lgg/u;Ljava/util/WeakHashMap;Lfg/a;Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v3

    .line 32
    :try_start_0
    new-instance p0, Lr9/a0;

    .line 33
    .line 34
    iget-object p1, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    check-cast p1, Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 40
    .line 41
    invoke-direct {p0, v1, p1}, Lr9/a0;-><init>(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v5, p0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    monitor-exit v3

    .line 48
    iget-object p0, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 49
    .line 50
    if-eqz p0, :cond_1

    .line 51
    .line 52
    check-cast p0, Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 53
    .line 54
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_1
    const-string p0, "listener"

    .line 60
    .line 61
    invoke-static {p0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p2

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object p0, v0

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    :try_start_1
    const-string p0, "listener"

    .line 69
    .line 70
    invoke-static {p0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    :goto_0
    monitor-exit v3

    .line 75
    throw p0
.end method

.method public static C0(Ljava/lang/Object;)V
    .locals 6

    .line 1
    const-string v0, "setKey"

    .line 2
    .line 3
    const-string v1, "hchat_group_member_history"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {p0, v0, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    const-string v0, "r"

    .line 13
    .line 14
    invoke-static {p0, v0, v1}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    const-string v0, "q"

    .line 18
    .line 19
    invoke-static {p0, v0, v1}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    move-object v3, v2

    .line 45
    check-cast v3, Ljava/lang/reflect/Field;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-class v5, Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_1

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    const/4 v3, 0x0

    .line 72
    :goto_0
    if-eqz v3, :cond_0

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 v2, 0x0

    .line 76
    :goto_1
    check-cast v2, Ljava/lang/reflect/Field;

    .line 77
    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    invoke-static {v2, p0, v1}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void
.end method

.method public static D0(Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 8

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string v0, "i"

    .line 4
    .line 5
    invoke-static {p1, v0, p0}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    const-string v0, "h"

    .line 9
    .line 10
    invoke-static {p1, v0, p0}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v0, "n"

    .line 15
    .line 16
    invoke-static {p1, v0, p0}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    const-string v0, "m"

    .line 20
    .line 21
    invoke-static {p1, v0, p0}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v3, 0x1

    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    move-object v4, v2

    .line 53
    check-cast v4, Ljava/lang/reflect/Method;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    array-length v5, v5

    .line 60
    const/4 v6, 0x0

    .line 61
    if-ne v5, v3, :cond_3

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    aget-object v5, v5, v6

    .line 68
    .line 69
    const-class v7, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-nez v5, :cond_2

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    aget-object v5, v5, v6

    .line 82
    .line 83
    const-class v7, Ljava/lang/CharSequence;

    .line 84
    .line 85
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_3

    .line 90
    .line 91
    :cond_2
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 96
    .line 97
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move v3, v6

    .line 105
    :goto_2
    if-eqz v3, :cond_1

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    if-eqz p2, :cond_5

    .line 112
    .line 113
    invoke-static {v3, v1}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    check-cast p2, Ljava/lang/reflect/Method;

    .line 118
    .line 119
    if-eqz p2, :cond_5

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    invoke-static {v1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    check-cast p2, Ljava/lang/reflect/Method;

    .line 127
    .line 128
    :goto_3
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p2, p1, p0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public static final F0(Landroid/content/Context;Lr9/d0;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 2

    .line 1
    new-instance p1, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {p1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p2, 0x41300000    # 11.0f

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const/16 p2, 0x11

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 17
    .line 18
    .line 19
    const/16 p2, 0x96

    .line 20
    .line 21
    const/16 v0, 0xf3

    .line 22
    .line 23
    const/16 v1, 0x21

    .line 24
    .line 25
    invoke-static {v1, p2, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 30
    .line 31
    .line 32
    const/high16 p2, 0x41000000    # 8.0f

    .line 33
    .line 34
    invoke-static {p0, p2}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    const/high16 v0, 0x40800000    # 4.0f

    .line 39
    .line 40
    invoke-static {p0, v0}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-virtual {p1, p2, p0, p2, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 45
    .line 46
    .line 47
    return-object p1
.end method

.method public static final G0(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;Lr9/d0;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-nez p0, :cond_1

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_2
    const-string p1, ">\\s+<"

    .line 25
    .line 26
    const-string p2, "><"

    .line 27
    .line 28
    invoke-static {p1, p0, p2}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final H0(Lgg/q;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/EditText;ILandroid/widget/TextView;Lgg/u;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lgg/q;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lgg/q;->g:Z

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move p2, v2

    .line 30
    :goto_0
    invoke-virtual {p3}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    if-eqz p3, :cond_2

    .line 35
    .line 36
    invoke-virtual {p3}, Landroid/text/Layout;->getLineCount()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-gtz v3, :cond_3

    .line 41
    .line 42
    :cond_2
    move p2, v2

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    if-gez v1, :cond_4

    .line 45
    .line 46
    move v3, v2

    .line 47
    goto :goto_1

    .line 48
    :cond_4
    move v3, v1

    .line 49
    :goto_1
    invoke-virtual {p3, v3}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {p3}, Landroid/text/Layout;->getLineCount()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    sub-int/2addr v4, v0

    .line 58
    invoke-static {v3, v2, v4}, Lr9/e0;->r(III)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {p3, v0}, Landroid/text/Layout;->getLineStart(I)I

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    invoke-static {p3, v2, p2}, Lr9/e0;->r(III)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    :goto_2
    invoke-virtual {p4, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 74
    .line 75
    const/4 p3, -0x1

    .line 76
    invoke-direct {p1, p3, p6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p4, p5, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p5}, Landroid/view/View;->requestFocus()Z

    .line 83
    .line 84
    .line 85
    invoke-virtual {p5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    move p1, v2

    .line 97
    :goto_3
    invoke-static {p2, v2, p1}, Lr9/e0;->r(III)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-virtual {p5, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 102
    .line 103
    .line 104
    new-instance p1, Lf0/d;

    .line 105
    .line 106
    const/4 p2, 0x2

    .line 107
    invoke-direct {p1, v1, p2, p5}, Lf0/d;-><init>(IILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p5, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 111
    .line 112
    .line 113
    const-string p1, "\u7f16\u8f91"

    .line 114
    .line 115
    invoke-virtual {p7, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    iget-object p2, p8, Lgg/u;->g:Ljava/lang/Object;

    .line 119
    .line 120
    const/4 p4, 0x0

    .line 121
    const-string p5, "dialog"

    .line 122
    .line 123
    if-eqz p2, :cond_d

    .line 124
    .line 125
    check-cast p2, Landroid/app/AlertDialog;

    .line 126
    .line 127
    const/4 p6, -0x3

    .line 128
    invoke-virtual {p2, p6}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    if-eqz p2, :cond_7

    .line 133
    .line 134
    iget-boolean p6, p0, Lgg/q;->g:Z

    .line 135
    .line 136
    if-eqz p6, :cond_6

    .line 137
    .line 138
    const-string p1, "\u641c\u7d22"

    .line 139
    .line 140
    :cond_6
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    iget-object p1, p8, Lgg/u;->g:Ljava/lang/Object;

    .line 144
    .line 145
    if-eqz p1, :cond_c

    .line 146
    .line 147
    check-cast p1, Landroid/app/AlertDialog;

    .line 148
    .line 149
    invoke-virtual {p1, p3}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-eqz p1, :cond_9

    .line 154
    .line 155
    iget-boolean p0, p0, Lgg/q;->g:Z

    .line 156
    .line 157
    if-eqz p0, :cond_8

    .line 158
    .line 159
    const-string p0, "\u53d1\u9001"

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_8
    const-string p0, "\u5173\u95ed"

    .line 163
    .line 164
    :goto_4
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    :cond_9
    iget-object p0, p8, Lgg/u;->g:Ljava/lang/Object;

    .line 168
    .line 169
    if-eqz p0, :cond_b

    .line 170
    .line 171
    check-cast p0, Landroid/app/AlertDialog;

    .line 172
    .line 173
    const/4 p1, -0x2

    .line 174
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    if-eqz p0, :cond_a

    .line 179
    .line 180
    const-string p1, "\u590d\u5236"

    .line 181
    .line 182
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    .line 184
    .line 185
    :cond_a
    :goto_5
    return-void

    .line 186
    :cond_b
    invoke-static {p5}, Lgg/l;->g(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p4

    .line 190
    :cond_c
    invoke-static {p5}, Lgg/l;->g(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p4

    .line 194
    :cond_d
    invoke-static {p5}, Lgg/l;->g(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p4
.end method

.method public static final I0(Landroid/widget/EditText;Landroid/widget/EditText;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    const-string v1, ""

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    move-object p0, v1

    .line 19
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_3
    if-nez v0, :cond_4

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_4
    move-object v1, v0

    .line 42
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    move v2, v0

    .line 49
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-gt v2, v3, :cond_6

    .line 54
    .line 55
    const/4 v3, 0x4

    .line 56
    invoke-static {v1, p0, v2, v0, v3}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-gez v2, :cond_5

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    add-int/2addr v2, v3

    .line 75
    goto :goto_2

    .line 76
    :cond_6
    :goto_3
    return-object p1
.end method

.method public static final J0(Landroid/widget/EditText;Landroid/widget/TextView;Lgg/s;Landroid/widget/EditText;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    const-string p0, "\u8bf7\u8f93\u5165\u641c\u7d22\u5185\u5bb9"

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    invoke-static {p0, p3}, Lr9/d0;->I0(Landroid/widget/EditText;Landroid/widget/EditText;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v3, "\u641c\u7d22\u7ed3\u679c: "

    .line 40
    .line 41
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    const/4 p0, -0x1

    .line 61
    iput p0, p2, Lgg/s;->g:I

    .line 62
    .line 63
    const-string p0, "\u672a\u627e\u5230: "

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    iget v1, p2, Lgg/s;->g:I

    .line 74
    .line 75
    if-gez v1, :cond_5

    .line 76
    .line 77
    if-eqz p4, :cond_4

    .line 78
    .line 79
    const/4 p4, 0x0

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result p4

    .line 85
    add-int/lit8 p4, p4, -0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    if-eqz p4, :cond_6

    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result p4

    .line 96
    rem-int p4, v1, p4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    add-int/lit8 v1, v1, -0x1

    .line 100
    .line 101
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p4

    .line 105
    add-int/2addr p4, v1

    .line 106
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    rem-int/2addr p4, v1

    .line 111
    :goto_1
    iput p4, p2, Lgg/s;->g:I

    .line 112
    .line 113
    invoke-interface {p0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p4

    .line 117
    check-cast p4, Ljava/lang/Number;

    .line 118
    .line 119
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result p4

    .line 123
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    add-int/2addr v0, p4

    .line 128
    invoke-virtual {p3, p4, v0}, Landroid/widget/EditText;->setSelection(II)V

    .line 129
    .line 130
    .line 131
    iget p2, p2, Lgg/s;->g:I

    .line 132
    .line 133
    add-int/lit8 p2, p2, 0x1

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    new-instance p3, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string p2, "/"

    .line 148
    .line 149
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public static final K0(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;Z)V
    .locals 12

    .line 1
    move-object/from16 v9, p5

    .line 2
    .line 3
    move-object/from16 v10, p6

    .line 4
    .line 5
    move-object/from16 v11, p14

    .line 6
    .line 7
    if-eqz p15, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lgg/q;->g:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move v6, p3

    .line 15
    move-object/from16 v5, p4

    .line 16
    .line 17
    move-object/from16 v7, p8

    .line 18
    .line 19
    move-object/from16 v1, p9

    .line 20
    .line 21
    move-object/from16 v2, p10

    .line 22
    .line 23
    move-object/from16 v3, p11

    .line 24
    .line 25
    move-object/from16 v4, p12

    .line 26
    .line 27
    move-object/from16 v8, p13

    .line 28
    .line 29
    invoke-static/range {v0 .. v8}, Lr9/d0;->H0(Lgg/q;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/EditText;ILandroid/widget/TextView;Lgg/u;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object/from16 v5, p4

    .line 34
    .line 35
    move-object/from16 v7, p8

    .line 36
    .line 37
    :goto_0
    const/16 v1, 0x8

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz p15, :cond_1

    .line 41
    .line 42
    move v3, v2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v3, v1

    .line 45
    :goto_1
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    if-eqz p15, :cond_2

    .line 49
    .line 50
    move v1, v2

    .line 51
    :cond_2
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    if-lez p3, :cond_4

    .line 55
    .line 56
    iget-boolean p0, p0, Lgg/q;->g:Z

    .line 57
    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    check-cast p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 68
    .line 69
    if-eqz p15, :cond_3

    .line 70
    .line 71
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const/high16 p1, 0x42c00000    # 96.0f

    .line 75
    .line 76
    invoke-static {v11, p1}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    sub-int/2addr p3, p1

    .line 81
    const/high16 p1, 0x43d20000    # 420.0f

    .line 82
    .line 83
    invoke-static {v11, p1}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-ge p3, p1, :cond_3

    .line 88
    .line 89
    move p3, p1

    .line 90
    :cond_3
    iput p3, p0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 91
    .line 92
    invoke-virtual {v5, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    if-eqz p15, :cond_11

    .line 96
    .line 97
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    const/4 p1, 0x0

    .line 102
    if-eqz p0, :cond_5

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    goto :goto_2

    .line 109
    :cond_5
    move-object p0, p1

    .line 110
    :goto_2
    const-string p2, ""

    .line 111
    .line 112
    if-nez p0, :cond_6

    .line 113
    .line 114
    move-object p0, p2

    .line 115
    :cond_6
    invoke-virtual {v5}, Landroid/widget/TextView;->getSelectionStart()I

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    invoke-virtual {v5}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    if-gez p3, :cond_7

    .line 128
    .line 129
    move p3, v2

    .line 130
    :cond_7
    invoke-virtual {v5}, Landroid/widget/TextView;->getSelectionStart()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-virtual {v5}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-le v0, v1, :cond_8

    .line 147
    .line 148
    move v0, v1

    .line 149
    :cond_8
    if-le v0, p3, :cond_9

    .line 150
    .line 151
    invoke-virtual {p0, p3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    iput-object p0, v9, Lgg/u;->g:Ljava/lang/Object;

    .line 156
    .line 157
    :cond_9
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-eqz p0, :cond_a

    .line 162
    .line 163
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    goto :goto_3

    .line 168
    :cond_a
    move-object p0, p1

    .line 169
    :goto_3
    if-nez p0, :cond_b

    .line 170
    .line 171
    move-object p0, p2

    .line 172
    :cond_b
    iget-object p3, v9, Lgg/u;->g:Ljava/lang/Object;

    .line 173
    .line 174
    move-object v0, p3

    .line 175
    check-cast v0, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-lez v1, :cond_c

    .line 182
    .line 183
    invoke-static {p0, v0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-eqz p0, :cond_c

    .line 188
    .line 189
    const/4 p0, 0x1

    .line 190
    goto :goto_4

    .line 191
    :cond_c
    move p0, v2

    .line 192
    :goto_4
    if-eqz p0, :cond_d

    .line 193
    .line 194
    move-object p1, p3

    .line 195
    :cond_d
    check-cast p1, Ljava/lang/String;

    .line 196
    .line 197
    if-nez p1, :cond_e

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_e
    move-object p2, p1

    .line 201
    :goto_5
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    if-lez p0, :cond_10

    .line 206
    .line 207
    invoke-virtual {v10, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v10}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    if-eqz p0, :cond_f

    .line 215
    .line 216
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    :cond_f
    invoke-virtual {v10, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 221
    .line 222
    .line 223
    const/4 p0, -0x1

    .line 224
    move-object/from16 p1, p7

    .line 225
    .line 226
    iput p0, p1, Lgg/s;->g:I

    .line 227
    .line 228
    :cond_10
    invoke-virtual {v10}, Landroid/view/View;->requestFocus()Z

    .line 229
    .line 230
    .line 231
    invoke-static {v10, v5}, Lr9/d0;->I0(Landroid/widget/EditText;Landroid/widget/EditText;)Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    new-instance p1, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    const-string p2, "\u641c\u7d22\u7ed3\u679c: "

    .line 242
    .line 243
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-virtual {v7, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :cond_11
    const-string p0, "\u641c\u7d22"

    .line 258
    .line 259
    invoke-virtual {v7, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    .line 261
    .line 262
    return-void
.end method

.method public static L(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "contact_info_sns"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    const-string v0, "contact_info_more"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    const-string v0, "permission"

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {p1, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {p0}, Lr9/d0;->k0(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string p1, "\u8bbe\u7f6e\u5907\u6ce8"

    .line 32
    .line 33
    invoke-static {p0, p1, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    const-string p1, "\u6807\u7b7e"

    .line 40
    .line 41
    invoke-static {p0, p1, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    const-string p1, "\u670b\u53cb\u5708"

    .line 48
    .line 49
    invoke-static {p0, p1, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_2

    .line 54
    .line 55
    const-string p1, "\u6dfb\u52a0\u5230\u901a\u8baf\u5f55"

    .line 56
    .line 57
    invoke-static {p0, p1, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return v1

    .line 65
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 66
    return p0
.end method

.method public static L0(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ":\n"

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {p0, v0, v2, v2, v1}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v1, ""

    .line 17
    .line 18
    :goto_0
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    const-string v3, "<"

    .line 25
    .line 26
    invoke-static {v1, v3, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    const-string v3, "\n"

    .line 33
    .line 34
    invoke-static {v1, v3, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x2

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :cond_1
    return-object p0
.end method

.method public static M(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p0}, Lr9/d0;->j0(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "hchat_profile_id"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    invoke-static {p0}, Lr9/d0;->k0(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v1, "ID:"

    .line 32
    .line 33
    invoke-static {p0, v1, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public static M0(Ljava/lang/Number;)Ljava/lang/Long;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object p0, Lr9/d0;->J:Llg/f;

    .line 6
    .line 7
    iget-wide v2, p0, Llg/f;->g:J

    .line 8
    .line 9
    iget-wide v4, p0, Llg/f;->h:J

    .line 10
    .line 11
    cmp-long p0, v0, v4

    .line 12
    .line 13
    if-gtz p0, :cond_0

    .line 14
    .line 15
    cmp-long p0, v2, v0

    .line 16
    .line 17
    if-gtz p0, :cond_0

    .line 18
    .line 19
    const-wide/16 v2, 0x3e8

    .line 20
    .line 21
    mul-long/2addr v0, v2

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    sget-object p0, Lr9/d0;->K:Llg/f;

    .line 28
    .line 29
    iget-wide v2, p0, Llg/f;->g:J

    .line 30
    .line 31
    iget-wide v4, p0, Llg/f;->h:J

    .line 32
    .line 33
    cmp-long p0, v0, v4

    .line 34
    .line 35
    if-gtz p0, :cond_1

    .line 36
    .line 37
    cmp-long p0, v2, v0

    .line 38
    .line 39
    if-gtz p0, :cond_1

    .line 40
    .line 41
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public static N(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class v1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    array-length p0, v0

    .line 19
    const/4 v2, 0x2

    .line 20
    if-ne p0, v2, :cond_0

    .line 21
    .line 22
    const-class p0, Landroid/content/Context;

    .line 23
    .line 24
    aget-object v2, v0, v1

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    aget-object v0, v0, p0

    .line 34
    .line 35
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    return p0

    .line 44
    :cond_0
    return v1
.end method

.method public static N0(Ljava/lang/String;)Ljava/lang/Long;
    .locals 9

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    if-ne v0, v1, :cond_3

    .line 18
    .line 19
    move v0, v3

    .line 20
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-ge v0, v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_7

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    sget-object v3, Lr9/d0;->J:Llg/f;

    .line 51
    .line 52
    iget-wide v4, v3, Llg/f;->g:J

    .line 53
    .line 54
    iget-wide v6, v3, Llg/f;->h:J

    .line 55
    .line 56
    cmp-long v3, v0, v6

    .line 57
    .line 58
    if-gtz v3, :cond_2

    .line 59
    .line 60
    cmp-long v0, v4, v0

    .line 61
    .line 62
    if-gtz v0, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move-object p0, v2

    .line 66
    :goto_1
    if-eqz p0, :cond_7

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    const-wide/16 v2, 0x3e8

    .line 73
    .line 74
    mul-long/2addr v0, v2

    .line 75
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_3
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    const/16 v1, 0xd

    .line 85
    .line 86
    if-ne v0, v1, :cond_7

    .line 87
    .line 88
    move v0, v3

    .line 89
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-ge v0, v1, :cond_5

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-nez v1, :cond_4

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-eqz p0, :cond_7

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    sget-object v4, Lr9/d0;->K:Llg/f;

    .line 120
    .line 121
    iget-wide v5, v4, Llg/f;->g:J

    .line 122
    .line 123
    iget-wide v7, v4, Llg/f;->h:J

    .line 124
    .line 125
    cmp-long v4, v0, v7

    .line 126
    .line 127
    if-gtz v4, :cond_6

    .line 128
    .line 129
    cmp-long v0, v5, v0

    .line 130
    .line 131
    if-gtz v0, :cond_6

    .line 132
    .line 133
    const/4 v3, 0x1

    .line 134
    :cond_6
    if-eqz v3, :cond_7

    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_7
    :goto_4
    return-object v2
.end method

.method public static O(Landroid/view/ViewGroup;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "RecyclerView"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "ListView"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-string v0, "ScrollView"

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return v1

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public static P(Landroid/view/View;Landroid/view/View;)Z
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_2

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of v0, p0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p0, Landroid/view/View;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static P0(Landroid/view/View;)I
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-lez v1, :cond_0

    .line 16
    .line 17
    move v1, v4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v3

    .line 20
    :goto_0
    const/4 v5, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-object v2, v5

    .line 25
    :goto_1
    if-eqz v2, :cond_2

    .line 26
    .line 27
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    goto :goto_7

    .line 32
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-lez v1, :cond_3

    .line 41
    .line 42
    move v1, v4

    .line 43
    goto :goto_3

    .line 44
    :cond_3
    move v1, v3

    .line 45
    :goto_3
    if-eqz v1, :cond_4

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_4
    move-object v2, v5

    .line 49
    :goto_4
    if-eqz v2, :cond_5

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_5
    if-eqz v0, :cond_7

    .line 53
    .line 54
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-lez v1, :cond_6

    .line 61
    .line 62
    move v1, v4

    .line 63
    goto :goto_5

    .line 64
    :cond_6
    move v1, v3

    .line 65
    :goto_5
    if-eqz v1, :cond_7

    .line 66
    .line 67
    goto :goto_6

    .line 68
    :cond_7
    move-object v2, v5

    .line 69
    :goto_6
    if-eqz v2, :cond_8

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_8
    move v1, v3

    .line 73
    :goto_7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    if-lez v2, :cond_9

    .line 82
    .line 83
    move v2, v4

    .line 84
    goto :goto_8

    .line 85
    :cond_9
    move v2, v3

    .line 86
    :goto_8
    if-eqz v2, :cond_a

    .line 87
    .line 88
    goto :goto_9

    .line 89
    :cond_a
    move-object v6, v5

    .line 90
    :goto_9
    if-eqz v6, :cond_b

    .line 91
    .line 92
    :goto_a
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    goto :goto_f

    .line 97
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    if-lez v2, :cond_c

    .line 106
    .line 107
    move v2, v4

    .line 108
    goto :goto_b

    .line 109
    :cond_c
    move v2, v3

    .line 110
    :goto_b
    if-eqz v2, :cond_d

    .line 111
    .line 112
    goto :goto_c

    .line 113
    :cond_d
    move-object v6, v5

    .line 114
    :goto_c
    if-eqz v6, :cond_e

    .line 115
    .line 116
    goto :goto_a

    .line 117
    :cond_e
    if-eqz v0, :cond_10

    .line 118
    .line 119
    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 120
    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    if-lez v2, :cond_f

    .line 126
    .line 127
    move v2, v4

    .line 128
    goto :goto_d

    .line 129
    :cond_f
    move v2, v3

    .line 130
    :goto_d
    if-eqz v2, :cond_10

    .line 131
    .line 132
    goto :goto_e

    .line 133
    :cond_10
    move-object v6, v5

    .line 134
    :goto_e
    if-eqz v6, :cond_11

    .line 135
    .line 136
    goto :goto_a

    .line 137
    :cond_11
    :goto_f
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    const/high16 v6, 0x43d20000    # 420.0f

    .line 145
    .line 146
    invoke-static {v2, v6}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-le v1, v2, :cond_12

    .line 151
    .line 152
    goto :goto_10

    .line 153
    :cond_12
    move v2, v1

    .line 154
    :goto_10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v7, v6}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-le v3, v6, :cond_13

    .line 166
    .line 167
    goto :goto_11

    .line 168
    :cond_13
    move v6, v3

    .line 169
    :goto_11
    add-int/2addr v2, v6

    .line 170
    instance-of v6, p0, Landroid/widget/TextView;

    .line 171
    .line 172
    if-eqz v6, :cond_14

    .line 173
    .line 174
    add-int/lit8 v2, v2, 0x50

    .line 175
    .line 176
    :cond_14
    instance-of v6, p0, Landroid/view/ViewGroup;

    .line 177
    .line 178
    if-eqz v6, :cond_16

    .line 179
    .line 180
    move-object v6, p0

    .line 181
    check-cast v6, Landroid/view/ViewGroup;

    .line 182
    .line 183
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    const/16 v7, 0x8

    .line 188
    .line 189
    if-le v6, v7, :cond_15

    .line 190
    .line 191
    move v6, v7

    .line 192
    :cond_15
    mul-int/lit8 v6, v6, 0x14

    .line 193
    .line 194
    add-int/2addr v2, v6

    .line 195
    :cond_16
    if-eqz v0, :cond_17

    .line 196
    .line 197
    iget v6, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 198
    .line 199
    const/4 v7, -0x2

    .line 200
    if-ne v6, v7, :cond_17

    .line 201
    .line 202
    goto :goto_12

    .line 203
    :cond_17
    if-eqz v0, :cond_18

    .line 204
    .line 205
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 206
    .line 207
    const/4 v6, -0x1

    .line 208
    if-ne v0, v6, :cond_18

    .line 209
    .line 210
    :goto_12
    add-int/lit8 v2, v2, 0x28

    .line 211
    .line 212
    :cond_18
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-eqz v0, :cond_19

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    :cond_19
    if-nez v5, :cond_1a

    .line 223
    .line 224
    const-string v5, ""

    .line 225
    .line 226
    :cond_1a
    const-string v0, "avatar"

    .line 227
    .line 228
    invoke-static {v5, v0, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_1b

    .line 233
    .line 234
    add-int/lit16 v2, v2, -0x258

    .line 235
    .line 236
    :cond_1b
    if-gt v4, v1, :cond_1c

    .line 237
    .line 238
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    const/high16 v5, 0x42900000    # 72.0f

    .line 246
    .line 247
    invoke-static {v0, v5}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-gt v1, v0, :cond_1c

    .line 252
    .line 253
    if-gt v4, v3, :cond_1c

    .line 254
    .line 255
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-static {p0, v5}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    if-gt v3, p0, :cond_1c

    .line 267
    .line 268
    add-int/lit16 v2, v2, -0x1f4

    .line 269
    .line 270
    :cond_1c
    return v2
.end method

.method public static Q(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_2

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-gtz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-lez p0, :cond_2

    .line 30
    .line 31
    :cond_1
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_2
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static R(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-gez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p1, Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ge p0, v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "get"

    .line 38
    .line 39
    invoke-static {v0, v3, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v0, p1, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v0, v3, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {v0, p1, p0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 84
    return-object p0
.end method

.method public static S(Lr9/d0;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr9/d0;->a0()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lr9/d0;->e:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    iget-object v2, p0, Lr9/d0;->a:Lr8/g;

    .line 8
    .line 9
    iget-object v3, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    invoke-static {v1, v0, v3, p1}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    return-object v3

    .line 18
    :cond_0
    const/4 v3, 0x0

    .line 19
    :try_start_0
    iget-object v2, v2, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 20
    .line 21
    new-instance v4, Lch/e;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v5, Lfh/k;

    .line 27
    .line 28
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v5, p2}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    iput-object v5, v4, Lch/e;->h:Lfh/k;

    .line 35
    .line 36
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lhh/o;

    .line 55
    .line 56
    invoke-virtual {p0, v2}, Lr9/d0;->O0(Lhh/o;)Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p2

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object v2, v3

    .line 66
    goto :goto_1

    .line 67
    :goto_0
    new-instance v2, Lsf/f;

    .line 68
    .line 69
    invoke-direct {v2, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-nez p2, :cond_3

    .line 77
    .line 78
    move-object v3, v2

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    iget-object p0, p0, Lr9/d0;->b:Lia/t;

    .line 81
    .line 82
    const-string v2, "DexKit\u5b9a\u4f4d\u5931\u8d25: "

    .line 83
    .line 84
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {p0, v2, p2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    :goto_2
    check-cast v3, Ljava/lang/reflect/Method;

    .line 92
    .line 93
    if-eqz v3, :cond_4

    .line 94
    .line 95
    invoke-static {v1, v0, p1, v3}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    const-string p0, "cache.key"

    .line 100
    .line 101
    :try_start_1
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    const-string v2, ""

    .line 106
    .line 107
    invoke-interface {v1, p0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_5

    .line 116
    .line 117
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-interface {v1, p0, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    .line 130
    .line 131
    :catchall_1
    :goto_3
    return-object v3
.end method

.method public static U(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "<"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const-string v0, ">"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/16 v0, 0x3e

    .line 27
    .line 28
    const/4 v2, 0x6

    .line 29
    invoke-static {p0, v0, v1, v2}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    const/4 v0, 0x1

    .line 34
    if-le p0, v0, :cond_0

    .line 35
    .line 36
    return v0

    .line 37
    :cond_0
    return v1
.end method

.method public static a(Ljava/lang/Object;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const-string v5, "getCount"

    .line 32
    .line 33
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    array-length v4, v4

    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    new-array v4, v2, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v1, p0, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    instance-of v4, v1, Ljava/lang/Number;

    .line 56
    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    check-cast v1, Ljava/lang/Number;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v1, v3

    .line 63
    :goto_0
    if-eqz v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    :cond_2
    if-eqz v3, :cond_0

    .line 74
    .line 75
    :cond_3
    if-eqz v3, :cond_4

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    return p0

    .line 82
    :cond_4
    return v2
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    .line 1
    invoke-static {p0}, Lr9/d0;->a(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-lt v2, v0, :cond_1

    .line 9
    .line 10
    sub-int/2addr v0, v3

    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    return v0

    .line 15
    :cond_1
    invoke-static {v2, p0}, Lr9/d0;->c(ILjava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    if-ne v4, p1, :cond_2

    .line 20
    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    sub-int v5, v2, v3

    .line 25
    .line 26
    invoke-static {v4}, Lr9/d0;->M(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_3

    .line 31
    .line 32
    add-int/lit8 v5, v5, 0x1

    .line 33
    .line 34
    return v5

    .line 35
    :cond_3
    invoke-static {v4}, Lr9/d0;->j0(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-static {v4, v6}, Lr9/d0;->L(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_4

    .line 44
    .line 45
    return v5

    .line 46
    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0
.end method

.method public static b0(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object v0
.end method

.method public static c(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/reflect/Method;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "getItem"

    .line 31
    .line 32
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    array-length v3, v3

    .line 43
    const/4 v4, 0x1

    .line 44
    if-ne v3, v4, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const/4 v4, 0x0

    .line 51
    aget-object v3, v3, v4

    .line 52
    .line 53
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-static {v3, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_1

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    aget-object v3, v3, v4

    .line 66
    .line 67
    const-class v4, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v1, p1, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :cond_2
    if-eqz v2, :cond_0

    .line 88
    .line 89
    :cond_3
    return-object v2
.end method

.method public static c0(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const-string v0, "\\s+"

    .line 20
    .line 21
    const-string v1, " "

    .line 22
    .line 23
    invoke-static {v0, p0, v1}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    :goto_0
    if-nez p0, :cond_1

    .line 30
    .line 31
    const-string p0, ""

    .line 32
    .line 33
    :cond_1
    return-object p0
.end method

.method public static d(Ljava/lang/Object;ILjava/lang/Object;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/reflect/Method;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    array-length v3, v3

    .line 38
    const/4 v4, 0x2

    .line 39
    const/4 v5, 0x1

    .line 40
    if-ne v3, v4, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    aget-object v3, v3, v5

    .line 47
    .line 48
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    aget-object v3, v3, v2

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    filled-new-array {p2, v3}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {v1, p0, v3}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    move v1, v2

    .line 86
    :goto_0
    if-eqz v1, :cond_1

    .line 87
    .line 88
    return v5

    .line 89
    :cond_3
    :goto_1
    return v2
.end method

.method public static d0(Ljava/lang/Object;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "notifyDataSetChanged"

    .line 5
    .line 6
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v4, v3

    .line 32
    check-cast v4, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {v5, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    array-length v4, v4

    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move v4, v0

    .line 57
    :goto_0
    if-eqz v4, :cond_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/4 v3, 0x0

    .line 61
    :goto_1
    check-cast v3, Ljava/lang/reflect/Method;

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    new-array v0, v0, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {v3, p0, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_3
    return-void
.end method

.method public static f(Lr9/f0;)Ll8/c;
    .locals 3

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    iget-object v1, p0, Lr9/f0;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lr9/f0;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lg8/a;->c()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-nez v2, :cond_1

    .line 20
    .line 21
    const-string v2, ""

    .line 22
    .line 23
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v1, p0, v2}, Ll8/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static f0(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-static {p0, v0, v1}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v2, v1

    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_1

    .line 68
    .line 69
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-static {p0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :array_0
    .array-data 2
        0x2cs
        0x3bs
        0x7cs
        0x20s
    .end array-data
.end method

.method public static g0(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    new-instance v0, Lsf/f;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p0, v0

    .line 25
    :goto_0
    nop

    .line 26
    instance-of v0, p0, Lsf/f;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    :cond_0
    check-cast p0, Ljava/lang/Integer;

    .line 32
    .line 33
    return-object p0
.end method

.method public static h(Landroid/view/View;Ljava/util/WeakHashMap;)V
    .locals 0

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Lr9/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lr9/a0;->a:Landroid/view/ViewTreeObserver;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lr9/a0;->a:Landroid/view/ViewTreeObserver;

    .line 20
    .line 21
    iget-object p0, p0, Lr9/a0;->b:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    monitor-exit p1

    .line 29
    throw p0
.end method

.method public static h0(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "clipboard"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Landroid/content/ClipboardManager;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Landroid/content/ClipboardManager;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-eqz p0, :cond_1

    .line 16
    .line 17
    const-string v0, "\u6d88\u606f\u8be6\u60c5"

    .line 18
    .line 19
    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public static i0(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static j(Landroid/app/Activity;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    const-string v1, "Contact_ChatRoomId"

    .line 9
    .line 10
    const-string v2, "Chat_User"

    .line 11
    .line 12
    const-string v3, "Contact_User"

    .line 13
    .line 14
    const-string v4, "RoomInfo_Id"

    .line 15
    .line 16
    const-string v5, "room_name"

    .line 17
    .line 18
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v2, v0

    .line 56
    :goto_0
    if-eqz v2, :cond_0

    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_2
    return-object v0
.end method

.method public static j0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_3

    .line 4
    :cond_0
    const-string v0, "r"

    .line 5
    .line 6
    const-string v1, "q"

    .line 7
    .line 8
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x2

    .line 16
    if-lt v2, v4, :cond_7

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/reflect/Field;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const-class v5, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    instance-of v4, v2, Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    check-cast v2, Ljava/lang/String;

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object v2, v3

    .line 66
    :goto_2
    if-eqz v2, :cond_1

    .line 67
    .line 68
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const-string v4, "hchat_group_member_history"

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_1

    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_4
    const-string v0, "getKey"

    .line 85
    .line 86
    new-array v1, v1, [Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {p0, v0, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    instance-of v0, p0, Ljava/lang/String;

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    move-object v3, p0

    .line 97
    check-cast v3, Ljava/lang/String;

    .line 98
    .line 99
    :cond_5
    if-eqz v3, :cond_6

    .line 100
    .line 101
    return-object v3

    .line 102
    :cond_6
    :goto_3
    const-string p0, ""

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_7
    aget-object v4, v0, v2

    .line 106
    .line 107
    invoke-static {p0, v4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    instance-of v5, v4, Ljava/lang/String;

    .line 112
    .line 113
    if-eqz v5, :cond_8

    .line 114
    .line 115
    check-cast v4, Ljava/lang/String;

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_8
    move-object v4, v3

    .line 119
    :goto_4
    if-eqz v4, :cond_a

    .line 120
    .line 121
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-nez v5, :cond_9

    .line 126
    .line 127
    move-object v3, v4

    .line 128
    :cond_9
    if-eqz v3, :cond_a

    .line 129
    .line 130
    return-object v3

    .line 131
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 132
    .line 133
    goto :goto_0
.end method

.method public static k(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const/16 v1, 0x8

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ge v0, v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of v1, p0, Landroid/view/View;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast p0, Landroid/view/View;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object p0, v2

    .line 26
    :goto_1
    if-eqz p0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-ne v1, p1, :cond_2

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    return-object v2
.end method

.method public static k0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_3

    .line 4
    :cond_0
    const-string v0, "i"

    .line 5
    .line 6
    const-string v1, "h"

    .line 7
    .line 8
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x2

    .line 16
    if-lt v2, v4, :cond_6

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/reflect/Method;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    array-length v4, v4

    .line 50
    if-nez v4, :cond_3

    .line 51
    .line 52
    const-class v4, Ljava/lang/CharSequence;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    new-array v4, v1, [Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {v2, p0, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    instance-of v4, v2, Ljava/lang/CharSequence;

    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    check-cast v2, Ljava/lang/CharSequence;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move-object v2, v3

    .line 78
    :goto_1
    if-eqz v2, :cond_3

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_3

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move-object v2, v3

    .line 94
    :goto_2
    if-eqz v2, :cond_1

    .line 95
    .line 96
    move-object v3, v2

    .line 97
    :cond_4
    if-nez v3, :cond_5

    .line 98
    .line 99
    :goto_3
    const-string p0, ""

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_5
    return-object v3

    .line 103
    :cond_6
    aget-object v4, v0, v2

    .line 104
    .line 105
    invoke-static {p0, v4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    instance-of v5, v4, Ljava/lang/CharSequence;

    .line 110
    .line 111
    if-eqz v5, :cond_7

    .line 112
    .line 113
    check-cast v4, Ljava/lang/CharSequence;

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_7
    move-object v4, v3

    .line 117
    :goto_4
    if-eqz v4, :cond_9

    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    if-eqz v4, :cond_9

    .line 124
    .line 125
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-nez v5, :cond_8

    .line 130
    .line 131
    move-object v3, v4

    .line 132
    :cond_8
    if-eqz v3, :cond_9

    .line 133
    .line 134
    return-object v3

    .line 135
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 136
    .line 137
    goto :goto_0
.end method

.method public static l(Landroid/content/Context;F)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    float-to-int p0, p0

    .line 15
    return p0
.end method

.method public static l0(Ljava/nio/ByteBuffer;)Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const v0, 0xffff

    .line 14
    .line 15
    .line 16
    and-int/2addr p0, v0

    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/16 v1, 0xc00

    .line 22
    .line 23
    if-gt p0, v1, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    :goto_0
    if-eqz p0, :cond_2

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static m(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object v0
.end method

.method public static n(Landroid/view/View;Z)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lr9/d0;->Q(Landroid/view/View;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :cond_0
    return-object p0

    .line 26
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    check-cast p0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    :goto_0
    if-lt v1, v0, :cond_3

    .line 39
    .line 40
    :goto_1
    const/4 p0, 0x0

    .line 41
    return-object p0

    .line 42
    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v2, p1}, Lr9/d0;->n(Landroid/view/View;Z)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0
.end method

.method public static p(Ljava/lang/Object;Ljava/util/concurrent/ConcurrentHashMap;)Landroid/widget/TextView;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/reflect/Field;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v0, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of p1, p0, Landroid/widget/TextView;

    .line 19
    .line 20
    if-eqz p1, :cond_4

    .line 21
    .line 22
    check-cast p0, Landroid/widget/TextView;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lr9/d0;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    move-object v3, v2

    .line 48
    check-cast v3, Ljava/lang/reflect/Field;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v5, "timeTV"

    .line 55
    .line 56
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    const-class v4, Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    const/4 v3, 0x0

    .line 77
    :goto_0
    if-eqz v3, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object v2, v1

    .line 81
    :goto_1
    check-cast v2, Ljava/lang/reflect/Field;

    .line 82
    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    instance-of p1, p0, Landroid/widget/TextView;

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    check-cast p0, Landroid/widget/TextView;

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_4
    return-object v1
.end method

.method public static q(Ljava/lang/Object;Ljava/util/concurrent/ConcurrentHashMap;)Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/reflect/Field;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v0, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of p1, p0, Landroid/view/View;

    .line 19
    .line 20
    if-eqz p1, :cond_4

    .line 21
    .line 22
    check-cast p0, Landroid/view/View;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lr9/d0;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    move-object v3, v2

    .line 48
    check-cast v3, Ljava/lang/reflect/Field;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v5, "clickArea"

    .line 55
    .line 56
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    const-class v4, Landroid/view/View;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    const/4 v3, 0x0

    .line 77
    :goto_0
    if-eqz v3, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object v2, v1

    .line 81
    :goto_1
    check-cast v2, Ljava/lang/reflect/Field;

    .line 82
    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    instance-of p1, p0, Landroid/view/View;

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    check-cast p0, Landroid/view/View;

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_4
    return-object v1
.end method

.method public static r(Landroid/view/ViewGroup;)Landroid/widget/ListView;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-lt v1, v0, :cond_1

    .line 10
    .line 11
    :goto_1
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    instance-of v3, v2, Landroid/widget/ListView;

    .line 18
    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    check-cast v2, Landroid/widget/ListView;

    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_2
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 25
    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    check-cast v2, Landroid/view/ViewGroup;

    .line 29
    .line 30
    invoke-static {v2}, Lr9/d0;->r(Landroid/view/ViewGroup;)Landroid/widget/ListView;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0
.end method

.method public static v(Landroid/view/View;Lm/b;)Landroid/widget/TextView;
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lm/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, 0x0

    .line 39
    :goto_0
    if-lt v1, v0, :cond_2

    .line 40
    .line 41
    :goto_1
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v2, p1}, Lr9/d0;->v(Landroid/view/View;Lm/b;)Landroid/widget/TextView;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0
.end method

.method public static v0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-static {p1}, Lr9/d0;->g0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p3}, Lr9/d0;->g0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p1}, Lr9/d0;->g0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2}, Lr9/d0;->g0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    move p1, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v2

    .line 32
    :goto_0
    invoke-static {p3}, Lr9/d0;->g0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p4}, Lr9/d0;->g0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    if-eqz p3, :cond_1

    .line 43
    .line 44
    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    move v2, v3

    .line 51
    :cond_1
    if-eqz v0, :cond_2

    .line 52
    .line 53
    if-nez p1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0

    .line 60
    :cond_2
    if-eqz v1, :cond_3

    .line 61
    .line 62
    if-nez v2, :cond_3

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0

    .line 69
    :cond_3
    if-eqz v0, :cond_4

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0

    .line 76
    :cond_4
    if-eqz v1, :cond_5

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    :cond_5
    return p0
.end method

.method public static w(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Long;
    .locals 4

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-gt p0, v0, :cond_7

    .line 5
    .line 6
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_0

    .line 13
    .line 14
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1}, Lr9/d0;->N0(Ljava/lang/String;)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    instance-of v0, p1, Ljava/lang/Number;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    check-cast p1, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-static {p1}, Lr9/d0;->M0(Ljava/lang/Number;)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_7

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_7

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "android."

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_7

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const-string v2, "java."

    .line 70
    .line 71
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_7

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const-string v2, "kotlin."

    .line 82
    .line 83
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    invoke-static {v0}, Lr9/d0;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_7

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Ljava/lang/reflect/Field;

    .line 109
    .line 110
    invoke-static {v1, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    instance-of v2, v1, Ljava/lang/String;

    .line 117
    .line 118
    if-eqz v2, :cond_5

    .line 119
    .line 120
    check-cast v1, Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v1}, Lr9/d0;->N0(Ljava/lang/String;)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide p0

    .line 132
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0

    .line 137
    :cond_5
    instance-of v2, v1, Ljava/lang/Number;

    .line 138
    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    check-cast v1, Ljava/lang/Number;

    .line 142
    .line 143
    invoke-static {v1}, Lr9/d0;->M0(Ljava/lang/Number;)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-eqz v1, :cond_4

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 150
    .line 151
    .line 152
    move-result-wide p0

    .line 153
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :cond_6
    add-int/lit8 v2, p0, 0x1

    .line 159
    .line 160
    invoke-static {v2, v1, p2}, Lr9/d0;->w(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-eqz v1, :cond_4

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 167
    .line 168
    .line 169
    move-result-wide p0

    .line 170
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :cond_7
    :goto_0
    const/4 p0, 0x0

    .line 176
    return-object p0
.end method

.method public static x(J)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const-string p1, "HH:mm:ss"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getYear()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1}, Ljava/time/LocalDate;->getYear()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne v0, p1, :cond_1

    .line 39
    .line 40
    const-string p1, "M\u6708d\u65e5 HH:mm:ss"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-string p1, "yyyy\u5e74M\u6708d\u65e5 HH:mm:ss"

    .line 44
    .line 45
    :goto_0
    invoke-static {p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public static z(Ljava/lang/Class;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/reflect/Method;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "getItem"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x1

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    array-length v2, v2

    .line 47
    if-ne v2, v3, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    aget-object v2, v2, v1

    .line 54
    .line 55
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-static {v2, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    aget-object v0, v0, v1

    .line 68
    .line 69
    const-class v2, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    :cond_2
    move v0, v3

    .line 78
    goto :goto_0

    .line 79
    :cond_3
    move v0, v1

    .line 80
    :goto_0
    if-eqz v0, :cond_1

    .line 81
    .line 82
    return v3

    .line 83
    :cond_4
    :goto_1
    return v1
.end method


# virtual methods
.method public final A(Ljava/lang/Object;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lr9/d0;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/reflect/Method;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v2, p0, Lr9/d0;->o:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_1
    invoke-static {v0}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_4

    .line 41
    .line 42
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    move-object v7, v6

    .line 47
    check-cast v7, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    const-string v9, "getMainContainerView"

    .line 54
    .line 55
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_3

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    array-length v8, v8

    .line 69
    if-nez v8, :cond_3

    .line 70
    .line 71
    const-class v8, Landroid/view/View;

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_3

    .line 82
    .line 83
    const/4 v7, 0x1

    .line 84
    goto :goto_0

    .line 85
    :cond_3
    move v7, v3

    .line 86
    :goto_0
    if-eqz v7, :cond_2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    move-object v6, v4

    .line 90
    :goto_1
    move-object v5, v6

    .line 91
    check-cast v5, Ljava/lang/reflect/Method;

    .line 92
    .line 93
    if-nez v5, :cond_5

    .line 94
    .line 95
    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    return-object v4

    .line 99
    :cond_5
    invoke-virtual {v1, v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-object v2, v5

    .line 103
    :goto_2
    new-array v0, v3, [Ljava/lang/Object;

    .line 104
    .line 105
    invoke-static {v2, p1, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    instance-of v1, v0, Landroid/view/View;

    .line 110
    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    check-cast v0, Landroid/view/View;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    move-object v0, v4

    .line 117
    :goto_3
    if-eqz v0, :cond_a

    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    const/16 v2, 0x8

    .line 124
    .line 125
    if-eq v1, v2, :cond_a

    .line 126
    .line 127
    invoke-static {v0, p2}, Lr9/d0;->P(Landroid/view/View;Landroid/view/View;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_7

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_7
    iget-object v1, p0, Lr9/d0;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 135
    .line 136
    invoke-static {p1, v1}, Lr9/d0;->q(Ljava/lang/Object;Ljava/util/concurrent/ConcurrentHashMap;)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-ne v0, p1, :cond_9

    .line 141
    .line 142
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-lez p1, :cond_a

    .line 147
    .line 148
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-lez p1, :cond_a

    .line 153
    .line 154
    invoke-static {v0, p2}, Lr9/d0;->P(Landroid/view/View;Landroid/view/View;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_8

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_8
    new-instance p1, Landroid/graphics/Rect;

    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    invoke-direct {p1, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, v0, p1}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    const/high16 v2, 0x41000000    # 8.0f

    .line 185
    .line 186
    invoke-static {v1, v2}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    sub-int/2addr v3, v5

    .line 203
    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    sub-int/2addr v3, v5

    .line 208
    sub-int/2addr v3, v1

    .line 209
    if-lt v2, v3, :cond_9

    .line 210
    .line 211
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 212
    .line 213
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    add-int/2addr v3, v1

    .line 218
    if-gt v2, v3, :cond_9

    .line 219
    .line 220
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 221
    .line 222
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    sub-int/2addr v2, p2

    .line 231
    sub-int/2addr v2, v1

    .line 232
    if-ge p1, v2, :cond_a

    .line 233
    .line 234
    :cond_9
    return-object v0

    .line 235
    :cond_a
    :goto_4
    return-object v4
.end method

.method public final B(Ljava/lang/reflect/Method;Lfg/l;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lr9/d0;->f:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 12
    .line 13
    new-instance v2, Lr9/b0;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, p2, p0, p1, v3}, Lr9/b0;-><init>(Lfg/l;Lr9/d0;Ljava/lang/reflect/Method;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 20
    .line 21
    .line 22
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p2

    .line 26
    new-instance v1, Lsf/f;

    .line 27
    .line 28
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object p2, v1

    .line 32
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance p2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v0, "Hchat\u6269\u5c55Hook\u5b89\u88c5\u5931\u8d25: "

    .line 49
    .line 50
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object p2, p0, Lr9/d0;->b:Lia/t;

    .line 61
    .line 62
    invoke-virtual {p2, p1, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    .line 67
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    return p1
.end method

.method public final B0(Ljava/lang/Object;Landroid/app/Activity;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, Ljava/lang/reflect/Method;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    array-length v3, v3

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x1

    .line 33
    if-ne v3, v5, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    aget-object v3, v3, v4

    .line 40
    .line 41
    const-class v6, Landroid/view/View$OnClickListener;

    .line 42
    .line 43
    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    move v4, v5

    .line 62
    :cond_1
    if-eqz v4, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v1, 0x0

    .line 66
    :goto_0
    check-cast v1, Ljava/lang/reflect/Method;

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    new-instance v0, Lk9/o;

    .line 71
    .line 72
    invoke-direct {v0, p0, p2}, Lk9/o;-><init>(Lr9/d0;Landroid/app/Activity;)V

    .line 73
    .line 74
    .line 75
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-static {v1, p1, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_3
    return-void
.end method

.method public final C(Ljava/lang/reflect/Method;Lfg/l;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lr9/d0;->f:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 12
    .line 13
    new-instance v2, Lr9/b0;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, p2, p0, p1, v3}, Lr9/b0;-><init>(Lfg/l;Lr9/d0;Ljava/lang/reflect/Method;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 20
    .line 21
    .line 22
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p2

    .line 26
    new-instance v1, Lsf/f;

    .line 27
    .line 28
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object p2, v1

    .line 32
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance p2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v0, "Hchat\u6269\u5c55Hook\u5b89\u88c5\u5931\u8d25: "

    .line 49
    .line 50
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object p2, p0, Lr9/d0;->b:Lia/t;

    .line 61
    .line 62
    invoke-virtual {p2, p1, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    .line 67
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    return p1
.end method

.method public final D(Landroid/app/Activity;Landroid/widget/ListAdapter;)Z
    .locals 13

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lq8/m;->a()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    const-string v2, ""

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    move-object v0, v2

    .line 19
    :cond_1
    const-string v3, "@chatroom"

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static {v0, v3, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-nez v5, :cond_2

    .line 27
    .line 28
    const-string v5, "@im.chatroom"

    .line 29
    .line 30
    invoke-static {v0, v5, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    goto/16 :goto_18

    .line 37
    .line 38
    :cond_2
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-eqz v5, :cond_32

    .line 43
    .line 44
    const-string v6, "Contact_ChatRoomId"

    .line 45
    .line 46
    invoke-virtual {v5, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-static {v7, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    const/4 v8, 0x1

    .line 55
    if-eqz v7, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    const-string v7, "Chat_User"

    .line 59
    .line 60
    invoke-virtual {v5, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-static {v9, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    if-eqz v9, :cond_4

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    const-string v9, "Contact_User"

    .line 72
    .line 73
    invoke-virtual {v5, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-static {v9, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_5

    .line 82
    .line 83
    goto/16 :goto_18

    .line 84
    .line 85
    :cond_5
    invoke-virtual {v5, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-eqz v6, :cond_6

    .line 90
    .line 91
    invoke-static {v6, v3, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-ne v6, v8, :cond_6

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_6
    invoke-virtual {v5, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    if-eqz v5, :cond_32

    .line 103
    .line 104
    invoke-static {v5, v3, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-ne v5, v8, :cond_32

    .line 109
    .line 110
    :goto_1
    invoke-static {p1}, Lr9/d0;->j(Landroid/app/Activity;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    if-eqz v5, :cond_32

    .line 115
    .line 116
    invoke-static {v5, v3, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-nez v3, :cond_32

    .line 121
    .line 122
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    goto/16 :goto_18

    .line 129
    .line 130
    :cond_7
    const-class v0, Landroid/content/Context;

    .line 131
    .line 132
    const-string v3, "com.tencent.mm.ui.base.preference.Preference"

    .line 133
    .line 134
    const-string v5, "\u5386\u53f2\u53d1\u8a00\u8bb0\u5f55"

    .line 135
    .line 136
    const-string v6, "hchat_group_member_history"

    .line 137
    .line 138
    if-eqz p2, :cond_27

    .line 139
    .line 140
    invoke-static {p2}, Lr9/d0;->a(Ljava/lang/Object;)I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    move v9, v4

    .line 145
    :goto_2
    if-lt v9, v7, :cond_8

    .line 146
    .line 147
    move-object v10, v1

    .line 148
    goto :goto_3

    .line 149
    :cond_8
    invoke-static {v9, p2}, Lr9/d0;->c(ILjava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    if-eqz v10, :cond_26

    .line 154
    .line 155
    invoke-static {v10}, Lr9/d0;->j0(Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    invoke-virtual {v11, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-nez v11, :cond_a

    .line 164
    .line 165
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    if-eqz v11, :cond_9

    .line 170
    .line 171
    goto/16 :goto_12

    .line 172
    .line 173
    :cond_9
    invoke-static {v10}, Lr9/d0;->k0(Ljava/lang/Object;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    invoke-virtual {v11, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    if-eqz v11, :cond_26

    .line 182
    .line 183
    :cond_a
    :goto_3
    if-eqz v10, :cond_16

    .line 184
    .line 185
    invoke-static {v10}, Lr9/d0;->C0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v5, v10, v8}, Lr9/d0;->D0(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 189
    .line 190
    .line 191
    invoke-static {v2, v10, v4}, Lr9/d0;->D0(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v10, p1}, Lr9/d0;->B0(Ljava/lang/Object;Landroid/app/Activity;)V

    .line 195
    .line 196
    .line 197
    invoke-static {p2, v10}, Lr9/d0;->b(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    invoke-static {p2}, Lr9/d0;->a(Ljava/lang/Object;)I

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    move p1, v4

    .line 206
    :goto_4
    if-lt p1, v9, :cond_b

    .line 207
    .line 208
    move-object p1, v1

    .line 209
    goto :goto_5

    .line 210
    :cond_b
    invoke-static {p1, p2}, Lr9/d0;->c(ILjava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v10, :cond_15

    .line 215
    .line 216
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    :goto_5
    if-eqz p1, :cond_14

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    invoke-static {p2}, Lr9/d0;->a(Ljava/lang/Object;)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    sub-int/2addr v0, v8

    .line 231
    if-gez v0, :cond_c

    .line 232
    .line 233
    move v0, v4

    .line 234
    :cond_c
    invoke-static {v7, v4, v0}, Lr9/e0;->r(III)I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-ne p1, v0, :cond_d

    .line 239
    .line 240
    goto/16 :goto_9

    .line 241
    .line 242
    :cond_d
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {p1}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_e

    .line 255
    .line 256
    goto/16 :goto_9

    .line 257
    .line 258
    :cond_e
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    :cond_f
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_14

    .line 267
    .line 268
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, Ljava/lang/reflect/Method;

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    array-length v2, v2

    .line 279
    if-ne v2, v8, :cond_f

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    aget-object v2, v2, v4

    .line 286
    .line 287
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-eqz v2, :cond_f

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 302
    .line 303
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-nez v2, :cond_10

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    const-class v3, Ljava/lang/Boolean;

    .line 314
    .line 315
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-nez v2, :cond_10

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_10
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-static {v0, p2, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eqz v0, :cond_f

    .line 337
    .line 338
    invoke-static {p2}, Lr9/d0;->a(Ljava/lang/Object;)I

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    move v2, v4

    .line 343
    :goto_7
    if-lt v2, v0, :cond_11

    .line 344
    .line 345
    move-object v0, v1

    .line 346
    goto :goto_8

    .line 347
    :cond_11
    invoke-static {v2, p2}, Lr9/d0;->c(ILjava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    if-ne v3, v10, :cond_13

    .line 352
    .line 353
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    :goto_8
    if-nez v0, :cond_f

    .line 358
    .line 359
    invoke-static {p2}, Lr9/d0;->a(Ljava/lang/Object;)I

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    if-gez p1, :cond_12

    .line 364
    .line 365
    move p1, v4

    .line 366
    :cond_12
    invoke-static {v7, v4, p1}, Lr9/e0;->r(III)I

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    invoke-static {p2, p1, v10}, Lr9/d0;->d(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    return v8

    .line 374
    :cond_13
    add-int/lit8 v2, v2, 0x1

    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_14
    :goto_9
    return v8

    .line 378
    :cond_15
    add-int/lit8 p1, p1, 0x1

    .line 379
    .line 380
    goto/16 :goto_4

    .line 381
    .line 382
    :cond_16
    iget-boolean v7, p0, Lr9/d0;->F:Z

    .line 383
    .line 384
    if-eqz v7, :cond_17

    .line 385
    .line 386
    goto/16 :goto_13

    .line 387
    .line 388
    :cond_17
    iput-boolean v8, p0, Lr9/d0;->F:Z

    .line 389
    .line 390
    :try_start_0
    iget-object v7, p0, Lr9/d0;->a:Lr8/g;

    .line 391
    .line 392
    iget-object v7, v7, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 393
    .line 394
    invoke-static {v3, v7}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    if-eqz v7, :cond_25

    .line 399
    .line 400
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    move-result-object v9

    .line 404
    invoke-static {v7, v9}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v9

    .line 412
    invoke-static {v7, v9}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v7

    .line 416
    if-eqz v7, :cond_25

    .line 417
    .line 418
    invoke-static {v7}, Lr9/d0;->C0(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    invoke-static {v5, v7, v8}, Lr9/d0;->D0(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 422
    .line 423
    .line 424
    invoke-static {v2, v7, v4}, Lr9/d0;->D0(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {p0, v7, p1}, Lr9/d0;->B0(Ljava/lang/Object;Landroid/app/Activity;)V

    .line 428
    .line 429
    .line 430
    invoke-static {p2}, Lr9/d0;->a(Ljava/lang/Object;)I

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    move v9, v4

    .line 435
    :goto_a
    if-lt v9, v2, :cond_18

    .line 436
    .line 437
    move-object v10, v1

    .line 438
    goto :goto_b

    .line 439
    :cond_18
    invoke-static {v9, p2}, Lr9/d0;->c(ILjava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    if-eqz v10, :cond_24

    .line 444
    .line 445
    :goto_b
    if-nez v10, :cond_19

    .line 446
    .line 447
    goto :goto_d

    .line 448
    :cond_19
    const-string v2, "getLayoutResource"

    .line 449
    .line 450
    new-array v9, v4, [Ljava/lang/Object;

    .line 451
    .line 452
    invoke-static {v10, v2, v9}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    instance-of v9, v2, Ljava/lang/Number;

    .line 457
    .line 458
    if-eqz v9, :cond_1a

    .line 459
    .line 460
    check-cast v2, Ljava/lang/Number;

    .line 461
    .line 462
    goto :goto_c

    .line 463
    :cond_1a
    move-object v2, v1

    .line 464
    :goto_c
    if-eqz v2, :cond_1c

    .line 465
    .line 466
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 467
    .line 468
    .line 469
    move-result v9

    .line 470
    if-nez v9, :cond_1b

    .line 471
    .line 472
    goto :goto_d

    .line 473
    :cond_1b
    const-string v9, "setLayoutResource"

    .line 474
    .line 475
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    invoke-static {v7, v9, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    :cond_1c
    :goto_d
    invoke-static {p2, v1}, Lr9/d0;->b(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    move-result-object v9

    .line 498
    invoke-static {v9}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 499
    .line 500
    .line 501
    move-result-object v9

    .line 502
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 503
    .line 504
    .line 505
    move-result v10

    .line 506
    if-eqz v10, :cond_1e

    .line 507
    .line 508
    :cond_1d
    move v2, v4

    .line 509
    goto :goto_e

    .line 510
    :cond_1e
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 511
    .line 512
    .line 513
    move-result-object v9

    .line 514
    :cond_1f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 515
    .line 516
    .line 517
    move-result v10

    .line 518
    if-eqz v10, :cond_1d

    .line 519
    .line 520
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v10

    .line 524
    check-cast v10, Ljava/lang/reflect/Method;

    .line 525
    .line 526
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    move-result-object v11

    .line 530
    array-length v11, v11

    .line 531
    const/4 v12, 0x2

    .line 532
    if-ne v11, v12, :cond_1f

    .line 533
    .line 534
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    move-result-object v11

    .line 538
    aget-object v11, v11, v8

    .line 539
    .line 540
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 541
    .line 542
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v11

    .line 546
    if-eqz v11, :cond_1f

    .line 547
    .line 548
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    move-result-object v11

    .line 552
    aget-object v11, v11, v4

    .line 553
    .line 554
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    move-result-object v12

    .line 558
    invoke-virtual {v11, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 559
    .line 560
    .line 561
    move-result v11

    .line 562
    if-eqz v11, :cond_1f

    .line 563
    .line 564
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object v11

    .line 568
    filled-new-array {v7, v11}, [Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v11

    .line 572
    invoke-static {v10, p2, v11}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 576
    if-eqz v10, :cond_1f

    .line 577
    .line 578
    move v2, v8

    .line 579
    goto :goto_e

    .line 580
    :catchall_0
    move-exception p1

    .line 581
    goto :goto_11

    .line 582
    :goto_e
    iput-boolean v4, p0, Lr9/d0;->F:Z

    .line 583
    .line 584
    if-nez v2, :cond_20

    .line 585
    .line 586
    goto :goto_13

    .line 587
    :cond_20
    const-string p1, "notifyDataSetChanged"

    .line 588
    .line 589
    iput-boolean v8, p0, Lr9/d0;->F:Z

    .line 590
    .line 591
    :try_start_1
    new-array v0, v4, [Ljava/lang/Object;

    .line 592
    .line 593
    invoke-static {p2, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-static {v0}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    :cond_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    if-eqz v2, :cond_22

    .line 613
    .line 614
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    move-object v3, v2

    .line 619
    check-cast v3, Ljava/lang/reflect/Method;

    .line 620
    .line 621
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v5

    .line 625
    invoke-static {v5, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v5

    .line 629
    if-eqz v5, :cond_21

    .line 630
    .line 631
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    array-length v3, v3

    .line 639
    if-nez v3, :cond_21

    .line 640
    .line 641
    move-object v1, v2

    .line 642
    goto :goto_f

    .line 643
    :catchall_1
    move-exception p1

    .line 644
    goto :goto_10

    .line 645
    :cond_22
    :goto_f
    check-cast v1, Ljava/lang/reflect/Method;

    .line 646
    .line 647
    if-eqz v1, :cond_23

    .line 648
    .line 649
    new-array p1, v4, [Ljava/lang/Object;

    .line 650
    .line 651
    invoke-static {v1, p2, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 652
    .line 653
    .line 654
    :cond_23
    iput-boolean v4, p0, Lr9/d0;->F:Z

    .line 655
    .line 656
    return v8

    .line 657
    :goto_10
    iput-boolean v4, p0, Lr9/d0;->F:Z

    .line 658
    .line 659
    throw p1

    .line 660
    :cond_24
    add-int/lit8 v9, v9, 0x1

    .line 661
    .line 662
    goto/16 :goto_a

    .line 663
    .line 664
    :cond_25
    iput-boolean v4, p0, Lr9/d0;->F:Z

    .line 665
    .line 666
    goto :goto_13

    .line 667
    :goto_11
    iput-boolean v4, p0, Lr9/d0;->F:Z

    .line 668
    .line 669
    throw p1

    .line 670
    :cond_26
    :goto_12
    add-int/lit8 v9, v9, 0x1

    .line 671
    .line 672
    goto/16 :goto_2

    .line 673
    .line 674
    :cond_27
    :goto_13
    const-string p2, "getPreferenceScreen"

    .line 675
    .line 676
    new-array v2, v4, [Ljava/lang/Object;

    .line 677
    .line 678
    invoke-static {p1, p2, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object p2

    .line 682
    if-eqz p2, :cond_32

    .line 683
    .line 684
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    invoke-static {v2}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    :cond_28
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 697
    .line 698
    .line 699
    move-result v7

    .line 700
    if-eqz v7, :cond_2a

    .line 701
    .line 702
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v7

    .line 706
    check-cast v7, Ljava/lang/reflect/Method;

    .line 707
    .line 708
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    move-result-object v9

    .line 712
    array-length v9, v9

    .line 713
    if-ne v9, v8, :cond_29

    .line 714
    .line 715
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    move-result-object v9

    .line 719
    aget-object v9, v9, v4

    .line 720
    .line 721
    const-class v10, Ljava/lang/String;

    .line 722
    .line 723
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v9

    .line 727
    if-eqz v9, :cond_29

    .line 728
    .line 729
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    move-result-object v9

    .line 733
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v9

    .line 737
    const-string v10, "Preference"

    .line 738
    .line 739
    invoke-static {v9, v10, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 740
    .line 741
    .line 742
    move-result v9

    .line 743
    if-eqz v9, :cond_29

    .line 744
    .line 745
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v9

    .line 749
    invoke-static {v7, p2, v9}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v7

    .line 753
    if-eqz v7, :cond_29

    .line 754
    .line 755
    invoke-static {v7}, Lr9/d0;->j0(Ljava/lang/Object;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v9

    .line 759
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    move-result v9

    .line 763
    if-eqz v9, :cond_29

    .line 764
    .line 765
    goto :goto_14

    .line 766
    :cond_29
    move-object v7, v1

    .line 767
    :goto_14
    if-eqz v7, :cond_28

    .line 768
    .line 769
    move-object v1, v7

    .line 770
    :cond_2a
    if-eqz v1, :cond_2b

    .line 771
    .line 772
    invoke-virtual {p0, v1, p1}, Lr9/d0;->B0(Ljava/lang/Object;Landroid/app/Activity;)V

    .line 773
    .line 774
    .line 775
    invoke-static {p2}, Lr9/d0;->d0(Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    return v8

    .line 779
    :cond_2b
    iget-object v1, p0, Lr9/d0;->a:Lr8/g;

    .line 780
    .line 781
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 782
    .line 783
    invoke-static {v3, v1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    if-eqz v1, :cond_32

    .line 788
    .line 789
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    invoke-static {v0, v1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    if-eqz v0, :cond_32

    .line 806
    .line 807
    invoke-static {v0}, Lr9/d0;->C0(Ljava/lang/Object;)V

    .line 808
    .line 809
    .line 810
    invoke-static {v5, v0, v8}, Lr9/d0;->D0(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {p0, v0, p1}, Lr9/d0;->B0(Ljava/lang/Object;Landroid/app/Activity;)V

    .line 814
    .line 815
    .line 816
    invoke-static {p2}, Lr9/d0;->a(Ljava/lang/Object;)I

    .line 817
    .line 818
    .line 819
    move-result p1

    .line 820
    move v1, v4

    .line 821
    :goto_15
    if-lt v1, p1, :cond_2f

    .line 822
    .line 823
    move v1, v4

    .line 824
    :goto_16
    if-lt v1, p1, :cond_2d

    .line 825
    .line 826
    if-gez p1, :cond_2c

    .line 827
    .line 828
    goto :goto_17

    .line 829
    :cond_2c
    move v4, p1

    .line 830
    goto :goto_17

    .line 831
    :cond_2d
    invoke-static {v1, p2}, Lr9/d0;->c(ILjava/lang/Object;)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v2

    .line 835
    invoke-static {v2}, Lr9/d0;->j0(Ljava/lang/Object;)Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v3

    .line 839
    invoke-static {v2, v3}, Lr9/d0;->L(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 840
    .line 841
    .line 842
    move-result v2

    .line 843
    if-eqz v2, :cond_2e

    .line 844
    .line 845
    move v4, v1

    .line 846
    goto :goto_17

    .line 847
    :cond_2e
    add-int/lit8 v1, v1, 0x1

    .line 848
    .line 849
    goto :goto_16

    .line 850
    :cond_2f
    invoke-static {v1, p2}, Lr9/d0;->c(ILjava/lang/Object;)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    invoke-static {v2}, Lr9/d0;->M(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result v2

    .line 858
    if-eqz v2, :cond_31

    .line 859
    .line 860
    add-int/lit8 v4, v1, 0x1

    .line 861
    .line 862
    :goto_17
    invoke-static {p2, v4, v0}, Lr9/d0;->d(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-result p1

    .line 866
    if-eqz p1, :cond_30

    .line 867
    .line 868
    invoke-static {p2}, Lr9/d0;->d0(Ljava/lang/Object;)V

    .line 869
    .line 870
    .line 871
    :cond_30
    return p1

    .line 872
    :cond_31
    add-int/lit8 v1, v1, 0x1

    .line 873
    .line 874
    goto :goto_15

    .line 875
    :cond_32
    :goto_18
    return v4
.end method

.method public final E(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Object;Ljava/lang/Object;Lr9/f0;)Z
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v11, p2

    .line 6
    .line 7
    move-object/from16 v12, p4

    .line 8
    .line 9
    move-object/from16 v13, p5

    .line 10
    .line 11
    move-object/from16 v5, p6

    .line 12
    .line 13
    iget-object v9, v1, Lr9/d0;->B:Lr9/z;

    .line 14
    .line 15
    iget-object v10, v9, Lr9/z;->b:Ljava/lang/String;

    .line 16
    .line 17
    iget-boolean v0, v5, Lr9/f0;->l:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, v1, Lr9/d0;->C:Z

    .line 22
    .line 23
    :goto_0
    move v14, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-boolean v0, v1, Lr9/d0;->D:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    const/4 v15, 0x1

    .line 29
    const/4 v0, 0x0

    .line 30
    if-eqz v14, :cond_1

    .line 31
    .line 32
    const-string v2, "avatar_below"

    .line 33
    .line 34
    invoke-virtual {v10, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    move v2, v15

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    move v2, v0

    .line 43
    :goto_2
    const/4 v3, 0x0

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    move-object v15, v3

    .line 47
    goto/16 :goto_10

    .line 48
    .line 49
    :cond_2
    invoke-virtual {v1, v12}, Lr9/d0;->o(Ljava/lang/Object;)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    invoke-static {v4, v8}, Lr9/d0;->P(Landroid/view/View;Landroid/view/View;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    move-object v4, v3

    .line 63
    :goto_3
    if-eqz v4, :cond_6

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    const-string v7, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView"

    .line 74
    .line 75
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    if-nez v14, :cond_4

    .line 82
    .line 83
    invoke-static {v4}, Lr9/d0;->Q(Landroid/view/View;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_5

    .line 88
    .line 89
    :cond_4
    move-object v6, v4

    .line 90
    goto :goto_4

    .line 91
    :cond_5
    move-object v6, v3

    .line 92
    :goto_4
    if-eqz v6, :cond_6

    .line 93
    .line 94
    :goto_5
    move-object v4, v6

    .line 95
    goto :goto_7

    .line 96
    :cond_6
    invoke-static {v8, v15}, Lr9/d0;->n(Landroid/view/View;Z)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    if-eqz v6, :cond_7

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_7
    invoke-static {v8, v0}, Lr9/d0;->n(Landroid/view/View;Z)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    :goto_6
    if-eqz v6, :cond_8

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_8
    if-eqz v4, :cond_11

    .line 111
    .line 112
    :goto_7
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    instance-of v7, v6, Landroid/view/View;

    .line 117
    .line 118
    if-eqz v7, :cond_9

    .line 119
    .line 120
    check-cast v6, Landroid/view/View;

    .line 121
    .line 122
    goto :goto_8

    .line 123
    :cond_9
    move-object v6, v3

    .line 124
    :goto_8
    move-object/from16 v16, v3

    .line 125
    .line 126
    move-object/from16 v17, v16

    .line 127
    .line 128
    move-object v7, v4

    .line 129
    :goto_9
    if-eq v7, v8, :cond_11

    .line 130
    .line 131
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    instance-of v0, v7, Landroid/view/ViewGroup;

    .line 136
    .line 137
    if-eqz v0, :cond_a

    .line 138
    .line 139
    check-cast v7, Landroid/view/ViewGroup;

    .line 140
    .line 141
    goto :goto_a

    .line 142
    :cond_a
    move-object v7, v3

    .line 143
    :goto_a
    if-eqz v7, :cond_11

    .line 144
    .line 145
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const-string v15, "com.tencent.mm.ui.base.MaskLayout"

    .line 154
    .line 155
    invoke-virtual {v0, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_b

    .line 160
    .line 161
    move-object/from16 v17, v7

    .line 162
    .line 163
    :cond_b
    instance-of v0, v7, Landroid/widget/RelativeLayout;

    .line 164
    .line 165
    if-eqz v0, :cond_c

    .line 166
    .line 167
    move-object/from16 v16, v7

    .line 168
    .line 169
    check-cast v16, Landroid/widget/RelativeLayout;

    .line 170
    .line 171
    :cond_c
    move-object/from16 v0, v16

    .line 172
    .line 173
    if-ne v7, v8, :cond_12

    .line 174
    .line 175
    if-eqz v0, :cond_11

    .line 176
    .line 177
    if-nez v14, :cond_e

    .line 178
    .line 179
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-nez v7, :cond_e

    .line 184
    .line 185
    if-eqz v17, :cond_d

    .line 186
    .line 187
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    if-eqz v7, :cond_d

    .line 192
    .line 193
    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 194
    .line 195
    if-nez v7, :cond_d

    .line 196
    .line 197
    goto :goto_b

    .line 198
    :cond_d
    const/4 v7, 0x0

    .line 199
    goto :goto_c

    .line 200
    :cond_e
    :goto_b
    const/4 v7, 0x1

    .line 201
    :goto_c
    if-eqz v7, :cond_10

    .line 202
    .line 203
    if-eqz v17, :cond_f

    .line 204
    .line 205
    move-object/from16 v4, v17

    .line 206
    .line 207
    goto :goto_d

    .line 208
    :cond_f
    if-eqz v6, :cond_10

    .line 209
    .line 210
    move-object v4, v6

    .line 211
    :cond_10
    :goto_d
    new-instance v6, Lr9/q;

    .line 212
    .line 213
    invoke-direct {v6, v0, v4, v7}, Lr9/q;-><init>(Landroid/widget/RelativeLayout;Landroid/view/View;Z)V

    .line 214
    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_11
    :goto_e
    move-object v6, v3

    .line 218
    goto :goto_f

    .line 219
    :cond_12
    invoke-static {v7}, Lr9/d0;->O(Landroid/view/ViewGroup;)Z

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    if-eqz v15, :cond_13

    .line 224
    .line 225
    goto :goto_e

    .line 226
    :cond_13
    move-object/from16 v16, v0

    .line 227
    .line 228
    const/4 v0, 0x0

    .line 229
    const/4 v15, 0x1

    .line 230
    goto :goto_9

    .line 231
    :goto_f
    move-object v15, v6

    .line 232
    :goto_10
    const-string v0, "message_bottom"

    .line 233
    .line 234
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-nez v0, :cond_15

    .line 239
    .line 240
    if-eqz v2, :cond_14

    .line 241
    .line 242
    goto :goto_11

    .line 243
    :cond_14
    move-object v0, v15

    .line 244
    goto :goto_12

    .line 245
    :cond_15
    :goto_11
    move-object v0, v3

    .line 246
    :goto_12
    if-nez v0, :cond_16

    .line 247
    .line 248
    invoke-virtual {v1, v8, v3}, Lr9/d0;->y0(Landroid/view/View;Landroid/widget/RelativeLayout;)V

    .line 249
    .line 250
    .line 251
    :cond_16
    if-nez v0, :cond_1c

    .line 252
    .line 253
    if-eqz v11, :cond_1b

    .line 254
    .line 255
    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    instance-of v4, v2, Landroid/view/ViewGroup;

    .line 260
    .line 261
    if-eqz v4, :cond_17

    .line 262
    .line 263
    check-cast v2, Landroid/view/ViewGroup;

    .line 264
    .line 265
    goto :goto_13

    .line 266
    :cond_17
    move-object v2, v3

    .line 267
    :goto_13
    if-eqz v2, :cond_18

    .line 268
    .line 269
    instance-of v4, v2, Landroid/widget/RelativeLayout;

    .line 270
    .line 271
    if-nez v4, :cond_19

    .line 272
    .line 273
    instance-of v4, v2, Landroid/widget/LinearLayout;

    .line 274
    .line 275
    if-nez v4, :cond_19

    .line 276
    .line 277
    :cond_18
    move-object v7, v3

    .line 278
    goto :goto_14

    .line 279
    :cond_19
    invoke-virtual {v1, v12, v2}, Lr9/d0;->A(Ljava/lang/Object;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    if-eqz v4, :cond_1a

    .line 284
    .line 285
    invoke-static {v4, v2}, Lr9/d0;->k(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    if-eqz v6, :cond_1a

    .line 290
    .line 291
    new-instance v7, Lr9/u;

    .line 292
    .line 293
    invoke-direct {v7, v2, v6, v4}, Lr9/u;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    .line 294
    .line 295
    .line 296
    goto :goto_14

    .line 297
    :cond_1a
    invoke-virtual {v1, v12, v2, v11}, Lr9/d0;->W(Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/widget/TextView;)Landroid/view/View;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    if-eqz v4, :cond_18

    .line 302
    .line 303
    invoke-static {v4, v2}, Lr9/d0;->k(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    if-eqz v6, :cond_18

    .line 308
    .line 309
    new-instance v7, Lr9/u;

    .line 310
    .line 311
    invoke-direct {v7, v2, v6, v4}, Lr9/u;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    .line 312
    .line 313
    .line 314
    :goto_14
    move-object v2, v7

    .line 315
    goto :goto_16

    .line 316
    :cond_1b
    :goto_15
    const/16 v18, 0x0

    .line 317
    .line 318
    goto/16 :goto_68

    .line 319
    .line 320
    :cond_1c
    move-object v2, v3

    .line 321
    :goto_16
    if-eqz v0, :cond_1f

    .line 322
    .line 323
    iget-boolean v4, v0, Lr9/q;->c:Z

    .line 324
    .line 325
    if-eqz v4, :cond_1d

    .line 326
    .line 327
    move-object v4, v0

    .line 328
    goto :goto_17

    .line 329
    :cond_1d
    move-object v4, v3

    .line 330
    :goto_17
    if-eqz v4, :cond_1f

    .line 331
    .line 332
    iget-object v4, v4, Lr9/q;->a:Landroid/widget/RelativeLayout;

    .line 333
    .line 334
    invoke-virtual {v1, v12, v4}, Lr9/d0;->A(Ljava/lang/Object;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    if-eqz v6, :cond_1e

    .line 339
    .line 340
    goto :goto_18

    .line 341
    :cond_1e
    invoke-virtual {v1, v12, v4, v3}, Lr9/d0;->W(Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/widget/TextView;)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    :goto_18
    move-object/from16 v16, v6

    .line 346
    .line 347
    goto :goto_19

    .line 348
    :cond_1f
    move-object/from16 v16, v3

    .line 349
    .line 350
    :goto_19
    if-eqz v0, :cond_20

    .line 351
    .line 352
    iget-object v4, v0, Lr9/q;->a:Landroid/widget/RelativeLayout;

    .line 353
    .line 354
    goto :goto_1a

    .line 355
    :cond_20
    if-eqz v2, :cond_1b

    .line 356
    .line 357
    iget-object v4, v2, Lr9/u;->a:Landroid/view/ViewGroup;

    .line 358
    .line 359
    :goto_1a
    instance-of v6, v4, Landroid/widget/RelativeLayout;

    .line 360
    .line 361
    if-nez v6, :cond_21

    .line 362
    .line 363
    instance-of v7, v4, Landroid/widget/LinearLayout;

    .line 364
    .line 365
    if-nez v7, :cond_21

    .line 366
    .line 367
    goto :goto_15

    .line 368
    :cond_21
    if-eqz p3, :cond_23

    .line 369
    .line 370
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    const-string v3, "hchat_message_details_view"

    .line 375
    .line 376
    invoke-static {v7, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    if-eqz v3, :cond_22

    .line 381
    .line 382
    move-object/from16 v3, p3

    .line 383
    .line 384
    goto :goto_1b

    .line 385
    :cond_22
    const/4 v3, 0x0

    .line 386
    :goto_1b
    if-eqz v3, :cond_23

    .line 387
    .line 388
    move-object/from16 v20, v0

    .line 389
    .line 390
    move-object/from16 v21, v2

    .line 391
    .line 392
    :goto_1c
    move-object v0, v3

    .line 393
    goto :goto_20

    .line 394
    :cond_23
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    const/4 v7, 0x0

    .line 399
    :goto_1d
    if-lt v7, v3, :cond_24

    .line 400
    .line 401
    move-object/from16 v20, v0

    .line 402
    .line 403
    move-object/from16 v21, v2

    .line 404
    .line 405
    const/4 v3, 0x0

    .line 406
    goto :goto_1e

    .line 407
    :cond_24
    move-object/from16 v20, v0

    .line 408
    .line 409
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    move-object/from16 v21, v2

    .line 414
    .line 415
    instance-of v2, v0, Landroid/widget/TextView;

    .line 416
    .line 417
    if-eqz v2, :cond_8d

    .line 418
    .line 419
    check-cast v0, Landroid/widget/TextView;

    .line 420
    .line 421
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    move-object/from16 p3, v0

    .line 426
    .line 427
    const-string v0, "hchat_message_details_view"

    .line 428
    .line 429
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-eqz v0, :cond_8d

    .line 434
    .line 435
    move-object/from16 v3, p3

    .line 436
    .line 437
    :goto_1e
    if-eqz v3, :cond_25

    .line 438
    .line 439
    goto :goto_1c

    .line 440
    :cond_25
    new-instance v3, Landroid/widget/TextView;

    .line 441
    .line 442
    if-eqz v11, :cond_26

    .line 443
    .line 444
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    if-eqz v0, :cond_26

    .line 449
    .line 450
    goto :goto_1f

    .line 451
    :cond_26
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    :goto_1f
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 456
    .line 457
    .line 458
    const-string v0, "hchat_message_details_view"

    .line 459
    .line 460
    invoke-virtual {v3, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    goto :goto_1c

    .line 464
    :goto_20
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    if-eq v2, v4, :cond_28

    .line 469
    .line 470
    invoke-virtual {v1, v8, v0}, Lr9/d0;->u0(Landroid/view/View;Landroid/widget/TextView;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 478
    .line 479
    if-eqz v3, :cond_27

    .line 480
    .line 481
    check-cast v2, Landroid/view/ViewGroup;

    .line 482
    .line 483
    goto :goto_21

    .line 484
    :cond_27
    const/4 v2, 0x0

    .line 485
    :goto_21
    if-eqz v2, :cond_28

    .line 486
    .line 487
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 488
    .line 489
    .line 490
    :cond_28
    iget-object v2, v1, Lr9/d0;->u:Ljava/util/Set;

    .line 491
    .line 492
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    monitor-enter v2

    .line 496
    :try_start_0
    iget-object v3, v1, Lr9/d0;->u:Ljava/util/Set;

    .line 497
    .line 498
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 499
    .line 500
    .line 501
    monitor-exit v2

    .line 502
    iget-object v7, v1, Lr9/d0;->B:Lr9/z;

    .line 503
    .line 504
    iget-wide v2, v5, Lr9/f0;->k:J

    .line 505
    .line 506
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 507
    .line 508
    .line 509
    move-result-object v22

    .line 510
    const-wide/16 v23, 0x0

    .line 511
    .line 512
    cmp-long v2, v2, v23

    .line 513
    .line 514
    if-lez v2, :cond_29

    .line 515
    .line 516
    goto :goto_22

    .line 517
    :cond_29
    const/16 v22, 0x0

    .line 518
    .line 519
    :goto_22
    if-eqz v22, :cond_2a

    .line 520
    .line 521
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Long;->longValue()J

    .line 522
    .line 523
    .line 524
    move-result-wide v2

    .line 525
    :goto_23
    move/from16 v22, v6

    .line 526
    .line 527
    goto :goto_24

    .line 528
    :cond_2a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 529
    .line 530
    .line 531
    move-result-wide v2

    .line 532
    goto :goto_23

    .line 533
    :goto_24
    new-instance v6, Lgg/u;

    .line 534
    .line 535
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 536
    .line 537
    .line 538
    move-object/from16 v23, v4

    .line 539
    .line 540
    new-instance v4, Lgg/u;

    .line 541
    .line 542
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 543
    .line 544
    .line 545
    move-object/from16 p3, v0

    .line 546
    .line 547
    iget-object v0, v7, Lr9/z;->c:Ljava/lang/String;

    .line 548
    .line 549
    const-string v1, "${time}"

    .line 550
    .line 551
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    if-eqz v0, :cond_2c

    .line 556
    .line 557
    iget-object v0, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v0, Ljava/lang/String;

    .line 560
    .line 561
    if-eqz v0, :cond_2b

    .line 562
    .line 563
    goto :goto_25

    .line 564
    :cond_2b
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    iget-object v1, v7, Lr9/z;->e:Ljava/time/format/DateTimeFormatter;

    .line 577
    .line 578
    invoke-virtual {v0, v1}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    iput-object v0, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 583
    .line 584
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    :goto_25
    move-object/from16 v1, p0

    .line 588
    .line 589
    move-object v2, v0

    .line 590
    move-object v0, v5

    .line 591
    move-object/from16 v25, v20

    .line 592
    .line 593
    move-object/from16 v26, v21

    .line 594
    .line 595
    move-object/from16 v27, v23

    .line 596
    .line 597
    goto :goto_26

    .line 598
    :cond_2c
    iget-object v0, v7, Lr9/z;->c:Ljava/lang/String;

    .line 599
    .line 600
    move-object v1, v0

    .line 601
    new-instance v0, Lr9/k;

    .line 602
    .line 603
    move-object v11, v1

    .line 604
    move-object/from16 v25, v20

    .line 605
    .line 606
    move-object/from16 v26, v21

    .line 607
    .line 608
    move-object/from16 v27, v23

    .line 609
    .line 610
    move-object/from16 v1, p0

    .line 611
    .line 612
    invoke-direct/range {v0 .. v7}, Lr9/k;-><init>(Lr9/d0;JLgg/u;Lr9/f0;Lgg/u;Lr9/z;)V

    .line 613
    .line 614
    .line 615
    move-object v2, v0

    .line 616
    move-object v0, v5

    .line 617
    sget-object v3, Lr9/d0;->G:Log/k;

    .line 618
    .line 619
    new-instance v4, Lnb/a;

    .line 620
    .line 621
    const/4 v5, 0x4

    .line 622
    invoke-direct {v4, v2, v5}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v3, v11, v4}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    :goto_26
    invoke-virtual/range {p3 .. p3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    invoke-static {v3, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 634
    .line 635
    .line 636
    move-result v3

    .line 637
    if-nez v3, :cond_2d

    .line 638
    .line 639
    move-object/from16 v3, p3

    .line 640
    .line 641
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 642
    .line 643
    .line 644
    goto :goto_27

    .line 645
    :cond_2d
    move-object/from16 v3, p3

    .line 646
    .line 647
    :goto_27
    invoke-virtual {v1, v3}, Lr9/d0;->e(Landroid/widget/TextView;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    const/high16 v4, 0x3f800000    # 1.0f

    .line 655
    .line 656
    cmpg-float v2, v2, v4

    .line 657
    .line 658
    if-nez v2, :cond_2e

    .line 659
    .line 660
    goto :goto_28

    .line 661
    :cond_2e
    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    .line 662
    .line 663
    .line 664
    :goto_28
    invoke-virtual {v3}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    if-nez v2, :cond_2f

    .line 669
    .line 670
    const/4 v2, 0x1

    .line 671
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 672
    .line 673
    .line 674
    :cond_2f
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    const/high16 v4, 0x40800000    # 4.0f

    .line 682
    .line 683
    invoke-static {v2, v4}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 684
    .line 685
    .line 686
    move-result v2

    .line 687
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    const/high16 v5, 0x40000000    # 2.0f

    .line 695
    .line 696
    invoke-static {v4, v5}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 697
    .line 698
    .line 699
    move-result v4

    .line 700
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 701
    .line 702
    .line 703
    move-result v6

    .line 704
    if-ne v6, v2, :cond_30

    .line 705
    .line 706
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 707
    .line 708
    .line 709
    move-result v6

    .line 710
    if-ne v6, v4, :cond_30

    .line 711
    .line 712
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 713
    .line 714
    .line 715
    move-result v6

    .line 716
    if-ne v6, v2, :cond_30

    .line 717
    .line 718
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 719
    .line 720
    .line 721
    move-result v6

    .line 722
    if-eq v6, v4, :cond_31

    .line 723
    .line 724
    :cond_30
    invoke-virtual {v3, v2, v4, v2, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 725
    .line 726
    .line 727
    :cond_31
    iget-object v2, v1, Lr9/d0;->B:Lr9/z;

    .line 728
    .line 729
    iget v2, v2, Lr9/z;->f:F

    .line 730
    .line 731
    invoke-virtual {v3}, Landroid/widget/TextView;->getTextSize()F

    .line 732
    .line 733
    .line 734
    move-result v4

    .line 735
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 736
    .line 737
    .line 738
    move-result-object v6

    .line 739
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 740
    .line 741
    .line 742
    move-result-object v6

    .line 743
    iget v6, v6, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 744
    .line 745
    div-float/2addr v4, v6

    .line 746
    sub-float/2addr v4, v2

    .line 747
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 748
    .line 749
    .line 750
    move-result v4

    .line 751
    const v6, 0x3c23d70a    # 0.01f

    .line 752
    .line 753
    .line 754
    cmpl-float v4, v4, v6

    .line 755
    .line 756
    const/4 v6, 0x2

    .line 757
    if-lez v4, :cond_32

    .line 758
    .line 759
    invoke-virtual {v3, v6, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 760
    .line 761
    .line 762
    :cond_32
    iget-object v2, v1, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 763
    .line 764
    monitor-enter v2

    .line 765
    :try_start_1
    iget-object v4, v1, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 766
    .line 767
    invoke-virtual {v4, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    check-cast v4, Lr9/y;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 772
    .line 773
    monitor-exit v2

    .line 774
    iget-boolean v2, v9, Lr9/z;->j:Z

    .line 775
    .line 776
    if-eqz v2, :cond_35

    .line 777
    .line 778
    invoke-virtual {v3}, Landroid/view/View;->isClickable()Z

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    if-eqz v2, :cond_34

    .line 783
    .line 784
    if-eqz v4, :cond_33

    .line 785
    .line 786
    iget-object v2, v4, Lr9/y;->d:Ljava/lang/Object;

    .line 787
    .line 788
    goto :goto_29

    .line 789
    :cond_33
    const/4 v2, 0x0

    .line 790
    :goto_29
    if-ne v2, v13, :cond_34

    .line 791
    .line 792
    :goto_2a
    const/4 v2, 0x1

    .line 793
    goto :goto_2b

    .line 794
    :cond_34
    new-instance v2, Lk9/l;

    .line 795
    .line 796
    const/4 v4, 0x1

    .line 797
    invoke-direct {v2, v13, v0, v1, v4}, Lk9/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 801
    .line 802
    .line 803
    goto :goto_2a

    .line 804
    :goto_2b
    invoke-virtual {v3, v2}, Landroid/view/View;->setClickable(Z)V

    .line 805
    .line 806
    .line 807
    goto :goto_2c

    .line 808
    :cond_35
    invoke-virtual {v3}, Landroid/view/View;->isClickable()Z

    .line 809
    .line 810
    .line 811
    move-result v2

    .line 812
    if-eqz v2, :cond_36

    .line 813
    .line 814
    const/4 v2, 0x0

    .line 815
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 816
    .line 817
    .line 818
    const/4 v2, 0x0

    .line 819
    invoke-virtual {v3, v2}, Landroid/view/View;->setClickable(Z)V

    .line 820
    .line 821
    .line 822
    :cond_36
    :goto_2c
    const v2, 0x7fffffff

    .line 823
    .line 824
    .line 825
    const/4 v9, -0x2

    .line 826
    move-object/from16 v11, v25

    .line 827
    .line 828
    if-eqz v11, :cond_59

    .line 829
    .line 830
    iget-boolean v5, v0, Lr9/f0;->l:Z

    .line 831
    .line 832
    iget-object v14, v11, Lr9/q;->a:Landroid/widget/RelativeLayout;

    .line 833
    .line 834
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 835
    .line 836
    .line 837
    move-result-object v6

    .line 838
    instance-of v15, v6, Landroid/view/ViewGroup;

    .line 839
    .line 840
    if-eqz v15, :cond_37

    .line 841
    .line 842
    check-cast v6, Landroid/view/ViewGroup;

    .line 843
    .line 844
    goto :goto_2d

    .line 845
    :cond_37
    const/4 v6, 0x0

    .line 846
    :goto_2d
    if-ne v6, v14, :cond_38

    .line 847
    .line 848
    const/4 v15, 0x1

    .line 849
    goto :goto_2e

    .line 850
    :cond_38
    const/4 v15, 0x0

    .line 851
    :goto_2e
    if-eqz v6, :cond_39

    .line 852
    .line 853
    if-nez v15, :cond_39

    .line 854
    .line 855
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 856
    .line 857
    .line 858
    :cond_39
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 859
    .line 860
    .line 861
    move-result-object v6

    .line 862
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    iget-object v7, v1, Lr9/d0;->B:Lr9/z;

    .line 866
    .line 867
    iget v7, v7, Lr9/z;->g:I

    .line 868
    .line 869
    int-to-float v7, v7

    .line 870
    invoke-static {v6, v7}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 871
    .line 872
    .line 873
    move-result v7

    .line 874
    if-eqz v15, :cond_3a

    .line 875
    .line 876
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 877
    .line 878
    .line 879
    move-result-object v6

    .line 880
    const/16 v20, 0x0

    .line 881
    .line 882
    instance-of v4, v6, Landroid/widget/RelativeLayout$LayoutParams;

    .line 883
    .line 884
    if-eqz v4, :cond_3b

    .line 885
    .line 886
    move-object v4, v6

    .line 887
    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 888
    .line 889
    goto :goto_2f

    .line 890
    :cond_3a
    const/16 v20, 0x0

    .line 891
    .line 892
    :cond_3b
    const/4 v4, 0x0

    .line 893
    :goto_2f
    if-eqz v4, :cond_3c

    .line 894
    .line 895
    goto :goto_30

    .line 896
    :cond_3c
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 897
    .line 898
    invoke-direct {v4, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 899
    .line 900
    .line 901
    :goto_30
    invoke-virtual {v3}, Landroid/widget/TextView;->getMaxLines()I

    .line 902
    .line 903
    .line 904
    move-result v6

    .line 905
    const/4 v9, 0x1

    .line 906
    if-eq v6, v9, :cond_3d

    .line 907
    .line 908
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 912
    .line 913
    .line 914
    const/4 v6, 0x0

    .line 915
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    .line 916
    .line 917
    .line 918
    goto :goto_31

    .line 919
    :cond_3d
    const/4 v6, 0x0

    .line 920
    :goto_31
    invoke-virtual {v3}, Landroid/widget/TextView;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    .line 921
    .line 922
    .line 923
    move-result-object v9

    .line 924
    if-eqz v9, :cond_3e

    .line 925
    .line 926
    const/4 v9, 0x0

    .line 927
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 928
    .line 929
    .line 930
    :cond_3e
    invoke-virtual {v3}, Landroid/widget/TextView;->getMinWidth()I

    .line 931
    .line 932
    .line 933
    move-result v9

    .line 934
    if-eqz v9, :cond_3f

    .line 935
    .line 936
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 937
    .line 938
    .line 939
    :cond_3f
    invoke-virtual {v3}, Landroid/widget/TextView;->getMaxWidth()I

    .line 940
    .line 941
    .line 942
    move-result v6

    .line 943
    if-eq v6, v2, :cond_40

    .line 944
    .line 945
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 946
    .line 947
    .line 948
    :cond_40
    invoke-virtual {v3}, Landroid/view/View;->getTranslationX()F

    .line 949
    .line 950
    .line 951
    move-result v2

    .line 952
    cmpg-float v2, v2, v20

    .line 953
    .line 954
    if-nez v2, :cond_41

    .line 955
    .line 956
    move/from16 v2, v20

    .line 957
    .line 958
    goto :goto_32

    .line 959
    :cond_41
    move/from16 v2, v20

    .line 960
    .line 961
    invoke-virtual {v3, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 962
    .line 963
    .line 964
    :goto_32
    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    .line 965
    .line 966
    .line 967
    move-result v6

    .line 968
    cmpg-float v6, v6, v2

    .line 969
    .line 970
    if-nez v6, :cond_42

    .line 971
    .line 972
    goto :goto_33

    .line 973
    :cond_42
    invoke-virtual {v3, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 974
    .line 975
    .line 976
    :goto_33
    invoke-virtual {v3}, Landroid/widget/TextView;->getGravity()I

    .line 977
    .line 978
    .line 979
    move-result v2

    .line 980
    const/16 v6, 0x11

    .line 981
    .line 982
    if-eq v2, v6, :cond_43

    .line 983
    .line 984
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 985
    .line 986
    .line 987
    :cond_43
    invoke-virtual {v3}, Landroid/view/View;->getTextAlignment()I

    .line 988
    .line 989
    .line 990
    move-result v2

    .line 991
    const/4 v6, 0x4

    .line 992
    if-eq v2, v6, :cond_44

    .line 993
    .line 994
    invoke-virtual {v3, v6}, Landroid/view/View;->setTextAlignment(I)V

    .line 995
    .line 996
    .line 997
    :cond_44
    if-eqz v15, :cond_46

    .line 998
    .line 999
    iget-boolean v2, v11, Lr9/q;->c:Z

    .line 1000
    .line 1001
    if-eqz v2, :cond_45

    .line 1002
    .line 1003
    goto :goto_35

    .line 1004
    :cond_45
    :goto_34
    const/4 v2, 0x0

    .line 1005
    goto :goto_36

    .line 1006
    :cond_46
    :goto_35
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1007
    .line 1008
    .line 1009
    goto :goto_34

    .line 1010
    :goto_36
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1011
    .line 1012
    .line 1013
    move-result v6

    .line 1014
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1015
    .line 1016
    .line 1017
    move-result v9

    .line 1018
    invoke-virtual {v3, v6, v9}, Landroid/view/View;->measure(II)V

    .line 1019
    .line 1020
    .line 1021
    const-string v2, "avatar_above"

    .line 1022
    .line 1023
    invoke-virtual {v10, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v2

    .line 1027
    if-eqz v2, :cond_47

    .line 1028
    .line 1029
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 1030
    .line 1031
    .line 1032
    move-result v2

    .line 1033
    add-int/2addr v2, v7

    .line 1034
    goto :goto_37

    .line 1035
    :cond_47
    const/4 v2, 0x0

    .line 1036
    :goto_37
    invoke-virtual {v1, v8, v14}, Lr9/d0;->y0(Landroid/view/View;Landroid/widget/RelativeLayout;)V

    .line 1037
    .line 1038
    .line 1039
    iget-object v6, v1, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 1040
    .line 1041
    monitor-enter v6

    .line 1042
    :try_start_2
    iget-object v9, v1, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 1043
    .line 1044
    invoke-virtual {v9, v14}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v9

    .line 1048
    check-cast v9, Lr9/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1049
    .line 1050
    monitor-exit v6

    .line 1051
    if-eqz v9, :cond_48

    .line 1052
    .line 1053
    iget v6, v9, Lr9/s;->a:I

    .line 1054
    .line 1055
    :goto_38
    move/from16 v21, v6

    .line 1056
    .line 1057
    goto :goto_39

    .line 1058
    :cond_48
    invoke-virtual {v14}, Landroid/view/View;->getPaddingTop()I

    .line 1059
    .line 1060
    .line 1061
    move-result v6

    .line 1062
    goto :goto_38

    .line 1063
    :goto_39
    if-eqz v9, :cond_49

    .line 1064
    .line 1065
    iget v6, v9, Lr9/s;->b:I

    .line 1066
    .line 1067
    :goto_3a
    move/from16 v22, v6

    .line 1068
    .line 1069
    goto :goto_3b

    .line 1070
    :cond_49
    invoke-virtual {v14}, Landroid/view/View;->getPaddingBottom()I

    .line 1071
    .line 1072
    .line 1073
    move-result v6

    .line 1074
    goto :goto_3a

    .line 1075
    :goto_3b
    if-gez v2, :cond_4a

    .line 1076
    .line 1077
    const/4 v2, 0x0

    .line 1078
    :cond_4a
    const-string v6, "avatar_above"

    .line 1079
    .line 1080
    invoke-virtual {v10, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v6

    .line 1084
    if-eqz v6, :cond_4b

    .line 1085
    .line 1086
    move v6, v2

    .line 1087
    goto :goto_3c

    .line 1088
    :cond_4b
    const/4 v6, 0x0

    .line 1089
    :goto_3c
    add-int v6, v21, v6

    .line 1090
    .line 1091
    const-string v0, "avatar_below"

    .line 1092
    .line 1093
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1094
    .line 1095
    .line 1096
    move-result v0

    .line 1097
    if-eqz v0, :cond_4c

    .line 1098
    .line 1099
    move v0, v2

    .line 1100
    goto :goto_3d

    .line 1101
    :cond_4c
    const/4 v0, 0x0

    .line 1102
    :goto_3d
    add-int v0, v22, v0

    .line 1103
    .line 1104
    if-eqz v9, :cond_4d

    .line 1105
    .line 1106
    iget-boolean v2, v9, Lr9/s;->e:Z

    .line 1107
    .line 1108
    :goto_3e
    move/from16 v25, v2

    .line 1109
    .line 1110
    goto :goto_3f

    .line 1111
    :cond_4d
    invoke-virtual {v14}, Landroid/view/ViewGroup;->getClipToPadding()Z

    .line 1112
    .line 1113
    .line 1114
    move-result v2

    .line 1115
    goto :goto_3e

    .line 1116
    :goto_3f
    if-eqz v9, :cond_4f

    .line 1117
    .line 1118
    iget-object v2, v9, Lr9/s;->f:Ljava/util/List;

    .line 1119
    .line 1120
    :cond_4e
    move/from16 v27, v5

    .line 1121
    .line 1122
    move/from16 p3, v7

    .line 1123
    .line 1124
    move-object/from16 v26, v2

    .line 1125
    .line 1126
    goto :goto_43

    .line 1127
    :cond_4f
    new-instance v2, Ljava/util/ArrayList;

    .line 1128
    .line 1129
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1130
    .line 1131
    .line 1132
    move-object v9, v14

    .line 1133
    :goto_40
    if-eqz v9, :cond_4e

    .line 1134
    .line 1135
    if-eq v9, v8, :cond_4e

    .line 1136
    .line 1137
    move/from16 v27, v5

    .line 1138
    .line 1139
    instance-of v5, v9, Landroid/view/ViewGroup;

    .line 1140
    .line 1141
    if-eqz v5, :cond_50

    .line 1142
    .line 1143
    new-instance v5, Lr9/r;

    .line 1144
    .line 1145
    move/from16 p3, v7

    .line 1146
    .line 1147
    new-instance v7, Ljava/lang/ref/WeakReference;

    .line 1148
    .line 1149
    invoke-direct {v7, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1150
    .line 1151
    .line 1152
    move-object v8, v9

    .line 1153
    check-cast v8, Landroid/view/ViewGroup;

    .line 1154
    .line 1155
    move-object/from16 v20, v9

    .line 1156
    .line 1157
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getClipChildren()Z

    .line 1158
    .line 1159
    .line 1160
    move-result v9

    .line 1161
    invoke-direct {v5, v7, v9}, Lr9/r;-><init>(Ljava/lang/ref/WeakReference;Z)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1165
    .line 1166
    .line 1167
    const/4 v5, 0x0

    .line 1168
    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 1169
    .line 1170
    .line 1171
    goto :goto_41

    .line 1172
    :cond_50
    move/from16 p3, v7

    .line 1173
    .line 1174
    move-object/from16 v20, v9

    .line 1175
    .line 1176
    :goto_41
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v5

    .line 1180
    instance-of v7, v5, Landroid/view/View;

    .line 1181
    .line 1182
    if-eqz v7, :cond_51

    .line 1183
    .line 1184
    check-cast v5, Landroid/view/View;

    .line 1185
    .line 1186
    move-object v9, v5

    .line 1187
    goto :goto_42

    .line 1188
    :cond_51
    const/4 v9, 0x0

    .line 1189
    :goto_42
    move-object/from16 v8, p1

    .line 1190
    .line 1191
    move/from16 v7, p3

    .line 1192
    .line 1193
    move/from16 v5, v27

    .line 1194
    .line 1195
    goto :goto_40

    .line 1196
    :goto_43
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v2

    .line 1200
    :cond_52
    :goto_44
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1201
    .line 1202
    .line 1203
    move-result v5

    .line 1204
    if-eqz v5, :cond_53

    .line 1205
    .line 1206
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v5

    .line 1210
    check-cast v5, Lr9/r;

    .line 1211
    .line 1212
    iget-object v5, v5, Lr9/r;->a:Ljava/lang/ref/WeakReference;

    .line 1213
    .line 1214
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v5

    .line 1218
    check-cast v5, Landroid/view/ViewGroup;

    .line 1219
    .line 1220
    if-eqz v5, :cond_52

    .line 1221
    .line 1222
    const/4 v7, 0x0

    .line 1223
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 1224
    .line 1225
    .line 1226
    goto :goto_44

    .line 1227
    :cond_53
    invoke-virtual {v14}, Landroid/view/View;->getPaddingTop()I

    .line 1228
    .line 1229
    .line 1230
    move-result v2

    .line 1231
    if-ne v2, v6, :cond_55

    .line 1232
    .line 1233
    invoke-virtual {v14}, Landroid/view/View;->getPaddingBottom()I

    .line 1234
    .line 1235
    .line 1236
    move-result v2

    .line 1237
    if-eq v2, v0, :cond_54

    .line 1238
    .line 1239
    goto :goto_46

    .line 1240
    :cond_54
    :goto_45
    const/4 v2, 0x0

    .line 1241
    goto :goto_47

    .line 1242
    :cond_55
    :goto_46
    invoke-virtual {v14}, Landroid/view/View;->getPaddingLeft()I

    .line 1243
    .line 1244
    .line 1245
    move-result v2

    .line 1246
    invoke-virtual {v14}, Landroid/view/View;->getPaddingRight()I

    .line 1247
    .line 1248
    .line 1249
    move-result v5

    .line 1250
    invoke-virtual {v14, v2, v6, v5, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 1251
    .line 1252
    .line 1253
    goto :goto_45

    .line 1254
    :goto_47
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 1255
    .line 1256
    .line 1257
    iget-object v2, v1, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 1258
    .line 1259
    monitor-enter v2

    .line 1260
    :try_start_3
    iget-object v5, v1, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 1261
    .line 1262
    new-instance v20, Lr9/s;

    .line 1263
    .line 1264
    move/from16 v24, v0

    .line 1265
    .line 1266
    move/from16 v23, v6

    .line 1267
    .line 1268
    invoke-direct/range {v20 .. v26}, Lr9/s;-><init>(IIIIZLjava/util/List;)V

    .line 1269
    .line 1270
    .line 1271
    move-object/from16 v0, v20

    .line 1272
    .line 1273
    invoke-virtual {v5, v14, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1274
    .line 1275
    .line 1276
    monitor-exit v2

    .line 1277
    if-nez v15, :cond_56

    .line 1278
    .line 1279
    invoke-virtual {v14, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1280
    .line 1281
    .line 1282
    :cond_56
    move-object v6, v10

    .line 1283
    iget-object v10, v11, Lr9/q;->a:Landroid/widget/RelativeLayout;

    .line 1284
    .line 1285
    iget-object v0, v1, Lr9/d0;->y:Ljava/util/WeakHashMap;

    .line 1286
    .line 1287
    move-object v2, v0

    .line 1288
    new-instance v0, Lr9/m;

    .line 1289
    .line 1290
    const/4 v9, 0x0

    .line 1291
    move/from16 v7, p3

    .line 1292
    .line 1293
    move-object v12, v2

    .line 1294
    move-object v2, v3

    .line 1295
    move-object v4, v11

    .line 1296
    move-object/from16 v5, v16

    .line 1297
    .line 1298
    move/from16 v8, v27

    .line 1299
    .line 1300
    move-object/from16 v3, p1

    .line 1301
    .line 1302
    move-object/from16 v11, p6

    .line 1303
    .line 1304
    invoke-direct/range {v0 .. v10}, Lr9/m;-><init>(Lr9/d0;Landroid/widget/TextView;Landroid/view/View;Lr9/q;Landroid/view/View;Ljava/lang/String;IZILandroid/widget/RelativeLayout;)V

    .line 1305
    .line 1306
    .line 1307
    move-object v8, v3

    .line 1308
    move-object v3, v2

    .line 1309
    invoke-static {v3, v10, v12, v0}, Lr9/d0;->A0(Landroid/view/View;Landroid/view/View;Ljava/util/WeakHashMap;Lfg/a;)Z

    .line 1310
    .line 1311
    .line 1312
    move-result v0

    .line 1313
    if-nez v0, :cond_58

    .line 1314
    .line 1315
    invoke-virtual {v14, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1316
    .line 1317
    .line 1318
    const/4 v9, 0x0

    .line 1319
    invoke-virtual {v1, v8, v9}, Lr9/d0;->y0(Landroid/view/View;Landroid/widget/RelativeLayout;)V

    .line 1320
    .line 1321
    .line 1322
    :cond_57
    const/4 v15, 0x0

    .line 1323
    goto/16 :goto_67

    .line 1324
    .line 1325
    :cond_58
    const/16 v19, 0x1

    .line 1326
    .line 1327
    xor-int/lit8 v0, v15, 0x1

    .line 1328
    .line 1329
    invoke-virtual {v1, v3, v0}, Lr9/d0;->r0(Landroid/widget/TextView;Z)V

    .line 1330
    .line 1331
    .line 1332
    :goto_48
    const/4 v15, 0x1

    .line 1333
    goto/16 :goto_67

    .line 1334
    .line 1335
    :catchall_0
    move-exception v0

    .line 1336
    monitor-exit v2

    .line 1337
    throw v0

    .line 1338
    :catchall_1
    move-exception v0

    .line 1339
    monitor-exit v6

    .line 1340
    throw v0

    .line 1341
    :cond_59
    move-object v11, v0

    .line 1342
    move-object/from16 v0, v26

    .line 1343
    .line 1344
    if-eqz v0, :cond_1b

    .line 1345
    .line 1346
    iget-object v4, v0, Lr9/u;->b:Landroid/view/View;

    .line 1347
    .line 1348
    iget-object v0, v0, Lr9/u;->c:Landroid/view/View;

    .line 1349
    .line 1350
    if-nez v14, :cond_5b

    .line 1351
    .line 1352
    if-eqz v15, :cond_5a

    .line 1353
    .line 1354
    iget-boolean v7, v15, Lr9/q;->c:Z

    .line 1355
    .line 1356
    const/4 v10, 0x1

    .line 1357
    if-ne v7, v10, :cond_5a

    .line 1358
    .line 1359
    goto :goto_49

    .line 1360
    :cond_5a
    const/4 v7, 0x0

    .line 1361
    goto :goto_4a

    .line 1362
    :cond_5b
    :goto_49
    const/4 v7, 0x1

    .line 1363
    :goto_4a
    invoke-virtual {v3}, Landroid/widget/TextView;->getMaxLines()I

    .line 1364
    .line 1365
    .line 1366
    move-result v10

    .line 1367
    if-eq v10, v2, :cond_5c

    .line 1368
    .line 1369
    const/4 v10, 0x0

    .line 1370
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    .line 1377
    .line 1378
    .line 1379
    :cond_5c
    invoke-virtual {v3}, Landroid/widget/TextView;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v10

    .line 1383
    if-eqz v10, :cond_5d

    .line 1384
    .line 1385
    const/4 v10, 0x0

    .line 1386
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1387
    .line 1388
    .line 1389
    goto :goto_4b

    .line 1390
    :cond_5d
    const/4 v10, 0x0

    .line 1391
    :goto_4b
    invoke-virtual {v3}, Landroid/widget/TextView;->getMaxWidth()I

    .line 1392
    .line 1393
    .line 1394
    move-result v12

    .line 1395
    if-eq v12, v2, :cond_5e

    .line 1396
    .line 1397
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 1398
    .line 1399
    .line 1400
    :cond_5e
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v2

    .line 1404
    instance-of v12, v2, Landroid/view/ViewGroup;

    .line 1405
    .line 1406
    if-eqz v12, :cond_5f

    .line 1407
    .line 1408
    check-cast v2, Landroid/view/ViewGroup;

    .line 1409
    .line 1410
    :goto_4c
    move-object/from16 v12, v27

    .line 1411
    .line 1412
    goto :goto_4d

    .line 1413
    :cond_5f
    move-object v2, v10

    .line 1414
    goto :goto_4c

    .line 1415
    :goto_4d
    if-ne v2, v12, :cond_60

    .line 1416
    .line 1417
    const/4 v14, 0x1

    .line 1418
    goto :goto_4e

    .line 1419
    :cond_60
    const/4 v14, 0x0

    .line 1420
    :goto_4e
    if-eqz v2, :cond_61

    .line 1421
    .line 1422
    if-nez v14, :cond_61

    .line 1423
    .line 1424
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1425
    .line 1426
    .line 1427
    :cond_61
    iget-object v2, v1, Lr9/d0;->B:Lr9/z;

    .line 1428
    .line 1429
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v15

    .line 1433
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1434
    .line 1435
    .line 1436
    iget v10, v2, Lr9/z;->h:I

    .line 1437
    .line 1438
    int-to-float v10, v10

    .line 1439
    invoke-static {v15, v10}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 1440
    .line 1441
    .line 1442
    move-result v10

    .line 1443
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v15

    .line 1447
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1448
    .line 1449
    .line 1450
    iget v2, v2, Lr9/z;->i:I

    .line 1451
    .line 1452
    int-to-float v2, v2

    .line 1453
    invoke-static {v15, v2}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 1454
    .line 1455
    .line 1456
    move-result v2

    .line 1457
    invoke-virtual {v3}, Landroid/view/View;->getTranslationX()F

    .line 1458
    .line 1459
    .line 1460
    move-result v15

    .line 1461
    const/4 v6, 0x0

    .line 1462
    cmpg-float v15, v15, v6

    .line 1463
    .line 1464
    if-nez v15, :cond_62

    .line 1465
    .line 1466
    goto :goto_4f

    .line 1467
    :cond_62
    invoke-virtual {v3, v6}, Landroid/view/View;->setTranslationX(F)V

    .line 1468
    .line 1469
    .line 1470
    :goto_4f
    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    .line 1471
    .line 1472
    .line 1473
    move-result v15

    .line 1474
    cmpg-float v15, v15, v6

    .line 1475
    .line 1476
    if-nez v15, :cond_63

    .line 1477
    .line 1478
    goto :goto_50

    .line 1479
    :cond_63
    invoke-virtual {v3, v6}, Landroid/view/View;->setTranslationY(F)V

    .line 1480
    .line 1481
    .line 1482
    :goto_50
    const/4 v6, 0x3

    .line 1483
    if-eqz v22, :cond_75

    .line 1484
    .line 1485
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 1486
    .line 1487
    .line 1488
    move-result v15

    .line 1489
    const/4 v5, -0x1

    .line 1490
    if-ne v15, v5, :cond_64

    .line 1491
    .line 1492
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 1493
    .line 1494
    .line 1495
    move-result v5

    .line 1496
    invoke-virtual {v4, v5}, Landroid/view/View;->setId(I)V

    .line 1497
    .line 1498
    .line 1499
    :cond_64
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1500
    .line 1501
    invoke-direct {v5, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 1505
    .line 1506
    .line 1507
    move-result v4

    .line 1508
    invoke-virtual {v5, v6, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v4

    .line 1515
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1516
    .line 1517
    .line 1518
    const/high16 v9, 0x40000000    # 2.0f

    .line 1519
    .line 1520
    invoke-static {v4, v9}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 1521
    .line 1522
    .line 1523
    move-result v4

    .line 1524
    iput v4, v5, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 1525
    .line 1526
    iget-boolean v4, v11, Lr9/f0;->l:Z

    .line 1527
    .line 1528
    if-eqz v4, :cond_69

    .line 1529
    .line 1530
    const/16 v4, 0x15

    .line 1531
    .line 1532
    if-eqz v7, :cond_66

    .line 1533
    .line 1534
    invoke-virtual {v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v2

    .line 1541
    instance-of v4, v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1542
    .line 1543
    if-eqz v4, :cond_65

    .line 1544
    .line 1545
    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1546
    .line 1547
    goto :goto_51

    .line 1548
    :cond_65
    const/4 v2, 0x0

    .line 1549
    :goto_51
    if-eqz v2, :cond_67

    .line 1550
    .line 1551
    invoke-virtual {v2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 1552
    .line 1553
    .line 1554
    move-result v4

    .line 1555
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1556
    .line 1557
    .line 1558
    iget v2, v2, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 1559
    .line 1560
    iput v2, v5, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 1561
    .line 1562
    goto :goto_52

    .line 1563
    :cond_66
    invoke-virtual {v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1564
    .line 1565
    .line 1566
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1567
    .line 1568
    .line 1569
    iput v2, v5, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 1570
    .line 1571
    :cond_67
    :goto_52
    invoke-virtual {v3}, Landroid/widget/TextView;->getGravity()I

    .line 1572
    .line 1573
    .line 1574
    move-result v2

    .line 1575
    const v4, 0x800005

    .line 1576
    .line 1577
    .line 1578
    if-eq v2, v4, :cond_68

    .line 1579
    .line 1580
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 1581
    .line 1582
    .line 1583
    :cond_68
    invoke-virtual {v3}, Landroid/view/View;->getTextAlignment()I

    .line 1584
    .line 1585
    .line 1586
    move-result v2

    .line 1587
    if-eq v2, v6, :cond_6e

    .line 1588
    .line 1589
    invoke-virtual {v3, v6}, Landroid/view/View;->setTextAlignment(I)V

    .line 1590
    .line 1591
    .line 1592
    goto :goto_55

    .line 1593
    :cond_69
    const/16 v2, 0x14

    .line 1594
    .line 1595
    if-eqz v7, :cond_6b

    .line 1596
    .line 1597
    invoke-virtual {v5, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v2

    .line 1604
    instance-of v4, v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1605
    .line 1606
    if-eqz v4, :cond_6a

    .line 1607
    .line 1608
    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1609
    .line 1610
    goto :goto_53

    .line 1611
    :cond_6a
    const/4 v2, 0x0

    .line 1612
    :goto_53
    if-eqz v2, :cond_6c

    .line 1613
    .line 1614
    invoke-virtual {v2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 1615
    .line 1616
    .line 1617
    move-result v4

    .line 1618
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1619
    .line 1620
    .line 1621
    iget v2, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 1622
    .line 1623
    iput v2, v5, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 1624
    .line 1625
    goto :goto_54

    .line 1626
    :cond_6b
    invoke-virtual {v5, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1630
    .line 1631
    .line 1632
    iput v10, v5, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 1633
    .line 1634
    :cond_6c
    :goto_54
    invoke-virtual {v3}, Landroid/widget/TextView;->getGravity()I

    .line 1635
    .line 1636
    .line 1637
    move-result v2

    .line 1638
    const v4, 0x800003

    .line 1639
    .line 1640
    .line 1641
    if-eq v2, v4, :cond_6d

    .line 1642
    .line 1643
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 1644
    .line 1645
    .line 1646
    :cond_6d
    invoke-virtual {v3}, Landroid/view/View;->getTextAlignment()I

    .line 1647
    .line 1648
    .line 1649
    move-result v2

    .line 1650
    const/4 v4, 0x2

    .line 1651
    if-eq v2, v4, :cond_6e

    .line 1652
    .line 1653
    invoke-virtual {v3, v4}, Landroid/view/View;->setTextAlignment(I)V

    .line 1654
    .line 1655
    .line 1656
    :cond_6e
    :goto_55
    if-eqz v7, :cond_6f

    .line 1657
    .line 1658
    const/4 v2, 0x4

    .line 1659
    goto :goto_56

    .line 1660
    :cond_6f
    const/4 v2, 0x0

    .line 1661
    :goto_56
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 1662
    .line 1663
    .line 1664
    move-result v4

    .line 1665
    if-eq v4, v2, :cond_70

    .line 1666
    .line 1667
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1668
    .line 1669
    .line 1670
    :cond_70
    if-nez v14, :cond_71

    .line 1671
    .line 1672
    invoke-virtual {v12, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1673
    .line 1674
    .line 1675
    goto :goto_58

    .line 1676
    :cond_71
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v2

    .line 1680
    instance-of v4, v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1681
    .line 1682
    if-eqz v4, :cond_72

    .line 1683
    .line 1684
    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1685
    .line 1686
    goto :goto_57

    .line 1687
    :cond_72
    const/4 v2, 0x0

    .line 1688
    :goto_57
    if-eqz v2, :cond_73

    .line 1689
    .line 1690
    iget v4, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 1691
    .line 1692
    iget v6, v5, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 1693
    .line 1694
    if-ne v4, v6, :cond_73

    .line 1695
    .line 1696
    iget v4, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1697
    .line 1698
    iget v6, v5, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1699
    .line 1700
    if-ne v4, v6, :cond_73

    .line 1701
    .line 1702
    iget v4, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 1703
    .line 1704
    iget v6, v5, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 1705
    .line 1706
    if-ne v4, v6, :cond_73

    .line 1707
    .line 1708
    iget v4, v2, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 1709
    .line 1710
    iget v6, v5, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 1711
    .line 1712
    if-ne v4, v6, :cond_73

    .line 1713
    .line 1714
    iget v4, v2, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 1715
    .line 1716
    iget v6, v5, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 1717
    .line 1718
    if-ne v4, v6, :cond_73

    .line 1719
    .line 1720
    iget v4, v2, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 1721
    .line 1722
    iget v6, v5, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 1723
    .line 1724
    if-ne v4, v6, :cond_73

    .line 1725
    .line 1726
    invoke-virtual {v2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 1727
    .line 1728
    .line 1729
    move-result v4

    .line 1730
    invoke-virtual {v5}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 1731
    .line 1732
    .line 1733
    move-result v6

    .line 1734
    if-ne v4, v6, :cond_73

    .line 1735
    .line 1736
    invoke-virtual {v2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 1737
    .line 1738
    .line 1739
    move-result v4

    .line 1740
    invoke-virtual {v5}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 1741
    .line 1742
    .line 1743
    move-result v6

    .line 1744
    if-ne v4, v6, :cond_73

    .line 1745
    .line 1746
    invoke-virtual {v2}, Landroid/widget/RelativeLayout$LayoutParams;->getRules()[I

    .line 1747
    .line 1748
    .line 1749
    move-result-object v2

    .line 1750
    invoke-virtual {v5}, Landroid/widget/RelativeLayout$LayoutParams;->getRules()[I

    .line 1751
    .line 1752
    .line 1753
    move-result-object v4

    .line 1754
    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([I[I)Z

    .line 1755
    .line 1756
    .line 1757
    move-result v2

    .line 1758
    if-eqz v2, :cond_73

    .line 1759
    .line 1760
    goto :goto_58

    .line 1761
    :cond_73
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1762
    .line 1763
    .line 1764
    :goto_58
    if-eqz v7, :cond_74

    .line 1765
    .line 1766
    iget-boolean v5, v11, Lr9/f0;->l:Z

    .line 1767
    .line 1768
    const/4 v6, 0x0

    .line 1769
    move-object v4, v0

    .line 1770
    move-object v2, v3

    .line 1771
    move-object v3, v12

    .line 1772
    invoke-virtual/range {v1 .. v6}, Lr9/d0;->z0(Landroid/widget/TextView;Landroid/view/ViewGroup;Landroid/view/View;ZI)V

    .line 1773
    .line 1774
    .line 1775
    move-object v3, v2

    .line 1776
    :goto_59
    const/16 v19, 0x1

    .line 1777
    .line 1778
    goto :goto_5a

    .line 1779
    :cond_74
    iget-object v0, v1, Lr9/d0;->y:Ljava/util/WeakHashMap;

    .line 1780
    .line 1781
    invoke-static {v3, v0}, Lr9/d0;->h(Landroid/view/View;Ljava/util/WeakHashMap;)V

    .line 1782
    .line 1783
    .line 1784
    goto :goto_59

    .line 1785
    :goto_5a
    xor-int/lit8 v0, v14, 0x1

    .line 1786
    .line 1787
    invoke-virtual {v1, v3, v0}, Lr9/d0;->r0(Landroid/widget/TextView;Z)V

    .line 1788
    .line 1789
    .line 1790
    goto/16 :goto_48

    .line 1791
    .line 1792
    :cond_75
    new-instance v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1793
    .line 1794
    invoke-direct {v5, v9, v9}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 1795
    .line 1796
    .line 1797
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v9

    .line 1801
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1802
    .line 1803
    .line 1804
    const/high16 v15, 0x40000000    # 2.0f

    .line 1805
    .line 1806
    invoke-static {v9, v15}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 1807
    .line 1808
    .line 1809
    move-result v9

    .line 1810
    iput v9, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1811
    .line 1812
    iget-boolean v9, v11, Lr9/f0;->l:Z

    .line 1813
    .line 1814
    if-eqz v9, :cond_79

    .line 1815
    .line 1816
    if-nez v7, :cond_76

    .line 1817
    .line 1818
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1819
    .line 1820
    .line 1821
    :cond_76
    invoke-virtual {v3}, Landroid/widget/TextView;->getGravity()I

    .line 1822
    .line 1823
    .line 1824
    move-result v2

    .line 1825
    const v9, 0x800005

    .line 1826
    .line 1827
    .line 1828
    if-eq v2, v9, :cond_77

    .line 1829
    .line 1830
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 1831
    .line 1832
    .line 1833
    :cond_77
    invoke-virtual {v3}, Landroid/view/View;->getTextAlignment()I

    .line 1834
    .line 1835
    .line 1836
    move-result v2

    .line 1837
    if-eq v2, v6, :cond_78

    .line 1838
    .line 1839
    invoke-virtual {v3, v6}, Landroid/view/View;->setTextAlignment(I)V

    .line 1840
    .line 1841
    .line 1842
    :cond_78
    const v6, 0x800003

    .line 1843
    .line 1844
    .line 1845
    goto :goto_5b

    .line 1846
    :cond_79
    const v9, 0x800005

    .line 1847
    .line 1848
    .line 1849
    if-nez v7, :cond_7a

    .line 1850
    .line 1851
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1852
    .line 1853
    .line 1854
    :cond_7a
    invoke-virtual {v3}, Landroid/widget/TextView;->getGravity()I

    .line 1855
    .line 1856
    .line 1857
    move-result v2

    .line 1858
    const v6, 0x800003

    .line 1859
    .line 1860
    .line 1861
    if-eq v2, v6, :cond_7b

    .line 1862
    .line 1863
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 1864
    .line 1865
    .line 1866
    :cond_7b
    invoke-virtual {v3}, Landroid/view/View;->getTextAlignment()I

    .line 1867
    .line 1868
    .line 1869
    move-result v2

    .line 1870
    const/4 v10, 0x2

    .line 1871
    if-eq v2, v10, :cond_7c

    .line 1872
    .line 1873
    invoke-virtual {v3, v10}, Landroid/view/View;->setTextAlignment(I)V

    .line 1874
    .line 1875
    .line 1876
    :cond_7c
    :goto_5b
    instance-of v2, v12, Landroid/widget/LinearLayout;

    .line 1877
    .line 1878
    if-eqz v2, :cond_57

    .line 1879
    .line 1880
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1881
    .line 1882
    invoke-direct {v2, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 1883
    .line 1884
    .line 1885
    if-eqz v7, :cond_81

    .line 1886
    .line 1887
    iget-boolean v5, v11, Lr9/f0;->l:Z

    .line 1888
    .line 1889
    if-eqz v5, :cond_7d

    .line 1890
    .line 1891
    move v6, v9

    .line 1892
    :cond_7d
    iput v6, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1893
    .line 1894
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v5

    .line 1898
    instance-of v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1899
    .line 1900
    if-eqz v6, :cond_7e

    .line 1901
    .line 1902
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1903
    .line 1904
    goto :goto_5c

    .line 1905
    :cond_7e
    const/4 v5, 0x0

    .line 1906
    :goto_5c
    if-eqz v5, :cond_80

    .line 1907
    .line 1908
    iget-boolean v6, v11, Lr9/f0;->l:Z

    .line 1909
    .line 1910
    if-eqz v6, :cond_7f

    .line 1911
    .line 1912
    invoke-virtual {v5}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 1913
    .line 1914
    .line 1915
    move-result v6

    .line 1916
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1917
    .line 1918
    .line 1919
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1920
    .line 1921
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1922
    .line 1923
    goto :goto_5d

    .line 1924
    :cond_7f
    invoke-virtual {v5}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 1925
    .line 1926
    .line 1927
    move-result v6

    .line 1928
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1929
    .line 1930
    .line 1931
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1932
    .line 1933
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1934
    .line 1935
    :cond_80
    :goto_5d
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 1936
    .line 1937
    .line 1938
    move-result v5

    .line 1939
    const/4 v6, 0x4

    .line 1940
    if-eq v5, v6, :cond_82

    .line 1941
    .line 1942
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1943
    .line 1944
    .line 1945
    goto :goto_5e

    .line 1946
    :cond_81
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 1947
    .line 1948
    .line 1949
    move-result v5

    .line 1950
    if-eqz v5, :cond_82

    .line 1951
    .line 1952
    const/4 v10, 0x0

    .line 1953
    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1954
    .line 1955
    .line 1956
    :cond_82
    :goto_5e
    invoke-virtual {v12, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 1957
    .line 1958
    .line 1959
    move-result v5

    .line 1960
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v6

    .line 1964
    if-ltz v5, :cond_83

    .line 1965
    .line 1966
    goto :goto_5f

    .line 1967
    :cond_83
    const/4 v6, 0x0

    .line 1968
    :goto_5f
    if-eqz v6, :cond_84

    .line 1969
    .line 1970
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1971
    .line 1972
    .line 1973
    move-result v5

    .line 1974
    const/16 v19, 0x1

    .line 1975
    .line 1976
    add-int/lit8 v5, v5, 0x1

    .line 1977
    .line 1978
    goto :goto_60

    .line 1979
    :cond_84
    move-object v5, v12

    .line 1980
    check-cast v5, Landroid/widget/LinearLayout;

    .line 1981
    .line 1982
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1983
    .line 1984
    .line 1985
    move-result v5

    .line 1986
    :goto_60
    if-nez v14, :cond_85

    .line 1987
    .line 1988
    invoke-virtual {v12, v3, v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1989
    .line 1990
    .line 1991
    goto/16 :goto_64

    .line 1992
    .line 1993
    :cond_85
    invoke-virtual {v12, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 1994
    .line 1995
    .line 1996
    move-result v6

    .line 1997
    if-eq v6, v5, :cond_88

    .line 1998
    .line 1999
    invoke-virtual {v12, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2000
    .line 2001
    .line 2002
    invoke-virtual {v12, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 2003
    .line 2004
    .line 2005
    move-result v4

    .line 2006
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v5

    .line 2010
    if-ltz v4, :cond_86

    .line 2011
    .line 2012
    move-object/from16 v17, v5

    .line 2013
    .line 2014
    goto :goto_61

    .line 2015
    :cond_86
    const/16 v17, 0x0

    .line 2016
    .line 2017
    :goto_61
    if-eqz v17, :cond_87

    .line 2018
    .line 2019
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    .line 2020
    .line 2021
    .line 2022
    move-result v4

    .line 2023
    const/16 v19, 0x1

    .line 2024
    .line 2025
    add-int/lit8 v4, v4, 0x1

    .line 2026
    .line 2027
    goto :goto_62

    .line 2028
    :cond_87
    move-object v4, v12

    .line 2029
    check-cast v4, Landroid/widget/LinearLayout;

    .line 2030
    .line 2031
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2032
    .line 2033
    .line 2034
    move-result v4

    .line 2035
    :goto_62
    invoke-virtual {v12, v3, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 2036
    .line 2037
    .line 2038
    goto :goto_64

    .line 2039
    :cond_88
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v4

    .line 2043
    instance-of v5, v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 2044
    .line 2045
    if-eqz v5, :cond_89

    .line 2046
    .line 2047
    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 2048
    .line 2049
    goto :goto_63

    .line 2050
    :cond_89
    const/4 v4, 0x0

    .line 2051
    :goto_63
    if-eqz v4, :cond_8a

    .line 2052
    .line 2053
    iget v5, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 2054
    .line 2055
    iget v6, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 2056
    .line 2057
    if-ne v5, v6, :cond_8a

    .line 2058
    .line 2059
    iget v5, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 2060
    .line 2061
    iget v6, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 2062
    .line 2063
    if-ne v5, v6, :cond_8a

    .line 2064
    .line 2065
    iget v5, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 2066
    .line 2067
    iget v6, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 2068
    .line 2069
    if-ne v5, v6, :cond_8a

    .line 2070
    .line 2071
    iget v5, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 2072
    .line 2073
    iget v6, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 2074
    .line 2075
    if-ne v5, v6, :cond_8a

    .line 2076
    .line 2077
    iget v5, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 2078
    .line 2079
    iget v6, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 2080
    .line 2081
    if-ne v5, v6, :cond_8a

    .line 2082
    .line 2083
    iget v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 2084
    .line 2085
    iget v6, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 2086
    .line 2087
    if-ne v5, v6, :cond_8a

    .line 2088
    .line 2089
    invoke-virtual {v4}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 2090
    .line 2091
    .line 2092
    move-result v5

    .line 2093
    invoke-virtual {v2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 2094
    .line 2095
    .line 2096
    move-result v6

    .line 2097
    if-ne v5, v6, :cond_8a

    .line 2098
    .line 2099
    invoke-virtual {v4}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 2100
    .line 2101
    .line 2102
    move-result v5

    .line 2103
    invoke-virtual {v2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 2104
    .line 2105
    .line 2106
    move-result v6

    .line 2107
    if-ne v5, v6, :cond_8a

    .line 2108
    .line 2109
    iget v5, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 2110
    .line 2111
    iget v6, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 2112
    .line 2113
    if-ne v5, v6, :cond_8a

    .line 2114
    .line 2115
    iget v4, v4, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 2116
    .line 2117
    iget v5, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 2118
    .line 2119
    cmpg-float v4, v4, v5

    .line 2120
    .line 2121
    if-nez v4, :cond_8a

    .line 2122
    .line 2123
    goto :goto_64

    .line 2124
    :cond_8a
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2125
    .line 2126
    .line 2127
    :goto_64
    if-eqz v7, :cond_8b

    .line 2128
    .line 2129
    iget-boolean v5, v11, Lr9/f0;->l:Z

    .line 2130
    .line 2131
    const/4 v6, 0x0

    .line 2132
    move-object v4, v0

    .line 2133
    move-object v2, v3

    .line 2134
    move-object v3, v12

    .line 2135
    invoke-virtual/range {v1 .. v6}, Lr9/d0;->z0(Landroid/widget/TextView;Landroid/view/ViewGroup;Landroid/view/View;ZI)V

    .line 2136
    .line 2137
    .line 2138
    move-object v3, v2

    .line 2139
    :goto_65
    const/16 v19, 0x1

    .line 2140
    .line 2141
    goto :goto_66

    .line 2142
    :cond_8b
    iget-object v0, v1, Lr9/d0;->y:Ljava/util/WeakHashMap;

    .line 2143
    .line 2144
    invoke-static {v3, v0}, Lr9/d0;->h(Landroid/view/View;Ljava/util/WeakHashMap;)V

    .line 2145
    .line 2146
    .line 2147
    goto :goto_65

    .line 2148
    :goto_66
    xor-int/lit8 v0, v14, 0x1

    .line 2149
    .line 2150
    invoke-virtual {v1, v3, v0}, Lr9/d0;->r0(Landroid/widget/TextView;Z)V

    .line 2151
    .line 2152
    .line 2153
    move/from16 v15, v19

    .line 2154
    .line 2155
    :goto_67
    if-eqz v15, :cond_8c

    .line 2156
    .line 2157
    move-object/from16 v4, p2

    .line 2158
    .line 2159
    move-object/from16 v5, p4

    .line 2160
    .line 2161
    move-object v2, v8

    .line 2162
    move-object v7, v11

    .line 2163
    move-object v6, v13

    .line 2164
    invoke-virtual/range {v1 .. v7}, Lr9/d0;->s0(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Object;Ljava/lang/Object;Lr9/f0;)V

    .line 2165
    .line 2166
    .line 2167
    :cond_8c
    return v15

    .line 2168
    :catchall_2
    move-exception v0

    .line 2169
    monitor-exit v2

    .line 2170
    throw v0

    .line 2171
    :catchall_3
    move-exception v0

    .line 2172
    monitor-exit v2

    .line 2173
    throw v0

    .line 2174
    :cond_8d
    move-object v12, v4

    .line 2175
    move/from16 v22, v6

    .line 2176
    .line 2177
    move-object v6, v10

    .line 2178
    move-object/from16 v5, v16

    .line 2179
    .line 2180
    move-object/from16 v25, v20

    .line 2181
    .line 2182
    move-object/from16 v0, v21

    .line 2183
    .line 2184
    const/16 v19, 0x1

    .line 2185
    .line 2186
    add-int/lit8 v7, v7, 0x1

    .line 2187
    .line 2188
    move-object/from16 v1, p0

    .line 2189
    .line 2190
    move-object/from16 v8, p1

    .line 2191
    .line 2192
    move-object/from16 v11, p2

    .line 2193
    .line 2194
    move-object/from16 v13, p5

    .line 2195
    .line 2196
    move-object v2, v0

    .line 2197
    move-object/from16 v16, v5

    .line 2198
    .line 2199
    move-object v10, v6

    .line 2200
    move-object v4, v12

    .line 2201
    move/from16 v6, v22

    .line 2202
    .line 2203
    move-object/from16 v0, v25

    .line 2204
    .line 2205
    move-object/from16 v12, p4

    .line 2206
    .line 2207
    move-object/from16 v5, p6

    .line 2208
    .line 2209
    goto/16 :goto_1d

    .line 2210
    .line 2211
    :goto_68
    return v18
.end method

.method public final E0(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_2

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Lr9/d0;->p0()Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_5

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move v3, v0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_4

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/lang/reflect/Method;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    array-length v5, v5

    .line 42
    const/4 v6, 0x2

    .line 43
    if-ne v5, v6, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    aget-object v5, v5, v0

    .line 50
    .line 51
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const/4 v6, 0x1

    .line 64
    aget-object v5, v5, v6

    .line 65
    .line 66
    const-class v7, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_2

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    :try_start_0
    invoke-virtual {v4, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 76
    .line 77
    .line 78
    filled-new-array {v1, p2}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v4, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception v4

    .line 89
    new-instance v5, Lsf/f;

    .line 90
    .line 91
    invoke-direct {v5, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    move-object v4, v5

    .line 95
    :goto_1
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 96
    .line 97
    instance-of v7, v4, Lsf/f;

    .line 98
    .line 99
    if-eqz v7, :cond_3

    .line 100
    .line 101
    move-object v4, v5

    .line 102
    :cond_3
    check-cast v4, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_1

    .line 109
    .line 110
    move v3, v6

    .line 111
    goto :goto_0

    .line 112
    :cond_4
    return v3

    .line 113
    :cond_5
    :goto_2
    return v0
.end method

.method public final F()Z
    .locals 9

    .line 1
    iget-object v0, p0, Lr9/d0;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    const-string v1, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_7

    .line 13
    .line 14
    iget-object v2, p0, Lr9/d0;->g:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const-string v4, "initView"

    .line 21
    .line 22
    new-array v5, v1, [Ljava/lang/Class;

    .line 23
    .line 24
    invoke-static {v0, v4, v5}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    new-instance v5, Lr9/c;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-direct {v5, p0, v6}, Lr9/c;-><init>(Lr9/d0;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v4, v5}, Lr9/d0;->B(Ljava/lang/reflect/Method;Lfg/l;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v4, v1

    .line 42
    :goto_0
    invoke-static {v0}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    move-object v7, v6

    .line 61
    check-cast v7, Ljava/lang/reflect/Method;

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    const-string v8, "onPreferenceTreeClick"

    .line 68
    .line 69
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    const/4 v6, 0x0

    .line 77
    :goto_1
    check-cast v6, Ljava/lang/reflect/Method;

    .line 78
    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    new-instance v5, Lr9/c;

    .line 82
    .line 83
    const/4 v7, 0x1

    .line 84
    invoke-direct {v5, p0, v7}, Lr9/c;-><init>(Lr9/d0;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v6, v5}, Lr9/d0;->C(Ljava/lang/reflect/Method;Lfg/l;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-nez v5, :cond_3

    .line 92
    .line 93
    if-eqz v4, :cond_4

    .line 94
    .line 95
    :cond_3
    const/4 v1, 0x1

    .line 96
    :cond_4
    move v4, v1

    .line 97
    :cond_5
    if-nez v4, :cond_6

    .line 98
    .line 99
    if-eqz v3, :cond_6

    .line 100
    .line 101
    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    :cond_6
    return v4

    .line 105
    :cond_7
    return v1
.end method

.method public final G()Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Lr9/d0;->a0()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lr9/d0;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v2, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v3, p0, Lr9/d0;->e:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v4, "chat_message_view_bind"

    .line 12
    .line 13
    invoke-static {v3, v0, v2, v4}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v5, p0, Lr9/d0;->b:Lia/t;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lr9/d0;->K(Ljava/lang/reflect/Method;)Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    if-eqz v7, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v2, v6

    .line 30
    :goto_0
    if-eqz v2, :cond_1

    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_1
    :try_start_0
    iget-object v1, v1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 35
    .line 36
    new-instance v2, Lch/e;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v7, Lfh/k;

    .line 42
    .line 43
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v8, "MicroMsg.MvvmChattingItem"

    .line 47
    .line 48
    const-string v9, "[onBindView]"

    .line 49
    .line 50
    filled-new-array {v8, v9}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-static {v8}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-static {v7, v8}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 59
    .line 60
    .line 61
    iput-object v7, v2, Lch/e;->h:Lfh/k;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v2, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_3

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, Lhh/o;

    .line 87
    .line 88
    invoke-virtual {p0, v7}, Lr9/d0;->O0(Lhh/o;)Ljava/lang/reflect/Method;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    if-eqz v7, :cond_2

    .line 93
    .line 94
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception v1

    .line 99
    new-instance v2, Lsf/f;

    .line 100
    .line 101
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-nez v1, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    const-string v2, "\u6d88\u606f\u663e\u793a\u65f6\u95f4\u5b9a\u4f4d\u5931\u8d25"

    .line 112
    .line 113
    invoke-virtual {v5, v2, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 117
    .line 118
    :goto_2
    check-cast v2, Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_6

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    move-object v7, v2

    .line 135
    check-cast v7, Ljava/lang/reflect/Method;

    .line 136
    .line 137
    invoke-virtual {p0, v7}, Lr9/d0;->K(Ljava/lang/reflect/Method;)Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_5

    .line 142
    .line 143
    move-object v6, v2

    .line 144
    :cond_6
    move-object v2, v6

    .line 145
    check-cast v2, Ljava/lang/reflect/Method;

    .line 146
    .line 147
    if-eqz v2, :cond_7

    .line 148
    .line 149
    invoke-static {v3, v0, v4, v2}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_7
    const-string v1, "cache.key"

    .line 154
    .line 155
    :try_start_1
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    const-string v7, ""

    .line 160
    .line 161
    invoke-interface {v3, v1, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-nez v3, :cond_8

    .line 170
    .line 171
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-interface {v3, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 176
    .line 177
    .line 178
    :cond_8
    invoke-interface {v6, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 183
    .line 184
    .line 185
    :catchall_1
    :goto_3
    if-eqz v2, :cond_b

    .line 186
    .line 187
    iget-object v0, p0, Lr9/d0;->f:Ljava/util/Set;

    .line 188
    .line 189
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_9

    .line 194
    .line 195
    const/4 v0, 0x1

    .line 196
    return v0

    .line 197
    :cond_9
    :try_start_2
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 198
    .line 199
    new-instance v3, Lb9/e;

    .line 200
    .line 201
    const/16 v4, 0x18

    .line 202
    .line 203
    invoke-direct {v3, p0, v4}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v2, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 207
    .line 208
    .line 209
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :catchall_2
    move-exception v1

    .line 213
    new-instance v3, Lsf/f;

    .line 214
    .line 215
    invoke-direct {v3, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    move-object v1, v3

    .line 219
    :goto_4
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    if-nez v3, :cond_a

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_a
    invoke-interface {v0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const-string v2, "\u6d88\u606f\u663e\u793a\u65f6\u95f4Hook\u5b89\u88c5\u5931\u8d25: "

    .line 236
    .line 237
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v5, v0, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 251
    .line 252
    :goto_5
    check-cast v1, Ljava/lang/Boolean;

    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    return v0

    .line 259
    :cond_b
    const/4 v0, 0x0

    .line 260
    return v0
.end method

.method public final H()Z
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Lr9/d0;->a0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v3, v1, Lr9/d0;->a:Lr8/g;

    .line 8
    .line 9
    iget-object v0, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    iget-object v4, v3, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 12
    .line 13
    iget-object v5, v1, Lr9/d0;->e:Landroid/content/SharedPreferences;

    .line 14
    .line 15
    const-string v6, "lucky_money_time_formatter"

    .line 16
    .line 17
    invoke-static {v5, v2, v0, v6}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v7, v1, Lr9/d0;->b:Lia/t;

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Lr9/d0;->N(Ljava/lang/reflect/Method;)Z

    .line 27
    .line 28
    .line 29
    move-result v9

    .line 30
    if-eqz v9, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, v8

    .line 34
    :goto_0
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_1
    :try_start_0
    new-instance v0, Lch/e;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v9, "com.tencent.mm.plugin.luckymoney.model"

    .line 44
    .line 45
    filled-new-array {v9}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    invoke-static {v9}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    iput-object v9, v0, Lch/e;->g:Ljava/util/List;

    .line 54
    .line 55
    new-instance v9, Lfh/k;

    .line 56
    .line 57
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v10, "HH:mm"

    .line 61
    .line 62
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-static {v9, v10}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 67
    .line 68
    .line 69
    iput-object v9, v0, Lch/e;->h:Lfh/k;

    .line 70
    .line 71
    invoke-virtual {v4, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v9, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-eqz v10, :cond_3

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    check-cast v10, Lhh/o;

    .line 95
    .line 96
    invoke-virtual {v1, v10}, Lr9/d0;->O0(Lhh/o;)Ljava/lang/reflect/Method;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    if-eqz v10, :cond_2

    .line 101
    .line 102
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    if-eqz v9, :cond_5

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    move-object v10, v9

    .line 123
    check-cast v10, Ljava/lang/reflect/Method;

    .line 124
    .line 125
    invoke-static {v10}, Lr9/d0;->N(Ljava/lang/reflect/Method;)Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-eqz v10, :cond_4

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    move-object v9, v8

    .line 133
    :goto_2
    check-cast v9, Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :goto_3
    new-instance v9, Lsf/f;

    .line 137
    .line 138
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    :goto_4
    invoke-static {v9}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-nez v0, :cond_6

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_6
    const-string v9, "\u7ea2\u5305\u8be6\u60c5\u65f6\u95f4\u683c\u5f0f\u5316\u5b9a\u4f4d\u5931\u8d25"

    .line 149
    .line 150
    invoke-virtual {v7, v9, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-object v9, v8

    .line 154
    :goto_5
    move-object v0, v9

    .line 155
    check-cast v0, Ljava/lang/reflect/Method;

    .line 156
    .line 157
    if-eqz v0, :cond_7

    .line 158
    .line 159
    invoke-static {v5, v2, v6, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 160
    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_7
    const-string v9, "cache.key"

    .line 164
    .line 165
    :try_start_1
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    const-string v11, ""

    .line 170
    .line 171
    invoke-interface {v5, v9, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-static {v5, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-nez v5, :cond_8

    .line 180
    .line 181
    invoke-interface {v10}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-interface {v5, v9, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 186
    .line 187
    .line 188
    :cond_8
    invoke-interface {v10, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 193
    .line 194
    .line 195
    :catchall_1
    :goto_6
    const/4 v2, 0x0

    .line 196
    if-eqz v0, :cond_9

    .line 197
    .line 198
    new-instance v5, Lr9/c;

    .line 199
    .line 200
    const/4 v6, 0x4

    .line 201
    invoke-direct {v5, v1, v6}, Lr9/c;-><init>(Lr9/d0;I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v0, v5}, Lr9/d0;->B(Ljava/lang/reflect/Method;Lfg/l;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    goto :goto_7

    .line 209
    :cond_9
    move v0, v2

    .line 210
    :goto_7
    const-string v5, "MicroMsg.LuckyMoneyDetailUI"

    .line 211
    .line 212
    const-string v6, "try get user contact: %s"

    .line 213
    .line 214
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-static {v5}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    const-string v6, "lucky_money_detail_bind_direct"

    .line 223
    .line 224
    invoke-static {v1, v6, v5}, Lr9/d0;->S(Lr9/d0;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    const/4 v6, 0x1

    .line 229
    if-eqz v5, :cond_c

    .line 230
    .line 231
    new-instance v9, Lr9/c;

    .line 232
    .line 233
    const/4 v10, 0x5

    .line 234
    invoke-direct {v9, v1, v10}, Lr9/c;-><init>(Lr9/d0;I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1, v5, v9}, Lr9/d0;->B(Ljava/lang/reflect/Method;Lfg/l;)Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-nez v5, :cond_b

    .line 242
    .line 243
    if-eqz v0, :cond_a

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_a
    move v0, v2

    .line 247
    goto :goto_9

    .line 248
    :cond_b
    :goto_8
    move v0, v6

    .line 249
    :cond_c
    :goto_9
    move v5, v0

    .line 250
    const-string v0, "MicroMsg.NetSceneOpenLuckyMoney"

    .line 251
    .line 252
    const-string v9, "/cgi-bin/mmpay-bin/openwxhb"

    .line 253
    .line 254
    filled-new-array {v0, v9}, [Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    const-string v9, "MicroMsg.NetSceneLuckyMoneyDetail"

    .line 263
    .line 264
    const-string v10, "/cgi-bin/mmpay-bin/qrydetailwxhb"

    .line 265
    .line 266
    filled-new-array {v9, v10}, [Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-static {v9}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    const/4 v10, 0x2

    .line 275
    new-array v11, v10, [Ljava/util/List;

    .line 276
    .line 277
    aput-object v0, v11, v2

    .line 278
    .line 279
    aput-object v9, v11, v6

    .line 280
    .line 281
    invoke-static {v11}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v1}, Lr9/d0;->a0()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    iget-object v11, v3, Lr8/g;->a:Landroid/content/Context;

    .line 290
    .line 291
    iget-object v3, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 292
    .line 293
    const-string v12, "Hchat_extra_class_cache"

    .line 294
    .line 295
    invoke-static {v11, v12}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    new-instance v12, Ljava/util/LinkedHashSet;

    .line 300
    .line 301
    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    .line 302
    .line 303
    .line 304
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v13

    .line 308
    move v0, v2

    .line 309
    :goto_a
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v14

    .line 313
    if-eqz v14, :cond_13

    .line 314
    .line 315
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v14

    .line 319
    add-int/lit8 v15, v0, 0x1

    .line 320
    .line 321
    if-ltz v0, :cond_12

    .line 322
    .line 323
    check-cast v14, Ljava/util/List;

    .line 324
    .line 325
    move/from16 v16, v2

    .line 326
    .line 327
    const-string v2, "lucky_money_scene_classes_"

    .line 328
    .line 329
    invoke-static {v0, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    move/from16 v17, v6

    .line 334
    .line 335
    new-instance v6, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    move/from16 v18, v10

    .line 344
    .line 345
    const-string v10, "_"

    .line 346
    .line 347
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    invoke-interface {v11, v6, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    if-eqz v6, :cond_d

    .line 362
    .line 363
    invoke-static {v6, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    if-eqz v6, :cond_d

    .line 368
    .line 369
    invoke-interface {v12, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    :cond_d
    invoke-virtual {v12}, Ljava/util/AbstractCollection;->size()I

    .line 373
    .line 374
    .line 375
    move-result v6

    .line 376
    if-le v6, v0, :cond_e

    .line 377
    .line 378
    goto/16 :goto_e

    .line 379
    .line 380
    :cond_e
    :try_start_2
    new-instance v0, Lch/c;

    .line 381
    .line 382
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 383
    .line 384
    .line 385
    new-instance v6, Lfh/a;

    .line 386
    .line 387
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 388
    .line 389
    .line 390
    invoke-static {v6, v14}, Lfh/a;->r0(Lfh/a;Ljava/util/Collection;)V

    .line 391
    .line 392
    .line 393
    iput-object v6, v0, Lch/c;->h:Lfh/a;

    .line 394
    .line 395
    invoke-virtual {v4, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-virtual {v0}, Lhh/e;->a()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    check-cast v0, Lhh/i;

    .line 404
    .line 405
    if-eqz v0, :cond_f

    .line 406
    .line 407
    invoke-virtual {v0}, Lhh/i;->p()Llh/a;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    iget-object v0, v0, Llh/a;->g:Ljava/lang/String;

    .line 412
    .line 413
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 417
    goto :goto_c

    .line 418
    :catchall_2
    move-exception v0

    .line 419
    goto :goto_b

    .line 420
    :cond_f
    move-object v0, v8

    .line 421
    goto :goto_c

    .line 422
    :goto_b
    new-instance v6, Lsf/f;

    .line 423
    .line 424
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 425
    .line 426
    .line 427
    move-object v0, v6

    .line 428
    :goto_c
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    if-nez v6, :cond_10

    .line 433
    .line 434
    goto :goto_d

    .line 435
    :cond_10
    const-string v0, "DexKit\u5b9a\u4f4d\u7c7b\u5931\u8d25: "

    .line 436
    .line 437
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v7, v0, v6}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-object v0, v8

    .line 445
    :goto_d
    check-cast v0, Ljava/lang/Class;

    .line 446
    .line 447
    if-eqz v0, :cond_11

    .line 448
    .line 449
    invoke-interface {v12, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    invoke-static {v9, v10, v2}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-interface {v6, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 469
    .line 470
    .line 471
    goto :goto_e

    .line 472
    :cond_11
    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    new-instance v6, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 499
    .line 500
    .line 501
    :goto_e
    move v0, v15

    .line 502
    move/from16 v2, v16

    .line 503
    .line 504
    move/from16 v6, v17

    .line 505
    .line 506
    move/from16 v10, v18

    .line 507
    .line 508
    goto/16 :goto_a

    .line 509
    .line 510
    :cond_12
    invoke-static {}, La/a;->Q0()V

    .line 511
    .line 512
    .line 513
    throw v8

    .line 514
    :cond_13
    move/from16 v16, v2

    .line 515
    .line 516
    move/from16 v17, v6

    .line 517
    .line 518
    move/from16 v18, v10

    .line 519
    .line 520
    invoke-static {v12}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    :cond_14
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    if-eqz v2, :cond_1a

    .line 533
    .line 534
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    check-cast v2, Ljava/lang/Class;

    .line 539
    .line 540
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    :cond_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    if-eqz v3, :cond_17

    .line 553
    .line 554
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    move-object v4, v3

    .line 559
    check-cast v4, Ljava/lang/reflect/Method;

    .line 560
    .line 561
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    const-string v7, "onGYNetEnd"

    .line 566
    .line 567
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v6

    .line 571
    if-eqz v6, :cond_16

    .line 572
    .line 573
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    move-result-object v6

    .line 577
    array-length v6, v6

    .line 578
    const/4 v7, 0x3

    .line 579
    if-ne v6, v7, :cond_16

    .line 580
    .line 581
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    move-result-object v6

    .line 585
    aget-object v6, v6, v16

    .line 586
    .line 587
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 588
    .line 589
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v6

    .line 593
    if-eqz v6, :cond_16

    .line 594
    .line 595
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    move-result-object v6

    .line 599
    aget-object v6, v6, v17

    .line 600
    .line 601
    const-class v7, Ljava/lang/String;

    .line 602
    .line 603
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v6

    .line 607
    if-eqz v6, :cond_16

    .line 608
    .line 609
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    aget-object v4, v4, v18

    .line 614
    .line 615
    const-class v6, Lorg/json/JSONObject;

    .line 616
    .line 617
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 618
    .line 619
    .line 620
    move-result v4

    .line 621
    if-eqz v4, :cond_16

    .line 622
    .line 623
    move/from16 v4, v17

    .line 624
    .line 625
    goto :goto_10

    .line 626
    :cond_16
    move/from16 v4, v16

    .line 627
    .line 628
    :goto_10
    if-eqz v4, :cond_15

    .line 629
    .line 630
    goto :goto_11

    .line 631
    :cond_17
    move-object v3, v8

    .line 632
    :goto_11
    check-cast v3, Ljava/lang/reflect/Method;

    .line 633
    .line 634
    if-eqz v3, :cond_14

    .line 635
    .line 636
    new-instance v2, Lr9/c;

    .line 637
    .line 638
    const/4 v4, 0x6

    .line 639
    invoke-direct {v2, v1, v4}, Lr9/c;-><init>(Lr9/d0;I)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v1, v3, v2}, Lr9/d0;->C(Ljava/lang/reflect/Method;Lfg/l;)Z

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    if-nez v2, :cond_19

    .line 647
    .line 648
    if-eqz v5, :cond_18

    .line 649
    .line 650
    goto :goto_12

    .line 651
    :cond_18
    move/from16 v2, v16

    .line 652
    .line 653
    goto :goto_13

    .line 654
    :cond_19
    :goto_12
    move/from16 v2, v17

    .line 655
    .line 656
    :goto_13
    move v5, v2

    .line 657
    goto/16 :goto_f

    .line 658
    .line 659
    :cond_1a
    return v5
.end method

.method public final I()Z
    .locals 12

    .line 1
    const-string v0, "MicroMsg.WebViewHighRiskAdH5Interceptor"

    .line 2
    .line 3
    const-string v1, "isInterceptEnabled, expt="

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "web_risk_intercept_enabled"

    .line 14
    .line 15
    invoke-static {p0, v1, v0}, Lr9/d0;->S(Lr9/d0;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_f

    .line 21
    .line 22
    new-instance v2, Lr9/c;

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-direct {v2, p0, v3}, Lr9/c;-><init>(Lr9/d0;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0, v2}, Lr9/d0;->C(Ljava/lang/reflect/Method;Lfg/l;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-string v3, "http"

    .line 40
    .line 41
    const-string v4, "https"

    .line 42
    .line 43
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {p0}, Lr9/d0;->a0()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    iget-object v5, p0, Lr9/d0;->a:Lr8/g;

    .line 56
    .line 57
    iget-object v6, v5, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 58
    .line 59
    iget-object v7, p0, Lr9/d0;->e:Landroid/content/SharedPreferences;

    .line 60
    .line 61
    const-string v8, "web_risk_url_safe"

    .line 62
    .line 63
    invoke-static {v7, v4, v6, v8}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    new-instance v9, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-eqz v10, :cond_1

    .line 81
    .line 82
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    move-object v11, v10

    .line 87
    check-cast v11, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    invoke-static {v11, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    if-eqz v11, :cond_0

    .line 98
    .line 99
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_2

    .line 108
    .line 109
    goto/16 :goto_3

    .line 110
    .line 111
    :cond_2
    :try_start_0
    iget-object v5, v5, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 112
    .line 113
    new-instance v6, Lch/e;

    .line 114
    .line 115
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    new-instance v9, Lfh/k;

    .line 119
    .line 120
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const/4 v10, 0x5

    .line 128
    invoke-virtual {v9, v10, v0}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v9, v3}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 132
    .line 133
    .line 134
    iput-object v9, v6, Lch/e;->h:Lfh/k;

    .line 135
    .line 136
    invoke-virtual {v5, v6}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    new-instance v3, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_4

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    check-cast v5, Lhh/o;

    .line 160
    .line 161
    invoke-virtual {p0, v5}, Lr9/d0;->O0(Lhh/o;)Ljava/lang/reflect/Method;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    if-eqz v5, :cond_3

    .line 166
    .line 167
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    new-instance v3, Lsf/f;

    .line 173
    .line 174
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    :cond_4
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-nez v0, :cond_5

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_5
    const-string v3, "DexKit\u5b9a\u4f4d\u5931\u8d25: "

    .line 185
    .line 186
    invoke-virtual {v3, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    iget-object v5, p0, Lr9/d0;->b:Lia/t;

    .line 191
    .line 192
    invoke-virtual {v5, v3, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 196
    .line 197
    :goto_2
    move-object v9, v3

    .line 198
    check-cast v9, Ljava/util/List;

    .line 199
    .line 200
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_6

    .line 205
    .line 206
    sget-object v0, Le8/b;->a:Le8/b;

    .line 207
    .line 208
    invoke-virtual {v0, v7, v4, v8, v9}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_6
    const-string v0, "cache.key"

    .line 213
    .line 214
    :try_start_1
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    const-string v5, ""

    .line 219
    .line 220
    invoke-interface {v7, v0, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-static {v5, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    if-nez v5, :cond_7

    .line 229
    .line 230
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-interface {v5, v0, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 235
    .line 236
    .line 237
    :cond_7
    invoke-interface {v3, v8}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 242
    .line 243
    .line 244
    :catchall_1
    :goto_3
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    const/4 v4, 0x1

    .line 253
    if-eqz v3, :cond_b

    .line 254
    .line 255
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    move-object v5, v3

    .line 260
    check-cast v5, Ljava/lang/reflect/Method;

    .line 261
    .line 262
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 267
    .line 268
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    if-nez v6, :cond_a

    .line 273
    .line 274
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    const-class v6, Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    if-eqz v5, :cond_9

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_9
    move v5, v1

    .line 288
    goto :goto_5

    .line 289
    :cond_a
    :goto_4
    move v5, v4

    .line 290
    :goto_5
    if-eqz v5, :cond_8

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_b
    const/4 v3, 0x0

    .line 294
    :goto_6
    check-cast v3, Ljava/lang/reflect/Method;

    .line 295
    .line 296
    if-eqz v3, :cond_e

    .line 297
    .line 298
    new-instance v0, Lr9/c;

    .line 299
    .line 300
    const/4 v5, 0x3

    .line 301
    invoke-direct {v0, p0, v5}, Lr9/c;-><init>(Lr9/d0;I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0, v3, v0}, Lr9/d0;->C(Ljava/lang/reflect/Method;Lfg/l;)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-nez v0, :cond_c

    .line 309
    .line 310
    if-eqz v2, :cond_d

    .line 311
    .line 312
    :cond_c
    move v1, v4

    .line 313
    :cond_d
    return v1

    .line 314
    :cond_e
    return v2

    .line 315
    :cond_f
    return v1
.end method

.method public final J(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lr9/d0;->r:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/Boolean;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    const-string v1, "field_msgId"

    .line 21
    .line 22
    invoke-static {p1, v1}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const-string v1, "field_msgSvrId"

    .line 29
    .line 30
    invoke-static {p1, v1}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const-string v1, "field_type"

    .line 37
    .line 38
    invoke-static {p1, v1}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    const-string v1, "field_content"

    .line 45
    .line 46
    invoke-static {p1, v1}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v1, 0x0

    .line 55
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return v1
.end method

.method public final K(Ljava/lang/reflect/Method;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    array-length v0, p1

    .line 6
    const/4 v1, 0x3

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lt v0, v1, :cond_a

    .line 9
    .line 10
    array-length v0, p1

    .line 11
    move v1, v2

    .line 12
    :goto_0
    if-ge v1, v0, :cond_a

    .line 13
    .line 14
    aget-object v3, p1, v1

    .line 15
    .line 16
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x1

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    const-class v4, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v3, v2

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_1
    move v3, v5

    .line 37
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_9

    .line 46
    .line 47
    array-length v0, p1

    .line 48
    move v1, v2

    .line 49
    :goto_3
    if-ge v1, v0, :cond_a

    .line 50
    .line 51
    aget-object v3, p1, v1

    .line 52
    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    :cond_2
    move v3, v2

    .line 56
    goto :goto_7

    .line 57
    :cond_3
    invoke-virtual {p0, v3}, Lr9/d0;->t(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    if-eqz v4, :cond_4

    .line 62
    .line 63
    :goto_4
    move v3, v5

    .line 64
    goto :goto_7

    .line 65
    :cond_4
    :goto_5
    if-eqz v3, :cond_2

    .line 66
    .line 67
    const-class v4, Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_2

    .line 74
    .line 75
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-eqz v4, :cond_5

    .line 80
    .line 81
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_5

    .line 86
    .line 87
    goto :goto_6

    .line 88
    :cond_5
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_7

    .line 97
    .line 98
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    check-cast v6, Ljava/lang/reflect/Field;

    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    const-class v7, Landroid/view/View;

    .line 109
    .line 110
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_6

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_7
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    goto :goto_5

    .line 122
    :goto_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_8

    .line 131
    .line 132
    return v5

    .line 133
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_a
    return v2
.end method

.method public final O0(Lhh/o;)Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lr9/d0;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    new-instance v0, Lsf/f;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p1, v0

    .line 17
    :goto_0
    nop

    .line 18
    instance-of v0, p1, Lsf/f;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    :cond_0
    check-cast p1, Ljava/lang/reflect/Method;

    .line 24
    .line 25
    return-object p1
.end method

.method public final T(Ljava/lang/String;Ljava/lang/Object;Landroid/view/View;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lr9/d0;->B:Lr9/z;

    .line 2
    .line 3
    iget-object v0, v0, Lr9/z;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "|"

    .line 14
    .line 15
    invoke-static {p1, v2, v1, v2, v0}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lr9/d0;->t:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v1, p0, Lr9/d0;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-static {p2, v1}, Lr9/d0;->p(Ljava/lang/Object;Ljava/util/concurrent/ConcurrentHashMap;)Landroid/widget/TextView;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    move v1, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v1, v2

    .line 41
    :goto_0
    invoke-virtual {p0, p2}, Lr9/d0;->o(Ljava/lang/Object;)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-nez v4, :cond_4

    .line 46
    .line 47
    invoke-static {p3, v3}, Lr9/d0;->n(Landroid/view/View;Z)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-static {p3, v2}, Lr9/d0;->n(Landroid/view/View;Z)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :goto_1
    if-eqz v4, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move v4, v2

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    :goto_2
    move v4, v3

    .line 64
    :goto_3
    iget-object v5, p0, Lr9/d0;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 65
    .line 66
    invoke-static {p2, v5}, Lr9/d0;->q(Ljava/lang/Object;Ljava/util/concurrent/ConcurrentHashMap;)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    if-eqz v5, :cond_5

    .line 71
    .line 72
    move v2, v3

    .line 73
    :cond_5
    iget-object v3, p0, Lr9/d0;->b:Lia/t;

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    const-string v5, " holder="

    .line 92
    .line 93
    const-string v6, " root="

    .line 94
    .line 95
    const-string v7, "\u6d88\u606f\u8be6\u60c5\u7ed1\u5b9a\u5931\u8d25 reason="

    .line 96
    .line 97
    invoke-static {v7, p1, v5, p2, v6}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const-string p2, " position="

    .line 102
    .line 103
    const-string v5, " time="

    .line 104
    .line 105
    invoke-static {p1, p3, p2, v0, v5}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string p2, " avatar="

    .line 109
    .line 110
    const-string p3, " clickArea="

    .line 111
    .line 112
    invoke-static {p1, v1, p2, v4, p3}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const/4 p2, 0x0

    .line 123
    invoke-virtual {v3, p1, p2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final V([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lr9/d0;->u(Ljava/lang/Object;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    move v4, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v4, v1

    .line 21
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object v2, v0

    .line 33
    :goto_1
    if-eqz v2, :cond_2

    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_2
    array-length v2, p1

    .line 37
    move v4, v1

    .line 38
    :goto_2
    if-ge v4, v2, :cond_5

    .line 39
    .line 40
    aget-object v5, p1, v4

    .line 41
    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0, v5}, Lr9/d0;->u(Ljava/lang/Object;)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    if-eqz v6, :cond_3

    .line 49
    .line 50
    move v6, v3

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    move v6, v1

    .line 53
    :goto_3
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    return-object v5

    .line 64
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_5
    return-object v0
.end method

.method public final W(Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/widget/TextView;)Landroid/view/View;
    .locals 11

    .line 1
    invoke-virtual {p0, p1}, Lr9/d0;->u(Ljava/lang/Object;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    iget-object v0, p0, Lr9/d0;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-static {p1, v0}, Lr9/d0;->q(Ljava/lang/Object;Ljava/util/concurrent/ConcurrentHashMap;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lr9/d0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const/4 v6, 0x1

    .line 22
    const/4 v7, 0x0

    .line 23
    if-nez v4, :cond_7

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v4}, Lr9/d0;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    new-instance v5, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    if-eqz v8, :cond_1

    .line 47
    .line 48
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    move-object v9, v8

    .line 53
    check-cast v9, Ljava/lang/reflect/Field;

    .line 54
    .line 55
    const-class v10, Landroid/view/View;

    .line 56
    .line 57
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v10, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-eqz v9, :cond_0

    .line 66
    .line 67
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_5

    .line 85
    .line 86
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    move-object v9, v8

    .line 91
    check-cast v9, Ljava/lang/reflect/Field;

    .line 92
    .line 93
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 101
    .line 102
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    const-string v10, "timetv"

    .line 110
    .line 111
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-nez v10, :cond_4

    .line 116
    .line 117
    const-string v10, "avatariv"

    .line 118
    .line 119
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-nez v10, :cond_4

    .line 124
    .line 125
    const-string v10, "usertv"

    .line 126
    .line 127
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-nez v10, :cond_4

    .line 132
    .line 133
    const-string v10, "clickarea"

    .line 134
    .line 135
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-nez v10, :cond_4

    .line 140
    .line 141
    const-string v10, "time"

    .line 142
    .line 143
    invoke-static {v9, v10, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-nez v10, :cond_4

    .line 148
    .line 149
    const-string v10, "avatar"

    .line 150
    .line 151
    invoke-static {v9, v10, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    if-nez v10, :cond_4

    .line 156
    .line 157
    const-string v10, "click"

    .line 158
    .line 159
    invoke-static {v9, v10, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-nez v10, :cond_4

    .line 164
    .line 165
    const-string v10, "history"

    .line 166
    .line 167
    invoke-static {v9, v10, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-nez v10, :cond_4

    .line 172
    .line 173
    const-string v10, "nomore"

    .line 174
    .line 175
    invoke-static {v9, v10, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    if-nez v10, :cond_4

    .line 180
    .line 181
    const-string v10, "mask"

    .line 182
    .line 183
    invoke-static {v9, v10, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    if-nez v10, :cond_4

    .line 188
    .line 189
    const-string v10, "checkbox"

    .line 190
    .line 191
    invoke-static {v9, v10, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    if-nez v10, :cond_4

    .line 196
    .line 197
    const-string v10, "check"

    .line 198
    .line 199
    invoke-static {v9, v10, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    if-eqz v9, :cond_3

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_3
    move v9, v7

    .line 207
    goto :goto_3

    .line 208
    :cond_4
    :goto_2
    move v9, v6

    .line 209
    :goto_3
    if-nez v9, :cond_2

    .line 210
    .line 211
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto/16 :goto_1

    .line 215
    .line 216
    :cond_5
    invoke-virtual {v1, v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-nez v0, :cond_6

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_6
    move-object v4, v0

    .line 224
    :cond_7
    :goto_4
    check-cast v4, Ljava/util/List;

    .line 225
    .line 226
    new-instance v0, Ldg/n;

    .line 227
    .line 228
    const/4 v1, 0x6

    .line 229
    invoke-direct {v0, v4, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 230
    .line 231
    .line 232
    new-instance v1, Lc9/k1;

    .line 233
    .line 234
    const/16 v4, 0x17

    .line 235
    .line 236
    invoke-direct {v1, p1, v4}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 237
    .line 238
    .line 239
    invoke-static {v0, v1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-static {p1}, Lng/m;->S(Lng/j;)Lng/c;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    new-instance v0, Lc9/k;

    .line 248
    .line 249
    move-object v4, p0

    .line 250
    move-object v5, p2

    .line 251
    move-object v1, p3

    .line 252
    invoke-direct/range {v0 .. v5}, Lc9/k;-><init>(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lr9/d0;Landroid/view/ViewGroup;)V

    .line 253
    .line 254
    .line 255
    new-instance p2, Lng/i;

    .line 256
    .line 257
    invoke-direct {p2, p1, v6, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 258
    .line 259
    .line 260
    new-instance p1, Lng/h;

    .line 261
    .line 262
    invoke-direct {p1, p2}, Lng/h;-><init>(Lng/i;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1}, Lng/h;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result p2

    .line 269
    const/4 p3, 0x0

    .line 270
    if-nez p2, :cond_8

    .line 271
    .line 272
    move-object p2, p3

    .line 273
    goto :goto_5

    .line 274
    :cond_8
    invoke-virtual {p1}, Lng/h;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    invoke-virtual {p1}, Lng/h;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-nez v0, :cond_9

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_9
    move-object v0, p2

    .line 286
    check-cast v0, Landroid/view/View;

    .line 287
    .line 288
    invoke-static {v0}, Lr9/d0;->P0(Landroid/view/View;)I

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :cond_a
    invoke-virtual {p1}, Lng/h;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    move-object v2, v1

    .line 301
    check-cast v2, Landroid/view/View;

    .line 302
    .line 303
    invoke-static {v2}, Lr9/d0;->P0(Landroid/view/View;)I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-virtual {v0, v2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-gez v3, :cond_b

    .line 316
    .line 317
    move-object p2, v1

    .line 318
    move-object v0, v2

    .line 319
    :cond_b
    invoke-virtual {p1}, Lng/h;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-nez v1, :cond_a

    .line 324
    .line 325
    :goto_5
    check-cast p2, Landroid/view/View;

    .line 326
    .line 327
    if-eqz p2, :cond_d

    .line 328
    .line 329
    invoke-static {p2}, Lr9/d0;->P0(Landroid/view/View;)I

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    if-lez p1, :cond_c

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_c
    move v6, v7

    .line 337
    :goto_6
    if-eqz v6, :cond_d

    .line 338
    .line 339
    return-object p2

    .line 340
    :cond_d
    return-object p3
.end method

.method public final X(Ljava/lang/Object;Ljava/lang/Integer;Z)Lr9/f0;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v1, Lr9/d0;->B:Lr9/z;

    .line 6
    .line 7
    iget-object v3, v0, Lr9/z;->d:Ljava/util/Set;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    if-nez p3, :cond_5

    .line 12
    .line 13
    move-object v0, v3

    .line 14
    check-cast v0, Ljava/lang/Iterable;

    .line 15
    .line 16
    instance-of v6, v0, Ljava/util/Collection;

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    move-object v6, v0

    .line 21
    check-cast v6, Ljava/util/Collection;

    .line 22
    .line 23
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_4

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Ljava/lang/String;

    .line 45
    .line 46
    const-string v7, "atUserList"

    .line 47
    .line 48
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-nez v7, :cond_3

    .line 53
    .line 54
    const-string v7, "rawAtUserList"

    .line 55
    .line 56
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-nez v7, :cond_3

    .line 61
    .line 62
    const-string v7, "mentionedUsers"

    .line 63
    .line 64
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move v6, v5

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    :goto_0
    move v6, v4

    .line 74
    :goto_1
    if-eqz v6, :cond_1

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    :goto_2
    move v6, v5

    .line 78
    goto :goto_4

    .line 79
    :cond_5
    :goto_3
    move v6, v4

    .line 80
    :goto_4
    if-nez p3, :cond_7

    .line 81
    .line 82
    if-eqz v6, :cond_6

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_6
    move v7, v5

    .line 86
    goto :goto_6

    .line 87
    :cond_7
    :goto_5
    move v7, v4

    .line 88
    :goto_6
    const-string v8, ""

    .line 89
    .line 90
    if-eqz v7, :cond_8

    .line 91
    .line 92
    const-string v0, "field_content"

    .line 93
    .line 94
    const-string v9, "content"

    .line 95
    .line 96
    const-string v10, "getContent"

    .line 97
    .line 98
    invoke-virtual {v1, v2, v10, v0, v9}, Lr9/d0;->n0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    move-object v9, v0

    .line 103
    goto :goto_7

    .line 104
    :cond_8
    move-object v9, v8

    .line 105
    :goto_7
    if-eqz p3, :cond_9

    .line 106
    .line 107
    const-string v0, "field_talker"

    .line 108
    .line 109
    const-string v10, "talker"

    .line 110
    .line 111
    const-string v11, "getTalker"

    .line 112
    .line 113
    invoke-virtual {v1, v2, v11, v0, v10}, Lr9/d0;->n0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    move-object v15, v0

    .line 118
    goto :goto_8

    .line 119
    :cond_9
    move-object v15, v8

    .line 120
    :goto_8
    if-eqz v6, :cond_15

    .line 121
    .line 122
    const-string v0, "field_msgSource"

    .line 123
    .line 124
    const-string v11, "msgSource"

    .line 125
    .line 126
    const-string v12, "getMsgSource"

    .line 127
    .line 128
    invoke-virtual {v1, v2, v12, v0, v11}, Lr9/d0;->n0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-eqz v11, :cond_14

    .line 137
    .line 138
    const-string v0, "field_lvbuffer"

    .line 139
    .line 140
    const-string v11, "lvbuffer"

    .line 141
    .line 142
    const-string v12, "getLvBuffer"

    .line 143
    .line 144
    invoke-virtual {v1, v2, v12, v0, v11}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    instance-of v11, v0, [B

    .line 149
    .line 150
    if-eqz v11, :cond_a

    .line 151
    .line 152
    check-cast v0, [B

    .line 153
    .line 154
    goto :goto_9

    .line 155
    :cond_a
    const/4 v0, 0x0

    .line 156
    :goto_9
    if-eqz v0, :cond_13

    .line 157
    .line 158
    array-length v11, v0

    .line 159
    const/16 v12, 0x9

    .line 160
    .line 161
    if-lt v11, v12, :cond_13

    .line 162
    .line 163
    array-length v11, v0

    .line 164
    const-string v12, "Array is empty."

    .line 165
    .line 166
    if-eqz v11, :cond_12

    .line 167
    .line 168
    aget-byte v11, v0, v5

    .line 169
    .line 170
    const/16 v13, 0x7b

    .line 171
    .line 172
    if-ne v11, v13, :cond_13

    .line 173
    .line 174
    array-length v11, v0

    .line 175
    if-eqz v11, :cond_11

    .line 176
    .line 177
    array-length v11, v0

    .line 178
    sub-int/2addr v11, v4

    .line 179
    aget-byte v11, v0, v11

    .line 180
    .line 181
    const/16 v12, 0x7d

    .line 182
    .line 183
    if-eq v11, v12, :cond_b

    .line 184
    .line 185
    goto/16 :goto_d

    .line 186
    .line 187
    :cond_b
    :try_start_0
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 192
    .line 193
    .line 194
    invoke-static {v0}, Lr9/d0;->l0(Ljava/nio/ByteBuffer;)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    if-eqz v11, :cond_c

    .line 199
    .line 200
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    if-ge v12, v11, :cond_d

    .line 209
    .line 210
    :cond_c
    :goto_a
    move-object v0, v8

    .line 211
    goto :goto_b

    .line 212
    :cond_d
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    add-int/2addr v12, v11

    .line 217
    invoke-virtual {v0, v12}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    const/4 v12, 0x4

    .line 225
    if-ge v11, v12, :cond_e

    .line 226
    .line 227
    goto :goto_a

    .line 228
    :cond_e
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    add-int/2addr v11, v12

    .line 233
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 234
    .line 235
    .line 236
    invoke-static {v0}, Lr9/d0;->l0(Ljava/nio/ByteBuffer;)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    if-eqz v11, :cond_c

    .line 241
    .line 242
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    if-eqz v11, :cond_c

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 249
    .line 250
    .line 251
    move-result v12

    .line 252
    if-ge v12, v11, :cond_f

    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_f
    new-array v11, v11, [B

    .line 256
    .line 257
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 258
    .line 259
    .line 260
    new-instance v0, Ljava/lang/String;

    .line 261
    .line 262
    sget-object v12, Log/a;->a:Ljava/nio/charset/Charset;

    .line 263
    .line 264
    invoke-direct {v0, v11, v12}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 265
    .line 266
    .line 267
    goto :goto_b

    .line 268
    :catchall_0
    move-exception v0

    .line 269
    new-instance v11, Lsf/f;

    .line 270
    .line 271
    invoke-direct {v11, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    move-object v0, v11

    .line 275
    :goto_b
    nop

    .line 276
    instance-of v11, v0, Lsf/f;

    .line 277
    .line 278
    if-eqz v11, :cond_10

    .line 279
    .line 280
    move-object v0, v8

    .line 281
    :cond_10
    check-cast v0, Ljava/lang/String;

    .line 282
    .line 283
    goto :goto_e

    .line 284
    :cond_11
    invoke-static {v12}, Lj8/o;->l(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :goto_c
    const/4 v0, 0x0

    .line 288
    return-object v0

    .line 289
    :cond_12
    invoke-static {v12}, Lj8/o;->l(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    goto :goto_c

    .line 293
    :cond_13
    :goto_d
    move-object v0, v8

    .line 294
    :cond_14
    :goto_e
    move-object/from16 v19, v0

    .line 295
    .line 296
    goto :goto_f

    .line 297
    :cond_15
    move-object/from16 v19, v8

    .line 298
    .line 299
    :goto_f
    if-eqz v7, :cond_16

    .line 300
    .line 301
    invoke-static {v9}, Lr9/d0;->L0(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    move-object/from16 v18, v0

    .line 306
    .line 307
    goto :goto_10

    .line 308
    :cond_16
    move-object/from16 v18, v8

    .line 309
    .line 310
    :goto_10
    const-string v0, "msgSvrId"

    .line 311
    .line 312
    const-wide/16 v11, 0x0

    .line 313
    .line 314
    if-nez p3, :cond_18

    .line 315
    .line 316
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-eqz v7, :cond_17

    .line 321
    .line 322
    goto :goto_11

    .line 323
    :cond_17
    move-wide v13, v11

    .line 324
    goto :goto_12

    .line 325
    :cond_18
    :goto_11
    const-string v7, "getMsgSvrId"

    .line 326
    .line 327
    const-string v13, "field_msgSvrId"

    .line 328
    .line 329
    invoke-virtual {v1, v2, v7, v13, v0}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-static {v0}, Lr9/d0;->i0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    if-eqz v0, :cond_17

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 340
    .line 341
    .line 342
    move-result-wide v13

    .line 343
    :goto_12
    const-string v0, "msgId"

    .line 344
    .line 345
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eqz v0, :cond_19

    .line 350
    .line 351
    invoke-virtual/range {p0 .. p1}, Lr9/d0;->Y(Ljava/lang/Object;)J

    .line 352
    .line 353
    .line 354
    move-result-wide v16

    .line 355
    goto :goto_13

    .line 356
    :cond_19
    move-wide/from16 v16, v11

    .line 357
    .line 358
    :goto_13
    const-string v0, "time"

    .line 359
    .line 360
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-nez v0, :cond_1b

    .line 365
    .line 366
    const-string v0, "relativeTime"

    .line 367
    .line 368
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_1a

    .line 373
    .line 374
    goto :goto_15

    .line 375
    :cond_1a
    :goto_14
    move-wide/from16 v22, v11

    .line 376
    .line 377
    goto :goto_16

    .line 378
    :cond_1b
    :goto_15
    const-string v0, "field_createTime"

    .line 379
    .line 380
    const-string v3, "createTime"

    .line 381
    .line 382
    const-string v7, "getCreateTime"

    .line 383
    .line 384
    invoke-virtual {v1, v2, v7, v0, v3}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v0}, Lr9/d0;->i0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    if-eqz v0, :cond_1a

    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 395
    .line 396
    .line 397
    move-result-wide v11

    .line 398
    goto :goto_14

    .line 399
    :goto_16
    new-instance v0, Lr9/f0;

    .line 400
    .line 401
    const/4 v3, 0x2

    .line 402
    if-eqz p2, :cond_1c

    .line 403
    .line 404
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v7

    .line 408
    :goto_17
    move v10, v7

    .line 409
    goto :goto_19

    .line 410
    :cond_1c
    const-string v7, "getType"

    .line 411
    .line 412
    const-string v11, "field_type"

    .line 413
    .line 414
    const-string v12, "type"

    .line 415
    .line 416
    invoke-virtual {v1, v2, v7, v11, v12}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    invoke-static {v7}, Lr9/d0;->h0(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 421
    .line 422
    .line 423
    move-result-object v7

    .line 424
    if-eqz v7, :cond_1d

    .line 425
    .line 426
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 427
    .line 428
    .line 429
    move-result v7

    .line 430
    goto :goto_17

    .line 431
    :cond_1d
    filled-new-array {v11, v12}, [Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    move v11, v5

    .line 436
    :goto_18
    if-ge v11, v3, :cond_1f

    .line 437
    .line 438
    aget-object v12, v7, v11

    .line 439
    .line 440
    invoke-static {v2, v12}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v12

    .line 444
    instance-of v10, v12, Ljava/lang/Number;

    .line 445
    .line 446
    if-eqz v10, :cond_1e

    .line 447
    .line 448
    check-cast v12, Ljava/lang/Number;

    .line 449
    .line 450
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 451
    .line 452
    .line 453
    move-result v7

    .line 454
    goto :goto_17

    .line 455
    :cond_1e
    add-int/lit8 v11, v11, 0x1

    .line 456
    .line 457
    goto :goto_18

    .line 458
    :cond_1f
    move v7, v5

    .line 459
    goto :goto_17

    .line 460
    :goto_19
    const-string v7, "@chatroom"

    .line 461
    .line 462
    invoke-static {v15, v7, v5}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 463
    .line 464
    .line 465
    move-result v7

    .line 466
    if-eqz v7, :cond_20

    .line 467
    .line 468
    const-string v7, ":\n"

    .line 469
    .line 470
    const/4 v11, 0x6

    .line 471
    invoke-static {v9, v7, v5, v5, v11}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 472
    .line 473
    .line 474
    move-result v7

    .line 475
    if-lez v7, :cond_20

    .line 476
    .line 477
    invoke-virtual {v9, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    goto :goto_1a

    .line 482
    :cond_20
    move-object v7, v15

    .line 483
    :goto_1a
    if-eqz v6, :cond_2d

    .line 484
    .line 485
    invoke-static/range {v19 .. v19}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    if-eqz v6, :cond_21

    .line 490
    .line 491
    move-object v6, v9

    .line 492
    goto :goto_1b

    .line 493
    :cond_21
    move-object/from16 v6, v19

    .line 494
    .line 495
    :goto_1b
    sget-object v11, Lr9/d0;->H:Log/k;

    .line 496
    .line 497
    invoke-static {v11, v6}, Log/k;->b(Log/k;Ljava/lang/String;)Log/i;

    .line 498
    .line 499
    .line 500
    move-result-object v11

    .line 501
    if-eqz v11, :cond_25

    .line 502
    .line 503
    invoke-virtual {v11}, Log/i;->a()Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object v12

    .line 507
    invoke-static {v4, v12}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v12

    .line 511
    check-cast v12, Ljava/lang/String;

    .line 512
    .line 513
    if-nez v12, :cond_22

    .line 514
    .line 515
    move-object v12, v8

    .line 516
    :cond_22
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 517
    .line 518
    .line 519
    move-result v21

    .line 520
    if-eqz v21, :cond_24

    .line 521
    .line 522
    invoke-virtual {v11}, Log/i;->a()Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v11

    .line 526
    invoke-static {v3, v11}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v11

    .line 530
    check-cast v11, Ljava/lang/String;

    .line 531
    .line 532
    if-nez v11, :cond_23

    .line 533
    .line 534
    move-object v12, v8

    .line 535
    goto :goto_1c

    .line 536
    :cond_23
    move-object v12, v11

    .line 537
    :cond_24
    :goto_1c
    invoke-static {v12}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 538
    .line 539
    .line 540
    move-result-object v11

    .line 541
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v11

    .line 545
    goto :goto_1d

    .line 546
    :cond_25
    const/4 v11, 0x0

    .line 547
    :goto_1d
    if-nez v11, :cond_26

    .line 548
    .line 549
    move-object v11, v8

    .line 550
    :cond_26
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 551
    .line 552
    .line 553
    move-result v12

    .line 554
    if-nez v12, :cond_27

    .line 555
    .line 556
    :goto_1e
    move-object v8, v11

    .line 557
    goto :goto_21

    .line 558
    :cond_27
    sget-object v11, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 559
    .line 560
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    const-string v11, ".msgsource.atuserlist"

    .line 564
    .line 565
    invoke-static {v6, v11}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v11

    .line 569
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 570
    .line 571
    .line 572
    move-result v12

    .line 573
    if-nez v12, :cond_28

    .line 574
    .line 575
    goto :goto_1f

    .line 576
    :cond_28
    const/4 v11, 0x0

    .line 577
    :goto_1f
    if-eqz v11, :cond_29

    .line 578
    .line 579
    goto :goto_1e

    .line 580
    :cond_29
    const-string v11, "atuserlist"

    .line 581
    .line 582
    invoke-static {v6, v11}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v11

    .line 586
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 587
    .line 588
    .line 589
    move-result v12

    .line 590
    if-nez v12, :cond_2a

    .line 591
    .line 592
    move-object/from16 v20, v11

    .line 593
    .line 594
    goto :goto_20

    .line 595
    :cond_2a
    const/16 v20, 0x0

    .line 596
    .line 597
    :goto_20
    if-eqz v20, :cond_2b

    .line 598
    .line 599
    move-object/from16 v8, v20

    .line 600
    .line 601
    goto :goto_21

    .line 602
    :cond_2b
    const-string v11, "announcement@all"

    .line 603
    .line 604
    invoke-static {v6, v11, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 605
    .line 606
    .line 607
    move-result v12

    .line 608
    if-eqz v12, :cond_2c

    .line 609
    .line 610
    goto :goto_1e

    .line 611
    :cond_2c
    const-string v11, "notify@all"

    .line 612
    .line 613
    invoke-static {v6, v11, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 614
    .line 615
    .line 616
    move-result v6

    .line 617
    if-eqz v6, :cond_2d

    .line 618
    .line 619
    goto :goto_1e

    .line 620
    :cond_2d
    :goto_21
    move-object/from16 v20, v8

    .line 621
    .line 622
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    move-result-object v6

    .line 626
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v21

    .line 630
    const-string v6, "isSend"

    .line 631
    .line 632
    const-string v8, "field_isSend"

    .line 633
    .line 634
    invoke-virtual {v1, v2, v6, v8, v6}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v11

    .line 638
    invoke-static {v11}, Lr9/d0;->h0(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 639
    .line 640
    .line 641
    move-result-object v11

    .line 642
    if-eqz v11, :cond_2e

    .line 643
    .line 644
    :goto_22
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    goto :goto_24

    .line 649
    :cond_2e
    const-string v11, "getIsSend"

    .line 650
    .line 651
    invoke-virtual {v1, v2, v11, v8, v6}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v11

    .line 655
    invoke-static {v11}, Lr9/d0;->h0(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 656
    .line 657
    .line 658
    move-result-object v11

    .line 659
    if-eqz v11, :cond_2f

    .line 660
    .line 661
    goto :goto_22

    .line 662
    :cond_2f
    filled-new-array {v8, v6}, [Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v6

    .line 666
    move v8, v5

    .line 667
    :goto_23
    if-ge v8, v3, :cond_31

    .line 668
    .line 669
    aget-object v11, v6, v8

    .line 670
    .line 671
    invoke-static {v2, v11}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v11

    .line 675
    instance-of v12, v11, Ljava/lang/Number;

    .line 676
    .line 677
    if-eqz v12, :cond_30

    .line 678
    .line 679
    check-cast v11, Ljava/lang/Number;

    .line 680
    .line 681
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 682
    .line 683
    .line 684
    move-result v2

    .line 685
    goto :goto_24

    .line 686
    :cond_30
    add-int/lit8 v8, v8, 0x1

    .line 687
    .line 688
    goto :goto_23

    .line 689
    :cond_31
    move v2, v5

    .line 690
    :goto_24
    if-ne v2, v4, :cond_32

    .line 691
    .line 692
    move/from16 v24, v4

    .line 693
    .line 694
    :goto_25
    move-wide/from16 v11, v16

    .line 695
    .line 696
    move-object/from16 v16, v7

    .line 697
    .line 698
    move-object/from16 v17, v9

    .line 699
    .line 700
    move-object v9, v0

    .line 701
    goto :goto_26

    .line 702
    :cond_32
    move/from16 v24, v5

    .line 703
    .line 704
    goto :goto_25

    .line 705
    :goto_26
    invoke-direct/range {v9 .. v24}, Lr9/f0;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V

    .line 706
    .line 707
    .line 708
    return-object v9
.end method

.method public final Y(Ljava/lang/Object;)J
    .locals 12

    .line 1
    const-string v0, "getMsgId"

    .line 2
    .line 3
    const-string v1, "field_msgId"

    .line 4
    .line 5
    const-string v2, "msgId"

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0, v1, v2}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lr9/d0;->i0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    const-wide/16 v6, 0x0

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v8

    .line 26
    cmp-long v8, v8, v6

    .line 27
    .line 28
    if-lez v8, :cond_0

    .line 29
    .line 30
    move v8, v5

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v8, v4

    .line 33
    :goto_0
    if-eqz v8, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v0, v3

    .line 37
    :goto_1
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    return-wide v0

    .line 44
    :cond_2
    const-string v0, "getMsgID"

    .line 45
    .line 46
    const-string v8, "msgID"

    .line 47
    .line 48
    const-string v9, "id"

    .line 49
    .line 50
    invoke-virtual {p0, p1, v0, v8, v9}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lr9/d0;->i0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v10

    .line 64
    cmp-long v10, v10, v6

    .line 65
    .line 66
    if-lez v10, :cond_3

    .line 67
    .line 68
    move v10, v5

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move v10, v4

    .line 71
    :goto_2
    if-eqz v10, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move-object v0, v3

    .line 75
    :goto_3
    if-eqz v0, :cond_5

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    return-wide v0

    .line 82
    :cond_5
    const-string v0, "getId"

    .line 83
    .line 84
    invoke-virtual {p0, p1, v0, v9, v1}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v0}, Lr9/d0;->i0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_8

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v10

    .line 98
    cmp-long v10, v10, v6

    .line 99
    .line 100
    if-lez v10, :cond_6

    .line 101
    .line 102
    move v10, v5

    .line 103
    goto :goto_4

    .line 104
    :cond_6
    move v10, v4

    .line 105
    :goto_4
    if-eqz v10, :cond_7

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_7
    move-object v0, v3

    .line 109
    :goto_5
    if-eqz v0, :cond_8

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    return-wide v0

    .line 116
    :cond_8
    const-string v0, ""

    .line 117
    .line 118
    invoke-virtual {p0, p1, v0, v1, v2}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v1}, Lr9/d0;->i0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-eqz v1, :cond_b

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide v10

    .line 132
    cmp-long v2, v10, v6

    .line 133
    .line 134
    if-lez v2, :cond_9

    .line 135
    .line 136
    move v2, v5

    .line 137
    goto :goto_6

    .line 138
    :cond_9
    move v2, v4

    .line 139
    :goto_6
    if-eqz v2, :cond_a

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_a
    move-object v1, v3

    .line 143
    :goto_7
    if-eqz v1, :cond_b

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 146
    .line 147
    .line 148
    move-result-wide v0

    .line 149
    return-wide v0

    .line 150
    :cond_b
    invoke-virtual {p0, p1, v0, v8, v9}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-static {p1}, Lr9/d0;->i0(Ljava/lang/Object;)Ljava/lang/Long;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-eqz p1, :cond_e

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 161
    .line 162
    .line 163
    move-result-wide v0

    .line 164
    cmp-long v0, v0, v6

    .line 165
    .line 166
    if-lez v0, :cond_c

    .line 167
    .line 168
    move v4, v5

    .line 169
    :cond_c
    if-eqz v4, :cond_d

    .line 170
    .line 171
    move-object v3, p1

    .line 172
    :cond_d
    if-eqz v3, :cond_e

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 175
    .line 176
    .line 177
    move-result-wide v0

    .line 178
    return-wide v0

    .line 179
    :cond_e
    return-wide v6
.end method

.method public final Z(Ljava/lang/Class;)Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Lr9/d0;->s:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    invoke-static {p1}, Lr9/d0;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    move-object v4, v3

    .line 36
    check-cast v4, Ljava/lang/reflect/Field;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-nez v5, :cond_2

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_2

    .line 53
    .line 54
    const-class v5, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_2

    .line 61
    .line 62
    const-class v5, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_2

    .line 69
    .line 70
    const/4 v4, 0x1

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/4 v4, 0x0

    .line 73
    :goto_1
    if-eqz v4, :cond_1

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-object v2
.end method

.method public final a0()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lr9/d0;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 15
    .line 16
    return-object v0
.end method

.method public final e(Landroid/widget/TextView;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lr9/d0;->B:Lr9/z;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 19
    .line 20
    and-int/lit8 v0, v0, 0x30

    .line 21
    .line 22
    const/16 v2, 0x20

    .line 23
    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    iget v0, v1, Lr9/z;->l:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget v0, v1, Lr9/z;->k:I

    .line 30
    .line 31
    :goto_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eq v1, v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lr9/d0;->B:Lr9/z;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 58
    .line 59
    and-int/lit8 v0, v0, 0x30

    .line 60
    .line 61
    if-ne v0, v2, :cond_2

    .line 62
    .line 63
    iget v0, v1, Lr9/z;->n:I

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget v0, v1, Lr9/z;->m:I

    .line 67
    .line 68
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    instance-of v2, v1, Landroid/graphics/drawable/ColorDrawable;

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    check-cast v1, Landroid/graphics/drawable/ColorDrawable;

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    move-object v1, v3

    .line 81
    :goto_2
    if-eqz v1, :cond_4

    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :cond_4
    if-nez v3, :cond_5

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eq v1, v0, :cond_7

    .line 99
    .line 100
    :goto_3
    if-nez v3, :cond_6

    .line 101
    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    :cond_6
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 105
    .line 106
    .line 107
    :cond_7
    return-void
.end method

.method public final e0(Landroid/app/Activity;)V
    .locals 4

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lq8/m;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    :cond_1
    const-string v1, "@chatroom"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    const-string v3, "@im.chatroom"

    .line 27
    .line 28
    invoke-static {v0, v3, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p1}, Lr9/d0;->j(Landroid/app/Activity;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_4

    .line 40
    .line 41
    invoke-static {v3, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_4

    .line 46
    .line 47
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    iget-object v1, p0, Lr9/d0;->a:Lr8/g;

    .line 55
    .line 56
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 57
    .line 58
    const-string v2, "com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI"

    .line 59
    .line 60
    invoke-static {v2, v1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    new-instance v2, Landroid/content/Intent;

    .line 67
    .line 68
    invoke-direct {v2, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    const-string v1, "RoomInfo_Id"

    .line 72
    .line 73
    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    const-string v0, "room_member"

    .line 77
    .line 78
    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    const-string v0, "title"

    .line 82
    .line 83
    const-string v1, "\u67e5\u770b\u7fa4\u6210\u5458\u6d88\u606f\u5386\u53f2"

    .line 84
    .line 85
    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_1
    return-void
.end method

.method public final g(ILjava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Z
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    invoke-virtual {v1, v3}, Lr9/d0;->V([Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-eqz v4, :cond_26

    .line 14
    .line 15
    invoke-virtual {v1, v4}, Lr9/d0;->u(Ljava/lang/Object;)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    if-eqz v6, :cond_26

    .line 20
    .line 21
    iget-object v10, v1, Lr9/d0;->x:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-static {v6, v10}, Lr9/d0;->h(Landroid/view/View;Ljava/util/WeakHashMap;)V

    .line 24
    .line 25
    .line 26
    const/4 v11, 0x1

    .line 27
    const/4 v12, 0x0

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-static {v11, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v12

    .line 36
    :goto_0
    invoke-virtual {v1, v0}, Lr9/d0;->x0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v13, 0x2

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    goto/16 :goto_16

    .line 44
    .line 45
    :cond_1
    if-eqz v3, :cond_6

    .line 46
    .line 47
    invoke-static {v13, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    instance-of v5, v0, Ljava/lang/Integer;

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    check-cast v0, Ljava/lang/Integer;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v0, v12

    .line 59
    :goto_1
    if-eqz v0, :cond_3

    .line 60
    .line 61
    :goto_2
    move-object v5, v0

    .line 62
    goto :goto_5

    .line 63
    :cond_3
    array-length v0, v3

    .line 64
    const/4 v5, 0x0

    .line 65
    :goto_3
    if-ge v5, v0, :cond_5

    .line 66
    .line 67
    aget-object v7, v3, v5

    .line 68
    .line 69
    instance-of v14, v7, Ljava/lang/Integer;

    .line 70
    .line 71
    if-eqz v14, :cond_4

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    move-object v7, v12

    .line 78
    :goto_4
    instance-of v0, v7, Ljava/lang/Integer;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    move-object v0, v7

    .line 83
    check-cast v0, Ljava/lang/Integer;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_6
    move-object v5, v12

    .line 87
    :goto_5
    if-eqz v2, :cond_24

    .line 88
    .line 89
    if-nez v5, :cond_7

    .line 90
    .line 91
    goto/16 :goto_15

    .line 92
    .line 93
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v7, v1, Lr9/d0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 98
    .line 99
    invoke-virtual {v7, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Ljava/lang/reflect/Field;

    .line 104
    .line 105
    const-class v14, Ljava/lang/Object;

    .line 106
    .line 107
    if-eqz v0, :cond_8

    .line 108
    .line 109
    invoke-static {v0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_8

    .line 114
    .line 115
    move-object/from16 v18, v5

    .line 116
    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    goto/16 :goto_d

    .line 120
    .line 121
    :cond_8
    iget-object v0, v1, Lr9/d0;->E:Ljava/lang/Class;

    .line 122
    .line 123
    if-eqz v0, :cond_9

    .line 124
    .line 125
    move-object/from16 v18, v5

    .line 126
    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    goto/16 :goto_9

    .line 130
    .line 131
    :cond_9
    invoke-virtual {v1}, Lr9/d0;->a0()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v15, v1, Lr9/d0;->a:Lr8/g;

    .line 136
    .line 137
    iget-object v13, v15, Lr8/g;->a:Landroid/content/Context;

    .line 138
    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    iget-object v9, v15, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 142
    .line 143
    const-string v11, "Hchat_extra_class_cache"

    .line 144
    .line 145
    invoke-static {v13, v11}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    const-string v13, "_chatting_data_adapter"

    .line 150
    .line 151
    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    invoke-interface {v11, v13, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_a

    .line 160
    .line 161
    invoke-static {v0, v9}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-eqz v0, :cond_a

    .line 166
    .line 167
    iput-object v0, v1, Lr9/d0;->E:Ljava/lang/Class;

    .line 168
    .line 169
    move-object/from16 v18, v5

    .line 170
    .line 171
    goto/16 :goto_9

    .line 172
    .line 173
    :cond_a
    :try_start_0
    iget-object v0, v15, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 174
    .line 175
    new-instance v15, Lch/c;

    .line 176
    .line 177
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 178
    .line 179
    .line 180
    new-instance v12, Lfh/a;

    .line 181
    .line 182
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v3, "MicroMsg.ChattingDataAdapterV3"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 186
    .line 187
    move-object/from16 v18, v5

    .line 188
    .line 189
    :try_start_1
    const-string v5, "[handleMsgChange] isLockNotify:"

    .line 190
    .line 191
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-static {v12, v3}, Lfh/a;->r0(Lfh/a;Ljava/util/Collection;)V

    .line 200
    .line 201
    .line 202
    iput-object v12, v15, Lch/c;->h:Lfh/a;

    .line 203
    .line 204
    invoke-virtual {v0, v15}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Lhh/e;->a()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Lhh/i;

    .line 213
    .line 214
    if-eqz v0, :cond_b

    .line 215
    .line 216
    invoke-virtual {v0}, Lhh/i;->p()Llh/a;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget-object v0, v0, Llh/a;->g:Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v0, v9}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 226
    goto :goto_7

    .line 227
    :catchall_0
    move-exception v0

    .line 228
    goto :goto_6

    .line 229
    :cond_b
    const/4 v0, 0x0

    .line 230
    goto :goto_7

    .line 231
    :catchall_1
    move-exception v0

    .line 232
    move-object/from16 v18, v5

    .line 233
    .line 234
    :goto_6
    new-instance v3, Lsf/f;

    .line 235
    .line 236
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    move-object v0, v3

    .line 240
    :goto_7
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    if-nez v3, :cond_c

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_c
    iget-object v0, v1, Lr9/d0;->b:Lia/t;

    .line 248
    .line 249
    const-string v5, "Hchat\u804a\u5929\u6d88\u606fAdapter\u5b9a\u4f4d\u5931\u8d25"

    .line 250
    .line 251
    invoke-virtual {v0, v5, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    const/4 v0, 0x0

    .line 255
    :goto_8
    check-cast v0, Ljava/lang/Class;

    .line 256
    .line 257
    if-eqz v0, :cond_d

    .line 258
    .line 259
    iput-object v0, v1, Lr9/d0;->E:Ljava/lang/Class;

    .line 260
    .line 261
    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-interface {v3, v13, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 274
    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_d
    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-interface {v3, v13}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 286
    .line 287
    .line 288
    :goto_9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    :goto_a
    if-eqz v3, :cond_11

    .line 293
    .line 294
    invoke-virtual {v3, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    if-nez v5, :cond_11

    .line 299
    .line 300
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    :cond_e
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    if-eqz v9, :cond_10

    .line 313
    .line 314
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v9

    .line 318
    check-cast v9, Ljava/lang/reflect/Field;

    .line 319
    .line 320
    if-eqz v0, :cond_f

    .line 321
    .line 322
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    invoke-virtual {v0, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    if-nez v11, :cond_f

    .line 331
    .line 332
    goto :goto_b

    .line 333
    :cond_f
    invoke-static {v9, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    if-eqz v11, :cond_e

    .line 338
    .line 339
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    invoke-static {v12}, Lr9/d0;->z(Ljava/lang/Class;)Z

    .line 344
    .line 345
    .line 346
    move-result v12

    .line 347
    if-eqz v12, :cond_e

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v7, v0, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-object v0, v11

    .line 357
    goto :goto_d

    .line 358
    :cond_10
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    goto :goto_a

    .line 363
    :cond_11
    if-eqz v0, :cond_13

    .line 364
    .line 365
    :cond_12
    const/4 v0, 0x0

    .line 366
    goto :goto_d

    .line 367
    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    :goto_c
    if-eqz v0, :cond_12

    .line 372
    .line 373
    invoke-virtual {v0, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    if-nez v3, :cond_12

    .line 378
    .line 379
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    :cond_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    if-eqz v5, :cond_15

    .line 392
    .line 393
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    check-cast v5, Ljava/lang/reflect/Field;

    .line 398
    .line 399
    invoke-static {v5, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    if-eqz v9, :cond_14

    .line 404
    .line 405
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    move-result-object v11

    .line 409
    invoke-static {v11}, Lr9/d0;->z(Ljava/lang/Class;)Z

    .line 410
    .line 411
    .line 412
    move-result v11

    .line 413
    if-eqz v11, :cond_14

    .line 414
    .line 415
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-virtual {v7, v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-object v0, v9

    .line 423
    goto :goto_d

    .line 424
    :cond_15
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    goto :goto_c

    .line 429
    :goto_d
    if-eqz v0, :cond_24

    .line 430
    .line 431
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-gez v3, :cond_16

    .line 436
    .line 437
    const/4 v0, 0x0

    .line 438
    goto/16 :goto_14

    .line 439
    .line 440
    :cond_16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    iget-object v9, v1, Lr9/d0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 445
    .line 446
    invoke-virtual {v9, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    check-cast v5, Ljava/lang/reflect/Method;

    .line 451
    .line 452
    if-eqz v5, :cond_17

    .line 453
    .line 454
    filled-new-array/range {v18 .. v18}, [Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    invoke-static {v5, v0, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    goto/16 :goto_14

    .line 463
    .line 464
    :cond_17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    move-result-object v5

    .line 468
    :goto_e
    if-eqz v5, :cond_1d

    .line 469
    .line 470
    invoke-virtual {v5, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v11

    .line 474
    if-nez v11, :cond_1d

    .line 475
    .line 476
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v11

    .line 480
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 481
    .line 482
    .line 483
    move-result-object v11

    .line 484
    :goto_f
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 485
    .line 486
    .line 487
    move-result v12

    .line 488
    if-eqz v12, :cond_1a

    .line 489
    .line 490
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v12

    .line 494
    move-object v13, v12

    .line 495
    check-cast v13, Ljava/lang/reflect/Method;

    .line 496
    .line 497
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    move-result-object v15

    .line 501
    array-length v15, v15

    .line 502
    const/4 v2, 0x1

    .line 503
    if-ne v15, v2, :cond_19

    .line 504
    .line 505
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    aget-object v2, v2, v16

    .line 510
    .line 511
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 512
    .line 513
    invoke-static {v2, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    if-nez v2, :cond_18

    .line 518
    .line 519
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    aget-object v2, v2, v16

    .line 524
    .line 525
    invoke-static {v2, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    if-eqz v2, :cond_19

    .line 530
    .line 531
    :cond_18
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    const-string v15, "J0"

    .line 536
    .line 537
    invoke-static {v2, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    if-nez v2, :cond_1b

    .line 542
    .line 543
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    const-string v15, "getItem"

    .line 548
    .line 549
    invoke-static {v2, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v2

    .line 553
    if-nez v2, :cond_1b

    .line 554
    .line 555
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    const-string v13, "get"

    .line 560
    .line 561
    invoke-static {v2, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v2

    .line 565
    if-eqz v2, :cond_19

    .line 566
    .line 567
    goto :goto_10

    .line 568
    :cond_19
    move-object/from16 v2, p2

    .line 569
    .line 570
    goto :goto_f

    .line 571
    :cond_1a
    const/4 v12, 0x0

    .line 572
    :cond_1b
    :goto_10
    check-cast v12, Ljava/lang/reflect/Method;

    .line 573
    .line 574
    if-eqz v12, :cond_1c

    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-virtual {v9, v2, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    filled-new-array/range {v18 .. v18}, [Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-static {v12, v0, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    if-eqz v2, :cond_1c

    .line 592
    .line 593
    :goto_11
    move-object v0, v2

    .line 594
    goto/16 :goto_14

    .line 595
    .line 596
    :cond_1c
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    move-result-object v5

    .line 600
    move-object/from16 v2, p2

    .line 601
    .line 602
    goto/16 :goto_e

    .line 603
    .line 604
    :cond_1d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    invoke-virtual {v7, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    check-cast v2, Ljava/lang/reflect/Field;

    .line 613
    .line 614
    if-eqz v2, :cond_1e

    .line 615
    .line 616
    invoke-static {v2, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    invoke-static {v3, v2}, Lr9/d0;->R(ILjava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    if-eqz v2, :cond_1e

    .line 625
    .line 626
    goto :goto_11

    .line 627
    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    :goto_12
    if-eqz v2, :cond_23

    .line 632
    .line 633
    invoke-virtual {v2, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v5

    .line 637
    if-nez v5, :cond_23

    .line 638
    .line 639
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 640
    .line 641
    .line 642
    move-result-object v5

    .line 643
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 644
    .line 645
    .line 646
    move-result-object v5

    .line 647
    :cond_1f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 648
    .line 649
    .line 650
    move-result v9

    .line 651
    if-eqz v9, :cond_20

    .line 652
    .line 653
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v9

    .line 657
    move-object v11, v9

    .line 658
    check-cast v11, Ljava/lang/reflect/Field;

    .line 659
    .line 660
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v12

    .line 664
    const-string v13, "K"

    .line 665
    .line 666
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    move-result v12

    .line 670
    if-nez v12, :cond_21

    .line 671
    .line 672
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v12

    .line 676
    const-string v13, "items"

    .line 677
    .line 678
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v12

    .line 682
    if-nez v12, :cond_21

    .line 683
    .line 684
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v12

    .line 688
    const-string v13, "data"

    .line 689
    .line 690
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    move-result v12

    .line 694
    if-nez v12, :cond_21

    .line 695
    .line 696
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v11

    .line 700
    const-string v12, "list"

    .line 701
    .line 702
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v11

    .line 706
    if-eqz v11, :cond_1f

    .line 707
    .line 708
    goto :goto_13

    .line 709
    :cond_20
    const/4 v9, 0x0

    .line 710
    :cond_21
    :goto_13
    check-cast v9, Ljava/lang/reflect/Field;

    .line 711
    .line 712
    if-eqz v9, :cond_22

    .line 713
    .line 714
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    invoke-virtual {v7, v2, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    invoke-static {v9, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-static {v3, v0}, Lr9/d0;->R(ILjava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    goto :goto_14

    .line 730
    :cond_22
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    goto :goto_12

    .line 735
    :cond_23
    new-instance v2, Ljava/util/WeakHashMap;

    .line 736
    .line 737
    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 738
    .line 739
    .line 740
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    check-cast v2, Ljava/util/Set;

    .line 748
    .line 749
    move/from16 v5, v16

    .line 750
    .line 751
    invoke-virtual {v1, v0, v3, v2, v5}, Lr9/d0;->s(Ljava/lang/Object;ILjava/util/Set;I)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    :goto_14
    invoke-virtual {v1, v0}, Lr9/d0;->x0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    goto :goto_16

    .line 760
    :cond_24
    :goto_15
    const/4 v0, 0x0

    .line 761
    :goto_16
    if-nez v0, :cond_28

    .line 762
    .line 763
    const/4 v2, 0x2

    .line 764
    if-lt v8, v2, :cond_25

    .line 765
    .line 766
    const/4 v3, 0x0

    .line 767
    invoke-virtual {v1, v6, v3}, Lr9/d0;->u0(Landroid/view/View;Landroid/widget/TextView;)V

    .line 768
    .line 769
    .line 770
    const-string v0, "message"

    .line 771
    .line 772
    invoke-virtual {v1, v0, v4, v6}, Lr9/d0;->T(Ljava/lang/String;Ljava/lang/Object;Landroid/view/View;)V

    .line 773
    .line 774
    .line 775
    :cond_25
    if-lt v8, v2, :cond_27

    .line 776
    .line 777
    :cond_26
    :goto_17
    const/4 v3, 0x0

    .line 778
    goto/16 :goto_23

    .line 779
    .line 780
    :cond_27
    const/16 v17, 0x1

    .line 781
    .line 782
    add-int/lit8 v4, v8, 0x1

    .line 783
    .line 784
    new-instance v0, Lr9/d;

    .line 785
    .line 786
    move-object/from16 v2, p2

    .line 787
    .line 788
    move-object/from16 v5, p3

    .line 789
    .line 790
    move-object/from16 v3, p4

    .line 791
    .line 792
    invoke-direct/range {v0 .. v5}, Lr9/d;-><init>(Lr9/d0;Ljava/lang/Object;[Ljava/lang/Object;ILjava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    invoke-static {v6, v6, v10, v0}, Lr9/d0;->A0(Landroid/view/View;Landroid/view/View;Ljava/util/WeakHashMap;Lfg/a;)Z

    .line 796
    .line 797
    .line 798
    goto :goto_17

    .line 799
    :cond_28
    move-object/from16 v5, p3

    .line 800
    .line 801
    const-string v2, "getType"

    .line 802
    .line 803
    const-string v3, "field_type"

    .line 804
    .line 805
    const-string v7, "type"

    .line 806
    .line 807
    invoke-virtual {v1, v0, v2, v3, v7}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    invoke-static {v2}, Lr9/d0;->h0(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 812
    .line 813
    .line 814
    move-result-object v2

    .line 815
    if-eqz v2, :cond_29

    .line 816
    .line 817
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 818
    .line 819
    .line 820
    move-result v2

    .line 821
    goto :goto_19

    .line 822
    :cond_29
    filled-new-array {v3, v7}, [Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    const/4 v3, 0x0

    .line 827
    :goto_18
    const/4 v7, 0x2

    .line 828
    if-ge v3, v7, :cond_2b

    .line 829
    .line 830
    aget-object v7, v2, v3

    .line 831
    .line 832
    invoke-static {v0, v7}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v7

    .line 836
    instance-of v9, v7, Ljava/lang/Number;

    .line 837
    .line 838
    if-eqz v9, :cond_2a

    .line 839
    .line 840
    check-cast v7, Ljava/lang/Number;

    .line 841
    .line 842
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    goto :goto_19

    .line 847
    :cond_2a
    add-int/lit8 v3, v3, 0x1

    .line 848
    .line 849
    goto :goto_18

    .line 850
    :cond_2b
    const/4 v2, 0x0

    .line 851
    :goto_19
    const/16 v3, 0x2712

    .line 852
    .line 853
    const/16 v7, 0x2710

    .line 854
    .line 855
    if-gtz v2, :cond_2c

    .line 856
    .line 857
    goto :goto_1a

    .line 858
    :cond_2c
    and-int/lit16 v9, v2, 0xff

    .line 859
    .line 860
    const v11, 0xffff

    .line 861
    .line 862
    .line 863
    and-int/2addr v11, v2

    .line 864
    ushr-int/lit8 v12, v2, 0x10

    .line 865
    .line 866
    if-nez v12, :cond_2d

    .line 867
    .line 868
    goto :goto_1a

    .line 869
    :cond_2d
    if-eq v11, v7, :cond_2f

    .line 870
    .line 871
    if-eq v11, v3, :cond_2f

    .line 872
    .line 873
    if-eqz v9, :cond_2e

    .line 874
    .line 875
    if-ne v11, v9, :cond_2e

    .line 876
    .line 877
    goto :goto_1b

    .line 878
    :cond_2e
    :goto_1a
    move v9, v2

    .line 879
    goto :goto_1b

    .line 880
    :cond_2f
    move v9, v11

    .line 881
    :goto_1b
    if-eq v9, v7, :cond_30

    .line 882
    .line 883
    if-ne v9, v3, :cond_31

    .line 884
    .line 885
    :cond_30
    move-object v7, v6

    .line 886
    const/4 v3, 0x0

    .line 887
    goto/16 :goto_22

    .line 888
    .line 889
    :cond_31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    const/4 v3, 0x0

    .line 894
    invoke-virtual {v1, v0, v2, v3}, Lr9/d0;->X(Ljava/lang/Object;Ljava/lang/Integer;Z)Lr9/f0;

    .line 895
    .line 896
    .line 897
    move-result-object v7

    .line 898
    iget-object v2, v1, Lr9/d0;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 899
    .line 900
    if-eqz v5, :cond_34

    .line 901
    .line 902
    invoke-static {v5, v2}, Lr9/d0;->p(Ljava/lang/Object;Ljava/util/concurrent/ConcurrentHashMap;)Landroid/widget/TextView;

    .line 903
    .line 904
    .line 905
    move-result-object v3

    .line 906
    if-eqz v3, :cond_32

    .line 907
    .line 908
    invoke-static {v3, v6}, Lr9/d0;->P(Landroid/view/View;Landroid/view/View;)Z

    .line 909
    .line 910
    .line 911
    move-result v3

    .line 912
    goto :goto_1c

    .line 913
    :cond_32
    const/4 v3, 0x0

    .line 914
    :goto_1c
    if-eqz v3, :cond_33

    .line 915
    .line 916
    goto :goto_1d

    .line 917
    :cond_33
    const/4 v5, 0x0

    .line 918
    :goto_1d
    if-eqz v5, :cond_34

    .line 919
    .line 920
    goto :goto_20

    .line 921
    :cond_34
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v3

    .line 925
    if-eqz v3, :cond_36

    .line 926
    .line 927
    invoke-static {v3, v2}, Lr9/d0;->p(Ljava/lang/Object;Ljava/util/concurrent/ConcurrentHashMap;)Landroid/widget/TextView;

    .line 928
    .line 929
    .line 930
    move-result-object v5

    .line 931
    if-eqz v5, :cond_35

    .line 932
    .line 933
    invoke-static {v5, v6}, Lr9/d0;->P(Landroid/view/View;Landroid/view/View;)Z

    .line 934
    .line 935
    .line 936
    move-result v5

    .line 937
    goto :goto_1e

    .line 938
    :cond_35
    const/4 v5, 0x0

    .line 939
    :goto_1e
    if-eqz v5, :cond_36

    .line 940
    .line 941
    goto :goto_1f

    .line 942
    :cond_36
    const/4 v3, 0x0

    .line 943
    :goto_1f
    if-eqz v3, :cond_37

    .line 944
    .line 945
    move-object v5, v3

    .line 946
    goto :goto_20

    .line 947
    :cond_37
    move-object v5, v4

    .line 948
    :goto_20
    invoke-static {v5, v2}, Lr9/d0;->p(Ljava/lang/Object;Ljava/util/concurrent/ConcurrentHashMap;)Landroid/widget/TextView;

    .line 949
    .line 950
    .line 951
    move-result-object v3

    .line 952
    const/4 v4, 0x0

    .line 953
    move-object v2, v6

    .line 954
    move-object v6, v0

    .line 955
    invoke-virtual/range {v1 .. v7}, Lr9/d0;->E(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Object;Ljava/lang/Object;Lr9/f0;)Z

    .line 956
    .line 957
    .line 958
    move-result v6

    .line 959
    move-object v7, v2

    .line 960
    move-object v9, v3

    .line 961
    if-nez v6, :cond_3a

    .line 962
    .line 963
    const/4 v2, 0x2

    .line 964
    if-lt v8, v2, :cond_38

    .line 965
    .line 966
    const/4 v3, 0x0

    .line 967
    invoke-virtual {v1, v7, v3}, Lr9/d0;->u0(Landroid/view/View;Landroid/widget/TextView;)V

    .line 968
    .line 969
    .line 970
    const-string v0, "layout"

    .line 971
    .line 972
    invoke-virtual {v1, v0, v5, v7}, Lr9/d0;->T(Ljava/lang/String;Ljava/lang/Object;Landroid/view/View;)V

    .line 973
    .line 974
    .line 975
    :cond_38
    if-lt v8, v2, :cond_39

    .line 976
    .line 977
    goto :goto_21

    .line 978
    :cond_39
    const/16 v17, 0x1

    .line 979
    .line 980
    add-int/lit8 v4, v8, 0x1

    .line 981
    .line 982
    new-instance v0, Lr9/d;

    .line 983
    .line 984
    move-object/from16 v2, p2

    .line 985
    .line 986
    move-object/from16 v3, p4

    .line 987
    .line 988
    invoke-direct/range {v0 .. v5}, Lr9/d;-><init>(Lr9/d0;Ljava/lang/Object;[Ljava/lang/Object;ILjava/lang/Object;)V

    .line 989
    .line 990
    .line 991
    invoke-static {v7, v7, v10, v0}, Lr9/d0;->A0(Landroid/view/View;Landroid/view/View;Ljava/util/WeakHashMap;Lfg/a;)Z

    .line 992
    .line 993
    .line 994
    :cond_3a
    :goto_21
    if-eqz v9, :cond_3b

    .line 995
    .line 996
    const/4 v3, 0x0

    .line 997
    invoke-virtual {v9, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 998
    .line 999
    .line 1000
    :cond_3b
    if-eqz v9, :cond_3c

    .line 1001
    .line 1002
    const/4 v3, 0x0

    .line 1003
    invoke-virtual {v9, v3}, Landroid/view/View;->setClickable(Z)V

    .line 1004
    .line 1005
    .line 1006
    :cond_3c
    return v6

    .line 1007
    :goto_22
    invoke-virtual {v1, v7, v3}, Lr9/d0;->u0(Landroid/view/View;Landroid/widget/TextView;)V

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v1, v7, v3}, Lr9/d0;->y0(Landroid/view/View;Landroid/widget/RelativeLayout;)V

    .line 1011
    .line 1012
    .line 1013
    const/16 v17, 0x1

    .line 1014
    .line 1015
    return v17

    .line 1016
    :goto_23
    return v3
.end method

.method public final m0()Lr9/z;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    const-string v0, "message_details_position"

    .line 6
    .line 7
    const-string v3, "message_bottom"

    .line 8
    .line 9
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const v5, -0x22f5dec9

    .line 20
    .line 21
    .line 22
    if-eq v4, v5, :cond_2

    .line 23
    .line 24
    const v5, -0x22e67635

    .line 25
    .line 26
    .line 27
    if-eq v4, v5, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v4, "avatar_below"

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v7, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const-string v4, "avatar_above"

    .line 42
    .line 43
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    :cond_3
    :goto_0
    move-object v7, v3

    .line 50
    :goto_1
    const-string v0, "message_details_format"

    .line 51
    .line 52
    const-string v3, "${time}"

    .line 53
    .line 54
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v4, ""

    .line 59
    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    move-object v0, v4

    .line 63
    :cond_4
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_5

    .line 68
    .line 69
    move-object v8, v3

    .line 70
    goto :goto_2

    .line 71
    :cond_5
    move-object v8, v0

    .line 72
    :goto_2
    const-string v0, "message_details_time_format"

    .line 73
    .line 74
    const-string v3, "HH:mm:ss"

    .line 75
    .line 76
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-nez v0, :cond_6

    .line 81
    .line 82
    move-object v0, v4

    .line 83
    :cond_6
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_7
    move-object v3, v0

    .line 91
    :goto_3
    :try_start_0
    invoke-static {v3}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 92
    .line 93
    .line 94
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    goto :goto_4

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    new-instance v3, Lsf/f;

    .line 98
    .line 99
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    move-object v0, v3

    .line 103
    :goto_4
    nop

    .line 104
    instance-of v3, v0, Lsf/f;

    .line 105
    .line 106
    if-eqz v3, :cond_8

    .line 107
    .line 108
    sget-object v0, Lr9/d0;->I:Ljava/time/format/DateTimeFormatter;

    .line 109
    .line 110
    :cond_8
    move-object v10, v0

    .line 111
    check-cast v10, Ljava/time/format/DateTimeFormatter;

    .line 112
    .line 113
    const-string v0, "message_details_light_text"

    .line 114
    .line 115
    const-string v3, "#FFFF0000"

    .line 116
    .line 117
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-nez v0, :cond_9

    .line 122
    .line 123
    move-object v0, v4

    .line 124
    :cond_9
    const-string v5, "message_details_dark_text"

    .line 125
    .line 126
    invoke-interface {v2, v5, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    if-nez v5, :cond_a

    .line 131
    .line 132
    move-object v5, v4

    .line 133
    :cond_a
    const-string v6, "message_details_light_bg"

    .line 134
    .line 135
    const-string v9, "#00000000"

    .line 136
    .line 137
    invoke-interface {v2, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    if-nez v6, :cond_b

    .line 142
    .line 143
    move-object v6, v4

    .line 144
    :cond_b
    const-string v11, "message_details_dark_bg"

    .line 145
    .line 146
    invoke-interface {v2, v11, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    if-nez v11, :cond_c

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_c
    move-object v4, v11

    .line 154
    :goto_5
    new-instance v11, Lr9/z;

    .line 155
    .line 156
    const-string v12, "message_details_enable"

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    invoke-interface {v2, v12, v13}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    sget-object v14, Lr9/d0;->G:Log/k;

    .line 164
    .line 165
    invoke-static {v14, v8}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    new-instance v15, Lr9/p;

    .line 170
    .line 171
    invoke-direct {v15, v13}, Lr9/p;-><init>(I)V

    .line 172
    .line 173
    .line 174
    invoke-static {v14, v15}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    invoke-static {v13}, Lng/m;->c0(Lng/j;)Ljava/util/Set;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    const-string v14, "message_details_text_size"

    .line 186
    .line 187
    const/16 v15, 0xa

    .line 188
    .line 189
    invoke-interface {v2, v14, v15}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    int-to-float v14, v14

    .line 194
    const-string v15, "message_details_avatar_gap"

    .line 195
    .line 196
    const/4 v1, 0x2

    .line 197
    invoke-interface {v2, v15, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    const/16 v15, 0x40

    .line 202
    .line 203
    move-object/from16 v17, v7

    .line 204
    .line 205
    const/4 v7, 0x0

    .line 206
    invoke-static {v1, v7, v15}, Lr9/e0;->r(III)I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    const-string v7, "message_details_left_margin"

    .line 211
    .line 212
    invoke-interface {v2, v7, v15}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    move/from16 v18, v1

    .line 217
    .line 218
    const-string v1, "message_details_right_margin"

    .line 219
    .line 220
    invoke-interface {v2, v1, v15}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    const-string v15, "message_details_click_show"

    .line 225
    .line 226
    move/from16 v19, v1

    .line 227
    .line 228
    const/4 v1, 0x1

    .line 229
    invoke-interface {v2, v15, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 230
    .line 231
    .line 232
    move-result v15

    .line 233
    const/high16 v1, -0x10000

    .line 234
    .line 235
    const/4 v2, 0x0

    .line 236
    invoke-static {v1, v0, v3, v5, v3}, Lr9/d0;->v0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v16

    .line 240
    invoke-static {v1, v5, v3, v0, v3}, Lr9/d0;->v0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    move v1, v12

    .line 245
    move/from16 v12, v18

    .line 246
    .line 247
    invoke-static {v2, v6, v9, v4, v9}, Lr9/d0;->v0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    move-result v18

    .line 251
    invoke-static {v2, v4, v9, v6, v9}, Lr9/d0;->v0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    move v6, v1

    .line 256
    move-object v5, v11

    .line 257
    move-object v9, v13

    .line 258
    move v11, v14

    .line 259
    move/from16 v14, v19

    .line 260
    .line 261
    move/from16 v19, v2

    .line 262
    .line 263
    move v13, v7

    .line 264
    move-object/from16 v7, v17

    .line 265
    .line 266
    move/from16 v17, v0

    .line 267
    .line 268
    invoke-direct/range {v5 .. v19}, Lr9/z;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/time/format/DateTimeFormatter;FIIIZIIII)V

    .line 269
    .line 270
    .line 271
    return-object v5
.end method

.method public final n0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lr9/d0;->o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of p2, p1, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_1
    const-string p1, ""

    .line 17
    .line 18
    return-object p1
.end method

.method public final o(Ljava/lang/Object;)Landroid/view/View;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lr9/d0;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/reflect/Field;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of v0, p1, Landroid/view/View;

    .line 21
    .line 22
    if-eqz v0, :cond_8

    .line 23
    .line 24
    check-cast p1, Landroid/view/View;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lr9/d0;->m(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v3, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    move-object v5, v4

    .line 55
    check-cast v5, Ljava/lang/reflect/Field;

    .line 56
    .line 57
    const-class v6, Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_4

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    move-object v5, v4

    .line 88
    check-cast v5, Ljava/lang/reflect/Field;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const-string v6, "avatarIV"

    .line 95
    .line 96
    invoke-static {v5, v6}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move-object v4, v2

    .line 104
    :goto_1
    check-cast v4, Ljava/lang/reflect/Field;

    .line 105
    .line 106
    if-eqz v4, :cond_5

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_7

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    move-object v4, v3

    .line 124
    check-cast v4, Ljava/lang/reflect/Field;

    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    const-string v5, "avatar"

    .line 134
    .line 135
    const/4 v6, 0x1

    .line 136
    invoke-static {v4, v5, v6}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_6

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    move-object v3, v2

    .line 144
    :goto_2
    move-object v4, v3

    .line 145
    check-cast v4, Ljava/lang/reflect/Field;

    .line 146
    .line 147
    if-eqz v4, :cond_8

    .line 148
    .line 149
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v1, v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    invoke-static {v4, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    instance-of v0, p1, Landroid/view/View;

    .line 161
    .line 162
    if-eqz v0, :cond_8

    .line 163
    .line 164
    check-cast p1, Landroid/view/View;

    .line 165
    .line 166
    return-object p1

    .line 167
    :cond_8
    return-object v2
.end method

.method public final o0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lr9/w;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p2, p3, p4}, Lr9/w;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lr9/d0;->q:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lr9/v;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v2, Lr9/v;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    new-array v5, v3, [Ljava/lang/Class;

    .line 29
    .line 30
    invoke-static {v4, p2, v5}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v4, p3}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {v4, p4}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    invoke-direct {v2, p2, p3, p4}, Lr9/v;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-object p2, v2, Lr9/v;->a:Ljava/lang/reflect/Method;

    .line 57
    .line 58
    new-array p3, v3, [Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {p2, p1, p3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    return-object p2

    .line 67
    :cond_1
    iget-object p2, v2, Lr9/v;->b:Ljava/lang/reflect/Field;

    .line 68
    .line 69
    invoke-static {p2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-eqz p2, :cond_2

    .line 74
    .line 75
    return-object p2

    .line 76
    :cond_2
    iget-object p2, v2, Lr9/v;->c:Ljava/lang/reflect/Field;

    .line 77
    .line 78
    invoke-static {p2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1
.end method

.method public final p0()Ljava/lang/Integer;
    .locals 5

    .line 1
    iget-object v0, p0, Lr9/d0;->a:Lr8/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-string v3, "j6q"

    .line 11
    .line 12
    const-string v4, "id"

    .line 13
    .line 14
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v2, v3, v4, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v2, v1

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    new-instance v2, Lsf/f;

    .line 40
    .line 41
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    instance-of v0, v2, Lsf/f;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move-object v1, v2

    .line 50
    :goto_2
    check-cast v1, Ljava/lang/Integer;

    .line 51
    .line 52
    return-object v1
.end method

.method public final q0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v1, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    new-instance v5, Lsf/e;

    .line 49
    .line 50
    invoke-direct {v5, v4, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v1

    .line 58
    goto :goto_2

    .line 59
    :cond_0
    monitor-exit v0

    .line 60
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lsf/e;

    .line 75
    .line 76
    iget-object v2, v1, Lsf/e;->g:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Landroid/widget/TextView;

    .line 79
    .line 80
    iget-object v1, v1, Lsf/e;->h:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Lr9/y;

    .line 83
    .line 84
    new-instance v3, Lr8/b;

    .line 85
    .line 86
    const/4 v4, 0x2

    .line 87
    invoke-direct {v3, p0, v1, v2, v4}, Lr8/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    return-void

    .line 95
    :goto_2
    monitor-exit v0

    .line 96
    throw v1
.end method

.method public final r0(Landroid/widget/TextView;Z)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lr9/d0;->e(Landroid/widget/TextView;)V

    .line 5
    .line 6
    .line 7
    new-instance p2, Laa/c;

    .line 8
    .line 9
    const/16 v0, 0x1b

    .line 10
    .line 11
    invoke-direct {p2, p1, v0, p0}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lr9/d0;->z:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-static {p1, p1, v0, p2}, Lr9/d0;->A0(Landroid/view/View;Landroid/view/View;Ljava/util/WeakHashMap;Lfg/a;)Z

    .line 17
    .line 18
    .line 19
    new-instance p2, Lr9/l;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p2, p1, p0, v0}, Lr9/l;-><init>(Landroid/widget/TextView;Lr9/d0;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final s(Ljava/lang/Object;ILjava/util/Set;I)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p2, :cond_7

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-gt p4, v1, :cond_7

    .line 6
    .line 7
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    invoke-static {p2, p1}, Lr9/d0;->R(ILjava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lr9/d0;->x0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    move v4, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v4, v3

    .line 31
    :goto_0
    if-eqz v4, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object v1, v0

    .line 35
    :goto_1
    if-eqz v1, :cond_3

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v4, "java."

    .line 47
    .line 48
    invoke-static {v1, v4, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_7

    .line 53
    .line 54
    const-string v4, "android."

    .line 55
    .line 56
    invoke-static {v1, v4, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    instance-of v1, p1, Landroid/view/View;

    .line 64
    .line 65
    if-nez v1, :cond_7

    .line 66
    .line 67
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 68
    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p0, v1}, Lr9/d0;->Z(Ljava/lang/Class;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_7

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/reflect/Field;

    .line 95
    .line 96
    invoke-static {v3, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    add-int/lit8 v4, p4, 0x1

    .line 103
    .line 104
    invoke-virtual {p0, v3, p2, p3, v4}, Lr9/d0;->s(Ljava/lang/Object;ILjava/util/Set;I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-eqz v3, :cond_6

    .line 109
    .line 110
    return-object v3

    .line 111
    :cond_7
    :goto_2
    return-object v0
.end method

.method public final s0(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Object;Ljava/lang/Object;Lr9/f0;)V
    .locals 8

    .line 1
    iget-object v1, p0, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    new-instance v2, Lr9/y;

    .line 7
    .line 8
    move-object v3, p1

    .line 9
    move-object v4, p3

    .line 10
    move-object v5, p4

    .line 11
    move-object v6, p5

    .line 12
    move-object v7, p6

    .line 13
    invoke-direct/range {v2 .. v7}, Lr9/y;-><init>(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/Object;Ljava/lang/Object;Lr9/f0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit v1

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    monitor-exit v1

    .line 24
    throw p1
.end method

.method public final t(Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 8

    .line 1
    iget-object v0, p0, Lr9/d0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/reflect/Field;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    move-object v1, p1

    .line 13
    :goto_0
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    const-class v3, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_6

    .line 23
    .line 24
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_4

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, Ljava/lang/reflect/Field;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-string v7, "itemView"

    .line 50
    .line 51
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_3

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const-class v6, Landroid/view/View;

    .line 62
    .line 63
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 v5, 0x0

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    :goto_1
    const/4 v5, 0x1

    .line 73
    :goto_2
    if-eqz v5, :cond_1

    .line 74
    .line 75
    move-object v2, v4

    .line 76
    :cond_4
    check-cast v2, Ljava/lang/reflect/Field;

    .line 77
    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_0

    .line 89
    :cond_6
    return-object v2
.end method

.method public final t0(Landroid/view/View;Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    check-cast p1, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    :goto_0
    if-ltz v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eq v1, p2, :cond_1

    .line 21
    .line 22
    instance-of v2, v1, Landroid/widget/TextView;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "hchat_message_details_view"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object v2, p0, Lr9/d0;->y:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-static {v1, v2}, Lr9/d0;->h(Landroid/view/View;Ljava/util/WeakHashMap;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lr9/d0;->z:Ljava/util/WeakHashMap;

    .line 47
    .line 48
    invoke-static {v1, v2}, Lr9/d0;->h(Landroid/view/View;Ljava/util/WeakHashMap;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 52
    .line 53
    monitor-enter v2

    .line 54
    :try_start_0
    iget-object v3, p0, Lr9/d0;->v:Ljava/util/WeakHashMap;

    .line 55
    .line 56
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Lr9/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 61
    .line 62
    monitor-exit v2

    .line 63
    iget-object v2, p0, Lr9/d0;->u:Ljava/util/Set;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    monitor-enter v2

    .line 69
    :try_start_1
    iget-object v3, p0, Lr9/d0;->u:Ljava/util/Set;

    .line 70
    .line 71
    invoke-interface {v3, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    monitor-exit v2

    .line 75
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    monitor-exit v2

    .line 81
    throw p1

    .line 82
    :catchall_1
    move-exception p1

    .line 83
    monitor-exit v2

    .line 84
    throw p1

    .line 85
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v1, p2}, Lr9/d0;->t0(Landroid/view/View;Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    :goto_2
    return-void
.end method

.method public final u(Ljava/lang/Object;)Landroid/view/View;
    .locals 3

    .line 1
    const-string v0, "itemView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/view/View;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Landroid/view/View;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Lr9/d0;->t(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    instance-of v0, p1, Landroid/view/View;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p1, Landroid/view/View;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_2
    return-object v2
.end method

.method public final u0(Landroid/view/View;Landroid/widget/TextView;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lr9/d0;->t0(Landroid/view/View;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p1, Landroid/view/ViewGroup;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p1, v1

    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    :goto_1
    if-eqz p1, :cond_2

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    if-ge v0, v2, :cond_2

    .line 22
    .line 23
    invoke-static {p1}, Lr9/d0;->O(Landroid/view/ViewGroup;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Lr9/d0;->t0(Landroid/view/View;Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    instance-of v2, p1, Landroid/view/ViewGroup;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    check-cast p1, Landroid/view/ViewGroup;

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    move-object p1, v1

    .line 44
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    return-void
.end method

.method public final w0(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_7

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    if-gt p1, v1, :cond_7

    .line 6
    .line 7
    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p0, p2}, Lr9/d0;->J(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, p2}, Lr9/d0;->Y(Ljava/lang/Object;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const-wide/16 v4, 0x0

    .line 34
    .line 35
    cmp-long v2, v2, v4

    .line 36
    .line 37
    if-lez v2, :cond_1

    .line 38
    .line 39
    return-object p2

    .line 40
    :cond_1
    const-string v2, "java."

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_7

    .line 48
    .line 49
    const-string v2, "android."

    .line 50
    .line 51
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    instance-of v1, p2, Landroid/view/View;

    .line 59
    .line 60
    if-nez v1, :cond_7

    .line 61
    .line 62
    instance-of v1, p2, Landroid/view/ViewGroup;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_3
    instance-of v1, p2, Ljava/util/Collection;

    .line 68
    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    check-cast p2, Ljava/util/Collection;

    .line 72
    .line 73
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_7

    .line 82
    .line 83
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    add-int/lit8 v2, p1, 0x1

    .line 88
    .line 89
    invoke-virtual {p0, v2, v1, p3}, Lr9/d0;->w0(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p0, v1}, Lr9/d0;->Z(Ljava/lang/Class;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_7

    .line 113
    .line 114
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    check-cast v2, Ljava/lang/reflect/Field;

    .line 119
    .line 120
    invoke-static {v2, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    add-int/lit8 v3, p1, 0x1

    .line 127
    .line 128
    invoke-virtual {p0, v3, v2, p3}, Lr9/d0;->w0(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-eqz v2, :cond_6

    .line 133
    .line 134
    return-object v2

    .line 135
    :cond_7
    :goto_0
    return-object v0
.end method

.method public final x0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lr9/d0;->J(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lr9/d0;->Y(Ljava/lang/Object;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    check-cast v0, Ljava/util/Set;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {p0, v1, p1, v0}, Lr9/d0;->w0(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method public final y(Ljava/lang/Object;J)Landroid/widget/TextView;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    :cond_0
    move-object v5, v2

    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_1
    invoke-virtual {p0}, Lr9/d0;->p0()Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v4}, Lr9/d0;->b0(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Ljava/lang/reflect/Method;

    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    array-length v6, v6

    .line 44
    if-ne v6, v1, :cond_6

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    aget-object v6, v6, v0

    .line 51
    .line 52
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_6

    .line 59
    .line 60
    const-class v6, Landroid/view/View;

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :try_start_0
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 74
    .line 75
    .line 76
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    instance-of v6, v5, Landroid/widget/TextView;

    .line 85
    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    check-cast v5, Landroid/widget/TextView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catchall_0
    move-exception v5

    .line 92
    goto :goto_0

    .line 93
    :cond_4
    move-object v5, v2

    .line 94
    goto :goto_1

    .line 95
    :goto_0
    new-instance v6, Lsf/f;

    .line 96
    .line 97
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    move-object v5, v6

    .line 101
    :goto_1
    nop

    .line 102
    instance-of v6, v5, Lsf/f;

    .line 103
    .line 104
    if-eqz v6, :cond_5

    .line 105
    .line 106
    move-object v5, v2

    .line 107
    :cond_5
    check-cast v5, Landroid/widget/TextView;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    :goto_2
    move-object v5, v2

    .line 111
    :goto_3
    if-eqz v5, :cond_2

    .line 112
    .line 113
    :goto_4
    if-eqz v5, :cond_7

    .line 114
    .line 115
    return-object v5

    .line 116
    :cond_7
    if-eqz p1, :cond_8

    .line 117
    .line 118
    invoke-virtual {p0, p1}, Lr9/d0;->u(Ljava/lang/Object;)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    goto :goto_5

    .line 123
    :cond_8
    move-object p1, v2

    .line 124
    :goto_5
    instance-of v3, p1, Landroid/view/ViewGroup;

    .line 125
    .line 126
    if-eqz v3, :cond_9

    .line 127
    .line 128
    check-cast p1, Landroid/view/ViewGroup;

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_9
    move-object p1, v2

    .line 132
    :goto_6
    if-eqz p1, :cond_18

    .line 133
    .line 134
    :try_start_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    const-string v4, "j6q"

    .line 139
    .line 140
    const-string v5, "id"

    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v3, v4, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_a

    .line 155
    .line 156
    move-object v3, v2

    .line 157
    goto :goto_7

    .line 158
    :cond_a
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    check-cast v3, Landroid/widget/TextView;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :catchall_1
    move-exception v3

    .line 166
    new-instance v4, Lsf/f;

    .line 167
    .line 168
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    move-object v3, v4

    .line 172
    :goto_7
    nop

    .line 173
    instance-of v4, v3, Lsf/f;

    .line 174
    .line 175
    if-eqz v4, :cond_b

    .line 176
    .line 177
    move-object v3, v2

    .line 178
    :cond_b
    check-cast v3, Landroid/widget/TextView;

    .line 179
    .line 180
    if-eqz v3, :cond_c

    .line 181
    .line 182
    return-object v3

    .line 183
    :cond_c
    invoke-static {p2, p3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-static {v3, v4}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    const-string v5, "HH:mm"

    .line 200
    .line 201
    filled-new-array {v5}, [Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-static {v6}, Ltf/d0;->R([Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-virtual {v3}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-static {v7, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-nez v7, :cond_d

    .line 218
    .line 219
    const-string v7, "M\u6708d\u65e5 HH:mm"

    .line 220
    .line 221
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    invoke-virtual {v3}, Ljava/time/LocalDateTime;->getYear()I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    invoke-virtual {v4}, Ljava/time/LocalDate;->getYear()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eq v7, v4, :cond_d

    .line 233
    .line 234
    const-string v4, "yyyy\u5e74M\u6708d\u65e5 HH:mm"

    .line 235
    .line 236
    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    :cond_d
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 240
    .line 241
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_e

    .line 253
    .line 254
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    check-cast v7, Ljava/lang/String;

    .line 259
    .line 260
    invoke-static {v7}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    invoke-virtual {v3, v7}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_e
    new-instance v3, Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_f

    .line 290
    .line 291
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    check-cast v6, Ljava/lang/String;

    .line 296
    .line 297
    invoke-static {v6}, Lr9/d0;->c0(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_f
    new-instance v4, Ljava/util/ArrayList;

    .line 306
    .line 307
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    :cond_10
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    if-eqz v6, :cond_11

    .line 319
    .line 320
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    move-object v7, v6

    .line 325
    check-cast v7, Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    if-lez v7, :cond_10

    .line 332
    .line 333
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    goto :goto_a

    .line 337
    :cond_11
    invoke-static {v4}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    if-eqz v4, :cond_12

    .line 346
    .line 347
    move-object p2, v2

    .line 348
    goto :goto_b

    .line 349
    :cond_12
    invoke-static {p2, p3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 354
    .line 355
    .line 356
    move-result-object p3

    .line 357
    invoke-static {p2, p3}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 358
    .line 359
    .line 360
    move-result-object p2

    .line 361
    invoke-static {v5}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 362
    .line 363
    .line 364
    move-result-object p3

    .line 365
    invoke-virtual {p2, p3}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p2

    .line 369
    new-instance p3, Lm/b;

    .line 370
    .line 371
    const/16 v4, 0xa

    .line 372
    .line 373
    invoke-direct {p3, p0, v3, p2, v4}, Lm/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 374
    .line 375
    .line 376
    invoke-static {p1, p3}, Lr9/d0;->v(Landroid/view/View;Lm/b;)Landroid/widget/TextView;

    .line 377
    .line 378
    .line 379
    move-result-object p2

    .line 380
    :goto_b
    if-eqz p2, :cond_13

    .line 381
    .line 382
    return-object p2

    .line 383
    :cond_13
    filled-new-array {v0, v1, v1, v1, v1}, [I

    .line 384
    .line 385
    .line 386
    move-result-object p2

    .line 387
    :goto_c
    const/4 p3, 0x5

    .line 388
    if-ge v0, p3, :cond_17

    .line 389
    .line 390
    aget p3, p2, v0

    .line 391
    .line 392
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 393
    .line 394
    if-eqz v1, :cond_14

    .line 395
    .line 396
    check-cast p1, Landroid/view/ViewGroup;

    .line 397
    .line 398
    goto :goto_d

    .line 399
    :cond_14
    move-object p1, v2

    .line 400
    :goto_d
    if-eqz p1, :cond_16

    .line 401
    .line 402
    if-ltz p3, :cond_16

    .line 403
    .line 404
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    if-lt p3, v1, :cond_15

    .line 409
    .line 410
    goto :goto_e

    .line 411
    :cond_15
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    add-int/lit8 v0, v0, 0x1

    .line 419
    .line 420
    goto :goto_c

    .line 421
    :cond_16
    :goto_e
    move-object p1, v2

    .line 422
    :cond_17
    instance-of p2, p1, Landroid/widget/TextView;

    .line 423
    .line 424
    if-eqz p2, :cond_18

    .line 425
    .line 426
    move-object v2, p1

    .line 427
    check-cast v2, Landroid/widget/TextView;

    .line 428
    .line 429
    :cond_18
    return-object v2
.end method

.method public final y0(Landroid/view/View;Landroid/widget/RelativeLayout;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v1, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    move-object v4, v3

    .line 35
    check-cast v4, Ljava/util/Map$Entry;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Landroid/widget/RelativeLayout;

    .line 45
    .line 46
    if-eq v4, p2, :cond_1

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v4, p1}, Lr9/d0;->P(Landroid/view/View;Landroid/view/View;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_1
    const/4 v4, 0x0

    .line 63
    :goto_1
    if-eqz v4, :cond_0

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Ljava/util/Map$Entry;

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    new-instance v3, Lsf/e;

    .line 103
    .line 104
    invoke-direct {v3, v2, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Lsf/e;

    .line 126
    .line 127
    iget-object v1, v1, Lsf/e;->g:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 130
    .line 131
    iget-object v2, p0, Lr9/d0;->w:Ljava/util/WeakHashMap;

    .line 132
    .line 133
    invoke-virtual {v2, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    monitor-exit v0

    .line 138
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-eqz p2, :cond_b

    .line 147
    .line 148
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    check-cast p2, Lsf/e;

    .line 153
    .line 154
    iget-object v0, p2, Lsf/e;->g:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 157
    .line 158
    iget-object p2, p2, Lsf/e;->h:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p2, Lr9/s;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    iget v2, p2, Lr9/s;->c:I

    .line 173
    .line 174
    if-ne v1, v2, :cond_6

    .line 175
    .line 176
    iget v1, p2, Lr9/s;->a:I

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    iget v3, p2, Lr9/s;->d:I

    .line 188
    .line 189
    if-ne v2, v3, :cond_7

    .line 190
    .line 191
    iget v2, p2, Lr9/s;->b:I

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    :goto_5
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-ne v1, v3, :cond_8

    .line 203
    .line 204
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eq v2, v3, :cond_9

    .line 209
    .line 210
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    invoke-virtual {v0, v3, v1, v4, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 219
    .line 220
    .line 221
    :cond_9
    iget-boolean v1, p2, Lr9/s;->e:Z

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 224
    .line 225
    .line 226
    iget-object p2, p2, Lr9/s;->f:Ljava/util/List;

    .line 227
    .line 228
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    :cond_a
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_5

    .line 237
    .line 238
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Lr9/r;

    .line 243
    .line 244
    iget-object v1, v0, Lr9/r;->a:Ljava/lang/ref/WeakReference;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    check-cast v1, Landroid/view/ViewGroup;

    .line 251
    .line 252
    if-eqz v1, :cond_a

    .line 253
    .line 254
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getClipChildren()Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-nez v2, :cond_a

    .line 259
    .line 260
    iget-boolean v0, v0, Lr9/r;->b:Z

    .line 261
    .line 262
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_b
    return-void

    .line 267
    :goto_7
    monitor-exit v0

    .line 268
    throw p1
.end method

.method public final z0(Landroid/widget/TextView;Landroid/view/ViewGroup;Landroid/view/View;ZI)V
    .locals 7

    .line 1
    new-instance v0, Lr9/n;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move v5, p4

    .line 8
    move v6, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lr9/n;-><init>(Lr9/d0;Landroid/widget/TextView;Landroid/view/ViewGroup;Landroid/view/View;ZI)V

    .line 10
    .line 11
    .line 12
    iget-object p1, v1, Lr9/d0;->y:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-static {v2, v3, p1, v0}, Lr9/d0;->A0(Landroid/view/View;Landroid/view/View;Ljava/util/WeakHashMap;Lfg/a;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
