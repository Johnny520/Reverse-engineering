.class public final La/mh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/mh$d;,
        La/mh$e;,
        La/mh$c;,
        La/mh$b;,
        La/mh$a;
    }
.end annotation


# instance fields
.field public a:La/mh$e;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, La/mh$d;

    invoke-static {p1, p2, p3, p4}, La/F;->i(ILandroid/view/animation/Interpolator;J)Landroid/view/WindowInsetsAnimation;

    move-result-object p1

    invoke-direct {v0, p1}, La/mh$d;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v0, p0, La/mh;->a:La/mh$e;

    return-void

    :cond_0
    new-instance v0, La/mh$c;

    invoke-direct {v0, p1, p2, p3, p4}, La/mh$e;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, La/mh;->a:La/mh$e;

    return-void
.end method
