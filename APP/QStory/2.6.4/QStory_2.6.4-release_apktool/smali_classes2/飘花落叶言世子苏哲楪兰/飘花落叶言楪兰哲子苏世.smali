.class public final L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子世苏;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子世苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;->Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子世苏;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;)V
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
    iput-object p2, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Boolean;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲世子;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲世子;

    .line 13
    .line 14
    invoke-virtual {p0}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲世子;->getDescriptor()L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p1, v1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪苏哲世兰(IIL飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    throw p0
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
    instance-of v1, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;

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
    check-cast p1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Boolean;

    .line 14
    .line 15
    iget-object p1, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Boolean;

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
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Tools(listChanged="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
