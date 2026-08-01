.class public final Lr0/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# static fields
.field public static final A:LE0/f;

.field public static final x:[J

.field public static final y:Ljava/util/List;

.field public static final z:Ljava/util/List;


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:J

.field public d:Ljava/lang/String;

.field public e:J

.field public f:Lde/robv/android/xposed/XC_MethodHook$Unhook;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Ljava/lang/ref/WeakReference;

.field public r:Ljava/lang/String;

.field public s:J

.field public final t:Ljava/lang/ThreadLocal;

.field public final u:Ljava/util/HashSet;

.field public final v:Ljava/util/ArrayList;

.field public final w:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [J

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr0/t1;->x:[J

    .line 8
    .line 9
    new-instance v0, LU0/g;

    .line 10
    .line 11
    const-string v1, "(voip_)?(is_?)?out_?call[=:](true|1|yes)"

    .line 12
    .line 13
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, LU0/g;

    .line 17
    .line 18
    const-string v2, "outgoing[=:](true|1|yes)"

    .line 19
    .line 20
    invoke-direct {v1, v2}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, LU0/g;

    .line 24
    .line 25
    const-string v3, "is_?caller[=:](true|1|yes)"

    .line 26
    .line 27
    invoke-direct {v2, v3}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, LU0/g;

    .line 31
    .line 32
    const-string v4, "(is_?)?from_?me[=:](true|1|yes)"

    .line 33
    .line 34
    invoke-direct {v3, v4}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    filled-new-array {v0, v1, v2, v3}, [LU0/g;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lr0/t1;->y:Ljava/util/List;

    .line 46
    .line 47
    new-instance v0, LU0/g;

    .line 48
    .line 49
    const-string v1, "(is_?)?incoming[=:](true|1|yes)"

    .line 50
    .line 51
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v1, LU0/g;

    .line 55
    .line 56
    const-string v2, "(voip_)?in_?call[=:](true|1|yes)"

    .line 57
    .line 58
    invoke-direct {v1, v2}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v2, LU0/g;

    .line 62
    .line 63
    const-string v3, "invite[=:](true|1|yes)"

    .line 64
    .line 65
    invoke-direct {v2, v3}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v3, LU0/g;

    .line 69
    .line 70
    const-string v4, "caller[=:](false|0|no)"

    .line 71
    .line 72
    invoke-direct {v3, v4}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, LU0/g;

    .line 76
    .line 77
    const-string v5, "(is_?)?from_?me[=:](false|0|no)"

    .line 78
    .line 79
    invoke-direct {v4, v5}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    filled-new-array {v0, v1, v2, v3, v4}, [LU0/g;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sput-object v0, Lr0/t1;->z:Ljava/util/List;

    .line 91
    .line 92
    new-instance v0, Lr0/P;

    .line 93
    .line 94
    const/16 v1, 0x1d

    .line 95
    .line 96
    invoke-direct {v0, v1}, Lr0/P;-><init>(I)V

    .line 97
    .line 98
    .line 99
    new-instance v1, LE0/f;

    .line 100
    .line 101
    invoke-direct {v1, v0}, LE0/f;-><init>(LM0/a;)V

    .line 102
    .line 103
    .line 104
    sput-object v1, Lr0/t1;->A:LE0/f;

    .line 105
    .line 106
    return-void

    .line 107
    :array_0
    .array-data 8
        0x0
        0xc8
        0x12c
    .end array-data
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/t1;->t:Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr0/t1;->u:Ljava/util/HashSet;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lr0/t1;->v:Ljava/util/ArrayList;

    .line 24
    .line 25
    const-string v0, "com.tencent.mm.plugin.voip.widget.InviteRemindDialog"

    .line 26
    .line 27
    const-string v1, "com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog"

    .line 28
    .line 29
    const-string v2, "com.tencent.mm.plugin.voip.ui.VideoActivity"

    .line 30
    .line 31
    const-string v3, "com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WmpfVoipCallInProxyActivity"

    .line 32
    .line 33
    const-string v4, "com.tencent.mm.plugin.voip.ui.MMSuperAlert"

    .line 34
    .line 35
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, LF0/w;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lr0/t1;->w:Ljava/util/Set;

    .line 44
    .line 45
    return-void
.end method

.method public static A()Z
    .locals 1

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
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideVoipCall()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public static B(Landroid/os/Bundle;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "keySet(...)"

    .line 10
    .line 11
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_e

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    :try_start_1
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v3

    .line 44
    :try_start_2
    new-instance v4, LE0/d;

    .line 45
    .line 46
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object v3, v4

    .line 50
    :goto_0
    nop

    .line 51
    instance-of v4, v3, LE0/d;

    .line 52
    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    :cond_3
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const-string v5, "toLowerCase(...)"

    .line 66
    .line 67
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v5, "incoming"

    .line 71
    .line 72
    invoke-static {v4, v5, v0}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    const/4 v6, 0x1

    .line 77
    if-nez v5, :cond_4

    .line 78
    .line 79
    const-string v5, "in_call"

    .line 80
    .line 81
    invoke-static {v4, v5, v0}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_4

    .line 86
    .line 87
    const-string v5, "incall"

    .line 88
    .line 89
    invoke-static {v4, v5, v0}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_4

    .line 94
    .line 95
    const-string v5, "voip_in"

    .line 96
    .line 97
    invoke-static {v4, v5, v0}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_4

    .line 102
    .line 103
    const-string v5, "invite"

    .line 104
    .line 105
    invoke-static {v4, v5, v0}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    :cond_4
    invoke-static {v3}, Lr0/t1;->G(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_5

    .line 116
    .line 117
    :goto_1
    move v2, v6

    .line 118
    goto/16 :goto_4

    .line 119
    .line 120
    :cond_5
    instance-of v4, v3, Landroid/os/Bundle;

    .line 121
    .line 122
    if-eqz v4, :cond_6

    .line 123
    .line 124
    check-cast v3, Landroid/os/Bundle;

    .line 125
    .line 126
    invoke-static {v3}, Lr0/t1;->B(Landroid/os/Bundle;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    goto/16 :goto_4

    .line 131
    .line 132
    :cond_6
    instance-of v4, v3, Landroid/content/Intent;

    .line 133
    .line 134
    if-eqz v4, :cond_7

    .line 135
    .line 136
    check-cast v3, Landroid/content/Intent;

    .line 137
    .line 138
    invoke-static {v3}, Lr0/t1;->C(Landroid/content/Intent;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    goto :goto_4

    .line 143
    :cond_7
    instance-of v4, v3, [Ljava/lang/Object;

    .line 144
    .line 145
    if-eqz v4, :cond_a

    .line 146
    .line 147
    check-cast v3, [Ljava/lang/Object;

    .line 148
    .line 149
    array-length v2, v3

    .line 150
    move v4, v0

    .line 151
    :goto_2
    if-ge v4, v2, :cond_9

    .line 152
    .line 153
    aget-object v5, v3, v4

    .line 154
    .line 155
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-static {v5}, Lr0/t1;->I(Ljava/lang/String;)Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    if-eqz v5, :cond_8

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_9
    :goto_3
    move v2, v0

    .line 170
    goto :goto_4

    .line 171
    :cond_a
    instance-of v4, v3, Ljava/lang/Iterable;

    .line 172
    .line 173
    if-eqz v4, :cond_d

    .line 174
    .line 175
    check-cast v3, Ljava/lang/Iterable;

    .line 176
    .line 177
    instance-of v2, v3, Ljava/util/Collection;

    .line 178
    .line 179
    if-eqz v2, :cond_b

    .line 180
    .line 181
    move-object v2, v3

    .line 182
    check-cast v2, Ljava/util/Collection;

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_b

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_b
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-eqz v3, :cond_9

    .line 200
    .line 201
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-static {v3}, Lr0/t1;->I(Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_c

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_d
    new-instance v4, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v2, "="

    .line 225
    .line 226
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-static {v2}, Lr0/t1;->I(Ljava/lang/String;)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    :goto_4
    if-eqz v2, :cond_2

    .line 241
    .line 242
    move v0, v6

    .line 243
    :cond_e
    :goto_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 244
    .line 245
    .line 246
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 247
    goto :goto_6

    .line 248
    :catchall_1
    move-exception p0

    .line 249
    new-instance v0, LE0/d;

    .line 250
    .line 251
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    move-object p0, v0

    .line 255
    :goto_6
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 256
    .line 257
    instance-of v1, p0, LE0/d;

    .line 258
    .line 259
    if-eqz v1, :cond_f

    .line 260
    .line 261
    move-object p0, v0

    .line 262
    :cond_f
    check-cast p0, Ljava/lang/Boolean;

    .line 263
    .line 264
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    return p0
.end method

.method public static C(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lr0/t1;->B(Landroid/os/Bundle;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_4

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, ""

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :cond_1
    invoke-static {v0}, Lr0/t1;->I(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object v1, v0

    .line 37
    :goto_0
    invoke-static {v1}, Lr0/t1;->I(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/content/Intent;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, "toString(...)"

    .line 48
    .line 49
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Lr0/t1;->I(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 60
    return p0

    .line 61
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 62
    return p0
.end method

.method public static D(Landroid/os/Bundle;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "keySet(...)"

    .line 10
    .line 11
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_d

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    :try_start_1
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v3

    .line 44
    :try_start_2
    new-instance v4, LE0/d;

    .line 45
    .line 46
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object v3, v4

    .line 50
    :goto_0
    nop

    .line 51
    instance-of v4, v3, LE0/d;

    .line 52
    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    :cond_3
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v2}, Lr0/t1;->F(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    const/4 v5, 0x1

    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    invoke-static {v3}, Lr0/t1;->G(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_4

    .line 71
    .line 72
    :goto_1
    move v2, v5

    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_4
    instance-of v4, v3, Landroid/os/Bundle;

    .line 76
    .line 77
    if-eqz v4, :cond_5

    .line 78
    .line 79
    check-cast v3, Landroid/os/Bundle;

    .line 80
    .line 81
    invoke-static {v3}, Lr0/t1;->D(Landroid/os/Bundle;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_5
    instance-of v4, v3, Landroid/content/Intent;

    .line 88
    .line 89
    if-eqz v4, :cond_6

    .line 90
    .line 91
    check-cast v3, Landroid/content/Intent;

    .line 92
    .line 93
    invoke-static {v3}, Lr0/t1;->E(Landroid/content/Intent;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    goto :goto_4

    .line 98
    :cond_6
    instance-of v4, v3, [Ljava/lang/Object;

    .line 99
    .line 100
    if-eqz v4, :cond_9

    .line 101
    .line 102
    check-cast v3, [Ljava/lang/Object;

    .line 103
    .line 104
    array-length v2, v3

    .line 105
    move v4, v0

    .line 106
    :goto_2
    if-ge v4, v2, :cond_8

    .line 107
    .line 108
    aget-object v6, v3, v4

    .line 109
    .line 110
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static {v6}, Lr0/t1;->J(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-eqz v6, :cond_7

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_8
    :goto_3
    move v2, v0

    .line 125
    goto :goto_4

    .line 126
    :cond_9
    instance-of v4, v3, Ljava/lang/Iterable;

    .line 127
    .line 128
    if-eqz v4, :cond_c

    .line 129
    .line 130
    check-cast v3, Ljava/lang/Iterable;

    .line 131
    .line 132
    instance-of v2, v3, Ljava/util/Collection;

    .line 133
    .line 134
    if-eqz v2, :cond_a

    .line 135
    .line 136
    move-object v2, v3

    .line 137
    check-cast v2, Ljava/util/Collection;

    .line 138
    .line 139
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_a

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_a
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_8

    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-static {v3}, Lr0/t1;->J(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_b

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_c
    new-instance v4, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v2, "="

    .line 180
    .line 181
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v2}, Lr0/t1;->J(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    :goto_4
    if-eqz v2, :cond_2

    .line 196
    .line 197
    move v0, v5

    .line 198
    :cond_d
    :goto_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 199
    .line 200
    .line 201
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 202
    goto :goto_6

    .line 203
    :catchall_1
    move-exception p0

    .line 204
    new-instance v0, LE0/d;

    .line 205
    .line 206
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    move-object p0, v0

    .line 210
    :goto_6
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 211
    .line 212
    instance-of v1, p0, LE0/d;

    .line 213
    .line 214
    if-eqz v1, :cond_e

    .line 215
    .line 216
    move-object p0, v0

    .line 217
    :cond_e
    check-cast p0, Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    return p0
.end method

.method public static E(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lr0/t1;->D(Landroid/os/Bundle;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_4

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, ""

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :cond_1
    invoke-static {v0}, Lr0/t1;->J(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object v1, v0

    .line 37
    :goto_0
    invoke-static {v1}, Lr0/t1;->J(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/content/Intent;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, "toString(...)"

    .line 48
    .line 49
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Lr0/t1;->J(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 60
    return p0

    .line 61
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 62
    return p0
.end method

.method public static F(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "toLowerCase(...)"

    .line 8
    .line 9
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "outcall"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-string v0, "out_call"

    .line 22
    .line 23
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const-string v0, "outgoing"

    .line 30
    .line 31
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    const-string v0, "isoutcall"

    .line 38
    .line 39
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    const-string v0, "is_out_call"

    .line 46
    .line 47
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    const-string v0, "iscaller"

    .line 54
    .line 55
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    const-string v0, "is_caller"

    .line 62
    .line 63
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_1

    .line 68
    .line 69
    const-string v0, "fromme"

    .line 70
    .line 71
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_1

    .line 76
    .line 77
    const-string v0, "from_me"

    .line 78
    .line 79
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    const-string v0, "voip_out"

    .line 86
    .line 87
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_0

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    return v1

    .line 95
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 96
    return p0
.end method

.method public static G(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p0, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-ne p0, v1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    check-cast p0, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string v0, "toLowerCase(...)"

    .line 47
    .line 48
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "true"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    const-string v0, "1"

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    const-string v0, "yes"

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    const-string v0, "outgoing"

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_2

    .line 82
    .line 83
    const-string v0, "out"

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_3

    .line 90
    .line 91
    :cond_2
    :goto_0
    return v1

    .line 92
    :cond_3
    const/4 p0, 0x0

    .line 93
    return p0
.end method

.method public static I(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

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
    goto :goto_1

    .line 9
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v2, "toLowerCase(...)"

    .line 16
    .line 17
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "\\s+"

    .line 21
    .line 22
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "compile(...)"

    .line 27
    .line 28
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v2, ""

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "replaceAll(...)"

    .line 42
    .line 43
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sget-object v2, Lr0/t1;->z:Ljava/util/List;

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, LU0/g;

    .line 72
    .line 73
    invoke-virtual {v3, v0}, LU0/g;->a(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    :goto_0
    const-string v0, "\u6765\u7535"

    .line 81
    .line 82
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_5

    .line 87
    .line 88
    const-string v0, "\u9080\u8bf7\u4f60"

    .line 89
    .line 90
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_5

    .line 95
    .line 96
    const-string v0, "\u9080\u8bf7\u60a8"

    .line 97
    .line 98
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    :goto_1
    return v1

    .line 106
    :cond_5
    :goto_2
    const/4 p0, 0x1

    .line 107
    return p0
.end method

.method public static J(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "toLowerCase(...)"

    .line 15
    .line 16
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "\\s+"

    .line 20
    .line 21
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "compile(...)"

    .line 26
    .line 27
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, ""

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string v0, "replaceAll(...)"

    .line 41
    .line 42
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lr0/t1;->y:Ljava/util/List;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, LU0/g;

    .line 71
    .line 72
    invoke-virtual {v1, p0}, LU0/g;->a(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    const/4 p0, 0x1

    .line 79
    return p0

    .line 80
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 81
    return p0
.end method

.method public static M(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

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
    goto :goto_0

    .line 9
    :cond_0
    const-string v0, "Voip_User"

    .line 10
    .line 11
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    const-string v0, "Voip_"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    const-string v0, "plugin.voip"

    .line 27
    .line 28
    invoke-static {p0, v0, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    return v1

    .line 36
    :cond_2
    :goto_1
    return v2
.end method

.method public static N(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

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
    goto :goto_0

    .line 9
    :cond_0
    const-string v0, "voip"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {p0, v0, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    const-string v0, "Voip_User"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    const-string v0, "\u8bed\u97f3\u901a\u8bdd"

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const-string v0, "\u89c6\u9891\u901a\u8bdd"

    .line 35
    .line 36
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    const-string v0, "\u901a\u8bdd"

    .line 43
    .line 44
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    const-string v0, "\u6765\u7535"

    .line 51
    .line 52
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    const-string v0, "voice call"

    .line 59
    .line 60
    invoke-static {p0, v0, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    const-string v0, "video call"

    .line 67
    .line 68
    invoke-static {p0, v0, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    :goto_0
    return v1

    .line 76
    :cond_2
    :goto_1
    return v2
.end method

.method public static P(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

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
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v2, "getParameterTypes(...)"

    .line 18
    .line 19
    invoke-static {p0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lr0/n1;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v2, v3}, Lr0/n1;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const/16 v3, 0x1e

    .line 29
    .line 30
    const-string v4, ","

    .line 31
    .line 32
    invoke-static {p0, v4, v2, v3}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, "#"

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, "("

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p0, ")"

    .line 61
    .line 62
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public static W(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lr0/t1;->o(Landroid/os/Bundle;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-string v0, ""

    .line 22
    .line 23
    :cond_1
    invoke-static {v0}, Lr0/t1;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/content/Intent;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v0, "toString(...)"

    .line 34
    .line 35
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Lr0/t1;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_2
    return-object v0
.end method

.method public static X(Ljava/lang/Object;)Ljava/lang/String;
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
    if-nez p0, :cond_1

    .line 8
    .line 9
    :cond_0
    const-string p0, "null"

    .line 10
    .line 11
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x3e8

    .line 16
    .line 17
    if-le v0, v1, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "substring(...)"

    .line 25
    .line 26
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, "...("

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, ")"

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :cond_2
    return-object p0
.end method

.method public static final a(Lr0/t1;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "com.tencent.mm.ui.LauncherUI"

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v0, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string p1, "keep voip suppression on launcher resume"

    .line 30
    .line 31
    filled-new-array {p1, p2, p0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v3, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 48
    .line 49
    invoke-static {v0, v3, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    const-string v3, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"

    .line 56
    .line 57
    invoke-static {v0, v3, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    invoke-static {v0, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    return-void

    .line 71
    :cond_2
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p2, ":"

    .line 88
    .line 89
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Lr0/t1;->j(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public static a0(Ljava/lang/Object;)V
    .locals 4

    .line 1
    :try_start_0
    instance-of v0, p0, Landroid/media/MediaPlayer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    :try_start_1
    move-object v0, p0

    .line 7
    check-cast v0, Landroid/media/MediaPlayer;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v1}, Landroid/media/MediaPlayer;->setVolume(FF)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    .line 11
    .line 12
    :catchall_0
    :try_start_2
    move-object v0, p0

    .line 13
    check-cast v0, Landroid/media/MediaPlayer;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 16
    .line 17
    .line 18
    :catchall_1
    :try_start_3
    move-object v0, p0

    .line 19
    check-cast v0, Landroid/media/MediaPlayer;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    :try_start_4
    instance-of v0, p0, Landroid/media/Ringtone;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    check-cast v0, Landroid/media/Ringtone;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/media/Ringtone;->stop()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_2
    move-exception v0

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    instance-of v0, p0, Landroid/media/AudioTrack;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    :try_start_5
    move-object v0, p0

    .line 43
    check-cast v0, Landroid/media/AudioTrack;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setVolume(F)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 46
    .line 47
    .line 48
    :catchall_3
    :try_start_6
    move-object v0, p0

    .line 49
    check-cast v0, Landroid/media/AudioTrack;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 52
    .line 53
    .line 54
    :catchall_4
    :try_start_7
    move-object v0, p0

    .line 55
    check-cast v0, Landroid/media/AudioTrack;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 58
    .line 59
    .line 60
    :catchall_5
    :try_start_8
    move-object v0, p0

    .line 61
    check-cast v0, Landroid/media/AudioTrack;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    :try_start_9
    instance-of v0, p0, Landroid/os/Vibrator;

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    if-nez p0, :cond_4

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v1, "vibrator"

    .line 84
    .line 85
    const/4 v2, 0x1

    .line 86
    invoke-static {v0, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_5
    const/4 v0, 0x0

    .line 94
    :try_start_a
    const-string v1, "cancel"

    .line 95
    .line 96
    new-array v2, v0, [Ljava/lang/Object;

    .line 97
    .line 98
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 99
    .line 100
    invoke-interface {v3, p0, v1, v2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 101
    .line 102
    .line 103
    :catchall_6
    :try_start_b
    const-string v1, "stop"

    .line 104
    .line 105
    new-array v0, v0, [Ljava/lang/Object;

    .line 106
    .line 107
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 108
    .line 109
    invoke-interface {v2, p0, v1, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 110
    .line 111
    .line 112
    :catchall_7
    :goto_0
    :try_start_c
    const-string v0, "stop voip audio"

    .line 113
    .line 114
    if-eqz p0, :cond_6

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    goto :goto_1

    .line 125
    :cond_6
    const-string v1, "null"

    .line 126
    .line 127
    :goto_1
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :goto_2
    new-instance v1, LE0/d;

    .line 138
    .line 139
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    move-object v0, v1

    .line 143
    :goto_3
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-eqz v0, :cond_8

    .line 148
    .line 149
    if-eqz p0, :cond_7

    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    goto :goto_4

    .line 160
    :cond_7
    const/4 p0, 0x0

    .line 161
    :goto_4
    const-string v1, "stop voip audio fail"

    .line 162
    .line 163
    filled-new-array {v1, p0, v0}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_8
    :goto_5
    return-void
.end method

.method public static final b(Lr0/t1;[Ljava/lang/Object;)Ljava/util/List;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p0, LF0/s;->a:LF0/s;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    array-length v0, p1

    .line 15
    const/4 v1, 0x0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    if-ge v2, v0, :cond_4

    .line 18
    .line 19
    aget-object v3, p1, v2

    .line 20
    .line 21
    instance-of v4, v3, Landroid/content/Intent;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    instance-of v4, v3, [Ljava/lang/Object;

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    check-cast v3, [Ljava/lang/Object;

    .line 34
    .line 35
    array-length v4, v3

    .line 36
    move v5, v1

    .line 37
    :goto_1
    if-ge v5, v4, :cond_3

    .line 38
    .line 39
    aget-object v6, v3, v5

    .line 40
    .line 41
    instance-of v7, v6, Landroid/content/Intent;

    .line 42
    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    return-object p0
.end method

.method public static final c(Lr0/t1;Landroid/app/Activity;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lr0/t1;->H(Landroid/app/Activity;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x0

    .line 28
    :goto_0
    const-string v2, "voip activity created"

    .line 29
    .line 30
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lr0/t1;->f:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const-string v1, "io.flutter.plugin.common.BasicMessageChannel$IncomingMessageHandler"

    .line 48
    .line 49
    invoke-static {v1}, Lm0/b;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const-string v2, "java.nio.ByteBuffer"

    .line 57
    .line 58
    invoke-static {v2}, Lm0/b;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-nez v2, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    const-string v3, "io.flutter.plugin.common.BinaryMessenger$BinaryReply"

    .line 66
    .line 67
    invoke-static {v3}, Lm0/b;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-nez v3, :cond_5

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_5
    new-instance v4, Lm0/e;

    .line 75
    .line 76
    invoke-direct {v4, p0, v0}, Lm0/e;-><init>(Lr0/t1;Ljava/lang/ref/WeakReference;)V

    .line 77
    .line 78
    .line 79
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 84
    .line 85
    const-string v3, "onMessage"

    .line 86
    .line 87
    invoke-interface {v2, v1, v3, v0}, Ld0/a;->h(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lr0/t1;->f:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 92
    .line 93
    :goto_1
    invoke-virtual {p0, p1}, Lr0/t1;->t(Landroid/app/Activity;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public static c0(Landroid/view/View;Ljava/lang/String;)Z
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
    const-class v0, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {v0, p1, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    return v1

    .line 27
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public static final d(Lr0/t1;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;Landroid/content/Intent;)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p0, p3}, Lr0/t1;->K(Landroid/content/Intent;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v6, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string p2, "intent-start:"

    .line 18
    .line 19
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p3, p1}, Lr0/t1;->k(Landroid/content/Intent;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return v6

    .line 33
    :cond_0
    invoke-static {p3}, Lr0/t1;->W(Landroid/content/Intent;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lr0/t1;->S()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_1
    move-object v7, v0

    .line 44
    invoke-static {}, Lr0/t1;->A()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const-string v2, "enabled="

    .line 49
    .line 50
    invoke-static {v2, v0}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v0, "masked="

    .line 55
    .line 56
    invoke-static {v0, v7}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {p3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const/4 v8, 0x0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v4, v0

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object v4, v8

    .line 74
    :goto_0
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    move-object v0, p3

    .line 81
    :cond_3
    invoke-static {v0}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    const-string v0, "voip intent start"

    .line 86
    .line 87
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    if-nez v7, :cond_4

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-nez v0, :cond_5

    .line 102
    .line 103
    move-object v0, p3

    .line 104
    :cond_5
    invoke-static {v0}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p0, v7, p3, v0, v1}, Lr0/t1;->Y(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    if-nez p3, :cond_6

    .line 113
    .line 114
    :goto_1
    return v6

    .line 115
    :cond_6
    invoke-virtual {p0, v7, v1}, Lr0/t1;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const-string p3, "block voip intent start"

    .line 119
    .line 120
    filled-new-array {p3, v1, v7}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    invoke-static {p3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v1, v7}, Lr0/t1;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {p1, p2, v8}, Lr0/t1;->g(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;Ljava/lang/Integer;)V

    .line 131
    .line 132
    .line 133
    const/4 p0, 0x1

    .line 134
    return p0
.end method

.method public static d0()Ljava/lang/String;
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getStackTrace(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    array-length v2, v0

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_2

    .line 22
    .line 23
    aget-object v4, v0, v3

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-string v6, "getClassName(...)"

    .line 30
    .line 31
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v6, ".plugin.voip."

    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    invoke-static {v5, v6, v7}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_0

    .line 42
    .line 43
    const-string v6, ".plugin.voip$"

    .line 44
    .line 45
    invoke-static {v5, v6, v7}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_0

    .line 50
    .line 51
    const-string v6, "voip"

    .line 52
    .line 53
    invoke-static {v5, v6, v7}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    :cond_0
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v0, 0x6

    .line 66
    invoke-static {v1, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    new-instance v6, Lr0/n1;

    .line 71
    .line 72
    const/4 v0, 0x3

    .line 73
    invoke-direct {v6, v0}, Lr0/n1;-><init>(I)V

    .line 74
    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    const-string v3, " <- "

    .line 79
    .line 80
    const/16 v7, 0x1e

    .line 81
    .line 82
    invoke-static/range {v2 .. v7}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0
.end method

.method public static final e(Lr0/t1;Landroid/app/Notification;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 5
    .line 6
    const-string v6, "android.subText"

    .line 7
    .line 8
    const-string v7, "android.bigText"

    .line 9
    .line 10
    const-string v0, "android.title"

    .line 11
    .line 12
    const-string v1, "android.text"

    .line 13
    .line 14
    const-string v2, "android.subText"

    .line 15
    .line 16
    const-string v3, "android.bigText"

    .line 17
    .line 18
    const-string v4, "android.title"

    .line 19
    .line 20
    const-string v5, "android.text"

    .line 21
    .line 22
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    move v2, v0

    .line 33
    :goto_0
    const/16 v0, 0x8

    .line 34
    .line 35
    if-ge v2, v0, :cond_3

    .line 36
    .line 37
    aget-object v0, p1, v2

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    new-instance v4, LE0/d;

    .line 49
    .line 50
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_0
    move-object v0, v3

    .line 55
    :goto_1
    move-object v4, v0

    .line 56
    :goto_2
    nop

    .line 57
    instance-of v0, v4, LE0/d;

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_1
    move-object v3, v4

    .line 63
    :goto_3
    if-eqz v3, :cond_2

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const/16 v0, 0x20

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const-string p1, "toString(...)"

    .line 84
    .line 85
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object p0
.end method

.method public static f(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getMethods(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v1, "getDeclaredMethods(...)"

    .line 19
    .line 20
    invoke-static {p0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {v0, p0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v0, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    move-object v3, v2

    .line 56
    check-cast v3, Ljava/lang/reflect/Method;

    .line 57
    .line 58
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v3}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    return-object v1
.end method

.method public static g(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    if-nez p2, :cond_8

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string p2, "getReturnType(...)"

    .line 8
    .line 9
    invoke-static {p1, p2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    :goto_0
    move-object p2, p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v0, 0x0

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_4

    .line 71
    .line 72
    const-wide/16 p1, 0x0

    .line 73
    .line 74
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    goto :goto_0

    .line 79
    :cond_4
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_5

    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    goto :goto_0

    .line 93
    :cond_5
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_6

    .line 100
    .line 101
    const-wide/16 p1, 0x0

    .line 102
    .line 103
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    goto :goto_0

    .line 108
    :cond_6
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_7

    .line 115
    .line 116
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    goto :goto_0

    .line 121
    :cond_7
    const/4 p1, 0x0

    .line 122
    goto :goto_0

    .line 123
    :cond_8
    :goto_1
    invoke-virtual {p0, p2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public static synthetic h(Lr0/t1;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    invoke-static {p1, p2, p0}, Lr0/t1;->g(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/Class;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    new-instance v1, LE0/d;

    .line 8
    .line 9
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object v0, v1

    .line 13
    :goto_0
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const-string v2, "voip class not found"

    .line 20
    .line 21
    filled-new-array {v2, p0, v1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    instance-of p0, v0, LE0/d;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    :cond_1
    check-cast v0, Ljava/lang/Class;

    .line 34
    .line 35
    return-object v0
.end method

.method public static l(Landroid/view/View;ILjava/lang/StringBuilder;)V
    .locals 4

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    if-ltz p1, :cond_7

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x5dc

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    const-string v0, " view="

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v1, 0x0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v0, v1

    .line 52
    :goto_0
    if-eqz v0, :cond_2

    .line 53
    .line 54
    const-string v2, " cd="

    .line 55
    .line 56
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    :cond_2
    instance-of v0, p0, Landroid/widget/TextView;

    .line 63
    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    move-object v0, p0

    .line 67
    check-cast v0, Landroid/widget/TextView;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    move-object v2, v1

    .line 89
    :goto_1
    if-eqz v2, :cond_4

    .line 90
    .line 91
    const-string v3, " text="

    .line 92
    .line 93
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_5

    .line 116
    .line 117
    move-object v1, v0

    .line 118
    :cond_5
    if-eqz v1, :cond_6

    .line 119
    .line 120
    const-string v0, " hint="

    .line 121
    .line 122
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :cond_6
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 129
    .line 130
    if-eqz v0, :cond_7

    .line 131
    .line 132
    check-cast p0, Landroid/view/ViewGroup;

    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    const/16 v1, 0xc

    .line 139
    .line 140
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    const/4 v1, 0x0

    .line 145
    :goto_2
    if-ge v1, v0, :cond_7

    .line 146
    .line 147
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    add-int/lit8 v3, p1, -0x1

    .line 152
    .line 153
    invoke-static {v2, v3, p2}, Lr0/t1;->l(Landroid/view/View;ILjava/lang/StringBuilder;)V

    .line 154
    .line 155
    .line 156
    add-int/lit8 v1, v1, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_7
    :goto_3
    return-void
.end method

.method public static n()Z
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getStackTrace(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v3, v1, :cond_2

    .line 18
    .line 19
    aget-object v4, v0, v3

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v5, "getClassName(...)"

    .line 26
    .line 27
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v5, ".plugin.voip."

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    invoke-static {v4, v5, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-nez v5, :cond_1

    .line 38
    .line 39
    const-string v5, ".plugin.voip$"

    .line 40
    .line 41
    invoke-static {v4, v5, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    const-string v5, "voip"

    .line 48
    .line 49
    invoke-static {v4, v5, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    :goto_1
    return v6

    .line 60
    :cond_2
    return v2
.end method

.method public static o(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "keySet(...)"

    .line 10
    .line 11
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_9

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    .line 30
    :try_start_1
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v3

    .line 36
    :try_start_2
    new-instance v4, LE0/d;

    .line 37
    .line 38
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object v3, v4

    .line 42
    :goto_0
    nop

    .line 43
    instance-of v4, v3, LE0/d;

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    move-object v3, v0

    .line 48
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, "="

    .line 57
    .line 58
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v2}, Lr0/t1;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    return-object v2

    .line 75
    :cond_3
    instance-of v2, v3, Landroid/os/Bundle;

    .line 76
    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    check-cast v3, Landroid/os/Bundle;

    .line 80
    .line 81
    invoke-static {v3}, Lr0/t1;->o(Landroid/os/Bundle;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_1

    .line 86
    .line 87
    return-object v2

    .line 88
    :catchall_1
    move-exception p0

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    instance-of v2, v3, Landroid/content/Intent;

    .line 91
    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    check-cast v3, Landroid/content/Intent;

    .line 95
    .line 96
    invoke-static {v3}, Lr0/t1;->W(Landroid/content/Intent;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-eqz v2, :cond_1

    .line 101
    .line 102
    return-object v2

    .line 103
    :cond_5
    instance-of v2, v3, [Ljava/lang/Object;

    .line 104
    .line 105
    if-eqz v2, :cond_7

    .line 106
    .line 107
    check-cast v3, [Ljava/lang/Object;

    .line 108
    .line 109
    array-length v2, v3

    .line 110
    const/4 v4, 0x0

    .line 111
    :goto_1
    if-ge v4, v2, :cond_1

    .line 112
    .line 113
    aget-object v5, v3, v4

    .line 114
    .line 115
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-static {v5}, Lr0/t1;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    if-eqz v5, :cond_6

    .line 124
    .line 125
    return-object v5

    .line 126
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_7
    instance-of v2, v3, Ljava/lang/Iterable;

    .line 130
    .line 131
    if-eqz v2, :cond_1

    .line 132
    .line 133
    check-cast v3, Ljava/lang/Iterable;

    .line 134
    .line 135
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_1

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-static {v3}, Lr0/t1;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    if-eqz v3, :cond_8

    .line 158
    .line 159
    return-object v3

    .line 160
    :cond_9
    invoke-virtual {p0}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    const-string v1, "toString(...)"

    .line 165
    .line 166
    invoke-static {p0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {p0}, Lr0/t1;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 173
    goto :goto_3

    .line 174
    :goto_2
    new-instance v1, LE0/d;

    .line 175
    .line 176
    invoke-direct {v1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    move-object p0, v1

    .line 180
    :goto_3
    nop

    .line 181
    instance-of v1, p0, LE0/d;

    .line 182
    .line 183
    if-eqz v1, :cond_a

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_a
    move-object v0, p0

    .line 187
    :goto_4
    check-cast v0, Ljava/lang/String;

    .line 188
    .line 189
    return-object v0
.end method

.method public static p(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

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
    goto/16 :goto_4

    .line 9
    .line 10
    :cond_0
    const-class v0, Lq0/h;

    .line 11
    .line 12
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lq0/h;

    .line 17
    .line 18
    invoke-virtual {v2}, Lq0/h;->c()V

    .line 19
    .line 20
    .line 21
    sget-boolean v2, Lz0/i;->a:Z

    .line 22
    .line 23
    invoke-static {}, Lz0/g;->s()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    sget-object v0, LF0/s;->a:LF0/s;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lq0/h;

    .line 37
    .line 38
    new-instance v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v2

    .line 46
    :goto_0
    invoke-static {v0}, LF0/k;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    move-object v4, v3

    .line 70
    check-cast v4, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_2

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    const/4 v3, 0x0

    .line 91
    if-eqz v2, :cond_5

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    move-object v4, v2

    .line 98
    check-cast v4, Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {p0, v4, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_4

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    move-object v2, v1

    .line 108
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v2, :cond_6

    .line 111
    .line 112
    return-object v2

    .line 113
    :cond_6
    sget-boolean v0, Lz0/i;->a:Z

    .line 114
    .line 115
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_8

    .line 128
    .line 129
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    move-object v4, v2

    .line 134
    check-cast v4, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 135
    .line 136
    invoke-virtual {v4}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-nez v5, :cond_7

    .line 145
    .line 146
    invoke-virtual {v4}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-static {p0, v4, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-eqz v4, :cond_7

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_8
    move-object v2, v1

    .line 158
    :goto_3
    check-cast v2, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 159
    .line 160
    if-eqz v2, :cond_9

    .line 161
    .line 162
    invoke-virtual {v2}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :cond_9
    :goto_4
    return-object v1
.end method

.method public static q(Ljava/lang/reflect/Method;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "getParameterTypes(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    array-length v0, p0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v2, v0, :cond_2

    .line 14
    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    const-class v4, Landroid/content/Intent;

    .line 18
    .line 19
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x1

    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ne v3, v6, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :goto_1
    return v6

    .line 49
    :cond_2
    return v1
.end method

.method public static r(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "getParameterTypes(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    array-length v0, p0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    const-class v4, Landroid/app/Notification;

    .line 18
    .line 19
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v1
.end method


# virtual methods
.method public final H(Landroid/app/Activity;)Z
    .locals 2

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
    iget-object v0, p0, Lr0/t1;->w:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "voip"

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

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
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_1
    :goto_0
    return v1
.end method

.method public final K(Landroid/content/Intent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

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
    const-string v1, ""

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    move-object v0, v1

    .line 18
    :cond_1
    iget-object v2, p0, Lr0/t1;->w:Ljava/util/Set;

    .line 19
    .line 20
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x1

    .line 25
    if-nez v2, :cond_6

    .line 26
    .line 27
    const-string v2, "voip"

    .line 28
    .line 29
    invoke-static {v0, v2, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0, v0}, Lr0/t1;->L(Landroid/os/Bundle;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_6

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    move-object v0, v1

    .line 53
    :cond_3
    invoke-static {v0}, Lr0/t1;->M(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    move-object v1, v0

    .line 67
    :goto_1
    invoke-static {v1}, Lr0/t1;->M(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_6

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/content/Intent;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v0, "toString(...)"

    .line 78
    .line 79
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lr0/t1;->M(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    const/4 p1, 0x0

    .line 90
    return p1

    .line 91
    :cond_6
    :goto_2
    return v3
.end method

.method public final L(Landroid/os/Bundle;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "keySet(...)"

    .line 10
    .line 11
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_c

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    const-string v3, "block_contact"

    .line 39
    .line 40
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v4, 0x1

    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    :cond_3
    move v2, v0

    .line 48
    goto :goto_2

    .line 49
    :cond_4
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-string v3, "Voip"

    .line 53
    .line 54
    invoke-static {v2, v3, v0}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_b

    .line 59
    .line 60
    const-string v3, "is_ilink_voip"

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 66
    if-nez v3, :cond_b

    .line 67
    .line 68
    :try_start_1
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception v3

    .line 74
    :try_start_2
    new-instance v5, LE0/d;

    .line 75
    .line 76
    invoke-direct {v5, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    move-object v3, v5

    .line 80
    :goto_0
    nop

    .line 81
    instance-of v5, v3, LE0/d;

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    if-eqz v5, :cond_5

    .line 85
    .line 86
    move-object v3, v6

    .line 87
    :cond_5
    instance-of v5, v3, Landroid/os/Bundle;

    .line 88
    .line 89
    if-eqz v5, :cond_6

    .line 90
    .line 91
    check-cast v3, Landroid/os/Bundle;

    .line 92
    .line 93
    invoke-virtual {p0, v3}, Lr0/t1;->L(Landroid/os/Bundle;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    goto :goto_1

    .line 98
    :catchall_1
    move-exception p1

    .line 99
    goto :goto_4

    .line 100
    :cond_6
    instance-of v5, v3, Landroid/content/Intent;

    .line 101
    .line 102
    if-eqz v5, :cond_7

    .line 103
    .line 104
    check-cast v3, Landroid/content/Intent;

    .line 105
    .line 106
    invoke-virtual {p0, v3}, Lr0/t1;->K(Landroid/content/Intent;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    goto :goto_1

    .line 111
    :cond_7
    const-string v5, "Voip_"

    .line 112
    .line 113
    invoke-static {v2, v0, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_a

    .line 118
    .line 119
    if-eqz v3, :cond_8

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    :cond_8
    if-nez v6, :cond_9

    .line 126
    .line 127
    const-string v6, ""

    .line 128
    .line 129
    :cond_9
    invoke-static {v6}, Lr0/t1;->M(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_a

    .line 134
    .line 135
    move v2, v4

    .line 136
    goto :goto_1

    .line 137
    :cond_a
    move v2, v0

    .line 138
    :goto_1
    if-eqz v2, :cond_3

    .line 139
    .line 140
    :cond_b
    move v2, v4

    .line 141
    :goto_2
    if-eqz v2, :cond_2

    .line 142
    .line 143
    move v0, v4

    .line 144
    :cond_c
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 145
    .line 146
    .line 147
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 148
    goto :goto_5

    .line 149
    :goto_4
    new-instance v0, LE0/d;

    .line 150
    .line 151
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    move-object p1, v0

    .line 155
    :goto_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 156
    .line 157
    instance-of v1, p1, LE0/d;

    .line 158
    .line 159
    if-eqz v1, :cond_d

    .line 160
    .line 161
    move-object p1, v0

    .line 162
    :cond_d
    check-cast p1, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    return p1
.end method

.method public final O(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {}, Lr0/t1;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iput-wide v0, p0, Lr0/t1;->c:J

    .line 13
    .line 14
    if-eqz p2, :cond_2

    .line 15
    .line 16
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v0, p0, Lr0/t1;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v1, "suppressed:"

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0, p2, v0}, Lr0/t1;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    const-string v0, "unknown"

    .line 49
    .line 50
    if-nez p2, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0}, Lr0/t1;->Q()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-nez v1, :cond_4

    .line 57
    .line 58
    move-object v1, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move-object v1, p2

    .line 61
    :cond_4
    :goto_1
    const-string v2, "voip suppressed"

    .line 62
    .line 63
    filled-new-array {v2, p1, v1}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    if-nez p2, :cond_5

    .line 71
    .line 72
    invoke-virtual {p0}, Lr0/t1;->Q()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    :cond_5
    iget-object v1, p0, Lr0/t1;->t:Ljava/lang/ThreadLocal;

    .line 77
    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    if-nez p2, :cond_6

    .line 83
    .line 84
    move-object v4, p1

    .line 85
    goto :goto_2

    .line 86
    :cond_6
    move-object v4, p2

    .line 87
    :goto_2
    iget-object v5, p0, Lr0/t1;->r:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_7

    .line 94
    .line 95
    iget-wide v5, p0, Lr0/t1;->s:J

    .line 96
    .line 97
    sub-long v5, v2, v5

    .line 98
    .line 99
    const-wide/16 v7, 0x2ee0

    .line 100
    .line 101
    cmp-long v5, v5, v7

    .line 102
    .line 103
    if-gez v5, :cond_7

    .line 104
    .line 105
    goto/16 :goto_7

    .line 106
    .line 107
    :cond_7
    iget-wide v5, p0, Lr0/t1;->s:J

    .line 108
    .line 109
    sub-long v5, v2, v5

    .line 110
    .line 111
    const-wide/16 v7, 0x3e8

    .line 112
    .line 113
    cmp-long v5, v5, v7

    .line 114
    .line 115
    if-gez v5, :cond_8

    .line 116
    .line 117
    goto/16 :goto_7

    .line 118
    .line 119
    :cond_8
    iget-object v5, p0, Lr0/t1;->q:Ljava/lang/ref/WeakReference;

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    if-eqz v5, :cond_9

    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    check-cast v5, Landroid/content/Context;

    .line 129
    .line 130
    if-eqz v5, :cond_9

    .line 131
    .line 132
    const-string v7, "vibrator"

    .line 133
    .line 134
    invoke-virtual {v5, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    goto :goto_3

    .line 139
    :cond_9
    move-object v5, v6

    .line 140
    :goto_3
    instance-of v7, v5, Landroid/os/Vibrator;

    .line 141
    .line 142
    if-eqz v7, :cond_a

    .line 143
    .line 144
    move-object v6, v5

    .line 145
    check-cast v6, Landroid/os/Vibrator;

    .line 146
    .line 147
    :cond_a
    if-nez v6, :cond_b

    .line 148
    .line 149
    goto :goto_7

    .line 150
    :cond_b
    iput-object v4, p0, Lr0/t1;->r:Ljava/lang/String;

    .line 151
    .line 152
    iput-wide v2, p0, Lr0/t1;->s:J

    .line 153
    .line 154
    :try_start_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    .line 159
    :try_start_1
    sget-object v2, Lr0/t1;->x:[J

    .line 160
    .line 161
    sget-object v3, Lr0/t1;->A:LE0/f;

    .line 162
    .line 163
    invoke-virtual {v3}, LE0/f;->a()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    const-string v4, "getValue(...)"

    .line 168
    .line 169
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    check-cast v3, Landroid/media/AudioAttributes;

    .line 173
    .line 174
    const/4 v4, -0x1

    .line 175
    invoke-virtual {v6, v2, v4, v3}, Landroid/os/Vibrator;->vibrate([JILandroid/media/AudioAttributes;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 176
    .line 177
    .line 178
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 179
    .line 180
    .line 181
    const-string v2, "hidden voip vibrate"

    .line 182
    .line 183
    if-nez p2, :cond_c

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_c
    move-object v0, p2

    .line 187
    :goto_4
    filled-new-array {v2, p1, v0}, [Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-static {p2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    sget-object p2, LE0/i;->a:LE0/i;

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :catchall_0
    move-exception p2

    .line 198
    goto :goto_5

    .line 199
    :catchall_1
    move-exception p2

    .line 200
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 201
    .line 202
    .line 203
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 204
    :goto_5
    new-instance v0, LE0/d;

    .line 205
    .line 206
    invoke-direct {v0, p2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    move-object p2, v0

    .line 210
    :goto_6
    invoke-static {p2}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    if-eqz p2, :cond_d

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 217
    .line 218
    .line 219
    const-string v0, "hidden voip vibrate fail"

    .line 220
    .line 221
    filled-new-array {v0, p1, p2}, [Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_d
    :goto_7
    invoke-virtual {p0}, Lr0/t1;->b0()V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method public final Q()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/t1;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    iget-wide v4, p0, Lr0/t1;->b:J

    .line 12
    .line 13
    sub-long/2addr v2, v4

    .line 14
    const-wide/16 v4, 0x7530

    .line 15
    .line 16
    cmp-long v2, v2, v4

    .line 17
    .line 18
    if-gtz v2, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    return-object v1
.end method

.method public final R(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lr0/t1;->e:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    const-wide/32 v2, 0x1b7740

    .line 9
    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    iget-object v0, p0, Lr0/t1;->d:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz p1, :cond_4

    .line 20
    .line 21
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    if-eqz v0, :cond_4

    .line 29
    .line 30
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    return v1

    .line 45
    :cond_4
    :goto_0
    const/4 p1, 0x1

    .line 46
    return p1
.end method

.method public final S()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr0/t1;->T()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lr0/t1;->Q()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final T()Z
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lr0/t1;->c:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x2ee0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public final U(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lr0/t1;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lr0/t1;->b:J

    .line 8
    .line 9
    const-string v0, "voip masked user"

    .line 10
    .line 11
    filled-new-array {v0, p2, p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final V(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lr0/t1;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lr0/t1;->e:J

    .line 8
    .line 9
    iget-wide v0, p0, Lr0/t1;->c:J

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lr0/t1;->a:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    iput-wide v2, p0, Lr0/t1;->c:J

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lr0/t1;->a:Ljava/lang/String;

    .line 25
    .line 26
    iput-wide v2, p0, Lr0/t1;->b:J

    .line 27
    .line 28
    invoke-virtual {p0}, Lr0/t1;->b0()V

    .line 29
    .line 30
    .line 31
    :cond_1
    if-nez p1, :cond_2

    .line 32
    .line 33
    const-string p1, "unknown"

    .line 34
    .line 35
    :cond_2
    const-string v0, "voip outgoing"

    .line 36
    .line 37
    filled-new-array {v0, p2, p1}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final Y(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p2}, Lr0/t1;->E(Landroid/content/Intent;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p2, :cond_9

    .line 7
    .line 8
    invoke-static {p3}, Lr0/t1;->J(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_0
    if-eqz p1, :cond_8

    .line 16
    .line 17
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    invoke-static {}, Lr0/t1;->A()Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-nez p2, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    sget-boolean p2, Lz0/i;->a:Z

    .line 32
    .line 33
    invoke-static {p1}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_3

    .line 38
    .line 39
    const-string p2, "skip voip hide for temporary unhide"

    .line 40
    .line 41
    filled-new-array {p2, p4, p1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return v0

    .line 49
    :cond_3
    sget-object p2, Lz0/e;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    sget-object p3, Lz0/e;->c:Ljava/util/Set;

    .line 60
    .line 61
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_5

    .line 66
    .line 67
    invoke-interface {p3}, Ljava/util/Set;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    invoke-interface {p3, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    goto :goto_1

    .line 79
    :cond_5
    :goto_0
    move p2, v0

    .line 80
    :goto_1
    if-eqz p2, :cond_6

    .line 81
    .line 82
    const-string p2, "skip voip hide for manager opened chat"

    .line 83
    .line 84
    filled-new-array {p2, p4, p1}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return v0

    .line 92
    :cond_6
    invoke-virtual {p0, p1}, Lr0/t1;->R(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eqz p2, :cond_7

    .line 97
    .line 98
    const-string p2, "skip voip hide for outgoing"

    .line 99
    .line 100
    filled-new-array {p2, p4, p1}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return v0

    .line 108
    :cond_7
    const/4 p1, 0x1

    .line 109
    return p1

    .line 110
    :cond_8
    :goto_2
    return v0

    .line 111
    :cond_9
    :goto_3
    invoke-virtual {p0, p1, p4}, Lr0/t1;->V(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return v0
.end method

.method public final Z(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lr0/t1;->Y(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

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
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lr0/t1;->T()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    const-string v0, "activity-current:"

    .line 16
    .line 17
    invoke-static {p4, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    const-string v0, "activity-guard:"

    .line 24
    .line 25
    invoke-static {p4, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    invoke-static {p2}, Lr0/t1;->C(Landroid/content/Intent;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    invoke-static {p3}, Lr0/t1;->I(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const-string p2, "skip voip surface hide without incoming evidence"

    .line 45
    .line 46
    filled-new-array {p2, p4, p1}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return v1

    .line 54
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 55
    return p1
.end method

.method public final b0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr0/t1;->v:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lr0/t1;->v:Ljava/util/ArrayList;

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    iget-object v1, p0, Lr0/t1;->v:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit v0

    .line 45
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lr0/t1;->a0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    return-void

    .line 64
    :goto_2
    monitor-exit v0

    .line 65
    throw v1
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    if-nez v6, :cond_0

    .line 14
    .line 15
    move-object/from16 v6, p1

    .line 16
    .line 17
    :cond_0
    invoke-direct {v5, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v5, v0, Lr0/t1;->q:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    move-object/from16 v6, p2

    .line 31
    .line 32
    iget-object v6, v6, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {}, Lr0/t1;->A()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    const-string v8, "enabled="

    .line 39
    .line 40
    invoke-static {v8, v7}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    sget-boolean v8, Lz0/i;->a:Z

    .line 45
    .line 46
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    const-string v9, "maskCount="

    .line 55
    .line 56
    invoke-static {v8, v9}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    const-string v9, "voip hook init"

    .line 61
    .line 62
    filled-new-array {v9, v5, v6, v7, v8}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v5}, Li0/a;->a([Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-boolean v5, v0, Lr0/t1;->g:Z

    .line 70
    .line 71
    const-string v6, "onCreate"

    .line 72
    .line 73
    const-class v7, Landroid/app/Activity;

    .line 74
    .line 75
    const-class v8, Landroid/os/Bundle;

    .line 76
    .line 77
    if-eqz v5, :cond_1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    iput-boolean v4, v0, Lr0/t1;->g:Z

    .line 81
    .line 82
    new-instance v5, Lr0/q1;

    .line 83
    .line 84
    invoke-direct {v5, v0, v3}, Lr0/q1;-><init>(Lr0/t1;I)V

    .line 85
    .line 86
    .line 87
    filled-new-array {v8, v5}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-static {v7, v6, v5}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    new-instance v5, Lr0/q1;

    .line 95
    .line 96
    invoke-direct {v5, v0, v4}, Lr0/q1;-><init>(Lr0/t1;I)V

    .line 97
    .line 98
    .line 99
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    const-string v9, "onResume"

    .line 104
    .line 105
    invoke-static {v7, v9, v5}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    new-instance v5, Lr0/q1;

    .line 109
    .line 110
    const/4 v9, 0x2

    .line 111
    invoke-direct {v5, v0, v9}, Lr0/q1;-><init>(Lr0/t1;I)V

    .line 112
    .line 113
    .line 114
    const-class v9, Landroid/content/Intent;

    .line 115
    .line 116
    filled-new-array {v9, v5}, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    const-string v9, "onNewIntent"

    .line 121
    .line 122
    invoke-static {v7, v9, v5}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-instance v5, Lr0/q1;

    .line 126
    .line 127
    invoke-direct {v5, v0, v1}, Lr0/q1;-><init>(Lr0/t1;I)V

    .line 128
    .line 129
    .line 130
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 131
    .line 132
    const-class v10, Landroid/view/KeyEvent;

    .line 133
    .line 134
    filled-new-array {v9, v10, v5}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    const-string v9, "onKeyDown"

    .line 139
    .line 140
    invoke-static {v7, v9, v5}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :goto_0
    iget-boolean v5, v0, Lr0/t1;->h:Z

    .line 144
    .line 145
    if-eqz v5, :cond_2

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_2
    iput-boolean v4, v0, Lr0/t1;->h:Z

    .line 149
    .line 150
    const-string v5, "startActivityForResult"

    .line 151
    .line 152
    const-string v9, "startActivity"

    .line 153
    .line 154
    const-string v10, "startActivities"

    .line 155
    .line 156
    filled-new-array {v9, v10, v5}, [Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v0, v7, v5}, Lr0/t1;->v(Ljava/lang/Class;[Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const-string v5, "startService"

    .line 164
    .line 165
    const-string v7, "startForegroundService"

    .line 166
    .line 167
    const-string v11, "bindService"

    .line 168
    .line 169
    filled-new-array {v9, v10, v5, v7, v11}, [Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    const-class v13, Landroid/content/ContextWrapper;

    .line 174
    .line 175
    invoke-virtual {v0, v13, v12}, Lr0/t1;->v(Ljava/lang/Class;[Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    const-string v12, "execStartActivity"

    .line 179
    .line 180
    filled-new-array {v12}, [Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v12

    .line 184
    const-class v13, Landroid/app/Instrumentation;

    .line 185
    .line 186
    invoke-virtual {v0, v13, v12}, Lr0/t1;->v(Ljava/lang/Class;[Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    const-string v12, "android.app.ContextImpl"

    .line 190
    .line 191
    invoke-static {v12}, Lr0/t1;->i(Ljava/lang/String;)Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    filled-new-array {v9, v10, v5, v7, v11}, [Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-virtual {v0, v12, v7}, Lr0/t1;->w(Ljava/lang/Class;[Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    const-string v7, "android.app.IActivityTaskManager$Stub$Proxy"

    .line 203
    .line 204
    invoke-static {v7}, Lr0/t1;->i(Ljava/lang/String;)Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    filled-new-array {v9}, [Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    invoke-virtual {v0, v7, v10}, Lr0/t1;->w(Ljava/lang/Class;[Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const-string v7, "android.app.IActivityManager$Stub$Proxy"

    .line 216
    .line 217
    invoke-static {v7}, Lr0/t1;->i(Ljava/lang/String;)Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    filled-new-array {v9, v5, v11}, [Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    invoke-virtual {v0, v7, v5}, Lr0/t1;->w(Ljava/lang/Class;[Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :goto_1
    iget-boolean v5, v0, Lr0/t1;->n:Z

    .line 229
    .line 230
    const-string v7, "clazz"

    .line 231
    .line 232
    const-string v9, "classLoader"

    .line 233
    .line 234
    const-string v10, "getDeclaredMethods(...)"

    .line 235
    .line 236
    if-eqz v5, :cond_4

    .line 237
    .line 238
    :cond_3
    move/from16 v16, v3

    .line 239
    .line 240
    goto/16 :goto_7

    .line 241
    .line 242
    :cond_4
    iput-boolean v4, v0, Lr0/t1;->n:Z

    .line 243
    .line 244
    iget-object v5, v0, Lr0/t1;->w:Ljava/util/Set;

    .line 245
    .line 246
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    if-eqz v11, :cond_3

    .line 255
    .line 256
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    check-cast v11, Ljava/lang/String;

    .line 261
    .line 262
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 263
    .line 264
    .line 265
    move-result-object v12

    .line 266
    invoke-virtual {v12}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 267
    .line 268
    .line 269
    move-result-object v12

    .line 270
    invoke-static {v11, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v12, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 277
    .line 278
    invoke-interface {v13, v12, v11}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    if-nez v11, :cond_5

    .line 283
    .line 284
    move/from16 v16, v3

    .line 285
    .line 286
    goto/16 :goto_6

    .line 287
    .line 288
    :cond_5
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    invoke-static {v11, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    new-instance v12, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 298
    .line 299
    .line 300
    array-length v13, v11

    .line 301
    move v14, v3

    .line 302
    :goto_3
    if-ge v14, v13, :cond_7

    .line 303
    .line 304
    aget-object v15, v11, v14

    .line 305
    .line 306
    move/from16 v16, v3

    .line 307
    .line 308
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    invoke-static {v3, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-eqz v3, :cond_6

    .line 317
    .line 318
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    array-length v3, v3

    .line 323
    if-ne v3, v4, :cond_6

    .line 324
    .line 325
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    aget-object v3, v3, v16

    .line 330
    .line 331
    invoke-virtual {v8, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    if-eqz v3, :cond_6

    .line 336
    .line 337
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    :cond_6
    add-int/2addr v14, v4

    .line 341
    move/from16 v3, v16

    .line 342
    .line 343
    goto :goto_3

    .line 344
    :cond_7
    move/from16 v16, v3

    .line 345
    .line 346
    new-instance v3, Ljava/util/HashSet;

    .line 347
    .line 348
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 349
    .line 350
    .line 351
    new-instance v11, Ljava/util/ArrayList;

    .line 352
    .line 353
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    :cond_8
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 361
    .line 362
    .line 363
    move-result v13

    .line 364
    if-eqz v13, :cond_9

    .line 365
    .line 366
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v13

    .line 370
    move-object v14, v13

    .line 371
    check-cast v14, Ljava/lang/reflect/Method;

    .line 372
    .line 373
    invoke-static {v14}, LN0/g;->b(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-static {v14}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v14

    .line 380
    invoke-virtual {v3, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v14

    .line 384
    if-eqz v14, :cond_8

    .line 385
    .line 386
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    goto :goto_4

    .line 390
    :cond_9
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v11

    .line 398
    if-eqz v11, :cond_a

    .line 399
    .line 400
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    check-cast v11, Ljava/lang/reflect/Method;

    .line 405
    .line 406
    invoke-static {v11}, LN0/g;->b(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    new-instance v12, Lr0/p1;

    .line 410
    .line 411
    invoke-direct {v12, v0}, Lr0/p1;-><init>(Lr0/t1;)V

    .line 412
    .line 413
    .line 414
    const-string v13, "voip hook activity guard fail"

    .line 415
    .line 416
    invoke-virtual {v0, v11, v13, v12}, Lr0/t1;->x(Ljava/lang/reflect/Method;Ljava/lang/String;LM0/a;)V

    .line 417
    .line 418
    .line 419
    goto :goto_5

    .line 420
    :cond_a
    :goto_6
    move/from16 v3, v16

    .line 421
    .line 422
    goto/16 :goto_2

    .line 423
    .line 424
    :goto_7
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    invoke-static {v3, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 436
    .line 437
    const-string v6, "com.tencent.mm.plugin.voip.ui.t0$$b"

    .line 438
    .line 439
    invoke-interface {v5, v3, v6}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    if-nez v3, :cond_b

    .line 444
    .line 445
    goto :goto_a

    .line 446
    :cond_b
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-static {v3, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    new-instance v5, Ljava/util/ArrayList;

    .line 454
    .line 455
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 456
    .line 457
    .line 458
    array-length v6, v3

    .line 459
    move/from16 v8, v16

    .line 460
    .line 461
    :goto_8
    if-ge v8, v6, :cond_d

    .line 462
    .line 463
    aget-object v11, v3, v8

    .line 464
    .line 465
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v12

    .line 469
    const-string v13, "invoke"

    .line 470
    .line 471
    invoke-static {v12, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v12

    .line 475
    if-eqz v12, :cond_c

    .line 476
    .line 477
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    move-result-object v12

    .line 481
    array-length v12, v12

    .line 482
    if-ne v12, v4, :cond_c

    .line 483
    .line 484
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    :cond_c
    add-int/2addr v8, v4

    .line 488
    goto :goto_8

    .line 489
    :cond_d
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 494
    .line 495
    .line 496
    move-result v5

    .line 497
    if-eqz v5, :cond_e

    .line 498
    .line 499
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    check-cast v5, Ljava/lang/reflect/Method;

    .line 504
    .line 505
    new-instance v6, Lr0/q1;

    .line 506
    .line 507
    invoke-direct {v6, v0, v2}, Lr0/q1;-><init>(Lr0/t1;I)V

    .line 508
    .line 509
    .line 510
    invoke-static {v5, v6}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 511
    .line 512
    .line 513
    goto :goto_9

    .line 514
    :cond_e
    :goto_a
    iget-boolean v3, v0, Lr0/t1;->k:Z

    .line 515
    .line 516
    if-eqz v3, :cond_f

    .line 517
    .line 518
    goto/16 :goto_13

    .line 519
    .line 520
    :cond_f
    iput-boolean v4, v0, Lr0/t1;->k:Z

    .line 521
    .line 522
    const-string v3, "android.app.Service"

    .line 523
    .line 524
    const-class v5, Landroid/app/Service;

    .line 525
    .line 526
    invoke-virtual {v0, v5, v3}, Lr0/t1;->y(Ljava/lang/Class;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    const-string v3, "com.tencent.mm.plugin.voip.widget.VoipNewForegroundService"

    .line 530
    .line 531
    invoke-virtual {v0, v3}, Lr0/t1;->z(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    const-string v6, "com.tencent.mm.plugin.voip.widget.VoipForegroundService"

    .line 535
    .line 536
    invoke-virtual {v0, v6}, Lr0/t1;->z(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    iget-boolean v8, v0, Lr0/t1;->l:Z

    .line 540
    .line 541
    if-eqz v8, :cond_10

    .line 542
    .line 543
    goto/16 :goto_f

    .line 544
    .line 545
    :cond_10
    iput-boolean v4, v0, Lr0/t1;->l:Z

    .line 546
    .line 547
    const-string v8, "com.tencent.mm.plugin.voip.widget.VoipSmallService"

    .line 548
    .line 549
    filled-new-array {v8, v3, v6}, [Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    invoke-static {v3}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    :cond_11
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 562
    .line 563
    .line 564
    move-result v6

    .line 565
    if-eqz v6, :cond_17

    .line 566
    .line 567
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v6

    .line 571
    check-cast v6, Ljava/lang/String;

    .line 572
    .line 573
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 574
    .line 575
    .line 576
    move-result-object v8

    .line 577
    invoke-virtual {v8}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 578
    .line 579
    .line 580
    move-result-object v8

    .line 581
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    invoke-static {v8, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 588
    .line 589
    invoke-interface {v11, v8, v6}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    move-result-object v6

    .line 593
    if-nez v6, :cond_12

    .line 594
    .line 595
    goto :goto_b

    .line 596
    :cond_12
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 597
    .line 598
    .line 599
    move-result-object v6

    .line 600
    invoke-static {v6, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    new-instance v8, Ljava/util/ArrayList;

    .line 604
    .line 605
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 606
    .line 607
    .line 608
    array-length v11, v6

    .line 609
    move/from16 v12, v16

    .line 610
    .line 611
    :goto_c
    if-ge v12, v11, :cond_14

    .line 612
    .line 613
    aget-object v13, v6, v12

    .line 614
    .line 615
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v14

    .line 619
    const-string v15, "onBind"

    .line 620
    .line 621
    invoke-static {v14, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v14

    .line 625
    if-eqz v14, :cond_13

    .line 626
    .line 627
    invoke-static {v13}, Lr0/t1;->q(Ljava/lang/reflect/Method;)Z

    .line 628
    .line 629
    .line 630
    move-result v14

    .line 631
    if-eqz v14, :cond_13

    .line 632
    .line 633
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    :cond_13
    add-int/2addr v12, v4

    .line 637
    goto :goto_c

    .line 638
    :cond_14
    new-instance v6, Ljava/util/HashSet;

    .line 639
    .line 640
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 641
    .line 642
    .line 643
    new-instance v11, Ljava/util/ArrayList;

    .line 644
    .line 645
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 649
    .line 650
    .line 651
    move-result-object v8

    .line 652
    :cond_15
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 653
    .line 654
    .line 655
    move-result v12

    .line 656
    if-eqz v12, :cond_16

    .line 657
    .line 658
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v12

    .line 662
    move-object v13, v12

    .line 663
    check-cast v13, Ljava/lang/reflect/Method;

    .line 664
    .line 665
    invoke-static {v13}, LN0/g;->b(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    invoke-static {v13}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v13

    .line 672
    invoke-virtual {v6, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v13

    .line 676
    if-eqz v13, :cond_15

    .line 677
    .line 678
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    goto :goto_d

    .line 682
    :cond_16
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 683
    .line 684
    .line 685
    move-result-object v6

    .line 686
    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 687
    .line 688
    .line 689
    move-result v8

    .line 690
    if-eqz v8, :cond_11

    .line 691
    .line 692
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v8

    .line 696
    check-cast v8, Ljava/lang/reflect/Method;

    .line 697
    .line 698
    invoke-static {v8}, LN0/g;->b(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    new-instance v11, Lr0/m1;

    .line 702
    .line 703
    invoke-direct {v11, v0, v8, v1}, Lr0/m1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 704
    .line 705
    .line 706
    const-string v12, "voip hook service bind fail"

    .line 707
    .line 708
    invoke-virtual {v0, v8, v12, v11}, Lr0/t1;->x(Ljava/lang/reflect/Method;Ljava/lang/String;LM0/a;)V

    .line 709
    .line 710
    .line 711
    goto :goto_e

    .line 712
    :cond_17
    :goto_f
    iget-boolean v1, v0, Lr0/t1;->m:Z

    .line 713
    .line 714
    if-eqz v1, :cond_18

    .line 715
    .line 716
    goto/16 :goto_13

    .line 717
    .line 718
    :cond_18
    iput-boolean v4, v0, Lr0/t1;->m:Z

    .line 719
    .line 720
    invoke-static {v5}, Lr0/t1;->f(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    new-instance v3, Ljava/util/ArrayList;

    .line 725
    .line 726
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    :cond_19
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    if-eqz v5, :cond_1a

    .line 738
    .line 739
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v5

    .line 743
    move-object v6, v5

    .line 744
    check-cast v6, Ljava/lang/reflect/Method;

    .line 745
    .line 746
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v7

    .line 750
    const-string v8, "startForeground"

    .line 751
    .line 752
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v7

    .line 756
    if-eqz v7, :cond_19

    .line 757
    .line 758
    invoke-static {v6}, Lr0/t1;->r(Ljava/lang/reflect/Method;)Z

    .line 759
    .line 760
    .line 761
    move-result v6

    .line 762
    if-eqz v6, :cond_19

    .line 763
    .line 764
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    goto :goto_10

    .line 768
    :cond_1a
    new-instance v1, Ljava/util/HashSet;

    .line 769
    .line 770
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 771
    .line 772
    .line 773
    new-instance v5, Ljava/util/ArrayList;

    .line 774
    .line 775
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    :cond_1b
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 783
    .line 784
    .line 785
    move-result v6

    .line 786
    if-eqz v6, :cond_1c

    .line 787
    .line 788
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v6

    .line 792
    move-object v7, v6

    .line 793
    check-cast v7, Ljava/lang/reflect/Method;

    .line 794
    .line 795
    invoke-static {v7}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v7

    .line 799
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v7

    .line 803
    if-eqz v7, :cond_1b

    .line 804
    .line 805
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    goto :goto_11

    .line 809
    :cond_1c
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 814
    .line 815
    .line 816
    move-result v3

    .line 817
    if-eqz v3, :cond_1d

    .line 818
    .line 819
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v3

    .line 823
    check-cast v3, Ljava/lang/reflect/Method;

    .line 824
    .line 825
    new-instance v5, Lr0/m1;

    .line 826
    .line 827
    invoke-direct {v5, v0, v3, v2}, Lr0/m1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 828
    .line 829
    .line 830
    const-string v6, "voip hook startForeground fail"

    .line 831
    .line 832
    invoke-virtual {v0, v3, v6, v5}, Lr0/t1;->x(Ljava/lang/reflect/Method;Ljava/lang/String;LM0/a;)V

    .line 833
    .line 834
    .line 835
    goto :goto_12

    .line 836
    :cond_1d
    :goto_13
    iget-boolean v1, v0, Lr0/t1;->o:Z

    .line 837
    .line 838
    if-eqz v1, :cond_1e

    .line 839
    .line 840
    goto/16 :goto_1b

    .line 841
    .line 842
    :cond_1e
    iput-boolean v4, v0, Lr0/t1;->o:Z

    .line 843
    .line 844
    const-string v1, "android.view.WindowManagerImpl"

    .line 845
    .line 846
    const-string v3, "android.view.WindowManagerGlobal"

    .line 847
    .line 848
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v1

    .line 852
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 853
    .line 854
    .line 855
    move-result-object v1

    .line 856
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    :cond_1f
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 861
    .line 862
    .line 863
    move-result v3

    .line 864
    if-eqz v3, :cond_27

    .line 865
    .line 866
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    check-cast v3, Ljava/lang/String;

    .line 871
    .line 872
    invoke-static {v3}, Lr0/t1;->i(Ljava/lang/String;)Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    move-result-object v3

    .line 876
    if-nez v3, :cond_20

    .line 877
    .line 878
    goto :goto_14

    .line 879
    :cond_20
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 880
    .line 881
    .line 882
    move-result-object v3

    .line 883
    invoke-static {v3, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    new-instance v5, Ljava/util/ArrayList;

    .line 887
    .line 888
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 889
    .line 890
    .line 891
    array-length v6, v3

    .line 892
    move/from16 v7, v16

    .line 893
    .line 894
    :goto_15
    if-ge v7, v6, :cond_24

    .line 895
    .line 896
    aget-object v8, v3, v7

    .line 897
    .line 898
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v9

    .line 902
    const-string v11, "addView"

    .line 903
    .line 904
    invoke-static {v9, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 905
    .line 906
    .line 907
    move-result v9

    .line 908
    if-eqz v9, :cond_23

    .line 909
    .line 910
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    move-result-object v9

    .line 914
    const-string v11, "getParameterTypes(...)"

    .line 915
    .line 916
    invoke-static {v9, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    array-length v12, v9

    .line 920
    move/from16 v13, v16

    .line 921
    .line 922
    :goto_16
    if-ge v13, v12, :cond_23

    .line 923
    .line 924
    aget-object v14, v9, v13

    .line 925
    .line 926
    const-class v15, Landroid/view/View;

    .line 927
    .line 928
    invoke-virtual {v15, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 929
    .line 930
    .line 931
    move-result v14

    .line 932
    if-eqz v14, :cond_22

    .line 933
    .line 934
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    move-result-object v9

    .line 938
    invoke-static {v9, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    array-length v11, v9

    .line 942
    move/from16 v12, v16

    .line 943
    .line 944
    :goto_17
    if-ge v12, v11, :cond_23

    .line 945
    .line 946
    aget-object v13, v9, v12

    .line 947
    .line 948
    const-class v14, Landroid/view/ViewGroup$LayoutParams;

    .line 949
    .line 950
    invoke-virtual {v14, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 951
    .line 952
    .line 953
    move-result v13

    .line 954
    if-eqz v13, :cond_21

    .line 955
    .line 956
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 957
    .line 958
    .line 959
    goto :goto_18

    .line 960
    :cond_21
    add-int/2addr v12, v4

    .line 961
    goto :goto_17

    .line 962
    :cond_22
    add-int/2addr v13, v4

    .line 963
    goto :goto_16

    .line 964
    :cond_23
    :goto_18
    add-int/2addr v7, v4

    .line 965
    goto :goto_15

    .line 966
    :cond_24
    new-instance v3, Ljava/util/HashSet;

    .line 967
    .line 968
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 969
    .line 970
    .line 971
    new-instance v6, Ljava/util/ArrayList;

    .line 972
    .line 973
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 977
    .line 978
    .line 979
    move-result-object v5

    .line 980
    :cond_25
    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 981
    .line 982
    .line 983
    move-result v7

    .line 984
    if-eqz v7, :cond_26

    .line 985
    .line 986
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v7

    .line 990
    move-object v8, v7

    .line 991
    check-cast v8, Ljava/lang/reflect/Method;

    .line 992
    .line 993
    invoke-static {v8}, LN0/g;->b(Ljava/lang/Object;)V

    .line 994
    .line 995
    .line 996
    invoke-static {v8}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v8

    .line 1000
    invoke-virtual {v3, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v8

    .line 1004
    if-eqz v8, :cond_25

    .line 1005
    .line 1006
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1007
    .line 1008
    .line 1009
    goto :goto_19

    .line 1010
    :cond_26
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v3

    .line 1014
    :goto_1a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1015
    .line 1016
    .line 1017
    move-result v5

    .line 1018
    if-eqz v5, :cond_1f

    .line 1019
    .line 1020
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v5

    .line 1024
    check-cast v5, Ljava/lang/reflect/Method;

    .line 1025
    .line 1026
    invoke-static {v5}, LN0/g;->b(Ljava/lang/Object;)V

    .line 1027
    .line 1028
    .line 1029
    new-instance v6, Lr0/m1;

    .line 1030
    .line 1031
    invoke-direct {v6, v0, v5, v4}, Lr0/m1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 1032
    .line 1033
    .line 1034
    const-string v7, "voip hook floating window fail"

    .line 1035
    .line 1036
    invoke-virtual {v0, v5, v7, v6}, Lr0/t1;->x(Ljava/lang/reflect/Method;Ljava/lang/String;LM0/a;)V

    .line 1037
    .line 1038
    .line 1039
    goto :goto_1a

    .line 1040
    :cond_27
    :goto_1b
    iget-boolean v1, v0, Lr0/t1;->p:Z

    .line 1041
    .line 1042
    if-eqz v1, :cond_28

    .line 1043
    .line 1044
    goto :goto_1c

    .line 1045
    :cond_28
    iput-boolean v4, v0, Lr0/t1;->p:Z

    .line 1046
    .line 1047
    const-string v1, "start"

    .line 1048
    .line 1049
    filled-new-array {v1}, [Ljava/lang/String;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v1

    .line 1053
    const-class v3, Landroid/media/MediaPlayer;

    .line 1054
    .line 1055
    const-string v5, "mediaPlayer"

    .line 1056
    .line 1057
    invoke-virtual {v0, v3, v5, v1}, Lr0/t1;->u(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)V

    .line 1058
    .line 1059
    .line 1060
    const-string v1, "play"

    .line 1061
    .line 1062
    filled-new-array {v1}, [Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v3

    .line 1066
    const-class v5, Landroid/media/SoundPool;

    .line 1067
    .line 1068
    const-string v6, "soundPool"

    .line 1069
    .line 1070
    invoke-virtual {v0, v5, v6, v3}, Lr0/t1;->u(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)V

    .line 1071
    .line 1072
    .line 1073
    filled-new-array {v1}, [Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v3

    .line 1077
    const-class v5, Landroid/media/Ringtone;

    .line 1078
    .line 1079
    const-string v6, "ringtone"

    .line 1080
    .line 1081
    invoke-virtual {v0, v5, v6, v3}, Lr0/t1;->u(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)V

    .line 1082
    .line 1083
    .line 1084
    filled-new-array {v1}, [Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v1

    .line 1088
    const-class v3, Landroid/media/AudioTrack;

    .line 1089
    .line 1090
    const-string v5, "audioTrack"

    .line 1091
    .line 1092
    invoke-virtual {v0, v3, v5, v1}, Lr0/t1;->u(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)V

    .line 1093
    .line 1094
    .line 1095
    const-string v1, "vibrate"

    .line 1096
    .line 1097
    filled-new-array {v1}, [Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v3

    .line 1101
    const-class v5, Landroid/os/Vibrator;

    .line 1102
    .line 1103
    const-string v6, "vibrator"

    .line 1104
    .line 1105
    invoke-virtual {v0, v5, v6, v3}, Lr0/t1;->u(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)V

    .line 1106
    .line 1107
    .line 1108
    const-string v3, "android.os.SystemVibrator"

    .line 1109
    .line 1110
    invoke-static {v3}, Lr0/t1;->i(Ljava/lang/String;)Ljava/lang/Class;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v3

    .line 1114
    const-string v5, "systemVibrator"

    .line 1115
    .line 1116
    filled-new-array {v1}, [Ljava/lang/String;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v6

    .line 1120
    invoke-virtual {v0, v3, v5, v6}, Lr0/t1;->u(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    const-string v3, "android.os.VibratorManager"

    .line 1124
    .line 1125
    invoke-static {v3}, Lr0/t1;->i(Ljava/lang/String;)Ljava/lang/Class;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v3

    .line 1129
    const-string v5, "vibratorManager"

    .line 1130
    .line 1131
    filled-new-array {v1}, [Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v1

    .line 1135
    invoke-virtual {v0, v3, v5, v1}, Lr0/t1;->u(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)V

    .line 1136
    .line 1137
    .line 1138
    :goto_1c
    iget-boolean v1, v0, Lr0/t1;->j:Z

    .line 1139
    .line 1140
    if-eqz v1, :cond_29

    .line 1141
    .line 1142
    goto/16 :goto_20

    .line 1143
    .line 1144
    :cond_29
    iput-boolean v4, v0, Lr0/t1;->j:Z

    .line 1145
    .line 1146
    const-class v1, Landroid/app/NotificationManager;

    .line 1147
    .line 1148
    invoke-static {v1}, Lr0/t1;->f(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v1

    .line 1152
    new-instance v3, Ljava/util/ArrayList;

    .line 1153
    .line 1154
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v1

    .line 1161
    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1162
    .line 1163
    .line 1164
    move-result v5

    .line 1165
    if-eqz v5, :cond_2b

    .line 1166
    .line 1167
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v5

    .line 1171
    move-object v6, v5

    .line 1172
    check-cast v6, Ljava/lang/reflect/Method;

    .line 1173
    .line 1174
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v7

    .line 1178
    const-string v8, "getName(...)"

    .line 1179
    .line 1180
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1181
    .line 1182
    .line 1183
    const-string v8, "notify"

    .line 1184
    .line 1185
    move/from16 v9, v16

    .line 1186
    .line 1187
    invoke-static {v7, v9, v8}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v7

    .line 1191
    if-eqz v7, :cond_2a

    .line 1192
    .line 1193
    invoke-static {v6}, Lr0/t1;->r(Ljava/lang/reflect/Method;)Z

    .line 1194
    .line 1195
    .line 1196
    move-result v6

    .line 1197
    if-eqz v6, :cond_2a

    .line 1198
    .line 1199
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    :cond_2a
    const/16 v16, 0x0

    .line 1203
    .line 1204
    goto :goto_1d

    .line 1205
    :cond_2b
    new-instance v1, Ljava/util/HashSet;

    .line 1206
    .line 1207
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1208
    .line 1209
    .line 1210
    new-instance v5, Ljava/util/ArrayList;

    .line 1211
    .line 1212
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v3

    .line 1219
    :cond_2c
    :goto_1e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1220
    .line 1221
    .line 1222
    move-result v6

    .line 1223
    if-eqz v6, :cond_2d

    .line 1224
    .line 1225
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v6

    .line 1229
    move-object v7, v6

    .line 1230
    check-cast v7, Ljava/lang/reflect/Method;

    .line 1231
    .line 1232
    invoke-static {v7}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v7

    .line 1236
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v7

    .line 1240
    if-eqz v7, :cond_2c

    .line 1241
    .line 1242
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1243
    .line 1244
    .line 1245
    goto :goto_1e

    .line 1246
    :cond_2d
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v1

    .line 1250
    :goto_1f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1251
    .line 1252
    .line 1253
    move-result v3

    .line 1254
    if-eqz v3, :cond_2e

    .line 1255
    .line 1256
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v3

    .line 1260
    check-cast v3, Ljava/lang/reflect/Method;

    .line 1261
    .line 1262
    new-instance v5, Lr0/m1;

    .line 1263
    .line 1264
    const/4 v9, 0x0

    .line 1265
    invoke-direct {v5, v0, v3, v9}, Lr0/m1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 1266
    .line 1267
    .line 1268
    const-string v6, "voip hook notification fail"

    .line 1269
    .line 1270
    invoke-virtual {v0, v3, v6, v5}, Lr0/t1;->x(Ljava/lang/reflect/Method;Ljava/lang/String;LM0/a;)V

    .line 1271
    .line 1272
    .line 1273
    goto :goto_1f

    .line 1274
    :cond_2e
    :goto_20
    iget-boolean v1, v0, Lr0/t1;->i:Z

    .line 1275
    .line 1276
    if-eqz v1, :cond_2f

    .line 1277
    .line 1278
    goto :goto_22

    .line 1279
    :cond_2f
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v1

    .line 1283
    instance-of v3, v1, Landroid/app/Application;

    .line 1284
    .line 1285
    if-eqz v3, :cond_30

    .line 1286
    .line 1287
    check-cast v1, Landroid/app/Application;

    .line 1288
    .line 1289
    goto :goto_21

    .line 1290
    :cond_30
    const/4 v1, 0x0

    .line 1291
    :goto_21
    if-nez v1, :cond_31

    .line 1292
    .line 1293
    :goto_22
    return-void

    .line 1294
    :cond_31
    iput-boolean v4, v0, Lr0/t1;->i:Z

    .line 1295
    .line 1296
    new-instance v3, Lr0/j;

    .line 1297
    .line 1298
    invoke-direct {v3, v0, v2}, Lr0/j;-><init>(Le0/a;I)V

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v1, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1302
    .line 1303
    .line 1304
    const-string v1, "voip activity callbacks registered"

    .line 1305
    .line 1306
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v1

    .line 1310
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 1311
    .line 1312
    .line 1313
    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lr0/t1;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lr0/t1;->a:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lr0/t1;->e:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lr0/t1;->d:Ljava/lang/String;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iput-wide v2, p0, Lr0/t1;->c:J

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lr0/t1;->a:Ljava/lang/String;

    .line 28
    .line 29
    iput-wide v2, p0, Lr0/t1;->b:J

    .line 30
    .line 31
    iput-object v0, p0, Lr0/t1;->d:Ljava/lang/String;

    .line 32
    .line 33
    iput-wide v2, p0, Lr0/t1;->e:J

    .line 34
    .line 35
    invoke-virtual {p0}, Lr0/t1;->b0()V

    .line 36
    .line 37
    .line 38
    const-string v0, "voip suppression cleared"

    .line 39
    .line 40
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final k(Landroid/content/Intent;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    :cond_1
    const-string v0, "com.tencent.mm.ui.LauncherUI"

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    const-string v0, "keep voip suppression on launcher intent"

    .line 27
    .line 28
    filled-new-array {v0, p2, p1}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const-string v2, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 37
    .line 38
    invoke-static {p1, v2, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_4

    .line 43
    .line 44
    const-string v2, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"

    .line 45
    .line 46
    invoke-static {p1, v2, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    return-void

    .line 60
    :cond_4
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p2, ":"

    .line 69
    .line 70
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p0, p1}, Lr0/t1;->j(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final m(Landroid/app/Activity;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lr0/t1;->W(Landroid/content/Intent;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p0}, Lr0/t1;->S()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final s(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "activity:"

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0, p2}, Lr0/t1;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const/high16 v1, 0x280000

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const v0, 0x1020002

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x4

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-virtual {p1, v0}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    goto :goto_2

    .line 76
    :goto_1
    new-instance v1, LE0/d;

    .line 77
    .line 78
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    move-object v0, v1

    .line 82
    :goto_2
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    const-string v1, "hide voip activity fail"

    .line 89
    .line 90
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v0, "hide voip activity"

    .line 106
    .line 107
    filled-new-array {v0, p1, p2}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final t(Landroid/app/Activity;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lr0/t1;->m(Landroid/app/Activity;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_2
    invoke-static {v2}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "activity-current:"

    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {p0, v0, v1, v2, v3}, Lr0/t1;->Z(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    :goto_0
    return-void

    .line 53
    :cond_3
    invoke-virtual {p0, p1, v0}, Lr0/t1;->s(Landroid/app/Activity;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final varargs u(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_4

    .line 4
    .line 5
    :cond_0
    invoke-static {p1}, Lr0/t1;->f(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v3, v2

    .line 29
    check-cast v3, Ljava/lang/reflect/Method;

    .line 30
    .line 31
    array-length v4, p3

    .line 32
    const/4 v5, 0x0

    .line 33
    :goto_1
    if-ge v5, v4, :cond_1

    .line 34
    .line 35
    aget-object v6, p3, v5

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v7, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    new-instance v0, Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v2, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_5

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    move-object v4, v3

    .line 79
    check-cast v4, Ljava/lang/reflect/Method;

    .line 80
    .line 81
    invoke-static {v4}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_4

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v0, "|"

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    const/16 v3, 0x3e

    .line 109
    .line 110
    invoke-static {p3, v0, v1, v3}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    const-string v0, "voip audio method not found"

    .line 115
    .line 116
    filled-new-array {v0, p1, p3}, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    if-eqz p3, :cond_7

    .line 132
    .line 133
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    check-cast p3, Ljava/lang/reflect/Method;

    .line 138
    .line 139
    new-instance v0, Lr0/o1;

    .line 140
    .line 141
    invoke-direct {v0, p0, p3, p2}, Lr0/o1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const-string v1, "voip hook audio side effect fail"

    .line 145
    .line 146
    invoke-virtual {p0, p3, v1, v0}, Lr0/t1;->x(Ljava/lang/reflect/Method;Ljava/lang/String;LM0/a;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_7
    :goto_4
    return-void
.end method

.method public final varargs v(Ljava/lang/Class;[Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {p1}, Lr0/t1;->f(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, p2

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_6

    .line 8
    .line 9
    aget-object v3, p2, v2

    .line 10
    .line 11
    new-instance v4, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-eqz v6, :cond_1

    .line 25
    .line 26
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    move-object v7, v6

    .line 31
    check-cast v7, Ljava/lang/reflect/Method;

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-static {v8, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_0

    .line 42
    .line 43
    invoke-static {v7}, Lr0/t1;->q(Ljava/lang/reflect/Method;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_0

    .line 48
    .line 49
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance v5, Ljava/util/HashSet;

    .line 54
    .line 55
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v6, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_3

    .line 72
    .line 73
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    move-object v8, v7

    .line 78
    check-cast v8, Ljava/lang/reflect/Method;

    .line 79
    .line 80
    invoke-static {v8}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_2

    .line 89
    .line 90
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_4

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const-string v5, "voip intent starter not found"

    .line 105
    .line 106
    filled-new-array {v5, v4, v3}, [Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-static {v3}, Li0/a;->d([Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_5

    .line 122
    .line 123
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    check-cast v4, Ljava/lang/reflect/Method;

    .line 128
    .line 129
    new-instance v5, Lr0/m1;

    .line 130
    .line 131
    const/4 v6, 0x2

    .line 132
    invoke-direct {v5, p0, v4, v6}, Lr0/m1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 133
    .line 134
    .line 135
    const-string v6, "voip hook intent starter fail"

    .line 136
    .line 137
    invoke-virtual {p0, v4, v6, v5}, Lr0/t1;->x(Ljava/lang/reflect/Method;Ljava/lang/String;LM0/a;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_6
    return-void
.end method

.method public final varargs w(Ljava/lang/Class;[Ljava/lang/String;)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_4

    .line 4
    .line 5
    :cond_0
    invoke-static {p1}, Lr0/t1;->f(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v3, v2

    .line 29
    check-cast v3, Ljava/lang/reflect/Method;

    .line 30
    .line 31
    array-length v4, p2

    .line 32
    const/4 v5, 0x0

    .line 33
    move v6, v5

    .line 34
    :goto_1
    if-ge v6, v4, :cond_1

    .line 35
    .line 36
    aget-object v7, p2, v6

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    const-string v9, "getName(...)"

    .line 43
    .line 44
    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v8, v5, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    invoke-static {v3}, Lr0/t1;->q(Ljava/lang/reflect/Method;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    new-instance v0, Ljava/util/HashSet;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance v2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    move-object v4, v3

    .line 91
    check-cast v4, Ljava/lang/reflect/Method;

    .line 92
    .line 93
    invoke-static {v4}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_6

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const-string v0, "|"

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    const/16 v3, 0x3e

    .line 121
    .line 122
    invoke-static {p2, v0, v1, v3}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    const-string v0, "voip system intent starter not found"

    .line 127
    .line 128
    filled-new-array {v0, p1, p2}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-eqz p2, :cond_7

    .line 144
    .line 145
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    check-cast p2, Ljava/lang/reflect/Method;

    .line 150
    .line 151
    new-instance v0, Lr0/m1;

    .line 152
    .line 153
    const/4 v1, 0x5

    .line 154
    invoke-direct {v0, p0, p2, v1}, Lr0/m1;-><init>(Lr0/t1;Ljava/lang/reflect/Method;I)V

    .line 155
    .line 156
    .line 157
    const-string v1, "voip hook system intent starter fail"

    .line 158
    .line 159
    invoke-virtual {p0, p2, v1, v0}, Lr0/t1;->x(Ljava/lang/reflect/Method;Ljava/lang/String;LM0/a;)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_7
    :goto_4
    return-void
.end method

.method public final x(Ljava/lang/reflect/Method;Ljava/lang/String;LM0/a;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {p1}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lr0/t1;->u:Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v2, 0x1

    .line 26
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p3}, LM0/a;->b()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    check-cast p3, Lde/robv/android/xposed/XC_MethodHook;

    .line 34
    .line 35
    invoke-static {p1, p3}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 36
    .line 37
    .line 38
    sget-object p1, LE0/i;->a:LE0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    new-instance p3, LE0/d;

    .line 43
    .line 44
    invoke-direct {p3, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    move-object p1, p3

    .line 48
    :goto_0
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    filled-new-array {p2, v0, p1}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    return-void
.end method

.method public final y(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    :goto_0
    const-string v2, "getDeclaredMethods(...)"

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-class v3, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v3}, LF0/q;->f0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v1, Ljava/util/HashSet;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v3, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    move-object v5, v4

    .line 59
    check-cast v5, Ljava/lang/reflect/Method;

    .line 60
    .line 61
    invoke-static {v5}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_1

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_4

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

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
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    const-string v6, "onStartCommand"

    .line 102
    .line 103
    invoke-static {v5, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_3

    .line 108
    .line 109
    invoke-static {v4}, Lr0/t1;->q(Ljava/lang/reflect/Method;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_3

    .line 114
    .line 115
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    new-instance v1, Ljava/util/HashSet;

    .line 120
    .line 121
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 122
    .line 123
    .line 124
    new-instance v3, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_6

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    move-object v5, v4

    .line 144
    check-cast v5, Ljava/lang/reflect/Method;

    .line 145
    .line 146
    invoke-static {v5}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_5

    .line 155
    .line 156
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    new-instance v0, Lr0/p1;

    .line 174
    .line 175
    invoke-direct {v0, p0}, Lr0/p1;-><init>(Lr0/t1;)V

    .line 176
    .line 177
    .line 178
    const/16 v1, 0x1e

    .line 179
    .line 180
    const-string v2, ","

    .line 181
    .line 182
    invoke-static {p1, v2, v0, v1}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    const-string v0, "voip service onStartCommand not found"

    .line 187
    .line 188
    filled-new-array {v0, p2, p1}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_8

    .line 205
    .line 206
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Ljava/lang/reflect/Method;

    .line 211
    .line 212
    new-instance v1, Lr0/o1;

    .line 213
    .line 214
    invoke-direct {v1, p0, p2, v0}, Lr0/o1;-><init>(Lr0/t1;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 215
    .line 216
    .line 217
    const-string v2, "voip hook service start fail"

    .line 218
    .line 219
    invoke-virtual {p0, v0, v2, v1}, Lr0/t1;->x(Ljava/lang/reflect/Method;Ljava/lang/String;LM0/a;)V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_8
    return-void
.end method

.method public final z(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "classLoader"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 15
    .line 16
    invoke-interface {v1, v0, p1}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0, v0, p1}, Lr0/t1;->y(Ljava/lang/Class;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
