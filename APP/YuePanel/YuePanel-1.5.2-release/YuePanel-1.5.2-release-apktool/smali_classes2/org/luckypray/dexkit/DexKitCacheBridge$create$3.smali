.class final Lorg/luckypray/dexkit/DexKitCacheBridge$create$3;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
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
    value = Lorg/luckypray/dexkit/DexKitCacheBridge;->create(Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $appTag:Ljava/lang/String;

.field final synthetic $classLoader:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$3;->$appTag:Ljava/lang/String;

    iput-object p2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$3;->$classLoader:Ljava/lang/ClassLoader;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$create$3;->invoke()Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->Companion:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;

    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$3;->$appTag:Ljava/lang/String;

    iget-object v2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$3;->$classLoader:Ljava/lang/ClassLoader;

    invoke-virtual {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;->create$dexkit_android_release(Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    move-result-object v0

    return-object v0
.end method
