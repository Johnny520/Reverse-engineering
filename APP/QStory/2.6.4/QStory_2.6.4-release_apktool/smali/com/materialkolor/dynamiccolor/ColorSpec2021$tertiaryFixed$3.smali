.class final synthetic Lcom/materialkolor/dynamiccolor/ColorSpec2021$tertiaryFixed$3;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const-class v3, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪苏兰世哲;

    .line 6
    .line 7
    const-string v4, "highestSurface"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰哲苏世;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪苏兰世哲;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰哲苏世;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    check-cast p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1}, Lcom/materialkolor/dynamiccolor/ColorSpec2021$tertiaryFixed$3;->invoke(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰哲苏世;

    move-result-object p0

    return-object p0
.end method
