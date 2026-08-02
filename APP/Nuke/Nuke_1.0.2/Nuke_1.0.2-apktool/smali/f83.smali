.class public final Lf83;
.super Lc20;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final j:Lf83;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf83;

    .line 2
    .line 3
    invoke-direct {v0}, Lc20;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf83;->j:Lf83;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final D(La20;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p0, Lc60;->k:Lc60;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iget-object p0, p0, Lc60;->j:Li20;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p2, p1, v0}, Li20;->c(Ljava/lang/Runnable;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final F(I)Lc20;
    .locals 1

    .line 1
    invoke-static {p1}, Lsp0;->t(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Ljy2;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lc20;->F(I)Lc20;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object p0
.end method
