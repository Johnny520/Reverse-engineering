.class public final LtF;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:LsF;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, LrF;

    invoke-static {p1, p2, p3, p4}, LS;->i(ILandroid/view/animation/Interpolator;J)Landroid/view/WindowInsetsAnimation;

    move-result-object p1

    invoke-direct {v0, p1}, LrF;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v0, p0, LtF;->a:LsF;

    return-void

    :cond_0
    new-instance v0, LpF;

    invoke-direct {v0, p1, p2, p3, p4}, LsF;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, LtF;->a:LsF;

    return-void
.end method
