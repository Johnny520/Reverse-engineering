.class public final synthetic Lyyds/ᲈᛶᛵᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲈᛶᛵᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲈᛶᛵᛸ;->ᲇᲈᛵᛷ:Landroid/view/ViewGroup;

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
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᲈᛶᛵᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lyyds/ᲈᛶᛵᛸ;->ᲇᲈᛵᛷ:Landroid/view/ViewGroup;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lyyds/ᲈᲇᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛲᛶᛱ;

    .line 11
    .line 12
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lyyds/ᛴᲈᛳᲀ;

    .line 17
    .line 18
    new-instance v1, Lyyds/ᛴᛵᛵᛸ;

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    invoke-direct {v1, p0, v2, v3}, Lyyds/ᛴᛵᛵᛸ;-><init>(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x3

    .line 25
    invoke-static {v0, v2, v1, p0}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    sget-object v0, Lyyds/ᛳᛶᛶᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛶᛶᛴ;

    .line 30
    .line 31
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lyyds/ᛳᛶᛶᛴ;->ᛱᛳᛶᛳ(Landroid/view/ViewGroup;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    move-object p0, v0

    .line 47
    :goto_0
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 54
    .line 55
    const-wide v1, -0x38b80e68a836eL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v1, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    return-void

    .line 68
    :pswitch_1
    invoke-virtual {p0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_2
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲇᛱᛲ()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    sget-object p0, Lyyds/ᛶᲁᛸᲇ;->ᛲᲈᲁ:Lyyds/ᛶᲁᛸᲇ;

    .line 87
    .line 88
    invoke-static {p0}, Lyyds/ᛶᲁᛸᲇ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲁᛸᲇ;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    sget-object v0, Lyyds/ᛶᲁᛸᲇ;->ᛲᲈᲁ:Lyyds/ᛶᲁᛸᲇ;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-static {p0}, Lyyds/ᛶᲁᛸᲇ;->ᛲᲈᲁ(Landroid/view/ViewGroup;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-void

    .line 101
    :pswitch_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0}, Lyyds/ᛵᛶᛵᲈ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const v2, 0x660c0022

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object v2, v0

    .line 117
    check-cast v2, Landroid/widget/LinearLayout;

    .line 118
    .line 119
    const v3, 0x66090392

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v3}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Landroid/widget/ImageView;

    .line 127
    .line 128
    if-eqz v4, :cond_2

    .line 129
    .line 130
    const-wide v5, -0x3661ae68a836eL

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 139
    .line 140
    .line 141
    new-instance p0, Lyyds/ᲈᛳᛲᛶ;

    .line 142
    .line 143
    const/4 v0, 0x2

    .line 144
    invoke-direct {p0, v0}, Lyyds/ᲈᛳᛲᛶ;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    const-wide v0, -0x63251e68a836eL

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛱᛳᲇ(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :goto_2
    return-void

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
