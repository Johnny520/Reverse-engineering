.class public final LYue/ۥ۟ۨۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۨۥ۟;->ۥ:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic ۥ()Ljava/lang/Object;
    .locals 1

    sget-object v0, LYue/ۥ۟ۨۥ۟;->ۥ:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic ۥ۟()V
    .locals 0

    return-void
.end method

.method public static final ۥ۟۟(LYue/ۥ۟ۨۥ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # LYue/ۥ۟ۨۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e8\u06e5<",
            "TT;TR;>;TT;)TR;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۨۥۡ;

    invoke-virtual {p0}, LYue/ۥ۟ۨۥ;->ۥ()LYue/ۥۣ۠ۢۤ;

    move-result-object p0

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۨۥۡ;-><init>(LYue/ۥۣ۠ۢۤ;Ljava/lang/Object;)V

    invoke-virtual {v0}, LYue/ۥ۟ۨۥۡ;->ۥ۟۟۟ۧ()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
