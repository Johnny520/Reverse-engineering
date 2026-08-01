.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# static fields
.field public static final 飘花落叶言子楪苏世兰哲:[B

.field public static final 飘花落叶言子楪苏世哲兰:[B


# instance fields
.field public 飘花落叶言子楪世兰哲苏:[B

.field public 飘花落叶言子楪世兰苏哲:Ljava/util/function/Function;

.field public 飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

.field public final 飘花落叶言子楪世哲苏兰:J

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "left"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:[B

    .line 8
    .line 9
    const-string v0, "right"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:[B

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/function/Function;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_0
    const-string v2, "getRight"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/function/Function;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    const-string p1, "getRight method not found"

    .line 25
    .line 26
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    :goto_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/function/Function;

    .line 31
    .line 32
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_0
    const-string v2, "getLeft"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    const-string p1, "getLeft method not found"

    .line 25
    .line 26
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    :goto_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 31
    .line 32
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p3

    .line 11
    sget-object p5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide p5, p5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr p3, p5

    .line 16
    const-wide/16 p5, 0x0

    .line 17
    .line 18
    cmp-long p3, p3, p5

    .line 19
    .line 20
    if-eqz p3, :cond_2

    .line 21
    .line 22
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:[B

    .line 23
    .line 24
    if-nez p3, :cond_1

    .line 25
    .line 26
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    iput-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:[B

    .line 33
    .line 34
    :cond_1
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:[B

    .line 35
    .line 36
    iget-wide p4, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:J

    .line 37
    .line 38
    invoke-virtual {p1, p4, p5, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰楪世哲()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object p2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:[B

    .line 53
    .line 54
    sget-wide p4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 55
    .line 56
    invoke-virtual {p1, p4, p5, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏哲楪世(J[B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object p2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:[B

    .line 63
    .line 64
    sget-wide p3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 65
    .line 66
    invoke-virtual {p1, p3, p4, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏哲楪世(J[B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰楪世哲()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide p4

    .line 22
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WritePairAsJavaBean:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 23
    .line 24
    iget-wide v0, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 25
    .line 26
    and-long/2addr p4, v0

    .line 27
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    cmp-long p2, p4, v0

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    const-string p2, "left"

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世楪兰苏()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const-string p2, "right"

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-boolean p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲世苏:Z

    .line 51
    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    iput-boolean p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲世苏:Z

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世楪兰苏()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏()V

    .line 71
    .line 72
    .line 73
    return-void
.end method
