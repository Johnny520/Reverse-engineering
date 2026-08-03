.class public LYue/ۥ۟ۥۡۥ;
.super LYue/ۥ۟ۥۡۤ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۥۡۤ;-><init>()V

    return-void
.end method

.method public static ۥۣ۟۟ۥ(Ljava/util/Enumeration;)Ljava/util/Iterator;
    .locals 1
    .param p0    # Ljava/util/Enumeration;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Enumeration<",
            "TT;>;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۥۡۥ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۥۡۥ$ۥ;-><init>(Ljava/util/Enumeration;)V

    return-object v0
.end method
