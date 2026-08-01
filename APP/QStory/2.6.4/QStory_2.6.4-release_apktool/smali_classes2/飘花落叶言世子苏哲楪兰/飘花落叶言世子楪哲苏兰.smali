.class public final L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪兰苏哲;


# annotations
.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪苏兰哲;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪苏兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪哲苏兰;->Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪苏兰哲;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪哲苏兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪哲苏兰;

    .line 7
    .line 8
    iget-object p1, p1, L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

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
    const-string v0, "Other(value="

    .line 2
    .line 3
    const/16 v1, 0x29

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言世子苏哲楪兰/飘花落叶言世子楪哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1, v0, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
