.class public final LYue/ۥۣ۟ۢۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n1567#2:642\n1568#2:644\n1572#2:645\n1573#2,68:647\n1644#2:715\n1645#2,32:717\n1677#2,18:750\n1698#2:768\n1699#2,18:770\n1721#2:788\n1723#2,7:790\n1#3:643\n1#3:646\n1#3:716\n1#3:769\n1#3:789\n86#4:749\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n628#1:642\n628#1:644\n630#1:645\n630#1:647,68\n632#1:715\n632#1:717,32\n632#1:750,18\n634#1:768\n634#1:770,18\n637#1:788\n637#1:790,7\n628#1:643\n630#1:646\n632#1:716\n634#1:769\n637#1:789\n632#1:749\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۢۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n1567#2:642\n1568#2:644\n1572#2:645\n1573#2,68:647\n1644#2:715\n1645#2,32:717\n1677#2,18:750\n1698#2:768\n1699#2,18:770\n1721#2:788\n1723#2,7:790\n1#3:643\n1#3:646\n1#3:716\n1#3:769\n1#3:789\n86#4:749\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n628#1:642\n628#1:644\n630#1:645\n630#1:647,68\n632#1:715\n632#1:717,32\n632#1:750,18\n634#1:768\n634#1:770,18\n637#1:788\n637#1:790,7\n628#1:643\n630#1:646\n632#1:716\n634#1:769\n637#1:789\n632#1:749\n*E\n"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Z
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:LYue/ۥۡۧۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۠ۦ:J
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public ۥ۟۟۠ۧ:[B
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۠ۨ:I
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public ۥ۟۟ۡ:I
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۦ:J

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۨ:I

    iput v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟ۡ:I

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p0, v0}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۟ۤ(LYue/ۥۡۧۨ;)V

    const-wide/16 v1, -0x1

    iput-wide v1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۦ:J

    iput-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۧ:[B

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۨ:I

    iput v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟ۡ:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not attached to a buffer"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟(I)J
    .locals 9

    if-lez p1, :cond_3

    const/16 v0, 0x2000

    if-gt p1, v0, :cond_2

    iget-object v1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    if-eqz v1, :cond_1

    iget-boolean v2, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۤ:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v2

    invoke-virtual {v1, p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۡ(I)LYue/ۥۡۧۨ;

    move-result-object p1

    iget v4, p1, LYue/ۥۡۧۨ;->ۥ۟۟:I

    rsub-int v4, v4, 0x2000

    iput v0, p1, LYue/ۥۡۧۨ;->ۥ۟۟:I

    int-to-long v5, v4

    add-long v7, v2, v5

    invoke-virtual {v1, v7, v8}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۧۥ(J)V

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۟ۤ(LYue/ۥۡۧۨ;)V

    iput-wide v2, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۦ:J

    iget-object p1, p1, LYue/ۥۡۧۨ;->ۥ:[B

    iput-object p1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۧ:[B

    rsub-int p1, v4, 0x2000

    iput p1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۨ:I

    iput v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟ۡ:I

    return-wide v5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "expandBuffer() only permitted for read/write buffers"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "not attached to a buffer"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "minByteCount > Segment.SIZE: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "minByteCount <= 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟()LYue/ۥۡۧۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۧۨ;

    return-object v0
.end method

.method public final ۥ۟۟۟()I
    .locals 4

    iget-wide v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۦ:J

    iget-object v2, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    invoke-static {v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-wide v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۦ:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0, v1}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۟ۢ(J)I

    move-result v0

    goto :goto_1

    :cond_0
    iget v2, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟ۡ:I

    iget v3, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۨ:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    goto :goto_0

    :goto_1
    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no more bytes"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟۟(J)J
    .locals 13

    iget-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    if-eqz v0, :cond_7

    iget-boolean v1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۤ:Z

    if-eqz v1, :cond_6

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    cmp-long v3, p1, v1

    const-wide/16 v4, 0x0

    if-gtz v3, :cond_3

    cmp-long v3, p1, v4

    if-ltz v3, :cond_2

    sub-long v6, v1, p1

    :goto_0
    cmp-long v3, v6, v4

    if-lez v3, :cond_1

    iget-object v3, v0, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget-object v3, v3, LYue/ۥۡۧۨ;->ۥ۟۟۟ۡ:LYue/ۥۡۧۨ;

    invoke-static {v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v8, v3, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v9, v3, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int v9, v8, v9

    int-to-long v9, v9

    cmp-long v11, v9, v6

    if-gtz v11, :cond_0

    invoke-virtual {v3}, LYue/ۥۡۧۨ;->ۥ۟()LYue/ۥۡۧۨ;

    move-result-object v8

    iput-object v8, v0, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v3}, LYue/ۥۡۧۨۡ;->ۥ۟۟۟(LYue/ۥۡۧۨ;)V

    sub-long/2addr v6, v9

    goto :goto_0

    :cond_0
    long-to-int v4, v6

    sub-int/2addr v8, v4

    iput v8, v3, LYue/ۥۡۧۨ;->ۥ۟۟:I

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {p0, v3}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۟ۤ(LYue/ۥۡۧۨ;)V

    iput-wide p1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۦ:J

    iput-object v3, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۧ:[B

    const/4 v3, -0x1

    iput v3, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۨ:I

    iput v3, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟ۡ:I

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "newSize < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    if-lez v3, :cond_5

    sub-long v6, p1, v1

    const/4 v3, 0x1

    move v8, v3

    :cond_4
    :goto_1
    cmp-long v9, v6, v4

    if-lez v9, :cond_5

    invoke-virtual {v0, v3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۡ(I)LYue/ۥۡۧۨ;

    move-result-object v9

    iget v10, v9, LYue/ۥۡۧۨ;->ۥ۟۟:I

    rsub-int v10, v10, 0x2000

    int-to-long v10, v10

    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    long-to-int v10, v10

    iget v11, v9, LYue/ۥۡۧۨ;->ۥ۟۟:I

    add-int/2addr v11, v10

    iput v11, v9, LYue/ۥۡۧۨ;->ۥ۟۟:I

    int-to-long v11, v10

    sub-long/2addr v6, v11

    if-eqz v8, :cond_4

    invoke-virtual {p0, v9}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۟ۤ(LYue/ۥۡۧۨ;)V

    iput-wide v1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۦ:J

    iget-object v8, v9, LYue/ۥۡۧۨ;->ۥ:[B

    iput-object v8, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۧ:[B

    iget v8, v9, LYue/ۥۡۧۨ;->ۥ۟۟:I

    sub-int v9, v8, v10

    iput v9, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۨ:I

    iput v8, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟ۡ:I

    const/4 v8, 0x0

    goto :goto_1

    :cond_5
    :goto_2
    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۧۥ(J)V

    return-wide v1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "resizeBuffer() only permitted for read/write buffers"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "not attached to a buffer"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟ۢ(J)I
    .locals 11

    iget-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۢۨ;

    if-eqz v0, :cond_a

    const-wide/16 v1, -0x1

    cmp-long v1, p1, v1

    if-ltz v1, :cond_9

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v2

    cmp-long v2, p1, v2

    if-gtz v2, :cond_9

    if-eqz v1, :cond_8

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    cmp-long v1, p1, v1

    if-nez v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    iget-object v3, v0, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-virtual {p0}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟()LYue/ۥۡۧۨ;

    move-result-object v4

    const-wide/16 v5, 0x0

    if-eqz v4, :cond_2

    iget-wide v7, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۦ:J

    iget v4, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۨ:I

    invoke-virtual {p0}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟()LYue/ۥۡۧۨ;

    move-result-object v9

    invoke-static {v9}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v9, v9, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int/2addr v4, v9

    int-to-long v9, v4

    sub-long/2addr v7, v9

    cmp-long v4, v7, p1

    if-lez v4, :cond_1

    invoke-virtual {p0}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟()LYue/ۥۡۧۨ;

    move-result-object v1

    move-object v4, v3

    move-object v3, v1

    move-wide v1, v7

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟()LYue/ۥۡۧۨ;

    move-result-object v4

    move-wide v5, v7

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_0
    sub-long v7, v1, p1

    sub-long v9, p1, v5

    cmp-long v7, v7, v9

    if-lez v7, :cond_3

    :goto_1
    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v1, v4, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v2, v4, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int v3, v1, v2

    int-to-long v7, v3

    add-long/2addr v7, v5

    cmp-long v3, p1, v7

    if-ltz v3, :cond_5

    sub-int/2addr v1, v2

    int-to-long v1, v1

    add-long/2addr v5, v1

    iget-object v4, v4, LYue/ۥۡۧۨ;->ۥ۟۟۟۠:LYue/ۥۡۧۨ;

    goto :goto_1

    :cond_3
    :goto_2
    cmp-long v4, v1, p1

    if-lez v4, :cond_4

    invoke-static {v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget-object v3, v3, LYue/ۥۡۧۨ;->ۥ۟۟۟ۡ:LYue/ۥۡۧۨ;

    invoke-static {v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v4, v3, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v5, v3, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int/2addr v4, v5

    int-to-long v4, v4

    sub-long/2addr v1, v4

    goto :goto_2

    :cond_4
    move-wide v5, v1

    move-object v4, v3

    :cond_5
    iget-boolean v1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۤ:Z

    if-eqz v1, :cond_7

    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget-boolean v1, v4, LYue/ۥۡۧۨ;->ۥ۟۟۟:Z

    if-eqz v1, :cond_7

    invoke-virtual {v4}, LYue/ۥۡۧۨ;->ۥ۟۟۟۠()LYue/ۥۡۧۨ;

    move-result-object v1

    iget-object v2, v0, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    if-ne v2, v4, :cond_6

    iput-object v1, v0, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    :cond_6
    invoke-virtual {v4, v1}, LYue/ۥۡۧۨ;->ۥ۟۟(LYue/ۥۡۧۨ;)LYue/ۥۡۧۨ;

    move-result-object v4

    iget-object v0, v4, LYue/ۥۡۧۨ;->ۥ۟۟۟ۡ:LYue/ۥۡۧۨ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, LYue/ۥۡۧۨ;->ۥ۟()LYue/ۥۡۧۨ;

    :cond_7
    invoke-virtual {p0, v4}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۟ۤ(LYue/ۥۡۧۨ;)V

    iput-wide p1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۦ:J

    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget-object v0, v4, LYue/ۥۡۧۨ;->ۥ:[B

    iput-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۧ:[B

    iget v0, v4, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-long/2addr p1, v5

    long-to-int p1, p1

    add-int/2addr v0, p1

    iput v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۨ:I

    iget p1, v4, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iput p1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟ۡ:I

    sub-int/2addr p1, v0

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۟ۤ(LYue/ۥۡۧۨ;)V

    iput-wide p1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۦ:J

    iput-object v0, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۧ:[B

    const/4 p1, -0x1

    iput p1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۨ:I

    iput p1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟ۡ:I

    :goto_4
    return p1

    :cond_9
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "offset="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " > size="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide p1

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "not attached to a buffer"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟ۤ(LYue/ۥۡۧۨ;)V
    .locals 0
    .param p1    # LYue/ۥۡۧۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۧۨ;

    return-void
.end method
