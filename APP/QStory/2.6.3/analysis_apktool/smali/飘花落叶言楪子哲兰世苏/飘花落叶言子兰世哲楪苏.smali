.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:J

.field public static final 飘花落叶言子楪世哲兰苏:[B

.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;-><init>(Ljava/util/function/Function;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;

    .line 8
    .line 9
    const-string v0, "[B"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;->飘花落叶言子楪世哲兰苏:[B

    .line 16
    .line 17
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sput-wide v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;->飘花落叶言子楪世兰苏哲:J

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/util/function/Function;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世兰楪哲苏(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    const-class p3, [B

    .line 8
    .line 9
    if-ne p2, p3, :cond_0

    .line 10
    .line 11
    sget-object p3, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;->飘花落叶言子楪世哲兰苏:[B

    .line 12
    .line 13
    sget-wide p4, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;->飘花落叶言子楪世兰苏哲:J

    .line 14
    .line 15
    invoke-virtual {p1, p4, p5, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, [B

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object p0, p2

    .line 44
    check-cast p0, [B

    .line 45
    .line 46
    :goto_1
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪苏世兰([B)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰世哲楪苏;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, [B

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move-object p0, p2

    .line 19
    check-cast p0, [B

    .line 20
    .line 21
    :goto_0
    iget-object p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 22
    .line 23
    const-string p2, "millis"

    .line 24
    .line 25
    const/4 p3, 0x0

    .line 26
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    const-string p2, "gzip"

    .line 30
    .line 31
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    const-string p4, "gzip,base64"

    .line 36
    .line 37
    if-nez p2, :cond_2

    .line 38
    .line 39
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_4

    .line 44
    .line 45
    :cond_2
    :try_start_0
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    .line 46
    .line 47
    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 48
    .line 49
    .line 50
    array-length v0, p0

    .line 51
    const/16 v1, 0x200

    .line 52
    .line 53
    if-ge v0, v1, :cond_3

    .line 54
    .line 55
    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    .line 56
    .line 57
    array-length v1, p0

    .line 58
    invoke-direct {v0, p2, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_4

    .line 64
    :catch_0
    move-exception p0

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    .line 67
    .line 68
    invoke-direct {v0, p2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    :goto_1
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->finish()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 78
    .line 79
    .line 80
    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰(Ljava/io/Closeable;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    const-string p2, "base64"

    .line 85
    .line 86
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-nez p2, :cond_6

    .line 91
    .line 92
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-nez p2, :cond_6

    .line 97
    .line 98
    invoke-virtual {p1, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰(J)J

    .line 99
    .line 100
    .line 101
    move-result-wide p2

    .line 102
    sget-object p4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteByteArrayAsBase64:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 103
    .line 104
    iget-wide p4, p4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 105
    .line 106
    and-long/2addr p2, p4

    .line 107
    const-wide/16 p4, 0x0

    .line 108
    .line 109
    cmp-long p2, p2, p4

    .line 110
    .line 111
    if-eqz p2, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世哲楪苏([B)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_6
    :goto_2
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪世苏兰([B)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :catchall_1
    move-exception p0

    .line 123
    move-object p3, v0

    .line 124
    goto :goto_4

    .line 125
    :catch_1
    move-exception p0

    .line 126
    move-object p3, v0

    .line 127
    :goto_3
    :try_start_2
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    .line 128
    .line 129
    const-string p2, "write gzipBytes error"

    .line 130
    .line 131
    invoke-direct {p1, p2, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    :goto_4
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰(Ljava/io/Closeable;)V

    .line 136
    .line 137
    .line 138
    throw p0
.end method
