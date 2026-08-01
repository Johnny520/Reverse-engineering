.class public final synthetic Lta2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field public final synthetic α:Lva2;


# direct methods
.method public synthetic constructor <init>(Lva2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lta2;->α:Lva2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lta2;->α:Lva2;

    .line 2
    .line 3
    iget-object p1, p0, Lva2;->γ:Landroid/widget/TextView;

    .line 4
    .line 5
    const-string v0, "\u64ad\u653e\u5b8c\u6210"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lva2;->δ:Landroid/widget/ProgressBar;

    .line 11
    .line 12
    const/16 p1, 0x64

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
