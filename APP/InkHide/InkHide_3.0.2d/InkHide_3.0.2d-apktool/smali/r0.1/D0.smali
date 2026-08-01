.class public final Lr0/D0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final synthetic c:Le0/a;


# direct methods
.method public synthetic constructor <init>(Le0/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/D0;->a:I

    iput-object p1, p0, Lr0/D0;->c:Le0/a;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget v0, p0, Lr0/D0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "param"

    .line 7
    .line 8
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lr0/D0;->b:Z

    .line 12
    .line 13
    iget-object v1, p0, Lr0/D0;->c:Le0/a;

    .line 14
    .line 15
    check-cast v1, Lr0/l1;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lr0/l1;->I(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    instance-of v0, p1, Landroid/app/Activity;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    check-cast p1, Landroid/app/Activity;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    :goto_0
    if-nez p1, :cond_2

    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_2
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_9

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_3
    invoke-static {p1}, Lr0/l1;->A(Landroid/app/Activity;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-virtual {v1, p1, v0}, Lr0/l1;->x(Landroid/app/Activity;Landroid/view/View;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    goto :goto_2

    .line 71
    :cond_5
    :goto_1
    const/4 v2, 0x0

    .line 72
    :goto_2
    if-nez v2, :cond_6

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_6
    invoke-static {}, Lr0/w0;->a()Lr0/j1;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_7

    .line 80
    .line 81
    iget-object v2, v2, Lr0/j1;->e:Ljava/util/List;

    .line 82
    .line 83
    if-nez v2, :cond_8

    .line 84
    .line 85
    :cond_7
    sget-object v2, Lr0/l1;->n:Ljava/util/List;

    .line 86
    .line 87
    :cond_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_9

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v3

    .line 107
    new-instance v5, Lr0/g1;

    .line 108
    .line 109
    const/4 v6, 0x0

    .line 110
    invoke-direct {v5, v1, p1, v6}, Lr0/g1;-><init>(Lr0/l1;Landroid/app/Activity;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v5, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_9
    :goto_4
    return-void

    .line 118
    :pswitch_0
    const-string v0, "param"

    .line 119
    .line 120
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 124
    .line 125
    const/4 v1, 0x0

    .line 126
    aget-object v0, v0, v1

    .line 127
    .line 128
    iget-object v1, p0, Lr0/D0;->c:Le0/a;

    .line 129
    .line 130
    check-cast v1, Lr0/H0;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lr0/H0;->D1(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-nez v0, :cond_a

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-static {v2}, Lr0/H0;->D0(Ljava/lang/Class;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-nez v2, :cond_b

    .line 151
    .line 152
    invoke-static {}, Lz0/r;->u()Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-nez v2, :cond_10

    .line 157
    .line 158
    :cond_b
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 159
    .line 160
    invoke-virtual {v1, p1, v0}, Lr0/H0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-nez p1, :cond_c

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_c
    iget-boolean p1, p0, Lr0/D0;->b:Z

    .line 168
    .line 169
    if-eqz p1, :cond_d

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_d
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    const-string v3, "guess setAdapter: "

    .line 185
    .line 186
    filled-new-array {p1, v3, v0, v2}, [Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {v1, p1}, Lr0/H0;->E(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    if-nez p1, :cond_e

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 216
    .line 217
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 222
    .line 223
    const-string v3, "getItem"

    .line 224
    .line 225
    invoke-interface {v2, p1, v3, v0}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    :cond_e
    if-eqz p1, :cond_f

    .line 230
    .line 231
    new-instance v0, Lr0/C0;

    .line 232
    .line 233
    const/16 v2, 0x11

    .line 234
    .line 235
    invoke-direct {v0, v1, v2}, Lr0/C0;-><init>(Lr0/H0;I)V

    .line 236
    .line 237
    .line 238
    invoke-static {p1, v0}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 239
    .line 240
    .line 241
    const/4 p1, 0x1

    .line 242
    iput-boolean p1, p0, Lr0/D0;->b:Z

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_f
    const-string v0, "guess getItem method is "

    .line 246
    .line 247
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_10
    :goto_5
    return-void

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    .line 1
    iget v0, p0, Lr0/D0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v0, p0, Lr0/D0;->c:Le0/a;

    .line 15
    .line 16
    check-cast v0, Lr0/l1;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lr0/l1;->h(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput-boolean p1, p0, Lr0/D0;->b:Z

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
