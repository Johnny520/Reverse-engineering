.class public final Lia/z;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lia/a0;


# direct methods
.method public synthetic constructor <init>(Lia/a0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lia/z;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lia/z;->b:Lia/a0;

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
    .locals 1

    .line 1
    iget v0, p0, Lia/z;->a:I

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
    iget-object v0, p0, Lia/z;->b:Lia/a0;

    .line 14
    .line 15
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lia/a0;->i(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget v0, p0, Lia/z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

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
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 14
    .line 15
    if-eqz v0, :cond_9

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {v1, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_9

    .line 23
    .line 24
    iget-object v2, p0, Lia/z;->b:Lia/a0;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lia/a0;->q(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_9

    .line 34
    .line 35
    iget-object v3, v2, Lia/a0;->b:Lb5/c;

    .line 36
    .line 37
    invoke-virtual {v3, v0}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lia/a0;->g(Lia/c;)Lia/c;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, Lia/c;->b:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_0
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 56
    .line 57
    if-eqz v3, :cond_9

    .line 58
    .line 59
    const/4 v4, 0x3

    .line 60
    invoke-static {v4, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-eqz v3, :cond_9

    .line 65
    .line 66
    instance-of v4, v3, Ljava/lang/Number;

    .line 67
    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_7

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Lia/b;

    .line 92
    .line 93
    iget-object v4, v4, Lia/b;->a:Ljava/lang/String;

    .line 94
    .line 95
    const-string v5, "comment:"

    .line 96
    .line 97
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    const v5, 0x3fffffff    # 1.9999999f

    .line 106
    .line 107
    .line 108
    and-int/2addr v4, v5

    .line 109
    const/high16 v5, -0x80000000

    .line 110
    .line 111
    or-int/2addr v4, v5

    .line 112
    move-object v5, v3

    .line 113
    check-cast v5, Ljava/lang/Number;

    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    const/4 v6, 0x1

    .line 120
    if-ne v4, v5, :cond_3

    .line 121
    .line 122
    move v4, v6

    .line 123
    goto :goto_0

    .line 124
    :cond_3
    move v4, v1

    .line 125
    :goto_0
    if-eqz v4, :cond_2

    .line 126
    .line 127
    move v1, v6

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_5

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    new-instance v1, Ljava/util/HashSet;

    .line 137
    .line 138
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_6

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, Lia/b;

    .line 156
    .line 157
    invoke-static {v4}, Lia/h;->a(Lia/b;)Lia/f;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_6
    invoke-static {v3, v1}, Lia/h;->c(Ljava/lang/Object;Ljava/util/HashSet;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    :cond_7
    :goto_2
    if-nez v1, :cond_8

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_8
    const/4 v0, 0x0

    .line 173
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, v2, Lia/a0;->h:Landroid/os/Handler;

    .line 177
    .line 178
    new-instance v0, La1/a;

    .line 179
    .line 180
    const/16 v1, 0x16

    .line 181
    .line 182
    invoke-direct {v0, v2, v1}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 186
    .line 187
    .line 188
    :cond_9
    :goto_3
    return-void

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
