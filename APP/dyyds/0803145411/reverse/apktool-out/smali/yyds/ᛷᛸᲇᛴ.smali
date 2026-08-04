.class public final Lyyds/ᛷᛸᲇᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

.field public final ᛲᛳᛶᲁ:Ljava/util/List;

.field public final ᛲᛴᛳᛲ:Lyyds/ᲁᲁᲈᛵ;

.field public final ᛲᲈᲁ:Lyyds/ᛱᛵᲈᲁ;

.field public final ᛵᛸᛸᛷ:Ljavax/net/SocketFactory;

.field public final ᛶᛷᛲᲁ:Ljava/net/ProxySelector;

.field public final ᛷᲈᲈᲁ:Ljava/util/List;

.field public final ᲀᛲᛳᲀ:Ljavax/net/ssl/SSLSocketFactory;

.field public final ᲇᲇᲇᛱ:Lyyds/ᲈᛵᛴᲀ;

.field public final ᲇᲈᛵᛷ:Ljavax/net/ssl/HostnameVerifier;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILyyds/ᛱᛵᲈᲁ;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lyyds/ᲁᲁᲈᛵ;Lyyds/ᲈᛵᛴᲀ;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, Lyyds/ᛷᛸᲇᛴ;->ᛲᲈᲁ:Lyyds/ᛱᛵᲈᲁ;

    .line 3
    iput-object p4, p0, Lyyds/ᛷᛸᲇᛴ;->ᛵᛸᛸᛷ:Ljavax/net/SocketFactory;

    .line 4
    iput-object p5, p0, Lyyds/ᛷᛸᲇᛴ;->ᲀᛲᛳᲀ:Ljavax/net/ssl/SSLSocketFactory;

    .line 5
    iput-object p6, p0, Lyyds/ᛷᛸᲇᛴ;->ᲇᲈᛵᛷ:Ljavax/net/ssl/HostnameVerifier;

    .line 6
    iput-object p7, p0, Lyyds/ᛷᛸᲇᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᲈᛵ;

    .line 7
    iput-object p8, p0, Lyyds/ᛷᛸᲇᛴ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛵᛴᲀ;

    .line 8
    iput-object p11, p0, Lyyds/ᛷᛸᲇᛴ;->ᛶᛷᛲᲁ:Ljava/net/ProxySelector;

    .line 9
    new-instance p3, Lyyds/ᛱᛲᛴᛲ;

    invoke-direct {p3}, Lyyds/ᛱᛲᛴᛲ;-><init>()V

    .line 10
    const-string p4, "http"

    const-string p6, "https"

    if-eqz p5, :cond_0

    move-object p5, p6

    goto :goto_0

    :cond_0
    move-object p5, p4

    .line 11
    :goto_0
    invoke-virtual {p5, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p7

    const/4 p8, 0x0

    if-eqz p7, :cond_1

    .line 12
    iput-object p4, p3, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    goto :goto_1

    .line 13
    :cond_1
    invoke-virtual {p5, p6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_4

    .line 14
    iput-object p6, p3, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    :goto_1
    const/4 p4, 0x7

    const/4 p5, 0x0

    .line 15
    invoke-static {p5, p5, p4, p1}, Lyyds/ᛴᛶᲀᛲ;->ᛷᛵᲇᲀ(IIILjava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lyyds/ᛲᛸᲇᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_3

    .line 16
    iput-object p4, p3, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    const/4 p1, 0x1

    if-gt p1, p2, :cond_2

    const/high16 p1, 0x10000

    if-ge p2, p1, :cond_2

    .line 17
    iput p2, p3, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 18
    invoke-virtual {p3}, Lyyds/ᛱᛲᛴᛲ;->ᛲᲈᲁ()Lyyds/ᛱᛲᲀᛶ;

    move-result-object p1

    iput-object p1, p0, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 19
    invoke-static {p9}, Lyyds/ᛴᛲᛲᲇ;->ᛷᲈᲈᲁ(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lyyds/ᛷᛸᲇᛴ;->ᛲᛳᛶᲁ:Ljava/util/List;

    .line 20
    invoke-static {p10}, Lyyds/ᛴᛲᛲᲇ;->ᛷᲈᲈᲁ(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lyyds/ᛷᛸᲇᛴ;->ᛷᲈᲈᲁ:Ljava/util/List;

    return-void

    .line 21
    :cond_2
    const-string p0, "unexpected port: "

    .line 22
    invoke-static {p2, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 23
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    throw p8

    .line 24
    :cond_3
    const-string p0, "unexpected host: "

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    throw p8

    .line 25
    :cond_4
    const-string p0, "unexpected scheme: "

    invoke-virtual {p0, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    throw p8
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lyyds/ᛷᛸᲇᛴ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛷᛸᲇᛴ;

    .line 6
    .line 7
    iget-object v0, p1, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lyyds/ᛱᛲᲀᛶ;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lyyds/ᛷᛸᲇᛴ;->ᛲᲈᲁ(Lyyds/ᛷᛸᲇᛴ;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    const/16 v1, 0x20f

    .line 6
    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lyyds/ᛷᛸᲇᛴ;->ᛲᲈᲁ:Lyyds/ᛱᛵᲈᲁ;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    mul-int/2addr v1, v2

    .line 21
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛵᛴᲀ;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/2addr v0, v1

    .line 28
    mul-int/2addr v0, v2

    .line 29
    iget-object v1, p0, Lyyds/ᛷᛸᲇᛴ;->ᛲᛳᛶᲁ:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/2addr v1, v2

    .line 37
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛷᲈᲈᲁ:Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    add-int/2addr v0, v1

    .line 44
    mul-int/2addr v0, v2

    .line 45
    iget-object v1, p0, Lyyds/ᛷᛸᲇᛴ;->ᛶᛷᛲᲁ:Ljava/net/ProxySelector;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v1, v0

    .line 52
    mul-int/lit16 v1, v1, 0x3c1

    .line 53
    .line 54
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᲀᛲᛳᲀ:Ljavax/net/ssl/SSLSocketFactory;

    .line 55
    .line 56
    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/2addr v0, v1

    .line 61
    mul-int/2addr v0, v2

    .line 62
    iget-object v1, p0, Lyyds/ᛷᛸᲇᛴ;->ᲇᲈᛵᛷ:Ljavax/net/ssl/HostnameVerifier;

    .line 63
    .line 64
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-int/2addr v1, v0

    .line 69
    mul-int/2addr v1, v2

    .line 70
    iget-object p0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᲈᛵ;

    .line 71
    .line 72
    invoke-static {p0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    add-int/2addr p0, v1

    .line 77
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Address{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 9
    .line 10
    iget-object v2, v1, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v2, 0x3a

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, v1, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, "proxySelector="

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛶᛷᛲᲁ:Ljava/net/ProxySelector;

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const/16 p0, 0x7d

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛷᛸᲇᛴ;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛲᲈᲁ:Lyyds/ᛱᛵᲈᲁ;

    .line 2
    .line 3
    iget-object v1, p1, Lyyds/ᛷᛸᲇᛴ;->ᛲᲈᲁ:Lyyds/ᛱᛵᲈᲁ;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛵᛴᲀ;

    .line 12
    .line 13
    iget-object v1, p1, Lyyds/ᛷᛸᲇᛴ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛵᛴᲀ;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛲᛳᛶᲁ:Ljava/util/List;

    .line 22
    .line 23
    iget-object v1, p1, Lyyds/ᛷᛸᲇᛴ;->ᛲᛳᛶᲁ:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛷᲈᲈᲁ:Ljava/util/List;

    .line 32
    .line 33
    iget-object v1, p1, Lyyds/ᛷᛸᲇᛴ;->ᛷᲈᲈᲁ:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛶᛷᛲᲁ:Ljava/net/ProxySelector;

    .line 42
    .line 43
    iget-object v1, p1, Lyyds/ᛷᛸᲇᛴ;->ᛶᛷᛲᲁ:Ljava/net/ProxySelector;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᲀᛲᛳᲀ:Ljavax/net/ssl/SSLSocketFactory;

    .line 52
    .line 53
    iget-object v1, p1, Lyyds/ᛷᛸᲇᛴ;->ᲀᛲᛳᲀ:Ljavax/net/ssl/SSLSocketFactory;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᲇᲈᛵᛷ:Ljavax/net/ssl/HostnameVerifier;

    .line 62
    .line 63
    iget-object v1, p1, Lyyds/ᛷᛸᲇᛴ;->ᲇᲈᛵᛷ:Ljavax/net/ssl/HostnameVerifier;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    iget-object v0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᲈᛵ;

    .line 72
    .line 73
    iget-object v1, p1, Lyyds/ᛷᛸᲇᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᲈᛵ;

    .line 74
    .line 75
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_0

    .line 80
    .line 81
    iget-object p0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 82
    .line 83
    iget p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ:I

    .line 84
    .line 85
    iget-object p1, p1, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 86
    .line 87
    iget p1, p1, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ:I

    .line 88
    .line 89
    if-ne p0, p1, :cond_0

    .line 90
    .line 91
    const/4 p0, 0x1

    .line 92
    return p0

    .line 93
    :cond_0
    const/4 p0, 0x0

    .line 94
    return p0
.end method
