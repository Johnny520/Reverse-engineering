.class public final Lr0/g;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/i;


# direct methods
.method public synthetic constructor <init>(Lr0/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/g;->a:I

    iput-object p1, p0, Lr0/g;->b:Lr0/i;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "param"

    .line 3
    .line 4
    iget v2, p0, Lr0/g;->a:I

    .line 5
    .line 6
    invoke-static {p1, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lr0/g;->b:Lr0/i;

    .line 13
    .line 14
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p1, v0, Lr0/i;->b:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 20
    .line 21
    const-string v2, "args"

    .line 22
    .line 23
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    array-length v3, v1

    .line 27
    const/4 v4, 0x0

    .line 28
    move v5, v4

    .line 29
    :goto_0
    const/4 v6, 0x0

    .line 30
    if-ge v5, v3, :cond_1

    .line 31
    .line 32
    aget-object v7, v1, v5

    .line 33
    .line 34
    instance-of v8, v7, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v8, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/2addr v5, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v7, v6

    .line 42
    :goto_1
    instance-of v1, v7, Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    check-cast v7, Ljava/lang/String;

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move-object v7, v6

    .line 50
    :goto_2
    iget-object v1, p0, Lr0/g;->b:Lr0/i;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    if-eqz v7, :cond_d

    .line 56
    .line 57
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 58
    .line 59
    invoke-virtual {v7, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v3, "toLowerCase(...)"

    .line 64
    .line 65
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v3, "message"

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_3

    .line 75
    .line 76
    const-string v3, "message_"

    .line 77
    .line 78
    invoke-static {v1, v4, v3}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_3

    .line 83
    .line 84
    const-string v3, "_message"

    .line 85
    .line 86
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_d

    .line 91
    .line 92
    :cond_3
    iget-object v1, p0, Lr0/g;->b:Lr0/i;

    .line 93
    .line 94
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v3, v1, Lr0/i;->a:Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v1, p0, Lr0/g;->b:Lr0/i;

    .line 99
    .line 100
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    array-length v2, p1

    .line 106
    move v3, v4

    .line 107
    :goto_3
    if-ge v3, v2, :cond_5

    .line 108
    .line 109
    aget-object v5, p1, v3

    .line 110
    .line 111
    instance-of v7, v5, Landroid/content/ContentValues;

    .line 112
    .line 113
    if-eqz v7, :cond_4

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_4
    add-int/2addr v3, v0

    .line 117
    goto :goto_3

    .line 118
    :cond_5
    move-object v5, v6

    .line 119
    :goto_4
    instance-of p1, v5, Landroid/content/ContentValues;

    .line 120
    .line 121
    if-eqz p1, :cond_6

    .line 122
    .line 123
    check-cast v5, Landroid/content/ContentValues;

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_6
    move-object v5, v6

    .line 127
    :goto_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    if-eqz v5, :cond_d

    .line 131
    .line 132
    sget-boolean p1, Lz0/i;->a:Z

    .line 133
    .line 134
    invoke-static {}, Lz0/g;->r()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_7

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_7
    const-string p1, "type"

    .line 142
    .line 143
    invoke-virtual {v5, p1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-eqz p1, :cond_d

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    const/16 v1, 0x2710

    .line 154
    .line 155
    if-eq p1, v1, :cond_8

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_8
    const-string p1, "content"

    .line 159
    .line 160
    invoke-virtual {v5, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-nez v1, :cond_9

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_9
    const-string v2, "[\u5df2\u963b\u6b62]"

    .line 168
    .line 169
    invoke-static {v1, v2, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-nez v2, :cond_d

    .line 174
    .line 175
    sget-object v2, Lr0/i;->f:Ljava/util/List;

    .line 176
    .line 177
    if-eqz v2, :cond_a

    .line 178
    .line 179
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_a

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_a
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_d

    .line 195
    .line 196
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    check-cast v3, Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v1, v3, v0}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_b

    .line 207
    .line 208
    invoke-static {v1}, Lr0/i;->f(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_c

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_c
    invoke-static {v6}, Lr0/i;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v5, p1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    :cond_d
    :goto_6
    return-void

    .line 223
    :pswitch_1
    iget-object v0, p0, Lr0/g;->b:Lr0/i;

    .line 224
    .line 225
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 226
    .line 227
    iput-object p1, v0, Lr0/i;->b:Ljava/lang/Object;

    .line 228
    .line 229
    return-void

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
