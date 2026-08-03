.class public final LYue/ۥۡۡۧۨ$ۥ$ۥ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۡۧۨ$ۥ;->ۥ۟۟ۦۦ()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Ljava/lang/Throwable;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۡۧۨ;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۡۡۧۨ$ۥ;


# direct methods
.method public constructor <init>(LYue/ۥۡۡۧۨ;LYue/ۥۡۡۧۨ$ۥ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۡۧۨ$ۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۧۨ;

    iput-object p2, p0, LYue/ۥۡۡۧۨ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۡۧۨ$ۥ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥۡۡۧۨ$ۥ$ۥ;->ۥ۟۟(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۡۡۧۨ$ۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۧۨ;

    iget-object v0, p0, LYue/ۥۡۡۧۨ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۡۧۨ$ۥ;

    iget-object v0, v0, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-virtual {p1, v0}, LYue/ۥۡۡۧۨ;->ۥ۟۟۟(Ljava/lang/Object;)V

    return-void
.end method
