.class public final Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᛱᛶᛱᛴ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u16f2\u1c88\u1c81"
.end annotation


# instance fields
.field private final ᛲᲈᲁ:I

.field private final ᛵᛸᛸᛷ:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᲈᲁ:I

    .line 5
    .line 6
    iput-wide p2, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛵᛸᛸᛷ:J

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic ᲇᲈᛵᛷ(Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;IJILjava/lang/Object;)Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᲈᲁ:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    iget-wide p2, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛵᛸᛸᛷ:J

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᲀᛲᛳᲀ(IJ)Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 12
    .line 13
    iget v1, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᲈᲁ:I

    .line 14
    .line 15
    iget v3, p1, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-wide v3, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛵᛸᛸᛷ:J

    .line 21
    .line 22
    iget-wide p0, p1, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛵᛸᛸᛷ:J

    .line 23
    .line 24
    cmp-long p0, v3, p0

    .line 25
    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛵᛸᛸᛷ:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x1fff4e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    const-wide v2, -0x20002e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛵᛶᛲᲀ(Ljava/lang/StringBuilder;IJ)V

    .line 23
    .line 24
    .line 25
    iget-wide v1, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛵᛸᛸᛷ:J

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p0, 0x29

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    return p0
.end method

.method public final ᛲᲈᲁ()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    return p0
.end method

.method public final ᛵᛸᛸᛷ()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛵᛸᛸᛷ:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final ᲀᛲᛳᲀ(IJ)Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;-><init>(IJ)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛵᛸᛸᛷ:J

    .line 2
    .line 3
    return-wide v0
.end method
