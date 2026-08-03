.class public final synthetic LYue/ۥۡ۠ۦۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡ۠ۦۢ;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۡ۠ۧ;


# direct methods
.method public synthetic constructor <init>(LYue/ۥۡ۠ۦۢ;LYue/ۥۡ۠ۧ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡ۠ۦۡ;->ۥۣ۟۟۠:LYue/ۥۡ۠ۦۢ;

    iput-object p2, p0, LYue/ۥۡ۠ۦۡ;->ۥ۟۟۠ۤ:LYue/ۥۡ۠ۧ;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 2

    iget-object v0, p0, LYue/ۥۡ۠ۦۡ;->ۥۣ۟۟۠:LYue/ۥۡ۠ۦۢ;

    iget-object v1, p0, LYue/ۥۡ۠ۦۡ;->ۥ۟۟۠ۤ:LYue/ۥۡ۠ۧ;

    invoke-static {v0, v1, p1, p2}, LYue/ۥۡ۠ۦۢ;->ۥ۟(LYue/ۥۡ۠ۦۢ;LYue/ۥۡ۠ۧ;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method
