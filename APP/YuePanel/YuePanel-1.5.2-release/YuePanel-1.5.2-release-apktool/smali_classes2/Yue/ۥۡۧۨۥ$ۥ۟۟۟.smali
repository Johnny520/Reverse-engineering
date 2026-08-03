.class public final LYue/ۥۡۧۨۥ$ۥ۟۟۟;
.super LYue/ۥ۠ۦۣ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۧۨۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥۡۧۨۥ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e5<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۧۨۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۧۨۥ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۡۧۨۥ;

    invoke-direct {p0}, LYue/ۥ۠ۦۣ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥۡۧۨۥ$ۥ۟۟۟;->ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۡۧۨۥ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۡۧۨۥ;

    invoke-virtual {p1}, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥۡۧۨۥ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۡۧۨۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠;->ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۢۥ()Ljava/util/concurrent/CancellationException;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۢۥ(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
