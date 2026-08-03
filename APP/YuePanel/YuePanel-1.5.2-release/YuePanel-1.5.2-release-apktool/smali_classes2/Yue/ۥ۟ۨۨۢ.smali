.class public final LYue/ۥ۟ۨۨۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "LYue/\u06e5\u06e0\u06e5\u06e3\u06e8;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/CharSequence;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:I

.field public final ۥ۟۟:I

.field public final ۥ۟۟۟:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILYue/ۥۣ۠ۢۢ;)V
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۨۨۢ;->ۥ:Ljava/lang/CharSequence;

    iput p2, p0, LYue/ۥ۟ۨۨۢ;->ۥ۟:I

    iput p3, p0, LYue/ۥ۟ۨۨۢ;->ۥ۟۟:I

    iput-object p4, p0, LYue/ۥ۟ۨۨۢ;->ۥ۟۟۟:LYue/ۥۣ۠ۢۢ;

    return-void
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥ۟ۨۨۢ;)LYue/ۥۣ۠ۢۢ;
    .locals 0

    iget-object p0, p0, LYue/ۥ۟ۨۨۢ;->ۥ۟۟۟:LYue/ۥۣ۠ۢۢ;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥ۟ۨۨۢ;)Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, LYue/ۥ۟ۨۨۢ;->ۥ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟۟(LYue/ۥ۟ۨۨۢ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۟ۨۨۢ;->ۥ۟۟:I

    return p0
.end method

.method public static final synthetic ۥ۟۟۟۠(LYue/ۥ۟ۨۨۢ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۟ۨۨۢ;->ۥ۟:I

    return p0
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
            "LYue/\u06e5\u06e0\u06e5\u06e3\u06e8;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۨۨۢ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۨۨۢ$ۥ;-><init>(LYue/ۥ۟ۨۨۢ;)V

    return-object v0
.end method
