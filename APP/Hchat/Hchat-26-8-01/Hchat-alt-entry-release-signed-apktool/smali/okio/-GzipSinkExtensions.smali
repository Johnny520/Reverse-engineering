.class public final Lokio/-GzipSinkExtensions;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final gzip(Lokio/Sink;)Lokio/GzipSink;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lokio/GzipSink;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lokio/GzipSink;-><init>(Lokio/Sink;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
