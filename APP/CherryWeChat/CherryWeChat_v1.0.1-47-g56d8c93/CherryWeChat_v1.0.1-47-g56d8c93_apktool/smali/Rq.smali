.class public final LRq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lgt;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Landroid/view/View;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, LRq;->a:I

    iput-object p1, p0, LRq;->b:Landroid/view/View;

    iput p3, p0, LRq;->c:I

    iput p4, p0, LRq;->d:I

    iput p5, p0, LRq;->e:I

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;LLF;)LLF;
    .locals 4

    const/16 p1, 0x207

    iget-object v0, p2, LLF;->a:LHF;

    invoke-virtual {v0, p1}, LHF;->g(I)Lyl;

    move-result-object p1

    iget-object v0, p0, LRq;->b:Landroid/view/View;

    iget v1, p0, LRq;->a:I

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v3, p1, Lyl;->b:I

    add-int/2addr v1, v3

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    iget v1, p0, LRq;->c:I

    iget v2, p1, Lyl;->a:I

    add-int/2addr v1, v2

    iget v2, p0, LRq;->d:I

    iget v3, p1, Lyl;->b:I

    add-int/2addr v2, v3

    iget v3, p0, LRq;->e:I

    iget p1, p1, Lyl;->c:I

    add-int/2addr v3, p1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result p1

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method
