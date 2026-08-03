.class public LYue/ۥۢۡ۟ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۡ۟ۥ$ۥ۟;,
        LYue/ۥۢۡ۟ۥ$ۥ;,
        LYue/ۥۢۡ۟ۥ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static ۥ:Ljava/lang/reflect/Method;

.field public static ۥ۟:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/telephony/TelephonyManager;)Ljava/lang/String;
    .locals 0
    .param p0    # Landroid/telephony/TelephonyManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.READ_PHONE_STATE"
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۢۡ۟ۥ$ۥ۟;->ۥ(Landroid/telephony/TelephonyManager;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Landroid/telephony/TelephonyManager;)I
    .locals 3
    .param p0    # Landroid/telephony/TelephonyManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SoonBlockedPrivateApi"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۢۡ۟ۥ$ۥ۟۟;->ۥ(Landroid/telephony/TelephonyManager;)I

    move-result p0

    return p0

    :cond_0
    :try_start_0
    sget-object v0, LYue/ۥۢۡ۟ۥ;->ۥ۟:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const-class v0, Landroid/telephony/TelephonyManager;

    const-string v2, "getSubId"

    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, LYue/ۥۢۡ۟ۥ;->ۥ۟:Ljava/lang/reflect/Method;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_1
    sget-object v0, LYue/ۥۢۡ۟ۥ;->ۥ۟:Ljava/lang/reflect/Method;

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_2
    const p0, 0x7fffffff

    return p0
.end method
