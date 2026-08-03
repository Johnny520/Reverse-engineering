.class public LYue/ۥۣۡۨۢ;
.super LYue/ۥۡۨۢۢ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۨۢۢ;-><init>()V

    return-void
.end method

.method public static final ۥ۟۟(Ljava/util/Enumeration;)LYue/ۥۡۨۢ;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Enumeration<",
            "TT;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥ۟ۥۡۥ;->ۥۣ۟۟ۥ(Ljava/util/Enumeration;)Ljava/util/Iterator;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟۟(Ljava/util/Iterator;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method
