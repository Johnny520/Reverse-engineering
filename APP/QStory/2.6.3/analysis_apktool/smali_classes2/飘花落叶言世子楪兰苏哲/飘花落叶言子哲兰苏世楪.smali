.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;


# annotations
.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏楪世;

.field public static final 飘花落叶言子楪世哲兰苏:[Lkotlin/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏楪世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏楪世;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;

    .line 11
    .line 12
    const/16 v2, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2}, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x3

    .line 22
    new-array v1, v1, [Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aput-object v0, v1, v2

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    aput-object v2, v1, v0

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    aput-object v2, v1, v0

    .line 33
    .line 34
    sput-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲兰苏:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/util/List;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v2, v0, :cond_2

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p3, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 11
    .line 12
    and-int/lit8 p3, p1, 0x2

    .line 13
    .line 14
    if-nez p3, :cond_0

    .line 15
    .line 16
    iput-object v1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput-object p2, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 20
    .line 21
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    sget-object p1, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 26
    .line 27
    iput-object p1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iput-object p4, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰世苏楪;

    .line 34
    .line 35
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰世苏楪;->getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p1, v2, p0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏哲世兰(IIL飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    .line 43
    sget-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    const/4 p1, 0x0

    .line 47
    iput-object p1, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 48
    iput-object v0, p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    return-void
.end method
