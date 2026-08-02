.class public final Lze1;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lze1;

.field public static final e:I

.field public static final f:Lwm0;

.field public static final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lze1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lze1;->d:Lze1;

    .line 8
    .line 9
    const v0, 0x790b01ba

    .line 10
    .line 11
    .line 12
    sput v0, Lze1;->e:I

    .line 13
    .line 14
    sget-object v0, Lwm0;->i:Lwm0;

    .line 15
    .line 16
    sput-object v0, Lze1;->f:Lwm0;

    .line 17
    .line 18
    const-string v0, "MaskAllAsRead"

    .line 19
    .line 20
    sput-object v0, Lze1;->g:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lze1;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 2

    .line 1
    sget-object p0, Lld3;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    sget-object p0, Lup0;->i:Landroid/content/Context;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const v0, 0x790b01ba

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v0, Ln31;

    .line 18
    .line 19
    const/16 v1, 0xa

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ln31;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const v1, 0x1bf52

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0, p0}, Lld3;->a(ILxm0;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "hostContext"

    .line 32
    .line 33
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lze1;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lze1;->f:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
