.class final synthetic Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$2;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->invoke()L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世哲苏兰;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "createBridge()Lorg/luckypray/dexkit/DexKitBridge;"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v3, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    const-string v4, "createBridge"

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 66
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$2;->invoke()Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 2

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iget-object v0, p0, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object v0, p0, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:[[B

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance p0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;-><init>([[B)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    iget-object p0, p0, Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/ClassLoader;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    :try_start_0
    const-string v1, "dalvik.system.BaseDexClassLoader"

    .line 31
    .line 32
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/ClassLoader;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    const-string p0, "classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)"

    .line 49
    .line 50
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :catch_0
    const-string p0, "This method requires Android runtime"

    .line 55
    .line 56
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_3
    const-string p0, "init fail"

    .line 61
    .line 62
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method
