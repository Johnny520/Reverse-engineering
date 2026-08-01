.class public abstract Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

.field public static final 飘花落叶言子楪世苏哲兰:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    sput-object v1, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:[B

    .line 5
    .line 6
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    sput-object v2, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-static {v1, v0, v0, v0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰([BIIZ)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static 飘花落叶言子楪世兰苏哲(I[BII)I
    .locals 2

    .line 1
    move v0, p2

    .line 2
    :goto_0
    add-int v1, p2, p3

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    mul-int/lit8 p0, p0, 0x1f

    .line 7
    .line 8
    aget-byte v1, p1, v0

    .line 9
    .line 10
    add-int/2addr p0, v1

    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return p0
.end method

.method public static 飘花落叶言子楪世哲兰苏(J)I
    .locals 2

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    ushr-long v0, p0, v0

    .line 4
    .line 5
    xor-long/2addr p0, v0

    .line 6
    long-to-int p0, p0

    .line 7
    return p0
.end method

.method public static 飘花落叶言子楪世哲苏兰(Z)I
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const/16 p0, 0x4cf

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const/16 p0, 0x4d5

    .line 7
    .line 8
    return p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "getDefaultInstance"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    const-string v1, "Failed to get default instance for "

    .line 17
    .line 18
    invoke-static {p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p1}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
