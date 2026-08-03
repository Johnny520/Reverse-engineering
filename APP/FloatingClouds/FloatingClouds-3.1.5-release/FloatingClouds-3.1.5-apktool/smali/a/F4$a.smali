.class public final La/F4$a;
.super La/Ta$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/F4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final q:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(La/F4$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, La/Ta$b;-><init>(La/Ta$b;)V

    .line 4
    iget-object p1, p1, La/F4$a;->q:Landroid/graphics/RectF;

    iput-object p1, p0, La/F4$a;->q:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(La/Vd;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La/Ta$b;-><init>(La/Vd;)V

    .line 2
    iput-object p2, p0, La/F4$a;->q:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, La/F4$b;

    invoke-direct {v0, p0}, La/Ta;-><init>(La/Ta$b;)V

    iput-object p0, v0, La/F4;->y:La/F4$a;

    invoke-virtual {v0}, La/Ta;->invalidateSelf()V

    return-object v0
.end method
