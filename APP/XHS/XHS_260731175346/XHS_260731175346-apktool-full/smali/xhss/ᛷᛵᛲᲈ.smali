.class public final Lxhss/ᛷᛵᛲᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ᛷᛵᛵᲈ:Lxhss/ᲀᛸᛷᛱ;


# direct methods
.method public constructor <init>(Lxhss/ᲀᛸᛷᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛷᛵᛲᲈ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛸᛷᛱ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛵᛲᲈ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛸᛷᛱ;

    .line 2
    .line 3
    iget-object p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᲁᛳᛲ:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    invoke-virtual {p1, p4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Boolean;

    .line 14
    .line 15
    const/4 p4, 0x1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    move p1, p4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    :goto_0
    if-nez p1, :cond_1

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_1
    invoke-static {p2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    iget-wide v0, p0, Lxhss/ᲀᛸᛷᛱ;->ᲈᛱᛷᛵ:J

    .line 36
    .line 37
    sub-long v0, p1, v0

    .line 38
    .line 39
    const-wide/16 v2, 0x64

    .line 40
    .line 41
    cmp-long p5, v0, v2

    .line 42
    .line 43
    if-lez p5, :cond_7

    .line 44
    .line 45
    iput-wide p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᲈᛱᛷᛵ:J

    .line 46
    .line 47
    iget p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᛴᛲᛸ:F

    .line 48
    .line 49
    iget-object p2, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 50
    .line 51
    iget-object p2, p2, Lxhss/ᲁᛳᛵᛷ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    sub-float/2addr p1, p2

    .line 58
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    const/high16 p2, 0x41700000    # 15.0f

    .line 63
    .line 64
    invoke-virtual {p0, p2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ(F)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    int-to-float p2, p2

    .line 69
    cmpl-float p1, p1, p2

    .line 70
    .line 71
    if-lez p1, :cond_2

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_2
    iput p3, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲀᛸᛵ:I

    .line 76
    .line 77
    iget p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛵᲈᛱᛳ:I

    .line 78
    .line 79
    invoke-static {p1}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    if-eq p1, p4, :cond_5

    .line 86
    .line 87
    const/4 p2, 0x2

    .line 88
    if-eq p1, p2, :cond_3

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    iget-object p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛱᛴᲀ:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    iget-object p2, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛱᛴᲀ:Ljava/util/ArrayList;

    .line 102
    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    new-instance p1, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-direct {p1, p3}, Ljava/lang/Integer;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    :goto_1
    iget-object p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᛷᛵᛴ:Lxhss/ᛲᛳᛴᛳ;

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛱᛴᲀ:Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    new-array p1, p1, [I

    .line 133
    .line 134
    iput-object p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛲᛵᲁᲁ:[I

    .line 135
    .line 136
    iget-object p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛱᛴᲀ:Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    new-array p1, p1, [Ljava/lang/CharSequence;

    .line 143
    .line 144
    iput-object p1, p0, Lxhss/ᲀᛸᛷᛱ;->ᲇᛸᛶ:[Ljava/lang/CharSequence;

    .line 145
    .line 146
    const/4 p1, 0x0

    .line 147
    :goto_2
    iget-object p2, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛱᛴᲀ:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-ge p1, p2, :cond_7

    .line 154
    .line 155
    iget-object p2, p0, Lxhss/ᲀᛸᛷᛱ;->ᛲᛵᲁᲁ:[I

    .line 156
    .line 157
    iget-object p3, p0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛱᛴᲀ:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    check-cast p3, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result p3

    .line 169
    aput p3, p2, p1

    .line 170
    .line 171
    iget-object p2, p0, Lxhss/ᲀᛸᛷᛱ;->ᲇᛸᛶ:[Ljava/lang/CharSequence;

    .line 172
    .line 173
    iget-object p3, p0, Lxhss/ᲀᛸᛷᛱ;->ᛷᛸᛷ:Ljava/util/ArrayList;

    .line 174
    .line 175
    iget-object p4, p0, Lxhss/ᲀᛸᛷᛱ;->ᛲᛵᲁᲁ:[I

    .line 176
    .line 177
    aget p4, p4, p1

    .line 178
    .line 179
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    check-cast p3, Ljava/lang/CharSequence;

    .line 184
    .line 185
    aput-object p3, p2, p1

    .line 186
    .line 187
    add-int/lit8 p1, p1, 0x1

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_5
    iget-object p0, p0, Lxhss/ᲀᛸᛷᛱ;->ᛴᛷᛵᛴ:Lxhss/ᛲᛳᛴᛳ;

    .line 191
    .line 192
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_6
    new-instance p1, Lxhss/ᲇᛶᲈᛸ;

    .line 197
    .line 198
    invoke-direct {p1, p0, p4}, Lxhss/ᲇᛶᲈᛸ;-><init>(Lxhss/ᛱᛴᛳᛴ;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 202
    .line 203
    .line 204
    :cond_7
    :goto_3
    return-void
.end method
