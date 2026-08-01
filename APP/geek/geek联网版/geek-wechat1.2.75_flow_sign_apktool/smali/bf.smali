.class public final Lbf;
.super Lhu;


# instance fields
.field public final q:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lbf;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lhu;-><init>(Lhu;)V

    .line 4
    iget-object p1, p1, Lbf;->q:Landroid/graphics/RectF;

    iput-object p1, p0, Lbf;->q:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Lm30;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhu;-><init>(Lm30;)V

    .line 2
    iput-object p2, p0, Lbf;->q:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Lcf;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Liu;-><init>(Lhu;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lcf;->x:Lbf;

    .line 7
    .line 8
    invoke-virtual {v0}, Liu;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
