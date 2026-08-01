.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore$updateReplyCountAndReplies$lambda$22$$inlined$sortedByDescending$1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->updateReplyCountAndReplies(Ljava/lang/String;ILjava/util/List;Z)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getCreateTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getCreateTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method
