.class public final synthetic Lob/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lob/n;


# direct methods
.method public synthetic constructor <init>(JLob/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lob/g;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lob/g;->b:Lob/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lob/g;->b:Lob/n;

    .line 2
    .line 3
    iget-wide v1, v0, Lob/n;->n:J

    .line 4
    .line 5
    iget-wide v3, p0, Lob/g;->a:J

    .line 6
    .line 7
    cmp-long v1, v3, v1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lob/n;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
