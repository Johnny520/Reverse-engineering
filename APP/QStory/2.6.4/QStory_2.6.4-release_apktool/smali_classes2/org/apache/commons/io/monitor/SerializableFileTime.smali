.class final Lorg/apache/commons/io/monitor/SerializableFileTime;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final EPOCH:Lorg/apache/commons/io/monitor/SerializableFileTime;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private fileTime:Ljava/nio/file/attribute/FileTime;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 2
    .line 3
    sget-object v1, L飘花落叶言苏子哲楪世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/nio/file/attribute/FileTime;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lorg/apache/commons/io/monitor/SerializableFileTime;-><init>(Ljava/nio/file/attribute/FileTime;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/apache/commons/io/monitor/SerializableFileTime;->EPOCH:Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/nio/file/attribute/FileTime;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 8
    .line 9
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/time/Instant;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/nio/file/attribute/FileTime;->from(Ljava/time/Instant;)Ljava/nio/file/attribute/FileTime;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 12
    .line 13
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/file/attribute/FileTime;->toInstant()Ljava/time/Instant;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public compareTo(Ljava/nio/file/attribute/FileTime;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/nio/file/attribute/FileTime;->compareTo(Ljava/nio/file/attribute/FileTime;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 12
    .line 13
    iget-object p0, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 14
    .line 15
    iget-object p1, p1, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 16
    .line 17
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/file/attribute/FileTime;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public to(Ljava/util/concurrent/TimeUnit;)J
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/nio/file/attribute/FileTime;->to(Ljava/util/concurrent/TimeUnit;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public toInstant()Ljava/time/Instant;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/file/attribute/FileTime;->toInstant()Ljava/time/Instant;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public toMillis()J
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/file/attribute/FileTime;->toMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/file/attribute/FileTime;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public unwrap()Ljava/nio/file/attribute/FileTime;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/SerializableFileTime;->fileTime:Ljava/nio/file/attribute/FileTime;

    .line 2
    .line 3
    return-object p0
.end method
