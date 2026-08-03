.class public final LYue/ۥ۠ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۥ$ۥ۟;,
        LYue/ۥ۠ۥ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "ICUCompat"

.field public static ۥ۟:Ljava/lang/reflect/Method;

.field public static ۥ۟۟:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/util/Locale;)Ljava/lang/String;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanUncheckedReflection"
        }
    .end annotation

    const-string v0, "ICUCompat"

    invoke-virtual {p0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object p0

    :try_start_0
    sget-object v1, LYue/ۥ۠ۥ;->ۥ۟۟:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :goto_0
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    :goto_1
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_2
    return-object p0
.end method

.method public static ۥ۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanUncheckedReflection"
        }
    .end annotation

    const-string v0, "ICUCompat"

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, LYue/ۥ۠ۥ;->ۥ۟:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v2, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :goto_0
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    :goto_1
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_2
    return-object v1
.end method

.method public static ۥ۟۟(Ljava/util/Locale;)Ljava/lang/String;
    .locals 0
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۥ$ۥ۟;->ۥ۟(Ljava/util/Locale;)Landroid/icu/util/ULocale;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۥ$ۥ۟;->ۥ(Ljava/lang/Object;)Landroid/icu/util/ULocale;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۥ$ۥ۟;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
