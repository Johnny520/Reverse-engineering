.class public final LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۟ۡۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:J

.field public final ۥ۟۟۠ۥ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06e3\u06e6;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:[J
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥ۠۟ۡۨ;


# direct methods
.method public constructor <init>(LYue/ۥ۠۟ۡۨ;Ljava/lang/String;JLjava/util/List;[J)V
    .locals 1
    .param p1    # LYue/ۥ۠۟ۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # J
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "+",
            "LYue/\u06e5\u06e2\u06df\u06e3\u06e6;",
            ">;[J)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sources"

    invoke-static {p5, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lengths"

    invoke-static {p6, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۠۟ۡۨ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/String;

    iput-wide p3, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:J

    iput-object p5, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/util/List;

    iput-object p6, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۠ۦ:[J

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۣۢ۟ۦ;

    invoke-static {v1}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۥ۟()LYue/ۥ۠۟ۡۨ$ۥ۟;
    .locals 4
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۠۟ۡۨ;

    iget-object v1, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/String;

    iget-wide v2, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:J

    invoke-virtual {v0, v1, v2, v3}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟ۡ۠(Ljava/lang/String;J)LYue/ۥ۠۟ۡۨ$ۥ۟;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟(I)J
    .locals 3

    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۠ۦ:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final ۥ۟۟۟(I)LYue/ۥۣۢ۟ۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣۢ۟ۦ;

    return-object p1
.end method

.method public final ۥ۟۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/String;

    return-object v0
.end method
