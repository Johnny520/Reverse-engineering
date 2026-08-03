.class public final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0000\u00a2\u0006\u0002\u0008\tJ%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0000\u00a2\u0006\u0004\u0008\t\u0010\rJ\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\t\u00a8\u0006\u000f"
    }
    d2 = {
        "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;",
        "",
        "()V",
        "create",
        "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
        "appTag",
        "",
        "classLoader",
        "Ljava/lang/ClassLoader;",
        "create$dexkit_android_release",
        "dexArray",
        "",
        "",
        "(Ljava/lang/String;[[B)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
        "path",
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
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic create$dexkit_android_release(Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 7

    const-string v0, "appTag"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classLoader"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;LYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public final synthetic create$dexkit_android_release(Ljava/lang/String;Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 7

    const-string v0, "appTag"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;LYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public final synthetic create$dexkit_android_release(Ljava/lang/String;[[B)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 7

    const-string v0, "appTag"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dexArray"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;LYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method
