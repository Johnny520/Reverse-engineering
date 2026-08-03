.class public final La/ke;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/ke$b;,
        La/ke$c;,
        La/ke$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, La/ke$b;

    invoke-direct {v0, p1}, La/ke$a;-><init>(Landroid/view/View;)V

    return-void

    :cond_0
    new-instance v0, La/ke$a;

    invoke-direct {v0, p1}, La/ke$a;-><init>(Landroid/view/View;)V

    return-void
.end method
