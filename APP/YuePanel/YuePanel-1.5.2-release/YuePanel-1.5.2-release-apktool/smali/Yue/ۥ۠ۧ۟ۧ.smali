.class public final synthetic LYue/ۥ۠ۧ۟ۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/lifecycle/LifecycleController;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۠ۦ۟ۡ;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/LifecycleController;LYue/ۥ۠ۦ۟ۡ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧ۟ۧ;->ۥۣ۟۟۠:Landroidx/lifecycle/LifecycleController;

    iput-object p2, p0, LYue/ۥ۠ۧ۟ۧ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۦ۟ۡ;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۧ۟ۧ;->ۥۣ۟۟۠:Landroidx/lifecycle/LifecycleController;

    iget-object v1, p0, LYue/ۥ۠ۧ۟ۧ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۦ۟ۡ;

    invoke-static {v0, v1, p1, p2}, Landroidx/lifecycle/LifecycleController;->ۥ(Landroidx/lifecycle/LifecycleController;LYue/ۥ۠ۦ۟ۡ;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method
