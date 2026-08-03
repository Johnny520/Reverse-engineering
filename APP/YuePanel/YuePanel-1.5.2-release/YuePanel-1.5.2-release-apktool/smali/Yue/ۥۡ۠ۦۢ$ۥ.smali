.class public LYue/ۥۡ۠ۦۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡ۠ۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroidx/lifecycle/Lifecycle;

.field public ۥ۟:Landroidx/lifecycle/LifecycleEventObserver;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/LifecycleEventObserver;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/Lifecycle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/LifecycleEventObserver;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡ۠ۦۢ$ۥ;->ۥ:Landroidx/lifecycle/Lifecycle;

    iput-object p2, p0, LYue/ۥۡ۠ۦۢ$ۥ;->ۥ۟:Landroidx/lifecycle/LifecycleEventObserver;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡ۠ۦۢ$ۥ;->ۥ:Landroidx/lifecycle/Lifecycle;

    iget-object v1, p0, LYue/ۥۡ۠ۦۢ$ۥ;->ۥ۟:Landroidx/lifecycle/LifecycleEventObserver;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۡ۠ۦۢ$ۥ;->ۥ۟:Landroidx/lifecycle/LifecycleEventObserver;

    return-void
.end method
