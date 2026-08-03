.class public final LYue/ۥۣ۟ۦ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۥۦۤ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟ۦ۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:LYue/ۥۣ۟ۦ۠$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ۟:LYue/ۥۣ۟ۥۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣ۟ۦ۠$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۟ۦ۠$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣ۟ۦ۠;->ۥ۟۟:LYue/ۥۣ۟ۦ۠$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣ۟ۥۧ;)V
    .locals 0
    .param p1    # LYue/ۥۣ۟ۥۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۟ۦ۠;->ۥ۟:LYue/ۥۣ۟ۥۧ;

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥ۠ۥۦۤ$ۥ;)LYue/ۥۡۦۧ;
    .locals 8
    .param p1    # LYue/ۥ۠ۥۦۤ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "chain"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LYue/ۥ۠ۥۦۤ$ۥ;->call()LYue/ۥۣ۟ۦۣ;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۣ۟ۦ۠;->ۥ۟:LYue/ۥۣ۟ۥۧ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {p1}, LYue/ۥ۠ۥۦۤ$ۥ;->ۥ۟()LYue/ۥۡۦۤۧ;

    move-result-object v3

    invoke-virtual {v1, v3}, LYue/ۥۣ۟ۥۧ;->ۥ۟۟۟ۤ(LYue/ۥۡۦۤۧ;)LYue/ۥۡۦۧ;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v5, LYue/ۥۣ۟ۦۢ$ۥ۟;

    invoke-interface {p1}, LYue/ۥ۠ۥۦۤ$ۥ;->ۥ۟()LYue/ۥۡۦۤۧ;

    move-result-object v6

    invoke-direct {v5, v3, v4, v6, v1}, LYue/ۥۣ۟ۦۢ$ۥ۟;-><init>(JLYue/ۥۡۦۤۧ;LYue/ۥۡۦۧ;)V

    invoke-virtual {v5}, LYue/ۥۣ۟ۦۢ$ۥ۟;->ۥ۟()LYue/ۥۣ۟ۦۢ;

    move-result-object v3

    invoke-virtual {v3}, LYue/ۥۣ۟ۦۢ;->ۥ۟()LYue/ۥۡۦۤۧ;

    move-result-object v4

    invoke-virtual {v3}, LYue/ۥۣ۟ۦۢ;->ۥ()LYue/ۥۡۦۧ;

    move-result-object v5

    iget-object v6, p0, LYue/ۥۣ۟ۦ۠;->ۥ۟:LYue/ۥۣ۟ۥۧ;

    if-eqz v6, :cond_1

    invoke-virtual {v6, v3}, LYue/ۥۣ۟ۥۧ;->ۥۣ۟۟ۤ(LYue/ۥۣ۟ۦۢ;)V

    :cond_1
    instance-of v3, v0, LYue/ۥۡۦ۠ۤ;

    if-eqz v3, :cond_2

    move-object v2, v0

    check-cast v2, LYue/ۥۡۦ۠ۤ;

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۠۟()LYue/ۥ۠ۡۡ۟;

    move-result-object v2

    if-nez v2, :cond_4

    :cond_3
    sget-object v2, LYue/ۥ۠ۡۡ۟;->ۥ۟:LYue/ۥ۠ۡۡ۟;

    :cond_4
    if-eqz v1, :cond_5

    if-nez v5, :cond_5

    invoke-virtual {v1}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-static {v3}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    :cond_5
    if-nez v4, :cond_6

    if-nez v5, :cond_6

    new-instance v1, LYue/ۥۡۦۧ$ۥ;

    invoke-direct {v1}, LYue/ۥۡۦۧ$ۥ;-><init>()V

    invoke-interface {p1}, LYue/ۥ۠ۥۦۤ$ۥ;->ۥ۟()LYue/ۥۡۦۤۧ;

    move-result-object p1

    invoke-virtual {v1, p1}, LYue/ۥۡۦۧ$ۥ;->ۥۣ۟۟ۡ(LYue/ۥۡۦۤۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    sget-object v1, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۦ:LYue/ۥۡۥۣۧ;

    invoke-virtual {p1, v1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟ۡ۠(LYue/ۥۡۥۣۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    const/16 v1, 0x1f8

    invoke-virtual {p1, v1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۡ(I)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    const-string v1, "Unsatisfiable Request (only-if-cached)"

    invoke-virtual {p1, v1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۠ۨ(Ljava/lang/String;)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    sget-object v1, LYue/ۥۣۢۥ۟;->ۥ۟۟:LYue/ۥۡۦۧ۟;

    invoke-virtual {p1, v1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟(LYue/ۥۡۦۧ۟;)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    const-wide/16 v3, -0x1

    invoke-virtual {p1, v3, v4}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟ۡۤ(J)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟ۡۡ(J)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟()LYue/ۥۡۦۧ;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, LYue/ۥ۠ۡۡ۟;->ۥ۟۟ۡ۟(LYue/ۥۣ۟ۦۣ;LYue/ۥۡۦۧ;)V

    return-object p1

    :cond_6
    if-nez v4, :cond_7

    invoke-static {v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v5}, LYue/ۥۡۦۧ;->ۥ۟۟ۥۡ()LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    sget-object v1, LYue/ۥۣ۟ۦ۠;->ۥ۟۟:LYue/ۥۣ۟ۦ۠$ۥ;

    invoke-static {v1, v5}, LYue/ۥۣ۟ۦ۠$ۥ;->ۥ۟(LYue/ۥۣ۟ۦ۠$ۥ;LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ;

    move-result-object v1

    invoke-virtual {p1, v1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟(LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟()LYue/ۥۡۦۧ;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, LYue/ۥ۠ۡۡ۟;->ۥ۟(LYue/ۥۣ۟ۦۣ;LYue/ۥۡۦۧ;)V

    return-object p1

    :cond_7
    if-eqz v5, :cond_8

    invoke-virtual {v2, v0, v5}, LYue/ۥ۠ۡۡ۟;->ۥ(LYue/ۥۣ۟ۦۣ;LYue/ۥۡۦۧ;)V

    goto :goto_1

    :cond_8
    iget-object v3, p0, LYue/ۥۣ۟ۦ۠;->ۥ۟:LYue/ۥۣ۟ۥۧ;

    if-eqz v3, :cond_9

    invoke-virtual {v2, v0}, LYue/ۥ۠ۡۡ۟;->ۥ۟۟(LYue/ۥۣ۟ۦۣ;)V

    :cond_9
    :goto_1
    :try_start_0
    invoke-interface {p1, v4}, LYue/ۥ۠ۥۦۤ$ۥ;->ۥۣ۟۟۟(LYue/ۥۡۦۤۧ;)LYue/ۥۡۦۧ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_a

    if-eqz v1, :cond_a

    invoke-virtual {v1}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-static {v1}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    :cond_a
    if-eqz v5, :cond_c

    if-eqz p1, :cond_b

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۢۥ()I

    move-result v1

    const/16 v3, 0x130

    if-ne v1, v3, :cond_b

    invoke-virtual {v5}, LYue/ۥۡۦۧ;->ۥ۟۟ۥۡ()LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    sget-object v3, LYue/ۥۣ۟ۦ۠;->ۥ۟۟:LYue/ۥۣ۟ۦ۠$ۥ;

    invoke-virtual {v5}, LYue/ۥۡۦۧ;->ۥ۟۟ۤۢ()LYue/ۥ۠ۤۢۢ;

    move-result-object v4

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۤۢ()LYue/ۥ۠ۤۢۢ;

    move-result-object v6

    invoke-static {v3, v4, v6}, LYue/ۥۣ۟ۦ۠$ۥ;->ۥ(LYue/ۥۣ۟ۦ۠$ۥ;LYue/ۥ۠ۤۢۢ;LYue/ۥ۠ۤۢۢ;)LYue/ۥ۠ۤۢۢ;

    move-result-object v4

    invoke-virtual {v1, v4}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۠ۦ(LYue/ۥ۠ۤۢۢ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۧۢ()J

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟ۡۤ(J)LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۧ۠()J

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟ۡۡ(J)LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    invoke-static {v3, v5}, LYue/ۥۣ۟ۦ۠$ۥ;->ۥ۟(LYue/ۥۣ۟ۦ۠$ۥ;LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ;

    move-result-object v4

    invoke-virtual {v1, v4}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟(LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    invoke-static {v3, p1}, LYue/ۥۣ۟ۦ۠$ۥ;->ۥ۟(LYue/ۥۣ۟ۦ۠$ۥ;LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ;

    move-result-object v3

    invoke-virtual {v1, v3}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟ۡ(LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟()LYue/ۥۡۦۧ;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, LYue/ۥۡۦۧ۟;->close()V

    iget-object p1, p0, LYue/ۥۣ۟ۦ۠;->ۥ۟:LYue/ۥۣ۟ۥۧ;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, LYue/ۥۣ۟ۥۧ;->ۥۣ۟۟۠()V

    iget-object p1, p0, LYue/ۥۣ۟ۦ۠;->ۥ۟:LYue/ۥۣ۟ۥۧ;

    invoke-virtual {p1, v5, v1}, LYue/ۥۣ۟ۥۧ;->ۥ۟۟ۤۢ(LYue/ۥۡۦۧ;LYue/ۥۡۦۧ;)V

    invoke-virtual {v2, v0, v1}, LYue/ۥ۠ۡۡ۟;->ۥ۟(LYue/ۥۣ۟ۦۣ;LYue/ۥۡۦۧ;)V

    return-object v1

    :cond_b
    invoke-virtual {v5}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-static {v1}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    :cond_c
    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۥۡ()LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    sget-object v3, LYue/ۥۣ۟ۦ۠;->ۥ۟۟:LYue/ۥۣ۟ۦ۠$ۥ;

    invoke-static {v3, v5}, LYue/ۥۣ۟ۦ۠$ۥ;->ۥ۟(LYue/ۥۣ۟ۦ۠$ۥ;LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ;

    move-result-object v6

    invoke-virtual {v1, v6}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟(LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    invoke-static {v3, p1}, LYue/ۥۣ۟ۦ۠$ۥ;->ۥ۟(LYue/ۥۣ۟ۦ۠$ۥ;LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ;

    move-result-object p1

    invoke-virtual {v1, p1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟ۡ(LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟()LYue/ۥۡۦۧ;

    move-result-object p1

    iget-object v1, p0, LYue/ۥۣ۟ۦ۠;->ۥ۟:LYue/ۥۣ۟ۥۧ;

    if-eqz v1, :cond_f

    invoke-static {p1}, LYue/ۥ۠ۤۨۡ;->ۥ۟۟(LYue/ۥۡۦۧ;)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v1, LYue/ۥۣ۟ۦۢ;->ۥ۟۟:LYue/ۥۣ۟ۦۢ$ۥ;

    invoke-virtual {v1, p1, v4}, LYue/ۥۣ۟ۦۢ$ۥ;->ۥ(LYue/ۥۡۦۧ;LYue/ۥۡۦۤۧ;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, p0, LYue/ۥۣ۟ۦ۠;->ۥ۟:LYue/ۥۣ۟ۥۧ;

    invoke-virtual {v1, p1}, LYue/ۥۣ۟ۥۧ;->ۥ۟۟ۡۧ(LYue/ۥۡۦۧ;)LYue/ۥۣ۟ۦۡ;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, LYue/ۥۣ۟ۦ۠;->ۥ۟(LYue/ۥۣ۟ۦۡ;LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ;

    move-result-object p1

    if-eqz v5, :cond_d

    invoke-virtual {v2, v0}, LYue/ۥ۠ۡۡ۟;->ۥ۟۟(LYue/ۥۣ۟ۦۣ;)V

    :cond_d
    return-object p1

    :cond_e
    sget-object v0, LYue/ۥۣ۠ۤۨ;->ۥ:LYue/ۥۣ۠ۤۨ;

    invoke-virtual {v4}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۣ۠ۤۨ;->ۥ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    :try_start_1
    iget-object v0, p0, LYue/ۥۣ۟ۦ۠;->ۥ۟:LYue/ۥۣ۟ۥۧ;

    invoke-virtual {v0, v4}, LYue/ۥۣ۟ۥۧ;->ۥ۟۟ۢ(LYue/ۥۡۦۤۧ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_f
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-static {v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    :cond_10
    throw p1
.end method

.method public final ۥ۟(LYue/ۥۣ۟ۦۡ;LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    invoke-interface {p1}, LYue/ۥۣ۟ۦۡ;->ۥ۟۟۠()LYue/ۥۣۢ۟ۡ;

    move-result-object v0

    invoke-virtual {p2}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v1}, LYue/ۥۡۦۧ۟;->ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;

    move-result-object v1

    invoke-static {v0}, LYue/ۥۣۡۡ;->ۥ۟۟۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۣ۟۟;

    move-result-object v0

    new-instance v2, LYue/ۥۣ۟ۦ۠$ۥ۟;

    invoke-direct {v2, v1, p1, v0}, LYue/ۥۣ۟ۦ۠$ۥ۟;-><init>(LYue/ۥۣۣ۟۠;LYue/ۥۣ۟ۦۡ;LYue/ۥۣۣ۟۟;)V

    const-string p1, "Content-Type"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, p1, v1, v0, v1}, LYue/ۥۡۦۧ;->ۥۣ۟۟ۤ(LYue/ۥۡۦۧ;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۦۧ۟;->ۥ۟۟۟ۨ()J

    move-result-wide v0

    invoke-virtual {p2}, LYue/ۥۡۦۧ;->ۥ۟۟ۥۡ()LYue/ۥۡۦۧ$ۥ;

    move-result-object p2

    new-instance v3, LYue/ۥۡۦ۠ۨ;

    invoke-static {v2}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object v2

    invoke-direct {v3, p1, v0, v1, v2}, LYue/ۥۡۦ۠ۨ;-><init>(Ljava/lang/String;JLYue/ۥۣۣ۟۠;)V

    invoke-virtual {p2, v3}, LYue/ۥۡۦۧ$ۥ;->ۥ۟(LYue/ۥۡۦۧ۟;)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟()LYue/ۥۡۦۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟()LYue/ۥۣ۟ۥۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۦ۠;->ۥ۟:LYue/ۥۣ۟ۥۧ;

    return-object v0
.end method
