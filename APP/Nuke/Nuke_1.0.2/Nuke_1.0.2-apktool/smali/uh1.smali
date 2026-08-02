.class public interface abstract Luh1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public abstract a(Lmn0;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract b(Lin0;)Z
.end method

.method public c(Luh1;)Luh1;
    .locals 1

    .line 1
    sget-object v0, Lrh1;->a:Lrh1;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ldv;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Ldv;-><init>(Luh1;Luh1;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
