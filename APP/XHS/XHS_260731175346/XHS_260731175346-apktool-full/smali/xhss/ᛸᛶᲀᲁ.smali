.class public final Lxhss/ᛸᛶᲀᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛲᛲᲀᛷ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛲᛲᲀᛷ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛸᛶᲀᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛸᛶᲀᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛲᲀᛷ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lxhss/ᛸᛶᲀᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const-string v1, "window"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lxhss/ᛸᛶᲀᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛲᲀᛷ;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, v3, Lxhss/ᛲᛲᲀᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛲᛳᛵ;

    .line 13
    .line 14
    :try_start_0
    iget-object v0, p0, Lxhss/ᛳᛲᛳᛵ;->ᛷᛵᛵᲈ:Landroid/app/Activity;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lxhss/ᛳᛲᛳᛵ;->ᛷᛵᛵᲈ:Landroid/app/Activity;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, p0, Lxhss/ᛳᛲᛳᛵ;->ᛱᛱᛲᲇ:Landroid/app/Application;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v2, v0

    .line 41
    check-cast v2, Landroid/view/WindowManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 44
    .line 45
    :goto_1
    invoke-virtual {p0}, Lxhss/ᛳᛲᛳᛵ;->ᛷᛵᛵᲈ()V

    .line 46
    .line 47
    .line 48
    iput-boolean v4, v3, Lxhss/ᛲᛲᲀᛷ;->ᲇᛴᲇᛵ:Z

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    :try_start_1
    iget-object v0, v3, Lxhss/ᛲᛲᲀᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲈᛱᛷᛵ;

    .line 52
    .line 53
    iget-object v0, v0, Lxhss/ᲈᛱᛷᛵ;->ᛷᛵᛵᲈ:Landroid/view/View;

    .line 54
    .line 55
    invoke-interface {v2, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_3

    .line 61
    :catch_0
    move-exception v0

    .line 62
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :goto_2
    return-void

    .line 67
    :goto_3
    invoke-virtual {p0}, Lxhss/ᛳᛲᛳᛵ;->ᛷᛵᛵᲈ()V

    .line 68
    .line 69
    .line 70
    iput-boolean v4, v3, Lxhss/ᛲᛲᲀᛷ;->ᲇᛴᲇᛵ:Z

    .line 71
    .line 72
    throw v0

    .line 73
    :pswitch_0
    iget-object v0, v3, Lxhss/ᛲᛲᲀᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲈᛱᛷᛵ;

    .line 74
    .line 75
    iget-object v5, v3, Lxhss/ᛲᛲᲀᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛲᛳᛵ;

    .line 76
    .line 77
    iget-object v6, v5, Lxhss/ᛳᛲᛳᛵ;->ᛷᛵᛵᲈ:Landroid/app/Activity;

    .line 78
    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    invoke-virtual {v6}, Landroid/app/Activity;->isDestroyed()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_4
    iget-object v1, v5, Lxhss/ᛳᛲᛳᛵ;->ᛷᛵᛵᲈ:Landroid/app/Activity;

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    iget-object v6, v5, Lxhss/ᛳᛲᛳᛵ;->ᛱᛱᛲᲇ:Landroid/app/Application;

    .line 96
    .line 97
    if-eqz v6, :cond_6

    .line 98
    .line 99
    invoke-virtual {v6, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    move-object v2, v1

    .line 104
    check-cast v2, Landroid/view/WindowManager;

    .line 105
    .line 106
    :cond_6
    :goto_4
    if-nez v2, :cond_7

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_7
    new-instance v1, Landroid/view/WindowManager$LayoutParams;

    .line 110
    .line 111
    invoke-direct {v1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 112
    .line 113
    .line 114
    const/4 v6, -0x2

    .line 115
    iput v6, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 116
    .line 117
    iput v6, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 118
    .line 119
    const/4 v6, -0x3

    .line 120
    iput v6, v1, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 121
    .line 122
    const/16 v6, 0x98

    .line 123
    .line 124
    iput v6, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 125
    .line 126
    iget-object v6, v3, Lxhss/ᛲᛲᲀᛷ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 127
    .line 128
    iput-object v6, v1, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 129
    .line 130
    iget v6, v0, Lxhss/ᲈᛱᛷᛵ;->ᛳᲁᲇᛸ:I

    .line 131
    .line 132
    iput v6, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 133
    .line 134
    iput v4, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 135
    .line 136
    iput v4, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    iput v4, v1, Landroid/view/WindowManager$LayoutParams;->verticalMargin:F

    .line 140
    .line 141
    iput v4, v1, Landroid/view/WindowManager$LayoutParams;->horizontalMargin:F

    .line 142
    .line 143
    const v4, 0x1030004

    .line 144
    .line 145
    .line 146
    iput v4, v1, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 147
    .line 148
    const-string v4, "Toast"

    .line 149
    .line 150
    invoke-virtual {v1, v4}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 151
    .line 152
    .line 153
    const/4 v4, 0x1

    .line 154
    invoke-virtual {v1, v4}, Landroid/view/WindowManager$LayoutParams;->setFitInsetsIgnoringVisibility(Z)V

    .line 155
    .line 156
    .line 157
    iget-boolean v6, v3, Lxhss/ᛲᛲᲀᛷ;->ᛷᛴᛷᛱ:Z

    .line 158
    .line 159
    if-eqz v6, :cond_8

    .line 160
    .line 161
    const/16 v6, 0x7f6

    .line 162
    .line 163
    iput v6, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 164
    .line 165
    iget v6, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 166
    .line 167
    and-int/lit8 v6, v6, -0x11

    .line 168
    .line 169
    iput v6, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 170
    .line 171
    :cond_8
    :try_start_3
    iget-object v6, v0, Lxhss/ᲈᛱᛷᛵ;->ᛷᛵᛵᲈ:Landroid/view/View;

    .line 172
    .line 173
    invoke-interface {v2, v6, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    sget-object v1, Lxhss/ᛲᛲᲀᛷ;->ᛸᛴᛶᛳ:Landroid/os/Handler;

    .line 177
    .line 178
    new-instance v2, Lxhss/ᛳᛶᲈᛲ;

    .line 179
    .line 180
    const/4 v6, 0x5

    .line 181
    invoke-direct {v2, v6, p0}, Lxhss/ᛳᛶᲈᛲ;-><init>(ILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget p0, v0, Lxhss/ᲈᛱᛷᛵ;->ᲇᛴᲇᛵ:I

    .line 185
    .line 186
    if-ne p0, v4, :cond_9

    .line 187
    .line 188
    const-wide/16 v6, 0xdac

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    const-wide/16 v6, 0x7d0

    .line 192
    .line 193
    :goto_5
    invoke-virtual {v1, v2, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 194
    .line 195
    .line 196
    iput-object v3, v5, Lxhss/ᛳᛲᛳᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛲᲀᛷ;

    .line 197
    .line 198
    iget-object p0, v5, Lxhss/ᛳᛲᛳᛵ;->ᛷᛵᛵᲈ:Landroid/app/Activity;

    .line 199
    .line 200
    if-nez p0, :cond_a

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_a
    invoke-virtual {p0, v5}, Landroid/app/Activity;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 204
    .line 205
    .line 206
    :goto_6
    iput-boolean v4, v3, Lxhss/ᛲᛲᲀᛷ;->ᲇᛴᲇᛵ:Z

    .line 207
    .line 208
    iget-object p0, v0, Lxhss/ᲈᛱᛷᛵ;->ᛷᛵᛵᲈ:Landroid/view/View;

    .line 209
    .line 210
    invoke-static {p0}, Lxhss/ᛲᛲᲀᛷ;->ᛱᛱᛲᲇ(Landroid/view/View;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 211
    .line 212
    .line 213
    goto :goto_7

    .line 214
    :catch_1
    move-exception p0

    .line 215
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 216
    .line 217
    .line 218
    :goto_7
    return-void

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
