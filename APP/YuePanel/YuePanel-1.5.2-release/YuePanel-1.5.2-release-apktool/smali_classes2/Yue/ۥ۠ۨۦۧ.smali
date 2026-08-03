.class public final LYue/ۥ۠ۨۦۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۦۡ۠;
    name = "MapAccessorsKt"
.end annotation


# direct methods
.method public static final ۥ(Ljava/util/Map;Ljava/lang/Object;LYue/ۥ۠ۦۤ۟;)Ljava/lang/Object;
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "V1::TV;>(",
            "Ljava/util/Map<",
            "-",
            "Ljava/lang/String;",
            "+TV;>;",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e6\u06e4\u06df<",
            "*>;)TV1;"
        }
    .end annotation

    const-string p1, "<this>"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "property"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LYue/ۥ۠ۦۢۡ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۠ۨۧۥ;->ۥ(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(Ljava/util/Map;Ljava/lang/Object;LYue/ۥ۠ۦۤ۟;)Ljava/lang/Object;
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "getVar"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "V1::TV;>(",
            "Ljava/util/Map<",
            "-",
            "Ljava/lang/String;",
            "+TV;>;",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e6\u06e4\u06df<",
            "*>;)TV1;"
        }
    .end annotation

    const-string p1, "<this>"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "property"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LYue/ۥ۠ۦۢۡ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۠ۨۧۥ;->ۥ(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(Ljava/util/Map;Ljava/lang/Object;LYue/ۥ۠ۦۤ۟;Ljava/lang/Object;)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "-",
            "Ljava/lang/String;",
            "-TV;>;",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e6\u06e4\u06df<",
            "*>;TV;)V"
        }
    .end annotation

    const-string p1, "<this>"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "property"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LYue/ۥ۠ۦۢۡ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
