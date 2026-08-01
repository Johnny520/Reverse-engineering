.class public final Lcom/lu/magic/ui/LifecycleAutoViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F:",
        "Landroidx/fragment/app/l;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/q;"
    }
.end annotation


# instance fields
.field public a:Li/q1;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    iput-object p2, p0, Lcom/lu/magic/ui/LifecycleAutoViewBinding;->a:Li/q1;

    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/lifecycle/s;->c()Landroidx/lifecycle/u;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
