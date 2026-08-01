.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏子世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪兰苏哲;


# annotations
.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final INSTANCE:L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏子世;

.field public static final synthetic 飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏子世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏子世;->INSTANCE:L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏子世;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;

    .line 11
    .line 12
    const/16 v2, 0x19

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
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p0, p1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏子世;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "endTurn"

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const p0, 0x392e6789

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u5b50\u696a\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "EndTurn"

    .line 2
    .line 3
    return-object p0
.end method
