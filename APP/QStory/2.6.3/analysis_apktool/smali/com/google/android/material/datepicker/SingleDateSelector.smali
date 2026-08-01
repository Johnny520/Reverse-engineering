.class public Lcom/google/android/material/datepicker/SingleDateSelector;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/android/material/datepicker/DateSelector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/material/datepicker/DateSelector<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/material/datepicker/SingleDateSelector;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 飘花落叶言子楪哲苏兰世:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰哲苏世;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/material/datepicker/SingleDateSelector;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
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
    iget-object p0, p0, Lcom/google/android/material/datepicker/SingleDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子世哲兰楪苏(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/google/android/material/datepicker/SingleDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言子世哲楪兰苏(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;)Landroid/view/View;
    .locals 10

    .line 1
    const v0, 0x240c00d6

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
    const p2, 0x2409022b

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
    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const v2, 0x24040131

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲兰世苏(Landroid/content/Context;I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 44
    .line 45
    const-string v2, ""

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object v3, v2

    .line 57
    :goto_0
    const-string v4, "lge"

    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :cond_2
    const-string v0, "samsung"

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    :cond_3
    const/16 v0, 0x11

    .line 82
    .line 83
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setInputType(I)V

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-static {}, Lcom/google/android/material/datepicker/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏()Ljava/text/SimpleDateFormat;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0, v5}, Lcom/google/android/material/datepicker/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世兰苏哲(Landroid/content/res/Resources;Ljava/text/SimpleDateFormat;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    new-instance v0, Landroid/text/SpannableString;

    .line 99
    .line 100
    invoke-direct {v0, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    new-instance v2, Landroid/text/style/TtsSpan$Builder;

    .line 104
    .line 105
    const-string v3, "android.type.verbatim"

    .line 106
    .line 107
    invoke-direct {v2, v3}, Landroid/text/style/TtsSpan$Builder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    const/16 v7, 0x21

    .line 119
    .line 120
    invoke-virtual {v0, v2, v1, v3, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lcom/google/android/material/datepicker/SingleDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 127
    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    invoke-virtual {v5, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 148
    .line 149
    .line 150
    :cond_5
    new-instance v2, Lcom/google/android/material/datepicker/飘花落叶言子世苏楪兰哲;

    .line 151
    .line 152
    move-object v9, v6

    .line 153
    move-object v3, p0

    .line 154
    move-object v7, p3

    .line 155
    move-object v8, p4

    .line 156
    invoke-direct/range {v2 .. v9}, Lcom/google/android/material/datepicker/飘花落叶言子世苏楪兰哲;-><init>(Lcom/google/android/material/datepicker/SingleDateSelector;Ljava/lang/String;Ljava/text/SimpleDateFormat;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    const-string p3, "accessibility"

    .line 167
    .line 168
    invoke-virtual {p0, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    check-cast p0, Landroid/view/accessibility/AccessibilityManager;

    .line 173
    .line 174
    if-eqz p0, :cond_6

    .line 175
    .line 176
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    if-eqz p0, :cond_6

    .line 181
    .line 182
    return-object p1

    .line 183
    :cond_6
    filled-new-array {p2}, [Landroid/widget/EditText;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, Lcom/google/android/material/datepicker/DateSelector;->飘花落叶言子楪兰世哲苏([Landroid/widget/EditText;)V

    .line 188
    .line 189
    .line 190
    return-object p1
.end method

.method public final 飘花落叶言子世楪兰哲苏()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/SingleDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final 飘花落叶言子世楪哲苏兰(Landroid/content/Context;)I
    .locals 1

    .line 1
    const-class p0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const v0, 0x240403d4

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p0, v0}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏楪兰世哲(Landroid/content/Context;Ljava/lang/String;I)Landroid/util/TypedValue;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget p0, p0, Landroid/util/TypedValue;->data:I

    .line 15
    .line 16
    return p0
.end method

.method public final 飘花落叶言子世苏哲兰楪()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/SingleDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世苏楪兰哲()Ljava/util/ArrayList;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/android/material/datepicker/SingleDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子楪兰哲苏世(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/google/android/material/datepicker/SingleDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const p0, 0x241200d6

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {v0, v1, p0}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(JLjava/util/Locale;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_0
    const v0, 0x241200d5

    .line 30
    .line 31
    .line 32
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, v0, p0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/google/android/material/datepicker/SingleDateSelector;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const p0, 0x241200db

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {v0, v1, p0}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(JLjava/util/Locale;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const v0, 0x241200d9

    .line 30
    .line 31
    .line 32
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, v0, p0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲世兰()Ljava/util/ArrayList;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
