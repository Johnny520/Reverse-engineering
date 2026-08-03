.class public final LYue/ۥ۟ۨۤۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build LYue/ۥۡۥۤ۠;
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/Long;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۨ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟ۡ:Ljava/util/List;
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

.field public final ۥ۟۟ۡ۟:J


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۨۥ;LYue/ۥ۟ۧۦۥ;)V
    .locals 4
    .param p1    # LYue/ۥۣ۟ۨۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LYue/ۥ۟ۧۧۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۧۡ$ۥ;

    invoke-interface {p2, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۧۧۡ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۧۧۡ;->ۥ۟۟ۧۢ()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, LYue/ۥ۟ۨۤۥ;->ۥۣ۟۟۠:Ljava/lang/Long;

    sget-object v0, LYue/ۥ۟ۧۤۥ;->ۥۣ۟۟۟:LYue/ۥ۟ۧۤۥ$ۥ۟;

    invoke-interface {p2, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۧۤۥ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    iput-object v0, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    sget-object v0, LYue/ۥ۟ۧۧۢ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۧۢ$ۥ;

    invoke-interface {p2, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p2

    check-cast p2, LYue/ۥ۟ۧۧۢ;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, LYue/ۥ۟ۧۧۢ;->ۥ۟۟ۧۢ()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_2
    move-object p2, v1

    :goto_2
    iput-object p2, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    invoke-virtual {p1}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    iget-object p2, p1, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۟:Ljava/lang/Thread;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_3
    move-object p2, v1

    :goto_3
    iput-object p2, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    iget-object p2, p1, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۟:Ljava/lang/Thread;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_4
    iput-object v1, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    invoke-virtual {p1}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟ۢ()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟ۡ:Ljava/util/List;

    iget-wide p1, p1, LYue/ۥۣ۟ۨۥ;->ۥ۟:J

    iput-wide p1, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟ۡ۟:J

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ()Ljava/lang/Long;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۤۥ;->ۥۣ۟۟۠:Ljava/lang/Long;

    return-object v0
.end method

.method public final ۥ۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

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

    iget-object v0, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟ۡ:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟۠()J
    .locals 2

    iget-wide v0, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟ۡ۟:J

    return-wide v0
.end method

.method public final ۥ۟۟۟ۡ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۤۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    return-object v0
.end method
