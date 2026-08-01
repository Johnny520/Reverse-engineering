.class final Lorg/luckypray/dexkit/result/FieldData$writers$2;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


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
        "Lc50;",
        "Lhw;"
    }
.end annotation


# instance fields
.field final synthetic $bridge:Lorg/luckypray/dexkit/DexKitBridge;

.field final synthetic $dexId:I

.field final synthetic $id:I

.field final synthetic this$0:Lorg/luckypray/dexkit/result/FieldData;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    .line 4
    .line 5
    iput p3, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$dexId:I

    .line 6
    .line 7
    iput p4, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$id:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData$writers$2;->invoke()Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    .line 4
    .line 5
    iget v2, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$dexId:I

    .line 6
    .line 7
    iget p0, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$id:I

    .line 8
    .line 9
    invoke-static {v1, v2, p0}, Lorg/luckypray/dexkit/result/FieldData;->access$getEncodeId(Lorg/luckypray/dexkit/result/FieldData;II)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->writeFieldMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
