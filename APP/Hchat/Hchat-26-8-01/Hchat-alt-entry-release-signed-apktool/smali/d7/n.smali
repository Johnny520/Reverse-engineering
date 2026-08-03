.class public final Ld7/n;
.super Ld7/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final m:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ld7/n;->m:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x41t
        0x50t
        0x4bt
        0x20t
        0x53t
        0x69t
        0x67t
        0x20t
        0x42t
        0x6ct
        0x6ft
        0x63t
        0x6bt
        0x20t
        0x34t
        0x32t
    .end array-data
.end method


# virtual methods
.method public final S(Ljava/io/InputStream;)I
    .locals 3

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lr7/b;->M(IZ)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr7/b;->k:[B

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    invoke-virtual {p1, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr7/b;->k:[B

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v1, v2}, Lk7/a;->t([BI)J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, " ["

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p0, Lr7/b;->k:[B

    .line 24
    .line 25
    array-length v4, v3

    .line 26
    const/16 v5, 0x8

    .line 27
    .line 28
    sub-int/2addr v4, v5

    .line 29
    if-gtz v4, :cond_0

    .line 30
    .line 31
    new-array v2, v2, [B

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/16 v6, 0x10

    .line 35
    .line 36
    if-le v6, v4, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v4, v6

    .line 40
    :goto_0
    new-array v6, v4, [B

    .line 41
    .line 42
    invoke-static {v3, v5, v6, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    .line 44
    .line 45
    move-object v2, v6

    .line 46
    :goto_1
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    .line 47
    .line 48
    .line 49
    const-string v2, "]"

    .line 50
    .line 51
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
