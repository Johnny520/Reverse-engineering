.class public final Lyyds/ᛷᛲᛸᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic ᛲᲈᲁ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛷᛲᛸᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Lyyds/ᛷᛲᛸᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lyyds/ᛱᲈᲁᛳ;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iput v2, p0, Lyyds/ᛱᲈᲁᛳ;->ᲀᛲᛳᲀ:I

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iput v2, p0, Lyyds/ᛱᲈᲁᛳ;->ᲇᲈᛵᛷ:I

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput v2, p0, Lyyds/ᛱᲈᲁᛳ;->ᛲᛴᛳᛲ:I

    .line 30
    .line 31
    if-lez v2, :cond_0

    .line 32
    .line 33
    new-array v2, v2, [I

    .line 34
    .line 35
    iput-object v2, p0, Lyyds/ᛱᲈᲁᛳ;->ᲇᲇᲇᛱ:[I

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iput v2, p0, Lyyds/ᛱᲈᲁᛳ;->ᛶᛷᛲᲁ:I

    .line 45
    .line 46
    if-lez v2, :cond_1

    .line 47
    .line 48
    new-array v2, v2, [I

    .line 49
    .line 50
    iput-object v2, p0, Lyyds/ᛱᲈᲁᛳ;->ᛱᲈᲁ:[I

    .line 51
    .line 52
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-ne v2, v0, :cond_2

    .line 60
    .line 61
    move v2, v0

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v2, v1

    .line 64
    :goto_0
    iput-boolean v2, p0, Lyyds/ᛱᲈᲁᛳ;->ᛷᲈᲈᲁ:Z

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-ne v2, v0, :cond_3

    .line 71
    .line 72
    move v2, v0

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move v2, v1

    .line 75
    :goto_1
    iput-boolean v2, p0, Lyyds/ᛱᲈᲁᛳ;->ᛷᛲᲈᛱ:Z

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-ne v2, v0, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move v0, v1

    .line 85
    :goto_2
    iput-boolean v0, p0, Lyyds/ᛱᲈᲁᛳ;->ᛷᛵᲇᲀ:Z

    .line 86
    .line 87
    const-class v0, Lyyds/ᛳᛶᛷᛸ;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Lyyds/ᛱᲈᲁᛳ;->ᛲᛳᛶᲁ:Ljava/util/ArrayList;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_0
    new-instance p0, Lyyds/ᛳᛶᛷᛸ;

    .line 101
    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    iput v2, p0, Lyyds/ᛳᛶᛷᛸ;->ᲀᛲᛳᲀ:I

    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    iput v2, p0, Lyyds/ᛳᛶᛷᛸ;->ᲇᲈᛵᛷ:I

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-ne v2, v0, :cond_5

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    move v0, v1

    .line 125
    :goto_3
    iput-boolean v0, p0, Lyyds/ᛳᛶᛷᛸ;->ᲇᲇᲇᛱ:Z

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-lez v0, :cond_6

    .line 132
    .line 133
    new-array v0, v0, [I

    .line 134
    .line 135
    iput-object v0, p0, Lyyds/ᛳᛶᛷᛸ;->ᛲᛴᛳᛲ:[I

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V

    .line 138
    .line 139
    .line 140
    :cond_6
    return-object p0

    .line 141
    :pswitch_1
    new-instance p0, Lyyds/ᛴᲁᛸᛶ;

    .line 142
    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_2
    new-instance p0, Lyyds/ᛳᛶᛸᛱ;

    .line 148
    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_3
    new-instance p0, Lyyds/ᛴᛶᛷᛱ;

    .line 154
    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_4
    new-instance p0, Lyyds/ᲁᛱᛶᛶ;

    .line 160
    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_5
    new-instance p0, Lyyds/ᛵᛵᛷᛵ;

    .line 166
    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_6
    new-instance p0, Landroidx/versionedparcelable/ParcelImpl;

    .line 172
    .line 173
    invoke-direct {p0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_7
    new-instance p0, Lyyds/ᲇᛴᛶᛶ;

    .line 178
    .line 179
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    iput p1, p0, Lyyds/ᲇᛴᛶᛶ;->ᲀᛲᛳᲀ:I

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_8
    new-instance p0, Lyyds/ᛶᛱᲇᛲ;

    .line 190
    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    iput v2, p0, Lyyds/ᛶᛱᲇᛲ;->ᲀᛲᛳᲀ:I

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    iput v2, p0, Lyyds/ᛶᛱᲇᛲ;->ᲇᲈᛵᛷ:I

    .line 205
    .line 206
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-ne p1, v0, :cond_7

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_7
    move v0, v1

    .line 214
    :goto_4
    iput-boolean v0, p0, Lyyds/ᛶᛱᲇᛲ;->ᛲᛴᛳᛲ:Z

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_9
    new-instance p0, Lyyds/ᛷᛱᛶᲈ;

    .line 218
    .line 219
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 220
    .line 221
    .line 222
    return-object p0

    .line 223
    :pswitch_a
    new-instance p0, Lyyds/ᛸᛴᛴᛶ;

    .line 224
    .line 225
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-eqz p1, :cond_8

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_8
    move v0, v1

    .line 236
    :goto_5
    iput-boolean v0, p0, Lyyds/ᛸᛴᛴᛶ;->ᲀᛲᛳᲀ:Z

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛷᛲᛸᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lyyds/ᛱᲈᲁᛳ;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lyyds/ᛳᛶᛷᛸ;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lyyds/ᛴᲁᛸᛶ;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lyyds/ᛳᛶᛸᛱ;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lyyds/ᛴᛶᛷᛱ;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lyyds/ᲁᛱᛶᛶ;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lyyds/ᛵᛵᛷᛵ;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lyyds/ᲇᛴᛶᛶ;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lyyds/ᛶᛱᲇᛲ;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lyyds/ᛷᛱᛶᲈ;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lyyds/ᛸᛴᛴᛶ;

    .line 40
    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
