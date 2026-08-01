.class public Lorg/apache/commons/compress/archivers/dump/InvalidFormatException;
.super Lorg/apache/commons/compress/archivers/dump/DumpArchiveException;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field protected offset:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    const-string v0, "there was an error decoding a tape segment"

    invoke-direct {p0, v0}, Lorg/apache/commons/compress/archivers/dump/DumpArchiveException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "there was an error decoding a tape segment header at offset "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "."

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, v0}, Lorg/apache/commons/compress/archivers/dump/DumpArchiveException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Lorg/apache/commons/compress/archivers/dump/InvalidFormatException;->offset:J

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public getOffset()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/dump/InvalidFormatException;->offset:J

    .line 2
    .line 3
    return-wide v0
.end method
