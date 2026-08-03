.class final Lorg/luckypray/dexkit/result/FieldData$dexField$2;
.super LQ0/h;
.source "SourceFile"

# interfaces
.implements LP0/a;


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
        "LQ0/h;",
        "LP0/a;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/luckypray/dexkit/result/FieldData;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/result/FieldData;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/result/FieldData$dexField$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LQ0/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData$dexField$2;->invoke()Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/wrap/DexField;
    .locals 2

    .line 2
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/FieldData$dexField$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/result/FieldData;->getDescriptor()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
