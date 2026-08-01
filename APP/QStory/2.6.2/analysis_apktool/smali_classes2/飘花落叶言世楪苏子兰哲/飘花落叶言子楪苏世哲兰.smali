.class public final L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世苏兰哲;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世苏哲兰:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const-class v1, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世苏兰哲;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 v0, 0x0

    .line 12
    :goto_0
    const-class v1, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p1, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;

    .line 25
    .line 26
    iget-boolean v0, p0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Z

    .line 27
    .line 28
    iget-boolean v1, p1, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Z

    .line 29
    .line 30
    if-eq v0, v1, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget-object p0, p0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 34
    .line 35
    iget-object p1, p1, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    :goto_1
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public final getType()L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method
