.class public interface abstract Lv1/p0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/o;


# virtual methods
.method public abstract D0(IILjava/util/Map;Lfg/l;Lfg/l;)Lv1/o0;
.end method

.method public z(IILjava/util/Map;Lfg/l;)Lv1/o0;
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
    invoke-interface/range {v0 .. v5}, Lv1/p0;->D0(IILjava/util/Map;Lfg/l;Lfg/l;)Lv1/o0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
