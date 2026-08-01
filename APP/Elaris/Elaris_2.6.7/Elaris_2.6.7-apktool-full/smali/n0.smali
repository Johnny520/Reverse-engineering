.class public final Ln0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public a:I

.field public b:Z

.field public final c:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-static {p2}, Lu9;->x(I)I

    move-result p2

    iput p2, p0, Ln0;->a:I

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 45
    :goto_0
    iput-boolean p2, p0, Ln0;->b:Z

    .line 46
    iput-object p1, p0, Ln0;->c:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>([J)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, [J->clone()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, [J

    .line 9
    .line 10
    iput-object p1, p0, Ln0;->c:Ljava/io/Serializable;

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    const/4 v0, 0x0

    .line 14
    const-wide/16 v1, -0x1

    .line 15
    .line 16
    :goto_0
    if-ge v0, p0, :cond_1

    .line 17
    .line 18
    aget-wide v3, p1, v0

    .line 19
    .line 20
    const-wide/16 v5, 0x0

    .line 21
    .line 22
    cmp-long v5, v3, v5

    .line 23
    .line 24
    if-ltz v5, :cond_0

    .line 25
    .line 26
    cmp-long v1, v3, v1

    .line 27
    .line 28
    if-ltz v1, :cond_0

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    move-wide v1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string p1, "stage delays must be non-negative and ordered"

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0

    .line 42
    :cond_1
    return-void
.end method
