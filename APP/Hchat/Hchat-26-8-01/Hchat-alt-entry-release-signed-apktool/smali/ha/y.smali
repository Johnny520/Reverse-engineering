.class public final Lha/y;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lha/z;


# direct methods
.method public synthetic constructor <init>(Lha/z;I)V
    .locals 0

    .line 1
    iput p2, p0, Lha/y;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lha/y;->b:Lha/z;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    iget v0, p0, Lha/y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v1, v0, Landroid/view/View;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, Landroid/view/View;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v0, v2

    .line 26
    :goto_0
    if-eqz v0, :cond_4

    .line 27
    .line 28
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 29
    .line 30
    instance-of v3, v1, Landroid/widget/Adapter;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    check-cast v1, Landroid/widget/Adapter;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v1, v2

    .line 38
    :goto_1
    if-eqz v1, :cond_4

    .line 39
    .line 40
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-static {v3, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    instance-of v3, p1, Ljava/lang/Number;

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    check-cast p1, Ljava/lang/Number;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    move-object p1, v2

    .line 58
    :goto_2
    if-eqz p1, :cond_4

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    :try_start_0
    invoke-interface {v1, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    goto :goto_3

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    new-instance v1, Lsf/f;

    .line 71
    .line 72
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    move-object p1, v1

    .line 76
    :goto_3
    nop

    .line 77
    instance-of v1, p1, Lsf/f;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_3
    move-object v2, p1

    .line 83
    :goto_4
    if-eqz v2, :cond_4

    .line 84
    .line 85
    iget-object p1, p0, Lha/y;->b:Lha/z;

    .line 86
    .line 87
    invoke-static {p1, v0, v2}, Lha/z;->a(Lha/z;Landroid/view/View;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void

    .line 91
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    instance-of v1, v0, Landroid/view/View;

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    check-cast v0, Landroid/view/View;

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_5
    const/4 v0, 0x0

    .line 106
    :goto_5
    if-eqz v0, :cond_6

    .line 107
    .line 108
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    invoke-static {v1, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    iget-object v1, p0, Lha/y;->b:Lha/z;

    .line 121
    .line 122
    invoke-static {v1, v0, p1}, Lha/z;->a(Lha/z;Landroid/view/View;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_6
    return-void

    .line 126
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 130
    .line 131
    instance-of v1, v0, Landroid/view/View;

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    if-eqz v1, :cond_7

    .line 135
    .line 136
    check-cast v0, Landroid/view/View;

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_7
    move-object v0, v2

    .line 140
    :goto_6
    if-eqz v0, :cond_d

    .line 141
    .line 142
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    const/4 v1, 0x1

    .line 148
    invoke-static {v1, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iget-object v1, p0, Lha/y;->b:Lha/z;

    .line 153
    .line 154
    if-nez p1, :cond_8

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    goto :goto_a

    .line 160
    :cond_8
    invoke-virtual {v1, p1}, Lha/z;->j(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_9

    .line 165
    .line 166
    :goto_7
    move-object v2, p1

    .line 167
    goto :goto_a

    .line 168
    :cond_9
    iget-object v3, v1, Lha/z;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, Lha/x;

    .line 179
    .line 180
    if-eqz v3, :cond_a

    .line 181
    .line 182
    goto :goto_8

    .line 183
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v1, v3}, Lha/z;->p(Ljava/lang/Class;)Lha/x;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    if-eqz v3, :cond_c

    .line 192
    .line 193
    :goto_8
    iget-object v3, v3, Lha/x;->a:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-eqz v4, :cond_b

    .line 204
    .line 205
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    check-cast v4, Ljava/lang/reflect/Method;

    .line 210
    .line 211
    const/4 v5, 0x0

    .line 212
    new-array v5, v5, [Ljava/lang/Object;

    .line 213
    .line 214
    invoke-static {v4, p1, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    if-eqz p1, :cond_c

    .line 219
    .line 220
    goto :goto_9

    .line 221
    :cond_b
    invoke-virtual {v1, p1}, Lha/z;->j(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_c

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_c
    :goto_a
    if-eqz v2, :cond_d

    .line 229
    .line 230
    invoke-static {v1, v0, v2}, Lha/z;->a(Lha/z;Landroid/view/View;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_d
    return-void

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    iget v0, p0, Lha/y;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lha/y;->b:Lha/z;

    .line 10
    .line 11
    invoke-virtual {v0}, Lha/z;->b()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-static {v0, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    instance-of v0, p1, Landroid/view/View;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    check-cast p1, Landroid/view/View;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    :goto_0
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Lha/y;->b:Lha/z;

    .line 50
    .line 51
    iget-object v1, v0, Lha/z;->g:Ljava/util/Map;

    .line 52
    .line 53
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Lha/z;->q(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void

    .line 60
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x3

    .line 66
    invoke-static {v0, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    instance-of v0, p1, Landroid/view/View;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    check-cast p1, Landroid/view/View;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const/4 p1, 0x0

    .line 78
    :goto_1
    if-eqz p1, :cond_4

    .line 79
    .line 80
    iget-object v0, p0, Lha/y;->b:Lha/z;

    .line 81
    .line 82
    iget-object v1, v0, Lha/z;->g:Ljava/util/Map;

    .line 83
    .line 84
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lha/z;->q(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void

    .line 91
    :pswitch_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 92
    .line 93
    instance-of v0, p1, Landroid/view/View;

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    check-cast p1, Landroid/view/View;

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    const/4 p1, 0x0

    .line 101
    :goto_2
    if-eqz p1, :cond_6

    .line 102
    .line 103
    iget-object v0, p0, Lha/y;->b:Lha/z;

    .line 104
    .line 105
    iget-object v1, v0, Lha/z;->g:Ljava/util/Map;

    .line 106
    .line 107
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p1}, Lha/z;->q(Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
