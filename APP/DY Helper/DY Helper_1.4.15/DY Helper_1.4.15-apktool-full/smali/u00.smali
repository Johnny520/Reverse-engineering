.class public abstract Lu00;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap;


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
    sput-object v0, Lu00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lu00;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    return-void
.end method

.method public static α(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 3
    .line 4
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {v1, v0, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    new-instance v2, Leo1;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object v1, v2

    .line 20
    :goto_0
    instance-of v2, v1, Leo1;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    move-object v1, v3

    .line 26
    :cond_0
    check-cast v1, Ljava/lang/Class;

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return-object v3

    .line 31
    :cond_1
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v2, p0}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_2
    :try_start_1
    const-string p0, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950A26F12973BD1F55377227BCD8D5E99"

    .line 41
    .line 42
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0, v0, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    goto :goto_1

    .line 51
    :catchall_1
    move-exception p0

    .line 52
    new-instance p1, Leo1;

    .line 53
    .line 54
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object p0, p1

    .line 58
    :goto_1
    instance-of p1, p0, Leo1;

    .line 59
    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    move-object p0, v3

    .line 63
    :cond_3
    check-cast p0, Ljava/lang/Class;

    .line 64
    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    invoke-virtual {v2, p0}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_4
    invoke-static {v2}, Lyh;->μ(Lzt0;)Lzt0;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    new-instance p1, Ljava/util/HashSet;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v2, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lzt0;->listIterator(I)Ljava/util/ListIterator;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    :cond_5
    :goto_2
    move-object v0, p0

    .line 89
    check-cast v0, Lle0;

    .line 90
    .line 91
    invoke-virtual {v0}, Lle0;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_6

    .line 96
    .line 97
    invoke-virtual {v0}, Lle0;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    move-object v4, v0

    .line 102
    check-cast v4, Ljava/lang/Class;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {p1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    new-instance p0, Lf7;

    .line 119
    .line 120
    const/4 p1, 0x1

    .line 121
    invoke-direct {p0, p1, v2}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    new-instance p1, Lq00;

    .line 125
    .line 126
    const/4 v0, 0x3

    .line 127
    invoke-direct {p1, v0}, Lq00;-><init>(I)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Lc40;

    .line 131
    .line 132
    sget-object v2, Lvs1;->ε:Lvs1;

    .line 133
    .line 134
    invoke-direct {v0, p0, p1, v2}, Lc40;-><init>(Lss1;La80;La80;)V

    .line 135
    .line 136
    .line 137
    new-instance p0, Lq00;

    .line 138
    .line 139
    const/4 p1, 0x4

    .line 140
    invoke-direct {p0, p1}, Lq00;-><init>(I)V

    .line 141
    .line 142
    .line 143
    new-instance p1, Ly30;

    .line 144
    .line 145
    const/4 v2, 0x1

    .line 146
    invoke-direct {p1, v0, v2, p0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 147
    .line 148
    .line 149
    new-instance p0, Lt00;

    .line 150
    .line 151
    const/4 v0, 0x0

    .line 152
    invoke-direct {p0, v1, v0}, Lt00;-><init>(Ljava/lang/Class;I)V

    .line 153
    .line 154
    .line 155
    new-instance v0, Ly30;

    .line 156
    .line 157
    invoke-direct {v0, p1, v2, p0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 158
    .line 159
    .line 160
    new-instance p0, Lq00;

    .line 161
    .line 162
    const/4 p1, 0x5

    .line 163
    invoke-direct {p0, p1}, Lq00;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-static {v0, p0}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    iget-object p1, p0, Lt52;->β:La80;

    .line 171
    .line 172
    iget-object p0, p0, Lt52;->α:Lss1;

    .line 173
    .line 174
    invoke-interface {p0}, Lss1;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_7

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-nez v0, :cond_8

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_8
    move-object v0, v3

    .line 201
    check-cast v0, Ljava/lang/reflect/Field;

    .line 202
    .line 203
    invoke-static {v0}, Lu00;->γ(Ljava/lang/reflect/Field;)I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-interface {p1, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    move-object v2, v1

    .line 216
    check-cast v2, Ljava/lang/reflect/Field;

    .line 217
    .line 218
    invoke-static {v2}, Lu00;->γ(Ljava/lang/reflect/Field;)I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-ge v0, v2, :cond_a

    .line 223
    .line 224
    move-object v3, v1

    .line 225
    move v0, v2

    .line 226
    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-nez v1, :cond_9

    .line 231
    .line 232
    :goto_3
    check-cast v3, Ljava/lang/reflect/Field;

    .line 233
    .line 234
    return-object v3
.end method

.method public static β(Ljava/lang/ClassLoader;Z)V
    .locals 3

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->Т:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->ρ(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-eqz p1, :cond_2

    .line 17
    .line 18
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    new-instance p1, Lbb;

    .line 27
    .line 28
    const/16 v1, 0x16

    .line 29
    .line 30
    invoke-direct {p1, p0, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 31
    .line 32
    .line 33
    const-string v1, "\u5b9a\u4f4d Feed ViewHolder \u5f53\u524d\u4f5c\u54c1\u5b57\u6bb5"

    .line 34
    .line 35
    invoke-static {v0, p0, v1, p1}, Lox;->κ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 42
    .line 43
    .line 44
    :cond_1
    if-eqz p1, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 p1, 0x0

    .line 48
    invoke-static {p1, p0}, Lu00;->α(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_0
    return-void
.end method

.method public static γ(Ljava/lang/reflect/Field;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

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
    const-string v1, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950A26F12973BD1F55377227BCD8D5E99"

    .line 10
    .line 11
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/16 v0, 0x7d0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v1

    .line 26
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 35
    .line 36
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    add-int/lit16 v0, v0, 0x5dc

    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    add-int/lit16 v0, v0, 0x1f4

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const-string v2, "feed.adapter"

    .line 69
    .line 70
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_3

    .line 75
    .line 76
    add-int/lit16 v0, v0, 0x12c

    .line 77
    .line 78
    :cond_3
    return v0
.end method
