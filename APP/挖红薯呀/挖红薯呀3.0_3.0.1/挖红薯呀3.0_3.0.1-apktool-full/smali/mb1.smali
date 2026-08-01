.class public interface abstract Lmb1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(Lb8;Lb8;Lb8;)J
.end method

.method public abstract e(JLb8;Lb8;Lb8;)Lb8;
.end method

.method public abstract h(JLb8;Lb8;Lb8;)Lb8;
.end method

.method public i(Lb8;Lb8;Lb8;)Lb8;
    .locals 6

    .line 1
    invoke-interface {p0, p1, p2, p3}, Lmb1;->b(Lb8;Lb8;Lb8;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    move-object v0, p0

    .line 6
    move-object v3, p1

    .line 7
    move-object v4, p2

    .line 8
    move-object v5, p3

    .line 9
    invoke-interface/range {v0 .. v5}, Lmb1;->e(JLb8;Lb8;Lb8;)Lb8;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
