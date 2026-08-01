.class public abstract L飘花落叶言世子兰哲苏楪/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/List;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final getParameterTypes()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReturnType()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰([Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    array-length v1, p1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "Callable expects "

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, " arguments, but "

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    array-length p0, p1

    .line 34
    const-string p1, " were provided."

    .line 35
    .line 36
    invoke-static {v0, p1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final bridge 飘花落叶言子楪世苏兰哲()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final bridge synthetic 飘花落叶言子楪世苏哲兰()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
