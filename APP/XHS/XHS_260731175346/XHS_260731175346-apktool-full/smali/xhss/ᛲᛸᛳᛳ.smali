.class public abstract Lxhss/ᛲᛸᛳᛳ;
.super Landroid/widget/AutoCompleteTextView;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᲇᛴᲇᛵ:[I


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛸᲀᛳᲁ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

.field public final ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲇᲇ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x1010176

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lxhss/ᛲᛸᛳᛳ;->ᲇᛴᲇᛵ:[I

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    sget-object v0, Lxhss/ᛷᛲᲁᲀ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v0, v0, Lxhss/ᲈᛱᛶᲇ;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    sget v0, Lxhss/ᲈᲀᲈᛶ;->ᛷᛵᛵᲈ:I

    .line 15
    .line 16
    :cond_0
    const v0, 0x6403002d

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p0, p1}, Lxhss/ᛳᲁᛳᛸ;->ᛷᛵᛵᲈ(Landroid/widget/TextView;Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v1, Lxhss/ᛲᛸᛳᛳ;->ᲇᛴᲇᛵ:[I

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    invoke-static {p1, v3}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛴᛶᛳ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    .line 72
    .line 73
    new-instance p1, Lxhss/ᛵᲇᲇᲇ;

    .line 74
    .line 75
    invoke-direct {p1, p0}, Lxhss/ᛵᲇᲇᲇ;-><init>(Landroid/widget/TextView;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lxhss/ᛲᛸᛳᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲇᲇ;

    .line 79
    .line 80
    invoke-virtual {p1, p2, v0}, Lxhss/ᛵᲇᲇᲇ;->ᛱᛱᛲᲇ(Landroid/util/AttributeSet;I)V

    .line 81
    .line 82
    .line 83
    new-instance p1, Lxhss/ᛸᲀᛳᲁ;

    .line 84
    .line 85
    invoke-direct {p1, p0}, Lxhss/ᛸᲀᛳᲁ;-><init>(Landroid/widget/TextView;)V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Lxhss/ᛲᛸᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲀᛳᲁ;

    .line 89
    .line 90
    invoke-virtual {p1, p2, v0}, Lxhss/ᛸᲀᛳᲁ;->ᲇᛴᲇᛵ(Landroid/util/AttributeSet;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lxhss/ᛸᲀᛳᲁ;->ᛱᛱᛲᲇ()V

    .line 94
    .line 95
    .line 96
    new-instance p1, Lxhss/ᲇᛵᛲᲁ;

    .line 97
    .line 98
    const/4 v1, 0x2

    .line 99
    invoke-direct {p1, p0, v1}, Lxhss/ᲇᛵᛲᲁ;-><init>(Lxhss/ᛲᛸᛳᛳ;I)V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, Lxhss/ᛲᛸᛳᛳ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    sget-object v3, Lxhss/ᛳᛷᲈ;->ᛱᛱᛲᲇ:[I

    .line 109
    .line 110
    invoke-virtual {v1, p2, v3, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    const/16 v0, 0xe

    .line 115
    .line 116
    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const/4 v2, 0x1

    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    goto :goto_1

    .line 128
    :catchall_0
    move-exception p0

    .line 129
    goto :goto_3

    .line 130
    :cond_3
    :goto_1
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v2}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛶᛴᲈ(Z)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    instance-of v0, p2, Landroid/text/method/NumberKeyListener;

    .line 141
    .line 142
    if-nez v0, :cond_5

    .line 143
    .line 144
    invoke-super {p0}, Landroid/view/View;->isFocusable()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-super {p0}, Landroid/view/View;->isClickable()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-super {p0}, Landroid/view/View;->isLongClickable()Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-super {p0}, Landroid/widget/TextView;->getInputType()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    invoke-virtual {p1, p2}, Lxhss/ᲇᛵᛲᲁ;->ᲈᛳᲀ(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-ne p1, p2, :cond_4

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_4
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 168
    .line 169
    .line 170
    invoke-super {p0, v3}, Landroid/widget/TextView;->setRawInputType(I)V

    .line 171
    .line 172
    .line 173
    invoke-super {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 174
    .line 175
    .line 176
    invoke-super {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 177
    .line 178
    .line 179
    invoke-super {p0, v2}, Landroid/view/View;->setLongClickable(Z)V

    .line 180
    .line 181
    .line 182
    :cond_5
    :goto_2
    return-void

    .line 183
    :goto_3
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 184
    .line 185
    .line 186
    throw p0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲇᲇ;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲀᛳᲁ;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lxhss/ᛸᲀᛳᲁ;->ᛱᛱᛲᲇ()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲇᲇ;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lxhss/ᛵᛳᛱᲇ;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lxhss/ᛵᛳᛱᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroid/content/res/ColorStateList;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲇᲇ;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lxhss/ᛵᛳᛱᲇ;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lxhss/ᛵᛳᛱᲇ;->ᲇᛴᲇᛵ:Ljava/io/Serializable;

    .line 13
    .line 14
    check-cast p0, Landroid/graphics/PorterDuff$Mode;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲀᛳᲁ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛸᲀᛳᲁ;->ᛸᛴᛶᛳ:Lxhss/ᛵᛳᛱᲇ;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lxhss/ᛵᛳᛱᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲀᛳᲁ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛸᲀᛳᲁ;->ᛸᛴᛶᛳ:Lxhss/ᛵᛳᛱᲇ;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lxhss/ᛵᛳᛱᲇ;->ᲇᛴᲇᛵ:Ljava/io/Serializable;

    .line 8
    .line 9
    check-cast p0, Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    instance-of v2, v1, Landroid/view/View;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 25
    .line 26
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lxhss/ᲇᛵᛲᲁ;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lxhss/ᛳᛱᛲᲀ;

    .line 37
    .line 38
    instance-of v1, v0, Lxhss/ᛸᛵᲈᲁ;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    new-instance v1, Lxhss/ᛸᛵᲈᲁ;

    .line 44
    .line 45
    iget-object p0, p0, Lxhss/ᛳᛱᛲᲀ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Lxhss/ᛲᛸᛳᛳ;

    .line 48
    .line 49
    invoke-direct {v1, p0, v0, p1}, Lxhss/ᛸᛵᲈᲁ;-><init>(Lxhss/ᛲᛸᛳᛳ;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲇᲇ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ:I

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Lxhss/ᛵᲇᲇᲇ;->ᲇᛴᲇᛵ(Landroid/content/res/ColorStateList;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲇᲇ;

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    iput p1, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ:I

    .line 9
    .line 10
    iget-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lxhss/ᛲᛳᲈᛲ;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lxhss/ᛵᲇᲇᲇ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    monitor-enter v0

    .line 25
    :try_start_0
    iget-object v2, v0, Lxhss/ᛲᛳᲈᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛱᲈᲁᛴ;

    .line 26
    .line 27
    invoke-virtual {v2, v1, p1}, Lxhss/ᛱᲈᲁᛴ;->ᲀᲇᛳᲁ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    monitor-exit v0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p0

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    :goto_0
    invoke-virtual {p0, p1}, Lxhss/ᛵᲇᲇᲇ;->ᲇᛴᲇᛵ(Landroid/content/res/ColorStateList;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲀᛳᲁ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛸᲀᛳᲁ;->ᛱᛱᛲᲇ()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲀᛳᲁ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛸᲀᛳᲁ;->ᛱᛱᛲᲇ()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setDropDownBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛴᛶᛳ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛶᛴᲈ(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setKeyListener(Landroid/text/method/KeyListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lxhss/ᲇᛵᛲᲁ;->ᲈᛳᲀ(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲇᲇ;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lxhss/ᛵᛳᛱᲇ;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lxhss/ᛵᛳᛱᲇ;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 17
    .line 18
    :cond_0
    iput-object p1, v0, Lxhss/ᛵᛳᛱᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, v0, Lxhss/ᛵᛳᛱᲇ;->ᛱᛱᛲᲇ:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲇᲇ;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lxhss/ᛵᛳᛱᲇ;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lxhss/ᛵᛳᛱᲇ;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 17
    .line 18
    :cond_0
    iput-object p1, v0, Lxhss/ᛵᛳᛱᲇ;->ᲇᛴᲇᛵ:Ljava/io/Serializable;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, v0, Lxhss/ᛵᛳᛱᲇ;->ᛷᛵᛵᲈ:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲀᛳᲁ;

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛸᲀᛳᲁ;->ᛸᛴᛶᛳ:Lxhss/ᛵᛳᛱᲇ;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lxhss/ᛵᛳᛱᲇ;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lxhss/ᛸᲀᛳᲁ;->ᛸᛴᛶᛳ:Lxhss/ᛵᛳᛱᲇ;

    .line 13
    .line 14
    :cond_0
    move-object v1, v0

    .line 15
    iput-object p1, v0, Lxhss/ᛵᛳᛱᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    :goto_0
    iput-boolean p1, v0, Lxhss/ᛵᛳᛱᲇ;->ᛱᛱᛲᲇ:Z

    .line 23
    .line 24
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛳᛱᲇ;

    .line 25
    .line 26
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛳᛱᲇ;

    .line 27
    .line 28
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛳᛱᲇ;

    .line 29
    .line 30
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛳᛱᲇ;

    .line 31
    .line 32
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛵᛳᛱᲇ;

    .line 33
    .line 34
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛱᲇ;

    .line 35
    .line 36
    invoke-virtual {p0}, Lxhss/ᛸᲀᛳᲁ;->ᛱᛱᛲᲇ()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲀᛳᲁ;

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛸᲀᛳᲁ;->ᛸᛴᛶᛳ:Lxhss/ᛵᛳᛱᲇ;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lxhss/ᛵᛳᛱᲇ;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lxhss/ᛸᲀᛳᲁ;->ᛸᛴᛶᛳ:Lxhss/ᛵᛳᛱᲇ;

    .line 13
    .line 14
    :cond_0
    move-object v1, v0

    .line 15
    iput-object p1, v0, Lxhss/ᛵᛳᛱᲇ;->ᲇᛴᲇᛵ:Ljava/io/Serializable;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    :goto_0
    iput-boolean p1, v0, Lxhss/ᛵᛳᛱᲇ;->ᛷᛵᛵᲈ:Z

    .line 23
    .line 24
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛳᛱᲇ;

    .line 25
    .line 26
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛳᛱᲇ;

    .line 27
    .line 28
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛳᛱᲇ;

    .line 29
    .line 30
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛳᛱᲇ;

    .line 31
    .line 32
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛵᛳᛱᲇ;

    .line 33
    .line 34
    iput-object v1, p0, Lxhss/ᛸᲀᛳᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛱᲇ;

    .line 35
    .line 36
    invoke-virtual {p0}, Lxhss/ᛸᲀᛳᲁ;->ᛱᛱᛲᲇ()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᛲᛸᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲀᛳᲁ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lxhss/ᛸᲀᛳᲁ;->ᛷᛴᛷᛱ(Landroid/content/Context;I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
