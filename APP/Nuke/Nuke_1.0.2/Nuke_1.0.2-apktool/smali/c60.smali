.class public final Lc60;
.super Lch0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final k:Lc60;


# instance fields
.field public j:Li20;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lc60;

    .line 2
    .line 3
    sget v2, Ljy2;->c:I

    .line 4
    .line 5
    sget v3, Ljy2;->d:I

    .line 6
    .line 7
    sget-wide v4, Ljy2;->e:J

    .line 8
    .line 9
    sget-object v6, Ljy2;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lc20;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Li20;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Li20;-><init>(IIJLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lc60;->j:Li20;

    .line 20
    .line 21
    sput-object v0, Lc60;->k:Lc60;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final D(La20;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lc60;->j:Li20;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    invoke-static {p0, p2, p1}, Li20;->e(Li20;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object p0
.end method
