.class public final Lgs2;
.super Lru2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lru2;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lgs2;->c:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lru2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lgs2;

    .line 5
    .line 6
    iget p1, p1, Lgs2;->c:I

    .line 7
    .line 8
    iput p1, p0, Lgs2;->c:I

    .line 9
    .line 10
    return-void
.end method

.method public final b(J)Lru2;
    .locals 1

    .line 1
    new-instance v0, Lgs2;

    .line 2
    .line 3
    iget p0, p0, Lgs2;->c:I

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p0}, Lgs2;-><init>(JI)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
