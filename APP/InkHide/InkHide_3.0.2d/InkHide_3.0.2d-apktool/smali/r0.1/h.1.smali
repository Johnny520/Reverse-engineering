.class public final Lr0/h;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/i;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lr0/i;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/h;->a:I

    iput-object p1, p0, Lr0/h;->b:Lr0/i;

    iput-object p2, p0, Lr0/h;->c:Landroid/content/Context;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lr0/h;->b:Lr0/i;

    .line 2
    .line 3
    iget-object v1, p0, Lr0/h;->c:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "param"

    .line 8
    .line 9
    iget v5, p0, Lr0/h;->a:I

    .line 10
    .line 11
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    packed-switch v5, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-boolean v0, Lz0/i;->a:Z

    .line 18
    .line 19
    invoke-static {}, Lz0/g;->r()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :cond_0
    iget-object v4, p0, Lr0/h;->b:Lr0/i;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lz0/g;->r()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_1
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-static {v2, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object v0, v3

    .line 50
    :goto_0
    instance-of v1, v0, Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    move-object v6, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move-object v6, v3

    .line 59
    :goto_1
    if-nez v6, :cond_4

    .line 60
    .line 61
    goto :goto_7

    .line 62
    :cond_4
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_2

    .line 72
    :cond_5
    move-object v0, v3

    .line 73
    :goto_2
    instance-of v1, v0, Ljava/lang/Number;

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    check-cast v0, Ljava/lang/Number;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    move-object v0, v3

    .line 81
    :goto_3
    if-eqz v0, :cond_c

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v7

    .line 87
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_c

    .line 92
    .line 93
    const-wide/16 v0, 0x0

    .line 94
    .line 95
    cmp-long v0, v7, v0

    .line 96
    .line 97
    if-gtz v0, :cond_7

    .line 98
    .line 99
    goto :goto_7

    .line 100
    :cond_7
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 101
    .line 102
    if-eqz v0, :cond_8

    .line 103
    .line 104
    const/4 v1, 0x3

    .line 105
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    goto :goto_4

    .line 110
    :cond_8
    move-object v0, v3

    .line 111
    :goto_4
    instance-of v1, v0, Ljava/lang/String;

    .line 112
    .line 113
    if-eqz v1, :cond_9

    .line 114
    .line 115
    check-cast v0, Ljava/lang/String;

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_9
    move-object v0, v3

    .line 119
    :goto_5
    if-nez v0, :cond_a

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_a
    invoke-static {v0}, Lr0/i;->f(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    :goto_6
    if-eqz v2, :cond_b

    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_b
    iget-object v5, p0, Lr0/h;->c:Landroid/content/Context;

    .line 130
    .line 131
    const/4 v9, 0x0

    .line 132
    const-string v10, "hook"

    .line 133
    .line 134
    invoke-virtual/range {v4 .. v10}, Lr0/i;->d(Landroid/content/Context;Ljava/lang/String;JLr0/e;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_c
    :goto_7
    invoke-virtual {p1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :goto_8
    return-void

    .line 141
    :pswitch_0
    sget-boolean v4, Lz0/i;->a:Z

    .line 142
    .line 143
    invoke-static {}, Lz0/g;->r()Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-nez v4, :cond_d

    .line 148
    .line 149
    goto :goto_a

    .line 150
    :cond_d
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 151
    .line 152
    if-eqz p1, :cond_f

    .line 153
    .line 154
    array-length v4, p1

    .line 155
    if-nez v4, :cond_e

    .line 156
    .line 157
    goto :goto_9

    .line 158
    :cond_e
    aget-object v3, p1, v2

    .line 159
    .line 160
    :cond_f
    :goto_9
    invoke-static {v0, v1, v3}, Lr0/i;->a(Lr0/i;Landroid/content/Context;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :goto_a
    return-void

    .line 164
    :pswitch_1
    sget-boolean v2, Lz0/i;->a:Z

    .line 165
    .line 166
    invoke-static {}, Lz0/g;->r()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-nez v2, :cond_10

    .line 171
    .line 172
    goto :goto_b

    .line 173
    :cond_10
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 174
    .line 175
    invoke-static {v0, v1, p1}, Lr0/i;->a(Lr0/i;Landroid/content/Context;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :goto_b
    return-void

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
