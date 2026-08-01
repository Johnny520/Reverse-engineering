.class public Luc1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ltc1;


# static fields
.field public static a:Luc1;


# virtual methods
.method public a(Ljava/lang/Class;)Lqc1;
    .locals 0

    .line 1
    invoke-static {p1}, Lo30;->m(Ljava/lang/Class;)Lqc1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public b(Ljava/lang/Class;Lrg0;)Lqc1;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Luc1;->a(Ljava/lang/Class;)Lqc1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final c(Lje;Lrg0;)Lqc1;
    .locals 0

    .line 1
    iget-object p1, p1, Lje;->d:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Luc1;->b(Ljava/lang/Class;Lrg0;)Lqc1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
