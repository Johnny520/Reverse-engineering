.class public final Leu;
.super Ltg;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Ltg;"
    }
.end annotation


# instance fields
.field public A0:Ljava/lang/CharSequence;

.field public B0:Ljava/lang/CharSequence;

.field public final e0:Ljava/util/LinkedHashSet;

.field public final f0:Ljava/util/LinkedHashSet;

.field public g0:I

.field public h0:Lxx;

.field public i0:Lm8;

.field public j0:Lyt;

.field public k0:I

.field public l0:Ljava/lang/CharSequence;

.field public m0:Z

.field public n0:I

.field public o0:I

.field public p0:Ljava/lang/CharSequence;

.field public q0:I

.field public r0:Ljava/lang/CharSequence;

.field public s0:I

.field public t0:Ljava/lang/CharSequence;

.field public u0:I

.field public v0:Ljava/lang/CharSequence;

.field public w0:Landroid/widget/TextView;

.field public x0:Lcom/google/android/material/internal/CheckableImageButton;

.field public y0:Liu;

.field public z0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ltg;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Leu;->e0:Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Leu;->f0:Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    return-void
.end method

.method public static F(Landroid/content/Context;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f07026f

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {}, Lz80;->b()Ljava/util/Calendar;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x5

    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lz80;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x7

    .line 33
    invoke-virtual {v1, v5}, Ljava/util/Calendar;->getMaximum(I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 41
    .line 42
    .line 43
    const v1, 0x7f070275

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const v2, 0x7f070283

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    mul-int/2addr v0, v4

    .line 58
    mul-int/2addr v1, v5

    .line 59
    add-int/2addr v1, v0

    .line 60
    sub-int/2addr v5, v3

    .line 61
    mul-int/2addr v5, p0

    .line 62
    add-int/2addr v5, v1

    .line 63
    return v5
.end method

.method public static G(Landroid/content/Context;I)Z
    .locals 2

    .line 1
    const-class v0, Lyt;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x7f0402be

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1, v0}, Lmp;->L(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 15
    .line 16
    filled-new-array {p1}, [I

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    .line 31
    .line 32
    return p1
.end method


# virtual methods
.method public final D()Landroid/app/Dialog;
    .locals 6

    .line 1
    new-instance v0, Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Lol;->z()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lol;->z()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    iget v2, p0, Leu;->g0:I

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const v2, 0x101020d

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Leu;->G(Landroid/content/Context;I)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput-boolean v2, p0, Leu;->m0:Z

    .line 30
    .line 31
    new-instance v2, Liu;

    .line 32
    .line 33
    const v4, 0x7f0402be

    .line 34
    .line 35
    .line 36
    const v5, 0x7f110413

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, v1, v3, v4, v5}, Liu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, Leu;->y0:Liu;

    .line 43
    .line 44
    sget-object v2, Ldz;->l:[I

    .line 45
    .line 46
    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v3, 0x1

    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Leu;->y0:Liu;

    .line 60
    .line 61
    invoke-virtual {v2, v1}, Liu;->h(Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Leu;->y0:Liu;

    .line 65
    .line 66
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v2}, Liu;->j(Landroid/content/res/ColorStateList;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Leu;->y0:Liu;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    sget-object v3, Loa0;->a:Ljava/util/WeakHashMap;

    .line 84
    .line 85
    invoke-static {v2}, Lda0;->i(Landroid/view/View;)F

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v1, v2}, Liu;->i(F)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_0
    invoke-virtual {p0}, Leu;->E()V

    .line 94
    .line 95
    .line 96
    throw v3
.end method

.method public final E()V
    .locals 2

    .line 1
    iget-object v0, p0, Lol;->f:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "DATE_SELECTOR_KEY"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public final m(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ltg;->m(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lol;->f:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Leu;->g0:I

    .line 15
    .line 16
    const-string v0, "DATE_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_5

    .line 23
    .line 24
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lm8;

    .line 31
    .line 32
    iput-object v0, p0, Leu;->i0:Lm8;

    .line 33
    .line 34
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput v0, p0, Leu;->k0:I

    .line 49
    .line 50
    const-string v0, "TITLE_TEXT_KEY"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Leu;->l0:Ljava/lang/CharSequence;

    .line 57
    .line 58
    const-string v0, "INPUT_MODE_KEY"

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput v0, p0, Leu;->n0:I

    .line 65
    .line 66
    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput v0, p0, Leu;->o0:I

    .line 73
    .line 74
    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Leu;->p0:Ljava/lang/CharSequence;

    .line 81
    .line 82
    const-string v0, "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iput v0, p0, Leu;->q0:I

    .line 89
    .line 90
    const-string v0, "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Leu;->r0:Ljava/lang/CharSequence;

    .line 97
    .line 98
    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iput v0, p0, Leu;->s0:I

    .line 105
    .line 106
    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Leu;->t0:Ljava/lang/CharSequence;

    .line 113
    .line 114
    const-string v0, "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iput v0, p0, Leu;->u0:I

    .line 121
    .line 122
    const-string v0, "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iput-object p1, p0, Leu;->v0:Ljava/lang/CharSequence;

    .line 129
    .line 130
    iget-object p1, p0, Leu;->l0:Ljava/lang/CharSequence;

    .line 131
    .line 132
    if-eqz p1, :cond_1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    invoke-virtual {p0}, Lol;->z()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iget v0, p0, Leu;->k0:I

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    :goto_0
    iput-object p1, p0, Leu;->A0:Ljava/lang/CharSequence;

    .line 150
    .line 151
    if-eqz p1, :cond_2

    .line 152
    .line 153
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const-string v1, "\n"

    .line 158
    .line 159
    invoke-static {v0, v1}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    array-length v1, v0

    .line 164
    const/4 v2, 0x1

    .line 165
    if-le v1, v2, :cond_3

    .line 166
    .line 167
    const/4 p1, 0x0

    .line 168
    aget-object p1, v0, p1

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_2
    const/4 p1, 0x0

    .line 172
    :cond_3
    :goto_1
    iput-object p1, p0, Leu;->B0:Ljava/lang/CharSequence;

    .line 173
    .line 174
    return-void

    .line 175
    :cond_4
    new-instance p1, Ljava/lang/ClassCastException;

    .line 176
    .line 177
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :cond_5
    new-instance p1, Ljava/lang/ClassCastException;

    .line 182
    .line 183
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 184
    .line 185
    .line 186
    throw p1
.end method

.method public final n(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 1
    iget-boolean v0, p0, Leu;->m0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const v0, 0x7f0c0056

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const v0, 0x7f0c0055

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-virtual {p1, v0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-boolean v0, p0, Leu;->m0:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const v0, 0x7f0900f8

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 32
    .line 33
    invoke-static {p2}, Leu;->F(Landroid/content/Context;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, -0x2

    .line 38
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const v0, 0x7f0900f9

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 53
    .line 54
    invoke-static {p2}, Leu;->F(Landroid/content/Context;)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v3, -0x1

    .line 59
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    const v0, 0x7f090104

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Landroid/widget/TextView;

    .line 73
    .line 74
    sget-object v1, Loa0;->a:Ljava/util/WeakHashMap;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    invoke-static {v0, v1}, Laa0;->f(Landroid/view/View;I)V

    .line 78
    .line 79
    .line 80
    const v0, 0x7f090106

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lcom/google/android/material/internal/CheckableImageButton;

    .line 88
    .line 89
    iput-object v0, p0, Leu;->x0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 90
    .line 91
    const v0, 0x7f09010a

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Landroid/widget/TextView;

    .line 99
    .line 100
    iput-object v0, p0, Leu;->w0:Landroid/widget/TextView;

    .line 101
    .line 102
    iget-object v0, p0, Leu;->x0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 103
    .line 104
    const-string v2, "TOGGLE_BUTTON_TAG"

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Leu;->x0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 110
    .line 111
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    .line 112
    .line 113
    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 114
    .line 115
    .line 116
    const v3, 0x10100a0

    .line 117
    .line 118
    .line 119
    filled-new-array {v3}, [I

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    const v4, 0x7f0800a2

    .line 124
    .line 125
    .line 126
    invoke-static {p2, v4}, Lgf;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v2, v3, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 131
    .line 132
    .line 133
    const/4 v3, 0x0

    .line 134
    new-array v4, v3, [I

    .line 135
    .line 136
    const v5, 0x7f0800a4

    .line 137
    .line 138
    .line 139
    invoke-static {p2, v5}, Lgf;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {v2, v4, p2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v2}, Ly3;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 147
    .line 148
    .line 149
    iget-object p2, p0, Leu;->x0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 150
    .line 151
    iget v0, p0, Leu;->n0:I

    .line 152
    .line 153
    if-eqz v0, :cond_2

    .line 154
    .line 155
    move v3, v1

    .line 156
    :cond_2
    invoke-virtual {p2, v3}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    .line 157
    .line 158
    .line 159
    iget-object p2, p0, Leu;->x0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    invoke-static {p2, v0}, Loa0;->l(Landroid/view/View;Lx;)V

    .line 163
    .line 164
    .line 165
    iget-object p2, p0, Leu;->x0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 166
    .line 167
    iget v2, p0, Leu;->n0:I

    .line 168
    .line 169
    if-ne v2, v1, :cond_3

    .line 170
    .line 171
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    const v1, 0x7f100086

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    goto :goto_2

    .line 183
    :cond_3
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    const v1, 0x7f100088

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    :goto_2
    iget-object v1, p0, Leu;->x0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 195
    .line 196
    invoke-virtual {v1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 197
    .line 198
    .line 199
    iget-object p2, p0, Leu;->x0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 200
    .line 201
    new-instance v1, Lya;

    .line 202
    .line 203
    const/4 v2, 0x5

    .line 204
    invoke-direct {v1, v2, p0}, Lya;-><init>(ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 208
    .line 209
    .line 210
    const p2, 0x7f09006b

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast p1, Landroid/widget/Button;

    .line 218
    .line 219
    invoke-virtual {p0}, Leu;->E()V

    .line 220
    .line 221
    .line 222
    throw v0
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Leu;->e0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/content/DialogInterface$OnCancelListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Leu;->f0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/content/DialogInterface$OnDismissListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lol;->E:Landroid/view/View;

    .line 24
    .line 25
    check-cast v0, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-super {p0, p1}, Ltg;->onDismiss(Landroid/content/DialogInterface;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final r(Landroid/os/Bundle;)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, Ltg;->r(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 5
    .line 6
    iget v1, p0, Leu;->g0:I

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const-string v0, "DATE_SELECTOR_KEY"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ll8;

    .line 18
    .line 19
    iget-object v2, p0, Leu;->i0:Lm8;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    sget v3, Ll8;->b:I

    .line 25
    .line 26
    sget v3, Ll8;->b:I

    .line 27
    .line 28
    iget-object v3, v2, Lm8;->a:Lgw;

    .line 29
    .line 30
    iget-wide v3, v3, Lgw;->f:J

    .line 31
    .line 32
    iget-object v5, v2, Lm8;->b:Lgw;

    .line 33
    .line 34
    iget-wide v5, v5, Lgw;->f:J

    .line 35
    .line 36
    iget-object v7, v2, Lm8;->d:Lgw;

    .line 37
    .line 38
    iget-wide v7, v7, Lgw;->f:J

    .line 39
    .line 40
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    iput-object v7, v0, Ll8;->a:Ljava/lang/Long;

    .line 45
    .line 46
    iget v13, v2, Lm8;->e:I

    .line 47
    .line 48
    iget-object v2, v2, Lm8;->c:Ldf;

    .line 49
    .line 50
    iget-object v7, p0, Leu;->j0:Lyt;

    .line 51
    .line 52
    if-nez v7, :cond_0

    .line 53
    .line 54
    move-object v7, v1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object v7, v7, Lyt;->U:Lgw;

    .line 57
    .line 58
    :goto_0
    if-eqz v7, :cond_1

    .line 59
    .line 60
    iget-wide v7, v7, Lgw;->f:J

    .line 61
    .line 62
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    iput-object v7, v0, Ll8;->a:Ljava/lang/Long;

    .line 67
    .line 68
    :cond_1
    new-instance v7, Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v8, "DEEP_COPY_VALIDATOR_KEY"

    .line 74
    .line 75
    invoke-virtual {v7, v8, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 76
    .line 77
    .line 78
    move-object v2, v8

    .line 79
    new-instance v8, Lm8;

    .line 80
    .line 81
    invoke-static {v3, v4}, Lgw;->b(J)Lgw;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-static {v5, v6}, Lgw;->b(J)Lgw;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-virtual {v7, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    move-object v11, v2

    .line 94
    check-cast v11, Ldf;

    .line 95
    .line 96
    iget-object v0, v0, Ll8;->a:Ljava/lang/Long;

    .line 97
    .line 98
    if-nez v0, :cond_2

    .line 99
    .line 100
    move-object v12, v1

    .line 101
    goto :goto_1

    .line 102
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    invoke-static {v2, v3}, Lgw;->b(J)Lgw;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    move-object v12, v0

    .line 111
    :goto_1
    invoke-direct/range {v8 .. v13}, Lm8;-><init>(Lgw;Lgw;Ldf;Lgw;I)V

    .line 112
    .line 113
    .line 114
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 115
    .line 116
    invoke-virtual {p1, v0, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 117
    .line 118
    .line 119
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 120
    .line 121
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 122
    .line 123
    .line 124
    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    .line 125
    .line 126
    iget v1, p0, Leu;->k0:I

    .line 127
    .line 128
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    const-string v0, "TITLE_TEXT_KEY"

    .line 132
    .line 133
    iget-object v1, p0, Leu;->l0:Ljava/lang/CharSequence;

    .line 134
    .line 135
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    .line 138
    const-string v0, "INPUT_MODE_KEY"

    .line 139
    .line 140
    iget v1, p0, Leu;->n0:I

    .line 141
    .line 142
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 146
    .line 147
    iget v1, p0, Leu;->o0:I

    .line 148
    .line 149
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 150
    .line 151
    .line 152
    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    .line 153
    .line 154
    iget-object v1, p0, Leu;->p0:Ljava/lang/CharSequence;

    .line 155
    .line 156
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    const-string v0, "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"

    .line 160
    .line 161
    iget v1, p0, Leu;->q0:I

    .line 162
    .line 163
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 164
    .line 165
    .line 166
    const-string v0, "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"

    .line 167
    .line 168
    iget-object v1, p0, Leu;->r0:Ljava/lang/CharSequence;

    .line 169
    .line 170
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 174
    .line 175
    iget v1, p0, Leu;->s0:I

    .line 176
    .line 177
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 178
    .line 179
    .line 180
    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 181
    .line 182
    iget-object v1, p0, Leu;->t0:Ljava/lang/CharSequence;

    .line 183
    .line 184
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    const-string v0, "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"

    .line 188
    .line 189
    iget v1, p0, Leu;->u0:I

    .line 190
    .line 191
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 192
    .line 193
    .line 194
    const-string v0, "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"

    .line 195
    .line 196
    iget-object v1, p0, Leu;->v0:Ljava/lang/CharSequence;

    .line 197
    .line 198
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 199
    .line 200
    .line 201
    return-void
.end method

.method public final s()V
    .locals 13

    .line 1
    invoke-super {p0}, Ltg;->s()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltg;->a0:Landroid/app/Dialog;

    .line 5
    .line 6
    const-string v1, " does not have a Dialog."

    .line 7
    .line 8
    const-string v2, "DialogFragment "

    .line 9
    .line 10
    if-eqz v0, :cond_12

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-boolean v3, p0, Leu;->m0:Z

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v3, :cond_c

    .line 21
    .line 22
    const/4 v1, -0x1

    .line 23
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Leu;->y0:Liu;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    iget-boolean v1, p0, Leu;->z0:Z

    .line 32
    .line 33
    if-nez v1, :cond_d

    .line 34
    .line 35
    invoke-virtual {p0}, Lol;->A()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const v2, 0x7f0900ad

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, Lg80;->n(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move-object v2, v5

    .line 66
    :goto_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-nez v7, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move v7, v6

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    :goto_1
    move v7, v4

    .line 81
    :goto_2
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    const v9, 0x1010031

    .line 86
    .line 87
    .line 88
    const/high16 v10, -0x1000000

    .line 89
    .line 90
    invoke-static {v8, v9, v10}, Lg80;->l(Landroid/content/Context;II)I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v7, :cond_3

    .line 95
    .line 96
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :cond_3
    const/16 v7, 0x1e

    .line 101
    .line 102
    if-lt v3, v7, :cond_4

    .line 103
    .line 104
    invoke-static {v0, v6}, Lac0;->a(Landroid/view/Window;Z)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    invoke-static {v0, v6}, Lzb0;->a(Landroid/view/Window;Z)V

    .line 109
    .line 110
    .line 111
    :goto_3
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    const/16 v11, 0x1b

    .line 119
    .line 120
    if-ge v3, v11, :cond_5

    .line 121
    .line 122
    const v3, 0x1010452

    .line 123
    .line 124
    .line 125
    invoke-static {v9, v3, v10}, Lg80;->l(Landroid/content/Context;II)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    const/16 v9, 0x80

    .line 130
    .line 131
    invoke-static {v3, v9}, Lqb;->d(II)I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    goto :goto_4

    .line 136
    :cond_5
    move v3, v6

    .line 137
    :goto_4
    invoke-virtual {v0, v6}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v3}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    invoke-static {v2}, Lg80;->s(I)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-static {v6}, Lg80;->s(I)Z

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    if-nez v9, :cond_7

    .line 156
    .line 157
    if-eqz v2, :cond_6

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_6
    move v2, v6

    .line 161
    goto :goto_6

    .line 162
    :cond_7
    :goto_5
    move v2, v4

    .line 163
    :goto_6
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 168
    .line 169
    if-lt v10, v7, :cond_8

    .line 170
    .line 171
    new-instance v9, Ldd0;

    .line 172
    .line 173
    invoke-static {v0}, Lzc0;->b(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-direct {v9, v10}, Ldd0;-><init>(Landroid/view/WindowInsetsController;)V

    .line 178
    .line 179
    .line 180
    iput-object v0, v9, Ldd0;->b:Landroid/view/Window;

    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_8
    new-instance v10, Lcd0;

    .line 184
    .line 185
    invoke-direct {v10, v0, v9}, Lcd0;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 186
    .line 187
    .line 188
    move-object v9, v10

    .line 189
    :goto_7
    invoke-virtual {v9, v2}, Lmu;->F(Z)V

    .line 190
    .line 191
    .line 192
    invoke-static {v8}, Lg80;->s(I)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-static {v3}, Lg80;->s(I)Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-nez v8, :cond_9

    .line 201
    .line 202
    if-nez v3, :cond_a

    .line 203
    .line 204
    if-eqz v2, :cond_a

    .line 205
    .line 206
    :cond_9
    move v6, v4

    .line 207
    :cond_a
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 212
    .line 213
    if-lt v3, v7, :cond_b

    .line 214
    .line 215
    new-instance v2, Ldd0;

    .line 216
    .line 217
    invoke-static {v0}, Lzc0;->b(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-direct {v2, v3}, Ldd0;-><init>(Landroid/view/WindowInsetsController;)V

    .line 222
    .line 223
    .line 224
    iput-object v0, v2, Ldd0;->b:Landroid/view/Window;

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_b
    new-instance v3, Lcd0;

    .line 228
    .line 229
    invoke-direct {v3, v0, v2}, Lcd0;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 230
    .line 231
    .line 232
    move-object v2, v3

    .line 233
    :goto_8
    invoke-virtual {v2, v6}, Lmu;->E(Z)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 245
    .line 246
    new-instance v3, Ldu;

    .line 247
    .line 248
    invoke-direct {v3, v1, v2, v0}, Ldu;-><init>(Landroid/view/View;II)V

    .line 249
    .line 250
    .line 251
    sget-object v0, Loa0;->a:Ljava/util/WeakHashMap;

    .line 252
    .line 253
    invoke-static {v1, v3}, Lda0;->u(Landroid/view/View;Lyw;)V

    .line 254
    .line 255
    .line 256
    iput-boolean v4, p0, Leu;->z0:Z

    .line 257
    .line 258
    goto :goto_9

    .line 259
    :cond_c
    const/4 v3, -0x2

    .line 260
    invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setLayout(II)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0}, Lol;->z()Landroid/content/Context;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    const v6, 0x7f070277

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    new-instance v3, Landroid/graphics/Rect;

    .line 279
    .line 280
    invoke-direct {v3, v9, v9, v9, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 281
    .line 282
    .line 283
    new-instance v7, Landroid/graphics/drawable/InsetDrawable;

    .line 284
    .line 285
    iget-object v8, p0, Leu;->y0:Liu;

    .line 286
    .line 287
    move v10, v9

    .line 288
    move v11, v9

    .line 289
    move v12, v9

    .line 290
    invoke-direct/range {v7 .. v12}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v7}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    new-instance v6, Lgp;

    .line 301
    .line 302
    iget-object v7, p0, Ltg;->a0:Landroid/app/Dialog;

    .line 303
    .line 304
    if-eqz v7, :cond_11

    .line 305
    .line 306
    invoke-direct {v6, v7, v3}, Lgp;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, v6}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 310
    .line 311
    .line 312
    :cond_d
    :goto_9
    invoke-virtual {p0}, Lol;->z()Landroid/content/Context;

    .line 313
    .line 314
    .line 315
    iget v0, p0, Leu;->g0:I

    .line 316
    .line 317
    if-eqz v0, :cond_10

    .line 318
    .line 319
    invoke-virtual {p0}, Leu;->E()V

    .line 320
    .line 321
    .line 322
    iget-object v1, p0, Leu;->i0:Lm8;

    .line 323
    .line 324
    new-instance v2, Lyt;

    .line 325
    .line 326
    invoke-direct {v2}, Lyt;-><init>()V

    .line 327
    .line 328
    .line 329
    new-instance v3, Landroid/os/Bundle;

    .line 330
    .line 331
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 332
    .line 333
    .line 334
    const-string v6, "THEME_RES_ID_KEY"

    .line 335
    .line 336
    invoke-virtual {v3, v6, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 337
    .line 338
    .line 339
    const-string v7, "GRID_SELECTOR_KEY"

    .line 340
    .line 341
    invoke-virtual {v3, v7, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 342
    .line 343
    .line 344
    const-string v7, "CALENDAR_CONSTRAINTS_KEY"

    .line 345
    .line 346
    invoke-virtual {v3, v7, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 347
    .line 348
    .line 349
    const-string v8, "DAY_VIEW_DECORATOR_KEY"

    .line 350
    .line 351
    invoke-virtual {v3, v8, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 352
    .line 353
    .line 354
    const-string v8, "CURRENT_MONTH_KEY"

    .line 355
    .line 356
    iget-object v1, v1, Lm8;->d:Lgw;

    .line 357
    .line 358
    invoke-virtual {v3, v8, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v3}, Lol;->C(Landroid/os/Bundle;)V

    .line 362
    .line 363
    .line 364
    iput-object v2, p0, Leu;->j0:Lyt;

    .line 365
    .line 366
    iget v1, p0, Leu;->n0:I

    .line 367
    .line 368
    if-ne v1, v4, :cond_e

    .line 369
    .line 370
    invoke-virtual {p0}, Leu;->E()V

    .line 371
    .line 372
    .line 373
    iget-object v1, p0, Leu;->i0:Lm8;

    .line 374
    .line 375
    new-instance v2, Lku;

    .line 376
    .line 377
    invoke-direct {v2}, Lku;-><init>()V

    .line 378
    .line 379
    .line 380
    new-instance v3, Landroid/os/Bundle;

    .line 381
    .line 382
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v3, v6, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 386
    .line 387
    .line 388
    const-string v0, "DATE_SELECTOR_KEY"

    .line 389
    .line 390
    invoke-virtual {v3, v0, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v3, v7, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2, v3}, Lol;->C(Landroid/os/Bundle;)V

    .line 397
    .line 398
    .line 399
    :cond_e
    iput-object v2, p0, Leu;->h0:Lxx;

    .line 400
    .line 401
    iget-object v0, p0, Leu;->w0:Landroid/widget/TextView;

    .line 402
    .line 403
    iget v1, p0, Leu;->n0:I

    .line 404
    .line 405
    if-ne v1, v4, :cond_f

    .line 406
    .line 407
    invoke-virtual {p0}, Lol;->z()Landroid/content/Context;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 420
    .line 421
    const/4 v2, 0x2

    .line 422
    if-ne v1, v2, :cond_f

    .line 423
    .line 424
    iget-object v1, p0, Leu;->B0:Ljava/lang/CharSequence;

    .line 425
    .line 426
    goto :goto_a

    .line 427
    :cond_f
    iget-object v1, p0, Leu;->A0:Ljava/lang/CharSequence;

    .line 428
    .line 429
    :goto_a
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {p0}, Leu;->E()V

    .line 433
    .line 434
    .line 435
    throw v5

    .line 436
    :cond_10
    invoke-virtual {p0}, Leu;->E()V

    .line 437
    .line 438
    .line 439
    throw v5

    .line 440
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 441
    .line 442
    new-instance v3, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw v0

    .line 461
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 462
    .line 463
    new-instance v3, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw v0
.end method

.method public final t()V
    .locals 1

    .line 1
    iget-object v0, p0, Leu;->h0:Lxx;

    .line 2
    .line 3
    iget-object v0, v0, Lxx;->R:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ltg;->t()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
