.class public final Lorg/luckypray/dexkit/wrap/DexMethod$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "Lorg/luckypray/dexkit/wrap/DexMethod$Companion;",
        "",
        "()V",
        "deserialize",
        "Lorg/luckypray/dexkit/wrap/DexMethod;",
        "descriptor",
        "",
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
    value = Lorg/luckypray/dexkit/wrap/DexMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/wrap/DexMethod$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "descriptor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexMethod;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
