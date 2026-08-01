.class public final Lva2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/app/Activity;

.field public final β:Landroid/view/View;

.field public final γ:Landroid/widget/TextView;

.field public final δ:Landroid/widget/ProgressBar;

.field public final ε:Landroid/os/Handler;

.field public ζ:Landroid/media/MediaPlayer;

.field public final η:Ld1;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/ProgressBar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lva2;->α:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lva2;->β:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, Lva2;->γ:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p4, p0, Lva2;->δ:Landroid/widget/ProgressBar;

    .line 11
    .line 12
    new-instance p1, Landroid/os/Handler;

    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lva2;->ε:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance p1, Ld1;

    .line 24
    .line 25
    const/16 p2, 0xe

    .line 26
    .line 27
    invoke-direct {p1, p2, p0}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lva2;->η:Ld1;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 2

    .line 1
    iget-object v0, p0, Lva2;->ε:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lva2;->η:Ld1;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lva2;->ζ:Landroid/media/MediaPlayer;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :catchall_0
    :cond_0
    :try_start_1
    iget-object v0, p0, Lva2;->ζ:Landroid/media/MediaPlayer;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    .line 21
    .line 22
    :catchall_1
    :cond_1
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lva2;->ζ:Landroid/media/MediaPlayer;

    .line 24
    .line 25
    iget-object v0, p0, Lva2;->β:Landroid/view/View;

    .line 26
    .line 27
    const/16 v1, 0x8

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lva2;->δ:Landroid/widget/ProgressBar;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p0, v0}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
