.class public final LA0/h;
.super Lx0/f;
.source "SourceFile"


# instance fields
.field public final v:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(LA0/h;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lx0/f;-><init>(Lx0/f;)V

    .line 4
    iget-object p1, p1, LA0/h;->v:Landroid/graphics/RectF;

    iput-object p1, p0, LA0/h;->v:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Lx0/k;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lx0/f;-><init>(Lx0/k;)V

    .line 2
    iput-object p2, p0, LA0/h;->v:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, LA0/i;

    invoke-direct {v0, p0}, LA0/i;-><init>(LA0/h;)V

    invoke-virtual {v0}, Lx0/g;->invalidateSelf()V

    return-object v0
.end method
