.class public final synthetic LYue/ۥۡ۠ۦ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡ۠ۦۢ;

.field public final synthetic ۥ۟۟۠ۤ:Landroidx/lifecycle/Lifecycle$State;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۡ۠ۧ;


# direct methods
.method public synthetic constructor <init>(LYue/ۥۡ۠ۦۢ;Landroidx/lifecycle/Lifecycle$State;LYue/ۥۡ۠ۧ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡ۠ۦ۠;->ۥۣ۟۟۠:LYue/ۥۡ۠ۦۢ;

    iput-object p2, p0, LYue/ۥۡ۠ۦ۠;->ۥ۟۟۠ۤ:Landroidx/lifecycle/Lifecycle$State;

    iput-object p3, p0, LYue/ۥۡ۠ۦ۠;->ۥ۟۟۠ۥ:LYue/ۥۡ۠ۧ;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 3

    iget-object v0, p0, LYue/ۥۡ۠ۦ۠;->ۥۣ۟۟۠:LYue/ۥۡ۠ۦۢ;

    iget-object v1, p0, LYue/ۥۡ۠ۦ۠;->ۥ۟۟۠ۤ:Landroidx/lifecycle/Lifecycle$State;

    iget-object v2, p0, LYue/ۥۡ۠ۦ۠;->ۥ۟۟۠ۥ:LYue/ۥۡ۠ۧ;

    invoke-static {v0, v1, v2, p1, p2}, LYue/ۥۡ۠ۦۢ;->ۥ(LYue/ۥۡ۠ۦۢ;Landroidx/lifecycle/Lifecycle$State;LYue/ۥۡ۠ۧ;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method
