.class public final LYue/ۥ۟ۨۨ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:LYue/ۥ۟ۨۨ۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟ۨۨ۠;

    invoke-direct {v0}, LYue/ۥ۟ۨۨ۠;-><init>()V

    sput-object v0, LYue/ۥ۟ۨۨ۠;->ۥ:LYue/ۥ۟ۨۨ۠;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥۡۦ۟ۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "LYue/\u06e5\u06e1\u06e6\u06df\u06e7<",
            "Ljava/lang/Object;",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۢۥۡ;

    invoke-direct {v0}, LYue/ۥۡۢۥۡ;-><init>()V

    return-object v0
.end method

.method public final ۥ۟(Ljava/lang/Object;LYue/ۥۣ۠ۢۤ;)LYue/ۥۡۦ۟ۧ;
    .locals 1
    .param p2    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "LYue/\u06e5\u06e0\u06e6\u06e4\u06df<",
            "*>;-TT;-TT;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e6\u06df\u06e7<",
            "Ljava/lang/Object;",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onChange"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۨۨ۠$ۥ;

    invoke-direct {v0, p1, p2}, LYue/ۥ۟ۨۨ۠$ۥ;-><init>(Ljava/lang/Object;LYue/ۥۣ۠ۢۤ;)V

    return-object v0
.end method

.method public final ۥ۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۢۤ;)LYue/ۥۡۦ۟ۧ;
    .locals 1
    .param p2    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "LYue/\u06e5\u06e0\u06e6\u06e4\u06df<",
            "*>;-TT;-TT;",
            "Ljava/lang/Boolean;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e6\u06df\u06e7<",
            "Ljava/lang/Object;",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onChange"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۨۨ۠$ۥ۟;

    invoke-direct {v0, p1, p2}, LYue/ۥ۟ۨۨ۠$ۥ۟;-><init>(Ljava/lang/Object;LYue/ۥۣ۠ۢۤ;)V

    return-object v0
.end method
