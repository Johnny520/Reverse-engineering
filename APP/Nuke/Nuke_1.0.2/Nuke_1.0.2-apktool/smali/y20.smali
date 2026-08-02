.class public final Ly20;
.super Li30;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final i:Ly20;

.field public static final j:Ly20;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly20;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li30;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly20;->i:Ly20;

    .line 8
    .line 9
    new-instance v0, Ly20;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Li30;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ly20;->j:Ly20;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Lo43;
    .locals 0

    .line 1
    sget-object p0, Lo43;->n:Lo43;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Li30;->h:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "false"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "true"

    .line 9
    .line 10
    return-object p0
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "boolean"

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Li30;->h:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "boolean{false}"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "boolean{true}"

    .line 9
    .line 10
    return-object p0
.end method
