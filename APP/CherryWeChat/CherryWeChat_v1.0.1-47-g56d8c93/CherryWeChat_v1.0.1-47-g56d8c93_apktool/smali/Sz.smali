.class public final LSz;
.super Landroid/view/animation/Animation;
.source ""


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:LWz;


# direct methods
.method public constructor <init>(LWz;II)V
    .locals 0

    iput-object p1, p0, LSz;->c:LWz;

    iput p2, p0, LSz;->a:I

    iput p3, p0, LSz;->b:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    iget-object p2, p0, LSz;->c:LWz;

    iget-object p2, p2, LWz;->z:Lw9;

    iget v0, p0, LSz;->a:I

    int-to-float v1, v0

    iget v2, p0, LSz;->b:I

    sub-int/2addr v2, v0

    int-to-float v0, v2

    mul-float/2addr v0, p1

    add-float/2addr v0, v1

    float-to-int p1, v0

    invoke-virtual {p2, p1}, Lw9;->setAlpha(I)V

    return-void
.end method
