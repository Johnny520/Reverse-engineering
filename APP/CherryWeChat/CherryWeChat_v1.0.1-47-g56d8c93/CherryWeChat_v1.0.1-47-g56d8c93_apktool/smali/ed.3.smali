.class public final Led;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUn;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Led;->a:I

    iput-object p2, p0, Led;->b:Ljava/lang/Object;

    iput-object p3, p0, Led;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LXn;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Led;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Led;->b:Ljava/lang/Object;

    .line 4
    sget-object v0, LJ9;->c:LJ9;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 5
    iget-object v1, v0, LJ9;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LH9;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, LJ9;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)LH9;

    move-result-object v1

    .line 7
    :goto_0
    iput-object v1, p0, Led;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onStateChanged(LYn;LOn;)V
    .locals 3

    iget v0, p0, Led;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Led;->c:Ljava/lang/Object;

    check-cast v0, LH9;

    iget-object v0, v0, LH9;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Led;->b:Ljava/lang/Object;

    invoke-static {v1, p1, p2, v2}, LH9;->a(Ljava/util/List;LYn;LOn;Ljava/lang/Object;)V

    sget-object v1, LOn;->ON_ANY:LOn;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0, p1, p2, v2}, LH9;->a(Ljava/util/List;LYn;LOn;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    sget-object p1, LOn;->ON_START:LOn;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Led;->b:Ljava/lang/Object;

    check-cast p1, LRn;

    invoke-virtual {p1, p0}, LRn;->b(LXn;)V

    iget-object p1, p0, Led;->c:Ljava/lang/Object;

    check-cast p1, Lhx;

    invoke-virtual {p1}, Lhx;->d()V

    :cond_0
    return-void

    :pswitch_1
    iget-object v0, p0, Led;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/DefaultLifecycleObserver;

    sget-object v1, Ldd;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    goto :goto_0

    :pswitch_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ON_ANY must not been send by anybody"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(LYn;)V

    goto :goto_0

    :pswitch_4
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(LYn;)V

    goto :goto_0

    :pswitch_5
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(LYn;)V

    goto :goto_0

    :pswitch_6
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(LYn;)V

    goto :goto_0

    :pswitch_7
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(LYn;)V

    goto :goto_0

    :pswitch_8
    invoke-interface {v0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onCreate(LYn;)V

    :goto_0
    iget-object v0, p0, Led;->c:Ljava/lang/Object;

    check-cast v0, LUn;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, LUn;->onStateChanged(LYn;LOn;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
