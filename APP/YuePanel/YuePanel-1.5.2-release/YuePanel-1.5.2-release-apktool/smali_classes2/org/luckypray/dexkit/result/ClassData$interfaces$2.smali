.class final Lorg/luckypray/dexkit/result/ClassData$interfaces$2;
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
        "Lorg/luckypray/dexkit/result/ClassDataList;",
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

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nClassData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$interfaces$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n1547#2:295\n1618#2,3:296\n*S KotlinDebug\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$interfaces$2\n*L\n116#1:295\n116#1:296,3\n*E\n"
    }
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
        "Lorg/luckypray/dexkit/result/ClassDataList;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClassData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$interfaces$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n1547#2:295\n1618#2,3:296\n*S KotlinDebug\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$interfaces$2\n*L\n116#1:295\n116#1:296,3\n*E\n"
.end annotation


# instance fields
.field final synthetic $bridge:Lorg/luckypray/dexkit/DexKitBridge;

.field final synthetic $dexId:I

.field final synthetic this$0:Lorg/luckypray/dexkit/result/ClassData;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;I)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    iput p3, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->$dexId:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->invoke()Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v1}, Lorg/luckypray/dexkit/result/ClassData;->access$getInterfaceIds$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    iget v3, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->$dexId:I

    .line 3
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, LYue/ۥ۟ۥۡۤ;->ۥۣ۟۟ۡ(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 5
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 6
    invoke-static {v2, v3, v5}, Lorg/luckypray/dexkit/result/ClassData;->access$getEncodeId(Lorg/luckypray/dexkit/result/ClassData;II)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 7
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {v4}, LYue/ۥ۟ۥۢ۠;->ۥ۟ۢ۠ۨ(Ljava/util/Collection;)[J

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->getTypeByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    return-object v0
.end method
