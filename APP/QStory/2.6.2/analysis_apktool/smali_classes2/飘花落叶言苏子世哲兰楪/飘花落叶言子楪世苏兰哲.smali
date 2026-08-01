.class public final synthetic L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/nio/file/attribute/BasicFileAttributes;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/nio/file/Path;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;I)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/file/Path;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/nio/file/attribute/BasicFileAttributes;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/nio/file/attribute/BasicFileAttributes;

    .line 7
    .line 8
    check-cast p1, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    iget-object p0, p0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/file/Path;

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, Lorg/apache/commons/io/filefilter/OrFileFilter;->飘花落叶言子楪世苏哲兰(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    iget-object v0, p0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/nio/file/attribute/BasicFileAttributes;

    .line 18
    .line 19
    check-cast p1, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

    .line 20
    .line 21
    iget-object p0, p0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/file/Path;

    .line 22
    .line 23
    invoke-static {p0, v0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;->飘花落叶言子楪世苏兰哲(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
