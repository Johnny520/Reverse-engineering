.class public final LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۟;
.super LYue/ۥ۠ۡ۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۡ۠ۤ;-><init>()V

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p1}, LYue/ۥۡۢۤۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۟;->ۥ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۟;->ۥ:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[^%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 1

    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟۟ۥ()LYue/ۥ۟ۢ۠ۤ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۟ۢ۠ۤ;->ۥۣ۟۟۟()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LYue/ۥ۟ۢ۠ۢ;

    invoke-virtual {p2}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LYue/ۥۡۢۤۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۟;->ۥ:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
