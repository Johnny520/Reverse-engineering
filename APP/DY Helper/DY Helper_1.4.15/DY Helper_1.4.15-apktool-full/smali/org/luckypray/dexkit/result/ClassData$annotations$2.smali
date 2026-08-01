.class final Lorg/luckypray/dexkit/result/ClassData$annotations$2;
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

.field final synthetic $id:I

.field final synthetic this$0:Lorg/luckypray/dexkit/result/ClassData;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData$annotations$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/ClassData$annotations$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    .line 4
    .line 5
    iput p3, p0, Lorg/luckypray/dexkit/result/ClassData$annotations$2;->$dexId:I

    .line 6
    .line 7
    iput p4, p0, Lorg/luckypray/dexkit/result/ClassData$annotations$2;->$id:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData$annotations$2;->invoke()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData$annotations$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/result/ClassData$annotations$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    .line 4
    .line 5
    iget v2, p0, Lorg/luckypray/dexkit/result/ClassData$annotations$2;->$dexId:I

    .line 6
    .line 7
    iget p0, p0, Lorg/luckypray/dexkit/result/ClassData$annotations$2;->$id:I

    .line 8
    .line 9
    invoke-static {v1, v2, p0}, Lorg/luckypray/dexkit/result/ClassData;->access$getEncodeId(Lorg/luckypray/dexkit/result/ClassData;II)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->getClassAnnotations$dexkit_android_release(J)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
