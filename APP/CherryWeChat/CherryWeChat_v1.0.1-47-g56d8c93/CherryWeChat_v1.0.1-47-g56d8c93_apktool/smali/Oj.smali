.class public abstract LOj;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[[F

.field public static final b:[[F

.field public static final c:[F

.field public static final d:[[F

.field public static final e:Lv1;

.field public static final f:Lv1;

.field public static final g:LPg;

.field public static final h:Lhw;

.field public static final i:Lhw;

.field public static final j:Lhw;

.field public static k:J = 0x0L

.field public static l:Ljava/lang/reflect/Method; = null

.field public static m:Z = true

.field public static n:Ljava/lang/reflect/Field;

.field public static o:Z


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    new-array v2, v0, [F

    fill-array-data v2, :array_1

    new-array v3, v0, [F

    fill-array-data v3, :array_2

    filled-new-array {v1, v2, v3}, [[F

    move-result-object v1

    sput-object v1, LOj;->a:[[F

    new-array v1, v0, [F

    fill-array-data v1, :array_3

    new-array v2, v0, [F

    fill-array-data v2, :array_4

    new-array v3, v0, [F

    fill-array-data v3, :array_5

    filled-new-array {v1, v2, v3}, [[F

    move-result-object v1

    sput-object v1, LOj;->b:[[F

    new-array v1, v0, [F

    fill-array-data v1, :array_6

    sput-object v1, LOj;->c:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_7

    new-array v2, v0, [F

    fill-array-data v2, :array_8

    new-array v3, v0, [F

    fill-array-data v3, :array_9

    filled-new-array {v1, v2, v3}, [[F

    move-result-object v1

    sput-object v1, LOj;->d:[[F

    new-instance v1, Lv1;

    const-string v2, "REMOVED_TASK"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Lv1;-><init>(Ljava/lang/String;I)V

    sput-object v1, LOj;->e:Lv1;

    new-instance v1, Lv1;

    const-string v2, "CLOSED_EMPTY"

    invoke-direct {v1, v2, v3}, Lv1;-><init>(Ljava/lang/String;I)V

    sput-object v1, LOj;->f:Lv1;

    new-instance v1, LPg;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, LPg;-><init>(I)V

    sput-object v1, LOj;->g:LPg;

    new-instance v1, Lhw;

    invoke-direct {v1, v0}, Lhw;-><init>(I)V

    sput-object v1, LOj;->h:Lhw;

    new-instance v0, Lhw;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lhw;-><init>(I)V

    sput-object v0, LOj;->i:Lhw;

    new-instance v0, Lhw;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lhw;-><init>(I)V

    sput-object v0, LOj;->j:Lhw;

    return-void

    :array_0
    .array-data 4
        0x3ecd759f
        0x3f2671bd
        -0x42ad373b    # -0.051461f
    .end array-data

    :array_1
    .array-data 4
        -0x417fdcdf
        0x3f9a2a3d
        0x3d3bd167
    .end array-data

    :array_2
    .array-data 4
        -0x44f7c02b    # -0.002079f
        0x3d4881e4
        0x3f740022
    .end array-data

    :array_3
    .array-data 4
        0x3fee583d
        -0x407e8f35
        0x3e18c46b
    .end array-data

    :array_4
    .array-data 4
        0x3ec669e1
        0x3f1f172e
        -0x43ecf866
    .end array-data

    :array_5
    .array-data 4
        -0x437e39f7
        -0x42f43b81
        0x3f86653c
    .end array-data

    :array_6
    .array-data 4
        0x42be1810
        0x42c80000    # 100.0f
        0x42d9c419
    .end array-data

    :array_7
    .array-data 4
        0x3ed31e17
        0x3eb71a0d
        0x3e38d7b9
    .end array-data

    :array_8
    .array-data 4
        0x3e59b3d0    # 0.2126f
        0x3f371759    # 0.7152f
        0x3d93dd98    # 0.0722f
    .end array-data

    :array_9
    .array-data 4
        0x3c9e47ef
        0x3df40c29
        0x3f7349cc
    .end array-data
.end method

.method public static final B(Lac;Ljava/lang/Throwable;)V
    .locals 3

    instance-of v0, p1, Lde;

    if-eqz v0, :cond_0

    check-cast p1, Lde;

    iget-object p1, p1, Lde;->a:Ljava/lang/Throwable;

    :cond_0
    :try_start_0
    sget-object v0, Lgf;->c:Lgf;

    invoke-interface {p0, v0}, Lac;->m(LZb;)LYb;

    move-result-object v0

    check-cast v0, LB2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-static {p0, p1}, LNj;->D(Lac;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception v0

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Exception while trying to handle coroutine exception"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1, p1}, LDc;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object p1, v1

    :goto_0
    invoke-static {p0, p1}, LNj;->D(Lac;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final C(LO4;Ljava/lang/Object;I)I
    .locals 4

    iget v0, p0, LO4;->c:I

    if-nez v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    :try_start_0
    iget-object v1, p0, LO4;->a:[I

    invoke-static {v0, p2, v1}, LQj;->d(II[I)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, LO4;->b:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_0
    return v1

    :cond_2
    add-int/lit8 v2, v1, 0x1

    :goto_1
    if-ge v2, v0, :cond_4

    iget-object v3, p0, LO4;->a:[I

    aget v3, v3, v2

    if-ne v3, p2, :cond_4

    iget-object v3, p0, LO4;->b:[Ljava/lang/Object;

    aget-object v3, v3, v2

    invoke-static {p1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return v2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v1, v1, -0x1

    :goto_2
    if-ltz v1, :cond_6

    iget-object v0, p0, LO4;->a:[I

    aget v0, v0, v1

    if-ne v0, p2, :cond_6

    iget-object v0, p0, LO4;->b:[Ljava/lang/Object;

    aget-object v0, v0, v1

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    return v1

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_6
    not-int p0, v2

    return p0

    :catch_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p0
.end method

.method public static D(F)I
    .locals 15

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    const/high16 p0, -0x1000000

    return p0

    :cond_0
    const/high16 v0, 0x42c60000    # 99.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    const/high16 v0, 0x41800000    # 16.0f

    add-float v1, p0, v0

    const/high16 v2, 0x42e80000    # 116.0f

    div-float/2addr v1, v2

    const/high16 v3, 0x41000000    # 8.0f

    cmpl-float v3, p0, v3

    const v4, 0x4461d2f7

    if-lez v3, :cond_2

    mul-float p0, v1, v1

    mul-float/2addr p0, v1

    goto :goto_0

    :cond_2
    div-float/2addr p0, v4

    :goto_0
    mul-float v3, v1, v1

    mul-float/2addr v3, v1

    const v5, 0x3c111aa7

    cmpl-float v5, v3, v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-lez v5, :cond_3

    move v5, v7

    goto :goto_1

    :cond_3
    move v5, v6

    :goto_1
    if-eqz v5, :cond_4

    move v8, v3

    goto :goto_2

    :cond_4
    mul-float v8, v1, v2

    sub-float/2addr v8, v0

    div-float/2addr v8, v4

    :goto_2
    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    mul-float/2addr v1, v2

    sub-float/2addr v1, v0

    div-float v3, v1, v4

    :goto_3
    sget-object v0, LOj;->c:[F

    aget v1, v0, v6

    mul-float/2addr v8, v1

    float-to-double v9, v8

    aget v1, v0, v7

    mul-float/2addr p0, v1

    float-to-double v11, p0

    const/4 p0, 0x2

    aget p0, v0, p0

    mul-float/2addr v3, p0

    float-to-double v13, v3

    invoke-static/range {v9 .. v14}, Lza;->a(DDD)I

    move-result p0

    return p0
.end method

.method public static E(LEb;)LEb;
    .locals 2

    instance-of v0, p0, LFb;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LFb;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object p0, v0, LFb;->c:LEb;

    if-nez p0, :cond_2

    iget-object p0, v0, LFb;->b:Lac;

    sget-object v1, Lgf;->b:Lgf;

    invoke-interface {p0, v1}, Lac;->m(LZb;)LYb;

    move-result-object p0

    check-cast p0, Lbc;

    if-eqz p0, :cond_1

    new-instance v1, Lee;

    invoke-direct {v1, p0, v0}, Lee;-><init>(Lbc;LFb;)V

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    iput-object v1, v0, LFb;->c:LEb;

    return-object v1

    :cond_2
    return-object p0
.end method

.method public static F()Z
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {}, LyB;->a()Z

    move-result v0

    return v0

    :cond_0
    const-class v0, Landroid/os/Trace;

    :try_start_0
    sget-object v1, LOj;->l:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const-string v1, "TRACE_TAG_APP"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v3

    sput-wide v3, LOj;->k:J

    const-string v1, "isTagEnabled"

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, LOj;->l:Ljava/lang/reflect/Method;

    :cond_1
    sget-object v0, LOj;->l:Ljava/lang/reflect/Method;

    sget-wide v3, LOj;->k:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    instance-of v1, v0, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static H(Landroid/net/Uri;)Z
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "content"

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "media"

    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static I(B)Z
    .locals 1

    const/16 v0, -0x41

    if-le p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static L(I)F
    .locals 6

    int-to-float p0, p0

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p0, v0

    const v0, 0x3d25aee6    # 0.04045f

    cmpg-float v0, p0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    if-gtz v0, :cond_0

    const v0, 0x414eb852    # 12.92f

    div-float/2addr p0, v0

    :goto_0
    mul-float/2addr p0, v1

    return p0

    :cond_0
    const v0, 0x3d6147ae    # 0.055f

    add-float/2addr p0, v0

    const v0, 0x3f870a3d    # 1.055f

    div-float/2addr p0, v0

    float-to-double v2, p0

    const-wide v4, 0x4003333340000000L    # 2.4000000953674316

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-float p0, v2

    goto :goto_0
.end method

.method public static M(I[B)J
    .locals 2

    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    int-to-long p0, p0

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    return-wide p0
.end method

.method public static final N(Ljava/lang/String;)J
    .locals 10

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/4 v4, 0x2

    const-string v5, "+-"

    invoke-static {v5, v3, v2, v4}, Ltz;->Q(Ljava/lang/CharSequence;CII)I

    move-result v3

    if-ltz v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    sub-int v4, v0, v3

    const/16 v5, 0x3a

    const/16 v6, 0x30

    const/16 v7, 0x10

    if-le v4, v7, :cond_5

    move v4, v3

    :goto_1
    if-ge v3, v0, :cond_3

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v8, v6, :cond_1

    if-ne v4, v3, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    const/16 v9, 0x31

    if-gt v9, v8, :cond_5

    if-ge v8, v5, :cond_5

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    sub-int v3, v0, v4

    if-le v3, v7, :cond_5

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x2d

    if-ne p0, v0, :cond_4

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_4
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_5
    const-string v2, "+"

    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    if-le v0, v1, :cond_6

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-gt v6, v0, :cond_6

    if-ge v0, v5, :cond_6

    invoke-static {v1, p0}, Ltz;->M(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0

    :cond_6
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final T(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p0, LGw;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, LGw;

    iget-object p0, p0, LGw;->a:Ljava/lang/Throwable;

    throw p0
.end method

.method public static U(IJ[B)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    add-int v1, p0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v2, p1

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, p3, v1

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x8

    shr-long/2addr p1, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final V(Ljava/io/File;)Loh;
    .locals 6

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    sget-char v0, Ljava/io/File;->separatorChar:C

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p0, v0, v1, v2}, Ltz;->Q(Ljava/lang/CharSequence;CII)I

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v4, :cond_1

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v0, :cond_1

    const/4 v3, 0x2

    invoke-static {p0, v0, v3, v2}, Ltz;->Q(Ljava/lang/CharSequence;CII)I

    move-result v3

    if-ltz v3, :cond_1

    add-int/2addr v3, v4

    invoke-static {p0, v0, v3, v2}, Ltz;->Q(Ljava/lang/CharSequence;CII)I

    move-result v2

    if-ltz v2, :cond_0

    add-int/2addr v2, v4

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_0

    :cond_1
    move v2, v4

    goto :goto_0

    :cond_2
    const/16 v2, 0x3a

    if-lez v3, :cond_3

    add-int/lit8 v5, v3, -0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v2, :cond_3

    add-int/lit8 v2, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, -0x1

    if-ne v3, v5, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_4

    invoke-static {p0}, Ltz;->N(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3, v2, v1}, LDc;->h(CCZ)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_0

    :cond_4
    move v2, v1

    :goto_0
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_5

    sget-object p0, LKf;->a:LKf;

    goto :goto_2

    :cond_5
    new-array v2, v4, [C

    aput-char v0, v2, v1

    invoke-static {p0, v2}, Ltz;->a0(Ljava/lang/String;[C)Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    move-object p0, v0

    :goto_2
    new-instance v0, Loh;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, p0}, Loh;-><init>(Ljava/io/File;Ljava/util/List;)V

    return-object v0
.end method

.method public static final W(JLPe;)J
    .locals 5

    sget-object v0, LPe;->b:LPe;

    iget-object v1, p2, LPe;->a:Ljava/util/concurrent/TimeUnit;

    iget-object p2, p2, LPe;->a:Ljava/util/concurrent/TimeUnit;

    iget-object v2, v0, LPe;->a:Ljava/util/concurrent/TimeUnit;

    const-wide v3, 0x3ffffffffffa14bfL    # 1.9999999999138678

    invoke-virtual {v1, v3, v4, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    neg-long v3, v1

    cmp-long v3, v3, p0

    if-gtz v3, :cond_0

    cmp-long v1, p0, v1

    if-gtz v1, :cond_0

    iget-object v0, v0, LPe;->a:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p0, p1, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p0

    const/4 p2, 0x1

    shl-long/2addr p0, p2

    sget p2, LMe;->d:I

    sget p2, LNe;->a:I

    return-wide p0

    :cond_0
    sget-object v0, LPe;->c:LPe;

    iget-object v0, v0, LPe;->a:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p0, p1, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p0

    invoke-static {p0, p1}, LTB;->g(J)J

    move-result-wide p0

    invoke-static {p0, p1}, LOj;->m(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static Y()F
    .locals 4

    const/high16 v0, 0x42480000    # 50.0f

    float-to-double v0, v0

    const-wide/high16 v2, 0x4030000000000000L    # 16.0

    add-double/2addr v0, v2

    const-wide/high16 v2, 0x405d000000000000L    # 116.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    return v0
.end method

.method public static final a(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x80

    invoke-static {v2, v3}, LNj;->g(II)I

    move-result v3

    if-gez v3, :cond_1

    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static final b(Ljava/lang/String;)J
    .locals 25

    move-object/from16 v0, p0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_1b

    sget v2, LMe;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2b

    const/16 v5, 0x2d

    const/4 v6, 0x1

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    if-lez v3, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4, v5, v2}, LDc;->h(CCZ)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v6

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    if-le v1, v3, :cond_1a

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v7, 0x50

    if-ne v5, v7, :cond_19

    add-int/2addr v3, v6

    if-eq v3, v1, :cond_18

    const/4 v5, 0x0

    move v9, v2

    const-wide/16 v10, 0x0

    :goto_2
    if-ge v3, v1, :cond_16

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0x54

    if-ne v12, v13, :cond_3

    if-nez v9, :cond_2

    add-int/lit8 v3, v3, 0x1

    if-eq v3, v1, :cond_2

    move v9, v6

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_3
    move v12, v3

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v13

    if-ge v12, v13, :cond_5

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v14, 0x30

    if-gt v14, v13, :cond_4

    const/16 v14, 0x3a

    if-ge v13, v14, :cond_4

    goto :goto_4

    :cond_4
    const/4 v14, 0x2

    const-string v15, "+-."

    invoke-static {v15, v13, v2, v14}, Ltz;->Q(Ljava/lang/CharSequence;CII)I

    move-result v13

    if-ltz v13, :cond_5

    :goto_4
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_5
    invoke-virtual {v0, v3, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    if-eqz v13, :cond_15

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    add-int/2addr v13, v3

    if-ltz v13, :cond_14

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v13, v3, :cond_14

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v13, v13, 0x1

    if-nez v9, :cond_7

    const/16 v14, 0x44

    if-ne v3, v14, :cond_6

    sget-object v3, LPe;->g:LPe;

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid or unsupported duration ISO non-time unit: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const/16 v14, 0x48

    if-eq v3, v14, :cond_a

    const/16 v14, 0x4d

    if-eq v3, v14, :cond_9

    const/16 v14, 0x53

    if-ne v3, v14, :cond_8

    sget-object v3, LPe;->d:LPe;

    goto :goto_5

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid duration ISO time unit: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    sget-object v3, LPe;->e:LPe;

    goto :goto_5

    :cond_a
    sget-object v3, LPe;->f:LPe;

    :goto_5
    if-eqz v5, :cond_c

    invoke-virtual {v5, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-lez v5, :cond_b

    goto :goto_6

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected order of duration components"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_6
    const/16 v5, 0x2e

    const/4 v14, 0x6

    invoke-static {v12, v5, v2, v14}, Ltz;->Q(Ljava/lang/CharSequence;CII)I

    move-result v5

    sget-object v14, LPe;->d:LPe;

    if-ne v3, v14, :cond_13

    if-lez v5, :cond_13

    invoke-virtual {v12, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, LOj;->N(Ljava/lang/String;)J

    move-result-wide v14

    invoke-static {v14, v15, v3}, LOj;->W(JLPe;)J

    move-result-wide v14

    invoke-static {v10, v11, v14, v15}, LMe;->e(JJ)J

    move-result-wide v10

    invoke-virtual {v12, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v14

    sget-object v5, LPe;->b:LPe;

    iget-object v5, v5, LPe;->a:Ljava/util/concurrent/TimeUnit;

    iget-object v12, v3, LPe;->a:Ljava/util/concurrent/TimeUnit;

    move/from16 v16, v6

    const-wide/16 v17, 0x0

    const-wide/16 v6, 0x1

    move-object/from16 v19, v3

    invoke-virtual {v5, v6, v7, v12}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    cmp-long v20, v2, v17

    if-lez v20, :cond_d

    long-to-double v2, v2

    mul-double/2addr v2, v14

    goto :goto_7

    :cond_d
    invoke-virtual {v12, v6, v7, v5}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    long-to-double v2, v2

    div-double v2, v14, v2

    :goto_7
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v5

    if-nez v5, :cond_12

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v5

    const-string v8, "Cannot round NaN value."

    if-nez v5, :cond_11

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    const-wide v21, -0x3ffffffffffa14bfL    # -2.0000000001722644

    cmp-long v5, v21, v2

    if-gtz v5, :cond_e

    const-wide v21, 0x3ffffffffffa14c0L    # 1.999999999913868

    cmp-long v5, v2, v21

    if-gez v5, :cond_e

    shl-long v2, v2, v16

    sget v5, LMe;->d:I

    sget v5, LNe;->a:I

    move-wide/from16 v23, v2

    move v3, v1

    move-wide/from16 v0, v23

    goto :goto_9

    :cond_e
    sget-object v2, LPe;->c:LPe;

    iget-object v2, v2, LPe;->a:Ljava/util/concurrent/TimeUnit;

    move v3, v1

    invoke-virtual {v2, v6, v7, v12}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    cmp-long v5, v0, v17

    if-lez v5, :cond_f

    long-to-double v0, v0

    mul-double/2addr v14, v0

    goto :goto_8

    :cond_f
    invoke-virtual {v12, v6, v7, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    long-to-double v0, v0

    div-double/2addr v14, v0

    :goto_8
    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_10

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    invoke-static {v0, v1}, LOj;->n(J)J

    move-result-wide v0

    :goto_9
    invoke-static {v10, v11, v0, v1}, LMe;->e(JJ)J

    move-result-wide v10

    move-object/from16 v0, p0

    move v1, v3

    move v3, v13

    move/from16 v6, v16

    move-object/from16 v5, v19

    :goto_a
    const/4 v2, 0x0

    goto/16 :goto_2

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Duration value cannot be NaN."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    move-object/from16 v19, v3

    move/from16 v16, v6

    const-wide/16 v17, 0x0

    move v3, v1

    invoke-static {v12}, LOj;->N(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v2, v19

    invoke-static {v0, v1, v2}, LOj;->W(JLPe;)J

    move-result-wide v0

    invoke-static {v10, v11, v0, v1}, LMe;->e(JJ)J

    move-result-wide v10

    move-object/from16 v0, p0

    move-object v5, v2

    move v1, v3

    move v3, v13

    move/from16 v6, v16

    goto :goto_a

    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Missing unit for value "

    invoke-virtual {v1, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_16
    move/from16 v16, v6

    if-eqz v4, :cond_17

    shr-long v0, v10, v16

    neg-long v0, v0

    long-to-int v2, v10

    and-int/lit8 v2, v2, 0x1

    shl-long v0, v0, v16

    int-to-long v2, v2

    add-long/2addr v0, v2

    sget v2, LNe;->a:I

    return-wide v0

    :cond_17
    return-wide v10

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_1a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No components"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The string is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x7f

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    return-void
.end method

.method public static final i(I)V
    .locals 1

    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Expected positive parallelism level, but got "

    invoke-static {p0, v0}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static j([B[B)[B
    .locals 59

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    array-length v2, v0

    const/16 v3, 0x20

    if-ne v2, v3, :cond_2

    const/4 v2, 0x0

    invoke-static {v2, v0}, LOj;->M(I[B)J

    move-result-wide v4

    const-wide/32 v6, 0x3ffffff

    and-long/2addr v4, v6

    const/4 v8, 0x3

    invoke-static {v8, v0}, LOj;->M(I[B)J

    move-result-wide v9

    const/4 v11, 0x2

    shr-long/2addr v9, v11

    const-wide/32 v12, 0x3ffff03

    and-long/2addr v9, v12

    const/4 v12, 0x6

    invoke-static {v12, v0}, LOj;->M(I[B)J

    move-result-wide v13

    const/4 v15, 0x4

    shr-long/2addr v13, v15

    const-wide/32 v16, 0x3ffc0ff

    and-long v13, v13, v16

    move/from16 v16, v3

    const/16 v3, 0x9

    invoke-static {v3, v0}, LOj;->M(I[B)J

    move-result-wide v17

    shr-long v17, v17, v12

    const-wide/32 v19, 0x3f03fff

    and-long v17, v17, v19

    move-wide/from16 v19, v6

    const/16 v6, 0xc

    invoke-static {v6, v0}, LOj;->M(I[B)J

    move-result-wide v21

    const/16 v7, 0x8

    shr-long v21, v21, v7

    const-wide/32 v23, 0xfffff

    and-long v21, v21, v23

    const-wide/16 v23, 0x5

    mul-long v25, v9, v23

    mul-long v27, v13, v23

    mul-long v29, v17, v23

    mul-long v31, v21, v23

    move/from16 v33, v11

    const/16 v11, 0x11

    move/from16 v34, v7

    new-array v7, v11, [B

    const-wide/16 v35, 0x0

    move/from16 v45, v15

    move-wide/from16 v37, v35

    move-wide/from16 v39, v37

    move-wide/from16 v41, v39

    move-wide/from16 v43, v41

    move v15, v2

    :goto_0
    array-length v6, v1

    const/16 v47, 0x18

    const/16 v3, 0x10

    const/16 v48, 0x1a

    if-ge v15, v6, :cond_1

    array-length v6, v1

    sub-int/2addr v6, v15

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-static {v1, v15, v7, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v49, 0x1

    aput-byte v49, v7, v6

    if-eq v6, v3, :cond_0

    add-int/lit8 v6, v6, 0x1

    invoke-static {v7, v6, v11, v2}, Ljava/util/Arrays;->fill([BIIB)V

    :cond_0
    invoke-static {v2, v7}, LOj;->M(I[B)J

    move-result-wide v49

    and-long v49, v49, v19

    add-long v43, v43, v49

    invoke-static {v8, v7}, LOj;->M(I[B)J

    move-result-wide v49

    shr-long v49, v49, v33

    and-long v49, v49, v19

    add-long v35, v35, v49

    invoke-static {v12, v7}, LOj;->M(I[B)J

    move-result-wide v49

    shr-long v49, v49, v45

    and-long v49, v49, v19

    add-long v37, v37, v49

    const/16 v6, 0x9

    invoke-static {v6, v7}, LOj;->M(I[B)J

    move-result-wide v49

    shr-long v49, v49, v12

    and-long v49, v49, v19

    add-long v39, v39, v49

    const/16 v6, 0xc

    invoke-static {v6, v7}, LOj;->M(I[B)J

    move-result-wide v49

    shr-long v49, v49, v34

    and-long v49, v49, v19

    aget-byte v3, v7, v3

    shl-int/lit8 v3, v3, 0x18

    move-wide/from16 v51, v9

    int-to-long v8, v3

    or-long v8, v49, v8

    add-long v41, v41, v8

    mul-long v8, v43, v4

    mul-long v49, v35, v31

    add-long v49, v49, v8

    mul-long v8, v37, v29

    add-long v8, v8, v49

    mul-long v49, v39, v27

    add-long v49, v49, v8

    mul-long v8, v41, v25

    add-long v8, v8, v49

    mul-long v49, v43, v51

    mul-long v53, v35, v4

    add-long v53, v53, v49

    mul-long v49, v37, v31

    add-long v49, v49, v53

    mul-long v53, v39, v29

    add-long v53, v53, v49

    mul-long v49, v41, v27

    add-long v49, v49, v53

    mul-long v53, v43, v13

    mul-long v55, v35, v51

    add-long v55, v55, v53

    mul-long v53, v37, v4

    add-long v53, v53, v55

    mul-long v55, v39, v31

    add-long v55, v55, v53

    mul-long v53, v41, v29

    add-long v53, v53, v55

    mul-long v55, v43, v17

    mul-long v57, v35, v13

    add-long v57, v57, v55

    mul-long v55, v37, v51

    add-long v55, v55, v57

    mul-long v57, v39, v4

    add-long v57, v57, v55

    mul-long v55, v41, v31

    add-long v55, v55, v57

    mul-long v43, v43, v21

    mul-long v35, v35, v17

    add-long v35, v35, v43

    mul-long v37, v37, v13

    add-long v37, v37, v35

    mul-long v39, v39, v51

    add-long v39, v39, v37

    mul-long v41, v41, v4

    add-long v41, v41, v39

    shr-long v35, v8, v48

    and-long v8, v8, v19

    add-long v49, v49, v35

    shr-long v35, v49, v48

    and-long v37, v49, v19

    add-long v53, v53, v35

    shr-long v35, v53, v48

    and-long v39, v53, v19

    add-long v55, v55, v35

    shr-long v35, v55, v48

    and-long v43, v55, v19

    add-long v41, v41, v35

    shr-long v35, v41, v48

    and-long v41, v41, v19

    mul-long v35, v35, v23

    add-long v35, v35, v8

    shr-long v8, v35, v48

    and-long v35, v35, v19

    add-long v8, v37, v8

    add-int/lit8 v15, v15, 0x10

    move-wide/from16 v37, v39

    move-wide/from16 v39, v43

    const/16 v3, 0x9

    move-wide/from16 v43, v35

    move-wide/from16 v35, v8

    move-wide/from16 v9, v51

    const/4 v8, 0x3

    goto/16 :goto_0

    :cond_1
    shr-long v4, v35, v48

    and-long v6, v35, v19

    add-long v37, v37, v4

    shr-long v4, v37, v48

    and-long v8, v37, v19

    add-long v39, v39, v4

    shr-long v4, v39, v48

    and-long v10, v39, v19

    add-long v41, v41, v4

    shr-long v4, v41, v48

    and-long v13, v41, v19

    mul-long v4, v4, v23

    add-long v4, v4, v43

    shr-long v17, v4, v48

    and-long v4, v4, v19

    add-long v6, v6, v17

    add-long v23, v4, v23

    shr-long v17, v23, v48

    and-long v21, v23, v19

    add-long v17, v6, v17

    shr-long v23, v17, v48

    and-long v17, v17, v19

    add-long v23, v8, v23

    shr-long v25, v23, v48

    and-long v23, v23, v19

    add-long v25, v10, v25

    shr-long v27, v25, v48

    and-long v19, v25, v19

    add-long v27, v13, v27

    const-wide/32 v25, 0x4000000

    sub-long v27, v27, v25

    const/16 v1, 0x3f

    move v15, v12

    move-wide/from16 v25, v13

    shr-long v12, v27, v1

    and-long/2addr v4, v12

    and-long/2addr v6, v12

    and-long/2addr v8, v12

    and-long/2addr v10, v12

    and-long v25, v25, v12

    not-long v12, v12

    and-long v21, v21, v12

    or-long v4, v4, v21

    and-long v17, v17, v12

    or-long v6, v6, v17

    and-long v17, v23, v12

    or-long v8, v8, v17

    and-long v17, v19, v12

    or-long v10, v10, v17

    and-long v12, v27, v12

    or-long v12, v25, v12

    shl-long v17, v6, v48

    or-long v4, v4, v17

    const-wide v17, 0xffffffffL

    and-long v4, v4, v17

    shr-long/2addr v6, v15

    const/16 v1, 0x14

    shl-long v14, v8, v1

    or-long/2addr v6, v14

    and-long v6, v6, v17

    const/16 v46, 0xc

    shr-long v8, v8, v46

    const/16 v14, 0xe

    shl-long v14, v10, v14

    or-long/2addr v8, v14

    and-long v8, v8, v17

    const/16 v14, 0x12

    shr-long/2addr v10, v14

    shl-long v12, v12, v34

    or-long/2addr v10, v12

    and-long v10, v10, v17

    invoke-static {v3, v0}, LOj;->M(I[B)J

    move-result-wide v12

    add-long/2addr v12, v4

    and-long v4, v12, v17

    invoke-static {v1, v0}, LOj;->M(I[B)J

    move-result-wide v14

    add-long/2addr v14, v6

    shr-long v6, v12, v16

    add-long/2addr v14, v6

    and-long v6, v14, v17

    move/from16 v1, v47

    invoke-static {v1, v0}, LOj;->M(I[B)J

    move-result-wide v12

    add-long/2addr v12, v8

    shr-long v8, v14, v16

    add-long/2addr v12, v8

    and-long v8, v12, v17

    const/16 v1, 0x1c

    invoke-static {v1, v0}, LOj;->M(I[B)J

    move-result-wide v0

    add-long/2addr v0, v10

    shr-long v10, v12, v16

    add-long/2addr v0, v10

    and-long v0, v0, v17

    new-array v3, v3, [B

    invoke-static {v2, v4, v5, v3}, LOj;->U(IJ[B)V

    move/from16 v2, v45

    invoke-static {v2, v6, v7, v3}, LOj;->U(IJ[B)V

    move/from16 v2, v34

    invoke-static {v2, v8, v9, v3}, LOj;->U(IJ[B)V

    const/16 v6, 0xc

    invoke-static {v6, v0, v1, v3}, LOj;->U(IJ[B)V

    return-object v3

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The key length in bytes must be 32."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(LEb;LEb;Lkotlin/jvm/functions/Function2;)LEb;
    .locals 2

    instance-of v0, p2, Lu5;

    if-eqz v0, :cond_0

    check-cast p2, Lu5;

    invoke-virtual {p2, p1, p0}, Lu5;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p1}, LEb;->e()Lac;

    move-result-object v0

    sget-object v1, LIf;->a:LIf;

    if-ne v0, v1, :cond_1

    new-instance v0, LMl;

    invoke-direct {v0, p1, p0, p2}, LMl;-><init>(LEb;LEb;Lkotlin/jvm/functions/Function2;)V

    return-object v0

    :cond_1
    new-instance v1, LNl;

    invoke-direct {v1, p1, v0, p2, p0}, LNl;-><init>(LEb;Lac;Lkotlin/jvm/functions/Function2;LEb;)V

    return-object v1
.end method

.method public static final l(Lts;)Lax;
    .locals 7

    iget-object p0, p0, Llc;->a:Ljava/util/LinkedHashMap;

    sget-object v0, LOj;->h:Lhw;

    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lix;

    if-eqz v0, :cond_8

    sget-object v1, LOj;->i:Lhw;

    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LyE;

    if-eqz v1, :cond_7

    sget-object v2, LOj;->j:Lhw;

    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    sget-object v3, Lgf;->n:Lgf;

    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_6

    invoke-interface {v0}, Lix;->getSavedStateRegistry()Lhx;

    move-result-object v0

    invoke-virtual {v0}, Lhx;->b()Lgx;

    move-result-object v0

    instance-of v3, v0, Ldx;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v0, Ldx;

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_5

    invoke-static {v1}, LOj;->y(LyE;)Lex;

    move-result-object v1

    iget-object v3, v1, Lex;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lax;

    if-nez v3, :cond_4

    sget-object v3, Lax;->f:[Ljava/lang/Class;

    invoke-virtual {v0}, Ldx;->a()V

    iget-object v3, v0, Ldx;->c:Landroid/os/Bundle;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    iget-object v5, v0, Ldx;->c:Landroid/os/Bundle;

    if-eqz v5, :cond_2

    invoke-virtual {v5, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_2
    iget-object v5, v0, Ldx;->c:Landroid/os/Bundle;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_3

    iput-object v4, v0, Ldx;->c:Landroid/os/Bundle;

    :cond_3
    invoke-static {v3, v2}, LQj;->m(Landroid/os/Bundle;Landroid/os/Bundle;)Lax;

    move-result-object v0

    iget-object v1, v1, Lex;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_4
    return-object v3

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final m(J)J
    .locals 2

    const/4 v0, 0x1

    shl-long/2addr p0, v0

    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    sget v0, LMe;->d:I

    sget v0, LNe;->a:I

    return-wide p0
.end method

.method public static final n(J)J
    .locals 2

    const-wide v0, -0x431bde82d7aL

    cmp-long v0, v0, p0

    if-gtz v0, :cond_0

    const-wide v0, 0x431bde82d7bL

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    const v0, 0xf4240

    int-to-long v0, v0

    mul-long/2addr p0, v0

    const/4 v0, 0x1

    shl-long/2addr p0, v0

    sget v0, LMe;->d:I

    sget v0, LNe;->a:I

    return-wide p0

    :cond_0
    invoke-static {p0, p1}, LTB;->g(J)J

    move-result-wide p0

    invoke-static {p0, p1}, LOj;->m(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final o(Lix;)V
    .locals 3

    invoke-interface {p0}, LYn;->getLifecycle()LRn;

    move-result-object v0

    check-cast v0, Lao;

    iget-object v0, v0, Lao;->c:LPn;

    sget-object v1, LPn;->b:LPn;

    if-eq v0, v1, :cond_1

    sget-object v1, LPn;->c:LPn;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Lix;->getSavedStateRegistry()Lhx;

    move-result-object v0

    invoke-virtual {v0}, Lhx;->b()Lgx;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ldx;

    invoke-interface {p0}, Lix;->getSavedStateRegistry()Lhx;

    move-result-object v1

    move-object v2, p0

    check-cast v2, LyE;

    invoke-direct {v0, v1, v2}, Ldx;-><init>(Lhx;LyE;)V

    invoke-interface {p0}, Lix;->getSavedStateRegistry()Lhx;

    move-result-object v1

    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v1, v2, v0}, Lhx;->c(Ljava/lang/String;Lgx;)V

    invoke-interface {p0}, LYn;->getLifecycle()LRn;

    move-result-object p0

    new-instance v1, Lcv;

    const/4 v2, 0x4

    invoke-direct {v1, v2, v0}, Lcv;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v1}, LRn;->a(LXn;)V

    :cond_2
    return-void
.end method

.method public static p(Landroid/app/Activity;)V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const-wide v1, -0x8113fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/high16 v2, 0x4000000

    invoke-virtual {v1, v2}, Landroid/view/Window;->clearFlags(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/high16 v2, -0x80000000

    invoke-virtual {v1, v2}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-wide v2, -0x8126fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v2

    sget-object v3, LXA;->a:Ljava/util/HashMap;

    invoke-static {}, Lhw;->h()Z

    move-result v3

    if-eqz v3, :cond_0

    or-int/lit16 v2, v2, 0x400

    and-int/lit16 v2, v2, -0x2001

    goto :goto_0

    :cond_0
    or-int/lit16 v2, v2, 0x2400

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/4 v1, 0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static u(Lw4;)V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Les;->b:Les;

    iget-object v1, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsu;

    iget-object v4, v3, Lsu;->d:Lcn;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v5, 0x3

    if-ne v4, v5, :cond_1

    sget-object v4, Lv1;->D:Lv1;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    sget-object v4, Lv1;->C:Lv1;

    goto :goto_1

    :cond_3
    sget-object v4, Lv1;->B:Lv1;

    :goto_1
    iget v5, v3, Lsu;->f:I

    iget-object v6, v3, Lsu;->g:Ljava/lang/String;

    const-string v7, "type.googleapis.com/google.crypto."

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    const/16 v7, 0x22

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    :goto_2
    iget-object v3, v3, Lsu;->e:Lyt;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Lfs;

    invoke-direct {v7, v4, v5, v6, v3}, Lfs;-><init>(Lv1;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    iget-object p0, p0, Lw4;->c:Ljava/lang/Object;

    check-cast p0, Lsu;

    if-eqz p0, :cond_6

    iget p0, p0, Lsu;->f:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_3

    :cond_6
    const/4 p0, 0x0

    :goto_3
    if-eqz p0, :cond_9

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfs;

    iget v2, v2, Lfs;->b:I

    if-ne v2, p0, :cond_7

    goto :goto_4

    :cond_8
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "primary key ID is not present in entries"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    goto :goto_5

    :cond_9
    :goto_4
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final v(LQm;)LQm;
    .locals 1

    invoke-interface {p0}, LQm;->getDescriptor()LCx;

    move-result-object v0

    invoke-interface {v0}, LCx;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lct;

    invoke-direct {v0, p0}, Lct;-><init>(LQm;)V

    return-object v0
.end method

.method public static final y(LyE;)Lex;
    .locals 6

    new-instance v0, Lcx;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p0}, LyE;->getViewModelStore()LxE;

    move-result-object v1

    instance-of v2, p0, Lqk;

    if-eqz v2, :cond_0

    check-cast p0, Lqk;

    invoke-interface {p0}, Lqk;->getDefaultViewModelCreationExtras()Llc;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Ljc;->b:Ljc;

    :goto_0
    iget-object v2, v1, LxE;->a:Ljava/util/LinkedHashMap;

    const-string v3, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LuE;

    const-class v4, Lex;

    invoke-virtual {v4, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_3

    :cond_1
    new-instance v2, Lts;

    invoke-direct {v2, p0}, Lts;-><init>(Llc;)V

    sget-object p0, Lgf;->n:Lgf;

    invoke-virtual {v2, p0, v3}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :try_start_0
    invoke-interface {v0, v4, v2}, LwE;->b(Ljava/lang/Class;Lts;)LuE;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v2, p0

    goto :goto_2

    :catch_0
    invoke-interface {v0, v4}, LwE;->a(Ljava/lang/Class;)LuE;

    move-result-object p0

    goto :goto_1

    :goto_2
    iget-object p0, v1, LxE;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LuE;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, LuE;->b()V

    :cond_2
    :goto_3
    check-cast v2, Lex;

    return-object v2
.end method


# virtual methods
.method public A(Landroid/view/View;)F
    .locals 1

    sget-boolean v0, LOj;->m:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1}, LPE;->a(Landroid/view/View;)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 v0, 0x0

    sput-boolean v0, LOj;->m:Z

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result p1

    return p1
.end method

.method public abstract G(F)Z
.end method

.method public abstract J(Landroid/view/View;)Z
.end method

.method public abstract K(FF)Z
.end method

.method public abstract O(LK;LK;)V
.end method

.method public abstract P(LK;Ljava/lang/Thread;)V
.end method

.method public Q(Landroid/view/View;F)V
    .locals 1

    sget-boolean v0, LOj;->m:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LPE;->b(Landroid/view/View;F)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 v0, 0x0

    sput-boolean v0, LOj;->m:Z

    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public R(Landroid/view/View;I)V
    .locals 3

    sget-boolean v0, LOj;->o:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :try_start_0
    const-class v1, Landroid/view/View;

    const-string v2, "mViewFlags"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, LOj;->n:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sput-boolean v0, LOj;->o:Z

    :cond_0
    sget-object v0, LOj;->n:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    sget-object v1, LOj;->n:Ljava/lang/reflect/Field;

    and-int/lit8 v0, v0, -0xd

    or-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    return-void
.end method

.method public abstract S(Landroid/view/View;F)Z
.end method

.method public abstract X(Landroid/view/ViewGroup$MarginLayoutParams;II)V
.end method

.method public abstract d(Landroid/view/ViewGroup$MarginLayoutParams;)I
.end method

.method public abstract e(I)F
.end method

.method public abstract f(LL;LH;)Z
.end method

.method public abstract g(LL;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract h(LL;LK;LK;)Z
.end method

.method public abstract q()I
.end method

.method public abstract r()I
.end method

.method public abstract s()I
.end method

.method public abstract t()I
.end method

.method public abstract w(Landroid/view/View;)I
.end method

.method public abstract x(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)I
.end method

.method public abstract z()I
.end method
