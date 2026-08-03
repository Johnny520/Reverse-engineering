.class public final Lsx;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lrx;


# direct methods
.method public constructor <init>(Landroidx/core/widget/NestedScrollView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    new-instance v0, Lqx;

    invoke-direct {v0, p1}, Lqx;-><init>(Landroidx/core/widget/NestedScrollView;)V

    iput-object v0, p0, Lsx;->a:Lrx;

    return-void

    :cond_0
    new-instance p1, Lhw;

    const/4 v0, 0x5

    invoke-direct {p1, v0}, Lhw;-><init>(I)V

    iput-object p1, p0, Lsx;->a:Lrx;

    return-void
.end method
