.class public final synthetic Lyyds/ᛸᛳᛳᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛸᛳᛳᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛸᛳᛳᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛸᛳᛳᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    .line 1
    iget p1, p0, Lyyds/ᛸᛳᛳᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lyyds/ᛸᛳᛳᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛸᛳᛳᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lyyds/ᲁᲇᛱᛴ;

    .line 13
    .line 14
    check-cast v1, Lyyds/ᲈᲁᲁᛲ;

    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᲁᲇᛱᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛶᛱᲇ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᛸᛶᛱᲇ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return v2

    .line 22
    :pswitch_0
    check-cast p0, Lyyds/ᛱᛷᛸᲈ;

    .line 23
    .line 24
    check-cast v1, Landroid/app/Dialog;

    .line 25
    .line 26
    sget-object p1, Lyyds/ᛵᛶᛲᛳ;->ᛲᲈᲁ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    .line 28
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {p0}, Lyyds/ᛵᛶᛲᛳ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 34
    .line 35
    .line 36
    return v2

    .line 37
    :pswitch_1
    check-cast p0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 38
    .line 39
    check-cast v1, Landroid/app/Dialog;

    .line 40
    .line 41
    invoke-static {p0}, Lyyds/ᛵᛶᛲᛳ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 45
    .line 46
    .line 47
    return v2

    .line 48
    :pswitch_2
    check-cast p0, Lyyds/ᲀᛳᲈᛱ;

    .line 49
    .line 50
    check-cast v1, Landroid/content/Context;

    .line 51
    .line 52
    invoke-virtual {p0}, Lyyds/ᲀᛳᲈᛱ;->ᛷᛲᲈᛱ()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    sget-object p1, Lyyds/ᛲᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᲈ;

    .line 57
    .line 58
    invoke-virtual {p1, v1, p0, v0}, Lyyds/ᛲᲁᲈ;->ᲀᛲᛲᲇ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return v2

    .line 62
    :pswitch_3
    check-cast p0, Lyyds/ᛲᲈᛷᛳ;

    .line 63
    .line 64
    check-cast v1, Lcom/bytedance/im/core/model/Message;

    .line 65
    .line 66
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v3, Lyyds/ᛴᛵᛵᛸ;

    .line 71
    .line 72
    invoke-direct {v3, v1, v0, v2}, Lyyds/ᛴᛵᛵᛸ;-><init>(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 73
    .line 74
    .line 75
    const/4 v1, 0x3

    .line 76
    invoke-static {p1, v0, v3, v1}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, Lyyds/ᛲᲈᛷᛳ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 80
    .line 81
    const-wide v0, -0x3b24be68a836eL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const/4 v0, 0x0

    .line 91
    new-array v1, v0, [Ljava/lang/Object;

    .line 92
    .line 93
    if-eqz p0, :cond_0

    .line 94
    .line 95
    :try_start_0
    sget v3, Lyyds/ᲁᛸᛵᲁ;->ᛲᲈᲁ:I

    .line 96
    .line 97
    invoke-static {p0}, Lyyds/ᛲᲇᲁᛳ;->ᛷᛵᲇᲀ(Ljava/lang/Object;)Lyyds/ᲀᛵᲁᛴ;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    iget-object v3, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v3, Lyyds/ᛴᛸᛲᛳ;

    .line 104
    .line 105
    const/4 v4, 0x2

    .line 106
    iput v4, v3, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 107
    .line 108
    invoke-virtual {p0}, Lyyds/ᲀᛵᲁᛴ;->ᛶᲈᛴᲈ()Lyyds/ᛵᲀᲀᛶ;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Lyyds/ᲇᛴᲇᛶ;->ᲇᲈᛵᛷ()V

    .line 113
    .line 114
    .line 115
    iput-object p1, p0, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 116
    .line 117
    const-wide v3, -0x3193de68a836eL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Lyyds/ᛳᛲᛶᛴ;

    .line 134
    .line 135
    if-eqz p0, :cond_0

    .line 136
    .line 137
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p0, p1}, Lyyds/ᛳᛲᛶᛴ;->ᛱᛳᛶᛳ([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :catch_0
    move-exception p0

    .line 146
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 147
    .line 148
    const-wide v0, -0x3b253e68a836eL

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :cond_0
    :goto_0
    return v2

    .line 161
    :pswitch_4
    check-cast p0, Ljava/lang/String;

    .line 162
    .line 163
    check-cast v1, Lyyds/ᛱᛸᛳᛱ;

    .line 164
    .line 165
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 166
    .line 167
    new-instance v3, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-wide v4, -0x75dce68a836eL

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {p1, v3}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    sget-object p1, Lyyds/ᛲᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᲈ;

    .line 192
    .line 193
    iget-object v1, v1, Lyyds/ᛱᛸᛳᛱ;->ᛲᛴᛳᛲ:Landroid/widget/TextView;

    .line 194
    .line 195
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const-wide v3, -0x75e3e68a836eL

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, v1, p0, v0}, Lyyds/ᛲᲁᲈ;->ᲀᛲᛲᲇ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return v2

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
