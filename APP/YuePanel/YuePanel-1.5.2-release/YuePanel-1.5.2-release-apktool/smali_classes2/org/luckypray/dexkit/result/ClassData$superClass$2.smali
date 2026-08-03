.class final Lorg/luckypray/dexkit/result/ClassData$superClass$2;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lorg/luckypray/dexkit/result/ClassData;",
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
        "Lorg/luckypray/dexkit/result/ClassData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $bridge:Lorg/luckypray/dexkit/DexKitBridge;

.field final synthetic $dexId:I

.field final synthetic this$0:Lorg/luckypray/dexkit/result/ClassData;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/result/ClassData;Lorg/luckypray/dexkit/DexKitBridge;I)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    iput-object p2, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iput p3, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$dexId:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->invoke()Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/ClassData;
    .locals 5
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v0}, Lorg/luckypray/dexkit/result/ClassData;->access$getSuperClassId$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v2, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    iget v3, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$dexId:I

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 3
    invoke-static {v2, v3, v0}, Lorg/luckypray/dexkit/result/ClassData;->access$getEncodeId(Lorg/luckypray/dexkit/result/ClassData;II)J

    move-result-wide v2

    const/4 v0, 0x1

    new-array v0, v0, [J

    const/4 v4, 0x0

    aput-wide v2, v0, v4

    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->getTypeByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/BaseDataList;->firstOrNull()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
