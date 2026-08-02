.class public final Lka1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:Laa1;

.field public b:Lfa1;


# virtual methods
.method public final a(Lia1;Lz91;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lz91;->a()Laa1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lka1;->a:Laa1;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gez v2, :cond_0

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    :cond_0
    iput-object v1, p0, Lka1;->a:Laa1;

    .line 15
    .line 16
    iget-object v1, p0, Lka1;->b:Lfa1;

    .line 17
    .line 18
    invoke-interface {v1, p1, p2}, Lfa1;->g(Lia1;Lz91;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lka1;->a:Laa1;

    .line 22
    .line 23
    return-void
.end method
