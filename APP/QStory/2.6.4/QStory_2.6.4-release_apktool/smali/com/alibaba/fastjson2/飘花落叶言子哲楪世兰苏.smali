.class public abstract Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final 飘花落叶言子世哲楪兰苏:[Z


# instance fields
.field public 飘花落叶言子世哲楪苏兰:Z

.field public 飘花落叶言子世楪兰哲苏:I

.field public 飘花落叶言子世楪兰苏哲:S

.field public 飘花落叶言子世楪哲兰苏:S

.field public 飘花落叶言子世楪哲苏兰:B

.field public 飘花落叶言子世楪苏兰哲:Z

.field public 飘花落叶言子世楪苏哲兰:Z

.field public 飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

.field public 飘花落叶言子世苏兰楪哲:Ljava/lang/String;

.field public 飘花落叶言子世苏哲兰楪:I

.field public 飘花落叶言子世苏哲楪兰:I

.field public 飘花落叶言子世苏楪兰哲:I

.field public 飘花落叶言子世苏楪哲兰:I

.field public 飘花落叶言子楪兰世哲苏:C

.field public 飘花落叶言子楪兰世苏哲:I

.field public 飘花落叶言子楪兰哲世苏:Z

.field public 飘花落叶言子楪兰哲苏世:Z

.field public 飘花落叶言子楪兰苏世哲:Z

.field public 飘花落叶言子楪兰苏哲世:Z

.field public final 飘花落叶言子楪哲兰世苏:Z

.field public 飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    new-array v0, v0, [Z

    .line 4
    .line 5
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏:[Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([ZZ)V

    .line 9
    .line 10
    .line 11
    const/16 v0, 0x13

    .line 12
    .line 13
    new-array v1, v0, [C

    .line 14
    .line 15
    fill-array-data v1, :array_0

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    if-ge v3, v0, :cond_0

    .line 21
    .line 22
    aget-char v4, v1, v3

    .line 23
    .line 24
    sget-object v5, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏:[Z

    .line 25
    .line 26
    aput-boolean v2, v5, v4

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 2
        0x2es
        0x65s
        0x45s
        0x74s
        0x66s
        0x6es
        0x7bs
        0x5bs
        0x30s
        0x31s
        0x32s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
    .end array-data
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 7
    .line 8
    return-void
.end method

.method public static 飘花落叶言子世苏哲楪兰(II)V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONValidException;

    .line 2
    .line 3
    const-string v1, "error, offset "

    .line 4
    .line 5
    const-string v2, ", char "

    .line 6
    .line 7
    invoke-static {p0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    int-to-char p1, p1

    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONValidException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public static 飘花落叶言子哲兰苏楪世(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x41

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x5a

    .line 6
    .line 7
    if-le p0, v0, :cond_4

    .line 8
    .line 9
    :cond_0
    const/16 v0, 0x61

    .line 10
    .line 11
    if-lt p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x7a

    .line 14
    .line 15
    if-le p0, v0, :cond_4

    .line 16
    .line 17
    :cond_1
    const/16 v0, 0x5f

    .line 18
    .line 19
    if-eq p0, v0, :cond_4

    .line 20
    .line 21
    const/16 v0, 0x24

    .line 22
    .line 23
    if-eq p0, v0, :cond_4

    .line 24
    .line 25
    const/16 v0, 0x30

    .line 26
    .line 27
    if-lt p0, v0, :cond_2

    .line 28
    .line 29
    const/16 v0, 0x39

    .line 30
    .line 31
    if-le p0, v0, :cond_4

    .line 32
    .line 33
    :cond_2
    const/16 v0, 0x7f

    .line 34
    .line 35
    if-le p0, v0, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public static 飘花落叶言子楪哲世苏兰(II)C
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏世兰:[I

    .line 2
    .line 3
    aget p0, v0, p0

    .line 4
    .line 5
    mul-int/lit8 p0, p0, 0x10

    .line 6
    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    add-int/2addr p0, p1

    .line 10
    int-to-char p0, p0

    .line 11
    return p0
.end method

.method public static 飘花落叶言楪哲兰世苏子(JLjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-wide/16 v0, 0x4000

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :cond_0
    const-wide/32 v0, 0x8000000

    .line 15
    .line 16
    .line 17
    and-long/2addr p0, v0

    .line 18
    cmp-long p0, p0, v2

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_1
    return-object p2
.end method

.method public static 飘花落叶言楪哲兰苏子世(II)Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "syntax error, offset "

    .line 4
    .line 5
    const-string v2, ", char "

    .line 6
    .line 7
    invoke-static {p0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    int-to-char p1, p1

    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static 飘花落叶言楪子世兰哲苏(II)Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "illegal number, offset "

    .line 4
    .line 5
    const-string v2, ", char "

    .line 6
    .line 7
    invoke-static {p0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    int-to-char p1, p1

    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static 飘花落叶言楪子苏世兰哲(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-interface {v2, p0}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, [B

    .line 25
    .line 26
    array-length v2, v1

    .line 27
    new-instance v3, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏世兰;

    .line 28
    .line 29
    invoke-direct {v3, p1, p0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏世兰;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;Ljava/lang/String;[BI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-object v3

    .line 33
    :catch_0
    const-string p0, "unsafe get String.coder error"

    .line 34
    .line 35
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    sget v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 44
    .line 45
    const/16 v2, 0x8

    .line 46
    .line 47
    if-ne v1, v2, :cond_1

    .line 48
    .line 49
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :goto_0
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;

    .line 59
    .line 60
    invoke-direct {v2, p1, p0, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;Ljava/lang/String;[CI)V

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :cond_2
    throw v0
.end method

.method public static 飘花落叶言楪子苏世哲兰(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;
    .locals 1

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世兰哲(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public final 飘花落叶言子世兰哲楪苏()D
    .locals 9

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const-wide/16 v5, 0x0

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-string v0, "TODO : "

    .line 14
    .line 15
    iget-byte p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 16
    .line 17
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-wide v5

    .line 21
    :pswitch_0
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 22
    .line 23
    return-wide v0

    .line 24
    :pswitch_1
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲苏楪兰()Ljava/math/BigDecimal;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 29
    .line 30
    .line 31
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-wide v0

    .line 33
    :catch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()Lcom/alibaba/fastjson2/JSONException;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    throw p0

    .line 38
    :pswitch_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/Collection;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/Object;)D

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    return-wide v0

    .line 58
    :cond_1
    :goto_0
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 59
    .line 60
    return-wide v5

    .line 61
    :pswitch_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/util/Map;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/Object;)D

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    return-wide v0

    .line 79
    :cond_3
    :goto_1
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 80
    .line 81
    return-wide v5

    .line 82
    :pswitch_4
    iget-wide v3, v3, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 83
    .line 84
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 85
    .line 86
    iget-wide v7, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 87
    .line 88
    and-long/2addr v3, v7

    .line 89
    cmp-long v0, v3, v1

    .line 90
    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    const-string v0, "long value not support input null"

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-wide v5

    .line 104
    :pswitch_5
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 105
    .line 106
    if-eqz p0, :cond_5

    .line 107
    .line 108
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 109
    .line 110
    return-wide v0

    .line 111
    :cond_5
    :goto_2
    return-wide v5

    .line 112
    :pswitch_6
    :try_start_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/Object;)D

    .line 115
    .line 116
    .line 117
    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 118
    return-wide v0

    .line 119
    :catch_1
    move-exception v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-wide v5

    .line 132
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    return-wide v0

    .line 141
    :pswitch_8
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 142
    .line 143
    if-nez v0, :cond_7

    .line 144
    .line 145
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 146
    .line 147
    if-nez v0, :cond_7

    .line 148
    .line 149
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 150
    .line 151
    const/high16 v4, -0x80000000

    .line 152
    .line 153
    if-eq v0, v4, :cond_7

    .line 154
    .line 155
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 156
    .line 157
    if-eqz p0, :cond_6

    .line 158
    .line 159
    neg-int p0, v0

    .line 160
    int-to-double v0, p0

    .line 161
    return-wide v0

    .line 162
    :cond_6
    int-to-double v0, v0

    .line 163
    return-wide v0

    .line 164
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    instance-of v4, v0, Ljava/math/BigInteger;

    .line 169
    .line 170
    if-eqz v4, :cond_9

    .line 171
    .line 172
    check-cast v0, Ljava/math/BigInteger;

    .line 173
    .line 174
    iget-wide v3, v3, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 175
    .line 176
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 177
    .line 178
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 179
    .line 180
    and-long/2addr v3, v5

    .line 181
    cmp-long v1, v3, v1

    .line 182
    .line 183
    if-eqz v1, :cond_8

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    .line 186
    .line 187
    .line 188
    move-result-wide v0

    .line 189
    long-to-double v0, v0

    .line 190
    return-wide v0

    .line 191
    :cond_8
    :try_start_2
    invoke-static {v0}, Landroidx/core/view/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(Ljava/math/BigInteger;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v0
    :try_end_2
    .catch Ljava/lang/ArithmeticException; {:try_start_2 .. :try_end_2} :catch_2

    .line 195
    long-to-double v0, v0

    .line 196
    return-wide v0

    .line 197
    :catch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()Lcom/alibaba/fastjson2/JSONException;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    throw p0

    .line 202
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 203
    .line 204
    .line 205
    move-result-wide v0

    .line 206
    return-wide v0

    .line 207
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子世哲楪兰苏(J)J
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    or-long p0, v0, p1

    .line 6
    .line 7
    return-wide p0
.end method

.method public final 飘花落叶言子世哲苏楪兰()Ljava/math/BigDecimal;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    iget-byte v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 10
    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    const-wide/32 v5, 0x7fffffff

    .line 14
    .line 15
    .line 16
    const/4 v7, 0x4

    .line 17
    const-wide v8, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const/4 v10, 0x3

    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x2

    .line 25
    const/4 v13, 0x1

    .line 26
    if-eq v0, v13, :cond_13

    .line 27
    .line 28
    if-eq v0, v12, :cond_8

    .line 29
    .line 30
    if-eq v0, v10, :cond_7

    .line 31
    .line 32
    if-eq v0, v7, :cond_5

    .line 33
    .line 34
    const/4 v3, 0x6

    .line 35
    const-string v4, "TODO : "

    .line 36
    .line 37
    if-eq v0, v3, :cond_2

    .line 38
    .line 39
    const/16 v3, 0x8

    .line 40
    .line 41
    if-ne v0, v3, :cond_1

    .line 42
    .line 43
    iget-object v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :cond_1
    iget-byte v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 51
    .line 52
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_2
    iget-object v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 59
    .line 60
    const-string v3, "value"

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    const-string v3, "$numberDecimal"

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :cond_3
    if-eqz v3, :cond_4

    .line 75
    .line 76
    return-object v3

    .line 77
    :cond_4
    iget-byte v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 78
    .line 79
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v2

    .line 83
    :cond_5
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 84
    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    sget-object v0, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_6
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_7
    :try_start_0
    iget-object v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 96
    .line 97
    .line 98
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    return-object v0

    .line 100
    :catch_0
    move-exception v0

    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v4, "read decimal error, value "

    .line 104
    .line 105
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    return-object v2

    .line 125
    :cond_8
    iget-short v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 126
    .line 127
    if-nez v0, :cond_c

    .line 128
    .line 129
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 130
    .line 131
    if-nez v0, :cond_c

    .line 132
    .line 133
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 134
    .line 135
    if-nez v0, :cond_c

    .line 136
    .line 137
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 138
    .line 139
    if-nez v0, :cond_a

    .line 140
    .line 141
    iget v14, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 142
    .line 143
    if-ltz v14, :cond_a

    .line 144
    .line 145
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 146
    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    neg-int v14, v14

    .line 150
    :cond_9
    int-to-long v4, v14

    .line 151
    iget-short v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 152
    .line 153
    invoke-static {v4, v5, v0}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    goto :goto_0

    .line 158
    :cond_a
    iget v14, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 159
    .line 160
    int-to-long v14, v14

    .line 161
    and-long/2addr v14, v8

    .line 162
    int-to-long v2, v0

    .line 163
    and-long/2addr v2, v8

    .line 164
    cmp-long v0, v2, v5

    .line 165
    .line 166
    if-gtz v0, :cond_c

    .line 167
    .line 168
    shl-long/2addr v2, v4

    .line 169
    add-long/2addr v2, v14

    .line 170
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 171
    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    neg-long v2, v2

    .line 175
    :cond_b
    iget-short v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 176
    .line 177
    invoke-static {v2, v3, v0}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    goto :goto_0

    .line 182
    :cond_c
    const/4 v2, 0x0

    .line 183
    :goto_0
    if-nez v2, :cond_11

    .line 184
    .line 185
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 186
    .line 187
    if-nez v0, :cond_f

    .line 188
    .line 189
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 190
    .line 191
    if-nez v0, :cond_e

    .line 192
    .line 193
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 194
    .line 195
    if-nez v0, :cond_d

    .line 196
    .line 197
    new-array v0, v13, [I

    .line 198
    .line 199
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 200
    .line 201
    aput v2, v0, v11

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_d
    new-array v2, v12, [I

    .line 205
    .line 206
    aput v0, v2, v11

    .line 207
    .line 208
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 209
    .line 210
    aput v0, v2, v13

    .line 211
    .line 212
    :goto_1
    move-object v0, v2

    .line 213
    goto :goto_2

    .line 214
    :cond_e
    new-array v2, v10, [I

    .line 215
    .line 216
    aput v0, v2, v11

    .line 217
    .line 218
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 219
    .line 220
    aput v0, v2, v13

    .line 221
    .line 222
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 223
    .line 224
    aput v0, v2, v12

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_f
    new-array v2, v7, [I

    .line 228
    .line 229
    aput v0, v2, v11

    .line 230
    .line 231
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 232
    .line 233
    aput v0, v2, v13

    .line 234
    .line 235
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 236
    .line 237
    aput v0, v2, v12

    .line 238
    .line 239
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 240
    .line 241
    aput v0, v2, v10

    .line 242
    .line 243
    goto :goto_1

    .line 244
    :goto_2
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 245
    .line 246
    if-eqz v2, :cond_10

    .line 247
    .line 248
    const/4 v3, -0x1

    .line 249
    goto :goto_3

    .line 250
    :cond_10
    move v3, v13

    .line 251
    :goto_3
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰:Ljava/util/function/BiFunction;

    .line 252
    .line 253
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-interface {v2, v3, v0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, Ljava/math/BigInteger;

    .line 262
    .line 263
    new-instance v2, Ljava/math/BigDecimal;

    .line 264
    .line 265
    iget-short v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 266
    .line 267
    invoke-direct {v2, v0, v3}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 268
    .line 269
    .line 270
    :cond_11
    iget-short v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 271
    .line 272
    if-eqz v0, :cond_12

    .line 273
    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v2, "E"

    .line 287
    .line 288
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    iget-short v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 292
    .line 293
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 301
    .line 302
    .line 303
    move-result-wide v0

    .line 304
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪苏哲兰(D)Ljava/math/BigDecimal;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    return-object v0

    .line 309
    :cond_12
    return-object v2

    .line 310
    :cond_13
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 311
    .line 312
    if-nez v0, :cond_15

    .line 313
    .line 314
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 315
    .line 316
    if-nez v2, :cond_15

    .line 317
    .line 318
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 319
    .line 320
    if-ltz v2, :cond_15

    .line 321
    .line 322
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 323
    .line 324
    if-eqz v0, :cond_14

    .line 325
    .line 326
    neg-int v0, v2

    .line 327
    int-to-long v0, v0

    .line 328
    goto :goto_4

    .line 329
    :cond_14
    int-to-long v0, v2

    .line 330
    :goto_4
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    return-object v0

    .line 335
    :cond_15
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 336
    .line 337
    if-nez v2, :cond_19

    .line 338
    .line 339
    if-nez v0, :cond_18

    .line 340
    .line 341
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 342
    .line 343
    int-to-long v2, v0

    .line 344
    and-long/2addr v2, v8

    .line 345
    iget v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 346
    .line 347
    int-to-long v14, v7

    .line 348
    and-long/2addr v8, v14

    .line 349
    cmp-long v5, v8, v5

    .line 350
    .line 351
    if-gtz v5, :cond_17

    .line 352
    .line 353
    shl-long v4, v8, v4

    .line 354
    .line 355
    add-long/2addr v4, v2

    .line 356
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 357
    .line 358
    if-eqz v0, :cond_16

    .line 359
    .line 360
    neg-long v4, v4

    .line 361
    :cond_16
    invoke-static {v4, v5}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    return-object v0

    .line 366
    :cond_17
    new-array v2, v12, [I

    .line 367
    .line 368
    aput v7, v2, v11

    .line 369
    .line 370
    aput v0, v2, v13

    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_18
    new-array v2, v10, [I

    .line 374
    .line 375
    aput v0, v2, v11

    .line 376
    .line 377
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 378
    .line 379
    aput v0, v2, v13

    .line 380
    .line 381
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 382
    .line 383
    aput v0, v2, v12

    .line 384
    .line 385
    goto :goto_5

    .line 386
    :cond_19
    new-array v3, v7, [I

    .line 387
    .line 388
    aput v2, v3, v11

    .line 389
    .line 390
    aput v0, v3, v13

    .line 391
    .line 392
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 393
    .line 394
    aput v0, v3, v12

    .line 395
    .line 396
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 397
    .line 398
    aput v0, v3, v10

    .line 399
    .line 400
    move-object v2, v3

    .line 401
    :goto_5
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 402
    .line 403
    if-eqz v0, :cond_1a

    .line 404
    .line 405
    const/4 v3, -0x1

    .line 406
    goto :goto_6

    .line 407
    :cond_1a
    move v3, v13

    .line 408
    :goto_6
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰:Ljava/util/function/BiFunction;

    .line 409
    .line 410
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-interface {v0, v1, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    check-cast v0, Ljava/math/BigInteger;

    .line 419
    .line 420
    new-instance v1, Ljava/math/BigDecimal;

    .line 421
    .line 422
    invoke-direct {v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 423
    .line 424
    .line 425
    return-object v1
.end method

.method public final 飘花落叶言子世苏兰哲楪(Ljava/lang/Class;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    const-wide/16 v2, 0x4

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long p0, v0, v2

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    const-class p0, Ljava/io/Serializable;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p0, "not support none-Serializable, class "

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public abstract 飘花落叶言子兰世哲楪苏()Z
.end method

.method public abstract 飘花落叶言子兰世哲苏楪()Z
.end method

.method public final 飘花落叶言子兰世楪哲苏(J)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    or-long p0, v0, p1

    .line 6
    .line 7
    const-wide/16 v0, 0x40

    .line 8
    .line 9
    and-long/2addr p0, v0

    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long p0, p0, v0

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public final 飘花落叶言子兰世楪苏哲(J)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    or-long p0, v0, p1

    .line 6
    .line 7
    const-wide/16 v0, 0x8

    .line 8
    .line 9
    and-long/2addr p0, v0

    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long p0, p0, v0

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public abstract 飘花落叶言子兰世苏哲楪()V
.end method

.method public 飘花落叶言子兰世苏楪哲()Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;-><init>(II)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public 飘花落叶言子兰哲世楪苏()Z
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract 飘花落叶言子兰哲世苏楪()Z
.end method

.method public abstract 飘花落叶言子兰哲楪世苏(CCCCCC)Z
.end method

.method public abstract 飘花落叶言子兰哲楪苏世()Z
.end method

.method public abstract 飘花落叶言子兰哲苏世楪()Z
.end method

.method public abstract 飘花落叶言子兰哲苏楪世()Z
.end method

.method public 飘花落叶言子兰楪世哲苏()Z
    .locals 1

    .line 1
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v0, 0x7b

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public 飘花落叶言子兰楪世苏哲()Z
    .locals 1

    .line 1
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v0, 0x2b

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x2d

    .line 8
    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_0
    :pswitch_0
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子兰楪哲世苏(J)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    or-long p0, v0, p1

    .line 6
    .line 7
    const-wide/16 v0, 0x20

    .line 8
    .line 9
    and-long/2addr p0, v0

    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long p0, p0, v0

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public final 飘花落叶言子兰楪哲苏世()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    const-wide/16 v2, 0x8

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long p0, v0, v2

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public abstract 飘花落叶言子兰楪苏世哲()Z
.end method

.method public 飘花落叶言子兰楪苏哲世()Z
    .locals 1

    .line 1
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v0, 0x22

    .line 4
    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x27

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public abstract 飘花落叶言子兰苏世哲楪(C)Z
.end method

.method public 飘花落叶言子兰苏世楪哲(B)Z
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract 飘花落叶言子兰苏哲世楪(CCCC)Z
.end method

.method public abstract 飘花落叶言子兰苏哲楪世()Z
.end method

.method public abstract 飘花落叶言子兰苏楪世哲()Z
.end method

.method public abstract 飘花落叶言子兰苏楪哲世()Z
.end method

.method public final 飘花落叶言子哲世苏兰楪(Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_10

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;

    .line 23
    .line 24
    iget-object v3, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 25
    .line 26
    iget-object v4, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    instance-of v5, v3, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世哲苏;

    .line 32
    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_f

    .line 41
    .line 42
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 43
    .line 44
    iget-wide v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 45
    .line 46
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 47
    .line 48
    iget-wide v7, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 49
    .line 50
    and-long/2addr v5, v7

    .line 51
    const-wide/16 v7, 0x0

    .line 52
    .line 53
    cmp-long v1, v5, v7

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 58
    .line 59
    sget-object v5, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;

    .line 60
    .line 61
    invoke-direct {v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;-><init>(L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;)V

    .line 62
    .line 63
    .line 64
    iget-wide v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 65
    .line 66
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 67
    .line 68
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 69
    .line 70
    or-long/2addr v5, v7

    .line 71
    iput-wide v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 72
    .line 73
    iput-object v1, v3, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 74
    .line 75
    :cond_3
    invoke-virtual {v3, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    iget-object v3, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 80
    .line 81
    iget-object v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 82
    .line 83
    if-eqz v3, :cond_e

    .line 84
    .line 85
    instance-of v5, v2, Ljava/util/Map;

    .line 86
    .line 87
    if-eqz v5, :cond_9

    .line 88
    .line 89
    check-cast v2, Ljava/util/Map;

    .line 90
    .line 91
    instance-of v4, v3, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏兰楪;

    .line 92
    .line 93
    if-eqz v4, :cond_8

    .line 94
    .line 95
    instance-of v4, v2, Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    if-eqz v4, :cond_7

    .line 98
    .line 99
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    new-array v5, v4, [Ljava/lang/Object;

    .line 107
    .line 108
    new-array v6, v4, [Ljava/lang/Object;

    .line 109
    .line 110
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    const/4 v8, 0x0

    .line 119
    move v9, v8

    .line 120
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    if-eqz v10, :cond_6

    .line 125
    .line 126
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    check-cast v10, Ljava/util/Map$Entry;

    .line 131
    .line 132
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    if-ne v3, v11, :cond_5

    .line 137
    .line 138
    aput-object v1, v5, v9

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    aput-object v11, v5, v9

    .line 142
    .line 143
    :goto_3
    add-int/lit8 v11, v9, 0x1

    .line 144
    .line 145
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    aput-object v10, v6, v9

    .line 150
    .line 151
    move v9, v11

    .line 152
    goto :goto_2

    .line 153
    :cond_6
    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 154
    .line 155
    .line 156
    :goto_4
    if-ge v8, v4, :cond_1

    .line 157
    .line 158
    aget-object v3, v5, v8

    .line 159
    .line 160
    aget-object v7, v6, v8

    .line 161
    .line 162
    invoke-interface {v2, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    add-int/lit8 v8, v8, 0x1

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_8
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_9
    instance-of v5, v3, Ljava/lang/Integer;

    .line 183
    .line 184
    if-eqz v5, :cond_e

    .line 185
    .line 186
    instance-of v5, v2, Ljava/util/List;

    .line 187
    .line 188
    if-eqz v5, :cond_c

    .line 189
    .line 190
    check-cast v3, Ljava/lang/Integer;

    .line 191
    .line 192
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    check-cast v2, Ljava/util/List;

    .line 197
    .line 198
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-ne v3, v4, :cond_a

    .line 203
    .line 204
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_a
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-ge v3, v4, :cond_b

    .line 214
    .line 215
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    if-nez v4, :cond_b

    .line 220
    .line 221
    invoke-interface {v2, v3, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :cond_b
    invoke-interface {v2, v3, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_c
    instance-of v5, v2, [Ljava/lang/Object;

    .line 232
    .line 233
    if-eqz v5, :cond_d

    .line 234
    .line 235
    check-cast v3, Ljava/lang/Integer;

    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    check-cast v2, [Ljava/lang/Object;

    .line 242
    .line 243
    aput-object v1, v2, v3

    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_d
    instance-of v3, v2, Ljava/util/Collection;

    .line 248
    .line 249
    if-eqz v3, :cond_e

    .line 250
    .line 251
    check-cast v2, Ljava/util/Collection;

    .line 252
    .line 253
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_e
    invoke-virtual {v4, v2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_f
    const-string p0, "reference path invalid : "

    .line 264
    .line 265
    invoke-static {v3, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    :cond_10
    :goto_5
    return-void
.end method

.method public final 飘花落叶言子哲兰世楪苏(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    iget-wide p0, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 6
    .line 7
    and-long/2addr p0, v0

    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    cmp-long p0, p0, v0

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public 飘花落叶言子哲兰世苏楪()Z
    .locals 1

    .line 1
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public 飘花落叶言子哲兰楪世苏()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public 飘花落叶言子哲兰楪苏世()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public 飘花落叶言子哲兰苏世楪()Z
    .locals 1

    .line 1
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v0, 0x2d

    .line 4
    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x2b

    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const/16 v0, 0x30

    .line 12
    .line 13
    if-lt p0, v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x39

    .line 16
    .line 17
    if-gt p0, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public 飘花落叶言子哲楪兰苏世()B
    .locals 0

    .line 1
    const/16 p0, -0x80

    .line 2
    .line 3
    return p0
.end method

.method public abstract 飘花落叶言子哲楪苏世兰()I
.end method

.method public 飘花落叶言子哲苏兰世楪()Z
    .locals 1

    .line 1
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v0, 0x5b

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public 飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, ", offset "

    .line 11
    .line 12
    invoke-static {p1, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v0, "offset "

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/Collection;ILcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-direct {v0, v1, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;-><init>(Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;Ljava/lang/Object;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;ILjava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p3, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p3, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;ILcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final 飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONException;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final 飘花落叶言子楪兰苏哲世()V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONValidException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "error, offset "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ", char "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONValidException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final 飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/JSONObject;)Ljava/math/BigDecimal;
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "$numberDecimal"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "can not cast to decimal "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    throw p0
.end method

.method public 飘花落叶言子楪哲苏世兰(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世(I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/16 v4, 0x27

    .line 8
    .line 9
    if-ne p1, v4, :cond_1

    .line 10
    .line 11
    const-wide v5, 0x80000000L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    and-long/2addr v5, v0

    .line 17
    cmp-long v5, v5, v2

    .line 18
    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世哲兰苏()Lcom/alibaba/fastjson2/JSONException;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    throw p0

    .line 27
    :cond_1
    :goto_0
    const/16 v5, 0x22

    .line 28
    .line 29
    if-eq p1, v5, :cond_3

    .line 30
    .line 31
    if-eq p1, v4, :cond_3

    .line 32
    .line 33
    const-wide/32 v4, 0x20000

    .line 34
    .line 35
    .line 36
    and-long/2addr v0, v4

    .line 37
    cmp-long p1, v0, v2

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子哲兰苏()J

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世哲兰苏()Lcom/alibaba/fastjson2/JSONException;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    throw p0

    .line 51
    :cond_3
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    instance-of v0, p1, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;

    .line 23
    .line 24
    invoke-direct {v0, v1, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;-><init>(Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;Ljava/lang/Object;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(I)C
    .locals 3

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x23

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    sparse-switch p1, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    packed-switch p1, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    packed-switch p1, :pswitch_data_2

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "unclosed.str \'\\"

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    int-to-char p1, p1

    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v0

    .line 45
    :pswitch_0
    const/4 p0, 0x7

    .line 46
    return p0

    .line 47
    :pswitch_1
    const/4 p0, 0x6

    .line 48
    return p0

    .line 49
    :pswitch_2
    const/4 p0, 0x5

    .line 50
    return p0

    .line 51
    :pswitch_3
    const/4 p0, 0x4

    .line 52
    return p0

    .line 53
    :pswitch_4
    const/4 p0, 0x3

    .line 54
    return p0

    .line 55
    :pswitch_5
    const/4 p0, 0x2

    .line 56
    return p0

    .line 57
    :pswitch_6
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :pswitch_7
    return v0

    .line 60
    :sswitch_0
    const/16 p0, 0xb

    .line 61
    .line 62
    return p0

    .line 63
    :sswitch_1
    const/16 p0, 0x9

    .line 64
    .line 65
    return p0

    .line 66
    :sswitch_2
    const/16 p0, 0xd

    .line 67
    .line 68
    return p0

    .line 69
    :sswitch_3
    const/16 p0, 0xa

    .line 70
    .line 71
    return p0

    .line 72
    :sswitch_4
    const/16 p0, 0x8

    .line 73
    .line 74
    return p0

    .line 75
    :sswitch_5
    const/16 p0, 0xc

    .line 76
    .line 77
    return p0

    .line 78
    :cond_0
    :pswitch_8
    :sswitch_6
    int-to-char p0, p1

    .line 79
    return p0

    .line 80
    nop

    .line 81
    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_6
        0x2c -> :sswitch_6
        0x40 -> :sswitch_6
        0x46 -> :sswitch_5
        0x5f -> :sswitch_6
        0x62 -> :sswitch_4
        0x66 -> :sswitch_5
        0x6e -> :sswitch_3
        0x72 -> :sswitch_2
        0x74 -> :sswitch_1
        0x76 -> :sswitch_0
        0x7e -> :sswitch_6
    .end sparse-switch

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    :pswitch_data_0
    .packed-switch 0x26
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
    .end packed-switch

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    :pswitch_data_1
    .packed-switch 0x2e
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    :pswitch_data_2
    .packed-switch 0x5b
        :pswitch_8
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method

.method public final 飘花落叶言子苏兰世楪哲(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 6
    .line 7
    iget-wide v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 8
    .line 9
    const-wide/16 v3, 0x1

    .line 10
    .line 11
    and-long/2addr v1, v3

    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    cmp-long p0, v1, v3

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    invoke-virtual {v0, p1, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public abstract 飘花落叶言子苏兰哲世楪()Ljava/lang/String;
.end method

.method public final 飘花落叶言子苏兰哲楪世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 6
    .line 7
    invoke-virtual {v1, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object p1, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 21
    .line 22
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 23
    .line 24
    or-long p2, v0, p3

    .line 25
    .line 26
    invoke-virtual {p1, p0, p5, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public abstract 飘花落叶言子苏哲世楪兰()J
.end method

.method public final 飘花落叶言子苏哲兰楪世()Ljava/lang/Number;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/16 v16, 0x0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    iget-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 12
    .line 13
    const-string v6, "shortValue overflow"

    .line 14
    .line 15
    const/4 v7, -0x1

    .line 16
    const/4 v8, 0x4

    .line 17
    const-string v9, "E"

    .line 18
    .line 19
    const-wide v10, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    const/4 v12, 0x3

    .line 25
    iget-object v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 26
    .line 27
    const-wide/16 v14, 0x0

    .line 28
    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    const/16 v17, 0x20

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const-wide/32 v18, 0x7fffffff

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    packed-switch v1, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    const-string v1, "TODO : "

    .line 43
    .line 44
    iget-byte v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 45
    .line 46
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v16

    .line 50
    :pswitch_0
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 51
    .line 52
    if-nez v1, :cond_3

    .line 53
    .line 54
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 55
    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 59
    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    new-array v1, v4, [I

    .line 63
    .line 64
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 65
    .line 66
    aput v2, v1, v3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    new-array v2, v2, [I

    .line 70
    .line 71
    aput v1, v2, v3

    .line 72
    .line 73
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 74
    .line 75
    aput v1, v2, v4

    .line 76
    .line 77
    move-object v1, v2

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-array v5, v12, [I

    .line 80
    .line 81
    aput v1, v5, v3

    .line 82
    .line 83
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 84
    .line 85
    aput v1, v5, v4

    .line 86
    .line 87
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 88
    .line 89
    aput v1, v5, v2

    .line 90
    .line 91
    :goto_0
    move-object v1, v5

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    new-array v5, v8, [I

    .line 94
    .line 95
    aput v1, v5, v3

    .line 96
    .line 97
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 98
    .line 99
    aput v1, v5, v4

    .line 100
    .line 101
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 102
    .line 103
    aput v1, v5, v2

    .line 104
    .line 105
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 106
    .line 107
    aput v1, v5, v12

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :goto_1
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 111
    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    move v7, v4

    .line 116
    :goto_2
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰:Ljava/util/function/BiFunction;

    .line 117
    .line 118
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-interface {v2, v3, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/math/BigInteger;

    .line 127
    .line 128
    new-instance v2, Ljava/math/BigDecimal;

    .line 129
    .line 130
    iget-short v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 131
    .line 132
    invoke-direct {v2, v1, v3}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 133
    .line 134
    .line 135
    iget-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 136
    .line 137
    iget-short v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 138
    .line 139
    const/16 v4, 0xc

    .line 140
    .line 141
    if-ne v1, v4, :cond_6

    .line 142
    .line 143
    if-eqz v3, :cond_5

    .line 144
    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    iget-short v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 157
    .line 158
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0

    .line 174
    :cond_5
    invoke-virtual {v2}, Ljava/math/BigDecimal;->floatValue()F

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :cond_6
    if-eqz v3, :cond_7

    .line 184
    .line 185
    new-instance v1, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    iget-short v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 197
    .line 198
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 206
    .line 207
    .line 208
    move-result-wide v0

    .line 209
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    return-object v0

    .line 214
    :cond_7
    invoke-virtual {v2}, Ljava/math/BigDecimal;->doubleValue()D

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    return-object v0

    .line 223
    :pswitch_1
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 224
    .line 225
    if-nez v1, :cond_9

    .line 226
    .line 227
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 228
    .line 229
    if-nez v1, :cond_9

    .line 230
    .line 231
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 232
    .line 233
    if-nez v1, :cond_9

    .line 234
    .line 235
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 236
    .line 237
    if-ltz v1, :cond_9

    .line 238
    .line 239
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 240
    .line 241
    if-eqz v0, :cond_8

    .line 242
    .line 243
    neg-int v1, v1

    .line 244
    :cond_8
    int-to-short v0, v1

    .line 245
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    return-object v0

    .line 250
    :cond_9
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    return-object v16

    .line 258
    :pswitch_2
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 259
    .line 260
    if-nez v1, :cond_b

    .line 261
    .line 262
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 263
    .line 264
    if-nez v1, :cond_b

    .line 265
    .line 266
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 267
    .line 268
    if-nez v1, :cond_b

    .line 269
    .line 270
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 271
    .line 272
    if-ltz v1, :cond_b

    .line 273
    .line 274
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 275
    .line 276
    if-eqz v0, :cond_a

    .line 277
    .line 278
    neg-int v1, v1

    .line 279
    :cond_a
    int-to-byte v0, v1

    .line 280
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    return-object v0

    .line 285
    :cond_b
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    return-object v16

    .line 293
    :pswitch_3
    iget-short v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 294
    .line 295
    if-lez v1, :cond_d

    .line 296
    .line 297
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 298
    .line 299
    const/16 v2, 0x800

    .line 300
    .line 301
    if-gt v1, v2, :cond_c

    .line 302
    .line 303
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 304
    .line 305
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    return-object v0

    .line 310
    :cond_c
    const-string v1, "scale overflow : "

    .line 311
    .line 312
    iget-short v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 313
    .line 314
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(ILjava/lang/String;)V

    .line 315
    .line 316
    .line 317
    return-object v16

    .line 318
    :cond_d
    new-instance v1, Ljava/math/BigInteger;

    .line 319
    .line 320
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 321
    .line 322
    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    return-object v1

    .line 326
    :pswitch_4
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, Ljava/util/List;

    .line 329
    .line 330
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    if-ne v1, v4, :cond_f

    .line 335
    .line 336
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    instance-of v1, v0, Ljava/lang/Number;

    .line 341
    .line 342
    if-eqz v1, :cond_e

    .line 343
    .line 344
    check-cast v0, Ljava/lang/Number;

    .line 345
    .line 346
    return-object v0

    .line 347
    :cond_e
    instance-of v1, v0, Ljava/lang/String;

    .line 348
    .line 349
    if-eqz v1, :cond_f

    .line 350
    .line 351
    check-cast v0, Ljava/lang/String;

    .line 352
    .line 353
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    return-object v0

    .line 358
    :pswitch_5
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Ljava/util/Map;

    .line 361
    .line 362
    const-string v1, "val"

    .line 363
    .line 364
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    instance-of v1, v0, Ljava/lang/Number;

    .line 369
    .line 370
    if-eqz v1, :cond_f

    .line 371
    .line 372
    check-cast v0, Ljava/lang/Number;

    .line 373
    .line 374
    return-object v0

    .line 375
    :cond_f
    :goto_3
    :pswitch_6
    return-object v16

    .line 376
    :pswitch_7
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 377
    .line 378
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    return-object v0

    .line 383
    :pswitch_8
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 384
    .line 385
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪兰子世苏哲(Ljava/lang/String;)J

    .line 386
    .line 387
    .line 388
    move-result-wide v0

    .line 389
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    return-object v0

    .line 394
    :pswitch_9
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 395
    .line 396
    if-nez v1, :cond_13

    .line 397
    .line 398
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 399
    .line 400
    if-nez v1, :cond_13

    .line 401
    .line 402
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 403
    .line 404
    if-nez v1, :cond_11

    .line 405
    .line 406
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 407
    .line 408
    if-ltz v5, :cond_11

    .line 409
    .line 410
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 411
    .line 412
    if-eqz v1, :cond_10

    .line 413
    .line 414
    neg-int v5, v5

    .line 415
    :cond_10
    int-to-long v5, v5

    .line 416
    iget-short v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 417
    .line 418
    invoke-static {v5, v6, v1}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    move/from16 v20, v3

    .line 423
    .line 424
    move/from16 v21, v4

    .line 425
    .line 426
    goto :goto_4

    .line 427
    :cond_11
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 428
    .line 429
    int-to-long v5, v5

    .line 430
    and-long/2addr v5, v10

    .line 431
    move/from16 v20, v3

    .line 432
    .line 433
    move/from16 v21, v4

    .line 434
    .line 435
    int-to-long v3, v1

    .line 436
    and-long/2addr v3, v10

    .line 437
    cmp-long v1, v3, v18

    .line 438
    .line 439
    if-gtz v1, :cond_14

    .line 440
    .line 441
    shl-long v3, v3, v17

    .line 442
    .line 443
    add-long/2addr v3, v5

    .line 444
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 445
    .line 446
    if-eqz v1, :cond_12

    .line 447
    .line 448
    neg-long v3, v3

    .line 449
    :cond_12
    iget-short v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 450
    .line 451
    invoke-static {v3, v4, v1}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    goto :goto_4

    .line 456
    :cond_13
    move/from16 v20, v3

    .line 457
    .line 458
    move/from16 v21, v4

    .line 459
    .line 460
    :cond_14
    move-object/from16 v1, v16

    .line 461
    .line 462
    :goto_4
    if-nez v1, :cond_19

    .line 463
    .line 464
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 465
    .line 466
    if-nez v1, :cond_16

    .line 467
    .line 468
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 469
    .line 470
    if-nez v1, :cond_15

    .line 471
    .line 472
    new-array v1, v2, [I

    .line 473
    .line 474
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 475
    .line 476
    aput v2, v1, v20

    .line 477
    .line 478
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 479
    .line 480
    aput v2, v1, v21

    .line 481
    .line 482
    goto :goto_6

    .line 483
    :cond_15
    new-array v3, v12, [I

    .line 484
    .line 485
    aput v1, v3, v20

    .line 486
    .line 487
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 488
    .line 489
    aput v1, v3, v21

    .line 490
    .line 491
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 492
    .line 493
    aput v1, v3, v2

    .line 494
    .line 495
    :goto_5
    move-object v1, v3

    .line 496
    goto :goto_6

    .line 497
    :cond_16
    new-array v3, v8, [I

    .line 498
    .line 499
    aput v1, v3, v20

    .line 500
    .line 501
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 502
    .line 503
    aput v1, v3, v21

    .line 504
    .line 505
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 506
    .line 507
    aput v1, v3, v2

    .line 508
    .line 509
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 510
    .line 511
    aput v1, v3, v12

    .line 512
    .line 513
    goto :goto_5

    .line 514
    :goto_6
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 515
    .line 516
    if-eqz v2, :cond_17

    .line 517
    .line 518
    goto :goto_7

    .line 519
    :cond_17
    move/from16 v7, v21

    .line 520
    .line 521
    :goto_7
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰:Ljava/util/function/BiFunction;

    .line 522
    .line 523
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    invoke-interface {v2, v3, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    check-cast v1, Ljava/math/BigInteger;

    .line 532
    .line 533
    iget-short v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 534
    .line 535
    iget-short v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 536
    .line 537
    sub-int/2addr v2, v3

    .line 538
    new-instance v3, Ljava/math/BigDecimal;

    .line 539
    .line 540
    invoke-direct {v3, v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 541
    .line 542
    .line 543
    iget-short v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 544
    .line 545
    if-eqz v1, :cond_18

    .line 546
    .line 547
    iget-wide v1, v13, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 548
    .line 549
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForDoubles:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 550
    .line 551
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 552
    .line 553
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForFloats:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 554
    .line 555
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 556
    .line 557
    or-long/2addr v4, v6

    .line 558
    and-long/2addr v1, v4

    .line 559
    cmp-long v1, v1, v14

    .line 560
    .line 561
    if-nez v1, :cond_18

    .line 562
    .line 563
    invoke-virtual {v3}, Ljava/math/BigDecimal;->doubleValue()D

    .line 564
    .line 565
    .line 566
    move-result-wide v0

    .line 567
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    return-object v0

    .line 572
    :cond_18
    move-object v1, v3

    .line 573
    :cond_19
    iget-short v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 574
    .line 575
    if-eqz v2, :cond_1c

    .line 576
    .line 577
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    iget-wide v3, v13, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 582
    .line 583
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForDoubles:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 584
    .line 585
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 586
    .line 587
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForFloats:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 588
    .line 589
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 590
    .line 591
    or-long/2addr v5, v7

    .line 592
    and-long/2addr v3, v5

    .line 593
    cmp-long v3, v3, v14

    .line 594
    .line 595
    if-nez v3, :cond_1a

    .line 596
    .line 597
    invoke-static {v2, v9}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    iget-short v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 602
    .line 603
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 611
    .line 612
    .line 613
    move-result-wide v0

    .line 614
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    return-object v0

    .line 619
    :cond_1a
    invoke-virtual {v1}, Ljava/math/BigDecimal;->signum()I

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-nez v1, :cond_1b

    .line 624
    .line 625
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 626
    .line 627
    return-object v0

    .line 628
    :cond_1b
    new-instance v1, Ljava/math/BigDecimal;

    .line 629
    .line 630
    invoke-static {v2, v9}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    iget-short v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 635
    .line 636
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-direct {v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    return-object v1

    .line 647
    :cond_1c
    iget-wide v2, v13, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 648
    .line 649
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseDoubleForDecimals:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 650
    .line 651
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 652
    .line 653
    and-long/2addr v2, v4

    .line 654
    cmp-long v0, v2, v14

    .line 655
    .line 656
    if-eqz v0, :cond_1d

    .line 657
    .line 658
    invoke-virtual {v1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 659
    .line 660
    .line 661
    move-result-wide v0

    .line 662
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    return-object v0

    .line 667
    :cond_1d
    return-object v1

    .line 668
    :pswitch_a
    move/from16 v20, v3

    .line 669
    .line 670
    move/from16 v21, v4

    .line 671
    .line 672
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 673
    .line 674
    if-nez v3, :cond_26

    .line 675
    .line 676
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 677
    .line 678
    if-nez v4, :cond_26

    .line 679
    .line 680
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 681
    .line 682
    if-nez v4, :cond_26

    .line 683
    .line 684
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 685
    .line 686
    const/high16 v5, -0x80000000

    .line 687
    .line 688
    if-eq v4, v5, :cond_26

    .line 689
    .line 690
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 691
    .line 692
    if-eqz v0, :cond_20

    .line 693
    .line 694
    if-gez v4, :cond_1f

    .line 695
    .line 696
    int-to-long v0, v4

    .line 697
    and-long/2addr v0, v10

    .line 698
    neg-long v0, v0

    .line 699
    iget-wide v2, v13, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 700
    .line 701
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 702
    .line 703
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 704
    .line 705
    and-long/2addr v2, v4

    .line 706
    cmp-long v2, v2, v14

    .line 707
    .line 708
    if-eqz v2, :cond_1e

    .line 709
    .line 710
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    return-object v0

    .line 715
    :cond_1e
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    return-object v0

    .line 720
    :cond_1f
    neg-int v4, v4

    .line 721
    goto :goto_8

    .line 722
    :cond_20
    if-gez v4, :cond_22

    .line 723
    .line 724
    int-to-long v0, v4

    .line 725
    and-long/2addr v0, v10

    .line 726
    iget-wide v2, v13, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 727
    .line 728
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 729
    .line 730
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 731
    .line 732
    and-long/2addr v2, v4

    .line 733
    cmp-long v2, v2, v14

    .line 734
    .line 735
    if-eqz v2, :cond_21

    .line 736
    .line 737
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    return-object v0

    .line 742
    :cond_21
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    return-object v0

    .line 747
    :cond_22
    :goto_8
    iget-wide v2, v13, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 748
    .line 749
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 750
    .line 751
    iget-wide v5, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 752
    .line 753
    and-long/2addr v5, v2

    .line 754
    cmp-long v0, v5, v14

    .line 755
    .line 756
    if-eqz v0, :cond_23

    .line 757
    .line 758
    int-to-long v0, v4

    .line 759
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    return-object v0

    .line 764
    :cond_23
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseLongForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 765
    .line 766
    iget-wide v5, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 767
    .line 768
    and-long/2addr v2, v5

    .line 769
    cmp-long v0, v2, v14

    .line 770
    .line 771
    if-eqz v0, :cond_24

    .line 772
    .line 773
    int-to-long v0, v4

    .line 774
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    return-object v0

    .line 779
    :cond_24
    const/16 v0, 0xb

    .line 780
    .line 781
    if-ne v1, v0, :cond_25

    .line 782
    .line 783
    int-to-long v0, v4

    .line 784
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    return-object v0

    .line 789
    :cond_25
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    return-object v0

    .line 794
    :cond_26
    if-nez v3, :cond_2b

    .line 795
    .line 796
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 797
    .line 798
    if-nez v1, :cond_2a

    .line 799
    .line 800
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 801
    .line 802
    int-to-long v3, v1

    .line 803
    and-long/2addr v3, v10

    .line 804
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 805
    .line 806
    int-to-long v8, v5

    .line 807
    and-long/2addr v8, v10

    .line 808
    cmp-long v6, v8, v18

    .line 809
    .line 810
    if-gtz v6, :cond_29

    .line 811
    .line 812
    shl-long v1, v8, v17

    .line 813
    .line 814
    add-long/2addr v1, v3

    .line 815
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 816
    .line 817
    if-eqz v0, :cond_27

    .line 818
    .line 819
    neg-long v1, v1

    .line 820
    :cond_27
    iget-wide v3, v13, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 821
    .line 822
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 823
    .line 824
    iget-wide v5, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 825
    .line 826
    and-long/2addr v3, v5

    .line 827
    cmp-long v0, v3, v14

    .line 828
    .line 829
    if-eqz v0, :cond_28

    .line 830
    .line 831
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    return-object v0

    .line 836
    :cond_28
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    return-object v0

    .line 841
    :cond_29
    new-array v2, v2, [I

    .line 842
    .line 843
    aput v5, v2, v20

    .line 844
    .line 845
    aput v1, v2, v21

    .line 846
    .line 847
    goto :goto_9

    .line 848
    :cond_2a
    new-array v3, v12, [I

    .line 849
    .line 850
    aput v1, v3, v20

    .line 851
    .line 852
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 853
    .line 854
    aput v1, v3, v21

    .line 855
    .line 856
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 857
    .line 858
    aput v1, v3, v2

    .line 859
    .line 860
    move-object v2, v3

    .line 861
    goto :goto_9

    .line 862
    :cond_2b
    new-array v1, v8, [I

    .line 863
    .line 864
    aput v3, v1, v20

    .line 865
    .line 866
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 867
    .line 868
    aput v3, v1, v21

    .line 869
    .line 870
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 871
    .line 872
    aput v3, v1, v2

    .line 873
    .line 874
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 875
    .line 876
    aput v2, v1, v12

    .line 877
    .line 878
    move-object v2, v1

    .line 879
    :goto_9
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 880
    .line 881
    if-eqz v0, :cond_2c

    .line 882
    .line 883
    goto :goto_a

    .line 884
    :cond_2c
    move/from16 v7, v21

    .line 885
    .line 886
    :goto_a
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰:Ljava/util/function/BiFunction;

    .line 887
    .line 888
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-interface {v0, v1, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    check-cast v0, Ljava/math/BigInteger;

    .line 897
    .line 898
    iget-wide v1, v13, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 899
    .line 900
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseLongForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 901
    .line 902
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 903
    .line 904
    and-long/2addr v1, v3

    .line 905
    cmp-long v1, v1, v14

    .line 906
    .line 907
    if-eqz v1, :cond_2d

    .line 908
    .line 909
    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    .line 910
    .line 911
    .line 912
    move-result-wide v0

    .line 913
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    :cond_2d
    return-object v0

    .line 918
    nop

    .line 919
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_a
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子苏楪兰哲世()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public abstract 飘花落叶言子苏楪哲世兰()Ljava/lang/String;
.end method

.method public 飘花落叶言楪世兰哲子苏()Ljava/time/LocalDateTime;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲楪苏世()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    const/16 v0, 0x3a

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏世哲楪(C)Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/time/LocalDateTime;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏世楪()Z

    .line 51
    .line 52
    .line 53
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v3, 0x0

    .line 64
    packed-switch v0, :pswitch_data_0

    .line 65
    .line 66
    .line 67
    :pswitch_0
    goto :goto_0

    .line 68
    :pswitch_1
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世子哲兰(I)Ljava/time/LocalDateTime;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    return-object v4

    .line 75
    :cond_2
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏世兰子(I)Ljava/time/ZonedDateTime;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->getZone()Ljava/time/ZoneId;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1, p0}, Ljava/time/ZoneId;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_3

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0, p0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_3
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰哲世()Ljava/time/LocalDateTime;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    return-object v4

    .line 120
    :cond_4
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏世兰子(I)Ljava/time/ZonedDateTime;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰世哲()Ljava/time/LocalDateTime;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子哲兰世()Ljava/time/LocalDateTime;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-eqz v0, :cond_5

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子哲世兰()Ljava/time/LocalDateTime;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v0, :cond_5

    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    const/4 v5, 0x1

    .line 161
    if-nez v4, :cond_c

    .line 162
    .line 163
    const-string v4, "null"

    .line 164
    .line 165
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_6

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_6
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_7

    .line 177
    .line 178
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 179
    .line 180
    .line 181
    move-result-wide v2

    .line 182
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :cond_7
    const-string v4, "/Date("

    .line 196
    .line 197
    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    if-eqz v4, :cond_a

    .line 202
    .line 203
    const-string v4, ")/"

    .line 204
    .line 205
    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-eqz v4, :cond_a

    .line 210
    .line 211
    const/4 p0, 0x6

    .line 212
    const/4 v3, 0x2

    .line 213
    invoke-static {v3, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    const/16 v0, 0x2b

    .line 218
    .line 219
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    const/4 v3, -0x1

    .line 224
    if-ne v0, v3, :cond_8

    .line 225
    .line 226
    const/16 v0, 0x2d

    .line 227
    .line 228
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    :cond_8
    if-eq v0, v3, :cond_9

    .line 233
    .line 234
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    :cond_9
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 239
    .line 240
    .line 241
    move-result-wide v2

    .line 242
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    return-object p0

    .line 255
    :cond_a
    const-string v1, "0000-00-00 00:00:00"

    .line 256
    .line 257
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-eqz v1, :cond_b

    .line 262
    .line 263
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 264
    .line 265
    return-object v3

    .line 266
    :cond_b
    const-string v1, "read LocalDateTime error "

    .line 267
    .line 268
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-object v3

    .line 280
    :cond_c
    :goto_1
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 281
    .line 282
    return-object v3

    .line 283
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()Ljava/time/LocalDateTime;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    return-object p0

    .line 288
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰子哲苏()Ljava/time/LocalDate;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    if-nez p0, :cond_d

    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_d
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 296
    .line 297
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    return-object p0

    .line 302
    :pswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰子苏哲()Ljava/time/LocalDate;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    if-nez p0, :cond_e

    .line 307
    .line 308
    goto :goto_2

    .line 309
    :cond_e
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 310
    .line 311
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    return-object p0

    .line 316
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰苏哲子()Ljava/time/LocalDate;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    if-nez p0, :cond_f

    .line 321
    .line 322
    goto :goto_2

    .line 323
    :cond_f
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 324
    .line 325
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    return-object p0

    .line 330
    :pswitch_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰苏子哲()Ljava/time/LocalDate;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    if-nez p0, :cond_10

    .line 335
    .line 336
    :goto_2
    return-object v3

    .line 337
    :cond_10
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 338
    .line 339
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    return-object p0

    .line 344
    nop

    .line 345
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public abstract 飘花落叶言楪世兰哲苏子()Ljava/time/LocalDateTime;
.end method

.method public abstract 飘花落叶言楪世兰子哲苏()Ljava/time/LocalDate;
.end method

.method public abstract 飘花落叶言楪世兰子苏哲()Ljava/time/LocalDate;
.end method

.method public abstract 飘花落叶言楪世兰苏哲子()Ljava/time/LocalDate;
.end method

.method public abstract 飘花落叶言楪世兰苏子哲()Ljava/time/LocalDate;
.end method

.method public final 飘花落叶言楪世哲兰子苏()J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世苏兰()V

    .line 2
    .line 3
    .line 4
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 5
    .line 6
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-string v0, "TODO : "

    .line 14
    .line 15
    iget-byte p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 16
    .line 17
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-wide v2

    .line 21
    :pswitch_0
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲苏楪兰()Ljava/math/BigDecimal;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValueExact()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return-wide v0

    .line 30
    :catch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()Lcom/alibaba/fastjson2/JSONException;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    throw p0

    .line 35
    :pswitch_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰苏世子(Ljava/util/List;)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    int-to-long v0, p0

    .line 44
    return-wide v0

    .line 45
    :pswitch_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/Map;

    .line 48
    .line 49
    const-string v1, "val"

    .line 50
    .line 51
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    instance-of v2, v1, Ljava/lang/Number;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    check-cast v1, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    int-to-long v0, p0

    .line 66
    return-wide v0

    .line 67
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, "parseLong error, value : "

    .line 70
    .line 71
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONException;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    throw p0

    .line 86
    :pswitch_3
    iget-wide v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 87
    .line 88
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 89
    .line 90
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 91
    .line 92
    and-long/2addr v0, v4

    .line 93
    cmp-long v0, v0, v2

    .line 94
    .line 95
    if-nez v0, :cond_1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    const-string v0, "long value not support input null"

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-wide v2

    .line 108
    :pswitch_4
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 109
    .line 110
    if-eqz p0, :cond_2

    .line 111
    .line 112
    const-wide/16 v0, 0x1

    .line 113
    .line 114
    return-wide v0

    .line 115
    :cond_2
    :goto_0
    return-wide v2

    .line 116
    :pswitch_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪兰子世苏哲(Ljava/lang/String;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v0

    .line 122
    return-wide v0

    .line 123
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide v0

    .line 131
    return-wide v0

    .line 132
    :pswitch_7
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 133
    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 137
    .line 138
    if-nez v0, :cond_5

    .line 139
    .line 140
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 141
    .line 142
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 143
    .line 144
    if-eqz v0, :cond_4

    .line 145
    .line 146
    const/high16 v0, -0x80000000

    .line 147
    .line 148
    if-ne v4, v0, :cond_3

    .line 149
    .line 150
    int-to-long v0, v4

    .line 151
    return-wide v0

    .line 152
    :cond_3
    if-ltz v4, :cond_5

    .line 153
    .line 154
    neg-int p0, v4

    .line 155
    int-to-long v0, p0

    .line 156
    return-wide v0

    .line 157
    :cond_4
    if-ltz v4, :cond_5

    .line 158
    .line 159
    int-to-long v0, v4

    .line 160
    return-wide v0

    .line 161
    :cond_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    instance-of v4, v0, Ljava/math/BigInteger;

    .line 166
    .line 167
    if-eqz v4, :cond_7

    .line 168
    .line 169
    check-cast v0, Ljava/math/BigInteger;

    .line 170
    .line 171
    iget-wide v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 172
    .line 173
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 174
    .line 175
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 176
    .line 177
    and-long/2addr v4, v6

    .line 178
    cmp-long v1, v4, v2

    .line 179
    .line 180
    if-eqz v1, :cond_6

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    .line 183
    .line 184
    .line 185
    move-result-wide v0

    .line 186
    return-wide v0

    .line 187
    :cond_6
    :try_start_1
    invoke-static {v0}, Landroidx/core/view/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(Ljava/math/BigInteger;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_1

    .line 191
    return-wide v0

    .line 192
    :catch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()Lcom/alibaba/fastjson2/JSONException;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    throw p0

    .line 197
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 198
    .line 199
    .line 200
    move-result-wide v0

    .line 201
    return-wide v0

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch
.end method

.method public 飘花落叶言楪世哲兰苏子()Ljava/time/LocalDate;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/16 v3, 0x13

    .line 50
    .line 51
    if-eq v0, v3, :cond_8

    .line 52
    .line 53
    const/16 v3, 0x14

    .line 54
    .line 55
    if-eq v0, v3, :cond_7

    .line 56
    .line 57
    packed-switch v0, :pswitch_data_0

    .line 58
    .line 59
    .line 60
    if-le v0, v3, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世子哲兰(I)Ljava/time/LocalDateTime;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    move-object v0, v1

    .line 68
    goto :goto_1

    .line 69
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰子哲苏()Ljava/time/LocalDate;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    sget-object v3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 77
    .line 78
    invoke-static {v0, v3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_1

    .line 83
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰子苏哲()Ljava/time/LocalDate;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-nez v0, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    sget-object v3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 91
    .line 92
    invoke-static {v0, v3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_1

    .line 97
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰苏哲子()Ljava/time/LocalDate;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-nez v0, :cond_5

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    sget-object v3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 105
    .line 106
    invoke-static {v0, v3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    goto :goto_1

    .line 111
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰苏子哲()Ljava/time/LocalDate;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-nez v0, :cond_6

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_6
    sget-object v3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 119
    .line 120
    invoke-static {v0, v3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    goto :goto_1

    .line 125
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰哲世()Ljava/time/LocalDateTime;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    goto :goto_1

    .line 130
    :cond_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰世哲()Ljava/time/LocalDateTime;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :goto_1
    if-eqz v0, :cond_9

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :cond_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_c

    .line 150
    .line 151
    const-string v0, "null"

    .line 152
    .line 153
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_a

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_a
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_b

    .line 165
    .line 166
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 167
    .line 168
    .line 169
    move-result-wide v0

    .line 170
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {p0, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :cond_b
    const-string v0, "not support input : "

    .line 188
    .line 189
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :cond_c
    :goto_2
    return-object v1

    .line 197
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract 飘花落叶言楪世哲子兰苏()Ljava/lang/Long;
.end method

.method public final 飘花落叶言楪世哲子苏兰()I
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世苏兰()V

    .line 2
    .line 3
    .line 4
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "integer overflow "

    .line 8
    .line 9
    const-wide/32 v3, 0x7fffffff

    .line 10
    .line 11
    .line 12
    const-wide/32 v5, -0x80000000

    .line 13
    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    iget-object v9, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    const-string v0, "TODO : "

    .line 23
    .line 24
    iget-byte p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 25
    .line 26
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v10

    .line 38
    cmp-long v0, v10, v5

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    cmp-long v0, v10, v3

    .line 43
    .line 44
    if-lez v0, :cond_1

    .line 45
    .line 46
    :cond_0
    iget-wide v3, v9, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 47
    .line 48
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 49
    .line 50
    iget-wide v5, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 51
    .line 52
    and-long/2addr v3, v5

    .line 53
    cmp-long v0, v3, v7

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    :cond_1
    long-to-int p0, v10

    .line 58
    return p0

    .line 59
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return v1

    .line 79
    :pswitch_1
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲苏楪兰()Ljava/math/BigDecimal;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValueExact()I

    .line 84
    .line 85
    .line 86
    move-result p0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    return p0

    .line 88
    :catch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()Lcom/alibaba/fastjson2/JSONException;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    throw p0

    .line 93
    :pswitch_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ljava/util/List;

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰苏世子(Ljava/util/List;)I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    return p0

    .line 102
    :pswitch_3
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, Ljava/util/Map;

    .line 105
    .line 106
    const-string v0, "val"

    .line 107
    .line 108
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    instance-of v0, p0, Ljava/lang/Number;

    .line 113
    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    check-cast p0, Ljava/lang/Number;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    const/4 p0, 0x0

    .line 120
    :goto_0
    if-eqz p0, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    return p0

    .line 127
    :pswitch_4
    iget-wide v2, v9, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 128
    .line 129
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 130
    .line 131
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 132
    .line 133
    and-long/2addr v2, v4

    .line 134
    cmp-long v0, v2, v7

    .line 135
    .line 136
    if-nez v0, :cond_5

    .line 137
    .line 138
    :cond_4
    return v1

    .line 139
    :cond_5
    const-string v0, "int value not support input null"

    .line 140
    .line 141
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return v1

    .line 149
    :pswitch_5
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 150
    .line 151
    return p0

    .line 152
    :pswitch_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_7

    .line 159
    .line 160
    const/16 v1, 0x2c

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    add-int/lit8 v2, v2, -0x4

    .line 171
    .line 172
    if-ne v1, v2, :cond_6

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_6
    const-string v1, "parseInt error, value : "

    .line 176
    .line 177
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONException;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    throw p0

    .line 186
    :cond_7
    :goto_1
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲苏楪兰(Ljava/lang/Object;)I

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    return p0

    .line 191
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    return p0

    .line 200
    :pswitch_8
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 201
    .line 202
    if-nez v0, :cond_a

    .line 203
    .line 204
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 205
    .line 206
    if-nez v0, :cond_a

    .line 207
    .line 208
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 209
    .line 210
    iget v10, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 211
    .line 212
    if-eqz v0, :cond_9

    .line 213
    .line 214
    const/high16 v0, -0x80000000

    .line 215
    .line 216
    if-ne v10, v0, :cond_8

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_8
    if-ltz v10, :cond_a

    .line 220
    .line 221
    neg-int p0, v10

    .line 222
    return p0

    .line 223
    :cond_9
    if-ltz v10, :cond_a

    .line 224
    .line 225
    :goto_2
    return v10

    .line 226
    :cond_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    instance-of v10, v0, Ljava/lang/Long;

    .line 231
    .line 232
    if-eqz v10, :cond_c

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 235
    .line 236
    .line 237
    move-result-wide v7

    .line 238
    cmp-long v0, v7, v5

    .line 239
    .line 240
    if-ltz v0, :cond_b

    .line 241
    .line 242
    cmp-long v0, v7, v3

    .line 243
    .line 244
    if-gtz v0, :cond_b

    .line 245
    .line 246
    long-to-int p0, v7

    .line 247
    return p0

    .line 248
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return v1

    .line 268
    :cond_c
    instance-of v1, v0, Ljava/math/BigInteger;

    .line 269
    .line 270
    if-eqz v1, :cond_e

    .line 271
    .line 272
    check-cast v0, Ljava/math/BigInteger;

    .line 273
    .line 274
    iget-wide v1, v9, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 275
    .line 276
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 277
    .line 278
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 279
    .line 280
    and-long/2addr v1, v3

    .line 281
    cmp-long v1, v1, v7

    .line 282
    .line 283
    if-eqz v1, :cond_d

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result p0

    .line 289
    return p0

    .line 290
    :cond_d
    :try_start_1
    invoke-static {v0}, Landroidx/core/view/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/math/BigInteger;)I

    .line 291
    .line 292
    .line 293
    move-result p0
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_1

    .line 294
    return p0

    .line 295
    :catch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()Lcom/alibaba/fastjson2/JSONException;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    throw p0

    .line 300
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result p0

    .line 304
    return p0

    .line 305
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言楪世哲苏兰子()[J
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲苏楪()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    new-array v0, v0, [J

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    array-length v3, v0

    .line 33
    if-ne v2, v3, :cond_1

    .line 34
    .line 35
    array-length v3, v0

    .line 36
    shl-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    add-int/lit8 v3, v2, 0x1

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()J

    .line 45
    .line 46
    .line 47
    move-result-wide v4

    .line 48
    aput-wide v4, v0, v2

    .line 49
    .line 50
    move v2, v3

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const-string v0, "input end"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    array-length p0, v0

    .line 63
    if-ne v2, p0, :cond_4

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_4
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_6

    .line 86
    .line 87
    :goto_1
    return-object v1

    .line 88
    :cond_6
    const-string v1, "not support input "

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONException;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    throw p0

    .line 99
    :cond_7
    const-string v0, "TODO"

    .line 100
    .line 101
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object v1
.end method

.method public abstract 飘花落叶言楪世哲苏子兰()J
.end method

.method public 飘花落叶言楪世子兰哲苏()Ljava/lang/Float;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏子哲兰()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final 飘花落叶言楪世子兰苏哲()Ljava/lang/String;
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x2f

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏兰世子()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子哲兰苏()J

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲世兰()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    const-string v0, "illegal input"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public abstract 飘花落叶言楪世子哲兰苏()J
.end method

.method public abstract 飘花落叶言楪世子哲苏兰()J
.end method

.method public abstract 飘花落叶言楪世子苏兰哲()Ljava/lang/String;
.end method

.method public abstract 飘花落叶言楪世子苏哲兰()D
.end method

.method public abstract 飘花落叶言楪世苏兰哲子()I
.end method

.method public abstract 飘花落叶言楪世苏兰子哲()Ljava/lang/Integer;
.end method

.method public 飘花落叶言楪世苏哲兰子()Ljava/time/Instant;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世苏哲()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世哲苏()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    const-class v0, Ljava/time/Instant;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰世楪哲(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世兰苏()Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-wide/16 v1, 0x0

    .line 45
    .line 46
    invoke-interface {v0, p0, v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Ljava/time/Instant;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏世子兰()Ljava/time/ZonedDateTime;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-nez p0, :cond_3

    .line 58
    .line 59
    :goto_0
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_3
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Ljava/time/LocalTime;->getNano()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    int-to-long v2, p0

    .line 74
    invoke-static {v0, v1, v2, v3}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public abstract 飘花落叶言楪世苏哲子兰()Z
.end method

.method public abstract 飘花落叶言楪世苏子兰哲()[B
.end method

.method public abstract 飘花落叶言楪世苏子哲兰()F
.end method

.method public final 飘花落叶言楪兰子世苏哲(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const/16 v0, 0x2c

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, -0x4

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    if-le v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/16 v1, 0x28

    .line 35
    .line 36
    if-ge v0, v1, :cond_1

    .line 37
    .line 38
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/time/ZoneId;

    .line 43
    .line 44
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 45
    .line 46
    .line 47
    move-result-wide p0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    return-wide p0

    .line 49
    :catch_0
    :cond_1
    const-string v0, "parseLong error, value : "

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONException;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    throw p0

    .line 60
    :cond_2
    :goto_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲兰苏楪(Ljava/lang/Object;)J

    .line 61
    .line 62
    .line 63
    move-result-wide p0

    .line 64
    return-wide p0
.end method

.method public final 飘花落叶言楪哲世兰子苏()Ljava/lang/String;
    .locals 6

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x2b

    .line 4
    .line 5
    if-eq v0, v1, :cond_7

    .line 6
    .line 7
    const/16 v1, 0x2d

    .line 8
    .line 9
    if-eq v0, v1, :cond_7

    .line 10
    .line 11
    const/16 v1, 0x5b

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eq v0, v1, :cond_4

    .line 15
    .line 16
    const/16 v1, 0x66

    .line 17
    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    const/16 v1, 0x6e

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/16 v1, 0x74

    .line 25
    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/16 v1, 0x7b

    .line 29
    .line 30
    if-eq v0, v1, :cond_0

    .line 31
    .line 32
    packed-switch v0, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "illegal input : "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世兰苏()Ljava/util/Map;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏兰楪()Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪世哲苏(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(Ljava/util/Map;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰世哲子()V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子兰苏世哲()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    const-string p0, "true"

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_3
    const-string p0, "false"

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世兰苏()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    const/4 v3, 0x1

    .line 105
    if-ne v1, v3, :cond_6

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-nez v1, :cond_5

    .line 113
    .line 114
    return-object v2

    .line 115
    :cond_5
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 116
    .line 117
    iget-wide v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 118
    .line 119
    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableStringArrayUnwrapping:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 120
    .line 121
    iget-wide v4, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 122
    .line 123
    and-long/2addr v2, v4

    .line 124
    const-wide/16 v4, 0x0

    .line 125
    .line 126
    cmp-long p0, v2, v4

    .line 127
    .line 128
    if-nez p0, :cond_6

    .line 129
    .line 130
    instance-of p0, v1, Ljava/lang/String;

    .line 131
    .line 132
    if-eqz p0, :cond_6

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :cond_6
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏兰楪()Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪世哲苏(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪哲苏世(Ljava/util/List;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_7
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世苏兰()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言楪哲世兰苏子()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏子兰世()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public 飘花落叶言楪哲世子兰苏(ILjava/util/Collection;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ".."

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p2, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, p2, p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;ILcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public abstract 飘花落叶言楪哲世子苏兰()Ljava/lang/String;
.end method

.method public 飘花落叶言楪哲世苏兰子()[Ljava/lang/String;
    .locals 6

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x6e

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲苏楪()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_7

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    move v3, v0

    .line 24
    move-object v1, v2

    .line 25
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_3

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    new-array v1, v0, [Ljava/lang/String;

    .line 34
    .line 35
    :cond_1
    array-length p0, v1

    .line 36
    if-ne p0, v3, :cond_2

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_2
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, [Ljava/lang/String;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_6

    .line 51
    .line 52
    if-nez v1, :cond_4

    .line 53
    .line 54
    const/16 v1, 0x10

    .line 55
    .line 56
    new-array v1, v1, [Ljava/lang/String;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    array-length v4, v1

    .line 60
    if-ne v3, v4, :cond_5

    .line 61
    .line 62
    array-length v4, v1

    .line 63
    shl-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, [Ljava/lang/String;

    .line 70
    .line 71
    :cond_5
    :goto_1
    add-int/lit8 v4, v3, 0x1

    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    aput-object v5, v1, v3

    .line 78
    .line 79
    move v3, v4

    .line 80
    goto :goto_0

    .line 81
    :cond_6
    const-string v0, "input end"

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :cond_7
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 92
    .line 93
    const/16 v1, 0x22

    .line 94
    .line 95
    if-eq v0, v1, :cond_9

    .line 96
    .line 97
    const/16 v1, 0x27

    .line 98
    .line 99
    if-ne v0, v1, :cond_8

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_8
    const-string v0, "not support input"

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v2

    .line 112
    :cond_9
    :goto_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_a

    .line 121
    .line 122
    :goto_3
    return-object v2

    .line 123
    :cond_a
    const-string v1, "not support input "

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object v2
.end method

.method public abstract 飘花落叶言楪哲世苏子兰()Ljava/lang/String;
.end method

.method public 飘花落叶言楪哲兰世子苏()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const p0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "illegal input, expect \'[\', but "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public abstract 飘花落叶言楪哲兰子世苏()V
.end method

.method public abstract 飘花落叶言楪哲兰子苏世()V
.end method

.method public final 飘花落叶言楪哲兰苏世子(Ljava/util/List;)I
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Ljava/lang/Number;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    instance-of v1, v0, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "parseLong error, field : value "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONException;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    throw p0
.end method

.method public 飘花落叶言楪哲子世兰苏()Ljava/util/Map;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Z

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    add-int/2addr v0, v1

    .line 8
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 9
    .line 10
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/16 v3, 0x800

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-ge v0, v3, :cond_13

    .line 19
    .line 20
    iget-wide v5, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 21
    .line 22
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 23
    .line 24
    iget-wide v7, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 25
    .line 26
    and-long/2addr v5, v7

    .line 27
    const-wide/16 v7, 0x0

    .line 28
    .line 29
    cmp-long v0, v5, v7

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 40
    .line 41
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 42
    .line 43
    .line 44
    :goto_0
    const/4 v3, 0x0

    .line 45
    move v5, v3

    .line 46
    :goto_1
    iget-char v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 47
    .line 48
    const/16 v9, 0x2f

    .line 49
    .line 50
    if-ne v6, v9, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏兰世子()V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-char v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 56
    .line 57
    const/16 v9, 0x7d

    .line 58
    .line 59
    if-ne v6, v9, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 62
    .line 63
    .line 64
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 65
    .line 66
    const/16 v4, 0x2c

    .line 67
    .line 68
    if-ne v2, v4, :cond_2

    .line 69
    .line 70
    move v3, v1

    .line 71
    :cond_2
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 72
    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 76
    .line 77
    .line 78
    :cond_3
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 79
    .line 80
    sub-int/2addr v2, v1

    .line 81
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子苏兰哲()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    if-nez v6, :cond_a

    .line 89
    .line 90
    iget-char v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 91
    .line 92
    const/16 v9, 0x1a

    .line 93
    .line 94
    if-eq v6, v9, :cond_9

    .line 95
    .line 96
    const/16 v9, 0x2d

    .line 97
    .line 98
    if-eq v6, v9, :cond_8

    .line 99
    .line 100
    const/16 v9, 0x30

    .line 101
    .line 102
    if-lt v6, v9, :cond_5

    .line 103
    .line 104
    const/16 v9, 0x39

    .line 105
    .line 106
    if-gt v6, v9, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    const/16 v9, 0x7b

    .line 110
    .line 111
    if-ne v6, v9, :cond_6

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世兰苏()Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    const/16 v9, 0x5b

    .line 119
    .line 120
    if-ne v6, v9, :cond_7

    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世兰苏()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    goto :goto_3

    .line 127
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子兰苏哲()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    goto :goto_3

    .line 132
    :cond_8
    :goto_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世苏兰()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    :goto_3
    const/16 v9, 0x3a

    .line 140
    .line 141
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏世哲楪(C)Z

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_9
    const-string p0, "input end"

    .line 146
    .line 147
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object v4

    .line 151
    :cond_a
    :goto_4
    if-nez v5, :cond_c

    .line 152
    .line 153
    iget-wide v9, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 154
    .line 155
    sget-object v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 156
    .line 157
    iget-wide v11, v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 158
    .line 159
    and-long/2addr v9, v11

    .line 160
    cmp-long v9, v9, v7

    .line 161
    .line 162
    if-eqz v9, :cond_c

    .line 163
    .line 164
    const-string v9, "@type"

    .line 165
    .line 166
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    if-nez v9, :cond_b

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    const-string v0, "autoType not support : "

    .line 178
    .line 179
    invoke-static {v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-object v4

    .line 187
    :cond_c
    :goto_5
    iget-char v9, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 188
    .line 189
    const-string v10, "illegal input "

    .line 190
    .line 191
    sparse-switch v9, :sswitch_data_0

    .line 192
    .line 193
    .line 194
    packed-switch v9, :pswitch_data_0

    .line 195
    .line 196
    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-object v4

    .line 219
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏兰世子()V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_7

    .line 223
    .line 224
    :sswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 225
    .line 226
    .line 227
    move-result v9

    .line 228
    if-eqz v9, :cond_d

    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    invoke-static {v9}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-virtual {p0, v0, v6, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 239
    .line 240
    .line 241
    move-object v9, v4

    .line 242
    goto :goto_6

    .line 243
    :cond_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世兰苏()Ljava/util/Map;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    goto :goto_6

    .line 248
    :sswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰哲子世()Ljava/util/Date;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    goto :goto_6

    .line 253
    :sswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子兰苏世哲()Z

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    goto :goto_6

    .line 262
    :sswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世兰苏()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    goto :goto_6

    .line 267
    :sswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()Z

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    if-eqz v9, :cond_e

    .line 272
    .line 273
    const-class v9, Ljava/util/Set;

    .line 274
    .line 275
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏哲世兰(Ljava/lang/Class;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    goto :goto_6

    .line 280
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 286
    .line 287
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    return-object v4

    .line 302
    :sswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪哲世()Z

    .line 303
    .line 304
    .line 305
    move-result v9

    .line 306
    if-eqz v9, :cond_f

    .line 307
    .line 308
    const-wide/high16 v9, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 309
    .line 310
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    goto :goto_6

    .line 315
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 321
    .line 322
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    return-object v4

    .line 337
    :pswitch_1
    :sswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世苏兰()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 341
    .line 342
    .line 343
    move-result-object v9

    .line 344
    goto :goto_6

    .line 345
    :sswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v9

    .line 349
    :goto_6
    if-nez v9, :cond_10

    .line 350
    .line 351
    iget-wide v10, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 352
    .line 353
    sget-object v12, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 354
    .line 355
    iget-wide v12, v12, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 356
    .line 357
    and-long/2addr v10, v12

    .line 358
    cmp-long v10, v10, v7

    .line 359
    .line 360
    if-eqz v10, :cond_10

    .line 361
    .line 362
    goto :goto_7

    .line 363
    :cond_10
    invoke-interface {v0, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v10

    .line 367
    if-eqz v10, :cond_12

    .line 368
    .line 369
    iget-wide v11, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 370
    .line 371
    sget-object v13, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 372
    .line 373
    iget-wide v13, v13, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 374
    .line 375
    and-long/2addr v11, v13

    .line 376
    cmp-long v11, v11, v7

    .line 377
    .line 378
    if-eqz v11, :cond_12

    .line 379
    .line 380
    instance-of v11, v10, Ljava/util/Collection;

    .line 381
    .line 382
    if-eqz v11, :cond_11

    .line 383
    .line 384
    move-object v11, v10

    .line 385
    check-cast v11, Ljava/util/Collection;

    .line 386
    .line 387
    invoke-interface {v11, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    invoke-interface {v0, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_11
    invoke-static {v10, v9}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 395
    .line 396
    .line 397
    move-result-object v9

    .line 398
    invoke-interface {v0, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    :cond_12
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 402
    .line 403
    goto/16 :goto_1

    .line 404
    .line 405
    :cond_13
    const-string v0, "level too large : "

    .line 406
    .line 407
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 408
    .line 409
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(ILjava/lang/String;)V

    .line 410
    .line 411
    .line 412
    return-object v4

    .line 413
    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_7
        0x27 -> :sswitch_7
        0x2b -> :sswitch_6
        0x2d -> :sswitch_6
        0x49 -> :sswitch_5
        0x53 -> :sswitch_4
        0x5b -> :sswitch_3
        0x66 -> :sswitch_2
        0x6e -> :sswitch_1
        0x74 -> :sswitch_2
        0x7b -> :sswitch_0
    .end sparse-switch

    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public abstract 飘花落叶言楪哲子世苏兰()V
.end method

.method public abstract 飘花落叶言楪哲子兰世苏()Ljava/time/OffsetTime;
.end method

.method public abstract 飘花落叶言楪哲子兰苏世()Ljava/lang/String;
.end method

.method public final 飘花落叶言楪哲子苏世兰(Ljava/util/Map;J)V
    .locals 6

    .line 1
    if-eqz p1, :cond_8

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 8
    .line 9
    iget-wide v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 10
    .line 11
    or-long/2addr v2, p2

    .line 12
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 13
    .line 14
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 15
    .line 16
    and-long/2addr v2, v4

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v2, v4

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    :goto_0
    iget-object v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    instance-of v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;

    .line 35
    .line 36
    if-eqz v1, :cond_7

    .line 37
    .line 38
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_6

    .line 55
    .line 56
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏世楪()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子哲苏兰()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-interface {v0, v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲世兰苏(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-nez v1, :cond_2

    .line 71
    .line 72
    iget-wide v2, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 73
    .line 74
    or-long/2addr v2, p2

    .line 75
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世楪哲苏(J)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲世楪兰()J

    .line 82
    .line 83
    .line 84
    move-result-wide v1

    .line 85
    invoke-interface {v0, v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :cond_2
    if-nez v1, :cond_3

    .line 90
    .line 91
    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-virtual {v1, p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 100
    .line 101
    .line 102
    iget-object p0, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 103
    .line 104
    if-eqz p0, :cond_5

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    return-void

    .line 110
    :cond_6
    const/4 p1, 0x0

    .line 111
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_7
    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏兰哲世(Ljava/util/Map;J)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_8
    const-string p0, "object is null"

    .line 124
    .line 125
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public abstract 飘花落叶言楪哲子苏兰世()Ljava/time/OffsetDateTime;
.end method

.method public abstract 飘花落叶言楪哲苏世兰子(I)Ljava/time/ZonedDateTime;
.end method

.method public 飘花落叶言楪哲苏世子兰()Ljava/time/ZonedDateTime;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v2, 0x0

    .line 34
    if-eqz v0, :cond_8

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    packed-switch v0, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    :pswitch_0
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏世兰子(I)Ljava/time/ZonedDateTime;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_1
    :goto_0
    move-object v0, v2

    .line 54
    goto :goto_1

    .line 55
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰哲世()Ljava/time/LocalDateTime;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_1

    .line 60
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰世哲()Ljava/time/LocalDateTime;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_1

    .line 65
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子哲兰世()Ljava/time/LocalDateTime;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_1

    .line 70
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子哲世兰()Ljava/time/LocalDateTime;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    goto :goto_1

    .line 75
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()Ljava/time/LocalDateTime;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    goto :goto_1

    .line 80
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰子哲苏()Ljava/time/LocalDate;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sget-object v3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 85
    .line 86
    invoke-static {v0, v3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    goto :goto_1

    .line 91
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰子苏哲()Ljava/time/LocalDate;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    sget-object v3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 99
    .line 100
    invoke-static {v0, v3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    goto :goto_1

    .line 105
    :pswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰苏哲子()Ljava/time/LocalDate;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-nez v0, :cond_3

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    sget-object v3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 113
    .line 114
    invoke-static {v0, v3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    goto :goto_1

    .line 119
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰苏子哲()Ljava/time/LocalDate;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_4
    sget-object v3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 127
    .line 128
    invoke-static {v0, v3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    :goto_1
    if-eqz v0, :cond_5

    .line 133
    .line 134
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {v0, p0, v2}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :cond_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-nez v0, :cond_9

    .line 152
    .line 153
    const-string v0, "null"

    .line 154
    .line 155
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_6

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_6
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_7

    .line 167
    .line 168
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v2

    .line 172
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {p0, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    return-object p0

    .line 185
    :cond_7
    invoke-static {p0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;)Ljava/time/ZonedDateTime;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :cond_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_a

    .line 195
    .line 196
    :cond_9
    :goto_2
    return-object v2

    .line 197
    :cond_a
    const-string v0, "TODO : "

    .line 198
    .line 199
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 200
    .line 201
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-object v2

    .line 205
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public abstract 飘花落叶言楪哲苏兰世子()V
.end method

.method public 飘花落叶言楪哲苏兰子世(Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;)V
    .locals 1

    .line 1
    iget v0, p1, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    iget p1, p1, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世苏兰哲:I

    .line 6
    .line 7
    int-to-char p1, p1

    .line 8
    iput-char p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 9
    .line 10
    return-void
.end method

.method public abstract 飘花落叶言楪哲苏子世兰()Ljava/util/UUID;
.end method

.method public abstract 飘花落叶言楪哲苏子兰世()J
.end method

.method public final 飘花落叶言楪子世兰苏哲()Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "illegal number, offset "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ", char "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public final 飘花落叶言楪子世哲兰苏()Lcom/alibaba/fastjson2/JSONException;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "not support unquoted name"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public 飘花落叶言楪子世哲苏兰()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract 飘花落叶言楪子世苏兰哲()Z
.end method

.method public abstract 飘花落叶言楪子世苏哲兰()Z
.end method

.method public 飘花落叶言楪子兰世哲苏()Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子兰苏世哲()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public 飘花落叶言楪子兰世苏哲()[B
    .locals 6

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x78

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏子兰哲()[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 31
    .line 32
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 33
    .line 34
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->Base64StringAsByteArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 35
    .line 36
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 37
    .line 38
    and-long/2addr v2, v4

    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    cmp-long v2, v2, v4

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0, v0}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_2
    const-string v2, "not support input "

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲苏楪()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    const/16 v0, 0x40

    .line 75
    .line 76
    new-array v0, v0, [B

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    :goto_0
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 80
    .line 81
    const/16 v3, 0x5d

    .line 82
    .line 83
    if-ne v2, v3, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 89
    .line 90
    .line 91
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_4
    array-length v2, v0

    .line 97
    if-ne v1, v2, :cond_5

    .line 98
    .line 99
    array-length v2, v0

    .line 100
    shr-int/lit8 v3, v2, 0x1

    .line 101
    .line 102
    add-int/2addr v2, v3

    .line 103
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :cond_5
    add-int/lit8 v2, v1, 0x1

    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰哲子()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    int-to-byte v3, v3

    .line 114
    aput-byte v3, v0, v1

    .line 115
    .line 116
    move v1, v2

    .line 117
    goto :goto_0

    .line 118
    :cond_6
    const-string v0, "not support read binary"

    .line 119
    .line 120
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object v1
.end method

.method public 飘花落叶言楪子兰哲世苏()Ljava/util/Date;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    new-instance p0, Ljava/util/Date;

    .line 12
    .line 13
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏哲子兰()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 33
    .line 34
    const/16 v1, 0x6e

    .line 35
    .line 36
    if-ne v0, v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰哲子世()Ljava/util/Date;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_3
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 44
    .line 45
    const-wide/16 v1, 0x0

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲楪苏世()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    const/16 v0, 0x3a

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏世哲楪(C)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏世楪()Z

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世哲苏()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 78
    .line 79
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏兰哲世(Ljava/util/Map;J)V

    .line 83
    .line 84
    .line 85
    const-string v3, "$date"

    .line 86
    .line 87
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    instance-of v4, v3, Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v4, :cond_6

    .line 94
    .line 95
    check-cast v3, Ljava/lang/String;

    .line 96
    .line 97
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {v3, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 104
    .line 105
    .line 106
    move-result-wide v3

    .line 107
    cmp-long p0, v3, v1

    .line 108
    .line 109
    if-nez p0, :cond_5

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    new-instance p0, Ljava/util/Date;

    .line 113
    .line 114
    invoke-direct {p0, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 115
    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_6
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏哲楪兰(Ljava/lang/Object;)Ljava/util/Date;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰子哲世()J

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    :goto_0
    cmp-long v0, v3, v1

    .line 128
    .line 129
    if-nez v0, :cond_8

    .line 130
    .line 131
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 132
    .line 133
    if-eqz p0, :cond_8

    .line 134
    .line 135
    :goto_1
    const/4 p0, 0x0

    .line 136
    return-object p0

    .line 137
    :cond_8
    new-instance p0, Ljava/util/Date;

    .line 138
    .line 139
    invoke-direct {p0, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 140
    .line 141
    .line 142
    return-object p0
.end method

.method public final 飘花落叶言楪子兰哲苏世()Ljava/lang/Double;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子苏哲兰()D

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_1
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public abstract 飘花落叶言楪子兰苏世哲()Z
.end method

.method public 飘花落叶言楪子兰苏哲世()C
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 22
    .line 23
    return v1
.end method

.method public 飘花落叶言楪子哲世兰苏()Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 4
    .line 5
    .line 6
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 7
    .line 8
    const/4 v6, 0x1

    .line 9
    add-int/2addr v0, v6

    .line 10
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 11
    .line 12
    iget-object v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 13
    .line 14
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/16 v2, 0x800

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    if-ge v0, v2, :cond_d

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    move-object v11, v8

    .line 24
    move-object v12, v11

    .line 25
    move-object v13, v12

    .line 26
    move v10, v9

    .line 27
    :goto_0
    iget-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 28
    .line 29
    const/4 v14, 0x2

    .line 30
    sparse-switch v0, :sswitch_data_0

    .line 31
    .line 32
    .line 33
    packed-switch v0, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v8

    .line 44
    :pswitch_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏兰世子()V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v10, v10, -0x1

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :sswitch_0
    iget-wide v4, v7, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 52
    .line 53
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 54
    .line 55
    const-wide/16 v15, 0x0

    .line 56
    .line 57
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 58
    .line 59
    and-long/2addr v2, v4

    .line 60
    cmp-long v0, v2, v15

    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    const-wide/16 v4, 0x0

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世兰苏()Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :sswitch_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰世哲子()V

    .line 99
    .line 100
    .line 101
    move-object v0, v8

    .line 102
    goto/16 :goto_4

    .line 103
    .line 104
    :sswitch_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子兰苏世哲()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto/16 :goto_4

    .line 113
    .line 114
    :sswitch_3
    const-wide/16 v15, 0x0

    .line 115
    .line 116
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 117
    .line 118
    .line 119
    if-nez v11, :cond_6

    .line 120
    .line 121
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 122
    .line 123
    iget-wide v2, v7, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 124
    .line 125
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 126
    .line 127
    and-long/2addr v2, v4

    .line 128
    cmp-long v0, v2, v15

    .line 129
    .line 130
    if-eqz v0, :cond_3

    .line 131
    .line 132
    new-instance v0, Ljava/util/ArrayList;

    .line 133
    .line 134
    if-ne v10, v14, :cond_2

    .line 135
    .line 136
    invoke-direct {v0, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    :goto_1
    move-object v11, v0

    .line 144
    goto :goto_2

    .line 145
    :cond_3
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 146
    .line 147
    if-ne v10, v14, :cond_4

    .line 148
    .line 149
    invoke-direct {v0, v14}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    invoke-direct {v0, v6}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :goto_2
    if-ne v10, v6, :cond_5

    .line 158
    .line 159
    invoke-virtual {v1, v11, v9, v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_5
    if-ne v10, v14, :cond_6

    .line 164
    .line 165
    invoke-virtual {v1, v11, v9, v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v11, v6, v13}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;ILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_6
    :goto_3
    iget-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 172
    .line 173
    const/16 v2, 0x2c

    .line 174
    .line 175
    if-ne v0, v2, :cond_7

    .line 176
    .line 177
    move v9, v6

    .line 178
    :cond_7
    iput-boolean v9, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 179
    .line 180
    if-eqz v9, :cond_8

    .line 181
    .line 182
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 183
    .line 184
    .line 185
    :cond_8
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 186
    .line 187
    sub-int/2addr v0, v6

    .line 188
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 189
    .line 190
    return-object v11

    .line 191
    :sswitch_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世兰苏()Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    goto :goto_4

    .line 196
    :sswitch_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_9

    .line 201
    .line 202
    const-class v0, Ljava/util/Set;

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏哲世兰(Ljava/lang/Class;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    goto :goto_4

    .line 209
    :cond_9
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-object v8

    .line 217
    :sswitch_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰世子哲()D

    .line 218
    .line 219
    .line 220
    move-result-wide v2

    .line 221
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    goto :goto_4

    .line 226
    :pswitch_1
    :sswitch_7
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世苏兰()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    goto :goto_4

    .line 234
    :sswitch_8
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    :goto_4
    if-nez v10, :cond_a

    .line 239
    .line 240
    move-object v12, v0

    .line 241
    goto :goto_5

    .line 242
    :cond_a
    if-ne v10, v6, :cond_b

    .line 243
    .line 244
    move-object v13, v0

    .line 245
    goto :goto_5

    .line 246
    :cond_b
    if-ne v10, v14, :cond_c

    .line 247
    .line 248
    new-instance v11, Lcom/alibaba/fastjson2/JSONArray;

    .line 249
    .line 250
    invoke-direct {v11}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v11, v9, v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;ILjava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v11, v6, v13}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;ILjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v11, v10, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;ILjava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_c
    invoke-virtual {v1, v11, v10, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;ILjava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :goto_5
    add-int/2addr v10, v6

    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :cond_d
    const-string v0, "level too large : "

    .line 270
    .line 271
    iget v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 272
    .line 273
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(ILjava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-object v8

    .line 277
    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_8
        0x27 -> :sswitch_8
        0x2b -> :sswitch_7
        0x2d -> :sswitch_7
        0x4e -> :sswitch_6
        0x53 -> :sswitch_5
        0x5b -> :sswitch_4
        0x5d -> :sswitch_3
        0x66 -> :sswitch_2
        0x6e -> :sswitch_1
        0x74 -> :sswitch_2
        0x7b -> :sswitch_0
    .end sparse-switch

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public 飘花落叶言楪子哲世苏兰()Ljava/lang/Object;
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏哲世兰(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public abstract 飘花落叶言楪子哲兰世苏()Ljava/math/BigDecimal;
.end method

.method public 飘花落叶言楪子哲兰苏世()Ljava/math/BigInteger;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世苏兰()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v0, p0, Ljava/math/BigInteger;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p0, Ljava/math/BigInteger;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public 飘花落叶言楪子哲苏世兰(Ljava/lang/reflect/Type;)Ljava/util/List;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 15
    .line 16
    const/16 v3, 0x5b

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-ne v2, v3, :cond_6

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 26
    .line 27
    iget-wide v6, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 28
    .line 29
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 30
    .line 31
    iget-wide v8, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 32
    .line 33
    and-long/2addr v6, v8

    .line 34
    const-wide/16 v8, 0x0

    .line 35
    .line 36
    cmp-long v3, v6, v8

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    move v3, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v3, v4

    .line 43
    :goto_0
    iget-object v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 46
    .line 47
    invoke-virtual {v2, p1, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    move p1, v4

    .line 52
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_5

    .line 57
    .line 58
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const-string v7, ".."

    .line 71
    .line 72
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_2

    .line 77
    .line 78
    move-object v3, v0

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {p0, v0, p1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;ILcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 85
    .line 86
    .line 87
    move-object v3, v1

    .line 88
    :goto_2
    move-object v7, p0

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    const/4 v9, 0x0

    .line 91
    const-wide/16 v10, 0x0

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    move-object v7, p0

    .line 95
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :goto_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    iget p0, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 103
    .line 104
    if-eq v2, p0, :cond_4

    .line 105
    .line 106
    iget-char p0, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 107
    .line 108
    const/16 v2, 0x7d

    .line 109
    .line 110
    if-eq p0, v2, :cond_4

    .line 111
    .line 112
    const/16 v2, 0x1a

    .line 113
    .line 114
    if-eq p0, v2, :cond_4

    .line 115
    .line 116
    add-int/lit8 p1, p1, 0x1

    .line 117
    .line 118
    move-object p0, v7

    .line 119
    goto :goto_1

    .line 120
    :cond_4
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 121
    .line 122
    iget-char p1, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 123
    .line 124
    iget v0, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 125
    .line 126
    new-instance v1, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v2, "illegal input : "

    .line 129
    .line 130
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string p1, ", offset "

    .line 137
    .line 138
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p0

    .line 152
    :cond_5
    move-object v7, p0

    .line 153
    goto :goto_5

    .line 154
    :cond_6
    move-object v7, p0

    .line 155
    const/16 p0, 0x22

    .line 156
    .line 157
    if-eq v2, p0, :cond_8

    .line 158
    .line 159
    const/16 p0, 0x27

    .line 160
    .line 161
    if-eq v2, p0, :cond_8

    .line 162
    .line 163
    const/16 p0, 0x7b

    .line 164
    .line 165
    if-ne v2, p0, :cond_7

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    const-string p0, "syntax error"

    .line 169
    .line 170
    invoke-virtual {v7, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-object v1

    .line 178
    :cond_8
    :goto_4
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    if-eqz p0, :cond_9

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-nez p1, :cond_9

    .line 189
    .line 190
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    :cond_9
    :goto_5
    iget-char p0, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 194
    .line 195
    const/16 p1, 0x2c

    .line 196
    .line 197
    if-ne p0, p1, :cond_a

    .line 198
    .line 199
    move v4, v5

    .line 200
    :cond_a
    iput-boolean v4, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 201
    .line 202
    if-eqz v4, :cond_b

    .line 203
    .line 204
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 205
    .line 206
    .line 207
    :cond_b
    return-object v0
.end method

.method public 飘花落叶言楪子哲苏兰世()[B
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string v1, "data:image/"

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/16 v1, 0x3b

    .line 17
    .line 18
    const/16 v2, 0xc

    .line 19
    .line 20
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, -0x1

    .line 25
    if-eq v1, v2, :cond_0

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    const/16 v3, 0x2c

    .line 30
    .line 31
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->indexOf(II)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eq v3, v2, :cond_0

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    const-string v4, "base64"

    .line 39
    .line 40
    invoke-virtual {p0, v1, v4, v0, v2}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    new-array p0, v0, [B

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_1
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0, p0}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public final 飘花落叶言楪子苏兰世哲(Lcom/alibaba/fastjson2/JSONArray;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x800

    .line 19
    .line 20
    if-ge v0, v1, :cond_1

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 29
    .line 30
    add-int/lit8 p1, p1, -0x1

    .line 31
    .line 32
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    move-object v1, p0

    .line 45
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 53
    .line 54
    .line 55
    move-object p0, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-object v1, p0

    .line 58
    const-string p0, "level too large : "

    .line 59
    .line 60
    iget p1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲兰楪:I

    .line 61
    .line 62
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    move-object v1, p0

    .line 67
    iget p0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 68
    .line 69
    iget-char p1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 70
    .line 71
    const-string v0, "illegal input, offset "

    .line 72
    .line 73
    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(IILjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public 飘花落叶言楪子苏兰哲世(Ljava/util/Map;J)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-wide/from16 v4, p2

    .line 6
    .line 7
    iget-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 8
    .line 9
    iget-object v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 10
    .line 11
    const-wide/16 v8, 0x0

    .line 12
    .line 13
    const/16 v2, 0x27

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    iget-wide v10, v7, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 18
    .line 19
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 20
    .line 21
    iget-wide v12, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 22
    .line 23
    and-long/2addr v10, v12

    .line 24
    cmp-long v3, v10, v8

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世哲兰苏()Lcom/alibaba/fastjson2/JSONException;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    throw v0

    .line 34
    :cond_1
    :goto_0
    const/16 v3, 0x22

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    if-eq v0, v3, :cond_2

    .line 38
    .line 39
    if-ne v0, v2, :cond_4

    .line 40
    .line 41
    :cond_2
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 42
    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/16 v3, 0x7b

    .line 61
    .line 62
    if-ne v2, v3, :cond_4

    .line 63
    .line 64
    invoke-static {v0, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世兰哲(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :try_start_0
    invoke-virtual {v1, v6, v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子苏世兰(Ljava/util/Map;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    move-object v2, v0

    .line 77
    :try_start_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    throw v2

    .line 86
    :cond_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v11, 0x0

    .line 91
    if-nez v0, :cond_7

    .line 92
    .line 93
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iput-boolean v10, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 98
    .line 99
    move v12, v2

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    :goto_2
    return-void

    .line 118
    :cond_6
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_7
    move v12, v10

    .line 127
    :goto_3
    iget-wide v2, v7, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 128
    .line 129
    or-long v13, v4, v2

    .line 130
    .line 131
    move v15, v10

    .line 132
    :goto_4
    iget-char v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 133
    .line 134
    const/16 v3, 0x2f

    .line 135
    .line 136
    if-ne v2, v3, :cond_8

    .line 137
    .line 138
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏兰世子()V

    .line 139
    .line 140
    .line 141
    :cond_8
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏世楪()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_9

    .line 146
    .line 147
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_9
    if-eqz v15, :cond_b

    .line 152
    .line 153
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 154
    .line 155
    if-eqz v2, :cond_a

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_a
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_b
    :goto_5
    if-nez v0, :cond_d

    .line 167
    .line 168
    if-eqz v12, :cond_c

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_c
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲世兰()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const/4 v2, 0x1

    .line 176
    move-wide/from16 v16, v8

    .line 177
    .line 178
    move v8, v2

    .line 179
    goto :goto_7

    .line 180
    :cond_d
    :goto_6
    iget-char v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 181
    .line 182
    move-wide/from16 v16, v8

    .line 183
    .line 184
    const/16 v8, 0x30

    .line 185
    .line 186
    if-lt v2, v8, :cond_e

    .line 187
    .line 188
    const/16 v8, 0x39

    .line 189
    .line 190
    if-le v2, v8, :cond_f

    .line 191
    .line 192
    :cond_e
    const/16 v8, 0x2d

    .line 193
    .line 194
    if-ne v2, v8, :cond_10

    .line 195
    .line 196
    :cond_f
    move v8, v0

    .line 197
    move-object v0, v11

    .line 198
    goto :goto_7

    .line 199
    :cond_10
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子苏兰哲()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    move v8, v0

    .line 204
    move-object v0, v2

    .line 205
    :goto_7
    if-nez v0, :cond_16

    .line 206
    .line 207
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世苏哲()Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_13

    .line 212
    .line 213
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰哲世子()Ljava/lang/Number;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    move/from16 v18, v12

    .line 218
    .line 219
    iget-wide v11, v7, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 220
    .line 221
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonStringKeyAsString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 222
    .line 223
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 224
    .line 225
    and-long v2, v11, v3

    .line 226
    .line 227
    cmp-long v2, v2, v16

    .line 228
    .line 229
    if-eqz v2, :cond_11

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    :cond_11
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 236
    .line 237
    if-nez v2, :cond_12

    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_12
    const-string v0, "syntax error, illegal key-value"

    .line 241
    .line 242
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :cond_13
    move/from16 v18, v12

    .line 251
    .line 252
    iget-wide v2, v7, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 253
    .line 254
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 255
    .line 256
    iget-wide v11, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 257
    .line 258
    and-long/2addr v2, v11

    .line 259
    cmp-long v0, v2, v16

    .line 260
    .line 261
    if-eqz v0, :cond_15

    .line 262
    .line 263
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子兰苏哲()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    :goto_8
    iget-char v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 268
    .line 269
    const/16 v3, 0x3a

    .line 270
    .line 271
    if-ne v2, v3, :cond_14

    .line 272
    .line 273
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 274
    .line 275
    .line 276
    :cond_14
    :goto_9
    move-object v3, v0

    .line 277
    goto :goto_a

    .line 278
    :cond_15
    const-string v0, "not allow unquoted fieldName"

    .line 279
    .line 280
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :cond_16
    move/from16 v18, v12

    .line 289
    .line 290
    goto :goto_9

    .line 291
    :goto_a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_18

    .line 296
    .line 297
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    const-string v2, ".."

    .line 302
    .line 303
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eqz v2, :cond_17

    .line 308
    .line 309
    move-object v0, v6

    .line 310
    goto :goto_b

    .line 311
    :cond_17
    :try_start_2
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 312
    .line 313
    .line 314
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 315
    invoke-virtual {v1, v6, v3, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 316
    .line 317
    .line 318
    const/4 v0, 0x0

    .line 319
    :goto_b
    invoke-interface {v6, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    goto/16 :goto_d

    .line 323
    .line 324
    :catch_0
    const-string v2, "$ref"

    .line 325
    .line 326
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/JSONObject;->of(Ljava/lang/String;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONObject;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-interface {v6, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    goto/16 :goto_d

    .line 334
    .line 335
    :cond_18
    iput-boolean v10, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 336
    .line 337
    iget-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 338
    .line 339
    const-string v2, "FASTJSON2.0.60error, offset "

    .line 340
    .line 341
    sparse-switch v0, :sswitch_data_0

    .line 342
    .line 343
    .line 344
    packed-switch v0, :pswitch_data_0

    .line 345
    .line 346
    .line 347
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 348
    .line 349
    iget-char v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 350
    .line 351
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(IILjava/lang/String;)V

    .line 352
    .line 353
    .line 354
    return-void

    .line 355
    :pswitch_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 356
    .line 357
    .line 358
    iget-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 359
    .line 360
    const/16 v5, 0x2f

    .line 361
    .line 362
    if-ne v0, v5, :cond_19

    .line 363
    .line 364
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏兰世子()V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_d

    .line 368
    .line 369
    :cond_19
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 370
    .line 371
    iget-char v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 372
    .line 373
    iget v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 374
    .line 375
    new-instance v3, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    const-string v4, "FASTJSON2.0.60input not support "

    .line 378
    .line 379
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    const-string v2, ", offset "

    .line 386
    .line 387
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    throw v0

    .line 401
    :sswitch_0
    if-eqz v18, :cond_1a

    .line 402
    .line 403
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    .line 404
    .line 405
    const/4 v2, 0x0

    .line 406
    move-wide/from16 v4, p2

    .line 407
    .line 408
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    goto :goto_c

    .line 413
    :cond_1a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世兰苏()Ljava/util/Map;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    goto :goto_c

    .line 418
    :sswitch_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子兰世苏哲()[B

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    goto :goto_c

    .line 423
    :sswitch_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰哲子世()Ljava/util/Date;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    goto :goto_c

    .line 428
    :sswitch_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子兰苏世哲()Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    goto :goto_c

    .line 437
    :sswitch_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世兰苏()Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    goto :goto_c

    .line 442
    :sswitch_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    if-eqz v0, :cond_1b

    .line 447
    .line 448
    const-class v0, Ljava/util/HashSet;

    .line 449
    .line 450
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏哲世兰(Ljava/lang/Class;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    goto :goto_c

    .line 455
    :cond_1b
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 456
    .line 457
    iget-char v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 458
    .line 459
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(IILjava/lang/String;)V

    .line 460
    .line 461
    .line 462
    return-void

    .line 463
    :sswitch_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪哲世()Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-eqz v0, :cond_1c

    .line 468
    .line 469
    const-wide/high16 v4, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 470
    .line 471
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    goto :goto_c

    .line 476
    :cond_1c
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 477
    .line 478
    iget-char v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 479
    .line 480
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(IILjava/lang/String;)V

    .line 481
    .line 482
    .line 483
    return-void

    .line 484
    :pswitch_1
    :sswitch_7
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰哲世子()Ljava/lang/Number;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    goto :goto_c

    .line 489
    :sswitch_8
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    :goto_c
    if-nez v0, :cond_1d

    .line 494
    .line 495
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 496
    .line 497
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 498
    .line 499
    and-long/2addr v4, v13

    .line 500
    cmp-long v2, v4, v16

    .line 501
    .line 502
    if-eqz v2, :cond_1d

    .line 503
    .line 504
    goto :goto_d

    .line 505
    :cond_1d
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 506
    .line 507
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 508
    .line 509
    and-long/2addr v4, v13

    .line 510
    cmp-long v2, v4, v16

    .line 511
    .line 512
    if-eqz v2, :cond_1e

    .line 513
    .line 514
    const-string v2, "@type"

    .line 515
    .line 516
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    if-eqz v2, :cond_1e

    .line 521
    .line 522
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    if-eqz v2, :cond_1e

    .line 535
    .line 536
    goto :goto_d

    .line 537
    :cond_1e
    invoke-interface {v6, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    if-eqz v2, :cond_20

    .line 542
    .line 543
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 544
    .line 545
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 546
    .line 547
    and-long/2addr v4, v13

    .line 548
    cmp-long v4, v4, v16

    .line 549
    .line 550
    if-eqz v4, :cond_20

    .line 551
    .line 552
    instance-of v4, v2, Ljava/util/Collection;

    .line 553
    .line 554
    if-eqz v4, :cond_1f

    .line 555
    .line 556
    move-object v4, v2

    .line 557
    check-cast v4, Ljava/util/Collection;

    .line 558
    .line 559
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    invoke-interface {v6, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    goto :goto_d

    .line 566
    :cond_1f
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-interface {v6, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    :cond_20
    :goto_d
    add-int/lit8 v15, v15, 0x1

    .line 574
    .line 575
    move-wide/from16 v4, p2

    .line 576
    .line 577
    move v0, v8

    .line 578
    move-wide/from16 v8, v16

    .line 579
    .line 580
    move/from16 v12, v18

    .line 581
    .line 582
    const/4 v11, 0x0

    .line 583
    goto/16 :goto_4

    .line 584
    .line 585
    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_8
        0x27 -> :sswitch_8
        0x2b -> :sswitch_7
        0x49 -> :sswitch_6
        0x53 -> :sswitch_5
        0x5b -> :sswitch_4
        0x66 -> :sswitch_3
        0x6e -> :sswitch_2
        0x74 -> :sswitch_3
        0x78 -> :sswitch_1
        0x7b -> :sswitch_0
    .end sparse-switch

    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    :pswitch_data_0
    .packed-switch 0x2d
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public 飘花落叶言楪子苏哲世兰(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 6
    .line 7
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v1, v3

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 22
    .line 23
    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v5, 0x0

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    move-object v3, p0

    .line 32
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public 飘花落叶言楪子苏哲兰世(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 6
    .line 7
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v1, v3

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 22
    .line 23
    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v5, 0x0

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    move-object v3, p0

    .line 32
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public abstract 飘花落叶言楪苏世兰哲子()Ljava/time/LocalTime;
.end method

.method public abstract 飘花落叶言楪苏世兰子哲()Ljava/time/LocalTime;
.end method

.method public abstract 飘花落叶言楪苏世哲兰子()Ljava/time/LocalTime;
.end method

.method public abstract 飘花落叶言楪苏世哲子兰()Ljava/time/LocalTime;
.end method

.method public 飘花落叶言楪苏世子兰哲()Ljava/time/LocalTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    packed-switch v0, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    const-string v0, "null"

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p0, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_3
    const-string v0, "not support len : "

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_4
    :goto_0
    return-object v1

    .line 101
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰哲世()Ljava/time/LocalDateTime;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰世哲()Ljava/time/LocalDateTime;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏哲子世兰()Ljava/time/LocalTime;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰哲子()Ljava/time/LocalTime;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()Ljava/time/LocalTime;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()Ljava/time/LocalTime;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲子兰()Ljava/time/LocalTime;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :pswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏哲兰世子()Ljava/time/LocalTime;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏哲兰子世()Ljava/time/LocalTime;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :pswitch_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏哲世兰子()Ljava/time/LocalTime;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏哲世子兰()Ljava/time/LocalTime;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :pswitch_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏哲子兰世()Ljava/time/LocalTime;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public abstract 飘花落叶言楪苏世子哲兰(I)Ljava/time/LocalDateTime;
.end method

.method public abstract 飘花落叶言楪苏兰世哲子()V
.end method

.method public 飘花落叶言楪苏兰世子哲()D
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "not support"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public 飘花落叶言楪苏兰哲世子()Ljava/lang/Number;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世苏兰()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public abstract 飘花落叶言楪苏兰哲子世()Ljava/util/Date;
.end method

.method public abstract 飘花落叶言楪苏兰子世哲()J
.end method

.method public final 飘花落叶言楪苏兰子哲世()J
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const-string v3, "0000-00-00"

    .line 14
    .line 15
    const-string v4, "TODO : "

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    const-wide/16 v6, 0x0

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    packed-switch v2, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    :pswitch_0
    goto/16 :goto_1

    .line 25
    .line 26
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰哲世()Ljava/time/LocalDateTime;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰子世哲()J

    .line 33
    .line 34
    .line 35
    move-result-wide v9

    .line 36
    cmp-long v4, v9, v6

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    iget-boolean v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 41
    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰世哲()Ljava/time/LocalDateTime;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_1
    :goto_0
    return-wide v9

    .line 52
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子哲兰世()Ljava/time/LocalDateTime;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子哲世兰()Ljava/time/LocalDateTime;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    goto :goto_2

    .line 63
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()Ljava/time/LocalDateTime;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    goto :goto_2

    .line 68
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世哲兰()Ljava/time/LocalDateTime;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    goto :goto_2

    .line 73
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲苏子()Ljava/time/LocalDateTime;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    goto :goto_2

    .line 78
    :pswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰子哲苏()Ljava/time/LocalDate;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-eqz v4, :cond_5

    .line 83
    .line 84
    sget-object v9, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 85
    .line 86
    invoke-static {v4, v9}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    goto :goto_2

    .line 91
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰子苏哲()Ljava/time/LocalDate;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    if-nez v9, :cond_4

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 108
    .line 109
    return-wide v6

    .line 110
    :cond_2
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_3

    .line 115
    .line 116
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    return-wide v0

    .line 121
    :cond_3
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-wide v6

    .line 129
    :cond_4
    sget-object v4, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 130
    .line 131
    invoke-static {v9, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    goto :goto_2

    .line 136
    :pswitch_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰苏哲子()Ljava/time/LocalDate;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    if-eqz v4, :cond_5

    .line 141
    .line 142
    sget-object v9, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 143
    .line 144
    invoke-static {v4, v9}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    goto :goto_2

    .line 149
    :cond_5
    :goto_1
    move-object v4, v8

    .line 150
    goto :goto_2

    .line 151
    :pswitch_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰苏子哲()Ljava/time/LocalDate;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    if-eqz v9, :cond_1a

    .line 156
    .line 157
    sget-object v4, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 158
    .line 159
    invoke-static {v9, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    :goto_2
    const/4 v9, 0x2

    .line 164
    const-string v10, "null"

    .line 165
    .line 166
    const/4 v11, -0x1

    .line 167
    if-eqz v4, :cond_6

    .line 168
    .line 169
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v4, v1, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    goto/16 :goto_6

    .line 178
    .line 179
    :cond_6
    const/16 v1, 0x14

    .line 180
    .line 181
    if-lt v2, v1, :cond_f

    .line 182
    .line 183
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏世兰子(I)Ljava/time/ZonedDateTime;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    if-nez v1, :cond_e

    .line 188
    .line 189
    const/16 v4, 0x20

    .line 190
    .line 191
    if-lt v2, v4, :cond_e

    .line 192
    .line 193
    const/16 v4, 0x23

    .line 194
    .line 195
    if-gt v2, v4, :cond_e

    .line 196
    .line 197
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 202
    .line 203
    if-nez v1, :cond_7

    .line 204
    .line 205
    goto/16 :goto_6

    .line 206
    .line 207
    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-nez v2, :cond_8

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_8
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 215
    .line 216
    if-eqz v2, :cond_9

    .line 217
    .line 218
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 219
    .line 220
    if-eqz v4, :cond_9

    .line 221
    .line 222
    invoke-interface {v2, v1}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_9

    .line 227
    .line 228
    invoke-interface {v4, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, [B

    .line 233
    .line 234
    array-length v4, v2

    .line 235
    invoke-static {v2, v0, v4, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世兰楪哲([BIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    goto :goto_3

    .line 240
    :cond_9
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    array-length v4, v2

    .line 245
    invoke-static {v2, v0, v4, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世兰哲楪([CIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    :goto_3
    if-nez v2, :cond_d

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    sparse-switch v2, :sswitch_data_0

    .line 256
    .line 257
    .line 258
    :goto_4
    move v2, v11

    .line 259
    goto :goto_5

    .line 260
    :sswitch_0
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-nez v2, :cond_a

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_a
    move v2, v9

    .line 268
    goto :goto_5

    .line 269
    :sswitch_1
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-nez v2, :cond_b

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_b
    move v2, v5

    .line 277
    goto :goto_5

    .line 278
    :sswitch_2
    const-string v2, "0"

    .line 279
    .line 280
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-nez v2, :cond_c

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_c
    move v2, v0

    .line 288
    :goto_5
    packed-switch v2, :pswitch_data_1

    .line 289
    .line 290
    .line 291
    new-instance p0, Ljava/time/format/DateTimeParseException;

    .line 292
    .line 293
    invoke-direct {p0, v1, v1, v0}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 294
    .line 295
    .line 296
    throw p0

    .line 297
    :cond_d
    move-object v8, v2

    .line 298
    goto :goto_6

    .line 299
    :cond_e
    move-object v8, v1

    .line 300
    :cond_f
    :goto_6
    :pswitch_c
    if-eqz v8, :cond_11

    .line 301
    .line 302
    invoke-interface {v8}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 303
    .line 304
    .line 305
    move-result-wide v0

    .line 306
    invoke-virtual {v8}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-virtual {p0}, Ljava/time/LocalTime;->getNano()I

    .line 311
    .line 312
    .line 313
    move-result p0

    .line 314
    cmp-long v2, v0, v6

    .line 315
    .line 316
    const v3, 0xf4240

    .line 317
    .line 318
    .line 319
    const-wide/16 v4, 0x3e8

    .line 320
    .line 321
    if-gez v2, :cond_10

    .line 322
    .line 323
    if-lez p0, :cond_10

    .line 324
    .line 325
    const-wide/16 v6, 0x1

    .line 326
    .line 327
    add-long/2addr v0, v6

    .line 328
    mul-long/2addr v0, v4

    .line 329
    div-int/2addr p0, v3

    .line 330
    add-int/lit16 p0, p0, -0x3e8

    .line 331
    .line 332
    :goto_7
    int-to-long v2, p0

    .line 333
    add-long/2addr v0, v2

    .line 334
    return-wide v0

    .line 335
    :cond_10
    mul-long/2addr v0, v4

    .line 336
    div-int/2addr p0, v3

    .line 337
    goto :goto_7

    .line 338
    :cond_11
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-nez v2, :cond_19

    .line 347
    .line 348
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-eqz v2, :cond_12

    .line 353
    .line 354
    goto :goto_9

    .line 355
    :cond_12
    const-string v2, "0000-00-00T00:00:00"

    .line 356
    .line 357
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    if-nez v2, :cond_18

    .line 362
    .line 363
    const-string v2, "0001-01-01T00:00:00+08:00"

    .line 364
    .line 365
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-eqz v2, :cond_13

    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_13
    const-string v2, "/Date("

    .line 373
    .line 374
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-eqz v2, :cond_16

    .line 379
    .line 380
    const-string v2, ")/"

    .line 381
    .line 382
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-eqz v2, :cond_16

    .line 387
    .line 388
    const/4 p0, 0x6

    .line 389
    invoke-static {v9, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    const/16 v1, 0x2b

    .line 394
    .line 395
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-ne v1, v11, :cond_14

    .line 400
    .line 401
    const/16 v1, 0x2d

    .line 402
    .line 403
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    :cond_14
    if-eq v1, v11, :cond_15

    .line 408
    .line 409
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    :cond_15
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 414
    .line 415
    .line 416
    move-result-wide v0

    .line 417
    return-wide v0

    .line 418
    :cond_16
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_17

    .line 423
    .line 424
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 425
    .line 426
    .line 427
    move-result-wide v0

    .line 428
    return-wide v0

    .line 429
    :cond_17
    const-string v0, "format null not support, input "

    .line 430
    .line 431
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    :cond_18
    :goto_8
    return-wide v6

    .line 443
    :cond_19
    :goto_9
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 444
    .line 445
    return-wide v6

    .line 446
    :cond_1a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    invoke-static {p0, v4}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    return-wide v6

    .line 454
    nop

    .line 455
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_2
        0x33c587 -> :sswitch_1
        0x4f8288e0 -> :sswitch_0
    .end sparse-switch

    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_c
        :pswitch_c
        :pswitch_c
    .end packed-switch
.end method

.method public abstract 飘花落叶言楪苏哲世兰子()Ljava/time/LocalTime;
.end method

.method public abstract 飘花落叶言楪苏哲世子兰()Ljava/time/LocalTime;
.end method

.method public abstract 飘花落叶言楪苏哲兰世子()Ljava/time/LocalTime;
.end method

.method public abstract 飘花落叶言楪苏哲兰子世()Ljava/time/LocalTime;
.end method

.method public abstract 飘花落叶言楪苏哲子世兰()Ljava/time/LocalTime;
.end method

.method public abstract 飘花落叶言楪苏哲子兰世()Ljava/time/LocalTime;
.end method

.method public abstract 飘花落叶言楪苏子世兰哲()Ljava/time/LocalDateTime;
.end method

.method public abstract 飘花落叶言楪苏子世哲兰()Ljava/time/LocalDateTime;
.end method

.method public abstract 飘花落叶言楪苏子兰世哲()Ljava/time/LocalDateTime;
.end method

.method public abstract 飘花落叶言楪苏子兰哲世()Ljava/time/LocalDateTime;
.end method

.method public abstract 飘花落叶言楪苏子哲世兰()Ljava/time/LocalDateTime;
.end method

.method public abstract 飘花落叶言楪苏子哲兰世()Ljava/time/LocalDateTime;
.end method
