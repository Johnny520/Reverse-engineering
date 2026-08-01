.class public final L飘花落叶言世子苏哲楪兰/飘花落叶言子世苏楪兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言子世苏楪哲兰;

.field public static final 飘花落叶言子楪世哲兰苏:[Lkotlin/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Boolean;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Integer;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世子苏哲楪兰/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子苏哲楪兰/飘花落叶言子世苏楪兰哲;->Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪哲苏兰世;

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-direct {v1, v2}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪哲苏兰世;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

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
    sput-object v1, L飘花落叶言世子苏哲楪兰/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 35
    .line 36
    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x7

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x7

    .line 5
    if-ne v2, v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 11
    .line 12
    iput-object p3, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Integer;

    .line 13
    .line 14
    iput-object p4, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/16 p1, 0x64

    .line 21
    .line 22
    if-gt p0, p1, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "\'values\' field must not exceed 100 items"

    .line 26
    .line 27
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :cond_1
    sget-object p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子苏哲楪兰/飘花落叶言子世楪兰哲苏;

    .line 32
    .line 33
    invoke-virtual {p0}, L飘花落叶言世子苏哲楪兰/飘花落叶言子世楪兰哲苏;->getDescriptor()L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p1, v2, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪苏哲世兰(IIL飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)V

    .line 38
    .line 39
    .line 40
    throw v1
.end method
