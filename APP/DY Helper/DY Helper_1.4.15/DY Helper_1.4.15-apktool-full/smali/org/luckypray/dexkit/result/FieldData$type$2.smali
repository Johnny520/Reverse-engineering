.class final Lorg/luckypray/dexkit/result/FieldData$type$2;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/result/FieldData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
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

.field final synthetic this$0:Lorg/luckypray/dexkit/result/FieldData;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/FieldData$type$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/FieldData$type$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    .line 4
    .line 5
    iput p3, p0, Lorg/luckypray/dexkit/result/FieldData$type$2;->$dexId:I

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

    .line 32
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData$type$2;->invoke()Lorg/luckypray/dexkit/result/ClassData;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/ClassData;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData$type$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/result/FieldData$type$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    .line 4
    .line 5
    iget p0, p0, Lorg/luckypray/dexkit/result/FieldData$type$2;->$dexId:I

    .line 6
    .line 7
    invoke-static {v1}, Lorg/luckypray/dexkit/result/FieldData;->access$getTypeId$p(Lorg/luckypray/dexkit/result/FieldData;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v1, p0, v2}, Lorg/luckypray/dexkit/result/FieldData;->access$getEncodeId(Lorg/luckypray/dexkit/result/FieldData;II)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    const/4 p0, 0x1

    .line 16
    new-array p0, p0, [J

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-wide v1, p0, v3

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge;->getTypeByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->first()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    .line 30
    .line 31
    return-object p0
.end method
