.class public final Lio/github/cherrywechat/network/model/FAQItem;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/FAQItem$$serializer;,
        Lio/github/cherrywechat/network/model/FAQItem$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/FAQItem$Companion;


# instance fields
.field private final answer:Ljava/lang/String;

.field private final id:I

.field private final itemOrder:I

.field private final question:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/FAQItem$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/FAQItem$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/FAQItem;->Companion:Lio/github/cherrywechat/network/model/FAQItem$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lio/github/cherrywechat/network/model/FAQItem;-><init>(ILjava/lang/String;Ljava/lang/String;IILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;ILGx;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x0

    if-nez p6, :cond_0

    iput v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    goto :goto_0

    :cond_0
    iput p2, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    :goto_0
    and-int/lit8 p2, p1, 0x2

    const-string p6, ""

    if-nez p2, :cond_1

    iput-object p6, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p6, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    return-void

    :cond_3
    iput p5, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    .line 5
    iput-object p2, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    .line 7
    iput p4, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;IILOc;)V
    .locals 2

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    const-string v1, ""

    if-eqz p6, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/FAQItem;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/FAQItem;ILjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lio/github/cherrywechat/network/model/FAQItem;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/FAQItem;->copy(ILjava/lang/String;Ljava/lang/String;I)Lio/github/cherrywechat/network/model/FAQItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getItemOrder$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/FAQItem;LWa;LCx;)V
    .locals 1

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget p2, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    if-eqz p2, :cond_1

    :goto_0
    iget p2, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    invoke-interface {p1}, LWa;->e()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    const-string v0, ""

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    :goto_1
    iget-object p2, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :goto_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget p2, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    if-eqz p2, :cond_7

    :goto_3
    iget p0, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    invoke-interface {p1}, LWa;->e()V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    return v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;I)Lio/github/cherrywechat/network/model/FAQItem;
    .locals 1

    new-instance v0, Lio/github/cherrywechat/network/model/FAQItem;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/FAQItem;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/FAQItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/FAQItem;

    iget v1, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    iget v3, p1, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    iget p1, p1, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAnswer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    return v0
.end method

.method public final getItemOrder()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    return v0
.end method

.method public final getQuestion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget v1, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FAQItem(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lio/github/cherrywechat/network/model/FAQItem;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", question="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/FAQItem;->question:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", answer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/FAQItem;->answer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", itemOrder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/FAQItem;->itemOrder:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, LEy;->f(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
