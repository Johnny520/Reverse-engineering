.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;


# annotations
.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲兰世子;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲兰世子;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲兰世子;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(IJ)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;->飘花落叶言子楪世苏哲兰:J

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲兰子世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲兰子世;

    .line 13
    .line 14
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲兰子世;->getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p1, v1, p0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏哲世兰(IIL飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    throw p0
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;->飘花落叶言子楪世苏哲兰:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;

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
    check-cast p1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;

    .line 12
    .line 13
    iget-wide v3, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;->飘花落叶言子楪世苏哲兰:J

    .line 14
    .line 15
    iget-wide p0, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;->飘花落叶言子楪世苏哲兰:J

    .line 16
    .line 17
    cmp-long p0, v3, p0

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;->飘花落叶言子楪世苏哲兰:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "NumberId(value="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰子世哲;->飘花落叶言子楪世苏哲兰:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

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
