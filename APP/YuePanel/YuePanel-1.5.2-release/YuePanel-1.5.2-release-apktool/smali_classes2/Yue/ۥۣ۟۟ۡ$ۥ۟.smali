.class public final LYue/ۥۣ۟۟ۡ$ۥ۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟۟ۡ;-><init>(LYue/ۥۣ۠۠;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۟۟ۡ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟۟ۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟۟ۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟۟ۡ;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Long;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    iget-object v0, p0, LYue/ۥۣ۟۟ۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟۟ۡ;

    invoke-virtual {v0}, LYue/ۥۣ۟۟ۡ;->ۥ۟۟۟۠()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, LYue/ۥۣ۟۟ۡ$ۥ۟;->invoke()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
