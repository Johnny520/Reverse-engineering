.class final Lorg/luckypray/dexkit/result/ClassData$interfaces$2;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


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
        "Lbp0;",
        "Lp70;"
    }
.end annotation


# instance fields
.field final synthetic $bridge:Lorg/luckypray/dexkit/DexKitBridge;

.field final synthetic $dexId:I

.field final synthetic this$0:Lorg/luckypray/dexkit/result/ClassData;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    .line 4
    .line 5
    iput p3, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->$dexId:I

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 65
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->invoke()Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    .line 4
    .line 5
    invoke-static {v1}, Lorg/luckypray/dexkit/result/ClassData;->access$getInterfaceIds$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    .line 10
    .line 11
    iget p0, p0, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;->$dexId:I

    .line 12
    .line 13
    new-instance v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v4, 0xa

    .line 16
    .line 17
    invoke-static {v1, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-static {v2, p0, v4}, Lorg/luckypray/dexkit/result/ClassData;->access$getEncodeId(Lorg/luckypray/dexkit/result/ClassData;II)J

    .line 45
    .line 46
    .line 47
    move-result-wide v4

    .line 48
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {v3}, Lxh;->ｆ(Ljava/util/ArrayList;)[J

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge;->getTypeByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
