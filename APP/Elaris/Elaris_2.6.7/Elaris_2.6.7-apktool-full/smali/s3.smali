.class public final Ls3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final synthetic a:Landroid/widget/LinearLayout;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls3;->a:Landroid/widget/LinearLayout;

    .line 5
    .line 6
    iput p2, p0, Ls3;->b:I

    .line 7
    .line 8
    iput p3, p0, Ls3;->c:I

    .line 9
    .line 10
    iput p4, p0, Ls3;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    .line 1
    invoke-static {}, Landroid/view/WindowInsets$Type;->systemBars()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {}, Landroid/view/WindowInsets$Type;->displayCutout()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    or-int/2addr p1, v0

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget v0, p1, Landroid/graphics/Insets;->left:I

    .line 15
    .line 16
    iget v1, p0, Ls3;->b:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    iget v2, p0, Ls3;->c:I

    .line 20
    .line 21
    iget v3, p1, Landroid/graphics/Insets;->top:I

    .line 22
    .line 23
    add-int/2addr v2, v3

    .line 24
    iget v3, p1, Landroid/graphics/Insets;->right:I

    .line 25
    .line 26
    add-int/2addr v1, v3

    .line 27
    iget v3, p0, Ls3;->d:I

    .line 28
    .line 29
    iget p1, p1, Landroid/graphics/Insets;->bottom:I

    .line 30
    .line 31
    add-int/2addr v3, p1

    .line 32
    iget-object p0, p0, Ls3;->a:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    invoke-virtual {p0, v0, v2, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method
