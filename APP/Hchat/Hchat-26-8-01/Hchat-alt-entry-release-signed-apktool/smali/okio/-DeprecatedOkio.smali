.class public final Lokio/-DeprecatedOkio;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation runtime Lsf/a;
.end annotation


# static fields
.field public static final INSTANCE:Lokio/-DeprecatedOkio;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lokio/-DeprecatedOkio;

    .line 2
    .line 3
    invoke-direct {v0}, Lokio/-DeprecatedOkio;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lokio/-DeprecatedOkio;->INSTANCE:Lokio/-DeprecatedOkio;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final appendingSink(Ljava/io/File;)Lokio/Sink;
    .locals 0
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lokio/Okio;->appendingSink(Ljava/io/File;)Lokio/Sink;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final blackhole()Lokio/Sink;
    .locals 1
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    invoke-static {}, Lokio/Okio;->blackhole()Lokio/Sink;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final buffer(Lokio/Sink;)Lokio/BufferedSink;
    .locals 0
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final buffer(Lokio/Source;)Lokio/BufferedSource;
    .locals 0
    .annotation runtime Lsf/a;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object p1

    return-object p1
.end method

.method public final sink(Ljava/io/File;)Lokio/Sink;
    .locals 3
    .annotation runtime Lsf/a;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 20
    invoke-static {p1, v2, v0, v1}, Lokio/Okio;->sink$default(Ljava/io/File;ZILjava/lang/Object;)Lokio/Sink;

    move-result-object p1

    return-object p1
.end method

.method public final sink(Ljava/io/OutputStream;)Lokio/Sink;
    .locals 0
    .annotation runtime Lsf/a;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-static {p1}, Lokio/Okio;->sink(Ljava/io/OutputStream;)Lokio/Sink;

    move-result-object p1

    return-object p1
.end method

.method public final sink(Ljava/net/Socket;)Lokio/Sink;
    .locals 0
    .annotation runtime Lsf/a;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-static {p1}, Lokio/Okio;->sink(Ljava/net/Socket;)Lokio/Sink;

    move-result-object p1

    return-object p1
.end method

.method public final varargs sink(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;
    .locals 1
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    array-length v0, p2

    .line 8
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, [Ljava/nio/file/OpenOption;

    .line 13
    .line 14
    invoke-static {p1, p2}, Lokio/Okio;->sink(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final source(Ljava/io/File;)Lokio/Source;
    .locals 0
    .annotation runtime Lsf/a;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    invoke-static {p1}, Lokio/Okio;->source(Ljava/io/File;)Lokio/Source;

    move-result-object p1

    return-object p1
.end method

.method public final source(Ljava/io/InputStream;)Lokio/Source;
    .locals 0
    .annotation runtime Lsf/a;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-static {p1}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    move-result-object p1

    return-object p1
.end method

.method public final source(Ljava/net/Socket;)Lokio/Source;
    .locals 0
    .annotation runtime Lsf/a;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-static {p1}, Lokio/Okio;->source(Ljava/net/Socket;)Lokio/Source;

    move-result-object p1

    return-object p1
.end method

.method public final varargs source(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;
    .locals 1
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    array-length v0, p2

    .line 8
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, [Ljava/nio/file/OpenOption;

    .line 13
    .line 14
    invoke-static {p1, p2}, Lokio/Okio;->source(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
