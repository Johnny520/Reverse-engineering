.class public final Lon;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;


# instance fields
.field public final synthetic ε:Lpn;


# direct methods
.method public constructor <init>(Lpn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lon;->ε:Lpn;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lon;->ε:Lpn;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lpn;->δ(Landroid/content/res/Configuration;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    .line 1
    iget-object p0, p0, Lon;->ε:Lpn;

    .line 2
    .line 3
    iget-object v0, p0, Lpn;->ζ:Ln;

    .line 4
    .line 5
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lpn;->η:Ly21;

    .line 13
    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    iget-object v0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ln11;

    .line 18
    .line 19
    invoke-virtual {v0}, Ln11;->γ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    monitor-exit p0

    .line 26
    throw v0
.end method

.method public final onTrimMemory(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lon;->ε:Lpn;

    .line 2
    .line 3
    iget-object p1, p0, Lpn;->ζ:Ln;

    .line 4
    .line 5
    iget-object p1, p1, Ln;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lpn;->η:Ly21;

    .line 13
    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    iget-object p1, p0, Ly21;->ε:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ln11;

    .line 18
    .line 19
    invoke-virtual {p1}, Ln11;->γ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit p0

    .line 26
    throw p1
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lon;->ε:Lpn;

    .line 2
    .line 3
    iget-object p0, p0, Lpn;->τ:Llm0;

    .line 4
    .line 5
    iget-object p0, p0, Llm0;->α:Lx91;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
