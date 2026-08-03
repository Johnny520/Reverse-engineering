.class public final synthetic Lob/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


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
    iput-wide p1, p0, Lob/i;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lob/i;->b:Lob/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 2

    .line 1
    iget-object p1, p0, Lob/i;->b:Lob/n;

    .line 2
    .line 3
    iget-wide p2, p1, Lob/n;->n:J

    .line 4
    .line 5
    iget-wide v0, p0, Lob/i;->a:J

    .line 6
    .line 7
    cmp-long p2, v0, p2

    .line 8
    .line 9
    const/4 p3, 0x1

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    const-string p2, "\u8bed\u97f3\u64ad\u653e\u5931\u8d25"

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lob/n;->l(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lob/n;->g()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return p3
.end method
