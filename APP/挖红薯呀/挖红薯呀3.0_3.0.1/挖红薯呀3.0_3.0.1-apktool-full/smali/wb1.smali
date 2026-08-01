.class public final Lwb1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lwb1;

.field private static final b:Lu60;

.field private static final c:Lu60;

.field private static final d:Lu60;

.field private static final e:Lu60;

.field private static final f:Lu60;

.field private static final g:Lu60;

.field private static h:Z

.field public static final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwb1;

    .line 2
    .line 3
    invoke-direct {v0}, Lwb1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwb1;->a:Lwb1;

    .line 7
    .line 8
    new-instance v0, Lus0;

    .line 9
    .line 10
    const/16 v1, 0x15

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lx51;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lwb1;->b:Lu60;

    .line 21
    .line 22
    new-instance v0, Lus0;

    .line 23
    .line 24
    const/16 v1, 0x16

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lx51;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 32
    .line 33
    .line 34
    sput-object v1, Lwb1;->c:Lu60;

    .line 35
    .line 36
    new-instance v0, Lus0;

    .line 37
    .line 38
    const/16 v1, 0x17

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lx51;

    .line 44
    .line 45
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 46
    .line 47
    .line 48
    sput-object v1, Lwb1;->d:Lu60;

    .line 49
    .line 50
    new-instance v0, Lus0;

    .line 51
    .line 52
    const/16 v1, 0x18

    .line 53
    .line 54
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Lx51;

    .line 58
    .line 59
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 60
    .line 61
    .line 62
    sput-object v1, Lwb1;->e:Lu60;

    .line 63
    .line 64
    new-instance v0, Lus0;

    .line 65
    .line 66
    const/16 v1, 0x13

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lx51;

    .line 72
    .line 73
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 74
    .line 75
    .line 76
    sput-object v1, Lwb1;->f:Lu60;

    .line 77
    .line 78
    new-instance v0, Lus0;

    .line 79
    .line 80
    const/16 v1, 0x14

    .line 81
    .line 82
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Lx51;

    .line 86
    .line 87
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 88
    .line 89
    .line 90
    sput-object v1, Lwb1;->g:Lu60;

    .line 91
    .line 92
    const/16 v0, 0x8

    .line 93
    .line 94
    sput v0, Lwb1;->i:I

    .line 95
    .line 96
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final A()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lwb1;->d:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final B()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lwb1;->b:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final C()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lwb1;->c:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final D(Landroid/content/Context;Lsw;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lsw;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lwb1;->J(Landroid/content/Context;Z)V

    .line 3
    .line 4
    .line 5
    new-instance p0, Landroid/os/Handler;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lt4;

    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    invoke-direct {v0, v1, p1, p2}, Lt4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static final E(Landroid/content/Context;Lsw;)V
    .locals 3

    .line 1
    sget-object v0, Lwb1;->a:Lwb1;

    .line 2
    .line 3
    const-string v1, "\u9700\u8981\u8054\u7f51\u9a8c\u8bc1"

    .line 4
    .line 5
    const-string v2, "\u6a21\u5757\u9700\u8981\u8054\u7f51\u9a8c\u8bc1\u7248\u672c\uff0c\u8bf7\u786e\u4fdd\u7f51\u7edc\u8fde\u63a5\u540e\u91cd\u65b0\u6253\u5f00\u5c0f\u7ea2\u4e66"

    .line 6
    .line 7
    invoke-virtual {v0, p0, v1, v2}, Lwb1;->K(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final F(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string p0, "HmacSHA256"

    .line 2
    .line 3
    invoke-static {p0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 8
    .line 9
    sget-object v2, Lyd;->a:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p2, p0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string p2, ""

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 46
    .line 47
    .line 48
    array-length v0, p0

    .line 49
    const/4 v1, 0x0

    .line 50
    move v2, v1

    .line 51
    :goto_0
    if-ge v1, v0, :cond_1

    .line 52
    .line 53
    aget-byte v3, p0, v1

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    add-int/2addr v2, v4

    .line 57
    if-le v2, v4, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-static {v3}, Lwb1;->G(B)Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 67
    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method

.method private static final G(B)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "%02x"

    .line 15
    .line 16
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method private final I(Landroid/content/Context;)Z
    .locals 0

    .line 1
    const-string p0, "uimode"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/app/UiModeManager;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/UiModeManager;->getNightMode()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 p1, 0x2

    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method private static final L(Landroid/content/Context;I)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p1, p0

    .line 13
    float-to-int p0, p1

    .line 14
    return p0
.end method

.method private static final M(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lwb1;->q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b(Lsw;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lwb1;->v(Lsw;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lwb1;->m()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic d(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lwb1;->M(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lsw;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lwb1;->u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lsw;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Landroid/content/Context;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lwb1;->L(Landroid/content/Context;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic g()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lwb1;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lwb1;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic i()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lwb1;->p()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic j(JLandroid/content/Context;Lsw;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lwb1;->t(JLandroid/content/Context;Lsw;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lwb1;->n()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic l(Landroid/content/Context;Lsw;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lwb1;->E(Landroid/content/Context;Lsw;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final m()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x2a
        0x16
        0x1a
        0x50
        0x24
        0x27
        0x6
        0x52
        0x14
        0xb
        0x11
        0x5d
        0x3f
    .end array-data
.end method

.method private static final n()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x3d
        0x1b
        0x2f
        0x53
        0x27
        0x17
        0x13
        0x5a
    .end array-data
.end method

.method private static final o()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x3d
        0x1b
        0x2f
        0x53
        0x27
        0x17
        0x13
        0x5a
        0x14
        0xc
        0x3
    .end array-data
.end method

.method private static final p()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x3d
        0x1b
        0x1b
        0x6e
        0x3b
        0xa
        0x15
        0x57
        0x38
    .end array-data
.end method

.method private static final q()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "vcw"

    .line 2
    .line 3
    return-object v0
.end method

.method private static final r()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x33

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x23
        0xc
        0x4
        0x41
        0x38
        0x42
        0x5f
        0x1e
        0x2a
        0x16
        0x1a
        0x50
        0x24
        0x4a
        0x40
        0x3
        0x7f
        0x56
        0x4
        0x5e
        0x3b
        0x57
        0x11
        0x44
        0x3f
        0x10
        0x2f
        0x5f
        0x24
        0xc
        0x19
        0x52
        0x2e
        0x57
        0x6
        0x54
        0x39
        0xb
        0x19
        0x5e
        0x25
        0x27
        0x13
        0x59
        0x2e
        0x1b
        0x1b
        0x1f
        0x3b
        0x10
        0x0
    .end array-data
.end method

.method private static final t(JLandroid/content/Context;Lsw;)V
    .locals 12

    .line 1
    const-string v0, "need_update"

    .line 2
    .line 3
    const-string v1, "UTF-8"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    const-string v3, "30121"

    .line 7
    .line 8
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    new-instance v5, Ljava/net/URL;

    .line 13
    .line 14
    sget-object v6, Lwb1;->a:Lwb1;

    .line 15
    .line 16
    invoke-direct {v6}, Lwb1;->C()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    invoke-static {v3, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v4, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v7, "?module_version="

    .line 37
    .line 38
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v3, "&app_version="

    .line 45
    .line 46
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-direct {v5, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    check-cast v1, Ljava/net/HttpURLConnection;

    .line 67
    .line 68
    const-string v3, "GET"

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/16 v3, 0x1388

    .line 74
    .line 75
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    const/16 v4, 0xc8

    .line 86
    .line 87
    if-gt v4, v3, :cond_e

    .line 88
    .line 89
    const/16 v5, 0x12c

    .line 90
    .line 91
    if-ge v3, v5, :cond_e

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v5, Lyd;->a:Ljava/nio/charset/Charset;

    .line 101
    .line 102
    new-instance v7, Ljava/io/InputStreamReader;

    .line 103
    .line 104
    invoke-direct {v7, v3, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 105
    .line 106
    .line 107
    new-instance v3, Ljava/io/BufferedReader;

    .line 108
    .line 109
    const/16 v5, 0x2000

    .line 110
    .line 111
    invoke-direct {v3, v7, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 112
    .line 113
    .line 114
    invoke-static {v3}, Lw60;->F(Ljava/io/Reader;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 119
    .line 120
    .line 121
    invoke-static {v3}, Lk41;->a0(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 125
    if-eqz v1, :cond_0

    .line 126
    .line 127
    :try_start_1
    invoke-direct {v6, p2, p3}, Lwb1;->D(Landroid/content/Context;Lsw;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :catch_0
    move-exception v0

    .line 132
    move-object p0, v0

    .line 133
    move-object v7, p2

    .line 134
    move-object v10, p3

    .line 135
    goto/16 :goto_a

    .line 136
    .line 137
    :cond_0
    :try_start_2
    new-instance v1, Lorg/json/JSONObject;

    .line 138
    .line 139
    invoke-direct {v1, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string v3, "code"

    .line 143
    .line 144
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 145
    .line 146
    .line 147
    move-result v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 148
    if-eq v3, v4, :cond_1

    .line 149
    .line 150
    :try_start_3
    invoke-direct {v6, p2, p3}, Lwb1;->D(Landroid/content/Context;Lsw;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_1
    :try_start_4
    const-string v3, "data"

    .line 155
    .line 156
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 157
    .line 158
    .line 159
    move-result-object v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 160
    if-nez v1, :cond_2

    .line 161
    .line 162
    :try_start_5
    invoke-direct {v6, p2, p3}, Lwb1;->D(Landroid/content/Context;Lsw;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_2
    :try_start_6
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 170
    const/4 v4, 0x1

    .line 171
    const-string v5, ""

    .line 172
    .line 173
    if-eqz v3, :cond_3

    .line 174
    .line 175
    :try_start_7
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 176
    .line 177
    .line 178
    move-result p0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 179
    goto :goto_1

    .line 180
    :cond_3
    :try_start_8
    const-string v0, "min_module_version"

    .line 181
    .line 182
    invoke-virtual {v1, v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const-string v3, "min_app_version"

    .line 187
    .line 188
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v6
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    .line 199
    if-lez v6, :cond_4

    .line 200
    .line 201
    :try_start_9
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 202
    .line 203
    .line 204
    move-result-wide v6
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 205
    const-wide/16 v8, 0x75a9

    .line 206
    .line 207
    cmp-long v0, v8, v6

    .line 208
    .line 209
    if-gez v0, :cond_4

    .line 210
    .line 211
    move v0, v4

    .line 212
    goto :goto_0

    .line 213
    :catch_1
    :cond_4
    move v0, v2

    .line 214
    :goto_0
    if-nez v0, :cond_5

    .line 215
    .line 216
    :try_start_a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 220
    .line 221
    .line 222
    move-result v6
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    .line 223
    if-lez v6, :cond_5

    .line 224
    .line 225
    :try_start_b
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 226
    .line 227
    .line 228
    move-result-wide v6
    :try_end_b
    .catch Ljava/lang/NumberFormatException; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    .line 229
    cmp-long p0, p0, v6

    .line 230
    .line 231
    if-gez p0, :cond_5

    .line 232
    .line 233
    move p0, v4

    .line 234
    goto :goto_1

    .line 235
    :catch_2
    :cond_5
    move p0, v0

    .line 236
    :goto_1
    :try_start_c
    sget-object p1, Lwb1;->a:Lwb1;

    .line 237
    .line 238
    invoke-direct {p1, p2}, Lwb1;->w(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 239
    .line 240
    .line 241
    if-eqz p0, :cond_d

    .line 242
    .line 243
    invoke-virtual {p1, p2, v4}, Lwb1;->J(Landroid/content/Context;Z)V

    .line 244
    .line 245
    .line 246
    const-string p0, "update_info"

    .line 247
    .line 248
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 249
    .line 250
    .line 251
    move-result-object p0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4

    .line 252
    const/4 p1, 0x0

    .line 253
    if-eqz p0, :cond_8

    .line 254
    .line 255
    :try_start_d
    const-string v0, "title"

    .line 256
    .line 257
    invoke-virtual {p0, v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    if-eqz v0, :cond_8

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 264
    .line 265
    .line 266
    move-result v3
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    .line 267
    if-nez v3, :cond_6

    .line 268
    .line 269
    move-object v0, p1

    .line 270
    :cond_6
    if-nez v0, :cond_7

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_7
    :goto_2
    move-object v8, v0

    .line 274
    goto :goto_4

    .line 275
    :cond_8
    :goto_3
    :try_start_e
    const-string v0, "update_title"

    .line 276
    .line 277
    invoke-virtual {v1, v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 282
    .line 283
    .line 284
    move-result v3
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4

    .line 285
    if-nez v3, :cond_7

    .line 286
    .line 287
    :try_start_f
    const-string v0, "\u7248\u672c\u8fc7\u4f4e"

    .line 288
    .line 289
    goto :goto_2

    .line 290
    :goto_4
    if-eqz p0, :cond_b

    .line 291
    .line 292
    const-string v0, "content"

    .line 293
    .line 294
    invoke-virtual {p0, v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    if-eqz p0, :cond_b

    .line 299
    .line 300
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 301
    .line 302
    .line 303
    move-result v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    .line 304
    if-nez v0, :cond_9

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_9
    move-object p1, p0

    .line 308
    :goto_5
    if-nez p1, :cond_a

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_a
    :goto_6
    move-object v9, p1

    .line 312
    goto :goto_8

    .line 313
    :cond_b
    :goto_7
    :try_start_10
    const-string p0, "update_content"

    .line 314
    .line 315
    invoke-virtual {v1, p0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 320
    .line 321
    .line 322
    move-result p1
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_4

    .line 323
    if-nez p1, :cond_c

    .line 324
    .line 325
    :try_start_11
    const-string p0, "\u8bf7\u66f4\u65b0\u6a21\u5757\u5230\u6700\u65b0\u7248\u672c"
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0

    .line 326
    .line 327
    :cond_c
    move-object p1, p0

    .line 328
    goto :goto_6

    .line 329
    :goto_8
    :try_start_12
    new-instance p0, Landroid/os/Handler;

    .line 330
    .line 331
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 336
    .line 337
    .line 338
    new-instance v6, Lqy;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_4

    .line 339
    .line 340
    const/4 v11, 0x1

    .line 341
    move-object v7, p2

    .line 342
    move-object v10, p3

    .line 343
    :try_start_13
    invoke-direct/range {v6 .. v11}, Lqy;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 347
    .line 348
    .line 349
    goto :goto_b

    .line 350
    :catch_3
    move-exception v0

    .line 351
    :goto_9
    move-object p0, v0

    .line 352
    goto :goto_a

    .line 353
    :catch_4
    move-exception v0

    .line 354
    move-object v7, p2

    .line 355
    move-object v10, p3

    .line 356
    goto :goto_9

    .line 357
    :cond_d
    move-object v7, p2

    .line 358
    move-object v10, p3

    .line 359
    invoke-virtual {p1, v7, v2}, Lwb1;->J(Landroid/content/Context;Z)V

    .line 360
    .line 361
    .line 362
    new-instance p0, Landroid/os/Handler;

    .line 363
    .line 364
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 369
    .line 370
    .line 371
    new-instance p1, Lx3;

    .line 372
    .line 373
    const/16 p2, 0x8

    .line 374
    .line 375
    invoke-direct {p1, p2, v10}, Lx3;-><init>(ILjava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 379
    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_e
    move-object v7, p2

    .line 383
    move-object v10, p3

    .line 384
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 385
    .line 386
    .line 387
    invoke-direct {v6, v7, v10}, Lwb1;->D(Landroid/content/Context;Lsw;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3

    .line 388
    .line 389
    .line 390
    return-void

    .line 391
    :goto_a
    sget-object p1, Llb0;->a:Llb0;

    .line 392
    .line 393
    sget-object p2, Lwb1;->a:Lwb1;

    .line 394
    .line 395
    invoke-direct {p2}, Lwb1;->B()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object p3

    .line 399
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    new-instance v1, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    const-string v3, "vc exception: "

    .line 414
    .line 415
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    const-string v0, ": "

    .line 422
    .line 423
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    invoke-virtual {p1, p3, p0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-direct {p2, v7, v10}, Lwb1;->D(Landroid/content/Context;Lsw;)V

    .line 437
    .line 438
    .line 439
    :goto_b
    sput-boolean v2, Lwb1;->h:Z

    .line 440
    .line 441
    return-void
.end method

.method private static final u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lsw;)V
    .locals 1

    .line 1
    sget-object v0, Lwb1;->a:Lwb1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0, p1, p2}, Lwb1;->K(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-interface {p3, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final v(Lsw;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final w(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    invoke-direct {p0}, Lwb1;->A()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method private final x()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lwb1;->g:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final y()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lwb1;->e:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final z()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lwb1;->f:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final H(Landroid/content/Context;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lwb1;->w(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0}, Lwb1;->y()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    invoke-direct {p0}, Lwb1;->z()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string v2, "|"

    .line 34
    .line 35
    filled-new-array {v2}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x2

    .line 40
    invoke-static {p1, v2, v3}, Lk41;->e0(Ljava/lang/String;[Ljava/lang/String;I)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eq v2, v3, :cond_2

    .line 49
    .line 50
    :goto_0
    return v0

    .line 51
    :cond_2
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-direct {p0}, Lwb1;->x()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {p0, v1, v0}, Lwb1;->F(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p1, p0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0
.end method

.method public final J(Landroid/content/Context;Z)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-direct {p0, p1}, Lwb1;->w(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {p0}, Lwb1;->y()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v2, v3, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 25
    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    new-instance p2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "1_"

    .line 32
    .line 33
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {p0}, Lwb1;->x()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p0, p2, v0}, Lwb1;->F(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {p0}, Lwb1;->z()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p2, "|"

    .line 68
    .line 69
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-interface {p1, p0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_0
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {p0}, Lwb1;->z()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-interface {p1, p0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final K(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x28

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const/16 v4, 0xc

    .line 16
    .line 17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const/16 v5, 0x14

    .line 22
    .line 23
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    const/16 v6, 0x10

    .line 28
    .line 29
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const/16 v7, 0x1c

    .line 34
    .line 35
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-direct/range {p0 .. p1}, Lwb1;->I(Landroid/content/Context;)Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    const/16 v10, 0x16

    .line 53
    .line 54
    const/16 v11, 0xff

    .line 55
    .line 56
    if-eqz v9, :cond_0

    .line 57
    .line 58
    invoke-static {v11, v10, v10, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/16 v12, 0xfc

    .line 64
    .line 65
    const/16 v13, 0xf8

    .line 66
    .line 67
    invoke-static {v11, v13, v13, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    :goto_0
    if-eqz v9, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-static {v11, v10, v10, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 75
    .line 76
    .line 77
    :goto_1
    const/16 v7, 0x5a

    .line 78
    .line 79
    const/16 v10, 0xb4

    .line 80
    .line 81
    const/16 v13, 0x50

    .line 82
    .line 83
    if-eqz v9, :cond_2

    .line 84
    .line 85
    invoke-static {v10, v11, v11, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    invoke-static {v10, v13, v13, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    :goto_2
    const/16 v14, 0x2c

    .line 95
    .line 96
    const/16 v15, 0x55

    .line 97
    .line 98
    const/16 v2, 0xdc

    .line 99
    .line 100
    const/16 v11, 0xfe

    .line 101
    .line 102
    invoke-static {v2, v11, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    const/16 v11, 0x8c

    .line 107
    .line 108
    if-eqz v9, :cond_3

    .line 109
    .line 110
    :goto_3
    invoke-static {v11, v13, v13, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_3
    const/16 v7, 0xd2

    .line 115
    .line 116
    const/16 v13, 0xc8

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :goto_4
    if-eqz v9, :cond_4

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_4
    const/16 v7, 0x3c

    .line 123
    .line 124
    const/16 v11, 0x32

    .line 125
    .line 126
    const/16 v13, 0xff

    .line 127
    .line 128
    invoke-static {v13, v11, v11, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 129
    .line 130
    .line 131
    :goto_5
    new-instance v7, Lmf0;

    .line 132
    .line 133
    const/4 v11, 0x2

    .line 134
    invoke-direct {v7, v0, v11}, Lmf0;-><init>(Landroid/content/Context;I)V

    .line 135
    .line 136
    .line 137
    new-instance v11, Landroid/app/Dialog;

    .line 138
    .line 139
    const v13, 0x103000a

    .line 140
    .line 141
    .line 142
    invoke-direct {v11, v0, v13}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 143
    .line 144
    .line 145
    const/4 v13, 0x1

    .line 146
    invoke-virtual {v11, v13}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 147
    .line 148
    .line 149
    new-instance v14, Landroid/widget/LinearLayout;

    .line 150
    .line 151
    invoke-direct {v14, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v14, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v14, v12}, Landroid/view/View;->setBackgroundColor(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7, v5}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    check-cast v12, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    invoke-virtual {v7, v8}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v15

    .line 174
    check-cast v15, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    invoke-virtual {v7, v5}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v17

    .line 184
    check-cast v17, Ljava/lang/Number;

    .line 185
    .line 186
    move/from16 v18, v13

    .line 187
    .line 188
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    invoke-virtual {v7, v5}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    check-cast v5, Ljava/lang/Number;

    .line 197
    .line 198
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    invoke-virtual {v14, v12, v15, v13, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 203
    .line 204
    .line 205
    const/16 v5, 0x11

    .line 206
    .line 207
    invoke-virtual {v14, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 208
    .line 209
    .line 210
    new-instance v12, Landroid/widget/TextView;

    .line 211
    .line 212
    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 213
    .line 214
    .line 215
    const-string v13, "\u26a0\ufe0f"

    .line 216
    .line 217
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    const/high16 v13, 0x42200000    # 40.0f

    .line 221
    .line 222
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7, v6}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v13

    .line 232
    check-cast v13, Ljava/lang/Number;

    .line 233
    .line 234
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v13

    .line 238
    const/4 v15, 0x0

    .line 239
    invoke-virtual {v12, v15, v15, v15, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v14, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 243
    .line 244
    .line 245
    new-instance v12, Landroid/widget/TextView;

    .line 246
    .line 247
    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v13, p2

    .line 251
    .line 252
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    const/high16 v13, 0x41900000    # 18.0f

    .line 256
    .line 257
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 261
    .line 262
    .line 263
    sget-object v13, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 264
    .line 265
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v7, v4}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v13

    .line 275
    check-cast v13, Ljava/lang/Number;

    .line 276
    .line 277
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    invoke-virtual {v12, v15, v15, v15, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v14, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 285
    .line 286
    .line 287
    new-instance v12, Landroid/view/View;

    .line 288
    .line 289
    invoke-direct {v12, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 290
    .line 291
    .line 292
    if-eqz v9, :cond_5

    .line 293
    .line 294
    const/16 v9, 0x28

    .line 295
    .line 296
    const/16 v13, 0xff

    .line 297
    .line 298
    invoke-static {v9, v13, v13, v13}, Landroid/graphics/Color;->argb(IIII)I

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    goto :goto_6

    .line 303
    :cond_5
    const/16 v9, 0x1e

    .line 304
    .line 305
    invoke-static {v9, v15, v15, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    :goto_6
    invoke-virtual {v12, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 310
    .line 311
    .line 312
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 313
    .line 314
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 315
    .line 316
    .line 317
    move-result-object v13

    .line 318
    invoke-virtual {v7, v13}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v13

    .line 322
    check-cast v13, Ljava/lang/Number;

    .line 323
    .line 324
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 325
    .line 326
    .line 327
    move-result v13

    .line 328
    const/4 v5, -0x1

    .line 329
    invoke-direct {v9, v5, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v7, v6}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v13

    .line 336
    check-cast v13, Ljava/lang/Number;

    .line 337
    .line 338
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 339
    .line 340
    .line 341
    move-result v13

    .line 342
    invoke-virtual {v7, v6}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v16

    .line 346
    check-cast v16, Ljava/lang/Number;

    .line 347
    .line 348
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 349
    .line 350
    .line 351
    move-result v5

    .line 352
    const/16 v16, 0xe

    .line 353
    .line 354
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v15

    .line 358
    invoke-virtual {v7, v15}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v15

    .line 362
    check-cast v15, Ljava/lang/Number;

    .line 363
    .line 364
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result v15

    .line 368
    move-object/from16 v16, v11

    .line 369
    .line 370
    const/4 v11, 0x0

    .line 371
    invoke-virtual {v9, v13, v11, v5, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v14, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 378
    .line 379
    .line 380
    new-instance v5, Landroid/widget/TextView;

    .line 381
    .line 382
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 383
    .line 384
    .line 385
    move-object/from16 v9, p3

    .line 386
    .line 387
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 388
    .line 389
    .line 390
    const/high16 v9, 0x41600000    # 14.0f

    .line 391
    .line 392
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 396
    .line 397
    .line 398
    const/16 v10, 0x11

    .line 399
    .line 400
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 401
    .line 402
    .line 403
    const/4 v10, 0x4

    .line 404
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    invoke-virtual {v7, v10}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v10

    .line 412
    check-cast v10, Ljava/lang/Number;

    .line 413
    .line 414
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 415
    .line 416
    .line 417
    move-result v10

    .line 418
    int-to-float v10, v10

    .line 419
    const/high16 v11, 0x3f800000    # 1.0f

    .line 420
    .line 421
    invoke-virtual {v5, v10, v11}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v7, v1}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v10

    .line 428
    check-cast v10, Ljava/lang/Number;

    .line 429
    .line 430
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    invoke-virtual {v7, v1}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    check-cast v1, Ljava/lang/Number;

    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    const/4 v11, 0x0

    .line 445
    invoke-virtual {v5, v10, v11, v1, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v14, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 449
    .line 450
    .line 451
    new-instance v1, Landroid/widget/TextView;

    .line 452
    .line 453
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 454
    .line 455
    .line 456
    const-string v5, "\u5173\u95ed"

    .line 457
    .line 458
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 462
    .line 463
    .line 464
    const/4 v5, -0x1

    .line 465
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 466
    .line 467
    .line 468
    const/16 v10, 0x11

    .line 469
    .line 470
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 471
    .line 472
    .line 473
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 474
    .line 475
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v5, v11}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v7, v8}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    check-cast v8, Ljava/lang/Number;

    .line 486
    .line 487
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 488
    .line 489
    .line 490
    move-result v8

    .line 491
    int-to-float v8, v8

    .line 492
    invoke-virtual {v5, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v5, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v7, v4}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    check-cast v2, Ljava/lang/Number;

    .line 506
    .line 507
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    invoke-virtual {v7, v4}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    check-cast v4, Ljava/lang/Number;

    .line 516
    .line 517
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    const/4 v11, 0x0

    .line 522
    invoke-virtual {v1, v11, v2, v11, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 523
    .line 524
    .line 525
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 526
    .line 527
    const/4 v4, -0x2

    .line 528
    const/4 v5, -0x1

    .line 529
    invoke-direct {v2, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v7, v3}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v5

    .line 536
    check-cast v5, Ljava/lang/Number;

    .line 537
    .line 538
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    invoke-virtual {v7, v6}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v6

    .line 546
    check-cast v6, Ljava/lang/Number;

    .line 547
    .line 548
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 549
    .line 550
    .line 551
    move-result v6

    .line 552
    invoke-virtual {v7, v3}, Lmf0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    check-cast v3, Ljava/lang/Number;

    .line 557
    .line 558
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    const/4 v11, 0x0

    .line 563
    invoke-virtual {v2, v5, v6, v3, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 567
    .line 568
    .line 569
    new-instance v2, Luy;

    .line 570
    .line 571
    const/16 v3, 0x15

    .line 572
    .line 573
    move-object/from16 v5, v16

    .line 574
    .line 575
    invoke-direct {v2, v5, v3}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v14, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v5, v14}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    if-eqz v1, :cond_6

    .line 592
    .line 593
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 602
    .line 603
    int-to-double v2, v0

    .line 604
    const-wide v6, 0x3feb333333333333L    # 0.85

    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    mul-double/2addr v2, v6

    .line 610
    double-to-int v0, v2

    .line 611
    invoke-virtual {v1, v0, v4}, Landroid/view/Window;->setLayout(II)V

    .line 612
    .line 613
    .line 614
    :cond_6
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    if-eqz v0, :cond_7

    .line 619
    .line 620
    const/16 v10, 0x11

    .line 621
    .line 622
    invoke-virtual {v0, v10}, Landroid/view/Window;->setGravity(I)V

    .line 623
    .line 624
    .line 625
    :cond_7
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    if-eqz v0, :cond_8

    .line 630
    .line 631
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 632
    .line 633
    const/4 v11, 0x0

    .line 634
    invoke-direct {v1, v11}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 638
    .line 639
    .line 640
    :cond_8
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 641
    .line 642
    .line 643
    return-void
.end method

.method public final s(Landroid/content/Context;JLsw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "J",
            "Lsw;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-boolean p0, Lwb1;->h:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 p0, 0x1

    .line 13
    sput-boolean p0, Lwb1;->h:Z

    .line 14
    .line 15
    new-instance p0, Ljava/lang/Thread;

    .line 16
    .line 17
    new-instance v0, Lvb1;

    .line 18
    .line 19
    invoke-direct {v0, p2, p3, p1, p4}, Lvb1;-><init>(JLandroid/content/Context;Lsw;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 26
    .line 27
    .line 28
    return-void
.end method
