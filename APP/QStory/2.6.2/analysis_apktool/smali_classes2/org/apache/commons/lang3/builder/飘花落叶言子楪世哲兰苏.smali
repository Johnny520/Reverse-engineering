.class public Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static volatile 飘花落叶言子楪世哲兰苏:Lorg/apache/commons/lang3/builder/ToStringStyle;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Lorg/apache/commons/lang3/builder/ToStringStyle;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/StringBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/lang3/builder/ToStringStyle;->DEFAULT_STYLE:Lorg/apache/commons/lang3/builder/ToStringStyle;

    .line 2
    .line 3
    sput-object v0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Lorg/apache/commons/lang3/builder/ToStringStyle;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    sget-object p2, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Lorg/apache/commons/lang3/builder/ToStringStyle;

    .line 7
    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    .line 9
    .line 10
    const/16 v1, 0x200

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/StringBuffer;

    .line 16
    .line 17
    iput-object p2, p0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Lorg/apache/commons/lang3/builder/ToStringStyle;

    .line 18
    .line 19
    iput-object p1, p0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {p2, v0, p1}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendStart(Ljava/lang/StringBuffer;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Lorg/apache/commons/lang3/builder/ToStringStyle;

    .line 4
    .line 5
    iget-object p0, p0, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/StringBuffer;

    .line 6
    .line 7
    invoke-virtual {v1, p0, v0}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendEnd(Ljava/lang/StringBuffer;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
