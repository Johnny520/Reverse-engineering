.class public final Lnb/r;
.super Landroid/speech/tts/UtteranceProgressListener;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:Lnb/w;


# direct methods
.method public constructor <init>(Lnb/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnb/r;->a:Lnb/w;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/speech/tts/UtteranceProgressListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDone(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnb/r;->a:Lnb/w;

    .line 2
    .line 3
    iget-object v1, v0, Lnb/w;->b:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v2, Lnb/f;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-direct {v2, v0, p1, v3}, Lnb/f;-><init>(Lnb/w;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onError(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnb/r;->a:Lnb/w;

    .line 2
    .line 3
    iget-object v1, v0, Lnb/w;->b:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v2, Lnb/f;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    invoke-direct {v2, v0, p1, v3}, Lnb/f;-><init>(Lnb/w;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onError(Ljava/lang/String;I)V
    .locals 3

    .line 15
    iget-object p2, p0, Lnb/r;->a:Lnb/w;

    iget-object v0, p2, Lnb/w;->b:Landroid/os/Handler;

    .line 16
    new-instance v1, Lnb/f;

    const/4 v2, 0x1

    invoke-direct {v1, p2, p1, v2}, Lnb/f;-><init>(Lnb/w;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onRangeStart(Ljava/lang/String;III)V
    .locals 2

    .line 1
    iget-object p3, p0, Lnb/r;->a:Lnb/w;

    .line 2
    .line 3
    iget-object p4, p3, Lnb/w;->b:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v0, Le9/o;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, p3, p1, p2, v1}, Le9/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onStart(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method
