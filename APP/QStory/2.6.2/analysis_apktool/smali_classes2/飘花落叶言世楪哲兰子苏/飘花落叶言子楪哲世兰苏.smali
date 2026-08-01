.class public final L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/Integer;

.field public final 飘花落叶言子楪世哲苏兰:Lkotlin/DeprecationLevel;

.field public final 飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$VersionRequirement$VersionKind;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世苏兰;


# direct methods
.method public constructor <init>(L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世苏兰;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$VersionRequirement$VersionKind;Lkotlin/DeprecationLevel;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世苏兰;

    .line 8
    .line 9
    iput-object p2, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$VersionRequirement$VersionKind;

    .line 10
    .line 11
    iput-object p3, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:Lkotlin/DeprecationLevel;

    .line 12
    .line 13
    iput-object p4, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Integer;

    .line 14
    .line 15
    iput-object p5, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "since "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世苏兰;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:Lkotlin/DeprecationLevel;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ""

    .line 24
    .line 25
    iget-object v2, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Integer;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v4, " error "

    .line 32
    .line 33
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object v2, v1

    .line 49
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    const-string v1, ": "

    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
