.class public final L۟/b1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/b1;-><init>(Landroid/content/Context;L۟/y6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/b1;


# direct methods
.method public constructor <init>(L۟/b1;)V
    .locals 0

    iput-object p1, p0, L۟/b1$a;->ۥ:L۟/b1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    cmpl-float v1, v0, v1

    .line 20
    .line 21
    if-ltz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, L۟/b1$a;->ۥ:L۟/b1;

    .line 24
    .line 25
    iget-object v1, v1, L۟/b1;->ۥ۟ۦ:L۟/y6;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    check-cast v1, L۟/s7$a;

    .line 36
    .line 37
    invoke-virtual {v1, v0, v2, p1}, L۟/s7$a;->ۥ(FFF)V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 43
    return p1
.end method

.method public final onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 0

    return-void
.end method
