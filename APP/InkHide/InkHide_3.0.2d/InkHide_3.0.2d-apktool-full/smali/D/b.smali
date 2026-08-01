.class public final LD/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LD/b;->a:I

    iput-object p2, p0, LD/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LC/j;I)V
    .locals 0

    const/4 p2, 0x6

    iput p2, p0, LD/b;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LD/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, v1, LD/b;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v0, LC/j;

    .line 11
    .line 12
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->u:Li/k;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Li/k;->l()Z

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :pswitch_1
    const/4 v2, 0x0

    .line 30
    check-cast v0, Li/t0;

    .line 31
    .line 32
    iput-object v2, v0, Li/t0;->n:LD/b;

    .line 33
    .line 34
    invoke-virtual {v0}, Li/t0;->drawableStateChanged()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_2
    check-cast v0, Landroidx/fragment/app/z;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-virtual {v0, v2}, Landroidx/fragment/app/z;->v(Z)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_3
    check-cast v0, Landroidx/fragment/app/e;

    .line 46
    .line 47
    iget-object v2, v0, Landroidx/fragment/app/e;->a:Landroid/view/ViewGroup;

    .line 48
    .line 49
    iget-object v3, v0, Landroidx/fragment/app/e;->b:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/f;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/fragment/app/g;->d()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_4
    :try_start_0
    check-cast v0, Le/i;

    .line 61
    .line 62
    invoke-static {v0}, Landroidx/activity/g;->e(Le/i;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception v0

    .line 67
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v3, "Can not perform this action after onSaveInstanceState"

    .line 72
    .line 73
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    :goto_0
    return-void

    .line 80
    :cond_1
    throw v0

    .line 81
    :pswitch_5
    check-cast v0, LD/j;

    .line 82
    .line 83
    iget-boolean v2, v0, LD/j;->p:Z

    .line 84
    .line 85
    if-nez v2, :cond_2

    .line 86
    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :cond_2
    iget-boolean v2, v0, LD/j;->n:Z

    .line 90
    .line 91
    iget-object v3, v0, LD/j;->b:LD/a;

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    iput-boolean v4, v0, LD/j;->n:Z

    .line 97
    .line 98
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v5

    .line 102
    iput-wide v5, v3, LD/a;->e:J

    .line 103
    .line 104
    const-wide/16 v7, -0x1

    .line 105
    .line 106
    iput-wide v7, v3, LD/a;->g:J

    .line 107
    .line 108
    iput-wide v5, v3, LD/a;->f:J

    .line 109
    .line 110
    const/high16 v2, 0x3f000000    # 0.5f

    .line 111
    .line 112
    iput v2, v3, LD/a;->h:F

    .line 113
    .line 114
    :cond_3
    iget-wide v5, v3, LD/a;->g:J

    .line 115
    .line 116
    const-wide/16 v7, 0x0

    .line 117
    .line 118
    cmp-long v2, v5, v7

    .line 119
    .line 120
    if-lez v2, :cond_4

    .line 121
    .line 122
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 123
    .line 124
    .line 125
    move-result-wide v5

    .line 126
    iget-wide v9, v3, LD/a;->g:J

    .line 127
    .line 128
    iget v2, v3, LD/a;->i:I

    .line 129
    .line 130
    int-to-long v11, v2

    .line 131
    add-long/2addr v9, v11

    .line 132
    cmp-long v2, v5, v9

    .line 133
    .line 134
    if-lez v2, :cond_4

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    invoke-virtual {v0}, LD/j;->e()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_5

    .line 142
    .line 143
    :goto_1
    iput-boolean v4, v0, LD/j;->p:Z

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    iget-boolean v2, v0, LD/j;->o:Z

    .line 147
    .line 148
    iget-object v5, v0, LD/j;->d:Landroid/widget/ListView;

    .line 149
    .line 150
    if-eqz v2, :cond_6

    .line 151
    .line 152
    iput-boolean v4, v0, LD/j;->o:Z

    .line 153
    .line 154
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 155
    .line 156
    .line 157
    move-result-wide v9

    .line 158
    const/4 v15, 0x0

    .line 159
    const/16 v16, 0x0

    .line 160
    .line 161
    const/4 v13, 0x3

    .line 162
    const/4 v14, 0x0

    .line 163
    move-wide v11, v9

    .line 164
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v5, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 172
    .line 173
    .line 174
    :cond_6
    iget-wide v9, v3, LD/a;->f:J

    .line 175
    .line 176
    cmp-long v2, v9, v7

    .line 177
    .line 178
    if-eqz v2, :cond_7

    .line 179
    .line 180
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 181
    .line 182
    .line 183
    move-result-wide v6

    .line 184
    invoke-virtual {v3, v6, v7}, LD/a;->a(J)F

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    const/high16 v4, -0x3f800000    # -4.0f

    .line 189
    .line 190
    mul-float/2addr v4, v2

    .line 191
    mul-float/2addr v4, v2

    .line 192
    const/high16 v8, 0x40800000    # 4.0f

    .line 193
    .line 194
    mul-float/2addr v2, v8

    .line 195
    add-float/2addr v2, v4

    .line 196
    iget-wide v8, v3, LD/a;->f:J

    .line 197
    .line 198
    sub-long v8, v6, v8

    .line 199
    .line 200
    iput-wide v6, v3, LD/a;->f:J

    .line 201
    .line 202
    long-to-float v4, v8

    .line 203
    mul-float/2addr v4, v2

    .line 204
    iget v2, v3, LD/a;->d:F

    .line 205
    .line 206
    mul-float/2addr v4, v2

    .line 207
    float-to-int v2, v4

    .line 208
    iget-object v0, v0, LD/j;->r:Li/t0;

    .line 209
    .line 210
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 211
    .line 212
    .line 213
    sget-object v0, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 214
    .line 215
    invoke-virtual {v5, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 216
    .line 217
    .line 218
    :goto_2
    return-void

    .line 219
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 220
    .line 221
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 222
    .line 223
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
