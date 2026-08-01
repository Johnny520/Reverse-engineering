.class final Lorg/luckypray/dexkit/result/AnnotationData$dexClass$2;
.super Ld9;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lj5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/result/AnnotationData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld9;",
        "Lj5;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/luckypray/dexkit/result/AnnotationData;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/result/AnnotationData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/AnnotationData$dexClass$2;->this$0:Lorg/luckypray/dexkit/result/AnnotationData;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Ld9;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 13
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationData$dexClass$2;->invoke()Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexClass;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationData$dexClass$2;->this$0:Lorg/luckypray/dexkit/result/AnnotationData;

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationData;->getTypeDescriptor()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexClass;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
