.class public final Lcj;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# static fields
.field public static final e:Lcj;

.field public static final f:Lcj;

.field public static final g:Lcj;

.field public static final h:Lcj;

.field public static final i:Lcj;

.field public static final j:Lcj;

.field public static final k:Lcj;

.field public static final l:Lcj;


# instance fields
.field public final synthetic d:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcj;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lcj;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcj;->e:Lcj;

    .line 9
    .line 10
    new-instance v0, Lcj;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lcj;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcj;->f:Lcj;

    .line 17
    .line 18
    new-instance v0, Lcj;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Lcj;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcj;->g:Lcj;

    .line 25
    .line 26
    new-instance v0, Lcj;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, Lcj;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcj;->h:Lcj;

    .line 33
    .line 34
    new-instance v0, Lcj;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2}, Lcj;-><init>(II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcj;->i:Lcj;

    .line 41
    .line 42
    new-instance v0, Lcj;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v0, v1, v2}, Lcj;-><init>(II)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lcj;->j:Lcj;

    .line 49
    .line 50
    new-instance v0, Lcj;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-direct {v0, v1, v2}, Lcj;-><init>(II)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lcj;->k:Lcj;

    .line 57
    .line 58
    new-instance v0, Lcj;

    .line 59
    .line 60
    const/4 v2, 0x7

    .line 61
    invoke-direct {v0, v1, v2}, Lcj;-><init>(II)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lcj;->l:Lcj;

    .line 65
    .line 66
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lcj;->d:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lcj;->d:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, Lna1;->a:Lna1;

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_0
    return-object v0

    .line 11
    :pswitch_1
    new-instance p0, Le6;

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/PathMeasure;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/PathMeasure;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0}, Le6;-><init>(Landroid/graphics/PathMeasure;)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_2
    new-instance p0, Lb60;

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-direct {p0, v0}, Lb60;-><init>(I)V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_4
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_5
    const-string p0, "LocalWindowInfo"

    .line 36
    .line 37
    invoke-static {p0}, Ldj;->b(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :pswitch_6
    const-string p0, "LocalViewConfiguration"

    .line 42
    .line 43
    invoke-static {p0}, Ldj;->b(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
