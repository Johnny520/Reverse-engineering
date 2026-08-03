.class public Lcom/youth/banner/util/BannerLifecycleObserverAdapter;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LXn;


# instance fields
.field private final mLifecycleOwner:LYn;

.field private final mObserver:Lcom/youth/banner/util/BannerLifecycleObserver;


# direct methods
.method public constructor <init>(LYn;Lcom/youth/banner/util/BannerLifecycleObserver;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/youth/banner/util/BannerLifecycleObserverAdapter;->mLifecycleOwner:LYn;

    iput-object p2, p0, Lcom/youth/banner/util/BannerLifecycleObserverAdapter;->mObserver:Lcom/youth/banner/util/BannerLifecycleObserver;

    return-void
.end method


# virtual methods
.method public onDestroy()V
    .locals 2
    .annotation runtime Lqt;
        value = .enum LOn;->ON_DESTROY:LOn;
    .end annotation

    const-string v0, "onDestroy"

    invoke-static {v0}, Lcom/youth/banner/util/LogUtils;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/youth/banner/util/BannerLifecycleObserverAdapter;->mObserver:Lcom/youth/banner/util/BannerLifecycleObserver;

    iget-object v1, p0, Lcom/youth/banner/util/BannerLifecycleObserverAdapter;->mLifecycleOwner:LYn;

    invoke-interface {v0, v1}, Lcom/youth/banner/util/BannerLifecycleObserver;->onDestroy(LYn;)V

    return-void
.end method

.method public onStart()V
    .locals 2
    .annotation runtime Lqt;
        value = .enum LOn;->ON_START:LOn;
    .end annotation

    const-string v0, "onStart"

    invoke-static {v0}, Lcom/youth/banner/util/LogUtils;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/youth/banner/util/BannerLifecycleObserverAdapter;->mObserver:Lcom/youth/banner/util/BannerLifecycleObserver;

    iget-object v1, p0, Lcom/youth/banner/util/BannerLifecycleObserverAdapter;->mLifecycleOwner:LYn;

    invoke-interface {v0, v1}, Lcom/youth/banner/util/BannerLifecycleObserver;->onStart(LYn;)V

    return-void
.end method

.method public onStop()V
    .locals 2
    .annotation runtime Lqt;
        value = .enum LOn;->ON_STOP:LOn;
    .end annotation

    const-string v0, "onStop"

    invoke-static {v0}, Lcom/youth/banner/util/LogUtils;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/youth/banner/util/BannerLifecycleObserverAdapter;->mObserver:Lcom/youth/banner/util/BannerLifecycleObserver;

    iget-object v1, p0, Lcom/youth/banner/util/BannerLifecycleObserverAdapter;->mLifecycleOwner:LYn;

    invoke-interface {v0, v1}, Lcom/youth/banner/util/BannerLifecycleObserver;->onStop(LYn;)V

    return-void
.end method
