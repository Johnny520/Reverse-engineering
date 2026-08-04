.class public final synthetic Lyyds/ᛱᛱᛱᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Landroid/view/View;

.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᛶᛷᛲᲁ:Landroid/view/View;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p6, p0, Lyyds/ᛱᛱᛱᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛱᛱᛱᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lyyds/ᛱᛱᛱᛴ;->ᲇᲈᛵᛷ:I

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛱᛱᛱᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lyyds/ᛱᛱᛱᛴ;->ᛶᛷᛲᲁ:Landroid/view/View;

    .line 10
    .line 11
    iput-object p5, p0, Lyyds/ᛱᛱᛱᛴ;->ᛱᲈᲁ:Landroid/view/View;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᛱᛱᛱᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lyyds/ᛱᛱᛱᛴ;->ᛱᲈᲁ:Landroid/view/View;

    .line 8
    .line 9
    iget-object v5, p0, Lyyds/ᛱᛱᛱᛴ;->ᛶᛷᛲᲁ:Landroid/view/View;

    .line 10
    .line 11
    iget-object v6, p0, Lyyds/ᛱᛱᛱᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 12
    .line 13
    iget v7, p0, Lyyds/ᛱᛱᛱᛴ;->ᲇᲈᛵᛷ:I

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛱᛱᛱᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p0, Landroid/content/Context;

    .line 21
    .line 22
    check-cast v6, Lcom/android/app/CustomRecyclerView;

    .line 23
    .line 24
    check-cast v5, Lcom/android/app/CustomRecyclerView;

    .line 25
    .line 26
    check-cast v4, Landroid/widget/LinearLayout;

    .line 27
    .line 28
    check-cast p1, Ljava/util/List;

    .line 29
    .line 30
    const-wide v8, -0x38014e68a836eL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/16 v8, 0x8

    .line 43
    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    new-instance v0, Lyyds/ᛶᲈᛲᛵ;

    .line 47
    .line 48
    new-instance v9, Lyyds/ᛲᲈᛳᲈ;

    .line 49
    .line 50
    invoke-direct {v9, p0, v2}, Lyyds/ᛲᲈᛳᲈ;-><init>(Landroid/content/Context;I)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, p0, p1, v7, v9}, Lyyds/ᛶᲈᛲᛵ;-><init>(Landroid/content/Context;Ljava/util/List;ILyyds/ᛲᲈᛳᲈ;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6, v0}, Lyyds/ᛵᲇᛲᛱ;->setAdapter(Lyyds/ᛲᛵᲇᛳ;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v8}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v8}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    :goto_0
    return-object v1

    .line 79
    :pswitch_0
    check-cast p0, Lyyds/ᛴᛸᛵᲈ;

    .line 80
    .line 81
    check-cast v6, Lyyds/ᛶᲀᲈᛷ;

    .line 82
    .line 83
    check-cast v5, Landroid/widget/EditText;

    .line 84
    .line 85
    check-cast p1, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛲᛳᛶᲁ()V

    .line 88
    .line 89
    .line 90
    if-nez p1, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    ushr-int/lit8 p0, v7, 0x18

    .line 94
    .line 95
    and-int/lit16 p0, p0, 0xff

    .line 96
    .line 97
    shl-int/lit8 p0, p0, 0x18

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    const v0, 0xffffff

    .line 104
    .line 105
    .line 106
    and-int/2addr p1, v0

    .line 107
    or-int/2addr p0, p1

    .line 108
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᲀᲇᛶᲈ:Lyyds/ᛳᲀᛲ;

    .line 114
    .line 115
    sget-object v7, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 116
    .line 117
    const/16 v8, 0x4d

    .line 118
    .line 119
    aget-object v7, v7, v8

    .line 120
    .line 121
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-virtual {v0, v7, v8}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iput-boolean v2, v6, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 129
    .line 130
    invoke-static {p0}, Lyyds/ᛳᛷᲀᛴ;->ᲀᛲᛱᛱ(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {v5, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    iput-boolean v3, v6, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛶᛳᛶᛵ()I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    invoke-virtual {v4, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 147
    .line 148
    .line 149
    invoke-static {}, Lyyds/ᛳᛷᲀᛴ;->ᛷᲇᛲᛱ()V

    .line 150
    .line 151
    .line 152
    :goto_1
    return-object v1

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
