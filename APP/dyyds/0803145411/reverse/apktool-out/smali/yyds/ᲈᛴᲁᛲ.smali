.class public final Lyyds/ᲈᛴᲁᛲ;
.super Landroid/view/ViewOutlineProvider;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲈᛴᲁᛲ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲈᛴᲁᛲ;->ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 14

    .line 1
    iget v0, p0, Lyyds/ᲈᛴᲁᛲ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲈᛴᲁᛲ;->ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-wide v0, -0x4733ee68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    const-wide v0, -0x47343e68a836eL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 33
    .line 34
    const/16 v0, 0xa

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    move-object/from16 v2, p2

    .line 43
    .line 44
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_0
    const-wide v0, -0x4884ce68a836eL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    const-wide v0, -0x48851e68a836eL

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 73
    .line 74
    const/16 v0, 0x19

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    const/4 v9, 0x0

    .line 81
    const/4 v10, 0x0

    .line 82
    move-object/from16 v8, p2

    .line 83
    .line 84
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_1
    const-wide v0, -0x10101e68a836eL

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    const-wide v0, -0x10106e68a836eL

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 113
    .line 114
    const/16 v0, 0xb

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    const/4 v9, 0x0

    .line 121
    const/4 v10, 0x0

    .line 122
    move-object/from16 v8, p2

    .line 123
    .line 124
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_2
    const-wide v0, -0x4cb32e68a836eL

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    const-wide v0, -0x4cb37e68a836eL

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 153
    .line 154
    const/16 v0, 0xc

    .line 155
    .line 156
    invoke-virtual {p0, v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    const/4 v9, 0x0

    .line 161
    const/4 v10, 0x0

    .line 162
    move-object/from16 v8, p2

    .line 163
    .line 164
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
