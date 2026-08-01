.class public final L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪世苏兰哲:I


# direct methods
.method public constructor <init>(IL飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    iget v0, p0, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 8
    .line 9
    iget v1, p1, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    iget-object p1, p1, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;

    .line 16
    .line 17
    invoke-interface {p0, p1}, L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;->equals(Ljava/lang/Object;)Z

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
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    invoke-static {p0, v0}, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏兰世哲(ILjava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/security/MessageDigest;)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-interface {v0, p1}, L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/security/MessageDigest;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget p0, p0, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
