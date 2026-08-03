.class public final L۟/u3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/u3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static ۥ(Ljava/lang/ClassLoader;)V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiscouragedPrivateApi"
        }
    .end annotation

    const/4 v0, 0x6

    if-eqz p0, :cond_4

    :try_start_0
    const-class v1, Ljava/lang/ClassLoader;

    new-array v2, v0, [B

    const/16 v3, 0x5b

    const/4 v4, 0x0

    aput-byte v3, v2, v4

    const/16 v3, -0x1c

    const/4 v5, 0x1

    aput-byte v3, v2, v5

    const/16 v3, 0xe

    const/4 v6, 0x2

    aput-byte v3, v2, v6

    const/4 v3, 0x7

    const/4 v7, 0x3

    aput-byte v3, v2, v7

    const/16 v3, -0x58

    const/4 v8, 0x4

    aput-byte v3, v2, v8

    const/16 v3, -0x44

    const/4 v9, 0x5

    aput-byte v3, v2, v9

    new-array v0, v0, [B

    const/16 v3, 0x2b

    aput-byte v3, v0, v4

    const/16 v3, -0x7b

    aput-byte v3, v0, v5

    const/16 v3, 0x7c

    aput-byte v3, v0, v6

    const/16 v3, 0x62

    aput-byte v3, v0, v7

    const/16 v3, -0x3a

    aput-byte v3, v0, v8

    const/16 v3, -0x38

    aput-byte v3, v0, v9

    invoke-static {v2, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-class v1, L۟/u3;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/ClassLoader;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v2, Ljava/lang/ClassLoader;

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    if-nez v2, :cond_1

    const-class v2, Lde/robv/android/xposed/XposedBridge;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    :cond_2
    const-class v3, L۟/u3;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    new-instance v3, L۟/u3;

    invoke-direct {v3, v2, p0}, L۟/u3;-><init>(Ljava/lang/ClassLoader;Ljava/lang/ClassLoader;)V

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-void

    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    const/16 v1, 0x13

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    nop

    :array_0
    .array-data 1
        0xet
        -0x1et
        0x20t
        0x1t
        0x11t
        -0x23t
        0x2t
        -0x11t
        0x25t
        0x17t
        0x10t
        -0x4ft
        0x50t
        -0x4dt
        0x61t
        0x1ct
        0x17t
        -0x3t
        0x1t
    .end array-data

    :array_1
    .array-data 1
        0x6dt
        -0x72t
        0x41t
        0x72t
        0x62t
        -0x6ft
    .end array-data
.end method
