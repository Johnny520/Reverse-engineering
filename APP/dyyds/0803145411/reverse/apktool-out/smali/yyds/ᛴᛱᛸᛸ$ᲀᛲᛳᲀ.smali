.class final Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᛴᛱᛸᛸ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u1c80\u16f2\u16f3\u1c80"
.end annotation


# instance fields
.field private final ᛲᲈᲁ:[B

.field private final ᛵᛸᛸᛷ:[B


# direct methods
.method public constructor <init>([B[B)V
    .locals 2

    .line 1
    const-wide v0, -0x1ed8ce68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x1ed96e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛲᲈᲁ:[B

    .line 21
    .line 22
    iput-object p2, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛵᛸᛸᛷ:[B

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic ᲇᲈᛵᛷ(Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;[B[BILjava/lang/Object;)Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛲᲈᲁ:[B

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛵᛸᛸᛷ:[B

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᲀᛲᛳᲀ([B[B)Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;

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
    check-cast p1, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛲᲈᲁ:[B

    .line 14
    .line 15
    iget-object v3, p1, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛲᲈᲁ:[B

    .line 16
    .line 17
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛵᛸᛸᛷ:[B

    .line 25
    .line 26
    iget-object p1, p1, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛵᛸᛸᛷ:[B

    .line 27
    .line 28
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛲᲈᲁ:[B

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛵᛸᛸᛷ:[B

    .line 10
    .line 11
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([B)I

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
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x1edace68a836eL

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
    iget-object v1, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛲᲈᲁ:[B

    .line 16
    .line 17
    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-wide v1, -0x1edc3e68a836eL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛵᛸᛸᛷ:[B

    .line 37
    .line 38
    invoke-static {p0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 p0, 0x29

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛵᛸᛸᛷ:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛲᲈᲁ()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛲᲈᲁ:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛵᛸᛸᛷ:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ([B[B)Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;
    .locals 2

    .line 1
    const-wide v0, -0x1ed9ce68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x1eda6e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    new-instance p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;

    .line 18
    .line 19
    invoke-direct {p0, p1, p2}, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;-><init>([B[B)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᲀᛲᛳᲀ;->ᛲᲈᲁ:[B

    .line 2
    .line 3
    return-object p0
.end method
