.class public final LYue/ۥۡۨۢۦ$ۥ۟۟۟ۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨۢۦ;->ۥۣ۟۠ۡ(LYue/ۥۡۨۢ;[Ljava/lang/Object;)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۡۨۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۨۢ;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;[TT;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۨ;->ۥ:LYue/ۥۡۨۢ;

    iput-object p2, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۨ;->ۥ۟:[Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۨ;->ۥ:LYue/ۥۡۨۢ;

    new-instance v1, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۨ$ۥ;

    iget-object v2, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۨ;->ۥ۟:[Ljava/lang/Object;

    invoke-direct {v1, v2}, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۨ$ۥ;-><init>([Ljava/lang/Object;)V

    invoke-static {v0, v1}, LYue/ۥۡۨۢۦ;->ۥ۟۟ۥۡ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
