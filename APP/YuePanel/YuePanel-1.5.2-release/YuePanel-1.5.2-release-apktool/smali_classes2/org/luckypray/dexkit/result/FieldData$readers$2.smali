.class final Lorg/luckypray/dexkit/result/FieldData$readers$2;
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
        "Lorg/luckypray/dexkit/result/MethodDataList;",
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
    value = Lorg/luckypray/dexkit/result/FieldData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Lorg/luckypray/dexkit/result/MethodDataList;",
        ">;"
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

    iput-object p1, p0, Lorg/luckypray/dexkit/result/FieldData$readers$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, Lorg/luckypray/dexkit/result/FieldData$readers$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    iput p3, p0, Lorg/luckypray/dexkit/result/FieldData$readers$2;->$dexId:I

    iput p4, p0, Lorg/luckypray/dexkit/result/FieldData$readers$2;->$id:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData$readers$2;->invoke()Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData$readers$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/FieldData$readers$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    iget v2, p0, Lorg/luckypray/dexkit/result/FieldData$readers$2;->$dexId:I

    iget v3, p0, Lorg/luckypray/dexkit/result/FieldData$readers$2;->$id:I

    invoke-static {v1, v2, v3}, Lorg/luckypray/dexkit/result/FieldData;->access$getEncodeId(Lorg/luckypray/dexkit/result/FieldData;II)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->readFieldMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    return-object v0
.end method
