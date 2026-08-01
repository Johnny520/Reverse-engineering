.class public final Ltop/suzhelan/qstory/nativelib/NativeCipherBridge;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0087 b\u0002\u0008\u0008\u00ca\u0001\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\t"
    }
    d2 = {
        "Ltop/suzhelan/qstory/nativelib/NativeCipherBridge;",
        "",
        "<init>",
        "()V",
        "xorCipher",
        "",
        "data",
        "key",
        "Lkotlin/jvm/JvmStatic;",
        "QStory:app_publishRelease",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Ltop/suzhelan/qstory/nativelib/NativeCipherBridge;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltop/suzhelan/qstory/nativelib/NativeCipherBridge;

    .line 2
    .line 3
    invoke-direct {v0}, Ltop/suzhelan/qstory/nativelib/NativeCipherBridge;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltop/suzhelan/qstory/nativelib/NativeCipherBridge;->INSTANCE:Ltop/suzhelan/qstory/nativelib/NativeCipherBridge;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final native xorCipher([B[B)[B
.end method
