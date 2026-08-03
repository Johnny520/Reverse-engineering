.class public final Landroidx/lifecycle/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/d;


# instance fields
.field public final a:LV/e;

.field public b:Z

.field public c:Landroid/os/Bundle;

.field public final d:LD0/h;


# direct methods
.method public constructor <init>(LV/e;Landroidx/lifecycle/K;)V
    .locals 1

    const-string v0, "savedStateRegistry"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelStoreOwner"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/H;->a:LV/e;

    new-instance p1, Landroidx/lifecycle/G;

    invoke-direct {p1, p2}, Landroidx/lifecycle/G;-><init>(Landroidx/lifecycle/K;)V

    invoke-static {p1}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/H;->d:LD0/h;

    return-void
.end method
