.class public final LYue/ۥ۠ۡ۠ۤ$ۥ۟۟ۡۡ;
.super LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06e1\u06e1"
.end annotation


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;-><init>(II)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)I
    .locals 0

    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۤۤ()LYue/ۥ۠۠ۥۥ;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۤۤ()LYue/ۥ۠۠ۥۥ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۨ۟()I

    move-result p1

    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠۟ۢ()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public ۥ۟۟۟ۢ()Ljava/lang/String;
    .locals 1

    const-string v0, "nth-last-child"

    return-object v0
.end method
