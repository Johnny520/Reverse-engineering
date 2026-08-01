.class final Lorg/luckypray/dexkit/result/FieldData$dexField$2;
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
.field final synthetic this$0:Lorg/luckypray/dexkit/result/FieldData;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/result/FieldData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/FieldData$dexField$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 13
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData$dexField$2;->invoke()Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/luckypray/dexkit/result/FieldData$dexField$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDescriptor()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
