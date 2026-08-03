.class final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$2;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lorg/luckypray/dexkit/wrap/DexMethod;",
        "it",
        "Lorg/luckypray/dexkit/result/MethodData;",
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
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Lorg/luckypray/dexkit/result/MethodData;",
        "Lorg/luckypray/dexkit/wrap/DexMethod;",
        ">;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$2;

    invoke-direct {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$2;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$2;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$2;->invoke(Lorg/luckypray/dexkit/result/MethodData;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/luckypray/dexkit/result/MethodData;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/result/MethodData;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lorg/luckypray/dexkit/result/MethodData;->toDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p1

    return-object p1
.end method
