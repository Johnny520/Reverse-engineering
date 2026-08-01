.class public final Lr0/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# static fields
.field public static final U:Ljava/util/List;

.field public static final V:[Ljava/lang/String;

.field public static final W:[Ljava/lang/String;

.field public static final X:[Ljava/lang/String;

.field public static final Y:[Ljava/lang/String;

.field public static final Z:[Ljava/lang/String;

.field public static final a0:[Ljava/lang/String;

.field public static final b0:LU0/g;

.field public static final c0:LU0/g;

.field public static final d0:LU0/g;

.field public static final e0:LU0/g;

.field public static final f0:LU0/g;

.field public static final g0:LU0/g;

.field public static final h0:LU0/g;

.field public static final i0:LU0/g;

.field public static final j0:LU0/g;

.field public static final k0:Ljava/util/Set;


# instance fields
.field public A:LA0/N;

.field public B:Landroid/content/Context;

.field public volatile C:J

.field public D:Lr0/T;

.field public final E:Ljava/util/WeakHashMap;

.field public final F:Ljava/util/WeakHashMap;

.field public final G:Ljava/util/Set;

.field public final H:Ljava/util/WeakHashMap;

.field public final I:Ljava/util/WeakHashMap;

.field public final J:Ljava/util/WeakHashMap;

.field public final K:Ljava/util/WeakHashMap;

.field public volatile L:Ljava/lang/String;

.field public volatile M:Ljava/lang/String;

.field public volatile N:J

.field public volatile O:Z

.field public P:Ljava/lang/ref/WeakReference;

.field public volatile Q:Ljava/lang/String;

.field public volatile R:J

.field public volatile S:Ljava/lang/String;

.field public volatile T:Z

.field public a:Ljava/lang/ref/WeakReference;

.field public b:Ljava/lang/ref/WeakReference;

.field public c:Ljava/lang/ref/WeakReference;

.field public d:Ljava/lang/ref/WeakReference;

.field public e:Ljava/lang/ref/WeakReference;

.field public f:Ljava/lang/ref/WeakReference;

.field public final g:Ljava/util/WeakHashMap;

.field public final h:Ljava/util/Set;

.field public final i:Ljava/util/HashMap;

.field public final j:Ljava/util/HashMap;

.field public final k:Ljava/util/HashMap;

.field public final l:Ljava/util/LinkedHashSet;

.field public m:Z

.field public final n:Ljava/util/HashSet;

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Ljava/lang/String;

.field public u:J

.field public v:Ljava/lang/String;

.field public w:J

.field public volatile x:Z

.field public y:Z

.field public z:LA0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lr0/S;

    .line 2
    .line 3
    const-string v1, "fj5.r"

    .line 4
    .line 5
    const-string v2, "o95.t4"

    .line 6
    .line 7
    const-string v3, "g"

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lr0/S;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lr0/S;

    .line 13
    .line 14
    const-string v2, "gg5.r"

    .line 15
    .line 16
    const-string v4, "u65.t4"

    .line 17
    .line 18
    invoke-direct {v1, v2, v4, v3}, Lr0/S;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lr0/S;

    .line 22
    .line 23
    const-string v4, "wh5.r"

    .line 24
    .line 25
    const-string v5, "h85.t4"

    .line 26
    .line 27
    invoke-direct {v2, v4, v5, v3}, Lr0/S;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Lr0/S;

    .line 31
    .line 32
    const-string v5, "rl5.r"

    .line 33
    .line 34
    const-string v6, "db5.t4"

    .line 35
    .line 36
    invoke-direct {v4, v5, v6, v3}, Lr0/S;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    filled-new-array {v0, v1, v2, v4}, [Lr0/S;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lr0/d0;->U:Ljava/util/List;

    .line 48
    .line 49
    const-string v3, "gg5.r"

    .line 50
    .line 51
    const-string v4, "wh5.i"

    .line 52
    .line 53
    const-string v1, "fj5.r"

    .line 54
    .line 55
    const-string v2, "gg5.i"

    .line 56
    .line 57
    const-string v5, "wh5.r"

    .line 58
    .line 59
    const-string v6, "rl5.r"

    .line 60
    .line 61
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lr0/d0;->V:[Ljava/lang/String;

    .line 66
    .line 67
    const-string v0, "fj5.q"

    .line 68
    .line 69
    const-string v1, "gg5.q"

    .line 70
    .line 71
    const-string v2, "wh5.q"

    .line 72
    .line 73
    const-string v3, "rl5.q"

    .line 74
    .line 75
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lr0/d0;->W:[Ljava/lang/String;

    .line 80
    .line 81
    const-string v3, "i"

    .line 82
    .line 83
    const-string v4, "m"

    .line 84
    .line 85
    const-string v1, "f270207o"

    .line 86
    .line 87
    const-string v2, "h"

    .line 88
    .line 89
    const-string v5, "n"

    .line 90
    .line 91
    const-string v6, "o"

    .line 92
    .line 93
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sput-object v0, Lr0/d0;->X:[Ljava/lang/String;

    .line 98
    .line 99
    const-string v0, "z"

    .line 100
    .line 101
    const-string v1, "f270204i"

    .line 102
    .line 103
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lr0/d0;->Y:[Ljava/lang/String;

    .line 108
    .line 109
    const-string v0, "d"

    .line 110
    .line 111
    const-string v1, "f362612d"

    .line 112
    .line 113
    const-string v2, "f245584d"

    .line 114
    .line 115
    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lr0/d0;->Z:[Ljava/lang/String;

    .line 120
    .line 121
    const-string v0, "com.tencent.mm.ui.contact.e"

    .line 122
    .line 123
    const-string v1, "com.tencent.mm.ui.contact.h0"

    .line 124
    .line 125
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    sput-object v0, Lr0/d0;->a0:[Ljava/lang/String;

    .line 130
    .line 131
    new-instance v0, LU0/g;

    .line 132
    .line 133
    const-string v1, "(?i)\\bwhere\\b"

    .line 134
    .line 135
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    sput-object v0, Lr0/d0;->b0:LU0/g;

    .line 139
    .line 140
    new-instance v0, LU0/g;

    .line 141
    .line 142
    const-string v1, "\\d{5,}"

    .line 143
    .line 144
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    sput-object v0, Lr0/d0;->c0:LU0/g;

    .line 148
    .line 149
    new-instance v0, LU0/g;

    .line 150
    .line 151
    const-string v1, "(?is)\\bwhere\\b.{0,160}\\b(?:rcontact\\.)?(username|encryptUsername)\\s*="

    .line 152
    .line 153
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    sput-object v0, Lr0/d0;->d0:LU0/g;

    .line 157
    .line 158
    new-instance v0, LU0/g;

    .line 159
    .line 160
    const-string v1, "(?is)^\\s*select\\s+(.*?)\\s+from\\s+"

    .line 161
    .line 162
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    sput-object v0, Lr0/d0;->e0:LU0/g;

    .line 166
    .line 167
    new-instance v0, LU0/g;

    .line 168
    .line 169
    const-string v1, "(?i)\\bcount\\s*\\("

    .line 170
    .line 171
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    sput-object v0, Lr0/d0;->f0:LU0/g;

    .line 175
    .line 176
    new-instance v0, LU0/g;

    .line 177
    .line 178
    const-string v1, "(?i)(^|[\\s,])(?:[a-zA-Z_][\\w]*\\.)?username([\\s,]|$)"

    .line 179
    .line 180
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    sput-object v0, Lr0/d0;->g0:LU0/g;

    .line 184
    .line 185
    new-instance v0, LU0/g;

    .line 186
    .line 187
    const-string v1, "(?i)\\bas\\s+username\\b"

    .line 188
    .line 189
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    sput-object v0, Lr0/d0;->h0:LU0/g;

    .line 193
    .line 194
    new-instance v0, LU0/g;

    .line 195
    .line 196
    const-string v1, "(?i)\\b(group\\s+by|having|order\\s+by|limit|offset)\\b"

    .line 197
    .line 198
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    sput-object v0, Lr0/d0;->i0:LU0/g;

    .line 202
    .line 203
    new-instance v0, LU0/g;

    .line 204
    .line 205
    const-string v1, "(?i)\\bfrom\\s+rcontact\\s+(?:as\\s+)?([a-zA-Z_][\\w]*)"

    .line 206
    .line 207
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    sput-object v0, Lr0/d0;->j0:LU0/g;

    .line 211
    .line 212
    const-string v7, "on"

    .line 213
    .line 214
    const-string v8, "group"

    .line 215
    .line 216
    const-string v2, "where"

    .line 217
    .line 218
    const-string v3, "inner"

    .line 219
    .line 220
    const-string v4, "left"

    .line 221
    .line 222
    const-string v5, "right"

    .line 223
    .line 224
    const-string v6, "join"

    .line 225
    .line 226
    const-string v9, "order"

    .line 227
    .line 228
    const-string v10, "limit"

    .line 229
    .line 230
    filled-new-array/range {v2 .. v10}, [Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v0}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    sput-object v0, Lr0/d0;->k0:Ljava/util/Set;

    .line 239
    .line 240
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/d0;->g:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lr0/d0;->h:Ljava/util/Set;

    .line 21
    .line 22
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lr0/d0;->i:Ljava/util/HashMap;

    .line 28
    .line 29
    new-instance v0, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lr0/d0;->j:Ljava/util/HashMap;

    .line 35
    .line 36
    new-instance v0, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lr0/d0;->k:Ljava/util/HashMap;

    .line 42
    .line 43
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lr0/d0;->l:Ljava/util/LinkedHashSet;

    .line 49
    .line 50
    new-instance v0, Ljava/util/HashSet;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lr0/d0;->n:Ljava/util/HashSet;

    .line 56
    .line 57
    new-instance v0, Lr0/T;

    .line 58
    .line 59
    sget-object v1, LF0/u;->a:LF0/u;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-direct {v0, v2, v1, v1}, Lr0/T;-><init>(ZLjava/util/Set;Ljava/util/Set;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lr0/d0;->D:Lr0/T;

    .line 66
    .line 67
    new-instance v0, Ljava/util/WeakHashMap;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lr0/d0;->E:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    new-instance v0, Ljava/util/WeakHashMap;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lr0/d0;->F:Ljava/util/WeakHashMap;

    .line 80
    .line 81
    new-instance v0, Ljava/util/WeakHashMap;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, Lr0/d0;->G:Ljava/util/Set;

    .line 91
    .line 92
    new-instance v0, Ljava/util/WeakHashMap;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, Lr0/d0;->H:Ljava/util/WeakHashMap;

    .line 98
    .line 99
    new-instance v0, Ljava/util/WeakHashMap;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Lr0/d0;->I:Ljava/util/WeakHashMap;

    .line 105
    .line 106
    new-instance v0, Ljava/util/WeakHashMap;

    .line 107
    .line 108
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, Lr0/d0;->J:Ljava/util/WeakHashMap;

    .line 112
    .line 113
    new-instance v0, Ljava/util/WeakHashMap;

    .line 114
    .line 115
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, Lr0/d0;->K:Ljava/util/WeakHashMap;

    .line 119
    .line 120
    return-void
.end method

.method public static A(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/reflect/Method;

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v2, v0

    .line 33
    check-cast v2, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v0, v1

    .line 53
    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/lang/reflect/Method;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_2
    return-object v1

    .line 65
    :cond_3
    return-object v0
.end method

.method public static A0(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

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
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-nez v0, :cond_6

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/16 v0, 0x50

    .line 36
    .line 37
    if-gt p1, v0, :cond_6

    .line 38
    .line 39
    const/16 p1, 0xa

    .line 40
    .line 41
    invoke-static {p0, p1}, LU0/i;->j0(Ljava/lang/String;C)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const-string p1, "\u5fae\u4fe1ID"

    .line 49
    .line 50
    invoke-static {p0, v1, p1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_6

    .line 55
    .line 56
    const-string p1, "\u5fae\u4fe1\u53f7"

    .line 57
    .line 58
    invoke-static {p0, v1, p1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_6

    .line 63
    .line 64
    const-string p1, "\u52a0\u5165\u540d\u5355"

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    sget-object p1, Lr0/d0;->c0:LU0/g;

    .line 74
    .line 75
    invoke-virtual {p1, p0}, LU0/g;->d(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_5

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    const/4 p0, 0x1

    .line 83
    return p0

    .line 84
    :cond_6
    :goto_1
    return v1
.end method

.method public static B(Landroid/view/View;)Landroid/widget/ListView;
    .locals 2

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    instance-of v1, p0, Landroid/widget/ListView;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast p0, Landroid/widget/ListView;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of v1, p0, Landroid/view/View;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    check-cast p0, Landroid/view/View;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object p0, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_2
    return-object v0
.end method

.method public static B0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "wxid_"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "@chatroom"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "@"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const/4 v0, 0x3

    .line 31
    if-lt p0, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return v1

    .line 35
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method public static C(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-static {p0}, Lr0/d0;->H0(Landroid/view/View;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    check-cast p0, Landroid/view/ViewGroup;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_0
    if-ge v1, v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Lr0/d0;->C(Landroid/view/View;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static C0(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

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
    const/4 v1, 0x3

    .line 14
    const/4 v2, 0x0

    .line 15
    if-lt v0, v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x80

    .line 22
    .line 23
    if-gt v0, v1, :cond_2

    .line 24
    .line 25
    const-string v0, " "

    .line 26
    .line 27
    invoke-static {p0, v0, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    const-string v0, "\n"

    .line 34
    .line 35
    invoke-static {p0, v0, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string v0, "wxid_"

    .line 43
    .line 44
    invoke-static {p0, v2, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    const-string v0, "gh_"

    .line 51
    .line 52
    invoke-static {p0, v2, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    const-string v0, "@chatroom"

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    const-string v0, "@"

    .line 67
    .line 68
    invoke-static {p0, v0, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    const-string v0, "[A-Za-z][A-Za-z0-9_.-]{2,}"

    .line 75
    .line 76
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "compile(...)"

    .line 81
    .line 82
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz p0, :cond_2

    .line 94
    .line 95
    :cond_1
    const/4 p0, 0x1

    .line 96
    return p0

    .line 97
    :cond_2
    :goto_0
    return v2
.end method

.method public static final D(LN0/l;Lr0/d0;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, LN0/l;->a:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Lr0/d0;->r0(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lr0/d0;->G(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p1, v0}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lr0/d0;->G(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_4

    .line 34
    .line 35
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    iput-object v0, p0, LN0/l;->a:Ljava/lang/Object;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_4
    :goto_1
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 46
    .line 47
    if-eqz v0, :cond_6

    .line 48
    .line 49
    check-cast p2, Landroid/view/ViewGroup;

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x0

    .line 56
    :goto_2
    if-ge v1, v0, :cond_6

    .line 57
    .line 58
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v3, "getChildAt(...)"

    .line 63
    .line 64
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, p1, v2}, Lr0/d0;->D(LN0/l;Lr0/d0;Landroid/view/View;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, LN0/l;->a:Ljava/lang/Object;

    .line 71
    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_6
    :goto_3
    return-void
.end method

.method public static D0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

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
    const-string v0, "\u6b63\u5728\u52a0\u8f7d"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "\u52a0\u8f7d\u4e2d"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return v1

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public static E(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_6

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    if-eqz v1, :cond_7

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "getDeclaredFields(...)"

    .line 16
    .line 17
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    array-length v3, v2

    .line 21
    const/4 v4, 0x0

    .line 22
    :goto_1
    if-ge v4, v3, :cond_6

    .line 23
    .line 24
    aget-object v5, v2, v4

    .line 25
    .line 26
    const/4 v6, 0x1

    .line 27
    :try_start_0
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_2

    .line 35
    :catchall_0
    move-exception v5

    .line 36
    new-instance v6, LE0/d;

    .line 37
    .line 38
    invoke-direct {v6, v5}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object v5, v6

    .line 42
    :goto_2
    nop

    .line 43
    instance-of v6, v5, LE0/d;

    .line 44
    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    move-object v5, v0

    .line 48
    :cond_1
    if-nez v5, :cond_2

    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    :goto_3
    if-eqz v6, :cond_5

    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v7, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_4

    .line 85
    .line 86
    :goto_4
    return-object v5

    .line 87
    :cond_4
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    goto :goto_3

    .line 92
    :cond_5
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    goto :goto_0

    .line 100
    :cond_7
    :goto_6
    return-object v0
.end method

.method public static F0(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "MvvmAddressUI"

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-ne p0, v1, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static H0(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "androidx.recyclerview.widget.RecyclerView"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public static I0()Z
    .locals 4

    .line 1
    sget v0, Lz0/r;->e:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v0, v3, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v2, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sput v2, Lz0/r;->e:I

    .line 39
    .line 40
    :cond_0
    sget v0, Lz0/r;->e:I

    .line 41
    .line 42
    const/16 v2, 0xc30

    .line 43
    .line 44
    if-le v0, v2, :cond_1

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    return v0

    .line 48
    :cond_1
    return v1
.end method

.method public static J0(Ljava/lang/String;JLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr v0, p1

    .line 6
    const-wide/16 p1, 0x5

    .line 7
    .line 8
    cmp-long p1, v0, p1

    .line 9
    .line 10
    if-ltz p1, :cond_1

    .line 11
    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p2, "ms"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p3, :cond_0

    .line 30
    .line 31
    const-string p3, ""

    .line 32
    .line 33
    :cond_0
    const-string p2, "quick add slow"

    .line 34
    .line 35
    filled-new-array {p2, p0, p1, p3}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public static K0(Ljava/util/List;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, LF0/s;->a:LF0/s;

    .line 4
    .line 5
    :cond_0
    invoke-static {p1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v1, v0

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {p1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const/4 p1, 0x0

    .line 54
    new-array p1, p1, [Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {p0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, [Ljava/lang/String;

    .line 61
    .line 62
    return-object p0
.end method

.method public static N(Ljava/lang/Object;)Ljava/util/List;
    .locals 9

    .line 1
    sget-object v0, LF0/s;->a:LF0/s;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-object v1, Lr0/d0;->Z:[Ljava/lang/String;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const/4 v5, 0x0

    .line 12
    if-ge v4, v2, :cond_1

    .line 13
    .line 14
    aget-object v6, v1, v4

    .line 15
    .line 16
    invoke-static {p0, v6}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    check-cast v6, Ljava/util/List;

    .line 21
    .line 22
    if-nez v6, :cond_2

    .line 23
    .line 24
    add-int/lit8 v4, v4, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v6, v5

    .line 28
    :cond_2
    if-nez v6, :cond_9

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_1
    if-eqz v1, :cond_6

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v4, "getDeclaredFields(...)"

    .line 41
    .line 42
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    array-length v4, v2

    .line 46
    move v6, v3

    .line 47
    :goto_2
    if-ge v6, v4, :cond_5

    .line 48
    .line 49
    aget-object v7, v2, v6

    .line 50
    .line 51
    const/4 v8, 0x1

    .line 52
    :try_start_0
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v7, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    goto :goto_3

    .line 60
    :catchall_0
    move-exception v7

    .line 61
    new-instance v8, LE0/d;

    .line 62
    .line 63
    invoke-direct {v8, v7}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object v7, v8

    .line 67
    :goto_3
    nop

    .line 68
    instance-of v8, v7, LE0/d;

    .line 69
    .line 70
    if-eqz v8, :cond_3

    .line 71
    .line 72
    move-object v7, v5

    .line 73
    :cond_3
    instance-of v8, v7, Ljava/util/List;

    .line 74
    .line 75
    if-eqz v8, :cond_4

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    goto :goto_1

    .line 86
    :cond_6
    move-object v7, v5

    .line 87
    :goto_4
    check-cast v7, Ljava/util/List;

    .line 88
    .line 89
    if-eqz v7, :cond_7

    .line 90
    .line 91
    new-instance v5, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_7

    .line 105
    .line 106
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_7
    if-nez v5, :cond_8

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_8
    move-object v0, v5

    .line 118
    :goto_6
    return-object v0

    .line 119
    :cond_9
    return-object v6
.end method

.method public static O(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p0}, Lr0/d0;->o0(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lr0/d0;->P(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    :try_start_0
    const-string v0, "field_username"

    .line 16
    .line 17
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 18
    .line 19
    invoke-interface {v2, p0, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    new-instance v2, LE0/d;

    .line 28
    .line 29
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object v0, v2

    .line 33
    :goto_0
    nop

    .line 34
    instance-of v2, v0, LE0/d;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    move-object v0, v1

    .line 39
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object v0, v1

    .line 51
    :goto_1
    if-eqz v0, :cond_3

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_3
    :try_start_1
    const-string v0, "username"

    .line 55
    .line 56
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 57
    .line 58
    invoke-interface {v2, p0, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :catchall_1
    move-exception v0

    .line 66
    new-instance v2, LE0/d;

    .line 67
    .line 68
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object v0, v2

    .line 72
    :goto_2
    nop

    .line 73
    instance-of v2, v0, LE0/d;

    .line 74
    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    move-object v0, v1

    .line 78
    :cond_4
    check-cast v0, Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    move-object v0, v1

    .line 90
    :goto_3
    if-eqz v0, :cond_6

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_6
    const/4 v0, 0x0

    .line 94
    :try_start_2
    const-string v2, "d1"

    .line 95
    .line 96
    new-array v3, v0, [Ljava/lang/Object;

    .line 97
    .line 98
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 99
    .line 100
    invoke-interface {v4, p0, v2, v3}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :catchall_2
    move-exception v2

    .line 108
    new-instance v3, LE0/d;

    .line 109
    .line 110
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    move-object v2, v3

    .line 114
    :goto_4
    nop

    .line 115
    instance-of v3, v2, LE0/d;

    .line 116
    .line 117
    if-eqz v3, :cond_7

    .line 118
    .line 119
    move-object v2, v1

    .line 120
    :cond_7
    check-cast v2, Ljava/lang/String;

    .line 121
    .line 122
    if-eqz v2, :cond_9

    .line 123
    .line 124
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-nez v3, :cond_8

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    move-object v2, v1

    .line 132
    :goto_5
    if-eqz v2, :cond_9

    .line 133
    .line 134
    return-object v2

    .line 135
    :cond_9
    :try_start_3
    const-string v2, "getUsername"

    .line 136
    .line 137
    new-array v0, v0, [Ljava/lang/Object;

    .line 138
    .line 139
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 140
    .line 141
    invoke-interface {v3, p0, v2, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :catchall_3
    move-exception v0

    .line 149
    new-instance v2, LE0/d;

    .line 150
    .line 151
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    move-object v0, v2

    .line 155
    :goto_6
    nop

    .line 156
    instance-of v2, v0, LE0/d;

    .line 157
    .line 158
    if-eqz v2, :cond_a

    .line 159
    .line 160
    move-object v0, v1

    .line 161
    :cond_a
    check-cast v0, Ljava/lang/String;

    .line 162
    .line 163
    if-eqz v0, :cond_c

    .line 164
    .line 165
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_b

    .line 170
    .line 171
    move-object v1, v0

    .line 172
    :cond_b
    if-eqz v1, :cond_c

    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_c
    invoke-static {p0}, Lr0/d0;->P(Ljava/lang/Object;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    :goto_7
    return-object v1
.end method

.method public static P(Ljava/lang/Object;)Ljava/lang/String;
    .locals 11

    .line 1
    const/4 v1, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_9

    .line 5
    .line 6
    :cond_0
    instance-of v0, p0, Landroid/view/View;

    .line 7
    .line 8
    if-nez v0, :cond_e

    .line 9
    .line 10
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-nez v0, :cond_e

    .line 13
    .line 14
    instance-of v0, p0, Landroid/widget/TextView;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 20
    .line 21
    if-nez v0, :cond_e

    .line 22
    .line 23
    instance-of v0, p0, Ljava/lang/Number;

    .line 24
    .line 25
    if-nez v0, :cond_e

    .line 26
    .line 27
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 28
    .line 29
    if-nez v0, :cond_e

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    goto/16 :goto_9

    .line 42
    .line 43
    :cond_2
    const-string v4, "userName"

    .line 44
    .line 45
    const-string v5, "user"

    .line 46
    .line 47
    const-string v2, "field_username"

    .line 48
    .line 49
    const-string v3, "username"

    .line 50
    .line 51
    const-string v6, "id"

    .line 52
    .line 53
    const-string v7, "contactId"

    .line 54
    .line 55
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v2, 0x0

    .line 60
    move v3, v2

    .line 61
    :goto_0
    const/4 v4, 0x6

    .line 62
    if-ge v3, v4, :cond_5

    .line 63
    .line 64
    aget-object v4, v0, v3

    .line 65
    .line 66
    invoke-static {p0, v4}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/lang/String;

    .line 71
    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    invoke-static {v4}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-eqz v4, :cond_4

    .line 83
    .line 84
    invoke-static {v4}, Lr0/d0;->C0(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move-object v4, v1

    .line 92
    :goto_1
    if-eqz v4, :cond_4

    .line 93
    .line 94
    return-object v4

    .line 95
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    const-string v7, "h1"

    .line 99
    .line 100
    const-string v8, "e"

    .line 101
    .line 102
    const-string v4, "getUsername"

    .line 103
    .line 104
    const-string v5, "getUserName"

    .line 105
    .line 106
    const-string v6, "d1"

    .line 107
    .line 108
    const-string v9, "v"

    .line 109
    .line 110
    const-string v10, "x"

    .line 111
    .line 112
    filled-new-array/range {v4 .. v10}, [Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move v3, v2

    .line 117
    :goto_2
    const/4 v4, 0x7

    .line 118
    if-ge v3, v4, :cond_8

    .line 119
    .line 120
    aget-object v4, v0, v3

    .line 121
    .line 122
    invoke-static {p0, v4}, Lr0/d0;->n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    if-eqz v4, :cond_7

    .line 127
    .line 128
    invoke-static {v4}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-eqz v4, :cond_7

    .line 137
    .line 138
    const-string v5, ""

    .line 139
    .line 140
    invoke-static {v4, v5}, LU0/i;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v4}, Lr0/d0;->C0(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_6

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    move-object v4, v1

    .line 152
    :goto_3
    if-eqz v4, :cond_7

    .line 153
    .line 154
    return-object v4

    .line 155
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    move-object v3, v0

    .line 163
    :goto_4
    if-eqz v3, :cond_e

    .line 164
    .line 165
    const-class v0, Ljava/lang/Object;

    .line 166
    .line 167
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-nez v0, :cond_e

    .line 172
    .line 173
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    const-string v0, "getDeclaredFields(...)"

    .line 178
    .line 179
    invoke-static {v4, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    array-length v5, v4

    .line 183
    move v6, v2

    .line 184
    :goto_5
    if-ge v6, v5, :cond_d

    .line 185
    .line 186
    aget-object v0, v4, v6

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    const-class v8, Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-eqz v7, :cond_c

    .line 199
    .line 200
    const/4 v7, 0x1

    .line 201
    :try_start_0
    invoke-virtual {v0, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    instance-of v7, v0, Ljava/lang/String;

    .line 209
    .line 210
    if-eqz v7, :cond_9

    .line 211
    .line 212
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :catchall_0
    move-exception v0

    .line 216
    goto :goto_6

    .line 217
    :cond_9
    move-object v0, v1

    .line 218
    goto :goto_7

    .line 219
    :goto_6
    new-instance v7, LE0/d;

    .line 220
    .line 221
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    move-object v0, v7

    .line 225
    :goto_7
    nop

    .line 226
    instance-of v7, v0, LE0/d;

    .line 227
    .line 228
    if-eqz v7, :cond_a

    .line 229
    .line 230
    move-object v0, v1

    .line 231
    :cond_a
    check-cast v0, Ljava/lang/String;

    .line 232
    .line 233
    if-eqz v0, :cond_c

    .line 234
    .line 235
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    if-eqz v0, :cond_c

    .line 244
    .line 245
    invoke-static {v0}, Lr0/d0;->C0(Ljava/lang/String;)Z

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    if-eqz v7, :cond_b

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_b
    move-object v0, v1

    .line 253
    :goto_8
    if-eqz v0, :cond_c

    .line 254
    .line 255
    return-object v0

    .line 256
    :cond_c
    add-int/lit8 v6, v6, 0x1

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    goto :goto_4

    .line 264
    :cond_e
    :goto_9
    return-object v1
.end method

.method public static R(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lz0/A;->e:Lz0/A;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    :goto_0
    const-string v1, "v"

    .line 17
    .line 18
    const-string v2, "x"

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-static {p0, v2}, Lr0/d0;->n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    invoke-static {p0, v1}, Lr0/d0;->n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    invoke-static {p0}, Lr0/d0;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    return-object v0

    .line 40
    :cond_3
    invoke-static {p0, v1}, Lr0/d0;->n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    invoke-static {p0, v2}, Lr0/d0;->n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-nez v0, :cond_4

    .line 51
    .line 52
    invoke-static {p0}, Lr0/d0;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_4
    return-object v0
.end method

.method public static R0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)Landroid/view/View;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    :try_start_0
    const-string v1, "getView"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    new-array v2, v2, [Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 10
    .line 11
    invoke-interface {v3, p0, v1, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    new-instance v1, LE0/d;

    .line 20
    .line 21
    invoke-direct {v1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p0, v1

    .line 25
    :goto_0
    nop

    .line 26
    instance-of v1, p0, LE0/d;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    move-object p0, v0

    .line 31
    :cond_0
    check-cast p0, Landroid/view/View;

    .line 32
    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v0, p0

    .line 37
    goto :goto_3

    .line 38
    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    move-object p0, v0

    .line 46
    :goto_2
    if-nez p0, :cond_1

    .line 47
    .line 48
    if-eqz p1, :cond_4

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_4
    :goto_3
    return-object v0
.end method

.method public static S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    if-eqz v1, :cond_2

    .line 10
    .line 11
    const-class v2, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v0, p0

    .line 35
    :goto_1
    return-object v0

    .line 36
    :catch_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    :cond_2
    :goto_2
    return-object v0
.end method

.method public static V()Ljava/util/List;
    .locals 5

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->s()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, LF0/s;->a:LF0/s;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-class v0, Lq0/h;

    .line 13
    .line 14
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lq0/h;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    :goto_1
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
    check-cast v2, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/4 v2, 0x0

    .line 61
    :goto_2
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move-object v3, v2

    .line 87
    check-cast v3, Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_4

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_7

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    move-object v3, v2

    .line 119
    check-cast v3, Ljava/lang/String;

    .line 120
    .line 121
    sget-boolean v4, Lz0/i;->a:Z

    .line 122
    .line 123
    invoke-static {v3}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_6

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_7
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    return-object v0
.end method

.method public static W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "getDeclaredMethods(...)"

    .line 13
    .line 14
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    array-length v3, v2

    .line 18
    const/4 v4, 0x0

    .line 19
    :goto_1
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    aget-object v5, v2, v4

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-static {v6, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    const-string v7, "getParameterTypes(...)"

    .line 38
    .line 39
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    array-length v6, v6

    .line 43
    if-nez v6, :cond_0

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v5, v1

    .line 50
    :goto_2
    if-eqz v5, :cond_3

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    goto :goto_3

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    new-instance p1, LE0/d;

    .line 63
    .line 64
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object p0, p1

    .line 68
    :goto_3
    nop

    .line 69
    instance-of p1, p0, LE0/d;

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_2
    move-object v1, p0

    .line 75
    :goto_4
    return-object v1

    .line 76
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    goto :goto_0

    .line 81
    :cond_4
    return-object v1
.end method

.method public static X(Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_6

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    if-eqz v1, :cond_9

    .line 11
    .line 12
    const-class v2, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_9

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, "getDeclaredMethods(...)"

    .line 25
    .line 26
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    array-length v3, v2

    .line 30
    const/4 v4, 0x0

    .line 31
    move v5, v4

    .line 32
    :goto_1
    if-ge v5, v3, :cond_8

    .line 33
    .line 34
    aget-object v6, v2, v5

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const-string v8, "getParameterTypes(...)"

    .line 41
    .line 42
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    array-length v7, v7

    .line 46
    if-nez v7, :cond_7

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    const-class v8, Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_7

    .line 59
    .line 60
    const/4 v7, 0x1

    .line 61
    :try_start_0
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    instance-of v7, v6, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v7, :cond_1

    .line 71
    .line 72
    check-cast v6, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :catchall_0
    move-exception v6

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    move-object v6, v0

    .line 78
    goto :goto_3

    .line 79
    :goto_2
    new-instance v7, LE0/d;

    .line 80
    .line 81
    invoke-direct {v7, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    move-object v6, v7

    .line 85
    :goto_3
    nop

    .line 86
    instance-of v7, v6, LE0/d;

    .line 87
    .line 88
    if-eqz v7, :cond_2

    .line 89
    .line 90
    move-object v6, v0

    .line 91
    :cond_2
    check-cast v6, Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v6, :cond_7

    .line 94
    .line 95
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-nez v7, :cond_5

    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    const/4 v8, 0x3

    .line 106
    if-lt v7, v8, :cond_5

    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    const/16 v8, 0x80

    .line 113
    .line 114
    if-le v7, v8, :cond_3

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_3
    const-string v7, " "

    .line 118
    .line 119
    invoke-static {v6, v7, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-nez v7, :cond_5

    .line 124
    .line 125
    const-string v7, "\n"

    .line 126
    .line 127
    invoke-static {v6, v7, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_4

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_4
    const-string v7, "wxid_"

    .line 135
    .line 136
    invoke-static {v6, v4, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-nez v7, :cond_6

    .line 141
    .line 142
    const-string v7, "gh_"

    .line 143
    .line 144
    invoke-static {v6, v4, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-nez v7, :cond_6

    .line 149
    .line 150
    const-string v7, "@chatroom"

    .line 151
    .line 152
    invoke-static {v6, v7, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-nez v7, :cond_6

    .line 157
    .line 158
    const-string v7, "-"

    .line 159
    .line 160
    invoke-static {v6, v7, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-nez v7, :cond_6

    .line 165
    .line 166
    const-string v7, "[A-Za-z0-9_@.:-]+"

    .line 167
    .line 168
    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    const-string v8, "compile(...)"

    .line 173
    .line 174
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-eqz v7, :cond_5

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_5
    :goto_4
    move-object v6, v0

    .line 189
    :cond_6
    :goto_5
    if-eqz v6, :cond_7

    .line 190
    .line 191
    return-object v6

    .line 192
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 193
    .line 194
    goto/16 :goto_1

    .line 195
    .line 196
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_9
    :goto_6
    return-object v0
.end method

.method public static Y(Landroid/view/View;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_0
    instance-of v0, p0, Landroid/widget/TextView;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    check-cast v0, Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-nez v0, :cond_2

    .line 29
    .line 30
    const-string v0, ""

    .line 31
    .line 32
    :cond_2
    invoke-static {v0}, Lr0/d0;->D0(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 40
    .line 41
    if-eqz v0, :cond_5

    .line 42
    .line 43
    check-cast p0, Landroid/view/ViewGroup;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    move v2, v1

    .line 50
    :goto_1
    if-ge v2, v0, :cond_5

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const-string v4, "getChildAt(...)"

    .line 57
    .line 58
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v3}, Lr0/d0;->Y(Landroid/view/View;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    :goto_2
    const/4 p0, 0x1

    .line 68
    return p0

    .line 69
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_5
    :goto_3
    return v1
.end method

.method public static Z(Landroid/view/View;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    :goto_0
    return v0

    .line 12
    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    check-cast v1, Landroid/view/ViewGroup;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    :goto_1
    if-ge v0, v2, :cond_3

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v4, "getChildAt(...)"

    .line 30
    .line 31
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Lr0/d0;->b0(Landroid/view/View;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    invoke-static {p0}, Lr0/d0;->d0(Landroid/view/View;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0
.end method

.method public static final a(Lr0/d0;Landroid/view/ContextMenu;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    sget-boolean v2, Lz0/i;->a:Z

    .line 9
    .line 10
    invoke-static {}, Lz0/g;->F()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_8

    .line 17
    .line 18
    :cond_0
    const v2, 0x6d617201

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v5, 0x0

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    :try_start_0
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {v5, v3}, LD/h;->U(II)LR0/c;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    instance-of v6, v3, Ljava/util/Collection;

    .line 39
    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    move-object v6, v3

    .line 43
    check-cast v6, Ljava/util/Collection;

    .line 44
    .line 45
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_3

    .line 50
    .line 51
    :cond_2
    move v4, v5

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v3

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {v3}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :cond_4
    move-object v6, v3

    .line 60
    check-cast v6, LR0/b;

    .line 61
    .line 62
    iget-boolean v6, v6, LR0/b;->c:Z

    .line 63
    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    move-object v6, v3

    .line 67
    check-cast v6, LR0/b;

    .line 68
    .line 69
    invoke-virtual {v6}, LR0/b;->a()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    invoke-interface {p1, v6}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const-string v7, "getItem(...)"

    .line 78
    .line 79
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v6}, Lr0/d0;->s0(Landroid/view/MenuItem;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    goto :goto_2

    .line 93
    :goto_1
    new-instance v4, LE0/d;

    .line 94
    .line 95
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object v3, v4

    .line 99
    :goto_2
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 100
    .line 101
    instance-of v6, v3, LE0/d;

    .line 102
    .line 103
    if-eqz v6, :cond_5

    .line 104
    .line 105
    move-object v3, v4

    .line 106
    :cond_5
    check-cast v3, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    :goto_3
    const/4 v3, 0x0

    .line 113
    if-eqz v4, :cond_6

    .line 114
    .line 115
    invoke-virtual {p0, p2, p3, v3}, Lr0/d0;->O0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_8

    .line 119
    .line 120
    :cond_6
    sget-boolean v4, Lz0/i;->a:Z

    .line 121
    .line 122
    invoke-static {}, Lz0/g;->l()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    const/high16 v6, -0x80000000

    .line 127
    .line 128
    invoke-interface {p1, v5, v2, v6, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    iget-object v4, p0, Lr0/d0;->F:Ljava/util/WeakHashMap;

    .line 133
    .line 134
    new-instance v6, LE0/c;

    .line 135
    .line 136
    invoke-direct {v6, p2, p3}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v2, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, p2, p3, v3}, Lr0/d0;->O0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_7

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    if-eqz v6, :cond_9

    .line 165
    .line 166
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    check-cast v6, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 171
    .line 172
    invoke-virtual {v6}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-static {v6, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-eqz v6, :cond_8

    .line 181
    .line 182
    const-string p0, "\u5df2\u5728\u9690\u85cf\u540d\u5355\u4e2d"

    .line 183
    .line 184
    invoke-interface {v2, p0}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 185
    .line 186
    .line 187
    invoke-interface {v2, v5}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 188
    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    :goto_4
    new-instance v4, Lr0/N;

    .line 192
    .line 193
    invoke-direct {v4, p0, p2, p3}, Lr0/N;-><init>(Lr0/d0;Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v2, v4}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {p0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :goto_5
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :try_start_1
    invoke-static {p1}, Lr0/d0;->N(Ljava/lang/Object;)Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-static {p0}, LN0/o;->b(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_a

    .line 215
    .line 216
    move-object v3, p0

    .line 217
    :cond_a
    if-nez v3, :cond_b

    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_b
    invoke-interface {v3, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    if-nez p0, :cond_c

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_c
    invoke-interface {v3, v5, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    sget-object p0, LE0/i;->a:LE0/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :catchall_1
    move-exception p0

    .line 234
    new-instance p1, LE0/d;

    .line 235
    .line 236
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    move-object p0, p1

    .line 240
    :goto_6
    invoke-static {p0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    if-eqz p0, :cond_d

    .line 245
    .line 246
    const-string p1, "contact quick add menu move fail"

    .line 247
    .line 248
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :cond_d
    :goto_7
    const-string p0, "contact append menu"

    .line 256
    .line 257
    invoke-static {p0, v0, v1, p2}, Lr0/d0;->J0(Ljava/lang/String;JLjava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :goto_8
    return-void
.end method

.method public static a0(Landroid/widget/ListView;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    move v2, v0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "getChildAt(...)"

    .line 24
    .line 25
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v3}, Lr0/d0;->b0(Landroid/view/View;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    :goto_1
    return v0
.end method

.method public static final b(Lr0/d0;Ljava/util/List;Ljava/util/Set;)Ljava/util/ArrayList;
    .locals 14

    .line 1
    iget-object v0, p0, Lr0/d0;->z:LA0/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    invoke-static {v2}, Lr0/d0;->o0(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    move-object v3, v4

    .line 50
    :cond_2
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v4, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_5

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    move-object v2, v1

    .line 84
    check-cast v2, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p0}, Lr0/d0;->r()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-interface {v5, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_4

    .line 95
    .line 96
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    iget-object v0, p0, Lr0/d0;->l:Ljava/util/LinkedHashSet;

    .line 108
    .line 109
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lr0/d0;->z:LA0/i;

    .line 113
    .line 114
    if-eqz v0, :cond_7

    .line 115
    .line 116
    iget-object v1, v0, LA0/i;->g:Ljava/util/List;

    .line 117
    .line 118
    invoke-static {v1, v4}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    iget-object v6, v0, LA0/i;->a:Ljava/lang/String;

    .line 131
    .line 132
    iget-object v7, v0, LA0/i;->b:Ljava/lang/String;

    .line 133
    .line 134
    iget-object v8, v0, LA0/i;->c:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v9, v0, LA0/i;->d:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v10, v0, LA0/i;->e:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v11, v0, LA0/i;->f:Ljava/util/List;

    .line 141
    .line 142
    iget-object v13, v0, LA0/i;->h:Ljava/lang/String;

    .line 143
    .line 144
    new-instance v5, LA0/i;

    .line 145
    .line 146
    invoke-direct/range {v5 .. v13}, LA0/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    move-object v3, v5

    .line 150
    :cond_7
    iput-object v3, p0, Lr0/d0;->z:LA0/i;

    .line 151
    .line 152
    if-eqz v3, :cond_8

    .line 153
    .line 154
    iget-object v0, p0, Lr0/d0;->B:Landroid/content/Context;

    .line 155
    .line 156
    if-eqz v0, :cond_8

    .line 157
    .line 158
    invoke-static {v0, v3}, LA0/l;->w(Landroid/content/Context;LA0/i;)V

    .line 159
    .line 160
    .line 161
    :cond_8
    const/4 v7, 0x0

    .line 162
    const/4 v8, 0x0

    .line 163
    const-string v5, ","

    .line 164
    .line 165
    const/4 v6, 0x0

    .line 166
    const/16 v9, 0x3e

    .line 167
    .line 168
    invoke-static/range {v4 .. v9}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const-string v1, "hide contact learned mvvm item"

    .line 173
    .line 174
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :goto_2
    new-instance v0, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    :cond_9
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_a

    .line 199
    .line 200
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    move-object/from16 v2, p2

    .line 205
    .line 206
    invoke-virtual {p0, v1, v2}, Lr0/d0;->y0(Ljava/lang/Object;Ljava/util/Set;)Z

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-nez v3, :cond_9

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_a
    return-object v0
.end method

.method public static b0(Landroid/view/View;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    invoke-static {p0}, Lr0/d0;->d0(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_4

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 42
    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    check-cast p0, Landroid/view/ViewGroup;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    move v2, v1

    .line 52
    :goto_0
    if-ge v2, v0, :cond_5

    .line 53
    .line 54
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_3

    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-lez v4, :cond_3

    .line 69
    .line 70
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-lez v4, :cond_3

    .line 75
    .line 76
    invoke-virtual {v3}, Landroid/view/View;->isClickable()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-nez v4, :cond_4

    .line 81
    .line 82
    invoke-virtual {v3}, Landroid/view/View;->isLongClickable()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 93
    return p0

    .line 94
    :cond_5
    :goto_2
    return v1
.end method

.method public static final c(Lr0/d0;Landroid/view/View;Ljava/lang/String;)V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    sget-boolean v1, Lz0/i;->a:Z

    .line 6
    .line 7
    invoke-static {}, Lz0/g;->F()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_10

    .line 14
    .line 15
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    iget-wide v3, p0, Lr0/d0;->N:J

    .line 20
    .line 21
    sub-long/2addr v1, v3

    .line 22
    const-wide/16 v3, 0x3a98

    .line 23
    .line 24
    cmp-long v1, v1, v3

    .line 25
    .line 26
    if-lez v1, :cond_1

    .line 27
    .line 28
    goto/16 :goto_10

    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, Lr0/d0;->L:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v1, :cond_22

    .line 33
    .line 34
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    goto/16 :goto_10

    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0, p1}, Lr0/d0;->z0(Landroid/view/View;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    goto/16 :goto_10

    .line 49
    .line 50
    :cond_3
    instance-of v1, p1, Landroid/widget/TextView;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    if-eqz v1, :cond_7

    .line 54
    .line 55
    move-object v1, p1

    .line 56
    check-cast v1, Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    goto :goto_0

    .line 69
    :cond_4
    move-object v1, v2

    .line 70
    :goto_0
    if-nez v1, :cond_5

    .line 71
    .line 72
    const-string v1, ""

    .line 73
    .line 74
    :cond_5
    invoke-static {v1}, Lr0/d0;->u0(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_6

    .line 79
    .line 80
    move-object v1, p1

    .line 81
    goto :goto_1

    .line 82
    :cond_6
    move-object v1, v2

    .line 83
    :goto_1
    check-cast v1, Landroid/widget/TextView;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_7
    instance-of v1, p1, Landroid/widget/AdapterView;

    .line 87
    .line 88
    if-eqz v1, :cond_8

    .line 89
    .line 90
    move-object v1, v2

    .line 91
    goto :goto_2

    .line 92
    :cond_8
    invoke-static {p1}, Lr0/d0;->w(Landroid/view/View;)Landroid/widget/TextView;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    :goto_2
    if-nez v1, :cond_9

    .line 97
    .line 98
    goto/16 :goto_10

    .line 99
    .line 100
    :cond_9
    iget-object v1, p0, Lr0/d0;->P:Ljava/lang/ref/WeakReference;

    .line 101
    .line 102
    if-eqz v1, :cond_22

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-nez v1, :cond_a

    .line 109
    .line 110
    goto/16 :goto_10

    .line 111
    .line 112
    :cond_a
    instance-of v3, v1, Landroid/widget/PopupWindow;

    .line 113
    .line 114
    if-eqz v3, :cond_b

    .line 115
    .line 116
    check-cast v1, Landroid/widget/PopupWindow;

    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    goto/16 :goto_b

    .line 123
    .line 124
    :cond_b
    iget-object v3, p0, Lr0/d0;->J:Ljava/util/WeakHashMap;

    .line 125
    .line 126
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    check-cast v4, Landroid/view/View;

    .line 131
    .line 132
    if-eqz v4, :cond_c

    .line 133
    .line 134
    :goto_3
    move-object v1, v4

    .line 135
    goto/16 :goto_b

    .line 136
    .line 137
    :cond_c
    sget-object v4, Lr0/d0;->X:[Ljava/lang/String;

    .line 138
    .line 139
    array-length v5, v4

    .line 140
    const/4 v6, 0x0

    .line 141
    move v7, v6

    .line 142
    :goto_4
    if-ge v7, v5, :cond_10

    .line 143
    .line 144
    aget-object v8, v4, v7

    .line 145
    .line 146
    :try_start_0
    invoke-static {v1, v8}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    check-cast v8, Landroid/widget/PopupWindow;

    .line 151
    .line 152
    if-nez v8, :cond_d

    .line 153
    .line 154
    move-object v8, v2

    .line 155
    goto :goto_5

    .line 156
    :cond_d
    invoke-virtual {v8}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    goto :goto_5

    .line 161
    :catchall_0
    move-exception v8

    .line 162
    new-instance v9, LE0/d;

    .line 163
    .line 164
    invoke-direct {v9, v8}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    move-object v8, v9

    .line 168
    :goto_5
    nop

    .line 169
    instance-of v9, v8, LE0/d;

    .line 170
    .line 171
    if-eqz v9, :cond_e

    .line 172
    .line 173
    move-object v8, v2

    .line 174
    :cond_e
    check-cast v8, Landroid/view/View;

    .line 175
    .line 176
    if-eqz v8, :cond_f

    .line 177
    .line 178
    invoke-virtual {v3, v1, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-object v1, v8

    .line 182
    goto :goto_b

    .line 183
    :cond_f
    add-int/2addr v7, v0

    .line 184
    goto :goto_4

    .line 185
    :cond_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    :goto_6
    if-eqz v4, :cond_14

    .line 190
    .line 191
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    const-string v7, "getDeclaredFields(...)"

    .line 196
    .line 197
    invoke-static {v5, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    array-length v7, v5

    .line 201
    move v8, v6

    .line 202
    :goto_7
    if-ge v8, v7, :cond_13

    .line 203
    .line 204
    aget-object v9, v5, v8

    .line 205
    .line 206
    :try_start_1
    invoke-virtual {v9, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v9, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 213
    goto :goto_8

    .line 214
    :catchall_1
    move-exception v9

    .line 215
    new-instance v10, LE0/d;

    .line 216
    .line 217
    invoke-direct {v10, v9}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    move-object v9, v10

    .line 221
    :goto_8
    nop

    .line 222
    instance-of v10, v9, LE0/d;

    .line 223
    .line 224
    if-eqz v10, :cond_11

    .line 225
    .line 226
    move-object v9, v2

    .line 227
    :cond_11
    instance-of v10, v9, Landroid/widget/PopupWindow;

    .line 228
    .line 229
    if-eqz v10, :cond_12

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_12
    add-int/2addr v8, v0

    .line 233
    goto :goto_7

    .line 234
    :cond_13
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    goto :goto_6

    .line 239
    :cond_14
    move-object v9, v2

    .line 240
    :goto_9
    check-cast v9, Landroid/widget/PopupWindow;

    .line 241
    .line 242
    if-eqz v9, :cond_16

    .line 243
    .line 244
    :try_start_2
    invoke-virtual {v9}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 248
    goto :goto_a

    .line 249
    :catchall_2
    move-exception v4

    .line 250
    new-instance v5, LE0/d;

    .line 251
    .line 252
    invoke-direct {v5, v4}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    move-object v4, v5

    .line 256
    :goto_a
    nop

    .line 257
    instance-of v5, v4, LE0/d;

    .line 258
    .line 259
    if-eqz v5, :cond_15

    .line 260
    .line 261
    move-object v4, v2

    .line 262
    :cond_15
    check-cast v4, Landroid/view/View;

    .line 263
    .line 264
    if-eqz v4, :cond_16

    .line 265
    .line 266
    invoke-virtual {v3, v1, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    goto/16 :goto_3

    .line 270
    .line 271
    :cond_16
    move-object v1, v2

    .line 272
    :goto_b
    if-nez v1, :cond_17

    .line 273
    .line 274
    goto/16 :goto_10

    .line 275
    .line 276
    :cond_17
    :goto_c
    if-eqz p1, :cond_22

    .line 277
    .line 278
    if-ne p1, v1, :cond_20

    .line 279
    .line 280
    iget-object p1, p0, Lr0/d0;->L:Ljava/lang/String;

    .line 281
    .line 282
    if-eqz p1, :cond_18

    .line 283
    .line 284
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    goto :goto_d

    .line 293
    :cond_18
    move-object p1, v2

    .line 294
    :goto_d
    if-eqz p1, :cond_1f

    .line 295
    .line 296
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_19

    .line 301
    .line 302
    goto :goto_f

    .line 303
    :cond_19
    iget-object v1, p0, Lr0/d0;->M:Ljava/lang/String;

    .line 304
    .line 305
    if-eqz v1, :cond_1b

    .line 306
    .line 307
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    if-eqz v1, :cond_1b

    .line 316
    .line 317
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    if-nez v3, :cond_1a

    .line 322
    .line 323
    goto :goto_e

    .line 324
    :cond_1a
    move-object v1, v2

    .line 325
    :goto_e
    if-nez v1, :cond_1c

    .line 326
    .line 327
    :cond_1b
    move-object v1, p1

    .line 328
    :cond_1c
    iget-object v3, p0, Lr0/d0;->P:Ljava/lang/ref/WeakReference;

    .line 329
    .line 330
    if-eqz v3, :cond_1d

    .line 331
    .line 332
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    :cond_1d
    iput-boolean v0, p0, Lr0/d0;->O:Z

    .line 337
    .line 338
    invoke-virtual {p0, p1, v1}, Lr0/d0;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    if-eqz v2, :cond_1e

    .line 342
    .line 343
    invoke-virtual {p0, v2}, Lr0/d0;->s(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    :cond_1e
    const-string p0, "contact quick add framework click handled"

    .line 347
    .line 348
    filled-new-array {p0, p2, p1, v1}, [Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    goto :goto_10

    .line 356
    :cond_1f
    :goto_f
    const-string p0, "contact quick add click empty user"

    .line 357
    .line 358
    filled-new-array {p0, p2}, [Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    goto :goto_10

    .line 366
    :cond_20
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    instance-of v3, p1, Landroid/view/View;

    .line 371
    .line 372
    if-eqz v3, :cond_21

    .line 373
    .line 374
    check-cast p1, Landroid/view/View;

    .line 375
    .line 376
    goto :goto_c

    .line 377
    :cond_21
    move-object p1, v2

    .line 378
    goto :goto_c

    .line 379
    :cond_22
    :goto_10
    return-void
.end method

.method public static c0(Landroid/view/View;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    instance-of v1, p0, Landroid/widget/ListView;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    check-cast p0, Landroid/widget/ListView;

    .line 17
    .line 18
    invoke-static {p0}, Lr0/d0;->a0(Landroid/widget/ListView;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_2
    invoke-static {p0}, Lr0/d0;->H0(Landroid/view/View;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    invoke-static {p0}, Lr0/d0;->Z(Landroid/view/View;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_3
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eqz v1, :cond_5

    .line 37
    .line 38
    check-cast p0, Landroid/view/ViewGroup;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    move v2, v0

    .line 45
    :goto_0
    if-ge v2, v1, :cond_5

    .line 46
    .line 47
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v3}, Lr0/d0;->c0(Landroid/view/View;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_4

    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_5
    :goto_1
    return v0
.end method

.method public static final d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lr0/d0;->x0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    sget-boolean v0, Lz0/i;->a:Z

    .line 10
    .line 11
    invoke-static {}, Lz0/g;->F()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iget-wide v2, p0, Lr0/d0;->N:J

    .line 24
    .line 25
    sub-long/2addr v0, v2

    .line 26
    const-wide/16 v2, 0x3a98

    .line 27
    .line 28
    cmp-long v0, v0, v2

    .line 29
    .line 30
    if-lez v0, :cond_2

    .line 31
    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_2
    iget-object v0, p0, Lr0/d0;->L:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v0, :cond_10

    .line 37
    .line 38
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_10

    .line 47
    .line 48
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const/4 v2, 0x0

    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    move-object v7, v0

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    move-object v7, v2

    .line 58
    :goto_0
    if-nez v7, :cond_4

    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_4
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-nez v6, :cond_5

    .line 67
    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_5
    if-nez p2, :cond_6

    .line 71
    .line 72
    move-object v0, v6

    .line 73
    goto :goto_1

    .line 74
    :cond_6
    move-object v0, p2

    .line 75
    :goto_1
    invoke-virtual {p0, v0}, Lr0/d0;->z0(Landroid/view/View;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_7

    .line 80
    .line 81
    goto/16 :goto_5

    .line 82
    .line 83
    :cond_7
    invoke-static {v6}, Lr0/d0;->w(Landroid/view/View;)Landroid/widget/TextView;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_9

    .line 88
    .line 89
    iget-object p2, p0, Lr0/d0;->J:Ljava/util/WeakHashMap;

    .line 90
    .line 91
    invoke-virtual {p2, p1, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    iget-object p2, p0, Lr0/d0;->M:Ljava/lang/String;

    .line 95
    .line 96
    if-nez p2, :cond_8

    .line 97
    .line 98
    move-object p2, v7

    .line 99
    :cond_8
    invoke-virtual {p0, v7, p2, p1}, Lr0/d0;->O0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_9
    if-eqz p2, :cond_a

    .line 104
    .line 105
    invoke-virtual {p0, p2}, Lr0/d0;->t0(Landroid/view/View;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_a

    .line 110
    .line 111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    const-wide/16 v3, 0x9c4

    .line 116
    .line 117
    add-long/2addr v0, v3

    .line 118
    iput-wide v0, p0, Lr0/d0;->C:J

    .line 119
    .line 120
    :cond_a
    if-eqz p2, :cond_b

    .line 121
    .line 122
    invoke-virtual {p0, p2}, Lr0/d0;->t0(Landroid/view/View;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_c

    .line 127
    .line 128
    :cond_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 129
    .line 130
    .line 131
    move-result-wide v0

    .line 132
    iget-wide v3, p0, Lr0/d0;->C:J

    .line 133
    .line 134
    cmp-long v0, v0, v3

    .line 135
    .line 136
    if-gtz v0, :cond_10

    .line 137
    .line 138
    :cond_c
    iget-object v0, p0, Lr0/d0;->M:Ljava/lang/String;

    .line 139
    .line 140
    if-eqz v0, :cond_f

    .line 141
    .line 142
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-eqz v0, :cond_f

    .line 151
    .line 152
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-nez v1, :cond_d

    .line 157
    .line 158
    move-object v2, v0

    .line 159
    :cond_d
    if-nez v2, :cond_e

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_e
    move-object v5, v6

    .line 163
    move-object v6, v7

    .line 164
    move-object v7, v2

    .line 165
    :goto_2
    move-object v3, p0

    .line 166
    move-object v4, p1

    .line 167
    move-object v9, p2

    .line 168
    move-object v8, p3

    .line 169
    goto :goto_4

    .line 170
    :cond_f
    :goto_3
    move-object v5, v6

    .line 171
    move-object v6, v7

    .line 172
    goto :goto_2

    .line 173
    :goto_4
    invoke-virtual/range {v3 .. v9}, Lr0/d0;->b1(Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)Z

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    move-object v10, v9

    .line 178
    move-object v9, v8

    .line 179
    move-object v8, v7

    .line 180
    move-object v7, v6

    .line 181
    move-object v6, v5

    .line 182
    move-object v5, v4

    .line 183
    move-object v4, v3

    .line 184
    if-nez p0, :cond_10

    .line 185
    .line 186
    new-instance v3, Lr0/K;

    .line 187
    .line 188
    const/4 v11, 0x0

    .line 189
    invoke-direct/range {v3 .. v11}, Lr0/K;-><init>(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 193
    .line 194
    .line 195
    new-instance v3, Lr0/K;

    .line 196
    .line 197
    const/4 v11, 0x1

    .line 198
    invoke-direct/range {v3 .. v11}, Lr0/K;-><init>(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;I)V

    .line 199
    .line 200
    .line 201
    const-wide/16 p0, 0x10

    .line 202
    .line 203
    invoke-virtual {v6, v3, p0, p1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 204
    .line 205
    .line 206
    new-instance v3, Lr0/K;

    .line 207
    .line 208
    const/4 v11, 0x2

    .line 209
    invoke-direct/range {v3 .. v11}, Lr0/K;-><init>(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;I)V

    .line 210
    .line 211
    .line 212
    const-wide/16 p0, 0x50

    .line 213
    .line 214
    invoke-virtual {v6, v3, p0, p1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 215
    .line 216
    .line 217
    :cond_10
    :goto_5
    return-void
.end method

.method public static d0(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p0}, Lr0/d0;->q(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v0}, Lr0/d0;->D0(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 60
    return p0
.end method

.method public static final e(Lr0/d0;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "input"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean v0, p0, Lr0/d0;->q:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-boolean v1, p0, Lr0/d0;->q:Z

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-boolean v0, p0, Lr0/d0;->r:Z

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_2
    iput-boolean v1, p0, Lr0/d0;->r:Z

    .line 27
    .line 28
    :goto_1
    const/16 v0, 0x8

    .line 29
    .line 30
    invoke-static {p2, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v5, Lo0/b;

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-direct {v5, p0, p3, v0}, Lo0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/16 v6, 0x1e

    .line 42
    .line 43
    const-string v2, " || "

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-static/range {v1 .. v6}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string p3, "hide contact live list "

    .line 51
    .line 52
    const-string v0, " sample"

    .line 53
    .line 54
    invoke-static {p3, p1, v0}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    const-string p3, "size="

    .line 63
    .line 64
    invoke-static {p2, p3}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    filled-new-array {p1, p2, p0}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static final e0(Lr0/d0;Landroid/view/View;Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_8

    .line 8
    .line 9
    :cond_0
    instance-of v0, p2, Landroid/widget/TextView;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_c

    .line 13
    .line 14
    move-object v0, p2

    .line 15
    check-cast v0, Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_c

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v2, v3

    .line 36
    :goto_0
    const-string v4, ""

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    move-object v2, v4

    .line 41
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v2}, Lr0/d0;->D0(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_c

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    instance-of p2, p0, Landroid/view/ViewGroup;

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    check-cast p0, Landroid/view/ViewGroup;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move-object p0, v3

    .line 62
    :goto_1
    move-object p2, v0

    .line 63
    :goto_2
    if-eqz p0, :cond_9

    .line 64
    .line 65
    if-eq p0, p1, :cond_9

    .line 66
    .line 67
    instance-of v2, p0, Landroid/widget/ListView;

    .line 68
    .line 69
    if-nez v2, :cond_9

    .line 70
    .line 71
    invoke-static {p0}, Lr0/d0;->H0(Landroid/view/View;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    move v5, v1

    .line 83
    :goto_3
    if-ge v5, v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    instance-of v7, v6, Landroid/widget/ListView;

    .line 90
    .line 91
    if-nez v7, :cond_9

    .line 92
    .line 93
    invoke-static {v6}, LN0/g;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v6}, Lr0/d0;->H0(Landroid/view/View;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_5

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    const/4 v5, 0x4

    .line 111
    if-le v2, v5, :cond_7

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    instance-of v2, p2, Landroid/view/ViewGroup;

    .line 119
    .line 120
    if-eqz v2, :cond_8

    .line 121
    .line 122
    check-cast p2, Landroid/view/ViewGroup;

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_8
    move-object p2, v3

    .line 126
    :goto_4
    move-object v8, p2

    .line 127
    move-object p2, p0

    .line 128
    move-object p0, v8

    .line 129
    goto :goto_2

    .line 130
    :cond_9
    :goto_5
    const/16 p0, 0x8

    .line 131
    .line 132
    invoke-virtual {p2, p0}, Landroid/view/View;->setVisibility(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-eqz p0, :cond_a

    .line 140
    .line 141
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    :cond_a
    if-nez v3, :cond_b

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_b
    move-object v4, v3

    .line 149
    :goto_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    const-string p1, "hide contact loading mask cleared"

    .line 158
    .line 159
    filled-new-array {p1, v4, p0}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_c
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 168
    .line 169
    if-eqz v0, :cond_d

    .line 170
    .line 171
    check-cast p2, Landroid/view/ViewGroup;

    .line 172
    .line 173
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    :goto_7
    if-ge v1, v0, :cond_d

    .line 178
    .line 179
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    const-string v3, "getChildAt(...)"

    .line 184
    .line 185
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-static {p0, p1, v2}, Lr0/d0;->e0(Lr0/d0;Landroid/view/View;Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    add-int/lit8 v1, v1, 0x1

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_d
    :goto_8
    return-void
.end method

.method public static final f(Lr0/d0;Landroid/view/View;Ljava/lang/Object;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "force="

    .line 5
    .line 6
    const-string v1, "context="

    .line 7
    .line 8
    const-string v2, "view="

    .line 9
    .line 10
    sget-boolean v3, Lz0/i;->a:Z

    .line 11
    .line 12
    invoke-static {}, Lz0/g;->F()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto/16 :goto_7

    .line 23
    .line 24
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lr0/d0;->x0()Z

    .line 25
    .line 26
    .line 27
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    const/4 v4, 0x0

    .line 29
    const-string v5, ""

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    if-eqz v3, :cond_5

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    const-string v9, "po5."

    .line 46
    .line 47
    invoke-static {v8, v4, v9}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-ne v8, v7, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    if-eqz v8, :cond_3

    .line 59
    .line 60
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    move-object v8, v6

    .line 70
    :goto_0
    if-nez v8, :cond_4

    .line 71
    .line 72
    move-object v8, v5

    .line 73
    :cond_4
    invoke-static {v8}, Lr0/d0;->q0(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_5

    .line 78
    .line 79
    :goto_1
    move v4, v7

    .line 80
    :cond_5
    if-nez v4, :cond_6

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Lr0/d0;->t0(Landroid/view/View;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_6

    .line 87
    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_6
    invoke-static {p1}, Lr0/d0;->B(Landroid/view/View;)Landroid/widget/ListView;

    .line 91
    .line 92
    .line 93
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    const/4 v8, -0x1

    .line 95
    if-eqz v7, :cond_8

    .line 96
    .line 97
    :try_start_2
    invoke-virtual {v7, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception v7

    .line 107
    :try_start_3
    new-instance v9, LE0/d;

    .line 108
    .line 109
    invoke-direct {v9, v7}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    move-object v7, v9

    .line 113
    :goto_2
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    instance-of v9, v7, LE0/d;

    .line 118
    .line 119
    if-eqz v9, :cond_7

    .line 120
    .line 121
    move-object v7, v8

    .line 122
    :cond_7
    check-cast v7, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    :cond_8
    invoke-virtual {p0, p1, v8, p2, v4}, Lr0/d0;->S0(Landroid/view/View;ILjava/lang/Object;Z)LE0/c;

    .line 129
    .line 130
    .line 131
    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 132
    const-string v8, "listener="

    .line 133
    .line 134
    if-nez v7, :cond_b

    .line 135
    .line 136
    :try_start_4
    const-string p0, "contact quick add candidate miss"

    .line 137
    .line 138
    if-eqz p2, :cond_9

    .line 139
    .line 140
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    goto :goto_3

    .line 149
    :cond_9
    move-object p2, v6

    .line 150
    :goto_3
    new-instance v3, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    if-eqz p1, :cond_a

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    new-instance v1, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    filled-new-array {p0, p2, v2, p1, v0}, [Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 217
    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_b
    iget-object p1, v7, LE0/c;->b:Ljava/lang/Object;

    .line 221
    .line 222
    iget-object v0, v7, LE0/c;->a:Ljava/lang/Object;

    .line 223
    .line 224
    if-eqz p2, :cond_c

    .line 225
    .line 226
    :try_start_5
    iget-object v1, p0, Lr0/d0;->I:Ljava/util/WeakHashMap;

    .line 227
    .line 228
    invoke-virtual {v1, p2, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    :cond_c
    if-eqz v3, :cond_d

    .line 232
    .line 233
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 234
    .line 235
    .line 236
    move-result-wide v1

    .line 237
    const-wide/16 v3, 0x9c4

    .line 238
    .line 239
    add-long/2addr v1, v3

    .line 240
    iput-wide v1, p0, Lr0/d0;->C:J

    .line 241
    .line 242
    :cond_d
    const-string v1, "contact quick add candidate hit"

    .line 243
    .line 244
    move-object v2, p1

    .line 245
    check-cast v2, Ljava/lang/String;

    .line 246
    .line 247
    if-nez v2, :cond_e

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_e
    move-object v5, v2

    .line 251
    :goto_4
    if-eqz p2, :cond_f

    .line 252
    .line 253
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    goto :goto_5

    .line 262
    :cond_f
    move-object p2, v6

    .line 263
    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    filled-new-array {v1, v0, v5, p2}, [Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    invoke-static {p2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    check-cast v0, Ljava/lang/String;

    .line 283
    .line 284
    check-cast p1, Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {p0, v0, p1, v6}, Lr0/d0;->O0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    sget-object p0, LE0/i;->a:LE0/i;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :catchall_1
    move-exception p0

    .line 293
    new-instance p1, LE0/d;

    .line 294
    .line 295
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    move-object p0, p1

    .line 299
    :goto_6
    invoke-static {p0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    if-eqz p0, :cond_10

    .line 304
    .line 305
    const-string p1, "contact quick add runtime long click resolve fail"

    .line 306
    .line 307
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_10
    :goto_7
    return-void
.end method

.method public static final g(Lr0/d0;Ljava/lang/Object;)LE0/c;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "d"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, v0

    .line 20
    :goto_0
    invoke-virtual {p0, p1}, Lr0/d0;->G(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    invoke-static {v0}, Lr0/d0;->B0(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v0, v1

    .line 35
    :goto_1
    if-nez v0, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-virtual {p0, p1, v0}, Lr0/d0;->H(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_3

    .line 43
    .line 44
    move-object p1, v0

    .line 45
    :cond_3
    invoke-virtual {p0, v0, p1, v1}, Lr0/d0;->O0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p0, LE0/c;

    .line 49
    .line 50
    invoke-direct {p0, v0, p1}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_4
    :goto_2
    return-object v1
.end method

.method public static final h(Lr0/d0;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lr0/d0;->V()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lr0/d0;->I(Landroid/view/View;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lr0/d0;->G(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v1, v2

    .line 32
    :goto_0
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v1, v2

    .line 42
    :goto_1
    if-eqz v1, :cond_3

    .line 43
    .line 44
    :goto_2
    move-object v2, v1

    .line 45
    goto :goto_4

    .line 46
    :cond_3
    new-instance v1, LN0/l;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {v1, p0, p1}, Lr0/d0;->D(LN0/l;Lr0/d0;Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v1, LN0/l;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ljava/lang/String;

    .line 57
    .line 58
    if-eqz v1, :cond_5

    .line 59
    .line 60
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_4

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    move-object v1, v2

    .line 68
    :goto_3
    if-eqz v1, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    :goto_4
    if-eqz v2, :cond_7

    .line 72
    .line 73
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_6

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_6
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lr0/d0;->f0(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_7
    :goto_5
    invoke-virtual {p0, p1}, Lr0/d0;->V0(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public static final i(Lr0/d0;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr0/d0;->F()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lr0/d0;->f:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    if-ne p1, v0, :cond_2

    .line 26
    .line 27
    sget-boolean p0, Lz0/i;->a:Z

    .line 28
    .line 29
    invoke-static {}, Lz0/g;->z()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_2
    iget-object p0, p0, Lr0/d0;->d:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    if-eqz p0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    if-ne p1, p0, :cond_3

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public static final j(Lr0/d0;Ljava/lang/Object;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lr0/d0;->F()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

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
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    invoke-static {}, Lz0/r;->u()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lr0/d0;->z:LA0/i;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-boolean v0, Lz0/i;->a:Z

    .line 26
    .line 27
    invoke-static {}, Lz0/g;->z()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_2
    :goto_0
    if-nez p1, :cond_3

    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_3
    invoke-static {}, Lz0/r;->u()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v2, 0x1

    .line 42
    if-nez v0, :cond_5

    .line 43
    .line 44
    iget-object v0, p0, Lr0/d0;->z:LA0/i;

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    move v0, v1

    .line 50
    goto :goto_2

    .line 51
    :cond_5
    :goto_1
    move v0, v2

    .line 52
    :goto_2
    iget-object v3, p0, Lr0/d0;->h:Ljava/util/Set;

    .line 53
    .line 54
    if-eqz v0, :cond_7

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v4, p0, Lr0/d0;->z:LA0/i;

    .line 65
    .line 66
    if-eqz v4, :cond_6

    .line 67
    .line 68
    iget-object v4, v4, LA0/i;->b:Ljava/lang/String;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_6
    const-string v4, "com.tencent.mm.ui.contact.address.AddressLiveList"

    .line 72
    .line 73
    :goto_3
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    invoke-interface {v3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    return v2

    .line 83
    :cond_7
    iget-object v0, p0, Lr0/d0;->a:Ljava/lang/ref/WeakReference;

    .line 84
    .line 85
    if-eqz v0, :cond_a

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-nez v0, :cond_8

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_8
    invoke-virtual {p0, v0}, Lr0/d0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    if-nez p0, :cond_9

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_9
    invoke-interface {v3, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    if-ne p1, p0, :cond_a

    .line 105
    .line 106
    return v2

    .line 107
    :cond_a
    :goto_4
    return v1
.end method

.method public static l(Ljava/util/LinkedHashSet;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    sget-object v0, Lr0/d0;->c0:LU0/g;

    .line 12
    .line 13
    invoke-static {v0, p1}, LU0/g;->c(LU0/g;Ljava/lang/String;)LK0/h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, LT0/g;

    .line 18
    .line 19
    invoke-direct {v0, p1}, LT0/g;-><init>(LK0/h;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0}, LT0/g;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, LT0/g;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, LU0/d;

    .line 33
    .line 34
    iget-object p1, p1, LU0/d;->a:Ljava/util/regex/Matcher;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v1, "group(...)"

    .line 41
    .line 42
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :goto_1
    return-void
.end method

.method public static m(Ljava/lang/Object;)Landroid/widget/ListView;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "getDeclaredMethods(...)"

    .line 13
    .line 14
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    array-length v3, v2

    .line 18
    const/4 v4, 0x0

    .line 19
    :goto_1
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    aget-object v5, v2, v4

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const-string v7, "getListView"

    .line 28
    .line 29
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const-string v7, "getParameterTypes(...)"

    .line 40
    .line 41
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    array-length v6, v6

    .line 45
    if-nez v6, :cond_0

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object v5, v1

    .line 52
    :goto_2
    if-eqz v5, :cond_4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    :try_start_0
    invoke-virtual {v5, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    instance-of v0, p0, Landroid/widget/ListView;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    check-cast p0, Landroid/widget/ListView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto :goto_3

    .line 71
    :cond_2
    move-object p0, v1

    .line 72
    goto :goto_4

    .line 73
    :goto_3
    new-instance v0, LE0/d;

    .line 74
    .line 75
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    move-object p0, v0

    .line 79
    :goto_4
    nop

    .line 80
    instance-of v0, p0, LE0/d;

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_3
    move-object v1, p0

    .line 86
    :goto_5
    check-cast v1, Landroid/widget/ListView;

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto :goto_0

    .line 94
    :cond_5
    return-object v1
.end method

.method public static n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    const-class v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_6

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "getDeclaredMethods(...)"

    .line 21
    .line 22
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    array-length v3, v2

    .line 26
    const/4 v4, 0x0

    .line 27
    :goto_1
    if-ge v4, v3, :cond_1

    .line 28
    .line 29
    aget-object v5, v2, v4

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-static {v6, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-string v7, "getParameterTypes(...)"

    .line 46
    .line 47
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    array-length v6, v6

    .line 51
    if-nez v6, :cond_0

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const-class v7, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_0

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move-object v5, v1

    .line 70
    :goto_2
    if-eqz v5, :cond_5

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    instance-of p1, p0, Ljava/lang/String;

    .line 81
    .line 82
    if-eqz p1, :cond_2

    .line 83
    .line 84
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    goto :goto_3

    .line 89
    :cond_2
    move-object p0, v1

    .line 90
    goto :goto_4

    .line 91
    :goto_3
    new-instance p1, LE0/d;

    .line 92
    .line 93
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object p0, p1

    .line 97
    :goto_4
    nop

    .line 98
    instance-of p1, p0, LE0/d;

    .line 99
    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    move-object p0, v1

    .line 103
    :cond_3
    check-cast p0, Ljava/lang/String;

    .line 104
    .line 105
    if-eqz p0, :cond_4

    .line 106
    .line 107
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_4

    .line 112
    .line 113
    move-object v1, p0

    .line 114
    :cond_4
    return-object v1

    .line 115
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    goto :goto_0

    .line 120
    :cond_6
    return-object v1
.end method

.method public static n0(Landroid/widget/ListView;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    sget-object v1, Lr0/d0;->a0:[Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, v0}, LF0/h;->b0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    const-string v1, "com.tencent.mm.ui.contact"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {v0, v3, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 40
    .line 41
    const-string v6, "getItem"

    .line 42
    .line 43
    invoke-interface {v5, v1, v6, v4}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-array v1, v3, [Ljava/lang/Object;

    .line 55
    .line 56
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 57
    .line 58
    const-string v5, "getCount"

    .line 59
    .line 60
    invoke-interface {v4, p1, v5, v1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    goto :goto_0

    .line 82
    :cond_4
    const/4 p0, 0x0

    .line 83
    :goto_0
    if-nez p0, :cond_5

    .line 84
    .line 85
    const-string p0, ""

    .line 86
    .line 87
    :cond_5
    invoke-static {p0}, Lr0/d0;->q0(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-nez p0, :cond_7

    .line 92
    .line 93
    const-string p0, "contact"

    .line 94
    .line 95
    invoke-static {v0, p0, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_6

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    :goto_1
    return v3

    .line 103
    :cond_7
    :goto_2
    return v2
.end method

.method public static o0(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    if-eqz p0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "com.tencent.mm.storage.s3"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public static final p(Landroid/view/View;Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    .line 1
    if-eq p2, p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    move-object v0, p2

    .line 8
    check-cast v0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->isClickable()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->isLongClickable()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_1
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    check-cast p2, Landroid/view/ViewGroup;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-ge v1, v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "getChildAt(...)"

    .line 43
    .line 44
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, p1, v2}, Lr0/d0;->p(Landroid/view/View;Ljava/util/ArrayList;Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-void
.end method

.method public static p0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)Z
    .locals 3

    .line 1
    invoke-static {p0, p1, p2}, Lr0/d0;->R0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x3

    .line 6
    new-array v0, v0, [Landroid/view/View;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aput-object p2, v0, v1

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    aput-object p1, v0, p2

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    aput-object p0, v0, p1

    .line 16
    .line 17
    invoke-static {v0}, LF0/h;->a0([Ljava/lang/Object;)LT0/h;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, LT0/k;->c:LT0/k;

    .line 22
    .line 23
    new-instance v0, LT0/f;

    .line 24
    .line 25
    invoke-direct {v0, p0, v1, p1}, LT0/f;-><init>(LT0/h;ZLM0/l;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, LT0/b;

    .line 29
    .line 30
    new-instance p1, LT0/e;

    .line 31
    .line 32
    invoke-direct {p1, v0}, LT0/e;-><init>(LT0/f;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, p1}, LT0/b;-><init>(Ljava/util/Iterator;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    :goto_0
    invoke-virtual {p0}, LF0/b;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, LF0/b;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getWindowVisibility()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_0

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v2, 0x0

    .line 67
    cmpg-float v0, v0, v2

    .line 68
    .line 69
    if-gtz v0, :cond_1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    new-instance v0, Landroid/graphics/Rect;

    .line 73
    .line 74
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_0

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-lez p1, :cond_0

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-lez p1, :cond_0

    .line 94
    .line 95
    return p2

    .line 96
    :cond_2
    return v1
.end method

.method public static final q(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-nez v0, :cond_1

    .line 31
    .line 32
    const-string v0, ""

    .line 33
    .line 34
    :cond_1
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    check-cast p1, Landroid/view/ViewGroup;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v1, 0x0

    .line 54
    :goto_1
    if-ge v1, v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "getChildAt(...)"

    .line 61
    .line 62
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v2}, Lr0/d0;->q(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    return-void
.end method

.method public static q0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "AddressUI"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "MvvmAddressUI"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    return v1
.end method

.method public static s0(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-interface {p0}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x6d617201

    .line 6
    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-interface {p0}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    :goto_0
    if-nez p0, :cond_2

    .line 24
    .line 25
    const-string p0, ""

    .line 26
    .line 27
    :cond_2
    invoke-static {p0}, Lr0/d0;->u0(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    .line 33
    const-string v0, "\u9690\u85cf\u540d\u5355"

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    return v1

    .line 44
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 45
    return p0
.end method

.method public static t(Landroid/content/Context;I)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p1, p0

    .line 13
    const/high16 p0, 0x3f000000    # 0.5f

    .line 14
    .line 15
    add-float/2addr p1, p0

    .line 16
    float-to-int p0, p1

    .line 17
    return p0
.end method

.method public static u0(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->l()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string v0, "\u52a0\u5165\u540d\u5355"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method public static v0(Landroid/widget/ListView;)Z
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "mfg"

    .line 6
    .line 7
    const-string v2, "id"

    .line 8
    .line 9
    const-string v3, "com.tencent.mm"

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    new-instance v1, LE0/d;

    .line 22
    .line 23
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :goto_0
    const/4 v1, 0x0

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    instance-of v2, v0, LE0/d;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    move-object v0, v1

    .line 37
    :cond_0
    check-cast v0, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x1

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-ne v2, v0, :cond_1

    .line 51
    .line 52
    return v1

    .line 53
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-eqz p0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/4 p0, 0x0

    .line 69
    :goto_1
    if-nez p0, :cond_3

    .line 70
    .line 71
    const-string p0, ""

    .line 72
    .line 73
    :cond_3
    const-string v0, "Search"

    .line 74
    .line 75
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    return p0
.end method

.method public static w(Landroid/view/View;)Landroid/widget/TextView;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_3

    .line 5
    :cond_0
    instance-of v1, p0, Landroid/widget/TextView;

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    check-cast v1, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object v2, v0

    .line 24
    :goto_0
    if-nez v2, :cond_2

    .line 25
    .line 26
    const-string v2, ""

    .line 27
    .line 28
    :cond_2
    invoke-static {v2}, Lr0/d0;->u0(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_3
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    check-cast p0, Landroid/view/ViewGroup;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    move-object p0, v0

    .line 43
    :goto_1
    if-nez p0, :cond_5

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v2, 0x0

    .line 51
    :goto_2
    if-ge v2, v1, :cond_7

    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v3}, Lr0/d0;->w(Landroid/view/View;)Landroid/widget/TextView;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_6

    .line 62
    .line 63
    return-object v3

    .line 64
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_7
    :goto_3
    return-object v0
.end method

.method public static w0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, ".ui.conversation."

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, ".conversation."

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    return v1
.end method

.method public static x(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    instance-of v1, p0, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    check-cast v1, Landroid/widget/LinearLayout;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    invoke-static {p0}, Lr0/d0;->w(Landroid/view/View;)Landroid/widget/TextView;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    check-cast p0, Landroid/view/ViewGroup;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    check-cast p0, Landroid/view/ViewGroup;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move-object p0, v0

    .line 36
    :goto_0
    if-nez p0, :cond_3

    .line 37
    .line 38
    :goto_1
    return-object v0

    .line 39
    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x0

    .line 44
    :goto_2
    if-ge v1, v0, :cond_5

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, Lr0/d0;->x(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_4

    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_5
    return-object p0
.end method

.method public static z(Ljava/lang/Object;)Landroid/view/View;
    .locals 9

    .line 1
    :try_start_0
    const-string v0, "p"

    .line 2
    .line 3
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 4
    .line 5
    invoke-interface {v1, p0, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Landroid/view/View;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :catchall_0
    :cond_0
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez p0, :cond_2

    .line 19
    .line 20
    :cond_1
    move-object v6, v1

    .line 21
    goto :goto_3

    .line 22
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :goto_0
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "getDeclaredFields(...)"

    .line 33
    .line 34
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    array-length v4, v3

    .line 38
    move v5, v0

    .line 39
    :goto_1
    if-ge v5, v4, :cond_5

    .line 40
    .line 41
    aget-object v6, v3, v5

    .line 42
    .line 43
    const/4 v7, 0x1

    .line 44
    :try_start_1
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    if-nez v6, :cond_3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    instance-of v7, v6, Landroid/view/View;

    .line 55
    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    const-string v8, "androidx.recyclerview.widget.RecyclerView"

    .line 67
    .line 68
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_4

    .line 73
    .line 74
    check-cast v6, Landroid/view/View;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :catchall_1
    :cond_4
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    goto :goto_0

    .line 85
    :goto_3
    if-nez v6, :cond_11

    .line 86
    .line 87
    :try_start_2
    const-string v2, "getView"

    .line 88
    .line 89
    new-array v3, v0, [Ljava/lang/Object;

    .line 90
    .line 91
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 92
    .line 93
    invoke-interface {v4, p0, v2, v3}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Landroid/view/View;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :catchall_2
    move-exception v2

    .line 101
    new-instance v3, LE0/d;

    .line 102
    .line 103
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    move-object v2, v3

    .line 107
    :goto_4
    nop

    .line 108
    instance-of v3, v2, LE0/d;

    .line 109
    .line 110
    if-eqz v3, :cond_6

    .line 111
    .line 112
    move-object v2, v1

    .line 113
    :cond_6
    check-cast v2, Landroid/view/View;

    .line 114
    .line 115
    :try_start_3
    const-string v3, "getActivity"

    .line 116
    .line 117
    new-array v4, v0, [Ljava/lang/Object;

    .line 118
    .line 119
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 120
    .line 121
    invoke-interface {v5, p0, v3, v4}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 125
    goto :goto_5

    .line 126
    :catchall_3
    move-exception p0

    .line 127
    new-instance v3, LE0/d;

    .line 128
    .line 129
    invoke-direct {v3, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    move-object p0, v3

    .line 133
    :goto_5
    nop

    .line 134
    instance-of v3, p0, LE0/d;

    .line 135
    .line 136
    if-eqz v3, :cond_7

    .line 137
    .line 138
    move-object p0, v1

    .line 139
    :cond_7
    const-string v3, "findViewById"

    .line 140
    .line 141
    if-nez p0, :cond_8

    .line 142
    .line 143
    :goto_6
    move-object v0, v1

    .line 144
    goto :goto_8

    .line 145
    :cond_8
    :try_start_4
    const-string v4, "getApplicationContext"

    .line 146
    .line 147
    new-array v5, v0, [Ljava/lang/Object;

    .line 148
    .line 149
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 150
    .line 151
    invoke-interface {v6, p0, v4, v5}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, Landroid/content/Context;

    .line 156
    .line 157
    if-nez v4, :cond_9

    .line 158
    .line 159
    const-string v4, "getBaseContext"

    .line 160
    .line 161
    new-array v0, v0, [Ljava/lang/Object;

    .line 162
    .line 163
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 164
    .line 165
    invoke-interface {v5, p0, v4, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    move-object v4, v0

    .line 170
    check-cast v4, Landroid/content/Context;

    .line 171
    .line 172
    if-nez v4, :cond_9

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :catchall_4
    move-exception v0

    .line 176
    goto :goto_7

    .line 177
    :cond_9
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    const-string v4, "mg"

    .line 182
    .line 183
    const-string v5, "id"

    .line 184
    .line 185
    const-string v6, "com.tencent.mm"

    .line 186
    .line 187
    invoke-virtual {v0, v4, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_a

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_a
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 203
    .line 204
    invoke-interface {v4, p0, v3, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Landroid/view/View;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 209
    .line 210
    goto :goto_8

    .line 211
    :goto_7
    new-instance v4, LE0/d;

    .line 212
    .line 213
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    move-object v0, v4

    .line 217
    :goto_8
    nop

    .line 218
    instance-of v4, v0, LE0/d;

    .line 219
    .line 220
    if-eqz v4, :cond_b

    .line 221
    .line 222
    move-object v0, v1

    .line 223
    :cond_b
    check-cast v0, Landroid/view/View;

    .line 224
    .line 225
    if-eqz v0, :cond_c

    .line 226
    .line 227
    :goto_9
    move-object v1, v0

    .line 228
    goto :goto_b

    .line 229
    :cond_c
    if-eqz v2, :cond_d

    .line 230
    .line 231
    invoke-static {v2}, Lr0/d0;->C(Landroid/view/View;)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    if-eqz v0, :cond_d

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_d
    if-nez p0, :cond_e

    .line 239
    .line 240
    move-object p0, v1

    .line 241
    goto :goto_a

    .line 242
    :cond_e
    const v0, 0x1020002

    .line 243
    .line 244
    .line 245
    :try_start_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 254
    .line 255
    invoke-interface {v2, p0, v3, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    check-cast p0, Landroid/view/View;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 260
    .line 261
    goto :goto_a

    .line 262
    :catchall_5
    move-exception p0

    .line 263
    new-instance v0, LE0/d;

    .line 264
    .line 265
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    move-object p0, v0

    .line 269
    :goto_a
    nop

    .line 270
    instance-of v0, p0, LE0/d;

    .line 271
    .line 272
    if-eqz v0, :cond_f

    .line 273
    .line 274
    move-object p0, v1

    .line 275
    :cond_f
    check-cast p0, Landroid/view/View;

    .line 276
    .line 277
    if-nez p0, :cond_10

    .line 278
    .line 279
    goto :goto_b

    .line 280
    :cond_10
    invoke-static {p0}, Lr0/d0;->C(Landroid/view/View;)Landroid/view/View;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    :goto_b
    move-object v6, v1

    .line 285
    :cond_11
    return-object v6
.end method


# virtual methods
.method public final E0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lr0/d0;->z:LA0/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LA0/i;->f:Ljava/util/List;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    sget-object v0, LF0/s;->a:LF0/s;

    .line 12
    .line 13
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    const-string v0, "ui3."

    .line 22
    .line 23
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_4

    .line 28
    .line 29
    const-string v0, "ik3."

    .line 30
    .line 31
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_4

    .line 36
    .line 37
    const-string v0, "gl3."

    .line 38
    .line 39
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    const-string v0, "xm3."

    .line 46
    .line 47
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    const/4 p1, 0x0

    .line 55
    return p1

    .line 56
    :cond_4
    :goto_1
    return v1
.end method

.method public final F()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr0/d0;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr0/d0;->D:Lr0/T;

    .line 5
    .line 6
    iget-object v0, v0, Lr0/T;->b:Ljava/util/Set;

    .line 7
    .line 8
    return-object v0
.end method

.method public final G(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lr0/d0;->G0(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lr0/d0;->Q(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_1
    invoke-static {p1}, Lr0/d0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_2
    :try_start_0
    const-string v1, "e"

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    new-array v2, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 31
    .line 32
    invoke-interface {v3, p1, v1, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    new-instance v1, LE0/d;

    .line 41
    .line 42
    invoke-direct {v1, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object p1, v1

    .line 46
    :goto_0
    nop

    .line 47
    instance-of v1, p1, LE0/d;

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move-object v0, p1

    .line 53
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 54
    .line 55
    return-object v0
.end method

.method public final G0(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lr0/d0;->r()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "contact"

    .line 16
    .line 17
    const-string v2, "mvvmItem"

    .line 18
    .line 19
    invoke-static {v1, v2, v0}, Lz0/r;->E(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method public final H(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-static {p1}, Lr0/d0;->o0(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lr0/d0;->G0(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    :try_start_0
    const-string v0, "d"

    .line 16
    .line 17
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 18
    .line 19
    invoke-interface {v2, p1, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    new-instance v2, LE0/d;

    .line 26
    .line 27
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object v0, v2

    .line 31
    :goto_0
    nop

    .line 32
    instance-of v2, v0, LE0/d;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    move-object v0, v1

    .line 37
    :cond_1
    if-nez v0, :cond_3

    .line 38
    .line 39
    :try_start_1
    const-string v0, "f344355d"

    .line 40
    .line 41
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 42
    .line 43
    invoke-interface {v2, p1, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    goto :goto_1

    .line 48
    :catchall_1
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    new-instance v0, LE0/d;

    .line 51
    .line 52
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v0

    .line 56
    :goto_1
    nop

    .line 57
    instance-of v0, p1, LE0/d;

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    :cond_2
    move-object p1, v1

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object p1, v0

    .line 64
    goto :goto_2

    .line 65
    :cond_4
    invoke-static {p1}, Lr0/d0;->P(Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    :cond_5
    :goto_2
    const-string v4, "field_username"

    .line 72
    .line 73
    const-string v5, "conRemark"

    .line 74
    .line 75
    const-string v2, "field_conRemark"

    .line 76
    .line 77
    const-string v3, "field_nickname"

    .line 78
    .line 79
    const-string v6, "nickname"

    .line 80
    .line 81
    const-string v7, "username"

    .line 82
    .line 83
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const/4 v2, 0x0

    .line 88
    move v3, v2

    .line 89
    :goto_3
    const/4 v4, 0x6

    .line 90
    if-ge v3, v4, :cond_7

    .line 91
    .line 92
    aget-object v4, v0, v3

    .line 93
    .line 94
    invoke-static {p1, v4}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Ljava/lang/String;

    .line 99
    .line 100
    if-eqz v4, :cond_6

    .line 101
    .line 102
    invoke-static {v4}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-eqz v4, :cond_6

    .line 111
    .line 112
    invoke-static {v4, p2}, Lr0/d0;->A0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    return-object v4

    .line 119
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_7
    const-string v0, "getDisplayName"

    .line 123
    .line 124
    const-string v3, "getNickname"

    .line 125
    .line 126
    const-string v4, "d0"

    .line 127
    .line 128
    const-string v5, "c1"

    .line 129
    .line 130
    filled-new-array {v0, v3, v4, v5}, [Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move v4, v2

    .line 135
    :goto_4
    const/4 v0, 0x4

    .line 136
    if-ge v4, v0, :cond_a

    .line 137
    .line 138
    aget-object v0, v3, v4

    .line 139
    .line 140
    :try_start_2
    new-array v5, v2, [Ljava/lang/Object;

    .line 141
    .line 142
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 143
    .line 144
    invoke-interface {v6, p1, v0, v5}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :catchall_2
    move-exception v0

    .line 152
    new-instance v5, LE0/d;

    .line 153
    .line 154
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    move-object v0, v5

    .line 158
    :goto_5
    nop

    .line 159
    instance-of v5, v0, LE0/d;

    .line 160
    .line 161
    if-eqz v5, :cond_8

    .line 162
    .line 163
    move-object v0, v1

    .line 164
    :cond_8
    check-cast v0, Ljava/lang/String;

    .line 165
    .line 166
    if-eqz v0, :cond_9

    .line 167
    .line 168
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-eqz v0, :cond_9

    .line 177
    .line 178
    invoke-static {v0, p2}, Lr0/d0;->A0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_9

    .line 183
    .line 184
    return-object v0

    .line 185
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_a
    return-object v1
.end method

.method public final I(Landroid/view/View;)Ljava/lang/Object;
    .locals 3

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lr0/d0;->r0(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    invoke-virtual {p0, v1}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    instance-of v1, p1, Landroid/view/View;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    check-cast p1, Landroid/view/View;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move-object p1, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    return-object v0
.end method

.method public final J()[Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lr0/d0;->A:LA0/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LA0/N;->c:Ljava/util/List;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    sget-object v2, Lr0/d0;->U:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v2}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lr0/S;

    .line 35
    .line 36
    iget-object v3, v3, Lr0/S;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const/4 v2, 0x0

    .line 51
    new-array v2, v2, [Ljava/lang/String;

    .line 52
    .line 53
    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, [Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lr0/d0;->K0(Ljava/util/List;[Ljava/lang/String;)[Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
.end method

.method public final K(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lr0/d0;->K:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    sget-object v1, Lr0/d0;->Y:[Ljava/lang/String;

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v2, :cond_1

    .line 15
    .line 16
    aget-object v4, v1, v3

    .line 17
    .line 18
    invoke-static {p1, v4}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    if-nez v4, :cond_2

    .line 23
    .line 24
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v4, 0x0

    .line 28
    :cond_2
    if-eqz v4, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0, p1, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object v4

    .line 34
    :cond_3
    return-object p1
.end method

.method public final L()Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/d0;->A:LA0/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LA0/N;->d:Ljava/util/List;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    sget-object v0, LF0/s;->a:LF0/s;

    .line 12
    .line 13
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, LA0/O;

    .line 37
    .line 38
    new-instance v3, Lr0/S;

    .line 39
    .line 40
    iget-object v4, v2, LA0/O;->a:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v5, v2, LA0/O;->b:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v2, v2, LA0/O;->c:Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {v3, v4, v5, v2}, Lr0/S;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    sget-object v0, Lr0/d0;->U:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v1, v0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0
.end method

.method public final L0(Ljava/lang/Object;)V
    .locals 12

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_13

    .line 4
    .line 5
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr0/d0;->a:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Lr0/d0;->m(Ljava/lang/Object;)Landroid/widget/ListView;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    const-string v1, "getDeclaredFields(...)"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-nez v0, :cond_4

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {v5, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    array-length v6, v5

    .line 37
    move v7, v3

    .line 38
    :goto_1
    if-ge v7, v6, :cond_2

    .line 39
    .line 40
    aget-object v8, v5, v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    .line 42
    :try_start_2
    invoke-virtual {v8, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v8, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    instance-of v9, v8, Landroid/widget/ListView;

    .line 50
    .line 51
    if-eqz v9, :cond_1

    .line 52
    .line 53
    check-cast v8, Landroid/widget/ListView;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    move-object v0, v8

    .line 56
    goto :goto_2

    .line 57
    :catchall_0
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    move-object v0, v2

    .line 66
    :cond_4
    :goto_2
    if-eqz v0, :cond_5

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    if-nez v5, :cond_b

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :catchall_1
    move-exception p1

    .line 76
    goto/16 :goto_11

    .line 77
    .line 78
    :cond_5
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    :goto_4
    if-eqz v5, :cond_a

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-static {v6, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    array-length v7, v6

    .line 92
    move v8, v3

    .line 93
    :goto_5
    if-ge v8, v7, :cond_9

    .line 94
    .line 95
    aget-object v9, v6, v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 96
    .line 97
    :try_start_4
    invoke-virtual {v9, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    if-nez v9, :cond_6

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_6
    instance-of v10, v9, Landroid/widget/ListAdapter;

    .line 108
    .line 109
    if-nez v10, :cond_7

    .line 110
    .line 111
    sget-object v10, Lr0/d0;->a0:[Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    invoke-static {v10, v11}, LF0/h;->b0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 125
    if-eqz v10, :cond_8

    .line 126
    .line 127
    :cond_7
    move-object v5, v9

    .line 128
    goto :goto_7

    .line 129
    :catchall_2
    :cond_8
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_9
    :try_start_5
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    goto :goto_4

    .line 137
    :cond_a
    move-object v5, v2

    .line 138
    :cond_b
    :goto_7
    invoke-static {p1}, Lr0/d0;->z(Ljava/lang/Object;)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {p0, p1}, Lr0/d0;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 146
    if-nez v6, :cond_d

    .line 147
    .line 148
    if-eqz v1, :cond_c

    .line 149
    .line 150
    :try_start_6
    const-string v6, "getAdapter"

    .line 151
    .line 152
    new-array v7, v3, [Ljava/lang/Object;

    .line 153
    .line 154
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 155
    .line 156
    invoke-interface {v8, v1, v6, v7}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 160
    goto :goto_8

    .line 161
    :catchall_3
    move-exception v6

    .line 162
    :try_start_7
    new-instance v7, LE0/d;

    .line 163
    .line 164
    invoke-direct {v7, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    move-object v6, v7

    .line 168
    :goto_8
    nop

    .line 169
    instance-of v7, v6, LE0/d;

    .line 170
    .line 171
    if-eqz v7, :cond_d

    .line 172
    .line 173
    :cond_c
    move-object v6, v2

    .line 174
    :cond_d
    invoke-static {}, Lr0/d0;->I0()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_e

    .line 179
    .line 180
    invoke-static {p1, v0, v1}, Lr0/d0;->p0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)Z

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    if-nez v7, :cond_e

    .line 185
    .line 186
    iput-boolean v4, p0, Lr0/d0;->x:Z

    .line 187
    .line 188
    goto/16 :goto_10

    .line 189
    .line 190
    :cond_e
    invoke-static {}, Lr0/d0;->I0()Z

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    if-eqz v7, :cond_f

    .line 195
    .line 196
    iget-boolean v7, p0, Lr0/d0;->x:Z

    .line 197
    .line 198
    if-eqz v7, :cond_f

    .line 199
    .line 200
    move v7, v4

    .line 201
    goto :goto_9

    .line 202
    :cond_f
    move v7, v3

    .line 203
    :goto_9
    iput-boolean v3, p0, Lr0/d0;->x:Z

    .line 204
    .line 205
    if-eqz v7, :cond_10

    .line 206
    .line 207
    iget-boolean v7, p0, Lr0/d0;->y:Z

    .line 208
    .line 209
    if-nez v7, :cond_10

    .line 210
    .line 211
    invoke-static {p1}, Lr0/d0;->F0(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-eqz v7, :cond_10

    .line 216
    .line 217
    iput-boolean v4, p0, Lr0/d0;->y:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 218
    .line 219
    :try_start_8
    invoke-virtual {p0, p1}, Lr0/d0;->N0(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 220
    .line 221
    .line 222
    :try_start_9
    iput-boolean v3, p0, Lr0/d0;->y:Z

    .line 223
    .line 224
    goto :goto_a

    .line 225
    :catchall_4
    move-exception p1

    .line 226
    iput-boolean v3, p0, Lr0/d0;->y:Z

    .line 227
    .line 228
    throw p1

    .line 229
    :cond_10
    :goto_a
    invoke-static {}, Lr0/d0;->I0()Z

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    if-eqz v4, :cond_11

    .line 234
    .line 235
    invoke-virtual {p0, p1, v0, v5, v1}, Lr0/d0;->a1(Ljava/lang/Object;Landroid/widget/ListView;Ljava/lang/Object;Landroid/view/View;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_11

    .line 240
    .line 241
    goto/16 :goto_10

    .line 242
    .line 243
    :cond_11
    if-eqz v1, :cond_12

    .line 244
    .line 245
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 246
    .line 247
    invoke-direct {v4, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iput-object v4, p0, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 251
    .line 252
    :cond_12
    if-eqz v0, :cond_13

    .line 253
    .line 254
    if-eqz v5, :cond_13

    .line 255
    .line 256
    invoke-static {v0, v5}, Lr0/d0;->n0(Landroid/widget/ListView;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    if-eqz v4, :cond_13

    .line 261
    .line 262
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 263
    .line 264
    invoke-direct {v4, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    iput-object v4, p0, Lr0/d0;->d:Ljava/lang/ref/WeakReference;

    .line 268
    .line 269
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 270
    .line 271
    invoke-direct {v4, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iput-object v4, p0, Lr0/d0;->b:Ljava/lang/ref/WeakReference;

    .line 275
    .line 276
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-virtual {p0, v4}, Lr0/d0;->g0(Ljava/lang/Class;)V

    .line 281
    .line 282
    .line 283
    :cond_13
    invoke-virtual {p0, p1, v0, v1}, Lr0/d0;->X0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0}, Lr0/d0;->F()Ljava/util/Set;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    if-eqz v4, :cond_14

    .line 295
    .line 296
    goto/16 :goto_10

    .line 297
    .line 298
    :cond_14
    const-string v4, "hide contact fragment refresh"

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    if-eqz v0, :cond_15

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v8

    .line 318
    goto :goto_b

    .line 319
    :cond_15
    move-object v8, v2

    .line 320
    :goto_b
    new-instance v9, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 323
    .line 324
    .line 325
    const-string v10, "listView="

    .line 326
    .line 327
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    if-eqz v5, :cond_16

    .line 338
    .line 339
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v9

    .line 347
    goto :goto_c

    .line 348
    :cond_16
    move-object v9, v2

    .line 349
    :goto_c
    new-instance v10, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 352
    .line 353
    .line 354
    const-string v11, "adapter="

    .line 355
    .line 356
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v9

    .line 366
    filled-new-array {v4, v7, v8, v9}, [Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    invoke-static {v4}, Li0/a;->a([Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    if-nez v1, :cond_17

    .line 374
    .line 375
    if-eqz v6, :cond_1d

    .line 376
    .line 377
    :cond_17
    const-string v4, "hide contact recycler inspect"

    .line 378
    .line 379
    if-eqz v1, :cond_18

    .line 380
    .line 381
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    goto :goto_d

    .line 390
    :cond_18
    move-object v7, v2

    .line 391
    :goto_d
    new-instance v8, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 394
    .line 395
    .line 396
    const-string v9, "recyclerView="

    .line 397
    .line 398
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    if-eqz v6, :cond_19

    .line 409
    .line 410
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    goto :goto_e

    .line 419
    :cond_19
    move-object v8, v2

    .line 420
    :goto_e
    new-instance v9, Ljava/lang/StringBuilder;

    .line 421
    .line 422
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 423
    .line 424
    .line 425
    const-string v10, "recyclerAdapter="

    .line 426
    .line 427
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v8

    .line 437
    if-eqz v6, :cond_1a

    .line 438
    .line 439
    const-string v2, "getItemCount"

    .line 440
    .line 441
    invoke-static {v6, v2}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    :cond_1a
    new-instance v9, Ljava/lang/StringBuilder;

    .line 446
    .line 447
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 448
    .line 449
    .line 450
    const-string v10, "itemCount="

    .line 451
    .line 452
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    filled-new-array {v4, v7, v8, v2}, [Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    if-nez v6, :cond_1b

    .line 470
    .line 471
    goto :goto_f

    .line 472
    :cond_1b
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    iget-object v4, p0, Lr0/d0;->n:Ljava/util/HashSet;

    .line 481
    .line 482
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    :goto_f
    invoke-static {}, Lr0/d0;->I0()Z

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    if-eqz v2, :cond_1c

    .line 490
    .line 491
    if-eqz v6, :cond_1c

    .line 492
    .line 493
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-virtual {p0, v2, v3}, Lr0/d0;->m0(Ljava/lang/Class;Z)V

    .line 498
    .line 499
    .line 500
    :cond_1c
    if-eqz v1, :cond_1d

    .line 501
    .line 502
    new-instance v2, Lr0/Q;

    .line 503
    .line 504
    invoke-direct {v2, v1, p0, p1, v0}, Lr0/Q;-><init>(Landroid/view/View;Lr0/d0;Ljava/lang/Object;Landroid/widget/ListView;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 508
    .line 509
    .line 510
    :cond_1d
    if-eqz v0, :cond_1e

    .line 511
    .line 512
    if-eqz v5, :cond_1e

    .line 513
    .line 514
    invoke-static {v0, v5}, Lr0/d0;->n0(Landroid/widget/ListView;Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    if-eqz v2, :cond_1e

    .line 519
    .line 520
    new-instance v2, Lr0/Q;

    .line 521
    .line 522
    invoke-direct {v2, p0, p1, v0, v1}, Lr0/Q;-><init>(Lr0/d0;Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 526
    .line 527
    .line 528
    :cond_1e
    :goto_10
    sget-object p1, LE0/i;->a:LE0/i;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 529
    .line 530
    goto :goto_12

    .line 531
    :goto_11
    new-instance v0, LE0/d;

    .line 532
    .line 533
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 534
    .line 535
    .line 536
    move-object p1, v0

    .line 537
    :goto_12
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    if-eqz p1, :cond_1f

    .line 542
    .line 543
    const-string v0, "hide contact address ui refresh fail"

    .line 544
    .line 545
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    :cond_1f
    :goto_13
    return-void
.end method

.method public final M(ILjava/lang/Object;)Landroid/view/MenuItem;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0, p2}, Lr0/d0;->K(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :try_start_0
    const-string v1, "getItem"

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 20
    .line 21
    invoke-interface {v3, p2, v1, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/view/MenuItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    new-instance v2, LE0/d;

    .line 30
    .line 31
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object v1, v2

    .line 35
    :goto_0
    nop

    .line 36
    instance-of v2, v1, LE0/d;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    move-object v1, v0

    .line 41
    :cond_1
    check-cast v1, Landroid/view/MenuItem;

    .line 42
    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    invoke-static {p2}, Lr0/d0;->N(Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {p2, p1}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    instance-of p2, p1, Landroid/view/MenuItem;

    .line 54
    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    move-object v0, p1

    .line 58
    check-cast v0, Landroid/view/MenuItem;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object v0, v1

    .line 62
    :cond_3
    :goto_1
    return-object v0
.end method

.method public final M0()V
    .locals 12

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, LF0/u;->a:LF0/u;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lr0/T;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v2, v1, v1}, Lr0/T;-><init>(ZLjava/util/Set;Ljava/util/Set;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lr0/d0;->D:Lr0/T;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {}, Lz0/g;->s()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    sget-object v0, LF0/s;->a:LF0/s;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-class v0, Lq0/h;

    .line 30
    .line 31
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lq0/h;

    .line 36
    .line 37
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    move-object v0, v2

    .line 45
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    const/4 v4, 0x0

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    :cond_3
    if-eqz v4, :cond_2

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_6

    .line 97
    .line 98
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    move-object v5, v3

    .line 103
    check-cast v5, Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_5

    .line 110
    .line 111
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_6
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 116
    .line 117
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_e

    .line 129
    .line 130
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, Ljava/lang/String;

    .line 135
    .line 136
    sget-boolean v5, Lz0/i;->a:Z

    .line 137
    .line 138
    invoke-static {v3}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_8

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_8
    invoke-virtual {v6, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    sget-object v5, Lz0/z;->a:Lz0/z;

    .line 149
    .line 150
    invoke-static {v3}, Lz0/z;->b(Ljava/lang/String;)Lz0/y;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    if-eqz v3, :cond_7

    .line 155
    .line 156
    iget-object v5, v3, Lz0/y;->a:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v7, v3, Lz0/y;->b:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v3, v3, Lz0/y;->c:Ljava/lang/String;

    .line 161
    .line 162
    filled-new-array {v5, v7, v3}, [Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-static {v3}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    new-instance v5, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    :cond_9
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-eqz v7, :cond_b

    .line 184
    .line 185
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    check-cast v7, Ljava/lang/String;

    .line 190
    .line 191
    if-eqz v7, :cond_a

    .line 192
    .line 193
    invoke-static {v7}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    if-eqz v7, :cond_a

    .line 202
    .line 203
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-nez v8, :cond_a

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_a
    move-object v7, v4

    .line 211
    :goto_5
    if-eqz v7, :cond_9

    .line 212
    .line 213
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_b
    new-instance v3, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    :cond_c
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    if-eqz v7, :cond_d

    .line 231
    .line 232
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    move-object v8, v7

    .line 237
    check-cast v8, Ljava/lang/String;

    .line 238
    .line 239
    sget-boolean v9, Lz0/i;->a:Z

    .line 240
    .line 241
    invoke-static {v8}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    if-nez v8, :cond_c

    .line 246
    .line 247
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-eqz v5, :cond_7

    .line 260
    .line 261
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    check-cast v5, Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v6, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_e
    const/4 v9, 0x0

    .line 272
    const/4 v10, 0x0

    .line 273
    const-string v7, ","

    .line 274
    .line 275
    const/4 v8, 0x0

    .line 276
    const/16 v11, 0x3e

    .line 277
    .line 278
    invoke-static/range {v6 .. v11}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->size()I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eq v3, v0, :cond_f

    .line 299
    .line 300
    iget-object v0, p0, Lr0/d0;->S:Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-nez v0, :cond_f

    .line 307
    .line 308
    iput-object v2, p0, Lr0/d0;->S:Ljava/lang/String;

    .line 309
    .line 310
    const-string v0, "hide contact expanded ids"

    .line 311
    .line 312
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    :cond_f
    invoke-static {v6}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    const/4 v3, 0x1

    .line 332
    if-eqz v2, :cond_10

    .line 333
    .line 334
    new-instance v0, Lr0/T;

    .line 335
    .line 336
    invoke-direct {v0, v3, v1, v1}, Lr0/T;-><init>(ZLjava/util/Set;Ljava/util/Set;)V

    .line 337
    .line 338
    .line 339
    iput-object v0, p0, Lr0/d0;->D:Lr0/T;

    .line 340
    .line 341
    return-void

    .line 342
    :cond_10
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 343
    .line 344
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 345
    .line 346
    .line 347
    sget-boolean v2, Lz0/i;->a:Z

    .line 348
    .line 349
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    :cond_11
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-eqz v5, :cond_21

    .line 362
    .line 363
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    check-cast v5, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 368
    .line 369
    invoke-virtual {v5}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    if-eqz v6, :cond_12

    .line 374
    .line 375
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    goto :goto_9

    .line 384
    :cond_12
    move-object v6, v4

    .line 385
    :goto_9
    const-string v7, ""

    .line 386
    .line 387
    if-nez v6, :cond_13

    .line 388
    .line 389
    move-object v6, v7

    .line 390
    :cond_13
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 391
    .line 392
    .line 393
    move-result v8

    .line 394
    if-nez v8, :cond_11

    .line 395
    .line 396
    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v8

    .line 400
    if-nez v8, :cond_14

    .line 401
    .line 402
    goto :goto_8

    .line 403
    :cond_14
    invoke-virtual {v5}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    if-eqz v5, :cond_15

    .line 408
    .line 409
    invoke-static {v5}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    goto :goto_a

    .line 418
    :cond_15
    move-object v5, v4

    .line 419
    :goto_a
    if-nez v5, :cond_16

    .line 420
    .line 421
    move-object v5, v7

    .line 422
    :cond_16
    invoke-static {v1, v5}, Lr0/d0;->l(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-static {v1, v6}, Lr0/d0;->l(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    sget-object v5, Lz0/z;->a:Lz0/z;

    .line 429
    .line 430
    invoke-static {v6}, Lz0/z;->b(Ljava/lang/String;)Lz0/y;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    if-eqz v5, :cond_11

    .line 435
    .line 436
    iget-object v6, v5, Lz0/y;->d:Ljava/lang/String;

    .line 437
    .line 438
    if-eqz v6, :cond_17

    .line 439
    .line 440
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 441
    .line 442
    .line 443
    move-result-object v6

    .line 444
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    goto :goto_b

    .line 449
    :cond_17
    move-object v6, v4

    .line 450
    :goto_b
    if-nez v6, :cond_18

    .line 451
    .line 452
    move-object v6, v7

    .line 453
    :cond_18
    invoke-static {v1, v6}, Lr0/d0;->l(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    iget-object v6, v5, Lz0/y;->e:Ljava/lang/String;

    .line 457
    .line 458
    if-eqz v6, :cond_19

    .line 459
    .line 460
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    goto :goto_c

    .line 469
    :cond_19
    move-object v6, v4

    .line 470
    :goto_c
    if-nez v6, :cond_1a

    .line 471
    .line 472
    move-object v6, v7

    .line 473
    :cond_1a
    invoke-static {v1, v6}, Lr0/d0;->l(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    iget-object v6, v5, Lz0/y;->b:Ljava/lang/String;

    .line 477
    .line 478
    if-eqz v6, :cond_1b

    .line 479
    .line 480
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v6

    .line 488
    goto :goto_d

    .line 489
    :cond_1b
    move-object v6, v4

    .line 490
    :goto_d
    if-nez v6, :cond_1c

    .line 491
    .line 492
    move-object v6, v7

    .line 493
    :cond_1c
    invoke-static {v1, v6}, Lr0/d0;->l(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    iget-object v6, v5, Lz0/y;->a:Ljava/lang/String;

    .line 497
    .line 498
    if-eqz v6, :cond_1d

    .line 499
    .line 500
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 501
    .line 502
    .line 503
    move-result-object v6

    .line 504
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v6

    .line 508
    goto :goto_e

    .line 509
    :cond_1d
    move-object v6, v4

    .line 510
    :goto_e
    if-nez v6, :cond_1e

    .line 511
    .line 512
    move-object v6, v7

    .line 513
    :cond_1e
    invoke-static {v1, v6}, Lr0/d0;->l(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    iget-object v5, v5, Lz0/y;->c:Ljava/lang/String;

    .line 517
    .line 518
    if-eqz v5, :cond_1f

    .line 519
    .line 520
    invoke-static {v5}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    goto :goto_f

    .line 529
    :cond_1f
    move-object v5, v4

    .line 530
    :goto_f
    if-nez v5, :cond_20

    .line 531
    .line 532
    goto :goto_10

    .line 533
    :cond_20
    move-object v7, v5

    .line 534
    :goto_10
    invoke-static {v1, v7}, Lr0/d0;->l(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    goto/16 :goto_8

    .line 538
    .line 539
    :cond_21
    new-instance v2, Lr0/T;

    .line 540
    .line 541
    invoke-direct {v2, v3, v0, v1}, Lr0/T;-><init>(ZLjava/util/Set;Ljava/util/Set;)V

    .line 542
    .line 543
    .line 544
    iput-object v2, p0, Lr0/d0;->D:Lr0/T;

    .line 545
    .line 546
    return-void
.end method

.method public final N0(Ljava/lang/Object;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-virtual/range {p0 .. p1}, Lr0/d0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    const/4 v5, 0x0

    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return v5

    .line 14
    :cond_0
    iget-object v0, v1, Lr0/d0;->h:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lr0/d0;->z(Ljava/lang/Object;)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-virtual {v1}, Lr0/d0;->F()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    sget-boolean v0, Lz0/i;->a:Z

    .line 28
    .line 29
    invoke-static {}, Lz0/g;->y()Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    xor-int/lit8 v10, v9, 0x1

    .line 38
    .line 39
    invoke-static {v2}, Lr0/d0;->F0(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    :goto_0
    move v0, v5

    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    iget-boolean v0, v1, Lr0/d0;->o:Z

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    const/4 v0, -0x1

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    sget-object v11, Lz0/B;->a:[I

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    aget v0, v11, v0

    .line 68
    .line 69
    :goto_1
    if-eq v0, v3, :cond_4

    .line 70
    .line 71
    const/4 v11, 0x2

    .line 72
    if-eq v0, v11, :cond_4

    .line 73
    .line 74
    const/4 v11, 0x3

    .line 75
    if-eq v0, v11, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v11, "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment"

    .line 87
    .line 88
    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    move v0, v3

    .line 95
    goto :goto_4

    .line 96
    :cond_5
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-array v11, v5, [Ljava/lang/Object;

    .line 101
    .line 102
    sget-object v12, Lc0/f;->b:Ld0/b;

    .line 103
    .line 104
    const-string v13, "s0"

    .line 105
    .line 106
    invoke-interface {v12, v0, v13, v11}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-nez v0, :cond_6

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_6
    :try_start_0
    iput-boolean v3, v1, Lr0/d0;->o:Z

    .line 114
    .line 115
    const-string v11, "hide contact invoke mvvm refresh"

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    filled-new-array {v11, v12}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    invoke-static {v11}, Li0/a;->a([Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 133
    .line 134
    .line 135
    const/4 v11, 0x0

    .line 136
    invoke-virtual {v0, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :catchall_0
    move-exception v0

    .line 143
    new-instance v11, LE0/d;

    .line 144
    .line 145
    invoke-direct {v11, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    move-object v0, v11

    .line 149
    :goto_3
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    if-eqz v11, :cond_7

    .line 154
    .line 155
    const-string v12, "hide contact invoke mvvm refresh fail"

    .line 156
    .line 157
    filled-new-array {v12, v11}, [Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-static {v11}, Li0/a;->d([Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_7
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 165
    .line 166
    instance-of v12, v0, LE0/d;

    .line 167
    .line 168
    if-eqz v12, :cond_8

    .line 169
    .line 170
    move-object v0, v11

    .line 171
    :cond_8
    check-cast v0, Ljava/lang/Boolean;

    .line 172
    .line 173
    iput-boolean v5, v1, Lr0/d0;->o:Z

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    :goto_4
    const-string v11, "fragmentRefresh="

    .line 180
    .line 181
    const-string v12, "hiddenSize="

    .line 182
    .line 183
    const-string v13, "enabled="

    .line 184
    .line 185
    const-string v14, "liveList="

    .line 186
    .line 187
    if-eqz v9, :cond_a

    .line 188
    .line 189
    invoke-virtual {v1, v4}, Lr0/d0;->P0(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    if-eqz v6, :cond_9

    .line 193
    .line 194
    new-instance v2, Lr0/H;

    .line 195
    .line 196
    invoke-direct {v2, v1, v6, v5}, Lr0/H;-><init>(Lr0/d0;Landroid/view/View;I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 200
    .line 201
    .line 202
    :cond_9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v16

    .line 214
    invoke-static {v13, v8}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v17

    .line 218
    invoke-interface {v7}, Ljava/util/Set;->size()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-static {v2, v12}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v19

    .line 226
    invoke-static {v11, v0}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v20

    .line 230
    const-string v15, "hide contact mvvm reload submitted"

    .line 231
    .line 232
    const-string v18, "active=false"

    .line 233
    .line 234
    filled-new-array/range {v15 .. v20}, [Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    return v3

    .line 242
    :cond_a
    invoke-virtual {v1, v4}, Lr0/d0;->P0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    if-eqz v6, :cond_b

    .line 246
    .line 247
    new-instance v5, LA0/r;

    .line 248
    .line 249
    const/4 v9, 0x5

    .line 250
    invoke-direct {v5, v1, v6, v2, v9}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 254
    .line 255
    .line 256
    :cond_b
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v16

    .line 268
    invoke-static {v13, v8}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v17

    .line 272
    const-string v2, "active="

    .line 273
    .line 274
    invoke-static {v2, v10}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v18

    .line 278
    invoke-interface {v7}, Ljava/util/Set;->size()I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    invoke-static {v2, v12}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v19

    .line 286
    invoke-static {v11, v0}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v20

    .line 290
    const-string v15, "hide contact mvvm refresh submitted"

    .line 291
    .line 292
    filled-new-array/range {v15 .. v20}, [Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    return v3
.end method

.method public final O0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lr0/d0;->L:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lr0/d0;->M:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    iput-wide p1, p0, Lr0/d0;->N:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lr0/d0;->O:Z

    .line 13
    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lr0/d0;->P:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    :cond_0
    iget-wide p1, p0, Lr0/d0;->N:J

    .line 24
    .line 25
    new-instance p3, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lr0/O;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, p0, p1, p2, v1}, Lr0/O;-><init>(Le0/a;JI)V

    .line 38
    .line 39
    .line 40
    const-wide/16 p1, 0x3a98

    .line 41
    .line 42
    invoke-virtual {p3, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final P0(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto/16 :goto_c

    .line 22
    .line 23
    :cond_0
    :goto_0
    iget-object v3, v1, Lr0/d0;->k:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const/4 v5, 0x1

    .line 30
    const-string v6, "r"

    .line 31
    .line 32
    const/4 v7, 0x5

    .line 33
    if-nez v4, :cond_e

    .line 34
    .line 35
    :try_start_1
    iget-object v4, v1, Lr0/d0;->z:LA0/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    const/4 v9, 0x4

    .line 38
    const-string v10, "getDeclaredMethods(...)"

    .line 39
    .line 40
    if-eqz v4, :cond_5

    .line 41
    .line 42
    :try_start_2
    iget-object v4, v4, LA0/i;->h:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    if-nez v12, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v4, 0x0

    .line 52
    :goto_1
    if-eqz v4, :cond_5

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    invoke-static {v12, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    array-length v13, v12

    .line 62
    const/4 v14, 0x0

    .line 63
    :goto_2
    if-ge v14, v13, :cond_4

    .line 64
    .line 65
    aget-object v15, v12, v14

    .line 66
    .line 67
    const/16 v16, 0x0

    .line 68
    .line 69
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    invoke-static {v11, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    if-eqz v11, :cond_3

    .line 78
    .line 79
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    array-length v11, v11

    .line 84
    if-eq v11, v9, :cond_2

    .line 85
    .line 86
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    array-length v11, v11

    .line 91
    if-ne v11, v7, :cond_3

    .line 92
    .line 93
    :cond_2
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    aget-object v11, v11, v16

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_3

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    const/16 v16, 0x0

    .line 114
    .line 115
    const/4 v15, 0x0

    .line 116
    :goto_3
    if-nez v15, :cond_9

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_5
    const/16 v16, 0x0

    .line 120
    .line 121
    :goto_4
    invoke-static {}, Lz0/r;->v()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_8

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-static {v4, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    array-length v8, v4

    .line 135
    move/from16 v11, v16

    .line 136
    .line 137
    :goto_5
    if-ge v11, v8, :cond_7

    .line 138
    .line 139
    aget-object v12, v4, v11

    .line 140
    .line 141
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    invoke-static {v13, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    if-eqz v13, :cond_6

    .line 150
    .line 151
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    array-length v13, v13

    .line 156
    if-ne v13, v9, :cond_6

    .line 157
    .line 158
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    aget-object v13, v13, v16

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    invoke-virtual {v13, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    if-eqz v13, :cond_6

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_7
    const/4 v12, 0x0

    .line 179
    :goto_6
    move-object v15, v12

    .line 180
    goto :goto_7

    .line 181
    :cond_8
    const/4 v15, 0x0

    .line 182
    :cond_9
    :goto_7
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-static {v4, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    array-length v8, v4

    .line 190
    move/from16 v10, v16

    .line 191
    .line 192
    :goto_8
    if-ge v10, v8, :cond_c

    .line 193
    .line 194
    aget-object v11, v4, v10

    .line 195
    .line 196
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    const-string v13, "q"

    .line 201
    .line 202
    invoke-static {v12, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    if-eqz v12, :cond_b

    .line 207
    .line 208
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    array-length v12, v12

    .line 213
    if-eq v12, v9, :cond_a

    .line 214
    .line 215
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    array-length v12, v12

    .line 220
    if-ne v12, v7, :cond_b

    .line 221
    .line 222
    :cond_a
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    aget-object v12, v12, v16

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v13

    .line 232
    invoke-virtual {v12, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    if-eqz v12, :cond_b

    .line 237
    .line 238
    goto :goto_9

    .line 239
    :cond_b
    add-int/lit8 v10, v10, 0x1

    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_c
    const/4 v11, 0x0

    .line 243
    :goto_9
    if-nez v15, :cond_d

    .line 244
    .line 245
    move-object v4, v11

    .line 246
    goto :goto_a

    .line 247
    :cond_d
    move-object v4, v15

    .line 248
    :goto_a
    if-eqz v4, :cond_11

    .line 249
    .line 250
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    :cond_e
    check-cast v4, Ljava/lang/reflect/Method;

    .line 257
    .line 258
    const-string v2, "hide contact mvvm submit refresh method"

    .line 259
    .line 260
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    new-instance v8, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    const-string v9, "method="

    .line 270
    .line 271
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    const-string v9, "getParameterTypes(...)"

    .line 286
    .line 287
    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    const-string v9, ","

    .line 291
    .line 292
    new-instance v10, Lq0/d;

    .line 293
    .line 294
    const/16 v11, 0x1b

    .line 295
    .line 296
    invoke-direct {v10, v11}, Lq0/d;-><init>(I)V

    .line 297
    .line 298
    .line 299
    const/16 v11, 0x1e

    .line 300
    .line 301
    invoke-static {v8, v9, v10, v11}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    new-instance v9, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 308
    .line 309
    .line 310
    const-string v10, "params="

    .line 311
    .line 312
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v8

    .line 322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-result-object v9

    .line 326
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v9

    .line 330
    new-instance v10, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    const-string v11, "liveList="

    .line 336
    .line 337
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v9

    .line 347
    filled-new-array {v2, v3, v8, v9}, [Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    invoke-static {v2, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    if-eqz v2, :cond_f

    .line 363
    .line 364
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    const/4 v3, 0x0

    .line 369
    filled-new-array {v0, v3, v2, v3}, [Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v4, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    goto :goto_b

    .line 377
    :cond_f
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    array-length v2, v2

    .line 382
    if-ne v2, v7, :cond_10

    .line 383
    .line 384
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 385
    .line 386
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    const/4 v5, 0x0

    .line 391
    filled-new-array {v0, v5, v2, v3, v5}, [Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v4, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    goto :goto_b

    .line 399
    :cond_10
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    const/4 v3, 0x0

    .line 404
    filled-new-array {v0, v3, v2, v3}, [Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {v4, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    :cond_11
    :goto_b
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 412
    .line 413
    goto :goto_d

    .line 414
    :goto_c
    new-instance v2, LE0/d;

    .line 415
    .line 416
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 417
    .line 418
    .line 419
    move-object v0, v2

    .line 420
    :goto_d
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    if-eqz v0, :cond_12

    .line 425
    .line 426
    const-string v2, "hide contact mvvm submit refresh all fail"

    .line 427
    .line 428
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    :cond_12
    return-void
.end method

.method public final Q(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lr0/d0;->G0(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-static {p1}, Lr0/d0;->R(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-static {v0, v2}, LU0/i;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v0, v1

    .line 29
    :goto_0
    if-eqz v0, :cond_2

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_2
    :try_start_0
    const-string v0, "d"

    .line 33
    .line 34
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 35
    .line 36
    invoke-interface {v2, p1, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    new-instance v2, LE0/d;

    .line 43
    .line 44
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    move-object v0, v2

    .line 48
    :goto_1
    nop

    .line 49
    instance-of v2, v0, LE0/d;

    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    move-object v0, v1

    .line 54
    :cond_3
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-static {v0}, Lr0/d0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    move-object v0, v1

    .line 62
    :goto_2
    if-nez v0, :cond_6

    .line 63
    .line 64
    :try_start_1
    const-string v0, "f344355d"

    .line 65
    .line 66
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 67
    .line 68
    invoke-interface {v2, p1, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    goto :goto_3

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    new-instance v0, LE0/d;

    .line 75
    .line 76
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    move-object p1, v0

    .line 80
    :goto_3
    nop

    .line 81
    instance-of v0, p1, LE0/d;

    .line 82
    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    move-object p1, v1

    .line 86
    :cond_5
    if-eqz p1, :cond_7

    .line 87
    .line 88
    invoke-static {p1}, Lr0/d0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    goto :goto_4

    .line 93
    :cond_6
    move-object v1, v0

    .line 94
    :cond_7
    :goto_4
    return-object v1
.end method

.method public final Q0()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    const-string v3, "notifyDataSetChanged"

    .line 5
    .line 6
    invoke-virtual {v1}, Lr0/d0;->M0()V

    .line 7
    .line 8
    .line 9
    iget-object v0, v1, Lr0/d0;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v5, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v5, v4

    .line 21
    :goto_0
    iget-object v0, v1, Lr0/d0;->d:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v0, v4

    .line 31
    :goto_1
    iget-object v6, v1, Lr0/d0;->D:Lr0/T;

    .line 32
    .line 33
    iget-object v6, v6, Lr0/T;->b:Ljava/util/Set;

    .line 34
    .line 35
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    xor-int/lit8 v8, v7, 0x1

    .line 40
    .line 41
    invoke-static {v5}, Lr0/d0;->F0(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    invoke-static {}, Lr0/d0;->I0()Z

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-eqz v10, :cond_4

    .line 50
    .line 51
    if-eqz v9, :cond_4

    .line 52
    .line 53
    if-eqz v5, :cond_4

    .line 54
    .line 55
    iget-object v10, v1, Lr0/d0;->b:Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    if-eqz v10, :cond_2

    .line 58
    .line 59
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    check-cast v10, Landroid/widget/ListView;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move-object v10, v4

    .line 67
    :goto_2
    iget-object v11, v1, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    if-eqz v11, :cond_3

    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    check-cast v11, Landroid/view/View;

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    move-object v11, v4

    .line 79
    :goto_3
    invoke-static {v5, v10, v11}, Lr0/d0;->p0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-nez v10, :cond_4

    .line 84
    .line 85
    iput-boolean v2, v1, Lr0/d0;->x:Z

    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    const/4 v10, 0x0

    .line 89
    iput-boolean v10, v1, Lr0/d0;->x:Z

    .line 90
    .line 91
    invoke-static {}, Lr0/d0;->I0()Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    if-eqz v11, :cond_a

    .line 96
    .line 97
    sget-boolean v11, Lz0/i;->a:Z

    .line 98
    .line 99
    invoke-static {}, Lz0/g;->y()Z

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    invoke-static {v11}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    invoke-static {v8}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    invoke-static {v6}, LF0/k;->q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    const/16 v16, 0x0

    .line 116
    .line 117
    const/16 v18, 0x3e

    .line 118
    .line 119
    const-string v14, ","

    .line 120
    .line 121
    const/4 v15, 0x0

    .line 122
    const/16 v17, 0x0

    .line 123
    .line 124
    invoke-static/range {v13 .. v18}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    if-eqz v5, :cond_5

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v14

    .line 134
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v14

    .line 138
    goto :goto_4

    .line 139
    :cond_5
    move-object v14, v4

    .line 140
    :goto_4
    const-string v15, ""

    .line 141
    .line 142
    if-nez v14, :cond_6

    .line 143
    .line 144
    move-object v14, v15

    .line 145
    :cond_6
    if-eqz v0, :cond_7

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v16

    .line 151
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v16

    .line 155
    goto :goto_5

    .line 156
    :cond_7
    move-object/from16 v16, v4

    .line 157
    .line 158
    :goto_5
    if-nez v16, :cond_8

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_8
    move-object/from16 v15, v16

    .line 162
    .line 163
    :goto_6
    filled-new-array {v11, v12, v13, v14, v15}, [Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    invoke-static {v11}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    const/4 v15, 0x0

    .line 172
    const/16 v17, 0x3e

    .line 173
    .line 174
    const-string v13, "|"

    .line 175
    .line 176
    const/4 v14, 0x0

    .line 177
    const/16 v16, 0x0

    .line 178
    .line 179
    invoke-static/range {v12 .. v17}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 184
    .line 185
    .line 186
    move-result-wide v12

    .line 187
    iget-object v14, v1, Lr0/d0;->t:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v11, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    if-eqz v14, :cond_9

    .line 194
    .line 195
    iget-wide v14, v1, Lr0/d0;->u:J

    .line 196
    .line 197
    sub-long v14, v12, v14

    .line 198
    .line 199
    const-wide/16 v16, 0x78

    .line 200
    .line 201
    cmp-long v14, v14, v16

    .line 202
    .line 203
    if-gez v14, :cond_9

    .line 204
    .line 205
    goto/16 :goto_d

    .line 206
    .line 207
    :cond_9
    iput-object v11, v1, Lr0/d0;->t:Ljava/lang/String;

    .line 208
    .line 209
    iput-wide v12, v1, Lr0/d0;->u:J

    .line 210
    .line 211
    :cond_a
    sget-boolean v11, Lz0/i;->a:Z

    .line 212
    .line 213
    invoke-static {}, Lz0/g;->y()Z

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    const-string v12, "enabled="

    .line 218
    .line 219
    invoke-static {v12, v11}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v14

    .line 223
    const-string v11, "active="

    .line 224
    .line 225
    invoke-static {v11, v8}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v15

    .line 229
    if-eqz v5, :cond_b

    .line 230
    .line 231
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v12

    .line 239
    goto :goto_7

    .line 240
    :cond_b
    move-object v12, v4

    .line 241
    :goto_7
    const-string v13, "fragment="

    .line 242
    .line 243
    invoke-static {v13, v12}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v16

    .line 247
    if-eqz v0, :cond_c

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v12

    .line 253
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    goto :goto_8

    .line 258
    :cond_c
    move-object v12, v4

    .line 259
    :goto_8
    const-string v10, "adapter="

    .line 260
    .line 261
    invoke-static {v10, v12}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v17

    .line 265
    invoke-interface {v6}, Ljava/util/Set;->size()I

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    const-string v10, "hiddenSize="

    .line 270
    .line 271
    invoke-static {v6, v10}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v18

    .line 275
    move-object v6, v13

    .line 276
    const-string v13, "hide contact refresh request"

    .line 277
    .line 278
    filled-new-array/range {v13 .. v18}, [Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-static {v10}, Li0/a;->a([Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    if-eqz v9, :cond_f

    .line 286
    .line 287
    if-eqz v5, :cond_f

    .line 288
    .line 289
    invoke-virtual {v1, v5}, Lr0/d0;->N0(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    if-nez v7, :cond_d

    .line 294
    .line 295
    invoke-virtual {v1, v5}, Lr0/d0;->L0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    goto :goto_9

    .line 299
    :cond_d
    invoke-static {v5}, Lr0/d0;->z(Ljava/lang/Object;)Landroid/view/View;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    if-nez v10, :cond_e

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_e
    new-instance v12, Lr0/H;

    .line 307
    .line 308
    invoke-direct {v12, v1, v10, v2}, Lr0/H;-><init>(Lr0/d0;Landroid/view/View;I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v10, v12}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 312
    .line 313
    .line 314
    :goto_9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v10

    .line 322
    invoke-virtual {v6, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    const-string v10, "mvvm="

    .line 327
    .line 328
    invoke-static {v10, v9}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    invoke-static {v11, v8}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    const-string v10, "hide contact refresh mvvm first"

    .line 337
    .line 338
    filled-new-array {v10, v6, v9, v8}, [Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-static {v6}, Li0/a;->a([Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :cond_f
    if-nez v0, :cond_10

    .line 346
    .line 347
    goto/16 :goto_d

    .line 348
    .line 349
    :cond_10
    iget-object v6, v1, Lr0/d0;->g:Ljava/util/WeakHashMap;

    .line 350
    .line 351
    invoke-virtual {v6, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    :try_start_0
    const-string v6, "B"

    .line 355
    .line 356
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 357
    .line 358
    invoke-interface {v8, v0, v4, v6}, Ld0/a;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    const-string v6, "C"

    .line 362
    .line 363
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 364
    .line 365
    invoke-interface {v8, v0, v4, v6}, Ld0/a;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 366
    .line 367
    .line 368
    :catchall_0
    :try_start_1
    const-string v6, "clearCache"

    .line 369
    .line 370
    const/4 v8, 0x0

    .line 371
    new-array v9, v8, [Ljava/lang/Object;

    .line 372
    .line 373
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 374
    .line 375
    invoke-interface {v8, v0, v6, v9}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 376
    .line 377
    .line 378
    :catchall_1
    const/4 v8, 0x0

    .line 379
    :try_start_2
    new-array v6, v8, [Ljava/lang/Object;

    .line 380
    .line 381
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 382
    .line 383
    invoke-interface {v8, v0, v3, v6}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 387
    goto :goto_a

    .line 388
    :catchall_2
    move-exception v0

    .line 389
    new-instance v6, LE0/d;

    .line 390
    .line 391
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 392
    .line 393
    .line 394
    move-object v0, v6

    .line 395
    :goto_a
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    if-eqz v0, :cond_11

    .line 400
    .line 401
    const-string v6, "hide contact refresh fail"

    .line 402
    .line 403
    filled-new-array {v6, v0}, [Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    :cond_11
    iget-object v0, v1, Lr0/d0;->f:Ljava/lang/ref/WeakReference;

    .line 411
    .line 412
    if-eqz v0, :cond_12

    .line 413
    .line 414
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    if-eqz v0, :cond_12

    .line 419
    .line 420
    const/4 v8, 0x0

    .line 421
    :try_start_3
    new-array v6, v8, [Ljava/lang/Object;

    .line 422
    .line 423
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 424
    .line 425
    invoke-interface {v8, v0, v3, v6}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 429
    goto :goto_b

    .line 430
    :catchall_3
    move-exception v0

    .line 431
    new-instance v3, LE0/d;

    .line 432
    .line 433
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 434
    .line 435
    .line 436
    move-object v0, v3

    .line 437
    :goto_b
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    if-eqz v0, :cond_12

    .line 442
    .line 443
    const-string v3, "hide contact search refresh fail"

    .line 444
    .line 445
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    :cond_12
    if-eqz v7, :cond_17

    .line 453
    .line 454
    if-eqz v5, :cond_14

    .line 455
    .line 456
    invoke-static {v5}, Lr0/d0;->z(Ljava/lang/Object;)Landroid/view/View;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    if-nez v0, :cond_13

    .line 461
    .line 462
    goto :goto_c

    .line 463
    :cond_13
    new-instance v3, Lr0/H;

    .line 464
    .line 465
    invoke-direct {v3, v1, v0, v2}, Lr0/H;-><init>(Lr0/d0;Landroid/view/View;I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 469
    .line 470
    .line 471
    :cond_14
    :goto_c
    if-eqz v5, :cond_15

    .line 472
    .line 473
    invoke-virtual {v1, v5}, Lr0/d0;->N0(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    :cond_15
    iget-object v0, v1, Lr0/d0;->b:Ljava/lang/ref/WeakReference;

    .line 477
    .line 478
    if-eqz v0, :cond_16

    .line 479
    .line 480
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    check-cast v0, Landroid/widget/ListView;

    .line 485
    .line 486
    if-eqz v0, :cond_16

    .line 487
    .line 488
    new-instance v3, Lr0/F;

    .line 489
    .line 490
    invoke-direct {v3, v0, v1}, Lr0/F;-><init>(Landroid/widget/ListView;Lr0/d0;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 494
    .line 495
    .line 496
    :cond_16
    iget-object v0, v1, Lr0/d0;->e:Ljava/lang/ref/WeakReference;

    .line 497
    .line 498
    if-eqz v0, :cond_17

    .line 499
    .line 500
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    check-cast v0, Landroid/widget/ListView;

    .line 505
    .line 506
    if-eqz v0, :cond_17

    .line 507
    .line 508
    new-instance v3, Lr0/F;

    .line 509
    .line 510
    invoke-direct {v3, v0, v1}, Lr0/F;-><init>(Landroid/widget/ListView;Lr0/d0;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 514
    .line 515
    .line 516
    :cond_17
    iget-boolean v0, v1, Lr0/d0;->m:Z

    .line 517
    .line 518
    if-eqz v0, :cond_18

    .line 519
    .line 520
    :goto_d
    return-void

    .line 521
    :cond_18
    iput-boolean v2, v1, Lr0/d0;->m:Z

    .line 522
    .line 523
    iget-object v0, v1, Lr0/d0;->b:Ljava/lang/ref/WeakReference;

    .line 524
    .line 525
    if-eqz v0, :cond_1a

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    check-cast v0, Landroid/widget/ListView;

    .line 532
    .line 533
    if-nez v0, :cond_19

    .line 534
    .line 535
    goto :goto_e

    .line 536
    :cond_19
    move-object v4, v0

    .line 537
    goto :goto_f

    .line 538
    :cond_1a
    :goto_e
    iget-object v0, v1, Lr0/d0;->e:Ljava/lang/ref/WeakReference;

    .line 539
    .line 540
    if-eqz v0, :cond_1b

    .line 541
    .line 542
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    move-object v4, v0

    .line 547
    check-cast v4, Landroid/widget/ListView;

    .line 548
    .line 549
    :cond_1b
    :goto_f
    if-nez v4, :cond_1c

    .line 550
    .line 551
    const/4 v8, 0x0

    .line 552
    iput-boolean v8, v1, Lr0/d0;->m:Z

    .line 553
    .line 554
    const-string v0, "hide contact refresh skipped, listView missing"

    .line 555
    .line 556
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    return-void

    .line 564
    :cond_1c
    new-instance v0, Lr0/F;

    .line 565
    .line 566
    invoke-direct {v0, v1, v4}, Lr0/F;-><init>(Lr0/d0;Landroid/widget/ListView;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v4, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 570
    .line 571
    .line 572
    return-void
.end method

.method public final S0(Landroid/view/View;ILjava/lang/Object;Z)LE0/c;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p4, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lr0/d0;->t0(Landroid/view/View;)Z

    .line 5
    .line 6
    .line 7
    move-result p4

    .line 8
    if-nez p4, :cond_0

    .line 9
    .line 10
    goto/16 :goto_d

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p3}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    if-nez p4, :cond_e

    .line 17
    .line 18
    invoke-static {p1}, Lr0/d0;->B(Landroid/view/View;)Landroid/widget/ListView;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    if-eqz p4, :cond_9

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p4, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    new-instance v2, LE0/d;

    .line 35
    .line 36
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object v1, v2

    .line 40
    :goto_0
    const/4 v2, -0x1

    .line 41
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    instance-of v4, v1, LE0/d;

    .line 46
    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    move-object v1, v3

    .line 50
    :cond_1
    move-object v3, v1

    .line 51
    check-cast v3, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eq v3, v2, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object v1, v0

    .line 61
    :goto_1
    check-cast v1, Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    :cond_3
    if-ltz p2, :cond_9

    .line 70
    .line 71
    :try_start_1
    invoke-virtual {p4, p2}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    goto :goto_2

    .line 76
    :catchall_1
    move-exception v1

    .line 77
    new-instance v2, LE0/d;

    .line 78
    .line 79
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object v1, v2

    .line 83
    :goto_2
    nop

    .line 84
    instance-of v2, v1, LE0/d;

    .line 85
    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    move-object v1, v0

    .line 89
    :cond_4
    if-eqz v1, :cond_5

    .line 90
    .line 91
    move-object p4, v1

    .line 92
    goto/16 :goto_9

    .line 93
    .line 94
    :cond_5
    invoke-virtual {p4}, Landroid/widget/ListView;->getHeaderViewsCount()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    sub-int/2addr p2, v1

    .line 99
    if-ltz p2, :cond_9

    .line 100
    .line 101
    :try_start_2
    invoke-virtual {p4}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 102
    .line 103
    .line 104
    move-result-object p4

    .line 105
    if-eqz p4, :cond_6

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    move-object p4, v0

    .line 109
    :goto_3
    if-eqz p4, :cond_7

    .line 110
    .line 111
    invoke-interface {p4, p2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 115
    goto :goto_5

    .line 116
    :catchall_2
    move-exception p2

    .line 117
    goto :goto_4

    .line 118
    :cond_7
    move-object p2, v0

    .line 119
    goto :goto_5

    .line 120
    :goto_4
    new-instance p4, LE0/d;

    .line 121
    .line 122
    invoke-direct {p4, p2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-object p2, p4

    .line 126
    :goto_5
    nop

    .line 127
    instance-of p4, p2, LE0/d;

    .line 128
    .line 129
    if-eqz p4, :cond_8

    .line 130
    .line 131
    move-object p2, v0

    .line 132
    :cond_8
    if-eqz p2, :cond_9

    .line 133
    .line 134
    :goto_6
    move-object p4, p2

    .line 135
    goto :goto_9

    .line 136
    :cond_9
    move-object p2, p1

    .line 137
    :goto_7
    if-eqz p2, :cond_c

    .line 138
    .line 139
    invoke-static {p2}, Lr0/d0;->H0(Landroid/view/View;)Z

    .line 140
    .line 141
    .line 142
    move-result p4

    .line 143
    if-eqz p4, :cond_a

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_a
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    instance-of p4, p2, Landroid/view/View;

    .line 151
    .line 152
    if-eqz p4, :cond_b

    .line 153
    .line 154
    check-cast p2, Landroid/view/View;

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_b
    move-object p2, v0

    .line 158
    goto :goto_7

    .line 159
    :cond_c
    move-object p2, v0

    .line 160
    :goto_8
    if-eqz p2, :cond_d

    .line 161
    .line 162
    invoke-virtual {p0, p2, p1}, Lr0/d0;->U(Landroid/view/View;Landroid/view/View;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    if-eqz p2, :cond_d

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_d
    invoke-virtual {p0, p1}, Lr0/d0;->I(Landroid/view/View;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    goto :goto_6

    .line 174
    :cond_e
    :goto_9
    if-nez p4, :cond_f

    .line 175
    .line 176
    move-object p4, v0

    .line 177
    goto :goto_a

    .line 178
    :cond_f
    invoke-static {p4}, Lr0/d0;->o0(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    if-nez p2, :cond_12

    .line 183
    .line 184
    invoke-virtual {p0, p4}, Lr0/d0;->G0(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-eqz p2, :cond_10

    .line 189
    .line 190
    goto :goto_a

    .line 191
    :cond_10
    invoke-virtual {p0, p4}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    if-nez p2, :cond_11

    .line 196
    .line 197
    goto :goto_a

    .line 198
    :cond_11
    move-object p4, p2

    .line 199
    :cond_12
    :goto_a
    invoke-virtual {p0, p4}, Lr0/d0;->G(Ljava/lang/Object;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    if-nez p2, :cond_15

    .line 204
    .line 205
    invoke-virtual {p0, p1}, Lr0/d0;->I(Landroid/view/View;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    if-eqz p2, :cond_13

    .line 210
    .line 211
    invoke-virtual {p0, p2}, Lr0/d0;->G(Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    goto :goto_b

    .line 216
    :cond_13
    move-object p2, v0

    .line 217
    :goto_b
    if-nez p2, :cond_15

    .line 218
    .line 219
    if-eqz p3, :cond_14

    .line 220
    .line 221
    iget-object p2, p0, Lr0/d0;->I:Ljava/util/WeakHashMap;

    .line 222
    .line 223
    invoke-virtual {p2, p3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    check-cast p2, Ljava/lang/String;

    .line 228
    .line 229
    goto :goto_c

    .line 230
    :cond_14
    move-object p2, v0

    .line 231
    :goto_c
    if-nez p2, :cond_15

    .line 232
    .line 233
    goto :goto_d

    .line 234
    :cond_15
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 235
    .line 236
    .line 237
    move-result p3

    .line 238
    if-nez p3, :cond_1a

    .line 239
    .line 240
    invoke-static {p2}, Lr0/d0;->B0(Ljava/lang/String;)Z

    .line 241
    .line 242
    .line 243
    move-result p3

    .line 244
    if-nez p3, :cond_16

    .line 245
    .line 246
    goto :goto_d

    .line 247
    :cond_16
    invoke-virtual {p0, p4, p2}, Lr0/d0;->H(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p3

    .line 251
    if-nez p3, :cond_19

    .line 252
    .line 253
    new-instance p3, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-static {p3, p1}, Lr0/d0;->q(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    :cond_17
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result p3

    .line 269
    if-eqz p3, :cond_18

    .line 270
    .line 271
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p3

    .line 275
    move-object p4, p3

    .line 276
    check-cast p4, Ljava/lang/String;

    .line 277
    .line 278
    invoke-static {p4, p2}, Lr0/d0;->A0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result p4

    .line 282
    if-eqz p4, :cond_17

    .line 283
    .line 284
    move-object v0, p3

    .line 285
    :cond_18
    move-object p3, v0

    .line 286
    check-cast p3, Ljava/lang/String;

    .line 287
    .line 288
    if-nez p3, :cond_19

    .line 289
    .line 290
    move-object p3, p2

    .line 291
    :cond_19
    new-instance p1, LE0/c;

    .line 292
    .line 293
    invoke-direct {p1, p2, p3}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    return-object p1

    .line 297
    :cond_1a
    :goto_d
    return-object v0
.end method

.method public final T(Landroid/view/View;I)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p2, :cond_0

    .line 3
    .line 4
    goto/16 :goto_b

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :try_start_0
    const-string v2, "getAdapter"

    .line 8
    .line 9
    new-array v3, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 12
    .line 13
    invoke-interface {v4, p1, v2, v3}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    new-instance v2, LE0/d;

    .line 20
    .line 21
    invoke-direct {v2, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v2

    .line 25
    :goto_0
    nop

    .line 26
    instance-of v2, p1, LE0/d;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    move-object p1, v0

    .line 31
    :cond_1
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto/16 :goto_b

    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0}, Lr0/d0;->x0()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_d

    .line 40
    .line 41
    const-string v2, "I"

    .line 42
    .line 43
    invoke-static {p1, v2}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-nez v2, :cond_4

    .line 48
    .line 49
    const-string v2, "com.tencent.mm.plugin.mvvmlist.MvvmList"

    .line 50
    .line 51
    invoke-static {p1, v2}, Lr0/d0;->E(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    :cond_3
    :goto_1
    move-object v2, v0

    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_4
    const-string v3, "o"

    .line 61
    .line 62
    invoke-static {v2, v3}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/util/List;

    .line 67
    .line 68
    if-nez v3, :cond_b

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :goto_2
    if-eqz v3, :cond_8

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const-string v5, "getDeclaredFields(...)"

    .line 81
    .line 82
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    array-length v5, v4

    .line 86
    move v6, v1

    .line 87
    :goto_3
    if-ge v6, v5, :cond_7

    .line 88
    .line 89
    aget-object v7, v4, v6

    .line 90
    .line 91
    const/4 v8, 0x1

    .line 92
    :try_start_1
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    goto :goto_4

    .line 100
    :catchall_1
    move-exception v7

    .line 101
    new-instance v8, LE0/d;

    .line 102
    .line 103
    invoke-direct {v8, v7}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    move-object v7, v8

    .line 107
    :goto_4
    nop

    .line 108
    instance-of v8, v7, LE0/d;

    .line 109
    .line 110
    if-eqz v8, :cond_5

    .line 111
    .line 112
    move-object v7, v0

    .line 113
    :cond_5
    instance-of v8, v7, Ljava/util/List;

    .line 114
    .line 115
    if-eqz v8, :cond_6

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    goto :goto_2

    .line 126
    :cond_8
    move-object v7, v0

    .line 127
    :goto_5
    check-cast v7, Ljava/util/List;

    .line 128
    .line 129
    if-eqz v7, :cond_a

    .line 130
    .line 131
    new-instance v2, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_9

    .line 145
    .line 146
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_9
    move-object v3, v2

    .line 155
    goto :goto_7

    .line 156
    :cond_a
    move-object v3, v0

    .line 157
    :goto_7
    if-nez v3, :cond_b

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_b
    if-ltz p2, :cond_3

    .line 161
    .line 162
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-ge p2, v2, :cond_3

    .line 167
    .line 168
    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    :goto_8
    if-eqz v2, :cond_d

    .line 173
    .line 174
    invoke-virtual {p0, v2}, Lr0/d0;->r0(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_c

    .line 179
    .line 180
    return-object v2

    .line 181
    :cond_c
    invoke-virtual {p0, v2}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-eqz v2, :cond_d

    .line 186
    .line 187
    return-object v2

    .line 188
    :cond_d
    const-string v2, "getItem"

    .line 189
    .line 190
    const-string v3, "getItemAt"

    .line 191
    .line 192
    const-string v4, "a"

    .line 193
    .line 194
    const-string v5, "b"

    .line 195
    .line 196
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    :goto_9
    const/4 v3, 0x4

    .line 201
    if-ge v1, v3, :cond_11

    .line 202
    .line 203
    aget-object v3, v2, v1

    .line 204
    .line 205
    :try_start_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 214
    .line 215
    invoke-interface {v5, p1, v3, v4}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 219
    goto :goto_a

    .line 220
    :catchall_2
    move-exception v3

    .line 221
    new-instance v4, LE0/d;

    .line 222
    .line 223
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    move-object v3, v4

    .line 227
    :goto_a
    nop

    .line 228
    instance-of v4, v3, LE0/d;

    .line 229
    .line 230
    if-eqz v4, :cond_e

    .line 231
    .line 232
    move-object v3, v0

    .line 233
    :cond_e
    if-eqz v3, :cond_10

    .line 234
    .line 235
    invoke-virtual {p0, v3}, Lr0/d0;->r0(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_f

    .line 240
    .line 241
    return-object v3

    .line 242
    :cond_f
    invoke-virtual {p0, v3}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    if-eqz v3, :cond_10

    .line 247
    .line 248
    return-object v3

    .line 249
    :cond_10
    add-int/lit8 v1, v1, 0x1

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_11
    invoke-virtual {p0, p1}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-eqz p1, :cond_12

    .line 257
    .line 258
    return-object p1

    .line 259
    :cond_12
    :goto_b
    return-object v0
.end method

.method public final T0(Landroid/view/View;)V
    .locals 5

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const-string v4, "getChildAt(...)"

    .line 20
    .line 21
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v3}, Lr0/d0;->U0(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0, p1}, Lr0/d0;->U0(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final U(Landroid/view/View;Landroid/view/View;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v0, p2

    .line 2
    :goto_0
    const/4 v1, 0x1

    .line 3
    const-string v2, "getMethods(...)"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    if-eq v0, p1, :cond_6

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v5}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-static {v5, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    array-length v6, v5

    .line 23
    move v7, v3

    .line 24
    :goto_1
    if-ge v7, v6, :cond_1

    .line 25
    .line 26
    aget-object v8, v5, v7

    .line 27
    .line 28
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    const-string v10, "getChildViewHolder"

    .line 33
    .line 34
    invoke-static {v9, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    if-eqz v9, :cond_0

    .line 39
    .line 40
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    array-length v9, v9

    .line 45
    if-ne v9, v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    aget-object v9, v9, v3

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_0

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :catchall_0
    move-exception v5

    .line 65
    goto :goto_3

    .line 66
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move-object v8, v4

    .line 70
    :goto_2
    if-nez v8, :cond_2

    .line 71
    .line 72
    move-object v5, v4

    .line 73
    goto :goto_4

    .line 74
    :cond_2
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v8, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    goto :goto_4

    .line 83
    :goto_3
    new-instance v6, LE0/d;

    .line 84
    .line 85
    invoke-direct {v6, v5}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object v5, v6

    .line 89
    :goto_4
    nop

    .line 90
    instance-of v6, v5, LE0/d;

    .line 91
    .line 92
    if-eqz v6, :cond_3

    .line 93
    .line 94
    move-object v5, v4

    .line 95
    :cond_3
    if-eqz v5, :cond_4

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    instance-of v1, v0, Landroid/view/View;

    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    check-cast v0, Landroid/view/View;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    move-object v0, v4

    .line 110
    goto :goto_0

    .line 111
    :cond_6
    move-object v5, v4

    .line 112
    :goto_5
    const/4 v0, -0x1

    .line 113
    if-eqz v5, :cond_f

    .line 114
    .line 115
    invoke-virtual {p0, v5}, Lr0/d0;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    if-eqz v6, :cond_7

    .line 120
    .line 121
    return-object v6

    .line 122
    :cond_7
    :try_start_1
    const-string v6, "getBindingAdapterPosition"

    .line 123
    .line 124
    new-array v7, v3, [Ljava/lang/Object;

    .line 125
    .line 126
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 127
    .line 128
    invoke-interface {v8, v5, v6, v7}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 132
    goto :goto_6

    .line 133
    :catchall_1
    move-exception v6

    .line 134
    new-instance v7, LE0/d;

    .line 135
    .line 136
    invoke-direct {v7, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    move-object v6, v7

    .line 140
    :goto_6
    nop

    .line 141
    instance-of v7, v6, LE0/d;

    .line 142
    .line 143
    if-eqz v7, :cond_8

    .line 144
    .line 145
    move-object v6, v4

    .line 146
    :cond_8
    if-eqz v6, :cond_b

    .line 147
    .line 148
    instance-of v7, v6, Ljava/lang/Number;

    .line 149
    .line 150
    if-eqz v7, :cond_9

    .line 151
    .line 152
    check-cast v6, Ljava/lang/Number;

    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_9
    move-object v6, v4

    .line 156
    :goto_7
    if-eqz v6, :cond_a

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    goto :goto_8

    .line 163
    :cond_a
    move v6, v0

    .line 164
    :goto_8
    invoke-virtual {p0, p1, v6}, Lr0/d0;->T(Landroid/view/View;I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    if-eqz v6, :cond_b

    .line 169
    .line 170
    return-object v6

    .line 171
    :cond_b
    :try_start_2
    const-string v6, "getAdapterPosition"

    .line 172
    .line 173
    new-array v7, v3, [Ljava/lang/Object;

    .line 174
    .line 175
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 176
    .line 177
    invoke-interface {v8, v5, v6, v7}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 181
    goto :goto_9

    .line 182
    :catchall_2
    move-exception v5

    .line 183
    new-instance v6, LE0/d;

    .line 184
    .line 185
    invoke-direct {v6, v5}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    move-object v5, v6

    .line 189
    :goto_9
    nop

    .line 190
    instance-of v6, v5, LE0/d;

    .line 191
    .line 192
    if-eqz v6, :cond_c

    .line 193
    .line 194
    move-object v5, v4

    .line 195
    :cond_c
    if-eqz v5, :cond_f

    .line 196
    .line 197
    instance-of v6, v5, Ljava/lang/Number;

    .line 198
    .line 199
    if-eqz v6, :cond_d

    .line 200
    .line 201
    check-cast v5, Ljava/lang/Number;

    .line 202
    .line 203
    goto :goto_a

    .line 204
    :cond_d
    move-object v5, v4

    .line 205
    :goto_a
    if-eqz v5, :cond_e

    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    goto :goto_b

    .line 212
    :cond_e
    move v5, v0

    .line 213
    :goto_b
    invoke-virtual {p0, p1, v5}, Lr0/d0;->T(Landroid/view/View;I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    if-eqz v5, :cond_f

    .line 218
    .line 219
    return-object v5

    .line 220
    :cond_f
    :goto_c
    if-eqz p2, :cond_17

    .line 221
    .line 222
    if-eq p2, p1, :cond_17

    .line 223
    .line 224
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-virtual {v5}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-static {v5, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    array-length v6, v5

    .line 236
    move v7, v3

    .line 237
    :goto_d
    if-ge v7, v6, :cond_11

    .line 238
    .line 239
    aget-object v8, v5, v7

    .line 240
    .line 241
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    const-string v10, "getChildAdapterPosition"

    .line 246
    .line 247
    invoke-static {v9, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    if-eqz v9, :cond_10

    .line 252
    .line 253
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    array-length v9, v9

    .line 258
    if-ne v9, v1, :cond_10

    .line 259
    .line 260
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    aget-object v9, v9, v3

    .line 265
    .line 266
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    if-eqz v9, :cond_10

    .line 275
    .line 276
    goto :goto_e

    .line 277
    :cond_10
    add-int/lit8 v7, v7, 0x1

    .line 278
    .line 279
    goto :goto_d

    .line 280
    :cond_11
    move-object v8, v4

    .line 281
    :goto_e
    if-nez v8, :cond_12

    .line 282
    .line 283
    goto :goto_11

    .line 284
    :cond_12
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-virtual {v8, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    instance-of v6, v5, Ljava/lang/Number;

    .line 293
    .line 294
    if-eqz v6, :cond_13

    .line 295
    .line 296
    check-cast v5, Ljava/lang/Number;

    .line 297
    .line 298
    goto :goto_f

    .line 299
    :cond_13
    move-object v5, v4

    .line 300
    :goto_f
    if-eqz v5, :cond_14

    .line 301
    .line 302
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 303
    .line 304
    .line 305
    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 306
    goto :goto_10

    .line 307
    :cond_14
    move v5, v0

    .line 308
    :goto_10
    if-ltz v5, :cond_15

    .line 309
    .line 310
    move v0, v5

    .line 311
    goto :goto_12

    .line 312
    :catchall_3
    :cond_15
    :goto_11
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 313
    .line 314
    .line 315
    move-result-object p2

    .line 316
    instance-of v5, p2, Landroid/view/View;

    .line 317
    .line 318
    if-eqz v5, :cond_16

    .line 319
    .line 320
    check-cast p2, Landroid/view/View;

    .line 321
    .line 322
    goto :goto_c

    .line 323
    :cond_16
    move-object p2, v4

    .line 324
    goto :goto_c

    .line 325
    :cond_17
    :goto_12
    if-ltz v0, :cond_18

    .line 326
    .line 327
    invoke-virtual {p0, p1, v0}, Lr0/d0;->T(Landroid/view/View;I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    if-eqz p1, :cond_18

    .line 332
    .line 333
    return-object p1

    .line 334
    :cond_18
    return-object v4
.end method

.method public final U0(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lr0/d0;->V0(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, Landroid/view/ViewGroup;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "getChildAt(...)"

    .line 22
    .line 23
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lr0/d0;->U0(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public final V0(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/d0;->E:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr0/U;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget v1, v0, Lr0/U;->a:I

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v3, 0x0

    .line 25
    iget-object v4, v0, Lr0/U;->b:Ljava/lang/Integer;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget v5, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 34
    .line 35
    if-eq v5, v4, :cond_1

    .line 36
    .line 37
    iput v4, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 38
    .line 39
    move v3, v2

    .line 40
    :cond_1
    iget-object v0, v0, Lr0/U;->c:Ljava/lang/Integer;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v4, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 49
    .line 50
    if-eq v4, v0, :cond_2

    .line 51
    .line 52
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move v2, v3

    .line 56
    :goto_0
    move v3, v2

    .line 57
    :cond_3
    if-eqz v3, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_1
    return-void
.end method

.method public final W(Ljava/lang/Object;)[I
    .locals 8

    .line 1
    iget-object v0, p0, Lr0/d0;->g:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, [I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, Lr0/d0;->j:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-static {v1, p1}, Lr0/d0;->A(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, -0x1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    new-array v5, v3, [Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v1, p1, v5}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    instance-of v5, v1, Ljava/lang/Integer;

    .line 31
    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    check-cast v1, Ljava/lang/Integer;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object v1, v2

    .line 38
    :goto_0
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    :cond_3
    :goto_1
    if-gez v4, :cond_4

    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_4
    if-nez v4, :cond_5

    .line 48
    .line 49
    new-array v1, v3, [I

    .line 50
    .line 51
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_5
    invoke-virtual {p0}, Lr0/d0;->F()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_7

    .line 64
    .line 65
    new-array v1, v4, [I

    .line 66
    .line 67
    :goto_2
    if-ge v3, v4, :cond_6

    .line 68
    .line 69
    aput v3, v1, v3

    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_6
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_7
    new-instance v5, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    :goto_3
    if-ge v3, v4, :cond_c

    .line 84
    .line 85
    iget-object v6, p0, Lr0/d0;->i:Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-static {v6, p1}, Lr0/d0;->A(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    if-nez v6, :cond_8

    .line 92
    .line 93
    move-object v6, v2

    .line 94
    goto :goto_4

    .line 95
    :cond_8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    filled-new-array {v7}, [Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-static {v6, p1, v7}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    :goto_4
    if-nez v6, :cond_9

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_9
    invoke-virtual {p0, v6}, Lr0/d0;->G(Ljava/lang/Object;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    if-eqz v6, :cond_b

    .line 115
    .line 116
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_a

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_a
    invoke-interface {v1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_b

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_b
    :goto_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_c
    invoke-static {v5}, LF0/k;->v0(Ljava/util/ArrayList;)[I

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    array-length v2, v1

    .line 145
    if-eq v2, v4, :cond_d

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const-string v3, "rawCount="

    .line 156
    .line 157
    invoke-static {v4, v3}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    array-length v4, v1

    .line 162
    const-string v5, "visibleCount="

    .line 163
    .line 164
    invoke-static {v4, v5}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    const-string v5, "hide contact visible mapping changed"

    .line 169
    .line 170
    filled-new-array {v5, v2, v3, v4}, [Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_d
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    return-object v1
.end method

.method public final X0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v10, 0x4

    .line 5
    const/4 v11, 0x1

    .line 6
    if-nez p3, :cond_2

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    move-object/from16 v9, p2

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static/range {p1 .. p3}, Lr0/d0;->R0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    move-object v9, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    move-object/from16 v9, p3

    .line 23
    .line 24
    :goto_0
    iget-boolean v2, v1, Lr0/d0;->s:Z

    .line 25
    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_3
    iput-boolean v11, v1, Lr0/d0;->s:Z

    .line 30
    .line 31
    new-instance v2, LN0/k;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    new-array v5, v10, [J

    .line 37
    .line 38
    fill-array-data v5, :array_0

    .line 39
    .line 40
    .line 41
    new-array v3, v11, [J

    .line 42
    .line 43
    const-wide/16 v6, 0x9c4

    .line 44
    .line 45
    aput-wide v6, v3, v0

    .line 46
    .line 47
    move v4, v0

    .line 48
    move v12, v4

    .line 49
    :goto_1
    if-ge v12, v10, :cond_4

    .line 50
    .line 51
    aget-wide v13, v5, v12

    .line 52
    .line 53
    add-int/lit8 v15, v4, 0x1

    .line 54
    .line 55
    new-instance v0, Lr0/I;

    .line 56
    .line 57
    move-object/from16 v6, p1

    .line 58
    .line 59
    move-object/from16 v7, p2

    .line 60
    .line 61
    move-object/from16 v8, p3

    .line 62
    .line 63
    invoke-direct/range {v0 .. v9}, Lr0/I;-><init>(Lr0/d0;LN0/k;[JI[JLjava/lang/Object;Landroid/widget/ListView;Landroid/view/View;Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v9, v0, v13, v14}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 67
    .line 68
    .line 69
    add-int/2addr v12, v11

    .line 70
    move-object/from16 v1, p0

    .line 71
    .line 72
    move v4, v15

    .line 73
    goto :goto_1

    .line 74
    :cond_4
    :goto_2
    return-void

    .line 75
    :array_0
    .array-data 8
        0x0
        0xa0
        0x1f4
        0x4b0
    .end array-data
.end method

.method public final Y0(Landroid/view/View;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lr0/d0;->M0()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lr0/d0;->D:Lr0/T;

    .line 9
    .line 10
    iget-object v3, v2, Lr0/T;->c:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lr0/d0;->I0()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    new-instance v4, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {v4, v1}, Lr0/d0;->q(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v4, v1}, Lr0/d0;->p(Landroid/view/View;Ljava/util/ArrayList;Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Landroid/view/View;

    .line 71
    .line 72
    if-eq v5, v1, :cond_2

    .line 73
    .line 74
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_2

    .line 79
    .line 80
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_9

    .line 93
    .line 94
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    move-object v9, v4

    .line 99
    check-cast v9, Landroid/view/View;

    .line 100
    .line 101
    new-instance v10, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {v10, v9}, Lr0/d0;->q(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 107
    .line 108
    .line 109
    iget-boolean v4, v0, Lr0/d0;->T:Z

    .line 110
    .line 111
    const/4 v5, 0x1

    .line 112
    if-nez v4, :cond_4

    .line 113
    .line 114
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_4

    .line 119
    .line 120
    iput-boolean v5, v0, Lr0/d0;->T:Z

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    const-string v5, "root="

    .line 131
    .line 132
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    const-string v6, "row="

    .line 145
    .line 146
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    const/4 v13, 0x0

    .line 151
    const/4 v14, 0x0

    .line 152
    const-string v11, "|"

    .line 153
    .line 154
    const/4 v12, 0x0

    .line 155
    const/16 v15, 0x3e

    .line 156
    .line 157
    invoke-static/range {v10 .. v15}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    const-string v7, "texts="

    .line 162
    .line 163
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    const/4 v6, 0x0

    .line 168
    const/4 v7, 0x0

    .line 169
    move-object v8, v4

    .line 170
    const-string v4, "|"

    .line 171
    .line 172
    move-object v12, v5

    .line 173
    const/4 v5, 0x0

    .line 174
    move-object v13, v8

    .line 175
    const/16 v8, 0x3e

    .line 176
    .line 177
    invoke-static/range {v3 .. v8}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    const-string v5, "hidden="

    .line 182
    .line 183
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const-string v5, "hide contact visible row sample"

    .line 188
    .line 189
    filled-new-array {v5, v13, v12, v11, v4}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-static {v4}, Li0/a;->a([Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_4
    iget-boolean v4, v0, Lr0/d0;->p:Z

    .line 198
    .line 199
    if-nez v4, :cond_5

    .line 200
    .line 201
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-nez v4, :cond_5

    .line 206
    .line 207
    iput-boolean v5, v0, Lr0/d0;->p:Z

    .line 208
    .line 209
    :cond_5
    :goto_2
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_6

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_6
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_8

    .line 225
    .line 226
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    check-cast v5, Ljava/lang/String;

    .line 231
    .line 232
    invoke-interface {v3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-eqz v5, :cond_7

    .line 237
    .line 238
    invoke-virtual {v0, v9}, Lr0/d0;->f0(Landroid/view/View;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_1

    .line 242
    .line 243
    :cond_8
    :goto_3
    invoke-virtual {v0, v9}, Lr0/d0;->V0(Landroid/view/View;)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :cond_9
    :goto_4
    return-void
.end method

.method public final Z0(Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "getChildAt(...)"

    .line 19
    .line 20
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lr0/d0;->Y0(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void

    .line 30
    :cond_1
    invoke-virtual {p0, p1}, Lr0/d0;->Y0(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final a1(Ljava/lang/Object;Landroid/widget/ListView;Ljava/lang/Object;Landroid/view/View;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p2, v0

    .line 22
    :goto_0
    const-string v1, ""

    .line 23
    .line 24
    if-nez p2, :cond_1

    .line 25
    .line 26
    move-object p2, v1

    .line 27
    :cond_1
    if-eqz p3, :cond_2

    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object p3, v0

    .line 39
    :goto_1
    if-nez p3, :cond_3

    .line 40
    .line 41
    move-object p3, v1

    .line 42
    :cond_3
    if-eqz p4, :cond_4

    .line 43
    .line 44
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_4
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_5
    move-object v1, v0

    .line 56
    :goto_2
    invoke-virtual {p0}, Lr0/d0;->F()Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object p4

    .line 60
    invoke-static {p4}, LF0/k;->q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v6, 0x0

    .line 66
    const-string v3, ","

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    const/16 v7, 0x3e

    .line 70
    .line 71
    invoke-static/range {v2 .. v7}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p4

    .line 75
    filled-new-array {p1, p2, p3, v1, p4}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/4 v3, 0x0

    .line 84
    const/4 v4, 0x0

    .line 85
    const-string v1, "|"

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    const/16 v5, 0x3e

    .line 89
    .line 90
    invoke-static/range {v0 .. v5}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 95
    .line 96
    .line 97
    move-result-wide p2

    .line 98
    iget-object p4, p0, Lr0/d0;->v:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p4

    .line 104
    if-eqz p4, :cond_6

    .line 105
    .line 106
    iget-wide v0, p0, Lr0/d0;->w:J

    .line 107
    .line 108
    sub-long v0, p2, v0

    .line 109
    .line 110
    const-wide/16 v2, 0xa0

    .line 111
    .line 112
    cmp-long p4, v0, v2

    .line 113
    .line 114
    if-gez p4, :cond_6

    .line 115
    .line 116
    const/4 p1, 0x1

    .line 117
    return p1

    .line 118
    :cond_6
    iput-object p1, p0, Lr0/d0;->v:Ljava/lang/String;

    .line 119
    .line 120
    iput-wide p2, p0, Lr0/d0;->w:J

    .line 121
    .line 122
    const/4 p1, 0x0

    .line 123
    return p1
.end method

.method public final b1(Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)Z
    .locals 12

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    invoke-static {p2}, Lr0/d0;->w(Landroid/view/View;)Landroid/widget/TextView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v8, p0, Lr0/d0;->J:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    const/4 v9, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v8, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p3, v5, p1}, Lr0/d0;->O0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return v9

    .line 19
    :cond_0
    invoke-static {p2}, Lr0/d0;->x(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v10, 0x0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    return v10

    .line 27
    :cond_1
    new-instance v11, Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-direct {v11, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    sget-boolean v2, Lz0/i;->a:Z

    .line 37
    .line 38
    invoke-static {}, Lz0/g;->l()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    const/high16 v2, 0x41800000    # 16.0f

    .line 46
    .line 47
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 48
    .line 49
    .line 50
    const/16 v2, 0x1e

    .line 51
    .line 52
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    .line 58
    .line 59
    const/16 v2, 0x10

    .line 60
    .line 61
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const-string v3, "getContext(...)"

    .line 69
    .line 70
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/16 v6, 0x20

    .line 74
    .line 75
    invoke-static {v2, v6}, Lr0/d0;->t(Landroid/content/Context;I)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-static {v7, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v7, v6}, Lr0/d0;->t(Landroid/content/Context;I)I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-virtual {v11, v2, v10, v6, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const/16 v6, 0x30

    .line 101
    .line 102
    invoke-static {v2, v6}, Lr0/d0;->t(Landroid/content/Context;I)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 107
    .line 108
    .line 109
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 110
    .line 111
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-static {v7, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v7, v6}, Lr0/d0;->t(Landroid/content/Context;I)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    const/4 v6, -0x1

    .line 123
    invoke-direct {v2, v6, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v11, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    .line 128
    .line 129
    new-instance v2, Lr0/L;

    .line 130
    .line 131
    const/4 v7, 0x0

    .line 132
    move-object v3, p0

    .line 133
    move-object v6, p1

    .line 134
    move-object v4, p3

    .line 135
    invoke-direct/range {v2 .. v7}, Lr0/L;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v11, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 142
    .line 143
    .line 144
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Landroid/view/View;->requestLayout()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->update()V

    .line 157
    .line 158
    .line 159
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    new-instance v2, LE0/d;

    .line 164
    .line 165
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    move-object v0, v2

    .line 169
    :goto_0
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_2

    .line 174
    .line 175
    const-string v2, "contact quick add runtime popup refresh fail"

    .line 176
    .line 177
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_2
    invoke-virtual {v8, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, p3, v5, p1}, Lr0/d0;->O0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    new-instance p1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v0, "source="

    .line 193
    .line 194
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    move-object/from16 v1, p5

    .line 198
    .line 199
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-eqz p6, :cond_3

    .line 207
    .line 208
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    goto :goto_1

    .line 217
    :cond_3
    const/4 v0, 0x0

    .line 218
    :goto_1
    const-string v1, "anchor="

    .line 219
    .line 220
    invoke-static {v1, v0}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    const-string v1, "contact quick add runtime popup injected"

    .line 225
    .line 226
    filled-new-array {v1, p3, v5, p1, v0}, [Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    return v9
.end method

.method public final f0(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/d0;->E:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    new-instance v1, Lr0/U;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 23
    .line 24
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v3, v4

    .line 30
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iget v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 37
    .line 38
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :cond_1
    invoke-direct {v1, v2, v3, v4}, Lr0/U;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_2
    const/16 v0, 0x8

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 65
    .line 66
    :cond_3
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 71
    .line 72
    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 73
    .line 74
    .line 75
    :cond_5
    return-void
.end method

.method public final g0(Ljava/lang/Class;)V
    .locals 6

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 8
    .line 9
    const-string v3, "getItem"

    .line 10
    .line 11
    invoke-interface {v2, p1, v3, v1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    new-array v3, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 23
    .line 24
    const-string v5, "getCount"

    .line 25
    .line 26
    invoke-interface {v4, p1, v5, v3}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    goto/16 :goto_0

    .line 33
    .line 34
    :cond_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 37
    .line 38
    const-string v5, "notifyDataSetChanged"

    .line 39
    .line 40
    invoke-interface {v4, p1, v5, v2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_2
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 53
    .line 54
    const-string v5, "getItemId"

    .line 55
    .line 56
    invoke-interface {v4, p1, v5, v0}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v4, p0, Lr0/d0;->i:Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-virtual {v4, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    iget-object v4, p0, Lr0/d0;->j:Ljava/util/HashMap;

    .line 66
    .line 67
    invoke-virtual {v4, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    new-instance p1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v4, "hide-contact-count-"

    .line 73
    .line 74
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 85
    .line 86
    invoke-virtual {v4, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_3

    .line 91
    .line 92
    new-instance v4, Lr0/V;

    .line 93
    .line 94
    const/4 v5, 0x1

    .line 95
    invoke-direct {v4, p0, v5}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 99
    .line 100
    .line 101
    sget-object v3, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 102
    .line 103
    invoke-virtual {v3, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :cond_3
    const-string p1, "hide-contact-item-"

    .line 107
    .line 108
    invoke-static {p1, v1}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    sget-object v3, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 113
    .line 114
    invoke-virtual {v3, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_4

    .line 119
    .line 120
    new-instance v3, Lr0/V;

    .line 121
    .line 122
    const/4 v4, 0x2

    .line 123
    invoke-direct {v3, p0, v4}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 124
    .line 125
    .line 126
    invoke-static {v1, v3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 127
    .line 128
    .line 129
    sget-object v1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 130
    .line 131
    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    :cond_4
    if-eqz v0, :cond_5

    .line 135
    .line 136
    const-string p1, "hide-contact-item-id-"

    .line 137
    .line 138
    invoke-static {p1, v0}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    sget-object v1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 143
    .line 144
    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_5

    .line 149
    .line 150
    new-instance v1, Lr0/V;

    .line 151
    .line 152
    const/4 v3, 0x3

    .line 153
    invoke-direct {v1, p0, v3}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v1}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 157
    .line 158
    .line 159
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 160
    .line 161
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    :cond_5
    const-string p1, "hide-contact-notify-"

    .line 165
    .line 166
    invoke-static {p1, v2}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 171
    .line 172
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_6

    .line 177
    .line 178
    new-instance v0, Lr0/V;

    .line 179
    .line 180
    const/4 v1, 0x4

    .line 181
    invoke-direct {v0, p0, v1}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 182
    .line 183
    .line 184
    invoke-static {v2, v0}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 185
    .line 186
    .line 187
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 188
    .line 189
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    :cond_6
    :goto_0
    return-void
.end method

.method public final varargs h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 1

    .line 1
    array-length v0, p3

    .line 2
    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p3

    .line 6
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2, p3}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p2, "hide-contact-address-fragment-"

    .line 16
    .line 17
    invoke-static {p2, p1}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    sget-object p3, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 22
    .line 23
    invoke-virtual {p3, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    :cond_1
    new-instance p3, Lr0/V;

    .line 31
    .line 32
    const/4 v0, 0x5

    .line 33
    invoke-direct {p3, p0, v0}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/16 v3, 0x1a

    .line 6
    .line 7
    const/4 v4, 0x6

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move-object v0, v2

    .line 17
    :cond_0
    iput-object v0, v1, Lr0/d0;->B:Landroid/content/Context;

    .line 18
    .line 19
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 20
    .line 21
    const-string v7, "contact-quick-add-launcher-activity-cache"

    .line 22
    .line 23
    invoke-virtual {v0, v7}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const-string v8, "onResume"

    .line 28
    .line 29
    const-string v9, "getClassLoader(...)"

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :try_start_0
    const-string v0, "com.tencent.mm.ui.LauncherUI"

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    invoke-static {v10, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 44
    .line 45
    invoke-interface {v11, v10, v0}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    new-array v10, v5, [Ljava/lang/Object;

    .line 53
    .line 54
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 55
    .line 56
    invoke-interface {v11, v0, v8, v10}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    new-instance v10, Lr0/V;

    .line 64
    .line 65
    const/16 v11, 0x17

    .line 66
    .line 67
    invoke-direct {v10, v1, v11}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v10}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 74
    .line 75
    invoke-virtual {v0, v7}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    new-instance v7, LE0/d;

    .line 86
    .line 87
    invoke-direct {v7, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    move-object v0, v7

    .line 91
    :goto_0
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    const-string v7, "contact quick add launcher activity cache hook missing"

    .line 98
    .line 99
    filled-new-array {v7, v0}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    :goto_1
    invoke-static {v2}, LA0/l;->e(Landroid/content/Context;)LA0/i;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, v1, Lr0/d0;->z:LA0/i;

    .line 111
    .line 112
    invoke-static {v2}, LA0/l;->i(Landroid/content/Context;)LA0/N;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iput-object v0, v1, Lr0/d0;->A:LA0/N;

    .line 117
    .line 118
    sget-boolean v0, Lz0/i;->a:Z

    .line 119
    .line 120
    invoke-static {}, Lz0/g;->F()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    const-string v7, "enabled="

    .line 125
    .line 126
    invoke-static {v7, v0}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    sget v0, Lz0/r;->e:I

    .line 131
    .line 132
    const/4 v10, -0x1

    .line 133
    if-ne v0, v10, :cond_5

    .line 134
    .line 135
    :try_start_1
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    invoke-virtual {v0, v11, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget v10, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :catch_0
    move-exception v0

    .line 159
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :goto_2
    sput v10, Lz0/r;->e:I

    .line 167
    .line 168
    :cond_5
    sget v0, Lz0/r;->e:I

    .line 169
    .line 170
    const-string v10, "version="

    .line 171
    .line 172
    invoke-static {v0, v10}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-object v10, v1, Lr0/d0;->A:LA0/N;

    .line 177
    .line 178
    if-eqz v10, :cond_6

    .line 179
    .line 180
    move v10, v6

    .line 181
    goto :goto_3

    .line 182
    :cond_6
    move v10, v5

    .line 183
    :goto_3
    const-string v11, "quickAddCached="

    .line 184
    .line 185
    invoke-static {v11, v10}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    iget-object v11, v1, Lr0/d0;->A:LA0/N;

    .line 190
    .line 191
    if-eqz v11, :cond_7

    .line 192
    .line 193
    iget-object v13, v11, LA0/N;->d:Ljava/util/List;

    .line 194
    .line 195
    new-instance v11, Lq0/d;

    .line 196
    .line 197
    const/16 v14, 0x1c

    .line 198
    .line 199
    invoke-direct {v11, v14}, Lq0/d;-><init>(I)V

    .line 200
    .line 201
    .line 202
    const/4 v15, 0x0

    .line 203
    const/16 v16, 0x0

    .line 204
    .line 205
    const-string v14, ";"

    .line 206
    .line 207
    const/16 v18, 0x1e

    .line 208
    .line 209
    move-object/from16 v17, v11

    .line 210
    .line 211
    invoke-static/range {v13 .. v18}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    goto :goto_4

    .line 216
    :cond_7
    const/4 v11, 0x0

    .line 217
    :goto_4
    if-nez v11, :cond_8

    .line 218
    .line 219
    const-string v11, ""

    .line 220
    .line 221
    :cond_8
    const-string v13, "popup="

    .line 222
    .line 223
    invoke-virtual {v13, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    const-string v13, "quickadd contact handleHook"

    .line 228
    .line 229
    filled-new-array {v13, v7, v0, v10, v11}, [Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    iget-object v0, v1, Lr0/d0;->z:LA0/i;

    .line 237
    .line 238
    if-eqz v0, :cond_9

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_9
    sget-object v0, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 242
    .line 243
    new-instance v13, LA0/u;

    .line 244
    .line 245
    new-instance v0, Lq0/d;

    .line 246
    .line 247
    const/16 v7, 0x1d

    .line 248
    .line 249
    invoke-direct {v0, v7}, Lq0/d;-><init>(I)V

    .line 250
    .line 251
    .line 252
    new-instance v7, LA0/h;

    .line 253
    .line 254
    const/16 v10, 0xc

    .line 255
    .line 256
    invoke-direct {v7, v2, v10}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 257
    .line 258
    .line 259
    new-instance v10, Lr0/G;

    .line 260
    .line 261
    invoke-direct {v10, v1}, Lr0/G;-><init>(Lr0/d0;)V

    .line 262
    .line 263
    .line 264
    new-instance v11, Lr0/P;

    .line 265
    .line 266
    invoke-direct {v11, v5}, Lr0/P;-><init>(I)V

    .line 267
    .line 268
    .line 269
    const-string v14, "contact"

    .line 270
    .line 271
    const-string v15, "\u901a\u8baf\u5f55\u9690\u85cf"

    .line 272
    .line 273
    move-object/from16 v16, v0

    .line 274
    .line 275
    move-object/from16 v17, v7

    .line 276
    .line 277
    move-object/from16 v18, v10

    .line 278
    .line 279
    move-object/from16 v19, v11

    .line 280
    .line 281
    invoke-direct/range {v13 .. v19}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v2, v13}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 285
    .line 286
    .line 287
    :goto_5
    sget-object v0, Lr0/d0;->a0:[Ljava/lang/String;

    .line 288
    .line 289
    array-length v7, v0

    .line 290
    move v10, v5

    .line 291
    :goto_6
    const-string v11, "clazz"

    .line 292
    .line 293
    if-ge v10, v7, :cond_c

    .line 294
    .line 295
    aget-object v13, v0, v10

    .line 296
    .line 297
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 298
    .line 299
    .line 300
    move-result-object v14

    .line 301
    invoke-static {v14, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-static {v13, v11}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 308
    .line 309
    invoke-interface {v11, v14, v13}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    if-nez v11, :cond_a

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_a
    new-instance v13, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    const-string v14, "hide-contact-ctor-"

    .line 319
    .line 320
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v13

    .line 330
    sget-object v14, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 331
    .line 332
    invoke-virtual {v14, v13}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v14

    .line 336
    if-eqz v14, :cond_b

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_b
    new-instance v14, LA0/x;

    .line 340
    .line 341
    invoke-direct {v14, v4}, LA0/x;-><init>(I)V

    .line 342
    .line 343
    .line 344
    invoke-static {v11, v14}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 345
    .line 346
    .line 347
    sget-object v11, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 348
    .line 349
    invoke-virtual {v11, v13}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    :goto_7
    add-int/2addr v10, v6

    .line 353
    goto :goto_6

    .line 354
    :cond_c
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 355
    .line 356
    const-string v10, "hide-contact-bind-list-adapter"

    .line 357
    .line 358
    invoke-virtual {v7, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v7

    .line 362
    const-string v13, "setAdapter"

    .line 363
    .line 364
    const-class v14, Landroid/widget/ListView;

    .line 365
    .line 366
    if-eqz v7, :cond_d

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_d
    const-class v7, Landroid/widget/ListAdapter;

    .line 370
    .line 371
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    sget-object v15, Lc0/f;->b:Ld0/b;

    .line 376
    .line 377
    invoke-interface {v15, v14, v13, v7}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    if-nez v7, :cond_e

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_e
    new-instance v15, Lr0/V;

    .line 385
    .line 386
    invoke-direct {v15, v1, v5}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 387
    .line 388
    .line 389
    invoke-static {v7, v15}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 390
    .line 391
    .line 392
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 393
    .line 394
    invoke-virtual {v7, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    :goto_8
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 398
    .line 399
    const-string v10, "hide-contact-search-layout-children"

    .line 400
    .line 401
    invoke-virtual {v7, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    if-eqz v7, :cond_f

    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_f
    new-array v7, v5, [Ljava/lang/Object;

    .line 409
    .line 410
    sget-object v15, Lc0/f;->b:Ld0/b;

    .line 411
    .line 412
    const-string v12, "layoutChildren"

    .line 413
    .line 414
    invoke-interface {v15, v14, v12, v7}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    if-nez v7, :cond_10

    .line 419
    .line 420
    goto :goto_9

    .line 421
    :cond_10
    new-instance v12, Lr0/V;

    .line 422
    .line 423
    const/16 v14, 0x19

    .line 424
    .line 425
    invoke-direct {v12, v1, v14}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 426
    .line 427
    .line 428
    invoke-static {v7, v12}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 429
    .line 430
    .line 431
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 432
    .line 433
    invoke-virtual {v7, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    :goto_9
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    invoke-static {v7, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    sget-object v10, Lc0/f;->b:Ld0/b;

    .line 444
    .line 445
    const-string v12, "com.tencent.mm.view.recyclerview.WxRecyclerView"

    .line 446
    .line 447
    invoke-interface {v10, v7, v12}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    if-nez v7, :cond_11

    .line 452
    .line 453
    goto :goto_a

    .line 454
    :cond_11
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    invoke-static {v10, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    sget-object v12, Lc0/f;->b:Ld0/b;

    .line 462
    .line 463
    const-string v14, "androidx.recyclerview.widget.RecyclerView$Adapter"

    .line 464
    .line 465
    invoke-interface {v12, v10, v14}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    move-result-object v10

    .line 469
    if-nez v10, :cond_12

    .line 470
    .line 471
    goto :goto_a

    .line 472
    :cond_12
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v10

    .line 476
    sget-object v12, Lc0/f;->b:Ld0/b;

    .line 477
    .line 478
    invoke-interface {v12, v7, v13, v10}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 479
    .line 480
    .line 481
    move-result-object v7

    .line 482
    if-nez v7, :cond_13

    .line 483
    .line 484
    goto :goto_a

    .line 485
    :cond_13
    const-string v10, "hide-contact-bind-wx-recycler-"

    .line 486
    .line 487
    invoke-static {v10, v7}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v10

    .line 491
    sget-object v12, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 492
    .line 493
    invoke-virtual {v12, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v12

    .line 497
    if-eqz v12, :cond_14

    .line 498
    .line 499
    goto :goto_a

    .line 500
    :cond_14
    new-instance v12, Lr0/V;

    .line 501
    .line 502
    const/16 v13, 0x1b

    .line 503
    .line 504
    invoke-direct {v12, v1, v13}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 505
    .line 506
    .line 507
    invoke-static {v7, v12}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 508
    .line 509
    .line 510
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 511
    .line 512
    invoke-virtual {v7, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    :goto_a
    iget-object v7, v1, Lr0/d0;->z:LA0/i;

    .line 516
    .line 517
    if-eqz v7, :cond_15

    .line 518
    .line 519
    iget-object v7, v7, LA0/i;->b:Ljava/lang/String;

    .line 520
    .line 521
    goto :goto_b

    .line 522
    :cond_15
    const-string v7, "com.tencent.mm.ui.contact.address.AddressLiveList"

    .line 523
    .line 524
    :goto_b
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 525
    .line 526
    .line 527
    move-result-object v10

    .line 528
    invoke-static {v10, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    sget-object v12, Lc0/f;->b:Ld0/b;

    .line 532
    .line 533
    invoke-interface {v12, v10, v7}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    move-result-object v7

    .line 537
    if-nez v7, :cond_16

    .line 538
    .line 539
    goto :goto_d

    .line 540
    :cond_16
    iget-object v10, v1, Lr0/d0;->z:LA0/i;

    .line 541
    .line 542
    if-eqz v10, :cond_17

    .line 543
    .line 544
    iget-object v10, v10, LA0/i;->c:Ljava/lang/String;

    .line 545
    .line 546
    goto :goto_c

    .line 547
    :cond_17
    const-string v10, "e"

    .line 548
    .line 549
    :goto_c
    const-class v12, Ljava/util/List;

    .line 550
    .line 551
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v12

    .line 555
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 556
    .line 557
    invoke-interface {v13, v7, v10, v12}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 558
    .line 559
    .line 560
    move-result-object v7

    .line 561
    if-nez v7, :cond_18

    .line 562
    .line 563
    goto :goto_d

    .line 564
    :cond_18
    const-string v10, "hide-contact-address-live-list-"

    .line 565
    .line 566
    invoke-static {v10, v7}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v10

    .line 570
    sget-object v12, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 571
    .line 572
    invoke-virtual {v12, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v12

    .line 576
    if-eqz v12, :cond_19

    .line 577
    .line 578
    goto :goto_d

    .line 579
    :cond_19
    new-instance v12, Lr0/V;

    .line 580
    .line 581
    invoke-direct {v12, v1, v4}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 582
    .line 583
    .line 584
    invoke-static {v7, v12}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 585
    .line 586
    .line 587
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 588
    .line 589
    invoke-virtual {v4, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    :goto_d
    iget-object v4, v1, Lr0/d0;->z:LA0/i;

    .line 593
    .line 594
    if-eqz v4, :cond_1a

    .line 595
    .line 596
    iget-object v12, v4, LA0/i;->f:Ljava/util/List;

    .line 597
    .line 598
    goto :goto_e

    .line 599
    :cond_1a
    const/4 v12, 0x0

    .line 600
    :goto_e
    if-nez v12, :cond_1b

    .line 601
    .line 602
    sget-object v12, LF0/s;->a:LF0/s;

    .line 603
    .line 604
    :cond_1b
    const-string v4, "ui3.t0"

    .line 605
    .line 606
    const-string v7, "xm3.t0"

    .line 607
    .line 608
    const-string v10, "gl3.t0"

    .line 609
    .line 610
    const-string v13, "ik3.t0"

    .line 611
    .line 612
    filled-new-array {v10, v13, v4, v7}, [Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v4

    .line 616
    invoke-static {v4}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    invoke-static {v12, v4}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    invoke-static {v4}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 625
    .line 626
    .line 627
    move-result-object v4

    .line 628
    invoke-static {v4}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object v4

    .line 632
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 633
    .line 634
    .line 635
    move-result-object v4

    .line 636
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 637
    .line 638
    .line 639
    move-result v7

    .line 640
    if-eqz v7, :cond_1d

    .line 641
    .line 642
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v7

    .line 646
    check-cast v7, Ljava/lang/String;

    .line 647
    .line 648
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 649
    .line 650
    .line 651
    move-result-object v10

    .line 652
    invoke-static {v10, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    invoke-static {v7, v11}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    sget-object v12, Lc0/f;->b:Ld0/b;

    .line 659
    .line 660
    invoke-interface {v12, v10, v7}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    move-result-object v7

    .line 664
    if-nez v7, :cond_1c

    .line 665
    .line 666
    goto :goto_f

    .line 667
    :cond_1c
    invoke-virtual {v1, v7, v6}, Lr0/d0;->m0(Ljava/lang/Class;Z)V

    .line 668
    .line 669
    .line 670
    goto :goto_f

    .line 671
    :cond_1d
    array-length v4, v0

    .line 672
    move v7, v5

    .line 673
    :goto_10
    if-ge v7, v4, :cond_1f

    .line 674
    .line 675
    aget-object v10, v0, v7

    .line 676
    .line 677
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 678
    .line 679
    .line 680
    move-result-object v12

    .line 681
    invoke-static {v12, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    invoke-static {v10, v11}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 688
    .line 689
    invoke-interface {v13, v12, v10}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    move-result-object v10

    .line 693
    if-nez v10, :cond_1e

    .line 694
    .line 695
    goto :goto_11

    .line 696
    :cond_1e
    invoke-virtual {v1, v10}, Lr0/d0;->g0(Ljava/lang/Class;)V

    .line 697
    .line 698
    .line 699
    :goto_11
    add-int/2addr v7, v6

    .line 700
    goto :goto_10

    .line 701
    :cond_1f
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-static {v0, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 709
    .line 710
    const-string v7, "com.tencent.mm.ui.contact.AddressUI$AddressUIFragment"

    .line 711
    .line 712
    invoke-interface {v4, v0, v7}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    const-string v4, "q0"

    .line 717
    .line 718
    const-class v10, Landroid/view/View;

    .line 719
    .line 720
    const-string v12, "onViewCreated"

    .line 721
    .line 722
    const-class v13, Landroid/os/Bundle;

    .line 723
    .line 724
    if-nez v0, :cond_20

    .line 725
    .line 726
    const-string v0, "hide contact address fragment class not found"

    .line 727
    .line 728
    filled-new-array {v0, v7}, [Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    goto :goto_12

    .line 736
    :cond_20
    const-string v7, "onActivityCreated"

    .line 737
    .line 738
    filled-new-array {v13}, [Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    move-result-object v14

    .line 742
    invoke-virtual {v1, v0, v7, v14}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 743
    .line 744
    .line 745
    new-array v7, v5, [Ljava/lang/Class;

    .line 746
    .line 747
    invoke-virtual {v1, v0, v8, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 748
    .line 749
    .line 750
    filled-new-array {v10, v13}, [Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    move-result-object v7

    .line 754
    invoke-virtual {v1, v0, v12, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 755
    .line 756
    .line 757
    new-array v7, v5, [Ljava/lang/Class;

    .line 758
    .line 759
    invoke-virtual {v1, v0, v4, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 760
    .line 761
    .line 762
    const-string v7, "p0"

    .line 763
    .line 764
    filled-new-array {v13}, [Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    move-result-object v14

    .line 768
    invoke-virtual {v1, v0, v7, v14}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 769
    .line 770
    .line 771
    const-string v7, "s0"

    .line 772
    .line 773
    new-array v14, v5, [Ljava/lang/Class;

    .line 774
    .line 775
    invoke-virtual {v1, v0, v7, v14}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v1, v0}, Lr0/d0;->j0(Ljava/lang/Class;)V

    .line 779
    .line 780
    .line 781
    :goto_12
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    invoke-static {v0, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 789
    .line 790
    const-string v14, "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment"

    .line 791
    .line 792
    invoke-interface {v7, v0, v14}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    if-nez v0, :cond_21

    .line 797
    .line 798
    const-string v0, "hide contact mvvm address fragment class not found"

    .line 799
    .line 800
    filled-new-array {v0, v14}, [Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 805
    .line 806
    .line 807
    goto :goto_13

    .line 808
    :cond_21
    filled-new-array {v13}, [Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    move-result-object v7

    .line 812
    invoke-virtual {v1, v0, v4, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 813
    .line 814
    .line 815
    const-string v4, "l0"

    .line 816
    .line 817
    filled-new-array {v13}, [Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    move-result-object v7

    .line 821
    invoke-virtual {v1, v0, v4, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 822
    .line 823
    .line 824
    const-string v4, "t0"

    .line 825
    .line 826
    new-array v7, v5, [Ljava/lang/Class;

    .line 827
    .line 828
    invoke-virtual {v1, v0, v4, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 829
    .line 830
    .line 831
    const-string v4, "w0"

    .line 832
    .line 833
    new-array v7, v5, [Ljava/lang/Class;

    .line 834
    .line 835
    invoke-virtual {v1, v0, v4, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 836
    .line 837
    .line 838
    const-string v4, "e0"

    .line 839
    .line 840
    new-array v7, v5, [Ljava/lang/Class;

    .line 841
    .line 842
    invoke-virtual {v1, v0, v4, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 843
    .line 844
    .line 845
    const-string v4, "r0"

    .line 846
    .line 847
    new-array v7, v5, [Ljava/lang/Class;

    .line 848
    .line 849
    invoke-virtual {v1, v0, v4, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 850
    .line 851
    .line 852
    const-string v4, "u0"

    .line 853
    .line 854
    new-array v7, v5, [Ljava/lang/Class;

    .line 855
    .line 856
    invoke-virtual {v1, v0, v4, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 857
    .line 858
    .line 859
    filled-new-array {v10, v13}, [Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    move-result-object v4

    .line 863
    invoke-virtual {v1, v0, v12, v4}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v1, v0}, Lr0/d0;->j0(Ljava/lang/Class;)V

    .line 867
    .line 868
    .line 869
    :goto_13
    const-string v0, "androidx.fragment.app.l"

    .line 870
    .line 871
    const-string v4, "com.tencent.mm.ui.MMFragment"

    .line 872
    .line 873
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    :cond_22
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 886
    .line 887
    .line 888
    move-result v4

    .line 889
    if-eqz v4, :cond_26

    .line 890
    .line 891
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v4

    .line 895
    check-cast v4, Ljava/lang/String;

    .line 896
    .line 897
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 898
    .line 899
    .line 900
    move-result-object v7

    .line 901
    invoke-static {v7, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    invoke-static {v4, v11}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    sget-object v10, Lc0/f;->b:Ld0/b;

    .line 908
    .line 909
    invoke-interface {v10, v7, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    move-result-object v4

    .line 913
    if-nez v4, :cond_23

    .line 914
    .line 915
    goto :goto_14

    .line 916
    :cond_23
    const-string v7, "onStart"

    .line 917
    .line 918
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v7

    .line 922
    invoke-static {v7}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 923
    .line 924
    .line 925
    move-result-object v7

    .line 926
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 927
    .line 928
    .line 929
    move-result-object v7

    .line 930
    :goto_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 931
    .line 932
    .line 933
    move-result v10

    .line 934
    if-eqz v10, :cond_22

    .line 935
    .line 936
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v10

    .line 940
    check-cast v10, Ljava/lang/String;

    .line 941
    .line 942
    new-array v12, v5, [Ljava/lang/Object;

    .line 943
    .line 944
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 945
    .line 946
    invoke-interface {v13, v4, v10, v12}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 947
    .line 948
    .line 949
    move-result-object v10

    .line 950
    if-nez v10, :cond_24

    .line 951
    .line 952
    goto :goto_15

    .line 953
    :cond_24
    const-string v12, "hide-contact-fragment-lifecycle-"

    .line 954
    .line 955
    invoke-static {v12, v10}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v12

    .line 959
    sget-object v13, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 960
    .line 961
    invoke-virtual {v13, v12}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 962
    .line 963
    .line 964
    move-result v13

    .line 965
    if-eqz v13, :cond_25

    .line 966
    .line 967
    goto :goto_15

    .line 968
    :cond_25
    new-instance v13, Lr0/V;

    .line 969
    .line 970
    invoke-direct {v13, v1, v3}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 971
    .line 972
    .line 973
    invoke-static {v10, v13}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 974
    .line 975
    .line 976
    sget-object v10, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 977
    .line 978
    invoke-virtual {v10, v12}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 979
    .line 980
    .line 981
    goto :goto_15

    .line 982
    :cond_26
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 983
    .line 984
    const-string v4, "hide-contact-database-queries"

    .line 985
    .line 986
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    move-result v0

    .line 990
    if-eqz v0, :cond_27

    .line 991
    .line 992
    goto :goto_17

    .line 993
    :cond_27
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    const-string v7, "classLoader"

    .line 1002
    .line 1003
    invoke-static {v0, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1004
    .line 1005
    .line 1006
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 1007
    .line 1008
    const-string v8, "com.tencent.wcdb.database.SQLiteDatabase"

    .line 1009
    .line 1010
    invoke-interface {v7, v0, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    new-instance v7, Lq0/d;

    .line 1015
    .line 1016
    invoke-direct {v7, v3}, Lq0/d;-><init>(I)V

    .line 1017
    .line 1018
    .line 1019
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 1020
    .line 1021
    invoke-interface {v3, v0, v7}, Ld0/b;->d(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Method;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    const-string v3, "findMethodsByExactPredicate(...)"

    .line 1026
    .line 1027
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1028
    .line 1029
    .line 1030
    array-length v3, v0

    .line 1031
    :goto_16
    if-ge v5, v3, :cond_28

    .line 1032
    .line 1033
    aget-object v7, v0, v5

    .line 1034
    .line 1035
    new-instance v8, Lr0/V;

    .line 1036
    .line 1037
    const/4 v9, 0x7

    .line 1038
    invoke-direct {v8, v1, v9}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1039
    .line 1040
    .line 1041
    invoke-static {v7, v8}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1042
    .line 1043
    .line 1044
    add-int/2addr v5, v6

    .line 1045
    goto :goto_16

    .line 1046
    :cond_28
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1047
    .line 1048
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1049
    .line 1050
    .line 1051
    :goto_17
    invoke-virtual/range {p0 .. p1}, Lr0/d0;->l0(Landroid/content/Context;)V

    .line 1052
    .line 1053
    .line 1054
    return-void
.end method

.method public final i0(Ljava/lang/Class;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 8
    .line 9
    invoke-interface {v1, p1, p2, v0}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p2, "hide-contact-address-visible-"

    .line 17
    .line 18
    invoke-static {p2, p1}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :cond_1
    new-instance v0, Lr0/W;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p3, p0, v1}, Lr0/W;-><init>(ZLr0/d0;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v0}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final j0(Ljava/lang/Class;)V
    .locals 2

    .line 1
    const-string v0, "setUserVisibleHint"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, p1, v0, v1}, Lr0/d0;->i0(Ljava/lang/Class;Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    const-string v0, "setMenuVisibility"

    .line 8
    .line 9
    invoke-virtual {p0, p1, v0, v1}, Lr0/d0;->i0(Ljava/lang/Class;Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    const-string v0, "onHiddenChanged"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, p1, v0, v1}, Lr0/d0;->i0(Ljava/lang/Class;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->F()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lr0/d0;->O:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lr0/d0;->L:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lr0/d0;->M:Ljava/lang/String;

    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    iput-wide v1, p0, Lr0/d0;->N:J

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-boolean v1, p0, Lr0/d0;->O:Z

    .line 24
    .line 25
    iput-object v0, p0, Lr0/d0;->P:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    iget-object v1, p0, Lr0/d0;->I:Ljava/util/WeakHashMap;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->clear()V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    iget-object p1, p0, Lr0/d0;->Q:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {p1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    iget-wide p1, p0, Lr0/d0;->R:J

    .line 97
    .line 98
    sub-long/2addr v10, p1

    .line 99
    const-wide/16 p1, 0x7d0

    .line 100
    .line 101
    cmp-long p1, v10, p1

    .line 102
    .line 103
    if-gez p1, :cond_4

    .line 104
    .line 105
    :goto_0
    return-void

    .line 106
    :cond_4
    const-string p1, "\u5df2\u5728\u9690\u85cf\u540d\u5355\u4e2d"

    .line 107
    .line 108
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_5
    :goto_1
    const-string p1, ""

    .line 113
    .line 114
    if-nez p2, :cond_6

    .line 115
    .line 116
    move-object p2, p1

    .line 117
    :cond_6
    invoke-static {p2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-nez v1, :cond_7

    .line 130
    .line 131
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_7

    .line 136
    .line 137
    move-object v0, p2

    .line 138
    :cond_7
    if-nez v0, :cond_8

    .line 139
    .line 140
    move-object v3, p1

    .line 141
    goto :goto_2

    .line 142
    :cond_8
    move-object v3, v0

    .line 143
    :goto_2
    sget-boolean p1, Lz0/i;->a:Z

    .line 144
    .line 145
    new-instance v1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 146
    .line 147
    const/4 v6, 0x0

    .line 148
    const/4 v7, 0x0

    .line 149
    const/4 v4, 0x0

    .line 150
    const/4 v5, 0x0

    .line 151
    const/16 v8, 0x3c

    .line 152
    .line 153
    const/4 v9, 0x0

    .line 154
    invoke-direct/range {v1 .. v9}, Lcom/lu/wxmask/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILT/o;Ljava/lang/String;Ljava/lang/String;ILN0/e;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v1}, Lz0/g;->b(Lcom/lu/wxmask/bean/MaskItemBean;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v2}, Lz0/g;->K(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const-class p1, Lq0/h;

    .line 164
    .line 165
    invoke-static {p1}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Lq0/h;

    .line 170
    .line 171
    invoke-virtual {p1}, Lq0/h;->c()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Lr0/d0;->Q0()V

    .line 175
    .line 176
    .line 177
    iput-object v2, p0, Lr0/d0;->Q:Ljava/lang/String;

    .line 178
    .line 179
    iput-wide v10, p0, Lr0/d0;->R:J

    .line 180
    .line 181
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-eqz p1, :cond_9

    .line 186
    .line 187
    const-string p1, "\u5df2\u52a0\u5165\u9690\u85cf\u540d\u5355"

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_9
    const-string p1, "\u5df2\u52a0\u5165\u9690\u85cf\u540d\u5355\uff1a"

    .line 191
    .line 192
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    :goto_3
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    const-string p1, "quick add contact mask"

    .line 200
    .line 201
    filled-new-array {p1, v2, v3}, [Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    return-void
.end method

.method public final k0(Ljava/lang/Class;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-class v0, Landroid/view/MenuItem;

    .line 19
    .line 20
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 27
    .line 28
    const-string v2, "onMMMenuItemSelected"

    .line 29
    .line 30
    invoke-interface {v1, p1, v2, v0}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-string v0, "contact-quick-add-menu-item-selected-callback-"

    .line 49
    .line 50
    invoke-static {v0, p1}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    new-instance v1, Lr0/V;

    .line 64
    .line 65
    const/16 v2, 0x8

    .line 66
    .line 67
    invoke-direct {v1, p0, v2}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v1}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 71
    .line 72
    .line 73
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_4
    :goto_0
    return-void
.end method

.method public final l0(Landroid/content/Context;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Lr0/d0;->L()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    new-instance v6, Lq0/d;

    .line 8
    .line 9
    const/16 v0, 0x19

    .line 10
    .line 11
    invoke-direct {v6, v0}, Lq0/d;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const-string v3, ";"

    .line 17
    .line 18
    const/16 v7, 0x1e

    .line 19
    .line 20
    invoke-static/range {v2 .. v7}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "popup="

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v2, "quickadd contact install start"

    .line 31
    .line 32
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lr0/d0;->L()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const-string v3, "clazz"

    .line 52
    .line 53
    const-string v4, "getClassLoader(...)"

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lr0/S;

    .line 62
    .line 63
    iget-object v5, v2, Lr0/S;->a:Ljava/lang/String;

    .line 64
    .line 65
    const-string v6, "contact-quick-add-popup-menu-create-"

    .line 66
    .line 67
    const-string v7, "-"

    .line 68
    .line 69
    invoke-static {v6, v5, v7}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    iget-object v8, v2, Lr0/S;->b:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v2, v2, Lr0/S;->c:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 91
    .line 92
    invoke-virtual {v7, v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_0

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-static {v7, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v8, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    sget-object v9, Lc0/f;->b:Ld0/b;

    .line 110
    .line 111
    invoke-interface {v9, v7, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v14

    .line 115
    if-nez v14, :cond_1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-static {v7, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v5, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 129
    .line 130
    invoke-interface {v3, v7, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    if-nez v3, :cond_2

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_2
    const-class v10, Landroid/view/View;

    .line 138
    .line 139
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 140
    .line 141
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 142
    .line 143
    const-class v13, Landroid/view/View$OnCreateContextMenuListener;

    .line 144
    .line 145
    move-object v15, v11

    .line 146
    move-object/from16 v16, v11

    .line 147
    .line 148
    filled-new-array/range {v10 .. v16}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 153
    .line 154
    invoke-interface {v5, v3, v2, v4}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-nez v2, :cond_3

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_3
    new-instance v3, Lr0/V;

    .line 162
    .line 163
    const/16 v4, 0xd

    .line 164
    .line 165
    invoke-direct {v3, v1, v4}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 166
    .line 167
    .line 168
    invoke-static {v2, v3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 169
    .line 170
    .line 171
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 172
    .line 173
    invoke-virtual {v2, v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_4
    iget-object v0, v1, Lr0/d0;->A:LA0/N;

    .line 179
    .line 180
    if-eqz v0, :cond_5

    .line 181
    .line 182
    iget-object v0, v0, LA0/N;->f:Ljava/util/List;

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_5
    const/4 v0, 0x0

    .line 186
    :goto_1
    sget-object v5, Lr0/d0;->V:[Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {v0, v5}, Lr0/d0;->K0(Ljava/util/List;[Ljava/lang/String;)[Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    array-length v5, v0

    .line 193
    const/4 v6, 0x0

    .line 194
    move v7, v6

    .line 195
    :goto_2
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 196
    .line 197
    const-class v9, Landroid/widget/AdapterView;

    .line 198
    .line 199
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 200
    .line 201
    const-class v11, Landroid/view/View;

    .line 202
    .line 203
    if-ge v7, v5, :cond_9

    .line 204
    .line 205
    aget-object v12, v0, v7

    .line 206
    .line 207
    const-string v13, "contact-quick-add-popup-item-click-"

    .line 208
    .line 209
    invoke-static {v13, v12}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v13

    .line 213
    sget-object v14, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 214
    .line 215
    invoke-virtual {v14, v13}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v14

    .line 219
    if-eqz v14, :cond_6

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_6
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 223
    .line 224
    .line 225
    move-result-object v14

    .line 226
    invoke-static {v14, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v12, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    sget-object v15, Lc0/f;->b:Ld0/b;

    .line 233
    .line 234
    invoke-interface {v15, v14, v12}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    move-result-object v12

    .line 238
    if-nez v12, :cond_7

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_7
    const-string v14, "onItemClick"

    .line 242
    .line 243
    filled-new-array {v9, v11, v10, v8}, [Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    sget-object v9, Lc0/f;->b:Ld0/b;

    .line 248
    .line 249
    invoke-interface {v9, v12, v14, v8}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    if-nez v8, :cond_8

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_8
    new-instance v9, Lr0/V;

    .line 257
    .line 258
    const/16 v10, 0xc

    .line 259
    .line 260
    invoke-direct {v9, v1, v10}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 261
    .line 262
    .line 263
    invoke-static {v8, v9}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 264
    .line 265
    .line 266
    sget-object v8, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 267
    .line 268
    invoke-virtual {v8, v13}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 269
    .line 270
    .line 271
    :catchall_1
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 272
    .line 273
    goto :goto_2

    .line 274
    :cond_9
    iget-object v0, v1, Lr0/d0;->A:LA0/N;

    .line 275
    .line 276
    if-eqz v0, :cond_a

    .line 277
    .line 278
    iget-object v0, v0, LA0/N;->h:Ljava/util/List;

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_a
    const/4 v0, 0x0

    .line 282
    :goto_4
    const-string v5, "db5.t4"

    .line 283
    .line 284
    filled-new-array {v5}, [Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-static {v0, v5}, Lr0/d0;->K0(Ljava/util/List;[Ljava/lang/String;)[Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    array-length v5, v0

    .line 293
    move v7, v6

    .line 294
    :goto_5
    if-ge v7, v5, :cond_c

    .line 295
    .line 296
    aget-object v12, v0, v7

    .line 297
    .line 298
    :try_start_2
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 299
    .line 300
    .line 301
    move-result-object v13

    .line 302
    invoke-static {v13, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-static {v12, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    sget-object v14, Lc0/f;->b:Ld0/b;

    .line 309
    .line 310
    invoke-interface {v14, v13, v12}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    if-nez v12, :cond_b

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_b
    invoke-virtual {v1, v12}, Lr0/d0;->k0(Ljava/lang/Class;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 318
    .line 319
    .line 320
    :catchall_2
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_c
    iget-object v0, v1, Lr0/d0;->A:LA0/N;

    .line 324
    .line 325
    if-eqz v0, :cond_d

    .line 326
    .line 327
    iget-object v0, v0, LA0/N;->g:Ljava/util/List;

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_d
    const/4 v0, 0x0

    .line 331
    :goto_7
    sget-object v5, Lr0/d0;->W:[Ljava/lang/String;

    .line 332
    .line 333
    invoke-static {v0, v5}, Lr0/d0;->K0(Ljava/util/List;[Ljava/lang/String;)[Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    array-length v5, v0

    .line 338
    move v7, v6

    .line 339
    :goto_8
    const-class v12, Landroid/view/ViewGroup;

    .line 340
    .line 341
    if-ge v7, v5, :cond_11

    .line 342
    .line 343
    aget-object v13, v0, v7

    .line 344
    .line 345
    const-string v14, "contact-quick-add-popup-adapter-get-view-"

    .line 346
    .line 347
    invoke-static {v14, v13}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v14

    .line 351
    sget-object v15, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 352
    .line 353
    invoke-virtual {v15, v14}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v15

    .line 357
    if-eqz v15, :cond_e

    .line 358
    .line 359
    goto :goto_9

    .line 360
    :cond_e
    :try_start_3
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 361
    .line 362
    .line 363
    move-result-object v15

    .line 364
    invoke-static {v15, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v13, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 371
    .line 372
    invoke-interface {v2, v15, v13}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    if-nez v2, :cond_f

    .line 377
    .line 378
    goto :goto_9

    .line 379
    :cond_f
    const-string v13, "getView"

    .line 380
    .line 381
    filled-new-array {v10, v11, v12}, [Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v12

    .line 385
    sget-object v15, Lc0/f;->b:Ld0/b;

    .line 386
    .line 387
    invoke-interface {v15, v2, v13, v12}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    if-nez v2, :cond_10

    .line 392
    .line 393
    goto :goto_9

    .line 394
    :cond_10
    new-instance v12, Lr0/V;

    .line 395
    .line 396
    const/16 v13, 0xa

    .line 397
    .line 398
    invoke-direct {v12, v1, v13}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 399
    .line 400
    .line 401
    invoke-static {v2, v12}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 402
    .line 403
    .line 404
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 405
    .line 406
    invoke-virtual {v2, v14}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 407
    .line 408
    .line 409
    :catchall_3
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_11
    invoke-virtual {v1}, Lr0/d0;->J()[Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    array-length v2, v0

    .line 417
    move v5, v6

    .line 418
    :goto_a
    if-ge v5, v2, :cond_15

    .line 419
    .line 420
    aget-object v7, v0, v5

    .line 421
    .line 422
    const-string v13, "contact-quick-add-popup-dismiss-"

    .line 423
    .line 424
    invoke-static {v13, v7}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v13

    .line 428
    sget-object v14, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 429
    .line 430
    invoke-virtual {v14, v13}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v14

    .line 434
    if-eqz v14, :cond_12

    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_12
    :try_start_4
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 438
    .line 439
    .line 440
    move-result-object v14

    .line 441
    invoke-static {v14, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-static {v7, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    sget-object v15, Lc0/f;->b:Ld0/b;

    .line 448
    .line 449
    invoke-interface {v15, v14, v7}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    move-result-object v7

    .line 453
    if-nez v7, :cond_13

    .line 454
    .line 455
    goto :goto_b

    .line 456
    :cond_13
    const-string v14, "a"

    .line 457
    .line 458
    new-array v15, v6, [Ljava/lang/Object;

    .line 459
    .line 460
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 461
    .line 462
    invoke-interface {v6, v7, v14, v15}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    if-nez v6, :cond_14

    .line 467
    .line 468
    goto :goto_b

    .line 469
    :cond_14
    new-instance v7, Lr0/V;

    .line 470
    .line 471
    const/16 v14, 0xb

    .line 472
    .line 473
    invoke-direct {v7, v1, v14}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 474
    .line 475
    .line 476
    invoke-static {v6, v7}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 477
    .line 478
    .line 479
    sget-object v6, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 480
    .line 481
    invoke-virtual {v6, v13}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 482
    .line 483
    .line 484
    :catchall_4
    :goto_b
    add-int/lit8 v5, v5, 0x1

    .line 485
    .line 486
    const/4 v6, 0x0

    .line 487
    goto :goto_a

    .line 488
    :cond_15
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 489
    .line 490
    const-string v2, "contact-quick-add-native-context-menu"

    .line 491
    .line 492
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_16

    .line 497
    .line 498
    goto :goto_f

    .line 499
    :cond_16
    :try_start_5
    const-string v0, "setOnCreateContextMenuListener"

    .line 500
    .line 501
    const-class v3, Landroid/view/View$OnCreateContextMenuListener;

    .line 502
    .line 503
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 508
    .line 509
    invoke-interface {v5, v11, v0, v3}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    if-eqz v0, :cond_17

    .line 514
    .line 515
    new-instance v3, Lr0/V;

    .line 516
    .line 517
    const/16 v5, 0x9

    .line 518
    .line 519
    invoke-direct {v3, v1, v5}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 520
    .line 521
    .line 522
    invoke-static {v0, v3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 523
    .line 524
    .line 525
    goto :goto_c

    .line 526
    :catchall_5
    move-exception v0

    .line 527
    goto :goto_d

    .line 528
    :cond_17
    :goto_c
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 529
    .line 530
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 535
    .line 536
    .line 537
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 538
    goto :goto_e

    .line 539
    :goto_d
    new-instance v2, LE0/d;

    .line 540
    .line 541
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 542
    .line 543
    .line 544
    move-object v0, v2

    .line 545
    :goto_e
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    if-eqz v0, :cond_18

    .line 550
    .line 551
    const-string v2, "contact quick add native context hook missing"

    .line 552
    .line 553
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    :cond_18
    :goto_f
    invoke-virtual {v1}, Lr0/d0;->x0()Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-nez v0, :cond_19

    .line 565
    .line 566
    goto/16 :goto_1b

    .line 567
    .line 568
    :cond_19
    iget-object v0, v1, Lr0/d0;->A:LA0/N;

    .line 569
    .line 570
    if-eqz v0, :cond_1a

    .line 571
    .line 572
    iget-object v0, v0, LA0/N;->i:Ljava/util/List;

    .line 573
    .line 574
    goto :goto_10

    .line 575
    :cond_1a
    const/4 v0, 0x0

    .line 576
    :goto_10
    sget-object v2, LF0/s;->a:LF0/s;

    .line 577
    .line 578
    if-nez v0, :cond_1b

    .line 579
    .line 580
    move-object v0, v2

    .line 581
    :cond_1b
    new-instance v3, Ljava/util/ArrayList;

    .line 582
    .line 583
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 584
    .line 585
    .line 586
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    :cond_1c
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    if-eqz v5, :cond_1d

    .line 595
    .line 596
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v5

    .line 600
    move-object v6, v5

    .line 601
    check-cast v6, Ljava/lang/String;

    .line 602
    .line 603
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 604
    .line 605
    .line 606
    move-result v6

    .line 607
    if-nez v6, :cond_1c

    .line 608
    .line 609
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    goto :goto_11

    .line 613
    :cond_1d
    new-instance v0, Ljava/util/ArrayList;

    .line 614
    .line 615
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 619
    .line 620
    .line 621
    move-result-object v3

    .line 622
    :cond_1e
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 623
    .line 624
    .line 625
    move-result v5

    .line 626
    if-eqz v5, :cond_1f

    .line 627
    .line 628
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    move-object v6, v5

    .line 633
    check-cast v6, Ljava/lang/String;

    .line 634
    .line 635
    invoke-static {v6}, Lr0/d0;->w0(Ljava/lang/String;)Z

    .line 636
    .line 637
    .line 638
    move-result v6

    .line 639
    if-nez v6, :cond_1e

    .line 640
    .line 641
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    goto :goto_12

    .line 645
    :cond_1f
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 654
    .line 655
    .line 656
    move-result-object v3

    .line 657
    :cond_20
    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    if-eqz v0, :cond_25

    .line 662
    .line 663
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    check-cast v0, Ljava/lang/String;

    .line 668
    .line 669
    invoke-static {v0}, Lr0/d0;->w0(Ljava/lang/String;)Z

    .line 670
    .line 671
    .line 672
    move-result v5

    .line 673
    if-eqz v5, :cond_21

    .line 674
    .line 675
    goto :goto_13

    .line 676
    :cond_21
    const-string v5, "contact-quick-add-dynamic-address-menu-create-"

    .line 677
    .line 678
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    sget-object v6, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 683
    .line 684
    invoke-virtual {v6, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v6

    .line 688
    if-eqz v6, :cond_22

    .line 689
    .line 690
    goto :goto_13

    .line 691
    :cond_22
    :try_start_6
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    invoke-static {v6, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 699
    .line 700
    invoke-interface {v7, v6, v0}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    move-result-object v6

    .line 704
    if-nez v6, :cond_23

    .line 705
    .line 706
    goto :goto_13

    .line 707
    :cond_23
    const-string v7, "onCreateContextMenu"

    .line 708
    .line 709
    const-class v13, Landroid/view/ContextMenu;

    .line 710
    .line 711
    const-class v14, Landroid/view/ContextMenu$ContextMenuInfo;

    .line 712
    .line 713
    filled-new-array {v13, v11, v14}, [Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v13

    .line 717
    sget-object v14, Lc0/f;->b:Ld0/b;

    .line 718
    .line 719
    invoke-interface {v14, v6, v7, v13}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 720
    .line 721
    .line 722
    move-result-object v6

    .line 723
    if-nez v6, :cond_24

    .line 724
    .line 725
    goto :goto_13

    .line 726
    :cond_24
    new-instance v7, Lr0/c0;

    .line 727
    .line 728
    const/4 v13, 0x1

    .line 729
    invoke-direct {v7, v1, v0, v13}, Lr0/c0;-><init>(Lr0/d0;Ljava/lang/String;I)V

    .line 730
    .line 731
    .line 732
    invoke-static {v6, v7}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 733
    .line 734
    .line 735
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 736
    .line 737
    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 742
    .line 743
    .line 744
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 745
    goto :goto_14

    .line 746
    :catchall_6
    move-exception v0

    .line 747
    new-instance v5, LE0/d;

    .line 748
    .line 749
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 750
    .line 751
    .line 752
    move-object v0, v5

    .line 753
    :goto_14
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    if-eqz v0, :cond_20

    .line 758
    .line 759
    const-string v5, "contact quick add dynamic address menu create hook fail"

    .line 760
    .line 761
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    goto :goto_13

    .line 769
    :cond_25
    iget-object v0, v1, Lr0/d0;->A:LA0/N;

    .line 770
    .line 771
    if-eqz v0, :cond_26

    .line 772
    .line 773
    iget-object v0, v0, LA0/N;->j:Ljava/util/List;

    .line 774
    .line 775
    goto :goto_15

    .line 776
    :cond_26
    const/4 v0, 0x0

    .line 777
    :goto_15
    if-nez v0, :cond_27

    .line 778
    .line 779
    goto :goto_16

    .line 780
    :cond_27
    move-object v2, v0

    .line 781
    :goto_16
    new-instance v0, Ljava/util/ArrayList;

    .line 782
    .line 783
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 784
    .line 785
    .line 786
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 787
    .line 788
    .line 789
    move-result-object v2

    .line 790
    :cond_28
    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 791
    .line 792
    .line 793
    move-result v3

    .line 794
    if-eqz v3, :cond_29

    .line 795
    .line 796
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    move-object v5, v3

    .line 801
    check-cast v5, Ljava/lang/String;

    .line 802
    .line 803
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 804
    .line 805
    .line 806
    move-result v5

    .line 807
    if-nez v5, :cond_28

    .line 808
    .line 809
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    goto :goto_17

    .line 813
    :cond_29
    new-instance v2, Ljava/util/ArrayList;

    .line 814
    .line 815
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    :cond_2a
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 823
    .line 824
    .line 825
    move-result v3

    .line 826
    if-eqz v3, :cond_2b

    .line 827
    .line 828
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    move-object v5, v3

    .line 833
    check-cast v5, Ljava/lang/String;

    .line 834
    .line 835
    invoke-static {v5}, Lr0/d0;->w0(Ljava/lang/String;)Z

    .line 836
    .line 837
    .line 838
    move-result v5

    .line 839
    if-nez v5, :cond_2a

    .line 840
    .line 841
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    goto :goto_18

    .line 845
    :cond_2b
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    :cond_2c
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 858
    .line 859
    .line 860
    move-result v0

    .line 861
    if-eqz v0, :cond_31

    .line 862
    .line 863
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    check-cast v0, Ljava/lang/String;

    .line 868
    .line 869
    invoke-static {v0}, Lr0/d0;->w0(Ljava/lang/String;)Z

    .line 870
    .line 871
    .line 872
    move-result v3

    .line 873
    if-eqz v3, :cond_2d

    .line 874
    .line 875
    goto :goto_19

    .line 876
    :cond_2d
    const-string v3, "contact-quick-add-dynamic-address-menu-click-"

    .line 877
    .line 878
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v3

    .line 882
    sget-object v5, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 883
    .line 884
    invoke-virtual {v5, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    move-result v5

    .line 888
    if-eqz v5, :cond_2e

    .line 889
    .line 890
    goto :goto_19

    .line 891
    :cond_2e
    :try_start_7
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 892
    .line 893
    .line 894
    move-result-object v5

    .line 895
    invoke-static {v5, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 899
    .line 900
    invoke-interface {v6, v5, v0}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    move-result-object v5

    .line 904
    if-nez v5, :cond_2f

    .line 905
    .line 906
    goto :goto_19

    .line 907
    :cond_2f
    const-string v6, "onMMMenuItemSelected"

    .line 908
    .line 909
    const-class v7, Landroid/view/MenuItem;

    .line 910
    .line 911
    filled-new-array {v7, v10}, [Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v7

    .line 915
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 916
    .line 917
    invoke-interface {v13, v5, v6, v7}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 918
    .line 919
    .line 920
    move-result-object v5

    .line 921
    if-nez v5, :cond_30

    .line 922
    .line 923
    goto :goto_19

    .line 924
    :cond_30
    new-instance v6, Lr0/c0;

    .line 925
    .line 926
    const/4 v7, 0x0

    .line 927
    invoke-direct {v6, v1, v0, v7}, Lr0/c0;-><init>(Lr0/d0;Ljava/lang/String;I)V

    .line 928
    .line 929
    .line 930
    invoke-static {v5, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 931
    .line 932
    .line 933
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 934
    .line 935
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result v0

    .line 939
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 940
    .line 941
    .line 942
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 943
    goto :goto_1a

    .line 944
    :catchall_7
    move-exception v0

    .line 945
    new-instance v3, LE0/d;

    .line 946
    .line 947
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 948
    .line 949
    .line 950
    move-object v0, v3

    .line 951
    :goto_1a
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    if-eqz v0, :cond_2c

    .line 956
    .line 957
    const-string v3, "contact quick add dynamic address menu click hook fail"

    .line 958
    .line 959
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 964
    .line 965
    .line 966
    goto :goto_19

    .line 967
    :cond_31
    :goto_1b
    invoke-virtual {v1}, Lr0/d0;->x0()Z

    .line 968
    .line 969
    .line 970
    move-result v0

    .line 971
    if-nez v0, :cond_47

    .line 972
    .line 973
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 974
    .line 975
    const-string v2, "contact-quick-add-perform-click"

    .line 976
    .line 977
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 978
    .line 979
    .line 980
    move-result v0

    .line 981
    const-class v3, Landroid/widget/TextView;

    .line 982
    .line 983
    if-eqz v0, :cond_32

    .line 984
    .line 985
    goto :goto_21

    .line 986
    :cond_32
    :try_start_8
    filled-new-array {v11, v3}, [Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    const/4 v4, 0x0

    .line 991
    :goto_1c
    const/4 v5, 0x2

    .line 992
    if-ge v4, v5, :cond_34

    .line 993
    .line 994
    aget-object v5, v0, v4

    .line 995
    .line 996
    const-string v6, "performClick"

    .line 997
    .line 998
    const/4 v7, 0x0

    .line 999
    new-array v13, v7, [Ljava/lang/Object;

    .line 1000
    .line 1001
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 1002
    .line 1003
    invoke-interface {v7, v5, v6, v13}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v6

    .line 1007
    if-eqz v6, :cond_33

    .line 1008
    .line 1009
    new-instance v7, Lr0/a0;

    .line 1010
    .line 1011
    const/4 v13, 0x0

    .line 1012
    invoke-direct {v7, v1, v5, v13}, Lr0/a0;-><init>(Lr0/d0;Ljava/lang/Class;I)V

    .line 1013
    .line 1014
    .line 1015
    invoke-static {v6, v7}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1016
    .line 1017
    .line 1018
    goto :goto_1d

    .line 1019
    :catchall_8
    move-exception v0

    .line 1020
    goto :goto_1f

    .line 1021
    :cond_33
    :goto_1d
    add-int/lit8 v4, v4, 0x1

    .line 1022
    .line 1023
    goto :goto_1c

    .line 1024
    :cond_34
    const-class v0, Landroid/widget/ListView;

    .line 1025
    .line 1026
    filled-new-array {v9, v0}, [Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    const/4 v7, 0x0

    .line 1031
    :goto_1e
    if-ge v7, v5, :cond_36

    .line 1032
    .line 1033
    aget-object v4, v0, v7

    .line 1034
    .line 1035
    const-string v6, "performItemClick"

    .line 1036
    .line 1037
    filled-new-array {v11, v10, v8}, [Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v9

    .line 1041
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 1042
    .line 1043
    invoke-interface {v13, v4, v6, v9}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v6

    .line 1047
    if-eqz v6, :cond_35

    .line 1048
    .line 1049
    new-instance v9, Lr0/a0;

    .line 1050
    .line 1051
    const/4 v13, 0x1

    .line 1052
    invoke-direct {v9, v1, v4, v13}, Lr0/a0;-><init>(Lr0/d0;Ljava/lang/Class;I)V

    .line 1053
    .line 1054
    .line 1055
    invoke-static {v6, v9}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1056
    .line 1057
    .line 1058
    :cond_35
    add-int/lit8 v7, v7, 0x1

    .line 1059
    .line 1060
    goto :goto_1e

    .line 1061
    :cond_36
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 1062
    .line 1063
    goto :goto_20

    .line 1064
    :goto_1f
    new-instance v4, LE0/d;

    .line 1065
    .line 1066
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1067
    .line 1068
    .line 1069
    move-object v0, v4

    .line 1070
    :goto_20
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    if-eqz v0, :cond_37

    .line 1075
    .line 1076
    const-string v4, "contact quick add perform click hook missing"

    .line 1077
    .line 1078
    filled-new-array {v4, v0}, [Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1083
    .line 1084
    .line 1085
    :cond_37
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1086
    .line 1087
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1088
    .line 1089
    .line 1090
    :goto_21
    const-string v0, "performLongClick"

    .line 1091
    .line 1092
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1093
    .line 1094
    const-string v4, "contact-quick-add-runtime-long-click"

    .line 1095
    .line 1096
    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v2

    .line 1100
    if-eqz v2, :cond_38

    .line 1101
    .line 1102
    goto/16 :goto_26

    .line 1103
    .line 1104
    :cond_38
    :try_start_9
    filled-new-array {v11, v12, v3}, [Ljava/lang/Class;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v2

    .line 1108
    const/4 v7, 0x0

    .line 1109
    :goto_22
    const/4 v3, 0x3

    .line 1110
    if-ge v7, v3, :cond_3b

    .line 1111
    .line 1112
    aget-object v3, v2, v7

    .line 1113
    .line 1114
    const/4 v5, 0x0

    .line 1115
    new-array v6, v5, [Ljava/lang/Object;

    .line 1116
    .line 1117
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 1118
    .line 1119
    invoke-interface {v8, v3, v0, v6}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v6

    .line 1123
    if-eqz v6, :cond_39

    .line 1124
    .line 1125
    new-instance v8, Lr0/V;

    .line 1126
    .line 1127
    const/16 v9, 0xe

    .line 1128
    .line 1129
    invoke-direct {v8, v1, v9}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1130
    .line 1131
    .line 1132
    invoke-static {v6, v8}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1133
    .line 1134
    .line 1135
    goto :goto_23

    .line 1136
    :catchall_9
    move-exception v0

    .line 1137
    goto :goto_24

    .line 1138
    :cond_39
    :goto_23
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 1139
    .line 1140
    filled-new-array {v6, v6}, [Ljava/lang/Object;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v6

    .line 1144
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 1145
    .line 1146
    invoke-interface {v8, v3, v0, v6}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v3

    .line 1150
    if-eqz v3, :cond_3a

    .line 1151
    .line 1152
    new-instance v6, Lr0/V;

    .line 1153
    .line 1154
    const/16 v8, 0xf

    .line 1155
    .line 1156
    invoke-direct {v6, v1, v8}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1157
    .line 1158
    .line 1159
    invoke-static {v3, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1160
    .line 1161
    .line 1162
    :cond_3a
    add-int/lit8 v7, v7, 0x1

    .line 1163
    .line 1164
    goto :goto_22

    .line 1165
    :cond_3b
    const-string v0, "setOnLongClickListener"

    .line 1166
    .line 1167
    const-class v2, Landroid/view/View$OnLongClickListener;

    .line 1168
    .line 1169
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v2

    .line 1173
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 1174
    .line 1175
    invoke-interface {v3, v11, v0, v2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    if-eqz v0, :cond_3c

    .line 1180
    .line 1181
    new-instance v2, Lr0/V;

    .line 1182
    .line 1183
    const/16 v3, 0x10

    .line 1184
    .line 1185
    invoke-direct {v2, v1, v3}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1186
    .line 1187
    .line 1188
    invoke-static {v0, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1189
    .line 1190
    .line 1191
    :cond_3c
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1192
    .line 1193
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    move-result v0

    .line 1197
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1201
    goto :goto_25

    .line 1202
    :goto_24
    new-instance v2, LE0/d;

    .line 1203
    .line 1204
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1205
    .line 1206
    .line 1207
    move-object v0, v2

    .line 1208
    :goto_25
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    if-eqz v0, :cond_3d

    .line 1213
    .line 1214
    const-string v2, "contact quick add runtime long click hook fail"

    .line 1215
    .line 1216
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1221
    .line 1222
    .line 1223
    :cond_3d
    :goto_26
    const-string v0, "showAtLocation"

    .line 1224
    .line 1225
    const-string v2, "showAsDropDown"

    .line 1226
    .line 1227
    const-class v3, Landroid/widget/PopupWindow;

    .line 1228
    .line 1229
    invoke-virtual {v1}, Lr0/d0;->x0()Z

    .line 1230
    .line 1231
    .line 1232
    move-result v4

    .line 1233
    if-nez v4, :cond_3e

    .line 1234
    .line 1235
    goto/16 :goto_2a

    .line 1236
    .line 1237
    :cond_3e
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1238
    .line 1239
    const-string v5, "contact-quick-add-runtime-popup-probe"

    .line 1240
    .line 1241
    invoke-virtual {v4, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 1242
    .line 1243
    .line 1244
    move-result v4

    .line 1245
    if-eqz v4, :cond_3f

    .line 1246
    .line 1247
    goto/16 :goto_2a

    .line 1248
    .line 1249
    :cond_3f
    :try_start_a
    const-string v4, "setContentView"

    .line 1250
    .line 1251
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v6

    .line 1255
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 1256
    .line 1257
    invoke-interface {v7, v3, v4, v6}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v4

    .line 1261
    if-eqz v4, :cond_40

    .line 1262
    .line 1263
    new-instance v6, Lr0/V;

    .line 1264
    .line 1265
    const/16 v7, 0x11

    .line 1266
    .line 1267
    invoke-direct {v6, v1, v7}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1268
    .line 1269
    .line 1270
    invoke-static {v4, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1271
    .line 1272
    .line 1273
    goto :goto_27

    .line 1274
    :catchall_a
    move-exception v0

    .line 1275
    goto/16 :goto_28

    .line 1276
    .line 1277
    :cond_40
    :goto_27
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v4

    .line 1281
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 1282
    .line 1283
    invoke-interface {v6, v3, v2, v4}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v4

    .line 1287
    if-eqz v4, :cond_41

    .line 1288
    .line 1289
    new-instance v6, Lr0/V;

    .line 1290
    .line 1291
    const/16 v7, 0x12

    .line 1292
    .line 1293
    invoke-direct {v6, v1, v7}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1294
    .line 1295
    .line 1296
    invoke-static {v4, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1297
    .line 1298
    .line 1299
    :cond_41
    filled-new-array {v11, v10, v10}, [Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v4

    .line 1303
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 1304
    .line 1305
    invoke-interface {v6, v3, v2, v4}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v4

    .line 1309
    if-eqz v4, :cond_42

    .line 1310
    .line 1311
    new-instance v6, Lr0/V;

    .line 1312
    .line 1313
    const/16 v7, 0x13

    .line 1314
    .line 1315
    invoke-direct {v6, v1, v7}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1316
    .line 1317
    .line 1318
    invoke-static {v4, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1319
    .line 1320
    .line 1321
    :cond_42
    filled-new-array {v11, v10, v10, v10}, [Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v4

    .line 1325
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 1326
    .line 1327
    invoke-interface {v6, v3, v2, v4}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v2

    .line 1331
    if-eqz v2, :cond_43

    .line 1332
    .line 1333
    new-instance v4, Lr0/V;

    .line 1334
    .line 1335
    const/16 v6, 0x14

    .line 1336
    .line 1337
    invoke-direct {v4, v1, v6}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1338
    .line 1339
    .line 1340
    invoke-static {v2, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1341
    .line 1342
    .line 1343
    :cond_43
    filled-new-array {v11, v10, v10, v10}, [Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 1348
    .line 1349
    invoke-interface {v4, v3, v0, v2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v2

    .line 1353
    if-eqz v2, :cond_44

    .line 1354
    .line 1355
    new-instance v4, Lr0/V;

    .line 1356
    .line 1357
    const/16 v6, 0x15

    .line 1358
    .line 1359
    invoke-direct {v4, v1, v6}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1360
    .line 1361
    .line 1362
    invoke-static {v2, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1363
    .line 1364
    .line 1365
    :cond_44
    const-class v2, Landroid/os/IBinder;

    .line 1366
    .line 1367
    filled-new-array {v2, v10, v10, v10}, [Ljava/lang/Object;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v2

    .line 1371
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 1372
    .line 1373
    invoke-interface {v4, v3, v0, v2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v0

    .line 1377
    if-eqz v0, :cond_45

    .line 1378
    .line 1379
    new-instance v2, Lr0/V;

    .line 1380
    .line 1381
    const/16 v3, 0x16

    .line 1382
    .line 1383
    invoke-direct {v2, v1, v3}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1384
    .line 1385
    .line 1386
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 1387
    .line 1388
    invoke-interface {v3, v0, v2}, Ld0/a;->e(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1392
    goto :goto_29

    .line 1393
    :cond_45
    const/4 v2, 0x0

    .line 1394
    goto :goto_29

    .line 1395
    :goto_28
    new-instance v2, LE0/d;

    .line 1396
    .line 1397
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1398
    .line 1399
    .line 1400
    :goto_29
    invoke-static {v2}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    if-eqz v0, :cond_46

    .line 1405
    .line 1406
    const-string v2, "contact quick add runtime popup probe fail"

    .line 1407
    .line 1408
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1413
    .line 1414
    .line 1415
    :cond_46
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1416
    .line 1417
    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1418
    .line 1419
    .line 1420
    :cond_47
    :goto_2a
    return-void
.end method

.method public final m0(Ljava/lang/Class;Z)V
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    move-object v2, p1

    .line 12
    :goto_0
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const-class v3, Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/Class;

    .line 45
    .line 46
    new-instance v3, Lr0/G;

    .line 47
    .line 48
    invoke-direct {v3, p0}, Lr0/G;-><init>(Lr0/d0;)V

    .line 49
    .line 50
    .line 51
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 52
    .line 53
    invoke-interface {v4, v2, v3}, Ld0/b;->d(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-string v3, "findMethodsByExactPredicate(...)"

    .line 58
    .line 59
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v2}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v2, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

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
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_3

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    move-object v4, v3

    .line 95
    check-cast v4, Ljava/lang/reflect/Method;

    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    const-string v7, "getParameterTypes(...)"

    .line 114
    .line 115
    invoke-static {v4, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v7, Lq0/d;

    .line 119
    .line 120
    const/16 v8, 0x18

    .line 121
    .line 122
    invoke-direct {v7, v8}, Lq0/d;-><init>(I)V

    .line 123
    .line 124
    .line 125
    const/16 v8, 0x1e

    .line 126
    .line 127
    const-string v9, ","

    .line 128
    .line 129
    invoke-static {v4, v9, v7, v8}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    new-instance v7, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v5, "#"

    .line 142
    .line 143
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-eqz v4, :cond_2

    .line 164
    .line 165
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_5

    .line 178
    .line 179
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Ljava/lang/reflect/Method;

    .line 184
    .line 185
    const-string v2, "hide-contact-mvvm-bind-"

    .line 186
    .line 187
    invoke-static {v2, v1}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    sget-object v3, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 192
    .line 193
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_4

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_4
    new-instance v3, Lr0/W;

    .line 201
    .line 202
    const/4 v4, 0x1

    .line 203
    invoke-direct {v3, p2, p0, v4}, Lr0/W;-><init>(ZLr0/d0;I)V

    .line 204
    .line 205
    .line 206
    invoke-static {v1, v3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 207
    .line 208
    .line 209
    sget-object v3, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 210
    .line 211
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    const-string v3, "hide contact runtime adapter bind hooked"

    .line 223
    .line 224
    filled-new-array {v3, v2, v1}, [Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_5
    return-void
.end method

.method public final o(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lr0/d0;->R0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p2}, Lr0/d0;->a0(Landroid/widget/ListView;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p2, :cond_2

    .line 13
    .line 14
    invoke-static {p3}, Lr0/d0;->Z(Landroid/view/View;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_2

    .line 19
    .line 20
    invoke-static {p1}, Lr0/d0;->c0(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    return-void

    .line 28
    :cond_2
    :goto_1
    invoke-static {p0, p1, p1}, Lr0/d0;->e0(Lr0/d0;Landroid/view/View;Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final r()Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, Lr0/d0;->l:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iget-object v1, p0, Lr0/d0;->z:LA0/i;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, LA0/i;->g:Ljava/util/List;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-nez v1, :cond_1

    .line 12
    .line 13
    sget-object v1, LF0/s;->a:LF0/s;

    .line 14
    .line 15
    :cond_1
    invoke-static {v0, v1}, LF0/w;->Z(Ljava/util/LinkedHashSet;Ljava/util/List;)Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "nd5.g"

    .line 20
    .line 21
    const-string v2, "tf5.g"

    .line 22
    .line 23
    const-string v3, "qa5.g"

    .line 24
    .line 25
    const-string v4, "fc5.g"

    .line 26
    .line 27
    invoke-static {v3, v4, v1, v2, v3}, Lz0/r;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v0, v1}, LF0/w;->Z(Ljava/util/LinkedHashSet;Ljava/util/List;)Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method public final r0(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p1}, Lr0/d0;->o0(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lr0/d0;->G0(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    invoke-static {p1}, Lr0/d0;->P(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 24
    return p1

    .line 25
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 26
    return p1
.end method

.method public final s(Ljava/lang/Object;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "a"

    .line 3
    .line 4
    new-array v2, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 7
    .line 8
    invoke-interface {v3, p1, v1, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :catchall_0
    sget-object v1, Lr0/d0;->X:[Ljava/lang/String;

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    move v3, v0

    .line 15
    :goto_0
    if-ge v3, v2, :cond_1

    .line 16
    .line 17
    aget-object v4, v1, v3

    .line 18
    .line 19
    :try_start_1
    invoke-static {p1, v4}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Landroid/widget/PopupWindow;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    :catchall_1
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_1
    const/4 v2, 0x0

    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "getDeclaredFields(...)"

    .line 45
    .line 46
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    array-length v4, v3

    .line 50
    move v5, v0

    .line 51
    :goto_2
    if-ge v5, v4, :cond_4

    .line 52
    .line 53
    aget-object v6, v3, v5

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    :try_start_2
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 63
    goto :goto_3

    .line 64
    :catchall_2
    move-exception v6

    .line 65
    new-instance v7, LE0/d;

    .line 66
    .line 67
    invoke-direct {v7, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    move-object v6, v7

    .line 71
    :goto_3
    nop

    .line 72
    instance-of v7, v6, LE0/d;

    .line 73
    .line 74
    if-eqz v7, :cond_2

    .line 75
    .line 76
    move-object v6, v2

    .line 77
    :cond_2
    instance-of v7, v6, Landroid/widget/PopupWindow;

    .line 78
    .line 79
    if-eqz v7, :cond_3

    .line 80
    .line 81
    move-object v2, v6

    .line 82
    goto :goto_4

    .line 83
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    goto :goto_1

    .line 91
    :cond_5
    :goto_4
    check-cast v2, Landroid/widget/PopupWindow;

    .line 92
    .line 93
    if-eqz v2, :cond_6

    .line 94
    .line 95
    :try_start_3
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 96
    .line 97
    .line 98
    :catchall_3
    :cond_6
    iget-object v0, p0, Lr0/d0;->G:Ljava/util/Set;

    .line 99
    .line 100
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lr0/d0;->H:Ljava/util/WeakHashMap;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lr0/d0;->J:Ljava/util/WeakHashMap;

    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lr0/d0;->K:Ljava/util/WeakHashMap;

    .line 114
    .line 115
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final t0(Landroid/view/View;)Z
    .locals 8

    .line 1
    invoke-static {p1}, Lr0/d0;->B(Landroid/view/View;)Landroid/widget/ListView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    iget-object v4, p0, Lr0/d0;->b:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Landroid/widget/ListView;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v4, v2

    .line 22
    :goto_0
    if-ne v4, v0, :cond_1

    .line 23
    .line 24
    goto/16 :goto_b

    .line 25
    .line 26
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 27
    .line 28
    .line 29
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception v4

    .line 32
    new-instance v5, LE0/d;

    .line 33
    .line 34
    invoke-direct {v5, v4}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v4, v5

    .line 38
    :goto_1
    nop

    .line 39
    instance-of v5, v4, LE0/d;

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    move-object v4, v2

    .line 44
    :cond_2
    check-cast v4, Landroid/widget/ListAdapter;

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-static {v0, v4}, Lr0/d0;->n0(Landroid/widget/ListView;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    goto/16 :goto_b

    .line 55
    .line 56
    :cond_3
    invoke-static {v0}, Lr0/d0;->v0(Landroid/widget/ListView;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    goto/16 :goto_c

    .line 63
    .line 64
    :cond_4
    move-object v0, p1

    .line 65
    :goto_2
    if-eqz v0, :cond_7

    .line 66
    .line 67
    invoke-static {v0}, Lr0/d0;->H0(Landroid/view/View;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_5

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    instance-of v4, v0, Landroid/view/View;

    .line 79
    .line 80
    if-eqz v4, :cond_6

    .line 81
    .line 82
    check-cast v0, Landroid/view/View;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    move-object v0, v2

    .line 86
    goto :goto_2

    .line 87
    :cond_7
    move-object v0, v2

    .line 88
    :goto_3
    const-string v4, ""

    .line 89
    .line 90
    if-eqz v0, :cond_12

    .line 91
    .line 92
    iget-object v5, p0, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 93
    .line 94
    if-eqz v5, :cond_8

    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Landroid/view/View;

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_8
    move-object v5, v2

    .line 104
    :goto_4
    if-ne v5, v0, :cond_9

    .line 105
    .line 106
    goto/16 :goto_b

    .line 107
    .line 108
    :cond_9
    iget-object v5, p0, Lr0/d0;->a:Ljava/lang/ref/WeakReference;

    .line 109
    .line 110
    if-eqz v5, :cond_a

    .line 111
    .line 112
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    if-eqz v5, :cond_a

    .line 117
    .line 118
    invoke-static {v5}, Lr0/d0;->z(Ljava/lang/Object;)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    if-ne v5, v0, :cond_a

    .line 123
    .line 124
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 125
    .line 126
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 130
    .line 131
    return v3

    .line 132
    :cond_a
    :try_start_1
    const-string v5, "getAdapter"

    .line 133
    .line 134
    new-array v6, v1, [Ljava/lang/Object;

    .line 135
    .line 136
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 137
    .line 138
    invoke-interface {v7, v0, v5, v6}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 142
    goto :goto_5

    .line 143
    :catchall_1
    move-exception v5

    .line 144
    new-instance v6, LE0/d;

    .line 145
    .line 146
    invoke-direct {v6, v5}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    move-object v5, v6

    .line 150
    :goto_5
    nop

    .line 151
    instance-of v6, v5, LE0/d;

    .line 152
    .line 153
    if-eqz v6, :cond_b

    .line 154
    .line 155
    move-object v5, v2

    .line 156
    :cond_b
    if-eqz v5, :cond_c

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    goto :goto_6

    .line 167
    :cond_c
    move-object v5, v2

    .line 168
    :goto_6
    if-nez v5, :cond_d

    .line 169
    .line 170
    move-object v5, v4

    .line 171
    :cond_d
    invoke-virtual {p0, v5}, Lr0/d0;->E0(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_e

    .line 176
    .line 177
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 178
    .line 179
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iput-object p1, p0, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 183
    .line 184
    return v3

    .line 185
    :cond_e
    invoke-virtual {p0, v0, p1}, Lr0/d0;->U(Landroid/view/View;Landroid/view/View;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    if-eqz v5, :cond_f

    .line 190
    .line 191
    invoke-virtual {p0, v5}, Lr0/d0;->r0(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-ne v5, v3, :cond_f

    .line 196
    .line 197
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 198
    .line 199
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iput-object p1, p0, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 203
    .line 204
    return v3

    .line 205
    :cond_f
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    if-eqz v5, :cond_10

    .line 210
    .line 211
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    goto :goto_7

    .line 220
    :cond_10
    move-object v5, v2

    .line 221
    :goto_7
    if-nez v5, :cond_11

    .line 222
    .line 223
    move-object v5, v4

    .line 224
    :cond_11
    invoke-static {v5}, Lr0/d0;->q0(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    if-eqz v5, :cond_12

    .line 229
    .line 230
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 231
    .line 232
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    iput-object p1, p0, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 236
    .line 237
    return v3

    .line 238
    :cond_12
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-eqz v0, :cond_13

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    goto :goto_8

    .line 253
    :cond_13
    move-object v0, v2

    .line 254
    :goto_8
    if-nez v0, :cond_14

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_14
    move-object v4, v0

    .line 258
    :goto_9
    invoke-static {v4}, Lr0/d0;->q0(Ljava/lang/String;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_15

    .line 263
    .line 264
    goto :goto_b

    .line 265
    :cond_15
    iget-object v0, p0, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 266
    .line 267
    if-eqz v0, :cond_18

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, Landroid/view/View;

    .line 274
    .line 275
    if-eqz v0, :cond_18

    .line 276
    .line 277
    :goto_a
    if-eqz p1, :cond_18

    .line 278
    .line 279
    if-ne p1, v0, :cond_16

    .line 280
    .line 281
    :goto_b
    return v3

    .line 282
    :cond_16
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    instance-of v4, p1, Landroid/view/View;

    .line 287
    .line 288
    if-eqz v4, :cond_17

    .line 289
    .line 290
    check-cast p1, Landroid/view/View;

    .line 291
    .line 292
    goto :goto_a

    .line 293
    :cond_17
    move-object p1, v2

    .line 294
    goto :goto_a

    .line 295
    :cond_18
    :goto_c
    return v1
.end method

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr0/d0;->z:LA0/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LA0/i;->d:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1, v0}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {}, Lz0/r;->v()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string v0, "z0"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, Lz0/A;->e:Lz0/A;

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    const-string v0, "G0"

    .line 38
    .line 39
    invoke-static {p1, v0}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-object v1, Lz0/A;->d:Lz0/A;

    .line 51
    .line 52
    if-ne v0, v1, :cond_3

    .line 53
    .line 54
    const-string v0, "F0"

    .line 55
    .line 56
    invoke-static {p1, v0}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3
    const-string v0, "I0"

    .line 64
    .line 65
    invoke-static {p1, v0}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public final v(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_3

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lr0/d0;->r0(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_1
    instance-of v1, p1, Ljava/lang/String;

    .line 13
    .line 14
    if-nez v1, :cond_6

    .line 15
    .line 16
    instance-of v1, p1, Ljava/lang/Number;

    .line 17
    .line 18
    if-nez v1, :cond_6

    .line 19
    .line 20
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 21
    .line 22
    if-nez v1, :cond_6

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    if-eqz v1, :cond_6

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "java.lang.Object"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_6

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-string v3, "getDeclaredFields(...)"

    .line 58
    .line 59
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    array-length v3, v2

    .line 63
    const/4 v4, 0x0

    .line 64
    :goto_1
    if-ge v4, v3, :cond_5

    .line 65
    .line 66
    aget-object v5, v2, v4

    .line 67
    .line 68
    const/4 v6, 0x1

    .line 69
    :try_start_0
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-nez v5, :cond_3

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-virtual {p0, v5}, Lr0/d0;->r0(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    if-eqz v6, :cond_4

    .line 84
    .line 85
    return-object v5

    .line 86
    :catchall_0
    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    goto :goto_0

    .line 94
    :cond_6
    :goto_3
    return-object v0
.end method

.method public final x0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lr0/d0;->A:LA0/N;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, LA0/N;->i:Ljava/util/List;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    sget-object v2, LF0/s;->a:LF0/s;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    move-object v0, v2

    .line 15
    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    iget-object v0, p0, Lr0/d0;->A:LA0/N;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v1, v0, LA0/N;->j:Ljava/util/List;

    .line 26
    .line 27
    :cond_2
    if-nez v1, :cond_3

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_3
    move-object v2, v1

    .line 31
    :goto_1
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_4

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_4
    const/4 v0, 0x0

    .line 39
    return v0

    .line 40
    :cond_5
    :goto_2
    const/4 v0, 0x1

    .line 41
    return v0
.end method

.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr0/d0;->z:LA0/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LA0/i;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1, v0}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {}, Lz0/r;->v()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string v0, "y0"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, Lz0/A;->e:Lz0/A;

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    const-string v0, "F0"

    .line 38
    .line 39
    invoke-static {p1, v0}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-object v1, Lz0/A;->d:Lz0/A;

    .line 51
    .line 52
    if-ne v0, v1, :cond_3

    .line 53
    .line 54
    const-string v0, "E0"

    .line 55
    .line 56
    invoke-static {p1, v0}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3
    const-string v0, "H0"

    .line 64
    .line 65
    invoke-static {p1, v0}, Lr0/d0;->W0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public final y0(Ljava/lang/Object;Ljava/util/Set;)Z
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lr0/d0;->G0(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p1}, Lr0/d0;->R(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-string v2, "-"

    .line 16
    .line 17
    invoke-static {v0, v2}, LU0/i;->y0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    move-object v1, v0

    .line 28
    :cond_1
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {p2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {p0, p1}, Lr0/d0;->Q(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    :goto_0
    invoke-static {p1}, Lr0/d0;->o0(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_5

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    invoke-static {p1}, Lr0/d0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_7

    .line 69
    .line 70
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_6
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_7

    .line 82
    .line 83
    :goto_1
    const/4 p1, 0x1

    .line 84
    return p1

    .line 85
    :cond_7
    :goto_2
    const/4 p1, 0x0

    .line 86
    return p1
.end method

.method public final z0(Landroid/view/View;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lr0/d0;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/ListView;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    iget-object v2, p0, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Landroid/view/View;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v2, v1

    .line 26
    :goto_1
    move-object v3, p1

    .line 27
    :goto_2
    const/4 v4, 0x0

    .line 28
    if-eqz v3, :cond_4

    .line 29
    .line 30
    if-eq v3, v0, :cond_9

    .line 31
    .line 32
    if-ne v3, v2, :cond_2

    .line 33
    .line 34
    goto :goto_5

    .line 35
    :cond_2
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    instance-of v4, v3, Landroid/view/View;

    .line 40
    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    check-cast v3, Landroid/view/View;

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    move-object v3, v1

    .line 47
    goto :goto_2

    .line 48
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    iget-wide v5, p0, Lr0/d0;->C:J

    .line 53
    .line 54
    cmp-long v0, v2, v5

    .line 55
    .line 56
    if-gtz v0, :cond_5

    .line 57
    .line 58
    return v4

    .line 59
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :goto_3
    if-eqz p1, :cond_9

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v2, "com.tencent.mm.ui.LauncherUI"

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    const/4 p1, 0x1

    .line 82
    return p1

    .line 83
    :cond_6
    instance-of v0, p1, Landroid/content/ContextWrapper;

    .line 84
    .line 85
    if-eqz v0, :cond_7

    .line 86
    .line 87
    check-cast p1, Landroid/content/ContextWrapper;

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_7
    move-object p1, v1

    .line 91
    :goto_4
    if-eqz p1, :cond_8

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    goto :goto_3

    .line 98
    :cond_8
    move-object p1, v1

    .line 99
    goto :goto_3

    .line 100
    :cond_9
    :goto_5
    return v4
.end method
