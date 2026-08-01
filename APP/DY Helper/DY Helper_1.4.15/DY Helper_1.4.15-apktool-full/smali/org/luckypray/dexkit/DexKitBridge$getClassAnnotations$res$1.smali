.class final Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitBridge;->getClassAnnotations$dexkit_android_release(J)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbp0;",
        "La80;"
    }
.end annotation


# instance fields
.field final synthetic $classId:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;->$classId:J

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;->invoke(J)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final invoke(J)[B
    .locals 3

    .line 12
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    iget-wide v1, p0, Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;->$classId:J

    invoke-static {v0, p1, p2, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassAnnotations(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p0

    return-object p0
.end method
