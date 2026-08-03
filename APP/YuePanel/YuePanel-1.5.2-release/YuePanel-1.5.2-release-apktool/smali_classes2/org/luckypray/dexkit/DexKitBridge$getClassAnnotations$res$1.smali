.class final Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "invoke"
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
    value = Lorg/luckypray/dexkit/DexKitBridge;->getClassAnnotations$dexkit_android_release(J)Ljava/util/List;
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
        "[B>;"
    }
.end annotation


# instance fields
.field final synthetic $classId:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;->$classId:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;->invoke(J)[B

    move-result-object p1

    return-object p1
.end method

.method public final invoke(J)[B
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    iget-wide v1, p0, Lorg/luckypray/dexkit/DexKitBridge$getClassAnnotations$res$1;->$classId:J

    invoke-static {v0, p1, p2, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassAnnotations(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object p1

    return-object p1
.end method
