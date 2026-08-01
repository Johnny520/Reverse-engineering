.class public final L飘花落叶言苏楪世兰哲子/飘花落叶言子苏楪世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言苏楪世兰哲子/飘花落叶言子世兰哲苏楪;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言苏楪世兰哲子/飘花落叶言子世兰哲苏楪;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏楪世兰哲子/飘花落叶言子苏楪世哲兰;->Companion:L飘花落叶言苏楪世兰哲子/飘花落叶言子世兰哲苏楪;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const-string p1, ""

    .line 9
    .line 10
    iput-object p1, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iput-object p2, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子苏楪世哲兰;

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
    check-cast p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子苏楪世哲兰;

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p1, p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x588

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
    iget-object p0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 16
    .line 17
    const/16 v1, 0x29

    .line 18
    .line 19
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
