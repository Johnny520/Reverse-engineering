.class public final Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/u;

.field public final synthetic b:LM/d;


# direct methods
.method public constructor <init>(LM/d;Landroidx/lifecycle/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;->a:Landroidx/lifecycle/u;

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;->b:LM/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;->a:Landroidx/lifecycle/u;

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;->b:LM/d;

    .line 11
    .line 12
    invoke-virtual {p1}, LM/d;->g()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
