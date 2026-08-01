.class public Lcom/google/android/material/datepicker/RangeDateSelector;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/android/material/datepicker/DateSelector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/material/datepicker/DateSelector<",
        "Landroidx/core/util/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/material/datepicker/RangeDateSelector;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Ljava/lang/Long;

.field public 飘花落叶言子楪兰世苏哲:Ljava/lang/Long;

.field public 飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

.field public 飘花落叶言子楪哲苏兰世:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰哲苏世;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/material/datepicker/RangeDateSelector;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Lcom/google/android/material/datepicker/RangeDateSelector;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪兰世苏哲:Ljava/lang/Long;

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v2, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪兰世哲苏:Ljava/lang/Long;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-object v0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪兰世哲苏:Ljava/lang/Long;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    cmp-long v0, v2, v4

    .line 23
    .line 24
    if-gtz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪兰世苏哲:Ljava/lang/Long;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪兰世哲苏:Ljava/lang/Long;

    .line 31
    .line 32
    iput-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 33
    .line 34
    new-instance p0, Landroidx/core/util/飘花落叶言子楪世苏兰哲;

    .line 35
    .line 36
    invoke-direct {p0, v0, v1}, Landroidx/core/util/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3, p0}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object p0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v2, 0x0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget-object p0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    invoke-virtual {p1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {v1, p0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    invoke-virtual {p2, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    invoke-virtual {p3}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰()V

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-nez p0, :cond_5

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_5
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-nez p0, :cond_6

    .line 122
    .line 123
    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 124
    .line 125
    .line 126
    :cond_6
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子世哲兰楪苏(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;)Landroid/view/View;
    .locals 12

    .line 1
    const v0, 0x240c00d7

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const p2, 0x2409022d

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    move-object v6, p2

    .line 17
    check-cast v6, Lcom/google/android/material/textfield/TextInputLayout;

    .line 18
    .line 19
    const p2, 0x2409022c

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    move-object v9, p2

    .line 27
    check-cast v9, Lcom/google/android/material/textfield/TextInputLayout;

    .line 28
    .line 29
    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {v9}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const v3, 0x24040131

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲楪兰苏(Landroid/content/Context;I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 62
    .line 63
    .line 64
    :cond_0
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 65
    .line 66
    const-string v3, ""

    .line 67
    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 71
    .line 72
    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    move-object v4, v3

    .line 78
    :goto_0
    const-string v5, "lge"

    .line 79
    .line 80
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-nez v4, :cond_3

    .line 85
    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    :cond_2
    const-string v2, "samsung"

    .line 95
    .line 96
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    :cond_3
    const/16 v2, 0x11

    .line 103
    .line 104
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setInputType(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setInputType(I)V

    .line 108
    .line 109
    .line 110
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const v3, 0x241200e1

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iput-object v2, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {}, Lcom/google/android/material/datepicker/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏()Ljava/text/SimpleDateFormat;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    iget-object v2, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 128
    .line 129
    if-eqz v2, :cond_5

    .line 130
    .line 131
    invoke-virtual {v5, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    .line 138
    iget-object v2, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 139
    .line 140
    iput-object v2, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪兰世苏哲:Ljava/lang/Long;

    .line 141
    .line 142
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    if-eqz v2, :cond_5

    .line 147
    .line 148
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-virtual {p2, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 153
    .line 154
    .line 155
    :cond_5
    iget-object v2, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 156
    .line 157
    if-eqz v2, :cond_6

    .line 158
    .line 159
    invoke-virtual {v5, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    iget-object v2, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 167
    .line 168
    iput-object v2, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪兰世哲苏:Ljava/lang/Long;

    .line 169
    .line 170
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-static {v2, v5}, Lcom/google/android/material/datepicker/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世兰苏哲(Landroid/content/res/Resources;Ljava/text/SimpleDateFormat;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    new-instance v2, Landroid/text/SpannableString;

    .line 179
    .line 180
    invoke-direct {v2, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    new-instance v3, Landroid/text/style/TtsSpan$Builder;

    .line 184
    .line 185
    const-string v7, "android.type.verbatim"

    .line 186
    .line 187
    invoke-direct {v3, v7}, Landroid/text/style/TtsSpan$Builder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {v2}, Landroid/text/SpannableString;->length()I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    const/16 v8, 0x21

    .line 199
    .line 200
    invoke-virtual {v2, v3, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v9, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 207
    .line 208
    .line 209
    new-instance v2, Lcom/google/android/material/datepicker/飘花落叶言子世苏楪哲兰;

    .line 210
    .line 211
    const/4 v11, 0x0

    .line 212
    move-object v8, v6

    .line 213
    move-object v3, p0

    .line 214
    move-object v7, p3

    .line 215
    move-object/from16 v10, p4

    .line 216
    .line 217
    invoke-direct/range {v2 .. v11}, Lcom/google/android/material/datepicker/飘花落叶言子世苏楪哲兰;-><init>(Lcom/google/android/material/datepicker/RangeDateSelector;Ljava/lang/String;Ljava/text/SimpleDateFormat;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 221
    .line 222
    .line 223
    new-instance v2, Lcom/google/android/material/datepicker/飘花落叶言子世苏楪哲兰;

    .line 224
    .line 225
    const/4 v11, 0x1

    .line 226
    move-object v6, v9

    .line 227
    invoke-direct/range {v2 .. v11}, Lcom/google/android/material/datepicker/飘花落叶言子世苏楪哲兰;-><init>(Lcom/google/android/material/datepicker/RangeDateSelector;Ljava/lang/String;Ljava/text/SimpleDateFormat;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    const-string v1, "accessibility"

    .line 238
    .line 239
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    check-cast p0, Landroid/view/accessibility/AccessibilityManager;

    .line 244
    .line 245
    if-eqz p0, :cond_7

    .line 246
    .line 247
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    if-eqz p0, :cond_7

    .line 252
    .line 253
    return-object p1

    .line 254
    :cond_7
    filled-new-array {p2, v0}, [Landroid/widget/EditText;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-static {p0}, Lcom/google/android/material/datepicker/DateSelector;->飘花落叶言子楪兰苏世哲([Landroid/widget/EditText;)V

    .line 259
    .line 260
    .line 261
    return-object p1
.end method

.method public final 飘花落叶言子世哲兰苏楪(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    cmp-long v0, v0, p1

    .line 21
    .line 22
    if-gtz v0, :cond_1

    .line 23
    .line 24
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 33
    .line 34
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 39
    .line 40
    return-void
.end method

.method public final 飘花落叶言子世楪兰哲苏()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object p0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    cmp-long p0, v0, v2

    .line 20
    .line 21
    if-gtz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final 飘花落叶言子世楪哲苏兰(Landroid/content/Context;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x240703ca

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 17
    .line 18
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 19
    .line 20
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-le v0, p0, :cond_0

    .line 25
    .line 26
    const p0, 0x240403d4

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const p0, 0x240403c9

    .line 31
    .line 32
    .line 33
    :goto_0
    const-class v0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p1, v0, p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子世哲苏楪兰(Landroid/content/Context;Ljava/lang/String;I)Landroid/util/TypedValue;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget p0, p0, Landroid/util/TypedValue;->data:I

    .line 44
    .line 45
    return p0
.end method

.method public final 飘花落叶言子世楪苏哲兰(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 8
    .line 9
    invoke-static {v0, p0}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世(Ljava/lang/Long;Ljava/lang/Long;)Landroidx/core/util/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object v0, p0, Landroidx/core/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 14
    .line 15
    const v1, 0x241200d6

    .line 16
    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 26
    .line 27
    :goto_0
    iget-object p0, p0, Landroidx/core/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 28
    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    check-cast p0, Ljava/lang/String;

    .line 37
    .line 38
    :goto_1
    const v1, 0x241200d4

    .line 39
    .line 40
    .line 41
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p1, v1, p0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public final 飘花落叶言子世苏哲兰楪()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Landroidx/core/util/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Landroidx/core/util/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final 飘花落叶言子世苏楪哲兰()Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_1
    return-object v0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const p0, 0x241200ed

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-static {v0, v1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const v0, 0x241200ea

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0, p0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    if-nez v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    invoke-static {v0, v1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const v0, 0x241200e9

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0, p0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_2
    invoke-static {v0, p0}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世(Ljava/lang/Long;Ljava/lang/Long;)Landroidx/core/util/飘花落叶言子楪世苏兰哲;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-object v0, p0, Landroidx/core/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object p0, p0, Landroidx/core/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 74
    .line 75
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const v0, 0x241200eb

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0, p0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/core/util/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰世苏:Ljava/lang/Long;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 11
    .line 12
    invoke-direct {v1, v2, p0}, Landroidx/core/util/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
