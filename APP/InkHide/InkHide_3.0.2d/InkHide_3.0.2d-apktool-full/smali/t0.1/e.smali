.class public final Lt0/e;
.super Lt0/c;
.source "SourceFile"


# instance fields
.field public final h:Landroid/widget/LinearLayout;

.field public i:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getContext(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p0, v0, v1}, Lt0/c;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lt0/e;->h:Landroid/widget/LinearLayout;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final e(Lt0/c;)Landroid/view/View;
    .locals 5

    .line 1
    const/high16 v0, 0x33000000

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm0/h;

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    invoke-direct {v0, v1, p0}, Lm0/h;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lt0/d;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getContext(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {p1, v0, v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 39
    .line 40
    const/4 v1, -0x1

    .line 41
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    .line 46
    .line 47
    const/16 v0, 0x20

    .line 48
    .line 49
    invoke-static {v0}, LB0/a;->b(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/16 v3, 0x38

    .line 54
    .line 55
    invoke-static {v3}, LB0/a;->b(I)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-static {v0}, LB0/a;->b(I)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {v3}, LB0/a;->b(I)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {p1, v2, v4, v0, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 71
    .line 72
    const/16 v2, 0x11

    .line 73
    .line 74
    invoke-direct {v0, v1, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lt0/e;->h:Landroid/widget/LinearLayout;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    return-object p1
.end method

.method public final getNeedScrollChild()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/e;->i:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->v()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final setNeedScrollChild(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt0/e;->i:Landroid/view/View;

    .line 2
    .line 3
    return-void
.end method
