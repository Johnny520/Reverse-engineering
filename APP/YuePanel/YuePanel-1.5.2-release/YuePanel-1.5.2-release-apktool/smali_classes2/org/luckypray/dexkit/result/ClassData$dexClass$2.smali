.class final Lorg/luckypray/dexkit/result/ClassData$dexClass$2;
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
        "Lorg/luckypray/dexkit/wrap/DexClass;",
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
    value = Lorg/luckypray/dexkit/result/ClassData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Lorg/luckypray/dexkit/wrap/DexClass;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/luckypray/dexkit/result/ClassData;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/result/ClassData;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData$dexClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData$dexClass$2;->invoke()Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexClass;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/ClassData$dexClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/result/ClassData;->getDescriptor()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/wrap/DexClass;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
