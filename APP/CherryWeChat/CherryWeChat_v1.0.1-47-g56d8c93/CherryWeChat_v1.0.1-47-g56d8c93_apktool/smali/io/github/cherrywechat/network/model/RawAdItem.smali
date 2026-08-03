.class public final Lio/github/cherrywechat/network/model/RawAdItem;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/RawAdItem$$serializer;,
        Lio/github/cherrywechat/network/model/RawAdItem$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/RawAdItem$Companion;


# instance fields
.field private final endTime:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final linkUrl:Ljava/lang/String;

.field private final sortOrder:I

.field private final status:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/RawAdItem$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/RawAdItem$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/RawAdItem;->Companion:Lio/github/cherrywechat/network/model/RawAdItem$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lio/github/cherrywechat/network/model/RawAdItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;LGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    if-nez p8, :cond_0

    .line 3
    const-string p2, "default_id"

    .line 4
    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const-string p8, ""

    if-nez p2, :cond_1

    iput-object p8, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p8, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput p3, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    goto :goto_2

    :cond_3
    iput p5, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput p3, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    goto :goto_3

    :cond_4
    iput p6, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    :goto_3
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_5

    const/4 p1, 0x0

    iput-object p1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    return-void

    :cond_5
    iput-object p7, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    .line 9
    iput p4, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    .line 10
    iput p5, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    .line 11
    iput-object p6, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILOc;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 12
    const-string p1, "default_id"

    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 13
    const-string v0, ""

    if-eqz p8, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    const/4 v0, 0x0

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    const/4 p6, 0x0

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-direct/range {p2 .. p8}, Lio/github/cherrywechat/network/model/RawAdItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/RawAdItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/RawAdItem;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/github/cherrywechat/network/model/RawAdItem;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Lio/github/cherrywechat/network/model/RawAdItem;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/RawAdItem;LWa;LCx;)V
    .locals 1

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    const-string v0, "default_id"

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    :goto_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    const-string v0, ""

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    :goto_1
    iget-object p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :goto_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    if-eqz p2, :cond_7

    :goto_3
    iget p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    invoke-interface {p1}, LWa;->e()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    if-eqz p2, :cond_9

    :goto_4
    iget p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    invoke-interface {p1}, LWa;->e()V

    :cond_9
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_5

    :cond_a
    iget-object p2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    if-eqz p2, :cond_b

    :goto_5
    sget-object p2, Lsz;->a:Lsz;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    invoke-interface {p1}, LWa;->f()V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Lio/github/cherrywechat/network/model/RawAdItem;
    .locals 7

    new-instance v0, Lio/github/cherrywechat/network/model/RawAdItem;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lio/github/cherrywechat/network/model/RawAdItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/RawAdItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/RawAdItem;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    iget v3, p1, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    iget v3, p1, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getEndTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getSortOrder()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    return v0
.end method

.method public final getStatus()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget-object v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RawAdItem(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->linkUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sortOrder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->sortOrder:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/RawAdItem;->endTime:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lph;->l(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
