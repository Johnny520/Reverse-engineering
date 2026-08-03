.class public final L۟/s7$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/s7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final ۥ:Landroid/widget/OverScroller;

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public final synthetic ۥ۟۠:L۟/s7;


# direct methods
.method public constructor <init>(L۟/s7;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, L۟/s7$f;->ۥ۟۠:L۟/s7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/widget/OverScroller;

    invoke-direct {p1, p2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, L۟/s7$f;->ۥ:Landroid/widget/OverScroller;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, L۟/s7$f;->ۥ:Landroid/widget/OverScroller;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, L۟/s7$f;->ۥ:Landroid/widget/OverScroller;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, L۟/s7$f;->ۥ:Landroid/widget/OverScroller;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p0, L۟/s7$f;->ۥ:Landroid/widget/OverScroller;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v2, p0, L۟/s7$f;->ۥ۟۠:L۟/s7;

    .line 31
    .line 32
    iget-object v2, v2, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    .line 33
    .line 34
    iget v3, p0, L۟/s7$f;->ۥ۟:I

    .line 35
    .line 36
    sub-int/2addr v3, v0

    .line 37
    int-to-float v3, v3

    .line 38
    iget v4, p0, L۟/s7$f;->ۥ۟۟:I

    .line 39
    .line 40
    sub-int/2addr v4, v1

    .line 41
    int-to-float v4, v4

    .line 42
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, L۟/s7$f;->ۥ۟۠:L۟/s7;

    .line 46
    .line 47
    invoke-virtual {v2}, L۟/s7;->ۥ()V

    .line 48
    .line 49
    .line 50
    iput v0, p0, L۟/s7$f;->ۥ۟:I

    .line 51
    .line 52
    iput v1, p0, L۟/s7$f;->ۥ۟۟:I

    .line 53
    .line 54
    iget-object v0, p0, L۟/s7$f;->ۥ۟۠:L۟/s7;

    .line 55
    .line 56
    iget-object v0, v0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method
