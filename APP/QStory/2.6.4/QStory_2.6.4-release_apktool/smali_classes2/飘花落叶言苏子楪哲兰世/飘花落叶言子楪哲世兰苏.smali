.class public final L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "source("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子哲苏兰楪世(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;J)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object p2, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;

    .line 5
    .line 6
    invoke-virtual {p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰哲苏()V

    .line 7
    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    invoke-virtual {p1, p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪哲世兰(I)L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget p3, p2, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 15
    .line 16
    rsub-int p3, p3, 0x2000

    .line 17
    .line 18
    int-to-long v0, p3

    .line 19
    const-wide/16 v2, 0x2000

    .line 20
    .line 21
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    long-to-int p3, v0

    .line 26
    iget-object p0, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 27
    .line 28
    iget-object v0, p2, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:[B

    .line 29
    .line 30
    iget v1, p2, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 31
    .line 32
    invoke-virtual {p0, v0, v1, p3}, Ljava/io/InputStream;->read([BII)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const/4 p3, -0x1

    .line 37
    if-ne p0, p3, :cond_1

    .line 38
    .line 39
    iget p0, p2, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 40
    .line 41
    iget p3, p2, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 42
    .line 43
    if-ne p0, p3, :cond_0

    .line 44
    .line 45
    invoke-virtual {p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iput-object p0, p1, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;

    .line 50
    .line 51
    invoke-static {p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    const-wide/16 p0, -0x1

    .line 55
    .line 56
    return-wide p0

    .line 57
    :cond_1
    iget p3, p2, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 58
    .line 59
    add-int/2addr p3, p0

    .line 60
    iput p3, p2, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 61
    .line 62
    iget-wide p2, p1, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:J

    .line 63
    .line 64
    int-to-long v0, p0

    .line 65
    add-long/2addr p2, v0

    .line 66
    iput-wide p2, p1, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:J
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    return-wide v0

    .line 69
    :catch_0
    move-exception p0

    .line 70
    invoke-static {p0}, Lokio/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/AssertionError;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    new-instance p1, Ljava/io/IOException;

    .line 77
    .line 78
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_2
    throw p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method
