.class public final L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言苏楪世子哲兰/飘花落叶言子世哲兰楪苏;

.field public static final 飘花落叶言子楪世苏兰哲:[Lkotlin/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言苏楪世子哲兰/飘花落叶言子世哲兰楪苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;->Companion:L飘花落叶言苏楪世子哲兰/飘花落叶言子世哲兰楪苏;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, L飘花落叶言苏世子哲兰楪/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    const/16 v2, 0xb

    .line 13
    .line 14
    invoke-direct {v1, v2}, L飘花落叶言苏世子哲兰楪/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    new-array v1, v1, [Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aput-object v0, v1, v2

    .line 26
    .line 27
    sput-object v1, L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 9
    .line 10
    iput-object p1, p0, L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iput-object p2, p0, L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;

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
    check-cast p1, L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 14
    .line 15
    iget-object p1, p1, L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x5a7

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, L飘花落叶言苏楪世子哲兰/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 p0, 0x29

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
