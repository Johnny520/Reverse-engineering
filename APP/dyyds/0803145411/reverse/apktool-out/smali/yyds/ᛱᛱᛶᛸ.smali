.class public final Lyyds/ᛱᛱᛶᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 13
    const/4 v0, 0x2

    iput v0, p0, Lyyds/ᛱᛱᛶᛸ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lyyds/ᛱᛱᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛱᛱᛶᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛱᛱᛶᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛱᛱᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᛱᛱᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᛱᛱᛶᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v0

    .line 11
    check-cast v3, Lyyds/ᛸᲀᛱᛴ;

    .line 12
    .line 13
    :try_start_0
    iget-object v0, v3, Lyyds/ᛸᲀᛱᛴ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛴᛲ;

    .line 14
    .line 15
    sget-object v1, Lyyds/ᛱᛵᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲁ;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lyyds/ᲁᛴᛲ;->ᛳᲁᲁᲇ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛴᛲ;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lyyds/ᛷᲁᛴᲇ;

    .line 22
    .line 23
    iget-object v2, p0, Lyyds/ᛱᛱᛶᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 26
    .line 27
    iget-object p0, p0, Lyyds/ᛱᛱᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v4, p0

    .line 30
    check-cast v4, Lyyds/ᛱᲁᛴᛴ;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    const/16 v6, 0xb

    .line 34
    .line 35
    invoke-direct/range {v1 .. v6}, Lyyds/ᛷᲁᛴᲇ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lyyds/ᲁᛴᛵᛱ;->ᛱᲈᲁ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p0, v0

    .line 44
    invoke-virtual {v3, p0}, Lyyds/ᛸᲀᛱᛴ;->ᛶᛳᛶᛵ(Ljava/lang/Throwable;)Z

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lyyds/ᛱᛱᛶᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lyyds/ᲀᲁᛴᛴ;

    .line 51
    .line 52
    invoke-virtual {v0}, Lyyds/ᲀᲁᛴᛴ;->call()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    :catch_0
    iget-object v0, p0, Lyyds/ᛱᛱᛶᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lyyds/ᲁᛳᲈᲇ;

    .line 59
    .line 60
    iget-object p0, p0, Lyyds/ᛱᛱᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Landroid/os/Handler;

    .line 63
    .line 64
    new-instance v3, Lyyds/ᲈᛵᛶᛲ;

    .line 65
    .line 66
    const/4 v4, 0x7

    .line 67
    invoke-direct {v3, v4, v0, v1, v2}, Lyyds/ᲈᛵᛶᛲ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_1
    iget-object v0, p0, Lyyds/ᛱᛱᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lyyds/ᛲᲈᛷᛳ;

    .line 77
    .line 78
    iget-object v3, p0, Lyyds/ᛱᛱᛶᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, Landroid/content/Context;

    .line 81
    .line 82
    sget-object v4, Lyyds/ᛶᲁᛳᛴ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 83
    .line 84
    iget-object p0, p0, Lyyds/ᛱᛱᛶᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, Landroid/view/ViewGroup;

    .line 87
    .line 88
    const-wide v4, -0x39d75e68a836eL

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-static {p0, v4}, Lyyds/ᛶᲁᛳᛴ;->ᛱᲈᲁ(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    instance-of v4, p0, Landroid/view/ViewGroup;

    .line 102
    .line 103
    if-eqz v4, :cond_0

    .line 104
    .line 105
    check-cast p0, Landroid/view/ViewGroup;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_0
    move-object p0, v1

    .line 109
    :goto_1
    if-nez p0, :cond_1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_1
    sget-object v4, Lyyds/ᛷᛷᲀᛵ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛷᲀᛵ;

    .line 113
    .line 114
    const-wide v5, -0x2b5a1e68a836eL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-static {p0, v4}, Lyyds/ᛷᛴᲇᛲ;->ᛶᛷᛲᲁ(Landroid/view/ViewGroup;Lyyds/ᛷᛴᲈᲀ;)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    if-eqz v4, :cond_2

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_2
    move-object v4, v1

    .line 130
    :goto_2
    check-cast v4, Landroid/widget/ImageView;

    .line 131
    .line 132
    if-nez v4, :cond_3

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_3
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    instance-of v5, p0, Landroid/widget/ImageView;

    .line 140
    .line 141
    if-eqz v5, :cond_4

    .line 142
    .line 143
    move-object v1, p0

    .line 144
    check-cast v1, Landroid/widget/ImageView;

    .line 145
    .line 146
    :cond_4
    if-eqz v1, :cond_5

    .line 147
    .line 148
    new-instance p0, Lyyds/ᛳᲈᲁᛵ;

    .line 149
    .line 150
    invoke-direct {p0, v3, v0, v2}, Lyyds/ᛳᲈᲁᛵ;-><init>(Landroid/content/Context;Lyyds/ᛲᲈᛷᛳ;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 154
    .line 155
    .line 156
    :cond_5
    new-instance p0, Lyyds/ᛳᲈᲁᛵ;

    .line 157
    .line 158
    const/4 v1, 0x1

    .line 159
    invoke-direct {p0, v3, v0, v1}, Lyyds/ᛳᲈᲁᛵ;-><init>(Landroid/content/Context;Lyyds/ᛲᲈᛷᛳ;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 163
    .line 164
    .line 165
    :goto_3
    return-void

    .line 166
    :pswitch_2
    iget-object v0, p0, Lyyds/ᛱᛱᛶᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Landroid/view/View;

    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iget-object v2, p0, Lyyds/ᛱᛱᛶᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 177
    .line 178
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-ne v1, v2, :cond_6

    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    const-string v0, "\u5df2\u5904\u4e8e\u663e\u793a\u72b6\u6001\uff0c\u8bf7\u52ff\u91cd\u590d\u6267\u884c show() \u6307\u4ee4\u3002"

    .line 195
    .line 196
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    if-eqz v1, :cond_7

    .line 209
    .line 210
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Landroid/view/ViewGroup;

    .line 215
    .line 216
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 217
    .line 218
    .line 219
    :cond_7
    iget-object p0, p0, Lyyds/ᛱᛱᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p0, Landroid/widget/FrameLayout;

    .line 222
    .line 223
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 224
    .line 225
    .line 226
    :goto_4
    return-void

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
