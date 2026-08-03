.class final Lorg/luckypray/dexkit/DexKitBridge$getDexNum$1;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "invoke",
        "(J)Ljava/lang/Integer;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitBridge;->getDexNum()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Ljava/lang/Long;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/DexKitBridge$getDexNum$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$getDexNum$1;

    invoke-direct {v0}, Lorg/luckypray/dexkit/DexKitBridge$getDexNum$1;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/DexKitBridge$getDexNum$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitBridge$getDexNum$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(J)Ljava/lang/Integer;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetDexNum(Lorg/luckypray/dexkit/DexKitBridge$Companion;J)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$getDexNum$1;->invoke(J)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
