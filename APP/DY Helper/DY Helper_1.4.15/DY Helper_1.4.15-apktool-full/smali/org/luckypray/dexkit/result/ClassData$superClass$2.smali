.class final Lorg/luckypray/dexkit/result/ClassData$superClass$2;
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
.method public constructor <init>(Lorg/luckypray/dexkit/result/ClassData;Lorg/luckypray/dexkit/DexKitBridge;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput p3, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$dexId:I

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

    .line 42
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->invoke()Lorg/luckypray/dexkit/result/ClassData;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/ClassData;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/luckypray/dexkit/result/ClassData;->access$getSuperClassId$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 10
    .line 11
    iget-object v2, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    .line 12
    .line 13
    iget p0, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$dexId:I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v2, p0, v0}, Lorg/luckypray/dexkit/result/ClassData;->access$getEncodeId(Lorg/luckypray/dexkit/result/ClassData;II)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const/4 p0, 0x1

    .line 24
    new-array p0, p0, [J

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    aput-wide v2, p0, v0

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Lorg/luckypray/dexkit/DexKitBridge;->getTypeByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->firstOrNull()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method
