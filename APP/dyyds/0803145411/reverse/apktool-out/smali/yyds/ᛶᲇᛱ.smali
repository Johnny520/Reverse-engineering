.class public Lyyds/ᛶᲇᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "AppCompatViewInflater"

.field private static final sAccessibilityHeading:[I

.field private static final sAccessibilityPaneTitle:[I

.field private static final sClassPrefixList:[Ljava/lang/String;

.field private static final sConstructorMap:Lyyds/ᛴᲈᛲᛷ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyyds/\u16f4\u1c88\u16f2\u16f7;"
        }
    .end annotation
.end field

.field private static final sConstructorSignature:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final sOnClickAttrs:[I

.field private static final sScreenReaderFocusable:[I


# instance fields
.field private final mConstructorArgs:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    const-class v1, Landroid/util/AttributeSet;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lyyds/ᛶᲇᛱ;->sConstructorSignature:[Ljava/lang/Class;

    .line 10
    .line 11
    const v0, 0x101026f

    .line 12
    .line 13
    .line 14
    filled-new-array {v0}, [I

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lyyds/ᛶᲇᛱ;->sOnClickAttrs:[I

    .line 19
    .line 20
    const v0, 0x1010580

    .line 21
    .line 22
    .line 23
    filled-new-array {v0}, [I

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lyyds/ᛶᲇᛱ;->sAccessibilityHeading:[I

    .line 28
    .line 29
    const v0, 0x101057c

    .line 30
    .line 31
    .line 32
    filled-new-array {v0}, [I

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lyyds/ᛶᲇᛱ;->sAccessibilityPaneTitle:[I

    .line 37
    .line 38
    const v0, 0x1010574

    .line 39
    .line 40
    .line 41
    filled-new-array {v0}, [I

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lyyds/ᛶᲇᛱ;->sScreenReaderFocusable:[I

    .line 46
    .line 47
    const-string v0, "android.view."

    .line 48
    .line 49
    const-string v1, "android.webkit."

    .line 50
    .line 51
    const-string v2, "android.widget."

    .line 52
    .line 53
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lyyds/ᛶᲇᛱ;->sClassPrefixList:[Ljava/lang/String;

    .line 58
    .line 59
    new-instance v0, Lyyds/ᛴᲈᛲᛷ;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-direct {v0, v1}, Lyyds/ᛴᲈᛲᛷ;-><init>(I)V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lyyds/ᛶᲇᛱ;->sConstructorMap:Lyyds/ᛴᲈᛲᛷ;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    new-array v0, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    iput-object v0, p0, Lyyds/ᛶᲇᛱ;->mConstructorArgs:[Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public createAutoCompleteTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛸᛶᲀᛸ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛸᛶᲀᛸ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᛸᛶᲀᛸ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛲᲀᛱᛷ;
    .locals 1

    .line 1
    new-instance p0, Lyyds/ᛲᲀᛱᛷ;

    .line 2
    .line 3
    const v0, 0x66040076

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2, v0}, Lyyds/ᛲᲀᛱᛷ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public createCheckBox(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲈᛳᛶᛱ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᲈᛳᛶᛱ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᲈᛳᛶᛱ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createCheckedTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲀᛱᛶᛲ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᲀᛱᛶᛲ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᲀᛱᛶᛲ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createEditText(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛳᛳᛷᲈ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛳᛳᛷᲈ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᛳᛳᛷᲈ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createImageButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛳᛵᛶᛸ;
    .locals 1

    .line 1
    new-instance p0, Lyyds/ᛳᛵᛶᛸ;

    .line 2
    .line 3
    const v0, 0x66040181

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2, v0}, Lyyds/ᛳᛵᛶᛸ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public createImageView(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲁᛶᲁᛱ;
    .locals 1

    .line 1
    new-instance p0, Lyyds/ᲁᛶᲁᛱ;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p2, v0}, Lyyds/ᲁᛶᲁᛱ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public createMultiAutoCompleteTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛶᛷᛳᛵ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛶᛷᛳᛵ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᛶᛷᛳᛵ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createRadioButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛲᛷᲇᲁ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛲᛷᲇᲁ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᛲᛷᲇᲁ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createRatingBar(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛷᲈᛴᲇ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛷᲈᛴᲇ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᛷᲈᛴᲇ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createSeekBar(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲀᛷᛱᲈ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᲀᛷᛱᲈ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᲀᛷᛱᲈ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createSpinner(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲀᛱᛵᛶ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᲀᛱᛵᛶ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᲀᛱᛵᛶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛳᛴᲈᛷ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛳᛴᲈᛷ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᛳᛴᲈᛷ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createToggleButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛷᛲᛱᲀ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛷᛲᛱᲀ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᛷᛲᛱᲀ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createView(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 513
    const/4 p0, 0x0

    return-object p0
.end method

.method public final createView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;
    .locals 3

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object p1, p3

    .line 11
    :goto_0
    const/4 p5, 0x4

    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p6, :cond_1

    .line 14
    .line 15
    if-eqz p7, :cond_5

    .line 16
    .line 17
    :cond_1
    sget-object v1, Lyyds/ᛷᛷᛴᛳ;->ᲈᲀᛲᲀ:[I

    .line 18
    .line 19
    invoke-virtual {p1, p4, v1, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz p6, :cond_2

    .line 24
    .line 25
    invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 26
    .line 27
    .line 28
    move-result p6

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move p6, v0

    .line 31
    :goto_1
    if-eqz p7, :cond_3

    .line 32
    .line 33
    if-nez p6, :cond_3

    .line 34
    .line 35
    invoke-virtual {v1, p5, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 36
    .line 37
    .line 38
    move-result p6

    .line 39
    if-eqz p6, :cond_3

    .line 40
    .line 41
    const-string p7, "AppCompatViewInflater"

    .line 42
    .line 43
    const-string v2, "app:theme is now deprecated. Please move to using android:theme instead."

    .line 44
    .line 45
    invoke-static {p7, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 49
    .line 50
    .line 51
    if-eqz p6, :cond_5

    .line 52
    .line 53
    instance-of p7, p1, Lyyds/ᛳᛵᛳᛳ;

    .line 54
    .line 55
    if-eqz p7, :cond_4

    .line 56
    .line 57
    move-object p7, p1

    .line 58
    check-cast p7, Lyyds/ᛳᛵᛳᛳ;

    .line 59
    .line 60
    iget p7, p7, Lyyds/ᛳᛵᛳᛳ;->ᛲᲈᲁ:I

    .line 61
    .line 62
    if-eq p7, p6, :cond_5

    .line 63
    .line 64
    :cond_4
    new-instance p7, Lyyds/ᛳᛵᛳᛳ;

    .line 65
    .line 66
    invoke-direct {p7, p1, p6}, Lyyds/ᛳᛵᛳᛳ;-><init>(Landroid/content/Context;I)V

    .line 67
    .line 68
    .line 69
    move-object p1, p7

    .line 70
    :cond_5
    if-eqz p8, :cond_6

    .line 71
    .line 72
    invoke-static {p1}, Lyyds/ᲈᲇᛸᛶ;->ᛲᲈᲁ(Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result p6

    .line 82
    const/4 p7, 0x1

    .line 83
    const/4 p8, -0x1

    .line 84
    sparse-switch p6, :sswitch_data_0

    .line 85
    .line 86
    .line 87
    :goto_2
    move p5, p8

    .line 88
    goto/16 :goto_3

    .line 89
    .line 90
    :sswitch_0
    const-string p5, "Button"

    .line 91
    .line 92
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p5

    .line 96
    if-nez p5, :cond_7

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    const/16 p5, 0xd

    .line 100
    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :sswitch_1
    const-string p5, "EditText"

    .line 104
    .line 105
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p5

    .line 109
    if-nez p5, :cond_8

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_8
    const/16 p5, 0xc

    .line 113
    .line 114
    goto/16 :goto_3

    .line 115
    .line 116
    :sswitch_2
    const-string p5, "CheckBox"

    .line 117
    .line 118
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p5

    .line 122
    if-nez p5, :cond_9

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_9
    const/16 p5, 0xb

    .line 126
    .line 127
    goto/16 :goto_3

    .line 128
    .line 129
    :sswitch_3
    const-string p5, "AutoCompleteTextView"

    .line 130
    .line 131
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p5

    .line 135
    if-nez p5, :cond_a

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_a
    const/16 p5, 0xa

    .line 139
    .line 140
    goto/16 :goto_3

    .line 141
    .line 142
    :sswitch_4
    const-string p5, "ImageView"

    .line 143
    .line 144
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p5

    .line 148
    if-nez p5, :cond_b

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_b
    const/16 p5, 0x9

    .line 152
    .line 153
    goto/16 :goto_3

    .line 154
    .line 155
    :sswitch_5
    const-string p5, "ToggleButton"

    .line 156
    .line 157
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p5

    .line 161
    if-nez p5, :cond_c

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_c
    const/16 p5, 0x8

    .line 165
    .line 166
    goto/16 :goto_3

    .line 167
    .line 168
    :sswitch_6
    const-string p5, "RadioButton"

    .line 169
    .line 170
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p5

    .line 174
    if-nez p5, :cond_d

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_d
    const/4 p5, 0x7

    .line 178
    goto :goto_3

    .line 179
    :sswitch_7
    const-string p5, "Spinner"

    .line 180
    .line 181
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p5

    .line 185
    if-nez p5, :cond_e

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_e
    const/4 p5, 0x6

    .line 189
    goto :goto_3

    .line 190
    :sswitch_8
    const-string p5, "SeekBar"

    .line 191
    .line 192
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result p5

    .line 196
    if-nez p5, :cond_f

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_f
    const/4 p5, 0x5

    .line 200
    goto :goto_3

    .line 201
    :sswitch_9
    const-string p6, "ImageButton"

    .line 202
    .line 203
    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p6

    .line 207
    if-nez p6, :cond_14

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :sswitch_a
    const-string p5, "TextView"

    .line 211
    .line 212
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result p5

    .line 216
    if-nez p5, :cond_10

    .line 217
    .line 218
    goto/16 :goto_2

    .line 219
    .line 220
    :cond_10
    const/4 p5, 0x3

    .line 221
    goto :goto_3

    .line 222
    :sswitch_b
    const-string p5, "MultiAutoCompleteTextView"

    .line 223
    .line 224
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p5

    .line 228
    if-nez p5, :cond_11

    .line 229
    .line 230
    goto/16 :goto_2

    .line 231
    .line 232
    :cond_11
    const/4 p5, 0x2

    .line 233
    goto :goto_3

    .line 234
    :sswitch_c
    const-string p5, "CheckedTextView"

    .line 235
    .line 236
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result p5

    .line 240
    if-nez p5, :cond_12

    .line 241
    .line 242
    goto/16 :goto_2

    .line 243
    .line 244
    :cond_12
    move p5, p7

    .line 245
    goto :goto_3

    .line 246
    :sswitch_d
    const-string p5, "RatingBar"

    .line 247
    .line 248
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result p5

    .line 252
    if-nez p5, :cond_13

    .line 253
    .line 254
    goto/16 :goto_2

    .line 255
    .line 256
    :cond_13
    move p5, v0

    .line 257
    :cond_14
    :goto_3
    packed-switch p5, :pswitch_data_0

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, p1, p2, p4}, Lyyds/ᛶᲇᛱ;->createView(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object p5

    .line 264
    goto/16 :goto_4

    .line 265
    .line 266
    :pswitch_0
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛲᲀᛱᛷ;

    .line 267
    .line 268
    .line 269
    move-result-object p5

    .line 270
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_4

    .line 274
    .line 275
    :pswitch_1
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createEditText(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛳᛳᛷᲈ;

    .line 276
    .line 277
    .line 278
    move-result-object p5

    .line 279
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :pswitch_2
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createCheckBox(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲈᛳᛶᛱ;

    .line 284
    .line 285
    .line 286
    move-result-object p5

    .line 287
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto :goto_4

    .line 291
    :pswitch_3
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createAutoCompleteTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛸᛶᲀᛸ;

    .line 292
    .line 293
    .line 294
    move-result-object p5

    .line 295
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    goto :goto_4

    .line 299
    :pswitch_4
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createImageView(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲁᛶᲁᛱ;

    .line 300
    .line 301
    .line 302
    move-result-object p5

    .line 303
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    goto :goto_4

    .line 307
    :pswitch_5
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createToggleButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛷᛲᛱᲀ;

    .line 308
    .line 309
    .line 310
    move-result-object p5

    .line 311
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :pswitch_6
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createRadioButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛲᛷᲇᲁ;

    .line 316
    .line 317
    .line 318
    move-result-object p5

    .line 319
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    goto :goto_4

    .line 323
    :pswitch_7
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createSpinner(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲀᛱᛵᛶ;

    .line 324
    .line 325
    .line 326
    move-result-object p5

    .line 327
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    goto :goto_4

    .line 331
    :pswitch_8
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createSeekBar(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲀᛷᛱᲈ;

    .line 332
    .line 333
    .line 334
    move-result-object p5

    .line 335
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    goto :goto_4

    .line 339
    :pswitch_9
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createImageButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛳᛵᛶᛸ;

    .line 340
    .line 341
    .line 342
    move-result-object p5

    .line 343
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    goto :goto_4

    .line 347
    :pswitch_a
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛳᛴᲈᛷ;

    .line 348
    .line 349
    .line 350
    move-result-object p5

    .line 351
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    goto :goto_4

    .line 355
    :pswitch_b
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createMultiAutoCompleteTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛶᛷᛳᛵ;

    .line 356
    .line 357
    .line 358
    move-result-object p5

    .line 359
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    goto :goto_4

    .line 363
    :pswitch_c
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createCheckedTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᲀᛱᛶᛲ;

    .line 364
    .line 365
    .line 366
    move-result-object p5

    .line 367
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    goto :goto_4

    .line 371
    :pswitch_d
    invoke-virtual {p0, p1, p4}, Lyyds/ᛶᲇᛱ;->createRatingBar(Landroid/content/Context;Landroid/util/AttributeSet;)Lyyds/ᛷᲈᛴᲇ;

    .line 372
    .line 373
    .line 374
    move-result-object p5

    .line 375
    invoke-virtual {p0, p5, p2}, Lyyds/ᛶᲇᛱ;->ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    :goto_4
    if-nez p5, :cond_19

    .line 379
    .line 380
    if-eq p3, p1, :cond_19

    .line 381
    .line 382
    const-string p3, "view"

    .line 383
    .line 384
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result p3

    .line 388
    const/4 p5, 0x0

    .line 389
    if-eqz p3, :cond_15

    .line 390
    .line 391
    const-string p2, "class"

    .line 392
    .line 393
    invoke-interface {p4, p5, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p2

    .line 397
    :cond_15
    :try_start_0
    iget-object p3, p0, Lyyds/ᛶᲇᛱ;->mConstructorArgs:[Ljava/lang/Object;

    .line 398
    .line 399
    aput-object p1, p3, v0

    .line 400
    .line 401
    aput-object p4, p3, p7

    .line 402
    .line 403
    const/16 p3, 0x2e

    .line 404
    .line 405
    invoke-virtual {p2, p3}, Ljava/lang/String;->indexOf(I)I

    .line 406
    .line 407
    .line 408
    move-result p3

    .line 409
    if-ne p8, p3, :cond_18

    .line 410
    .line 411
    move p3, v0

    .line 412
    :goto_5
    sget-object p6, Lyyds/ᛶᲇᛱ;->sClassPrefixList:[Ljava/lang/String;

    .line 413
    .line 414
    array-length p8, p6

    .line 415
    if-ge p3, p8, :cond_17

    .line 416
    .line 417
    aget-object p6, p6, p3

    .line 418
    .line 419
    invoke-virtual {p0, p1, p2, p6}, Lyyds/ᛶᲇᛱ;->ᛲᲈᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 420
    .line 421
    .line 422
    move-result-object p6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 423
    if-eqz p6, :cond_16

    .line 424
    .line 425
    iget-object p0, p0, Lyyds/ᛶᲇᛱ;->mConstructorArgs:[Ljava/lang/Object;

    .line 426
    .line 427
    aput-object p5, p0, v0

    .line 428
    .line 429
    aput-object p5, p0, p7

    .line 430
    .line 431
    move-object p5, p6

    .line 432
    goto :goto_7

    .line 433
    :cond_16
    add-int/lit8 p3, p3, 0x1

    .line 434
    .line 435
    goto :goto_5

    .line 436
    :catchall_0
    move-exception p1

    .line 437
    goto :goto_6

    .line 438
    :cond_17
    iget-object p0, p0, Lyyds/ᛶᲇᛱ;->mConstructorArgs:[Ljava/lang/Object;

    .line 439
    .line 440
    aput-object p5, p0, v0

    .line 441
    .line 442
    aput-object p5, p0, p7

    .line 443
    .line 444
    goto :goto_7

    .line 445
    :cond_18
    :try_start_1
    invoke-virtual {p0, p1, p2, p5}, Lyyds/ᛶᲇᛱ;->ᛲᲈᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 446
    .line 447
    .line 448
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 449
    iget-object p0, p0, Lyyds/ᛶᲇᛱ;->mConstructorArgs:[Ljava/lang/Object;

    .line 450
    .line 451
    aput-object p5, p0, v0

    .line 452
    .line 453
    aput-object p5, p0, p7

    .line 454
    .line 455
    move-object p5, p1

    .line 456
    goto :goto_7

    .line 457
    :goto_6
    iget-object p0, p0, Lyyds/ᛶᲇᛱ;->mConstructorArgs:[Ljava/lang/Object;

    .line 458
    .line 459
    aput-object p5, p0, v0

    .line 460
    .line 461
    aput-object p5, p0, p7

    .line 462
    .line 463
    throw p1

    .line 464
    :catch_0
    iget-object p0, p0, Lyyds/ᛶᲇᛱ;->mConstructorArgs:[Ljava/lang/Object;

    .line 465
    .line 466
    aput-object p5, p0, v0

    .line 467
    .line 468
    aput-object p5, p0, p7

    .line 469
    .line 470
    :cond_19
    :goto_7
    if-eqz p5, :cond_1c

    .line 471
    .line 472
    invoke-virtual {p5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 473
    .line 474
    .line 475
    move-result-object p0

    .line 476
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 477
    .line 478
    if-eqz p1, :cond_1c

    .line 479
    .line 480
    sget-object p1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 481
    .line 482
    invoke-virtual {p5}, Landroid/view/View;->hasOnClickListeners()Z

    .line 483
    .line 484
    .line 485
    move-result p1

    .line 486
    if-nez p1, :cond_1a

    .line 487
    .line 488
    goto :goto_8

    .line 489
    :cond_1a
    sget-object p1, Lyyds/ᛶᲇᛱ;->sOnClickAttrs:[I

    .line 490
    .line 491
    invoke-virtual {p0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    invoke-virtual {p0, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    if-eqz p1, :cond_1b

    .line 500
    .line 501
    new-instance p2, Lyyds/ᛶᛵᛶᲁ;

    .line 502
    .line 503
    invoke-direct {p2, p5, p1}, Lyyds/ᛶᛵᛶᲁ;-><init>(Landroid/view/View;Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {p5, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 507
    .line 508
    .line 509
    :cond_1b
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 510
    .line 511
    .line 512
    :cond_1c
    :goto_8
    return-object p5

    .line 513
    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
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

.method public final ᛲᲈᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛶᲇᛱ;->sConstructorMap:Lyyds/ᛴᲈᛲᛷ;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lyyds/ᛴᲈᛲᛷ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p3, p2

    .line 19
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {p3, v1, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-class p3, Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {p1, p3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p3, Lyyds/ᛶᲇᛱ;->sConstructorSignature:[Ljava/lang/Class;

    .line 35
    .line 36
    invoke-virtual {p1, p3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, p2, v1}, Lyyds/ᛴᲈᛲᛷ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_1
    const/4 p1, 0x1

    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lyyds/ᛶᲇᛱ;->mConstructorArgs:[Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    return-object p0

    .line 56
    :catch_0
    const/4 p0, 0x0

    .line 57
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string p0, " asked to inflate view for <"

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, ">, but returned null"

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
.end method
