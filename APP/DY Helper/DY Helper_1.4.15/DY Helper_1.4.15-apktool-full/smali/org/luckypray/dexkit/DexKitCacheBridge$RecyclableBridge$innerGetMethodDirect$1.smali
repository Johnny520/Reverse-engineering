.class final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethodDirect(Ljava/lang/String;ZLa80;)Lorg/luckypray/dexkit/wrap/DexMethod;
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


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lbp0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 9
    check-cast p1, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1;->invoke(Lorg/luckypray/dexkit/result/MethodData;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lorg/luckypray/dexkit/result/MethodData;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lorg/luckypray/dexkit/result/MethodData;->toDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method
