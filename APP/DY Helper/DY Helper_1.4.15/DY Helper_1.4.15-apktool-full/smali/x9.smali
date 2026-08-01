.class public abstract Lx9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/Set;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile δ:J

.field public static volatile ε:Landroid/content/Context;

.field public static volatile ζ:Landroid/content/SharedPreferences;

.field public static volatile η:Landroid/content/SharedPreferences;

.field public static volatile θ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lx9;->β:Ljava/util/Set;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lx9;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    const-string v0, ""

    .line 28
    .line 29
    sput-object v0, Lx9;->θ:Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method public static α()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->α()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static β()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->δ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static γ()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->ζ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static δ()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->η()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static ε()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->θ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static ζ()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->ι()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static η()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->κ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static θ()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->λ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static ι()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->μ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static κ()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->π()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->ν()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static λ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

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
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_c

    .line 14
    .line 15
    const-string v0, "0"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    sget-object v0, Lx9;->θ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->φ()V

    .line 34
    .line 35
    .line 36
    :cond_1
    sput-object p0, Lx9;->θ:Ljava/lang/String;

    .line 37
    .line 38
    sget-object v0, Lx9;->ε:Landroid/content/Context;

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_2
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const/4 v4, 0x0

    .line 62
    move v5, v4

    .line 63
    :goto_0
    if-ge v5, v3, :cond_5

    .line 64
    .line 65
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    invoke-static {v6}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-nez v7, :cond_3

    .line 74
    .line 75
    const/16 v7, 0x5f

    .line 76
    .line 77
    if-eq v6, v7, :cond_3

    .line 78
    .line 79
    const/16 v7, 0x2d

    .line 80
    .line 81
    if-ne v6, v7, :cond_4

    .line 82
    .line 83
    :cond_3
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 84
    .line 85
    .line 86
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_6

    .line 98
    .line 99
    const-string v1, "unknown"

    .line 100
    .line 101
    :cond_6
    const-string v2, "dyhelper_beta_uid_"

    .line 102
    .line 103
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    const-string v1, "__beta_schema_version"

    .line 115
    .line 116
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    const/4 v3, 0x3

    .line 121
    if-lt v2, v3, :cond_7

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_7
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const-string v2, "__beta_account_uid"

    .line 137
    .line 138
    invoke-interface {v1, v2, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 143
    .line 144
    .line 145
    sget-object v1, Lx9;->ζ:Landroid/content/SharedPreferences;

    .line 146
    .line 147
    if-eqz v1, :cond_8

    .line 148
    .line 149
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-eqz v1, :cond_8

    .line 154
    .line 155
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-eqz v1, :cond_8

    .line 160
    .line 161
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 162
    .line 163
    .line 164
    :cond_8
    :goto_1
    sput-object v0, Lx9;->η:Landroid/content/SharedPreferences;

    .line 165
    .line 166
    const-string v1, "opaque_ticket"

    .line 167
    .line 168
    const-string v2, ""

    .line 169
    .line 170
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    if-nez v3, :cond_9

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_9
    move-object v2, v3

    .line 178
    :goto_2
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-nez v3, :cond_a

    .line 191
    .line 192
    invoke-static {p0, v2}, Lcom/example/dyhelper/beta/BetaNativeBridge;->χ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-eqz v3, :cond_a

    .line 197
    .line 198
    const/4 v4, 0x1

    .line 199
    :cond_a
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-nez v2, :cond_b

    .line 204
    .line 205
    if-nez v4, :cond_b

    .line 206
    .line 207
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 216
    .line 217
    .line 218
    :cond_b
    const-string v0, " source="

    .line 219
    .line 220
    const-string v1, " restored="

    .line 221
    .line 222
    const-string v2, "beta account bound uid="

    .line 223
    .line 224
    invoke-static {v2, p0, v0, p1, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    const/4 p1, 0x4

    .line 236
    const-string v0, "r267d1c3d8cdbcdb7"

    .line 237
    .line 238
    const/4 v1, 0x0

    .line 239
    invoke-static {v0, p0, v1, p1, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :cond_c
    :goto_3
    return-void
.end method

.method public static μ(Ljava/lang/String;La80;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    const-string v0, "0"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v0, Lx9;->β:Ljava/util/Set;

    .line 30
    .line 31
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    new-instance p0, Lv9;

    .line 38
    .line 39
    const-string v0, "checking..."

    .line 40
    .line 41
    invoke-direct {p0, v2, v0, v1}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    .line 49
    .line 50
    new-instance v1, Lw1;

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    invoke-direct {v1, p1, v2, p0}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const-string p0, "DY-Beta-Refresh"

    .line 57
    .line 58
    invoke-direct {v0, v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    :goto_0
    new-instance p0, Lv9;

    .line 66
    .line 67
    const-string v0, "UID invalid"

    .line 68
    .line 69
    invoke-direct {p0, v2, v0, v1}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static ν(Ljava/lang/String;)Lv9;
    .locals 9

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->ο()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    if-ge v1, v4, :cond_0

    .line 10
    .line 11
    new-instance p0, Lv9;

    .line 12
    .line 13
    const-string v0, "native URL unavailable"

    .line 14
    .line 15
    invoke-direct {p0, v3, v0, v2}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    aget-object v1, v0, v3

    .line 20
    .line 21
    invoke-static {v1}, Lx9;->ξ(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/4 v6, 0x1

    .line 30
    if-nez v5, :cond_3

    .line 31
    .line 32
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    .line 33
    .line 34
    invoke-direct {v5, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v7, "beta_users"

    .line 38
    .line 39
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    move v5, v6

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move v5, v3

    .line 48
    :goto_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v5

    .line 54
    new-instance v7, Leo1;

    .line 55
    .line 56
    invoke-direct {v7, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    move-object v5, v7

    .line 60
    :goto_1
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    instance-of v8, v5, Leo1;

    .line 63
    .line 64
    if-eqz v8, :cond_2

    .line 65
    .line 66
    move-object v5, v7

    .line 67
    :cond_2
    check-cast v5, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    aget-object v0, v0, v6

    .line 77
    .line 78
    invoke-static {v0}, Lx9;->ξ(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :goto_2
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    new-instance p0, Lv9;

    .line 89
    .line 90
    const-string v0, "cannot connect server, please retry later"

    .line 91
    .line 92
    invoke-direct {p0, v3, v0, v2}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 93
    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_4
    :try_start_1
    sget-object v0, Lr9;->α:Landroid/os/Handler;

    .line 97
    .line 98
    invoke-static {v1}, Lr9;->β(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :catchall_1
    move-exception v0

    .line 105
    new-instance v5, Leo1;

    .line 106
    .line 107
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    move-object v0, v5

    .line 111
    :goto_3
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const/4 v5, 0x4

    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const-string v7, "notice parse/save failed: "

    .line 123
    .line 124
    invoke-static {v7, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-string v7, "r267d1c3d8cdbcdb7"

    .line 129
    .line 130
    invoke-static {v7, v0, v2, v5, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_6

    .line 138
    .line 139
    new-instance p0, Lv9;

    .line 140
    .line 141
    const-string v0, "native unavailable"

    .line 142
    .line 143
    invoke-direct {p0, v3, v0, v2}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 144
    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_6
    :try_start_2
    invoke-static {p0, v1}, Lcom/example/dyhelper/beta/BetaNativeBridge;->υ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    new-array v1, v6, [C

    .line 152
    .line 153
    const/16 v7, 0xa

    .line 154
    .line 155
    aput-char v7, v1, v3

    .line 156
    .line 157
    invoke-static {v0, v1, v5, v4}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 161
    goto :goto_4

    .line 162
    :catchall_2
    move-exception v0

    .line 163
    new-instance v1, Leo1;

    .line 164
    .line 165
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    move-object v0, v1

    .line 169
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    if-nez v1, :cond_f

    .line 174
    .line 175
    check-cast v0, Ljava/util/List;

    .line 176
    .line 177
    invoke-static {v0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const-string v5, "1"

    .line 182
    .line 183
    invoke-static {v1, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    const-string v5, "opaque_ticket"

    .line 188
    .line 189
    if-eqz v1, :cond_b

    .line 190
    .line 191
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    const/4 v7, 0x3

    .line 196
    if-ge v1, v7, :cond_7

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_7
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    check-cast v0, Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    if-nez v4, :cond_a

    .line 232
    .line 233
    sget-object v4, Lx9;->θ:Ljava/lang/String;

    .line 234
    .line 235
    invoke-static {p0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-nez v4, :cond_8

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_8
    sget-object v4, Lx9;->η:Landroid/content/SharedPreferences;

    .line 243
    .line 244
    if-nez v4, :cond_9

    .line 245
    .line 246
    new-instance p0, Lv9;

    .line 247
    .line 248
    const-string v0, "preferences unavailable"

    .line 249
    .line 250
    invoke-direct {p0, v3, v0, v2}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 251
    .line 252
    .line 253
    return-object p0

    .line 254
    :cond_9
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    const-string v3, "__beta_schema_version"

    .line 259
    .line 260
    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    const-string v3, "__beta_account_uid"

    .line 265
    .line 266
    invoke-interface {v2, v3, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-interface {v2, v5, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 275
    .line 276
    .line 277
    new-instance v0, Lv9;

    .line 278
    .line 279
    new-instance v2, Lu9;

    .line 280
    .line 281
    invoke-direct {v2, p0, v1}, Lu9;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    const-string p0, "native verification passed"

    .line 285
    .line 286
    invoke-direct {v0, v6, p0, v2}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 287
    .line 288
    .line 289
    return-object v0

    .line 290
    :cond_a
    :goto_5
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->φ()V

    .line 291
    .line 292
    .line 293
    new-instance p0, Lv9;

    .line 294
    .line 295
    const-string v0, "current account changed, please retry"

    .line 296
    .line 297
    invoke-direct {p0, v3, v0, v2}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 298
    .line 299
    .line 300
    return-object p0

    .line 301
    :cond_b
    :goto_6
    sget-object v1, Lx9;->θ:Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    if-eqz p0, :cond_d

    .line 308
    .line 309
    sget-object p0, Lx9;->η:Landroid/content/SharedPreferences;

    .line 310
    .line 311
    if-eqz p0, :cond_c

    .line 312
    .line 313
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    if-eqz p0, :cond_c

    .line 318
    .line 319
    invoke-interface {p0, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    if-eqz p0, :cond_c

    .line 324
    .line 325
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 326
    .line 327
    .line 328
    :cond_c
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->φ()V

    .line 329
    .line 330
    .line 331
    :cond_d
    new-instance p0, Lv9;

    .line 332
    .line 333
    invoke-static {v6, v0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    check-cast v0, Ljava/lang/String;

    .line 338
    .line 339
    if-nez v0, :cond_e

    .line 340
    .line 341
    const-string v0, "denied"

    .line 342
    .line 343
    :cond_e
    invoke-direct {p0, v3, v0, v2}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 344
    .line 345
    .line 346
    return-object p0

    .line 347
    :cond_f
    new-instance p0, Lv9;

    .line 348
    .line 349
    const-string v0, "native refresh failed"

    .line 350
    .line 351
    invoke-direct {p0, v3, v0, v2}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 352
    .line 353
    .line 354
    return-object p0
.end method

.method public static ξ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->ο()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    move-object p0, v0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    sget-object v1, Lwx;->α:Lt41;

    .line 29
    .line 30
    const-string v1, "Cache-Control"

    .line 31
    .line 32
    const-string v2, "no-cache"

    .line 33
    .line 34
    new-instance v3, Ll91;

    .line 35
    .line 36
    invoke-direct {v3, v1, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lex0;->Λ(Ll91;)Ljava/util/Map;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {p0, v1}, Lwx;->β(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string v1, "\ufeff"

    .line 56
    .line 57
    invoke-static {p0, v1}, Lq02;->н(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    return-object p0

    .line 62
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string v1, "fetch beta list failed: "

    .line 67
    .line 68
    invoke-static {v1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const/4 v1, 0x4

    .line 73
    const-string v2, "r267d1c3d8cdbcdb7"

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-static {v2, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public static ο(Landroid/content/Context;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v0

    .line 12
    :goto_0
    sput-object p0, Lx9;->ε:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {}, Lui1;->Α()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x4

    .line 19
    const-string v2, "r267d1c3d8cdbcdb7"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :try_start_0
    invoke-static {p0}, Lui1;->π(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    new-instance v4, Leo1;

    .line 32
    .line 33
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v4

    .line 37
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v4, "PrefsManager init failed: "

    .line 48
    .line 49
    invoke-static {v4, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v2, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    const-string v0, "dyhelper_beta"

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-virtual {p0, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lx9;->ζ:Landroid/content/SharedPreferences;

    .line 64
    .line 65
    sget-object v0, Lr9;->α:Landroid/os/Handler;

    .line 66
    .line 67
    invoke-static {p0}, Lr9;->α(Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    sget-object v0, Lx9;->θ:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :cond_2
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-nez v4, :cond_3

    .line 107
    .line 108
    const-string v4, "0"

    .line 109
    .line 110
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-nez v4, :cond_3

    .line 115
    .line 116
    const-string v4, "init"

    .line 117
    .line 118
    invoke-static {v0, v4}, Lx9;->λ(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->φ()V

    .line 123
    .line 124
    .line 125
    :goto_2
    sget-object v0, Lx9;->θ:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {}, Lx9;->ρ()Lw9;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    iget-boolean v4, v4, Lw9;->α:Z

    .line 132
    .line 133
    new-instance v5, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v6, "init uid="

    .line 136
    .line 137
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v0, " native="

    .line 144
    .line 145
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string p0, " state="

    .line 152
    .line 153
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {v2, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public static π()Z
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    new-instance v1, Leo1;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object v0, v1

    .line 21
    :goto_0
    instance-of v1, v0, Leo1;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const-string v0, ""

    .line 26
    .line 27
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    const-string v1, "0"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    sget-object v1, Lx9;->θ:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    const-string v1, "action-sync"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lx9;->λ(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    sget-object v0, Lx9;->θ:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    xor-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    return v0
.end method

.method public static ρ()Lw9;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->τ()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    new-array v2, v0, [C

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/16 v4, 0xa

    .line 10
    .line 11
    aput-char v4, v2, v3

    .line 12
    .line 13
    const/4 v3, 0x3

    .line 14
    const/4 v4, 0x2

    .line 15
    invoke-static {v1, v2, v3, v4}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    new-instance v2, Leo1;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object v1, v2

    .line 27
    :goto_0
    instance-of v2, v1, Leo1;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    sget-object v1, Ljz;->ε:Ljz;

    .line 32
    .line 33
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 34
    .line 35
    new-instance v2, Lw9;

    .line 36
    .line 37
    invoke-static {v1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v4, "1"

    .line 42
    .line 43
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v0, v1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/String;

    .line 52
    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    const-string v0, ""

    .line 56
    .line 57
    :cond_1
    invoke-direct {v2, v0, v3}, Lw9;-><init>(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    return-object v2
.end method
