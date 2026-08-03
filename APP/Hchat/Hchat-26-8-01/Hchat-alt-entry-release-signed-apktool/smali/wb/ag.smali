.class public final synthetic Lwb/ag;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field public final synthetic a:Landroid/widget/VideoView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/VideoView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ag;->a:Landroid/widget/VideoView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lwb/ag;->a:Landroid/widget/VideoView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/VideoView;->start()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
