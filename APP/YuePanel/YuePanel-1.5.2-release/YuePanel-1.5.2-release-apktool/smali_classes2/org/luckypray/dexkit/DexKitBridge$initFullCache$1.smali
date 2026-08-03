.class final Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


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
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Ljava/lang/Long;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "invoke",
        "(J)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;

    invoke-direct {v0}, Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$initFullCache$1;->invoke(J)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final invoke(J)V
    .locals 1

    .line 2
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitFullCache(Lorg/luckypray/dexkit/DexKitBridge$Companion;J)V

    return-void
.end method
