.class final Lorg/luckypray/dexkit/DexKitBridge$setThreadNum$2;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitBridge;->setThreadNum(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc50;",
        "Lsw;"
    }
.end annotation


# instance fields
.field final synthetic $num:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/luckypray/dexkit/DexKitBridge$setThreadNum$2;->$num:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

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
    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$setThreadNum$2;->invoke(J)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method public final invoke(J)V
    .locals 1

    .line 13
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    iget p0, p0, Lorg/luckypray/dexkit/DexKitBridge$setThreadNum$2;->$num:I

    invoke-static {v0, p1, p2, p0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeSetThreadNum(Lorg/luckypray/dexkit/DexKitBridge$Companion;JI)V

    return-void
.end method
