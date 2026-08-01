.class public abstract Lxhss/ᛱᛱᛲᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:[J

.field public static final ᛷᛵᛵᲈ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "0123456789abcdef"

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lxhss/ᛱᛱᛲᲇ;->ᛷᛵᛵᲈ:[B

    .line 10
    .line 11
    const/16 v0, 0x14

    .line 12
    .line 13
    new-array v0, v0, [J

    .line 14
    .line 15
    fill-array-data v0, :array_0

    .line 16
    .line 17
    .line 18
    sput-object v0, Lxhss/ᛱᛱᛲᲇ;->ᛱᛱᛲᲇ:[J

    .line 19
    .line 20
    return-void

    .line 21
    :array_0
    .array-data 8
        -0x1
        0x9
        0x63
        0x3e7
        0x270f
        0x1869f
        0xf423f
        0x98967f
        0x5f5e0ff
        0x3b9ac9ff
        0x2540be3ffL
        0x174876e7ffL
        0xe8d4a50fffL
        0x9184e729fffL
        0x5af3107a3fffL
        0x38d7ea4c67fffL
        0x2386f26fc0ffffL
        0x16345785d89ffffL
        0xde0b6b3a763ffffL
        0x7fffffffffffffffL
    .end array-data
.end method

.method public static final ᛷᛵᛵᲈ(JLxhss/ᛴᛲᛴᛶ;)Ljava/lang/String;
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    const-wide/16 v1, 0x1

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    sub-long v3, p0, v1

    .line 10
    .line 11
    invoke-virtual {p2, v3, v4}, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ(J)B

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v5, 0xd

    .line 16
    .line 17
    if-ne v0, v5, :cond_0

    .line 18
    .line 19
    sget-object p0, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    .line 20
    .line 21
    invoke-virtual {p2, v3, v4, p0}, Lxhss/ᛴᛲᛴᛶ;->ᛳᲈᲈᛲ(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-wide/16 v0, 0x2

    .line 26
    .line 27
    invoke-virtual {p2, v0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛶᛴᲈ(J)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    sget-object v0, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    .line 32
    .line 33
    invoke-virtual {p2, p0, p1, v0}, Lxhss/ᛴᛲᛴᛶ;->ᛳᲈᲈᛲ(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p2, v1, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛶᛴᲈ(J)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method
