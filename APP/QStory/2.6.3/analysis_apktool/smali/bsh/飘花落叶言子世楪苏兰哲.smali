.class public final Lbsh/飘花落叶言子世楪苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lbsh/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Lbsh/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget p0, p0, Lbsh/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    if-ge v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lbsh/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lbsh/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lbsh/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method
