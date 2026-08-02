.class public final Lzd3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Landroid/view/View;

.field public final synthetic i:Lge3;

.field public final synthetic j:Ldq1;

.field public final synthetic k:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Landroid/view/View;Lge3;Ldq1;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzd3;->h:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lzd3;->i:Lge3;

    .line 7
    .line 8
    iput-object p3, p0, Lzd3;->j:Ldq1;

    .line 9
    .line 10
    iput-object p4, p0, Lzd3;->k:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lzd3;->i:Lge3;

    .line 2
    .line 3
    iget-object v1, p0, Lzd3;->j:Ldq1;

    .line 4
    .line 5
    iget-object v2, p0, Lzd3;->h:Landroid/view/View;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Lbe3;->i(Landroid/view/View;Lge3;Ldq1;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lzd3;->k:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
