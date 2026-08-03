.class public final LYue/ۥ۠ۧۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۧۨ$ۥ;,
        LYue/ۥ۠ۧۨ$ۥ۟۟۟;,
        LYue/ۥ۠ۧۨ$ۥ۟۟;,
        LYue/ۥ۠ۧۨ$ۥ۟;,
        LYue/ۥ۠ۧۨ$ۥ۟۟۟۟;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "mockLocation"

.field public static final ۥ۟:Ljava/lang/String; = "verticalAccuracy"

.field public static final ۥ۟۟:Ljava/lang/String; = "speedAccuracy"

.field public static final ۥ۟۟۟:Ljava/lang/String; = "bearingAccuracy"

.field public static final ۥ۟۟۟۟:Ljava/lang/String; = "androidx.core.location.extra.MSL_ALTITUDE"

.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"

.field public static ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public static ۥ۟۟۟ۢ:Ljava/lang/reflect/Field;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public static ۥۣ۟۟۟:Ljava/lang/Integer;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public static ۥ۟۟۟ۤ:Ljava/lang/Integer;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public static ۥ۟۟۟ۥ:Ljava/lang/Integer;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/location/Location;Ljava/lang/String;)Z
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥ۟(Landroid/location/Location;)F
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ;->ۥ(Landroid/location/Location;)F

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Landroid/location/Location;)J
    .locals 3
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static ۥ۟۟۟(Landroid/location/Location;)J
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v0

    return-wide v0
.end method

.method public static ۥ۟۟۟۟()Ljava/lang/reflect/Field;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BlockedPrivateApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۢ:Ljava/lang/reflect/Field;

    if-nez v0, :cond_0

    const-class v0, Landroid/location/Location;

    const-string v1, "mFieldsMask"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۢ:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_0
    sget-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۢ:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public static ۥ۟۟۟۠()I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SoonBlockedPrivateApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۤ:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const-class v0, Landroid/location/Location;

    const-string v1, "HAS_BEARING_ACCURACY_MASK"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۤ:Ljava/lang/Integer;

    :cond_0
    sget-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۤ:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public static ۥ۟۟۟ۡ()I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SoonBlockedPrivateApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۧۨ;->ۥۣ۟۟۟:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const-class v0, Landroid/location/Location;

    const-string v1, "HAS_SPEED_ACCURACY_MASK"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۨ;->ۥۣ۟۟۟:Ljava/lang/Integer;

    :cond_0
    sget-object v0, LYue/ۥ۠ۧۨ;->ۥۣ۟۟۟:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public static ۥ۟۟۟ۢ()I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SoonBlockedPrivateApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۥ:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const-class v0, Landroid/location/Location;

    const-string v1, "HAS_VERTICAL_ACCURACY_MASK"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۥ:Ljava/lang/Integer;

    :cond_0
    sget-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۥ:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public static ۥۣ۟۟۟(Landroid/location/Location;)F
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۢۧ;
        from = 0.0
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟۟۟;->ۥ(Landroid/location/Location;)F

    move-result p0

    return p0

    :cond_0
    invoke-static {p0}, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۥ(Landroid/location/Location;)Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۤ(Landroid/location/Location;)D
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟۟۟;->ۥ۟(Landroid/location/Location;)D

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-static {p0}, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۥ(Landroid/location/Location;)Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "androidx.core.location.extra.MSL_ALTITUDE"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public static ۥ۟۟۟ۥ(Landroid/location/Location;)Landroid/os/Bundle;
    .locals 1
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, v0}, Landroid/location/Location;->setExtras(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static ۥ۟۟۟ۦ()Ljava/lang/reflect/Method;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroid/location/Location;

    const-string v2, "setIsFromMockProvider"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_0
    sget-object v0, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public static ۥ۟۟۟ۧ(Landroid/location/Location;)F
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ;->ۥ۟(Landroid/location/Location;)F

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۨ(Landroid/location/Location;)F
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ;->ۥ۟۟(Landroid/location/Location;)F

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠(Landroid/location/Location;)Z
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ;->ۥ۟۟۟(Landroid/location/Location;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠۟(Landroid/location/Location;)Z
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟۟۟;->ۥ۟۟(Landroid/location/Location;)Z

    move-result p0

    return p0

    :cond_0
    const-string v0, "androidx.core.location.extra.MSL_ALTITUDE"

    invoke-static {p0, v0}, LYue/ۥ۠ۧۨ;->ۥ(Landroid/location/Location;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠۠(Landroid/location/Location;)Z
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟۟۟;->ۥ۟۟۟(Landroid/location/Location;)Z

    move-result p0

    return p0

    :cond_0
    const-string v0, "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"

    invoke-static {p0, v0}, LYue/ۥ۠ۧۨ;->ۥ(Landroid/location/Location;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۡ(Landroid/location/Location;)Z
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ;->ۥ۟۟۟۟(Landroid/location/Location;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۢ(Landroid/location/Location;)Z
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ;->ۥ۟۟۟۠(Landroid/location/Location;)Z

    move-result p0

    return p0
.end method

.method public static ۥۣ۟۟۠(Landroid/location/Location;)Z
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/location/Location;->isFromMockProvider()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۤ(Landroid/location/Location;)V
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟۟;->ۥ(Landroid/location/Location;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟;->ۥ(Landroid/location/Location;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟;->ۥ(Landroid/location/Location;)V

    goto :goto_0

    :cond_2
    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ;->ۥ۟۟۟ۡ(Landroid/location/Location;)V

    :goto_0
    return-void
.end method

.method public static ۥ۟۟۠ۥ(Landroid/location/Location;Ljava/lang/String;)V
    .locals 1
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/location/Location;->setExtras(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public static ۥ۟۟۠ۦ(Landroid/location/Location;)V
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟۟۟;->ۥ۟۟۟۟(Landroid/location/Location;)V

    goto :goto_0

    :cond_0
    const-string v0, "androidx.core.location.extra.MSL_ALTITUDE"

    invoke-static {p0, v0}, LYue/ۥ۠ۧۨ;->ۥ۟۟۠ۥ(Landroid/location/Location;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static ۥ۟۟۠ۧ(Landroid/location/Location;)V
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟۟۟;->ۥ۟۟۟۠(Landroid/location/Location;)V

    goto :goto_0

    :cond_0
    const-string v0, "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"

    invoke-static {p0, v0}, LYue/ۥ۠ۧۨ;->ۥ۟۟۠ۥ(Landroid/location/Location;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static ۥ۟۟۠ۨ(Landroid/location/Location;)V
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟۟;->ۥ۟(Landroid/location/Location;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟;->ۥ۟(Landroid/location/Location;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟;->ۥ۟(Landroid/location/Location;)V

    goto :goto_0

    :cond_2
    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ;->ۥ۟۟۟ۢ(Landroid/location/Location;)V

    :goto_0
    return-void
.end method

.method public static ۥ۟۟ۡ(Landroid/location/Location;)V
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟۟;->ۥ۟۟(Landroid/location/Location;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟۟;->ۥ۟۟(Landroid/location/Location;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟;->ۥ۟۟(Landroid/location/Location;)V

    goto :goto_0

    :cond_2
    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ;->ۥۣ۟۟۟(Landroid/location/Location;)V

    :goto_0
    return-void
.end method

.method public static ۥ۟۟ۡ۟(Landroid/location/Location;F)V
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥ۠ۧۨ$ۥ;->ۥ۟۟۟ۤ(Landroid/location/Location;F)V

    return-void
.end method

.method public static ۥ۟۟ۡ۠(Landroid/location/Location;Z)V
    .locals 1
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanUncheckedReflection"
        }
    .end annotation

    :try_start_0
    invoke-static {}, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۦ()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    goto :goto_2

    :goto_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :goto_1
    new-instance p1, Ljava/lang/IllegalAccessError;

    invoke-direct {p1}, Ljava/lang/IllegalAccessError;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p1

    :goto_2
    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p1
.end method

.method public static ۥ۟۟ۡۡ(Landroid/location/Location;F)V
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥ۠ۧۨ$ۥ۟۟۟۟;->ۥ۟۟۟ۡ(Landroid/location/Location;F)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۥ(Landroid/location/Location;)Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"

    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    :goto_0
    return-void
.end method

.method public static ۥ۟۟ۡۢ(Landroid/location/Location;D)V
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, LYue/ۥ۠ۧۨ$ۥ۟۟۟۟;->ۥ۟۟۟ۢ(Landroid/location/Location;D)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, LYue/ۥ۠ۧۨ;->ۥ۟۟۟ۥ(Landroid/location/Location;)Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "androidx.core.location.extra.MSL_ALTITUDE"

    invoke-virtual {p0, v0, p1, p2}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    :goto_0
    return-void
.end method

.method public static ۥۣ۟۟ۡ(Landroid/location/Location;F)V
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥ۠ۧۨ$ۥ;->ۥ۟۟۟ۥ(Landroid/location/Location;F)V

    return-void
.end method

.method public static ۥ۟۟ۡۤ(Landroid/location/Location;F)V
    .locals 0
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥ۠ۧۨ$ۥ;->ۥ۟۟۟ۦ(Landroid/location/Location;F)V

    return-void
.end method
