.class public interface abstract Lzd0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ll30;


# virtual methods
.method public abstract E(IILjava/util/Map;Lsw;Lsw;)Lyd0;
.end method

.method public Q(IILjava/util/Map;Lsw;)Lyd0;
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-interface/range {v0 .. v5}, Lzd0;->E(IILjava/util/Map;Lsw;Lsw;)Lyd0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
