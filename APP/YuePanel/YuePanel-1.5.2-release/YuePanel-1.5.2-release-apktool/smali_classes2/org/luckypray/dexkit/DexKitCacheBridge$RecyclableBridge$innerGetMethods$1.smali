.class final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$1;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lorg/luckypray/dexkit/result/MethodData;",
        "b",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "q",
        "Lorg/luckypray/dexkit/query/FindMethod;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "Lorg/luckypray/dexkit/query/FindMethod;",
        "Ljava/util/List<",
        "+",
        "Lorg/luckypray/dexkit/result/MethodData;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$1;

    invoke-direct {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$1;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$1;->invoke(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/DexKitBridge;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/FindMethod;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            ")",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;"
        }
    .end annotation

    const-string v0, "b"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "q"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p1

    return-object p1
.end method
