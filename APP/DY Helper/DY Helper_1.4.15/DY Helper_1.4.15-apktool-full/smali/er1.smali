.class public final Ler1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic α:Landroidx/appcompat/widget/SearchView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ler1;->α:Landroidx/appcompat/widget/SearchView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-object p0, p0, Ler1;->α:Landroidx/appcompat/widget/SearchView;

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 4
    .line 5
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->Δ:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const/4 p4, 0x1

    .line 12
    if-le p3, p4, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    iget-object p5, p0, Landroidx/appcompat/widget/SearchView;->χ:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p5}, Landroid/view/View;->getPaddingLeft()I

    .line 25
    .line 26
    .line 27
    move-result p5

    .line 28
    new-instance p6, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {p6}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 34
    .line 35
    .line 36
    move-result p7

    .line 37
    const/4 p8, 0x0

    .line 38
    if-ne p7, p4, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move p4, p8

    .line 42
    :goto_0
    iget-boolean p0, p0, Landroidx/appcompat/widget/SearchView;->Τ:Z

    .line 43
    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    const p0, 0x7f070029

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    const p7, 0x7f07002a

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, p7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    add-int p8, p3, p0

    .line 61
    .line 62
    :cond_1
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0, p6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 67
    .line 68
    .line 69
    iget p0, p6, Landroid/graphics/Rect;->left:I

    .line 70
    .line 71
    if-eqz p4, :cond_2

    .line 72
    .line 73
    neg-int p0, p0

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    add-int/2addr p0, p8

    .line 76
    sub-int p0, p5, p0

    .line 77
    .line 78
    :goto_1
    invoke-virtual {p1, p0}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    iget p2, p6, Landroid/graphics/Rect;->left:I

    .line 86
    .line 87
    add-int/2addr p0, p2

    .line 88
    iget p2, p6, Landroid/graphics/Rect;->right:I

    .line 89
    .line 90
    add-int/2addr p0, p2

    .line 91
    add-int/2addr p0, p8

    .line 92
    sub-int/2addr p0, p5

    .line 93
    invoke-virtual {p1, p0}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    .line 94
    .line 95
    .line 96
    :cond_3
    return-void
.end method
