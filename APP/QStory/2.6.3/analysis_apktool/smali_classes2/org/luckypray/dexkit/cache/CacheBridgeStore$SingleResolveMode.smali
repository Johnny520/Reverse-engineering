.class public final enum Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "org/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode",
        "",
        "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;",
        "<init>",
        "(Ljava/lang/String;I)V",
        "REQUIRED",
        "NULLABLE",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

.field public static final enum NULLABLE:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

.field public static final enum REQUIRED:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;
    .locals 2

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->REQUIRED:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->NULLABLE:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 2
    .line 3
    const-string v1, "REQUIRED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->REQUIRED:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 10
    .line 11
    new-instance v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 12
    .line 13
    const-string v1, "NULLABLE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->NULLABLE:Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 20
    .line 21
    invoke-static {}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->$values()[Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->$VALUES:[Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;
    .locals 1

    .line 1
    const-class v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;->$VALUES:[Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;

    .line 8
    .line 9
    return-object v0
.end method
