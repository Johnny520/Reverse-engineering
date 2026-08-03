.class public final synthetic LYue/ۥۡۧۤ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/savedstate/ۥ;


# direct methods
.method public synthetic constructor <init>(Landroidx/savedstate/ۥ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۤ۠;->ۥۣ۟۟۠:Landroidx/savedstate/ۥ;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۤ۠;->ۥۣ۟۟۠:Landroidx/savedstate/ۥ;

    invoke-static {v0, p1, p2}, Landroidx/savedstate/ۥ;->ۥ(Landroidx/savedstate/ۥ;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method
