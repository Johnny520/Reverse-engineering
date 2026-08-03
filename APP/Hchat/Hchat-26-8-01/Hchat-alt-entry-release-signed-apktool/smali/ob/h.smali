.class public final synthetic Lob/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


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
    iput-wide p1, p0, Lob/h;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lob/h;->b:Lob/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lob/h;->b:Lob/n;

    .line 2
    .line 3
    iget-wide v0, p1, Lob/n;->n:J

    .line 4
    .line 5
    iget-wide v2, p0, Lob/h;->a:J

    .line 6
    .line 7
    cmp-long v0, v2, v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lob/n;->g()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
