.class public final LYue/ۥۢۦۣۨ$ۥ۟۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۦۣۨ;->ۥ۟۟۟۠(LYue/ۥۣۣ۟۠;)LYue/ۥۢۦۣۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Long;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ;

.field public final synthetic ۥ۟۟۠ۤ:J

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۣۣ۟۠;

.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

.field public final synthetic ۥ۟۟۠ۨ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;


# direct methods
.method public constructor <init>(LYue/ۥۡۦۢۥ$ۥ;JLYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;LYue/ۥۣۣ۟۠;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ;

    iput-wide p2, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۤ:J

    iput-object p4, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    iput-object p5, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣۣ۟۠;

    iput-object p6, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۧ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    iput-object p7, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟(IJ)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟(IJ)V
    .locals 4

    const/4 v0, 0x1

    if-ne p1, v0, :cond_5

    iget-object p1, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ;

    iget-boolean v1, p1, LYue/ۥۡۦۢۥ$ۥ;->ۥۣ۟۟۠:Z

    if-nez v1, :cond_4

    iput-boolean v0, p1, LYue/ۥۡۦۢۥ$ۥ;->ۥۣ۟۟۠:Z

    iget-wide v0, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۤ:J

    cmp-long p1, p2, v0

    if-ltz p1, :cond_3

    iget-object p1, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    iget-wide p2, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    const-wide v0, 0xffffffffL

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    iget-object p2, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣۣ۟۠;

    invoke-interface {p2}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦۢ()J

    move-result-wide p2

    :cond_0
    iput-wide p2, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    iget-object p1, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۧ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    iget-wide p2, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    cmp-long p2, p2, v0

    const-wide/16 v2, 0x0

    if-nez p2, :cond_1

    iget-object p2, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣۣ۟۠;

    invoke-interface {p2}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦۢ()J

    move-result-wide p2

    goto :goto_0

    :cond_1
    move-wide p2, v2

    :goto_0
    iput-wide p2, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    iget-object p1, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;

    iget-wide p2, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    cmp-long p2, p2, v0

    if-nez p2, :cond_2

    iget-object p2, p0, LYue/ۥۢۦۣۨ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣۣ۟۠;

    invoke-interface {p2}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦۢ()J

    move-result-wide v2

    :cond_2
    iput-wide v2, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:J

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: zip64 extra too short"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: zip64 extra repeated"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    return-void
.end method
