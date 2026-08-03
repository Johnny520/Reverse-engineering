.class public LYue/ۥۢۢۤ۟;
.super LYue/ۥۣۢۢۤ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x18
.end annotation

.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟:Ljava/lang/String; = "TypefaceCompatApi24Impl"

.field public static final ۥ۟۟۟۟:Ljava/lang/String; = "android.graphics.FontFamily"

.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "addFontWeightStyle"

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "createFromFamiliesWithDefault"

.field public static final ۥ۟۟۟ۢ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final ۥۣ۟۟۟:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟ۤ:Ljava/lang/reflect/Method;

.field public static final ۥ۟۟۟ۥ:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "android.graphics.FontFamily"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    const-string v3, "addFontWeightStyle"

    const-class v4, Ljava/nio/ByteBuffer;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v6, Ljava/util/List;

    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v4, v5, v6, v5, v7}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v4

    const-class v5, Landroid/graphics/Typeface;

    const-string v6, "createFromFamiliesWithDefault"

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, v2

    move-object v2, v0

    move-object v0, v8

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "TypefaceCompatApi24Impl"

    invoke-static {v3, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    :goto_1
    sput-object v0, LYue/ۥۢۢۤ۟;->ۥۣ۟۟۟:Ljava/lang/reflect/Constructor;

    sput-object v1, LYue/ۥۢۢۤ۟;->ۥ۟۟۟ۢ:Ljava/lang/Class;

    sput-object v3, LYue/ۥۢۢۤ۟;->ۥ۟۟۟ۤ:Ljava/lang/reflect/Method;

    sput-object v2, LYue/ۥۢۢۤ۟;->ۥ۟۟۟ۥ:Ljava/lang/reflect/Method;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۣۢۢۤ;-><init>()V

    return-void
.end method

.method public static ۥ۟۟۠(Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z
    .locals 2

    :try_start_0
    sget-object v0, LYue/ۥۢۢۤ۟;->ۥ۟۟۟ۤ:Ljava/lang/reflect/Method;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    const/4 v1, 0x0

    filled-new-array {p1, p2, v1, p3, p4}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method private static ۥ۟۟۠۟(Ljava/lang/Object;)Landroid/graphics/Typeface;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LYue/ۥۢۢۤ۟;->ۥ۟۟۟ۢ:Ljava/lang/Class;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2, p0}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p0, LYue/ۥۢۢۤ۟;->ۥ۟۟۟ۥ:Ljava/lang/reflect/Method;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static ۥ۟۟۠۠()Z
    .locals 3

    sget-object v0, LYue/ۥۢۢۤ۟;->ۥ۟۟۟ۤ:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    const-string v1, "TypefaceCompatApi24Impl"

    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static ۥ۟۟۠ۡ()Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LYue/ۥۢۢۤ۟;->ۥۣ۟۟۟:Ljava/lang/reflect/Constructor;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method


# virtual methods
.method public ۥ۟(Landroid/content/Context;LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .locals 7
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {}, LYue/ۥۢۢۤ۟;->ۥ۟۟۠ۡ()Ljava/lang/Object;

    move-result-object p4

    const/4 v0, 0x0

    if-nez p4, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟;->ۥ()[LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;

    move-result-object p2

    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p2, v2

    invoke-virtual {v3}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;->ۥ۟()I

    move-result v4

    invoke-static {p1, p3, v4}, LYue/ۥۢۢۤۤ;->ۥ۟(Landroid/content/Context;Landroid/content/res/Resources;I)Ljava/nio/ByteBuffer;

    move-result-object v4

    if-nez v4, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {v3}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;->ۥ۟۟()I

    move-result v5

    invoke-virtual {v3}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;->ۥ۟۟۟۟()I

    move-result v6

    invoke-virtual {v3}, LYue/ۥ۠ۢۦۡ$ۥ۟۟۟۟;->ۥ۟۟۟۠()Z

    move-result v3

    invoke-static {p4, v4, v5, v6, v3}, LYue/ۥۢۢۤ۟;->ۥ۟۟۠(Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z

    move-result v3

    if-nez v3, :cond_2

    return-object v0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-static {p4}, LYue/ۥۢۢۤ۟;->ۥ۟۟۠۟(Ljava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(Landroid/content/Context;Landroid/os/CancellationSignal;[LYue/ۥ۠ۢۦۢ$ۥ۟۟;I)Landroid/graphics/Typeface;
    .locals 9
    .param p2    # Landroid/os/CancellationSignal;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # [LYue/ۥ۠ۢۦۢ$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {}, LYue/ۥۢۢۤ۟;->ۥ۟۟۠ۡ()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v2, LYue/ۥۢ۟ۡ;

    invoke-direct {v2}, LYue/ۥۢ۟ۡ;-><init>()V

    array-length v3, p3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_4

    aget-object v5, p3, v4

    invoke-virtual {v5}, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟۟()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v2, v6}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/nio/ByteBuffer;

    if-nez v7, :cond_1

    invoke-static {p1, p2, v6}, LYue/ۥۢۢۤۤ;->ۥ۟۟۟۠(Landroid/content/Context;Landroid/os/CancellationSignal;Landroid/net/Uri;)Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-nez v7, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v5}, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟()I

    move-result v6

    invoke-virtual {v5}, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟۟۟()I

    move-result v8

    invoke-virtual {v5}, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟۟۠()Z

    move-result v5

    invoke-static {v0, v7, v6, v8, v5}, LYue/ۥۢۢۤ۟;->ۥ۟۟۠(Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z

    move-result v5

    if-nez v5, :cond_3

    return-object v1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    invoke-static {v0}, LYue/ۥۢۢۤ۟;->ۥ۟۟۠۟(Ljava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    if-nez p1, :cond_5

    return-object v1

    :cond_5
    invoke-static {p1, p4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۡ(Landroid/content/Context;Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    :try_start_0
    invoke-static {p2, p3, p4}, LYue/ۥۢۥۢۦ;->ۥ۟(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, LYue/ۥۣۢۢۤ;->ۥ۟۟۟ۡ(Landroid/content/Context;Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object v0

    :cond_0
    return-object v0
.end method
