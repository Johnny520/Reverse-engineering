.class public final L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子世苏;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/String;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子世苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子世苏;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p4, 0xf

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p5, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲苏兰世子;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲苏兰世子;

    .line 20
    .line 21
    invoke-virtual {p0}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲苏兰世子;->getDescriptor()L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p4, v1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪苏哲世兰(IIL飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;

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
    check-cast p1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;

    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 47
    .line 48
    iget-object p1, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object v3, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    :goto_0
    add-int/2addr v0, v3

    .line 28
    mul-int/2addr v0, v1

    .line 29
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    :goto_1
    add-int/2addr v0, v2

    .line 39
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ResourceTemplate(uriTemplate="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", name="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", description="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", mimeType="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰子苏世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 39
    .line 40
    const/16 v1, 0x29

    .line 41
    .line 42
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
