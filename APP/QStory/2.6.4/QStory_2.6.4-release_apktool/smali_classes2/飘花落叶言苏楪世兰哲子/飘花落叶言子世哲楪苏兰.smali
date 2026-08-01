.class public final L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言苏楪世兰哲子/飘花落叶言子世苏兰哲楪;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏兰哲:J

.field public final 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->Companion:L飘花落叶言苏楪世兰哲子/飘花落叶言子世苏兰哲楪;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(IIJLjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    :cond_0
    iput p2, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 10
    .line 11
    and-int/lit8 p2, p1, 0x2

    .line 12
    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    const-wide/16 p2, 0x0

    .line 16
    .line 17
    iput-wide p2, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iput-wide p3, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 21
    .line 22
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 23
    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    const-string p1, ""

    .line 27
    .line 28
    iput-object p1, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    iput-object p5, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;)V
    .locals 1

    const/16 v0, 0x57b

    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput p1, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 36
    iput-wide p2, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 37
    iput-object p4, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;

    .line 12
    .line 13
    iget v1, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 14
    .line 15
    iget v3, p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-wide v3, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 21
    .line 22
    iget-wide v5, p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 23
    .line 24
    cmp-long v1, v3, v5

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget-object p0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p1, p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-wide v2, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x57c

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget v1, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 16
    .line 17
    const/16 v2, 0x575

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/StringBuilder;II)V

    .line 20
    .line 21
    .line 22
    iget-wide v1, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 23
    .line 24
    const/16 v3, 0x57d

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/StringBuilder;JI)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 30
    .line 31
    const/16 v1, 0x29

    .line 32
    .line 33
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method
