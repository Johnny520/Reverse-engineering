.class public final Ljr;
.super Lkotlinx/coroutines/δ;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final θ:Ljr;


# instance fields
.field public η:Laq;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljr;

    .line 2
    .line 3
    sget v2, Ly22;->γ:I

    .line 4
    .line 5
    sget v3, Ly22;->δ:I

    .line 6
    .line 7
    sget-wide v4, Ly22;->ε:J

    .line 8
    .line 9
    sget-object v6, Ly22;->α:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lkotlinx/coroutines/α;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Laq;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Laq;-><init>(IIJLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Ljr;->η:Laq;

    .line 20
    .line 21
    sput-object v0, Ljr;->θ:Ljr;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
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

.method public final ρ(Lup;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ljr;->η:Laq;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    invoke-static {p0, p2, p1}, Laq;->θ(Laq;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
