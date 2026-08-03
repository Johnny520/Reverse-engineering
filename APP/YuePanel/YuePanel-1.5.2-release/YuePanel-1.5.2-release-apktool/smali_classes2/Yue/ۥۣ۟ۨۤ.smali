.class public final LYue/ۥۣ۟ۨۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۥۤ۠;
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۟ۧۦۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥ۟ۧۧۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟:J

.field public final ۥ۟۟۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟۠:Ljava/lang/Thread;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟ۡ:LYue/ۥ۟ۧۧۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟ۢ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۨۥ;LYue/ۥ۟ۧۦۥ;)V
    .locals 2
    .param p1    # LYue/ۥۣ۟ۨۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥۣ۟ۨۤ;->ۥ:LYue/ۥ۟ۧۦۥ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟()LYue/ۥۢ۟ۧۥ;

    move-result-object p2

    iput-object p2, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟:LYue/ۥ۟ۧۧۨ;

    iget-wide v0, p1, LYue/ۥۣ۟ۨۥ;->ۥ۟:J

    iput-wide v0, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟:J

    invoke-virtual {p1}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۟()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟۟:Ljava/util/List;

    invoke-virtual {p1}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟۟۟:Ljava/lang/String;

    iget-object p2, p1, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۟:Ljava/lang/Thread;

    iput-object p2, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟۟۠:Ljava/lang/Thread;

    invoke-virtual {p1}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۠()LYue/ۥ۟ۧۧۨ;

    move-result-object p2

    iput-object p2, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۧۧۨ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟ۢ()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟۟ۢ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥ۟ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۤ;->ۥ:LYue/ۥ۟ۧۦۥ;

    return-object v0
.end method

.method public final ۥ۟()LYue/ۥ۟ۧۧۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟:LYue/ۥ۟ۧۧۨ;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟۟:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟۟()LYue/ۥ۟ۧۧۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۧۧۨ;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Ljava/lang/Thread;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟۟۠:Ljava/lang/Thread;

    return-object v0
.end method

.method public final ۥ۟۟۟۠()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟:J

    return-wide v0
.end method

.method public final ۥ۟۟۟ۡ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "lastObservedStackTrace"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۤ;->ۥ۟۟۟ۢ:Ljava/util/List;

    return-object v0
.end method
