.class public final Landroidx/compose/ui/platform/飘花落叶言子苏世哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世哲兰苏(Landroid/content/res/Configuration;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世兰哲苏:L飘花落叶言子苏楪兰世哲/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    iget-object v0, v0, L飘花落叶言子苏楪兰世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪苏世哲兰:L飘花落叶言子苏楪兰世哲/飘花落叶言子楪世哲兰苏;

    .line 11
    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    iget-object v0, p0, L飘花落叶言子苏楪兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子世楪兰苏哲;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/collection/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    monitor-exit p0

    .line 22
    throw v0
.end method

.method public final onTrimMemory(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世兰哲苏:L飘花落叶言子苏楪兰世哲/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    iget-object p1, p1, L飘花落叶言子苏楪兰世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪苏世哲兰:L飘花落叶言子苏楪兰世哲/飘花落叶言子楪世哲兰苏;

    .line 11
    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    iget-object p1, p0, L飘花落叶言子苏楪兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子世楪兰苏哲;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/collection/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit p0

    .line 22
    throw p1
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/platform/飘花落叶言子哲楪世兰苏;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
