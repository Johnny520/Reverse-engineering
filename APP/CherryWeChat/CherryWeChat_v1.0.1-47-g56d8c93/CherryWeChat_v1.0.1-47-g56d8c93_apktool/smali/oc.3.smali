.class public final Loc;
.super LVq;
.source ""


# instance fields
.field public final r:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(LQx;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LVq;-><init>(LQx;)V

    .line 2
    iput-object p2, p0, Loc;->r:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Loc;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LVq;-><init>(LVq;)V

    .line 4
    iget-object p1, p1, Loc;->r:Landroid/graphics/RectF;

    iput-object p1, p0, Loc;->r:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, Lpc;

    invoke-direct {v0, p0}, LXq;-><init>(LVq;)V

    iput-object p0, v0, Lpc;->G:Loc;

    invoke-virtual {v0}, LXq;->invalidateSelf()V

    return-object v0
.end method
