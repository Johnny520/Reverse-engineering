.class final Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;
.super Ld9;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lu5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitBridge;->initFullCache()V
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


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Ld9;-><init>(I)V

    .line 3
    .line 4
    .line 5
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
    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;->invoke(J)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lb5;->d:Lb5;

    .line 11
    .line 12
    return-object p0
.end method

.method public final invoke(J)V
    .locals 0

    .line 13
    sget-object p0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitFullCache(Lorg/luckypray/dexkit/DexKitBridge$Companion;J)V

    return-void
.end method
