.class public final Li/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public b:Li/f1;

.field public c:I


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Li/y;->c:I

    .line 6
    .line 7
    iput-object p1, p0, Li/y;->a:Landroid/widget/ImageView;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Li/y;->a:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {v1}, Li/p0;->a(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, Li/y;->b:Li/f1;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v1, v2, v0}, Li/u;->d(Landroid/graphics/drawable/Drawable;Li/f1;[I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final b(Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Li/y;->a:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Ld/a;->f:[I

    .line 8
    .line 9
    invoke-static {v1, p1, v2, p2}, LC/h;->t(Landroid/content/Context;Landroid/util/AttributeSet;[II)LC/h;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v3, v6, LC/h;->c:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v4, v3

    .line 20
    check-cast v4, Landroid/content/res/TypedArray;

    .line 21
    .line 22
    move-object v3, p1

    .line 23
    move v5, p2

    .line 24
    invoke-static/range {v0 .. v5}, Ly/L;->h(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    const/4 p2, -0x1

    .line 32
    iget-object v1, v6, LC/h;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Landroid/content/res/TypedArray;

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    :try_start_1
    invoke-virtual {v1, v2, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eq v2, p2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1, v2}, Lb1/h;->y(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p1, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    .line 63
    .line 64
    invoke-static {p1}, Li/p0;->a(Landroid/graphics/drawable/Drawable;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    const/4 p1, 0x2

    .line 68
    invoke-virtual {v1, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    invoke-virtual {v6, p1}, LC/h;->l(I)Landroid/content/res/ColorStateList;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {v0, p1}, LD/i;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    const/4 p1, 0x3

    .line 82
    invoke-virtual {v1, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    invoke-virtual {v1, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    const/4 p2, 0x0

    .line 93
    invoke-static {p1, p2}, Li/p0;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {v0, p1}, LD/i;->d(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {v6}, LC/h;->v()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :goto_1
    invoke-virtual {v6}, LC/h;->v()V

    .line 105
    .line 106
    .line 107
    throw p1
.end method
