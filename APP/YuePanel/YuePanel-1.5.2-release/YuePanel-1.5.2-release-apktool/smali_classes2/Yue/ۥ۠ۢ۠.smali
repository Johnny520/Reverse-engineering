.class public final LYue/ۥ۠ۢ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۡۨۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟:Z

.field public final ۥ۟۟:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "TT;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۨۢ;ZLYue/ۥۣ۠ۡ۟;)V
    .locals 1
    .param p1    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;Z",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predicate"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥ۠ۢ۠;->ۥ:LYue/ۥۡۨۢ;

    .line 3
    iput-boolean p2, p0, LYue/ۥ۠ۢ۠;->ۥ۟:Z

    .line 4
    iput-object p3, p0, LYue/ۥ۠ۢ۠;->ۥ۟۟:LYue/ۥۣ۠ۡ۟;

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۡۨۢ;ZLYue/ۥۣ۠ۡ۟;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x1

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LYue/ۥ۠ۢ۠;-><init>(LYue/ۥۡۨۢ;ZLYue/ۥۣ۠ۡ۟;)V

    return-void
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥ۠ۢ۠;)LYue/ۥۣ۠ۡ۟;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۢ۠;->ۥ۟۟:LYue/ۥۣ۠ۡ۟;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥ۠ۢ۠;)Z
    .locals 0

    iget-boolean p0, p0, LYue/ۥ۠ۢ۠;->ۥ۟:Z

    return p0
.end method

.method public static final synthetic ۥ۟۟۟۟(LYue/ۥ۠ۢ۠;)LYue/ۥۡۨۢ;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۢ۠;->ۥ:LYue/ۥۡۨۢ;

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
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢ۠$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۢ۠$ۥ;-><init>(LYue/ۥ۠ۢ۠;)V

    return-object v0
.end method
