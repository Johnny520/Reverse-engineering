.class public final Loa1;
.super Lrk;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final f:Loa1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Loa1;

    .line 2
    .line 3
    invoke-direct {v0}, Lrk;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Loa1;->f:Loa1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Lpk;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p0, Llm;->g:Llm;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iget-object p0, p0, Llm;->f:Lxk;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p2, p1, v0}, Lxk;->b(Ljava/lang/Runnable;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final i(I)Lrk;
    .locals 1

    .line 1
    invoke-static {p1}, Lr60;->g(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lq61;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lrk;->i(I)Lrk;

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
