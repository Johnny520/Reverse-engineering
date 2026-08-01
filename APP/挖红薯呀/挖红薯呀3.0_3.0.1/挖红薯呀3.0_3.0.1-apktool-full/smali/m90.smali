.class public final Lm90;
.super Landroid/app/Dialog;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm90$a;
    }
.end annotation


# static fields
.field public static final m:Lm90$a;

.field public static final n:I

.field private static o:Z


# instance fields
.field private final d:Ljava/lang/String;

.field private final e:Z

.field private final f:Lhw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhw;"
        }
    .end annotation
.end field

.field private final g:Landroid/os/Handler;

.field private h:Z

.field private i:Landroid/widget/Button;

.field private j:Landroid/widget/EditText;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/ProgressBar;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm90$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lm90$a;-><init>(Lpl;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm90;->m:Lm90$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lm90;->n:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLhw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Z",
            "Lhw;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v0, 0x103000a

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lm90;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-boolean p3, p0, Lm90;->e:Z

    .line 19
    .line 20
    iput-object p4, p0, Lm90;->f:Lhw;

    .line 21
    .line 22
    new-instance p1, Landroid/os/Handler;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lm90;->g:Landroid/os/Handler;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lm90;->i()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private final A()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/16 p0, 0xff

    .line 10
    .line 11
    const/16 v0, 0x1a

    .line 12
    .line 13
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method private final B()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0xa0

    .line 8
    .line 9
    const/16 v0, 0x78

    .line 10
    .line 11
    const/16 v1, 0xb4

    .line 12
    .line 13
    const/16 v2, 0xff

    .line 14
    .line 15
    invoke-static {v1, v2, p0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const-string p0, "#B85A20"

    .line 21
    .line 22
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method private final C()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0xc8

    .line 8
    .line 9
    const/16 v0, 0x64

    .line 10
    .line 11
    const/16 v1, 0xdc

    .line 12
    .line 13
    const/16 v2, 0xff

    .line 14
    .line 15
    invoke-static {v1, v2, p0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const-string p0, "#CC6A00"

    .line 21
    .line 22
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method private final D()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0xff

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0xb4

    .line 10
    .line 11
    const/16 v1, 0x3c

    .line 12
    .line 13
    invoke-static {v1, v0, p0, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const/16 p0, 0x8c

    .line 19
    .line 20
    const/16 v1, 0x28

    .line 21
    .line 22
    const/16 v2, 0x1e

    .line 23
    .line 24
    invoke-static {v2, v0, p0, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method private final E()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0xff

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0xb4

    .line 10
    .line 11
    const/16 v1, 0x3c

    .line 12
    .line 13
    const/16 v2, 0x64

    .line 14
    .line 15
    :goto_0
    invoke-static {v2, v0, p0, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/16 p0, 0x8c

    .line 21
    .line 22
    const/16 v1, 0x28

    .line 23
    .line 24
    const/16 v2, 0xc8

    .line 25
    .line 26
    goto :goto_0
.end method

.method private final F()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lm90;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-boolean v0, p0, Lm90;->e:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_4

    .line 10
    :cond_0
    iget-object v0, p0, Lm90;->j:Landroid/widget/EditText;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Lk41;->g0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    :cond_1
    const-string v0, ""

    .line 37
    .line 38
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x0

    .line 43
    if-lez v0, :cond_3

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    move v0, v1

    .line 48
    :goto_0
    iget-object v2, p0, Lm90;->i:Landroid/widget/Button;

    .line 49
    .line 50
    if-eqz v2, :cond_6

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 53
    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    const/4 v3, -0x1

    .line 58
    goto :goto_1

    .line 59
    :cond_4
    invoke-direct {p0}, Lm90;->s()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    .line 65
    .line 66
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 67
    .line 68
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 72
    .line 73
    .line 74
    const/16 v1, 0x20

    .line 75
    .line 76
    invoke-direct {p0, v1}, Lm90;->p(I)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    int-to-float p0, p0

    .line 81
    invoke-virtual {v3, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 82
    .line 83
    .line 84
    const/16 p0, 0x55

    .line 85
    .line 86
    const/16 v1, 0x2c

    .line 87
    .line 88
    const/16 v4, 0xfe

    .line 89
    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    const/16 v0, 0xdc

    .line 93
    .line 94
    :goto_2
    invoke-static {v0, v4, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    const/16 v0, 0x64

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :goto_3
    invoke-virtual {v3, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 106
    .line 107
    .line 108
    :cond_6
    :goto_4
    return-void
.end method

.method public static synthetic a(Lm90;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm90;->m(Lm90;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lm90;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lm90;->o(Lm90;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lm90;Ln90$a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm90;->n(Lm90;Ln90$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Landroid/widget/Button;Lm90;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lm90;->j(Landroid/widget/Button;Lm90;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lm90;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm90;->k(Lm90;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic f()Z
    .locals 1

    .line 1
    sget-boolean v0, Lm90;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic g(Lm90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm90;->F()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic h(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lm90;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method private final i()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Lm90;->r()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 21
    .line 22
    .line 23
    const/16 v3, 0x10

    .line 24
    .line 25
    invoke-direct {v0, v3}, Lm90;->p(I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/16 v5, 0x24

    .line 30
    .line 31
    invoke-direct {v0, v5}, Lm90;->p(I)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-direct {v0, v3}, Lm90;->p(I)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    invoke-direct {v0, v3}, Lm90;->p(I)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    invoke-virtual {v1, v4, v5, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 44
    .line 45
    .line 46
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    .line 47
    .line 48
    const/4 v5, -0x1

    .line 49
    invoke-direct {v4, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, Landroid/widget/TextView;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-direct {v4, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    const-string v6, "\u6388\u6743\u9a8c\u8bc1"

    .line 65
    .line 66
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    const/high16 v6, 0x41a00000    # 20.0f

    .line 70
    .line 71
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v0}, Lm90;->A()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 79
    .line 80
    .line 81
    const/16 v6, 0x11

    .line 82
    .line 83
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 84
    .line 85
    .line 86
    const/16 v7, 0x8

    .line 87
    .line 88
    invoke-direct {v0, v7}, Lm90;->p(I)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    const/4 v9, 0x0

    .line 93
    invoke-virtual {v4, v9, v9, v9, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    new-instance v4, Landroid/widget/TextView;

    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-direct {v4, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    const-string v8, "\u8f93\u5165\u4f60\u7684\u6388\u6743\u7801\u4ee5\u542f\u7528\u6a21\u5757\u529f\u80fd"

    .line 109
    .line 110
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    const/high16 v8, 0x41500000    # 13.0f

    .line 114
    .line 115
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v0}, Lm90;->z()I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 126
    .line 127
    .line 128
    invoke-direct {v0, v3}, Lm90;->p(I)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-virtual {v4, v9, v9, v9, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    new-instance v3, Landroid/widget/ScrollView;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-direct {v3, v4}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 145
    .line 146
    .line 147
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 148
    .line 149
    const/high16 v10, 0x3f800000    # 1.0f

    .line 150
    .line 151
    invoke-direct {v4, v5, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 155
    .line 156
    .line 157
    new-instance v4, Landroid/widget/LinearLayout;

    .line 158
    .line 159
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    invoke-direct {v4, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 167
    .line 168
    .line 169
    new-instance v11, Landroid/widget/TextView;

    .line 170
    .line 171
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    invoke-direct {v11, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 176
    .line 177
    .line 178
    const-string v12, "\u5c0f\u7ea2\u4e66\u8d26\u53f7ID"

    .line 179
    .line 180
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    const/high16 v12, 0x41400000    # 12.0f

    .line 184
    .line 185
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 186
    .line 187
    .line 188
    invoke-direct {v0}, Lm90;->y()I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 193
    .line 194
    .line 195
    const/4 v13, 0x4

    .line 196
    invoke-direct {v0, v13}, Lm90;->p(I)I

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    invoke-direct {v0, v13}, Lm90;->p(I)I

    .line 201
    .line 202
    .line 203
    move-result v15

    .line 204
    invoke-virtual {v11, v14, v9, v9, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 208
    .line 209
    .line 210
    new-instance v11, Landroid/widget/LinearLayout;

    .line 211
    .line 212
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 213
    .line 214
    .line 215
    move-result-object v14

    .line 216
    invoke-direct {v11, v14}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v11, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 220
    .line 221
    .line 222
    const/16 v14, 0xe

    .line 223
    .line 224
    invoke-direct {v0, v14}, Lm90;->p(I)I

    .line 225
    .line 226
    .line 227
    move-result v15

    .line 228
    invoke-virtual {v11, v9, v9, v9, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 229
    .line 230
    .line 231
    new-instance v15, Landroid/widget/TextView;

    .line 232
    .line 233
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    invoke-direct {v15, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 238
    .line 239
    .line 240
    iget-boolean v8, v0, Lm90;->e:Z

    .line 241
    .line 242
    if-eqz v8, :cond_0

    .line 243
    .line 244
    iget-object v8, v0, Lm90;->d:Ljava/lang/String;

    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_0
    const-string v8, "\u26a0\ufe0f \u672a\u767b\u5f55\uff0c\u8bf7\u5148\u767b\u5f55\u5c0f\u7ea2\u4e66\u8d26\u53f7\u540e\u518d\u9a8c\u8bc1"

    .line 248
    .line 249
    :goto_0
    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    .line 251
    .line 252
    const/high16 v8, 0x41600000    # 14.0f

    .line 253
    .line 254
    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 255
    .line 256
    .line 257
    iget-boolean v8, v0, Lm90;->e:Z

    .line 258
    .line 259
    if-eqz v8, :cond_1

    .line 260
    .line 261
    invoke-direct {v0}, Lm90;->A()I

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    goto :goto_1

    .line 266
    :cond_1
    invoke-direct {v0}, Lm90;->C()I

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    :goto_1
    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 271
    .line 272
    .line 273
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 274
    .line 275
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 279
    .line 280
    .line 281
    const/16 v5, 0xa

    .line 282
    .line 283
    invoke-direct {v0, v5}, Lm90;->p(I)I

    .line 284
    .line 285
    .line 286
    move-result v13

    .line 287
    int-to-float v13, v13

    .line 288
    invoke-virtual {v8, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 289
    .line 290
    .line 291
    iget-boolean v13, v0, Lm90;->e:Z

    .line 292
    .line 293
    if-eqz v13, :cond_2

    .line 294
    .line 295
    invoke-direct {v0, v2}, Lm90;->p(I)I

    .line 296
    .line 297
    .line 298
    move-result v13

    .line 299
    invoke-direct {v0}, Lm90;->v()I

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    invoke-virtual {v8, v13, v6}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 304
    .line 305
    .line 306
    invoke-direct {v0}, Lm90;->u()I

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    invoke-virtual {v8, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 311
    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_2
    invoke-direct {v0, v2}, Lm90;->p(I)I

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    invoke-direct {v0}, Lm90;->E()I

    .line 319
    .line 320
    .line 321
    move-result v13

    .line 322
    invoke-virtual {v8, v6, v13}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 323
    .line 324
    .line 325
    invoke-direct {v0}, Lm90;->D()I

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    invoke-virtual {v8, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 330
    .line 331
    .line 332
    :goto_2
    invoke-virtual {v15, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 333
    .line 334
    .line 335
    invoke-direct {v0, v14}, Lm90;->p(I)I

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    invoke-direct {v0, v5}, Lm90;->p(I)I

    .line 340
    .line 341
    .line 342
    move-result v8

    .line 343
    invoke-direct {v0, v14}, Lm90;->p(I)I

    .line 344
    .line 345
    .line 346
    move-result v13

    .line 347
    invoke-direct {v0, v5}, Lm90;->p(I)I

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    invoke-virtual {v15, v6, v8, v13, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 352
    .line 353
    .line 354
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 355
    .line 356
    const/4 v6, -0x2

    .line 357
    invoke-direct {v2, v9, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v15, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 361
    .line 362
    .line 363
    iget-boolean v2, v0, Lm90;->e:Z

    .line 364
    .line 365
    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v11, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 369
    .line 370
    .line 371
    new-instance v2, Landroid/widget/Button;

    .line 372
    .line 373
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    invoke-direct {v2, v8}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 378
    .line 379
    .line 380
    const-string v8, "\u590d\u5236"

    .line 381
    .line 382
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 386
    .line 387
    .line 388
    invoke-direct {v0}, Lm90;->A()I

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 393
    .line 394
    .line 395
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 396
    .line 397
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 401
    .line 402
    .line 403
    invoke-direct {v0, v5}, Lm90;->p(I)I

    .line 404
    .line 405
    .line 406
    move-result v13

    .line 407
    int-to-float v13, v13

    .line 408
    invoke-virtual {v8, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 409
    .line 410
    .line 411
    const/16 v13, 0xc8

    .line 412
    .line 413
    const/16 v15, 0xfe

    .line 414
    .line 415
    const/16 v10, 0x2c

    .line 416
    .line 417
    const/16 v12, 0x55

    .line 418
    .line 419
    invoke-static {v13, v15, v10, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 420
    .line 421
    .line 422
    move-result v9

    .line 423
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 427
    .line 428
    .line 429
    invoke-direct {v0, v14}, Lm90;->p(I)I

    .line 430
    .line 431
    .line 432
    move-result v8

    .line 433
    invoke-direct {v0, v5}, Lm90;->p(I)I

    .line 434
    .line 435
    .line 436
    move-result v9

    .line 437
    invoke-direct {v0, v14}, Lm90;->p(I)I

    .line 438
    .line 439
    .line 440
    move-result v10

    .line 441
    invoke-direct {v0, v5}, Lm90;->p(I)I

    .line 442
    .line 443
    .line 444
    move-result v12

    .line 445
    invoke-virtual {v2, v8, v9, v10, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 446
    .line 447
    .line 448
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 449
    .line 450
    invoke-direct {v8, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 451
    .line 452
    .line 453
    invoke-direct {v0, v7}, Lm90;->p(I)I

    .line 454
    .line 455
    .line 456
    move-result v9

    .line 457
    const/4 v10, 0x0

    .line 458
    invoke-virtual {v8, v9, v10, v10, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 462
    .line 463
    .line 464
    iget-boolean v8, v0, Lm90;->e:Z

    .line 465
    .line 466
    if-eqz v8, :cond_3

    .line 467
    .line 468
    const/4 v8, 0x0

    .line 469
    goto :goto_3

    .line 470
    :cond_3
    move v8, v7

    .line 471
    :goto_3
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 472
    .line 473
    .line 474
    new-instance v8, Lqf0;

    .line 475
    .line 476
    const/4 v9, 0x2

    .line 477
    invoke-direct {v8, v9, v2, v0}, Lqf0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v4, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 487
    .line 488
    .line 489
    new-instance v2, Landroid/widget/TextView;

    .line 490
    .line 491
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    invoke-direct {v2, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 496
    .line 497
    .line 498
    const-string v8, "\u26a0\ufe0f \u4e0a\u65b9\u663e\u793a\u7684\u5c0f\u7ea2\u4e66\u53f7\u4ec5\u4f9b\u53c2\u8003\uff0c\u81ea\u5df1\u6838\u5bf9\u597d\u662f\u5426\u6b63\u786e\uff0c\u5426\u5219\u540e\u679c\u81ea\u8d1f"

    .line 499
    .line 500
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 501
    .line 502
    .line 503
    const/high16 v8, 0x41300000    # 11.0f

    .line 504
    .line 505
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 506
    .line 507
    .line 508
    const/16 v8, 0xff

    .line 509
    .line 510
    const/16 v10, 0x50

    .line 511
    .line 512
    invoke-static {v13, v8, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    .line 513
    .line 514
    .line 515
    move-result v11

    .line 516
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 517
    .line 518
    .line 519
    const/16 v11, 0x11

    .line 520
    .line 521
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 522
    .line 523
    .line 524
    const/4 v11, 0x4

    .line 525
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 526
    .line 527
    .line 528
    move-result v12

    .line 529
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 530
    .line 531
    .line 532
    move-result v9

    .line 533
    invoke-direct {v0, v14}, Lm90;->p(I)I

    .line 534
    .line 535
    .line 536
    move-result v11

    .line 537
    const/4 v15, 0x0

    .line 538
    invoke-virtual {v2, v12, v15, v9, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 542
    .line 543
    .line 544
    new-instance v2, Landroid/widget/TextView;

    .line 545
    .line 546
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 547
    .line 548
    .line 549
    move-result-object v9

    .line 550
    invoke-direct {v2, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 551
    .line 552
    .line 553
    const-string v9, "\u6388\u6743\u7801"

    .line 554
    .line 555
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 556
    .line 557
    .line 558
    const/high16 v9, 0x41400000    # 12.0f

    .line 559
    .line 560
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 561
    .line 562
    .line 563
    invoke-direct {v0}, Lm90;->y()I

    .line 564
    .line 565
    .line 566
    move-result v9

    .line 567
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 568
    .line 569
    .line 570
    const/4 v11, 0x4

    .line 571
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 572
    .line 573
    .line 574
    move-result v9

    .line 575
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 576
    .line 577
    .line 578
    move-result v12

    .line 579
    const/4 v15, 0x0

    .line 580
    invoke-virtual {v2, v9, v15, v15, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 584
    .line 585
    .line 586
    new-instance v2, Landroid/widget/EditText;

    .line 587
    .line 588
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 589
    .line 590
    .line 591
    move-result-object v9

    .line 592
    invoke-direct {v2, v9}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 593
    .line 594
    .line 595
    invoke-direct {v0}, Lm90;->A()I

    .line 596
    .line 597
    .line 598
    move-result v9

    .line 599
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 600
    .line 601
    .line 602
    invoke-direct {v0}, Lm90;->q()Z

    .line 603
    .line 604
    .line 605
    move-result v9

    .line 606
    if-eqz v9, :cond_4

    .line 607
    .line 608
    move v9, v8

    .line 609
    goto :goto_4

    .line 610
    :cond_4
    const/4 v9, 0x0

    .line 611
    :goto_4
    invoke-direct {v0}, Lm90;->q()Z

    .line 612
    .line 613
    .line 614
    move-result v11

    .line 615
    if-eqz v11, :cond_5

    .line 616
    .line 617
    move v11, v8

    .line 618
    goto :goto_5

    .line 619
    :cond_5
    const/4 v11, 0x0

    .line 620
    :goto_5
    invoke-direct {v0}, Lm90;->q()Z

    .line 621
    .line 622
    .line 623
    move-result v12

    .line 624
    if-eqz v12, :cond_6

    .line 625
    .line 626
    move v12, v8

    .line 627
    goto :goto_6

    .line 628
    :cond_6
    const/4 v12, 0x0

    .line 629
    :goto_6
    invoke-static {v10, v9, v11, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 630
    .line 631
    .line 632
    move-result v9

    .line 633
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 634
    .line 635
    .line 636
    const-string v9, "\u8f93\u5165\u6388\u6743\u7801"

    .line 637
    .line 638
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 639
    .line 640
    .line 641
    const/high16 v9, 0x41800000    # 16.0f

    .line 642
    .line 643
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 644
    .line 645
    .line 646
    const/16 v11, 0x11

    .line 647
    .line 648
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 649
    .line 650
    .line 651
    new-instance v10, Landroid/graphics/drawable/GradientDrawable;

    .line 652
    .line 653
    invoke-direct {v10}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 654
    .line 655
    .line 656
    const/4 v15, 0x0

    .line 657
    invoke-virtual {v10, v15}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 658
    .line 659
    .line 660
    const/16 v11, 0xc

    .line 661
    .line 662
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 663
    .line 664
    .line 665
    move-result v12

    .line 666
    int-to-float v12, v12

    .line 667
    invoke-virtual {v10, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 668
    .line 669
    .line 670
    const/4 v12, 0x1

    .line 671
    invoke-direct {v0, v12}, Lm90;->p(I)I

    .line 672
    .line 673
    .line 674
    move-result v15

    .line 675
    invoke-direct {v0}, Lm90;->x()I

    .line 676
    .line 677
    .line 678
    move-result v9

    .line 679
    invoke-virtual {v10, v15, v9}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 680
    .line 681
    .line 682
    invoke-direct {v0}, Lm90;->w()I

    .line 683
    .line 684
    .line 685
    move-result v9

    .line 686
    invoke-virtual {v10, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v2, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 690
    .line 691
    .line 692
    invoke-direct {v0, v14}, Lm90;->p(I)I

    .line 693
    .line 694
    .line 695
    move-result v9

    .line 696
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 697
    .line 698
    .line 699
    move-result v10

    .line 700
    invoke-direct {v0, v14}, Lm90;->p(I)I

    .line 701
    .line 702
    .line 703
    move-result v15

    .line 704
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 705
    .line 706
    .line 707
    move-result v11

    .line 708
    invoke-virtual {v2, v9, v10, v15, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 712
    .line 713
    .line 714
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 715
    .line 716
    const/4 v10, -0x1

    .line 717
    invoke-direct {v9, v10, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v2, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 721
    .line 722
    .line 723
    iput-object v2, v0, Lm90;->j:Landroid/widget/EditText;

    .line 724
    .line 725
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 726
    .line 727
    .line 728
    new-instance v2, Landroid/widget/TextView;

    .line 729
    .line 730
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 731
    .line 732
    .line 733
    move-result-object v6

    .line 734
    invoke-direct {v2, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 735
    .line 736
    .line 737
    const-string v6, "\u26a0\ufe0f \u6388\u6743\u7801\u4e0e\u5c0f\u7ea2\u4e66\u8d26\u53f7\u7ed1\u5b9a\uff0c\u8bf7\u786e\u4fdd\u8f93\u5165\u6b63\u786e\u7684\u6388\u6743\u7801\u3002\u5982\u672a\u767b\u5f55\uff0c\u8bf7\u5148\u767b\u5f55\u5c0f\u7ea2\u4e66\u540e\u91cd\u65b0\u6253\u5f00\u9a8c\u8bc1\u3002"

    .line 738
    .line 739
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 740
    .line 741
    .line 742
    const/high16 v9, 0x41400000    # 12.0f

    .line 743
    .line 744
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 745
    .line 746
    .line 747
    invoke-direct {v0}, Lm90;->B()I

    .line 748
    .line 749
    .line 750
    move-result v6

    .line 751
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 752
    .line 753
    .line 754
    const/4 v6, 0x3

    .line 755
    invoke-direct {v0, v6}, Lm90;->p(I)I

    .line 756
    .line 757
    .line 758
    move-result v6

    .line 759
    int-to-float v6, v6

    .line 760
    const/high16 v9, 0x3f800000    # 1.0f

    .line 761
    .line 762
    invoke-virtual {v2, v6, v9}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 763
    .line 764
    .line 765
    const/4 v11, 0x4

    .line 766
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 767
    .line 768
    .line 769
    move-result v6

    .line 770
    invoke-direct {v0, v14}, Lm90;->p(I)I

    .line 771
    .line 772
    .line 773
    move-result v9

    .line 774
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 775
    .line 776
    .line 777
    move-result v10

    .line 778
    const/4 v15, 0x0

    .line 779
    invoke-virtual {v2, v6, v9, v10, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 783
    .line 784
    .line 785
    new-instance v2, Landroid/widget/TextView;

    .line 786
    .line 787
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 788
    .line 789
    .line 790
    move-result-object v6

    .line 791
    invoke-direct {v2, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 792
    .line 793
    .line 794
    const-string v6, ""

    .line 795
    .line 796
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 797
    .line 798
    .line 799
    const/high16 v6, 0x41500000    # 13.0f

    .line 800
    .line 801
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 802
    .line 803
    .line 804
    invoke-static {v13, v8, v13, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 805
    .line 806
    .line 807
    move-result v6

    .line 808
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 809
    .line 810
    .line 811
    const/16 v11, 0x11

    .line 812
    .line 813
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 814
    .line 815
    .line 816
    invoke-direct {v0, v7}, Lm90;->p(I)I

    .line 817
    .line 818
    .line 819
    move-result v6

    .line 820
    invoke-virtual {v2, v15, v6, v15, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 824
    .line 825
    .line 826
    iput-object v2, v0, Lm90;->k:Landroid/widget/TextView;

    .line 827
    .line 828
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 829
    .line 830
    .line 831
    new-instance v2, Landroid/widget/ProgressBar;

    .line 832
    .line 833
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 834
    .line 835
    .line 836
    move-result-object v6

    .line 837
    invoke-direct {v2, v6}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 838
    .line 839
    .line 840
    const/4 v12, 0x1

    .line 841
    invoke-virtual {v2, v12}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 845
    .line 846
    .line 847
    const/16 v6, 0x28

    .line 848
    .line 849
    invoke-direct {v0, v6}, Lm90;->p(I)I

    .line 850
    .line 851
    .line 852
    move-result v7

    .line 853
    const/4 v11, 0x4

    .line 854
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 855
    .line 856
    .line 857
    move-result v8

    .line 858
    invoke-direct {v0, v6}, Lm90;->p(I)I

    .line 859
    .line 860
    .line 861
    move-result v6

    .line 862
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 863
    .line 864
    .line 865
    move-result v9

    .line 866
    invoke-virtual {v2, v7, v8, v6, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 867
    .line 868
    .line 869
    iput-object v2, v0, Lm90;->l:Landroid/widget/ProgressBar;

    .line 870
    .line 871
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v3, v4}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 878
    .line 879
    .line 880
    new-instance v2, Landroid/view/View;

    .line 881
    .line 882
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 883
    .line 884
    .line 885
    move-result-object v3

    .line 886
    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 887
    .line 888
    .line 889
    invoke-direct {v0}, Lm90;->t()I

    .line 890
    .line 891
    .line 892
    move-result v3

    .line 893
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 894
    .line 895
    .line 896
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 897
    .line 898
    const/4 v12, 0x1

    .line 899
    invoke-direct {v0, v12}, Lm90;->p(I)I

    .line 900
    .line 901
    .line 902
    move-result v4

    .line 903
    const/4 v10, -0x1

    .line 904
    invoke-direct {v3, v10, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 905
    .line 906
    .line 907
    const/4 v11, 0x4

    .line 908
    invoke-direct {v0, v11}, Lm90;->p(I)I

    .line 909
    .line 910
    .line 911
    move-result v4

    .line 912
    invoke-direct {v0, v5}, Lm90;->p(I)I

    .line 913
    .line 914
    .line 915
    move-result v5

    .line 916
    const/4 v15, 0x0

    .line 917
    invoke-virtual {v3, v15, v4, v15, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 924
    .line 925
    .line 926
    new-instance v2, Landroid/widget/Button;

    .line 927
    .line 928
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 929
    .line 930
    .line 931
    move-result-object v3

    .line 932
    invoke-direct {v2, v3}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 933
    .line 934
    .line 935
    iget-boolean v3, v0, Lm90;->e:Z

    .line 936
    .line 937
    if-eqz v3, :cond_7

    .line 938
    .line 939
    const-string v3, "\u9a8c\u8bc1\u6388\u6743"

    .line 940
    .line 941
    goto :goto_7

    .line 942
    :cond_7
    const-string v3, "\u8bf7\u5148\u767b\u5f55\u5c0f\u7ea2\u4e66"

    .line 943
    .line 944
    :goto_7
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 945
    .line 946
    .line 947
    const/high16 v3, 0x41800000    # 16.0f

    .line 948
    .line 949
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 950
    .line 951
    .line 952
    invoke-direct {v0}, Lm90;->s()I

    .line 953
    .line 954
    .line 955
    move-result v3

    .line 956
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 957
    .line 958
    .line 959
    const/4 v15, 0x0

    .line 960
    invoke-virtual {v2, v15}, Landroid/view/View;->setEnabled(Z)V

    .line 961
    .line 962
    .line 963
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 964
    .line 965
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v3, v15}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 969
    .line 970
    .line 971
    const/16 v4, 0x20

    .line 972
    .line 973
    invoke-direct {v0, v4}, Lm90;->p(I)I

    .line 974
    .line 975
    .line 976
    move-result v4

    .line 977
    int-to-float v4, v4

    .line 978
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 979
    .line 980
    .line 981
    const/16 v4, 0x64

    .line 982
    .line 983
    const/16 v5, 0x55

    .line 984
    .line 985
    const/16 v6, 0x2c

    .line 986
    .line 987
    const/16 v7, 0xfe

    .line 988
    .line 989
    invoke-static {v4, v7, v6, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 990
    .line 991
    .line 992
    move-result v4

    .line 993
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 997
    .line 998
    .line 999
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1000
    .line 1001
    const/16 v4, 0x30

    .line 1002
    .line 1003
    invoke-direct {v0, v4}, Lm90;->p(I)I

    .line 1004
    .line 1005
    .line 1006
    move-result v4

    .line 1007
    const/4 v10, -0x1

    .line 1008
    invoke-direct {v3, v10, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1009
    .line 1010
    .line 1011
    const/16 v4, 0x18

    .line 1012
    .line 1013
    invoke-direct {v0, v4}, Lm90;->p(I)I

    .line 1014
    .line 1015
    .line 1016
    move-result v4

    .line 1017
    const/4 v15, 0x0

    .line 1018
    invoke-virtual {v3, v15, v15, v15, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1022
    .line 1023
    .line 1024
    new-instance v3, Ljp;

    .line 1025
    .line 1026
    const/4 v4, 0x2

    .line 1027
    invoke-direct {v3, v0, v4}, Ljp;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1031
    .line 1032
    .line 1033
    iput-object v2, v0, Lm90;->i:Landroid/widget/Button;

    .line 1034
    .line 1035
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1036
    .line 1037
    .line 1038
    iget-object v2, v0, Lm90;->j:Landroid/widget/EditText;

    .line 1039
    .line 1040
    if-eqz v2, :cond_8

    .line 1041
    .line 1042
    new-instance v3, Lm90$b;

    .line 1043
    .line 1044
    invoke-direct {v3, v0}, Lm90$b;-><init>(Lm90;)V

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1048
    .line 1049
    .line 1050
    :cond_8
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v1

    .line 1057
    if-eqz v1, :cond_9

    .line 1058
    .line 1059
    const/4 v10, -0x1

    .line 1060
    invoke-virtual {v1, v10, v10}, Landroid/view/Window;->setLayout(II)V

    .line 1061
    .line 1062
    .line 1063
    :cond_9
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    if-eqz v1, :cond_a

    .line 1068
    .line 1069
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 1070
    .line 1071
    invoke-direct {v0}, Lm90;->r()I

    .line 1072
    .line 1073
    .line 1074
    move-result v0

    .line 1075
    invoke-direct {v2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1079
    .line 1080
    .line 1081
    :cond_a
    return-void
.end method

.method private static final j(Landroid/widget/Button;Lm90;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "clipboard"

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    check-cast p2, Landroid/content/ClipboardManager;

    .line 15
    .line 16
    const-string v0, "xhs_id"

    .line 17
    .line 18
    iget-object p1, p1, Lm90;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p2, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string p1, "\u5df2\u590d\u5236"

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private static final k(Lm90;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm90;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final l()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lm90;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    iget-boolean v0, p0, Lm90;->e:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lm90;->j:Landroid/widget/EditText;

    .line 12
    .line 13
    if-eqz v0, :cond_8

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_8

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_8

    .line 26
    .line 27
    invoke-static {v0}, Lk41;->g0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget-object v1, p0, Lm90;->j:Landroid/widget/EditText;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v4, "input_method"

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    instance-of v4, v3, Landroid/view/inputmethod/InputMethodManager;

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const/4 v3, 0x0

    .line 68
    :goto_0
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v3, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 75
    .line 76
    .line 77
    :cond_4
    const/4 v1, 0x1

    .line 78
    iput-boolean v1, p0, Lm90;->h:Z

    .line 79
    .line 80
    iget-object v1, p0, Lm90;->k:Landroid/widget/TextView;

    .line 81
    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    const-string v3, "\u6b63\u5728\u9a8c\u8bc1..."

    .line 85
    .line 86
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    const/16 v3, 0xff

    .line 90
    .line 91
    const/16 v4, 0xc8

    .line 92
    .line 93
    invoke-static {v4, v3, v4, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    :cond_5
    iget-object v1, p0, Lm90;->l:Landroid/widget/ProgressBar;

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    :cond_6
    iget-object v1, p0, Lm90;->i:Landroid/widget/Button;

    .line 111
    .line 112
    if-eqz v1, :cond_7

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 115
    .line 116
    .line 117
    :cond_7
    new-instance v1, Ljava/lang/Thread;

    .line 118
    .line 119
    new-instance v2, Lt4;

    .line 120
    .line 121
    const/4 v3, 0x7

    .line 122
    invoke-direct {v2, v3, p0, v0}, Lt4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 129
    .line 130
    .line 131
    :cond_8
    :goto_1
    return-void
.end method

.method private static final m(Lm90;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Ln90;->a:Ln90;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lm90;->d:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1, v2}, Ln90;->O(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ln90$a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lm90;->g:Landroid/os/Handler;

    .line 17
    .line 18
    new-instance v1, Lt4;

    .line 19
    .line 20
    const/4 v2, 0x6

    .line 21
    invoke-direct {v1, v2, p0, p1}, Lt4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private static final n(Lm90;Ln90$a;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm90;->h:Z

    .line 3
    .line 4
    iget-object v1, p0, Lm90;->l:Landroid/widget/ProgressBar;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/16 v2, 0x8

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Ln90$a;->e()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Lm90;->k:Landroid/widget/TextView;

    .line 18
    .line 19
    const/16 v3, 0xdc

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const-string p1, "\u2705 \u6388\u6743\u6210\u529f\uff0c\u6a21\u5757\u5df2\u542f\u7528"

    .line 26
    .line 27
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    const/16 p1, 0xc8

    .line 31
    .line 32
    const/16 v1, 0x64

    .line 33
    .line 34
    invoke-static {v3, v0, p1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object p1, p0, Lm90;->g:Landroid/os/Handler;

    .line 42
    .line 43
    new-instance v0, Lx3;

    .line 44
    .line 45
    const/4 v1, 0x5

    .line 46
    invoke-direct {v0, v1, p0}, Lx3;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const-wide/16 v1, 0x320

    .line 50
    .line 51
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    if-eqz v2, :cond_7

    .line 56
    .line 57
    invoke-virtual {p1}, Ln90$a;->f()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "invalid_key_format"

    .line 62
    .line 63
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    const-string p1, "\u274c \u6388\u6743\u7801\u65e0\u6548\uff0c\u8bf7\u786e\u5b9a\u683c\u5f0f\u6b63\u786e\u6216\u6709\u6548"

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-virtual {p1}, Ln90$a;->f()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "network_error"

    .line 77
    .line 78
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    const-string p1, "\u274c \u7f51\u7edc\u8fde\u63a5\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u540e\u91cd\u8bd5"

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    invoke-virtual {p1}, Ln90$a;->f()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-string v1, "empty_response"

    .line 92
    .line 93
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    const-string p1, "\u274c \u670d\u52a1\u5668\u65e0\u54cd\u5e94\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    invoke-virtual {p1}, Ln90$a;->f()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-nez p1, :cond_6

    .line 107
    .line 108
    const-string p1, "\u672a\u77e5\u9519\u8bef"

    .line 109
    .line 110
    :cond_6
    const-string v0, "\u274c \u9a8c\u8bc1\u5931\u8d25\uff1a"

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :goto_0
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    const/16 p1, 0xff

    .line 120
    .line 121
    const/16 v0, 0x50

    .line 122
    .line 123
    invoke-static {v3, p1, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 128
    .line 129
    .line 130
    :cond_7
    invoke-direct {p0}, Lm90;->F()V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method private static final o(Lm90;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lm90;->f:Lhw;

    .line 5
    .line 6
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    return-void
.end method

.method private final p(I)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 15
    .line 16
    mul-float/2addr p1, p0

    .line 17
    float-to-int p0, p1

    .line 18
    return p0
.end method

.method private final q()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 14
    .line 15
    and-int/lit8 p0, p0, 0x30

    .line 16
    .line 17
    const/16 v0, 0x20

    .line 18
    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method private final r()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0xff

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0x19

    .line 10
    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    :goto_0
    invoke-static {v0, v1, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const/16 p0, 0xfa

    .line 19
    .line 20
    const/16 v1, 0xf5

    .line 21
    .line 22
    goto :goto_0
.end method

.method private final s()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x78

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {v0, p0, p0, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    goto :goto_0
.end method

.method private final t()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x28

    .line 8
    .line 9
    const/16 v0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/16 p0, 0x1e

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    goto :goto_0
.end method

.method private final u()I
    .locals 4

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x55

    .line 6
    .line 7
    const/16 v1, 0x2c

    .line 8
    .line 9
    const/16 v2, 0xfe

    .line 10
    .line 11
    const/16 v3, 0x3c

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {v3, v2, v1, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-static {v3, v2, v1, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method private final v()I
    .locals 4

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x55

    .line 6
    .line 7
    const/16 v1, 0x2c

    .line 8
    .line 9
    const/16 v2, 0xfe

    .line 10
    .line 11
    const/16 v3, 0x64

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {v3, v2, v1, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-static {v3, v2, v1, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method private final w()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x3c

    .line 8
    .line 9
    const/16 v0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/16 p0, 0xa

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    goto :goto_0
.end method

.method private final x()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x64

    .line 8
    .line 9
    const/16 v0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/16 p0, 0x32

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    goto :goto_0
.end method

.method private final y()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x78

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {v0, p0, p0, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    goto :goto_0
.end method

.method private final z()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lm90;->q()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x96

    .line 8
    .line 9
    const/16 v0, 0xff

    .line 10
    .line 11
    :goto_0
    invoke-static {p0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/16 p0, 0x8c

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    goto :goto_0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .line 1
    return-void
.end method
