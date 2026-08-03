.class public final Lio/github/cherrywechat/lua/loader/ScriptInfo;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final lastModified:J

.field private final name:Ljava/lang/String;

.field private final path:Ljava/lang/String;

.field private final size:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 2

    const-wide v0, -0x129fafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x129fffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->name:Ljava/lang/String;

    iput-object p2, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->path:Ljava/lang/String;

    iput-wide p3, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    iput-wide p5, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->lastModified:J

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/lua/loader/ScriptInfo;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lio/github/cherrywechat/lua/loader/ScriptInfo;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->path:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-wide p3, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    iget-wide p5, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->lastModified:J

    :cond_3
    move-wide p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/github/cherrywechat/lua/loader/ScriptInfo;->copy(Ljava/lang/String;Ljava/lang/String;JJ)Lio/github/cherrywechat/lua/loader/ScriptInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->lastModified:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;JJ)Lio/github/cherrywechat/lua/loader/ScriptInfo;
    .locals 9

    const-wide v0, -0x1298ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12994fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Lio/github/cherrywechat/lua/loader/ScriptInfo;

    move-object v3, p1

    move-object v4, p2

    move-wide v5, p3

    move-wide v7, p5

    invoke-direct/range {v2 .. v8}, Lio/github/cherrywechat/lua/loader/ScriptInfo;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V

    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/lua/loader/ScriptInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/lua/loader/ScriptInfo;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/ScriptInfo;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->path:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/ScriptInfo;->path:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    iget-wide v5, p1, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->lastModified:J

    iget-wide v5, p1, Lio/github/cherrywechat/lua/loader/ScriptInfo;->lastModified:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getLastModified()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->lastModified:J

    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    return-wide v0
.end method

.method public final getSizeFormatted()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    const-wide/16 v2, 0x400

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide v1, -0x12984fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-wide/32 v2, 0x100000

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    const/16 v3, 0x400

    int-to-long v3, v3

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide v1, -0x12987fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    const/high16 v3, 0x100000

    int-to-long v3, v3

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide v1, -0x1298bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->path:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-wide v2, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v0, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->lastModified:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x12999fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->name:Ljava/lang/String;

    const-wide v2, -0x129aafffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->path:Ljava/lang/String;

    const-wide v2, -0x129b2fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-wide v1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->size:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide v1, -0x129bafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/github/cherrywechat/lua/loader/ScriptInfo;->lastModified:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
