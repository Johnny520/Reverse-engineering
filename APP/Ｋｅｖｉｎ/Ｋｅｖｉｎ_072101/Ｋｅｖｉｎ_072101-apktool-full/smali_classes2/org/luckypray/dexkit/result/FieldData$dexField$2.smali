.class final Lorg/luckypray/dexkit/result/FieldData$dexField$2;
.super Lkotlin/jvm/internal/Lambda;
.source "FieldData.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/result/FieldData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lorg/luckypray/dexkit/wrap/DexField;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lorg/luckypray/dexkit/wrap/DexField;",
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


# instance fields
.field final synthetic this$0:Lorg/luckypray/dexkit/result/FieldData;


# direct methods
.method constructor <init>(Lorg/luckypray/dexkit/result/FieldData;)V
    .locals 1

    iput-object p1, p0, Lorg/luckypray/dexkit/result/FieldData$dexField$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 56
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData$dexField$2;->invoke()Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    .line 57
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/FieldData$dexField$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/result/FieldData;->getDescriptor()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
