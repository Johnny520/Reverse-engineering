.class public final Lokio/-InflaterSourceExtensions;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final inflate(Lokio/Source;Ljava/util/zip/Inflater;)Lokio/InflaterSource;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lokio/InflaterSource;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lokio/InflaterSource;-><init>(Lokio/Source;Ljava/util/zip/Inflater;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static synthetic inflate$default(Lokio/Source;Ljava/util/zip/Inflater;ILjava/lang/Object;)Lokio/InflaterSource;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance p1, Ljava/util/zip/Inflater;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/zip/Inflater;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p2, Lokio/InflaterSource;

    .line 17
    .line 18
    invoke-direct {p2, p0, p1}, Lokio/InflaterSource;-><init>(Lokio/Source;Ljava/util/zip/Inflater;)V

    .line 19
    .line 20
    .line 21
    return-object p2
.end method
