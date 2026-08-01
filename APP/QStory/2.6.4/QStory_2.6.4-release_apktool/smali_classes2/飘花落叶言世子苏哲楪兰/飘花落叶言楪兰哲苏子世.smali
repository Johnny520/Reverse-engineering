.class public final L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲苏子世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪兰苏哲;


# annotations
.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final INSTANCE:L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲苏子世;

.field public static final synthetic 飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲苏子世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲苏子世;->INSTANCE:L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲苏子世;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪世苏子哲兰;

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-direct {v1, v2}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪世苏子哲兰;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 21
    .line 22
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
    instance-of p0, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲苏子世;

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

.method public final serializer()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u54f2\u5b50\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    sget-object p0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

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
