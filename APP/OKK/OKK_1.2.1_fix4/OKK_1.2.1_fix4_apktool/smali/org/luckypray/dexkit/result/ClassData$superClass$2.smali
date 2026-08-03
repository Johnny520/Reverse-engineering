.class final Lorg/luckypray/dexkit/result/ClassData$superClass$2;
.super LQ0/h;
.source "SourceFile"

# interfaces
.implements LP0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/result/ClassData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQ0/h;",
        "LP0/a;"
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

    invoke-direct {p0, p1}, LQ0/h;-><init>(I)V

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
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 2
    iget-object v2, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v2}, Lorg/luckypray/dexkit/result/ClassData;->access$getSuperClassId$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v4, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    iget v5, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$dexId:I

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 3
    invoke-static {v4, v5, v2}, Lorg/luckypray/dexkit/result/ClassData;->access$getEncodeId(Lorg/luckypray/dexkit/result/ClassData;II)J

    move-result-wide v4

    new-array v2, v1, [J

    aput-wide v4, v2, v0

    sget-object v4, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v5

    invoke-static {v4, v5, v6, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

    move-result-object v2

    sget-object v4, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v5, "wrap(res)"

    invoke-static {v2, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;->getRootAsClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;

    move-result-object v2

    new-instance v4, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v4}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->getClassesLength()I

    move-result v5

    :goto_0
    if-ge v0, v5, :cond_0

    sget-object v6, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v7

    invoke-static {v7}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v6, v3, v7}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lorg/luckypray/dexkit/result/BaseDataList;->firstOrNull()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method
