.class public final Leb/d1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lj8/q;


# instance fields
.field public final synthetic a:Leb/c1;

.field public final synthetic b:Leb/w0;

.field public final synthetic c:Leb/w0;


# direct methods
.method public constructor <init>(Leb/c1;Leb/w0;Leb/w0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Leb/d1;->a:Leb/c1;

    .line 5
    .line 6
    iput-object p2, p0, Leb/d1;->b:Leb/w0;

    .line 7
    .line 8
    iput-object p3, p0, Leb/d1;->c:Leb/w0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Video download failed"

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Leb/d1;->b:Leb/w0;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onSuccess(Ljava/io/File;)V
    .locals 4

    .line 1
    iget-object v0, p0, Leb/d1;->a:Leb/c1;

    .line 2
    .line 3
    iget-wide v0, v0, Leb/c1;->d:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-lez v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    cmp-long v0, v2, v0

    .line 16
    .line 17
    if-gez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/Exception;

    .line 23
    .line 24
    const-string v0, "Video download is incomplete"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Leb/d1;->b:Leb/w0;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object v0, p0, Leb/d1;->c:Leb/w0;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method
