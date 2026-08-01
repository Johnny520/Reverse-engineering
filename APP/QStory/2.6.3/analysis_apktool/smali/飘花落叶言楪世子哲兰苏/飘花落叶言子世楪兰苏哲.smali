.class public final L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/Set;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v1, "http"

    .line 4
    .line 5
    const-string v2, "https"

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/Set;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    sget-object p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/Set;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;IIL飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;
    .locals 1

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    new-instance v0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {v0, p1}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;

    .line 13
    .line 14
    invoke-interface {p0, v0, p2, p3, p4}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;IIL飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
