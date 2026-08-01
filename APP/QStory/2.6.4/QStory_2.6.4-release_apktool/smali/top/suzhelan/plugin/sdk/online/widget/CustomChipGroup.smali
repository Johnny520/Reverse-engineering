.class public final Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;
.super L飘花落叶言楪苏哲子世兰/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u001d\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R*\u0010\u0010\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00088\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u54f2\u5b50\u4e16\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "value",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2",
        "I",
        "getMaxRows",
        "()I",
        "setMaxRows",
        "(I)V",
        "maxRows",
        "QStory:online-plugin-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public 飘花落叶言子世楪苏兰哲:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪苏世兰哲;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    const v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    iput v0, p0, Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;->飘花落叶言子世楪苏兰哲:I

    .line 11
    .line 12
    sget-object v1, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 13
    .line 14
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-virtual {p0, p2}, Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;->setMaxRows(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final getMaxRows()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;->飘花落叶言子世楪苏兰哲:I

    .line 2
    .line 3
    return p0
.end method

.method public final onMeasure(II)V
    .locals 11

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/android/material/internal/飘花落叶言子楪苏世哲兰;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-boolean p2, p0, Lcom/google/android/material/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 5
    .line 6
    if-nez p2, :cond_f

    .line 7
    .line 8
    iget p2, p0, Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;->飘花落叶言子世楪苏兰哲:I

    .line 9
    .line 10
    const v0, 0x7fffffff

    .line 11
    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_d

    .line 16
    .line 17
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-lez p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    sub-int/2addr p1, p2

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    :goto_0
    sub-int/2addr p1, p2

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-lez p1, :cond_e

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    sub-int/2addr p1, p2

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    goto :goto_0

    .line 54
    :goto_1
    const/4 p2, 0x0

    .line 55
    if-gez p1, :cond_2

    .line 56
    .line 57
    move p1, p2

    .line 58
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/4 v1, 0x1

    .line 63
    move v2, p2

    .line 64
    move v3, v2

    .line 65
    move v4, v3

    .line 66
    move v5, v4

    .line 67
    move v6, v5

    .line 68
    move v7, v1

    .line 69
    :goto_2
    if-ge v2, v0, :cond_c

    .line 70
    .line 71
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    const/16 v10, 0x8

    .line 80
    .line 81
    if-ne v9, v10, :cond_3

    .line 82
    .line 83
    goto/16 :goto_b

    .line 84
    .line 85
    :cond_3
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    instance-of v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 90
    .line 91
    if-eqz v9, :cond_4

    .line 92
    .line 93
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    const/4 v3, 0x0

    .line 97
    :goto_3
    if-eqz v3, :cond_5

    .line 98
    .line 99
    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_5
    move v9, p2

    .line 103
    :goto_4
    if-eqz v3, :cond_6

    .line 104
    .line 105
    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_6
    move v10, p2

    .line 109
    :goto_5
    add-int/2addr v9, v10

    .line 110
    if-eqz v3, :cond_7

    .line 111
    .line 112
    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_7
    move v10, p2

    .line 116
    :goto_6
    if-eqz v3, :cond_8

    .line 117
    .line 118
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_8
    move v3, p2

    .line 122
    :goto_7
    add-int/2addr v10, v3

    .line 123
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    add-int/2addr v3, v9

    .line 128
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    add-int/2addr v8, v10

    .line 133
    if-nez v6, :cond_9

    .line 134
    .line 135
    move v9, p2

    .line 136
    goto :goto_8

    .line 137
    :cond_9
    invoke-virtual {p0}, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪苏世兰哲;->getChipSpacingHorizontal()I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    :goto_8
    if-lez v6, :cond_b

    .line 142
    .line 143
    add-int v10, v6, v9

    .line 144
    .line 145
    add-int/2addr v10, v3

    .line 146
    if-le v10, p1, :cond_b

    .line 147
    .line 148
    add-int/2addr v4, v5

    .line 149
    iget v5, p0, Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;->飘花落叶言子世楪苏兰哲:I

    .line 150
    .line 151
    if-ne v7, v5, :cond_a

    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    add-int/2addr p1, v4

    .line 158
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    :goto_9
    add-int/2addr p2, p1

    .line 163
    goto :goto_c

    .line 164
    :cond_a
    invoke-virtual {p0}, L飘花落叶言楪苏哲子世兰/飘花落叶言子楪苏世兰哲;->getChipSpacingVertical()I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    add-int/2addr v4, v5

    .line 169
    add-int/lit8 v7, v7, 0x1

    .line 170
    .line 171
    move v6, v3

    .line 172
    move v5, v8

    .line 173
    :goto_a
    move v3, v1

    .line 174
    goto :goto_b

    .line 175
    :cond_b
    add-int/2addr v9, v3

    .line 176
    add-int/2addr v6, v9

    .line 177
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    goto :goto_a

    .line 182
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_c
    if-nez v3, :cond_d

    .line 186
    .line 187
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    goto :goto_9

    .line 196
    :cond_d
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    add-int/2addr p1, v4

    .line 201
    add-int/2addr p1, v5

    .line 202
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    goto :goto_9

    .line 207
    :cond_e
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    :goto_c
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-ge p2, p1, :cond_f

    .line 216
    .line 217
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 222
    .line 223
    .line 224
    :cond_f
    :goto_d
    return-void
.end method

.method public final setMaxRows(I)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const p1, 0x7fffffff

    .line 5
    .line 6
    .line 7
    :goto_0
    iput p1, p0, Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;->飘花落叶言子世楪苏兰哲:I

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
