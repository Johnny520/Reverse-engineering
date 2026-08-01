.class final Lorg/luckypray/dexkit/DexKitBridge$getClassData$1;
.super Ld9;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lu5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitBridge;->getClassData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/ClassData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld9;",
        "Lu5;"
    }
.end annotation


# instance fields
.field final synthetic $descriptor:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitBridge$getClassData$1;->$descriptor:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Ld9;-><init>(I)V

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
    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$getClassData$1;->invoke(J)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final invoke(J)[B
    .locals 1

    .line 12
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitBridge$getClassData$1;->$descriptor:Ljava/lang/String;

    invoke-static {v0, p1, p2, p0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassData(Lorg/luckypray/dexkit/DexKitBridge$Companion;JLjava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method
