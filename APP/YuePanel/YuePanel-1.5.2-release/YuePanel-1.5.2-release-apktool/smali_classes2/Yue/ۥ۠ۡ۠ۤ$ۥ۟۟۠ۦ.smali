.class public final LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠ۦ;
.super LYue/ۥ۠ۡ۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06e0\u06e6"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۡ۠ۤ;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":empty"

    return-object v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 1

    invoke-virtual {p2}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟۠()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LYue/ۥۣۡۢۤ;

    instance-of v0, p2, LYue/ۥۢۡ۠ۦ;

    if-eqz v0, :cond_1

    check-cast p2, LYue/ۥۢۡ۠ۦ;

    invoke-virtual {p2}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦۣ()Z

    move-result p1

    return p1

    :cond_1
    instance-of v0, p2, LYue/ۥ۟ۥۤۤ;

    if-nez v0, :cond_0

    instance-of v0, p2, LYue/ۥۢۦۣ;

    if-nez v0, :cond_0

    instance-of p2, p2, LYue/ۥ۠۟ۧۧ;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
