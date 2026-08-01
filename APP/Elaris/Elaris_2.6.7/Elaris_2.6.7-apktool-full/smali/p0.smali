.class public final Lp0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Ljava/lang/ref/WeakReference;

.field public final c:Ljava/lang/ref/WeakReference;

.field public final d:Z

.field public final e:Landroid/widget/FrameLayout;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/TextView;

.field public final h:Lo0;

.field public i:Z

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:F


# direct methods
.method public constructor <init>(Lm0;Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/view/ViewGroup;ZLandroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lp0;->j:I

    .line 6
    .line 7
    iput v0, p0, Lp0;->k:I

    .line 8
    .line 9
    const/high16 v0, -0x80000000

    .line 10
    .line 11
    iput v0, p0, Lp0;->l:I

    .line 12
    .line 13
    iput v0, p0, Lp0;->m:I

    .line 14
    .line 15
    iput v0, p0, Lp0;->n:I

    .line 16
    .line 17
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 18
    .line 19
    iput v0, p0, Lp0;->o:F

    .line 20
    .line 21
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lp0;->a:Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-direct {p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lp0;->b:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-direct {p2, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Lp0;->c:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    iput-boolean p5, p0, Lp0;->d:Z

    .line 43
    .line 44
    iput-object p6, p0, Lp0;->e:Landroid/widget/FrameLayout;

    .line 45
    .line 46
    iput-object p7, p0, Lp0;->f:Landroid/widget/TextView;

    .line 47
    .line 48
    iput-object p8, p0, Lp0;->g:Landroid/widget/TextView;

    .line 49
    .line 50
    new-instance p2, Lo0;

    .line 51
    .line 52
    invoke-direct {p2, p0, p1}, Lo0;-><init>(Lp0;Lm0;)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, Lp0;->h:Lo0;

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Lp0;->i:Z

    .line 59
    .line 60
    return-void
.end method
