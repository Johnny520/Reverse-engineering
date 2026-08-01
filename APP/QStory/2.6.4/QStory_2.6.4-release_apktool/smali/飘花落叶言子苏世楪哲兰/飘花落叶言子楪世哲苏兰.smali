.class public final L飘花落叶言子苏世楪哲兰/飘花落叶言子楪世哲苏兰;
.super Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪哲兰苏世:Ljava/text/BreakIterator;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, L飘花落叶言子苏世楪哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/text/BreakIterator;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世哲楪苏兰(I)I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子苏世楪哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/text/BreakIterator;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/text/BreakIterator;->preceding(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子世苏兰楪哲(I)I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子苏世楪哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/text/BreakIterator;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/text/BreakIterator;->following(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
