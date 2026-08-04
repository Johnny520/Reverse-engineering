.class public final synthetic Lyyds/ᛴᛵᲇᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;Lyyds/ᛴᲁᛱᲇ;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᛴᛵᲇᛲ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛴᛵᲇᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    iput p1, p0, Lyyds/ᛴᛵᲇᛲ;->ᲇᲈᛵᛷ:I

    .line 10
    .line 11
    iput-object p2, p0, Lyyds/ᛴᛵᲇᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ILyyds/ᛱᛶᛵᛲ;Lyyds/ᲁᲇᲈᲁ;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛴᛵᲇᛲ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lyyds/ᛴᛵᲇᛲ;->ᲇᲈᛵᛷ:I

    iput-object p2, p0, Lyyds/ᛴᛵᲇᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛴᛵᲇᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/reflect/Method;I)V
    .locals 1

    .line 15
    const/4 v0, 0x2

    iput v0, p0, Lyyds/ᛴᛵᲇᛲ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᛴᛵᲇᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛴᛵᲇᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    iput p3, p0, Lyyds/ᛴᛵᲇᛲ;->ᲇᲈᛵᛷ:I

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛱᛷᛸᲈ;Lyyds/ᲇᲁᛷᛵ;Landroid/content/Context;I)V
    .locals 0

    .line 16
    const/4 p3, 0x3

    iput p3, p0, Lyyds/ᛴᛵᲇᛲ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᛴᛵᲇᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛴᛵᲇᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    iput p4, p0, Lyyds/ᛴᛵᲇᛲ;->ᲇᲈᛵᛷ:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛴᛵᲇᛲ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lyyds/ᛴᛵᲇᛲ;->ᲇᲈᛵᛷ:I

    .line 5
    .line 6
    iget-object v3, p0, Lyyds/ᛴᛵᲇᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛴᛵᲇᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lyyds/ᛱᛷᛸᲈ;

    .line 14
    .line 15
    check-cast v3, Lyyds/ᲇᲁᛷᛵ;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    instance-of v0, p1, Lyyds/ᛶᲈᲀᲀ;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    move-object v1, p1

    .line 26
    check-cast v1, Lyyds/ᛶᲈᲀᲀ;

    .line 27
    .line 28
    :cond_0
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {p0, v3, v2, v1}, Lyyds/ᛱᛵᛱᛱ;->ᛱᛳᛶᛳ(Lyyds/ᛱᛷᛸᲈ;Lyyds/ᲇᲁᛷᛵ;ILyyds/ᛶᲈᲀᲀ;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :pswitch_0
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    check-cast v3, Ljava/lang/reflect/Method;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v3, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object p0, p1

    .line 66
    :goto_1
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 73
    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-wide v3, -0x2fe69e68a836eL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_2
    return-void

    .line 99
    :pswitch_1
    check-cast p0, Lyyds/ᛴᲁᛱᲇ;

    .line 100
    .line 101
    check-cast v3, Ljava/util/List;

    .line 102
    .line 103
    iput v2, p0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 104
    .line 105
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const/4 v0, 0x0

    .line 110
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    add-int/lit8 v3, v0, 0x1

    .line 121
    .line 122
    if-ltz v0, :cond_5

    .line 123
    .line 124
    check-cast v2, Landroid/widget/LinearLayout;

    .line 125
    .line 126
    iget v4, p0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 127
    .line 128
    if-ne v0, v4, :cond_4

    .line 129
    .line 130
    const/high16 v0, 0x3f800000    # 1.0f

    .line 131
    .line 132
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 133
    .line 134
    .line 135
    const v0, 0x6608006f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x41000000    # 8.0f

    .line 142
    .line 143
    invoke-virtual {v2, v0}, Landroid/view/View;->setElevation(F)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_4
    const/high16 v0, 0x3f000000    # 0.5f

    .line 148
    .line 149
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 150
    .line 151
    .line 152
    const v0, 0x66080070

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 156
    .line 157
    .line 158
    const/4 v0, 0x0

    .line 159
    invoke-virtual {v2, v0}, Landroid/view/View;->setElevation(F)V

    .line 160
    .line 161
    .line 162
    :goto_4
    move v0, v3

    .line 163
    goto :goto_3

    .line 164
    :cond_5
    invoke-static {}, Lyyds/ᲈᛸᲁᛶ;->ᲀᛲᛲᲇ()V

    .line 165
    .line 166
    .line 167
    throw v1

    .line 168
    :cond_6
    return-void

    .line 169
    :pswitch_2
    check-cast p0, Lyyds/ᛱᛶᛵᛲ;

    .line 170
    .line 171
    check-cast v3, Lyyds/ᲁᲇᲈᲁ;

    .line 172
    .line 173
    iget-object p1, v3, Lyyds/ᲁᲇᲈᲁ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 174
    .line 175
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 176
    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    const-wide v4, -0xb24ce68a836eL

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v0, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ()I

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    const/4 v0, -0x1

    .line 206
    if-eq p0, v0, :cond_7

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-ge p0, v0, :cond_7

    .line 213
    .line 214
    iget-object v0, v3, Lyyds/ᲁᲇᲈᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛶᛲᛸ;

    .line 215
    .line 216
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    check-cast p0, Lyyds/ᲇᲀᲈᛱ;

    .line 225
    .line 226
    iget-object p0, p0, Lyyds/ᲇᲀᲈᛱ;->ᛲᲈᲁ:Ljava/io/File;

    .line 227
    .line 228
    invoke-virtual {v0, v1, p0}, Lyyds/ᛸᛶᛲᛸ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    :cond_7
    return-void

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
