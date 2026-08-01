.class public final Lcc;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcc;->a:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const/16 p1, 0x46

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x2

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    aget-object v0, v0, v1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 17
    :goto_1
    invoke-static {v0}, Lfc;->Q(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_2
    invoke-virtual {p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    instance-of v1, p1, Landroid/view/View;

    .line 30
    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_3
    check-cast p1, Landroid/view/View;

    .line 36
    .line 37
    const-string v1, "\u590d\u8bfb"

    .line 38
    .line 39
    invoke-static {p1}, Lfc;->x(Landroid/view/View;)Landroid/widget/TextView;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_4
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :catchall_0
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v2, p0, Lcc;->a:Ljava/lang/ClassLoader;

    .line 57
    .line 58
    invoke-static {v2, v1}, Lfc;->J(Ljava/lang/ClassLoader;Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    const/4 v2, 0x0

    .line 63
    if-nez v1, :cond_7

    .line 64
    .line 65
    :try_start_1
    const-string v1, "mListenerInfo"

    .line 66
    .line 67
    invoke-static {p1, v1}, Lfc;->D(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-nez v1, :cond_5

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_5
    const-string v3, "mOnClickListener"

    .line 75
    .line 76
    invoke-static {v1, v3}, Lfc;->D(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    instance-of v1, v1, Landroid/view/View$OnClickListener;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :catchall_1
    :goto_3
    move v1, v2

    .line 84
    :goto_4
    if-nez v1, :cond_7

    .line 85
    .line 86
    iget-object p0, p0, Lcc;->a:Ljava/lang/ClassLoader;

    .line 87
    .line 88
    sget-object v1, Lfc;->c:Ljava/util/Map;

    .line 89
    .line 90
    monitor-enter v1

    .line 91
    :try_start_2
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 96
    sget-object v4, Lfc;->d:Ljava/util/Map;

    .line 97
    .line 98
    monitor-enter v4

    .line 99
    :try_start_3
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 104
    sget-object v5, Lfc;->e:Ljava/util/Map;

    .line 105
    .line 106
    monitor-enter v5

    .line 107
    :try_start_4
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v4, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 118
    if-nez v3, :cond_6

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_6
    :try_start_5
    new-instance v4, Lcom/mr/elaris/v;

    .line 122
    .line 123
    invoke-direct {v4, v1, p0, v3, v0}, Lcom/mr/elaris/v;-><init>(Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/Object;Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :catchall_2
    move-exception p0

    .line 131
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 132
    throw p0

    .line 133
    :catchall_3
    move-exception p0

    .line 134
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 135
    throw p0

    .line 136
    :catchall_4
    move-exception p0

    .line 137
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 138
    throw p0

    .line 139
    :catchall_5
    :cond_7
    :goto_5
    invoke-static {p1}, Lfc;->w(Landroid/view/View;)Landroid/widget/ImageView;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    if-nez p0, :cond_8

    .line 144
    .line 145
    :goto_6
    return-void

    .line 146
    :cond_8
    new-instance p1, Lgc;

    .line 147
    .line 148
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-nez v0, :cond_9

    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_9
    :try_start_9
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    const-string v3, "qui_common_text_allwhite_primary"

    .line 160
    .line 161
    const-string v4, "color"

    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-virtual {v1, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_a

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 174
    .line 175
    .line 176
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 177
    goto :goto_8

    .line 178
    :catchall_6
    :cond_a
    :goto_7
    const/4 v0, -0x1

    .line 179
    :goto_8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 188
    .line 189
    invoke-direct {p1, v0, v1}, Lgc;-><init>(IF)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 193
    .line 194
    .line 195
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 196
    .line 197
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 201
    .line 202
    .line 203
    return-void
.end method
