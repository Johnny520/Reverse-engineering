.class public final LYue/ۥۡۡۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۨۦۡ;


# annotations
.annotation build LYue/ۥ۠ۥۦۧ;
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۡۡۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۡۢ;

    invoke-direct {v0}, LYue/ۥۡۡۢ;-><init>()V

    sput-object v0, LYue/ۥۡۡۢ;->ۥ:LYue/ۥۡۡۢ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۨۦۡ$ۥ;->ۥ(LYue/ۥ۠ۨۦۡ;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟(Ljava/util/List;)LYue/ۥ۠ۨۥۥ;
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e1;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e8\u06e5\u06e5;"
        }
    .end annotation

    new-instance p1, LYue/ۥۡۡۡۨ;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p1, v0, v0, v1, v0}, LYue/ۥۡۡۡۨ;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    return-object p1
.end method

.method public ۥ۟۟()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method
