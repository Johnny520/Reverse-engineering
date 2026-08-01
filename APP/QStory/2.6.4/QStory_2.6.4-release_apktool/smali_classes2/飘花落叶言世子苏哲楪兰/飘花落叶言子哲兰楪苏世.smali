.class public final L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子苏哲楪兰/飘花落叶言楪苏哲世子兰;


# annotations
.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪世苏;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世子苏哲楪兰/飘花落叶言楪子苏兰哲世;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪世苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪世苏;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;L飘花落叶言世子苏哲楪兰/飘花落叶言楪子苏兰哲世;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    :cond_0
    iput-object p2, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 10
    .line 11
    and-int/lit8 p2, p1, 0x2

    .line 12
    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    sget-object p2, L飘花落叶言世子苏哲楪兰/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;

    .line 16
    .line 17
    iput-object p2, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iput-object p3, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;

    .line 21
    .line 22
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 23
    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    sget-object p1, Lio/modelcontextprotocol/kotlin/sdk/Method$Defined;->PromptsList:Lio/modelcontextprotocol/kotlin/sdk/Method$Defined;

    .line 27
    .line 28
    iput-object p1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子苏哲楪兰/飘花落叶言楪子苏兰哲世;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    iput-object p4, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子苏哲楪兰/飘花落叶言楪子苏兰哲世;

    .line 32
    .line 33
    return-void
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
    instance-of v1, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;

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
    check-cast p1, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;

    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

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
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;

    .line 25
    .line 26
    iget-object p1, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;

    .line 27
    .line 28
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final getMethod()L飘花落叶言世子苏哲楪兰/飘花落叶言楪子苏兰哲世;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子苏哲楪兰/飘花落叶言楪子苏兰哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;

    .line 14
    .line 15
    iget-object p0, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/util/Map;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    add-int/2addr p0, v0

    .line 22
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ListPromptsRequest(cursor="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", _meta="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;

    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;C)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
