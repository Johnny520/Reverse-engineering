.class public final synthetic Loa0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final synthetic α:Landroid/widget/FrameLayout$LayoutParams;

.field public final synthetic β:Landroid/app/Activity;

.field public final synthetic γ:Landroid/widget/TextView;

.field public final synthetic δ:Landroid/widget/FrameLayout$LayoutParams;

.field public final synthetic ε:Landroid/widget/LinearLayout;

.field public final synthetic ζ:Landroid/widget/FrameLayout$LayoutParams;

.field public final synthetic η:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout$LayoutParams;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/FrameLayout$LayoutParams;Landroid/widget/LinearLayout;Landroid/widget/FrameLayout$LayoutParams;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loa0;->α:Landroid/widget/FrameLayout$LayoutParams;

    .line 5
    .line 6
    iput-object p2, p0, Loa0;->β:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Loa0;->γ:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p4, p0, Loa0;->δ:Landroid/widget/FrameLayout$LayoutParams;

    .line 11
    .line 12
    iput-object p5, p0, Loa0;->ε:Landroid/widget/LinearLayout;

    .line 13
    .line 14
    iput-object p6, p0, Loa0;->ζ:Landroid/widget/FrameLayout$LayoutParams;

    .line 15
    .line 16
    iput-object p7, p0, Loa0;->η:Landroid/widget/LinearLayout;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p2}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Loa0;->β:Landroid/app/Activity;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 26
    .line 27
    const/high16 v3, 0x41800000    # 16.0f

    .line 28
    .line 29
    mul-float/2addr v3, v2

    .line 30
    const/high16 v2, 0x3f000000    # 0.5f

    .line 31
    .line 32
    add-float/2addr v3, v2

    .line 33
    float-to-int v3, v3

    .line 34
    add-int/2addr v3, p1

    .line 35
    iget-object p1, p0, Loa0;->α:Landroid/widget/FrameLayout$LayoutParams;

    .line 36
    .line 37
    iput v3, p1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 38
    .line 39
    iget-object v3, p0, Loa0;->γ:Landroid/widget/TextView;

    .line 40
    .line 41
    invoke-virtual {v3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 53
    .line 54
    const/high16 v3, 0x42b00000    # 88.0f

    .line 55
    .line 56
    mul-float/2addr v3, p1

    .line 57
    add-float/2addr v3, v2

    .line 58
    float-to-int p1, v3

    .line 59
    add-int/2addr p1, v0

    .line 60
    iget-object v3, p0, Loa0;->δ:Landroid/widget/FrameLayout$LayoutParams;

    .line 61
    .line 62
    iput p1, v3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 63
    .line 64
    iget-object p1, p0, Loa0;->ε:Landroid/widget/LinearLayout;

    .line 65
    .line 66
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 78
    .line 79
    const/high16 v1, 0x41e00000    # 28.0f

    .line 80
    .line 81
    mul-float/2addr v1, p1

    .line 82
    add-float/2addr v1, v2

    .line 83
    float-to-int p1, v1

    .line 84
    add-int/2addr p1, v0

    .line 85
    iget-object v0, p0, Loa0;->ζ:Landroid/widget/FrameLayout$LayoutParams;

    .line 86
    .line 87
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 88
    .line 89
    iget-object p0, p0, Loa0;->η:Landroid/widget/LinearLayout;

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    .line 93
    .line 94
    return-object p2
.end method
