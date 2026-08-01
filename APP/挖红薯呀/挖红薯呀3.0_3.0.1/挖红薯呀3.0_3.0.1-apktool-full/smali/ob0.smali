.class public final Lob0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lob0$a;
    }
.end annotation


# static fields
.field public static final a:Lob0;

.field private static final b:Lu60;

.field private static final c:Lu60;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lob0;

    .line 2
    .line 3
    invoke-direct {v0}, Lob0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lob0;->a:Lob0;

    .line 7
    .line 8
    new-instance v0, La00;

    .line 9
    .line 10
    const/16 v1, 0x1c

    .line 11
    .line 12
    invoke-direct {v0, v1}, La00;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lx51;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lob0;->b:Lu60;

    .line 21
    .line 22
    new-instance v0, La00;

    .line 23
    .line 24
    const/16 v1, 0x1b

    .line 25
    .line 26
    invoke-direct {v0, v1}, La00;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lx51;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 32
    .line 33
    .line 34
    sput-object v1, Lob0;->c:Lu60;

    .line 35
    .line 36
    const/16 v0, 0x8

    .line 37
    .line 38
    sput v0, Lob0;->d:I

    .line 39
    .line 40
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final A(ILkp;Landroid/content/Context;II)Lna1;
    .locals 1

    .line 1
    sget-object p4, Llp;->a:Llp;

    .line 2
    .line 3
    invoke-virtual {p4}, Llp;->d()Z

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    if-lt p3, p0, :cond_0

    .line 8
    .line 9
    sget-object p3, Lob0;->a:Lob0;

    .line 10
    .line 11
    invoke-direct {p3}, Lob0;->P()Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    new-instance v0, Len;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2, p0}, Len;-><init>(Lkp;Landroid/content/Context;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    if-eqz p4, :cond_1

    .line 24
    .line 25
    sget-object p0, Lob0;->a:Lob0;

    .line 26
    .line 27
    invoke-direct {p0}, Lob0;->P()Landroid/os/Handler;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance p1, Lnb0;

    .line 32
    .line 33
    const/4 p3, 0x0

    .line 34
    invoke-direct {p1, p2, p3}, Lnb0;-><init>(Landroid/content/Context;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    :cond_1
    sget-object p0, Lna1;->a:Lna1;

    .line 41
    .line 42
    return-object p0
.end method

.method private static final B(Lkp;Landroid/content/Context;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkp;->dismiss()V

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v0, "\u5df2\u4fdd\u5b58 "

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p2, " \u5f20\u5230\u7ea2\u85af\u4ed3"

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-static {p1, p0, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private static final C(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "\u5df2\u53d6\u6d88\u4e0b\u8f7d"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final D(ILandroid/content/Context;II)Lna1;
    .locals 1

    .line 1
    if-lt p2, p0, :cond_0

    .line 2
    .line 3
    sget-object p2, Lob0;->a:Lob0;

    .line 4
    .line 5
    invoke-direct {p2}, Lob0;->P()Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance p3, Lxy;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p3, p0, v0, p1}, Lxy;-><init>(IILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final E(Landroid/content/Context;I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\u5df2\u4fdd\u5b58 "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p1, " \u5f20\u5230\u7ea2\u85af\u4ed3"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final F(Landroid/content/Context;FLandroid/app/Dialog;Lob0$a;)Landroid/widget/LinearLayout;
    .locals 6

    .line 1
    new-instance v5, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v5, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/high16 v0, 0x41800000    # 16.0f

    .line 11
    .line 12
    mul-float/2addr v0, p2

    .line 13
    float-to-int v0, v0

    .line 14
    const/high16 v1, 0x41400000    # 12.0f

    .line 15
    .line 16
    mul-float/2addr v1, p2

    .line 17
    float-to-int v1, v1

    .line 18
    invoke-virtual {v5, v0, v1, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 19
    .line 20
    .line 21
    const/high16 v0, 0x41000000    # 8.0f

    .line 22
    .line 23
    mul-float/2addr v0, p2

    .line 24
    float-to-int v0, v0

    .line 25
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 26
    .line 27
    const/4 v3, -0x1

    .line 28
    const/4 v4, -0x2

    .line 29
    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v1, v0, v1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lob0;->a:Lob0;

    .line 39
    .line 40
    invoke-direct {v0, p2, p4}, Lob0;->G(FLob0$a;)Landroid/graphics/drawable/GradientDrawable;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v5, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    const/high16 v1, 0x40800000    # 4.0f

    .line 48
    .line 49
    mul-float/2addr v1, p2

    .line 50
    invoke-virtual {v5, v1}, Landroid/view/View;->setElevation(F)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v0}, Lob0;->Q()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v5, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Lzy;->a:Lzy;

    .line 61
    .line 62
    invoke-virtual {v0}, Lzy;->p()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    move-object v0, p0

    .line 69
    move-object v1, p1

    .line 70
    move v2, p2

    .line 71
    move-object v3, p3

    .line 72
    move-object v4, p4

    .line 73
    invoke-direct/range {v0 .. v5}, Lob0;->J(Landroid/content/Context;FLandroid/app/Dialog;Lob0$a;Landroid/widget/LinearLayout;)V

    .line 74
    .line 75
    .line 76
    return-object v5

    .line 77
    :cond_0
    move-object v0, p0

    .line 78
    move-object v1, p1

    .line 79
    move v2, p2

    .line 80
    move-object v3, p3

    .line 81
    move-object v4, p4

    .line 82
    invoke-direct/range {v0 .. v5}, Lob0;->v(Landroid/content/Context;FLandroid/app/Dialog;Lob0$a;Landroid/widget/LinearLayout;)V

    .line 83
    .line 84
    .line 85
    return-object v5
.end method

.method private final G(FLob0$a;)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    const/high16 p0, 0x41c00000    # 24.0f

    .line 2
    .line 3
    mul-float/2addr p0, p1

    .line 4
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lob0$a;->a()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 21
    .line 22
    .line 23
    const/high16 p0, 0x3f800000    # 1.0f

    .line 24
    .line 25
    mul-float/2addr p0, p1

    .line 26
    float-to-int p0, p0

    .line 27
    const/4 p1, 0x1

    .line 28
    if-ge p0, p1, :cond_0

    .line 29
    .line 30
    move p0, p1

    .line 31
    :cond_0
    invoke-virtual {p2}, Lob0$a;->b()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {v0, p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method private final H(Landroid/content/Context;FLob0$a;)Landroid/view/View;
    .locals 2

    .line 1
    new-instance p0, Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    mul-float/2addr v0, p2

    .line 11
    float-to-int v0, v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    :cond_0
    const/4 v1, -0x1

    .line 17
    invoke-direct {p1, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 18
    .line 19
    .line 20
    const/high16 v0, 0x41000000    # 8.0f

    .line 21
    .line 22
    mul-float/2addr v0, p2

    .line 23
    float-to-int v0, v0

    .line 24
    const/high16 v1, 0x40c00000    # 6.0f

    .line 25
    .line 26
    mul-float/2addr v1, p2

    .line 27
    float-to-int p2, v1

    .line 28
    invoke-virtual {p1, v0, p2, v0, p2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Lob0$a;->c()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 39
    .line 40
    .line 41
    return-object p0
.end method

.method private final I(Landroid/content/Context;FLob0$a;)Landroid/widget/TextView;
    .locals 3

    .line 1
    new-instance p0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "\u2699 \u6a21\u5757\u8bbe\u7f6e"

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    const/high16 p1, 0x41800000    # 16.0f

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3}, Lob0$a;->e()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    .line 22
    .line 23
    const/16 p1, 0x11

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 26
    .line 27
    .line 28
    const/high16 p1, 0x41400000    # 12.0f

    .line 29
    .line 30
    mul-float/2addr p1, p2

    .line 31
    float-to-int p1, p1

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p0, v0, p1, v0, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 34
    .line 35
    .line 36
    const/high16 p1, 0x42400000    # 48.0f

    .line 37
    .line 38
    mul-float/2addr p1, p2

    .line 39
    float-to-int p1, p1

    .line 40
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 44
    .line 45
    const/4 v1, -0x2

    .line 46
    const/high16 v2, 0x3f800000    # 1.0f

    .line 47
    .line 48
    invoke-direct {p1, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 49
    .line 50
    .line 51
    const/high16 v1, 0x40800000    # 4.0f

    .line 52
    .line 53
    mul-float/2addr v1, p2

    .line 54
    float-to-int v1, v1

    .line 55
    invoke-virtual {p1, v0, v1, v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 62
    .line 63
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 67
    .line 68
    .line 69
    const/high16 v0, 0x41600000    # 14.0f

    .line 70
    .line 71
    mul-float/2addr v0, p2

    .line 72
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 73
    .line 74
    .line 75
    mul-float/2addr v2, p2

    .line 76
    float-to-int p2, v2

    .line 77
    const/4 v0, 0x1

    .line 78
    if-ge p2, v0, :cond_0

    .line 79
    .line 80
    move p2, v0

    .line 81
    :cond_0
    invoke-virtual {p3}, Lob0$a;->b()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {p1, p2, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Lob0$a;->d()I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 102
    .line 103
    .line 104
    return-object p0
.end method

.method private final J(Landroid/content/Context;FLandroid/app/Dialog;Lob0$a;Landroid/widget/LinearLayout;)V
    .locals 6

    .line 1
    sget-object p4, Lzy;->a:Lzy;

    .line 2
    .line 3
    invoke-virtual {p4}, Lzy;->q()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p4

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p4, :cond_0

    .line 9
    .line 10
    const/4 p4, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move p4, v0

    .line 13
    :goto_0
    if-eqz p4, :cond_1

    .line 14
    .line 15
    const-string v1, "\u25b6 \u4e0b\u8f7d\u89c6\u9891"

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const-string v1, "\u25b6 \u89c6\u9891\u52a0\u8f7d\u4e2d..."

    .line 19
    .line 20
    :goto_1
    new-instance v2, Landroid/widget/LinearLayout;

    .line 21
    .line 22
    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 29
    .line 30
    const/4 v3, -0x2

    .line 31
    const/4 v4, -0x1

    .line 32
    invoke-direct {v0, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "\u2699 \u6a21\u5757\u8bbe\u7f6e"

    .line 39
    .line 40
    invoke-direct {p0, p1, p2, v0}, Lob0;->u(Landroid/content/Context;FLjava/lang/String;)Landroid/widget/TextView;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v3, Lhg;

    .line 45
    .line 46
    const/4 v5, 0x2

    .line 47
    invoke-direct {v3, p1, v5, p3}, Lhg;-><init>(Landroid/content/Context;ILandroid/app/Dialog;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Landroid/view/View;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 62
    .line 63
    const/high16 v5, 0x41000000    # 8.0f

    .line 64
    .line 65
    mul-float/2addr v5, p2

    .line 66
    float-to-int v5, v5

    .line 67
    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {p0, p1, p2, v1}, Lob0;->u(Landroid/content/Context;FLjava/lang/String;)Landroid/widget/TextView;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance p2, Lhg;

    .line 81
    .line 82
    const/4 v0, 0x3

    .line 83
    invoke-direct {p2, p1, v0, p3}, Lhg;-><init>(Landroid/content/Context;ILandroid/app/Dialog;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p4}, Landroid/view/View;->setClickable(Z)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p4}, Landroid/view/View;->setFocusable(Z)V

    .line 93
    .line 94
    .line 95
    if-nez p4, :cond_2

    .line 96
    .line 97
    const/high16 p1, 0x3f000000    # 0.5f

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-virtual {v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method private static final K(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    :try_start_0
    sget-object p2, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    invoke-virtual {p2, p0}, Lm00$a;->l0(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :try_start_1
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 7
    .line 8
    .line 9
    :catch_1
    return-void
.end method

.method private static final L(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object p2, Lzy;->a:Lzy;

    .line 2
    .line 3
    invoke-virtual {p2}, Lzy;->q()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v1, Lhp;->a:Lhp;

    .line 10
    .line 11
    invoke-virtual {p2}, Lzy;->k()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p2}, Lzy;->l()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {v1, p0, v0, v2, p2}, Lhp;->P(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    :catch_0
    return-void
.end method

.method private final M(Landroid/content/Context;)Lob0$a;
    .locals 14

    .line 1
    const-string p0, "uimode"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/app/UiModeManager;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/UiModeManager;->getNightMode()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 p1, 0x2

    .line 17
    const/16 v0, 0x28

    .line 18
    .line 19
    const/16 v1, 0x50

    .line 20
    .line 21
    const/16 v2, 0x26

    .line 22
    .line 23
    const/16 v3, 0xe6

    .line 24
    .line 25
    const/16 v4, 0x1e

    .line 26
    .line 27
    const/16 v5, 0xff

    .line 28
    .line 29
    if-ne p0, p1, :cond_0

    .line 30
    .line 31
    new-instance v6, Lob0$a;

    .line 32
    .line 33
    invoke-static {v3, v4, v4, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    invoke-static {v4, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    const/16 p0, 0x82

    .line 42
    .line 43
    const/16 p1, 0x78

    .line 44
    .line 45
    invoke-static {v1, p1, p1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    const/4 v11, -0x1

    .line 50
    invoke-static {v0, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    const/4 v7, -0x1

    .line 55
    invoke-direct/range {v6 .. v12}, Lob0$a;-><init>(IIIIII)V

    .line 56
    .line 57
    .line 58
    return-object v6

    .line 59
    :cond_0
    new-instance v7, Lob0$a;

    .line 60
    .line 61
    invoke-static {v5, v4, v4, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    invoke-static {v3, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    const/4 p0, 0x0

    .line 70
    invoke-static {v4, p0, p0, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const/16 p1, 0xbe

    .line 75
    .line 76
    const/16 v2, 0xb4

    .line 77
    .line 78
    invoke-static {v1, v2, v2, p1}, Landroid/graphics/Color;->argb(IIII)I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    const/16 p1, 0x46

    .line 83
    .line 84
    const/16 v1, 0x3c

    .line 85
    .line 86
    invoke-static {v5, v1, v1, p1}, Landroid/graphics/Color;->argb(IIII)I

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    invoke-static {v0, p0, p0, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    invoke-direct/range {v7 .. v13}, Lob0$a;-><init>(IIIIII)V

    .line 95
    .line 96
    .line 97
    return-object v7
.end method

.method private final N(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-direct {p0, v2}, Lob0;->W(Landroid/view/View;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    check-cast v2, Landroid/view/ViewGroup;

    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_1
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    check-cast v2, Landroid/view/ViewGroup;

    .line 29
    .line 30
    invoke-direct {p0, v2}, Lob0;->N(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method private final O(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Landroid/view/ViewGroup;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v1

    .line 14
    :goto_0
    if-eqz p1, :cond_4

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v2, p1, Landroid/widget/ScrollView;

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    const-string v2, "ScrollView"

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {v0, v2, v3}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    invoke-direct {p0, p1}, Lob0;->W(Landroid/view/View;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    const-string v2, "CoordinatorLayout"

    .line 44
    .line 45
    invoke-static {v0, v2, v3}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const-string v2, "LinearLayout"

    .line 53
    .line 54
    invoke-static {v0, v2, v3}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_2

    .line 59
    .line 60
    const-string v2, "RelativeLayout"

    .line 61
    .line 62
    invoke-static {v0, v2, v3}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    const-string v2, "FrameLayout"

    .line 69
    .line 70
    invoke-static {v0, v2, v3}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    const-string v2, "ConstraintLayout"

    .line 77
    .line 78
    invoke-static {v0, v2, v3}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_2

    .line 83
    .line 84
    const-string v2, "PanelView"

    .line 85
    .line 86
    invoke-static {v0, v2, v3}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_2

    .line 91
    .line 92
    const-string v2, "ContentFrameLayout"

    .line 93
    .line 94
    invoke-static {v0, v2, v3}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    :cond_2
    return-object p1

    .line 101
    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 106
    .line 107
    if-eqz v0, :cond_0

    .line 108
    .line 109
    check-cast p1, Landroid/view/ViewGroup;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    return-object v1
.end method

.method private final P()Landroid/os/Handler;
    .locals 0

    .line 1
    sget-object p0, Lob0;->c:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/os/Handler;

    .line 8
    .line 9
    return-object p0
.end method

.method private final Q()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lob0;->b:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final R()Landroid/os/Handler;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static final T(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    instance-of v2, v1, Landroid/content/Context;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    check-cast v1, Landroid/content/Context;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v1, v0

    .line 35
    :goto_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    sget-object v2, Lzy;->a:Lzy;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Lzy;->t(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v2, 0x3

    .line 51
    if-le v1, v2, :cond_3

    .line 52
    .line 53
    sget-object v1, Lec1;->a:Lec1;

    .line 54
    .line 55
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const/4 v4, 0x4

    .line 63
    invoke-static {v4, v3}, Lye;->L(ILjava/util/List;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-nez v3, :cond_2

    .line 68
    .line 69
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v3}, Lye;->L(ILjava/util/List;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    :cond_2
    invoke-virtual {v1, v3}, Lec1;->R(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    const/4 v2, 0x1

    .line 92
    if-le v1, v2, :cond_5

    .line 93
    .line 94
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    instance-of v2, v1, Ljava/util/List;

    .line 103
    .line 104
    if-eqz v2, :cond_4

    .line 105
    .line 106
    check-cast v1, Ljava/util/List;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    move-object v1, v0

    .line 110
    :goto_1
    if-eqz v1, :cond_5

    .line 111
    .line 112
    sget-object v2, Lec1;->a:Lec1;

    .line 113
    .line 114
    invoke-virtual {v2, v1}, Lec1;->Q(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    .line 117
    :catch_0
    :cond_5
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :try_start_1
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    instance-of v2, p0, Landroid/app/Dialog;

    .line 126
    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    move-object v0, p0

    .line 130
    check-cast v0, Landroid/app/Dialog;

    .line 131
    .line 132
    :cond_6
    if-nez v0, :cond_7

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    sget-object p0, Lzy;->a:Lzy;

    .line 136
    .line 137
    invoke-virtual {p0}, Lzy;->i()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-nez p0, :cond_8

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_8
    sget-object v2, Lob0;->a:Lob0;

    .line 145
    .line 146
    invoke-direct {v2, v0, p0}, Lob0;->X(Landroid/app/Dialog;Landroid/content/Context;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 147
    .line 148
    .line 149
    :catch_1
    :goto_2
    return-object v1
.end method

.method private final U(Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 7

    .line 1
    :try_start_0
    sget-object v0, Lzy;->a:Lzy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lzy;->w(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v3

    .line 20
    :goto_0
    instance-of v4, v2, Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    check-cast v2, Landroid/view/ViewGroup;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v3

    .line 28
    :goto_1
    if-nez v2, :cond_2

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    invoke-virtual {v0}, Lzy;->c()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    move v4, v5

    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move v4, v1

    .line 41
    :goto_2
    invoke-virtual {v0}, Lzy;->q()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    if-eqz v6, :cond_4

    .line 46
    .line 47
    move v1, v5

    .line 48
    :cond_4
    invoke-virtual {v0}, Lzy;->p()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v4, :cond_5

    .line 53
    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_5
    invoke-direct {p0}, Lob0;->Q()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_6
    invoke-direct {p0, v2}, Lob0;->N(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_7

    .line 75
    .line 76
    invoke-direct {p0, v0}, Lob0;->O(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    :cond_7
    if-eqz v3, :cond_8

    .line 81
    .line 82
    if-eqz v0, :cond_8

    .line 83
    .line 84
    invoke-direct {p0, v3, v0, p1, p2}, Lob0;->V(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/app/Dialog;Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_8
    invoke-direct {p0, v2, p1, p2}, Lob0;->q(Landroid/view/ViewGroup;Landroid/app/Dialog;Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    :catch_0
    :goto_3
    return-void
.end method

.method private final V(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0, p4}, Lob0;->M(Landroid/content/Context;)Lob0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 14
    .line 15
    invoke-direct {p0, p4, v1, p3, v0}, Lob0;->F(Landroid/content/Context;FLandroid/app/Dialog;Lob0$a;)Landroid/widget/LinearLayout;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-direct {p0}, Lob0;->Q()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p3, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ltz p0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, p3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    invoke-virtual {p1, p3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    :catch_0
    return-void
.end method

.method private final W(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string p1, "RecyclerView"

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, p1, v0}, Lk41;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method private final X(Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lob0;->P()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lt4;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-direct {v0, v1, p1, p2}, Lt4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 p1, 0xfa

    .line 13
    .line 14
    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final Y(Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lob0;->a:Lob0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lob0;->U(Landroid/app/Dialog;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lob0;->K(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lkp;Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lob0;->B(Lkp;Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroid/app/Dialog;Ljava/util/List;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lob0;->z(Landroid/app/Dialog;Ljava/util/List;Landroid/content/Context;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(ILandroid/content/Context;II)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lob0;->D(ILandroid/content/Context;II)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lob0;->y(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lob0;->x(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lob0;->Y(Landroid/app/Dialog;Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lob0;->p()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic i(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lob0;->L(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lob0;->E(Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lob0;->w(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l()Landroid/os/Handler;
    .locals 1

    .line 1
    invoke-static {}, Lob0;->R()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic m(ILkp;Landroid/content/Context;II)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lob0;->A(ILkp;Landroid/content/Context;II)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic n(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lob0;->C(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lob0;->T(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final p()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x33
        0x8
        0x41
        0x6e
        0x29
        0xc
        0x1e
        0x6e
        0x3f
        0x19
        0x17
    .end array-data
.end method

.method private final q(Landroid/view/ViewGroup;Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0, p3}, Lob0;->M(Landroid/content/Context;)Lob0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 14
    .line 15
    invoke-direct {p0, p3, v1, p2, v0}, Lob0;->F(Landroid/content/Context;FLandroid/app/Dialog;Lob0$a;)Landroid/widget/LinearLayout;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p2, Lob0;->a:Lob0;

    .line 20
    .line 21
    invoke-direct {p2}, Lob0;->Q()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 29
    .line 30
    const/4 v0, -0x1

    .line 31
    const/4 v2, -0x2

    .line 32
    invoke-direct {p2, v0, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x50

    .line 36
    .line 37
    iput v0, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 38
    .line 39
    const/high16 v0, 0x41800000    # 16.0f

    .line 40
    .line 41
    mul-float/2addr v0, v1

    .line 42
    float-to-int v0, v0

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-virtual {p2, v0, v2, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Landroid/widget/FrameLayout;

    .line 48
    .line 49
    invoke-direct {v0, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    const/high16 p3, 0x42600000    # 56.0f

    .line 53
    .line 54
    mul-float/2addr p3, v1

    .line 55
    float-to-int p3, p3

    .line 56
    invoke-virtual {v0, v2, v2, v2, p3}, Landroid/view/View;->setPadding(IIII)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    :catch_0
    return-void
.end method

.method private final r(Landroid/content/Context;FLjava/lang/String;)Landroid/widget/TextView;
    .locals 2

    .line 1
    new-instance p0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p1, 0x41600000    # 14.0f

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x28

    .line 15
    .line 16
    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 26
    .line 27
    .line 28
    const/16 p1, 0x11

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 31
    .line 32
    .line 33
    const/high16 p1, 0x41400000    # 12.0f

    .line 34
    .line 35
    mul-float/2addr p1, p2

    .line 36
    float-to-int p1, p1

    .line 37
    const/high16 p3, 0x41000000    # 8.0f

    .line 38
    .line 39
    mul-float/2addr p3, p2

    .line 40
    float-to-int p3, p3

    .line 41
    invoke-virtual {p0, p3, p1, p3, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 42
    .line 43
    .line 44
    const/high16 p1, 0x42400000    # 48.0f

    .line 45
    .line 46
    mul-float/2addr p1, p2

    .line 47
    float-to-int p1, p1

    .line 48
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 52
    .line 53
    const/4 p3, 0x0

    .line 54
    const/4 v0, -0x2

    .line 55
    const/high16 v1, 0x3f800000    # 1.0f

    .line 56
    .line 57
    invoke-direct {p1, p3, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 58
    .line 59
    .line 60
    const/high16 v0, 0x40800000    # 4.0f

    .line 61
    .line 62
    mul-float/2addr v0, p2

    .line 63
    float-to-int v0, v0

    .line 64
    invoke-virtual {p1, p3, v0, p3, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 68
    .line 69
    .line 70
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 71
    .line 72
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41200000    # 10.0f

    .line 79
    .line 80
    mul-float/2addr v0, p2

    .line 81
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 82
    .line 83
    .line 84
    const/4 v0, -0x1

    .line 85
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 86
    .line 87
    .line 88
    mul-float/2addr v1, p2

    .line 89
    float-to-int p2, v1

    .line 90
    const/4 v0, 0x1

    .line 91
    if-ge p2, v0, :cond_0

    .line 92
    .line 93
    move p2, v0

    .line 94
    :cond_0
    const/16 v1, 0x3c

    .line 95
    .line 96
    invoke-static {v1, p3, p3, p3}, Landroid/graphics/Color;->argb(IIII)I

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    invoke-virtual {p1, p2, p3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 110
    .line 111
    .line 112
    return-object p0
.end method

.method private final s(Landroid/content/Context;FLjava/lang/String;)Landroid/widget/TextView;
    .locals 2

    .line 1
    const/high16 p0, 0x41700000    # 15.0f

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    invoke-static {p1, p3, p0, v0}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 11
    .line 12
    .line 13
    const/16 p1, 0x11

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 16
    .line 17
    .line 18
    const/high16 p1, 0x41400000    # 12.0f

    .line 19
    .line 20
    mul-float/2addr p1, p2

    .line 21
    float-to-int p3, p1

    .line 22
    const/high16 v1, 0x41a00000    # 20.0f

    .line 23
    .line 24
    mul-float/2addr v1, p2

    .line 25
    float-to-int v1, v1

    .line 26
    invoke-virtual {p0, v1, p3, v1, p3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 27
    .line 28
    .line 29
    const/high16 p3, 0x42400000    # 48.0f

    .line 30
    .line 31
    mul-float/2addr p3, p2

    .line 32
    float-to-int p3, p3

    .line 33
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 34
    .line 35
    .line 36
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 37
    .line 38
    const/4 v1, -0x2

    .line 39
    invoke-direct {p3, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 40
    .line 41
    .line 42
    const/high16 v0, 0x40800000    # 4.0f

    .line 43
    .line 44
    mul-float/2addr v0, p2

    .line 45
    float-to-int p2, v0

    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-virtual {p3, v0, p2, v0, p2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    .line 52
    .line 53
    new-instance p2, Landroid/graphics/drawable/GradientDrawable;

    .line 54
    .line 55
    invoke-direct {p2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 62
    .line 63
    .line 64
    const/16 p1, 0x2c

    .line 65
    .line 66
    const/16 p3, 0x55

    .line 67
    .line 68
    const/16 v0, 0xdc

    .line 69
    .line 70
    const/16 v1, 0xfe

    .line 71
    .line 72
    invoke-static {v0, v1, p1, p3}, Landroid/graphics/Color;->argb(IIII)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 87
    .line 88
    .line 89
    return-object p0
.end method

.method private final t(Landroid/content/Context;FLjava/lang/String;)Landroid/widget/TextView;
    .locals 3

    .line 1
    new-instance p0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p1, 0x41700000    # 15.0f

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x28

    .line 15
    .line 16
    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 26
    .line 27
    .line 28
    const/16 p1, 0x11

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 31
    .line 32
    .line 33
    const/high16 p1, 0x41400000    # 12.0f

    .line 34
    .line 35
    mul-float/2addr p1, p2

    .line 36
    float-to-int p3, p1

    .line 37
    const/high16 v0, 0x41a00000    # 20.0f

    .line 38
    .line 39
    mul-float/2addr v0, p2

    .line 40
    float-to-int v0, v0

    .line 41
    invoke-virtual {p0, v0, p3, v0, p3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 42
    .line 43
    .line 44
    const/high16 p3, 0x42400000    # 48.0f

    .line 45
    .line 46
    mul-float/2addr p3, p2

    .line 47
    float-to-int p3, p3

    .line 48
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 49
    .line 50
    .line 51
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 52
    .line 53
    const/4 v0, -0x2

    .line 54
    const/4 v1, -0x1

    .line 55
    invoke-direct {p3, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 56
    .line 57
    .line 58
    const/high16 v0, 0x40800000    # 4.0f

    .line 59
    .line 60
    mul-float/2addr v0, p2

    .line 61
    float-to-int v0, v0

    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-virtual {p3, v2, v0, v2, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    .line 68
    .line 69
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    .line 70
    .line 71
    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 81
    .line 82
    .line 83
    const/high16 p1, 0x3f800000    # 1.0f

    .line 84
    .line 85
    mul-float/2addr p1, p2

    .line 86
    float-to-int p1, p1

    .line 87
    const/4 p2, 0x1

    .line 88
    if-ge p1, p2, :cond_0

    .line 89
    .line 90
    move p1, p2

    .line 91
    :cond_0
    const/16 v0, 0x3c

    .line 92
    .line 93
    invoke-static {v0, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p3, p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 107
    .line 108
    .line 109
    return-object p0
.end method

.method private final u(Landroid/content/Context;FLjava/lang/String;)Landroid/widget/TextView;
    .locals 3

    .line 1
    new-instance p0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p1, 0x41700000    # 15.0f

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x28

    .line 15
    .line 16
    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 26
    .line 27
    .line 28
    const/16 p1, 0x11

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 31
    .line 32
    .line 33
    const/high16 p1, 0x41400000    # 12.0f

    .line 34
    .line 35
    mul-float/2addr p1, p2

    .line 36
    float-to-int p3, p1

    .line 37
    const/high16 v0, 0x41200000    # 10.0f

    .line 38
    .line 39
    mul-float/2addr v0, p2

    .line 40
    float-to-int v0, v0

    .line 41
    invoke-virtual {p0, v0, p3, v0, p3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 42
    .line 43
    .line 44
    const/high16 p3, 0x42400000    # 48.0f

    .line 45
    .line 46
    mul-float/2addr p3, p2

    .line 47
    float-to-int p3, p3

    .line 48
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 49
    .line 50
    .line 51
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    const/4 v1, -0x2

    .line 55
    const/high16 v2, 0x3f800000    # 1.0f

    .line 56
    .line 57
    invoke-direct {p3, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 58
    .line 59
    .line 60
    const/high16 v1, 0x40800000    # 4.0f

    .line 61
    .line 62
    mul-float/2addr v1, p2

    .line 63
    float-to-int v1, v1

    .line 64
    invoke-virtual {p3, v0, v1, v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 68
    .line 69
    .line 70
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    .line 71
    .line 72
    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 79
    .line 80
    .line 81
    const/4 p1, -0x1

    .line 82
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 83
    .line 84
    .line 85
    mul-float/2addr v2, p2

    .line 86
    float-to-int p1, v2

    .line 87
    const/4 p2, 0x1

    .line 88
    if-ge p1, p2, :cond_0

    .line 89
    .line 90
    move p1, p2

    .line 91
    :cond_0
    const/16 v1, 0x3c

    .line 92
    .line 93
    invoke-static {v1, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p3, p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 107
    .line 108
    .line 109
    return-object p0
.end method

.method private final v(Landroid/content/Context;FLandroid/app/Dialog;Lob0$a;Landroid/widget/LinearLayout;)V
    .locals 10

    .line 1
    sget-object v0, Lzy;->a:Lzy;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzy;->c()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v2

    .line 13
    :goto_0
    invoke-virtual {v0}, Lzy;->e()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    const-string v3, " (\u4f5c\u8005\u9650\u5236)"

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const-string v3, ""

    .line 23
    .line 24
    :goto_1
    new-instance v4, Landroid/widget/LinearLayout;

    .line 25
    .line 26
    invoke-direct {v4, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 33
    .line 34
    const/4 v6, -0x1

    .line 35
    const/4 v7, -0x2

    .line 36
    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1, p2, p4}, Lob0;->I(Landroid/content/Context;FLob0$a;)Landroid/widget/TextView;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    new-instance v8, Lhg;

    .line 47
    .line 48
    const/4 v9, 0x4

    .line 49
    invoke-direct {v8, p1, v9, p3}, Lhg;-><init>(Landroid/content/Context;ILandroid/app/Dialog;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    new-instance v1, Landroid/view/View;

    .line 61
    .line 62
    invoke-direct {v1, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 66
    .line 67
    const/high16 v8, 0x41000000    # 8.0f

    .line 68
    .line 69
    mul-float/2addr v8, p2

    .line 70
    float-to-int v8, v8

    .line 71
    invoke-direct {v5, v8, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    const-string v1, "\u2193 \u4e0b\u8f7d\u5f53\u524d\u539f\u56fe"

    .line 81
    .line 82
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {p0, p1, p2, v1}, Lob0;->r(Landroid/content/Context;FLjava/lang/String;)Landroid/widget/TextView;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v3, Lhg;

    .line 91
    .line 92
    const/4 v5, 0x5

    .line 93
    invoke-direct {v3, p1, v5, p3}, Lhg;-><init>(Landroid/content/Context;ILandroid/app/Dialog;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-virtual {p5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    sget-object v1, Lsz;->a:Lsz;

    .line 106
    .line 107
    invoke-virtual {v1}, Lsz;->i()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0}, Lzy;->r()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_3

    .line 116
    .line 117
    invoke-virtual {v0}, Lzy;->j()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    invoke-direct {p0, p1, p2, p4}, Lob0;->H(Landroid/content/Context;FLob0$a;)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {p5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 128
    .line 129
    .line 130
    const-string v0, "\u2b21 \u4e0b\u8f7d\u5f53\u524d Live \u539f\u56fe"

    .line 131
    .line 132
    invoke-direct {p0, p1, p2, v0}, Lob0;->t(Landroid/content/Context;FLjava/lang/String;)Landroid/widget/TextView;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-instance v3, Lhg;

    .line 137
    .line 138
    const/4 v4, 0x6

    .line 139
    invoke-direct {v3, p1, v4, p3}, Lhg;-><init>(Landroid/content/Context;ILandroid/app/Dialog;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_4

    .line 153
    .line 154
    invoke-direct {p0, p1, p2, p4}, Lob0;->H(Landroid/content/Context;FLob0$a;)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object p4

    .line 158
    invoke-virtual {p5, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result p4

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v3, "\ud83d\udce5 \u4e00\u952e\u4e0b\u8f7d\u5168\u90e8\u539f\u56fe ("

    .line 168
    .line 169
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string p4, "\u5f20)"

    .line 176
    .line 177
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p4

    .line 184
    invoke-direct {p0, p1, p2, p4}, Lob0;->s(Landroid/content/Context;FLjava/lang/String;)Landroid/widget/TextView;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    new-instance p2, Lig;

    .line 189
    .line 190
    invoke-direct {p2, p3, v1, p1}, Lig;-><init>(Landroid/app/Dialog;Ljava/util/List;Landroid/content/Context;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    .line 195
    .line 196
    new-instance p2, Landroid/widget/LinearLayout;

    .line 197
    .line 198
    invoke-direct {p2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 202
    .line 203
    .line 204
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 205
    .line 206
    invoke-direct {p1, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 216
    .line 217
    .line 218
    :cond_4
    return-void
.end method

.method private static final w(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    :try_start_0
    sget-object p2, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    invoke-virtual {p2, p0}, Lm00$a;->l0(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :try_start_1
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 7
    .line 8
    .line 9
    :catch_1
    return-void
.end method

.method private static final x(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object p2, Lzy;->a:Lzy;

    .line 2
    .line 3
    invoke-virtual {p2}, Lzy;->c()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v1, Lhp;->a:Lhp;

    .line 10
    .line 11
    invoke-virtual {p2}, Lzy;->g()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-virtual {v1, p0, v0, p2}, Lhp;->C(Landroid/content/Context;Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :catch_0
    return-void
.end method

.method private static final y(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object p2, Lzy;->a:Lzy;

    .line 2
    .line 3
    invoke-virtual {p2}, Lzy;->c()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p2}, Lzy;->j()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v2, Lhp;->a:Lhp;

    .line 16
    .line 17
    invoke-virtual {p2}, Lzy;->g()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {v2, p0, v0, v1, p2}, Lhp;->F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :catch_0
    return-void
.end method

.method private static final z(Landroid/app/Dialog;Ljava/util/List;Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    :catch_0
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-static {p1}, Lze;->E(Ljava/lang/Iterable;)I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    invoke-direct {p0, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 p3, 0x0

    .line 18
    move v0, p3

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    add-int/lit8 v2, v0, 0x1

    .line 30
    .line 31
    if-ltz v0, :cond_0

    .line 32
    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v3, Luo0;

    .line 40
    .line 41
    invoke-direct {v3, v1, v0}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move v0, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {}, Lo30;->A()V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    throw p0

    .line 54
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, Llp;->a:Llp;

    .line 63
    .line 64
    invoke-virtual {v1, p2}, Llp;->f(Landroid/content/Context;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-virtual {v1}, Llp;->i()V

    .line 71
    .line 72
    .line 73
    new-instance p3, Lkp;

    .line 74
    .line 75
    const-string v1, "\u56fe\u7247 0/"

    .line 76
    .line 77
    invoke-static {v1, p1}, Lt1;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-direct {p3, p2, v1}, Lkp;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p3}, Lkp;->show()V

    .line 85
    .line 86
    .line 87
    sget-object v1, Lvz;->a:Lvz;

    .line 88
    .line 89
    new-instance v2, Ljh;

    .line 90
    .line 91
    invoke-direct {v2, p3, v0, p1}, Ljh;-><init>(Lkp;Landroid/content/Context;I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, p2, p0, v2}, Lvz;->i(Landroid/content/Context;Ljava/util/List;Lww;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v2, "\u5f00\u59cb\u4e0b\u8f7d "

    .line 101
    .line 102
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v2, " \u5f20\u539f\u56fe..."

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v0, v1, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-virtual {p3}, Landroid/widget/Toast;->show()V

    .line 122
    .line 123
    .line 124
    sget-object p3, Lvz;->a:Lvz;

    .line 125
    .line 126
    new-instance v1, Lq80;

    .line 127
    .line 128
    invoke-direct {v1, v0, p1}, Lq80;-><init>(Landroid/content/Context;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3, p2, p0, v1}, Lvz;->f(Landroid/content/Context;Ljava/util/List;Lww;)V

    .line 132
    .line 133
    .line 134
    :goto_1
    return-void
.end method


# virtual methods
.method public final S(Ljava/lang/ClassLoader;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lkl;->s([Ljava/lang/Object;)Lv;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lv;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Lv;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 26
    .line 27
    sget-object p2, Lkf1;->G:Lkf1$a;

    .line 28
    .line 29
    invoke-virtual {p2}, Lkf1$a;->b()Lkf1;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    new-instance p2, Lua;

    .line 42
    .line 43
    const/16 v0, 0x10

    .line 44
    .line 45
    invoke-direct {p2, v0}, Lua;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, p2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catch_0
    :cond_2
    :goto_1
    return-void
.end method
