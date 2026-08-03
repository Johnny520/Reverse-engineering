.class public final LYue/ۥۡ۠ۧۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        "T2:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۡۨۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT1;>;"
        }
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۡۨۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT2;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "TT1;TT2;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۨۢ;LYue/ۥۡۨۢ;LYue/ۥۣ۠ۢۢ;)V
    .locals 1
    .param p1    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT1;>;",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT2;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TT1;-TT2;+TV;>;)V"
        }
    .end annotation

    const-string v0, "sequence1"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sequence2"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡ۠ۧۡ;->ۥ:LYue/ۥۡۨۢ;

    iput-object p2, p0, LYue/ۥۡ۠ۧۡ;->ۥ۟:LYue/ۥۡۨۢ;

    iput-object p3, p0, LYue/ۥۡ۠ۧۡ;->ۥ۟۟:LYue/ۥۣ۠ۢۢ;

    return-void
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥۡ۠ۧۡ;)LYue/ۥۡۨۢ;
    .locals 0

    iget-object p0, p0, LYue/ۥۡ۠ۧۡ;->ۥ:LYue/ۥۡۨۢ;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥۡ۠ۧۡ;)LYue/ۥۡۨۢ;
    .locals 0

    iget-object p0, p0, LYue/ۥۡ۠ۧۡ;->ۥ۟:LYue/ۥۡۨۢ;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟۟(LYue/ۥۡ۠ۧۡ;)LYue/ۥۣ۠ۢۢ;
    .locals 0

    iget-object p0, p0, LYue/ۥۡ۠ۧۡ;->ۥ۟۟:LYue/ۥۣ۠ۢۢ;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡ۠ۧۡ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۡ۠ۧۡ$ۥ;-><init>(LYue/ۥۡ۠ۧۡ;)V

    return-object v0
.end method
