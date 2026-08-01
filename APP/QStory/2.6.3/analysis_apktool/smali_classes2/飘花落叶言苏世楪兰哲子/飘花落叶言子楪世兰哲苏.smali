.class public L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰哲苏;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const-string p1, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5"

    .line 2
    .line 3
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 8
    .line 9
    const/16 v1, 0xee6

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    const-string p1, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 14
    .line 15
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    const/16 v0, 0x474

    .line 20
    .line 21
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    new-array v3, v2, [Ljava/lang/Class;

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;

    .line 35
    .line 36
    invoke-direct {v0, v2}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
