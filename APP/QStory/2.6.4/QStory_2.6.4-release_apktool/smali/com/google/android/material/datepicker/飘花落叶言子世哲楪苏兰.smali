.class public final Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;
.super Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/MaterialCalendar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/MaterialCalendar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪兰苏世哲:I

    .line 6
    .line 7
    return p0
.end method

.method public final 飘花落叶言子楪哲世苏兰(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const p1, 0x240c00ca

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Landroid/widget/TextView;

    .line 18
    .line 19
    new-instance p1, Lcom/google/android/material/datepicker/飘花落叶言子世苏兰哲楪;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lcom/google/android/material/datepicker/飘花落叶言子世苏兰哲楪;-><init>(Landroid/widget/TextView;)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V
    .locals 8

    .line 1
    check-cast p1, Lcom/google/android/material/datepicker/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/Month;

    .line 8
    .line 9
    iget v1, v1, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲兰苏世:I

    .line 10
    .line 11
    add-int/2addr v1, p2

    .line 12
    iget-object p1, p1, Lcom/google/android/material/datepicker/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "%d"

    .line 27
    .line 28
    invoke-static {p2, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {}, Lcom/google/android/material/datepicker/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世兰哲苏()Ljava/util/Calendar;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-ne v2, v1, :cond_0

    .line 49
    .line 50
    const v2, 0x241200e2

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {p2, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const v2, 0x241200e3

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {p2, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    iget-object p2, v0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰世楪哲:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 93
    .line 94
    invoke-static {}, Lcom/google/android/material/datepicker/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世兰哲苏()Ljava/util/Calendar;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-ne v4, v1, :cond_1

    .line 103
    .line 104
    iget-object v4, p2, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 105
    .line 106
    :goto_1
    check-cast v4, Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_1
    iget-object v4, p2, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :goto_2
    iget-object v0, v0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲世兰楪:Lcom/google/android/material/datepicker/DateSelector;

    .line 113
    .line 114
    invoke-interface {v0}, Lcom/google/android/material/datepicker/DateSelector;->飘花落叶言子世苏楪哲兰()Ljava/util/ArrayList;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :cond_2
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_3

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    check-cast v5, Ljava/lang/Long;

    .line 133
    .line 134
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v5

    .line 138
    invoke-virtual {v2, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-ne v5, v1, :cond_2

    .line 146
    .line 147
    iget-object v4, p2, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v4, Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_3
    invoke-virtual {v4, p1}, Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Landroid/widget/TextView;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    instance-of v0, v0, Lcom/google/android/material/focus/FocusRingDrawable;

    .line 160
    .line 161
    const/4 v2, 0x0

    .line 162
    if-eqz v0, :cond_4

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {p1}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    sget-object v6, Lcom/google/android/material/focus/FocusRingDrawable;->飘花落叶言子世苏楪哲兰:Landroid/graphics/drawable/ColorDrawable;

    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    const v7, 0x2404025d

    .line 180
    .line 181
    .line 182
    invoke-static {v6, v7, v2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子世哲楪兰苏(Landroid/content/res/Resources$Theme;IZ)Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-nez v6, :cond_5

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_5
    new-instance v6, Lcom/google/android/material/focus/FocusRingDrawable;

    .line 190
    .line 191
    invoke-direct {v6, v0, v5}, Lcom/google/android/material/focus/FocusRingDrawable;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V

    .line 192
    .line 193
    .line 194
    move-object v5, v6

    .line 195
    :goto_4
    instance-of v0, v5, Lcom/google/android/material/focus/FocusRingDrawable;

    .line 196
    .line 197
    if-eqz v0, :cond_6

    .line 198
    .line 199
    check-cast v5, Lcom/google/android/material/focus/FocusRingDrawable;

    .line 200
    .line 201
    iget-object v0, v4, Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪哲苏兰世;

    .line 204
    .line 205
    iget-object v6, v5, Lcom/google/android/material/focus/FocusRingDrawable;->飘花落叶言子世楪兰哲苏:L飘花落叶言楪苏兰子世哲/飘花落叶言子楪世苏兰哲;

    .line 206
    .line 207
    iput-object v0, v6, L飘花落叶言楪苏兰子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:L飘花落叶言楪哲子世苏兰/飘花落叶言子楪哲世兰苏;

    .line 208
    .line 209
    iget-object v0, v4, Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Landroid/graphics/Rect;

    .line 212
    .line 213
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 214
    .line 215
    int-to-float v0, v0

    .line 216
    iput v0, v6, L飘花落叶言楪苏兰子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:F

    .line 217
    .line 218
    invoke-virtual {p1, v5}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 219
    .line 220
    .line 221
    :cond_6
    :goto_5
    iget-object p2, p2, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p2, Landroidx/appcompat/widget/飘花落叶言子楪兰世哲苏;

    .line 224
    .line 225
    if-ne v4, p2, :cond_7

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_7
    move v3, v2

    .line 229
    :goto_6
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setSelected(Z)V

    .line 230
    .line 231
    .line 232
    new-instance p2, Lcom/google/android/material/datepicker/飘花落叶言子世苏兰楪哲;

    .line 233
    .line 234
    invoke-direct {p2, p0, v1}, Lcom/google/android/material/datepicker/飘花落叶言子世苏兰楪哲;-><init>(Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 238
    .line 239
    .line 240
    return-void
.end method
