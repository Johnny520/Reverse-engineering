.class public final La/Oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Tb;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Landroid/view/View;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, La/Oa;->a:I

    iput-object p1, p0, La/Oa;->b:Landroid/view/View;

    iput p3, p0, La/Oa;->c:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;La/nh;)La/nh;
    .locals 4

    iget-object p1, p2, La/nh;->a:La/nh$k;

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, La/nh$k;->f(I)La/a9;

    move-result-object p1

    iget p1, p1, La/a9;->b:I

    iget-object v0, p0, La/Oa;->b:Landroid/view/View;

    iget v1, p0, La/Oa;->a:I

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    add-int/2addr v1, p1

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget v2, p0, La/Oa;->c:I

    add-int/2addr v2, p1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    invoke-virtual {v0, v1, v2, p1, v3}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method
