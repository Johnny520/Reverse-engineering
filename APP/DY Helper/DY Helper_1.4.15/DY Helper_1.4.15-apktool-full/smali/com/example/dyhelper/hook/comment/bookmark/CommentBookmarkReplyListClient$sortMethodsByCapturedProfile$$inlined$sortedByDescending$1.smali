.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->sortMethodsByCapturedProfile(Ljava/util/List;)Ljava/util/List;
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


# instance fields
.field final synthetic $profile$inlined:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;


# direct methods
.method public constructor <init>(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;->$profile$inlined:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 1
    check-cast p2, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;->$profile$inlined:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;->getMethodKey()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p2, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/4 v1, 0x0

    .line 20
    const/16 v2, 0x2710

    .line 21
    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    move p2, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p2, v1

    .line 27
    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p1, Ljava/lang/reflect/Method;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1;->$profile$inlined:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient$CapturedLoadMoreProfile;->getMethodKey()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    move v1, v2

    .line 50
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0
.end method
