.class public final Lv0/d;
.super Le/w;
.source "SourceFile"


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ly0/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    const/4 p4, 0x0

    .line 2
    invoke-direct {p0, p1, p4}, Le/w;-><init>(Landroid/content/Context;I)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lv0/d;->g:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lv0/d;->f:Ljava/lang/String;

    .line 8
    .line 9
    new-instance p2, Ly0/d;

    .line 10
    .line 11
    invoke-direct {p2, p1}, Ly0/d;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lv0/d;->h:Ly0/d;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Le/w;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lv0/d;->f:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Le/w;->setTitle(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    new-instance p1, LC/j;

    .line 18
    .line 19
    const/16 v0, 0x16

    .line 20
    .line 21
    invoke-direct {p1, v0, p0}, LC/j;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lv0/d;->g:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p0, Lv0/d;->h:Ly0/d;

    .line 27
    .line 28
    invoke-virtual {v1, v0, p1}, Ly0/d;->a(Ljava/lang/String;Ly0/e;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Landroid/widget/FrameLayout;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 41
    .line 42
    const/4 v2, -0x1

    .line 43
    invoke-direct {v0, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v1, Ly0/d;->b:Landroid/webkit/WebView;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eq v1, v2, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p1, v0, v2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-virtual {p0, p1}, Le/w;->setContentView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 77
    .line 78
    int-to-float p1, p1

    .line 79
    const v0, 0x3f19999a    # 0.6f

    .line 80
    .line 81
    .line 82
    mul-float/2addr p1, v0

    .line 83
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    float-to-int p1, p1

    .line 90
    invoke-virtual {v0, v2, p1}, Landroid/view/Window;->setLayout(II)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void
.end method
