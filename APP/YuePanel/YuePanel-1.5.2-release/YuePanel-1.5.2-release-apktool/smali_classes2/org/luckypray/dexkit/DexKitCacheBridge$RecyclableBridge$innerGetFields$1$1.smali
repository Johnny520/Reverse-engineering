.class final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1;
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
        "Lorg/luckypray/dexkit/query/FindField;",
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
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetFields(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindField;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Lorg/luckypray/dexkit/query/FindField;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $query:Lorg/luckypray/dexkit/query/FindField;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/query/FindField;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1;->$query:Lorg/luckypray/dexkit/query/FindField;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1;->invoke()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/query/FindField;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1;->$query:Lorg/luckypray/dexkit/query/FindField;

    return-object v0
.end method
