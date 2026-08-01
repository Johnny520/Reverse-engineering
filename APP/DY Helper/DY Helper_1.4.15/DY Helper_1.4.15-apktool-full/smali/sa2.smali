.class public final synthetic Lsa2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field public final synthetic α:Lva2;

.field public final synthetic β:Lqa2;


# direct methods
.method public synthetic constructor <init>(Lva2;Lqa2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsa2;->α:Lva2;

    .line 5
    .line 6
    iput-object p2, p0, Lsa2;->β:Lqa2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsa2;->α:Lva2;

    .line 2
    .line 3
    iget-object v1, v0, Lva2;->δ:Landroid/widget/ProgressBar;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lva2;->γ:Landroid/widget/TextView;

    .line 10
    .line 11
    iget-object p0, p0, Lsa2;->β:Lqa2;

    .line 12
    .line 13
    iget-object p0, p0, Lqa2;->β:Ljava/lang/String;

    .line 14
    .line 15
    const-string v2, "\u64ad\u653e\u4e2d "

    .line 16
    .line 17
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 25
    .line 26
    .line 27
    iget-object p0, v0, Lva2;->ε:Landroid/os/Handler;

    .line 28
    .line 29
    iget-object p1, v0, Lva2;->η:Ld1;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method
