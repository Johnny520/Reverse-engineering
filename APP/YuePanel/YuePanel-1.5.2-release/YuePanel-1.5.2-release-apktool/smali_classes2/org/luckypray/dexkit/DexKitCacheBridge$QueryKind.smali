.class public final enum Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;",
        "",
        "(Ljava/lang/String;I)V",
        "METHOD_SINGLE",
        "CLASS_SINGLE",
        "FIELD_SINGLE",
        "METHOD_LIST",
        "CLASS_LIST",
        "FIELD_LIST",
        "METHOD_BATCH",
        "CLASS_BATCH",
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

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "QueryKind"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

.field public static final enum CLASS_BATCH:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

.field public static final enum CLASS_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

.field public static final enum CLASS_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

.field public static final enum FIELD_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

.field public static final enum FIELD_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

.field public static final enum METHOD_BATCH:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

.field public static final enum METHOD_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

.field public static final enum METHOD_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;
    .locals 8

    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->FIELD_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    sget-object v5, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->FIELD_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    sget-object v6, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_BATCH:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    sget-object v7, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_BATCH:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    filled-new-array/range {v0 .. v7}, [Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    const-string v1, "METHOD_SINGLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    const-string v1, "CLASS_SINGLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    const-string v1, "FIELD_SINGLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->FIELD_SINGLE:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    const-string v1, "METHOD_LIST"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    const-string v1, "CLASS_LIST"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    const-string v1, "FIELD_LIST"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->FIELD_LIST:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    const-string v1, "METHOD_BATCH"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->METHOD_BATCH:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    const-string v1, "CLASS_BATCH"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->CLASS_BATCH:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->$values()[Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    move-result-object v0

    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->$VALUES:[Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;
    .locals 1

    const-class v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;->$VALUES:[Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    return-object v0
.end method
